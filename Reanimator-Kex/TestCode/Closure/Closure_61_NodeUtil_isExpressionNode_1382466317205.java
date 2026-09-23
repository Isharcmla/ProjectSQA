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

public class NodeUtil_isExpressionNode_1382466317205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term994;
     Object term10355;

    public NodeUtil_isExpressionNode_1382466317205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term996 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term994, term994.getClass(), "type", 510162332);
        setIntField(term996, term996.getClass(), "type", 752152965);
        setIntField(term998, term998.getClass(), "type", 0);
        setField(term998, term998.getClass(), "next", null);
        setField(term998, term998.getClass(), "first", null);
        setField(term998, term998.getClass(), "last", null);
        setField(term998, term998.getClass(), "propListHead", null);
        setIntField(term998, term998.getClass(), "sourcePosition", 0);
        setField(term998, term998.getClass(), "jsType", null);
        setField(term998, term998.getClass(), "parent", null);
        setField(term996, term996.getClass(), "next", term998);
        setIntField(term1001, term1001.getClass(), "type", 0);
        setField(term1001, term1001.getClass(), "next", null);
        setField(term1001, term1001.getClass(), "first", null);
        setField(term1001, term1001.getClass(), "last", null);
        setField(term1001, term1001.getClass(), "propListHead", null);
        setIntField(term1001, term1001.getClass(), "sourcePosition", 0);
        setField(term1001, term1001.getClass(), "jsType", null);
        setField(term1001, term1001.getClass(), "parent", null);
        setField(term996, term996.getClass(), "first", term1001);
        setIntField(term1004, term1004.getClass(), "type", 0);
        setField(term1004, term1004.getClass(), "next", null);
        setField(term1004, term1004.getClass(), "first", null);
        setField(term1004, term1004.getClass(), "last", null);
        setField(term1004, term1004.getClass(), "propListHead", null);
        setIntField(term1004, term1004.getClass(), "sourcePosition", 0);
        setField(term1004, term1004.getClass(), "jsType", null);
        setField(term1004, term1004.getClass(), "parent", null);
        setField(term996, term996.getClass(), "last", term1004);
        setField(term996, term996.getClass(), "propListHead", null);
        setIntField(term996, term996.getClass(), "sourcePosition", 0);
        setField(term996, term996.getClass(), "jsType", null);
        setField(term996, term996.getClass(), "parent", null);
        setField(term994, term994.getClass(), "next", term996);
        setIntField(term1008, term1008.getClass(), "type", 0);
        setField(term1008, term1008.getClass(), "next", null);
        setField(term1008, term1008.getClass(), "first", null);
        setField(term1008, term1008.getClass(), "last", null);
        setField(term1008, term1008.getClass(), "propListHead", null);
        setIntField(term1008, term1008.getClass(), "sourcePosition", 0);
        setField(term1008, term1008.getClass(), "jsType", null);
        setField(term1008, term1008.getClass(), "parent", null);
        setField(term994, term994.getClass(), "first", term1008);
        setIntField(term1011, term1011.getClass(), "type", 0);
        setField(term1011, term1011.getClass(), "next", null);
        setField(term1011, term1011.getClass(), "first", null);
        setField(term1011, term1011.getClass(), "last", null);
        setField(term1011, term1011.getClass(), "propListHead", null);
        setIntField(term1011, term1011.getClass(), "sourcePosition", 0);
        setField(term1011, term1011.getClass(), "jsType", null);
        setField(term1011, term1011.getClass(), "parent", null);
        setField(term994, term994.getClass(), "last", term1011);
        setField(term994, term994.getClass(), "propListHead", null);
        setIntField(term994, term994.getClass(), "sourcePosition", 0);
        setField(term994, term994.getClass(), "jsType", null);
        setField(term994, term994.getClass(), "parent", null);
        term10355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10355, term10355.getClass(), "type", 510162332);
        setIntField(term10356, term10356.getClass(), "type", 752152965);
        setIntField(term10357, term10357.getClass(), "type", 0);
        setField(term10357, term10357.getClass(), "next", null);
        setField(term10357, term10357.getClass(), "first", null);
        setField(term10357, term10357.getClass(), "last", null);
        setField(term10357, term10357.getClass(), "propListHead", null);
        setIntField(term10357, term10357.getClass(), "sourcePosition", 0);
        setField(term10357, term10357.getClass(), "jsType", null);
        setField(term10357, term10357.getClass(), "parent", null);
        setField(term10356, term10356.getClass(), "next", term10357);
        setIntField(term10358, term10358.getClass(), "type", 0);
        setField(term10358, term10358.getClass(), "next", null);
        setField(term10358, term10358.getClass(), "first", null);
        setField(term10358, term10358.getClass(), "last", null);
        setField(term10358, term10358.getClass(), "propListHead", null);
        setIntField(term10358, term10358.getClass(), "sourcePosition", 0);
        setField(term10358, term10358.getClass(), "jsType", null);
        setField(term10358, term10358.getClass(), "parent", null);
        setField(term10356, term10356.getClass(), "first", term10358);
        setIntField(term10359, term10359.getClass(), "type", 0);
        setField(term10359, term10359.getClass(), "next", null);
        setField(term10359, term10359.getClass(), "first", null);
        setField(term10359, term10359.getClass(), "last", null);
        setField(term10359, term10359.getClass(), "propListHead", null);
        setIntField(term10359, term10359.getClass(), "sourcePosition", 0);
        setField(term10359, term10359.getClass(), "jsType", null);
        setField(term10359, term10359.getClass(), "parent", null);
        setField(term10356, term10356.getClass(), "last", term10359);
        setField(term10356, term10356.getClass(), "propListHead", null);
        setIntField(term10356, term10356.getClass(), "sourcePosition", 0);
        setField(term10356, term10356.getClass(), "jsType", null);
        setField(term10356, term10356.getClass(), "parent", null);
        setField(term10355, term10355.getClass(), "next", term10356);
        setIntField(term10360, term10360.getClass(), "type", 0);
        setField(term10360, term10360.getClass(), "next", null);
        setField(term10360, term10360.getClass(), "first", null);
        setField(term10360, term10360.getClass(), "last", null);
        setField(term10360, term10360.getClass(), "propListHead", null);
        setIntField(term10360, term10360.getClass(), "sourcePosition", 0);
        setField(term10360, term10360.getClass(), "jsType", null);
        setField(term10360, term10360.getClass(), "parent", null);
        setField(term10355, term10355.getClass(), "first", term10360);
        setIntField(term10361, term10361.getClass(), "type", 0);
        setField(term10361, term10361.getClass(), "next", null);
        setField(term10361, term10361.getClass(), "first", null);
        setField(term10361, term10361.getClass(), "last", null);
        setField(term10361, term10361.getClass(), "propListHead", null);
        setIntField(term10361, term10361.getClass(), "sourcePosition", 0);
        setField(term10361, term10361.getClass(), "jsType", null);
        setField(term10361, term10361.getClass(), "parent", null);
        setField(term10355, term10355.getClass(), "last", term10361);
        setField(term10355, term10355.getClass(), "propListHead", null);
        setIntField(term10355, term10355.getClass(), "sourcePosition", 0);
        setField(term10355, term10355.getClass(), "jsType", null);
        setField(term10355, term10355.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term994;
        Object retValue = callMethod(klass, "isExpressionNode", argTypes, null, args);
        assertTrue(recursiveEquals(term994, term10355));
        assertTrue(recursiveEquals(retValue, false));
    }

};


