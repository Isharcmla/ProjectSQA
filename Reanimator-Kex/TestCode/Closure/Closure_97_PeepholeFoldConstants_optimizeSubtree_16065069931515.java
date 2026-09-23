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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_optimizeSubtree_16065069931515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term559182;
     Object term559268;

    public PeepholeFoldConstants_optimizeSubtree_16065069931515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term559182 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term559268 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term559354 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term559446 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term559268, term559268.getClass(), "type", 35);
        setIntField(term559446, term559446.getClass(), "type", 39);
        setField(term559354, term559354.getClass(), "next", term559446);
        setIntField(term559354, term559354.getClass(), "type", 63);
        setField(term559268, term559268.getClass(), "first", term559354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term559268;
        try {
            callMethod(klass, "optimizeSubtree", argTypes, term559182, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


