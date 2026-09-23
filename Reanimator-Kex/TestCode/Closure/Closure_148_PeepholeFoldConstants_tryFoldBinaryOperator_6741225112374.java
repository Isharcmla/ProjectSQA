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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term659229;
     Object term659321;
     Object term659567;
     Object term659568;
     Object term659514;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term659229 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term659321 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term659413 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term659499 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term659413, term659413.getClass(), "next", term659499);
        setIntField(term659413, term659413.getClass(), "type", 39);
        setField(term659321, term659321.getClass(), "first", term659413);
        setIntField(term659321, term659321.getClass(), "type", 19);
        term659567 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term659567, term659567.getClass(), "currentTraversal", null);
        term659568 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term659569 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term659570 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term659568, term659568.getClass(), "str", null);
        setIntField(term659568, term659568.getClass(), "type", 19);
        setField(term659568, term659568.getClass(), "next", null);
        setField(term659569, term659569.getClass(), "str", null);
        setIntField(term659569, term659569.getClass(), "type", 39);
        setField(term659570, term659570.getClass(), "functionName", null);
        setBooleanField(term659570, term659570.getClass(), "itsNeedsActivation", false);
        setIntField(term659570, term659570.getClass(), "itsFunctionType", 0);
        setBooleanField(term659570, term659570.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term659570, term659570.getClass(), "encodedSourceStart", 0);
        setIntField(term659570, term659570.getClass(), "encodedSourceEnd", 0);
        setField(term659570, term659570.getClass(), "sourceName", null);
        setIntField(term659570, term659570.getClass(), "baseLineno", 0);
        setIntField(term659570, term659570.getClass(), "endLineno", 0);
        setField(term659570, term659570.getClass(), "functions", null);
        setField(term659570, term659570.getClass(), "regexps", null);
        setField(term659570, term659570.getClass(), "itsVariables", null);
        setField(term659570, term659570.getClass(), "itsConst", null);
        setField(term659570, term659570.getClass(), "itsVariableNames", null);
        setIntField(term659570, term659570.getClass(), "varStart", 0);
        setField(term659570, term659570.getClass(), "compilerData", null);
        setIntField(term659570, term659570.getClass(), "type", 0);
        setField(term659570, term659570.getClass(), "next", null);
        setField(term659570, term659570.getClass(), "first", null);
        setField(term659570, term659570.getClass(), "last", null);
        setField(term659570, term659570.getClass(), "propListHead", null);
        setIntField(term659570, term659570.getClass(), "sourcePosition", 0);
        setField(term659570, term659570.getClass(), "jsType", null);
        setField(term659570, term659570.getClass(), "parent", null);
        setField(term659569, term659569.getClass(), "next", term659570);
        setField(term659569, term659569.getClass(), "first", null);
        setField(term659569, term659569.getClass(), "last", null);
        setField(term659569, term659569.getClass(), "propListHead", null);
        setIntField(term659569, term659569.getClass(), "sourcePosition", 0);
        setField(term659569, term659569.getClass(), "jsType", null);
        setField(term659569, term659569.getClass(), "parent", null);
        setField(term659568, term659568.getClass(), "first", term659569);
        setField(term659568, term659568.getClass(), "last", null);
        setField(term659568, term659568.getClass(), "propListHead", null);
        setIntField(term659568, term659568.getClass(), "sourcePosition", 0);
        setField(term659568, term659568.getClass(), "jsType", null);
        setField(term659568, term659568.getClass(), "parent", null);
        term659514 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term659516 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term659518 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term659514, term659514.getClass(), "str", null);
        setIntField(term659514, term659514.getClass(), "type", 19);
        setField(term659514, term659514.getClass(), "next", null);
        setField(term659516, term659516.getClass(), "str", null);
        setIntField(term659516, term659516.getClass(), "type", 39);
        setField(term659518, term659518.getClass(), "functionName", null);
        setBooleanField(term659518, term659518.getClass(), "itsNeedsActivation", false);
        setIntField(term659518, term659518.getClass(), "itsFunctionType", 0);
        setBooleanField(term659518, term659518.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term659518, term659518.getClass(), "encodedSourceStart", 0);
        setIntField(term659518, term659518.getClass(), "encodedSourceEnd", 0);
        setField(term659518, term659518.getClass(), "sourceName", null);
        setIntField(term659518, term659518.getClass(), "baseLineno", 0);
        setIntField(term659518, term659518.getClass(), "endLineno", 0);
        setField(term659518, term659518.getClass(), "functions", null);
        setField(term659518, term659518.getClass(), "regexps", null);
        setField(term659518, term659518.getClass(), "itsVariables", null);
        setField(term659518, term659518.getClass(), "itsConst", null);
        setField(term659518, term659518.getClass(), "itsVariableNames", null);
        setIntField(term659518, term659518.getClass(), "varStart", 0);
        setField(term659518, term659518.getClass(), "compilerData", null);
        setIntField(term659518, term659518.getClass(), "type", 0);
        setField(term659518, term659518.getClass(), "next", null);
        setField(term659518, term659518.getClass(), "first", null);
        setField(term659518, term659518.getClass(), "last", null);
        setField(term659518, term659518.getClass(), "propListHead", null);
        setIntField(term659518, term659518.getClass(), "sourcePosition", 0);
        setField(term659518, term659518.getClass(), "jsType", null);
        setField(term659518, term659518.getClass(), "parent", null);
        setField(term659516, term659516.getClass(), "next", term659518);
        setField(term659516, term659516.getClass(), "first", null);
        setField(term659516, term659516.getClass(), "last", null);
        setField(term659516, term659516.getClass(), "propListHead", null);
        setIntField(term659516, term659516.getClass(), "sourcePosition", 0);
        setField(term659516, term659516.getClass(), "jsType", null);
        setField(term659516, term659516.getClass(), "parent", null);
        setField(term659514, term659514.getClass(), "first", term659516);
        setField(term659514, term659514.getClass(), "last", null);
        setField(term659514, term659514.getClass(), "propListHead", null);
        setIntField(term659514, term659514.getClass(), "sourcePosition", 0);
        setField(term659514, term659514.getClass(), "jsType", null);
        setField(term659514, term659514.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term659321;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term659229, args);
        assertTrue(recursiveEquals(term659229, term659567));
        assertTrue(recursiveEquals(term659321, term659568));
        assertTrue(recursiveEquals(retValue, term659514));
    }

};


