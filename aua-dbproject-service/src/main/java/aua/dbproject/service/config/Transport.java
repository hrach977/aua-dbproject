package aua.dbproject.service.config;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by hrachyayeghishyan on 11/23/17.
 */
@Configuration
@PropertySources({
        @PropertySource(value = "classpath:application.properties", ignoreResourceNotFound = true),
})
public class Transport {

    //@Autowired
    //private Environment env;

    @Value("${elasticsearch.cluster.name}")
    private String clusterName; //= env.getProperty("elasticsearch.cluster.name");


    @Value("${elasticsearch.host}")
    private String node_name; //= env.getProperty("elasticsearch.host");

    @Value("${elasticsearch.address}")
    private String address; //= env.getProperty("elasticsearch.address");


    @Value("${elasticsearch.port}")
    private Integer port; //=  Integer.valueOf(env.getProperty("elasticsearch.port"));




    @Bean
    public Client elasticSearchClient() throws UnknownHostException {
        Settings settings = Settings.builder()
                //.put("cluster.name", clusterName)
                .put("node.name", node_name)
                .build();


        TransportClient client = new PreBuiltTransportClient(settings)

                .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(address), port));

        return client;
    }

}
