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

public class NodeUtil_isObjectCallMethod_1353612968246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2513;
     Object term16231;

    public NodeUtil_isObjectCallMethod_1353612968246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2526 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2536 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2513, term2513.getClass(), "type", -23054366);
        setIntField(term2515, term2515.getClass(), "type", 1139078354);
        setIntField(term2517, term2517.getClass(), "type", 0);
        setField(term2517, term2517.getClass(), "next", null);
        setField(term2517, term2517.getClass(), "first", null);
        setField(term2517, term2517.getClass(), "last", null);
        setField(term2517, term2517.getClass(), "propListHead", null);
        setIntField(term2517, term2517.getClass(), "sourcePosition", 0);
        setField(term2517, term2517.getClass(), "jsType", null);
        setField(term2517, term2517.getClass(), "parent", null);
        setField(term2515, term2515.getClass(), "next", term2517);
        setIntField(term2520, term2520.getClass(), "type", 0);
        setField(term2520, term2520.getClass(), "next", null);
        setField(term2520, term2520.getClass(), "first", null);
        setField(term2520, term2520.getClass(), "last", null);
        setField(term2520, term2520.getClass(), "propListHead", null);
        setIntField(term2520, term2520.getClass(), "sourcePosition", 0);
        setField(term2520, term2520.getClass(), "jsType", null);
        setField(term2520, term2520.getClass(), "parent", null);
        setField(term2515, term2515.getClass(), "first", term2520);
        setIntField(term2523, term2523.getClass(), "type", 0);
        setField(term2523, term2523.getClass(), "next", null);
        setField(term2523, term2523.getClass(), "first", null);
        setField(term2523, term2523.getClass(), "last", null);
        setField(term2523, term2523.getClass(), "propListHead", null);
        setIntField(term2523, term2523.getClass(), "sourcePosition", 0);
        setField(term2523, term2523.getClass(), "jsType", null);
        setField(term2523, term2523.getClass(), "parent", null);
        setField(term2515, term2515.getClass(), "last", term2523);
        setField(term2526, term2526.getClass(), "next", null);
        setIntField(term2526, term2526.getClass(), "type", 0);
        setIntField(term2526, term2526.getClass(), "intValue", 0);
        setField(term2526, term2526.getClass(), "objectValue", null);
        setField(term2515, term2515.getClass(), "propListHead", term2526);
        setIntField(term2515, term2515.getClass(), "sourcePosition", -1954860951);
        setField(term2515, term2515.getClass(), "jsType", null);
        setField(term2515, term2515.getClass(), "parent", null);
        setField(term2513, term2513.getClass(), "next", term2515);
        setIntField(term2530, term2530.getClass(), "type", 0);
        setField(term2530, term2530.getClass(), "next", null);
        setField(term2530, term2530.getClass(), "first", null);
        setField(term2530, term2530.getClass(), "last", null);
        setField(term2530, term2530.getClass(), "propListHead", null);
        setIntField(term2530, term2530.getClass(), "sourcePosition", 0);
        setField(term2530, term2530.getClass(), "jsType", null);
        setField(term2530, term2530.getClass(), "parent", null);
        setField(term2513, term2513.getClass(), "first", term2530);
        setIntField(term2533, term2533.getClass(), "type", 0);
        setField(term2533, term2533.getClass(), "next", null);
        setField(term2533, term2533.getClass(), "first", null);
        setField(term2533, term2533.getClass(), "last", null);
        setField(term2533, term2533.getClass(), "propListHead", null);
        setIntField(term2533, term2533.getClass(), "sourcePosition", 0);
        setField(term2533, term2533.getClass(), "jsType", null);
        setField(term2533, term2533.getClass(), "parent", null);
        setField(term2513, term2513.getClass(), "last", term2533);
        setField(term2536, term2536.getClass(), "next", null);
        setIntField(term2536, term2536.getClass(), "type", 0);
        setIntField(term2536, term2536.getClass(), "intValue", 0);
        setField(term2536, term2536.getClass(), "objectValue", null);
        setField(term2513, term2513.getClass(), "propListHead", term2536);
        setIntField(term2513, term2513.getClass(), "sourcePosition", -2078879114);
        setField(term2513, term2513.getClass(), "jsType", null);
        setField(term2513, term2513.getClass(), "parent", null);
        term16231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16236 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term16237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16239 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term16231, term16231.getClass(), "type", -23054366);
        setIntField(term16232, term16232.getClass(), "type", 1139078354);
        setIntField(term16233, term16233.getClass(), "type", 0);
        setField(term16233, term16233.getClass(), "next", null);
        setField(term16233, term16233.getClass(), "first", null);
        setField(term16233, term16233.getClass(), "last", null);
        setField(term16233, term16233.getClass(), "propListHead", null);
        setIntField(term16233, term16233.getClass(), "sourcePosition", 0);
        setField(term16233, term16233.getClass(), "jsType", null);
        setField(term16233, term16233.getClass(), "parent", null);
        setField(term16232, term16232.getClass(), "next", term16233);
        setIntField(term16234, term16234.getClass(), "type", 0);
        setField(term16234, term16234.getClass(), "next", null);
        setField(term16234, term16234.getClass(), "first", null);
        setField(term16234, term16234.getClass(), "last", null);
        setField(term16234, term16234.getClass(), "propListHead", null);
        setIntField(term16234, term16234.getClass(), "sourcePosition", 0);
        setField(term16234, term16234.getClass(), "jsType", null);
        setField(term16234, term16234.getClass(), "parent", null);
        setField(term16232, term16232.getClass(), "first", term16234);
        setIntField(term16235, term16235.getClass(), "type", 0);
        setField(term16235, term16235.getClass(), "next", null);
        setField(term16235, term16235.getClass(), "first", null);
        setField(term16235, term16235.getClass(), "last", null);
        setField(term16235, term16235.getClass(), "propListHead", null);
        setIntField(term16235, term16235.getClass(), "sourcePosition", 0);
        setField(term16235, term16235.getClass(), "jsType", null);
        setField(term16235, term16235.getClass(), "parent", null);
        setField(term16232, term16232.getClass(), "last", term16235);
        setField(term16236, term16236.getClass(), "next", null);
        setIntField(term16236, term16236.getClass(), "type", 0);
        setIntField(term16236, term16236.getClass(), "intValue", 0);
        setField(term16236, term16236.getClass(), "objectValue", null);
        setField(term16232, term16232.getClass(), "propListHead", term16236);
        setIntField(term16232, term16232.getClass(), "sourcePosition", -1954860951);
        setField(term16232, term16232.getClass(), "jsType", null);
        setField(term16232, term16232.getClass(), "parent", null);
        setField(term16231, term16231.getClass(), "next", term16232);
        setIntField(term16237, term16237.getClass(), "type", 0);
        setField(term16237, term16237.getClass(), "next", null);
        setField(term16237, term16237.getClass(), "first", null);
        setField(term16237, term16237.getClass(), "last", null);
        setField(term16237, term16237.getClass(), "propListHead", null);
        setIntField(term16237, term16237.getClass(), "sourcePosition", 0);
        setField(term16237, term16237.getClass(), "jsType", null);
        setField(term16237, term16237.getClass(), "parent", null);
        setField(term16231, term16231.getClass(), "first", term16237);
        setIntField(term16238, term16238.getClass(), "type", 0);
        setField(term16238, term16238.getClass(), "next", null);
        setField(term16238, term16238.getClass(), "first", null);
        setField(term16238, term16238.getClass(), "last", null);
        setField(term16238, term16238.getClass(), "propListHead", null);
        setIntField(term16238, term16238.getClass(), "sourcePosition", 0);
        setField(term16238, term16238.getClass(), "jsType", null);
        setField(term16238, term16238.getClass(), "parent", null);
        setField(term16231, term16231.getClass(), "last", term16238);
        setField(term16239, term16239.getClass(), "next", null);
        setIntField(term16239, term16239.getClass(), "type", 0);
        setIntField(term16239, term16239.getClass(), "intValue", 0);
        setField(term16239, term16239.getClass(), "objectValue", null);
        setField(term16231, term16231.getClass(), "propListHead", term16239);
        setIntField(term16231, term16231.getClass(), "sourcePosition", -2078879114);
        setField(term16231, term16231.getClass(), "jsType", null);
        setField(term16231, term16231.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term2513;
        args[1] = "LQFpaHEwXR";
        callMethod(klass, "isObjectCallMethod", argTypes, null, args);
        assertTrue(recursiveEquals(term2513, term16231));
    }

};


