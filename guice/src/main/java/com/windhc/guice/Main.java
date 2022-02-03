package com.windhc.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @author HC
 */
public class Main {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AnimalModule());
        AnimalService animalService = injector.getInstance(AnimalService.class);
        animalService.jump();
    }
}
