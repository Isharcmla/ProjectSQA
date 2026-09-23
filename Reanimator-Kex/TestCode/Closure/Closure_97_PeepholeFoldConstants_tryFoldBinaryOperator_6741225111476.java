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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term549210;
     Object term549302;
     Object term549583;
     Object term549584;
     Object term549534;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term549210 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term549302 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term549388 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term549458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term549388, term549388.getClass(), "next", term549458);
        setField(term549302, term549302.getClass(), "first", term549388);
        setIntField(term549302, term549302.getClass(), "type", 11);
        term549583 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term549583, term549583.getClass(), "currentTraversal", null);
        term549584 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term549585 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term549586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term549584, term549584.getClass(), "number", 0.0);
        setIntField(term549584, term549584.getClass(), "type", 11);
        setField(term549584, term549584.getClass(), "next", null);
        setField(term549585, term549585.getClass(), "functionName", null);
        setBooleanField(term549585, term549585.getClass(), "itsNeedsActivation", false);
        setIntField(term549585, term549585.getClass(), "itsFunctionType", 0);
        setBooleanField(term549585, term549585.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term549585, term549585.getClass(), "encodedSourceStart", 0);
        setIntField(term549585, term549585.getClass(), "encodedSourceEnd", 0);
        setField(term549585, term549585.getClass(), "sourceName", null);
        setIntField(term549585, term549585.getClass(), "baseLineno", 0);
        setIntField(term549585, term549585.getClass(), "endLineno", 0);
        setField(term549585, term549585.getClass(), "functions", null);
        setField(term549585, term549585.getClass(), "regexps", null);
        setField(term549585, term549585.getClass(), "itsVariables", null);
        setField(term549585, term549585.getClass(), "itsConst", null);
        setField(term549585, term549585.getClass(), "itsVariableNames", null);
        setIntField(term549585, term549585.getClass(), "varStart", 0);
        setField(term549585, term549585.getClass(), "compilerData", null);
        setIntField(term549585, term549585.getClass(), "type", 0);
        setIntField(term549586, term549586.getClass(), "type", 0);
        setField(term549586, term549586.getClass(), "next", null);
        setField(term549586, term549586.getClass(), "first", null);
        setField(term549586, term549586.getClass(), "last", null);
        setField(term549586, term549586.getClass(), "propListHead", null);
        setIntField(term549586, term549586.getClass(), "sourcePosition", 0);
        setField(term549586, term549586.getClass(), "jsType", null);
        setField(term549586, term549586.getClass(), "parent", null);
        setField(term549585, term549585.getClass(), "next", term549586);
        setField(term549585, term549585.getClass(), "first", null);
        setField(term549585, term549585.getClass(), "last", null);
        setField(term549585, term549585.getClass(), "propListHead", null);
        setIntField(term549585, term549585.getClass(), "sourcePosition", 0);
        setField(term549585, term549585.getClass(), "jsType", null);
        setField(term549585, term549585.getClass(), "parent", null);
        setField(term549584, term549584.getClass(), "first", term549585);
        setField(term549584, term549584.getClass(), "last", null);
        setField(term549584, term549584.getClass(), "propListHead", null);
        setIntField(term549584, term549584.getClass(), "sourcePosition", 0);
        setField(term549584, term549584.getClass(), "jsType", null);
        setField(term549584, term549584.getClass(), "parent", null);
        term549534 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term549537 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term549547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term549534, term549534.getClass(), "number", 0.0);
        setIntField(term549534, term549534.getClass(), "type", 11);
        setField(term549534, term549534.getClass(), "next", null);
        setField(term549537, term549537.getClass(), "functionName", null);
        setBooleanField(term549537, term549537.getClass(), "itsNeedsActivation", false);
        setIntField(term549537, term549537.getClass(), "itsFunctionType", 0);
        setBooleanField(term549537, term549537.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term549537, term549537.getClass(), "encodedSourceStart", 0);
        setIntField(term549537, term549537.getClass(), "encodedSourceEnd", 0);
        setField(term549537, term549537.getClass(), "sourceName", null);
        setIntField(term549537, term549537.getClass(), "baseLineno", 0);
        setIntField(term549537, term549537.getClass(), "endLineno", 0);
        setField(term549537, term549537.getClass(), "functions", null);
        setField(term549537, term549537.getClass(), "regexps", null);
        setField(term549537, term549537.getClass(), "itsVariables", null);
        setField(term549537, term549537.getClass(), "itsConst", null);
        setField(term549537, term549537.getClass(), "itsVariableNames", null);
        setIntField(term549537, term549537.getClass(), "varStart", 0);
        setField(term549537, term549537.getClass(), "compilerData", null);
        setIntField(term549537, term549537.getClass(), "type", 0);
        setIntField(term549547, term549547.getClass(), "type", 0);
        setField(term549547, term549547.getClass(), "next", null);
        setField(term549547, term549547.getClass(), "first", null);
        setField(term549547, term549547.getClass(), "last", null);
        setField(term549547, term549547.getClass(), "propListHead", null);
        setIntField(term549547, term549547.getClass(), "sourcePosition", 0);
        setField(term549547, term549547.getClass(), "jsType", null);
        setField(term549547, term549547.getClass(), "parent", null);
        setField(term549537, term549537.getClass(), "next", term549547);
        setField(term549537, term549537.getClass(), "first", null);
        setField(term549537, term549537.getClass(), "last", null);
        setField(term549537, term549537.getClass(), "propListHead", null);
        setIntField(term549537, term549537.getClass(), "sourcePosition", 0);
        setField(term549537, term549537.getClass(), "jsType", null);
        setField(term549537, term549537.getClass(), "parent", null);
        setField(term549534, term549534.getClass(), "first", term549537);
        setField(term549534, term549534.getClass(), "last", null);
        setField(term549534, term549534.getClass(), "propListHead", null);
        setIntField(term549534, term549534.getClass(), "sourcePosition", 0);
        setField(term549534, term549534.getClass(), "jsType", null);
        setField(term549534, term549534.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term549302;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term549210, args);
        assertTrue(recursiveEquals(term549210, term549583));
        assertTrue(recursiveEquals(term549302, term549584));
        assertTrue(recursiveEquals(retValue, term549534));
    }

};


