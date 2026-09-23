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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303777;
     Object term303869;
     Object term304090;
     Object term304091;
     Object term304040;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term303777 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term303869 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term303955 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term304025 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term303955, term303955.getClass(), "next", term304025);
        setField(term303869, term303869.getClass(), "first", term303955);
        setIntField(term303869, term303869.getClass(), "type", 13);
        term304090 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term304090, term304090.getClass(), "currentTraversal", null);
        term304091 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term304092 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term304093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term304091, term304091.getClass(), "str", null);
        setIntField(term304091, term304091.getClass(), "type", 13);
        setField(term304091, term304091.getClass(), "next", null);
        setField(term304092, term304092.getClass(), "functionName", null);
        setBooleanField(term304092, term304092.getClass(), "itsNeedsActivation", false);
        setIntField(term304092, term304092.getClass(), "itsFunctionType", 0);
        setBooleanField(term304092, term304092.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term304092, term304092.getClass(), "encodedSourceStart", 0);
        setIntField(term304092, term304092.getClass(), "encodedSourceEnd", 0);
        setField(term304092, term304092.getClass(), "sourceName", null);
        setIntField(term304092, term304092.getClass(), "baseLineno", 0);
        setIntField(term304092, term304092.getClass(), "endLineno", 0);
        setField(term304092, term304092.getClass(), "functions", null);
        setField(term304092, term304092.getClass(), "regexps", null);
        setField(term304092, term304092.getClass(), "itsVariables", null);
        setField(term304092, term304092.getClass(), "itsConst", null);
        setField(term304092, term304092.getClass(), "itsVariableNames", null);
        setIntField(term304092, term304092.getClass(), "varStart", 0);
        setField(term304092, term304092.getClass(), "compilerData", null);
        setIntField(term304092, term304092.getClass(), "type", 0);
        setIntField(term304093, term304093.getClass(), "type", 0);
        setField(term304093, term304093.getClass(), "next", null);
        setField(term304093, term304093.getClass(), "first", null);
        setField(term304093, term304093.getClass(), "last", null);
        setField(term304093, term304093.getClass(), "propListHead", null);
        setIntField(term304093, term304093.getClass(), "sourcePosition", 0);
        setField(term304093, term304093.getClass(), "jsType", null);
        setField(term304093, term304093.getClass(), "parent", null);
        setField(term304092, term304092.getClass(), "next", term304093);
        setField(term304092, term304092.getClass(), "first", null);
        setField(term304092, term304092.getClass(), "last", null);
        setField(term304092, term304092.getClass(), "propListHead", null);
        setIntField(term304092, term304092.getClass(), "sourcePosition", 0);
        setField(term304092, term304092.getClass(), "jsType", null);
        setField(term304092, term304092.getClass(), "parent", null);
        setField(term304091, term304091.getClass(), "first", term304092);
        setField(term304091, term304091.getClass(), "last", null);
        setField(term304091, term304091.getClass(), "propListHead", null);
        setIntField(term304091, term304091.getClass(), "sourcePosition", 0);
        setField(term304091, term304091.getClass(), "jsType", null);
        setField(term304091, term304091.getClass(), "parent", null);
        term304040 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term304042 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term304052 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term304040, term304040.getClass(), "str", null);
        setIntField(term304040, term304040.getClass(), "type", 13);
        setField(term304040, term304040.getClass(), "next", null);
        setField(term304042, term304042.getClass(), "functionName", null);
        setBooleanField(term304042, term304042.getClass(), "itsNeedsActivation", false);
        setIntField(term304042, term304042.getClass(), "itsFunctionType", 0);
        setBooleanField(term304042, term304042.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term304042, term304042.getClass(), "encodedSourceStart", 0);
        setIntField(term304042, term304042.getClass(), "encodedSourceEnd", 0);
        setField(term304042, term304042.getClass(), "sourceName", null);
        setIntField(term304042, term304042.getClass(), "baseLineno", 0);
        setIntField(term304042, term304042.getClass(), "endLineno", 0);
        setField(term304042, term304042.getClass(), "functions", null);
        setField(term304042, term304042.getClass(), "regexps", null);
        setField(term304042, term304042.getClass(), "itsVariables", null);
        setField(term304042, term304042.getClass(), "itsConst", null);
        setField(term304042, term304042.getClass(), "itsVariableNames", null);
        setIntField(term304042, term304042.getClass(), "varStart", 0);
        setField(term304042, term304042.getClass(), "compilerData", null);
        setIntField(term304042, term304042.getClass(), "type", 0);
        setIntField(term304052, term304052.getClass(), "type", 0);
        setField(term304052, term304052.getClass(), "next", null);
        setField(term304052, term304052.getClass(), "first", null);
        setField(term304052, term304052.getClass(), "last", null);
        setField(term304052, term304052.getClass(), "propListHead", null);
        setIntField(term304052, term304052.getClass(), "sourcePosition", 0);
        setField(term304052, term304052.getClass(), "jsType", null);
        setField(term304052, term304052.getClass(), "parent", null);
        setField(term304042, term304042.getClass(), "next", term304052);
        setField(term304042, term304042.getClass(), "first", null);
        setField(term304042, term304042.getClass(), "last", null);
        setField(term304042, term304042.getClass(), "propListHead", null);
        setIntField(term304042, term304042.getClass(), "sourcePosition", 0);
        setField(term304042, term304042.getClass(), "jsType", null);
        setField(term304042, term304042.getClass(), "parent", null);
        setField(term304040, term304040.getClass(), "first", term304042);
        setField(term304040, term304040.getClass(), "last", null);
        setField(term304040, term304040.getClass(), "propListHead", null);
        setIntField(term304040, term304040.getClass(), "sourcePosition", 0);
        setField(term304040, term304040.getClass(), "jsType", null);
        setField(term304040, term304040.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term303869;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term303777, args);
        assertTrue(recursiveEquals(term303777, term304090));
        assertTrue(recursiveEquals(term303869, term304091));
        assertTrue(recursiveEquals(retValue, term304040));
    }

};


