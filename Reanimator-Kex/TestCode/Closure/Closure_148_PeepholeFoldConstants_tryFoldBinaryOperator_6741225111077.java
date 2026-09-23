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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252406;
     Object term252492;
     Object term253172;
     Object term253173;
     Object term253111;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term252406 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term252492 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term252578 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term252670 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term252578, term252578.getClass(), "next", term252670);
        setIntField(term252578, term252578.getClass(), "type", 39);
        setField(term252492, term252492.getClass(), "first", term252578);
        setIntField(term252492, term252492.getClass(), "type", 23);
        term253172 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term253172, term253172.getClass(), "currentTraversal", null);
        term253173 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term253174 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term253175 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term253173, term253173.getClass(), "functionName", null);
        setBooleanField(term253173, term253173.getClass(), "itsNeedsActivation", false);
        setIntField(term253173, term253173.getClass(), "itsFunctionType", 0);
        setBooleanField(term253173, term253173.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term253173, term253173.getClass(), "encodedSourceStart", 0);
        setIntField(term253173, term253173.getClass(), "encodedSourceEnd", 0);
        setField(term253173, term253173.getClass(), "sourceName", null);
        setIntField(term253173, term253173.getClass(), "baseLineno", 0);
        setIntField(term253173, term253173.getClass(), "endLineno", 0);
        setField(term253173, term253173.getClass(), "functions", null);
        setField(term253173, term253173.getClass(), "regexps", null);
        setField(term253173, term253173.getClass(), "itsVariables", null);
        setField(term253173, term253173.getClass(), "itsConst", null);
        setField(term253173, term253173.getClass(), "itsVariableNames", null);
        setIntField(term253173, term253173.getClass(), "varStart", 0);
        setField(term253173, term253173.getClass(), "compilerData", null);
        setIntField(term253173, term253173.getClass(), "type", 23);
        setField(term253173, term253173.getClass(), "next", null);
        setField(term253174, term253174.getClass(), "functionName", null);
        setBooleanField(term253174, term253174.getClass(), "itsNeedsActivation", false);
        setIntField(term253174, term253174.getClass(), "itsFunctionType", 0);
        setBooleanField(term253174, term253174.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term253174, term253174.getClass(), "encodedSourceStart", 0);
        setIntField(term253174, term253174.getClass(), "encodedSourceEnd", 0);
        setField(term253174, term253174.getClass(), "sourceName", null);
        setIntField(term253174, term253174.getClass(), "baseLineno", 0);
        setIntField(term253174, term253174.getClass(), "endLineno", 0);
        setField(term253174, term253174.getClass(), "functions", null);
        setField(term253174, term253174.getClass(), "regexps", null);
        setField(term253174, term253174.getClass(), "itsVariables", null);
        setField(term253174, term253174.getClass(), "itsConst", null);
        setField(term253174, term253174.getClass(), "itsVariableNames", null);
        setIntField(term253174, term253174.getClass(), "varStart", 0);
        setField(term253174, term253174.getClass(), "compilerData", null);
        setIntField(term253174, term253174.getClass(), "type", 39);
        setField(term253175, term253175.getClass(), "str", null);
        setIntField(term253175, term253175.getClass(), "type", 0);
        setField(term253175, term253175.getClass(), "next", null);
        setField(term253175, term253175.getClass(), "first", null);
        setField(term253175, term253175.getClass(), "last", null);
        setField(term253175, term253175.getClass(), "propListHead", null);
        setIntField(term253175, term253175.getClass(), "sourcePosition", 0);
        setField(term253175, term253175.getClass(), "jsType", null);
        setField(term253175, term253175.getClass(), "parent", null);
        setField(term253174, term253174.getClass(), "next", term253175);
        setField(term253174, term253174.getClass(), "first", null);
        setField(term253174, term253174.getClass(), "last", null);
        setField(term253174, term253174.getClass(), "propListHead", null);
        setIntField(term253174, term253174.getClass(), "sourcePosition", 0);
        setField(term253174, term253174.getClass(), "jsType", null);
        setField(term253174, term253174.getClass(), "parent", null);
        setField(term253173, term253173.getClass(), "first", term253174);
        setField(term253173, term253173.getClass(), "last", null);
        setField(term253173, term253173.getClass(), "propListHead", null);
        setIntField(term253173, term253173.getClass(), "sourcePosition", 0);
        setField(term253173, term253173.getClass(), "jsType", null);
        setField(term253173, term253173.getClass(), "parent", null);
        term253111 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term253121 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term253131 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term253111, term253111.getClass(), "functionName", null);
        setBooleanField(term253111, term253111.getClass(), "itsNeedsActivation", false);
        setIntField(term253111, term253111.getClass(), "itsFunctionType", 0);
        setBooleanField(term253111, term253111.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term253111, term253111.getClass(), "encodedSourceStart", 0);
        setIntField(term253111, term253111.getClass(), "encodedSourceEnd", 0);
        setField(term253111, term253111.getClass(), "sourceName", null);
        setIntField(term253111, term253111.getClass(), "baseLineno", 0);
        setIntField(term253111, term253111.getClass(), "endLineno", 0);
        setField(term253111, term253111.getClass(), "functions", null);
        setField(term253111, term253111.getClass(), "regexps", null);
        setField(term253111, term253111.getClass(), "itsVariables", null);
        setField(term253111, term253111.getClass(), "itsConst", null);
        setField(term253111, term253111.getClass(), "itsVariableNames", null);
        setIntField(term253111, term253111.getClass(), "varStart", 0);
        setField(term253111, term253111.getClass(), "compilerData", null);
        setIntField(term253111, term253111.getClass(), "type", 23);
        setField(term253111, term253111.getClass(), "next", null);
        setField(term253121, term253121.getClass(), "functionName", null);
        setBooleanField(term253121, term253121.getClass(), "itsNeedsActivation", false);
        setIntField(term253121, term253121.getClass(), "itsFunctionType", 0);
        setBooleanField(term253121, term253121.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term253121, term253121.getClass(), "encodedSourceStart", 0);
        setIntField(term253121, term253121.getClass(), "encodedSourceEnd", 0);
        setField(term253121, term253121.getClass(), "sourceName", null);
        setIntField(term253121, term253121.getClass(), "baseLineno", 0);
        setIntField(term253121, term253121.getClass(), "endLineno", 0);
        setField(term253121, term253121.getClass(), "functions", null);
        setField(term253121, term253121.getClass(), "regexps", null);
        setField(term253121, term253121.getClass(), "itsVariables", null);
        setField(term253121, term253121.getClass(), "itsConst", null);
        setField(term253121, term253121.getClass(), "itsVariableNames", null);
        setIntField(term253121, term253121.getClass(), "varStart", 0);
        setField(term253121, term253121.getClass(), "compilerData", null);
        setIntField(term253121, term253121.getClass(), "type", 39);
        setField(term253131, term253131.getClass(), "str", null);
        setIntField(term253131, term253131.getClass(), "type", 0);
        setField(term253131, term253131.getClass(), "next", null);
        setField(term253131, term253131.getClass(), "first", null);
        setField(term253131, term253131.getClass(), "last", null);
        setField(term253131, term253131.getClass(), "propListHead", null);
        setIntField(term253131, term253131.getClass(), "sourcePosition", 0);
        setField(term253131, term253131.getClass(), "jsType", null);
        setField(term253131, term253131.getClass(), "parent", null);
        setField(term253121, term253121.getClass(), "next", term253131);
        setField(term253121, term253121.getClass(), "first", null);
        setField(term253121, term253121.getClass(), "last", null);
        setField(term253121, term253121.getClass(), "propListHead", null);
        setIntField(term253121, term253121.getClass(), "sourcePosition", 0);
        setField(term253121, term253121.getClass(), "jsType", null);
        setField(term253121, term253121.getClass(), "parent", null);
        setField(term253111, term253111.getClass(), "first", term253121);
        setField(term253111, term253111.getClass(), "last", null);
        setField(term253111, term253111.getClass(), "propListHead", null);
        setIntField(term253111, term253111.getClass(), "sourcePosition", 0);
        setField(term253111, term253111.getClass(), "jsType", null);
        setField(term253111, term253111.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term252492;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term252406, args);
        assertTrue(recursiveEquals(term252406, term253172));
        assertTrue(recursiveEquals(term252492, term253173));
        assertTrue(recursiveEquals(retValue, term253111));
    }

};


