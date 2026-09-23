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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term375007;
     Object term375099;
     Object term375185;
     Object term375277;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term375007 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term375099 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term375099, term375099.getClass(), "parent", null);
        setIntField(term375099, term375099.getClass(), "type", 0);
        term375185 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term375185, term375185.getClass(), "type", 0);
        term375277 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term375277, term375277.getClass(), "type", 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term375099;
        args[1] = term375185;
        args[2] = term375277;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term375007, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


