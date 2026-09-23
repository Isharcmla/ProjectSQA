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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3474142;
     Object term3474234;
     Object term3475529;
     Object term3475530;
     Object term3475271;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3474142 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3474234 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3474326 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3474418 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3474510 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3474640 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3474326, term3474326.getClass(), "type", 35);
        setIntField(term3474510, term3474510.getClass(), "type", 40);
        setField(term3474510, term3474510.getClass(), "str", "charAt");
        setField(term3474418, term3474418.getClass(), "next", term3474510);
        setIntField(term3474418, term3474418.getClass(), "type", 40);
        setField(term3474326, term3474326.getClass(), "first", term3474418);
        setIntField(term3474640, term3474640.getClass(), "type", 44);
        setField(term3474326, term3474326.getClass(), "next", term3474640);
        setField(term3474234, term3474234.getClass(), "first", term3474326);
        setIntField(term3474234, term3474234.getClass(), "type", 37);
        term3475529 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3475529, term3475529.getClass(), "currentTraversal", null);
        term3475530 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3475531 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3475532 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3475533 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3475534 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3475530, term3475530.getClass(), "str", null);
        setIntField(term3475530, term3475530.getClass(), "type", 37);
        setField(term3475530, term3475530.getClass(), "next", null);
        setField(term3475531, term3475531.getClass(), "str", null);
        setIntField(term3475531, term3475531.getClass(), "type", 35);
        setField(term3475532, term3475532.getClass(), "str", null);
        setIntField(term3475532, term3475532.getClass(), "type", 44);
        setField(term3475532, term3475532.getClass(), "next", null);
        setField(term3475532, term3475532.getClass(), "first", null);
        setField(term3475532, term3475532.getClass(), "last", null);
        setField(term3475532, term3475532.getClass(), "propListHead", null);
        setIntField(term3475532, term3475532.getClass(), "sourcePosition", 0);
        setField(term3475532, term3475532.getClass(), "jsType", null);
        setField(term3475532, term3475532.getClass(), "parent", null);
        setField(term3475531, term3475531.getClass(), "next", term3475532);
        setField(term3475533, term3475533.getClass(), "str", null);
        setIntField(term3475533, term3475533.getClass(), "type", 40);
        setField(term3475534, term3475534.getClass(), "str", "");
        setIntField(term3475534, term3475534.getClass(), "type", 40);
        setField(term3475534, term3475534.getClass(), "next", null);
        setField(term3475534, term3475534.getClass(), "first", null);
        setField(term3475534, term3475534.getClass(), "last", null);
        setField(term3475534, term3475534.getClass(), "propListHead", null);
        setIntField(term3475534, term3475534.getClass(), "sourcePosition", 0);
        setField(term3475534, term3475534.getClass(), "jsType", null);
        setField(term3475534, term3475534.getClass(), "parent", null);
        setField(term3475533, term3475533.getClass(), "next", term3475534);
        setField(term3475533, term3475533.getClass(), "first", null);
        setField(term3475533, term3475533.getClass(), "last", null);
        setField(term3475533, term3475533.getClass(), "propListHead", null);
        setIntField(term3475533, term3475533.getClass(), "sourcePosition", 0);
        setField(term3475533, term3475533.getClass(), "jsType", null);
        setField(term3475533, term3475533.getClass(), "parent", null);
        setField(term3475531, term3475531.getClass(), "first", term3475533);
        setField(term3475531, term3475531.getClass(), "last", null);
        setField(term3475531, term3475531.getClass(), "propListHead", null);
        setIntField(term3475531, term3475531.getClass(), "sourcePosition", 0);
        setField(term3475531, term3475531.getClass(), "jsType", null);
        setField(term3475531, term3475531.getClass(), "parent", null);
        setField(term3475530, term3475530.getClass(), "first", term3475531);
        setField(term3475530, term3475530.getClass(), "last", null);
        setField(term3475530, term3475530.getClass(), "propListHead", null);
        setIntField(term3475530, term3475530.getClass(), "sourcePosition", 0);
        setField(term3475530, term3475530.getClass(), "jsType", null);
        setField(term3475530, term3475530.getClass(), "parent", null);
        term3475271 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3475273 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3475275 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3475278 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3475280 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3475271, term3475271.getClass(), "str", null);
        setIntField(term3475271, term3475271.getClass(), "type", 37);
        setField(term3475271, term3475271.getClass(), "next", null);
        setField(term3475273, term3475273.getClass(), "str", null);
        setIntField(term3475273, term3475273.getClass(), "type", 35);
        setField(term3475275, term3475275.getClass(), "str", null);
        setIntField(term3475275, term3475275.getClass(), "type", 44);
        setField(term3475275, term3475275.getClass(), "next", null);
        setField(term3475275, term3475275.getClass(), "first", null);
        setField(term3475275, term3475275.getClass(), "last", null);
        setField(term3475275, term3475275.getClass(), "propListHead", null);
        setIntField(term3475275, term3475275.getClass(), "sourcePosition", 0);
        setField(term3475275, term3475275.getClass(), "jsType", null);
        setField(term3475275, term3475275.getClass(), "parent", null);
        setField(term3475273, term3475273.getClass(), "next", term3475275);
        setField(term3475278, term3475278.getClass(), "str", null);
        setIntField(term3475278, term3475278.getClass(), "type", 40);
        setField(term3475280, term3475280.getClass(), "str", "");
        setIntField(term3475280, term3475280.getClass(), "type", 40);
        setField(term3475280, term3475280.getClass(), "next", null);
        setField(term3475280, term3475280.getClass(), "first", null);
        setField(term3475280, term3475280.getClass(), "last", null);
        setField(term3475280, term3475280.getClass(), "propListHead", null);
        setIntField(term3475280, term3475280.getClass(), "sourcePosition", 0);
        setField(term3475280, term3475280.getClass(), "jsType", null);
        setField(term3475280, term3475280.getClass(), "parent", null);
        setField(term3475278, term3475278.getClass(), "next", term3475280);
        setField(term3475278, term3475278.getClass(), "first", null);
        setField(term3475278, term3475278.getClass(), "last", null);
        setField(term3475278, term3475278.getClass(), "propListHead", null);
        setIntField(term3475278, term3475278.getClass(), "sourcePosition", 0);
        setField(term3475278, term3475278.getClass(), "jsType", null);
        setField(term3475278, term3475278.getClass(), "parent", null);
        setField(term3475273, term3475273.getClass(), "first", term3475278);
        setField(term3475273, term3475273.getClass(), "last", null);
        setField(term3475273, term3475273.getClass(), "propListHead", null);
        setIntField(term3475273, term3475273.getClass(), "sourcePosition", 0);
        setField(term3475273, term3475273.getClass(), "jsType", null);
        setField(term3475273, term3475273.getClass(), "parent", null);
        setField(term3475271, term3475271.getClass(), "first", term3475273);
        setField(term3475271, term3475271.getClass(), "last", null);
        setField(term3475271, term3475271.getClass(), "propListHead", null);
        setIntField(term3475271, term3475271.getClass(), "sourcePosition", 0);
        setField(term3475271, term3475271.getClass(), "jsType", null);
        setField(term3475271, term3475271.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3474234;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3474142, args);
        assertTrue(recursiveEquals(term3474142, term3475529));
        assertTrue(recursiveEquals(term3474234, term3475530));
        assertTrue(recursiveEquals(retValue, term3475271));
    }

};


