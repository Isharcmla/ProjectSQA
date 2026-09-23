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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78489;
     Object term78559;
     Object term78894;
     Object term78895;
     Object term78828;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78489 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term78559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78649 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term78741 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term78649, term78649.getClass(), "next", term78741);
        setIntField(term78649, term78649.getClass(), "type", 0);
        setField(term78559, term78559.getClass(), "first", term78649);
        setIntField(term78559, term78559.getClass(), "type", 101);
        setField(term78559, term78559.getClass(), "parent", null);
        term78894 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term78894, term78894.getClass(), "currentTraversal", null);
        term78895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78896 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term78897 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term78895, term78895.getClass(), "type", 101);
        setField(term78895, term78895.getClass(), "next", null);
        setIntField(term78896, term78896.getClass(), "encodedSourceStart", 0);
        setIntField(term78896, term78896.getClass(), "encodedSourceEnd", 0);
        setField(term78896, term78896.getClass(), "sourceName", null);
        setIntField(term78896, term78896.getClass(), "baseLineno", 0);
        setIntField(term78896, term78896.getClass(), "endLineno", 0);
        setField(term78896, term78896.getClass(), "functions", null);
        setField(term78896, term78896.getClass(), "regexps", null);
        setField(term78896, term78896.getClass(), "itsVariables", null);
        setField(term78896, term78896.getClass(), "itsConst", null);
        setField(term78896, term78896.getClass(), "itsVariableNames", null);
        setIntField(term78896, term78896.getClass(), "varStart", 0);
        setField(term78896, term78896.getClass(), "compilerData", null);
        setIntField(term78896, term78896.getClass(), "type", 0);
        setDoubleField(term78897, term78897.getClass(), "number", 0.0);
        setIntField(term78897, term78897.getClass(), "type", 0);
        setField(term78897, term78897.getClass(), "next", null);
        setField(term78897, term78897.getClass(), "first", null);
        setField(term78897, term78897.getClass(), "last", null);
        setField(term78897, term78897.getClass(), "propListHead", null);
        setIntField(term78897, term78897.getClass(), "sourcePosition", 0);
        setField(term78897, term78897.getClass(), "jsType", null);
        setField(term78897, term78897.getClass(), "parent", null);
        setField(term78896, term78896.getClass(), "next", term78897);
        setField(term78896, term78896.getClass(), "first", null);
        setField(term78896, term78896.getClass(), "last", null);
        setField(term78896, term78896.getClass(), "propListHead", null);
        setIntField(term78896, term78896.getClass(), "sourcePosition", 0);
        setField(term78896, term78896.getClass(), "jsType", null);
        setField(term78896, term78896.getClass(), "parent", null);
        setField(term78895, term78895.getClass(), "first", term78896);
        setField(term78895, term78895.getClass(), "last", null);
        setField(term78895, term78895.getClass(), "propListHead", null);
        setIntField(term78895, term78895.getClass(), "sourcePosition", 0);
        setField(term78895, term78895.getClass(), "jsType", null);
        setField(term78895, term78895.getClass(), "parent", null);
        term78828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78830 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term78837 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term78828, term78828.getClass(), "type", 101);
        setField(term78828, term78828.getClass(), "next", null);
        setIntField(term78830, term78830.getClass(), "encodedSourceStart", 0);
        setIntField(term78830, term78830.getClass(), "encodedSourceEnd", 0);
        setField(term78830, term78830.getClass(), "sourceName", null);
        setIntField(term78830, term78830.getClass(), "baseLineno", 0);
        setIntField(term78830, term78830.getClass(), "endLineno", 0);
        setField(term78830, term78830.getClass(), "functions", null);
        setField(term78830, term78830.getClass(), "regexps", null);
        setField(term78830, term78830.getClass(), "itsVariables", null);
        setField(term78830, term78830.getClass(), "itsConst", null);
        setField(term78830, term78830.getClass(), "itsVariableNames", null);
        setIntField(term78830, term78830.getClass(), "varStart", 0);
        setField(term78830, term78830.getClass(), "compilerData", null);
        setIntField(term78830, term78830.getClass(), "type", 0);
        setDoubleField(term78837, term78837.getClass(), "number", 0.0);
        setIntField(term78837, term78837.getClass(), "type", 0);
        setField(term78837, term78837.getClass(), "next", null);
        setField(term78837, term78837.getClass(), "first", null);
        setField(term78837, term78837.getClass(), "last", null);
        setField(term78837, term78837.getClass(), "propListHead", null);
        setIntField(term78837, term78837.getClass(), "sourcePosition", 0);
        setField(term78837, term78837.getClass(), "jsType", null);
        setField(term78837, term78837.getClass(), "parent", null);
        setField(term78830, term78830.getClass(), "next", term78837);
        setField(term78830, term78830.getClass(), "first", null);
        setField(term78830, term78830.getClass(), "last", null);
        setField(term78830, term78830.getClass(), "propListHead", null);
        setIntField(term78830, term78830.getClass(), "sourcePosition", 0);
        setField(term78830, term78830.getClass(), "jsType", null);
        setField(term78830, term78830.getClass(), "parent", null);
        setField(term78828, term78828.getClass(), "first", term78830);
        setField(term78828, term78828.getClass(), "last", null);
        setField(term78828, term78828.getClass(), "propListHead", null);
        setIntField(term78828, term78828.getClass(), "sourcePosition", 0);
        setField(term78828, term78828.getClass(), "jsType", null);
        setField(term78828, term78828.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term78559;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term78489, args);
        assertTrue(recursiveEquals(term78489, term78894));
        assertTrue(recursiveEquals(term78559, term78895));
        assertTrue(recursiveEquals(retValue, term78828));
    }

};


