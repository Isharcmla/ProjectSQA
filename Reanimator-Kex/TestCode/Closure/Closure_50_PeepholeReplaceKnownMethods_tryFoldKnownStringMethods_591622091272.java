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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1198329;
     Object term1198421;
     Object term1198640;
     Object term1198641;
     Object term1198579;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1198329 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term1198421 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1198507 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term1198577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1198421, term1198421.getClass(), "type", 37);
        setIntField(term1198507, term1198507.getClass(), "type", 35);
        setField(term1198507, term1198507.getClass(), "first", term1198577);
        setField(term1198421, term1198421.getClass(), "first", term1198507);
        term1198640 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term1198640, term1198640.getClass(), "currentTraversal", null);
        term1198641 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1198642 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term1198643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1198641, term1198641.getClass(), "str", null);
        setIntField(term1198641, term1198641.getClass(), "type", 37);
        setField(term1198641, term1198641.getClass(), "next", null);
        setField(term1198642, term1198642.getClass(), "functionName", null);
        setBooleanField(term1198642, term1198642.getClass(), "itsNeedsActivation", false);
        setIntField(term1198642, term1198642.getClass(), "itsFunctionType", 0);
        setBooleanField(term1198642, term1198642.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term1198642, term1198642.getClass(), "encodedSourceStart", 0);
        setIntField(term1198642, term1198642.getClass(), "encodedSourceEnd", 0);
        setField(term1198642, term1198642.getClass(), "sourceName", null);
        setIntField(term1198642, term1198642.getClass(), "baseLineno", 0);
        setIntField(term1198642, term1198642.getClass(), "endLineno", 0);
        setField(term1198642, term1198642.getClass(), "functions", null);
        setField(term1198642, term1198642.getClass(), "regexps", null);
        setField(term1198642, term1198642.getClass(), "itsVariables", null);
        setField(term1198642, term1198642.getClass(), "itsConst", null);
        setField(term1198642, term1198642.getClass(), "itsVariableNames", null);
        setIntField(term1198642, term1198642.getClass(), "varStart", 0);
        setField(term1198642, term1198642.getClass(), "compilerData", null);
        setIntField(term1198642, term1198642.getClass(), "type", 35);
        setField(term1198642, term1198642.getClass(), "next", null);
        setIntField(term1198643, term1198643.getClass(), "type", 0);
        setField(term1198643, term1198643.getClass(), "next", null);
        setField(term1198643, term1198643.getClass(), "first", null);
        setField(term1198643, term1198643.getClass(), "last", null);
        setField(term1198643, term1198643.getClass(), "propListHead", null);
        setIntField(term1198643, term1198643.getClass(), "sourcePosition", 0);
        setField(term1198643, term1198643.getClass(), "jsType", null);
        setField(term1198643, term1198643.getClass(), "parent", null);
        setField(term1198642, term1198642.getClass(), "first", term1198643);
        setField(term1198642, term1198642.getClass(), "last", null);
        setField(term1198642, term1198642.getClass(), "propListHead", null);
        setIntField(term1198642, term1198642.getClass(), "sourcePosition", 0);
        setField(term1198642, term1198642.getClass(), "jsType", null);
        setField(term1198642, term1198642.getClass(), "parent", null);
        setField(term1198641, term1198641.getClass(), "first", term1198642);
        setField(term1198641, term1198641.getClass(), "last", null);
        setField(term1198641, term1198641.getClass(), "propListHead", null);
        setIntField(term1198641, term1198641.getClass(), "sourcePosition", 0);
        setField(term1198641, term1198641.getClass(), "jsType", null);
        setField(term1198641, term1198641.getClass(), "parent", null);
        term1198579 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1198581 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term1198591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1198579, term1198579.getClass(), "str", null);
        setIntField(term1198579, term1198579.getClass(), "type", 37);
        setField(term1198579, term1198579.getClass(), "next", null);
        setField(term1198581, term1198581.getClass(), "functionName", null);
        setBooleanField(term1198581, term1198581.getClass(), "itsNeedsActivation", false);
        setIntField(term1198581, term1198581.getClass(), "itsFunctionType", 0);
        setBooleanField(term1198581, term1198581.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term1198581, term1198581.getClass(), "encodedSourceStart", 0);
        setIntField(term1198581, term1198581.getClass(), "encodedSourceEnd", 0);
        setField(term1198581, term1198581.getClass(), "sourceName", null);
        setIntField(term1198581, term1198581.getClass(), "baseLineno", 0);
        setIntField(term1198581, term1198581.getClass(), "endLineno", 0);
        setField(term1198581, term1198581.getClass(), "functions", null);
        setField(term1198581, term1198581.getClass(), "regexps", null);
        setField(term1198581, term1198581.getClass(), "itsVariables", null);
        setField(term1198581, term1198581.getClass(), "itsConst", null);
        setField(term1198581, term1198581.getClass(), "itsVariableNames", null);
        setIntField(term1198581, term1198581.getClass(), "varStart", 0);
        setField(term1198581, term1198581.getClass(), "compilerData", null);
        setIntField(term1198581, term1198581.getClass(), "type", 35);
        setField(term1198581, term1198581.getClass(), "next", null);
        setIntField(term1198591, term1198591.getClass(), "type", 0);
        setField(term1198591, term1198591.getClass(), "next", null);
        setField(term1198591, term1198591.getClass(), "first", null);
        setField(term1198591, term1198591.getClass(), "last", null);
        setField(term1198591, term1198591.getClass(), "propListHead", null);
        setIntField(term1198591, term1198591.getClass(), "sourcePosition", 0);
        setField(term1198591, term1198591.getClass(), "jsType", null);
        setField(term1198591, term1198591.getClass(), "parent", null);
        setField(term1198581, term1198581.getClass(), "first", term1198591);
        setField(term1198581, term1198581.getClass(), "last", null);
        setField(term1198581, term1198581.getClass(), "propListHead", null);
        setIntField(term1198581, term1198581.getClass(), "sourcePosition", 0);
        setField(term1198581, term1198581.getClass(), "jsType", null);
        setField(term1198581, term1198581.getClass(), "parent", null);
        setField(term1198579, term1198579.getClass(), "first", term1198581);
        setField(term1198579, term1198579.getClass(), "last", null);
        setField(term1198579, term1198579.getClass(), "propListHead", null);
        setIntField(term1198579, term1198579.getClass(), "sourcePosition", 0);
        setField(term1198579, term1198579.getClass(), "jsType", null);
        setField(term1198579, term1198579.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1198421;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term1198329, args);
        assertTrue(recursiveEquals(term1198329, term1198640));
        assertTrue(recursiveEquals(term1198421, term1198641));
        assertTrue(recursiveEquals(retValue, term1198579));
    }

};


