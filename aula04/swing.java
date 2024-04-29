import javax.swing.*;
public class swing {
    public static void main(String[] args ){
        String name = JOptionPane.showInputDialog ("qual seu nome?");
        String output = name + ", nome bosta hein?";
        JOptionPane.showInputDialog(null, output);

    }
}