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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term571492;
     Object term571584;
     Object term571813;
     Object term571814;
     Object term571761;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term571492 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term571584 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term571670 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term571740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term571670, term571670.getClass(), "next", term571740);
        setField(term571584, term571584.getClass(), "first", term571670);
        setIntField(term571584, term571584.getClass(), "type", 52);
        term571813 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term571813, term571813.getClass(), "currentTraversal", null);
        term571814 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term571815 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term571816 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term571814, term571814.getClass(), "number", 0.0);
        setIntField(term571814, term571814.getClass(), "type", 52);
        setField(term571814, term571814.getClass(), "next", null);
        setField(term571815, term571815.getClass(), "functionName", null);
        setBooleanField(term571815, term571815.getClass(), "itsNeedsActivation", false);
        setIntField(term571815, term571815.getClass(), "itsFunctionType", 0);
        setBooleanField(term571815, term571815.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term571815, term571815.getClass(), "encodedSourceStart", 0);
        setIntField(term571815, term571815.getClass(), "encodedSourceEnd", 0);
        setField(term571815, term571815.getClass(), "sourceName", null);
        setIntField(term571815, term571815.getClass(), "baseLineno", 0);
        setIntField(term571815, term571815.getClass(), "endLineno", 0);
        setField(term571815, term571815.getClass(), "functions", null);
        setField(term571815, term571815.getClass(), "regexps", null);
        setField(term571815, term571815.getClass(), "itsVariables", null);
        setField(term571815, term571815.getClass(), "itsConst", null);
        setField(term571815, term571815.getClass(), "itsVariableNames", null);
        setIntField(term571815, term571815.getClass(), "varStart", 0);
        setField(term571815, term571815.getClass(), "compilerData", null);
        setIntField(term571815, term571815.getClass(), "type", 0);
        setIntField(term571816, term571816.getClass(), "type", 0);
        setField(term571816, term571816.getClass(), "next", null);
        setField(term571816, term571816.getClass(), "first", null);
        setField(term571816, term571816.getClass(), "last", null);
        setField(term571816, term571816.getClass(), "propListHead", null);
        setIntField(term571816, term571816.getClass(), "sourcePosition", 0);
        setField(term571816, term571816.getClass(), "jsType", null);
        setField(term571816, term571816.getClass(), "parent", null);
        setField(term571815, term571815.getClass(), "next", term571816);
        setField(term571815, term571815.getClass(), "first", null);
        setField(term571815, term571815.getClass(), "last", null);
        setField(term571815, term571815.getClass(), "propListHead", null);
        setIntField(term571815, term571815.getClass(), "sourcePosition", 0);
        setField(term571815, term571815.getClass(), "jsType", null);
        setField(term571815, term571815.getClass(), "parent", null);
        setField(term571814, term571814.getClass(), "first", term571815);
        setField(term571814, term571814.getClass(), "last", null);
        setField(term571814, term571814.getClass(), "propListHead", null);
        setIntField(term571814, term571814.getClass(), "sourcePosition", 0);
        setField(term571814, term571814.getClass(), "jsType", null);
        setField(term571814, term571814.getClass(), "parent", null);
        term571761 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term571764 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term571774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term571761, term571761.getClass(), "number", 0.0);
        setIntField(term571761, term571761.getClass(), "type", 52);
        setField(term571761, term571761.getClass(), "next", null);
        setField(term571764, term571764.getClass(), "functionName", null);
        setBooleanField(term571764, term571764.getClass(), "itsNeedsActivation", false);
        setIntField(term571764, term571764.getClass(), "itsFunctionType", 0);
        setBooleanField(term571764, term571764.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term571764, term571764.getClass(), "encodedSourceStart", 0);
        setIntField(term571764, term571764.getClass(), "encodedSourceEnd", 0);
        setField(term571764, term571764.getClass(), "sourceName", null);
        setIntField(term571764, term571764.getClass(), "baseLineno", 0);
        setIntField(term571764, term571764.getClass(), "endLineno", 0);
        setField(term571764, term571764.getClass(), "functions", null);
        setField(term571764, term571764.getClass(), "regexps", null);
        setField(term571764, term571764.getClass(), "itsVariables", null);
        setField(term571764, term571764.getClass(), "itsConst", null);
        setField(term571764, term571764.getClass(), "itsVariableNames", null);
        setIntField(term571764, term571764.getClass(), "varStart", 0);
        setField(term571764, term571764.getClass(), "compilerData", null);
        setIntField(term571764, term571764.getClass(), "type", 0);
        setIntField(term571774, term571774.getClass(), "type", 0);
        setField(term571774, term571774.getClass(), "next", null);
        setField(term571774, term571774.getClass(), "first", null);
        setField(term571774, term571774.getClass(), "last", null);
        setField(term571774, term571774.getClass(), "propListHead", null);
        setIntField(term571774, term571774.getClass(), "sourcePosition", 0);
        setField(term571774, term571774.getClass(), "jsType", null);
        setField(term571774, term571774.getClass(), "parent", null);
        setField(term571764, term571764.getClass(), "next", term571774);
        setField(term571764, term571764.getClass(), "first", null);
        setField(term571764, term571764.getClass(), "last", null);
        setField(term571764, term571764.getClass(), "propListHead", null);
        setIntField(term571764, term571764.getClass(), "sourcePosition", 0);
        setField(term571764, term571764.getClass(), "jsType", null);
        setField(term571764, term571764.getClass(), "parent", null);
        setField(term571761, term571761.getClass(), "first", term571764);
        setField(term571761, term571761.getClass(), "last", null);
        setField(term571761, term571761.getClass(), "propListHead", null);
        setIntField(term571761, term571761.getClass(), "sourcePosition", 0);
        setField(term571761, term571761.getClass(), "jsType", null);
        setField(term571761, term571761.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term571584;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term571492, args);
        assertTrue(recursiveEquals(term571492, term571813));
        assertTrue(recursiveEquals(term571584, term571814));
        assertTrue(recursiveEquals(retValue, term571761));
    }

};


