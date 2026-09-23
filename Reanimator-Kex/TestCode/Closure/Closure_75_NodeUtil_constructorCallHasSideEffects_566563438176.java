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
import java.lang.Object;

public class NodeUtil_constructorCallHasSideEffects_566563438176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term590;

    public NodeUtil_constructorCallHasSideEffects_566563438176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term603 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term590, term590.getClass(), "type", 1045547089);
        setIntField(term592, term592.getClass(), "type", -1111249833);
        setIntField(term594, term594.getClass(), "type", 0);
        setField(term594, term594.getClass(), "next", null);
        setField(term594, term594.getClass(), "first", null);
        setField(term594, term594.getClass(), "last", null);
        setField(term594, term594.getClass(), "propListHead", null);
        setIntField(term594, term594.getClass(), "sourcePosition", 0);
        setField(term594, term594.getClass(), "jsType", null);
        setField(term594, term594.getClass(), "parent", null);
        setField(term592, term592.getClass(), "next", term594);
        setIntField(term597, term597.getClass(), "type", 0);
        setField(term597, term597.getClass(), "next", null);
        setField(term597, term597.getClass(), "first", null);
        setField(term597, term597.getClass(), "last", null);
        setField(term597, term597.getClass(), "propListHead", null);
        setIntField(term597, term597.getClass(), "sourcePosition", 0);
        setField(term597, term597.getClass(), "jsType", null);
        setField(term597, term597.getClass(), "parent", null);
        setField(term592, term592.getClass(), "first", term597);
        setIntField(term600, term600.getClass(), "type", 0);
        setField(term600, term600.getClass(), "next", null);
        setField(term600, term600.getClass(), "first", null);
        setField(term600, term600.getClass(), "last", null);
        setField(term600, term600.getClass(), "propListHead", null);
        setIntField(term600, term600.getClass(), "sourcePosition", 0);
        setField(term600, term600.getClass(), "jsType", null);
        setField(term600, term600.getClass(), "parent", null);
        setField(term592, term592.getClass(), "last", term600);
        setField(term603, term603.getClass(), "next", null);
        setIntField(term603, term603.getClass(), "type", 0);
        setIntField(term603, term603.getClass(), "intValue", 0);
        setField(term603, term603.getClass(), "objectValue", null);
        setField(term592, term592.getClass(), "propListHead", term603);
        setIntField(term592, term592.getClass(), "sourcePosition", 1320570890);
        setField(term592, term592.getClass(), "jsType", null);
        setField(term592, term592.getClass(), "parent", null);
        setField(term590, term590.getClass(), "next", term592);
        setIntField(term607, term607.getClass(), "type", 0);
        setField(term607, term607.getClass(), "next", null);
        setField(term607, term607.getClass(), "first", null);
        setField(term607, term607.getClass(), "last", null);
        setField(term607, term607.getClass(), "propListHead", null);
        setIntField(term607, term607.getClass(), "sourcePosition", 0);
        setField(term607, term607.getClass(), "jsType", null);
        setField(term607, term607.getClass(), "parent", null);
        setField(term590, term590.getClass(), "first", term607);
        setIntField(term610, term610.getClass(), "type", 0);
        setField(term610, term610.getClass(), "next", null);
        setField(term610, term610.getClass(), "first", null);
        setField(term610, term610.getClass(), "last", null);
        setField(term610, term610.getClass(), "propListHead", null);
        setIntField(term610, term610.getClass(), "sourcePosition", 0);
        setField(term610, term610.getClass(), "jsType", null);
        setField(term610, term610.getClass(), "parent", null);
        setField(term590, term590.getClass(), "last", term610);
        setField(term613, term613.getClass(), "next", null);
        setIntField(term613, term613.getClass(), "type", 0);
        setIntField(term613, term613.getClass(), "intValue", 0);
        setField(term613, term613.getClass(), "objectValue", null);
        setField(term590, term590.getClass(), "propListHead", term613);
        setIntField(term590, term590.getClass(), "sourcePosition", -130649791);
        setField(term590, term590.getClass(), "jsType", null);
        setField(term590, term590.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term590;
        try {
            callMethod(klass, "constructorCallHasSideEffects", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


