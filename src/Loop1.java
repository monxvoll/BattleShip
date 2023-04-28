import javax.swing.JOptionPane;
public class Loop1 {
    public static void main(String[] args) {
        int count = 0, limit = 5;
        int suma = 0;
        String aux = "";
        while (count < 5) {
            count = count + 1;
            if (count < limit) {
                aux = aux + count + ",";
            } else {
                aux = aux + count;
            }
            suma = suma + count;
        }
        JOptionPane.showMessageDialog(null, "El numero es menor a 5 el numero actual es " + aux);
        JOptionPane.showMessageDialog(null, "La suma de los valores es " + suma);
    }
}
