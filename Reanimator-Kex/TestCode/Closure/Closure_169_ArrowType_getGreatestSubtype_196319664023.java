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

public class ArrowType_getGreatestSubtype_196319664023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term428;

    public ArrowType_getGreatestSubtype_196319664023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term428 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term429, term429.getClass(), "type", 444029505);
        setIntField(term431, term431.getClass(), "type", -1034506028);
        setIntField(term433, term433.getClass(), "type", -1263114719);
        setIntField(term435, term435.getClass(), "type", -894662986);
        setField(term435, term435.getClass(), "next", null);
        setField(term435, term435.getClass(), "first", null);
        setField(term435, term435.getClass(), "last", null);
        setField(term435, term435.getClass(), "propListHead", null);
        setIntField(term435, term435.getClass(), "sourcePosition", 0);
        setField(term435, term435.getClass(), "jsType", null);
        setField(term435, term435.getClass(), "parent", null);
        setField(term433, term433.getClass(), "next", term435);
        setIntField(term438, term438.getClass(), "type", 683666002);
        setField(term438, term438.getClass(), "next", null);
        setField(term438, term438.getClass(), "first", term429);
        setField(term438, term438.getClass(), "last", null);
        setField(term438, term438.getClass(), "propListHead", null);
        setIntField(term438, term438.getClass(), "sourcePosition", 0);
        setField(term438, term438.getClass(), "jsType", null);
        setField(term438, term438.getClass(), "parent", null);
        setField(term433, term433.getClass(), "first", term438);
        setIntField(term441, term441.getClass(), "type", -1347665717);
        setField(term441, term441.getClass(), "next", null);
        setField(term441, term441.getClass(), "first", term431);
        setField(term441, term441.getClass(), "last", null);
        setField(term441, term441.getClass(), "propListHead", null);
        setIntField(term441, term441.getClass(), "sourcePosition", 0);
        setField(term441, term441.getClass(), "jsType", null);
        setField(term441, term441.getClass(), "parent", null);
        setField(term433, term433.getClass(), "last", term441);
        setField(term433, term433.getClass(), "propListHead", null);
        setIntField(term433, term433.getClass(), "sourcePosition", 0);
        setField(term433, term433.getClass(), "jsType", null);
        setField(term433, term433.getClass(), "parent", null);
        setField(term431, term431.getClass(), "next", term433);
        setField(term431, term431.getClass(), "first", term433);
        setIntField(term445, term445.getClass(), "type", 304775596);
        setField(term445, term445.getClass(), "next", term441);
        setField(term445, term445.getClass(), "first", term438);
        setField(term445, term445.getClass(), "last", term438);
        setField(term445, term445.getClass(), "propListHead", null);
        setIntField(term445, term445.getClass(), "sourcePosition", 0);
        setField(term445, term445.getClass(), "jsType", null);
        setField(term445, term445.getClass(), "parent", null);
        setField(term431, term431.getClass(), "last", term445);
        setField(term431, term431.getClass(), "propListHead", null);
        setIntField(term431, term431.getClass(), "sourcePosition", 0);
        setField(term431, term431.getClass(), "jsType", null);
        setField(term431, term431.getClass(), "parent", null);
        setField(term429, term429.getClass(), "next", term431);
        setField(term429, term429.getClass(), "first", term438);
        setIntField(term449, term449.getClass(), "type", 0);
        setField(term449, term449.getClass(), "next", null);
        setField(term449, term449.getClass(), "first", null);
        setField(term449, term449.getClass(), "last", null);
        setField(term449, term449.getClass(), "propListHead", null);
        setIntField(term449, term449.getClass(), "sourcePosition", 0);
        setField(term449, term449.getClass(), "jsType", null);
        setField(term449, term449.getClass(), "parent", null);
        setField(term429, term429.getClass(), "last", term449);
        setField(term429, term429.getClass(), "propListHead", null);
        setIntField(term429, term429.getClass(), "sourcePosition", 0);
        setField(term429, term429.getClass(), "jsType", null);
        setField(term429, term429.getClass(), "parent", null);
        setField(term428, term428.getClass(), "parameters", term429);
        setField(term428, term428.getClass(), "returnType", null);
        setBooleanField(term428, term428.getClass(), "returnTypeInferred", false);
        setBooleanField(term428, term428.getClass(), "resolved", false);
        setField(term428, term428.getClass(), "resolveResult", null);
        setBooleanField(term428, term428.getClass(), "inTemplatedCheckVisit", false);
        setField(term428, term428.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term428, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


