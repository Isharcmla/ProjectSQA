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

public class IR_throwNode_940306539153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17885;
     Object term18304;
     Object term18228;

    public IR_throwNode_940306539153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17885, term17885.getClass(), "type", 28);
        term18304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18304, term18304.getClass(), "type", 28);
        setField(term18304, term18304.getClass(), "next", null);
        setField(term18304, term18304.getClass(), "first", null);
        setField(term18304, term18304.getClass(), "last", null);
        setField(term18304, term18304.getClass(), "propListHead", null);
        setIntField(term18304, term18304.getClass(), "sourcePosition", 0);
        setField(term18304, term18304.getClass(), "jsType", null);
        setIntField(term18305, term18305.getClass(), "type", 49);
        setField(term18305, term18305.getClass(), "next", null);
        setField(term18305, term18305.getClass(), "first", term18304);
        setField(term18305, term18305.getClass(), "last", term18304);
        setField(term18305, term18305.getClass(), "propListHead", null);
        setIntField(term18305, term18305.getClass(), "sourcePosition", -1);
        setField(term18305, term18305.getClass(), "jsType", null);
        setField(term18305, term18305.getClass(), "parent", null);
        setField(term18304, term18304.getClass(), "parent", term18305);
        term18228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18228, term18228.getClass(), "type", 49);
        setField(term18228, term18228.getClass(), "next", null);
        setIntField(term18225, term18225.getClass(), "type", 28);
        setField(term18225, term18225.getClass(), "next", null);
        setField(term18225, term18225.getClass(), "first", null);
        setField(term18225, term18225.getClass(), "last", null);
        setField(term18225, term18225.getClass(), "propListHead", null);
        setIntField(term18225, term18225.getClass(), "sourcePosition", 0);
        setField(term18225, term18225.getClass(), "jsType", null);
        setField(term18225, term18225.getClass(), "parent", term18228);
        setField(term18228, term18228.getClass(), "first", term18225);
        setField(term18228, term18228.getClass(), "last", term18225);
        setField(term18228, term18228.getClass(), "propListHead", null);
        setIntField(term18228, term18228.getClass(), "sourcePosition", -1);
        setField(term18228, term18228.getClass(), "jsType", null);
        setField(term18228, term18228.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term17885;
        Object retValue = callMethod(klass, "throwNode", argTypes, null, args);
        assertTrue(recursiveEquals(term17885, term18304));
        assertTrue(recursiveEquals(retValue, term18228));
    }

};


