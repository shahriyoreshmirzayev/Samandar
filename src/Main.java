import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        File file  = new File("C:\\Users\\samnadar\\OneDrive\\Desktop\\password.csv");
        FileInputStream fileInputStream = new FileInputStream(file);
         int size  = fileInputStream.available();
         byte [] bytes = new byte[size];
         fileInputStream.read(bytes);
         fileInputStream.close();
        for (byte aByte : bytes) {
            System.out.print((char)aByte);

        }
         File file1 = new File("C:\\Users\\samnadar\\OneDrive\\Desktop\\hujjatlar.csv");
         file1.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        fileOutputStream.write(bytes);
        fileOutputStream.close();

    }
}