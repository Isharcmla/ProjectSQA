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

public class PeepholeFoldConstants_optimizeSubtree_16065069931878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term720301;
     Object term720391;

    public PeepholeFoldConstants_optimizeSubtree_16065069931878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term720301 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term720391 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term720477 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term720563 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term720391, term720391.getClass(), "type", 35);
        setIntField(term720563, term720563.getClass(), "type", 39);
        setField(term720477, term720477.getClass(), "next", term720563);
        setIntField(term720477, term720477.getClass(), "type", 63);
        setField(term720391, term720391.getClass(), "first", term720477);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term720391;
        try {
            callMethod(klass, "optimizeSubtree", argTypes, term720301, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


