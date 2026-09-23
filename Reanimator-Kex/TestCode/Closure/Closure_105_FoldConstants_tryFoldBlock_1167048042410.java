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

public class FoldConstants_tryFoldBlock_1167048042410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117737;
     Object term117807;

    public FoldConstants_tryFoldBlock_1167048042410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117737 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term117807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term117877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term117947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term118017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term118087 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term118017, term118017.getClass(), "next", term118087);
        setIntField(term118017, term118017.getClass(), "type", 85);
        setField(term117947, term117947.getClass(), "next", term118017);
        setIntField(term117947, term117947.getClass(), "type", 99);
        setField(term117877, term117877.getClass(), "next", term117947);
        setIntField(term117877, term117877.getClass(), "type", 107);
        setField(term117807, term117807.getClass(), "first", term117877);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term117807;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldBlock", argTypes, term117737, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


