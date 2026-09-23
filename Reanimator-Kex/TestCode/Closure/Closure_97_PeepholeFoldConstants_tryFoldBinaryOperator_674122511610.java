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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159746;
     Object term159832;
     Object term160062;
     Object term160063;
     Object term160003;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159746 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term159832 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term159918 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term159988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term159918, term159918.getClass(), "next", term159988);
        setField(term159832, term159832.getClass(), "first", term159918);
        setIntField(term159832, term159832.getClass(), "type", 19);
        term160062 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term160062, term160062.getClass(), "currentTraversal", null);
        term160063 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term160064 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term160065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term160063, term160063.getClass(), "functionName", null);
        setBooleanField(term160063, term160063.getClass(), "itsNeedsActivation", false);
        setIntField(term160063, term160063.getClass(), "itsFunctionType", 0);
        setBooleanField(term160063, term160063.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term160063, term160063.getClass(), "encodedSourceStart", 0);
        setIntField(term160063, term160063.getClass(), "encodedSourceEnd", 0);
        setField(term160063, term160063.getClass(), "sourceName", null);
        setIntField(term160063, term160063.getClass(), "baseLineno", 0);
        setIntField(term160063, term160063.getClass(), "endLineno", 0);
        setField(term160063, term160063.getClass(), "functions", null);
        setField(term160063, term160063.getClass(), "regexps", null);
        setField(term160063, term160063.getClass(), "itsVariables", null);
        setField(term160063, term160063.getClass(), "itsConst", null);
        setField(term160063, term160063.getClass(), "itsVariableNames", null);
        setIntField(term160063, term160063.getClass(), "varStart", 0);
        setField(term160063, term160063.getClass(), "compilerData", null);
        setIntField(term160063, term160063.getClass(), "type", 19);
        setField(term160063, term160063.getClass(), "next", null);
        setField(term160064, term160064.getClass(), "functionName", null);
        setBooleanField(term160064, term160064.getClass(), "itsNeedsActivation", false);
        setIntField(term160064, term160064.getClass(), "itsFunctionType", 0);
        setBooleanField(term160064, term160064.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term160064, term160064.getClass(), "encodedSourceStart", 0);
        setIntField(term160064, term160064.getClass(), "encodedSourceEnd", 0);
        setField(term160064, term160064.getClass(), "sourceName", null);
        setIntField(term160064, term160064.getClass(), "baseLineno", 0);
        setIntField(term160064, term160064.getClass(), "endLineno", 0);
        setField(term160064, term160064.getClass(), "functions", null);
        setField(term160064, term160064.getClass(), "regexps", null);
        setField(term160064, term160064.getClass(), "itsVariables", null);
        setField(term160064, term160064.getClass(), "itsConst", null);
        setField(term160064, term160064.getClass(), "itsVariableNames", null);
        setIntField(term160064, term160064.getClass(), "varStart", 0);
        setField(term160064, term160064.getClass(), "compilerData", null);
        setIntField(term160064, term160064.getClass(), "type", 0);
        setIntField(term160065, term160065.getClass(), "type", 0);
        setField(term160065, term160065.getClass(), "next", null);
        setField(term160065, term160065.getClass(), "first", null);
        setField(term160065, term160065.getClass(), "last", null);
        setField(term160065, term160065.getClass(), "propListHead", null);
        setIntField(term160065, term160065.getClass(), "sourcePosition", 0);
        setField(term160065, term160065.getClass(), "jsType", null);
        setField(term160065, term160065.getClass(), "parent", null);
        setField(term160064, term160064.getClass(), "next", term160065);
        setField(term160064, term160064.getClass(), "first", null);
        setField(term160064, term160064.getClass(), "last", null);
        setField(term160064, term160064.getClass(), "propListHead", null);
        setIntField(term160064, term160064.getClass(), "sourcePosition", 0);
        setField(term160064, term160064.getClass(), "jsType", null);
        setField(term160064, term160064.getClass(), "parent", null);
        setField(term160063, term160063.getClass(), "first", term160064);
        setField(term160063, term160063.getClass(), "last", null);
        setField(term160063, term160063.getClass(), "propListHead", null);
        setIntField(term160063, term160063.getClass(), "sourcePosition", 0);
        setField(term160063, term160063.getClass(), "jsType", null);
        setField(term160063, term160063.getClass(), "parent", null);
        term160003 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term160013 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term160023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term160003, term160003.getClass(), "functionName", null);
        setBooleanField(term160003, term160003.getClass(), "itsNeedsActivation", false);
        setIntField(term160003, term160003.getClass(), "itsFunctionType", 0);
        setBooleanField(term160003, term160003.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term160003, term160003.getClass(), "encodedSourceStart", 0);
        setIntField(term160003, term160003.getClass(), "encodedSourceEnd", 0);
        setField(term160003, term160003.getClass(), "sourceName", null);
        setIntField(term160003, term160003.getClass(), "baseLineno", 0);
        setIntField(term160003, term160003.getClass(), "endLineno", 0);
        setField(term160003, term160003.getClass(), "functions", null);
        setField(term160003, term160003.getClass(), "regexps", null);
        setField(term160003, term160003.getClass(), "itsVariables", null);
        setField(term160003, term160003.getClass(), "itsConst", null);
        setField(term160003, term160003.getClass(), "itsVariableNames", null);
        setIntField(term160003, term160003.getClass(), "varStart", 0);
        setField(term160003, term160003.getClass(), "compilerData", null);
        setIntField(term160003, term160003.getClass(), "type", 19);
        setField(term160003, term160003.getClass(), "next", null);
        setField(term160013, term160013.getClass(), "functionName", null);
        setBooleanField(term160013, term160013.getClass(), "itsNeedsActivation", false);
        setIntField(term160013, term160013.getClass(), "itsFunctionType", 0);
        setBooleanField(term160013, term160013.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term160013, term160013.getClass(), "encodedSourceStart", 0);
        setIntField(term160013, term160013.getClass(), "encodedSourceEnd", 0);
        setField(term160013, term160013.getClass(), "sourceName", null);
        setIntField(term160013, term160013.getClass(), "baseLineno", 0);
        setIntField(term160013, term160013.getClass(), "endLineno", 0);
        setField(term160013, term160013.getClass(), "functions", null);
        setField(term160013, term160013.getClass(), "regexps", null);
        setField(term160013, term160013.getClass(), "itsVariables", null);
        setField(term160013, term160013.getClass(), "itsConst", null);
        setField(term160013, term160013.getClass(), "itsVariableNames", null);
        setIntField(term160013, term160013.getClass(), "varStart", 0);
        setField(term160013, term160013.getClass(), "compilerData", null);
        setIntField(term160013, term160013.getClass(), "type", 0);
        setIntField(term160023, term160023.getClass(), "type", 0);
        setField(term160023, term160023.getClass(), "next", null);
        setField(term160023, term160023.getClass(), "first", null);
        setField(term160023, term160023.getClass(), "last", null);
        setField(term160023, term160023.getClass(), "propListHead", null);
        setIntField(term160023, term160023.getClass(), "sourcePosition", 0);
        setField(term160023, term160023.getClass(), "jsType", null);
        setField(term160023, term160023.getClass(), "parent", null);
        setField(term160013, term160013.getClass(), "next", term160023);
        setField(term160013, term160013.getClass(), "first", null);
        setField(term160013, term160013.getClass(), "last", null);
        setField(term160013, term160013.getClass(), "propListHead", null);
        setIntField(term160013, term160013.getClass(), "sourcePosition", 0);
        setField(term160013, term160013.getClass(), "jsType", null);
        setField(term160013, term160013.getClass(), "parent", null);
        setField(term160003, term160003.getClass(), "first", term160013);
        setField(term160003, term160003.getClass(), "last", null);
        setField(term160003, term160003.getClass(), "propListHead", null);
        setIntField(term160003, term160003.getClass(), "sourcePosition", 0);
        setField(term160003, term160003.getClass(), "jsType", null);
        setField(term160003, term160003.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term159832;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term159746, args);
        assertTrue(recursiveEquals(term159746, term160062));
        assertTrue(recursiveEquals(term159832, term160063));
        assertTrue(recursiveEquals(retValue, term160003));
    }

};


