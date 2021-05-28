package academy.mindswap;

import academy.mindswap.utils.FileUtils;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //testing writing a message
        String dst="resources/test.txt";
        String msg="This is a small test";
        FileUtils.createFile(dst,msg);

        //testing copy
        String src="resources/test.txt";
        dst="resources/test_copy.txt";
        FileUtils.copy(src, dst);

        //testing compare equals
        src="resources/test.txt";
        dst="resources/test_copy.txt";
        FileUtils.compareIsEqual(src,dst);

        //testing compare not equals
        src="resources/test.txt";
        dst="resources/test_not_equal.txt";
        msg="This is a small test but not equal";
        FileUtils.createFile(dst,msg);
        FileUtils.compareIsEqual(src,dst);

        //testing compare almost equals
        src="resources/test.txt";
        dst="resources/test_not_equal.txt";
        msg="This  is a small test";
        FileUtils.createFile(dst,msg);
        FileUtils.compareIsEqual(src,dst);




    }
}
