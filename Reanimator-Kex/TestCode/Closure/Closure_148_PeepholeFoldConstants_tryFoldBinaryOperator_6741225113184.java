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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term944804;
     Object term944896;
     Object term945437;
     Object term945438;
     Object term945368;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term944804 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term944896 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term944988 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term945080 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term945172 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term945080, term945080.getClass(), "type", 44);
        setField(term944988, term944988.getClass(), "next", term945080);
        setIntField(term944988, term944988.getClass(), "type", 0);
        setField(term944896, term944896.getClass(), "first", term944988);
        setIntField(term944896, term944896.getClass(), "type", 101);
        setIntField(term945172, term945172.getClass(), "type", 98);
        setField(term944896, term944896.getClass(), "parent", term945172);
        term945437 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term945437, term945437.getClass(), "currentTraversal", null);
        term945438 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term945439 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term945440 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term945441 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term945438, term945438.getClass(), "str", null);
        setIntField(term945438, term945438.getClass(), "type", 101);
        setField(term945438, term945438.getClass(), "next", null);
        setField(term945439, term945439.getClass(), "str", null);
        setIntField(term945439, term945439.getClass(), "type", 0);
        setField(term945440, term945440.getClass(), "str", null);
        setIntField(term945440, term945440.getClass(), "type", 44);
        setField(term945440, term945440.getClass(), "next", null);
        setField(term945440, term945440.getClass(), "first", null);
        setField(term945440, term945440.getClass(), "last", null);
        setField(term945440, term945440.getClass(), "propListHead", null);
        setIntField(term945440, term945440.getClass(), "sourcePosition", 0);
        setField(term945440, term945440.getClass(), "jsType", null);
        setField(term945440, term945440.getClass(), "parent", null);
        setField(term945439, term945439.getClass(), "next", term945440);
        setField(term945439, term945439.getClass(), "first", null);
        setField(term945439, term945439.getClass(), "last", null);
        setField(term945439, term945439.getClass(), "propListHead", null);
        setIntField(term945439, term945439.getClass(), "sourcePosition", 0);
        setField(term945439, term945439.getClass(), "jsType", null);
        setField(term945439, term945439.getClass(), "parent", null);
        setField(term945438, term945438.getClass(), "first", term945439);
        setField(term945438, term945438.getClass(), "last", null);
        setField(term945438, term945438.getClass(), "propListHead", null);
        setIntField(term945438, term945438.getClass(), "sourcePosition", 0);
        setField(term945438, term945438.getClass(), "jsType", null);
        setField(term945441, term945441.getClass(), "str", null);
        setIntField(term945441, term945441.getClass(), "type", 98);
        setField(term945441, term945441.getClass(), "next", null);
        setField(term945441, term945441.getClass(), "first", null);
        setField(term945441, term945441.getClass(), "last", null);
        setField(term945441, term945441.getClass(), "propListHead", null);
        setIntField(term945441, term945441.getClass(), "sourcePosition", 0);
        setField(term945441, term945441.getClass(), "jsType", null);
        setField(term945441, term945441.getClass(), "parent", null);
        setField(term945438, term945438.getClass(), "parent", term945441);
        term945368 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term945370 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term945372 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term945377 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term945368, term945368.getClass(), "str", null);
        setIntField(term945368, term945368.getClass(), "type", 101);
        setField(term945368, term945368.getClass(), "next", null);
        setField(term945370, term945370.getClass(), "str", null);
        setIntField(term945370, term945370.getClass(), "type", 0);
        setField(term945372, term945372.getClass(), "str", null);
        setIntField(term945372, term945372.getClass(), "type", 44);
        setField(term945372, term945372.getClass(), "next", null);
        setField(term945372, term945372.getClass(), "first", null);
        setField(term945372, term945372.getClass(), "last", null);
        setField(term945372, term945372.getClass(), "propListHead", null);
        setIntField(term945372, term945372.getClass(), "sourcePosition", 0);
        setField(term945372, term945372.getClass(), "jsType", null);
        setField(term945372, term945372.getClass(), "parent", null);
        setField(term945370, term945370.getClass(), "next", term945372);
        setField(term945370, term945370.getClass(), "first", null);
        setField(term945370, term945370.getClass(), "last", null);
        setField(term945370, term945370.getClass(), "propListHead", null);
        setIntField(term945370, term945370.getClass(), "sourcePosition", 0);
        setField(term945370, term945370.getClass(), "jsType", null);
        setField(term945370, term945370.getClass(), "parent", null);
        setField(term945368, term945368.getClass(), "first", term945370);
        setField(term945368, term945368.getClass(), "last", null);
        setField(term945368, term945368.getClass(), "propListHead", null);
        setIntField(term945368, term945368.getClass(), "sourcePosition", 0);
        setField(term945368, term945368.getClass(), "jsType", null);
        setField(term945377, term945377.getClass(), "str", null);
        setIntField(term945377, term945377.getClass(), "type", 98);
        setField(term945377, term945377.getClass(), "next", null);
        setField(term945377, term945377.getClass(), "first", null);
        setField(term945377, term945377.getClass(), "last", null);
        setField(term945377, term945377.getClass(), "propListHead", null);
        setIntField(term945377, term945377.getClass(), "sourcePosition", 0);
        setField(term945377, term945377.getClass(), "jsType", null);
        setField(term945377, term945377.getClass(), "parent", null);
        setField(term945368, term945368.getClass(), "parent", term945377);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term944896;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term944804, args);
        assertTrue(recursiveEquals(term944804, term945437));
        assertTrue(recursiveEquals(term944896, term945438));
        assertTrue(recursiveEquals(retValue, term945368));
    }

};


