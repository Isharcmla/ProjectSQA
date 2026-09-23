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

public class CheckSideEffects_process_152266774634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14909;
     Object term14979;
     Object term15521;
     Object term15522;

    public CheckSideEffects_process_152266774634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14909 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term14909, term14909.getClass(), "compiler", null);
        term14979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14979, term14979.getClass(), "type", 115);
        setField(term14979, term14979.getClass(), "parent", null);
        setField(term15049, term15049.getClass(), "next", null);
        setIntField(term15049, term15049.getClass(), "type", 115);
        setField(term15119, term15119.getClass(), "next", null);
        setIntField(term15119, term15119.getClass(), "type", 0);
        setField(term15119, term15119.getClass(), "first", null);
        setField(term15049, term15049.getClass(), "first", term15119);
        setField(term14979, term14979.getClass(), "first", term15049);
        term15521 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term15521, term15521.getClass(), "level", null);
        setField(term15521, term15521.getClass(), "problemNodes", null);
        setField(term15521, term15521.getClass(), "compiler", null);
        setBooleanField(term15521, term15521.getClass(), "protectSideEffectFreeCode", false);
        term15522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15522, term15522.getClass(), "type", 115);
        setField(term15522, term15522.getClass(), "next", null);
        setIntField(term15523, term15523.getClass(), "type", 115);
        setField(term15523, term15523.getClass(), "next", null);
        setIntField(term15524, term15524.getClass(), "type", 0);
        setField(term15524, term15524.getClass(), "next", null);
        setField(term15524, term15524.getClass(), "first", null);
        setField(term15524, term15524.getClass(), "last", null);
        setField(term15524, term15524.getClass(), "propListHead", null);
        setIntField(term15524, term15524.getClass(), "sourcePosition", 0);
        setField(term15524, term15524.getClass(), "jsType", null);
        setField(term15524, term15524.getClass(), "parent", null);
        setField(term15523, term15523.getClass(), "first", term15524);
        setField(term15523, term15523.getClass(), "last", null);
        setField(term15523, term15523.getClass(), "propListHead", null);
        setIntField(term15523, term15523.getClass(), "sourcePosition", 0);
        setField(term15523, term15523.getClass(), "jsType", null);
        setField(term15523, term15523.getClass(), "parent", null);
        setField(term15522, term15522.getClass(), "first", term15523);
        setField(term15522, term15522.getClass(), "last", null);
        setField(term15522, term15522.getClass(), "propListHead", null);
        setIntField(term15522, term15522.getClass(), "sourcePosition", 0);
        setField(term15522, term15522.getClass(), "jsType", null);
        setField(term15522, term15522.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term14979;
        callMethod(klass, "process", argTypes, term14909, args);
        assertTrue(recursiveEquals(term14909, term15521));
        assertTrue(recursiveEquals(term14979, null));
    }

};


