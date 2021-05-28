package academy.mindswap.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public abstract class FileUtils {

    public static void createFile(String dst, String message){
        FileOutputStream dstFile=null;
        try {
            dstFile=new FileOutputStream(dst);
            dstFile.write(message.getBytes());

        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            try {
                dstFile.close();
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void copy(String src, String dst) {
        FileInputStream srcFile=null;
        FileOutputStream dstFile=null;
        try {
            srcFile=new FileInputStream(src);
            dstFile=new FileOutputStream(dst);
            int inputByte;
            while ((inputByte = srcFile.read())!=-1){
                dstFile.write(inputByte);
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            try {
                srcFile.close();
                dstFile.close();
            }catch (IOException e){
                System.out.println(e.getMessage());
            }

        }



    }


    public static boolean compareIsEqual(String compare, String to) {
        FileInputStream srcCompare=null;
        FileInputStream srcTo=null;
        try {
            srcCompare=new FileInputStream(compare);
            srcTo=new FileInputStream(to);
            int inputByteCompare=-1;
            int inputByteTo=-1;


            if(srcCompare.available()!=srcTo.available()){//not same size
                System.out.println("Files are not equal");
                return false;
            }

            while (((inputByteCompare = srcCompare.read())!=-1) ){
               // System.out.println(Character.toChars(inputByteCompare));
               // System.out.println(Character.toChars(inputByteTo));
                if(inputByteCompare!=srcTo.read()){
                    System.out.println("Files are not equal");
                    return false;
                }
            }
            System.out.println("Files are equal");
            return true;

        }catch (IOException e){
            System.out.println(e.getMessage());
            return false;
        }finally {
            try {
                srcCompare.close();
                srcTo.close();
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }

    }
}
