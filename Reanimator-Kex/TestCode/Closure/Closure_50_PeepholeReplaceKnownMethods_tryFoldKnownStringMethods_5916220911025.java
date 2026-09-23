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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4451439;
     Object term4451531;
     Object term4452630;
     Object term4452631;
     Object term4452564;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4451439 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4451531 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4451623 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4451715 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term4451531, term4451531.getClass(), "type", 37);
        setIntField(term4451623, term4451623.getClass(), "type", 33);
        setField(term4451715, term4451715.getClass(), "next", term4451715);
        setIntField(term4451715, term4451715.getClass(), "type", 40);
        setField(term4451715, term4451715.getClass(), "str", "");
        setField(term4451623, term4451623.getClass(), "first", term4451715);
        setField(term4451623, term4451623.getClass(), "next", null);
        setField(term4451531, term4451531.getClass(), "first", term4451623);
        term4452630 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term4452630, term4452630.getClass(), "currentTraversal", null);
        term4452631 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4452632 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4452633 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term4452631, term4452631.getClass(), "number", 0.0);
        setIntField(term4452631, term4452631.getClass(), "type", 37);
        setField(term4452631, term4452631.getClass(), "next", null);
        setField(term4452632, term4452632.getClass(), "str", null);
        setIntField(term4452632, term4452632.getClass(), "type", 33);
        setField(term4452632, term4452632.getClass(), "next", null);
        setField(term4452633, term4452633.getClass(), "str", "");
        setIntField(term4452633, term4452633.getClass(), "type", 40);
        setField(term4452633, term4452633.getClass(), "next", term4452633);
        setField(term4452633, term4452633.getClass(), "first", null);
        setField(term4452633, term4452633.getClass(), "last", null);
        setField(term4452633, term4452633.getClass(), "propListHead", null);
        setIntField(term4452633, term4452633.getClass(), "sourcePosition", 0);
        setField(term4452633, term4452633.getClass(), "jsType", null);
        setField(term4452633, term4452633.getClass(), "parent", null);
        setField(term4452632, term4452632.getClass(), "first", term4452633);
        setField(term4452632, term4452632.getClass(), "last", null);
        setField(term4452632, term4452632.getClass(), "propListHead", null);
        setIntField(term4452632, term4452632.getClass(), "sourcePosition", 0);
        setField(term4452632, term4452632.getClass(), "jsType", null);
        setField(term4452632, term4452632.getClass(), "parent", null);
        setField(term4452631, term4452631.getClass(), "first", term4452632);
        setField(term4452631, term4452631.getClass(), "last", null);
        setField(term4452631, term4452631.getClass(), "propListHead", null);
        setIntField(term4452631, term4452631.getClass(), "sourcePosition", 0);
        setField(term4452631, term4452631.getClass(), "jsType", null);
        setField(term4452631, term4452631.getClass(), "parent", null);
        term4452564 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4452567 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4452569 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term4452564, term4452564.getClass(), "number", 0.0);
        setIntField(term4452564, term4452564.getClass(), "type", 37);
        setField(term4452564, term4452564.getClass(), "next", null);
        setField(term4452567, term4452567.getClass(), "str", null);
        setIntField(term4452567, term4452567.getClass(), "type", 33);
        setField(term4452567, term4452567.getClass(), "next", null);
        setField(term4452569, term4452569.getClass(), "str", "");
        setIntField(term4452569, term4452569.getClass(), "type", 40);
        setField(term4452569, term4452569.getClass(), "next", term4452569);
        setField(term4452569, term4452569.getClass(), "first", null);
        setField(term4452569, term4452569.getClass(), "last", null);
        setField(term4452569, term4452569.getClass(), "propListHead", null);
        setIntField(term4452569, term4452569.getClass(), "sourcePosition", 0);
        setField(term4452569, term4452569.getClass(), "jsType", null);
        setField(term4452569, term4452569.getClass(), "parent", null);
        setField(term4452567, term4452567.getClass(), "first", term4452569);
        setField(term4452567, term4452567.getClass(), "last", null);
        setField(term4452567, term4452567.getClass(), "propListHead", null);
        setIntField(term4452567, term4452567.getClass(), "sourcePosition", 0);
        setField(term4452567, term4452567.getClass(), "jsType", null);
        setField(term4452567, term4452567.getClass(), "parent", null);
        setField(term4452564, term4452564.getClass(), "first", term4452567);
        setField(term4452564, term4452564.getClass(), "last", null);
        setField(term4452564, term4452564.getClass(), "propListHead", null);
        setIntField(term4452564, term4452564.getClass(), "sourcePosition", 0);
        setField(term4452564, term4452564.getClass(), "jsType", null);
        setField(term4452564, term4452564.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4451531;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term4451439, args);
        assertTrue(recursiveEquals(term4451439, term4452630));
        assertTrue(recursiveEquals(term4451531, term4452631));
        assertTrue(recursiveEquals(retValue, term4452564));
    }

};


