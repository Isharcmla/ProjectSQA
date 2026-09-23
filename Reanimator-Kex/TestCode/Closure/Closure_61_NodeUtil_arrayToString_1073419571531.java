package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class NodeUtil_arrayToString_1073419571531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57044;
     Object term57146;

    public NodeUtil_arrayToString_1073419571531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57114, term57114.getClass(), "type", 124);
        setField(term57044, term57044.getClass(), "first", term57114);
        term57146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57146, term57146.getClass(), "type", 0);
        setField(term57146, term57146.getClass(), "next", null);
        setIntField(term57147, term57147.getClass(), "type", 124);
        setField(term57147, term57147.getClass(), "next", null);
        setField(term57147, term57147.getClass(), "first", null);
        setField(term57147, term57147.getClass(), "last", null);
        setField(term57147, term57147.getClass(), "propListHead", null);
        setIntField(term57147, term57147.getClass(), "sourcePosition", 0);
        setField(term57147, term57147.getClass(), "jsType", null);
        setField(term57147, term57147.getClass(), "parent", null);
        setField(term57146, term57146.getClass(), "first", term57147);
        setField(term57146, term57146.getClass(), "last", null);
        setField(term57146, term57146.getClass(), "propListHead", null);
        setIntField(term57146, term57146.getClass(), "sourcePosition", 0);
        setField(term57146, term57146.getClass(), "jsType", null);
        setField(term57146, term57146.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term57044;
        Object retValue = callMethod(klass, "arrayToString", argTypes, null, args);
        assertTrue(recursiveEquals(term57044, term57146));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


