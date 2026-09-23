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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2693593;
     Object term2693679;
     Object term2694426;
     Object term2694427;
     Object term2694341;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2693593 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2693679 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2693771 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2693863 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2693955 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2694025 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2693679, term2693679.getClass(), "type", 37);
        setIntField(term2693771, term2693771.getClass(), "type", 33);
        setIntField(term2693955, term2693955.getClass(), "type", 40);
        setField(term2693955, term2693955.getClass(), "str", null);
        setField(term2693863, term2693863.getClass(), "next", term2693955);
        setIntField(term2693863, term2693863.getClass(), "type", 40);
        setField(term2693771, term2693771.getClass(), "first", term2693863);
        setField(term2693771, term2693771.getClass(), "next", term2694025);
        setField(term2693679, term2693679.getClass(), "first", term2693771);
        term2694426 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2694426, term2694426.getClass(), "currentTraversal", null);
        term2694427 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2694428 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2694429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2694430 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2694431 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term2694427, term2694427.getClass(), "functionName", null);
        setBooleanField(term2694427, term2694427.getClass(), "itsNeedsActivation", false);
        setIntField(term2694427, term2694427.getClass(), "itsFunctionType", 0);
        setBooleanField(term2694427, term2694427.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2694427, term2694427.getClass(), "encodedSourceStart", 0);
        setIntField(term2694427, term2694427.getClass(), "encodedSourceEnd", 0);
        setField(term2694427, term2694427.getClass(), "sourceName", null);
        setIntField(term2694427, term2694427.getClass(), "baseLineno", 0);
        setIntField(term2694427, term2694427.getClass(), "endLineno", 0);
        setField(term2694427, term2694427.getClass(), "functions", null);
        setField(term2694427, term2694427.getClass(), "regexps", null);
        setField(term2694427, term2694427.getClass(), "itsVariables", null);
        setField(term2694427, term2694427.getClass(), "itsConst", null);
        setField(term2694427, term2694427.getClass(), "itsVariableNames", null);
        setIntField(term2694427, term2694427.getClass(), "varStart", 0);
        setField(term2694427, term2694427.getClass(), "compilerData", null);
        setIntField(term2694427, term2694427.getClass(), "type", 37);
        setField(term2694427, term2694427.getClass(), "next", null);
        setField(term2694428, term2694428.getClass(), "str", null);
        setIntField(term2694428, term2694428.getClass(), "type", 33);
        setIntField(term2694429, term2694429.getClass(), "type", 0);
        setField(term2694429, term2694429.getClass(), "next", null);
        setField(term2694429, term2694429.getClass(), "first", null);
        setField(term2694429, term2694429.getClass(), "last", null);
        setField(term2694429, term2694429.getClass(), "propListHead", null);
        setIntField(term2694429, term2694429.getClass(), "sourcePosition", 0);
        setField(term2694429, term2694429.getClass(), "jsType", null);
        setField(term2694429, term2694429.getClass(), "parent", null);
        setField(term2694428, term2694428.getClass(), "next", term2694429);
        setField(term2694430, term2694430.getClass(), "str", null);
        setIntField(term2694430, term2694430.getClass(), "type", 40);
        setField(term2694431, term2694431.getClass(), "str", null);
        setIntField(term2694431, term2694431.getClass(), "type", 40);
        setField(term2694431, term2694431.getClass(), "next", null);
        setField(term2694431, term2694431.getClass(), "first", null);
        setField(term2694431, term2694431.getClass(), "last", null);
        setField(term2694431, term2694431.getClass(), "propListHead", null);
        setIntField(term2694431, term2694431.getClass(), "sourcePosition", 0);
        setField(term2694431, term2694431.getClass(), "jsType", null);
        setField(term2694431, term2694431.getClass(), "parent", null);
        setField(term2694430, term2694430.getClass(), "next", term2694431);
        setField(term2694430, term2694430.getClass(), "first", null);
        setField(term2694430, term2694430.getClass(), "last", null);
        setField(term2694430, term2694430.getClass(), "propListHead", null);
        setIntField(term2694430, term2694430.getClass(), "sourcePosition", 0);
        setField(term2694430, term2694430.getClass(), "jsType", null);
        setField(term2694430, term2694430.getClass(), "parent", null);
        setField(term2694428, term2694428.getClass(), "first", term2694430);
        setField(term2694428, term2694428.getClass(), "last", null);
        setField(term2694428, term2694428.getClass(), "propListHead", null);
        setIntField(term2694428, term2694428.getClass(), "sourcePosition", 0);
        setField(term2694428, term2694428.getClass(), "jsType", null);
        setField(term2694428, term2694428.getClass(), "parent", null);
        setField(term2694427, term2694427.getClass(), "first", term2694428);
        setField(term2694427, term2694427.getClass(), "last", null);
        setField(term2694427, term2694427.getClass(), "propListHead", null);
        setIntField(term2694427, term2694427.getClass(), "sourcePosition", 0);
        setField(term2694427, term2694427.getClass(), "jsType", null);
        setField(term2694427, term2694427.getClass(), "parent", null);
        term2694341 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2694351 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2694353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2694356 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2694358 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term2694341, term2694341.getClass(), "functionName", null);
        setBooleanField(term2694341, term2694341.getClass(), "itsNeedsActivation", false);
        setIntField(term2694341, term2694341.getClass(), "itsFunctionType", 0);
        setBooleanField(term2694341, term2694341.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2694341, term2694341.getClass(), "encodedSourceStart", 0);
        setIntField(term2694341, term2694341.getClass(), "encodedSourceEnd", 0);
        setField(term2694341, term2694341.getClass(), "sourceName", null);
        setIntField(term2694341, term2694341.getClass(), "baseLineno", 0);
        setIntField(term2694341, term2694341.getClass(), "endLineno", 0);
        setField(term2694341, term2694341.getClass(), "functions", null);
        setField(term2694341, term2694341.getClass(), "regexps", null);
        setField(term2694341, term2694341.getClass(), "itsVariables", null);
        setField(term2694341, term2694341.getClass(), "itsConst", null);
        setField(term2694341, term2694341.getClass(), "itsVariableNames", null);
        setIntField(term2694341, term2694341.getClass(), "varStart", 0);
        setField(term2694341, term2694341.getClass(), "compilerData", null);
        setIntField(term2694341, term2694341.getClass(), "type", 37);
        setField(term2694341, term2694341.getClass(), "next", null);
        setField(term2694351, term2694351.getClass(), "str", null);
        setIntField(term2694351, term2694351.getClass(), "type", 33);
        setIntField(term2694353, term2694353.getClass(), "type", 0);
        setField(term2694353, term2694353.getClass(), "next", null);
        setField(term2694353, term2694353.getClass(), "first", null);
        setField(term2694353, term2694353.getClass(), "last", null);
        setField(term2694353, term2694353.getClass(), "propListHead", null);
        setIntField(term2694353, term2694353.getClass(), "sourcePosition", 0);
        setField(term2694353, term2694353.getClass(), "jsType", null);
        setField(term2694353, term2694353.getClass(), "parent", null);
        setField(term2694351, term2694351.getClass(), "next", term2694353);
        setField(term2694356, term2694356.getClass(), "str", null);
        setIntField(term2694356, term2694356.getClass(), "type", 40);
        setField(term2694358, term2694358.getClass(), "str", null);
        setIntField(term2694358, term2694358.getClass(), "type", 40);
        setField(term2694358, term2694358.getClass(), "next", null);
        setField(term2694358, term2694358.getClass(), "first", null);
        setField(term2694358, term2694358.getClass(), "last", null);
        setField(term2694358, term2694358.getClass(), "propListHead", null);
        setIntField(term2694358, term2694358.getClass(), "sourcePosition", 0);
        setField(term2694358, term2694358.getClass(), "jsType", null);
        setField(term2694358, term2694358.getClass(), "parent", null);
        setField(term2694356, term2694356.getClass(), "next", term2694358);
        setField(term2694356, term2694356.getClass(), "first", null);
        setField(term2694356, term2694356.getClass(), "last", null);
        setField(term2694356, term2694356.getClass(), "propListHead", null);
        setIntField(term2694356, term2694356.getClass(), "sourcePosition", 0);
        setField(term2694356, term2694356.getClass(), "jsType", null);
        setField(term2694356, term2694356.getClass(), "parent", null);
        setField(term2694351, term2694351.getClass(), "first", term2694356);
        setField(term2694351, term2694351.getClass(), "last", null);
        setField(term2694351, term2694351.getClass(), "propListHead", null);
        setIntField(term2694351, term2694351.getClass(), "sourcePosition", 0);
        setField(term2694351, term2694351.getClass(), "jsType", null);
        setField(term2694351, term2694351.getClass(), "parent", null);
        setField(term2694341, term2694341.getClass(), "first", term2694351);
        setField(term2694341, term2694341.getClass(), "last", null);
        setField(term2694341, term2694341.getClass(), "propListHead", null);
        setIntField(term2694341, term2694341.getClass(), "sourcePosition", 0);
        setField(term2694341, term2694341.getClass(), "jsType", null);
        setField(term2694341, term2694341.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2693679;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2693593, args);
        assertTrue(recursiveEquals(term2693593, term2694426));
        assertTrue(recursiveEquals(term2693679, term2694427));
        assertTrue(recursiveEquals(retValue, term2694341));
    }

};


