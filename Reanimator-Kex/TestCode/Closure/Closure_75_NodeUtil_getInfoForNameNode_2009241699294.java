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

public class NodeUtil_getInfoForNameNode_2009241699294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4187;
     Object term25319;

    public NodeUtil_getInfoForNameNode_2009241699294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4191 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4200 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4210 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4187, term4187.getClass(), "type", -1824905298);
        setIntField(term4189, term4189.getClass(), "type", -1084408453);
        setIntField(term4191, term4191.getClass(), "type", 0);
        setField(term4191, term4191.getClass(), "next", null);
        setField(term4191, term4191.getClass(), "first", null);
        setField(term4191, term4191.getClass(), "last", null);
        setField(term4191, term4191.getClass(), "propListHead", null);
        setIntField(term4191, term4191.getClass(), "sourcePosition", 0);
        setField(term4191, term4191.getClass(), "jsType", null);
        setField(term4191, term4191.getClass(), "parent", null);
        setField(term4189, term4189.getClass(), "next", term4191);
        setIntField(term4194, term4194.getClass(), "type", 0);
        setField(term4194, term4194.getClass(), "next", null);
        setField(term4194, term4194.getClass(), "first", null);
        setField(term4194, term4194.getClass(), "last", null);
        setField(term4194, term4194.getClass(), "propListHead", null);
        setIntField(term4194, term4194.getClass(), "sourcePosition", 0);
        setField(term4194, term4194.getClass(), "jsType", null);
        setField(term4194, term4194.getClass(), "parent", null);
        setField(term4189, term4189.getClass(), "first", term4194);
        setIntField(term4197, term4197.getClass(), "type", 0);
        setField(term4197, term4197.getClass(), "next", null);
        setField(term4197, term4197.getClass(), "first", null);
        setField(term4197, term4197.getClass(), "last", null);
        setField(term4197, term4197.getClass(), "propListHead", null);
        setIntField(term4197, term4197.getClass(), "sourcePosition", 0);
        setField(term4197, term4197.getClass(), "jsType", null);
        setField(term4197, term4197.getClass(), "parent", null);
        setField(term4189, term4189.getClass(), "last", term4197);
        setField(term4200, term4200.getClass(), "next", null);
        setIntField(term4200, term4200.getClass(), "type", 0);
        setIntField(term4200, term4200.getClass(), "intValue", 0);
        setField(term4200, term4200.getClass(), "objectValue", null);
        setField(term4189, term4189.getClass(), "propListHead", term4200);
        setIntField(term4189, term4189.getClass(), "sourcePosition", 831967494);
        setField(term4189, term4189.getClass(), "jsType", null);
        setField(term4189, term4189.getClass(), "parent", null);
        setField(term4187, term4187.getClass(), "next", term4189);
        setIntField(term4204, term4204.getClass(), "type", 0);
        setField(term4204, term4204.getClass(), "next", null);
        setField(term4204, term4204.getClass(), "first", null);
        setField(term4204, term4204.getClass(), "last", null);
        setField(term4204, term4204.getClass(), "propListHead", null);
        setIntField(term4204, term4204.getClass(), "sourcePosition", 0);
        setField(term4204, term4204.getClass(), "jsType", null);
        setField(term4204, term4204.getClass(), "parent", null);
        setField(term4187, term4187.getClass(), "first", term4204);
        setIntField(term4207, term4207.getClass(), "type", 0);
        setField(term4207, term4207.getClass(), "next", null);
        setField(term4207, term4207.getClass(), "first", null);
        setField(term4207, term4207.getClass(), "last", null);
        setField(term4207, term4207.getClass(), "propListHead", null);
        setIntField(term4207, term4207.getClass(), "sourcePosition", 0);
        setField(term4207, term4207.getClass(), "jsType", null);
        setField(term4207, term4207.getClass(), "parent", null);
        setField(term4187, term4187.getClass(), "last", term4207);
        setField(term4210, term4210.getClass(), "next", null);
        setIntField(term4210, term4210.getClass(), "type", 0);
        setIntField(term4210, term4210.getClass(), "intValue", 0);
        setField(term4210, term4210.getClass(), "objectValue", null);
        setField(term4187, term4187.getClass(), "propListHead", term4210);
        setIntField(term4187, term4187.getClass(), "sourcePosition", -1858635791);
        setField(term4187, term4187.getClass(), "jsType", null);
        setField(term4187, term4187.getClass(), "parent", null);
        term25319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25324 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term25325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25327 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term25319, term25319.getClass(), "type", -1824905298);
        setIntField(term25320, term25320.getClass(), "type", -1084408453);
        setIntField(term25321, term25321.getClass(), "type", 0);
        setField(term25321, term25321.getClass(), "next", null);
        setField(term25321, term25321.getClass(), "first", null);
        setField(term25321, term25321.getClass(), "last", null);
        setField(term25321, term25321.getClass(), "propListHead", null);
        setIntField(term25321, term25321.getClass(), "sourcePosition", 0);
        setField(term25321, term25321.getClass(), "jsType", null);
        setField(term25321, term25321.getClass(), "parent", null);
        setField(term25320, term25320.getClass(), "next", term25321);
        setIntField(term25322, term25322.getClass(), "type", 0);
        setField(term25322, term25322.getClass(), "next", null);
        setField(term25322, term25322.getClass(), "first", null);
        setField(term25322, term25322.getClass(), "last", null);
        setField(term25322, term25322.getClass(), "propListHead", null);
        setIntField(term25322, term25322.getClass(), "sourcePosition", 0);
        setField(term25322, term25322.getClass(), "jsType", null);
        setField(term25322, term25322.getClass(), "parent", null);
        setField(term25320, term25320.getClass(), "first", term25322);
        setIntField(term25323, term25323.getClass(), "type", 0);
        setField(term25323, term25323.getClass(), "next", null);
        setField(term25323, term25323.getClass(), "first", null);
        setField(term25323, term25323.getClass(), "last", null);
        setField(term25323, term25323.getClass(), "propListHead", null);
        setIntField(term25323, term25323.getClass(), "sourcePosition", 0);
        setField(term25323, term25323.getClass(), "jsType", null);
        setField(term25323, term25323.getClass(), "parent", null);
        setField(term25320, term25320.getClass(), "last", term25323);
        setField(term25324, term25324.getClass(), "next", null);
        setIntField(term25324, term25324.getClass(), "type", 0);
        setIntField(term25324, term25324.getClass(), "intValue", 0);
        setField(term25324, term25324.getClass(), "objectValue", null);
        setField(term25320, term25320.getClass(), "propListHead", term25324);
        setIntField(term25320, term25320.getClass(), "sourcePosition", 831967494);
        setField(term25320, term25320.getClass(), "jsType", null);
        setField(term25320, term25320.getClass(), "parent", null);
        setField(term25319, term25319.getClass(), "next", term25320);
        setIntField(term25325, term25325.getClass(), "type", 0);
        setField(term25325, term25325.getClass(), "next", null);
        setField(term25325, term25325.getClass(), "first", null);
        setField(term25325, term25325.getClass(), "last", null);
        setField(term25325, term25325.getClass(), "propListHead", null);
        setIntField(term25325, term25325.getClass(), "sourcePosition", 0);
        setField(term25325, term25325.getClass(), "jsType", null);
        setField(term25325, term25325.getClass(), "parent", null);
        setField(term25319, term25319.getClass(), "first", term25325);
        setIntField(term25326, term25326.getClass(), "type", 0);
        setField(term25326, term25326.getClass(), "next", null);
        setField(term25326, term25326.getClass(), "first", null);
        setField(term25326, term25326.getClass(), "last", null);
        setField(term25326, term25326.getClass(), "propListHead", null);
        setIntField(term25326, term25326.getClass(), "sourcePosition", 0);
        setField(term25326, term25326.getClass(), "jsType", null);
        setField(term25326, term25326.getClass(), "parent", null);
        setField(term25319, term25319.getClass(), "last", term25326);
        setField(term25327, term25327.getClass(), "next", null);
        setIntField(term25327, term25327.getClass(), "type", 0);
        setIntField(term25327, term25327.getClass(), "intValue", 0);
        setField(term25327, term25327.getClass(), "objectValue", null);
        setField(term25319, term25319.getClass(), "propListHead", term25327);
        setIntField(term25319, term25319.getClass(), "sourcePosition", -1858635791);
        setField(term25319, term25319.getClass(), "jsType", null);
        setField(term25319, term25319.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4187;
        Object retValue = callMethod(klass, "getInfoForNameNode", argTypes, null, args);
        assertTrue(recursiveEquals(term4187, term25319));
        assertTrue(recursiveEquals(retValue, null));
    }

};


