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

public class PeepholeFoldConstants_tryFoldComparison_848443179623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162506;
     Object term162598;
     Object term162690;
     Object term162776;
     Object term163274;
     Object term163275;
     Object term163276;
     Object term163277;
     Object term163245;

    public PeepholeFoldConstants_tryFoldComparison_848443179623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162506 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term162598 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term162598, term162598.getClass(), "type", 16);
        term162690 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term162690, term162690.getClass(), "type", 42);
        term162776 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term162776, term162776.getClass(), "type", 42);
        term163274 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term163274, term163274.getClass(), "currentTraversal", null);
        term163275 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term163275, term163275.getClass(), "number", 0.0);
        setIntField(term163275, term163275.getClass(), "type", 42);
        setField(term163275, term163275.getClass(), "next", null);
        setField(term163275, term163275.getClass(), "first", null);
        setField(term163275, term163275.getClass(), "last", null);
        setField(term163275, term163275.getClass(), "propListHead", null);
        setIntField(term163275, term163275.getClass(), "sourcePosition", 0);
        setField(term163275, term163275.getClass(), "jsType", null);
        setField(term163275, term163275.getClass(), "parent", null);
        term163276 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term163276, term163276.getClass(), "number", 0.0);
        setIntField(term163276, term163276.getClass(), "type", 16);
        setField(term163276, term163276.getClass(), "next", null);
        setField(term163276, term163276.getClass(), "first", null);
        setField(term163276, term163276.getClass(), "last", null);
        setField(term163276, term163276.getClass(), "propListHead", null);
        setIntField(term163276, term163276.getClass(), "sourcePosition", 0);
        setField(term163276, term163276.getClass(), "jsType", null);
        setField(term163276, term163276.getClass(), "parent", null);
        term163277 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term163277, term163277.getClass(), "functionName", null);
        setBooleanField(term163277, term163277.getClass(), "itsNeedsActivation", false);
        setIntField(term163277, term163277.getClass(), "itsFunctionType", 0);
        setBooleanField(term163277, term163277.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term163277, term163277.getClass(), "encodedSourceStart", 0);
        setIntField(term163277, term163277.getClass(), "encodedSourceEnd", 0);
        setField(term163277, term163277.getClass(), "sourceName", null);
        setIntField(term163277, term163277.getClass(), "baseLineno", 0);
        setIntField(term163277, term163277.getClass(), "endLineno", 0);
        setField(term163277, term163277.getClass(), "functions", null);
        setField(term163277, term163277.getClass(), "regexps", null);
        setField(term163277, term163277.getClass(), "itsVariables", null);
        setField(term163277, term163277.getClass(), "itsConst", null);
        setField(term163277, term163277.getClass(), "itsVariableNames", null);
        setIntField(term163277, term163277.getClass(), "varStart", 0);
        setField(term163277, term163277.getClass(), "compilerData", null);
        setIntField(term163277, term163277.getClass(), "type", 42);
        setField(term163277, term163277.getClass(), "next", null);
        setField(term163277, term163277.getClass(), "first", null);
        setField(term163277, term163277.getClass(), "last", null);
        setField(term163277, term163277.getClass(), "propListHead", null);
        setIntField(term163277, term163277.getClass(), "sourcePosition", 0);
        setField(term163277, term163277.getClass(), "jsType", null);
        setField(term163277, term163277.getClass(), "parent", null);
        term163245 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term163245, term163245.getClass(), "number", 0.0);
        setIntField(term163245, term163245.getClass(), "type", 16);
        setField(term163245, term163245.getClass(), "next", null);
        setField(term163245, term163245.getClass(), "first", null);
        setField(term163245, term163245.getClass(), "last", null);
        setField(term163245, term163245.getClass(), "propListHead", null);
        setIntField(term163245, term163245.getClass(), "sourcePosition", 0);
        setField(term163245, term163245.getClass(), "jsType", null);
        setField(term163245, term163245.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term162598;
        args[1] = term162690;
        args[2] = term162776;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term162506, args);
        assertTrue(recursiveEquals(term162506, term163274));
        assertTrue(recursiveEquals(term162598, term163275));
        assertTrue(recursiveEquals(term162690, term163276));
        assertTrue(recursiveEquals(term162776, term163277));
        assertTrue(recursiveEquals(retValue, term163245));
    }

};


