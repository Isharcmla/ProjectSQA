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

public class PeepholeFoldConstants_tryFoldInstanceof_18306864081827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term707835;
     Object term707927;
     Object term708013;
     Object term708490;
     Object term708491;
     Object term708492;
     Object term708466;

    public PeepholeFoldConstants_tryFoldInstanceof_18306864081827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term707835 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term707927 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term707927, term707927.getClass(), "type", 52);
        term708013 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term708490 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term708490, term708490.getClass(), "currentTraversal", null);
        term708491 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term708491, term708491.getClass(), "number", 0.0);
        setIntField(term708491, term708491.getClass(), "type", 52);
        setField(term708491, term708491.getClass(), "next", null);
        setField(term708491, term708491.getClass(), "first", null);
        setField(term708491, term708491.getClass(), "last", null);
        setField(term708491, term708491.getClass(), "propListHead", null);
        setIntField(term708491, term708491.getClass(), "sourcePosition", 0);
        setField(term708491, term708491.getClass(), "jsType", null);
        setField(term708491, term708491.getClass(), "parent", null);
        term708492 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term708492, term708492.getClass(), "functionName", null);
        setBooleanField(term708492, term708492.getClass(), "itsNeedsActivation", false);
        setIntField(term708492, term708492.getClass(), "itsFunctionType", 0);
        setBooleanField(term708492, term708492.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term708492, term708492.getClass(), "encodedSourceStart", 0);
        setIntField(term708492, term708492.getClass(), "encodedSourceEnd", 0);
        setField(term708492, term708492.getClass(), "sourceName", null);
        setIntField(term708492, term708492.getClass(), "baseLineno", 0);
        setIntField(term708492, term708492.getClass(), "endLineno", 0);
        setField(term708492, term708492.getClass(), "functions", null);
        setField(term708492, term708492.getClass(), "regexps", null);
        setField(term708492, term708492.getClass(), "itsVariables", null);
        setField(term708492, term708492.getClass(), "itsConst", null);
        setField(term708492, term708492.getClass(), "itsVariableNames", null);
        setIntField(term708492, term708492.getClass(), "varStart", 0);
        setField(term708492, term708492.getClass(), "compilerData", null);
        setIntField(term708492, term708492.getClass(), "type", 0);
        setField(term708492, term708492.getClass(), "next", null);
        setField(term708492, term708492.getClass(), "first", null);
        setField(term708492, term708492.getClass(), "last", null);
        setField(term708492, term708492.getClass(), "propListHead", null);
        setIntField(term708492, term708492.getClass(), "sourcePosition", 0);
        setField(term708492, term708492.getClass(), "jsType", null);
        setField(term708492, term708492.getClass(), "parent", null);
        term708466 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term708466, term708466.getClass(), "number", 0.0);
        setIntField(term708466, term708466.getClass(), "type", 52);
        setField(term708466, term708466.getClass(), "next", null);
        setField(term708466, term708466.getClass(), "first", null);
        setField(term708466, term708466.getClass(), "last", null);
        setField(term708466, term708466.getClass(), "propListHead", null);
        setIntField(term708466, term708466.getClass(), "sourcePosition", 0);
        setField(term708466, term708466.getClass(), "jsType", null);
        setField(term708466, term708466.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term707927;
        args[1] = term708013;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldInstanceof", argTypes, term707835, args);
        assertTrue(recursiveEquals(term707835, term708490));
        assertTrue(recursiveEquals(term707927, term708491));
        assertTrue(recursiveEquals(term708013, term708492));
        assertTrue(recursiveEquals(retValue, term708466));
    }

};


