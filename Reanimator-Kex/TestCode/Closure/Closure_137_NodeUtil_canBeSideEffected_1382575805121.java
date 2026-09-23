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

public class NodeUtil_canBeSideEffected_1382575805121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term433;
     Object term5274;

    public NodeUtil_canBeSideEffected_1382575805121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term446 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term456 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term433, term433.getClass(), "type", -506958186);
        setIntField(term435, term435.getClass(), "type", 729658803);
        setIntField(term437, term437.getClass(), "type", 0);
        setField(term437, term437.getClass(), "next", null);
        setField(term437, term437.getClass(), "first", null);
        setField(term437, term437.getClass(), "last", null);
        setField(term437, term437.getClass(), "propListHead", null);
        setIntField(term437, term437.getClass(), "sourcePosition", 0);
        setField(term437, term437.getClass(), "jsType", null);
        setField(term437, term437.getClass(), "parent", null);
        setField(term435, term435.getClass(), "next", term437);
        setIntField(term440, term440.getClass(), "type", 0);
        setField(term440, term440.getClass(), "next", null);
        setField(term440, term440.getClass(), "first", null);
        setField(term440, term440.getClass(), "last", null);
        setField(term440, term440.getClass(), "propListHead", null);
        setIntField(term440, term440.getClass(), "sourcePosition", 0);
        setField(term440, term440.getClass(), "jsType", null);
        setField(term440, term440.getClass(), "parent", null);
        setField(term435, term435.getClass(), "first", term440);
        setIntField(term443, term443.getClass(), "type", 0);
        setField(term443, term443.getClass(), "next", null);
        setField(term443, term443.getClass(), "first", null);
        setField(term443, term443.getClass(), "last", null);
        setField(term443, term443.getClass(), "propListHead", null);
        setIntField(term443, term443.getClass(), "sourcePosition", 0);
        setField(term443, term443.getClass(), "jsType", null);
        setField(term443, term443.getClass(), "parent", null);
        setField(term435, term435.getClass(), "last", term443);
        setField(term446, term446.getClass(), "next", null);
        setIntField(term446, term446.getClass(), "type", 0);
        setIntField(term446, term446.getClass(), "intValue", 0);
        setField(term446, term446.getClass(), "objectValue", null);
        setField(term435, term435.getClass(), "propListHead", term446);
        setIntField(term435, term435.getClass(), "sourcePosition", 584893196);
        setField(term435, term435.getClass(), "jsType", null);
        setField(term435, term435.getClass(), "parent", null);
        setField(term433, term433.getClass(), "next", term435);
        setIntField(term450, term450.getClass(), "type", 0);
        setField(term450, term450.getClass(), "next", null);
        setField(term450, term450.getClass(), "first", null);
        setField(term450, term450.getClass(), "last", null);
        setField(term450, term450.getClass(), "propListHead", null);
        setIntField(term450, term450.getClass(), "sourcePosition", 0);
        setField(term450, term450.getClass(), "jsType", null);
        setField(term450, term450.getClass(), "parent", null);
        setField(term433, term433.getClass(), "first", term450);
        setIntField(term453, term453.getClass(), "type", 0);
        setField(term453, term453.getClass(), "next", null);
        setField(term453, term453.getClass(), "first", null);
        setField(term453, term453.getClass(), "last", null);
        setField(term453, term453.getClass(), "propListHead", null);
        setIntField(term453, term453.getClass(), "sourcePosition", 0);
        setField(term453, term453.getClass(), "jsType", null);
        setField(term453, term453.getClass(), "parent", null);
        setField(term433, term433.getClass(), "last", term453);
        setField(term456, term456.getClass(), "next", null);
        setIntField(term456, term456.getClass(), "type", 0);
        setIntField(term456, term456.getClass(), "intValue", 0);
        setField(term456, term456.getClass(), "objectValue", null);
        setField(term433, term433.getClass(), "propListHead", term456);
        setIntField(term433, term433.getClass(), "sourcePosition", 497269071);
        setField(term433, term433.getClass(), "jsType", null);
        setField(term433, term433.getClass(), "parent", null);
        term5274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5279 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term5280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5282 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term5274, term5274.getClass(), "type", -506958186);
        setIntField(term5275, term5275.getClass(), "type", 729658803);
        setIntField(term5276, term5276.getClass(), "type", 0);
        setField(term5276, term5276.getClass(), "next", null);
        setField(term5276, term5276.getClass(), "first", null);
        setField(term5276, term5276.getClass(), "last", null);
        setField(term5276, term5276.getClass(), "propListHead", null);
        setIntField(term5276, term5276.getClass(), "sourcePosition", 0);
        setField(term5276, term5276.getClass(), "jsType", null);
        setField(term5276, term5276.getClass(), "parent", null);
        setField(term5275, term5275.getClass(), "next", term5276);
        setIntField(term5277, term5277.getClass(), "type", 0);
        setField(term5277, term5277.getClass(), "next", null);
        setField(term5277, term5277.getClass(), "first", null);
        setField(term5277, term5277.getClass(), "last", null);
        setField(term5277, term5277.getClass(), "propListHead", null);
        setIntField(term5277, term5277.getClass(), "sourcePosition", 0);
        setField(term5277, term5277.getClass(), "jsType", null);
        setField(term5277, term5277.getClass(), "parent", null);
        setField(term5275, term5275.getClass(), "first", term5277);
        setIntField(term5278, term5278.getClass(), "type", 0);
        setField(term5278, term5278.getClass(), "next", null);
        setField(term5278, term5278.getClass(), "first", null);
        setField(term5278, term5278.getClass(), "last", null);
        setField(term5278, term5278.getClass(), "propListHead", null);
        setIntField(term5278, term5278.getClass(), "sourcePosition", 0);
        setField(term5278, term5278.getClass(), "jsType", null);
        setField(term5278, term5278.getClass(), "parent", null);
        setField(term5275, term5275.getClass(), "last", term5278);
        setField(term5279, term5279.getClass(), "next", null);
        setIntField(term5279, term5279.getClass(), "type", 0);
        setIntField(term5279, term5279.getClass(), "intValue", 0);
        setField(term5279, term5279.getClass(), "objectValue", null);
        setField(term5275, term5275.getClass(), "propListHead", term5279);
        setIntField(term5275, term5275.getClass(), "sourcePosition", 584893196);
        setField(term5275, term5275.getClass(), "jsType", null);
        setField(term5275, term5275.getClass(), "parent", null);
        setField(term5274, term5274.getClass(), "next", term5275);
        setIntField(term5280, term5280.getClass(), "type", 0);
        setField(term5280, term5280.getClass(), "next", null);
        setField(term5280, term5280.getClass(), "first", null);
        setField(term5280, term5280.getClass(), "last", null);
        setField(term5280, term5280.getClass(), "propListHead", null);
        setIntField(term5280, term5280.getClass(), "sourcePosition", 0);
        setField(term5280, term5280.getClass(), "jsType", null);
        setField(term5280, term5280.getClass(), "parent", null);
        setField(term5274, term5274.getClass(), "first", term5280);
        setIntField(term5281, term5281.getClass(), "type", 0);
        setField(term5281, term5281.getClass(), "next", null);
        setField(term5281, term5281.getClass(), "first", null);
        setField(term5281, term5281.getClass(), "last", null);
        setField(term5281, term5281.getClass(), "propListHead", null);
        setIntField(term5281, term5281.getClass(), "sourcePosition", 0);
        setField(term5281, term5281.getClass(), "jsType", null);
        setField(term5281, term5281.getClass(), "parent", null);
        setField(term5274, term5274.getClass(), "last", term5281);
        setField(term5282, term5282.getClass(), "next", null);
        setIntField(term5282, term5282.getClass(), "type", 0);
        setIntField(term5282, term5282.getClass(), "intValue", 0);
        setField(term5282, term5282.getClass(), "objectValue", null);
        setField(term5274, term5274.getClass(), "propListHead", term5282);
        setIntField(term5274, term5274.getClass(), "sourcePosition", 497269071);
        setField(term5274, term5274.getClass(), "jsType", null);
        setField(term5274, term5274.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term433;
        callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term433, term5274));
    }

};


