package com.owen233666.owenswindows.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class ConnectableWindowBlock extends Block {
    protected static final VoxelShape EE = box(0.0d, 0.0d, 7.0d, 16.0d, 16.0d, 9.0d);
    protected static final VoxelShape NN = box(7.0d, 0.0d, 0.0d, 9.0d, 16.0d, 16.0d);
    protected static final VoxelShape CORNER_NE = Shapes.or(box(7.0d, 0.0d, 0.0d, 9.0d, 16.0d, 7.0d), new VoxelShape[]{box(7.0d, 0.0d, 7.0d, 16.0d, 16.0d, 9.0d)});
    protected static final VoxelShape CORNER_NW = Shapes.or(box(7.0d, 0.0d, 0.0d, 9.0d, 16.0d, 7.0d), new VoxelShape[]{box(0.0d, 0.0d, 7.0d, 9.0d, 16.0d, 9.0d)});
    protected static final VoxelShape CORNER_SE = Shapes.or(box(7.0d, 0.0d, 7.0d, 9.0d, 16.0d, 16.0d), new VoxelShape[]{box(9.0d, 0.0d, 7.0d, 16.0d, 16.0d, 9.0d)});
    protected static final VoxelShape CORNER_SW = Shapes.or(box(7.0d, 0.0d, 9.0d, 9.0d, 16.0d, 16.0d), new VoxelShape[]{box(0.0d, 0.0d, 7.0d, 9.0d, 16.0d, 9.0d)});

    public static final EnumProperty<CornerType> CORNER_TYPE = EnumProperty.create("corner_type", CornerType.class);
    public static final DirectionProperty FACING    =     DirectionProperty.create("facing", new Direction[]{Direction.NORTH, Direction.EAST});
    public static final BooleanProperty ABOVE       =       BooleanProperty.create("above");
    public static final BooleanProperty BELOW       =       BooleanProperty.create("below");
    public static final BooleanProperty NORTH       =       BooleanProperty.create("north");
    public static final BooleanProperty SOUTH       =       BooleanProperty.create("south");
    public static final BooleanProperty EAST        =       BooleanProperty.create("east");
    public static final BooleanProperty WEST        =       BooleanProperty.create("west");
    public static final BooleanProperty IS_CORNER   =       BooleanProperty.create("is_corner");
//    public static final BooleanProperty HAS_CURTAIN =       BooleanProperty.create("has_curtain");
//    public static final EnumProperty<> CURTAIN_COLOR=       ;
//    public static final EnumProperty<> CURTAIN_TYPE =;

    public ConnectableWindowBlock(Properties properties) {
        super(properties);
        registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(IS_CORNER, false)
                .setValue(CORNER_TYPE, CornerType.RIGHT)
                .setValue(ABOVE, false)
                .setValue(BELOW, false)
                .setValue(NORTH, false)
                .setValue(SOUTH, false)
                .setValue(EAST, false)
                .setValue(WEST, false)
        );
    }

    @Override
    public @NotNull VoxelShape getShape(BlockState state, @NotNull BlockGetter reader, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        if(state.getValue(IS_CORNER)){
            boolean north = state.getValue(NORTH);
            boolean south = state.getValue(SOUTH);
            boolean west = state.getValue(WEST);
            boolean east = state.getValue(EAST);
            if(north){
                if(west){
                    return CORNER_NW;
                } else if (east) {
                    return CORNER_NE;
                }
            }else if(south){
                if(west){
                    return CORNER_SW;
                }else if(east){
                    return CORNER_SE;
                }
            }
        }else{
            return (state.getValue(FACING)).getAxis() == Direction.Axis.X ? NN : EE;
        }
        return (state.getValue(FACING)).getAxis() == Direction.Axis.X ? NN : EE;
    }

    protected BlockState WindowState(BlockState state, LevelAccessor level, BlockPos pos) {
        boolean above = level.getBlockState(pos.above()).getBlock() instanceof ConnectableWindowBlock;
        boolean below = level.getBlockState(pos.below()).getBlock() instanceof ConnectableWindowBlock;
        boolean north = level.getBlockState(pos.north()).getBlock() instanceof ConnectableWindowBlock;
        boolean east  = level.getBlockState(pos.east()) .getBlock() instanceof ConnectableWindowBlock;
        boolean south = level.getBlockState(pos.south()).getBlock() instanceof ConnectableWindowBlock;
        boolean west  = level.getBlockState(pos.west()) .getBlock() instanceof ConnectableWindowBlock;

        Direction facing = state.getValue(FACING);
        boolean is_corner = isCorner(facing, north, south, east, west, level, pos);

        if((north ? 1 : 0) + (south ? 1 : 0) + (east ? 1 :0 ) + (west ? 1 : 0) >= 3) return state;

        if(is_corner){
            if(above && level.getBlockState(pos.above()).getValue(IS_CORNER).equals(true)) state = state.setValue(ABOVE, true);
            if(below && level.getBlockState(pos.below()).getValue(IS_CORNER).equals(true)) state = state.setValue(BELOW, true);
            state = state.setValue(IS_CORNER, true)
                    .setValue(NORTH, north)
                    .setValue(SOUTH, south)
                    .setValue(EAST, east)
                    .setValue(WEST, west);
        } else {

            if (above) {
                BlockState aboveState = level.getBlockState(pos.above());
                state = state.setValue(ABOVE, aboveState.getValue(FACING).equals(facing));
            } else {
                state = state.setValue(ABOVE, false);
            }

            if (below) {
                BlockState belowState = level.getBlockState(pos.below());
                state = state.setValue(BELOW, belowState.getValue(FACING).equals(facing));
            } else {
                state = state.setValue(BELOW, false);
            }

            state = state.setValue(IS_CORNER, false);

            if(facing == Direction.NORTH){
                state = state.setValue(NORTH, false).setValue(SOUTH, false);

                boolean westConnected = false;
                boolean eastConnected = false;

                if (east) {
                    BlockState eastState = level.getBlockState(pos.east());
                    westConnected = eastState.getValue(FACING).equals(facing) || eastState.getValue(IS_CORNER);
                }

                if (west) {
                    BlockState westState = level.getBlockState(pos.west());
                    eastConnected = westState.getValue(FACING).equals(facing) || westState.getValue(IS_CORNER);
                }

                state = state.setValue(WEST, westConnected);
                state = state.setValue(EAST, eastConnected);
            } else {
                state = state.setValue(EAST, false).setValue(WEST, false);

                boolean southConnected = false;
                boolean northConnected = false;

                if (north) {
                    BlockState northState = level.getBlockState(pos.north());
                    southConnected = northState.getValue(FACING).equals(facing) || northState.getValue(IS_CORNER);
                }

                if (south) {
                    BlockState southState = level.getBlockState(pos.south());
                    northConnected = southState.getValue(FACING).equals(facing) || southState.getValue(IS_CORNER);
                }

                state = state.setValue(SOUTH, southConnected);
                state = state.setValue(NORTH, northConnected);
            }
        }
        return state;
    }

    @Override
    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState statetwo, boolean bool) {
        if (!statetwo.is(state.getBlock())) {
            level.setBlock(pos, WindowState(state, level, pos), 2);

            for (Direction direction : Direction.values()) {
                BlockPos neighborPos = pos.relative(direction);
                BlockState neighborState = level.getBlockState(neighborPos);
                if (neighborState.getBlock() instanceof ConnectableWindowBlock) {
                    level.setBlock(neighborPos, WindowState(neighborState, level, neighborPos), 3);
                }
            }
        }
    }

    @Override
    public @NotNull BlockState updateShape(BlockState state, Direction dir, BlockState statetwo, LevelAccessor access, BlockPos pos, BlockPos postwo) {
        return WindowState(state, access, pos);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{IS_CORNER, CORNER_TYPE, FACING, ABOVE, BELOW, NORTH, SOUTH, EAST, WEST});
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext contx) {
        Direction facingDirection = contx.getHorizontalDirection();
        LevelAccessor world = contx.getLevel();
        BlockPos pos = contx.getClickedPos();

        if (facingDirection == Direction.WEST) {
            facingDirection = Direction.EAST;
        } else if (facingDirection == Direction.SOUTH) {
            facingDirection = Direction.NORTH;
        }

        BlockState baseState = super.getStateForPlacement(contx);
        if (baseState == null) {
            baseState = defaultBlockState();
        }

        BlockState stateWithFacing = baseState.setValue(FACING, facingDirection);

        return WindowState(stateWithFacing, world, pos);
    }


    public enum CornerType implements StringRepresentable{
        RIGHT("right"),
        ROUNDED("rounded");

        private final String name;
        CornerType(String name){this.name = name;}
        @Override
        public @NotNull String getSerializedName() {
            return this.name;
        }
    }

    private boolean isCorner(Direction facing, boolean north, boolean south, boolean east, boolean west, LevelAccessor level, BlockPos pos){
        int cornerAmount = (north ? 1 : 0) + (south ? 1 : 0) + (east ? 1 :0 ) + (west ? 1 : 0);
        if(cornerAmount == 2){
            if(facing.equals(Direction.NORTH)){
                if(north && east) {
                    BlockState northState = level.getBlockState(pos.north());
                    BlockState eastState = level.getBlockState(pos.east());
                    if(northState.getBlock() instanceof ConnectableWindowBlock && eastState.getBlock() instanceof ConnectableWindowBlock) {
                        if(
                                ((northState.getValue(IS_CORNER).equals(true) && northState.getValue(SOUTH).equals(true))
                                ||
                                northState.getValue(FACING).equals(Direction.EAST))
                                &&
                                ((eastState.getValue(IS_CORNER).equals(true) && eastState.getValue(WEST).equals(true))
                                ||
                                eastState.getValue(FACING).equals(facing))
                        ) return true;
                    }
                }
                if(north && west) {
                    BlockState northState = level.getBlockState(pos.north());
                    BlockState westState = level.getBlockState(pos.west());
                    if(northState.getBlock() instanceof ConnectableWindowBlock && westState.getBlock() instanceof ConnectableWindowBlock) {
                        if(
                                ((northState.getValue(IS_CORNER).equals(true) && northState.getValue(SOUTH).equals(true))
                                ||
                                northState.getValue(FACING).equals(Direction.EAST))
                                &&
                                ((westState.getValue(IS_CORNER).equals(true) && westState.getValue(EAST).equals(true))
                                ||
                                westState.getValue(FACING).equals(facing))
                        ) return true;
                    }
                }
                if(south && east) {
                    BlockState southState = level.getBlockState(pos.south());
                    BlockState eastState = level.getBlockState(pos.east());
                    if(southState.getBlock() instanceof ConnectableWindowBlock && eastState.getBlock() instanceof ConnectableWindowBlock) {
                        if(
                                ((southState.getValue(IS_CORNER).equals(true) && southState.getValue(NORTH).equals(true))
                                ||
                                southState.getValue(FACING).equals(Direction.EAST))
                                &&
                                ((eastState.getValue(IS_CORNER).equals(true) && eastState.getValue(WEST).equals(true))
                                ||
                                eastState.getValue(FACING).equals(facing))
                        ) return true;
                    }
                }
                if(south && west) {
                    BlockState southState = level.getBlockState(pos.south());
                    BlockState westState = level.getBlockState(pos.west());
                    if(southState.getBlock() instanceof ConnectableWindowBlock && westState.getBlock() instanceof ConnectableWindowBlock) {
                        if(
                                ((southState.getValue(IS_CORNER).equals(true) && southState.getValue(NORTH).equals(true))
                                ||
                                southState.getValue(FACING).equals(Direction.EAST))
                                &&
                                ((westState.getValue(IS_CORNER).equals(true) && southState.getValue(NORTH).equals(true))
                                ||
                                westState.getValue(FACING).equals(facing))
                        ) return true;
                    }
                }
                return false;
            } else {
                if(east && north) {
                    BlockState eastState = level.getBlockState(pos.east());
                    BlockState northState = level.getBlockState(pos.north());
                    if(eastState.getBlock() instanceof ConnectableWindowBlock && northState.getBlock() instanceof ConnectableWindowBlock) {
                        if(
                                ((eastState.getValue(IS_CORNER).equals(true) && eastState.getValue(WEST).equals(true))
                                ||
                                eastState.getValue(FACING).equals(Direction.NORTH) )
                                &&
                                ((northState.getValue(IS_CORNER).equals(true) && northState.getValue(SOUTH).equals(true))
                                ||
                                northState.getValue(FACING).equals(facing))
                        ) return true;
                    }
                }
                if(east && south) {
                    BlockState eastState = level.getBlockState(pos.east());
                    BlockState southState = level.getBlockState(pos.south());
                    if(eastState.getBlock() instanceof ConnectableWindowBlock && southState.getBlock() instanceof ConnectableWindowBlock) {
                        if(
                                eastState.getValue(IS_CORNER).equals(true) && eastState.getValue(WEST).equals(true)
                                ||
                                eastState.getValue(FACING).equals(Direction.NORTH)
                                &&
                                ((southState.getValue(IS_CORNER).equals(true) && southState.getValue(NORTH).equals(true))
                                ||
                                southState.getValue(FACING).equals(facing))
                        ) return true;
                    }
                }
                if(west && north) {
                    BlockState westState = level.getBlockState(pos.west());
                    BlockState northState = level.getBlockState(pos.north());
                    if(westState.getBlock() instanceof ConnectableWindowBlock && northState.getBlock() instanceof ConnectableWindowBlock) {
                        if(
                                ((westState.getValue(IS_CORNER).equals(true) && westState.getValue(EAST).equals(true))
                                ||
                                westState.getValue(FACING).equals(Direction.NORTH) )
                                &&
                                ((northState.getValue(IS_CORNER).equals(true) && northState.getValue(SOUTH).equals(true))
                                ||
                                northState.getValue(FACING).equals(facing))
                        ) return true;
                    }
                }
                if(west && south) {
                    BlockState westState = level.getBlockState(pos.west());
                    BlockState southState = level.getBlockState(pos.south());
                    if(westState.getBlock() instanceof ConnectableWindowBlock && southState.getBlock() instanceof ConnectableWindowBlock) {
                        if(
                                ((westState.getValue(IS_CORNER).equals(true) && westState.getValue(EAST).equals(true))
                                ||
                                westState.getValue(FACING).equals(Direction.NORTH) )
                                &&
                                ((southState.getValue(IS_CORNER).equals(true) && southState.getValue(NORTH).equals(true))
                                ||
                                southState.getValue(FACING).equals(facing))
                        ) return true;
                    }
                }
                return false;
            }
        } else {
            return false;
        }
    }
}
