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

public class PeepholeFoldConstants_optimizeSubtree_16065069931901 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term725808;
     Object term725900;

    public PeepholeFoldConstants_optimizeSubtree_16065069931901() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term725808 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term725900 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term725992 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term726084 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term725900, term725900.getClass(), "type", 35);
        setIntField(term726084, term726084.getClass(), "type", 39);
        setField(term725992, term725992.getClass(), "next", term726084);
        setIntField(term725992, term725992.getClass(), "type", 63);
        setField(term725900, term725900.getClass(), "first", term725992);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term725900;
        try {
            callMethod(klass, "optimizeSubtree", argTypes, term725808, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


