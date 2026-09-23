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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2652996;
     Object term2653082;
     Object term2653992;
     Object term2653993;
     Object term2653903;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2652996 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2653082 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2653174 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2653266 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2653358 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2653082, term2653082.getClass(), "type", 37);
        setIntField(term2653174, term2653174.getClass(), "type", 35);
        setIntField(term2653358, term2653358.getClass(), "type", 40);
        setField(term2653358, term2653358.getClass(), "str", "");
        setField(term2653266, term2653266.getClass(), "next", term2653358);
        setIntField(term2653266, term2653266.getClass(), "type", 40);
        setField(term2653174, term2653174.getClass(), "first", term2653266);
        setField(term2653174, term2653174.getClass(), "next", null);
        setField(term2653082, term2653082.getClass(), "first", term2653174);
        term2653992 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2653992, term2653992.getClass(), "currentTraversal", null);
        term2653993 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2653994 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2653995 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2653996 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term2653993, term2653993.getClass(), "functionName", null);
        setBooleanField(term2653993, term2653993.getClass(), "itsNeedsActivation", false);
        setIntField(term2653993, term2653993.getClass(), "itsFunctionType", 0);
        setBooleanField(term2653993, term2653993.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2653993, term2653993.getClass(), "encodedSourceStart", 0);
        setIntField(term2653993, term2653993.getClass(), "encodedSourceEnd", 0);
        setField(term2653993, term2653993.getClass(), "sourceName", null);
        setIntField(term2653993, term2653993.getClass(), "baseLineno", 0);
        setIntField(term2653993, term2653993.getClass(), "endLineno", 0);
        setField(term2653993, term2653993.getClass(), "functions", null);
        setField(term2653993, term2653993.getClass(), "regexps", null);
        setField(term2653993, term2653993.getClass(), "itsVariables", null);
        setField(term2653993, term2653993.getClass(), "itsConst", null);
        setField(term2653993, term2653993.getClass(), "itsVariableNames", null);
        setIntField(term2653993, term2653993.getClass(), "varStart", 0);
        setField(term2653993, term2653993.getClass(), "compilerData", null);
        setIntField(term2653993, term2653993.getClass(), "type", 37);
        setField(term2653993, term2653993.getClass(), "next", null);
        setField(term2653994, term2653994.getClass(), "str", null);
        setIntField(term2653994, term2653994.getClass(), "type", 35);
        setField(term2653994, term2653994.getClass(), "next", null);
        setField(term2653995, term2653995.getClass(), "str", null);
        setIntField(term2653995, term2653995.getClass(), "type", 40);
        setField(term2653996, term2653996.getClass(), "str", "");
        setIntField(term2653996, term2653996.getClass(), "type", 40);
        setField(term2653996, term2653996.getClass(), "next", null);
        setField(term2653996, term2653996.getClass(), "first", null);
        setField(term2653996, term2653996.getClass(), "last", null);
        setField(term2653996, term2653996.getClass(), "propListHead", null);
        setIntField(term2653996, term2653996.getClass(), "sourcePosition", 0);
        setField(term2653996, term2653996.getClass(), "jsType", null);
        setField(term2653996, term2653996.getClass(), "parent", null);
        setField(term2653995, term2653995.getClass(), "next", term2653996);
        setField(term2653995, term2653995.getClass(), "first", null);
        setField(term2653995, term2653995.getClass(), "last", null);
        setField(term2653995, term2653995.getClass(), "propListHead", null);
        setIntField(term2653995, term2653995.getClass(), "sourcePosition", 0);
        setField(term2653995, term2653995.getClass(), "jsType", null);
        setField(term2653995, term2653995.getClass(), "parent", null);
        setField(term2653994, term2653994.getClass(), "first", term2653995);
        setField(term2653994, term2653994.getClass(), "last", null);
        setField(term2653994, term2653994.getClass(), "propListHead", null);
        setIntField(term2653994, term2653994.getClass(), "sourcePosition", 0);
        setField(term2653994, term2653994.getClass(), "jsType", null);
        setField(term2653994, term2653994.getClass(), "parent", null);
        setField(term2653993, term2653993.getClass(), "first", term2653994);
        setField(term2653993, term2653993.getClass(), "last", null);
        setField(term2653993, term2653993.getClass(), "propListHead", null);
        setIntField(term2653993, term2653993.getClass(), "sourcePosition", 0);
        setField(term2653993, term2653993.getClass(), "jsType", null);
        setField(term2653993, term2653993.getClass(), "parent", null);
        term2653903 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2653913 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2653915 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2653917 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term2653903, term2653903.getClass(), "functionName", null);
        setBooleanField(term2653903, term2653903.getClass(), "itsNeedsActivation", false);
        setIntField(term2653903, term2653903.getClass(), "itsFunctionType", 0);
        setBooleanField(term2653903, term2653903.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2653903, term2653903.getClass(), "encodedSourceStart", 0);
        setIntField(term2653903, term2653903.getClass(), "encodedSourceEnd", 0);
        setField(term2653903, term2653903.getClass(), "sourceName", null);
        setIntField(term2653903, term2653903.getClass(), "baseLineno", 0);
        setIntField(term2653903, term2653903.getClass(), "endLineno", 0);
        setField(term2653903, term2653903.getClass(), "functions", null);
        setField(term2653903, term2653903.getClass(), "regexps", null);
        setField(term2653903, term2653903.getClass(), "itsVariables", null);
        setField(term2653903, term2653903.getClass(), "itsConst", null);
        setField(term2653903, term2653903.getClass(), "itsVariableNames", null);
        setIntField(term2653903, term2653903.getClass(), "varStart", 0);
        setField(term2653903, term2653903.getClass(), "compilerData", null);
        setIntField(term2653903, term2653903.getClass(), "type", 37);
        setField(term2653903, term2653903.getClass(), "next", null);
        setField(term2653913, term2653913.getClass(), "str", null);
        setIntField(term2653913, term2653913.getClass(), "type", 35);
        setField(term2653913, term2653913.getClass(), "next", null);
        setField(term2653915, term2653915.getClass(), "str", null);
        setIntField(term2653915, term2653915.getClass(), "type", 40);
        setField(term2653917, term2653917.getClass(), "str", "");
        setIntField(term2653917, term2653917.getClass(), "type", 40);
        setField(term2653917, term2653917.getClass(), "next", null);
        setField(term2653917, term2653917.getClass(), "first", null);
        setField(term2653917, term2653917.getClass(), "last", null);
        setField(term2653917, term2653917.getClass(), "propListHead", null);
        setIntField(term2653917, term2653917.getClass(), "sourcePosition", 0);
        setField(term2653917, term2653917.getClass(), "jsType", null);
        setField(term2653917, term2653917.getClass(), "parent", null);
        setField(term2653915, term2653915.getClass(), "next", term2653917);
        setField(term2653915, term2653915.getClass(), "first", null);
        setField(term2653915, term2653915.getClass(), "last", null);
        setField(term2653915, term2653915.getClass(), "propListHead", null);
        setIntField(term2653915, term2653915.getClass(), "sourcePosition", 0);
        setField(term2653915, term2653915.getClass(), "jsType", null);
        setField(term2653915, term2653915.getClass(), "parent", null);
        setField(term2653913, term2653913.getClass(), "first", term2653915);
        setField(term2653913, term2653913.getClass(), "last", null);
        setField(term2653913, term2653913.getClass(), "propListHead", null);
        setIntField(term2653913, term2653913.getClass(), "sourcePosition", 0);
        setField(term2653913, term2653913.getClass(), "jsType", null);
        setField(term2653913, term2653913.getClass(), "parent", null);
        setField(term2653903, term2653903.getClass(), "first", term2653913);
        setField(term2653903, term2653903.getClass(), "last", null);
        setField(term2653903, term2653903.getClass(), "propListHead", null);
        setIntField(term2653903, term2653903.getClass(), "sourcePosition", 0);
        setField(term2653903, term2653903.getClass(), "jsType", null);
        setField(term2653903, term2653903.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2653082;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2652996, args);
        assertTrue(recursiveEquals(term2652996, term2653992));
        assertTrue(recursiveEquals(term2653082, term2653993));
        assertTrue(recursiveEquals(retValue, term2653903));
    }

};


