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

public class FoldConstants_tryFoldBlock_1167048042230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60062;
     Object term60132;

    public FoldConstants_tryFoldBlock_1167048042230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60062 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term60132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term60342, term60342.getClass(), "next", term60412);
        setIntField(term60342, term60342.getClass(), "type", 87);
        setField(term60272, term60272.getClass(), "next", term60342);
        setIntField(term60272, term60272.getClass(), "type", 69);
        setField(term60202, term60202.getClass(), "next", term60272);
        setIntField(term60202, term60202.getClass(), "type", 60);
        setField(term60132, term60132.getClass(), "first", term60202);
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
        args[1] = term60132;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldBlock", argTypes, term60062, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


