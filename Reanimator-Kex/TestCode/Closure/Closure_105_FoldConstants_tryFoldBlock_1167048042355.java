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

public class FoldConstants_tryFoldBlock_1167048042355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99311;
     Object term99381;
     Object term99909;
     Object term99910;

    public FoldConstants_tryFoldBlock_1167048042355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99311 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term99381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term99661, term99661.getClass(), "next", term99731);
        setIntField(term99661, term99661.getClass(), "type", 114);
        setField(term99591, term99591.getClass(), "next", term99661);
        setIntField(term99591, term99591.getClass(), "type", 127);
        setField(term99521, term99521.getClass(), "next", term99591);
        setIntField(term99521, term99521.getClass(), "type", 78);
        setField(term99451, term99451.getClass(), "next", term99521);
        setIntField(term99451, term99451.getClass(), "type", 82);
        setField(term99381, term99381.getClass(), "first", term99451);
        term99909 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term99909, term99909.getClass(), "compiler", null);
        term99910 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99912 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term99910, term99910.getClass(), "type", 0);
        setField(term99910, term99910.getClass(), "next", null);
        setIntField(term99911, term99911.getClass(), "type", 82);
        setIntField(term99912, term99912.getClass(), "type", 78);
        setIntField(term99913, term99913.getClass(), "type", 127);
        setIntField(term99914, term99914.getClass(), "type", 114);
        setField(term99914, term99914.getClass(), "next", null);
        setField(term99914, term99914.getClass(), "first", null);
        setField(term99914, term99914.getClass(), "last", null);
        setField(term99914, term99914.getClass(), "propListHead", null);
        setIntField(term99914, term99914.getClass(), "sourcePosition", 0);
        setField(term99914, term99914.getClass(), "jsType", null);
        setField(term99914, term99914.getClass(), "parent", null);
        setField(term99913, term99913.getClass(), "next", term99914);
        setField(term99913, term99913.getClass(), "first", null);
        setField(term99913, term99913.getClass(), "last", null);
        setField(term99913, term99913.getClass(), "propListHead", null);
        setIntField(term99913, term99913.getClass(), "sourcePosition", 0);
        setField(term99913, term99913.getClass(), "jsType", null);
        setField(term99913, term99913.getClass(), "parent", null);
        setField(term99912, term99912.getClass(), "next", term99913);
        setField(term99912, term99912.getClass(), "first", null);
        setField(term99912, term99912.getClass(), "last", null);
        setField(term99912, term99912.getClass(), "propListHead", null);
        setIntField(term99912, term99912.getClass(), "sourcePosition", 0);
        setField(term99912, term99912.getClass(), "jsType", null);
        setField(term99912, term99912.getClass(), "parent", null);
        setField(term99911, term99911.getClass(), "next", term99912);
        setField(term99911, term99911.getClass(), "first", null);
        setField(term99911, term99911.getClass(), "last", null);
        setField(term99911, term99911.getClass(), "propListHead", null);
        setIntField(term99911, term99911.getClass(), "sourcePosition", 0);
        setField(term99911, term99911.getClass(), "jsType", null);
        setField(term99911, term99911.getClass(), "parent", null);
        setField(term99910, term99910.getClass(), "first", term99911);
        setField(term99910, term99910.getClass(), "last", null);
        setField(term99910, term99910.getClass(), "propListHead", null);
        setIntField(term99910, term99910.getClass(), "sourcePosition", 0);
        setField(term99910, term99910.getClass(), "jsType", null);
        setField(term99910, term99910.getClass(), "parent", null);
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
        args[1] = term99381;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term99311, args);
        assertTrue(recursiveEquals(term99311, term99909));
        assertTrue(recursiveEquals(term99381, null));
    }

};


