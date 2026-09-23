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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term680166;
     Object term680258;
     Object term680893;
     Object term680894;
     Object term680842;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term680166 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term680258 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term680344 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term680414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term680344, term680344.getClass(), "next", term680414);
        setIntField(term680344, term680344.getClass(), "type", 39);
        setField(term680258, term680258.getClass(), "first", term680344);
        setIntField(term680258, term680258.getClass(), "type", 9);
        term680893 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term680893, term680893.getClass(), "currentTraversal", null);
        term680894 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term680895 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term680896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term680894, term680894.getClass(), "str", null);
        setIntField(term680894, term680894.getClass(), "type", 9);
        setField(term680894, term680894.getClass(), "next", null);
        setField(term680895, term680895.getClass(), "functionName", null);
        setBooleanField(term680895, term680895.getClass(), "itsNeedsActivation", false);
        setIntField(term680895, term680895.getClass(), "itsFunctionType", 0);
        setBooleanField(term680895, term680895.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term680895, term680895.getClass(), "encodedSourceStart", 0);
        setIntField(term680895, term680895.getClass(), "encodedSourceEnd", 0);
        setField(term680895, term680895.getClass(), "sourceName", null);
        setIntField(term680895, term680895.getClass(), "baseLineno", 0);
        setIntField(term680895, term680895.getClass(), "endLineno", 0);
        setField(term680895, term680895.getClass(), "functions", null);
        setField(term680895, term680895.getClass(), "regexps", null);
        setField(term680895, term680895.getClass(), "itsVariables", null);
        setField(term680895, term680895.getClass(), "itsConst", null);
        setField(term680895, term680895.getClass(), "itsVariableNames", null);
        setIntField(term680895, term680895.getClass(), "varStart", 0);
        setField(term680895, term680895.getClass(), "compilerData", null);
        setIntField(term680895, term680895.getClass(), "type", 39);
        setIntField(term680896, term680896.getClass(), "type", 0);
        setField(term680896, term680896.getClass(), "next", null);
        setField(term680896, term680896.getClass(), "first", null);
        setField(term680896, term680896.getClass(), "last", null);
        setField(term680896, term680896.getClass(), "propListHead", null);
        setIntField(term680896, term680896.getClass(), "sourcePosition", 0);
        setField(term680896, term680896.getClass(), "jsType", null);
        setField(term680896, term680896.getClass(), "parent", null);
        setField(term680895, term680895.getClass(), "next", term680896);
        setField(term680895, term680895.getClass(), "first", null);
        setField(term680895, term680895.getClass(), "last", null);
        setField(term680895, term680895.getClass(), "propListHead", null);
        setIntField(term680895, term680895.getClass(), "sourcePosition", 0);
        setField(term680895, term680895.getClass(), "jsType", null);
        setField(term680895, term680895.getClass(), "parent", null);
        setField(term680894, term680894.getClass(), "first", term680895);
        setField(term680894, term680894.getClass(), "last", null);
        setField(term680894, term680894.getClass(), "propListHead", null);
        setIntField(term680894, term680894.getClass(), "sourcePosition", 0);
        setField(term680894, term680894.getClass(), "jsType", null);
        setField(term680894, term680894.getClass(), "parent", null);
        term680842 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term680844 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term680854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term680842, term680842.getClass(), "str", null);
        setIntField(term680842, term680842.getClass(), "type", 9);
        setField(term680842, term680842.getClass(), "next", null);
        setField(term680844, term680844.getClass(), "functionName", null);
        setBooleanField(term680844, term680844.getClass(), "itsNeedsActivation", false);
        setIntField(term680844, term680844.getClass(), "itsFunctionType", 0);
        setBooleanField(term680844, term680844.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term680844, term680844.getClass(), "encodedSourceStart", 0);
        setIntField(term680844, term680844.getClass(), "encodedSourceEnd", 0);
        setField(term680844, term680844.getClass(), "sourceName", null);
        setIntField(term680844, term680844.getClass(), "baseLineno", 0);
        setIntField(term680844, term680844.getClass(), "endLineno", 0);
        setField(term680844, term680844.getClass(), "functions", null);
        setField(term680844, term680844.getClass(), "regexps", null);
        setField(term680844, term680844.getClass(), "itsVariables", null);
        setField(term680844, term680844.getClass(), "itsConst", null);
        setField(term680844, term680844.getClass(), "itsVariableNames", null);
        setIntField(term680844, term680844.getClass(), "varStart", 0);
        setField(term680844, term680844.getClass(), "compilerData", null);
        setIntField(term680844, term680844.getClass(), "type", 39);
        setIntField(term680854, term680854.getClass(), "type", 0);
        setField(term680854, term680854.getClass(), "next", null);
        setField(term680854, term680854.getClass(), "first", null);
        setField(term680854, term680854.getClass(), "last", null);
        setField(term680854, term680854.getClass(), "propListHead", null);
        setIntField(term680854, term680854.getClass(), "sourcePosition", 0);
        setField(term680854, term680854.getClass(), "jsType", null);
        setField(term680854, term680854.getClass(), "parent", null);
        setField(term680844, term680844.getClass(), "next", term680854);
        setField(term680844, term680844.getClass(), "first", null);
        setField(term680844, term680844.getClass(), "last", null);
        setField(term680844, term680844.getClass(), "propListHead", null);
        setIntField(term680844, term680844.getClass(), "sourcePosition", 0);
        setField(term680844, term680844.getClass(), "jsType", null);
        setField(term680844, term680844.getClass(), "parent", null);
        setField(term680842, term680842.getClass(), "first", term680844);
        setField(term680842, term680842.getClass(), "last", null);
        setField(term680842, term680842.getClass(), "propListHead", null);
        setIntField(term680842, term680842.getClass(), "sourcePosition", 0);
        setField(term680842, term680842.getClass(), "jsType", null);
        setField(term680842, term680842.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term680258;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term680166, args);
        assertTrue(recursiveEquals(term680166, term680893));
        assertTrue(recursiveEquals(term680258, term680894));
        assertTrue(recursiveEquals(retValue, term680842));
    }

};


