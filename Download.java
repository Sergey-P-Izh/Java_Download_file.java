package download_system;

import java.io.BufferdInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.io.IOException;
import java.io.MalformedURLException;

public class Download{
    public static void main(String[] args){
        String url = "https://маштрейд.рф/wp-content/uploads/2020/09/DMG-MORI-CTX-510-ecoline-1024x577.jpg";
        String fileName = "/Download_system/CTX510.jpg"; //Дополнить путь куда будет загружен этот файл.
        
        FileOutputStream fout = null;
        BufferdInputStream in = null;

        try{
            in = new BufferdInputStream(new URL(url).openStream());
            fout = new FileOutputStream(fileName);
            byte data[] = new byte[1024];
            int count;
            while((count = in.read(data, off:0, len:1024))!=-1){
                fout.write(data, off:0, count);
                fout.flush();
            }

        }catch (MalformedURLException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        } finally{
            try{
                in.close();
            }catch (IOException e){
                e.printStackTrace();
            }finally{
                try{
                    fout.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            
        }

    }



    
}