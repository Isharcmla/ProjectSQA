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

public class CheckSideEffects_process_152266774657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25678;
     Object term25748;
     Object term26922;
     Object term26923;

    public CheckSideEffects_process_152266774657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25678 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term25678, term25678.getClass(), "compiler", null);
        term25748 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25748, term25748.getClass(), "type", 115);
        setField(term25748, term25748.getClass(), "parent", null);
        setField(term25818, term25818.getClass(), "next", term25888);
        setIntField(term25818, term25818.getClass(), "type", 0);
        setField(term25818, term25818.getClass(), "first", null);
        setField(term25748, term25748.getClass(), "first", term25818);
        term26922 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term26922, term26922.getClass(), "level", null);
        setField(term26922, term26922.getClass(), "problemNodes", null);
        setField(term26922, term26922.getClass(), "compiler", null);
        setBooleanField(term26922, term26922.getClass(), "protectSideEffectFreeCode", false);
        term26923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26923, term26923.getClass(), "type", 115);
        setField(term26923, term26923.getClass(), "next", null);
        setIntField(term26924, term26924.getClass(), "type", 0);
        setIntField(term26925, term26925.getClass(), "type", 0);
        setField(term26925, term26925.getClass(), "next", null);
        setField(term26925, term26925.getClass(), "first", null);
        setField(term26925, term26925.getClass(), "last", null);
        setField(term26925, term26925.getClass(), "propListHead", null);
        setIntField(term26925, term26925.getClass(), "sourcePosition", 0);
        setField(term26925, term26925.getClass(), "jsType", null);
        setField(term26925, term26925.getClass(), "parent", null);
        setField(term26924, term26924.getClass(), "next", term26925);
        setField(term26924, term26924.getClass(), "first", null);
        setField(term26924, term26924.getClass(), "last", null);
        setField(term26924, term26924.getClass(), "propListHead", null);
        setIntField(term26924, term26924.getClass(), "sourcePosition", 0);
        setField(term26924, term26924.getClass(), "jsType", null);
        setField(term26924, term26924.getClass(), "parent", null);
        setField(term26923, term26923.getClass(), "first", term26924);
        setField(term26923, term26923.getClass(), "last", null);
        setField(term26923, term26923.getClass(), "propListHead", null);
        setIntField(term26923, term26923.getClass(), "sourcePosition", 0);
        setField(term26923, term26923.getClass(), "jsType", null);
        setField(term26923, term26923.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term25748;
        callMethod(klass, "process", argTypes, term25678, args);
        assertTrue(recursiveEquals(term25678, term26922));
        assertTrue(recursiveEquals(term25748, null));
    }

};


