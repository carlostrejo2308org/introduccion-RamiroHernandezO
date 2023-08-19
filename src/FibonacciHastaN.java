import javax.swing.JOptionPane;

public class FibonacciHastaN {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Introduce la cantidad de términos de la serie Fibonacci que deseas ver:");
        
        if (input == null) {
            JOptionPane.showMessageDialog(null, "Operación cancelada por el usuario.");
            return;
        }

        try {
            int n = Integer.parseInt(input);
            String resultado = obtenerFibonacciNTerminos(n);
            JOptionPane.showMessageDialog(null, "Los primeros " + n + " términos de la serie Fibonacci son: \n" + resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, introduce un número válido.");
        }
    }

    public static String obtenerFibonacciNTerminos(int n) {
        if (n <= 0) return "";

        int a = 0, b = 1;
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < n; i++) {
            resultado.append(a).append(" ");
            int temp = a;
            a = b;
            b = temp + b;
        }

        return resultado.toString().trim();
    }
}

