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
     Object term16184;

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
        term16184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16189 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term16190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16191 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16192 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term16184, term16184.getClass(), "type", -23054366);
        setIntField(term16185, term16185.getClass(), "type", 1139078354);
        setIntField(term16186, term16186.getClass(), "type", 0);
        setField(term16186, term16186.getClass(), "next", null);
        setField(term16186, term16186.getClass(), "first", null);
        setField(term16186, term16186.getClass(), "last", null);
        setField(term16186, term16186.getClass(), "propListHead", null);
        setIntField(term16186, term16186.getClass(), "sourcePosition", 0);
        setField(term16186, term16186.getClass(), "jsType", null);
        setField(term16186, term16186.getClass(), "parent", null);
        setField(term16185, term16185.getClass(), "next", term16186);
        setIntField(term16187, term16187.getClass(), "type", 0);
        setField(term16187, term16187.getClass(), "next", null);
        setField(term16187, term16187.getClass(), "first", null);
        setField(term16187, term16187.getClass(), "last", null);
        setField(term16187, term16187.getClass(), "propListHead", null);
        setIntField(term16187, term16187.getClass(), "sourcePosition", 0);
        setField(term16187, term16187.getClass(), "jsType", null);
        setField(term16187, term16187.getClass(), "parent", null);
        setField(term16185, term16185.getClass(), "first", term16187);
        setIntField(term16188, term16188.getClass(), "type", 0);
        setField(term16188, term16188.getClass(), "next", null);
        setField(term16188, term16188.getClass(), "first", null);
        setField(term16188, term16188.getClass(), "last", null);
        setField(term16188, term16188.getClass(), "propListHead", null);
        setIntField(term16188, term16188.getClass(), "sourcePosition", 0);
        setField(term16188, term16188.getClass(), "jsType", null);
        setField(term16188, term16188.getClass(), "parent", null);
        setField(term16185, term16185.getClass(), "last", term16188);
        setField(term16189, term16189.getClass(), "next", null);
        setIntField(term16189, term16189.getClass(), "type", 0);
        setIntField(term16189, term16189.getClass(), "intValue", 0);
        setField(term16189, term16189.getClass(), "objectValue", null);
        setField(term16185, term16185.getClass(), "propListHead", term16189);
        setIntField(term16185, term16185.getClass(), "sourcePosition", -1954860951);
        setField(term16185, term16185.getClass(), "jsType", null);
        setField(term16185, term16185.getClass(), "parent", null);
        setField(term16184, term16184.getClass(), "next", term16185);
        setIntField(term16190, term16190.getClass(), "type", 0);
        setField(term16190, term16190.getClass(), "next", null);
        setField(term16190, term16190.getClass(), "first", null);
        setField(term16190, term16190.getClass(), "last", null);
        setField(term16190, term16190.getClass(), "propListHead", null);
        setIntField(term16190, term16190.getClass(), "sourcePosition", 0);
        setField(term16190, term16190.getClass(), "jsType", null);
        setField(term16190, term16190.getClass(), "parent", null);
        setField(term16184, term16184.getClass(), "first", term16190);
        setIntField(term16191, term16191.getClass(), "type", 0);
        setField(term16191, term16191.getClass(), "next", null);
        setField(term16191, term16191.getClass(), "first", null);
        setField(term16191, term16191.getClass(), "last", null);
        setField(term16191, term16191.getClass(), "propListHead", null);
        setIntField(term16191, term16191.getClass(), "sourcePosition", 0);
        setField(term16191, term16191.getClass(), "jsType", null);
        setField(term16191, term16191.getClass(), "parent", null);
        setField(term16184, term16184.getClass(), "last", term16191);
        setField(term16192, term16192.getClass(), "next", null);
        setIntField(term16192, term16192.getClass(), "type", 0);
        setIntField(term16192, term16192.getClass(), "intValue", 0);
        setField(term16192, term16192.getClass(), "objectValue", null);
        setField(term16184, term16184.getClass(), "propListHead", term16192);
        setIntField(term16184, term16184.getClass(), "sourcePosition", -2078879114);
        setField(term16184, term16184.getClass(), "jsType", null);
        setField(term16184, term16184.getClass(), "parent", null);
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
        assertTrue(recursiveEquals(term2513, term16184));
    }

};


