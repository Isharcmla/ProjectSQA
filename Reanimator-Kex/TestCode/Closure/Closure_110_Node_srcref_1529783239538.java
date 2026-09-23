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

public class Node_srcref_1529783239538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44032;
     Object term44204;
     Object term44240;
     Object term44242;
     Object term44218;

    public Node_srcref_1529783239538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44134 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term44032, term44032.getClass(), "propListHead", term44134);
        term44204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term44204, term44204.getClass(), "propListHead", null);
        term44240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44241 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setIntField(term44240, term44240.getClass(), "type", 0);
        setField(term44240, term44240.getClass(), "next", null);
        setField(term44240, term44240.getClass(), "first", null);
        setField(term44240, term44240.getClass(), "last", null);
        setIntField(term44241, term44241.getClass(), "intValue", 0);
        setField(term44241, term44241.getClass(), "next", null);
        setIntField(term44241, term44241.getClass(), "propType", 0);
        setField(term44240, term44240.getClass(), "propListHead", term44241);
        setIntField(term44240, term44240.getClass(), "sourcePosition", 0);
        setField(term44240, term44240.getClass(), "jsType", null);
        setField(term44240, term44240.getClass(), "parent", null);
        term44242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44242, term44242.getClass(), "type", 0);
        setField(term44242, term44242.getClass(), "next", null);
        setField(term44242, term44242.getClass(), "first", null);
        setField(term44242, term44242.getClass(), "last", null);
        setField(term44242, term44242.getClass(), "propListHead", null);
        setIntField(term44242, term44242.getClass(), "sourcePosition", 0);
        setField(term44242, term44242.getClass(), "jsType", null);
        setField(term44242, term44242.getClass(), "parent", null);
        term44218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44220 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setIntField(term44218, term44218.getClass(), "type", 0);
        setField(term44218, term44218.getClass(), "next", null);
        setField(term44218, term44218.getClass(), "first", null);
        setField(term44218, term44218.getClass(), "last", null);
        setIntField(term44220, term44220.getClass(), "intValue", 0);
        setField(term44220, term44220.getClass(), "next", null);
        setIntField(term44220, term44220.getClass(), "propType", 0);
        setField(term44218, term44218.getClass(), "propListHead", term44220);
        setIntField(term44218, term44218.getClass(), "sourcePosition", 0);
        setField(term44218, term44218.getClass(), "jsType", null);
        setField(term44218, term44218.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term44204;
        Object retValue = callMethod(klass, "srcref", argTypes, term44032, args);
        assertTrue(recursiveEquals(term44032, term44240));
        assertTrue(recursiveEquals(term44204, term44242));
        assertTrue(recursiveEquals(retValue, term44218));
    }

};


