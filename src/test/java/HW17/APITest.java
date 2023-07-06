package HW17;

import okhttp3.*;
import java.io.IOException;
import org.testng.annotations.Test;

public class APITest {
    private static final String BASE_URL = "https://petstore3.swagger.io/v3/store";

    @Test
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();

        // Виклик методів для виконання запитів
        placeOrder(client);
        getOrderById(client);
        // Інші методи для різних ендпоінтів і операцій
    }

    private static void placeOrder(OkHttpClient client) {
        MediaType mediaType = MediaType.parse("application/json");
        String requestBody = "{\"id\": 1, \"petId\": 1, \"quantity\": 1, \"shipDate\": \"2023-05-30T17:59:00.421Z\", \"status\": \"placed\", \"complete\": true}";

        RequestBody body = RequestBody.create(requestBody, mediaType);
        Request request = new Request.Builder()
                .url(BASE_URL + "/order")
                .post(body)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                String responseBody = response.body().string();
                System.out.println("Response: " + responseBody);
            } else {
                System.out.println("Request failed: " + response.code() + " " + response.message());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void getOrderById(OkHttpClient client) {
        Request request = new Request.Builder()
                .url(BASE_URL + "/order/1")
                .get()
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                String responseBody = response.body().string();
                System.out.println("Response: " + responseBody);
            } else {
                System.out.println("Request failed: " + response.code() + " " + response.message());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
