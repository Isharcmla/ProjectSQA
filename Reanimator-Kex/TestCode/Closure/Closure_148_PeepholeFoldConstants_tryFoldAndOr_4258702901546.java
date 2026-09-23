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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term388472;
     Object term388558;
     Object term388742;
     Object term388834;
     Object term388934;
     Object term388935;
     Object term388937;
     Object term388938;
     Object term388876;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term388472 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term388558 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term388650 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term388558, term388558.getClass(), "parent", term388650);
        setIntField(term388558, term388558.getClass(), "type", 0);
        term388742 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term388742, term388742.getClass(), "type", 0);
        term388834 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term388834, term388834.getClass(), "type", 44);
        term388934 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term388934, term388934.getClass(), "currentTraversal", null);
        term388935 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term388936 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term388935, term388935.getClass(), "functionName", null);
        setBooleanField(term388935, term388935.getClass(), "itsNeedsActivation", false);
        setIntField(term388935, term388935.getClass(), "itsFunctionType", 0);
        setBooleanField(term388935, term388935.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term388935, term388935.getClass(), "encodedSourceStart", 0);
        setIntField(term388935, term388935.getClass(), "encodedSourceEnd", 0);
        setField(term388935, term388935.getClass(), "sourceName", null);
        setIntField(term388935, term388935.getClass(), "baseLineno", 0);
        setIntField(term388935, term388935.getClass(), "endLineno", 0);
        setField(term388935, term388935.getClass(), "functions", null);
        setField(term388935, term388935.getClass(), "regexps", null);
        setField(term388935, term388935.getClass(), "itsVariables", null);
        setField(term388935, term388935.getClass(), "itsConst", null);
        setField(term388935, term388935.getClass(), "itsVariableNames", null);
        setIntField(term388935, term388935.getClass(), "varStart", 0);
        setField(term388935, term388935.getClass(), "compilerData", null);
        setIntField(term388935, term388935.getClass(), "type", 0);
        setField(term388935, term388935.getClass(), "next", null);
        setField(term388935, term388935.getClass(), "first", null);
        setField(term388935, term388935.getClass(), "last", null);
        setField(term388935, term388935.getClass(), "propListHead", null);
        setIntField(term388935, term388935.getClass(), "sourcePosition", 0);
        setField(term388935, term388935.getClass(), "jsType", null);
        setDoubleField(term388936, term388936.getClass(), "number", 0.0);
        setIntField(term388936, term388936.getClass(), "type", 0);
        setField(term388936, term388936.getClass(), "next", null);
        setField(term388936, term388936.getClass(), "first", null);
        setField(term388936, term388936.getClass(), "last", null);
        setField(term388936, term388936.getClass(), "propListHead", null);
        setIntField(term388936, term388936.getClass(), "sourcePosition", 0);
        setField(term388936, term388936.getClass(), "jsType", null);
        setField(term388936, term388936.getClass(), "parent", null);
        setField(term388935, term388935.getClass(), "parent", term388936);
        term388937 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term388937, term388937.getClass(), "number", 0.0);
        setIntField(term388937, term388937.getClass(), "type", 0);
        setField(term388937, term388937.getClass(), "next", null);
        setField(term388937, term388937.getClass(), "first", null);
        setField(term388937, term388937.getClass(), "last", null);
        setField(term388937, term388937.getClass(), "propListHead", null);
        setIntField(term388937, term388937.getClass(), "sourcePosition", 0);
        setField(term388937, term388937.getClass(), "jsType", null);
        setField(term388937, term388937.getClass(), "parent", null);
        term388938 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term388938, term388938.getClass(), "str", null);
        setIntField(term388938, term388938.getClass(), "type", 44);
        setField(term388938, term388938.getClass(), "next", null);
        setField(term388938, term388938.getClass(), "first", null);
        setField(term388938, term388938.getClass(), "last", null);
        setField(term388938, term388938.getClass(), "propListHead", null);
        setIntField(term388938, term388938.getClass(), "sourcePosition", 0);
        setField(term388938, term388938.getClass(), "jsType", null);
        setField(term388938, term388938.getClass(), "parent", null);
        term388876 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term388887 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term388876, term388876.getClass(), "functionName", null);
        setBooleanField(term388876, term388876.getClass(), "itsNeedsActivation", false);
        setIntField(term388876, term388876.getClass(), "itsFunctionType", 0);
        setBooleanField(term388876, term388876.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term388876, term388876.getClass(), "encodedSourceStart", 0);
        setIntField(term388876, term388876.getClass(), "encodedSourceEnd", 0);
        setField(term388876, term388876.getClass(), "sourceName", null);
        setIntField(term388876, term388876.getClass(), "baseLineno", 0);
        setIntField(term388876, term388876.getClass(), "endLineno", 0);
        setField(term388876, term388876.getClass(), "functions", null);
        setField(term388876, term388876.getClass(), "regexps", null);
        setField(term388876, term388876.getClass(), "itsVariables", null);
        setField(term388876, term388876.getClass(), "itsConst", null);
        setField(term388876, term388876.getClass(), "itsVariableNames", null);
        setIntField(term388876, term388876.getClass(), "varStart", 0);
        setField(term388876, term388876.getClass(), "compilerData", null);
        setIntField(term388876, term388876.getClass(), "type", 0);
        setField(term388876, term388876.getClass(), "next", null);
        setField(term388876, term388876.getClass(), "first", null);
        setField(term388876, term388876.getClass(), "last", null);
        setField(term388876, term388876.getClass(), "propListHead", null);
        setIntField(term388876, term388876.getClass(), "sourcePosition", 0);
        setField(term388876, term388876.getClass(), "jsType", null);
        setDoubleField(term388887, term388887.getClass(), "number", 0.0);
        setIntField(term388887, term388887.getClass(), "type", 0);
        setField(term388887, term388887.getClass(), "next", null);
        setField(term388887, term388887.getClass(), "first", null);
        setField(term388887, term388887.getClass(), "last", null);
        setField(term388887, term388887.getClass(), "propListHead", null);
        setIntField(term388887, term388887.getClass(), "sourcePosition", 0);
        setField(term388887, term388887.getClass(), "jsType", null);
        setField(term388887, term388887.getClass(), "parent", null);
        setField(term388876, term388876.getClass(), "parent", term388887);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term388558;
        args[1] = term388742;
        args[2] = term388834;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term388472, args);
        assertTrue(recursiveEquals(term388472, term388934));
        assertTrue(recursiveEquals(term388558, term388935));
        assertTrue(recursiveEquals(term388742, term388937));
        assertTrue(recursiveEquals(term388834, term388938));
        assertTrue(recursiveEquals(retValue, term388876));
    }

};


