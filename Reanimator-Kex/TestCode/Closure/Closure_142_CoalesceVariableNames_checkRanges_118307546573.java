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
import java.util.ArrayList;
import java.lang.Object;

public class CoalesceVariableNames_checkRanges_118307546573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28392;
     Object term28444;
     Object term28536;
     Object term29535;
     Object term29536;
     Object term29538;

    public CoalesceVariableNames_checkRanges_118307546573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28392 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        setField(term28392, term28392.getClass(), "compiler", null);
        term28444 = new ArrayList();
        term28536 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term28622 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term28714 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term28536, term28536.getClass(), "type", 0);
        setField(term28622, term28622.getClass(), "next", null);
        setIntField(term28622, term28622.getClass(), "type", 0);
        setField(term28622, term28622.getClass(), "parent", term28714);
        setField(term28536, term28536.getClass(), "first", term28622);
        term29535 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        setField(term29535, term29535.getClass(), "compiler", null);
        setField(term29535, term29535.getClass(), "colorings", null);
        setBooleanField(term29535, term29535.getClass(), "usePseudoNames", false);
        term29536 = new ArrayList();
        term29538 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term29539 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term29540 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term29538, term29538.getClass(), "number", 0.0);
        setIntField(term29538, term29538.getClass(), "type", 0);
        setField(term29538, term29538.getClass(), "next", null);
        setField(term29539, term29539.getClass(), "functionName", null);
        setBooleanField(term29539, term29539.getClass(), "itsNeedsActivation", false);
        setIntField(term29539, term29539.getClass(), "itsFunctionType", 0);
        setBooleanField(term29539, term29539.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term29539, term29539.getClass(), "encodedSourceStart", 0);
        setIntField(term29539, term29539.getClass(), "encodedSourceEnd", 0);
        setField(term29539, term29539.getClass(), "sourceName", null);
        setIntField(term29539, term29539.getClass(), "baseLineno", 0);
        setIntField(term29539, term29539.getClass(), "endLineno", 0);
        setField(term29539, term29539.getClass(), "functions", null);
        setField(term29539, term29539.getClass(), "regexps", null);
        setField(term29539, term29539.getClass(), "itsVariables", null);
        setField(term29539, term29539.getClass(), "itsConst", null);
        setField(term29539, term29539.getClass(), "itsVariableNames", null);
        setIntField(term29539, term29539.getClass(), "varStart", 0);
        setField(term29539, term29539.getClass(), "compilerData", null);
        setIntField(term29539, term29539.getClass(), "type", 0);
        setField(term29539, term29539.getClass(), "next", null);
        setField(term29539, term29539.getClass(), "first", null);
        setField(term29539, term29539.getClass(), "last", null);
        setField(term29539, term29539.getClass(), "propListHead", null);
        setIntField(term29539, term29539.getClass(), "sourcePosition", 0);
        setField(term29539, term29539.getClass(), "jsType", null);
        setDoubleField(term29540, term29540.getClass(), "number", 0.0);
        setIntField(term29540, term29540.getClass(), "type", 0);
        setField(term29540, term29540.getClass(), "next", null);
        setField(term29540, term29540.getClass(), "first", null);
        setField(term29540, term29540.getClass(), "last", null);
        setField(term29540, term29540.getClass(), "propListHead", null);
        setIntField(term29540, term29540.getClass(), "sourcePosition", 0);
        setField(term29540, term29540.getClass(), "jsType", null);
        setField(term29540, term29540.getClass(), "parent", null);
        setField(term29539, term29539.getClass(), "parent", term29540);
        setField(term29538, term29538.getClass(), "first", term29539);
        setField(term29538, term29538.getClass(), "last", null);
        setField(term29538, term29538.getClass(), "propListHead", null);
        setIntField(term29538, term29538.getClass(), "sourcePosition", 0);
        setField(term29538, term29538.getClass(), "jsType", null);
        setField(term29538, term29538.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term28444;
        args[1] = term28536;
        callMethod(klass, "checkRanges", argTypes, term28392, args);
        assertTrue(recursiveEquals(term28392, term29535));
        assertTrue(recursiveEquals(term28444, term29536));
        assertTrue(recursiveEquals(term28536, term29538));
    }

};


