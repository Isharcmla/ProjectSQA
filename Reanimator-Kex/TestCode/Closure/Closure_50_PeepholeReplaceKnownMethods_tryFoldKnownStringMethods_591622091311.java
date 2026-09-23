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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2618266;
     Object term2618352;
     Object term2619060;
     Object term2619061;
     Object term2619014;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2618266 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2618352 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2618444 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2618514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2618352, term2618352.getClass(), "type", 37);
        setIntField(term2618444, term2618444.getClass(), "type", 33);
        setField(term2618444, term2618444.getClass(), "first", term2618514);
        setField(term2618352, term2618352.getClass(), "first", term2618444);
        term2619060 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2619060, term2619060.getClass(), "currentTraversal", null);
        term2619061 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2619062 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2619063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2619061, term2619061.getClass(), "functionName", null);
        setBooleanField(term2619061, term2619061.getClass(), "itsNeedsActivation", false);
        setIntField(term2619061, term2619061.getClass(), "itsFunctionType", 0);
        setBooleanField(term2619061, term2619061.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2619061, term2619061.getClass(), "encodedSourceStart", 0);
        setIntField(term2619061, term2619061.getClass(), "encodedSourceEnd", 0);
        setField(term2619061, term2619061.getClass(), "sourceName", null);
        setIntField(term2619061, term2619061.getClass(), "baseLineno", 0);
        setIntField(term2619061, term2619061.getClass(), "endLineno", 0);
        setField(term2619061, term2619061.getClass(), "functions", null);
        setField(term2619061, term2619061.getClass(), "regexps", null);
        setField(term2619061, term2619061.getClass(), "itsVariables", null);
        setField(term2619061, term2619061.getClass(), "itsConst", null);
        setField(term2619061, term2619061.getClass(), "itsVariableNames", null);
        setIntField(term2619061, term2619061.getClass(), "varStart", 0);
        setField(term2619061, term2619061.getClass(), "compilerData", null);
        setIntField(term2619061, term2619061.getClass(), "type", 37);
        setField(term2619061, term2619061.getClass(), "next", null);
        setDoubleField(term2619062, term2619062.getClass(), "number", 0.0);
        setIntField(term2619062, term2619062.getClass(), "type", 33);
        setField(term2619062, term2619062.getClass(), "next", null);
        setIntField(term2619063, term2619063.getClass(), "type", 0);
        setField(term2619063, term2619063.getClass(), "next", null);
        setField(term2619063, term2619063.getClass(), "first", null);
        setField(term2619063, term2619063.getClass(), "last", null);
        setField(term2619063, term2619063.getClass(), "propListHead", null);
        setIntField(term2619063, term2619063.getClass(), "sourcePosition", 0);
        setField(term2619063, term2619063.getClass(), "jsType", null);
        setField(term2619063, term2619063.getClass(), "parent", null);
        setField(term2619062, term2619062.getClass(), "first", term2619063);
        setField(term2619062, term2619062.getClass(), "last", null);
        setField(term2619062, term2619062.getClass(), "propListHead", null);
        setIntField(term2619062, term2619062.getClass(), "sourcePosition", 0);
        setField(term2619062, term2619062.getClass(), "jsType", null);
        setField(term2619062, term2619062.getClass(), "parent", null);
        setField(term2619061, term2619061.getClass(), "first", term2619062);
        setField(term2619061, term2619061.getClass(), "last", null);
        setField(term2619061, term2619061.getClass(), "propListHead", null);
        setIntField(term2619061, term2619061.getClass(), "sourcePosition", 0);
        setField(term2619061, term2619061.getClass(), "jsType", null);
        setField(term2619061, term2619061.getClass(), "parent", null);
        term2619014 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2619024 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2619027 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2619014, term2619014.getClass(), "functionName", null);
        setBooleanField(term2619014, term2619014.getClass(), "itsNeedsActivation", false);
        setIntField(term2619014, term2619014.getClass(), "itsFunctionType", 0);
        setBooleanField(term2619014, term2619014.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2619014, term2619014.getClass(), "encodedSourceStart", 0);
        setIntField(term2619014, term2619014.getClass(), "encodedSourceEnd", 0);
        setField(term2619014, term2619014.getClass(), "sourceName", null);
        setIntField(term2619014, term2619014.getClass(), "baseLineno", 0);
        setIntField(term2619014, term2619014.getClass(), "endLineno", 0);
        setField(term2619014, term2619014.getClass(), "functions", null);
        setField(term2619014, term2619014.getClass(), "regexps", null);
        setField(term2619014, term2619014.getClass(), "itsVariables", null);
        setField(term2619014, term2619014.getClass(), "itsConst", null);
        setField(term2619014, term2619014.getClass(), "itsVariableNames", null);
        setIntField(term2619014, term2619014.getClass(), "varStart", 0);
        setField(term2619014, term2619014.getClass(), "compilerData", null);
        setIntField(term2619014, term2619014.getClass(), "type", 37);
        setField(term2619014, term2619014.getClass(), "next", null);
        setDoubleField(term2619024, term2619024.getClass(), "number", 0.0);
        setIntField(term2619024, term2619024.getClass(), "type", 33);
        setField(term2619024, term2619024.getClass(), "next", null);
        setIntField(term2619027, term2619027.getClass(), "type", 0);
        setField(term2619027, term2619027.getClass(), "next", null);
        setField(term2619027, term2619027.getClass(), "first", null);
        setField(term2619027, term2619027.getClass(), "last", null);
        setField(term2619027, term2619027.getClass(), "propListHead", null);
        setIntField(term2619027, term2619027.getClass(), "sourcePosition", 0);
        setField(term2619027, term2619027.getClass(), "jsType", null);
        setField(term2619027, term2619027.getClass(), "parent", null);
        setField(term2619024, term2619024.getClass(), "first", term2619027);
        setField(term2619024, term2619024.getClass(), "last", null);
        setField(term2619024, term2619024.getClass(), "propListHead", null);
        setIntField(term2619024, term2619024.getClass(), "sourcePosition", 0);
        setField(term2619024, term2619024.getClass(), "jsType", null);
        setField(term2619024, term2619024.getClass(), "parent", null);
        setField(term2619014, term2619014.getClass(), "first", term2619024);
        setField(term2619014, term2619014.getClass(), "last", null);
        setField(term2619014, term2619014.getClass(), "propListHead", null);
        setIntField(term2619014, term2619014.getClass(), "sourcePosition", 0);
        setField(term2619014, term2619014.getClass(), "jsType", null);
        setField(term2619014, term2619014.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2618352;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2618266, args);
        assertTrue(recursiveEquals(term2618266, term2619060));
        assertTrue(recursiveEquals(term2618352, term2619061));
        assertTrue(recursiveEquals(retValue, term2619014));
    }

};


