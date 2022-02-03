package com.windhc.guice;

import com.google.inject.AbstractModule;

/**
 * @author HC
 */
public class AnimalModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(AnimalService.class).to(CatServiceImpl.class);
    }
}
