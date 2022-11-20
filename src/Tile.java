public abstract class Tile {
    //abstract method are meant to be overridden
    int tileCoordinate;
    //variable to keep track of tile coordinates
    //coordinates are int as there are only 64 squares and each can be assigned a number.
    Tile(int tileCoordinate) {
        this.tileCoordinate = tileCoordinate;
    }
    //constructor for setting tile coordinates initially
    public abstract boolean isTileOccupied();
    //method to check if tile isTileOccupied
    public abstract Piece getPiece();
    //getter method to check which pieceOnTile

    /*---------------------------------------------------------------------------------------------------------------*/

    public static final class EmptyTile extends Tile {
    //class extends Tile therefore have to override abstract methods.
    //class is Final therefore it cannot be extended or modified. Only methods and constructor could be called.
        EmptyTile(int coordinate){
            super(coordinate);
        }
        //Constructor to set EmptyTile. This constructor uses single argument int therefore parent class constructor
        // will be called every time this constructor is called and same argument will be passed to it.
        @Override
        public boolean isTileOccupied() {
            return false;
        }
        //returns false as we set this tile to be empty.
        @Override
        public Piece getPiece() {
            return null;
        }
        //since we set this tile to be empty getPiece will return null

    }

    /*-----------------------------------------------------------------------------------------------------------------*/

    public static final class OccupiedTile extends Tile{
        Piece pieceOnTile;
        //object of class Piece to set a piece on tile
        OccupiedTile(int tileCoordinate, Piece pieceOnTile) {
            super(tileCoordinate);
            this.pieceOnTile = pieceOnTile;
        }
        //Constructor to set the piece on a particular coordinate.
        @Override
        public boolean isTileOccupied() {
            return true;
        }
        //since we set the piece on the tile we return true.
        @Override
        public Piece getPiece() {
            return this.pieceOnTile;
        }
        //returns the piece on the tile


    }
}
