package temperaturejava;
public class Temperaturejava {

        public static void main(String[] args) {
        double[] celsiusTemperatures = {289, 400, -36, -180};

        for (double celsius : celsiusTemperatures) {
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println(celsius + " °C = " + fahrenheit + " °F");
        }
    }
}
