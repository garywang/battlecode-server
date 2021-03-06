package battlecode.common;

/**
 * Represents data of the terrain of a location on the map.
 */
public enum TerrainTile {

    NORMAL, ROAD, VOID, OFF_MAP;

    /**
     * Returns <code>true</code> if robots at the given
     * height can traverse this terrain tile.
     */
    public boolean isTraversableAtHeight(RobotLevel height) {
        switch (this) {
            case VOID:
                return false;
            case ROAD:
                return true;
            case NORMAL:
                return true;
            default:
                return false;
        }
    }
}
