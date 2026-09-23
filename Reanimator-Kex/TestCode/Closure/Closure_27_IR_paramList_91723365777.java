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
import java.util.LinkedList;
import java.lang.Object;

public class IR_paramList_91723365777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137;

    public IR_paramList_91723365777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term156 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term140, term140.getClass(), "type", 1632125673);
        setIntField(term142, term142.getClass(), "type", 454281060);
        setIntField(term144, term144.getClass(), "type", -1786399638);
        setField(term144, term144.getClass(), "next", null);
        setField(term144, term144.getClass(), "first", null);
        setField(term144, term144.getClass(), "last", null);
        setField(term144, term144.getClass(), "propListHead", null);
        setIntField(term144, term144.getClass(), "sourcePosition", 0);
        setField(term144, term144.getClass(), "jsType", null);
        setField(term144, term144.getClass(), "parent", null);
        setField(term142, term142.getClass(), "next", term144);
        setIntField(term147, term147.getClass(), "type", 1328271830);
        setField(term147, term147.getClass(), "next", null);
        setField(term147, term147.getClass(), "first", null);
        setField(term147, term147.getClass(), "last", term140);
        setField(term147, term147.getClass(), "propListHead", null);
        setIntField(term147, term147.getClass(), "sourcePosition", 0);
        setField(term147, term147.getClass(), "jsType", null);
        setField(term147, term147.getClass(), "parent", null);
        setField(term142, term142.getClass(), "first", term147);
        setField(term142, term142.getClass(), "last", term147);
        setField(term142, term142.getClass(), "propListHead", null);
        setIntField(term142, term142.getClass(), "sourcePosition", 0);
        setField(term142, term142.getClass(), "jsType", null);
        setField(term142, term142.getClass(), "parent", null);
        setField(term140, term140.getClass(), "next", term142);
        setIntField(term151, term151.getClass(), "type", 2055867847);
        setIntField(term153, term153.getClass(), "type", -1048298087);
        setField(term153, term153.getClass(), "next", null);
        setField(term153, term153.getClass(), "first", term147);
        setField(term153, term153.getClass(), "last", null);
        setField(term153, term153.getClass(), "propListHead", null);
        setIntField(term153, term153.getClass(), "sourcePosition", 0);
        setField(term153, term153.getClass(), "jsType", null);
        setField(term153, term153.getClass(), "parent", null);
        setField(term151, term151.getClass(), "next", term153);
        setIntField(term156, term156.getClass(), "type", 292681826);
        setField(term156, term156.getClass(), "next", null);
        setField(term156, term156.getClass(), "first", null);
        setField(term156, term156.getClass(), "last", term153);
        setField(term156, term156.getClass(), "propListHead", null);
        setIntField(term156, term156.getClass(), "sourcePosition", 0);
        setField(term156, term156.getClass(), "jsType", null);
        setField(term156, term156.getClass(), "parent", null);
        setField(term151, term151.getClass(), "first", term156);
        setField(term151, term151.getClass(), "last", term144);
        setField(term151, term151.getClass(), "propListHead", null);
        setIntField(term151, term151.getClass(), "sourcePosition", 0);
        setField(term151, term151.getClass(), "jsType", null);
        setField(term151, term151.getClass(), "parent", null);
        setField(term140, term140.getClass(), "first", term151);
        setField(term140, term140.getClass(), "last", term153);
        setField(term140, term140.getClass(), "propListHead", null);
        setIntField(term140, term140.getClass(), "sourcePosition", 0);
        setField(term140, term140.getClass(), "jsType", null);
        setField(term140, term140.getClass(), "parent", null);
        term137 = new LinkedList();
        ((LinkedList) term137).add(term140);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term137;
        try {
            callMethod(klass, "paramList", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


