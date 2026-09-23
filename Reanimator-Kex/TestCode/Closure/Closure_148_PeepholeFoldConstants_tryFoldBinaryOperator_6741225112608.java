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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112608 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term741530;
     Object term741622;
     Object term741775;
     Object term741776;
     Object term741726;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112608() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term741530 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term741622 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term741708 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term741708, term741708.getClass(), "next", term741708);
        setField(term741622, term741622.getClass(), "first", term741708);
        setIntField(term741622, term741622.getClass(), "type", 33);
        term741775 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term741775, term741775.getClass(), "currentTraversal", null);
        term741776 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term741777 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term741776, term741776.getClass(), "str", null);
        setIntField(term741776, term741776.getClass(), "type", 33);
        setField(term741776, term741776.getClass(), "next", null);
        setField(term741777, term741777.getClass(), "functionName", null);
        setBooleanField(term741777, term741777.getClass(), "itsNeedsActivation", false);
        setIntField(term741777, term741777.getClass(), "itsFunctionType", 0);
        setBooleanField(term741777, term741777.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term741777, term741777.getClass(), "encodedSourceStart", 0);
        setIntField(term741777, term741777.getClass(), "encodedSourceEnd", 0);
        setField(term741777, term741777.getClass(), "sourceName", null);
        setIntField(term741777, term741777.getClass(), "baseLineno", 0);
        setIntField(term741777, term741777.getClass(), "endLineno", 0);
        setField(term741777, term741777.getClass(), "functions", null);
        setField(term741777, term741777.getClass(), "regexps", null);
        setField(term741777, term741777.getClass(), "itsVariables", null);
        setField(term741777, term741777.getClass(), "itsConst", null);
        setField(term741777, term741777.getClass(), "itsVariableNames", null);
        setIntField(term741777, term741777.getClass(), "varStart", 0);
        setField(term741777, term741777.getClass(), "compilerData", null);
        setIntField(term741777, term741777.getClass(), "type", 0);
        setField(term741777, term741777.getClass(), "next", term741777);
        setField(term741777, term741777.getClass(), "first", null);
        setField(term741777, term741777.getClass(), "last", null);
        setField(term741777, term741777.getClass(), "propListHead", null);
        setIntField(term741777, term741777.getClass(), "sourcePosition", 0);
        setField(term741777, term741777.getClass(), "jsType", null);
        setField(term741777, term741777.getClass(), "parent", null);
        setField(term741776, term741776.getClass(), "first", term741777);
        setField(term741776, term741776.getClass(), "last", null);
        setField(term741776, term741776.getClass(), "propListHead", null);
        setIntField(term741776, term741776.getClass(), "sourcePosition", 0);
        setField(term741776, term741776.getClass(), "jsType", null);
        setField(term741776, term741776.getClass(), "parent", null);
        term741726 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term741728 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term741726, term741726.getClass(), "str", null);
        setIntField(term741726, term741726.getClass(), "type", 33);
        setField(term741726, term741726.getClass(), "next", null);
        setField(term741728, term741728.getClass(), "functionName", null);
        setBooleanField(term741728, term741728.getClass(), "itsNeedsActivation", false);
        setIntField(term741728, term741728.getClass(), "itsFunctionType", 0);
        setBooleanField(term741728, term741728.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term741728, term741728.getClass(), "encodedSourceStart", 0);
        setIntField(term741728, term741728.getClass(), "encodedSourceEnd", 0);
        setField(term741728, term741728.getClass(), "sourceName", null);
        setIntField(term741728, term741728.getClass(), "baseLineno", 0);
        setIntField(term741728, term741728.getClass(), "endLineno", 0);
        setField(term741728, term741728.getClass(), "functions", null);
        setField(term741728, term741728.getClass(), "regexps", null);
        setField(term741728, term741728.getClass(), "itsVariables", null);
        setField(term741728, term741728.getClass(), "itsConst", null);
        setField(term741728, term741728.getClass(), "itsVariableNames", null);
        setIntField(term741728, term741728.getClass(), "varStart", 0);
        setField(term741728, term741728.getClass(), "compilerData", null);
        setIntField(term741728, term741728.getClass(), "type", 0);
        setField(term741728, term741728.getClass(), "next", term741728);
        setField(term741728, term741728.getClass(), "first", null);
        setField(term741728, term741728.getClass(), "last", null);
        setField(term741728, term741728.getClass(), "propListHead", null);
        setIntField(term741728, term741728.getClass(), "sourcePosition", 0);
        setField(term741728, term741728.getClass(), "jsType", null);
        setField(term741728, term741728.getClass(), "parent", null);
        setField(term741726, term741726.getClass(), "first", term741728);
        setField(term741726, term741726.getClass(), "last", null);
        setField(term741726, term741726.getClass(), "propListHead", null);
        setIntField(term741726, term741726.getClass(), "sourcePosition", 0);
        setField(term741726, term741726.getClass(), "jsType", null);
        setField(term741726, term741726.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term741622;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term741530, args);
        assertTrue(recursiveEquals(term741530, term741775));
        assertTrue(recursiveEquals(term741622, term741776));
        assertTrue(recursiveEquals(retValue, term741726));
    }

};


