package session08;
import java.io.*;
public class JavaIo {
    public static void main(String[] args) {
        // input stream
        try {
            FileInputStream fileInput = new FileInputStream("/input.txt");
            BufferedInputStream bInputStream = new BufferedInputStream(fileInput);
            int i=0;
            while ((i=bInputStream.read())!=-1) {
                System.out.print((char)i);
            }
        fileInput.close(); 
        } catch (Exception e) {
            // TODO: handle exception
        }
        // output stream
        try {
            FileOutputStream fileOutput = new FileOutputStream("./output.txt");
            BufferedOutputStream bOutputStream = new BufferedOutputStream(fileOutput);
            byte[] b = (new String("abc")).getBytes();
            bOutputStream.write(b);
            bOutputStream.flush();
            bOutputStream.close();
            fileOutput.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
