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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3530006;
     Object term3530098;
     Object term3530782;
     Object term3530783;
     Object term3530521;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3530006 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3530098 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3530190 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3530282 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3530374 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3530498 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3530190, term3530190.getClass(), "type", 35);
        setIntField(term3530374, term3530374.getClass(), "type", 40);
        setField(term3530374, term3530374.getClass(), "str", "");
        setField(term3530282, term3530282.getClass(), "next", term3530374);
        setIntField(term3530282, term3530282.getClass(), "type", 40);
        setField(term3530190, term3530190.getClass(), "first", term3530282);
        setIntField(term3530498, term3530498.getClass(), "type", 43);
        setField(term3530190, term3530190.getClass(), "next", term3530498);
        setField(term3530098, term3530098.getClass(), "first", term3530190);
        setIntField(term3530098, term3530098.getClass(), "type", 37);
        term3530782 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3530782, term3530782.getClass(), "currentTraversal", null);
        term3530783 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3530784 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3530785 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3530786 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3530787 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3530783, term3530783.getClass(), "str", null);
        setIntField(term3530783, term3530783.getClass(), "type", 37);
        setField(term3530783, term3530783.getClass(), "next", null);
        setField(term3530784, term3530784.getClass(), "str", null);
        setIntField(term3530784, term3530784.getClass(), "type", 35);
        setField(term3530785, term3530785.getClass(), "functionName", null);
        setBooleanField(term3530785, term3530785.getClass(), "itsNeedsActivation", false);
        setIntField(term3530785, term3530785.getClass(), "itsFunctionType", 0);
        setBooleanField(term3530785, term3530785.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3530785, term3530785.getClass(), "encodedSourceStart", 0);
        setIntField(term3530785, term3530785.getClass(), "encodedSourceEnd", 0);
        setField(term3530785, term3530785.getClass(), "sourceName", null);
        setIntField(term3530785, term3530785.getClass(), "baseLineno", 0);
        setIntField(term3530785, term3530785.getClass(), "endLineno", 0);
        setField(term3530785, term3530785.getClass(), "functions", null);
        setField(term3530785, term3530785.getClass(), "regexps", null);
        setField(term3530785, term3530785.getClass(), "itsVariables", null);
        setField(term3530785, term3530785.getClass(), "itsConst", null);
        setField(term3530785, term3530785.getClass(), "itsVariableNames", null);
        setIntField(term3530785, term3530785.getClass(), "varStart", 0);
        setField(term3530785, term3530785.getClass(), "compilerData", null);
        setIntField(term3530785, term3530785.getClass(), "type", 43);
        setField(term3530785, term3530785.getClass(), "next", null);
        setField(term3530785, term3530785.getClass(), "first", null);
        setField(term3530785, term3530785.getClass(), "last", null);
        setField(term3530785, term3530785.getClass(), "propListHead", null);
        setIntField(term3530785, term3530785.getClass(), "sourcePosition", 0);
        setField(term3530785, term3530785.getClass(), "jsType", null);
        setField(term3530785, term3530785.getClass(), "parent", null);
        setField(term3530784, term3530784.getClass(), "next", term3530785);
        setField(term3530786, term3530786.getClass(), "str", null);
        setIntField(term3530786, term3530786.getClass(), "type", 40);
        setField(term3530787, term3530787.getClass(), "str", "");
        setIntField(term3530787, term3530787.getClass(), "type", 40);
        setField(term3530787, term3530787.getClass(), "next", null);
        setField(term3530787, term3530787.getClass(), "first", null);
        setField(term3530787, term3530787.getClass(), "last", null);
        setField(term3530787, term3530787.getClass(), "propListHead", null);
        setIntField(term3530787, term3530787.getClass(), "sourcePosition", 0);
        setField(term3530787, term3530787.getClass(), "jsType", null);
        setField(term3530787, term3530787.getClass(), "parent", null);
        setField(term3530786, term3530786.getClass(), "next", term3530787);
        setField(term3530786, term3530786.getClass(), "first", null);
        setField(term3530786, term3530786.getClass(), "last", null);
        setField(term3530786, term3530786.getClass(), "propListHead", null);
        setIntField(term3530786, term3530786.getClass(), "sourcePosition", 0);
        setField(term3530786, term3530786.getClass(), "jsType", null);
        setField(term3530786, term3530786.getClass(), "parent", null);
        setField(term3530784, term3530784.getClass(), "first", term3530786);
        setField(term3530784, term3530784.getClass(), "last", null);
        setField(term3530784, term3530784.getClass(), "propListHead", null);
        setIntField(term3530784, term3530784.getClass(), "sourcePosition", 0);
        setField(term3530784, term3530784.getClass(), "jsType", null);
        setField(term3530784, term3530784.getClass(), "parent", null);
        setField(term3530783, term3530783.getClass(), "first", term3530784);
        setField(term3530783, term3530783.getClass(), "last", null);
        setField(term3530783, term3530783.getClass(), "propListHead", null);
        setIntField(term3530783, term3530783.getClass(), "sourcePosition", 0);
        setField(term3530783, term3530783.getClass(), "jsType", null);
        setField(term3530783, term3530783.getClass(), "parent", null);
        term3530521 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3530523 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3530525 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3530536 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3530538 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3530521, term3530521.getClass(), "str", null);
        setIntField(term3530521, term3530521.getClass(), "type", 37);
        setField(term3530521, term3530521.getClass(), "next", null);
        setField(term3530523, term3530523.getClass(), "str", null);
        setIntField(term3530523, term3530523.getClass(), "type", 35);
        setField(term3530525, term3530525.getClass(), "functionName", null);
        setBooleanField(term3530525, term3530525.getClass(), "itsNeedsActivation", false);
        setIntField(term3530525, term3530525.getClass(), "itsFunctionType", 0);
        setBooleanField(term3530525, term3530525.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3530525, term3530525.getClass(), "encodedSourceStart", 0);
        setIntField(term3530525, term3530525.getClass(), "encodedSourceEnd", 0);
        setField(term3530525, term3530525.getClass(), "sourceName", null);
        setIntField(term3530525, term3530525.getClass(), "baseLineno", 0);
        setIntField(term3530525, term3530525.getClass(), "endLineno", 0);
        setField(term3530525, term3530525.getClass(), "functions", null);
        setField(term3530525, term3530525.getClass(), "regexps", null);
        setField(term3530525, term3530525.getClass(), "itsVariables", null);
        setField(term3530525, term3530525.getClass(), "itsConst", null);
        setField(term3530525, term3530525.getClass(), "itsVariableNames", null);
        setIntField(term3530525, term3530525.getClass(), "varStart", 0);
        setField(term3530525, term3530525.getClass(), "compilerData", null);
        setIntField(term3530525, term3530525.getClass(), "type", 43);
        setField(term3530525, term3530525.getClass(), "next", null);
        setField(term3530525, term3530525.getClass(), "first", null);
        setField(term3530525, term3530525.getClass(), "last", null);
        setField(term3530525, term3530525.getClass(), "propListHead", null);
        setIntField(term3530525, term3530525.getClass(), "sourcePosition", 0);
        setField(term3530525, term3530525.getClass(), "jsType", null);
        setField(term3530525, term3530525.getClass(), "parent", null);
        setField(term3530523, term3530523.getClass(), "next", term3530525);
        setField(term3530536, term3530536.getClass(), "str", null);
        setIntField(term3530536, term3530536.getClass(), "type", 40);
        setField(term3530538, term3530538.getClass(), "str", "");
        setIntField(term3530538, term3530538.getClass(), "type", 40);
        setField(term3530538, term3530538.getClass(), "next", null);
        setField(term3530538, term3530538.getClass(), "first", null);
        setField(term3530538, term3530538.getClass(), "last", null);
        setField(term3530538, term3530538.getClass(), "propListHead", null);
        setIntField(term3530538, term3530538.getClass(), "sourcePosition", 0);
        setField(term3530538, term3530538.getClass(), "jsType", null);
        setField(term3530538, term3530538.getClass(), "parent", null);
        setField(term3530536, term3530536.getClass(), "next", term3530538);
        setField(term3530536, term3530536.getClass(), "first", null);
        setField(term3530536, term3530536.getClass(), "last", null);
        setField(term3530536, term3530536.getClass(), "propListHead", null);
        setIntField(term3530536, term3530536.getClass(), "sourcePosition", 0);
        setField(term3530536, term3530536.getClass(), "jsType", null);
        setField(term3530536, term3530536.getClass(), "parent", null);
        setField(term3530523, term3530523.getClass(), "first", term3530536);
        setField(term3530523, term3530523.getClass(), "last", null);
        setField(term3530523, term3530523.getClass(), "propListHead", null);
        setIntField(term3530523, term3530523.getClass(), "sourcePosition", 0);
        setField(term3530523, term3530523.getClass(), "jsType", null);
        setField(term3530523, term3530523.getClass(), "parent", null);
        setField(term3530521, term3530521.getClass(), "first", term3530523);
        setField(term3530521, term3530521.getClass(), "last", null);
        setField(term3530521, term3530521.getClass(), "propListHead", null);
        setIntField(term3530521, term3530521.getClass(), "sourcePosition", 0);
        setField(term3530521, term3530521.getClass(), "jsType", null);
        setField(term3530521, term3530521.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3530098;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3530006, args);
        assertTrue(recursiveEquals(term3530006, term3530782));
        assertTrue(recursiveEquals(term3530098, term3530783));
        assertTrue(recursiveEquals(retValue, term3530521));
    }

};


