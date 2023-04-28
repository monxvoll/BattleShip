import javax.swing.*;
import java.util.Random;
public class BidimensionalArray {
    public static void main(String[] args) {

        Barcos myBarcos = new Barcos();

        String aux;
        int max = 10;
        int min = 1;
        int posy;
        int posx;
        Random random = new Random();

        int cx = random.nextInt(max + min) + min;
        int cy = random.nextInt(max + min) + min;
        int px = random.nextInt(max + min) + min;
        int py = random.nextInt(max + min) + min;
        int bx = random.nextInt(max + min) + min;
        int by = random.nextInt(max + min) + min;


        int a = px;
        int b = bx;
        int b1 = bx;

        char[][] board = new char[14][14];
        board[cx][cy] = 'l';
        board[px][py] = 'p';
        board[a][py - 1] = 'p';
        board[bx][by] = 'b';
        board[b][by + 1] = 'b';
        board[b1][by + 2] = 'b';

        for (int county = 0; county < board[0].length; county++) {
            for (int countx = 0; countx < board[0].length; countx++) {
                System.out.print("" + board[countx][county]);
            }
            System.out.println();

        }
        JOptionPane.showMessageDialog(null, "Las cordenadas estan dadas por un entero  tanto para [X] como para [Y] , tendra [2] torpedo disponible para usar");
        aux = JOptionPane.showInputDialog(null, "Ingrese la coordenada  [Y] que desee atacar ");
        posy = Integer.parseInt(aux);
        myBarcos.setPosy(posy);
        aux = JOptionPane.showInputDialog(null, "Ingrese la coordenada  [X] que desee atacar ");
        posx = Integer.parseInt(aux);
        myBarcos.setPosx(posx);


        if (myBarcos.getPosx() == cx && myBarcos.getPosy() == cy) {
            JOptionPane.showMessageDialog(null, "Una [LANCHA] enemiga recibio el impacto  ¡FELICIDADES!");
            JOptionPane.showMessageDialog(null,"El resumen del ataque fue : \n [LanchasAfectadas:1/1]  \n [PortaAvionesAfectados:0/1] \n [BuquesAfectados:0/1] ");
        } else if (myBarcos.getPosx() == px && myBarcos.getPosy() == py) {
            JOptionPane.showMessageDialog(null, "El [TORPEDO] impacto una fuerza naval enemiga de tamaño considerable [PORTAAVIONES]");
            JOptionPane.showMessageDialog(null,"El resumen del ataque fue : \n [LanchasAfectadas:0/1]  \n [PortaAvionesAfectados:1/1] \n [BuquesAfectados:0/1] ");
        } else if (myBarcos.getPosx() == a && myBarcos.getPosy() == py - 1) {
            JOptionPane.showMessageDialog(null, "El [TORPEDO] impacto una fuerza naval enemiga de tamaño considerable [PORTAAVIONES]");
            JOptionPane.showMessageDialog(null,"El resumen del ataque fue : \n [LanchasAfectadas:0/1] \n [PortaAvionesAfectados:1/1] \n [BuquesAfectados:0/1] ");
        } else if (myBarcos.getPosx() == bx && myBarcos.getPosy() == by) {
            JOptionPane.showMessageDialog(null, "El [TORPEDO] impacto una fuerza naval enemiga de tamaño considerable [BUQUE]");
            JOptionPane.showMessageDialog(null,"El resumen del ataque fue : \n [LanchasAfectadas:0/1] \n [PortaAvionesAfectados:0/1] \n [BuquesAfectados:1/1] ");
        } else if (myBarcos.getPosx() == b && myBarcos.getPosy() == by + 1) {
            JOptionPane.showMessageDialog(null, "El [TORPEDO] impacto una fuerza naval enemiga de tamaño considerable [BUQUE]");
            JOptionPane.showMessageDialog(null,"El resumen del ataque fue : \n [LanchasAfectadas:0/1] \n [PortaAvionesAfectados:0/1] \n [BuquesAfectados:1/1] ");
        } else if (myBarcos.getPosx() == b1 && myBarcos.getPosy() == by + 2) {
            JOptionPane.showMessageDialog(null, "El [TORPEDO] impacto una fuerza naval enemiga de tamaño considerable [BUQUE]");
            JOptionPane.showMessageDialog(null,"El resumen del ataque fue : \n [LanchasAfectadas:0/1] \n [PortaAvionesAfectados:0/1] \n[BuquesAfectados:1/1] ");
        } else
            JOptionPane.showMessageDialog(null, "El [TORPEDO] impacto aguas solitarias :(");

        JOptionPane.showMessageDialog(null, "Las cordenadas estan dadas por un entero  tanto para [X] como para [Y] , tendra [1] torpedo disponible para usar");
        aux = JOptionPane.showInputDialog(null, "Ingrese la coordenada  [Y] que desee atacar ");
        posy = Integer.parseInt(aux);
        myBarcos.setPosy(posy);
        aux = JOptionPane.showInputDialog(null, "Ingrese la coordenada  [X] que desee atacar ");
        posx = Integer.parseInt(aux);
        myBarcos.setPosx(posx);

        if (myBarcos.getPosx() == cx && myBarcos.getPosy() == cy) {
            JOptionPane.showMessageDialog(null, "Una [LANCHA] enemiga recibio el impacto  ¡FELICIDADES!");
            JOptionPane.showMessageDialog(null,"El resumen del ataque fue : \n [LanchasAfectadas:1/1]  \n [PortaAvionesAfectados:0/1] \n [BuquesAfectados:0/1] ");
        } else if (myBarcos.getPosx() == px && myBarcos.getPosy() == py) {
            JOptionPane.showMessageDialog(null, "El [TORPEDO] impacto una fuerza naval enemiga de tamaño considerable [PORTAAVIONES]");
            JOptionPane.showMessageDialog(null,"El resumen del ataque fue : \n [LanchasAfectadas:0/1]  \n [PortaAvionesAfectados:1/1] \n [BuquesAfectados:0/1] ");
        } else if (myBarcos.getPosx() == a && myBarcos.getPosy() == py - 1) {
            JOptionPane.showMessageDialog(null, "El [TORPEDO] impacto una fuerza naval enemiga de tamaño considerable [PORTAAVIONES]");
            JOptionPane.showMessageDialog(null,"El resumen del ataque fue : \n [LanchasAfectadas:0/1] \n [PortaAvionesAfectados:1/1] \n [BuquesAfectados:0/1] ");
        } else if (myBarcos.getPosx() == bx && myBarcos.getPosy() == by) {
            JOptionPane.showMessageDialog(null, "El [TORPEDO] impacto una fuerza naval enemiga de tamaño considerable [BUQUE]");
            JOptionPane.showMessageDialog(null,"El resumen del ataque fue : \n [LanchasAfectadas:0/1] \n [PortaAvionesAfectados:0/1] \n [BuquesAfectados:1/1] ");
        } else if (myBarcos.getPosx() == b && myBarcos.getPosy() == by + 1) {
            JOptionPane.showMessageDialog(null, "El [TORPEDO] impacto una fuerza naval enemiga de tamaño considerable [BUQUE]");
            JOptionPane.showMessageDialog(null,"El resumen del ataque fue : \n [LanchasAfectadas:0/1] \n [PortaAvionesAfectados:0/1] \n [BuquesAfectados:1/1] ");
        } else if (myBarcos.getPosx() == b1 && myBarcos.getPosy() == by + 2) {
            JOptionPane.showMessageDialog(null, "El [TORPEDO] impacto una fuerza naval enemiga de tamaño considerable [BUQUE]");
            JOptionPane.showMessageDialog(null,"El resumen del ataque fue : \n [LanchasAfectadas:0/1] \n [PortaAvionesAfectados:0/1] \n[BuquesAfectados:1/1] ");
        } else
            JOptionPane.showMessageDialog(null, "El [TORPEDO] impacto aguas solitarias :(");
    }
}




