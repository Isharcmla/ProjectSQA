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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18759;
     Object term18829;
     Object term18883;
     Object term18884;
     Object term18853;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18759 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term18829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term18829, term18829.getClass(), "first", term18829);
        setField(term18829, term18829.getClass(), "next", term18829);
        setIntField(term18829, term18829.getClass(), "type", 16);
        term18883 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term18883, term18883.getClass(), "currentTraversal", null);
        term18884 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18884, term18884.getClass(), "type", 16);
        setField(term18884, term18884.getClass(), "next", term18884);
        setField(term18884, term18884.getClass(), "first", term18884);
        setField(term18884, term18884.getClass(), "last", null);
        setField(term18884, term18884.getClass(), "propListHead", null);
        setIntField(term18884, term18884.getClass(), "sourcePosition", 0);
        setField(term18884, term18884.getClass(), "jsType", null);
        setField(term18884, term18884.getClass(), "parent", null);
        term18853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18853, term18853.getClass(), "type", 16);
        setField(term18853, term18853.getClass(), "next", term18853);
        setField(term18853, term18853.getClass(), "first", term18853);
        setField(term18853, term18853.getClass(), "last", null);
        setField(term18853, term18853.getClass(), "propListHead", null);
        setIntField(term18853, term18853.getClass(), "sourcePosition", 0);
        setField(term18853, term18853.getClass(), "jsType", null);
        setField(term18853, term18853.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term18829;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term18759, args);
        assertTrue(recursiveEquals(term18759, term18883));
        assertTrue(recursiveEquals(term18829, term18884));
        assertTrue(recursiveEquals(retValue, term18853));
    }

};


