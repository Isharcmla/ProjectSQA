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

public class Node_setJSDocInfo_141717196570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48179;
     Object term48472;
     Object term48462;

    public Node_setJSDocInfo_141717196570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48281 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term48179, term48179.getClass(), "propListHead", term48281);
        term48472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48473 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setIntField(term48472, term48472.getClass(), "type", 0);
        setField(term48472, term48472.getClass(), "next", null);
        setField(term48472, term48472.getClass(), "first", null);
        setField(term48472, term48472.getClass(), "last", null);
        setIntField(term48473, term48473.getClass(), "intValue", 0);
        setField(term48473, term48473.getClass(), "next", null);
        setIntField(term48473, term48473.getClass(), "propType", 0);
        setField(term48472, term48472.getClass(), "propListHead", term48473);
        setIntField(term48472, term48472.getClass(), "sourcePosition", 0);
        setField(term48472, term48472.getClass(), "jsType", null);
        setField(term48472, term48472.getClass(), "parent", null);
        term48462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48464 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setIntField(term48462, term48462.getClass(), "type", 0);
        setField(term48462, term48462.getClass(), "next", null);
        setField(term48462, term48462.getClass(), "first", null);
        setField(term48462, term48462.getClass(), "last", null);
        setIntField(term48464, term48464.getClass(), "intValue", 0);
        setField(term48464, term48464.getClass(), "next", null);
        setIntField(term48464, term48464.getClass(), "propType", 0);
        setField(term48462, term48462.getClass(), "propListHead", term48464);
        setIntField(term48462, term48462.getClass(), "sourcePosition", 0);
        setField(term48462, term48462.getClass(), "jsType", null);
        setField(term48462, term48462.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "setJSDocInfo", argTypes, term48179, args);
        assertTrue(recursiveEquals(term48179, term48472));
        assertTrue(recursiveEquals(retValue, term48462));
    }

};


