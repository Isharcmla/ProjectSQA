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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261820;
     Object term261912;
     Object term262376;
     Object term262377;
     Object term262287;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term261820 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term261912 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term262002 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term262088 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term262002, term262002.getClass(), "next", term262088);
        setIntField(term262002, term262002.getClass(), "type", 0);
        setField(term261912, term261912.getClass(), "first", term262002);
        setIntField(term261912, term261912.getClass(), "type", 101);
        setField(term261912, term261912.getClass(), "parent", null);
        term262376 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term262376, term262376.getClass(), "currentTraversal", null);
        term262377 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term262378 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term262379 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term262377, term262377.getClass(), "number", 0.0);
        setIntField(term262377, term262377.getClass(), "type", 101);
        setField(term262377, term262377.getClass(), "next", null);
        setIntField(term262378, term262378.getClass(), "encodedSourceStart", 0);
        setIntField(term262378, term262378.getClass(), "encodedSourceEnd", 0);
        setField(term262378, term262378.getClass(), "sourceName", null);
        setIntField(term262378, term262378.getClass(), "baseLineno", 0);
        setIntField(term262378, term262378.getClass(), "endLineno", 0);
        setField(term262378, term262378.getClass(), "functions", null);
        setField(term262378, term262378.getClass(), "regexps", null);
        setField(term262378, term262378.getClass(), "itsVariables", null);
        setField(term262378, term262378.getClass(), "itsConst", null);
        setField(term262378, term262378.getClass(), "itsVariableNames", null);
        setIntField(term262378, term262378.getClass(), "varStart", 0);
        setField(term262378, term262378.getClass(), "compilerData", null);
        setIntField(term262378, term262378.getClass(), "type", 0);
        setField(term262379, term262379.getClass(), "functionName", null);
        setBooleanField(term262379, term262379.getClass(), "itsNeedsActivation", false);
        setIntField(term262379, term262379.getClass(), "itsFunctionType", 0);
        setBooleanField(term262379, term262379.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term262379, term262379.getClass(), "encodedSourceStart", 0);
        setIntField(term262379, term262379.getClass(), "encodedSourceEnd", 0);
        setField(term262379, term262379.getClass(), "sourceName", null);
        setIntField(term262379, term262379.getClass(), "baseLineno", 0);
        setIntField(term262379, term262379.getClass(), "endLineno", 0);
        setField(term262379, term262379.getClass(), "functions", null);
        setField(term262379, term262379.getClass(), "regexps", null);
        setField(term262379, term262379.getClass(), "itsVariables", null);
        setField(term262379, term262379.getClass(), "itsConst", null);
        setField(term262379, term262379.getClass(), "itsVariableNames", null);
        setIntField(term262379, term262379.getClass(), "varStart", 0);
        setField(term262379, term262379.getClass(), "compilerData", null);
        setIntField(term262379, term262379.getClass(), "type", 0);
        setField(term262379, term262379.getClass(), "next", null);
        setField(term262379, term262379.getClass(), "first", null);
        setField(term262379, term262379.getClass(), "last", null);
        setField(term262379, term262379.getClass(), "propListHead", null);
        setIntField(term262379, term262379.getClass(), "sourcePosition", 0);
        setField(term262379, term262379.getClass(), "jsType", null);
        setField(term262379, term262379.getClass(), "parent", null);
        setField(term262378, term262378.getClass(), "next", term262379);
        setField(term262378, term262378.getClass(), "first", null);
        setField(term262378, term262378.getClass(), "last", null);
        setField(term262378, term262378.getClass(), "propListHead", null);
        setIntField(term262378, term262378.getClass(), "sourcePosition", 0);
        setField(term262378, term262378.getClass(), "jsType", null);
        setField(term262378, term262378.getClass(), "parent", null);
        setField(term262377, term262377.getClass(), "first", term262378);
        setField(term262377, term262377.getClass(), "last", null);
        setField(term262377, term262377.getClass(), "propListHead", null);
        setIntField(term262377, term262377.getClass(), "sourcePosition", 0);
        setField(term262377, term262377.getClass(), "jsType", null);
        setField(term262377, term262377.getClass(), "parent", null);
        term262287 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term262290 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term262297 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term262287, term262287.getClass(), "number", 0.0);
        setIntField(term262287, term262287.getClass(), "type", 101);
        setField(term262287, term262287.getClass(), "next", null);
        setIntField(term262290, term262290.getClass(), "encodedSourceStart", 0);
        setIntField(term262290, term262290.getClass(), "encodedSourceEnd", 0);
        setField(term262290, term262290.getClass(), "sourceName", null);
        setIntField(term262290, term262290.getClass(), "baseLineno", 0);
        setIntField(term262290, term262290.getClass(), "endLineno", 0);
        setField(term262290, term262290.getClass(), "functions", null);
        setField(term262290, term262290.getClass(), "regexps", null);
        setField(term262290, term262290.getClass(), "itsVariables", null);
        setField(term262290, term262290.getClass(), "itsConst", null);
        setField(term262290, term262290.getClass(), "itsVariableNames", null);
        setIntField(term262290, term262290.getClass(), "varStart", 0);
        setField(term262290, term262290.getClass(), "compilerData", null);
        setIntField(term262290, term262290.getClass(), "type", 0);
        setField(term262297, term262297.getClass(), "functionName", null);
        setBooleanField(term262297, term262297.getClass(), "itsNeedsActivation", false);
        setIntField(term262297, term262297.getClass(), "itsFunctionType", 0);
        setBooleanField(term262297, term262297.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term262297, term262297.getClass(), "encodedSourceStart", 0);
        setIntField(term262297, term262297.getClass(), "encodedSourceEnd", 0);
        setField(term262297, term262297.getClass(), "sourceName", null);
        setIntField(term262297, term262297.getClass(), "baseLineno", 0);
        setIntField(term262297, term262297.getClass(), "endLineno", 0);
        setField(term262297, term262297.getClass(), "functions", null);
        setField(term262297, term262297.getClass(), "regexps", null);
        setField(term262297, term262297.getClass(), "itsVariables", null);
        setField(term262297, term262297.getClass(), "itsConst", null);
        setField(term262297, term262297.getClass(), "itsVariableNames", null);
        setIntField(term262297, term262297.getClass(), "varStart", 0);
        setField(term262297, term262297.getClass(), "compilerData", null);
        setIntField(term262297, term262297.getClass(), "type", 0);
        setField(term262297, term262297.getClass(), "next", null);
        setField(term262297, term262297.getClass(), "first", null);
        setField(term262297, term262297.getClass(), "last", null);
        setField(term262297, term262297.getClass(), "propListHead", null);
        setIntField(term262297, term262297.getClass(), "sourcePosition", 0);
        setField(term262297, term262297.getClass(), "jsType", null);
        setField(term262297, term262297.getClass(), "parent", null);
        setField(term262290, term262290.getClass(), "next", term262297);
        setField(term262290, term262290.getClass(), "first", null);
        setField(term262290, term262290.getClass(), "last", null);
        setField(term262290, term262290.getClass(), "propListHead", null);
        setIntField(term262290, term262290.getClass(), "sourcePosition", 0);
        setField(term262290, term262290.getClass(), "jsType", null);
        setField(term262290, term262290.getClass(), "parent", null);
        setField(term262287, term262287.getClass(), "first", term262290);
        setField(term262287, term262287.getClass(), "last", null);
        setField(term262287, term262287.getClass(), "propListHead", null);
        setIntField(term262287, term262287.getClass(), "sourcePosition", 0);
        setField(term262287, term262287.getClass(), "jsType", null);
        setField(term262287, term262287.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term261912;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term261820, args);
        assertTrue(recursiveEquals(term261820, term262376));
        assertTrue(recursiveEquals(term261912, term262377));
        assertTrue(recursiveEquals(retValue, term262287));
    }

};


