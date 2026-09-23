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
     Object term25272;

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
        term25272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25277 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term25278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25280 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term25272, term25272.getClass(), "type", -1824905298);
        setIntField(term25273, term25273.getClass(), "type", -1084408453);
        setIntField(term25274, term25274.getClass(), "type", 0);
        setField(term25274, term25274.getClass(), "next", null);
        setField(term25274, term25274.getClass(), "first", null);
        setField(term25274, term25274.getClass(), "last", null);
        setField(term25274, term25274.getClass(), "propListHead", null);
        setIntField(term25274, term25274.getClass(), "sourcePosition", 0);
        setField(term25274, term25274.getClass(), "jsType", null);
        setField(term25274, term25274.getClass(), "parent", null);
        setField(term25273, term25273.getClass(), "next", term25274);
        setIntField(term25275, term25275.getClass(), "type", 0);
        setField(term25275, term25275.getClass(), "next", null);
        setField(term25275, term25275.getClass(), "first", null);
        setField(term25275, term25275.getClass(), "last", null);
        setField(term25275, term25275.getClass(), "propListHead", null);
        setIntField(term25275, term25275.getClass(), "sourcePosition", 0);
        setField(term25275, term25275.getClass(), "jsType", null);
        setField(term25275, term25275.getClass(), "parent", null);
        setField(term25273, term25273.getClass(), "first", term25275);
        setIntField(term25276, term25276.getClass(), "type", 0);
        setField(term25276, term25276.getClass(), "next", null);
        setField(term25276, term25276.getClass(), "first", null);
        setField(term25276, term25276.getClass(), "last", null);
        setField(term25276, term25276.getClass(), "propListHead", null);
        setIntField(term25276, term25276.getClass(), "sourcePosition", 0);
        setField(term25276, term25276.getClass(), "jsType", null);
        setField(term25276, term25276.getClass(), "parent", null);
        setField(term25273, term25273.getClass(), "last", term25276);
        setField(term25277, term25277.getClass(), "next", null);
        setIntField(term25277, term25277.getClass(), "type", 0);
        setIntField(term25277, term25277.getClass(), "intValue", 0);
        setField(term25277, term25277.getClass(), "objectValue", null);
        setField(term25273, term25273.getClass(), "propListHead", term25277);
        setIntField(term25273, term25273.getClass(), "sourcePosition", 831967494);
        setField(term25273, term25273.getClass(), "jsType", null);
        setField(term25273, term25273.getClass(), "parent", null);
        setField(term25272, term25272.getClass(), "next", term25273);
        setIntField(term25278, term25278.getClass(), "type", 0);
        setField(term25278, term25278.getClass(), "next", null);
        setField(term25278, term25278.getClass(), "first", null);
        setField(term25278, term25278.getClass(), "last", null);
        setField(term25278, term25278.getClass(), "propListHead", null);
        setIntField(term25278, term25278.getClass(), "sourcePosition", 0);
        setField(term25278, term25278.getClass(), "jsType", null);
        setField(term25278, term25278.getClass(), "parent", null);
        setField(term25272, term25272.getClass(), "first", term25278);
        setIntField(term25279, term25279.getClass(), "type", 0);
        setField(term25279, term25279.getClass(), "next", null);
        setField(term25279, term25279.getClass(), "first", null);
        setField(term25279, term25279.getClass(), "last", null);
        setField(term25279, term25279.getClass(), "propListHead", null);
        setIntField(term25279, term25279.getClass(), "sourcePosition", 0);
        setField(term25279, term25279.getClass(), "jsType", null);
        setField(term25279, term25279.getClass(), "parent", null);
        setField(term25272, term25272.getClass(), "last", term25279);
        setField(term25280, term25280.getClass(), "next", null);
        setIntField(term25280, term25280.getClass(), "type", 0);
        setIntField(term25280, term25280.getClass(), "intValue", 0);
        setField(term25280, term25280.getClass(), "objectValue", null);
        setField(term25272, term25272.getClass(), "propListHead", term25280);
        setIntField(term25272, term25272.getClass(), "sourcePosition", -1858635791);
        setField(term25272, term25272.getClass(), "jsType", null);
        setField(term25272, term25272.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4187;
        Object retValue = callMethod(klass, "getInfoForNameNode", argTypes, null, args);
        assertTrue(recursiveEquals(term4187, term25272));
        assertTrue(recursiveEquals(retValue, null));
    }

};


