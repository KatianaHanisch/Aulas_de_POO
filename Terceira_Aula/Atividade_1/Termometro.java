import java.util.Scanner;

public class Termometro {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite uma temperatura em Celsius:");
            Double temperaturaCelsius = scan.nextDouble();

            double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
            double temperaturaKelvin = temperaturaCelsius + 273.15;
            double temperaturaReaumur = temperaturaCelsius * 0.8;
            double temperaturaRankine = (temperaturaCelsius * 1.8) + 32 + 459.67;

            System.out.println("\nTemperatura em Celsius: " + temperaturaCelsius);
            System.out.println("\nTemperatura em Fahrenheit: " + temperaturaFahrenheit);
            System.out.println("\nTemperatura em Kelvin: " + temperaturaKelvin);
            System.out.println("\nTemperatura em Reaumur: " + temperaturaReaumur);
            System.out.println("\nTemperatura em Rankine: " + temperaturaRankine);

            scan.close();
      }
}