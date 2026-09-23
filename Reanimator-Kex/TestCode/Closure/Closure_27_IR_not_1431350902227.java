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

public class IR_not_1431350902227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29249;
     Object term29515;
     Object term29433;

    public IR_not_1431350902227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29249, term29249.getClass(), "type", 100);
        term29515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29515, term29515.getClass(), "type", 100);
        setField(term29515, term29515.getClass(), "next", null);
        setField(term29515, term29515.getClass(), "first", null);
        setField(term29515, term29515.getClass(), "last", null);
        setField(term29515, term29515.getClass(), "propListHead", null);
        setIntField(term29515, term29515.getClass(), "sourcePosition", 0);
        setField(term29515, term29515.getClass(), "jsType", null);
        setIntField(term29516, term29516.getClass(), "type", 26);
        setField(term29516, term29516.getClass(), "next", null);
        setField(term29516, term29516.getClass(), "first", term29515);
        setField(term29516, term29516.getClass(), "last", term29515);
        setField(term29516, term29516.getClass(), "propListHead", null);
        setIntField(term29516, term29516.getClass(), "sourcePosition", -1);
        setField(term29516, term29516.getClass(), "jsType", null);
        setField(term29516, term29516.getClass(), "parent", null);
        setField(term29515, term29515.getClass(), "parent", term29516);
        term29433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29430 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29433, term29433.getClass(), "type", 26);
        setField(term29433, term29433.getClass(), "next", null);
        setIntField(term29430, term29430.getClass(), "type", 100);
        setField(term29430, term29430.getClass(), "next", null);
        setField(term29430, term29430.getClass(), "first", null);
        setField(term29430, term29430.getClass(), "last", null);
        setField(term29430, term29430.getClass(), "propListHead", null);
        setIntField(term29430, term29430.getClass(), "sourcePosition", 0);
        setField(term29430, term29430.getClass(), "jsType", null);
        setField(term29430, term29430.getClass(), "parent", term29433);
        setField(term29433, term29433.getClass(), "first", term29430);
        setField(term29433, term29433.getClass(), "last", term29430);
        setField(term29433, term29433.getClass(), "propListHead", null);
        setIntField(term29433, term29433.getClass(), "sourcePosition", -1);
        setField(term29433, term29433.getClass(), "jsType", null);
        setField(term29433, term29433.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term29249;
        Object retValue = callMethod(klass, "not", argTypes, null, args);
        assertTrue(recursiveEquals(term29249, term29515));
        assertTrue(recursiveEquals(retValue, term29433));
    }

};


