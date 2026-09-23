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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term422623;
     Object term422715;
     Object term423004;
     Object term423005;
     Object term422952;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term422623 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term422715 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term422807 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term422897 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term422807, term422807.getClass(), "next", term422897);
        setIntField(term422807, term422807.getClass(), "type", 39);
        setField(term422715, term422715.getClass(), "first", term422807);
        setIntField(term422715, term422715.getClass(), "type", 11);
        term423004 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term423004, term423004.getClass(), "currentTraversal", null);
        term423005 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term423006 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term423007 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term423005, term423005.getClass(), "number", 0.0);
        setIntField(term423005, term423005.getClass(), "type", 11);
        setField(term423005, term423005.getClass(), "next", null);
        setDoubleField(term423006, term423006.getClass(), "number", 0.0);
        setIntField(term423006, term423006.getClass(), "type", 39);
        setIntField(term423007, term423007.getClass(), "encodedSourceStart", 0);
        setIntField(term423007, term423007.getClass(), "encodedSourceEnd", 0);
        setField(term423007, term423007.getClass(), "sourceName", null);
        setIntField(term423007, term423007.getClass(), "baseLineno", 0);
        setIntField(term423007, term423007.getClass(), "endLineno", 0);
        setField(term423007, term423007.getClass(), "functions", null);
        setField(term423007, term423007.getClass(), "regexps", null);
        setField(term423007, term423007.getClass(), "itsVariables", null);
        setField(term423007, term423007.getClass(), "itsConst", null);
        setField(term423007, term423007.getClass(), "itsVariableNames", null);
        setIntField(term423007, term423007.getClass(), "varStart", 0);
        setField(term423007, term423007.getClass(), "compilerData", null);
        setIntField(term423007, term423007.getClass(), "type", 0);
        setField(term423007, term423007.getClass(), "next", null);
        setField(term423007, term423007.getClass(), "first", null);
        setField(term423007, term423007.getClass(), "last", null);
        setField(term423007, term423007.getClass(), "propListHead", null);
        setIntField(term423007, term423007.getClass(), "sourcePosition", 0);
        setField(term423007, term423007.getClass(), "jsType", null);
        setField(term423007, term423007.getClass(), "parent", null);
        setField(term423006, term423006.getClass(), "next", term423007);
        setField(term423006, term423006.getClass(), "first", null);
        setField(term423006, term423006.getClass(), "last", null);
        setField(term423006, term423006.getClass(), "propListHead", null);
        setIntField(term423006, term423006.getClass(), "sourcePosition", 0);
        setField(term423006, term423006.getClass(), "jsType", null);
        setField(term423006, term423006.getClass(), "parent", null);
        setField(term423005, term423005.getClass(), "first", term423006);
        setField(term423005, term423005.getClass(), "last", null);
        setField(term423005, term423005.getClass(), "propListHead", null);
        setIntField(term423005, term423005.getClass(), "sourcePosition", 0);
        setField(term423005, term423005.getClass(), "jsType", null);
        setField(term423005, term423005.getClass(), "parent", null);
        term422952 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term422955 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term422958 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term422952, term422952.getClass(), "number", 0.0);
        setIntField(term422952, term422952.getClass(), "type", 11);
        setField(term422952, term422952.getClass(), "next", null);
        setDoubleField(term422955, term422955.getClass(), "number", 0.0);
        setIntField(term422955, term422955.getClass(), "type", 39);
        setIntField(term422958, term422958.getClass(), "encodedSourceStart", 0);
        setIntField(term422958, term422958.getClass(), "encodedSourceEnd", 0);
        setField(term422958, term422958.getClass(), "sourceName", null);
        setIntField(term422958, term422958.getClass(), "baseLineno", 0);
        setIntField(term422958, term422958.getClass(), "endLineno", 0);
        setField(term422958, term422958.getClass(), "functions", null);
        setField(term422958, term422958.getClass(), "regexps", null);
        setField(term422958, term422958.getClass(), "itsVariables", null);
        setField(term422958, term422958.getClass(), "itsConst", null);
        setField(term422958, term422958.getClass(), "itsVariableNames", null);
        setIntField(term422958, term422958.getClass(), "varStart", 0);
        setField(term422958, term422958.getClass(), "compilerData", null);
        setIntField(term422958, term422958.getClass(), "type", 0);
        setField(term422958, term422958.getClass(), "next", null);
        setField(term422958, term422958.getClass(), "first", null);
        setField(term422958, term422958.getClass(), "last", null);
        setField(term422958, term422958.getClass(), "propListHead", null);
        setIntField(term422958, term422958.getClass(), "sourcePosition", 0);
        setField(term422958, term422958.getClass(), "jsType", null);
        setField(term422958, term422958.getClass(), "parent", null);
        setField(term422955, term422955.getClass(), "next", term422958);
        setField(term422955, term422955.getClass(), "first", null);
        setField(term422955, term422955.getClass(), "last", null);
        setField(term422955, term422955.getClass(), "propListHead", null);
        setIntField(term422955, term422955.getClass(), "sourcePosition", 0);
        setField(term422955, term422955.getClass(), "jsType", null);
        setField(term422955, term422955.getClass(), "parent", null);
        setField(term422952, term422952.getClass(), "first", term422955);
        setField(term422952, term422952.getClass(), "last", null);
        setField(term422952, term422952.getClass(), "propListHead", null);
        setIntField(term422952, term422952.getClass(), "sourcePosition", 0);
        setField(term422952, term422952.getClass(), "jsType", null);
        setField(term422952, term422952.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term422715;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term422623, args);
        assertTrue(recursiveEquals(term422623, term423004));
        assertTrue(recursiveEquals(term422715, term423005));
        assertTrue(recursiveEquals(retValue, term422952));
    }

};


