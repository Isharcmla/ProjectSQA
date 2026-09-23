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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2636426;
     Object term2636512;
     Object term2637430;
     Object term2637431;
     Object term2637358;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2636426 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2636512 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2636604 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2636674 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2636766 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term2636512, term2636512.getClass(), "type", 37);
        setIntField(term2636604, term2636604.getClass(), "type", 33);
        setField(term2636674, term2636674.getClass(), "next", term2636766);
        setIntField(term2636674, term2636674.getClass(), "type", 40);
        setField(term2636604, term2636604.getClass(), "first", term2636674);
        setField(term2636512, term2636512.getClass(), "first", term2636604);
        term2637430 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2637430, term2637430.getClass(), "currentTraversal", null);
        term2637431 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2637432 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2637433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2637434 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term2637431, term2637431.getClass(), "functionName", null);
        setBooleanField(term2637431, term2637431.getClass(), "itsNeedsActivation", false);
        setIntField(term2637431, term2637431.getClass(), "itsFunctionType", 0);
        setBooleanField(term2637431, term2637431.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2637431, term2637431.getClass(), "encodedSourceStart", 0);
        setIntField(term2637431, term2637431.getClass(), "encodedSourceEnd", 0);
        setField(term2637431, term2637431.getClass(), "sourceName", null);
        setIntField(term2637431, term2637431.getClass(), "baseLineno", 0);
        setIntField(term2637431, term2637431.getClass(), "endLineno", 0);
        setField(term2637431, term2637431.getClass(), "functions", null);
        setField(term2637431, term2637431.getClass(), "regexps", null);
        setField(term2637431, term2637431.getClass(), "itsVariables", null);
        setField(term2637431, term2637431.getClass(), "itsConst", null);
        setField(term2637431, term2637431.getClass(), "itsVariableNames", null);
        setIntField(term2637431, term2637431.getClass(), "varStart", 0);
        setField(term2637431, term2637431.getClass(), "compilerData", null);
        setIntField(term2637431, term2637431.getClass(), "type", 37);
        setField(term2637431, term2637431.getClass(), "next", null);
        setDoubleField(term2637432, term2637432.getClass(), "number", 0.0);
        setIntField(term2637432, term2637432.getClass(), "type", 33);
        setField(term2637432, term2637432.getClass(), "next", null);
        setIntField(term2637433, term2637433.getClass(), "type", 40);
        setDoubleField(term2637434, term2637434.getClass(), "number", 0.0);
        setIntField(term2637434, term2637434.getClass(), "type", 0);
        setField(term2637434, term2637434.getClass(), "next", null);
        setField(term2637434, term2637434.getClass(), "first", null);
        setField(term2637434, term2637434.getClass(), "last", null);
        setField(term2637434, term2637434.getClass(), "propListHead", null);
        setIntField(term2637434, term2637434.getClass(), "sourcePosition", 0);
        setField(term2637434, term2637434.getClass(), "jsType", null);
        setField(term2637434, term2637434.getClass(), "parent", null);
        setField(term2637433, term2637433.getClass(), "next", term2637434);
        setField(term2637433, term2637433.getClass(), "first", null);
        setField(term2637433, term2637433.getClass(), "last", null);
        setField(term2637433, term2637433.getClass(), "propListHead", null);
        setIntField(term2637433, term2637433.getClass(), "sourcePosition", 0);
        setField(term2637433, term2637433.getClass(), "jsType", null);
        setField(term2637433, term2637433.getClass(), "parent", null);
        setField(term2637432, term2637432.getClass(), "first", term2637433);
        setField(term2637432, term2637432.getClass(), "last", null);
        setField(term2637432, term2637432.getClass(), "propListHead", null);
        setIntField(term2637432, term2637432.getClass(), "sourcePosition", 0);
        setField(term2637432, term2637432.getClass(), "jsType", null);
        setField(term2637432, term2637432.getClass(), "parent", null);
        setField(term2637431, term2637431.getClass(), "first", term2637432);
        setField(term2637431, term2637431.getClass(), "last", null);
        setField(term2637431, term2637431.getClass(), "propListHead", null);
        setIntField(term2637431, term2637431.getClass(), "sourcePosition", 0);
        setField(term2637431, term2637431.getClass(), "jsType", null);
        setField(term2637431, term2637431.getClass(), "parent", null);
        term2637358 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2637368 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2637371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2637373 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term2637358, term2637358.getClass(), "functionName", null);
        setBooleanField(term2637358, term2637358.getClass(), "itsNeedsActivation", false);
        setIntField(term2637358, term2637358.getClass(), "itsFunctionType", 0);
        setBooleanField(term2637358, term2637358.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2637358, term2637358.getClass(), "encodedSourceStart", 0);
        setIntField(term2637358, term2637358.getClass(), "encodedSourceEnd", 0);
        setField(term2637358, term2637358.getClass(), "sourceName", null);
        setIntField(term2637358, term2637358.getClass(), "baseLineno", 0);
        setIntField(term2637358, term2637358.getClass(), "endLineno", 0);
        setField(term2637358, term2637358.getClass(), "functions", null);
        setField(term2637358, term2637358.getClass(), "regexps", null);
        setField(term2637358, term2637358.getClass(), "itsVariables", null);
        setField(term2637358, term2637358.getClass(), "itsConst", null);
        setField(term2637358, term2637358.getClass(), "itsVariableNames", null);
        setIntField(term2637358, term2637358.getClass(), "varStart", 0);
        setField(term2637358, term2637358.getClass(), "compilerData", null);
        setIntField(term2637358, term2637358.getClass(), "type", 37);
        setField(term2637358, term2637358.getClass(), "next", null);
        setDoubleField(term2637368, term2637368.getClass(), "number", 0.0);
        setIntField(term2637368, term2637368.getClass(), "type", 33);
        setField(term2637368, term2637368.getClass(), "next", null);
        setIntField(term2637371, term2637371.getClass(), "type", 40);
        setDoubleField(term2637373, term2637373.getClass(), "number", 0.0);
        setIntField(term2637373, term2637373.getClass(), "type", 0);
        setField(term2637373, term2637373.getClass(), "next", null);
        setField(term2637373, term2637373.getClass(), "first", null);
        setField(term2637373, term2637373.getClass(), "last", null);
        setField(term2637373, term2637373.getClass(), "propListHead", null);
        setIntField(term2637373, term2637373.getClass(), "sourcePosition", 0);
        setField(term2637373, term2637373.getClass(), "jsType", null);
        setField(term2637373, term2637373.getClass(), "parent", null);
        setField(term2637371, term2637371.getClass(), "next", term2637373);
        setField(term2637371, term2637371.getClass(), "first", null);
        setField(term2637371, term2637371.getClass(), "last", null);
        setField(term2637371, term2637371.getClass(), "propListHead", null);
        setIntField(term2637371, term2637371.getClass(), "sourcePosition", 0);
        setField(term2637371, term2637371.getClass(), "jsType", null);
        setField(term2637371, term2637371.getClass(), "parent", null);
        setField(term2637368, term2637368.getClass(), "first", term2637371);
        setField(term2637368, term2637368.getClass(), "last", null);
        setField(term2637368, term2637368.getClass(), "propListHead", null);
        setIntField(term2637368, term2637368.getClass(), "sourcePosition", 0);
        setField(term2637368, term2637368.getClass(), "jsType", null);
        setField(term2637368, term2637368.getClass(), "parent", null);
        setField(term2637358, term2637358.getClass(), "first", term2637368);
        setField(term2637358, term2637358.getClass(), "last", null);
        setField(term2637358, term2637358.getClass(), "propListHead", null);
        setIntField(term2637358, term2637358.getClass(), "sourcePosition", 0);
        setField(term2637358, term2637358.getClass(), "jsType", null);
        setField(term2637358, term2637358.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2636512;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2636426, args);
        assertTrue(recursiveEquals(term2636426, term2637430));
        assertTrue(recursiveEquals(term2636512, term2637431));
        assertTrue(recursiveEquals(retValue, term2637358));
    }

};


