package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;

public class IR_neg_1431040499233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29958;
     Object term30205;
     Object term30123;

    public IR_neg_1431040499233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29958, term29958.getClass(), "type", 38);
        term30205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30205, term30205.getClass(), "type", 38);
        setField(term30205, term30205.getClass(), "next", null);
        setField(term30205, term30205.getClass(), "first", null);
        setField(term30205, term30205.getClass(), "last", null);
        setField(term30205, term30205.getClass(), "propListHead", null);
        setIntField(term30205, term30205.getClass(), "sourcePosition", 0);
        setField(term30205, term30205.getClass(), "jsType", null);
        setIntField(term30206, term30206.getClass(), "type", 29);
        setField(term30206, term30206.getClass(), "next", null);
        setField(term30206, term30206.getClass(), "first", term30205);
        setField(term30206, term30206.getClass(), "last", term30205);
        setField(term30206, term30206.getClass(), "propListHead", null);
        setIntField(term30206, term30206.getClass(), "sourcePosition", -1);
        setField(term30206, term30206.getClass(), "jsType", null);
        setField(term30206, term30206.getClass(), "parent", null);
        setField(term30205, term30205.getClass(), "parent", term30206);
        term30123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30123, term30123.getClass(), "type", 29);
        setField(term30123, term30123.getClass(), "next", null);
        setIntField(term30120, term30120.getClass(), "type", 38);
        setField(term30120, term30120.getClass(), "next", null);
        setField(term30120, term30120.getClass(), "first", null);
        setField(term30120, term30120.getClass(), "last", null);
        setField(term30120, term30120.getClass(), "propListHead", null);
        setIntField(term30120, term30120.getClass(), "sourcePosition", 0);
        setField(term30120, term30120.getClass(), "jsType", null);
        setField(term30120, term30120.getClass(), "parent", term30123);
        setField(term30123, term30123.getClass(), "first", term30120);
        setField(term30123, term30123.getClass(), "last", term30120);
        setField(term30123, term30123.getClass(), "propListHead", null);
        setIntField(term30123, term30123.getClass(), "sourcePosition", -1);
        setField(term30123, term30123.getClass(), "jsType", null);
        setField(term30123, term30123.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term29958;
        Object retValue = callMethod(klass, "neg", argTypes, null, args);
        assertTrue(recursiveEquals(term29958, term30205));
        assertTrue(recursiveEquals(retValue, term30123));
    }

};


