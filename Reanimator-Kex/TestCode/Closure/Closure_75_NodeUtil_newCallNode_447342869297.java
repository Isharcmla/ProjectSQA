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

public class NodeUtil_newCallNode_447342869297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4268;
     Object term4295;

    public NodeUtil_newCallNode_447342869297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4281 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4291 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4268, term4268.getClass(), "type", -355574894);
        setIntField(term4270, term4270.getClass(), "type", 1238707613);
        setIntField(term4272, term4272.getClass(), "type", 0);
        setField(term4272, term4272.getClass(), "next", null);
        setField(term4272, term4272.getClass(), "first", null);
        setField(term4272, term4272.getClass(), "last", null);
        setField(term4272, term4272.getClass(), "propListHead", null);
        setIntField(term4272, term4272.getClass(), "sourcePosition", 0);
        setField(term4272, term4272.getClass(), "jsType", null);
        setField(term4272, term4272.getClass(), "parent", null);
        setField(term4270, term4270.getClass(), "next", term4272);
        setIntField(term4275, term4275.getClass(), "type", 0);
        setField(term4275, term4275.getClass(), "next", null);
        setField(term4275, term4275.getClass(), "first", null);
        setField(term4275, term4275.getClass(), "last", null);
        setField(term4275, term4275.getClass(), "propListHead", null);
        setIntField(term4275, term4275.getClass(), "sourcePosition", 0);
        setField(term4275, term4275.getClass(), "jsType", null);
        setField(term4275, term4275.getClass(), "parent", null);
        setField(term4270, term4270.getClass(), "first", term4275);
        setIntField(term4278, term4278.getClass(), "type", 0);
        setField(term4278, term4278.getClass(), "next", null);
        setField(term4278, term4278.getClass(), "first", null);
        setField(term4278, term4278.getClass(), "last", null);
        setField(term4278, term4278.getClass(), "propListHead", null);
        setIntField(term4278, term4278.getClass(), "sourcePosition", 0);
        setField(term4278, term4278.getClass(), "jsType", null);
        setField(term4278, term4278.getClass(), "parent", null);
        setField(term4270, term4270.getClass(), "last", term4278);
        setField(term4281, term4281.getClass(), "next", null);
        setIntField(term4281, term4281.getClass(), "type", 0);
        setIntField(term4281, term4281.getClass(), "intValue", 0);
        setField(term4281, term4281.getClass(), "objectValue", null);
        setField(term4270, term4270.getClass(), "propListHead", term4281);
        setIntField(term4270, term4270.getClass(), "sourcePosition", -1518971561);
        setField(term4270, term4270.getClass(), "jsType", null);
        setField(term4270, term4270.getClass(), "parent", null);
        setField(term4268, term4268.getClass(), "next", term4270);
        setIntField(term4285, term4285.getClass(), "type", 0);
        setField(term4285, term4285.getClass(), "next", null);
        setField(term4285, term4285.getClass(), "first", null);
        setField(term4285, term4285.getClass(), "last", null);
        setField(term4285, term4285.getClass(), "propListHead", null);
        setIntField(term4285, term4285.getClass(), "sourcePosition", 0);
        setField(term4285, term4285.getClass(), "jsType", null);
        setField(term4285, term4285.getClass(), "parent", null);
        setField(term4268, term4268.getClass(), "first", term4285);
        setIntField(term4288, term4288.getClass(), "type", 0);
        setField(term4288, term4288.getClass(), "next", null);
        setField(term4288, term4288.getClass(), "first", null);
        setField(term4288, term4288.getClass(), "last", null);
        setField(term4288, term4288.getClass(), "propListHead", null);
        setIntField(term4288, term4288.getClass(), "sourcePosition", 0);
        setField(term4288, term4288.getClass(), "jsType", null);
        setField(term4288, term4288.getClass(), "parent", null);
        setField(term4268, term4268.getClass(), "last", term4288);
        setField(term4291, term4291.getClass(), "next", null);
        setIntField(term4291, term4291.getClass(), "type", 0);
        setIntField(term4291, term4291.getClass(), "intValue", 0);
        setField(term4291, term4291.getClass(), "objectValue", null);
        setField(term4268, term4268.getClass(), "propListHead", term4291);
        setIntField(term4268, term4268.getClass(), "sourcePosition", 1513663171);
        setField(term4268, term4268.getClass(), "jsType", null);
        setField(term4268, term4268.getClass(), "parent", null);
        term4295 = (Object[]) newArray("com.google.javascript.rhino.Node", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.rhino.Node"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term4268;
        args[1] = term4295;
        try {
            callMethod(klass, "newCallNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


