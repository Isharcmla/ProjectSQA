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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41751;
     Object term41843;
     Object term42237;
     Object term42238;
     Object term42189;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41751 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term41843 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term41929 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term41843, term41843.getClass(), "type", 37);
        setField(term41843, term41843.getClass(), "first", term41929);
        term42237 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term42237, term42237.getClass(), "currentTraversal", null);
        term42238 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term42239 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term42238, term42238.getClass(), "number", 0.0);
        setIntField(term42238, term42238.getClass(), "type", 37);
        setField(term42238, term42238.getClass(), "next", null);
        setField(term42239, term42239.getClass(), "functionName", null);
        setBooleanField(term42239, term42239.getClass(), "itsNeedsActivation", false);
        setIntField(term42239, term42239.getClass(), "itsFunctionType", 0);
        setBooleanField(term42239, term42239.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term42239, term42239.getClass(), "encodedSourceStart", 0);
        setIntField(term42239, term42239.getClass(), "encodedSourceEnd", 0);
        setField(term42239, term42239.getClass(), "sourceName", null);
        setIntField(term42239, term42239.getClass(), "baseLineno", 0);
        setIntField(term42239, term42239.getClass(), "endLineno", 0);
        setField(term42239, term42239.getClass(), "functions", null);
        setField(term42239, term42239.getClass(), "regexps", null);
        setField(term42239, term42239.getClass(), "itsVariables", null);
        setField(term42239, term42239.getClass(), "itsConst", null);
        setField(term42239, term42239.getClass(), "itsVariableNames", null);
        setIntField(term42239, term42239.getClass(), "varStart", 0);
        setField(term42239, term42239.getClass(), "compilerData", null);
        setIntField(term42239, term42239.getClass(), "type", 0);
        setField(term42239, term42239.getClass(), "next", null);
        setField(term42239, term42239.getClass(), "first", null);
        setField(term42239, term42239.getClass(), "last", null);
        setField(term42239, term42239.getClass(), "propListHead", null);
        setIntField(term42239, term42239.getClass(), "sourcePosition", 0);
        setField(term42239, term42239.getClass(), "jsType", null);
        setField(term42239, term42239.getClass(), "parent", null);
        setField(term42238, term42238.getClass(), "first", term42239);
        setField(term42238, term42238.getClass(), "last", null);
        setField(term42238, term42238.getClass(), "propListHead", null);
        setIntField(term42238, term42238.getClass(), "sourcePosition", 0);
        setField(term42238, term42238.getClass(), "jsType", null);
        setField(term42238, term42238.getClass(), "parent", null);
        term42189 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term42192 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term42189, term42189.getClass(), "number", 0.0);
        setIntField(term42189, term42189.getClass(), "type", 37);
        setField(term42189, term42189.getClass(), "next", null);
        setField(term42192, term42192.getClass(), "functionName", null);
        setBooleanField(term42192, term42192.getClass(), "itsNeedsActivation", false);
        setIntField(term42192, term42192.getClass(), "itsFunctionType", 0);
        setBooleanField(term42192, term42192.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term42192, term42192.getClass(), "encodedSourceStart", 0);
        setIntField(term42192, term42192.getClass(), "encodedSourceEnd", 0);
        setField(term42192, term42192.getClass(), "sourceName", null);
        setIntField(term42192, term42192.getClass(), "baseLineno", 0);
        setIntField(term42192, term42192.getClass(), "endLineno", 0);
        setField(term42192, term42192.getClass(), "functions", null);
        setField(term42192, term42192.getClass(), "regexps", null);
        setField(term42192, term42192.getClass(), "itsVariables", null);
        setField(term42192, term42192.getClass(), "itsConst", null);
        setField(term42192, term42192.getClass(), "itsVariableNames", null);
        setIntField(term42192, term42192.getClass(), "varStart", 0);
        setField(term42192, term42192.getClass(), "compilerData", null);
        setIntField(term42192, term42192.getClass(), "type", 0);
        setField(term42192, term42192.getClass(), "next", null);
        setField(term42192, term42192.getClass(), "first", null);
        setField(term42192, term42192.getClass(), "last", null);
        setField(term42192, term42192.getClass(), "propListHead", null);
        setIntField(term42192, term42192.getClass(), "sourcePosition", 0);
        setField(term42192, term42192.getClass(), "jsType", null);
        setField(term42192, term42192.getClass(), "parent", null);
        setField(term42189, term42189.getClass(), "first", term42192);
        setField(term42189, term42189.getClass(), "last", null);
        setField(term42189, term42189.getClass(), "propListHead", null);
        setIntField(term42189, term42189.getClass(), "sourcePosition", 0);
        setField(term42189, term42189.getClass(), "jsType", null);
        setField(term42189, term42189.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term41843;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term41751, args);
        assertTrue(recursiveEquals(term41751, term42237));
        assertTrue(recursiveEquals(term41843, term42238));
        assertTrue(recursiveEquals(retValue, term42189));
    }

};


