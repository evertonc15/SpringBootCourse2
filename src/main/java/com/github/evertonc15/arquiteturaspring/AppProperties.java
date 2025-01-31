package com.github.evertonc15.arquiteturaspring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app.config")
public class AppProperties {

    private String variavel;
    private Integer valo1;

    public String getVariavel() {
        return variavel;
    }

    public void setVariavel(String variavel) {
        this.variavel = variavel;
    }

    public Integer getValo1() {
        return valo1;
    }

    public void setValo1(Integer valo1) {
        this.valo1 = valo1;
    }
}
