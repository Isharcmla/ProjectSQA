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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_getNearestFunctionName_464802151166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196;

    public NodeUtil_getNearestFunctionName_464802151166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term196, term196.getClass(), "type", 335112684);
        setIntField(term198, term198.getClass(), "type", 1375330971);
        setIntField(term200, term200.getClass(), "type", 0);
        setField(term200, term200.getClass(), "next", null);
        setField(term200, term200.getClass(), "first", null);
        setField(term200, term200.getClass(), "last", null);
        setField(term200, term200.getClass(), "propListHead", null);
        setIntField(term200, term200.getClass(), "sourcePosition", 0);
        setField(term200, term200.getClass(), "jsType", null);
        setField(term200, term200.getClass(), "parent", null);
        setField(term198, term198.getClass(), "next", term200);
        setIntField(term203, term203.getClass(), "type", 0);
        setField(term203, term203.getClass(), "next", null);
        setField(term203, term203.getClass(), "first", null);
        setField(term203, term203.getClass(), "last", null);
        setField(term203, term203.getClass(), "propListHead", null);
        setIntField(term203, term203.getClass(), "sourcePosition", 0);
        setField(term203, term203.getClass(), "jsType", null);
        setField(term203, term203.getClass(), "parent", null);
        setField(term198, term198.getClass(), "first", term203);
        setIntField(term206, term206.getClass(), "type", 0);
        setField(term206, term206.getClass(), "next", null);
        setField(term206, term206.getClass(), "first", null);
        setField(term206, term206.getClass(), "last", null);
        setField(term206, term206.getClass(), "propListHead", null);
        setIntField(term206, term206.getClass(), "sourcePosition", 0);
        setField(term206, term206.getClass(), "jsType", null);
        setField(term206, term206.getClass(), "parent", null);
        setField(term198, term198.getClass(), "last", term206);
        setField(term198, term198.getClass(), "propListHead", null);
        setIntField(term198, term198.getClass(), "sourcePosition", 0);
        setField(term198, term198.getClass(), "jsType", null);
        setField(term198, term198.getClass(), "parent", null);
        setField(term196, term196.getClass(), "next", term198);
        setIntField(term210, term210.getClass(), "type", 0);
        setField(term210, term210.getClass(), "next", null);
        setField(term210, term210.getClass(), "first", null);
        setField(term210, term210.getClass(), "last", null);
        setField(term210, term210.getClass(), "propListHead", null);
        setIntField(term210, term210.getClass(), "sourcePosition", 0);
        setField(term210, term210.getClass(), "jsType", null);
        setField(term210, term210.getClass(), "parent", null);
        setField(term196, term196.getClass(), "first", term210);
        setIntField(term213, term213.getClass(), "type", 0);
        setField(term213, term213.getClass(), "next", null);
        setField(term213, term213.getClass(), "first", null);
        setField(term213, term213.getClass(), "last", null);
        setField(term213, term213.getClass(), "propListHead", null);
        setIntField(term213, term213.getClass(), "sourcePosition", 0);
        setField(term213, term213.getClass(), "jsType", null);
        setField(term213, term213.getClass(), "parent", null);
        setField(term196, term196.getClass(), "last", term213);
        setField(term196, term196.getClass(), "propListHead", null);
        setIntField(term196, term196.getClass(), "sourcePosition", 0);
        setField(term196, term196.getClass(), "jsType", null);
        setField(term196, term196.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term196;
        try {
            callMethod(klass, "getNearestFunctionName", argTypes, null, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


