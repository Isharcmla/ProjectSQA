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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term347266;
     Object term347358;
     Object term347878;
     Object term347879;
     Object term347848;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term347266 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term347358 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term347428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term347358, term347358.getClass(), "first", term347358);
        setField(term347358, term347358.getClass(), "next", term347428);
        setIntField(term347358, term347358.getClass(), "type", 12);
        term347878 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term347878, term347878.getClass(), "currentTraversal", null);
        term347879 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term347880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term347879, term347879.getClass(), "number", 0.0);
        setIntField(term347879, term347879.getClass(), "type", 12);
        setIntField(term347880, term347880.getClass(), "type", 0);
        setField(term347880, term347880.getClass(), "next", null);
        setField(term347880, term347880.getClass(), "first", null);
        setField(term347880, term347880.getClass(), "last", null);
        setField(term347880, term347880.getClass(), "propListHead", null);
        setIntField(term347880, term347880.getClass(), "sourcePosition", 0);
        setField(term347880, term347880.getClass(), "jsType", null);
        setField(term347880, term347880.getClass(), "parent", null);
        setField(term347879, term347879.getClass(), "next", term347880);
        setField(term347879, term347879.getClass(), "first", term347879);
        setField(term347879, term347879.getClass(), "last", null);
        setField(term347879, term347879.getClass(), "propListHead", null);
        setIntField(term347879, term347879.getClass(), "sourcePosition", 0);
        setField(term347879, term347879.getClass(), "jsType", null);
        setField(term347879, term347879.getClass(), "parent", null);
        term347848 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term347851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term347848, term347848.getClass(), "number", 0.0);
        setIntField(term347848, term347848.getClass(), "type", 12);
        setIntField(term347851, term347851.getClass(), "type", 0);
        setField(term347851, term347851.getClass(), "next", null);
        setField(term347851, term347851.getClass(), "first", null);
        setField(term347851, term347851.getClass(), "last", null);
        setField(term347851, term347851.getClass(), "propListHead", null);
        setIntField(term347851, term347851.getClass(), "sourcePosition", 0);
        setField(term347851, term347851.getClass(), "jsType", null);
        setField(term347851, term347851.getClass(), "parent", null);
        setField(term347848, term347848.getClass(), "next", term347851);
        setField(term347848, term347848.getClass(), "first", term347848);
        setField(term347848, term347848.getClass(), "last", null);
        setField(term347848, term347848.getClass(), "propListHead", null);
        setIntField(term347848, term347848.getClass(), "sourcePosition", 0);
        setField(term347848, term347848.getClass(), "jsType", null);
        setField(term347848, term347848.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term347358;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term347266, args);
        assertTrue(recursiveEquals(term347266, term347878));
        assertTrue(recursiveEquals(term347358, term347879));
        assertTrue(recursiveEquals(retValue, term347848));
    }

};


