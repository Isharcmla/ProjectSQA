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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2630200;
     Object term2630292;
     Object term2630978;
     Object term2630979;
     Object term2630918;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2630200 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2630292 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2630378 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2630448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2630292, term2630292.getClass(), "type", 37);
        setIntField(term2630378, term2630378.getClass(), "type", 33);
        setField(term2630378, term2630378.getClass(), "first", term2630448);
        setField(term2630292, term2630292.getClass(), "first", term2630378);
        term2630978 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2630978, term2630978.getClass(), "currentTraversal", null);
        term2630979 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2630980 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2630981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term2630979, term2630979.getClass(), "number", 0.0);
        setIntField(term2630979, term2630979.getClass(), "type", 37);
        setField(term2630979, term2630979.getClass(), "next", null);
        setField(term2630980, term2630980.getClass(), "functionName", null);
        setBooleanField(term2630980, term2630980.getClass(), "itsNeedsActivation", false);
        setIntField(term2630980, term2630980.getClass(), "itsFunctionType", 0);
        setBooleanField(term2630980, term2630980.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2630980, term2630980.getClass(), "encodedSourceStart", 0);
        setIntField(term2630980, term2630980.getClass(), "encodedSourceEnd", 0);
        setField(term2630980, term2630980.getClass(), "sourceName", null);
        setIntField(term2630980, term2630980.getClass(), "baseLineno", 0);
        setIntField(term2630980, term2630980.getClass(), "endLineno", 0);
        setField(term2630980, term2630980.getClass(), "functions", null);
        setField(term2630980, term2630980.getClass(), "regexps", null);
        setField(term2630980, term2630980.getClass(), "itsVariables", null);
        setField(term2630980, term2630980.getClass(), "itsConst", null);
        setField(term2630980, term2630980.getClass(), "itsVariableNames", null);
        setIntField(term2630980, term2630980.getClass(), "varStart", 0);
        setField(term2630980, term2630980.getClass(), "compilerData", null);
        setIntField(term2630980, term2630980.getClass(), "type", 33);
        setField(term2630980, term2630980.getClass(), "next", null);
        setIntField(term2630981, term2630981.getClass(), "type", 0);
        setField(term2630981, term2630981.getClass(), "next", null);
        setField(term2630981, term2630981.getClass(), "first", null);
        setField(term2630981, term2630981.getClass(), "last", null);
        setField(term2630981, term2630981.getClass(), "propListHead", null);
        setIntField(term2630981, term2630981.getClass(), "sourcePosition", 0);
        setField(term2630981, term2630981.getClass(), "jsType", null);
        setField(term2630981, term2630981.getClass(), "parent", null);
        setField(term2630980, term2630980.getClass(), "first", term2630981);
        setField(term2630980, term2630980.getClass(), "last", null);
        setField(term2630980, term2630980.getClass(), "propListHead", null);
        setIntField(term2630980, term2630980.getClass(), "sourcePosition", 0);
        setField(term2630980, term2630980.getClass(), "jsType", null);
        setField(term2630980, term2630980.getClass(), "parent", null);
        setField(term2630979, term2630979.getClass(), "first", term2630980);
        setField(term2630979, term2630979.getClass(), "last", null);
        setField(term2630979, term2630979.getClass(), "propListHead", null);
        setIntField(term2630979, term2630979.getClass(), "sourcePosition", 0);
        setField(term2630979, term2630979.getClass(), "jsType", null);
        setField(term2630979, term2630979.getClass(), "parent", null);
        term2630918 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2630921 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2630931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term2630918, term2630918.getClass(), "number", 0.0);
        setIntField(term2630918, term2630918.getClass(), "type", 37);
        setField(term2630918, term2630918.getClass(), "next", null);
        setField(term2630921, term2630921.getClass(), "functionName", null);
        setBooleanField(term2630921, term2630921.getClass(), "itsNeedsActivation", false);
        setIntField(term2630921, term2630921.getClass(), "itsFunctionType", 0);
        setBooleanField(term2630921, term2630921.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2630921, term2630921.getClass(), "encodedSourceStart", 0);
        setIntField(term2630921, term2630921.getClass(), "encodedSourceEnd", 0);
        setField(term2630921, term2630921.getClass(), "sourceName", null);
        setIntField(term2630921, term2630921.getClass(), "baseLineno", 0);
        setIntField(term2630921, term2630921.getClass(), "endLineno", 0);
        setField(term2630921, term2630921.getClass(), "functions", null);
        setField(term2630921, term2630921.getClass(), "regexps", null);
        setField(term2630921, term2630921.getClass(), "itsVariables", null);
        setField(term2630921, term2630921.getClass(), "itsConst", null);
        setField(term2630921, term2630921.getClass(), "itsVariableNames", null);
        setIntField(term2630921, term2630921.getClass(), "varStart", 0);
        setField(term2630921, term2630921.getClass(), "compilerData", null);
        setIntField(term2630921, term2630921.getClass(), "type", 33);
        setField(term2630921, term2630921.getClass(), "next", null);
        setIntField(term2630931, term2630931.getClass(), "type", 0);
        setField(term2630931, term2630931.getClass(), "next", null);
        setField(term2630931, term2630931.getClass(), "first", null);
        setField(term2630931, term2630931.getClass(), "last", null);
        setField(term2630931, term2630931.getClass(), "propListHead", null);
        setIntField(term2630931, term2630931.getClass(), "sourcePosition", 0);
        setField(term2630931, term2630931.getClass(), "jsType", null);
        setField(term2630931, term2630931.getClass(), "parent", null);
        setField(term2630921, term2630921.getClass(), "first", term2630931);
        setField(term2630921, term2630921.getClass(), "last", null);
        setField(term2630921, term2630921.getClass(), "propListHead", null);
        setIntField(term2630921, term2630921.getClass(), "sourcePosition", 0);
        setField(term2630921, term2630921.getClass(), "jsType", null);
        setField(term2630921, term2630921.getClass(), "parent", null);
        setField(term2630918, term2630918.getClass(), "first", term2630921);
        setField(term2630918, term2630918.getClass(), "last", null);
        setField(term2630918, term2630918.getClass(), "propListHead", null);
        setIntField(term2630918, term2630918.getClass(), "sourcePosition", 0);
        setField(term2630918, term2630918.getClass(), "jsType", null);
        setField(term2630918, term2630918.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2630292;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2630200, args);
        assertTrue(recursiveEquals(term2630200, term2630978));
        assertTrue(recursiveEquals(term2630292, term2630979));
        assertTrue(recursiveEquals(retValue, term2630918));
    }

};


