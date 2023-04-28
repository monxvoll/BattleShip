import javax.swing.*;
import java.util.jar.JarOutputStream;
public class MathExe3 {
    public static void main(String[] args) {
        Math myMath3 = new Math();
        int count=0;
        String msg = "";
        Integer auxArray[];
        myMath3.calcCousinNumbers(10);
        auxArray=myMath3.getArrayResult();

        while (count<auxArray.length) {
            msg=msg+auxArray[count]+"\n";
            count=count+1;
        }
        JOptionPane.showMessageDialog(null,msg);
    }
}

