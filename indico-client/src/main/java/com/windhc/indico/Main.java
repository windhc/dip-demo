package com.windhc.indico;

import com.google.gson.Gson;
import com.indico.IndicoClient;
import com.indico.IndicoConfig;
import com.indico.IndicoKtorClient;
import com.indico.entity.Submission;
import com.indico.query.ListSubmissions;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

/**
 * @author HC
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        Properties properties = new Properties();
        InputStream configFile = Main.class.getClassLoader().getResourceAsStream("config.properties");
        properties.load(configFile);

        String host = properties.getProperty("host");
        String indicoToken = properties.getProperty("indicoToken");
        System.out.println("host :" + host);
        IndicoConfig config = new IndicoConfig.Builder()
                .host(host)
                .apiToken(indicoToken)
                .build();

        try (IndicoClient client = new IndicoKtorClient(config)) {
            ListSubmissions listSubmissions = client.listSubmissions();
            List<Submission> submissions = listSubmissions.query();
            System.out.println("submissions size: " + submissions.size());
            for (Submission submission : submissions) {
                System.out.println(gson.toJson(submission));
            }
        }
    }
}
