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

public class PeepholeFoldConstants_optimizeSubtree_16065069931715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term676362;
     Object term676448;

    public PeepholeFoldConstants_optimizeSubtree_16065069931715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term676362 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term676448 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term676534 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term676626 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term676696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term676448, term676448.getClass(), "type", 35);
        setIntField(term676626, term676626.getClass(), "type", 39);
        setDoubleField(term676626, term676626.getClass(), "number", 4.6984628261659607E18);
        setField(term676534, term676534.getClass(), "next", term676626);
        setIntField(term676534, term676534.getClass(), "type", 63);
        setField(term676534, term676534.getClass(), "first", term676696);
        setField(term676448, term676448.getClass(), "first", term676534);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term676448;
        try {
            callMethod(klass, "optimizeSubtree", argTypes, term676362, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


