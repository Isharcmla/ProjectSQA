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

public class FoldConstants_tryFoldBlock_1167048042337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93031;
     Object term93101;

    public FoldConstants_tryFoldBlock_1167048042337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93031 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term93101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term93381, term93381.getClass(), "next", term93451);
        setIntField(term93381, term93381.getClass(), "type", 97);
        setField(term93311, term93311.getClass(), "next", term93381);
        setIntField(term93311, term93311.getClass(), "type", 73);
        setField(term93241, term93241.getClass(), "next", term93311);
        setIntField(term93241, term93241.getClass(), "type", 81);
        setField(term93171, term93171.getClass(), "next", term93241);
        setIntField(term93171, term93171.getClass(), "type", 103);
        setField(term93101, term93101.getClass(), "first", term93171);
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
        args[1] = term93101;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldBlock", argTypes, term93031, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


