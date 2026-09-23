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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350584;
     Object term350670;
     Object term350762;
     Object term350854;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350584 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term350670 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term350670, term350670.getClass(), "parent", null);
        setIntField(term350670, term350670.getClass(), "type", 0);
        term350762 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term350762, term350762.getClass(), "type", 0);
        term350854 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term350854, term350854.getClass(), "type", 64);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term350670;
        args[1] = term350762;
        args[2] = term350854;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term350584, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


