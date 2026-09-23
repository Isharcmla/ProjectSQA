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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091809 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3687715;
     Object term3687801;
     Object term3689116;
     Object term3689117;
     Object term3688905;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091809() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3687715 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3687801 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3687893 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3687985 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3688093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3687801, term3687801.getClass(), "type", 37);
        setIntField(term3687893, term3687893.getClass(), "type", 35);
        setField(term3687985, term3687985.getClass(), "next", term3687985);
        setIntField(term3687985, term3687985.getClass(), "type", 40);
        setField(term3687985, term3687985.getClass(), "str", "charCodeAt");
        setField(term3687893, term3687893.getClass(), "first", term3687985);
        setIntField(term3688093, term3688093.getClass(), "type", 43);
        setField(term3687893, term3687893.getClass(), "next", term3688093);
        setField(term3687801, term3687801.getClass(), "first", term3687893);
        term3689116 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3689116, term3689116.getClass(), "currentTraversal", null);
        term3689117 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3689118 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3689119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3689120 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3689117, term3689117.getClass(), "functionName", null);
        setBooleanField(term3689117, term3689117.getClass(), "itsNeedsActivation", false);
        setIntField(term3689117, term3689117.getClass(), "itsFunctionType", 0);
        setBooleanField(term3689117, term3689117.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3689117, term3689117.getClass(), "encodedSourceStart", 0);
        setIntField(term3689117, term3689117.getClass(), "encodedSourceEnd", 0);
        setField(term3689117, term3689117.getClass(), "sourceName", null);
        setIntField(term3689117, term3689117.getClass(), "baseLineno", 0);
        setIntField(term3689117, term3689117.getClass(), "endLineno", 0);
        setField(term3689117, term3689117.getClass(), "functions", null);
        setField(term3689117, term3689117.getClass(), "regexps", null);
        setField(term3689117, term3689117.getClass(), "itsVariables", null);
        setField(term3689117, term3689117.getClass(), "itsConst", null);
        setField(term3689117, term3689117.getClass(), "itsVariableNames", null);
        setIntField(term3689117, term3689117.getClass(), "varStart", 0);
        setField(term3689117, term3689117.getClass(), "compilerData", null);
        setIntField(term3689117, term3689117.getClass(), "type", 37);
        setField(term3689117, term3689117.getClass(), "next", null);
        setField(term3689118, term3689118.getClass(), "str", null);
        setIntField(term3689118, term3689118.getClass(), "type", 35);
        setIntField(term3689119, term3689119.getClass(), "type", 43);
        setField(term3689119, term3689119.getClass(), "next", null);
        setField(term3689119, term3689119.getClass(), "first", null);
        setField(term3689119, term3689119.getClass(), "last", null);
        setField(term3689119, term3689119.getClass(), "propListHead", null);
        setIntField(term3689119, term3689119.getClass(), "sourcePosition", 0);
        setField(term3689119, term3689119.getClass(), "jsType", null);
        setField(term3689119, term3689119.getClass(), "parent", null);
        setField(term3689118, term3689118.getClass(), "next", term3689119);
        setField(term3689120, term3689120.getClass(), "str", "charCodeAt");
        setIntField(term3689120, term3689120.getClass(), "type", 40);
        setField(term3689120, term3689120.getClass(), "next", term3689120);
        setField(term3689120, term3689120.getClass(), "first", null);
        setField(term3689120, term3689120.getClass(), "last", null);
        setField(term3689120, term3689120.getClass(), "propListHead", null);
        setIntField(term3689120, term3689120.getClass(), "sourcePosition", 0);
        setField(term3689120, term3689120.getClass(), "jsType", null);
        setField(term3689120, term3689120.getClass(), "parent", null);
        setField(term3689118, term3689118.getClass(), "first", term3689120);
        setField(term3689118, term3689118.getClass(), "last", null);
        setField(term3689118, term3689118.getClass(), "propListHead", null);
        setIntField(term3689118, term3689118.getClass(), "sourcePosition", 0);
        setField(term3689118, term3689118.getClass(), "jsType", null);
        setField(term3689118, term3689118.getClass(), "parent", null);
        setField(term3689117, term3689117.getClass(), "first", term3689118);
        setField(term3689117, term3689117.getClass(), "last", null);
        setField(term3689117, term3689117.getClass(), "propListHead", null);
        setIntField(term3689117, term3689117.getClass(), "sourcePosition", 0);
        setField(term3689117, term3689117.getClass(), "jsType", null);
        setField(term3689117, term3689117.getClass(), "parent", null);
        term3688905 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3688915 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3688917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3688920 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3688905, term3688905.getClass(), "functionName", null);
        setBooleanField(term3688905, term3688905.getClass(), "itsNeedsActivation", false);
        setIntField(term3688905, term3688905.getClass(), "itsFunctionType", 0);
        setBooleanField(term3688905, term3688905.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3688905, term3688905.getClass(), "encodedSourceStart", 0);
        setIntField(term3688905, term3688905.getClass(), "encodedSourceEnd", 0);
        setField(term3688905, term3688905.getClass(), "sourceName", null);
        setIntField(term3688905, term3688905.getClass(), "baseLineno", 0);
        setIntField(term3688905, term3688905.getClass(), "endLineno", 0);
        setField(term3688905, term3688905.getClass(), "functions", null);
        setField(term3688905, term3688905.getClass(), "regexps", null);
        setField(term3688905, term3688905.getClass(), "itsVariables", null);
        setField(term3688905, term3688905.getClass(), "itsConst", null);
        setField(term3688905, term3688905.getClass(), "itsVariableNames", null);
        setIntField(term3688905, term3688905.getClass(), "varStart", 0);
        setField(term3688905, term3688905.getClass(), "compilerData", null);
        setIntField(term3688905, term3688905.getClass(), "type", 37);
        setField(term3688905, term3688905.getClass(), "next", null);
        setField(term3688915, term3688915.getClass(), "str", null);
        setIntField(term3688915, term3688915.getClass(), "type", 35);
        setIntField(term3688917, term3688917.getClass(), "type", 43);
        setField(term3688917, term3688917.getClass(), "next", null);
        setField(term3688917, term3688917.getClass(), "first", null);
        setField(term3688917, term3688917.getClass(), "last", null);
        setField(term3688917, term3688917.getClass(), "propListHead", null);
        setIntField(term3688917, term3688917.getClass(), "sourcePosition", 0);
        setField(term3688917, term3688917.getClass(), "jsType", null);
        setField(term3688917, term3688917.getClass(), "parent", null);
        setField(term3688915, term3688915.getClass(), "next", term3688917);
        setField(term3688920, term3688920.getClass(), "str", "charCodeAt");
        setIntField(term3688920, term3688920.getClass(), "type", 40);
        setField(term3688920, term3688920.getClass(), "next", term3688920);
        setField(term3688920, term3688920.getClass(), "first", null);
        setField(term3688920, term3688920.getClass(), "last", null);
        setField(term3688920, term3688920.getClass(), "propListHead", null);
        setIntField(term3688920, term3688920.getClass(), "sourcePosition", 0);
        setField(term3688920, term3688920.getClass(), "jsType", null);
        setField(term3688920, term3688920.getClass(), "parent", null);
        setField(term3688915, term3688915.getClass(), "first", term3688920);
        setField(term3688915, term3688915.getClass(), "last", null);
        setField(term3688915, term3688915.getClass(), "propListHead", null);
        setIntField(term3688915, term3688915.getClass(), "sourcePosition", 0);
        setField(term3688915, term3688915.getClass(), "jsType", null);
        setField(term3688915, term3688915.getClass(), "parent", null);
        setField(term3688905, term3688905.getClass(), "first", term3688915);
        setField(term3688905, term3688905.getClass(), "last", null);
        setField(term3688905, term3688905.getClass(), "propListHead", null);
        setIntField(term3688905, term3688905.getClass(), "sourcePosition", 0);
        setField(term3688905, term3688905.getClass(), "jsType", null);
        setField(term3688905, term3688905.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3687801;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3687715, args);
        assertTrue(recursiveEquals(term3687715, term3689116));
        assertTrue(recursiveEquals(term3687801, term3689117));
        assertTrue(recursiveEquals(retValue, term3688905));
    }

};


