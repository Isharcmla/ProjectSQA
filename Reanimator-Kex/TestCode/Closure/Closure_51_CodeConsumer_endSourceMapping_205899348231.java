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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CodeConsumer_endSourceMapping_205899348231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22;

    public CodeConsumer_endSourceMapping_205899348231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22, term22.getClass(), "type", -883034806);
        setIntField(term24, term24.getClass(), "type", -1456670397);
        setIntField(term26, term26.getClass(), "type", 0);
        setField(term26, term26.getClass(), "next", null);
        setField(term26, term26.getClass(), "first", null);
        setField(term26, term26.getClass(), "last", null);
        setField(term26, term26.getClass(), "propListHead", null);
        setIntField(term26, term26.getClass(), "sourcePosition", 0);
        setField(term26, term26.getClass(), "jsType", null);
        setField(term26, term26.getClass(), "parent", null);
        setField(term24, term24.getClass(), "next", term26);
        setIntField(term29, term29.getClass(), "type", 0);
        setField(term29, term29.getClass(), "next", null);
        setField(term29, term29.getClass(), "first", null);
        setField(term29, term29.getClass(), "last", null);
        setField(term29, term29.getClass(), "propListHead", null);
        setIntField(term29, term29.getClass(), "sourcePosition", 0);
        setField(term29, term29.getClass(), "jsType", null);
        setField(term29, term29.getClass(), "parent", null);
        setField(term24, term24.getClass(), "first", term29);
        setIntField(term32, term32.getClass(), "type", 0);
        setField(term32, term32.getClass(), "next", null);
        setField(term32, term32.getClass(), "first", null);
        setField(term32, term32.getClass(), "last", null);
        setField(term32, term32.getClass(), "propListHead", null);
        setIntField(term32, term32.getClass(), "sourcePosition", 0);
        setField(term32, term32.getClass(), "jsType", null);
        setField(term32, term32.getClass(), "parent", null);
        setField(term24, term24.getClass(), "last", term32);
        setField(term24, term24.getClass(), "propListHead", null);
        setIntField(term24, term24.getClass(), "sourcePosition", 0);
        setField(term24, term24.getClass(), "jsType", null);
        setField(term24, term24.getClass(), "parent", null);
        setField(term22, term22.getClass(), "next", term24);
        setIntField(term36, term36.getClass(), "type", 0);
        setField(term36, term36.getClass(), "next", null);
        setField(term36, term36.getClass(), "first", null);
        setField(term36, term36.getClass(), "last", null);
        setField(term36, term36.getClass(), "propListHead", null);
        setIntField(term36, term36.getClass(), "sourcePosition", 0);
        setField(term36, term36.getClass(), "jsType", null);
        setField(term36, term36.getClass(), "parent", null);
        setField(term22, term22.getClass(), "first", term36);
        setIntField(term39, term39.getClass(), "type", 0);
        setField(term39, term39.getClass(), "next", null);
        setField(term39, term39.getClass(), "first", null);
        setField(term39, term39.getClass(), "last", null);
        setField(term39, term39.getClass(), "propListHead", null);
        setIntField(term39, term39.getClass(), "sourcePosition", 0);
        setField(term39, term39.getClass(), "jsType", null);
        setField(term39, term39.getClass(), "parent", null);
        setField(term22, term22.getClass(), "last", term39);
        setField(term22, term22.getClass(), "propListHead", null);
        setIntField(term22, term22.getClass(), "sourcePosition", 0);
        setField(term22, term22.getClass(), "jsType", null);
        setField(term22, term22.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeConsumer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term22;
        try {
            callMethod(klass, "endSourceMapping", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


