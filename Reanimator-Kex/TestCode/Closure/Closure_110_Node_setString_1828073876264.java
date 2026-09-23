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

public class Node_setString_1828073876264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2278;

    public Node_setString_1828073876264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2278, term2278.getClass(), "type", -642716895);
        setIntField(term2280, term2280.getClass(), "type", 1743398246);
        setIntField(term2282, term2282.getClass(), "type", -934658823);
        setIntField(term2284, term2284.getClass(), "type", 1632177303);
        setIntField(term2286, term2286.getClass(), "type", -802592348);
        setField(term2286, term2286.getClass(), "next", null);
        setField(term2286, term2286.getClass(), "first", null);
        setField(term2286, term2286.getClass(), "last", null);
        setField(term2286, term2286.getClass(), "propListHead", null);
        setIntField(term2286, term2286.getClass(), "sourcePosition", 0);
        setField(term2286, term2286.getClass(), "jsType", null);
        setField(term2286, term2286.getClass(), "parent", null);
        setField(term2284, term2284.getClass(), "next", term2286);
        setIntField(term2289, term2289.getClass(), "type", -1576584269);
        setField(term2289, term2289.getClass(), "next", null);
        setField(term2289, term2289.getClass(), "first", null);
        setField(term2289, term2289.getClass(), "last", term2286);
        setField(term2289, term2289.getClass(), "propListHead", null);
        setIntField(term2289, term2289.getClass(), "sourcePosition", 0);
        setField(term2289, term2289.getClass(), "jsType", null);
        setField(term2289, term2289.getClass(), "parent", null);
        setField(term2284, term2284.getClass(), "first", term2289);
        setField(term2284, term2284.getClass(), "last", term2282);
        setField(term2284, term2284.getClass(), "propListHead", null);
        setIntField(term2284, term2284.getClass(), "sourcePosition", 0);
        setField(term2284, term2284.getClass(), "jsType", null);
        setField(term2284, term2284.getClass(), "parent", null);
        setField(term2282, term2282.getClass(), "next", term2284);
        setField(term2282, term2282.getClass(), "first", term2286);
        setIntField(term2293, term2293.getClass(), "type", 297582552);
        setIntField(term2295, term2295.getClass(), "type", -1485916498);
        setField(term2295, term2295.getClass(), "next", null);
        setField(term2295, term2295.getClass(), "first", term2289);
        setField(term2295, term2295.getClass(), "last", term2284);
        setField(term2295, term2295.getClass(), "propListHead", null);
        setIntField(term2295, term2295.getClass(), "sourcePosition", 0);
        setField(term2295, term2295.getClass(), "jsType", null);
        setField(term2295, term2295.getClass(), "parent", null);
        setField(term2293, term2293.getClass(), "next", term2295);
        setField(term2293, term2293.getClass(), "first", term2280);
        setField(term2293, term2293.getClass(), "last", term2280);
        setField(term2293, term2293.getClass(), "propListHead", null);
        setIntField(term2293, term2293.getClass(), "sourcePosition", 0);
        setField(term2293, term2293.getClass(), "jsType", null);
        setField(term2293, term2293.getClass(), "parent", null);
        setField(term2282, term2282.getClass(), "last", term2293);
        setField(term2282, term2282.getClass(), "propListHead", null);
        setIntField(term2282, term2282.getClass(), "sourcePosition", 0);
        setField(term2282, term2282.getClass(), "jsType", null);
        setField(term2282, term2282.getClass(), "parent", null);
        setField(term2280, term2280.getClass(), "next", term2282);
        setIntField(term2300, term2300.getClass(), "type", 722787672);
        setField(term2300, term2300.getClass(), "next", term2293);
        setField(term2300, term2300.getClass(), "first", term2295);
        setField(term2300, term2300.getClass(), "last", term2278);
        setField(term2300, term2300.getClass(), "propListHead", null);
        setIntField(term2300, term2300.getClass(), "sourcePosition", 0);
        setField(term2300, term2300.getClass(), "jsType", null);
        setField(term2300, term2300.getClass(), "parent", null);
        setField(term2280, term2280.getClass(), "first", term2300);
        setField(term2280, term2280.getClass(), "last", term2300);
        setField(term2280, term2280.getClass(), "propListHead", null);
        setIntField(term2280, term2280.getClass(), "sourcePosition", 0);
        setField(term2280, term2280.getClass(), "jsType", null);
        setField(term2280, term2280.getClass(), "parent", null);
        setField(term2278, term2278.getClass(), "next", term2280);
        setField(term2278, term2278.getClass(), "first", term2284);
        setField(term2278, term2278.getClass(), "last", term2286);
        setField(term2278, term2278.getClass(), "propListHead", null);
        setIntField(term2278, term2278.getClass(), "sourcePosition", 0);
        setField(term2278, term2278.getClass(), "jsType", null);
        setField(term2278, term2278.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jJCZpVmanW";
        try {
            callMethod(klass, "setString", argTypes, term2278, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


