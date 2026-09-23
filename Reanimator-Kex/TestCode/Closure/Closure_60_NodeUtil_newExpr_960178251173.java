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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_newExpr_960178251173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350;

    public NodeUtil_newExpr_960178251173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term350, term350.getClass(), "type", -1963464809);
        setIntField(term352, term352.getClass(), "type", -2063457669);
        setIntField(term354, term354.getClass(), "type", 0);
        setField(term354, term354.getClass(), "next", null);
        setField(term354, term354.getClass(), "first", null);
        setField(term354, term354.getClass(), "last", null);
        setField(term354, term354.getClass(), "propListHead", null);
        setIntField(term354, term354.getClass(), "sourcePosition", 0);
        setField(term354, term354.getClass(), "jsType", null);
        setField(term354, term354.getClass(), "parent", null);
        setField(term352, term352.getClass(), "next", term354);
        setIntField(term357, term357.getClass(), "type", 0);
        setField(term357, term357.getClass(), "next", null);
        setField(term357, term357.getClass(), "first", null);
        setField(term357, term357.getClass(), "last", null);
        setField(term357, term357.getClass(), "propListHead", null);
        setIntField(term357, term357.getClass(), "sourcePosition", 0);
        setField(term357, term357.getClass(), "jsType", null);
        setField(term357, term357.getClass(), "parent", null);
        setField(term352, term352.getClass(), "first", term357);
        setIntField(term360, term360.getClass(), "type", 0);
        setField(term360, term360.getClass(), "next", null);
        setField(term360, term360.getClass(), "first", null);
        setField(term360, term360.getClass(), "last", null);
        setField(term360, term360.getClass(), "propListHead", null);
        setIntField(term360, term360.getClass(), "sourcePosition", 0);
        setField(term360, term360.getClass(), "jsType", null);
        setField(term360, term360.getClass(), "parent", null);
        setField(term352, term352.getClass(), "last", term360);
        setField(term352, term352.getClass(), "propListHead", null);
        setIntField(term352, term352.getClass(), "sourcePosition", 0);
        setField(term352, term352.getClass(), "jsType", null);
        setField(term352, term352.getClass(), "parent", null);
        setField(term350, term350.getClass(), "next", term352);
        setIntField(term364, term364.getClass(), "type", 0);
        setField(term364, term364.getClass(), "next", null);
        setField(term364, term364.getClass(), "first", null);
        setField(term364, term364.getClass(), "last", null);
        setField(term364, term364.getClass(), "propListHead", null);
        setIntField(term364, term364.getClass(), "sourcePosition", 0);
        setField(term364, term364.getClass(), "jsType", null);
        setField(term364, term364.getClass(), "parent", null);
        setField(term350, term350.getClass(), "first", term364);
        setIntField(term367, term367.getClass(), "type", 0);
        setField(term367, term367.getClass(), "next", null);
        setField(term367, term367.getClass(), "first", null);
        setField(term367, term367.getClass(), "last", null);
        setField(term367, term367.getClass(), "propListHead", null);
        setIntField(term367, term367.getClass(), "sourcePosition", 0);
        setField(term367, term367.getClass(), "jsType", null);
        setField(term367, term367.getClass(), "parent", null);
        setField(term350, term350.getClass(), "last", term367);
        setField(term350, term350.getClass(), "propListHead", null);
        setIntField(term350, term350.getClass(), "sourcePosition", 0);
        setField(term350, term350.getClass(), "jsType", null);
        setField(term350, term350.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term350;
        try {
            callMethod(klass, "newExpr", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


