package ru.Murzabek0312;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.Murzabek0312")
@PropertySource("classpath:musicPlayers.properties")
public class ConfigSpring {
}
