package domain.http;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavahHttpClient implements HttpAdapter{
    @Override
    public void post(String url, Map<String, Object> data) {
        try {
            final var apiUrl = new URL(url);
            final var urlConnection = apiUrl.openConnection();
            urlConnection.connect();
        } catch (Exception e) {
            throw new RuntimeException("Error send request HTTP", e);
        }
    }
}
