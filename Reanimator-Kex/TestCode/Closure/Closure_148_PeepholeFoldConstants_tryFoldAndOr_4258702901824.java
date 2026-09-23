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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term476313;
     Object term476399;
     Object term476491;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term476313 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term476399 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term476399, term476399.getClass(), "parent", null);
        setIntField(term476399, term476399.getClass(), "type", 100);
        term476491 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term476491, term476491.getClass(), "type", 64);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term476399;
        args[1] = term476491;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term476313, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


