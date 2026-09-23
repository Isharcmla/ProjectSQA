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

public class NodeUtil_referencesThis_2041162929437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34275;
     Object term34532;

    public NodeUtil_referencesThis_2041162929437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34275, term34275.getClass(), "type", 2);
        setIntField(term34345, term34345.getClass(), "type", 0);
        setField(term34345, term34345.getClass(), "first", null);
        setField(term34345, term34345.getClass(), "next", term34415);
        setField(term34275, term34275.getClass(), "first", term34345);
        term34532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34532, term34532.getClass(), "type", 2);
        setField(term34532, term34532.getClass(), "next", null);
        setIntField(term34533, term34533.getClass(), "type", 0);
        setIntField(term34534, term34534.getClass(), "type", 0);
        setField(term34534, term34534.getClass(), "next", null);
        setField(term34534, term34534.getClass(), "first", null);
        setField(term34534, term34534.getClass(), "last", null);
        setField(term34534, term34534.getClass(), "propListHead", null);
        setIntField(term34534, term34534.getClass(), "sourcePosition", 0);
        setField(term34534, term34534.getClass(), "jsType", null);
        setField(term34534, term34534.getClass(), "parent", null);
        setField(term34533, term34533.getClass(), "next", term34534);
        setField(term34533, term34533.getClass(), "first", null);
        setField(term34533, term34533.getClass(), "last", null);
        setField(term34533, term34533.getClass(), "propListHead", null);
        setIntField(term34533, term34533.getClass(), "sourcePosition", 0);
        setField(term34533, term34533.getClass(), "jsType", null);
        setField(term34533, term34533.getClass(), "parent", null);
        setField(term34532, term34532.getClass(), "first", term34533);
        setField(term34532, term34532.getClass(), "last", null);
        setField(term34532, term34532.getClass(), "propListHead", null);
        setIntField(term34532, term34532.getClass(), "sourcePosition", 0);
        setField(term34532, term34532.getClass(), "jsType", null);
        setField(term34532, term34532.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term34275;
        callMethod(klass, "referencesThis", argTypes, null, args);
        assertTrue(recursiveEquals(term34275, term34532));
    }

};


