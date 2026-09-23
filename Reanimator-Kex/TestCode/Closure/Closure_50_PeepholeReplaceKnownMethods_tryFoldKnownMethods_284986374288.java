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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1215554;
     Object term1215646;
     Object term1217734;
     Object term1217735;
     Object term1217611;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1215554 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term1215646 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1215738 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1215830 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1215922 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term1215738, term1215738.getClass(), "type", 35);
        setField(term1215830, term1215830.getClass(), "next", term1215922);
        setIntField(term1215830, term1215830.getClass(), "type", 40);
        setField(term1215738, term1215738.getClass(), "first", term1215830);
        setField(term1215646, term1215646.getClass(), "first", term1215738);
        setIntField(term1215646, term1215646.getClass(), "type", 37);
        term1217734 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term1217734, term1217734.getClass(), "currentTraversal", null);
        term1217735 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1217736 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1217737 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1217738 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term1217735, term1217735.getClass(), "str", null);
        setIntField(term1217735, term1217735.getClass(), "type", 37);
        setField(term1217735, term1217735.getClass(), "next", null);
        setField(term1217736, term1217736.getClass(), "str", null);
        setIntField(term1217736, term1217736.getClass(), "type", 35);
        setField(term1217736, term1217736.getClass(), "next", null);
        setField(term1217737, term1217737.getClass(), "str", null);
        setIntField(term1217737, term1217737.getClass(), "type", 40);
        setField(term1217738, term1217738.getClass(), "str", null);
        setIntField(term1217738, term1217738.getClass(), "type", 0);
        setField(term1217738, term1217738.getClass(), "next", null);
        setField(term1217738, term1217738.getClass(), "first", null);
        setField(term1217738, term1217738.getClass(), "last", null);
        setField(term1217738, term1217738.getClass(), "propListHead", null);
        setIntField(term1217738, term1217738.getClass(), "sourcePosition", 0);
        setField(term1217738, term1217738.getClass(), "jsType", null);
        setField(term1217738, term1217738.getClass(), "parent", null);
        setField(term1217737, term1217737.getClass(), "next", term1217738);
        setField(term1217737, term1217737.getClass(), "first", null);
        setField(term1217737, term1217737.getClass(), "last", null);
        setField(term1217737, term1217737.getClass(), "propListHead", null);
        setIntField(term1217737, term1217737.getClass(), "sourcePosition", 0);
        setField(term1217737, term1217737.getClass(), "jsType", null);
        setField(term1217737, term1217737.getClass(), "parent", null);
        setField(term1217736, term1217736.getClass(), "first", term1217737);
        setField(term1217736, term1217736.getClass(), "last", null);
        setField(term1217736, term1217736.getClass(), "propListHead", null);
        setIntField(term1217736, term1217736.getClass(), "sourcePosition", 0);
        setField(term1217736, term1217736.getClass(), "jsType", null);
        setField(term1217736, term1217736.getClass(), "parent", null);
        setField(term1217735, term1217735.getClass(), "first", term1217736);
        setField(term1217735, term1217735.getClass(), "last", null);
        setField(term1217735, term1217735.getClass(), "propListHead", null);
        setIntField(term1217735, term1217735.getClass(), "sourcePosition", 0);
        setField(term1217735, term1217735.getClass(), "jsType", null);
        setField(term1217735, term1217735.getClass(), "parent", null);
        term1217611 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1217613 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1217615 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1217617 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term1217611, term1217611.getClass(), "str", null);
        setIntField(term1217611, term1217611.getClass(), "type", 37);
        setField(term1217611, term1217611.getClass(), "next", null);
        setField(term1217613, term1217613.getClass(), "str", null);
        setIntField(term1217613, term1217613.getClass(), "type", 35);
        setField(term1217613, term1217613.getClass(), "next", null);
        setField(term1217615, term1217615.getClass(), "str", null);
        setIntField(term1217615, term1217615.getClass(), "type", 40);
        setField(term1217617, term1217617.getClass(), "str", null);
        setIntField(term1217617, term1217617.getClass(), "type", 0);
        setField(term1217617, term1217617.getClass(), "next", null);
        setField(term1217617, term1217617.getClass(), "first", null);
        setField(term1217617, term1217617.getClass(), "last", null);
        setField(term1217617, term1217617.getClass(), "propListHead", null);
        setIntField(term1217617, term1217617.getClass(), "sourcePosition", 0);
        setField(term1217617, term1217617.getClass(), "jsType", null);
        setField(term1217617, term1217617.getClass(), "parent", null);
        setField(term1217615, term1217615.getClass(), "next", term1217617);
        setField(term1217615, term1217615.getClass(), "first", null);
        setField(term1217615, term1217615.getClass(), "last", null);
        setField(term1217615, term1217615.getClass(), "propListHead", null);
        setIntField(term1217615, term1217615.getClass(), "sourcePosition", 0);
        setField(term1217615, term1217615.getClass(), "jsType", null);
        setField(term1217615, term1217615.getClass(), "parent", null);
        setField(term1217613, term1217613.getClass(), "first", term1217615);
        setField(term1217613, term1217613.getClass(), "last", null);
        setField(term1217613, term1217613.getClass(), "propListHead", null);
        setIntField(term1217613, term1217613.getClass(), "sourcePosition", 0);
        setField(term1217613, term1217613.getClass(), "jsType", null);
        setField(term1217613, term1217613.getClass(), "parent", null);
        setField(term1217611, term1217611.getClass(), "first", term1217613);
        setField(term1217611, term1217611.getClass(), "last", null);
        setField(term1217611, term1217611.getClass(), "propListHead", null);
        setIntField(term1217611, term1217611.getClass(), "sourcePosition", 0);
        setField(term1217611, term1217611.getClass(), "jsType", null);
        setField(term1217611, term1217611.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1215646;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term1215554, args);
        assertTrue(recursiveEquals(term1215554, term1217734));
        assertTrue(recursiveEquals(term1215646, term1217735));
        assertTrue(recursiveEquals(retValue, term1217611));
    }

};


