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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78031;
     Object term78123;
     Object term78812;
     Object term78813;
     Object term78753;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78031 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term78123 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term78215 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term78305 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term78305, term78305.getClass(), "type", 42);
        setField(term78215, term78215.getClass(), "next", term78305);
        setIntField(term78215, term78215.getClass(), "type", 42);
        setField(term78123, term78123.getClass(), "first", term78215);
        setIntField(term78123, term78123.getClass(), "type", 16);
        term78812 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term78812, term78812.getClass(), "currentTraversal", null);
        term78813 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term78814 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term78815 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term78813, term78813.getClass(), "str", null);
        setIntField(term78813, term78813.getClass(), "type", 16);
        setField(term78813, term78813.getClass(), "next", null);
        setField(term78814, term78814.getClass(), "str", null);
        setIntField(term78814, term78814.getClass(), "type", 42);
        setIntField(term78815, term78815.getClass(), "encodedSourceStart", 0);
        setIntField(term78815, term78815.getClass(), "encodedSourceEnd", 0);
        setField(term78815, term78815.getClass(), "sourceName", null);
        setIntField(term78815, term78815.getClass(), "baseLineno", 0);
        setIntField(term78815, term78815.getClass(), "endLineno", 0);
        setField(term78815, term78815.getClass(), "functions", null);
        setField(term78815, term78815.getClass(), "regexps", null);
        setField(term78815, term78815.getClass(), "itsVariables", null);
        setField(term78815, term78815.getClass(), "itsConst", null);
        setField(term78815, term78815.getClass(), "itsVariableNames", null);
        setIntField(term78815, term78815.getClass(), "varStart", 0);
        setField(term78815, term78815.getClass(), "compilerData", null);
        setIntField(term78815, term78815.getClass(), "type", 42);
        setField(term78815, term78815.getClass(), "next", null);
        setField(term78815, term78815.getClass(), "first", null);
        setField(term78815, term78815.getClass(), "last", null);
        setField(term78815, term78815.getClass(), "propListHead", null);
        setIntField(term78815, term78815.getClass(), "sourcePosition", 0);
        setField(term78815, term78815.getClass(), "jsType", null);
        setField(term78815, term78815.getClass(), "parent", null);
        setField(term78814, term78814.getClass(), "next", term78815);
        setField(term78814, term78814.getClass(), "first", null);
        setField(term78814, term78814.getClass(), "last", null);
        setField(term78814, term78814.getClass(), "propListHead", null);
        setIntField(term78814, term78814.getClass(), "sourcePosition", 0);
        setField(term78814, term78814.getClass(), "jsType", null);
        setField(term78814, term78814.getClass(), "parent", null);
        setField(term78813, term78813.getClass(), "first", term78814);
        setField(term78813, term78813.getClass(), "last", null);
        setField(term78813, term78813.getClass(), "propListHead", null);
        setIntField(term78813, term78813.getClass(), "sourcePosition", 0);
        setField(term78813, term78813.getClass(), "jsType", null);
        setField(term78813, term78813.getClass(), "parent", null);
        term78753 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term78755 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term78757 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term78753, term78753.getClass(), "str", null);
        setIntField(term78753, term78753.getClass(), "type", 16);
        setField(term78753, term78753.getClass(), "next", null);
        setField(term78755, term78755.getClass(), "str", null);
        setIntField(term78755, term78755.getClass(), "type", 42);
        setIntField(term78757, term78757.getClass(), "encodedSourceStart", 0);
        setIntField(term78757, term78757.getClass(), "encodedSourceEnd", 0);
        setField(term78757, term78757.getClass(), "sourceName", null);
        setIntField(term78757, term78757.getClass(), "baseLineno", 0);
        setIntField(term78757, term78757.getClass(), "endLineno", 0);
        setField(term78757, term78757.getClass(), "functions", null);
        setField(term78757, term78757.getClass(), "regexps", null);
        setField(term78757, term78757.getClass(), "itsVariables", null);
        setField(term78757, term78757.getClass(), "itsConst", null);
        setField(term78757, term78757.getClass(), "itsVariableNames", null);
        setIntField(term78757, term78757.getClass(), "varStart", 0);
        setField(term78757, term78757.getClass(), "compilerData", null);
        setIntField(term78757, term78757.getClass(), "type", 42);
        setField(term78757, term78757.getClass(), "next", null);
        setField(term78757, term78757.getClass(), "first", null);
        setField(term78757, term78757.getClass(), "last", null);
        setField(term78757, term78757.getClass(), "propListHead", null);
        setIntField(term78757, term78757.getClass(), "sourcePosition", 0);
        setField(term78757, term78757.getClass(), "jsType", null);
        setField(term78757, term78757.getClass(), "parent", null);
        setField(term78755, term78755.getClass(), "next", term78757);
        setField(term78755, term78755.getClass(), "first", null);
        setField(term78755, term78755.getClass(), "last", null);
        setField(term78755, term78755.getClass(), "propListHead", null);
        setIntField(term78755, term78755.getClass(), "sourcePosition", 0);
        setField(term78755, term78755.getClass(), "jsType", null);
        setField(term78755, term78755.getClass(), "parent", null);
        setField(term78753, term78753.getClass(), "first", term78755);
        setField(term78753, term78753.getClass(), "last", null);
        setField(term78753, term78753.getClass(), "propListHead", null);
        setIntField(term78753, term78753.getClass(), "sourcePosition", 0);
        setField(term78753, term78753.getClass(), "jsType", null);
        setField(term78753, term78753.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term78123;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term78031, args);
        assertTrue(recursiveEquals(term78031, term78812));
        assertTrue(recursiveEquals(term78123, term78813));
        assertTrue(recursiveEquals(retValue, term78753));
    }

};


