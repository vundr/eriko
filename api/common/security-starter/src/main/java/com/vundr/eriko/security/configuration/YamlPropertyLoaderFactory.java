package com.vundr.eriko.security.configuration;

import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.DefaultPropertySourceFactory;
import org.springframework.core.io.support.EncodedResource;

import java.io.IOException;

public class YamlPropertyLoaderFactory extends DefaultPropertySourceFactory {

    @Override
    public PropertySource<?> createPropertySource(String name, EncodedResource resource) throws IOException {
        var filename = resource.getResource().getFilename();
        return new YamlPropertySourceLoader()
                .load(filename, resource.getResource())
                .stream()
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(String.format("Yaml property not found with name '%s'", filename)));
    }
}
