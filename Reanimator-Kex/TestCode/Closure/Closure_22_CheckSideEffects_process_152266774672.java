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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CheckSideEffects_process_152266774672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30989;
     Object term31139;

    public CheckSideEffects_process_152266774672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30989 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        Object term31069 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term30989, term30989.getClass(), "compiler", term31069);
        term31139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31139, term31139.getClass(), "type", 0);
        setField(term31139, term31139.getClass(), "parent", null);
        setField(term31209, term31209.getClass(), "next", term31279);
        setIntField(term31209, term31209.getClass(), "type", 85);
        setField(term31349, term31349.getClass(), "next", term31139);
        setIntField(term31349, term31349.getClass(), "type", 0);
        setField(term31349, term31349.getClass(), "first", null);
        setField(term31209, term31209.getClass(), "first", term31349);
        setField(term31209, term31209.getClass(), "parent", term31139);
        setField(term31209, term31209.getClass(), "last", term31349);
        setField(term31139, term31139.getClass(), "first", term31209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term31139;
        try {
            callMethod(klass, "process", argTypes, term30989, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


