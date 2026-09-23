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

public class FoldConstants_tryFoldArithmetic_857296245121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18384;
     Object term18454;

    public FoldConstants_tryFoldArithmetic_857296245121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18384 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term18454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18454, term18454.getClass(), "type", 39);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[4] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term18454;
        args[3] = null;
        args[4] = null;
        try {
            callMethod(klass, "tryFoldArithmetic", argTypes, term18384, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


