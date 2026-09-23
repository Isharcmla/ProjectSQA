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

public class NodeUtil_isCall_1870270415234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2189;
     Object term15127;

    public NodeUtil_isCall_1870270415234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2191 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2202 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2212 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2189, term2189.getClass(), "type", 1985432430);
        setIntField(term2191, term2191.getClass(), "type", 1354781442);
        setIntField(term2193, term2193.getClass(), "type", 0);
        setField(term2193, term2193.getClass(), "next", null);
        setField(term2193, term2193.getClass(), "first", null);
        setField(term2193, term2193.getClass(), "last", null);
        setField(term2193, term2193.getClass(), "propListHead", null);
        setIntField(term2193, term2193.getClass(), "sourcePosition", 0);
        setField(term2193, term2193.getClass(), "jsType", null);
        setField(term2193, term2193.getClass(), "parent", null);
        setField(term2191, term2191.getClass(), "next", term2193);
        setIntField(term2196, term2196.getClass(), "type", 0);
        setField(term2196, term2196.getClass(), "next", null);
        setField(term2196, term2196.getClass(), "first", null);
        setField(term2196, term2196.getClass(), "last", null);
        setField(term2196, term2196.getClass(), "propListHead", null);
        setIntField(term2196, term2196.getClass(), "sourcePosition", 0);
        setField(term2196, term2196.getClass(), "jsType", null);
        setField(term2196, term2196.getClass(), "parent", null);
        setField(term2191, term2191.getClass(), "first", term2196);
        setIntField(term2199, term2199.getClass(), "type", 0);
        setField(term2199, term2199.getClass(), "next", null);
        setField(term2199, term2199.getClass(), "first", null);
        setField(term2199, term2199.getClass(), "last", null);
        setField(term2199, term2199.getClass(), "propListHead", null);
        setIntField(term2199, term2199.getClass(), "sourcePosition", 0);
        setField(term2199, term2199.getClass(), "jsType", null);
        setField(term2199, term2199.getClass(), "parent", null);
        setField(term2191, term2191.getClass(), "last", term2199);
        setField(term2202, term2202.getClass(), "next", null);
        setIntField(term2202, term2202.getClass(), "type", 0);
        setIntField(term2202, term2202.getClass(), "intValue", 0);
        setField(term2202, term2202.getClass(), "objectValue", null);
        setField(term2191, term2191.getClass(), "propListHead", term2202);
        setIntField(term2191, term2191.getClass(), "sourcePosition", -829441157);
        setField(term2191, term2191.getClass(), "jsType", null);
        setField(term2191, term2191.getClass(), "parent", null);
        setField(term2189, term2189.getClass(), "next", term2191);
        setIntField(term2206, term2206.getClass(), "type", 0);
        setField(term2206, term2206.getClass(), "next", null);
        setField(term2206, term2206.getClass(), "first", null);
        setField(term2206, term2206.getClass(), "last", null);
        setField(term2206, term2206.getClass(), "propListHead", null);
        setIntField(term2206, term2206.getClass(), "sourcePosition", 0);
        setField(term2206, term2206.getClass(), "jsType", null);
        setField(term2206, term2206.getClass(), "parent", null);
        setField(term2189, term2189.getClass(), "first", term2206);
        setIntField(term2209, term2209.getClass(), "type", 0);
        setField(term2209, term2209.getClass(), "next", null);
        setField(term2209, term2209.getClass(), "first", null);
        setField(term2209, term2209.getClass(), "last", null);
        setField(term2209, term2209.getClass(), "propListHead", null);
        setIntField(term2209, term2209.getClass(), "sourcePosition", 0);
        setField(term2209, term2209.getClass(), "jsType", null);
        setField(term2209, term2209.getClass(), "parent", null);
        setField(term2189, term2189.getClass(), "last", term2209);
        setField(term2212, term2212.getClass(), "next", null);
        setIntField(term2212, term2212.getClass(), "type", 0);
        setIntField(term2212, term2212.getClass(), "intValue", 0);
        setField(term2212, term2212.getClass(), "objectValue", null);
        setField(term2189, term2189.getClass(), "propListHead", term2212);
        setIntField(term2189, term2189.getClass(), "sourcePosition", -1489991025);
        setField(term2189, term2189.getClass(), "jsType", null);
        setField(term2189, term2189.getClass(), "parent", null);
        term15127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15132 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15135 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term15127, term15127.getClass(), "type", 1985432430);
        setIntField(term15128, term15128.getClass(), "type", 1354781442);
        setIntField(term15129, term15129.getClass(), "type", 0);
        setField(term15129, term15129.getClass(), "next", null);
        setField(term15129, term15129.getClass(), "first", null);
        setField(term15129, term15129.getClass(), "last", null);
        setField(term15129, term15129.getClass(), "propListHead", null);
        setIntField(term15129, term15129.getClass(), "sourcePosition", 0);
        setField(term15129, term15129.getClass(), "jsType", null);
        setField(term15129, term15129.getClass(), "parent", null);
        setField(term15128, term15128.getClass(), "next", term15129);
        setIntField(term15130, term15130.getClass(), "type", 0);
        setField(term15130, term15130.getClass(), "next", null);
        setField(term15130, term15130.getClass(), "first", null);
        setField(term15130, term15130.getClass(), "last", null);
        setField(term15130, term15130.getClass(), "propListHead", null);
        setIntField(term15130, term15130.getClass(), "sourcePosition", 0);
        setField(term15130, term15130.getClass(), "jsType", null);
        setField(term15130, term15130.getClass(), "parent", null);
        setField(term15128, term15128.getClass(), "first", term15130);
        setIntField(term15131, term15131.getClass(), "type", 0);
        setField(term15131, term15131.getClass(), "next", null);
        setField(term15131, term15131.getClass(), "first", null);
        setField(term15131, term15131.getClass(), "last", null);
        setField(term15131, term15131.getClass(), "propListHead", null);
        setIntField(term15131, term15131.getClass(), "sourcePosition", 0);
        setField(term15131, term15131.getClass(), "jsType", null);
        setField(term15131, term15131.getClass(), "parent", null);
        setField(term15128, term15128.getClass(), "last", term15131);
        setField(term15132, term15132.getClass(), "next", null);
        setIntField(term15132, term15132.getClass(), "type", 0);
        setIntField(term15132, term15132.getClass(), "intValue", 0);
        setField(term15132, term15132.getClass(), "objectValue", null);
        setField(term15128, term15128.getClass(), "propListHead", term15132);
        setIntField(term15128, term15128.getClass(), "sourcePosition", -829441157);
        setField(term15128, term15128.getClass(), "jsType", null);
        setField(term15128, term15128.getClass(), "parent", null);
        setField(term15127, term15127.getClass(), "next", term15128);
        setIntField(term15133, term15133.getClass(), "type", 0);
        setField(term15133, term15133.getClass(), "next", null);
        setField(term15133, term15133.getClass(), "first", null);
        setField(term15133, term15133.getClass(), "last", null);
        setField(term15133, term15133.getClass(), "propListHead", null);
        setIntField(term15133, term15133.getClass(), "sourcePosition", 0);
        setField(term15133, term15133.getClass(), "jsType", null);
        setField(term15133, term15133.getClass(), "parent", null);
        setField(term15127, term15127.getClass(), "first", term15133);
        setIntField(term15134, term15134.getClass(), "type", 0);
        setField(term15134, term15134.getClass(), "next", null);
        setField(term15134, term15134.getClass(), "first", null);
        setField(term15134, term15134.getClass(), "last", null);
        setField(term15134, term15134.getClass(), "propListHead", null);
        setIntField(term15134, term15134.getClass(), "sourcePosition", 0);
        setField(term15134, term15134.getClass(), "jsType", null);
        setField(term15134, term15134.getClass(), "parent", null);
        setField(term15127, term15127.getClass(), "last", term15134);
        setField(term15135, term15135.getClass(), "next", null);
        setIntField(term15135, term15135.getClass(), "type", 0);
        setIntField(term15135, term15135.getClass(), "intValue", 0);
        setField(term15135, term15135.getClass(), "objectValue", null);
        setField(term15127, term15127.getClass(), "propListHead", term15135);
        setIntField(term15127, term15127.getClass(), "sourcePosition", -1489991025);
        setField(term15127, term15127.getClass(), "jsType", null);
        setField(term15127, term15127.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2189;
        Object retValue = callMethod(klass, "isCall", argTypes, null, args);
        assertTrue(recursiveEquals(term2189, term15127));
        assertTrue(recursiveEquals(retValue, false));
    }

};


