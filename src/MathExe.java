import javax.swing.*;
import java.util.jar.JarOutputStream;

public class MathExe {
    public static void main(String[] args) {
        Math myMath1 = new Math();
        int count=0;
        String msg = "";
        Integer auxArray[];
        myMath1.calcOddNumbers(50);
        auxArray=myMath1.getArrayResult();

        while (count<auxArray.length) {
            msg=msg+auxArray[count]+"\n";
            count=count+1;
        }
        JOptionPane.showMessageDialog(null,msg);
    }
}