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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term436612;
     Object term436704;
     Object term436955;
     Object term436956;
     Object term436898;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term436612 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term436704 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term436796 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term436882 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term436796, term436796.getClass(), "next", term436882);
        setIntField(term436796, term436796.getClass(), "type", 39);
        setField(term436704, term436704.getClass(), "first", term436796);
        setIntField(term436704, term436704.getClass(), "type", 24);
        term436955 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term436955, term436955.getClass(), "currentTraversal", null);
        term436956 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term436957 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term436958 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term436956, term436956.getClass(), "number", 0.0);
        setIntField(term436956, term436956.getClass(), "type", 24);
        setField(term436956, term436956.getClass(), "next", null);
        setDoubleField(term436957, term436957.getClass(), "number", 0.0);
        setIntField(term436957, term436957.getClass(), "type", 39);
        setField(term436958, term436958.getClass(), "functionName", null);
        setBooleanField(term436958, term436958.getClass(), "itsNeedsActivation", false);
        setIntField(term436958, term436958.getClass(), "itsFunctionType", 0);
        setBooleanField(term436958, term436958.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term436958, term436958.getClass(), "encodedSourceStart", 0);
        setIntField(term436958, term436958.getClass(), "encodedSourceEnd", 0);
        setField(term436958, term436958.getClass(), "sourceName", null);
        setIntField(term436958, term436958.getClass(), "baseLineno", 0);
        setIntField(term436958, term436958.getClass(), "endLineno", 0);
        setField(term436958, term436958.getClass(), "functions", null);
        setField(term436958, term436958.getClass(), "regexps", null);
        setField(term436958, term436958.getClass(), "itsVariables", null);
        setField(term436958, term436958.getClass(), "itsConst", null);
        setField(term436958, term436958.getClass(), "itsVariableNames", null);
        setIntField(term436958, term436958.getClass(), "varStart", 0);
        setField(term436958, term436958.getClass(), "compilerData", null);
        setIntField(term436958, term436958.getClass(), "type", 0);
        setField(term436958, term436958.getClass(), "next", null);
        setField(term436958, term436958.getClass(), "first", null);
        setField(term436958, term436958.getClass(), "last", null);
        setField(term436958, term436958.getClass(), "propListHead", null);
        setIntField(term436958, term436958.getClass(), "sourcePosition", 0);
        setField(term436958, term436958.getClass(), "jsType", null);
        setField(term436958, term436958.getClass(), "parent", null);
        setField(term436957, term436957.getClass(), "next", term436958);
        setField(term436957, term436957.getClass(), "first", null);
        setField(term436957, term436957.getClass(), "last", null);
        setField(term436957, term436957.getClass(), "propListHead", null);
        setIntField(term436957, term436957.getClass(), "sourcePosition", 0);
        setField(term436957, term436957.getClass(), "jsType", null);
        setField(term436957, term436957.getClass(), "parent", null);
        setField(term436956, term436956.getClass(), "first", term436957);
        setField(term436956, term436956.getClass(), "last", null);
        setField(term436956, term436956.getClass(), "propListHead", null);
        setIntField(term436956, term436956.getClass(), "sourcePosition", 0);
        setField(term436956, term436956.getClass(), "jsType", null);
        setField(term436956, term436956.getClass(), "parent", null);
        term436898 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term436901 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term436904 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term436898, term436898.getClass(), "number", 0.0);
        setIntField(term436898, term436898.getClass(), "type", 24);
        setField(term436898, term436898.getClass(), "next", null);
        setDoubleField(term436901, term436901.getClass(), "number", 0.0);
        setIntField(term436901, term436901.getClass(), "type", 39);
        setField(term436904, term436904.getClass(), "functionName", null);
        setBooleanField(term436904, term436904.getClass(), "itsNeedsActivation", false);
        setIntField(term436904, term436904.getClass(), "itsFunctionType", 0);
        setBooleanField(term436904, term436904.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term436904, term436904.getClass(), "encodedSourceStart", 0);
        setIntField(term436904, term436904.getClass(), "encodedSourceEnd", 0);
        setField(term436904, term436904.getClass(), "sourceName", null);
        setIntField(term436904, term436904.getClass(), "baseLineno", 0);
        setIntField(term436904, term436904.getClass(), "endLineno", 0);
        setField(term436904, term436904.getClass(), "functions", null);
        setField(term436904, term436904.getClass(), "regexps", null);
        setField(term436904, term436904.getClass(), "itsVariables", null);
        setField(term436904, term436904.getClass(), "itsConst", null);
        setField(term436904, term436904.getClass(), "itsVariableNames", null);
        setIntField(term436904, term436904.getClass(), "varStart", 0);
        setField(term436904, term436904.getClass(), "compilerData", null);
        setIntField(term436904, term436904.getClass(), "type", 0);
        setField(term436904, term436904.getClass(), "next", null);
        setField(term436904, term436904.getClass(), "first", null);
        setField(term436904, term436904.getClass(), "last", null);
        setField(term436904, term436904.getClass(), "propListHead", null);
        setIntField(term436904, term436904.getClass(), "sourcePosition", 0);
        setField(term436904, term436904.getClass(), "jsType", null);
        setField(term436904, term436904.getClass(), "parent", null);
        setField(term436901, term436901.getClass(), "next", term436904);
        setField(term436901, term436901.getClass(), "first", null);
        setField(term436901, term436901.getClass(), "last", null);
        setField(term436901, term436901.getClass(), "propListHead", null);
        setIntField(term436901, term436901.getClass(), "sourcePosition", 0);
        setField(term436901, term436901.getClass(), "jsType", null);
        setField(term436901, term436901.getClass(), "parent", null);
        setField(term436898, term436898.getClass(), "first", term436901);
        setField(term436898, term436898.getClass(), "last", null);
        setField(term436898, term436898.getClass(), "propListHead", null);
        setIntField(term436898, term436898.getClass(), "sourcePosition", 0);
        setField(term436898, term436898.getClass(), "jsType", null);
        setField(term436898, term436898.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term436704;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term436612, args);
        assertTrue(recursiveEquals(term436612, term436955));
        assertTrue(recursiveEquals(term436704, term436956));
        assertTrue(recursiveEquals(retValue, term436898));
    }

};


