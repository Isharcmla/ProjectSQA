package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_optimizeSubtree_16065069931279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term427314;
     Object term427400;

    public PeepholeFoldConstants_optimizeSubtree_16065069931279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term427314 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term427400 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term427486 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term427572 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term427400, term427400.getClass(), "type", 35);
        setIntField(term427572, term427572.getClass(), "type", 39);
        setField(term427486, term427486.getClass(), "next", term427572);
        setIntField(term427486, term427486.getClass(), "type", 63);
        setField(term427400, term427400.getClass(), "first", term427486);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term427400;
        try {
            callMethod(klass, "optimizeSubtree", argTypes, term427314, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


