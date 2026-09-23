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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term669052;
     Object term669144;
     Object term669909;
     Object term669910;
     Object term669861;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term669052 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term669144 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term669236 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term669326 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term669236, term669236.getClass(), "next", term669326);
        setIntField(term669236, term669236.getClass(), "type", 39);
        setField(term669144, term669144.getClass(), "first", term669236);
        setIntField(term669144, term669144.getClass(), "type", 24);
        term669909 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term669909, term669909.getClass(), "currentTraversal", null);
        term669910 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term669911 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term669912 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term669910, term669910.getClass(), "number", 0.0);
        setIntField(term669910, term669910.getClass(), "type", 24);
        setField(term669910, term669910.getClass(), "next", null);
        setDoubleField(term669911, term669911.getClass(), "number", 0.0);
        setIntField(term669911, term669911.getClass(), "type", 39);
        setIntField(term669912, term669912.getClass(), "encodedSourceStart", 0);
        setIntField(term669912, term669912.getClass(), "encodedSourceEnd", 0);
        setField(term669912, term669912.getClass(), "sourceName", null);
        setIntField(term669912, term669912.getClass(), "baseLineno", 0);
        setIntField(term669912, term669912.getClass(), "endLineno", 0);
        setField(term669912, term669912.getClass(), "functions", null);
        setField(term669912, term669912.getClass(), "regexps", null);
        setField(term669912, term669912.getClass(), "itsVariables", null);
        setField(term669912, term669912.getClass(), "itsConst", null);
        setField(term669912, term669912.getClass(), "itsVariableNames", null);
        setIntField(term669912, term669912.getClass(), "varStart", 0);
        setField(term669912, term669912.getClass(), "compilerData", null);
        setIntField(term669912, term669912.getClass(), "type", 0);
        setField(term669912, term669912.getClass(), "next", null);
        setField(term669912, term669912.getClass(), "first", null);
        setField(term669912, term669912.getClass(), "last", null);
        setField(term669912, term669912.getClass(), "propListHead", null);
        setIntField(term669912, term669912.getClass(), "sourcePosition", 0);
        setField(term669912, term669912.getClass(), "jsType", null);
        setField(term669912, term669912.getClass(), "parent", null);
        setField(term669911, term669911.getClass(), "next", term669912);
        setField(term669911, term669911.getClass(), "first", null);
        setField(term669911, term669911.getClass(), "last", null);
        setField(term669911, term669911.getClass(), "propListHead", null);
        setIntField(term669911, term669911.getClass(), "sourcePosition", 0);
        setField(term669911, term669911.getClass(), "jsType", null);
        setField(term669911, term669911.getClass(), "parent", null);
        setField(term669910, term669910.getClass(), "first", term669911);
        setField(term669910, term669910.getClass(), "last", null);
        setField(term669910, term669910.getClass(), "propListHead", null);
        setIntField(term669910, term669910.getClass(), "sourcePosition", 0);
        setField(term669910, term669910.getClass(), "jsType", null);
        setField(term669910, term669910.getClass(), "parent", null);
        term669861 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term669864 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term669867 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term669861, term669861.getClass(), "number", 0.0);
        setIntField(term669861, term669861.getClass(), "type", 24);
        setField(term669861, term669861.getClass(), "next", null);
        setDoubleField(term669864, term669864.getClass(), "number", 0.0);
        setIntField(term669864, term669864.getClass(), "type", 39);
        setIntField(term669867, term669867.getClass(), "encodedSourceStart", 0);
        setIntField(term669867, term669867.getClass(), "encodedSourceEnd", 0);
        setField(term669867, term669867.getClass(), "sourceName", null);
        setIntField(term669867, term669867.getClass(), "baseLineno", 0);
        setIntField(term669867, term669867.getClass(), "endLineno", 0);
        setField(term669867, term669867.getClass(), "functions", null);
        setField(term669867, term669867.getClass(), "regexps", null);
        setField(term669867, term669867.getClass(), "itsVariables", null);
        setField(term669867, term669867.getClass(), "itsConst", null);
        setField(term669867, term669867.getClass(), "itsVariableNames", null);
        setIntField(term669867, term669867.getClass(), "varStart", 0);
        setField(term669867, term669867.getClass(), "compilerData", null);
        setIntField(term669867, term669867.getClass(), "type", 0);
        setField(term669867, term669867.getClass(), "next", null);
        setField(term669867, term669867.getClass(), "first", null);
        setField(term669867, term669867.getClass(), "last", null);
        setField(term669867, term669867.getClass(), "propListHead", null);
        setIntField(term669867, term669867.getClass(), "sourcePosition", 0);
        setField(term669867, term669867.getClass(), "jsType", null);
        setField(term669867, term669867.getClass(), "parent", null);
        setField(term669864, term669864.getClass(), "next", term669867);
        setField(term669864, term669864.getClass(), "first", null);
        setField(term669864, term669864.getClass(), "last", null);
        setField(term669864, term669864.getClass(), "propListHead", null);
        setIntField(term669864, term669864.getClass(), "sourcePosition", 0);
        setField(term669864, term669864.getClass(), "jsType", null);
        setField(term669864, term669864.getClass(), "parent", null);
        setField(term669861, term669861.getClass(), "first", term669864);
        setField(term669861, term669861.getClass(), "last", null);
        setField(term669861, term669861.getClass(), "propListHead", null);
        setIntField(term669861, term669861.getClass(), "sourcePosition", 0);
        setField(term669861, term669861.getClass(), "jsType", null);
        setField(term669861, term669861.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term669144;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term669052, args);
        assertTrue(recursiveEquals(term669052, term669909));
        assertTrue(recursiveEquals(term669144, term669910));
        assertTrue(recursiveEquals(retValue, term669861));
    }

};


