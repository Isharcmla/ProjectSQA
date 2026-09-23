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

public class FoldConstants_tryFoldBlock_1167048042132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20961;
     Object term21031;
     Object term30844;
     Object term30845;

    public FoldConstants_tryFoldBlock_1167048042132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20961 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term21031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term21031, term21031.getClass(), "first", term21031);
        setField(term21031, term21031.getClass(), "next", term21101);
        setIntField(term21031, term21031.getClass(), "type", 82);
        term30844 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term30844, term30844.getClass(), "compiler", null);
        term30845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30845, term30845.getClass(), "type", 82);
        setIntField(term30846, term30846.getClass(), "type", 0);
        setField(term30846, term30846.getClass(), "next", null);
        setField(term30846, term30846.getClass(), "first", null);
        setField(term30846, term30846.getClass(), "last", null);
        setField(term30846, term30846.getClass(), "propListHead", null);
        setIntField(term30846, term30846.getClass(), "sourcePosition", 0);
        setField(term30846, term30846.getClass(), "jsType", null);
        setField(term30846, term30846.getClass(), "parent", null);
        setField(term30845, term30845.getClass(), "next", term30846);
        setField(term30845, term30845.getClass(), "first", term30845);
        setField(term30845, term30845.getClass(), "last", null);
        setField(term30845, term30845.getClass(), "propListHead", null);
        setIntField(term30845, term30845.getClass(), "sourcePosition", 0);
        setField(term30845, term30845.getClass(), "jsType", null);
        setField(term30845, term30845.getClass(), "parent", null);
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
        args[1] = term21031;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term20961, args);
        assertTrue(recursiveEquals(term20961, term30844));
        assertTrue(recursiveEquals(term21031, null));
    }

};


