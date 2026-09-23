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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374700 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3609650;
     Object term3609742;
     Object term3611124;
     Object term3611125;
     Object term3610829;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374700() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3609650 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3609742 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3609834 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3609926 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3610018 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3610148 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3609834, term3609834.getClass(), "type", 35);
        setIntField(term3610018, term3610018.getClass(), "type", 40);
        setField(term3610018, term3610018.getClass(), "str", "charCodeAt");
        setField(term3609926, term3609926.getClass(), "next", term3610018);
        setIntField(term3609926, term3609926.getClass(), "type", 40);
        setField(term3609834, term3609834.getClass(), "first", term3609926);
        setIntField(term3610148, term3610148.getClass(), "type", 41);
        setField(term3609834, term3609834.getClass(), "next", term3610148);
        setField(term3609742, term3609742.getClass(), "first", term3609834);
        setIntField(term3609742, term3609742.getClass(), "type", 37);
        term3611124 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3611124, term3611124.getClass(), "currentTraversal", null);
        term3611125 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3611126 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3611127 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3611128 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3611129 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3611125, term3611125.getClass(), "str", null);
        setIntField(term3611125, term3611125.getClass(), "type", 37);
        setField(term3611125, term3611125.getClass(), "next", null);
        setField(term3611126, term3611126.getClass(), "str", null);
        setIntField(term3611126, term3611126.getClass(), "type", 35);
        setField(term3611127, term3611127.getClass(), "str", null);
        setIntField(term3611127, term3611127.getClass(), "type", 41);
        setField(term3611127, term3611127.getClass(), "next", null);
        setField(term3611127, term3611127.getClass(), "first", null);
        setField(term3611127, term3611127.getClass(), "last", null);
        setField(term3611127, term3611127.getClass(), "propListHead", null);
        setIntField(term3611127, term3611127.getClass(), "sourcePosition", 0);
        setField(term3611127, term3611127.getClass(), "jsType", null);
        setField(term3611127, term3611127.getClass(), "parent", null);
        setField(term3611126, term3611126.getClass(), "next", term3611127);
        setField(term3611128, term3611128.getClass(), "str", null);
        setIntField(term3611128, term3611128.getClass(), "type", 40);
        setField(term3611129, term3611129.getClass(), "str", "");
        setIntField(term3611129, term3611129.getClass(), "type", 40);
        setField(term3611129, term3611129.getClass(), "next", null);
        setField(term3611129, term3611129.getClass(), "first", null);
        setField(term3611129, term3611129.getClass(), "last", null);
        setField(term3611129, term3611129.getClass(), "propListHead", null);
        setIntField(term3611129, term3611129.getClass(), "sourcePosition", 0);
        setField(term3611129, term3611129.getClass(), "jsType", null);
        setField(term3611129, term3611129.getClass(), "parent", null);
        setField(term3611128, term3611128.getClass(), "next", term3611129);
        setField(term3611128, term3611128.getClass(), "first", null);
        setField(term3611128, term3611128.getClass(), "last", null);
        setField(term3611128, term3611128.getClass(), "propListHead", null);
        setIntField(term3611128, term3611128.getClass(), "sourcePosition", 0);
        setField(term3611128, term3611128.getClass(), "jsType", null);
        setField(term3611128, term3611128.getClass(), "parent", null);
        setField(term3611126, term3611126.getClass(), "first", term3611128);
        setField(term3611126, term3611126.getClass(), "last", null);
        setField(term3611126, term3611126.getClass(), "propListHead", null);
        setIntField(term3611126, term3611126.getClass(), "sourcePosition", 0);
        setField(term3611126, term3611126.getClass(), "jsType", null);
        setField(term3611126, term3611126.getClass(), "parent", null);
        setField(term3611125, term3611125.getClass(), "first", term3611126);
        setField(term3611125, term3611125.getClass(), "last", null);
        setField(term3611125, term3611125.getClass(), "propListHead", null);
        setIntField(term3611125, term3611125.getClass(), "sourcePosition", 0);
        setField(term3611125, term3611125.getClass(), "jsType", null);
        setField(term3611125, term3611125.getClass(), "parent", null);
        term3610829 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3610831 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3610833 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3610836 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3610838 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3610829, term3610829.getClass(), "str", null);
        setIntField(term3610829, term3610829.getClass(), "type", 37);
        setField(term3610829, term3610829.getClass(), "next", null);
        setField(term3610831, term3610831.getClass(), "str", null);
        setIntField(term3610831, term3610831.getClass(), "type", 35);
        setField(term3610833, term3610833.getClass(), "str", null);
        setIntField(term3610833, term3610833.getClass(), "type", 41);
        setField(term3610833, term3610833.getClass(), "next", null);
        setField(term3610833, term3610833.getClass(), "first", null);
        setField(term3610833, term3610833.getClass(), "last", null);
        setField(term3610833, term3610833.getClass(), "propListHead", null);
        setIntField(term3610833, term3610833.getClass(), "sourcePosition", 0);
        setField(term3610833, term3610833.getClass(), "jsType", null);
        setField(term3610833, term3610833.getClass(), "parent", null);
        setField(term3610831, term3610831.getClass(), "next", term3610833);
        setField(term3610836, term3610836.getClass(), "str", null);
        setIntField(term3610836, term3610836.getClass(), "type", 40);
        setField(term3610838, term3610838.getClass(), "str", "");
        setIntField(term3610838, term3610838.getClass(), "type", 40);
        setField(term3610838, term3610838.getClass(), "next", null);
        setField(term3610838, term3610838.getClass(), "first", null);
        setField(term3610838, term3610838.getClass(), "last", null);
        setField(term3610838, term3610838.getClass(), "propListHead", null);
        setIntField(term3610838, term3610838.getClass(), "sourcePosition", 0);
        setField(term3610838, term3610838.getClass(), "jsType", null);
        setField(term3610838, term3610838.getClass(), "parent", null);
        setField(term3610836, term3610836.getClass(), "next", term3610838);
        setField(term3610836, term3610836.getClass(), "first", null);
        setField(term3610836, term3610836.getClass(), "last", null);
        setField(term3610836, term3610836.getClass(), "propListHead", null);
        setIntField(term3610836, term3610836.getClass(), "sourcePosition", 0);
        setField(term3610836, term3610836.getClass(), "jsType", null);
        setField(term3610836, term3610836.getClass(), "parent", null);
        setField(term3610831, term3610831.getClass(), "first", term3610836);
        setField(term3610831, term3610831.getClass(), "last", null);
        setField(term3610831, term3610831.getClass(), "propListHead", null);
        setIntField(term3610831, term3610831.getClass(), "sourcePosition", 0);
        setField(term3610831, term3610831.getClass(), "jsType", null);
        setField(term3610831, term3610831.getClass(), "parent", null);
        setField(term3610829, term3610829.getClass(), "first", term3610831);
        setField(term3610829, term3610829.getClass(), "last", null);
        setField(term3610829, term3610829.getClass(), "propListHead", null);
        setIntField(term3610829, term3610829.getClass(), "sourcePosition", 0);
        setField(term3610829, term3610829.getClass(), "jsType", null);
        setField(term3610829, term3610829.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3609742;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3609650, args);
        assertTrue(recursiveEquals(term3609650, term3611124));
        assertTrue(recursiveEquals(term3609742, term3611125));
        assertTrue(recursiveEquals(retValue, term3610829));
    }

};


