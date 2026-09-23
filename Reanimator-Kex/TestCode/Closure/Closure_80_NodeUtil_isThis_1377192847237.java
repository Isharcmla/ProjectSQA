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

public class NodeUtil_isThis_1377192847237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2270;
     Object term15206;

    public NodeUtil_isThis_1377192847237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2283 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2290 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2293 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2270, term2270.getClass(), "type", -1142164411);
        setIntField(term2272, term2272.getClass(), "type", -965421502);
        setIntField(term2274, term2274.getClass(), "type", 0);
        setField(term2274, term2274.getClass(), "next", null);
        setField(term2274, term2274.getClass(), "first", null);
        setField(term2274, term2274.getClass(), "last", null);
        setField(term2274, term2274.getClass(), "propListHead", null);
        setIntField(term2274, term2274.getClass(), "sourcePosition", 0);
        setField(term2274, term2274.getClass(), "jsType", null);
        setField(term2274, term2274.getClass(), "parent", null);
        setField(term2272, term2272.getClass(), "next", term2274);
        setIntField(term2277, term2277.getClass(), "type", 0);
        setField(term2277, term2277.getClass(), "next", null);
        setField(term2277, term2277.getClass(), "first", null);
        setField(term2277, term2277.getClass(), "last", null);
        setField(term2277, term2277.getClass(), "propListHead", null);
        setIntField(term2277, term2277.getClass(), "sourcePosition", 0);
        setField(term2277, term2277.getClass(), "jsType", null);
        setField(term2277, term2277.getClass(), "parent", null);
        setField(term2272, term2272.getClass(), "first", term2277);
        setIntField(term2280, term2280.getClass(), "type", 0);
        setField(term2280, term2280.getClass(), "next", null);
        setField(term2280, term2280.getClass(), "first", null);
        setField(term2280, term2280.getClass(), "last", null);
        setField(term2280, term2280.getClass(), "propListHead", null);
        setIntField(term2280, term2280.getClass(), "sourcePosition", 0);
        setField(term2280, term2280.getClass(), "jsType", null);
        setField(term2280, term2280.getClass(), "parent", null);
        setField(term2272, term2272.getClass(), "last", term2280);
        setField(term2283, term2283.getClass(), "next", null);
        setIntField(term2283, term2283.getClass(), "type", 0);
        setIntField(term2283, term2283.getClass(), "intValue", 0);
        setField(term2283, term2283.getClass(), "objectValue", null);
        setField(term2272, term2272.getClass(), "propListHead", term2283);
        setIntField(term2272, term2272.getClass(), "sourcePosition", 1956006038);
        setField(term2272, term2272.getClass(), "jsType", null);
        setField(term2272, term2272.getClass(), "parent", null);
        setField(term2270, term2270.getClass(), "next", term2272);
        setIntField(term2287, term2287.getClass(), "type", 0);
        setField(term2287, term2287.getClass(), "next", null);
        setField(term2287, term2287.getClass(), "first", null);
        setField(term2287, term2287.getClass(), "last", null);
        setField(term2287, term2287.getClass(), "propListHead", null);
        setIntField(term2287, term2287.getClass(), "sourcePosition", 0);
        setField(term2287, term2287.getClass(), "jsType", null);
        setField(term2287, term2287.getClass(), "parent", null);
        setField(term2270, term2270.getClass(), "first", term2287);
        setIntField(term2290, term2290.getClass(), "type", 0);
        setField(term2290, term2290.getClass(), "next", null);
        setField(term2290, term2290.getClass(), "first", null);
        setField(term2290, term2290.getClass(), "last", null);
        setField(term2290, term2290.getClass(), "propListHead", null);
        setIntField(term2290, term2290.getClass(), "sourcePosition", 0);
        setField(term2290, term2290.getClass(), "jsType", null);
        setField(term2290, term2290.getClass(), "parent", null);
        setField(term2270, term2270.getClass(), "last", term2290);
        setField(term2293, term2293.getClass(), "next", null);
        setIntField(term2293, term2293.getClass(), "type", 0);
        setIntField(term2293, term2293.getClass(), "intValue", 0);
        setField(term2293, term2293.getClass(), "objectValue", null);
        setField(term2270, term2270.getClass(), "propListHead", term2293);
        setIntField(term2270, term2270.getClass(), "sourcePosition", -1062304878);
        setField(term2270, term2270.getClass(), "jsType", null);
        setField(term2270, term2270.getClass(), "parent", null);
        term15206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15211 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15214 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term15206, term15206.getClass(), "type", -1142164411);
        setIntField(term15207, term15207.getClass(), "type", -965421502);
        setIntField(term15208, term15208.getClass(), "type", 0);
        setField(term15208, term15208.getClass(), "next", null);
        setField(term15208, term15208.getClass(), "first", null);
        setField(term15208, term15208.getClass(), "last", null);
        setField(term15208, term15208.getClass(), "propListHead", null);
        setIntField(term15208, term15208.getClass(), "sourcePosition", 0);
        setField(term15208, term15208.getClass(), "jsType", null);
        setField(term15208, term15208.getClass(), "parent", null);
        setField(term15207, term15207.getClass(), "next", term15208);
        setIntField(term15209, term15209.getClass(), "type", 0);
        setField(term15209, term15209.getClass(), "next", null);
        setField(term15209, term15209.getClass(), "first", null);
        setField(term15209, term15209.getClass(), "last", null);
        setField(term15209, term15209.getClass(), "propListHead", null);
        setIntField(term15209, term15209.getClass(), "sourcePosition", 0);
        setField(term15209, term15209.getClass(), "jsType", null);
        setField(term15209, term15209.getClass(), "parent", null);
        setField(term15207, term15207.getClass(), "first", term15209);
        setIntField(term15210, term15210.getClass(), "type", 0);
        setField(term15210, term15210.getClass(), "next", null);
        setField(term15210, term15210.getClass(), "first", null);
        setField(term15210, term15210.getClass(), "last", null);
        setField(term15210, term15210.getClass(), "propListHead", null);
        setIntField(term15210, term15210.getClass(), "sourcePosition", 0);
        setField(term15210, term15210.getClass(), "jsType", null);
        setField(term15210, term15210.getClass(), "parent", null);
        setField(term15207, term15207.getClass(), "last", term15210);
        setField(term15211, term15211.getClass(), "next", null);
        setIntField(term15211, term15211.getClass(), "type", 0);
        setIntField(term15211, term15211.getClass(), "intValue", 0);
        setField(term15211, term15211.getClass(), "objectValue", null);
        setField(term15207, term15207.getClass(), "propListHead", term15211);
        setIntField(term15207, term15207.getClass(), "sourcePosition", 1956006038);
        setField(term15207, term15207.getClass(), "jsType", null);
        setField(term15207, term15207.getClass(), "parent", null);
        setField(term15206, term15206.getClass(), "next", term15207);
        setIntField(term15212, term15212.getClass(), "type", 0);
        setField(term15212, term15212.getClass(), "next", null);
        setField(term15212, term15212.getClass(), "first", null);
        setField(term15212, term15212.getClass(), "last", null);
        setField(term15212, term15212.getClass(), "propListHead", null);
        setIntField(term15212, term15212.getClass(), "sourcePosition", 0);
        setField(term15212, term15212.getClass(), "jsType", null);
        setField(term15212, term15212.getClass(), "parent", null);
        setField(term15206, term15206.getClass(), "first", term15212);
        setIntField(term15213, term15213.getClass(), "type", 0);
        setField(term15213, term15213.getClass(), "next", null);
        setField(term15213, term15213.getClass(), "first", null);
        setField(term15213, term15213.getClass(), "last", null);
        setField(term15213, term15213.getClass(), "propListHead", null);
        setIntField(term15213, term15213.getClass(), "sourcePosition", 0);
        setField(term15213, term15213.getClass(), "jsType", null);
        setField(term15213, term15213.getClass(), "parent", null);
        setField(term15206, term15206.getClass(), "last", term15213);
        setField(term15214, term15214.getClass(), "next", null);
        setIntField(term15214, term15214.getClass(), "type", 0);
        setIntField(term15214, term15214.getClass(), "intValue", 0);
        setField(term15214, term15214.getClass(), "objectValue", null);
        setField(term15206, term15206.getClass(), "propListHead", term15214);
        setIntField(term15206, term15206.getClass(), "sourcePosition", -1062304878);
        setField(term15206, term15206.getClass(), "jsType", null);
        setField(term15206, term15206.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2270;
        Object retValue = callMethod(klass, "isThis", argTypes, null, args);
        assertTrue(recursiveEquals(term2270, term15206));
        assertTrue(recursiveEquals(retValue, false));
    }

};


