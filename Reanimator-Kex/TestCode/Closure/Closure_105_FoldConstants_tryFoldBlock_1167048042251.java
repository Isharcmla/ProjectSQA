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

public class FoldConstants_tryFoldBlock_1167048042251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66213;
     Object term66283;

    public FoldConstants_tryFoldBlock_1167048042251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66213 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term66283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term66493, term66493.getClass(), "next", term66563);
        setIntField(term66493, term66493.getClass(), "type", 86);
        setField(term66423, term66423.getClass(), "next", term66493);
        setIntField(term66423, term66423.getClass(), "type", 87);
        setIntField(term66633, term66633.getClass(), "type", 75);
        setField(term66423, term66423.getClass(), "first", term66633);
        setField(term66353, term66353.getClass(), "next", term66423);
        setIntField(term66353, term66353.getClass(), "type", 75);
        setField(term66283, term66283.getClass(), "first", term66353);
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
        args[1] = term66283;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldBlock", argTypes, term66213, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


