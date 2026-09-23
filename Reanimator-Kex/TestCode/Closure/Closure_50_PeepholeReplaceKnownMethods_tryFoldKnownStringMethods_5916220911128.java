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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5777349;
     Object term5777435;
     Object term5777896;
     Object term5777897;
     Object term5777805;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5777349 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term5777435 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term5777527 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5777619 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5777711 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5777803 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term5777435, term5777435.getClass(), "type", 37);
        setIntField(term5777527, term5777527.getClass(), "type", 35);
        setIntField(term5777711, term5777711.getClass(), "type", 40);
        setField(term5777711, term5777711.getClass(), "str", null);
        setField(term5777619, term5777619.getClass(), "next", term5777711);
        setIntField(term5777619, term5777619.getClass(), "type", 40);
        setField(term5777527, term5777527.getClass(), "first", term5777619);
        setField(term5777527, term5777527.getClass(), "next", term5777803);
        setField(term5777435, term5777435.getClass(), "first", term5777527);
        term5777896 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term5777896, term5777896.getClass(), "currentTraversal", null);
        term5777897 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term5777898 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5777899 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term5777900 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5777901 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term5777897, term5777897.getClass(), "functionName", null);
        setBooleanField(term5777897, term5777897.getClass(), "itsNeedsActivation", false);
        setIntField(term5777897, term5777897.getClass(), "itsFunctionType", 0);
        setBooleanField(term5777897, term5777897.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term5777897, term5777897.getClass(), "encodedSourceStart", 0);
        setIntField(term5777897, term5777897.getClass(), "encodedSourceEnd", 0);
        setField(term5777897, term5777897.getClass(), "sourceName", null);
        setIntField(term5777897, term5777897.getClass(), "baseLineno", 0);
        setIntField(term5777897, term5777897.getClass(), "endLineno", 0);
        setField(term5777897, term5777897.getClass(), "functions", null);
        setField(term5777897, term5777897.getClass(), "regexps", null);
        setField(term5777897, term5777897.getClass(), "itsVariables", null);
        setField(term5777897, term5777897.getClass(), "itsConst", null);
        setField(term5777897, term5777897.getClass(), "itsVariableNames", null);
        setIntField(term5777897, term5777897.getClass(), "varStart", 0);
        setField(term5777897, term5777897.getClass(), "compilerData", null);
        setIntField(term5777897, term5777897.getClass(), "type", 37);
        setField(term5777897, term5777897.getClass(), "next", null);
        setField(term5777898, term5777898.getClass(), "str", null);
        setIntField(term5777898, term5777898.getClass(), "type", 35);
        setDoubleField(term5777899, term5777899.getClass(), "number", 0.0);
        setIntField(term5777899, term5777899.getClass(), "type", 0);
        setField(term5777899, term5777899.getClass(), "next", null);
        setField(term5777899, term5777899.getClass(), "first", null);
        setField(term5777899, term5777899.getClass(), "last", null);
        setField(term5777899, term5777899.getClass(), "propListHead", null);
        setIntField(term5777899, term5777899.getClass(), "sourcePosition", 0);
        setField(term5777899, term5777899.getClass(), "jsType", null);
        setField(term5777899, term5777899.getClass(), "parent", null);
        setField(term5777898, term5777898.getClass(), "next", term5777899);
        setField(term5777900, term5777900.getClass(), "str", null);
        setIntField(term5777900, term5777900.getClass(), "type", 40);
        setField(term5777901, term5777901.getClass(), "str", null);
        setIntField(term5777901, term5777901.getClass(), "type", 40);
        setField(term5777901, term5777901.getClass(), "next", null);
        setField(term5777901, term5777901.getClass(), "first", null);
        setField(term5777901, term5777901.getClass(), "last", null);
        setField(term5777901, term5777901.getClass(), "propListHead", null);
        setIntField(term5777901, term5777901.getClass(), "sourcePosition", 0);
        setField(term5777901, term5777901.getClass(), "jsType", null);
        setField(term5777901, term5777901.getClass(), "parent", null);
        setField(term5777900, term5777900.getClass(), "next", term5777901);
        setField(term5777900, term5777900.getClass(), "first", null);
        setField(term5777900, term5777900.getClass(), "last", null);
        setField(term5777900, term5777900.getClass(), "propListHead", null);
        setIntField(term5777900, term5777900.getClass(), "sourcePosition", 0);
        setField(term5777900, term5777900.getClass(), "jsType", null);
        setField(term5777900, term5777900.getClass(), "parent", null);
        setField(term5777898, term5777898.getClass(), "first", term5777900);
        setField(term5777898, term5777898.getClass(), "last", null);
        setField(term5777898, term5777898.getClass(), "propListHead", null);
        setIntField(term5777898, term5777898.getClass(), "sourcePosition", 0);
        setField(term5777898, term5777898.getClass(), "jsType", null);
        setField(term5777898, term5777898.getClass(), "parent", null);
        setField(term5777897, term5777897.getClass(), "first", term5777898);
        setField(term5777897, term5777897.getClass(), "last", null);
        setField(term5777897, term5777897.getClass(), "propListHead", null);
        setIntField(term5777897, term5777897.getClass(), "sourcePosition", 0);
        setField(term5777897, term5777897.getClass(), "jsType", null);
        setField(term5777897, term5777897.getClass(), "parent", null);
        term5777805 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term5777815 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5777817 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term5777821 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5777823 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term5777805, term5777805.getClass(), "functionName", null);
        setBooleanField(term5777805, term5777805.getClass(), "itsNeedsActivation", false);
        setIntField(term5777805, term5777805.getClass(), "itsFunctionType", 0);
        setBooleanField(term5777805, term5777805.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term5777805, term5777805.getClass(), "encodedSourceStart", 0);
        setIntField(term5777805, term5777805.getClass(), "encodedSourceEnd", 0);
        setField(term5777805, term5777805.getClass(), "sourceName", null);
        setIntField(term5777805, term5777805.getClass(), "baseLineno", 0);
        setIntField(term5777805, term5777805.getClass(), "endLineno", 0);
        setField(term5777805, term5777805.getClass(), "functions", null);
        setField(term5777805, term5777805.getClass(), "regexps", null);
        setField(term5777805, term5777805.getClass(), "itsVariables", null);
        setField(term5777805, term5777805.getClass(), "itsConst", null);
        setField(term5777805, term5777805.getClass(), "itsVariableNames", null);
        setIntField(term5777805, term5777805.getClass(), "varStart", 0);
        setField(term5777805, term5777805.getClass(), "compilerData", null);
        setIntField(term5777805, term5777805.getClass(), "type", 37);
        setField(term5777805, term5777805.getClass(), "next", null);
        setField(term5777815, term5777815.getClass(), "str", null);
        setIntField(term5777815, term5777815.getClass(), "type", 35);
        setDoubleField(term5777817, term5777817.getClass(), "number", 0.0);
        setIntField(term5777817, term5777817.getClass(), "type", 0);
        setField(term5777817, term5777817.getClass(), "next", null);
        setField(term5777817, term5777817.getClass(), "first", null);
        setField(term5777817, term5777817.getClass(), "last", null);
        setField(term5777817, term5777817.getClass(), "propListHead", null);
        setIntField(term5777817, term5777817.getClass(), "sourcePosition", 0);
        setField(term5777817, term5777817.getClass(), "jsType", null);
        setField(term5777817, term5777817.getClass(), "parent", null);
        setField(term5777815, term5777815.getClass(), "next", term5777817);
        setField(term5777821, term5777821.getClass(), "str", null);
        setIntField(term5777821, term5777821.getClass(), "type", 40);
        setField(term5777823, term5777823.getClass(), "str", null);
        setIntField(term5777823, term5777823.getClass(), "type", 40);
        setField(term5777823, term5777823.getClass(), "next", null);
        setField(term5777823, term5777823.getClass(), "first", null);
        setField(term5777823, term5777823.getClass(), "last", null);
        setField(term5777823, term5777823.getClass(), "propListHead", null);
        setIntField(term5777823, term5777823.getClass(), "sourcePosition", 0);
        setField(term5777823, term5777823.getClass(), "jsType", null);
        setField(term5777823, term5777823.getClass(), "parent", null);
        setField(term5777821, term5777821.getClass(), "next", term5777823);
        setField(term5777821, term5777821.getClass(), "first", null);
        setField(term5777821, term5777821.getClass(), "last", null);
        setField(term5777821, term5777821.getClass(), "propListHead", null);
        setIntField(term5777821, term5777821.getClass(), "sourcePosition", 0);
        setField(term5777821, term5777821.getClass(), "jsType", null);
        setField(term5777821, term5777821.getClass(), "parent", null);
        setField(term5777815, term5777815.getClass(), "first", term5777821);
        setField(term5777815, term5777815.getClass(), "last", null);
        setField(term5777815, term5777815.getClass(), "propListHead", null);
        setIntField(term5777815, term5777815.getClass(), "sourcePosition", 0);
        setField(term5777815, term5777815.getClass(), "jsType", null);
        setField(term5777815, term5777815.getClass(), "parent", null);
        setField(term5777805, term5777805.getClass(), "first", term5777815);
        setField(term5777805, term5777805.getClass(), "last", null);
        setField(term5777805, term5777805.getClass(), "propListHead", null);
        setIntField(term5777805, term5777805.getClass(), "sourcePosition", 0);
        setField(term5777805, term5777805.getClass(), "jsType", null);
        setField(term5777805, term5777805.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term5777435;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term5777349, args);
        assertTrue(recursiveEquals(term5777349, term5777896));
        assertTrue(recursiveEquals(term5777435, term5777897));
        assertTrue(recursiveEquals(retValue, term5777805));
    }

};


