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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82259;
     Object term82345;
     Object term82536;
     Object term82537;
     Object term82494;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82259 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term82345 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term82415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term82345, term82345.getClass(), "first", term82345);
        setField(term82345, term82345.getClass(), "next", term82415);
        setIntField(term82345, term82345.getClass(), "type", 86);
        term82536 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term82536, term82536.getClass(), "currentTraversal", null);
        term82537 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term82538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term82537, term82537.getClass(), "functionName", null);
        setBooleanField(term82537, term82537.getClass(), "itsNeedsActivation", false);
        setIntField(term82537, term82537.getClass(), "itsFunctionType", 0);
        setBooleanField(term82537, term82537.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term82537, term82537.getClass(), "encodedSourceStart", 0);
        setIntField(term82537, term82537.getClass(), "encodedSourceEnd", 0);
        setField(term82537, term82537.getClass(), "sourceName", null);
        setIntField(term82537, term82537.getClass(), "baseLineno", 0);
        setIntField(term82537, term82537.getClass(), "endLineno", 0);
        setField(term82537, term82537.getClass(), "functions", null);
        setField(term82537, term82537.getClass(), "regexps", null);
        setField(term82537, term82537.getClass(), "itsVariables", null);
        setField(term82537, term82537.getClass(), "itsConst", null);
        setField(term82537, term82537.getClass(), "itsVariableNames", null);
        setIntField(term82537, term82537.getClass(), "varStart", 0);
        setField(term82537, term82537.getClass(), "compilerData", null);
        setIntField(term82537, term82537.getClass(), "type", 86);
        setIntField(term82538, term82538.getClass(), "type", 0);
        setField(term82538, term82538.getClass(), "next", null);
        setField(term82538, term82538.getClass(), "first", null);
        setField(term82538, term82538.getClass(), "last", null);
        setField(term82538, term82538.getClass(), "propListHead", null);
        setIntField(term82538, term82538.getClass(), "sourcePosition", 0);
        setField(term82538, term82538.getClass(), "jsType", null);
        setField(term82538, term82538.getClass(), "parent", null);
        setField(term82537, term82537.getClass(), "next", term82538);
        setField(term82537, term82537.getClass(), "first", term82537);
        setField(term82537, term82537.getClass(), "last", null);
        setField(term82537, term82537.getClass(), "propListHead", null);
        setIntField(term82537, term82537.getClass(), "sourcePosition", 0);
        setField(term82537, term82537.getClass(), "jsType", null);
        setField(term82537, term82537.getClass(), "parent", null);
        term82494 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term82504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term82494, term82494.getClass(), "functionName", null);
        setBooleanField(term82494, term82494.getClass(), "itsNeedsActivation", false);
        setIntField(term82494, term82494.getClass(), "itsFunctionType", 0);
        setBooleanField(term82494, term82494.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term82494, term82494.getClass(), "encodedSourceStart", 0);
        setIntField(term82494, term82494.getClass(), "encodedSourceEnd", 0);
        setField(term82494, term82494.getClass(), "sourceName", null);
        setIntField(term82494, term82494.getClass(), "baseLineno", 0);
        setIntField(term82494, term82494.getClass(), "endLineno", 0);
        setField(term82494, term82494.getClass(), "functions", null);
        setField(term82494, term82494.getClass(), "regexps", null);
        setField(term82494, term82494.getClass(), "itsVariables", null);
        setField(term82494, term82494.getClass(), "itsConst", null);
        setField(term82494, term82494.getClass(), "itsVariableNames", null);
        setIntField(term82494, term82494.getClass(), "varStart", 0);
        setField(term82494, term82494.getClass(), "compilerData", null);
        setIntField(term82494, term82494.getClass(), "type", 86);
        setIntField(term82504, term82504.getClass(), "type", 0);
        setField(term82504, term82504.getClass(), "next", null);
        setField(term82504, term82504.getClass(), "first", null);
        setField(term82504, term82504.getClass(), "last", null);
        setField(term82504, term82504.getClass(), "propListHead", null);
        setIntField(term82504, term82504.getClass(), "sourcePosition", 0);
        setField(term82504, term82504.getClass(), "jsType", null);
        setField(term82504, term82504.getClass(), "parent", null);
        setField(term82494, term82494.getClass(), "next", term82504);
        setField(term82494, term82494.getClass(), "first", term82494);
        setField(term82494, term82494.getClass(), "last", null);
        setField(term82494, term82494.getClass(), "propListHead", null);
        setIntField(term82494, term82494.getClass(), "sourcePosition", 0);
        setField(term82494, term82494.getClass(), "jsType", null);
        setField(term82494, term82494.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term82345;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term82259, args);
        assertTrue(recursiveEquals(term82259, term82536));
        assertTrue(recursiveEquals(term82345, term82537));
        assertTrue(recursiveEquals(retValue, term82494));
    }

};


