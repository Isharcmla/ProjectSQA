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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term891219;
     Object term891311;
     Object term891860;
     Object term891861;
     Object term891749;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term891219 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term891311 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term891401 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term891471 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term891557 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term891471, term891471.getClass(), "type", 64);
        setField(term891401, term891401.getClass(), "next", term891471);
        setIntField(term891401, term891401.getClass(), "type", 0);
        setField(term891311, term891311.getClass(), "first", term891401);
        setIntField(term891311, term891311.getClass(), "type", 101);
        setIntField(term891557, term891557.getClass(), "type", 98);
        setField(term891311, term891311.getClass(), "parent", term891557);
        term891860 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term891860, term891860.getClass(), "currentTraversal", null);
        term891861 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term891862 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term891863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term891864 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term891861, term891861.getClass(), "str", null);
        setIntField(term891861, term891861.getClass(), "type", 101);
        setField(term891861, term891861.getClass(), "next", null);
        setIntField(term891862, term891862.getClass(), "encodedSourceStart", 0);
        setIntField(term891862, term891862.getClass(), "encodedSourceEnd", 0);
        setField(term891862, term891862.getClass(), "sourceName", null);
        setIntField(term891862, term891862.getClass(), "baseLineno", 0);
        setIntField(term891862, term891862.getClass(), "endLineno", 0);
        setField(term891862, term891862.getClass(), "functions", null);
        setField(term891862, term891862.getClass(), "regexps", null);
        setField(term891862, term891862.getClass(), "itsVariables", null);
        setField(term891862, term891862.getClass(), "itsConst", null);
        setField(term891862, term891862.getClass(), "itsVariableNames", null);
        setIntField(term891862, term891862.getClass(), "varStart", 0);
        setField(term891862, term891862.getClass(), "compilerData", null);
        setIntField(term891862, term891862.getClass(), "type", 0);
        setIntField(term891863, term891863.getClass(), "type", 64);
        setField(term891863, term891863.getClass(), "next", null);
        setField(term891863, term891863.getClass(), "first", null);
        setField(term891863, term891863.getClass(), "last", null);
        setField(term891863, term891863.getClass(), "propListHead", null);
        setIntField(term891863, term891863.getClass(), "sourcePosition", 0);
        setField(term891863, term891863.getClass(), "jsType", null);
        setField(term891863, term891863.getClass(), "parent", null);
        setField(term891862, term891862.getClass(), "next", term891863);
        setField(term891862, term891862.getClass(), "first", null);
        setField(term891862, term891862.getClass(), "last", null);
        setField(term891862, term891862.getClass(), "propListHead", null);
        setIntField(term891862, term891862.getClass(), "sourcePosition", 0);
        setField(term891862, term891862.getClass(), "jsType", null);
        setField(term891862, term891862.getClass(), "parent", null);
        setField(term891861, term891861.getClass(), "first", term891862);
        setField(term891861, term891861.getClass(), "last", null);
        setField(term891861, term891861.getClass(), "propListHead", null);
        setIntField(term891861, term891861.getClass(), "sourcePosition", 0);
        setField(term891861, term891861.getClass(), "jsType", null);
        setField(term891864, term891864.getClass(), "functionName", null);
        setBooleanField(term891864, term891864.getClass(), "itsNeedsActivation", false);
        setIntField(term891864, term891864.getClass(), "itsFunctionType", 0);
        setBooleanField(term891864, term891864.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term891864, term891864.getClass(), "encodedSourceStart", 0);
        setIntField(term891864, term891864.getClass(), "encodedSourceEnd", 0);
        setField(term891864, term891864.getClass(), "sourceName", null);
        setIntField(term891864, term891864.getClass(), "baseLineno", 0);
        setIntField(term891864, term891864.getClass(), "endLineno", 0);
        setField(term891864, term891864.getClass(), "functions", null);
        setField(term891864, term891864.getClass(), "regexps", null);
        setField(term891864, term891864.getClass(), "itsVariables", null);
        setField(term891864, term891864.getClass(), "itsConst", null);
        setField(term891864, term891864.getClass(), "itsVariableNames", null);
        setIntField(term891864, term891864.getClass(), "varStart", 0);
        setField(term891864, term891864.getClass(), "compilerData", null);
        setIntField(term891864, term891864.getClass(), "type", 98);
        setField(term891864, term891864.getClass(), "next", null);
        setField(term891864, term891864.getClass(), "first", null);
        setField(term891864, term891864.getClass(), "last", null);
        setField(term891864, term891864.getClass(), "propListHead", null);
        setIntField(term891864, term891864.getClass(), "sourcePosition", 0);
        setField(term891864, term891864.getClass(), "jsType", null);
        setField(term891864, term891864.getClass(), "parent", null);
        setField(term891861, term891861.getClass(), "parent", term891864);
        term891749 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term891751 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term891758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term891763 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term891749, term891749.getClass(), "str", null);
        setIntField(term891749, term891749.getClass(), "type", 101);
        setField(term891749, term891749.getClass(), "next", null);
        setIntField(term891751, term891751.getClass(), "encodedSourceStart", 0);
        setIntField(term891751, term891751.getClass(), "encodedSourceEnd", 0);
        setField(term891751, term891751.getClass(), "sourceName", null);
        setIntField(term891751, term891751.getClass(), "baseLineno", 0);
        setIntField(term891751, term891751.getClass(), "endLineno", 0);
        setField(term891751, term891751.getClass(), "functions", null);
        setField(term891751, term891751.getClass(), "regexps", null);
        setField(term891751, term891751.getClass(), "itsVariables", null);
        setField(term891751, term891751.getClass(), "itsConst", null);
        setField(term891751, term891751.getClass(), "itsVariableNames", null);
        setIntField(term891751, term891751.getClass(), "varStart", 0);
        setField(term891751, term891751.getClass(), "compilerData", null);
        setIntField(term891751, term891751.getClass(), "type", 0);
        setIntField(term891758, term891758.getClass(), "type", 64);
        setField(term891758, term891758.getClass(), "next", null);
        setField(term891758, term891758.getClass(), "first", null);
        setField(term891758, term891758.getClass(), "last", null);
        setField(term891758, term891758.getClass(), "propListHead", null);
        setIntField(term891758, term891758.getClass(), "sourcePosition", 0);
        setField(term891758, term891758.getClass(), "jsType", null);
        setField(term891758, term891758.getClass(), "parent", null);
        setField(term891751, term891751.getClass(), "next", term891758);
        setField(term891751, term891751.getClass(), "first", null);
        setField(term891751, term891751.getClass(), "last", null);
        setField(term891751, term891751.getClass(), "propListHead", null);
        setIntField(term891751, term891751.getClass(), "sourcePosition", 0);
        setField(term891751, term891751.getClass(), "jsType", null);
        setField(term891751, term891751.getClass(), "parent", null);
        setField(term891749, term891749.getClass(), "first", term891751);
        setField(term891749, term891749.getClass(), "last", null);
        setField(term891749, term891749.getClass(), "propListHead", null);
        setIntField(term891749, term891749.getClass(), "sourcePosition", 0);
        setField(term891749, term891749.getClass(), "jsType", null);
        setField(term891763, term891763.getClass(), "functionName", null);
        setBooleanField(term891763, term891763.getClass(), "itsNeedsActivation", false);
        setIntField(term891763, term891763.getClass(), "itsFunctionType", 0);
        setBooleanField(term891763, term891763.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term891763, term891763.getClass(), "encodedSourceStart", 0);
        setIntField(term891763, term891763.getClass(), "encodedSourceEnd", 0);
        setField(term891763, term891763.getClass(), "sourceName", null);
        setIntField(term891763, term891763.getClass(), "baseLineno", 0);
        setIntField(term891763, term891763.getClass(), "endLineno", 0);
        setField(term891763, term891763.getClass(), "functions", null);
        setField(term891763, term891763.getClass(), "regexps", null);
        setField(term891763, term891763.getClass(), "itsVariables", null);
        setField(term891763, term891763.getClass(), "itsConst", null);
        setField(term891763, term891763.getClass(), "itsVariableNames", null);
        setIntField(term891763, term891763.getClass(), "varStart", 0);
        setField(term891763, term891763.getClass(), "compilerData", null);
        setIntField(term891763, term891763.getClass(), "type", 98);
        setField(term891763, term891763.getClass(), "next", null);
        setField(term891763, term891763.getClass(), "first", null);
        setField(term891763, term891763.getClass(), "last", null);
        setField(term891763, term891763.getClass(), "propListHead", null);
        setIntField(term891763, term891763.getClass(), "sourcePosition", 0);
        setField(term891763, term891763.getClass(), "jsType", null);
        setField(term891763, term891763.getClass(), "parent", null);
        setField(term891749, term891749.getClass(), "parent", term891763);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term891311;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term891219, args);
        assertTrue(recursiveEquals(term891219, term891860));
        assertTrue(recursiveEquals(term891311, term891861));
        assertTrue(recursiveEquals(retValue, term891749));
    }

};


