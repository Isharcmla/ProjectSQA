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

public class IR_returnNode_2005608245470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68077;
     Object term68494;
     Object term68418;

    public IR_returnNode_2005608245470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term68077, term68077.getClass(), "type", 52);
        term68494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term68494, term68494.getClass(), "type", 52);
        setField(term68494, term68494.getClass(), "next", null);
        setField(term68494, term68494.getClass(), "first", null);
        setField(term68494, term68494.getClass(), "last", null);
        setField(term68494, term68494.getClass(), "propListHead", null);
        setIntField(term68494, term68494.getClass(), "sourcePosition", 0);
        setField(term68494, term68494.getClass(), "jsType", null);
        setIntField(term68495, term68495.getClass(), "type", 4);
        setField(term68495, term68495.getClass(), "next", null);
        setField(term68495, term68495.getClass(), "first", term68494);
        setField(term68495, term68495.getClass(), "last", term68494);
        setField(term68495, term68495.getClass(), "propListHead", null);
        setIntField(term68495, term68495.getClass(), "sourcePosition", -1);
        setField(term68495, term68495.getClass(), "jsType", null);
        setField(term68495, term68495.getClass(), "parent", null);
        setField(term68494, term68494.getClass(), "parent", term68495);
        term68418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term68418, term68418.getClass(), "type", 4);
        setField(term68418, term68418.getClass(), "next", null);
        setIntField(term68415, term68415.getClass(), "type", 52);
        setField(term68415, term68415.getClass(), "next", null);
        setField(term68415, term68415.getClass(), "first", null);
        setField(term68415, term68415.getClass(), "last", null);
        setField(term68415, term68415.getClass(), "propListHead", null);
        setIntField(term68415, term68415.getClass(), "sourcePosition", 0);
        setField(term68415, term68415.getClass(), "jsType", null);
        setField(term68415, term68415.getClass(), "parent", term68418);
        setField(term68418, term68418.getClass(), "first", term68415);
        setField(term68418, term68418.getClass(), "last", term68415);
        setField(term68418, term68418.getClass(), "propListHead", null);
        setIntField(term68418, term68418.getClass(), "sourcePosition", -1);
        setField(term68418, term68418.getClass(), "jsType", null);
        setField(term68418, term68418.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term68077;
        Object retValue = callMethod(klass, "returnNode", argTypes, null, args);
        assertTrue(recursiveEquals(term68077, term68494));
        assertTrue(recursiveEquals(retValue, term68418));
    }

};


