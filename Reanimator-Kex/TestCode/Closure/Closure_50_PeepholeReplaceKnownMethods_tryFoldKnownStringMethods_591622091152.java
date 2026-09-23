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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38833;
     Object term38919;
     Object term40673;
     Object term40674;
     Object term40639;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38833 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term38919 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term39011 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term38919, term38919.getClass(), "type", 37);
        setField(term38919, term38919.getClass(), "first", term39011);
        term40673 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term40673, term40673.getClass(), "currentTraversal", null);
        term40674 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term40675 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term40674, term40674.getClass(), "functionName", null);
        setBooleanField(term40674, term40674.getClass(), "itsNeedsActivation", false);
        setIntField(term40674, term40674.getClass(), "itsFunctionType", 0);
        setBooleanField(term40674, term40674.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term40674, term40674.getClass(), "encodedSourceStart", 0);
        setIntField(term40674, term40674.getClass(), "encodedSourceEnd", 0);
        setField(term40674, term40674.getClass(), "sourceName", null);
        setIntField(term40674, term40674.getClass(), "baseLineno", 0);
        setIntField(term40674, term40674.getClass(), "endLineno", 0);
        setField(term40674, term40674.getClass(), "functions", null);
        setField(term40674, term40674.getClass(), "regexps", null);
        setField(term40674, term40674.getClass(), "itsVariables", null);
        setField(term40674, term40674.getClass(), "itsConst", null);
        setField(term40674, term40674.getClass(), "itsVariableNames", null);
        setIntField(term40674, term40674.getClass(), "varStart", 0);
        setField(term40674, term40674.getClass(), "compilerData", null);
        setIntField(term40674, term40674.getClass(), "type", 37);
        setField(term40674, term40674.getClass(), "next", null);
        setDoubleField(term40675, term40675.getClass(), "number", 0.0);
        setIntField(term40675, term40675.getClass(), "type", 0);
        setField(term40675, term40675.getClass(), "next", null);
        setField(term40675, term40675.getClass(), "first", null);
        setField(term40675, term40675.getClass(), "last", null);
        setField(term40675, term40675.getClass(), "propListHead", null);
        setIntField(term40675, term40675.getClass(), "sourcePosition", 0);
        setField(term40675, term40675.getClass(), "jsType", null);
        setField(term40675, term40675.getClass(), "parent", null);
        setField(term40674, term40674.getClass(), "first", term40675);
        setField(term40674, term40674.getClass(), "last", null);
        setField(term40674, term40674.getClass(), "propListHead", null);
        setIntField(term40674, term40674.getClass(), "sourcePosition", 0);
        setField(term40674, term40674.getClass(), "jsType", null);
        setField(term40674, term40674.getClass(), "parent", null);
        term40639 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term40649 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term40639, term40639.getClass(), "functionName", null);
        setBooleanField(term40639, term40639.getClass(), "itsNeedsActivation", false);
        setIntField(term40639, term40639.getClass(), "itsFunctionType", 0);
        setBooleanField(term40639, term40639.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term40639, term40639.getClass(), "encodedSourceStart", 0);
        setIntField(term40639, term40639.getClass(), "encodedSourceEnd", 0);
        setField(term40639, term40639.getClass(), "sourceName", null);
        setIntField(term40639, term40639.getClass(), "baseLineno", 0);
        setIntField(term40639, term40639.getClass(), "endLineno", 0);
        setField(term40639, term40639.getClass(), "functions", null);
        setField(term40639, term40639.getClass(), "regexps", null);
        setField(term40639, term40639.getClass(), "itsVariables", null);
        setField(term40639, term40639.getClass(), "itsConst", null);
        setField(term40639, term40639.getClass(), "itsVariableNames", null);
        setIntField(term40639, term40639.getClass(), "varStart", 0);
        setField(term40639, term40639.getClass(), "compilerData", null);
        setIntField(term40639, term40639.getClass(), "type", 37);
        setField(term40639, term40639.getClass(), "next", null);
        setDoubleField(term40649, term40649.getClass(), "number", 0.0);
        setIntField(term40649, term40649.getClass(), "type", 0);
        setField(term40649, term40649.getClass(), "next", null);
        setField(term40649, term40649.getClass(), "first", null);
        setField(term40649, term40649.getClass(), "last", null);
        setField(term40649, term40649.getClass(), "propListHead", null);
        setIntField(term40649, term40649.getClass(), "sourcePosition", 0);
        setField(term40649, term40649.getClass(), "jsType", null);
        setField(term40649, term40649.getClass(), "parent", null);
        setField(term40639, term40639.getClass(), "first", term40649);
        setField(term40639, term40639.getClass(), "last", null);
        setField(term40639, term40639.getClass(), "propListHead", null);
        setIntField(term40639, term40639.getClass(), "sourcePosition", 0);
        setField(term40639, term40639.getClass(), "jsType", null);
        setField(term40639, term40639.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term38919;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term38833, args);
        assertTrue(recursiveEquals(term38833, term40673));
        assertTrue(recursiveEquals(term38919, term40674));
        assertTrue(recursiveEquals(retValue, term40639));
    }

};


