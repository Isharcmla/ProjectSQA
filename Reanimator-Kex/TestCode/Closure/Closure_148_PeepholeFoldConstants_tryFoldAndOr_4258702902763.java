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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term795674;
     Object term795760;
     Object term795898;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term795674 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term795760 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term795898 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term795760, term795760.getClass(), "parent", null);
        setIntField(term795760, term795760.getClass(), "type", 100);
        setIntField(term795898, term795898.getClass(), "type", 63);
        setField(term795760, term795760.getClass(), "first", term795898);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term795760;
        args[1] = term795898;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term795674, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


