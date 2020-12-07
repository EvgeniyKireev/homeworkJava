import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ConsoleWikiApp {
    public static void main(String[] args) {
        String query = "https://en.wikipedia.org/w/api.php?format=json&action=query&prop=extracts&explaintext=1&titles=";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название статьи, обращаю внимание, что ошибка в названии приведёт к ОШИБКЕ: ");
        String article = in.nextLine();
        System.out.println("Загрузка данных...");
        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) new URL(query + article).openConnection();
            connection.setRequestMethod("GET");
            connection.setUseCaches(false);
            connection.setConnectTimeout(2000);
            connection.setReadTimeout(2000);
            StringBuilder sb = new StringBuilder();
            if (HttpURLConnection.HTTP_OK == connection.getResponseCode()) {
                BufferedReader response = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                while ((line = response.readLine()) != null){
                    sb.append(line);
                    sb.append("\n");

                }
            }
            System.out.println(sb.toString());
        } catch (Throwable cause) {
            cause.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}
