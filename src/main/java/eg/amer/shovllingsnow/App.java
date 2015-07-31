package eg.amer.shovllingsnow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	char [] coordinates = new char[3];
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	reader.read(coordinates);
    	int x = Integer.parseInt(String.valueOf(coordinates[0]));
    	int y = Integer.parseInt(String.valueOf(coordinates[2]));
    	TileMap map = new TileMap(x, y);
    	reader.readLine();
    	for (int i = 0; i < x; i++) {
    		String charactersLine = reader.readLine();
    		for (int j = 0; j < charactersLine.length(); j++) {
    			map.setTile(i, j, charactersLine.charAt(j));
    		}
		}
//    	char[][] mapArray = map.getMap();
//    	for (int i = 0; i < x; i++) {
//    		System.out.println();
//    		for (int j = 0; j < y; j++) {
//    			System.out.print(mapArray[i][j]);
//    		}
//		}
    }
}
