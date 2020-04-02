package com.jason.designpattern.creational.builder;

/**
 * Builder used to construct complex object
 * cons:
 * 1. No need of too many constructors.
 * 2. If need validation on input,
 *    validation can be implemented in build method instead of spreading in different set method.
 *    Especially, when need to validate params dependencies.
 * 3. Comparing with using set method, builder will not generate invalid middle state.
 * 4. Used when do not want to expose set method to allow people to change single param.
 *
 * Pros:
 * 1. do not use when object is simple
 * 2. field params need to duplicated in builder
 *
 */
public class ResourcePoolConfig {
    private String name;
    private int maxTotal;
    private int maxIdle;
    private int minIdle;

    public ResourcePoolConfig(ResourcePoolConfigBuilder builder) {
        this.name = builder.getName();
        this.maxTotal = builder.getMaxTotal();
        this.maxIdle = builder.getMaxIdle();
        this.minIdle = builder.getMinIdle();
    }

    public String getName() {
        return name;
    }

    public int getMaxTotal() {
        return maxTotal;
    }

    public int getMaxIdle() {
        return maxIdle;
    }

    public int getMinIdle() {
        return minIdle;
    }

    public static ResourcePoolConfigBuilder builder() {
        return new ResourcePoolConfigBuilder();
    }

    public static class ResourcePoolConfigBuilder {
        private String name;
        private int maxTotal;
        private int maxIdle;
        private int minIdle;

        public String getName() {
            return name;
        }

        public int getMaxTotal() {
            return maxTotal;
        }

        public int getMaxIdle() {
            return maxIdle;
        }

        public int getMinIdle() {
            return minIdle;
        }

        public ResourcePoolConfigBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ResourcePoolConfigBuilder setMaxTotal(int maxTotal) {
            this.maxTotal = maxTotal;
            return this;
        }

        public ResourcePoolConfigBuilder setMaxIdle(int maxIdle) {
            this.maxIdle = maxIdle;
            return this;
        }

        public ResourcePoolConfigBuilder setMinIdle(int minIdle) {
            this.minIdle = minIdle;
            return this;
        }

        public ResourcePoolConfig build() {
            validate();
            return new ResourcePoolConfig(this);
        }

        private void validate() {
            //validate params here
            if (name == null) {
                throw new IllegalArgumentException("Name cannot be null");
            }

            //validation involves dependencies can be placed here, otherwise need to place in different set method
            if (maxIdle > maxTotal) {
                throw new IllegalArgumentException("maxIdle cannot be greater than max total");
            }
        }
    }
}
