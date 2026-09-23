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

public class FoldConstants_tryFoldComparison_707851734138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31164;
     Object term31250;
     Object term31336;

    public FoldConstants_tryFoldComparison_707851734138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31164 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term31250 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term31250, term31250.getClass(), "type", 0);
        term31336 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
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
        args[1] = term31250;
        args[2] = null;
        args[3] = term31336;
        args[4] = null;
        try {
            callMethod(klass, "tryFoldComparison", argTypes, term31164, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


