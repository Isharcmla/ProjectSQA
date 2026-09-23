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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53957;
     Object term54027;
     Object term54058;
     Object term54059;
     Object term54031;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53957 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term54027 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term54027, term54027.getClass(), "first", term54027);
        setField(term54027, term54027.getClass(), "next", term54027);
        setIntField(term54027, term54027.getClass(), "type", 86);
        term54058 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term54058, term54058.getClass(), "currentTraversal", null);
        term54059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term54059, term54059.getClass(), "type", 86);
        setField(term54059, term54059.getClass(), "next", term54059);
        setField(term54059, term54059.getClass(), "first", term54059);
        setField(term54059, term54059.getClass(), "last", null);
        setField(term54059, term54059.getClass(), "propListHead", null);
        setIntField(term54059, term54059.getClass(), "sourcePosition", 0);
        setField(term54059, term54059.getClass(), "jsType", null);
        setField(term54059, term54059.getClass(), "parent", null);
        term54031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term54031, term54031.getClass(), "type", 86);
        setField(term54031, term54031.getClass(), "next", term54031);
        setField(term54031, term54031.getClass(), "first", term54031);
        setField(term54031, term54031.getClass(), "last", null);
        setField(term54031, term54031.getClass(), "propListHead", null);
        setIntField(term54031, term54031.getClass(), "sourcePosition", 0);
        setField(term54031, term54031.getClass(), "jsType", null);
        setField(term54031, term54031.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term54027;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term53957, args);
        assertTrue(recursiveEquals(term53957, term54058));
        assertTrue(recursiveEquals(term54027, term54059));
        assertTrue(recursiveEquals(retValue, term54031));
    }

};


