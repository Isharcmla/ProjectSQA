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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3588865;
     Object term3588957;
     Object term3590564;
     Object term3590565;
     Object term3590271;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3588865 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3588957 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3589049 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3589141 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3589233 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3589363 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3589049, term3589049.getClass(), "type", 35);
        setIntField(term3589233, term3589233.getClass(), "type", 40);
        setField(term3589233, term3589233.getClass(), "str", "substring");
        setField(term3589141, term3589141.getClass(), "next", term3589233);
        setIntField(term3589141, term3589141.getClass(), "type", 40);
        setField(term3589049, term3589049.getClass(), "first", term3589141);
        setIntField(term3589363, term3589363.getClass(), "type", 41);
        setField(term3589049, term3589049.getClass(), "next", term3589363);
        setField(term3588957, term3588957.getClass(), "first", term3589049);
        setIntField(term3588957, term3588957.getClass(), "type", 37);
        term3590564 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3590564, term3590564.getClass(), "currentTraversal", null);
        term3590565 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3590566 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3590567 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3590568 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3590569 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3590565, term3590565.getClass(), "str", null);
        setIntField(term3590565, term3590565.getClass(), "type", 37);
        setField(term3590565, term3590565.getClass(), "next", null);
        setField(term3590566, term3590566.getClass(), "str", null);
        setIntField(term3590566, term3590566.getClass(), "type", 35);
        setDoubleField(term3590567, term3590567.getClass(), "number", 0.0);
        setIntField(term3590567, term3590567.getClass(), "type", 41);
        setField(term3590567, term3590567.getClass(), "next", null);
        setField(term3590567, term3590567.getClass(), "first", null);
        setField(term3590567, term3590567.getClass(), "last", null);
        setField(term3590567, term3590567.getClass(), "propListHead", null);
        setIntField(term3590567, term3590567.getClass(), "sourcePosition", 0);
        setField(term3590567, term3590567.getClass(), "jsType", null);
        setField(term3590567, term3590567.getClass(), "parent", null);
        setField(term3590566, term3590566.getClass(), "next", term3590567);
        setField(term3590568, term3590568.getClass(), "str", null);
        setIntField(term3590568, term3590568.getClass(), "type", 40);
        setField(term3590569, term3590569.getClass(), "str", "");
        setIntField(term3590569, term3590569.getClass(), "type", 40);
        setField(term3590569, term3590569.getClass(), "next", null);
        setField(term3590569, term3590569.getClass(), "first", null);
        setField(term3590569, term3590569.getClass(), "last", null);
        setField(term3590569, term3590569.getClass(), "propListHead", null);
        setIntField(term3590569, term3590569.getClass(), "sourcePosition", 0);
        setField(term3590569, term3590569.getClass(), "jsType", null);
        setField(term3590569, term3590569.getClass(), "parent", null);
        setField(term3590568, term3590568.getClass(), "next", term3590569);
        setField(term3590568, term3590568.getClass(), "first", null);
        setField(term3590568, term3590568.getClass(), "last", null);
        setField(term3590568, term3590568.getClass(), "propListHead", null);
        setIntField(term3590568, term3590568.getClass(), "sourcePosition", 0);
        setField(term3590568, term3590568.getClass(), "jsType", null);
        setField(term3590568, term3590568.getClass(), "parent", null);
        setField(term3590566, term3590566.getClass(), "first", term3590568);
        setField(term3590566, term3590566.getClass(), "last", null);
        setField(term3590566, term3590566.getClass(), "propListHead", null);
        setIntField(term3590566, term3590566.getClass(), "sourcePosition", 0);
        setField(term3590566, term3590566.getClass(), "jsType", null);
        setField(term3590566, term3590566.getClass(), "parent", null);
        setField(term3590565, term3590565.getClass(), "first", term3590566);
        setField(term3590565, term3590565.getClass(), "last", null);
        setField(term3590565, term3590565.getClass(), "propListHead", null);
        setIntField(term3590565, term3590565.getClass(), "sourcePosition", 0);
        setField(term3590565, term3590565.getClass(), "jsType", null);
        setField(term3590565, term3590565.getClass(), "parent", null);
        term3590271 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3590273 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3590275 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3590279 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3590281 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3590271, term3590271.getClass(), "str", null);
        setIntField(term3590271, term3590271.getClass(), "type", 37);
        setField(term3590271, term3590271.getClass(), "next", null);
        setField(term3590273, term3590273.getClass(), "str", null);
        setIntField(term3590273, term3590273.getClass(), "type", 35);
        setDoubleField(term3590275, term3590275.getClass(), "number", 0.0);
        setIntField(term3590275, term3590275.getClass(), "type", 41);
        setField(term3590275, term3590275.getClass(), "next", null);
        setField(term3590275, term3590275.getClass(), "first", null);
        setField(term3590275, term3590275.getClass(), "last", null);
        setField(term3590275, term3590275.getClass(), "propListHead", null);
        setIntField(term3590275, term3590275.getClass(), "sourcePosition", 0);
        setField(term3590275, term3590275.getClass(), "jsType", null);
        setField(term3590275, term3590275.getClass(), "parent", null);
        setField(term3590273, term3590273.getClass(), "next", term3590275);
        setField(term3590279, term3590279.getClass(), "str", null);
        setIntField(term3590279, term3590279.getClass(), "type", 40);
        setField(term3590281, term3590281.getClass(), "str", "");
        setIntField(term3590281, term3590281.getClass(), "type", 40);
        setField(term3590281, term3590281.getClass(), "next", null);
        setField(term3590281, term3590281.getClass(), "first", null);
        setField(term3590281, term3590281.getClass(), "last", null);
        setField(term3590281, term3590281.getClass(), "propListHead", null);
        setIntField(term3590281, term3590281.getClass(), "sourcePosition", 0);
        setField(term3590281, term3590281.getClass(), "jsType", null);
        setField(term3590281, term3590281.getClass(), "parent", null);
        setField(term3590279, term3590279.getClass(), "next", term3590281);
        setField(term3590279, term3590279.getClass(), "first", null);
        setField(term3590279, term3590279.getClass(), "last", null);
        setField(term3590279, term3590279.getClass(), "propListHead", null);
        setIntField(term3590279, term3590279.getClass(), "sourcePosition", 0);
        setField(term3590279, term3590279.getClass(), "jsType", null);
        setField(term3590279, term3590279.getClass(), "parent", null);
        setField(term3590273, term3590273.getClass(), "first", term3590279);
        setField(term3590273, term3590273.getClass(), "last", null);
        setField(term3590273, term3590273.getClass(), "propListHead", null);
        setIntField(term3590273, term3590273.getClass(), "sourcePosition", 0);
        setField(term3590273, term3590273.getClass(), "jsType", null);
        setField(term3590273, term3590273.getClass(), "parent", null);
        setField(term3590271, term3590271.getClass(), "first", term3590273);
        setField(term3590271, term3590271.getClass(), "last", null);
        setField(term3590271, term3590271.getClass(), "propListHead", null);
        setIntField(term3590271, term3590271.getClass(), "sourcePosition", 0);
        setField(term3590271, term3590271.getClass(), "jsType", null);
        setField(term3590271, term3590271.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3588957;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3588865, args);
        assertTrue(recursiveEquals(term3588865, term3590564));
        assertTrue(recursiveEquals(term3588957, term3590565));
        assertTrue(recursiveEquals(retValue, term3590271));
    }

};


