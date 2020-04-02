package com.jason.designpattern.creational.builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class ResourcePoolConfigTest {
    @Test
    public void name() {
        ResourcePoolConfig config = ResourcePoolConfig.builder()
                                                      .setMaxTotal(3)
                                                      .setMaxIdle(2)
                                                      .setMinIdle(1)
                                                      .build();

        assertEquals(3, config.getMaxTotal());
        assertEquals(2, config.getMaxIdle());
        assertEquals(1, config.getMinIdle());
    }
}
