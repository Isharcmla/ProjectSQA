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

public class IR_returnNode_2005608245499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72881;
     Object term73127;
     Object term73051;

    public IR_returnNode_2005608245499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term72881, term72881.getClass(), "type", 93);
        term73127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term73127, term73127.getClass(), "type", 93);
        setField(term73127, term73127.getClass(), "next", null);
        setField(term73127, term73127.getClass(), "first", null);
        setField(term73127, term73127.getClass(), "last", null);
        setField(term73127, term73127.getClass(), "propListHead", null);
        setIntField(term73127, term73127.getClass(), "sourcePosition", 0);
        setField(term73127, term73127.getClass(), "jsType", null);
        setIntField(term73128, term73128.getClass(), "type", 4);
        setField(term73128, term73128.getClass(), "next", null);
        setField(term73128, term73128.getClass(), "first", term73127);
        setField(term73128, term73128.getClass(), "last", term73127);
        setField(term73128, term73128.getClass(), "propListHead", null);
        setIntField(term73128, term73128.getClass(), "sourcePosition", -1);
        setField(term73128, term73128.getClass(), "jsType", null);
        setField(term73128, term73128.getClass(), "parent", null);
        setField(term73127, term73127.getClass(), "parent", term73128);
        term73051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term73051, term73051.getClass(), "type", 4);
        setField(term73051, term73051.getClass(), "next", null);
        setIntField(term73048, term73048.getClass(), "type", 93);
        setField(term73048, term73048.getClass(), "next", null);
        setField(term73048, term73048.getClass(), "first", null);
        setField(term73048, term73048.getClass(), "last", null);
        setField(term73048, term73048.getClass(), "propListHead", null);
        setIntField(term73048, term73048.getClass(), "sourcePosition", 0);
        setField(term73048, term73048.getClass(), "jsType", null);
        setField(term73048, term73048.getClass(), "parent", term73051);
        setField(term73051, term73051.getClass(), "first", term73048);
        setField(term73051, term73051.getClass(), "last", term73048);
        setField(term73051, term73051.getClass(), "propListHead", null);
        setIntField(term73051, term73051.getClass(), "sourcePosition", -1);
        setField(term73051, term73051.getClass(), "jsType", null);
        setField(term73051, term73051.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term72881;
        Object retValue = callMethod(klass, "returnNode", argTypes, null, args);
        assertTrue(recursiveEquals(term72881, term73127));
        assertTrue(recursiveEquals(retValue, term73051));
    }

};


