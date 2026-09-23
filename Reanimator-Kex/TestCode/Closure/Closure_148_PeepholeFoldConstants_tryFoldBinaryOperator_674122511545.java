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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116640;
     Object term116732;
     Object term117924;
     Object term117925;
     Object term117890;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116640 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term116732 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term116824 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term116916 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term116824, term116824.getClass(), "next", term116916);
        setField(term116732, term116732.getClass(), "first", term116824);
        setIntField(term116732, term116732.getClass(), "type", 45);
        term117924 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term117924, term117924.getClass(), "currentTraversal", null);
        term117925 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term117926 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term117927 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term117925, term117925.getClass(), "str", null);
        setIntField(term117925, term117925.getClass(), "type", 45);
        setField(term117925, term117925.getClass(), "next", null);
        setField(term117926, term117926.getClass(), "str", null);
        setIntField(term117926, term117926.getClass(), "type", 0);
        setField(term117927, term117927.getClass(), "str", null);
        setIntField(term117927, term117927.getClass(), "type", 0);
        setField(term117927, term117927.getClass(), "next", null);
        setField(term117927, term117927.getClass(), "first", null);
        setField(term117927, term117927.getClass(), "last", null);
        setField(term117927, term117927.getClass(), "propListHead", null);
        setIntField(term117927, term117927.getClass(), "sourcePosition", 0);
        setField(term117927, term117927.getClass(), "jsType", null);
        setField(term117927, term117927.getClass(), "parent", null);
        setField(term117926, term117926.getClass(), "next", term117927);
        setField(term117926, term117926.getClass(), "first", null);
        setField(term117926, term117926.getClass(), "last", null);
        setField(term117926, term117926.getClass(), "propListHead", null);
        setIntField(term117926, term117926.getClass(), "sourcePosition", 0);
        setField(term117926, term117926.getClass(), "jsType", null);
        setField(term117926, term117926.getClass(), "parent", null);
        setField(term117925, term117925.getClass(), "first", term117926);
        setField(term117925, term117925.getClass(), "last", null);
        setField(term117925, term117925.getClass(), "propListHead", null);
        setIntField(term117925, term117925.getClass(), "sourcePosition", 0);
        setField(term117925, term117925.getClass(), "jsType", null);
        setField(term117925, term117925.getClass(), "parent", null);
        term117890 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term117892 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term117894 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term117890, term117890.getClass(), "str", null);
        setIntField(term117890, term117890.getClass(), "type", 45);
        setField(term117890, term117890.getClass(), "next", null);
        setField(term117892, term117892.getClass(), "str", null);
        setIntField(term117892, term117892.getClass(), "type", 0);
        setField(term117894, term117894.getClass(), "str", null);
        setIntField(term117894, term117894.getClass(), "type", 0);
        setField(term117894, term117894.getClass(), "next", null);
        setField(term117894, term117894.getClass(), "first", null);
        setField(term117894, term117894.getClass(), "last", null);
        setField(term117894, term117894.getClass(), "propListHead", null);
        setIntField(term117894, term117894.getClass(), "sourcePosition", 0);
        setField(term117894, term117894.getClass(), "jsType", null);
        setField(term117894, term117894.getClass(), "parent", null);
        setField(term117892, term117892.getClass(), "next", term117894);
        setField(term117892, term117892.getClass(), "first", null);
        setField(term117892, term117892.getClass(), "last", null);
        setField(term117892, term117892.getClass(), "propListHead", null);
        setIntField(term117892, term117892.getClass(), "sourcePosition", 0);
        setField(term117892, term117892.getClass(), "jsType", null);
        setField(term117892, term117892.getClass(), "parent", null);
        setField(term117890, term117890.getClass(), "first", term117892);
        setField(term117890, term117890.getClass(), "last", null);
        setField(term117890, term117890.getClass(), "propListHead", null);
        setIntField(term117890, term117890.getClass(), "sourcePosition", 0);
        setField(term117890, term117890.getClass(), "jsType", null);
        setField(term117890, term117890.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term116732;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term116640, args);
        assertTrue(recursiveEquals(term116640, term117924));
        assertTrue(recursiveEquals(term116732, term117925));
        assertTrue(recursiveEquals(retValue, term117890));
    }

};


