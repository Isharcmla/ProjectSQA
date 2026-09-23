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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2645640;
     Object term2645710;
     Object term2646713;
     Object term2646714;
     Object term2646656;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2645640 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2645710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2645780 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2645850 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2645920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2645710, term2645710.getClass(), "type", 37);
        setIntField(term2645780, term2645780.getClass(), "type", 35);
        setField(term2645850, term2645850.getClass(), "next", term2645920);
        setIntField(term2645850, term2645850.getClass(), "type", 40);
        setField(term2645780, term2645780.getClass(), "first", term2645850);
        setField(term2645710, term2645710.getClass(), "first", term2645780);
        term2646713 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2646713, term2646713.getClass(), "currentTraversal", null);
        term2646714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2646715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2646716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2646717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2646714, term2646714.getClass(), "type", 37);
        setField(term2646714, term2646714.getClass(), "next", null);
        setIntField(term2646715, term2646715.getClass(), "type", 35);
        setField(term2646715, term2646715.getClass(), "next", null);
        setIntField(term2646716, term2646716.getClass(), "type", 40);
        setIntField(term2646717, term2646717.getClass(), "type", 0);
        setField(term2646717, term2646717.getClass(), "next", null);
        setField(term2646717, term2646717.getClass(), "first", null);
        setField(term2646717, term2646717.getClass(), "last", null);
        setField(term2646717, term2646717.getClass(), "propListHead", null);
        setIntField(term2646717, term2646717.getClass(), "sourcePosition", 0);
        setField(term2646717, term2646717.getClass(), "jsType", null);
        setField(term2646717, term2646717.getClass(), "parent", null);
        setField(term2646716, term2646716.getClass(), "next", term2646717);
        setField(term2646716, term2646716.getClass(), "first", null);
        setField(term2646716, term2646716.getClass(), "last", null);
        setField(term2646716, term2646716.getClass(), "propListHead", null);
        setIntField(term2646716, term2646716.getClass(), "sourcePosition", 0);
        setField(term2646716, term2646716.getClass(), "jsType", null);
        setField(term2646716, term2646716.getClass(), "parent", null);
        setField(term2646715, term2646715.getClass(), "first", term2646716);
        setField(term2646715, term2646715.getClass(), "last", null);
        setField(term2646715, term2646715.getClass(), "propListHead", null);
        setIntField(term2646715, term2646715.getClass(), "sourcePosition", 0);
        setField(term2646715, term2646715.getClass(), "jsType", null);
        setField(term2646715, term2646715.getClass(), "parent", null);
        setField(term2646714, term2646714.getClass(), "first", term2646715);
        setField(term2646714, term2646714.getClass(), "last", null);
        setField(term2646714, term2646714.getClass(), "propListHead", null);
        setIntField(term2646714, term2646714.getClass(), "sourcePosition", 0);
        setField(term2646714, term2646714.getClass(), "jsType", null);
        setField(term2646714, term2646714.getClass(), "parent", null);
        term2646656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2646658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2646660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2646662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2646656, term2646656.getClass(), "type", 37);
        setField(term2646656, term2646656.getClass(), "next", null);
        setIntField(term2646658, term2646658.getClass(), "type", 35);
        setField(term2646658, term2646658.getClass(), "next", null);
        setIntField(term2646660, term2646660.getClass(), "type", 40);
        setIntField(term2646662, term2646662.getClass(), "type", 0);
        setField(term2646662, term2646662.getClass(), "next", null);
        setField(term2646662, term2646662.getClass(), "first", null);
        setField(term2646662, term2646662.getClass(), "last", null);
        setField(term2646662, term2646662.getClass(), "propListHead", null);
        setIntField(term2646662, term2646662.getClass(), "sourcePosition", 0);
        setField(term2646662, term2646662.getClass(), "jsType", null);
        setField(term2646662, term2646662.getClass(), "parent", null);
        setField(term2646660, term2646660.getClass(), "next", term2646662);
        setField(term2646660, term2646660.getClass(), "first", null);
        setField(term2646660, term2646660.getClass(), "last", null);
        setField(term2646660, term2646660.getClass(), "propListHead", null);
        setIntField(term2646660, term2646660.getClass(), "sourcePosition", 0);
        setField(term2646660, term2646660.getClass(), "jsType", null);
        setField(term2646660, term2646660.getClass(), "parent", null);
        setField(term2646658, term2646658.getClass(), "first", term2646660);
        setField(term2646658, term2646658.getClass(), "last", null);
        setField(term2646658, term2646658.getClass(), "propListHead", null);
        setIntField(term2646658, term2646658.getClass(), "sourcePosition", 0);
        setField(term2646658, term2646658.getClass(), "jsType", null);
        setField(term2646658, term2646658.getClass(), "parent", null);
        setField(term2646656, term2646656.getClass(), "first", term2646658);
        setField(term2646656, term2646656.getClass(), "last", null);
        setField(term2646656, term2646656.getClass(), "propListHead", null);
        setIntField(term2646656, term2646656.getClass(), "sourcePosition", 0);
        setField(term2646656, term2646656.getClass(), "jsType", null);
        setField(term2646656, term2646656.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2645710;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2645640, args);
        assertTrue(recursiveEquals(term2645640, term2646713));
        assertTrue(recursiveEquals(term2645710, term2646714));
        assertTrue(recursiveEquals(retValue, term2646656));
    }

};


