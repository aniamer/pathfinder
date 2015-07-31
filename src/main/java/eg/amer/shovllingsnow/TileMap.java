package eg.amer.shovllingsnow;

public class TileMap {
	private char[][] map ;
	
		
	public TileMap(int x, int y) {
		map = new char [x][y];
	}
	
	public void setTile(int x, int y,char tile){
		map[x][y]=tile;
	}
	public char[][] getMap() {
		return map;
	}
}
