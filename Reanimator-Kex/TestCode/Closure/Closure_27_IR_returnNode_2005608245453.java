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

public class IR_returnNode_2005608245453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65272;
     Object term65876;
     Object term65800;

    public IR_returnNode_2005608245453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term65272, term65272.getClass(), "type", 85);
        term65876 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term65876, term65876.getClass(), "type", 85);
        setField(term65876, term65876.getClass(), "next", null);
        setField(term65876, term65876.getClass(), "first", null);
        setField(term65876, term65876.getClass(), "last", null);
        setField(term65876, term65876.getClass(), "propListHead", null);
        setIntField(term65876, term65876.getClass(), "sourcePosition", 0);
        setField(term65876, term65876.getClass(), "jsType", null);
        setIntField(term65877, term65877.getClass(), "type", 4);
        setField(term65877, term65877.getClass(), "next", null);
        setField(term65877, term65877.getClass(), "first", term65876);
        setField(term65877, term65877.getClass(), "last", term65876);
        setField(term65877, term65877.getClass(), "propListHead", null);
        setIntField(term65877, term65877.getClass(), "sourcePosition", -1);
        setField(term65877, term65877.getClass(), "jsType", null);
        setField(term65877, term65877.getClass(), "parent", null);
        setField(term65876, term65876.getClass(), "parent", term65877);
        term65800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term65800, term65800.getClass(), "type", 4);
        setField(term65800, term65800.getClass(), "next", null);
        setIntField(term65797, term65797.getClass(), "type", 85);
        setField(term65797, term65797.getClass(), "next", null);
        setField(term65797, term65797.getClass(), "first", null);
        setField(term65797, term65797.getClass(), "last", null);
        setField(term65797, term65797.getClass(), "propListHead", null);
        setIntField(term65797, term65797.getClass(), "sourcePosition", 0);
        setField(term65797, term65797.getClass(), "jsType", null);
        setField(term65797, term65797.getClass(), "parent", term65800);
        setField(term65800, term65800.getClass(), "first", term65797);
        setField(term65800, term65800.getClass(), "last", term65797);
        setField(term65800, term65800.getClass(), "propListHead", null);
        setIntField(term65800, term65800.getClass(), "sourcePosition", -1);
        setField(term65800, term65800.getClass(), "jsType", null);
        setField(term65800, term65800.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term65272;
        Object retValue = callMethod(klass, "returnNode", argTypes, null, args);
        assertTrue(recursiveEquals(term65272, term65876));
        assertTrue(recursiveEquals(retValue, term65800));
    }

};


