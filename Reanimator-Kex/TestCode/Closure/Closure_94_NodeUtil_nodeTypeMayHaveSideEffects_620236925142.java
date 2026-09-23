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

public class NodeUtil_nodeTypeMayHaveSideEffects_620236925142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term597;
     Object term7397;

    public NodeUtil_nodeTypeMayHaveSideEffects_620236925142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term610 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term620 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term597, term597.getClass(), "type", -420030135);
        setIntField(term599, term599.getClass(), "type", -525257914);
        setIntField(term601, term601.getClass(), "type", 0);
        setField(term601, term601.getClass(), "next", null);
        setField(term601, term601.getClass(), "first", null);
        setField(term601, term601.getClass(), "last", null);
        setField(term601, term601.getClass(), "propListHead", null);
        setIntField(term601, term601.getClass(), "sourcePosition", 0);
        setField(term601, term601.getClass(), "jsType", null);
        setField(term601, term601.getClass(), "parent", null);
        setField(term599, term599.getClass(), "next", term601);
        setIntField(term604, term604.getClass(), "type", 0);
        setField(term604, term604.getClass(), "next", null);
        setField(term604, term604.getClass(), "first", null);
        setField(term604, term604.getClass(), "last", null);
        setField(term604, term604.getClass(), "propListHead", null);
        setIntField(term604, term604.getClass(), "sourcePosition", 0);
        setField(term604, term604.getClass(), "jsType", null);
        setField(term604, term604.getClass(), "parent", null);
        setField(term599, term599.getClass(), "first", term604);
        setIntField(term607, term607.getClass(), "type", 0);
        setField(term607, term607.getClass(), "next", null);
        setField(term607, term607.getClass(), "first", null);
        setField(term607, term607.getClass(), "last", null);
        setField(term607, term607.getClass(), "propListHead", null);
        setIntField(term607, term607.getClass(), "sourcePosition", 0);
        setField(term607, term607.getClass(), "jsType", null);
        setField(term607, term607.getClass(), "parent", null);
        setField(term599, term599.getClass(), "last", term607);
        setField(term610, term610.getClass(), "next", null);
        setIntField(term610, term610.getClass(), "type", 0);
        setIntField(term610, term610.getClass(), "intValue", 0);
        setField(term610, term610.getClass(), "objectValue", null);
        setField(term599, term599.getClass(), "propListHead", term610);
        setIntField(term599, term599.getClass(), "sourcePosition", 2058711405);
        setField(term599, term599.getClass(), "jsType", null);
        setField(term599, term599.getClass(), "parent", null);
        setField(term597, term597.getClass(), "next", term599);
        setIntField(term614, term614.getClass(), "type", 0);
        setField(term614, term614.getClass(), "next", null);
        setField(term614, term614.getClass(), "first", null);
        setField(term614, term614.getClass(), "last", null);
        setField(term614, term614.getClass(), "propListHead", null);
        setIntField(term614, term614.getClass(), "sourcePosition", 0);
        setField(term614, term614.getClass(), "jsType", null);
        setField(term614, term614.getClass(), "parent", null);
        setField(term597, term597.getClass(), "first", term614);
        setIntField(term617, term617.getClass(), "type", 0);
        setField(term617, term617.getClass(), "next", null);
        setField(term617, term617.getClass(), "first", null);
        setField(term617, term617.getClass(), "last", null);
        setField(term617, term617.getClass(), "propListHead", null);
        setIntField(term617, term617.getClass(), "sourcePosition", 0);
        setField(term617, term617.getClass(), "jsType", null);
        setField(term617, term617.getClass(), "parent", null);
        setField(term597, term597.getClass(), "last", term617);
        setField(term620, term620.getClass(), "next", null);
        setIntField(term620, term620.getClass(), "type", 0);
        setIntField(term620, term620.getClass(), "intValue", 0);
        setField(term620, term620.getClass(), "objectValue", null);
        setField(term597, term597.getClass(), "propListHead", term620);
        setIntField(term597, term597.getClass(), "sourcePosition", 1743683601);
        setField(term597, term597.getClass(), "jsType", null);
        setField(term597, term597.getClass(), "parent", null);
        term7397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7402 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7405 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7397, term7397.getClass(), "type", -420030135);
        setIntField(term7398, term7398.getClass(), "type", -525257914);
        setIntField(term7399, term7399.getClass(), "type", 0);
        setField(term7399, term7399.getClass(), "next", null);
        setField(term7399, term7399.getClass(), "first", null);
        setField(term7399, term7399.getClass(), "last", null);
        setField(term7399, term7399.getClass(), "propListHead", null);
        setIntField(term7399, term7399.getClass(), "sourcePosition", 0);
        setField(term7399, term7399.getClass(), "jsType", null);
        setField(term7399, term7399.getClass(), "parent", null);
        setField(term7398, term7398.getClass(), "next", term7399);
        setIntField(term7400, term7400.getClass(), "type", 0);
        setField(term7400, term7400.getClass(), "next", null);
        setField(term7400, term7400.getClass(), "first", null);
        setField(term7400, term7400.getClass(), "last", null);
        setField(term7400, term7400.getClass(), "propListHead", null);
        setIntField(term7400, term7400.getClass(), "sourcePosition", 0);
        setField(term7400, term7400.getClass(), "jsType", null);
        setField(term7400, term7400.getClass(), "parent", null);
        setField(term7398, term7398.getClass(), "first", term7400);
        setIntField(term7401, term7401.getClass(), "type", 0);
        setField(term7401, term7401.getClass(), "next", null);
        setField(term7401, term7401.getClass(), "first", null);
        setField(term7401, term7401.getClass(), "last", null);
        setField(term7401, term7401.getClass(), "propListHead", null);
        setIntField(term7401, term7401.getClass(), "sourcePosition", 0);
        setField(term7401, term7401.getClass(), "jsType", null);
        setField(term7401, term7401.getClass(), "parent", null);
        setField(term7398, term7398.getClass(), "last", term7401);
        setField(term7402, term7402.getClass(), "next", null);
        setIntField(term7402, term7402.getClass(), "type", 0);
        setIntField(term7402, term7402.getClass(), "intValue", 0);
        setField(term7402, term7402.getClass(), "objectValue", null);
        setField(term7398, term7398.getClass(), "propListHead", term7402);
        setIntField(term7398, term7398.getClass(), "sourcePosition", 2058711405);
        setField(term7398, term7398.getClass(), "jsType", null);
        setField(term7398, term7398.getClass(), "parent", null);
        setField(term7397, term7397.getClass(), "next", term7398);
        setIntField(term7403, term7403.getClass(), "type", 0);
        setField(term7403, term7403.getClass(), "next", null);
        setField(term7403, term7403.getClass(), "first", null);
        setField(term7403, term7403.getClass(), "last", null);
        setField(term7403, term7403.getClass(), "propListHead", null);
        setIntField(term7403, term7403.getClass(), "sourcePosition", 0);
        setField(term7403, term7403.getClass(), "jsType", null);
        setField(term7403, term7403.getClass(), "parent", null);
        setField(term7397, term7397.getClass(), "first", term7403);
        setIntField(term7404, term7404.getClass(), "type", 0);
        setField(term7404, term7404.getClass(), "next", null);
        setField(term7404, term7404.getClass(), "first", null);
        setField(term7404, term7404.getClass(), "last", null);
        setField(term7404, term7404.getClass(), "propListHead", null);
        setIntField(term7404, term7404.getClass(), "sourcePosition", 0);
        setField(term7404, term7404.getClass(), "jsType", null);
        setField(term7404, term7404.getClass(), "parent", null);
        setField(term7397, term7397.getClass(), "last", term7404);
        setField(term7405, term7405.getClass(), "next", null);
        setIntField(term7405, term7405.getClass(), "type", 0);
        setIntField(term7405, term7405.getClass(), "intValue", 0);
        setField(term7405, term7405.getClass(), "objectValue", null);
        setField(term7397, term7397.getClass(), "propListHead", term7405);
        setIntField(term7397, term7397.getClass(), "sourcePosition", 1743683601);
        setField(term7397, term7397.getClass(), "jsType", null);
        setField(term7397, term7397.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term597;
        callMethod(klass, "nodeTypeMayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term597, term7397));
    }

};


