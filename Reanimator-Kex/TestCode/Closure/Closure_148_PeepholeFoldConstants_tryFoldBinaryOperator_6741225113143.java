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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term930270;
     Object term930360;
     Object term931678;
     Object term931679;
     Object term931620;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term930270 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term930360 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term930446 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term930538 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term930446, term930446.getClass(), "next", term930538);
        setIntField(term930446, term930446.getClass(), "type", 39);
        setField(term930360, term930360.getClass(), "first", term930446);
        setIntField(term930360, term930360.getClass(), "type", 18);
        term931678 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term931678, term931678.getClass(), "currentTraversal", null);
        term931679 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term931680 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term931681 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term931679, term931679.getClass(), "encodedSourceStart", 0);
        setIntField(term931679, term931679.getClass(), "encodedSourceEnd", 0);
        setField(term931679, term931679.getClass(), "sourceName", null);
        setIntField(term931679, term931679.getClass(), "baseLineno", 0);
        setIntField(term931679, term931679.getClass(), "endLineno", 0);
        setField(term931679, term931679.getClass(), "functions", null);
        setField(term931679, term931679.getClass(), "regexps", null);
        setField(term931679, term931679.getClass(), "itsVariables", null);
        setField(term931679, term931679.getClass(), "itsConst", null);
        setField(term931679, term931679.getClass(), "itsVariableNames", null);
        setIntField(term931679, term931679.getClass(), "varStart", 0);
        setField(term931679, term931679.getClass(), "compilerData", null);
        setIntField(term931679, term931679.getClass(), "type", 18);
        setField(term931679, term931679.getClass(), "next", null);
        setField(term931680, term931680.getClass(), "functionName", null);
        setBooleanField(term931680, term931680.getClass(), "itsNeedsActivation", false);
        setIntField(term931680, term931680.getClass(), "itsFunctionType", 0);
        setBooleanField(term931680, term931680.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term931680, term931680.getClass(), "encodedSourceStart", 0);
        setIntField(term931680, term931680.getClass(), "encodedSourceEnd", 0);
        setField(term931680, term931680.getClass(), "sourceName", null);
        setIntField(term931680, term931680.getClass(), "baseLineno", 0);
        setIntField(term931680, term931680.getClass(), "endLineno", 0);
        setField(term931680, term931680.getClass(), "functions", null);
        setField(term931680, term931680.getClass(), "regexps", null);
        setField(term931680, term931680.getClass(), "itsVariables", null);
        setField(term931680, term931680.getClass(), "itsConst", null);
        setField(term931680, term931680.getClass(), "itsVariableNames", null);
        setIntField(term931680, term931680.getClass(), "varStart", 0);
        setField(term931680, term931680.getClass(), "compilerData", null);
        setIntField(term931680, term931680.getClass(), "type", 39);
        setDoubleField(term931681, term931681.getClass(), "number", 0.0);
        setIntField(term931681, term931681.getClass(), "type", 0);
        setField(term931681, term931681.getClass(), "next", null);
        setField(term931681, term931681.getClass(), "first", null);
        setField(term931681, term931681.getClass(), "last", null);
        setField(term931681, term931681.getClass(), "propListHead", null);
        setIntField(term931681, term931681.getClass(), "sourcePosition", 0);
        setField(term931681, term931681.getClass(), "jsType", null);
        setField(term931681, term931681.getClass(), "parent", null);
        setField(term931680, term931680.getClass(), "next", term931681);
        setField(term931680, term931680.getClass(), "first", null);
        setField(term931680, term931680.getClass(), "last", null);
        setField(term931680, term931680.getClass(), "propListHead", null);
        setIntField(term931680, term931680.getClass(), "sourcePosition", 0);
        setField(term931680, term931680.getClass(), "jsType", null);
        setField(term931680, term931680.getClass(), "parent", null);
        setField(term931679, term931679.getClass(), "first", term931680);
        setField(term931679, term931679.getClass(), "last", null);
        setField(term931679, term931679.getClass(), "propListHead", null);
        setIntField(term931679, term931679.getClass(), "sourcePosition", 0);
        setField(term931679, term931679.getClass(), "jsType", null);
        setField(term931679, term931679.getClass(), "parent", null);
        term931620 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term931627 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term931637 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term931620, term931620.getClass(), "encodedSourceStart", 0);
        setIntField(term931620, term931620.getClass(), "encodedSourceEnd", 0);
        setField(term931620, term931620.getClass(), "sourceName", null);
        setIntField(term931620, term931620.getClass(), "baseLineno", 0);
        setIntField(term931620, term931620.getClass(), "endLineno", 0);
        setField(term931620, term931620.getClass(), "functions", null);
        setField(term931620, term931620.getClass(), "regexps", null);
        setField(term931620, term931620.getClass(), "itsVariables", null);
        setField(term931620, term931620.getClass(), "itsConst", null);
        setField(term931620, term931620.getClass(), "itsVariableNames", null);
        setIntField(term931620, term931620.getClass(), "varStart", 0);
        setField(term931620, term931620.getClass(), "compilerData", null);
        setIntField(term931620, term931620.getClass(), "type", 18);
        setField(term931620, term931620.getClass(), "next", null);
        setField(term931627, term931627.getClass(), "functionName", null);
        setBooleanField(term931627, term931627.getClass(), "itsNeedsActivation", false);
        setIntField(term931627, term931627.getClass(), "itsFunctionType", 0);
        setBooleanField(term931627, term931627.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term931627, term931627.getClass(), "encodedSourceStart", 0);
        setIntField(term931627, term931627.getClass(), "encodedSourceEnd", 0);
        setField(term931627, term931627.getClass(), "sourceName", null);
        setIntField(term931627, term931627.getClass(), "baseLineno", 0);
        setIntField(term931627, term931627.getClass(), "endLineno", 0);
        setField(term931627, term931627.getClass(), "functions", null);
        setField(term931627, term931627.getClass(), "regexps", null);
        setField(term931627, term931627.getClass(), "itsVariables", null);
        setField(term931627, term931627.getClass(), "itsConst", null);
        setField(term931627, term931627.getClass(), "itsVariableNames", null);
        setIntField(term931627, term931627.getClass(), "varStart", 0);
        setField(term931627, term931627.getClass(), "compilerData", null);
        setIntField(term931627, term931627.getClass(), "type", 39);
        setDoubleField(term931637, term931637.getClass(), "number", 0.0);
        setIntField(term931637, term931637.getClass(), "type", 0);
        setField(term931637, term931637.getClass(), "next", null);
        setField(term931637, term931637.getClass(), "first", null);
        setField(term931637, term931637.getClass(), "last", null);
        setField(term931637, term931637.getClass(), "propListHead", null);
        setIntField(term931637, term931637.getClass(), "sourcePosition", 0);
        setField(term931637, term931637.getClass(), "jsType", null);
        setField(term931637, term931637.getClass(), "parent", null);
        setField(term931627, term931627.getClass(), "next", term931637);
        setField(term931627, term931627.getClass(), "first", null);
        setField(term931627, term931627.getClass(), "last", null);
        setField(term931627, term931627.getClass(), "propListHead", null);
        setIntField(term931627, term931627.getClass(), "sourcePosition", 0);
        setField(term931627, term931627.getClass(), "jsType", null);
        setField(term931627, term931627.getClass(), "parent", null);
        setField(term931620, term931620.getClass(), "first", term931627);
        setField(term931620, term931620.getClass(), "last", null);
        setField(term931620, term931620.getClass(), "propListHead", null);
        setIntField(term931620, term931620.getClass(), "sourcePosition", 0);
        setField(term931620, term931620.getClass(), "jsType", null);
        setField(term931620, term931620.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term930360;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term930270, args);
        assertTrue(recursiveEquals(term930270, term931678));
        assertTrue(recursiveEquals(term930360, term931679));
        assertTrue(recursiveEquals(retValue, term931620));
    }

};


