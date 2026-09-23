package com.google.javascript.rhino;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Node_getString_620979604263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2251;

    public Node_getString_620979604263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2251, term2251.getClass(), "type", 1622857008);
        setIntField(term2253, term2253.getClass(), "type", 934338954);
        setIntField(term2255, term2255.getClass(), "type", 598635505);
        setIntField(term2257, term2257.getClass(), "type", -944986533);
        setIntField(term2259, term2259.getClass(), "type", 1894454926);
        setField(term2259, term2259.getClass(), "next", null);
        setField(term2259, term2259.getClass(), "first", null);
        setField(term2259, term2259.getClass(), "last", null);
        setField(term2259, term2259.getClass(), "propListHead", null);
        setIntField(term2259, term2259.getClass(), "sourcePosition", 0);
        setField(term2259, term2259.getClass(), "jsType", null);
        setField(term2259, term2259.getClass(), "parent", null);
        setField(term2257, term2257.getClass(), "next", term2259);
        setIntField(term2262, term2262.getClass(), "type", 1415142780);
        setField(term2262, term2262.getClass(), "next", null);
        setField(term2262, term2262.getClass(), "first", null);
        setField(term2262, term2262.getClass(), "last", term2259);
        setField(term2262, term2262.getClass(), "propListHead", null);
        setIntField(term2262, term2262.getClass(), "sourcePosition", 0);
        setField(term2262, term2262.getClass(), "jsType", null);
        setField(term2262, term2262.getClass(), "parent", null);
        setField(term2257, term2257.getClass(), "first", term2262);
        setField(term2257, term2257.getClass(), "last", term2255);
        setField(term2257, term2257.getClass(), "propListHead", null);
        setIntField(term2257, term2257.getClass(), "sourcePosition", 0);
        setField(term2257, term2257.getClass(), "jsType", null);
        setField(term2257, term2257.getClass(), "parent", null);
        setField(term2255, term2255.getClass(), "next", term2257);
        setField(term2255, term2255.getClass(), "first", term2259);
        setIntField(term2266, term2266.getClass(), "type", -1165271567);
        setIntField(term2268, term2268.getClass(), "type", 376834234);
        setField(term2268, term2268.getClass(), "next", null);
        setField(term2268, term2268.getClass(), "first", term2262);
        setField(term2268, term2268.getClass(), "last", term2257);
        setField(term2268, term2268.getClass(), "propListHead", null);
        setIntField(term2268, term2268.getClass(), "sourcePosition", 0);
        setField(term2268, term2268.getClass(), "jsType", null);
        setField(term2268, term2268.getClass(), "parent", null);
        setField(term2266, term2266.getClass(), "next", term2268);
        setField(term2266, term2266.getClass(), "first", term2253);
        setField(term2266, term2266.getClass(), "last", term2253);
        setField(term2266, term2266.getClass(), "propListHead", null);
        setIntField(term2266, term2266.getClass(), "sourcePosition", 0);
        setField(term2266, term2266.getClass(), "jsType", null);
        setField(term2266, term2266.getClass(), "parent", null);
        setField(term2255, term2255.getClass(), "last", term2266);
        setField(term2255, term2255.getClass(), "propListHead", null);
        setIntField(term2255, term2255.getClass(), "sourcePosition", 0);
        setField(term2255, term2255.getClass(), "jsType", null);
        setField(term2255, term2255.getClass(), "parent", null);
        setField(term2253, term2253.getClass(), "next", term2255);
        setIntField(term2273, term2273.getClass(), "type", -1911972560);
        setField(term2273, term2273.getClass(), "next", term2266);
        setField(term2273, term2273.getClass(), "first", term2268);
        setField(term2273, term2273.getClass(), "last", term2251);
        setField(term2273, term2273.getClass(), "propListHead", null);
        setIntField(term2273, term2273.getClass(), "sourcePosition", 0);
        setField(term2273, term2273.getClass(), "jsType", null);
        setField(term2273, term2273.getClass(), "parent", null);
        setField(term2253, term2253.getClass(), "first", term2273);
        setField(term2253, term2253.getClass(), "last", term2273);
        setField(term2253, term2253.getClass(), "propListHead", null);
        setIntField(term2253, term2253.getClass(), "sourcePosition", 0);
        setField(term2253, term2253.getClass(), "jsType", null);
        setField(term2253, term2253.getClass(), "parent", null);
        setField(term2251, term2251.getClass(), "next", term2253);
        setField(term2251, term2251.getClass(), "first", term2257);
        setField(term2251, term2251.getClass(), "last", term2259);
        setField(term2251, term2251.getClass(), "propListHead", null);
        setIntField(term2251, term2251.getClass(), "sourcePosition", 0);
        setField(term2251, term2251.getClass(), "jsType", null);
        setField(term2251, term2251.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getString", argTypes, term2251, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


