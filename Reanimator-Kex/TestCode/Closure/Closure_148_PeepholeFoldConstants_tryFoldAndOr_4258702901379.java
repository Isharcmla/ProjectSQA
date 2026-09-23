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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336944;
     Object term337036;
     Object term337122;
     Object term337214;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term336944 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term337036 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term337036, term337036.getClass(), "parent", null);
        setIntField(term337036, term337036.getClass(), "type", 0);
        term337122 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term337122, term337122.getClass(), "type", 0);
        term337214 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term337214, term337214.getClass(), "type", 64);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term337036;
        args[1] = term337122;
        args[2] = term337214;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term336944, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


