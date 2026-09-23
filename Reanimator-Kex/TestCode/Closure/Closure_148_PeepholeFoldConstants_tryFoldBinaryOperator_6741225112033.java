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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term546045;
     Object term546137;
     Object term546937;
     Object term546938;
     Object term546893;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term546045 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term546137 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term546229 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term546319 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term546229, term546229.getClass(), "next", term546319);
        setIntField(term546229, term546229.getClass(), "type", 39);
        setField(term546137, term546137.getClass(), "first", term546229);
        setIntField(term546137, term546137.getClass(), "type", 19);
        term546937 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term546937, term546937.getClass(), "currentTraversal", null);
        term546938 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term546939 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term546940 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term546938, term546938.getClass(), "str", null);
        setIntField(term546938, term546938.getClass(), "type", 19);
        setField(term546938, term546938.getClass(), "next", null);
        setField(term546939, term546939.getClass(), "str", null);
        setIntField(term546939, term546939.getClass(), "type", 39);
        setIntField(term546940, term546940.getClass(), "encodedSourceStart", 0);
        setIntField(term546940, term546940.getClass(), "encodedSourceEnd", 0);
        setField(term546940, term546940.getClass(), "sourceName", null);
        setIntField(term546940, term546940.getClass(), "baseLineno", 0);
        setIntField(term546940, term546940.getClass(), "endLineno", 0);
        setField(term546940, term546940.getClass(), "functions", null);
        setField(term546940, term546940.getClass(), "regexps", null);
        setField(term546940, term546940.getClass(), "itsVariables", null);
        setField(term546940, term546940.getClass(), "itsConst", null);
        setField(term546940, term546940.getClass(), "itsVariableNames", null);
        setIntField(term546940, term546940.getClass(), "varStart", 0);
        setField(term546940, term546940.getClass(), "compilerData", null);
        setIntField(term546940, term546940.getClass(), "type", 0);
        setField(term546940, term546940.getClass(), "next", null);
        setField(term546940, term546940.getClass(), "first", null);
        setField(term546940, term546940.getClass(), "last", null);
        setField(term546940, term546940.getClass(), "propListHead", null);
        setIntField(term546940, term546940.getClass(), "sourcePosition", 0);
        setField(term546940, term546940.getClass(), "jsType", null);
        setField(term546940, term546940.getClass(), "parent", null);
        setField(term546939, term546939.getClass(), "next", term546940);
        setField(term546939, term546939.getClass(), "first", null);
        setField(term546939, term546939.getClass(), "last", null);
        setField(term546939, term546939.getClass(), "propListHead", null);
        setIntField(term546939, term546939.getClass(), "sourcePosition", 0);
        setField(term546939, term546939.getClass(), "jsType", null);
        setField(term546939, term546939.getClass(), "parent", null);
        setField(term546938, term546938.getClass(), "first", term546939);
        setField(term546938, term546938.getClass(), "last", null);
        setField(term546938, term546938.getClass(), "propListHead", null);
        setIntField(term546938, term546938.getClass(), "sourcePosition", 0);
        setField(term546938, term546938.getClass(), "jsType", null);
        setField(term546938, term546938.getClass(), "parent", null);
        term546893 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term546895 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term546897 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term546893, term546893.getClass(), "str", null);
        setIntField(term546893, term546893.getClass(), "type", 19);
        setField(term546893, term546893.getClass(), "next", null);
        setField(term546895, term546895.getClass(), "str", null);
        setIntField(term546895, term546895.getClass(), "type", 39);
        setIntField(term546897, term546897.getClass(), "encodedSourceStart", 0);
        setIntField(term546897, term546897.getClass(), "encodedSourceEnd", 0);
        setField(term546897, term546897.getClass(), "sourceName", null);
        setIntField(term546897, term546897.getClass(), "baseLineno", 0);
        setIntField(term546897, term546897.getClass(), "endLineno", 0);
        setField(term546897, term546897.getClass(), "functions", null);
        setField(term546897, term546897.getClass(), "regexps", null);
        setField(term546897, term546897.getClass(), "itsVariables", null);
        setField(term546897, term546897.getClass(), "itsConst", null);
        setField(term546897, term546897.getClass(), "itsVariableNames", null);
        setIntField(term546897, term546897.getClass(), "varStart", 0);
        setField(term546897, term546897.getClass(), "compilerData", null);
        setIntField(term546897, term546897.getClass(), "type", 0);
        setField(term546897, term546897.getClass(), "next", null);
        setField(term546897, term546897.getClass(), "first", null);
        setField(term546897, term546897.getClass(), "last", null);
        setField(term546897, term546897.getClass(), "propListHead", null);
        setIntField(term546897, term546897.getClass(), "sourcePosition", 0);
        setField(term546897, term546897.getClass(), "jsType", null);
        setField(term546897, term546897.getClass(), "parent", null);
        setField(term546895, term546895.getClass(), "next", term546897);
        setField(term546895, term546895.getClass(), "first", null);
        setField(term546895, term546895.getClass(), "last", null);
        setField(term546895, term546895.getClass(), "propListHead", null);
        setIntField(term546895, term546895.getClass(), "sourcePosition", 0);
        setField(term546895, term546895.getClass(), "jsType", null);
        setField(term546895, term546895.getClass(), "parent", null);
        setField(term546893, term546893.getClass(), "first", term546895);
        setField(term546893, term546893.getClass(), "last", null);
        setField(term546893, term546893.getClass(), "propListHead", null);
        setIntField(term546893, term546893.getClass(), "sourcePosition", 0);
        setField(term546893, term546893.getClass(), "jsType", null);
        setField(term546893, term546893.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term546137;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term546045, args);
        assertTrue(recursiveEquals(term546045, term546937));
        assertTrue(recursiveEquals(term546137, term546938));
        assertTrue(recursiveEquals(retValue, term546893));
    }

};


