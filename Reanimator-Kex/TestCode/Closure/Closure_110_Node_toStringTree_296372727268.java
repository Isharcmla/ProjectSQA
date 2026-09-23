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

public class Node_toStringTree_296372727268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2456;

    public Node_toStringTree_296372727268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2456 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2471 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2456, term2456.getClass(), "type", 804070622);
        setIntField(term2458, term2458.getClass(), "type", 1850364894);
        setIntField(term2460, term2460.getClass(), "type", 915367534);
        setIntField(term2462, term2462.getClass(), "type", 1949983666);
        setIntField(term2464, term2464.getClass(), "type", 154111854);
        setField(term2464, term2464.getClass(), "next", null);
        setField(term2464, term2464.getClass(), "first", null);
        setField(term2464, term2464.getClass(), "last", null);
        setField(term2464, term2464.getClass(), "propListHead", null);
        setIntField(term2464, term2464.getClass(), "sourcePosition", 0);
        setField(term2464, term2464.getClass(), "jsType", null);
        setField(term2464, term2464.getClass(), "parent", null);
        setField(term2462, term2462.getClass(), "next", term2464);
        setIntField(term2467, term2467.getClass(), "type", 710986341);
        setField(term2467, term2467.getClass(), "next", null);
        setField(term2467, term2467.getClass(), "first", null);
        setField(term2467, term2467.getClass(), "last", term2464);
        setField(term2467, term2467.getClass(), "propListHead", null);
        setIntField(term2467, term2467.getClass(), "sourcePosition", 0);
        setField(term2467, term2467.getClass(), "jsType", null);
        setField(term2467, term2467.getClass(), "parent", null);
        setField(term2462, term2462.getClass(), "first", term2467);
        setField(term2462, term2462.getClass(), "last", term2460);
        setField(term2462, term2462.getClass(), "propListHead", null);
        setIntField(term2462, term2462.getClass(), "sourcePosition", 0);
        setField(term2462, term2462.getClass(), "jsType", null);
        setField(term2462, term2462.getClass(), "parent", null);
        setField(term2460, term2460.getClass(), "next", term2462);
        setField(term2460, term2460.getClass(), "first", term2464);
        setIntField(term2471, term2471.getClass(), "type", -1780848958);
        setIntField(term2473, term2473.getClass(), "type", 1235045850);
        setField(term2473, term2473.getClass(), "next", null);
        setField(term2473, term2473.getClass(), "first", term2467);
        setField(term2473, term2473.getClass(), "last", term2462);
        setField(term2473, term2473.getClass(), "propListHead", null);
        setIntField(term2473, term2473.getClass(), "sourcePosition", 0);
        setField(term2473, term2473.getClass(), "jsType", null);
        setField(term2473, term2473.getClass(), "parent", null);
        setField(term2471, term2471.getClass(), "next", term2473);
        setField(term2471, term2471.getClass(), "first", term2458);
        setField(term2471, term2471.getClass(), "last", term2458);
        setField(term2471, term2471.getClass(), "propListHead", null);
        setIntField(term2471, term2471.getClass(), "sourcePosition", 0);
        setField(term2471, term2471.getClass(), "jsType", null);
        setField(term2471, term2471.getClass(), "parent", null);
        setField(term2460, term2460.getClass(), "last", term2471);
        setField(term2460, term2460.getClass(), "propListHead", null);
        setIntField(term2460, term2460.getClass(), "sourcePosition", 0);
        setField(term2460, term2460.getClass(), "jsType", null);
        setField(term2460, term2460.getClass(), "parent", null);
        setField(term2458, term2458.getClass(), "next", term2460);
        setIntField(term2478, term2478.getClass(), "type", -75143033);
        setField(term2478, term2478.getClass(), "next", term2471);
        setField(term2478, term2478.getClass(), "first", term2473);
        setField(term2478, term2478.getClass(), "last", term2456);
        setField(term2478, term2478.getClass(), "propListHead", null);
        setIntField(term2478, term2478.getClass(), "sourcePosition", 0);
        setField(term2478, term2478.getClass(), "jsType", null);
        setField(term2478, term2478.getClass(), "parent", null);
        setField(term2458, term2458.getClass(), "first", term2478);
        setField(term2458, term2458.getClass(), "last", term2478);
        setField(term2458, term2458.getClass(), "propListHead", null);
        setIntField(term2458, term2458.getClass(), "sourcePosition", 0);
        setField(term2458, term2458.getClass(), "jsType", null);
        setField(term2458, term2458.getClass(), "parent", null);
        setField(term2456, term2456.getClass(), "next", term2458);
        setField(term2456, term2456.getClass(), "first", term2462);
        setField(term2456, term2456.getClass(), "last", term2464);
        setField(term2456, term2456.getClass(), "propListHead", null);
        setIntField(term2456, term2456.getClass(), "sourcePosition", 0);
        setField(term2456, term2456.getClass(), "jsType", null);
        setField(term2456, term2456.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toStringTree", argTypes, term2456, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


