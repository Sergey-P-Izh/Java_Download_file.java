//Материалы: https://www.youtube.com/watch?v=xrXlO-wHCUA

package download_system;

import java.io.*;
import java.net.URL;
import java.nio.channels.Channel;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Download_file{
    public static void main(String[] args){
        try{
            URL FileOnline = new URL(spec: "https://80.img.avito.st/image/1/1.3TAIjba6cdk-JLPcPraUaMwud928rnkbuS510bQmcw.4g7IWQyR_TeQYitjAuM6ergwlt7oqE-kOr4dFl6TpDA");
            ReadableByteChannel rbc = Channels.newChannel(FileOnline.openStream());
            FileOutputStream FileOutStream = new FileOutputStream(name: "DMU50.jpeg");
            FileOutStream.getChannel().transferFrom(rbc, position: 0, Long.Max_VALUE);
            System.out.printLn("Файл скачен");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}