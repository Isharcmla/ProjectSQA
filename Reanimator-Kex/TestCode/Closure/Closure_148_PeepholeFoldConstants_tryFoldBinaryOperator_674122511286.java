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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54904;
     Object term54994;
     Object term55398;
     Object term55399;
     Object term55343;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54904 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term54994 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term55080 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term55172 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term55080, term55080.getClass(), "next", term55172);
        setIntField(term55080, term55080.getClass(), "type", 39);
        setField(term54994, term54994.getClass(), "first", term55080);
        setIntField(term54994, term54994.getClass(), "type", 20);
        term55398 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term55398, term55398.getClass(), "currentTraversal", null);
        term55399 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term55400 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term55401 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term55399, term55399.getClass(), "encodedSourceStart", 0);
        setIntField(term55399, term55399.getClass(), "encodedSourceEnd", 0);
        setField(term55399, term55399.getClass(), "sourceName", null);
        setIntField(term55399, term55399.getClass(), "baseLineno", 0);
        setIntField(term55399, term55399.getClass(), "endLineno", 0);
        setField(term55399, term55399.getClass(), "functions", null);
        setField(term55399, term55399.getClass(), "regexps", null);
        setField(term55399, term55399.getClass(), "itsVariables", null);
        setField(term55399, term55399.getClass(), "itsConst", null);
        setField(term55399, term55399.getClass(), "itsVariableNames", null);
        setIntField(term55399, term55399.getClass(), "varStart", 0);
        setField(term55399, term55399.getClass(), "compilerData", null);
        setIntField(term55399, term55399.getClass(), "type", 20);
        setField(term55399, term55399.getClass(), "next", null);
        setField(term55400, term55400.getClass(), "functionName", null);
        setBooleanField(term55400, term55400.getClass(), "itsNeedsActivation", false);
        setIntField(term55400, term55400.getClass(), "itsFunctionType", 0);
        setBooleanField(term55400, term55400.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term55400, term55400.getClass(), "encodedSourceStart", 0);
        setIntField(term55400, term55400.getClass(), "encodedSourceEnd", 0);
        setField(term55400, term55400.getClass(), "sourceName", null);
        setIntField(term55400, term55400.getClass(), "baseLineno", 0);
        setIntField(term55400, term55400.getClass(), "endLineno", 0);
        setField(term55400, term55400.getClass(), "functions", null);
        setField(term55400, term55400.getClass(), "regexps", null);
        setField(term55400, term55400.getClass(), "itsVariables", null);
        setField(term55400, term55400.getClass(), "itsConst", null);
        setField(term55400, term55400.getClass(), "itsVariableNames", null);
        setIntField(term55400, term55400.getClass(), "varStart", 0);
        setField(term55400, term55400.getClass(), "compilerData", null);
        setIntField(term55400, term55400.getClass(), "type", 39);
        setField(term55401, term55401.getClass(), "str", null);
        setIntField(term55401, term55401.getClass(), "type", 0);
        setField(term55401, term55401.getClass(), "next", null);
        setField(term55401, term55401.getClass(), "first", null);
        setField(term55401, term55401.getClass(), "last", null);
        setField(term55401, term55401.getClass(), "propListHead", null);
        setIntField(term55401, term55401.getClass(), "sourcePosition", 0);
        setField(term55401, term55401.getClass(), "jsType", null);
        setField(term55401, term55401.getClass(), "parent", null);
        setField(term55400, term55400.getClass(), "next", term55401);
        setField(term55400, term55400.getClass(), "first", null);
        setField(term55400, term55400.getClass(), "last", null);
        setField(term55400, term55400.getClass(), "propListHead", null);
        setIntField(term55400, term55400.getClass(), "sourcePosition", 0);
        setField(term55400, term55400.getClass(), "jsType", null);
        setField(term55400, term55400.getClass(), "parent", null);
        setField(term55399, term55399.getClass(), "first", term55400);
        setField(term55399, term55399.getClass(), "last", null);
        setField(term55399, term55399.getClass(), "propListHead", null);
        setIntField(term55399, term55399.getClass(), "sourcePosition", 0);
        setField(term55399, term55399.getClass(), "jsType", null);
        setField(term55399, term55399.getClass(), "parent", null);
        term55343 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term55350 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term55360 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term55343, term55343.getClass(), "encodedSourceStart", 0);
        setIntField(term55343, term55343.getClass(), "encodedSourceEnd", 0);
        setField(term55343, term55343.getClass(), "sourceName", null);
        setIntField(term55343, term55343.getClass(), "baseLineno", 0);
        setIntField(term55343, term55343.getClass(), "endLineno", 0);
        setField(term55343, term55343.getClass(), "functions", null);
        setField(term55343, term55343.getClass(), "regexps", null);
        setField(term55343, term55343.getClass(), "itsVariables", null);
        setField(term55343, term55343.getClass(), "itsConst", null);
        setField(term55343, term55343.getClass(), "itsVariableNames", null);
        setIntField(term55343, term55343.getClass(), "varStart", 0);
        setField(term55343, term55343.getClass(), "compilerData", null);
        setIntField(term55343, term55343.getClass(), "type", 20);
        setField(term55343, term55343.getClass(), "next", null);
        setField(term55350, term55350.getClass(), "functionName", null);
        setBooleanField(term55350, term55350.getClass(), "itsNeedsActivation", false);
        setIntField(term55350, term55350.getClass(), "itsFunctionType", 0);
        setBooleanField(term55350, term55350.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term55350, term55350.getClass(), "encodedSourceStart", 0);
        setIntField(term55350, term55350.getClass(), "encodedSourceEnd", 0);
        setField(term55350, term55350.getClass(), "sourceName", null);
        setIntField(term55350, term55350.getClass(), "baseLineno", 0);
        setIntField(term55350, term55350.getClass(), "endLineno", 0);
        setField(term55350, term55350.getClass(), "functions", null);
        setField(term55350, term55350.getClass(), "regexps", null);
        setField(term55350, term55350.getClass(), "itsVariables", null);
        setField(term55350, term55350.getClass(), "itsConst", null);
        setField(term55350, term55350.getClass(), "itsVariableNames", null);
        setIntField(term55350, term55350.getClass(), "varStart", 0);
        setField(term55350, term55350.getClass(), "compilerData", null);
        setIntField(term55350, term55350.getClass(), "type", 39);
        setField(term55360, term55360.getClass(), "str", null);
        setIntField(term55360, term55360.getClass(), "type", 0);
        setField(term55360, term55360.getClass(), "next", null);
        setField(term55360, term55360.getClass(), "first", null);
        setField(term55360, term55360.getClass(), "last", null);
        setField(term55360, term55360.getClass(), "propListHead", null);
        setIntField(term55360, term55360.getClass(), "sourcePosition", 0);
        setField(term55360, term55360.getClass(), "jsType", null);
        setField(term55360, term55360.getClass(), "parent", null);
        setField(term55350, term55350.getClass(), "next", term55360);
        setField(term55350, term55350.getClass(), "first", null);
        setField(term55350, term55350.getClass(), "last", null);
        setField(term55350, term55350.getClass(), "propListHead", null);
        setIntField(term55350, term55350.getClass(), "sourcePosition", 0);
        setField(term55350, term55350.getClass(), "jsType", null);
        setField(term55350, term55350.getClass(), "parent", null);
        setField(term55343, term55343.getClass(), "first", term55350);
        setField(term55343, term55343.getClass(), "last", null);
        setField(term55343, term55343.getClass(), "propListHead", null);
        setIntField(term55343, term55343.getClass(), "sourcePosition", 0);
        setField(term55343, term55343.getClass(), "jsType", null);
        setField(term55343, term55343.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term54994;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term54904, args);
        assertTrue(recursiveEquals(term54904, term55398));
        assertTrue(recursiveEquals(term54994, term55399));
        assertTrue(recursiveEquals(retValue, term55343));
    }

};


