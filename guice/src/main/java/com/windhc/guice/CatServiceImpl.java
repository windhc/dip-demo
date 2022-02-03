package com.windhc.guice;

/**
 * @author HC
 */
public class CatServiceImpl implements AnimalService {
    @Override
    public void jump() {
        System.out.println("cat jump");
    }
}
