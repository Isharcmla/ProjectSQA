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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64681;
     Object term64767;
     Object term80949;
     Object term80950;
     Object term80879;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64681 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term64767 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term64853 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term64923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term64853, term64853.getClass(), "next", term64923);
        setField(term64767, term64767.getClass(), "first", term64853);
        setIntField(term64767, term64767.getClass(), "type", 15);
        term80949 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term80949, term80949.getClass(), "currentTraversal", null);
        term80950 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term80951 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term80952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term80950, term80950.getClass(), "functionName", null);
        setBooleanField(term80950, term80950.getClass(), "itsNeedsActivation", false);
        setIntField(term80950, term80950.getClass(), "itsFunctionType", 0);
        setBooleanField(term80950, term80950.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term80950, term80950.getClass(), "encodedSourceStart", 0);
        setIntField(term80950, term80950.getClass(), "encodedSourceEnd", 0);
        setField(term80950, term80950.getClass(), "sourceName", null);
        setIntField(term80950, term80950.getClass(), "baseLineno", 0);
        setIntField(term80950, term80950.getClass(), "endLineno", 0);
        setField(term80950, term80950.getClass(), "functions", null);
        setField(term80950, term80950.getClass(), "regexps", null);
        setField(term80950, term80950.getClass(), "itsVariables", null);
        setField(term80950, term80950.getClass(), "itsConst", null);
        setField(term80950, term80950.getClass(), "itsVariableNames", null);
        setIntField(term80950, term80950.getClass(), "varStart", 0);
        setField(term80950, term80950.getClass(), "compilerData", null);
        setIntField(term80950, term80950.getClass(), "type", 15);
        setField(term80950, term80950.getClass(), "next", null);
        setField(term80951, term80951.getClass(), "functionName", null);
        setBooleanField(term80951, term80951.getClass(), "itsNeedsActivation", false);
        setIntField(term80951, term80951.getClass(), "itsFunctionType", 0);
        setBooleanField(term80951, term80951.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term80951, term80951.getClass(), "encodedSourceStart", 0);
        setIntField(term80951, term80951.getClass(), "encodedSourceEnd", 0);
        setField(term80951, term80951.getClass(), "sourceName", null);
        setIntField(term80951, term80951.getClass(), "baseLineno", 0);
        setIntField(term80951, term80951.getClass(), "endLineno", 0);
        setField(term80951, term80951.getClass(), "functions", null);
        setField(term80951, term80951.getClass(), "regexps", null);
        setField(term80951, term80951.getClass(), "itsVariables", null);
        setField(term80951, term80951.getClass(), "itsConst", null);
        setField(term80951, term80951.getClass(), "itsVariableNames", null);
        setIntField(term80951, term80951.getClass(), "varStart", 0);
        setField(term80951, term80951.getClass(), "compilerData", null);
        setIntField(term80951, term80951.getClass(), "type", 0);
        setIntField(term80952, term80952.getClass(), "type", 0);
        setField(term80952, term80952.getClass(), "next", null);
        setField(term80952, term80952.getClass(), "first", null);
        setField(term80952, term80952.getClass(), "last", null);
        setField(term80952, term80952.getClass(), "propListHead", null);
        setIntField(term80952, term80952.getClass(), "sourcePosition", 0);
        setField(term80952, term80952.getClass(), "jsType", null);
        setField(term80952, term80952.getClass(), "parent", null);
        setField(term80951, term80951.getClass(), "next", term80952);
        setField(term80951, term80951.getClass(), "first", null);
        setField(term80951, term80951.getClass(), "last", null);
        setField(term80951, term80951.getClass(), "propListHead", null);
        setIntField(term80951, term80951.getClass(), "sourcePosition", 0);
        setField(term80951, term80951.getClass(), "jsType", null);
        setField(term80951, term80951.getClass(), "parent", null);
        setField(term80950, term80950.getClass(), "first", term80951);
        setField(term80950, term80950.getClass(), "last", null);
        setField(term80950, term80950.getClass(), "propListHead", null);
        setIntField(term80950, term80950.getClass(), "sourcePosition", 0);
        setField(term80950, term80950.getClass(), "jsType", null);
        setField(term80950, term80950.getClass(), "parent", null);
        term80879 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term80889 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term80899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term80879, term80879.getClass(), "functionName", null);
        setBooleanField(term80879, term80879.getClass(), "itsNeedsActivation", false);
        setIntField(term80879, term80879.getClass(), "itsFunctionType", 0);
        setBooleanField(term80879, term80879.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term80879, term80879.getClass(), "encodedSourceStart", 0);
        setIntField(term80879, term80879.getClass(), "encodedSourceEnd", 0);
        setField(term80879, term80879.getClass(), "sourceName", null);
        setIntField(term80879, term80879.getClass(), "baseLineno", 0);
        setIntField(term80879, term80879.getClass(), "endLineno", 0);
        setField(term80879, term80879.getClass(), "functions", null);
        setField(term80879, term80879.getClass(), "regexps", null);
        setField(term80879, term80879.getClass(), "itsVariables", null);
        setField(term80879, term80879.getClass(), "itsConst", null);
        setField(term80879, term80879.getClass(), "itsVariableNames", null);
        setIntField(term80879, term80879.getClass(), "varStart", 0);
        setField(term80879, term80879.getClass(), "compilerData", null);
        setIntField(term80879, term80879.getClass(), "type", 15);
        setField(term80879, term80879.getClass(), "next", null);
        setField(term80889, term80889.getClass(), "functionName", null);
        setBooleanField(term80889, term80889.getClass(), "itsNeedsActivation", false);
        setIntField(term80889, term80889.getClass(), "itsFunctionType", 0);
        setBooleanField(term80889, term80889.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term80889, term80889.getClass(), "encodedSourceStart", 0);
        setIntField(term80889, term80889.getClass(), "encodedSourceEnd", 0);
        setField(term80889, term80889.getClass(), "sourceName", null);
        setIntField(term80889, term80889.getClass(), "baseLineno", 0);
        setIntField(term80889, term80889.getClass(), "endLineno", 0);
        setField(term80889, term80889.getClass(), "functions", null);
        setField(term80889, term80889.getClass(), "regexps", null);
        setField(term80889, term80889.getClass(), "itsVariables", null);
        setField(term80889, term80889.getClass(), "itsConst", null);
        setField(term80889, term80889.getClass(), "itsVariableNames", null);
        setIntField(term80889, term80889.getClass(), "varStart", 0);
        setField(term80889, term80889.getClass(), "compilerData", null);
        setIntField(term80889, term80889.getClass(), "type", 0);
        setIntField(term80899, term80899.getClass(), "type", 0);
        setField(term80899, term80899.getClass(), "next", null);
        setField(term80899, term80899.getClass(), "first", null);
        setField(term80899, term80899.getClass(), "last", null);
        setField(term80899, term80899.getClass(), "propListHead", null);
        setIntField(term80899, term80899.getClass(), "sourcePosition", 0);
        setField(term80899, term80899.getClass(), "jsType", null);
        setField(term80899, term80899.getClass(), "parent", null);
        setField(term80889, term80889.getClass(), "next", term80899);
        setField(term80889, term80889.getClass(), "first", null);
        setField(term80889, term80889.getClass(), "last", null);
        setField(term80889, term80889.getClass(), "propListHead", null);
        setIntField(term80889, term80889.getClass(), "sourcePosition", 0);
        setField(term80889, term80889.getClass(), "jsType", null);
        setField(term80889, term80889.getClass(), "parent", null);
        setField(term80879, term80879.getClass(), "first", term80889);
        setField(term80879, term80879.getClass(), "last", null);
        setField(term80879, term80879.getClass(), "propListHead", null);
        setIntField(term80879, term80879.getClass(), "sourcePosition", 0);
        setField(term80879, term80879.getClass(), "jsType", null);
        setField(term80879, term80879.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term64767;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term64681, args);
        assertTrue(recursiveEquals(term64681, term80949));
        assertTrue(recursiveEquals(term64767, term80950));
        assertTrue(recursiveEquals(retValue, term80879));
    }

};


