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

public class FoldConstants_tryFoldBlock_1167048042324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88335;
     Object term88405;

    public FoldConstants_tryFoldBlock_1167048042324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88335 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term88405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term88615, term88615.getClass(), "next", term88685);
        setIntField(term88615, term88615.getClass(), "type", 122);
        setField(term88545, term88545.getClass(), "next", term88615);
        setIntField(term88545, term88545.getClass(), "type", 54);
        setField(term88475, term88475.getClass(), "next", term88545);
        setIntField(term88475, term88475.getClass(), "type", 60);
        setField(term88405, term88405.getClass(), "first", term88475);
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
        args[1] = term88405;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldBlock", argTypes, term88335, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


