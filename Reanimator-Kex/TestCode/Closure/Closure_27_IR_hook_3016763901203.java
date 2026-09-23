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

public class IR_hook_3016763901203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197122;
     Object term197320;
     Object term197322;
     Object term197324;
     Object term197287;

    public IR_hook_3016763901203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197122 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term197122, term197122.getClass(), "type", 45);
        term197320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term197321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term197320, term197320.getClass(), "type", 45);
        setField(term197320, term197320.getClass(), "next", null);
        setField(term197320, term197320.getClass(), "first", null);
        setField(term197320, term197320.getClass(), "last", null);
        setField(term197320, term197320.getClass(), "propListHead", null);
        setIntField(term197320, term197320.getClass(), "sourcePosition", 0);
        setField(term197320, term197320.getClass(), "jsType", null);
        setIntField(term197321, term197321.getClass(), "type", 98);
        setField(term197321, term197321.getClass(), "next", null);
        setField(term197321, term197321.getClass(), "first", term197320);
        setField(term197321, term197321.getClass(), "last", term197320);
        setField(term197321, term197321.getClass(), "propListHead", null);
        setIntField(term197321, term197321.getClass(), "sourcePosition", -1);
        setField(term197321, term197321.getClass(), "jsType", null);
        setField(term197321, term197321.getClass(), "parent", null);
        setField(term197320, term197320.getClass(), "parent", term197321);
        term197322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term197323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term197322, term197322.getClass(), "type", 45);
        setField(term197322, term197322.getClass(), "next", null);
        setField(term197322, term197322.getClass(), "first", null);
        setField(term197322, term197322.getClass(), "last", null);
        setField(term197322, term197322.getClass(), "propListHead", null);
        setIntField(term197322, term197322.getClass(), "sourcePosition", 0);
        setField(term197322, term197322.getClass(), "jsType", null);
        setIntField(term197323, term197323.getClass(), "type", 98);
        setField(term197323, term197323.getClass(), "next", null);
        setField(term197323, term197323.getClass(), "first", term197322);
        setField(term197323, term197323.getClass(), "last", term197322);
        setField(term197323, term197323.getClass(), "propListHead", null);
        setIntField(term197323, term197323.getClass(), "sourcePosition", -1);
        setField(term197323, term197323.getClass(), "jsType", null);
        setField(term197323, term197323.getClass(), "parent", null);
        setField(term197322, term197322.getClass(), "parent", term197323);
        term197324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term197325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term197324, term197324.getClass(), "type", 45);
        setField(term197324, term197324.getClass(), "next", null);
        setField(term197324, term197324.getClass(), "first", null);
        setField(term197324, term197324.getClass(), "last", null);
        setField(term197324, term197324.getClass(), "propListHead", null);
        setIntField(term197324, term197324.getClass(), "sourcePosition", 0);
        setField(term197324, term197324.getClass(), "jsType", null);
        setIntField(term197325, term197325.getClass(), "type", 98);
        setField(term197325, term197325.getClass(), "next", null);
        setField(term197325, term197325.getClass(), "first", term197324);
        setField(term197325, term197325.getClass(), "last", term197324);
        setField(term197325, term197325.getClass(), "propListHead", null);
        setIntField(term197325, term197325.getClass(), "sourcePosition", -1);
        setField(term197325, term197325.getClass(), "jsType", null);
        setField(term197325, term197325.getClass(), "parent", null);
        setField(term197324, term197324.getClass(), "parent", term197325);
        term197287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term197284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term197287, term197287.getClass(), "type", 98);
        setField(term197287, term197287.getClass(), "next", null);
        setIntField(term197284, term197284.getClass(), "type", 45);
        setField(term197284, term197284.getClass(), "next", null);
        setField(term197284, term197284.getClass(), "first", null);
        setField(term197284, term197284.getClass(), "last", null);
        setField(term197284, term197284.getClass(), "propListHead", null);
        setIntField(term197284, term197284.getClass(), "sourcePosition", 0);
        setField(term197284, term197284.getClass(), "jsType", null);
        setField(term197284, term197284.getClass(), "parent", term197287);
        setField(term197287, term197287.getClass(), "first", term197284);
        setField(term197287, term197287.getClass(), "last", term197284);
        setField(term197287, term197287.getClass(), "propListHead", null);
        setIntField(term197287, term197287.getClass(), "sourcePosition", -1);
        setField(term197287, term197287.getClass(), "jsType", null);
        setField(term197287, term197287.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term197122;
        args[1] = term197122;
        args[2] = term197122;
        Object retValue = callMethod(klass, "hook", argTypes, null, args);
        assertTrue(recursiveEquals(term197122, term197320));
        assertTrue(recursiveEquals(term197122, term197322));
        assertTrue(recursiveEquals(term197122, term197324));
        assertTrue(recursiveEquals(retValue, term197287));
    }

};


