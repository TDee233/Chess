import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
    public static void main(String[] args) {
String text = "Первая строка\nВторая строка\nТретья строка";
String indentedText = text.indent(8);
        System.out.println("С отступом:\n" + indentedText);

        String outdentedText = text.indent(-1);
        System.out.println("С уменьшенным отступом:\n" + outdentedText);
    }
}