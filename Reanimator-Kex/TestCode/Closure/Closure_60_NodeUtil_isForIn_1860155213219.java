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

public class NodeUtil_isForIn_1860155213219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1288;
     Object term11262;

    public NodeUtil_isForIn_1860155213219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1290 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1288, term1288.getClass(), "type", 5603560);
        setIntField(term1290, term1290.getClass(), "type", -355469363);
        setIntField(term1292, term1292.getClass(), "type", 0);
        setField(term1292, term1292.getClass(), "next", null);
        setField(term1292, term1292.getClass(), "first", null);
        setField(term1292, term1292.getClass(), "last", null);
        setField(term1292, term1292.getClass(), "propListHead", null);
        setIntField(term1292, term1292.getClass(), "sourcePosition", 0);
        setField(term1292, term1292.getClass(), "jsType", null);
        setField(term1292, term1292.getClass(), "parent", null);
        setField(term1290, term1290.getClass(), "next", term1292);
        setIntField(term1295, term1295.getClass(), "type", 0);
        setField(term1295, term1295.getClass(), "next", null);
        setField(term1295, term1295.getClass(), "first", null);
        setField(term1295, term1295.getClass(), "last", null);
        setField(term1295, term1295.getClass(), "propListHead", null);
        setIntField(term1295, term1295.getClass(), "sourcePosition", 0);
        setField(term1295, term1295.getClass(), "jsType", null);
        setField(term1295, term1295.getClass(), "parent", null);
        setField(term1290, term1290.getClass(), "first", term1295);
        setIntField(term1298, term1298.getClass(), "type", 0);
        setField(term1298, term1298.getClass(), "next", null);
        setField(term1298, term1298.getClass(), "first", null);
        setField(term1298, term1298.getClass(), "last", null);
        setField(term1298, term1298.getClass(), "propListHead", null);
        setIntField(term1298, term1298.getClass(), "sourcePosition", 0);
        setField(term1298, term1298.getClass(), "jsType", null);
        setField(term1298, term1298.getClass(), "parent", null);
        setField(term1290, term1290.getClass(), "last", term1298);
        setField(term1290, term1290.getClass(), "propListHead", null);
        setIntField(term1290, term1290.getClass(), "sourcePosition", 0);
        setField(term1290, term1290.getClass(), "jsType", null);
        setField(term1290, term1290.getClass(), "parent", null);
        setField(term1288, term1288.getClass(), "next", term1290);
        setIntField(term1302, term1302.getClass(), "type", 0);
        setField(term1302, term1302.getClass(), "next", null);
        setField(term1302, term1302.getClass(), "first", null);
        setField(term1302, term1302.getClass(), "last", null);
        setField(term1302, term1302.getClass(), "propListHead", null);
        setIntField(term1302, term1302.getClass(), "sourcePosition", 0);
        setField(term1302, term1302.getClass(), "jsType", null);
        setField(term1302, term1302.getClass(), "parent", null);
        setField(term1288, term1288.getClass(), "first", term1302);
        setIntField(term1305, term1305.getClass(), "type", 0);
        setField(term1305, term1305.getClass(), "next", null);
        setField(term1305, term1305.getClass(), "first", null);
        setField(term1305, term1305.getClass(), "last", null);
        setField(term1305, term1305.getClass(), "propListHead", null);
        setIntField(term1305, term1305.getClass(), "sourcePosition", 0);
        setField(term1305, term1305.getClass(), "jsType", null);
        setField(term1305, term1305.getClass(), "parent", null);
        setField(term1288, term1288.getClass(), "last", term1305);
        setField(term1288, term1288.getClass(), "propListHead", null);
        setIntField(term1288, term1288.getClass(), "sourcePosition", 0);
        setField(term1288, term1288.getClass(), "jsType", null);
        setField(term1288, term1288.getClass(), "parent", null);
        term11262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11262, term11262.getClass(), "type", 5603560);
        setIntField(term11263, term11263.getClass(), "type", -355469363);
        setIntField(term11264, term11264.getClass(), "type", 0);
        setField(term11264, term11264.getClass(), "next", null);
        setField(term11264, term11264.getClass(), "first", null);
        setField(term11264, term11264.getClass(), "last", null);
        setField(term11264, term11264.getClass(), "propListHead", null);
        setIntField(term11264, term11264.getClass(), "sourcePosition", 0);
        setField(term11264, term11264.getClass(), "jsType", null);
        setField(term11264, term11264.getClass(), "parent", null);
        setField(term11263, term11263.getClass(), "next", term11264);
        setIntField(term11265, term11265.getClass(), "type", 0);
        setField(term11265, term11265.getClass(), "next", null);
        setField(term11265, term11265.getClass(), "first", null);
        setField(term11265, term11265.getClass(), "last", null);
        setField(term11265, term11265.getClass(), "propListHead", null);
        setIntField(term11265, term11265.getClass(), "sourcePosition", 0);
        setField(term11265, term11265.getClass(), "jsType", null);
        setField(term11265, term11265.getClass(), "parent", null);
        setField(term11263, term11263.getClass(), "first", term11265);
        setIntField(term11266, term11266.getClass(), "type", 0);
        setField(term11266, term11266.getClass(), "next", null);
        setField(term11266, term11266.getClass(), "first", null);
        setField(term11266, term11266.getClass(), "last", null);
        setField(term11266, term11266.getClass(), "propListHead", null);
        setIntField(term11266, term11266.getClass(), "sourcePosition", 0);
        setField(term11266, term11266.getClass(), "jsType", null);
        setField(term11266, term11266.getClass(), "parent", null);
        setField(term11263, term11263.getClass(), "last", term11266);
        setField(term11263, term11263.getClass(), "propListHead", null);
        setIntField(term11263, term11263.getClass(), "sourcePosition", 0);
        setField(term11263, term11263.getClass(), "jsType", null);
        setField(term11263, term11263.getClass(), "parent", null);
        setField(term11262, term11262.getClass(), "next", term11263);
        setIntField(term11267, term11267.getClass(), "type", 0);
        setField(term11267, term11267.getClass(), "next", null);
        setField(term11267, term11267.getClass(), "first", null);
        setField(term11267, term11267.getClass(), "last", null);
        setField(term11267, term11267.getClass(), "propListHead", null);
        setIntField(term11267, term11267.getClass(), "sourcePosition", 0);
        setField(term11267, term11267.getClass(), "jsType", null);
        setField(term11267, term11267.getClass(), "parent", null);
        setField(term11262, term11262.getClass(), "first", term11267);
        setIntField(term11268, term11268.getClass(), "type", 0);
        setField(term11268, term11268.getClass(), "next", null);
        setField(term11268, term11268.getClass(), "first", null);
        setField(term11268, term11268.getClass(), "last", null);
        setField(term11268, term11268.getClass(), "propListHead", null);
        setIntField(term11268, term11268.getClass(), "sourcePosition", 0);
        setField(term11268, term11268.getClass(), "jsType", null);
        setField(term11268, term11268.getClass(), "parent", null);
        setField(term11262, term11262.getClass(), "last", term11268);
        setField(term11262, term11262.getClass(), "propListHead", null);
        setIntField(term11262, term11262.getClass(), "sourcePosition", 0);
        setField(term11262, term11262.getClass(), "jsType", null);
        setField(term11262, term11262.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1288;
        Object retValue = callMethod(klass, "isForIn", argTypes, null, args);
        assertTrue(recursiveEquals(term1288, term11262));
        assertTrue(recursiveEquals(retValue, false));
    }

};


