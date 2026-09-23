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

public class ArrowType_testForEquality_63022271322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term417;

    public ArrowType_testForEquality_63022271322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term417 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term430 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term418, term418.getClass(), "type", 444029505);
        setIntField(term420, term420.getClass(), "type", -1034506028);
        setIntField(term422, term422.getClass(), "type", -1263114719);
        setIntField(term424, term424.getClass(), "type", -894662986);
        setField(term424, term424.getClass(), "next", null);
        setField(term424, term424.getClass(), "first", null);
        setField(term424, term424.getClass(), "last", null);
        setField(term424, term424.getClass(), "propListHead", null);
        setIntField(term424, term424.getClass(), "sourcePosition", 0);
        setField(term424, term424.getClass(), "jsType", null);
        setField(term424, term424.getClass(), "parent", null);
        setField(term422, term422.getClass(), "next", term424);
        setIntField(term427, term427.getClass(), "type", 683666002);
        setField(term427, term427.getClass(), "next", null);
        setField(term427, term427.getClass(), "first", term418);
        setField(term427, term427.getClass(), "last", null);
        setField(term427, term427.getClass(), "propListHead", null);
        setIntField(term427, term427.getClass(), "sourcePosition", 0);
        setField(term427, term427.getClass(), "jsType", null);
        setField(term427, term427.getClass(), "parent", null);
        setField(term422, term422.getClass(), "first", term427);
        setIntField(term430, term430.getClass(), "type", -1347665717);
        setField(term430, term430.getClass(), "next", null);
        setField(term430, term430.getClass(), "first", term420);
        setField(term430, term430.getClass(), "last", null);
        setField(term430, term430.getClass(), "propListHead", null);
        setIntField(term430, term430.getClass(), "sourcePosition", 0);
        setField(term430, term430.getClass(), "jsType", null);
        setField(term430, term430.getClass(), "parent", null);
        setField(term422, term422.getClass(), "last", term430);
        setField(term422, term422.getClass(), "propListHead", null);
        setIntField(term422, term422.getClass(), "sourcePosition", 0);
        setField(term422, term422.getClass(), "jsType", null);
        setField(term422, term422.getClass(), "parent", null);
        setField(term420, term420.getClass(), "next", term422);
        setField(term420, term420.getClass(), "first", term422);
        setIntField(term434, term434.getClass(), "type", 304775596);
        setField(term434, term434.getClass(), "next", term430);
        setField(term434, term434.getClass(), "first", term427);
        setField(term434, term434.getClass(), "last", term427);
        setField(term434, term434.getClass(), "propListHead", null);
        setIntField(term434, term434.getClass(), "sourcePosition", 0);
        setField(term434, term434.getClass(), "jsType", null);
        setField(term434, term434.getClass(), "parent", null);
        setField(term420, term420.getClass(), "last", term434);
        setField(term420, term420.getClass(), "propListHead", null);
        setIntField(term420, term420.getClass(), "sourcePosition", 0);
        setField(term420, term420.getClass(), "jsType", null);
        setField(term420, term420.getClass(), "parent", null);
        setField(term418, term418.getClass(), "next", term420);
        setField(term418, term418.getClass(), "first", term427);
        setIntField(term438, term438.getClass(), "type", 0);
        setField(term438, term438.getClass(), "next", null);
        setField(term438, term438.getClass(), "first", null);
        setField(term438, term438.getClass(), "last", null);
        setField(term438, term438.getClass(), "propListHead", null);
        setIntField(term438, term438.getClass(), "sourcePosition", 0);
        setField(term438, term438.getClass(), "jsType", null);
        setField(term438, term438.getClass(), "parent", null);
        setField(term418, term418.getClass(), "last", term438);
        setField(term418, term418.getClass(), "propListHead", null);
        setIntField(term418, term418.getClass(), "sourcePosition", 0);
        setField(term418, term418.getClass(), "jsType", null);
        setField(term418, term418.getClass(), "parent", null);
        setField(term417, term417.getClass(), "parameters", term418);
        setField(term417, term417.getClass(), "returnType", null);
        setBooleanField(term417, term417.getClass(), "returnTypeInferred", false);
        setBooleanField(term417, term417.getClass(), "resolved", false);
        setField(term417, term417.getClass(), "resolveResult", null);
        setField(term417, term417.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "testForEquality", argTypes, term417, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


