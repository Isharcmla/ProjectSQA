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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113068 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term904951;
     Object term905043;
     Object term906524;
     Object term906525;
     Object term906424;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113068() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term904951 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term905043 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term905135 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term905227 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term905313 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term905227, term905227.getClass(), "type", 44);
        setField(term905135, term905135.getClass(), "next", term905227);
        setIntField(term905135, term905135.getClass(), "type", 0);
        setField(term905043, term905043.getClass(), "first", term905135);
        setIntField(term905043, term905043.getClass(), "type", 101);
        setField(term905043, term905043.getClass(), "parent", term905313);
        term906524 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term906524, term906524.getClass(), "currentTraversal", null);
        term906525 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term906526 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term906527 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term906528 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term906525, term906525.getClass(), "str", null);
        setIntField(term906525, term906525.getClass(), "type", 101);
        setField(term906525, term906525.getClass(), "next", null);
        setField(term906526, term906526.getClass(), "str", null);
        setIntField(term906526, term906526.getClass(), "type", 0);
        setField(term906527, term906527.getClass(), "str", null);
        setIntField(term906527, term906527.getClass(), "type", 44);
        setField(term906527, term906527.getClass(), "next", null);
        setField(term906527, term906527.getClass(), "first", null);
        setField(term906527, term906527.getClass(), "last", null);
        setField(term906527, term906527.getClass(), "propListHead", null);
        setIntField(term906527, term906527.getClass(), "sourcePosition", 0);
        setField(term906527, term906527.getClass(), "jsType", null);
        setField(term906527, term906527.getClass(), "parent", null);
        setField(term906526, term906526.getClass(), "next", term906527);
        setField(term906526, term906526.getClass(), "first", null);
        setField(term906526, term906526.getClass(), "last", null);
        setField(term906526, term906526.getClass(), "propListHead", null);
        setIntField(term906526, term906526.getClass(), "sourcePosition", 0);
        setField(term906526, term906526.getClass(), "jsType", null);
        setField(term906526, term906526.getClass(), "parent", null);
        setField(term906525, term906525.getClass(), "first", term906526);
        setField(term906525, term906525.getClass(), "last", null);
        setField(term906525, term906525.getClass(), "propListHead", null);
        setIntField(term906525, term906525.getClass(), "sourcePosition", 0);
        setField(term906525, term906525.getClass(), "jsType", null);
        setField(term906528, term906528.getClass(), "functionName", null);
        setBooleanField(term906528, term906528.getClass(), "itsNeedsActivation", false);
        setIntField(term906528, term906528.getClass(), "itsFunctionType", 0);
        setBooleanField(term906528, term906528.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term906528, term906528.getClass(), "encodedSourceStart", 0);
        setIntField(term906528, term906528.getClass(), "encodedSourceEnd", 0);
        setField(term906528, term906528.getClass(), "sourceName", null);
        setIntField(term906528, term906528.getClass(), "baseLineno", 0);
        setIntField(term906528, term906528.getClass(), "endLineno", 0);
        setField(term906528, term906528.getClass(), "functions", null);
        setField(term906528, term906528.getClass(), "regexps", null);
        setField(term906528, term906528.getClass(), "itsVariables", null);
        setField(term906528, term906528.getClass(), "itsConst", null);
        setField(term906528, term906528.getClass(), "itsVariableNames", null);
        setIntField(term906528, term906528.getClass(), "varStart", 0);
        setField(term906528, term906528.getClass(), "compilerData", null);
        setIntField(term906528, term906528.getClass(), "type", 0);
        setField(term906528, term906528.getClass(), "next", null);
        setField(term906528, term906528.getClass(), "first", null);
        setField(term906528, term906528.getClass(), "last", null);
        setField(term906528, term906528.getClass(), "propListHead", null);
        setIntField(term906528, term906528.getClass(), "sourcePosition", 0);
        setField(term906528, term906528.getClass(), "jsType", null);
        setField(term906528, term906528.getClass(), "parent", null);
        setField(term906525, term906525.getClass(), "parent", term906528);
        term906424 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term906426 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term906428 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term906433 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term906424, term906424.getClass(), "str", null);
        setIntField(term906424, term906424.getClass(), "type", 101);
        setField(term906424, term906424.getClass(), "next", null);
        setField(term906426, term906426.getClass(), "str", null);
        setIntField(term906426, term906426.getClass(), "type", 0);
        setField(term906428, term906428.getClass(), "str", null);
        setIntField(term906428, term906428.getClass(), "type", 44);
        setField(term906428, term906428.getClass(), "next", null);
        setField(term906428, term906428.getClass(), "first", null);
        setField(term906428, term906428.getClass(), "last", null);
        setField(term906428, term906428.getClass(), "propListHead", null);
        setIntField(term906428, term906428.getClass(), "sourcePosition", 0);
        setField(term906428, term906428.getClass(), "jsType", null);
        setField(term906428, term906428.getClass(), "parent", null);
        setField(term906426, term906426.getClass(), "next", term906428);
        setField(term906426, term906426.getClass(), "first", null);
        setField(term906426, term906426.getClass(), "last", null);
        setField(term906426, term906426.getClass(), "propListHead", null);
        setIntField(term906426, term906426.getClass(), "sourcePosition", 0);
        setField(term906426, term906426.getClass(), "jsType", null);
        setField(term906426, term906426.getClass(), "parent", null);
        setField(term906424, term906424.getClass(), "first", term906426);
        setField(term906424, term906424.getClass(), "last", null);
        setField(term906424, term906424.getClass(), "propListHead", null);
        setIntField(term906424, term906424.getClass(), "sourcePosition", 0);
        setField(term906424, term906424.getClass(), "jsType", null);
        setField(term906433, term906433.getClass(), "functionName", null);
        setBooleanField(term906433, term906433.getClass(), "itsNeedsActivation", false);
        setIntField(term906433, term906433.getClass(), "itsFunctionType", 0);
        setBooleanField(term906433, term906433.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term906433, term906433.getClass(), "encodedSourceStart", 0);
        setIntField(term906433, term906433.getClass(), "encodedSourceEnd", 0);
        setField(term906433, term906433.getClass(), "sourceName", null);
        setIntField(term906433, term906433.getClass(), "baseLineno", 0);
        setIntField(term906433, term906433.getClass(), "endLineno", 0);
        setField(term906433, term906433.getClass(), "functions", null);
        setField(term906433, term906433.getClass(), "regexps", null);
        setField(term906433, term906433.getClass(), "itsVariables", null);
        setField(term906433, term906433.getClass(), "itsConst", null);
        setField(term906433, term906433.getClass(), "itsVariableNames", null);
        setIntField(term906433, term906433.getClass(), "varStart", 0);
        setField(term906433, term906433.getClass(), "compilerData", null);
        setIntField(term906433, term906433.getClass(), "type", 0);
        setField(term906433, term906433.getClass(), "next", null);
        setField(term906433, term906433.getClass(), "first", null);
        setField(term906433, term906433.getClass(), "last", null);
        setField(term906433, term906433.getClass(), "propListHead", null);
        setIntField(term906433, term906433.getClass(), "sourcePosition", 0);
        setField(term906433, term906433.getClass(), "jsType", null);
        setField(term906433, term906433.getClass(), "parent", null);
        setField(term906424, term906424.getClass(), "parent", term906433);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term905043;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term904951, args);
        assertTrue(recursiveEquals(term904951, term906524));
        assertTrue(recursiveEquals(term905043, term906525));
        assertTrue(recursiveEquals(retValue, term906424));
    }

};


