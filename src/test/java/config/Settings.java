package config;

import org.aeonbits.owner.Config;

@Config.Sources({"file:src/test/resources/properties/tests.properties"})
public interface Settings extends Config {
    @Key("baseURI")
    String baseURI();
}
