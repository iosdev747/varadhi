package com.flipkart.varadhi.core.cluster;

public enum ComponentKind {
    Server("Server"),
    Controller("Controller");

    private final String name;
    ComponentKind(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
