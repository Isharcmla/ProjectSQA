package com.google.javascript.rhino.jstype;

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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ArrowType_testForEquality_63022271324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term456;

    public ArrowType_testForEquality_63022271324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term456 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term457, term457.getClass(), "type", -268815336);
        setIntField(term459, term459.getClass(), "type", -1210583429);
        setIntField(term461, term461.getClass(), "type", -663691365);
        setIntField(term463, term463.getClass(), "type", 339854490);
        setField(term463, term463.getClass(), "next", null);
        setField(term463, term463.getClass(), "first", null);
        setField(term463, term463.getClass(), "last", null);
        setField(term463, term463.getClass(), "propListHead", null);
        setIntField(term463, term463.getClass(), "sourcePosition", 0);
        setField(term463, term463.getClass(), "jsType", null);
        setField(term463, term463.getClass(), "parent", null);
        setField(term461, term461.getClass(), "next", term463);
        setIntField(term466, term466.getClass(), "type", 1532716628);
        setField(term466, term466.getClass(), "next", null);
        setField(term466, term466.getClass(), "first", term457);
        setField(term466, term466.getClass(), "last", null);
        setField(term466, term466.getClass(), "propListHead", null);
        setIntField(term466, term466.getClass(), "sourcePosition", 0);
        setField(term466, term466.getClass(), "jsType", null);
        setField(term466, term466.getClass(), "parent", null);
        setField(term461, term461.getClass(), "first", term466);
        setIntField(term469, term469.getClass(), "type", -1476117762);
        setField(term469, term469.getClass(), "next", null);
        setField(term469, term469.getClass(), "first", term459);
        setField(term469, term469.getClass(), "last", null);
        setField(term469, term469.getClass(), "propListHead", null);
        setIntField(term469, term469.getClass(), "sourcePosition", 0);
        setField(term469, term469.getClass(), "jsType", null);
        setField(term469, term469.getClass(), "parent", null);
        setField(term461, term461.getClass(), "last", term469);
        setField(term461, term461.getClass(), "propListHead", null);
        setIntField(term461, term461.getClass(), "sourcePosition", 0);
        setField(term461, term461.getClass(), "jsType", null);
        setField(term461, term461.getClass(), "parent", null);
        setField(term459, term459.getClass(), "next", term461);
        setField(term459, term459.getClass(), "first", term461);
        setIntField(term473, term473.getClass(), "type", -615654495);
        setField(term473, term473.getClass(), "next", term469);
        setField(term473, term473.getClass(), "first", term466);
        setField(term473, term473.getClass(), "last", term466);
        setField(term473, term473.getClass(), "propListHead", null);
        setIntField(term473, term473.getClass(), "sourcePosition", 0);
        setField(term473, term473.getClass(), "jsType", null);
        setField(term473, term473.getClass(), "parent", null);
        setField(term459, term459.getClass(), "last", term473);
        setField(term459, term459.getClass(), "propListHead", null);
        setIntField(term459, term459.getClass(), "sourcePosition", 0);
        setField(term459, term459.getClass(), "jsType", null);
        setField(term459, term459.getClass(), "parent", null);
        setField(term457, term457.getClass(), "next", term459);
        setField(term457, term457.getClass(), "first", term466);
        setIntField(term477, term477.getClass(), "type", 0);
        setField(term477, term477.getClass(), "next", null);
        setField(term477, term477.getClass(), "first", null);
        setField(term477, term477.getClass(), "last", null);
        setField(term477, term477.getClass(), "propListHead", null);
        setIntField(term477, term477.getClass(), "sourcePosition", 0);
        setField(term477, term477.getClass(), "jsType", null);
        setField(term477, term477.getClass(), "parent", null);
        setField(term457, term457.getClass(), "last", term477);
        setField(term457, term457.getClass(), "propListHead", null);
        setIntField(term457, term457.getClass(), "sourcePosition", 0);
        setField(term457, term457.getClass(), "jsType", null);
        setField(term457, term457.getClass(), "parent", null);
        setField(term456, term456.getClass(), "parameters", term457);
        setField(term456, term456.getClass(), "returnType", null);
        setBooleanField(term456, term456.getClass(), "returnTypeInferred", false);
        setBooleanField(term456, term456.getClass(), "resolved", false);
        setField(term456, term456.getClass(), "resolveResult", null);
        setBooleanField(term456, term456.getClass(), "inTemplatedCheckVisit", false);
        setField(term456, term456.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "testForEquality", argTypes, term456, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


