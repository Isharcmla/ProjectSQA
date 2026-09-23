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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50921;
     Object term51007;
     Object term51690;
     Object term51691;
     Object term51631;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50921 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term51007 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term51093 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term51163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term51093, term51093.getClass(), "next", term51163);
        setField(term51007, term51007.getClass(), "first", term51093);
        setIntField(term51007, term51007.getClass(), "type", 22);
        term51690 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term51690, term51690.getClass(), "currentTraversal", null);
        term51691 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term51692 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term51693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term51691, term51691.getClass(), "functionName", null);
        setBooleanField(term51691, term51691.getClass(), "itsNeedsActivation", false);
        setIntField(term51691, term51691.getClass(), "itsFunctionType", 0);
        setBooleanField(term51691, term51691.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term51691, term51691.getClass(), "encodedSourceStart", 0);
        setIntField(term51691, term51691.getClass(), "encodedSourceEnd", 0);
        setField(term51691, term51691.getClass(), "sourceName", null);
        setIntField(term51691, term51691.getClass(), "baseLineno", 0);
        setIntField(term51691, term51691.getClass(), "endLineno", 0);
        setField(term51691, term51691.getClass(), "functions", null);
        setField(term51691, term51691.getClass(), "regexps", null);
        setField(term51691, term51691.getClass(), "itsVariables", null);
        setField(term51691, term51691.getClass(), "itsConst", null);
        setField(term51691, term51691.getClass(), "itsVariableNames", null);
        setIntField(term51691, term51691.getClass(), "varStart", 0);
        setField(term51691, term51691.getClass(), "compilerData", null);
        setIntField(term51691, term51691.getClass(), "type", 22);
        setField(term51691, term51691.getClass(), "next", null);
        setField(term51692, term51692.getClass(), "functionName", null);
        setBooleanField(term51692, term51692.getClass(), "itsNeedsActivation", false);
        setIntField(term51692, term51692.getClass(), "itsFunctionType", 0);
        setBooleanField(term51692, term51692.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term51692, term51692.getClass(), "encodedSourceStart", 0);
        setIntField(term51692, term51692.getClass(), "encodedSourceEnd", 0);
        setField(term51692, term51692.getClass(), "sourceName", null);
        setIntField(term51692, term51692.getClass(), "baseLineno", 0);
        setIntField(term51692, term51692.getClass(), "endLineno", 0);
        setField(term51692, term51692.getClass(), "functions", null);
        setField(term51692, term51692.getClass(), "regexps", null);
        setField(term51692, term51692.getClass(), "itsVariables", null);
        setField(term51692, term51692.getClass(), "itsConst", null);
        setField(term51692, term51692.getClass(), "itsVariableNames", null);
        setIntField(term51692, term51692.getClass(), "varStart", 0);
        setField(term51692, term51692.getClass(), "compilerData", null);
        setIntField(term51692, term51692.getClass(), "type", 0);
        setIntField(term51693, term51693.getClass(), "type", 0);
        setField(term51693, term51693.getClass(), "next", null);
        setField(term51693, term51693.getClass(), "first", null);
        setField(term51693, term51693.getClass(), "last", null);
        setField(term51693, term51693.getClass(), "propListHead", null);
        setIntField(term51693, term51693.getClass(), "sourcePosition", 0);
        setField(term51693, term51693.getClass(), "jsType", null);
        setField(term51693, term51693.getClass(), "parent", null);
        setField(term51692, term51692.getClass(), "next", term51693);
        setField(term51692, term51692.getClass(), "first", null);
        setField(term51692, term51692.getClass(), "last", null);
        setField(term51692, term51692.getClass(), "propListHead", null);
        setIntField(term51692, term51692.getClass(), "sourcePosition", 0);
        setField(term51692, term51692.getClass(), "jsType", null);
        setField(term51692, term51692.getClass(), "parent", null);
        setField(term51691, term51691.getClass(), "first", term51692);
        setField(term51691, term51691.getClass(), "last", null);
        setField(term51691, term51691.getClass(), "propListHead", null);
        setIntField(term51691, term51691.getClass(), "sourcePosition", 0);
        setField(term51691, term51691.getClass(), "jsType", null);
        setField(term51691, term51691.getClass(), "parent", null);
        term51631 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term51641 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term51651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term51631, term51631.getClass(), "functionName", null);
        setBooleanField(term51631, term51631.getClass(), "itsNeedsActivation", false);
        setIntField(term51631, term51631.getClass(), "itsFunctionType", 0);
        setBooleanField(term51631, term51631.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term51631, term51631.getClass(), "encodedSourceStart", 0);
        setIntField(term51631, term51631.getClass(), "encodedSourceEnd", 0);
        setField(term51631, term51631.getClass(), "sourceName", null);
        setIntField(term51631, term51631.getClass(), "baseLineno", 0);
        setIntField(term51631, term51631.getClass(), "endLineno", 0);
        setField(term51631, term51631.getClass(), "functions", null);
        setField(term51631, term51631.getClass(), "regexps", null);
        setField(term51631, term51631.getClass(), "itsVariables", null);
        setField(term51631, term51631.getClass(), "itsConst", null);
        setField(term51631, term51631.getClass(), "itsVariableNames", null);
        setIntField(term51631, term51631.getClass(), "varStart", 0);
        setField(term51631, term51631.getClass(), "compilerData", null);
        setIntField(term51631, term51631.getClass(), "type", 22);
        setField(term51631, term51631.getClass(), "next", null);
        setField(term51641, term51641.getClass(), "functionName", null);
        setBooleanField(term51641, term51641.getClass(), "itsNeedsActivation", false);
        setIntField(term51641, term51641.getClass(), "itsFunctionType", 0);
        setBooleanField(term51641, term51641.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term51641, term51641.getClass(), "encodedSourceStart", 0);
        setIntField(term51641, term51641.getClass(), "encodedSourceEnd", 0);
        setField(term51641, term51641.getClass(), "sourceName", null);
        setIntField(term51641, term51641.getClass(), "baseLineno", 0);
        setIntField(term51641, term51641.getClass(), "endLineno", 0);
        setField(term51641, term51641.getClass(), "functions", null);
        setField(term51641, term51641.getClass(), "regexps", null);
        setField(term51641, term51641.getClass(), "itsVariables", null);
        setField(term51641, term51641.getClass(), "itsConst", null);
        setField(term51641, term51641.getClass(), "itsVariableNames", null);
        setIntField(term51641, term51641.getClass(), "varStart", 0);
        setField(term51641, term51641.getClass(), "compilerData", null);
        setIntField(term51641, term51641.getClass(), "type", 0);
        setIntField(term51651, term51651.getClass(), "type", 0);
        setField(term51651, term51651.getClass(), "next", null);
        setField(term51651, term51651.getClass(), "first", null);
        setField(term51651, term51651.getClass(), "last", null);
        setField(term51651, term51651.getClass(), "propListHead", null);
        setIntField(term51651, term51651.getClass(), "sourcePosition", 0);
        setField(term51651, term51651.getClass(), "jsType", null);
        setField(term51651, term51651.getClass(), "parent", null);
        setField(term51641, term51641.getClass(), "next", term51651);
        setField(term51641, term51641.getClass(), "first", null);
        setField(term51641, term51641.getClass(), "last", null);
        setField(term51641, term51641.getClass(), "propListHead", null);
        setIntField(term51641, term51641.getClass(), "sourcePosition", 0);
        setField(term51641, term51641.getClass(), "jsType", null);
        setField(term51641, term51641.getClass(), "parent", null);
        setField(term51631, term51631.getClass(), "first", term51641);
        setField(term51631, term51631.getClass(), "last", null);
        setField(term51631, term51631.getClass(), "propListHead", null);
        setIntField(term51631, term51631.getClass(), "sourcePosition", 0);
        setField(term51631, term51631.getClass(), "jsType", null);
        setField(term51631, term51631.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term51007;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term50921, args);
        assertTrue(recursiveEquals(term50921, term51690));
        assertTrue(recursiveEquals(term51007, term51691));
        assertTrue(recursiveEquals(retValue, term51631));
    }

};


