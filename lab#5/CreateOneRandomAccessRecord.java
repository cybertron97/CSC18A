/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanish
 */
import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
public class CreateOneRandomAccessRecord {
    public static void main(String[] args)
{
Path file =
Paths.get("C:\\Users\\tanish\\Desktop\\lab#6\\lab6\\RandomEmployees.txt");
String s = "002,Newmann,12.25" +System.getProperty("line.separator");
final int RECSIZE = s.length();
byte[] data = s.getBytes();
ByteBuffer buffer = ByteBuffer.wrap(data);
FileChannel fc = null;
try
{
fc = (FileChannel)Files.newByteChannel(file, READ, WRITE);
fc.position(2 * RECSIZE);
fc.write(buffer);
fc.close();
}
catch (Exception e)
{
System.out.println("Error message: " + e);
}
    
}
}
