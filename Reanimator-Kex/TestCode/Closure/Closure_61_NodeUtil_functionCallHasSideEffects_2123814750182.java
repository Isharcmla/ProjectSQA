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
import java.lang.Object;

public class NodeUtil_functionCallHasSideEffects_2123814750182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term541;

    public NodeUtil_functionCallHasSideEffects_2123814750182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term541 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term543 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term558 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term541, term541.getClass(), "type", -1747406163);
        setIntField(term543, term543.getClass(), "type", 1270666529);
        setIntField(term545, term545.getClass(), "type", 0);
        setField(term545, term545.getClass(), "next", null);
        setField(term545, term545.getClass(), "first", null);
        setField(term545, term545.getClass(), "last", null);
        setField(term545, term545.getClass(), "propListHead", null);
        setIntField(term545, term545.getClass(), "sourcePosition", 0);
        setField(term545, term545.getClass(), "jsType", null);
        setField(term545, term545.getClass(), "parent", null);
        setField(term543, term543.getClass(), "next", term545);
        setIntField(term548, term548.getClass(), "type", 0);
        setField(term548, term548.getClass(), "next", null);
        setField(term548, term548.getClass(), "first", null);
        setField(term548, term548.getClass(), "last", null);
        setField(term548, term548.getClass(), "propListHead", null);
        setIntField(term548, term548.getClass(), "sourcePosition", 0);
        setField(term548, term548.getClass(), "jsType", null);
        setField(term548, term548.getClass(), "parent", null);
        setField(term543, term543.getClass(), "first", term548);
        setIntField(term551, term551.getClass(), "type", 0);
        setField(term551, term551.getClass(), "next", null);
        setField(term551, term551.getClass(), "first", null);
        setField(term551, term551.getClass(), "last", null);
        setField(term551, term551.getClass(), "propListHead", null);
        setIntField(term551, term551.getClass(), "sourcePosition", 0);
        setField(term551, term551.getClass(), "jsType", null);
        setField(term551, term551.getClass(), "parent", null);
        setField(term543, term543.getClass(), "last", term551);
        setField(term543, term543.getClass(), "propListHead", null);
        setIntField(term543, term543.getClass(), "sourcePosition", 0);
        setField(term543, term543.getClass(), "jsType", null);
        setField(term543, term543.getClass(), "parent", null);
        setField(term541, term541.getClass(), "next", term543);
        setIntField(term555, term555.getClass(), "type", 0);
        setField(term555, term555.getClass(), "next", null);
        setField(term555, term555.getClass(), "first", null);
        setField(term555, term555.getClass(), "last", null);
        setField(term555, term555.getClass(), "propListHead", null);
        setIntField(term555, term555.getClass(), "sourcePosition", 0);
        setField(term555, term555.getClass(), "jsType", null);
        setField(term555, term555.getClass(), "parent", null);
        setField(term541, term541.getClass(), "first", term555);
        setIntField(term558, term558.getClass(), "type", 0);
        setField(term558, term558.getClass(), "next", null);
        setField(term558, term558.getClass(), "first", null);
        setField(term558, term558.getClass(), "last", null);
        setField(term558, term558.getClass(), "propListHead", null);
        setIntField(term558, term558.getClass(), "sourcePosition", 0);
        setField(term558, term558.getClass(), "jsType", null);
        setField(term558, term558.getClass(), "parent", null);
        setField(term541, term541.getClass(), "last", term558);
        setField(term541, term541.getClass(), "propListHead", null);
        setIntField(term541, term541.getClass(), "sourcePosition", 0);
        setField(term541, term541.getClass(), "jsType", null);
        setField(term541, term541.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term541;
        args[1] = null;
        try {
            callMethod(klass, "functionCallHasSideEffects", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


