package org.example;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Call;
import retrofit2.Response;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GitHubService service = retrofit.create(GitHubService.class);
        Call<GitHubUser> call = service.getUser("geeta-seshapalli"); // try your GitHub username too

        try {
            Response<GitHubUser> response = call.execute();
            if (response.isSuccessful()) {
                GitHubUser user = response.body();
                System.out.println(user);
            } else {
                System.out.println("Request failed: " + response.code());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}