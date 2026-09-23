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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238559;
     Object term238645;
     Object term238892;
     Object term238893;
     Object term238816;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238559 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term238645 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term238731 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term238801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term238731, term238731.getClass(), "next", term238801);
        setField(term238645, term238645.getClass(), "first", term238731);
        setIntField(term238645, term238645.getClass(), "type", 14);
        term238892 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term238892, term238892.getClass(), "currentTraversal", null);
        term238893 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term238894 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term238895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term238893, term238893.getClass(), "functionName", null);
        setBooleanField(term238893, term238893.getClass(), "itsNeedsActivation", false);
        setIntField(term238893, term238893.getClass(), "itsFunctionType", 0);
        setBooleanField(term238893, term238893.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term238893, term238893.getClass(), "encodedSourceStart", 0);
        setIntField(term238893, term238893.getClass(), "encodedSourceEnd", 0);
        setField(term238893, term238893.getClass(), "sourceName", null);
        setIntField(term238893, term238893.getClass(), "baseLineno", 0);
        setIntField(term238893, term238893.getClass(), "endLineno", 0);
        setField(term238893, term238893.getClass(), "functions", null);
        setField(term238893, term238893.getClass(), "regexps", null);
        setField(term238893, term238893.getClass(), "itsVariables", null);
        setField(term238893, term238893.getClass(), "itsConst", null);
        setField(term238893, term238893.getClass(), "itsVariableNames", null);
        setIntField(term238893, term238893.getClass(), "varStart", 0);
        setField(term238893, term238893.getClass(), "compilerData", null);
        setIntField(term238893, term238893.getClass(), "type", 14);
        setField(term238893, term238893.getClass(), "next", null);
        setField(term238894, term238894.getClass(), "functionName", null);
        setBooleanField(term238894, term238894.getClass(), "itsNeedsActivation", false);
        setIntField(term238894, term238894.getClass(), "itsFunctionType", 0);
        setBooleanField(term238894, term238894.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term238894, term238894.getClass(), "encodedSourceStart", 0);
        setIntField(term238894, term238894.getClass(), "encodedSourceEnd", 0);
        setField(term238894, term238894.getClass(), "sourceName", null);
        setIntField(term238894, term238894.getClass(), "baseLineno", 0);
        setIntField(term238894, term238894.getClass(), "endLineno", 0);
        setField(term238894, term238894.getClass(), "functions", null);
        setField(term238894, term238894.getClass(), "regexps", null);
        setField(term238894, term238894.getClass(), "itsVariables", null);
        setField(term238894, term238894.getClass(), "itsConst", null);
        setField(term238894, term238894.getClass(), "itsVariableNames", null);
        setIntField(term238894, term238894.getClass(), "varStart", 0);
        setField(term238894, term238894.getClass(), "compilerData", null);
        setIntField(term238894, term238894.getClass(), "type", 0);
        setIntField(term238895, term238895.getClass(), "type", 0);
        setField(term238895, term238895.getClass(), "next", null);
        setField(term238895, term238895.getClass(), "first", null);
        setField(term238895, term238895.getClass(), "last", null);
        setField(term238895, term238895.getClass(), "propListHead", null);
        setIntField(term238895, term238895.getClass(), "sourcePosition", 0);
        setField(term238895, term238895.getClass(), "jsType", null);
        setField(term238895, term238895.getClass(), "parent", null);
        setField(term238894, term238894.getClass(), "next", term238895);
        setField(term238894, term238894.getClass(), "first", null);
        setField(term238894, term238894.getClass(), "last", null);
        setField(term238894, term238894.getClass(), "propListHead", null);
        setIntField(term238894, term238894.getClass(), "sourcePosition", 0);
        setField(term238894, term238894.getClass(), "jsType", null);
        setField(term238894, term238894.getClass(), "parent", null);
        setField(term238893, term238893.getClass(), "first", term238894);
        setField(term238893, term238893.getClass(), "last", null);
        setField(term238893, term238893.getClass(), "propListHead", null);
        setIntField(term238893, term238893.getClass(), "sourcePosition", 0);
        setField(term238893, term238893.getClass(), "jsType", null);
        setField(term238893, term238893.getClass(), "parent", null);
        term238816 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term238826 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term238836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term238816, term238816.getClass(), "functionName", null);
        setBooleanField(term238816, term238816.getClass(), "itsNeedsActivation", false);
        setIntField(term238816, term238816.getClass(), "itsFunctionType", 0);
        setBooleanField(term238816, term238816.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term238816, term238816.getClass(), "encodedSourceStart", 0);
        setIntField(term238816, term238816.getClass(), "encodedSourceEnd", 0);
        setField(term238816, term238816.getClass(), "sourceName", null);
        setIntField(term238816, term238816.getClass(), "baseLineno", 0);
        setIntField(term238816, term238816.getClass(), "endLineno", 0);
        setField(term238816, term238816.getClass(), "functions", null);
        setField(term238816, term238816.getClass(), "regexps", null);
        setField(term238816, term238816.getClass(), "itsVariables", null);
        setField(term238816, term238816.getClass(), "itsConst", null);
        setField(term238816, term238816.getClass(), "itsVariableNames", null);
        setIntField(term238816, term238816.getClass(), "varStart", 0);
        setField(term238816, term238816.getClass(), "compilerData", null);
        setIntField(term238816, term238816.getClass(), "type", 14);
        setField(term238816, term238816.getClass(), "next", null);
        setField(term238826, term238826.getClass(), "functionName", null);
        setBooleanField(term238826, term238826.getClass(), "itsNeedsActivation", false);
        setIntField(term238826, term238826.getClass(), "itsFunctionType", 0);
        setBooleanField(term238826, term238826.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term238826, term238826.getClass(), "encodedSourceStart", 0);
        setIntField(term238826, term238826.getClass(), "encodedSourceEnd", 0);
        setField(term238826, term238826.getClass(), "sourceName", null);
        setIntField(term238826, term238826.getClass(), "baseLineno", 0);
        setIntField(term238826, term238826.getClass(), "endLineno", 0);
        setField(term238826, term238826.getClass(), "functions", null);
        setField(term238826, term238826.getClass(), "regexps", null);
        setField(term238826, term238826.getClass(), "itsVariables", null);
        setField(term238826, term238826.getClass(), "itsConst", null);
        setField(term238826, term238826.getClass(), "itsVariableNames", null);
        setIntField(term238826, term238826.getClass(), "varStart", 0);
        setField(term238826, term238826.getClass(), "compilerData", null);
        setIntField(term238826, term238826.getClass(), "type", 0);
        setIntField(term238836, term238836.getClass(), "type", 0);
        setField(term238836, term238836.getClass(), "next", null);
        setField(term238836, term238836.getClass(), "first", null);
        setField(term238836, term238836.getClass(), "last", null);
        setField(term238836, term238836.getClass(), "propListHead", null);
        setIntField(term238836, term238836.getClass(), "sourcePosition", 0);
        setField(term238836, term238836.getClass(), "jsType", null);
        setField(term238836, term238836.getClass(), "parent", null);
        setField(term238826, term238826.getClass(), "next", term238836);
        setField(term238826, term238826.getClass(), "first", null);
        setField(term238826, term238826.getClass(), "last", null);
        setField(term238826, term238826.getClass(), "propListHead", null);
        setIntField(term238826, term238826.getClass(), "sourcePosition", 0);
        setField(term238826, term238826.getClass(), "jsType", null);
        setField(term238826, term238826.getClass(), "parent", null);
        setField(term238816, term238816.getClass(), "first", term238826);
        setField(term238816, term238816.getClass(), "last", null);
        setField(term238816, term238816.getClass(), "propListHead", null);
        setIntField(term238816, term238816.getClass(), "sourcePosition", 0);
        setField(term238816, term238816.getClass(), "jsType", null);
        setField(term238816, term238816.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term238645;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term238559, args);
        assertTrue(recursiveEquals(term238559, term238892));
        assertTrue(recursiveEquals(term238645, term238893));
        assertTrue(recursiveEquals(retValue, term238816));
    }

};


