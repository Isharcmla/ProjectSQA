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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178844;
     Object term178914;
     Object term178933;
     Object term178934;
     Object term178918;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178844 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term178914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term178914, term178914.getClass(), "first", term178914);
        setField(term178914, term178914.getClass(), "next", term178914);
        setIntField(term178914, term178914.getClass(), "type", 20);
        term178933 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term178933, term178933.getClass(), "currentTraversal", null);
        term178934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term178934, term178934.getClass(), "type", 20);
        setField(term178934, term178934.getClass(), "next", term178934);
        setField(term178934, term178934.getClass(), "first", term178934);
        setField(term178934, term178934.getClass(), "last", null);
        setField(term178934, term178934.getClass(), "propListHead", null);
        setIntField(term178934, term178934.getClass(), "sourcePosition", 0);
        setField(term178934, term178934.getClass(), "jsType", null);
        setField(term178934, term178934.getClass(), "parent", null);
        term178918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term178918, term178918.getClass(), "type", 20);
        setField(term178918, term178918.getClass(), "next", term178918);
        setField(term178918, term178918.getClass(), "first", term178918);
        setField(term178918, term178918.getClass(), "last", null);
        setField(term178918, term178918.getClass(), "propListHead", null);
        setIntField(term178918, term178918.getClass(), "sourcePosition", 0);
        setField(term178918, term178918.getClass(), "jsType", null);
        setField(term178918, term178918.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term178914;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term178844, args);
        assertTrue(recursiveEquals(term178844, term178933));
        assertTrue(recursiveEquals(term178914, term178934));
        assertTrue(recursiveEquals(retValue, term178918));
    }

};


