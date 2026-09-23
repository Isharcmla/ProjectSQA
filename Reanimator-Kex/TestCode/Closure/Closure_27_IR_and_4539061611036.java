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

public class IR_and_4539061611036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165608;
     Object term166142;
     Object term166144;
     Object term165961;

    public IR_and_4539061611036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term165608, term165608.getClass(), "type", 35);
        term166142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term166143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term166142, term166142.getClass(), "type", 35);
        setField(term166142, term166142.getClass(), "next", null);
        setField(term166142, term166142.getClass(), "first", null);
        setField(term166142, term166142.getClass(), "last", null);
        setField(term166142, term166142.getClass(), "propListHead", null);
        setIntField(term166142, term166142.getClass(), "sourcePosition", 0);
        setField(term166142, term166142.getClass(), "jsType", null);
        setIntField(term166143, term166143.getClass(), "type", 101);
        setField(term166143, term166143.getClass(), "next", null);
        setField(term166143, term166143.getClass(), "first", term166142);
        setField(term166143, term166143.getClass(), "last", term166142);
        setField(term166143, term166143.getClass(), "propListHead", null);
        setIntField(term166143, term166143.getClass(), "sourcePosition", -1);
        setField(term166143, term166143.getClass(), "jsType", null);
        setField(term166143, term166143.getClass(), "parent", null);
        setField(term166142, term166142.getClass(), "parent", term166143);
        term166144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term166145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term166144, term166144.getClass(), "type", 35);
        setField(term166144, term166144.getClass(), "next", null);
        setField(term166144, term166144.getClass(), "first", null);
        setField(term166144, term166144.getClass(), "last", null);
        setField(term166144, term166144.getClass(), "propListHead", null);
        setIntField(term166144, term166144.getClass(), "sourcePosition", 0);
        setField(term166144, term166144.getClass(), "jsType", null);
        setIntField(term166145, term166145.getClass(), "type", 101);
        setField(term166145, term166145.getClass(), "next", null);
        setField(term166145, term166145.getClass(), "first", term166144);
        setField(term166145, term166145.getClass(), "last", term166144);
        setField(term166145, term166145.getClass(), "propListHead", null);
        setIntField(term166145, term166145.getClass(), "sourcePosition", -1);
        setField(term166145, term166145.getClass(), "jsType", null);
        setField(term166145, term166145.getClass(), "parent", null);
        setField(term166144, term166144.getClass(), "parent", term166145);
        term165961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term165958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term165961, term165961.getClass(), "type", 101);
        setField(term165961, term165961.getClass(), "next", null);
        setIntField(term165958, term165958.getClass(), "type", 35);
        setField(term165958, term165958.getClass(), "next", null);
        setField(term165958, term165958.getClass(), "first", null);
        setField(term165958, term165958.getClass(), "last", null);
        setField(term165958, term165958.getClass(), "propListHead", null);
        setIntField(term165958, term165958.getClass(), "sourcePosition", 0);
        setField(term165958, term165958.getClass(), "jsType", null);
        setField(term165958, term165958.getClass(), "parent", term165961);
        setField(term165961, term165961.getClass(), "first", term165958);
        setField(term165961, term165961.getClass(), "last", term165958);
        setField(term165961, term165961.getClass(), "propListHead", null);
        setIntField(term165961, term165961.getClass(), "sourcePosition", -1);
        setField(term165961, term165961.getClass(), "jsType", null);
        setField(term165961, term165961.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term165608;
        args[1] = term165608;
        Object retValue = callMethod(klass, "and", argTypes, null, args);
        assertTrue(recursiveEquals(term165608, term166142));
        assertTrue(recursiveEquals(term165608, term166144));
        assertTrue(recursiveEquals(retValue, term165961));
    }

};


