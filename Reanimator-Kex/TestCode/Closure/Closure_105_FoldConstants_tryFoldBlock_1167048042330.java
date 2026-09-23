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

public class FoldConstants_tryFoldBlock_1167048042330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90667;
     Object term90737;

    public FoldConstants_tryFoldBlock_1167048042330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90667 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term90737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term90947, term90947.getClass(), "next", term91017);
        setIntField(term90947, term90947.getClass(), "type", 94);
        setField(term90877, term90877.getClass(), "next", term90947);
        setIntField(term90877, term90877.getClass(), "type", 78);
        setField(term90807, term90807.getClass(), "next", term90877);
        setIntField(term90807, term90807.getClass(), "type", 82);
        setField(term90737, term90737.getClass(), "first", term90807);
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
        args[1] = term90737;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldBlock", argTypes, term90667, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


