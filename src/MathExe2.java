import javax.swing.*;
import java.util.jar.JarOutputStream;
public class MathExe2 {
    public static void main(String[] args) {
        Math myMath2 = new Math();
        int count=0;
        String msg = "";
        Integer auxArray[];
        myMath2.calcIventNumbers(50);
        auxArray=myMath2.getArrayResult();

        while (count<auxArray.length) {
            msg=msg+auxArray[count]+"\n";
            count=count+1;
        }
        JOptionPane.showMessageDialog(null,msg);
    }
}
