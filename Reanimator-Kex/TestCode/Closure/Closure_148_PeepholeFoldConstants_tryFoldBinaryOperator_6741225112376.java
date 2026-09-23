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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term659717;
     Object term659809;
     Object term660046;
     Object term660047;
     Object term659986;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term659717 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term659809 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term659895 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term659965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term659895, term659895.getClass(), "next", term659965);
        setField(term659809, term659809.getClass(), "first", term659895);
        setIntField(term659809, term659809.getClass(), "type", 16);
        term660046 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term660046, term660046.getClass(), "currentTraversal", null);
        term660047 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term660048 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term660049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term660047, term660047.getClass(), "number", 0.0);
        setIntField(term660047, term660047.getClass(), "type", 16);
        setField(term660047, term660047.getClass(), "next", null);
        setField(term660048, term660048.getClass(), "functionName", null);
        setBooleanField(term660048, term660048.getClass(), "itsNeedsActivation", false);
        setIntField(term660048, term660048.getClass(), "itsFunctionType", 0);
        setBooleanField(term660048, term660048.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term660048, term660048.getClass(), "encodedSourceStart", 0);
        setIntField(term660048, term660048.getClass(), "encodedSourceEnd", 0);
        setField(term660048, term660048.getClass(), "sourceName", null);
        setIntField(term660048, term660048.getClass(), "baseLineno", 0);
        setIntField(term660048, term660048.getClass(), "endLineno", 0);
        setField(term660048, term660048.getClass(), "functions", null);
        setField(term660048, term660048.getClass(), "regexps", null);
        setField(term660048, term660048.getClass(), "itsVariables", null);
        setField(term660048, term660048.getClass(), "itsConst", null);
        setField(term660048, term660048.getClass(), "itsVariableNames", null);
        setIntField(term660048, term660048.getClass(), "varStart", 0);
        setField(term660048, term660048.getClass(), "compilerData", null);
        setIntField(term660048, term660048.getClass(), "type", 0);
        setIntField(term660049, term660049.getClass(), "type", 0);
        setField(term660049, term660049.getClass(), "next", null);
        setField(term660049, term660049.getClass(), "first", null);
        setField(term660049, term660049.getClass(), "last", null);
        setField(term660049, term660049.getClass(), "propListHead", null);
        setIntField(term660049, term660049.getClass(), "sourcePosition", 0);
        setField(term660049, term660049.getClass(), "jsType", null);
        setField(term660049, term660049.getClass(), "parent", null);
        setField(term660048, term660048.getClass(), "next", term660049);
        setField(term660048, term660048.getClass(), "first", null);
        setField(term660048, term660048.getClass(), "last", null);
        setField(term660048, term660048.getClass(), "propListHead", null);
        setIntField(term660048, term660048.getClass(), "sourcePosition", 0);
        setField(term660048, term660048.getClass(), "jsType", null);
        setField(term660048, term660048.getClass(), "parent", null);
        setField(term660047, term660047.getClass(), "first", term660048);
        setField(term660047, term660047.getClass(), "last", null);
        setField(term660047, term660047.getClass(), "propListHead", null);
        setIntField(term660047, term660047.getClass(), "sourcePosition", 0);
        setField(term660047, term660047.getClass(), "jsType", null);
        setField(term660047, term660047.getClass(), "parent", null);
        term659986 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term659989 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term659999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term659986, term659986.getClass(), "number", 0.0);
        setIntField(term659986, term659986.getClass(), "type", 16);
        setField(term659986, term659986.getClass(), "next", null);
        setField(term659989, term659989.getClass(), "functionName", null);
        setBooleanField(term659989, term659989.getClass(), "itsNeedsActivation", false);
        setIntField(term659989, term659989.getClass(), "itsFunctionType", 0);
        setBooleanField(term659989, term659989.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term659989, term659989.getClass(), "encodedSourceStart", 0);
        setIntField(term659989, term659989.getClass(), "encodedSourceEnd", 0);
        setField(term659989, term659989.getClass(), "sourceName", null);
        setIntField(term659989, term659989.getClass(), "baseLineno", 0);
        setIntField(term659989, term659989.getClass(), "endLineno", 0);
        setField(term659989, term659989.getClass(), "functions", null);
        setField(term659989, term659989.getClass(), "regexps", null);
        setField(term659989, term659989.getClass(), "itsVariables", null);
        setField(term659989, term659989.getClass(), "itsConst", null);
        setField(term659989, term659989.getClass(), "itsVariableNames", null);
        setIntField(term659989, term659989.getClass(), "varStart", 0);
        setField(term659989, term659989.getClass(), "compilerData", null);
        setIntField(term659989, term659989.getClass(), "type", 0);
        setIntField(term659999, term659999.getClass(), "type", 0);
        setField(term659999, term659999.getClass(), "next", null);
        setField(term659999, term659999.getClass(), "first", null);
        setField(term659999, term659999.getClass(), "last", null);
        setField(term659999, term659999.getClass(), "propListHead", null);
        setIntField(term659999, term659999.getClass(), "sourcePosition", 0);
        setField(term659999, term659999.getClass(), "jsType", null);
        setField(term659999, term659999.getClass(), "parent", null);
        setField(term659989, term659989.getClass(), "next", term659999);
        setField(term659989, term659989.getClass(), "first", null);
        setField(term659989, term659989.getClass(), "last", null);
        setField(term659989, term659989.getClass(), "propListHead", null);
        setIntField(term659989, term659989.getClass(), "sourcePosition", 0);
        setField(term659989, term659989.getClass(), "jsType", null);
        setField(term659989, term659989.getClass(), "parent", null);
        setField(term659986, term659986.getClass(), "first", term659989);
        setField(term659986, term659986.getClass(), "last", null);
        setField(term659986, term659986.getClass(), "propListHead", null);
        setIntField(term659986, term659986.getClass(), "sourcePosition", 0);
        setField(term659986, term659986.getClass(), "jsType", null);
        setField(term659986, term659986.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term659809;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term659717, args);
        assertTrue(recursiveEquals(term659717, term660046));
        assertTrue(recursiveEquals(term659809, term660047));
        assertTrue(recursiveEquals(retValue, term659986));
    }

};


