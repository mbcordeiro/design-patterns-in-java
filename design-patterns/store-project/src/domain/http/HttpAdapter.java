package domain.http;

import java.net.MalformedURLException;
import java.util.Map;

public interface HttpAdapter {
    void post(String url, Map<String, Object> data) throws MalformedURLException;
}
