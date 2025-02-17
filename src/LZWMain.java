import java.io.IOException;

public class LZWMain {
	public static void main (String[]args) throws IOException
	{
		long startTime = System.currentTimeMillis();
		LZWCompression file1 = new LZWCompression("lzw-file1");
		file1.readFile();
		file1.LZWcompress();
		file1.writeFile();
		file1.LZWdecompress();
		LZWCompression file2 = new LZWCompression("lzw-file2");
		file2.readFile();
		file2.LZWcompress();
		file2.writeFile();
		file2.LZWdecompress();
		LZWCompression file3 = new LZWCompression("lzw-file3");
		file3.readFile();
		file3.LZWcompress();
		file3.writeFile();
		file3.LZWdecompress();
		
		long endTime = System.currentTimeMillis();

		System.out.println("That took " + (endTime - startTime) + " milliseconds");
	}
}
