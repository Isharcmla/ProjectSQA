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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term924592;
     Object term924684;
     Object term924948;
     Object term924949;
     Object term924877;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term924592 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term924684 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term924776 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term924862 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term924862, term924862.getClass(), "type", 16);
        setField(term924776, term924776.getClass(), "next", term924862);
        setIntField(term924776, term924776.getClass(), "type", 42);
        setField(term924684, term924684.getClass(), "first", term924776);
        setIntField(term924684, term924684.getClass(), "type", 16);
        term924948 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term924948, term924948.getClass(), "currentTraversal", null);
        term924949 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term924950 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term924951 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term924949, term924949.getClass(), "str", null);
        setIntField(term924949, term924949.getClass(), "type", 16);
        setField(term924949, term924949.getClass(), "next", null);
        setField(term924950, term924950.getClass(), "str", null);
        setIntField(term924950, term924950.getClass(), "type", 42);
        setField(term924951, term924951.getClass(), "functionName", null);
        setBooleanField(term924951, term924951.getClass(), "itsNeedsActivation", false);
        setIntField(term924951, term924951.getClass(), "itsFunctionType", 0);
        setBooleanField(term924951, term924951.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term924951, term924951.getClass(), "encodedSourceStart", 0);
        setIntField(term924951, term924951.getClass(), "encodedSourceEnd", 0);
        setField(term924951, term924951.getClass(), "sourceName", null);
        setIntField(term924951, term924951.getClass(), "baseLineno", 0);
        setIntField(term924951, term924951.getClass(), "endLineno", 0);
        setField(term924951, term924951.getClass(), "functions", null);
        setField(term924951, term924951.getClass(), "regexps", null);
        setField(term924951, term924951.getClass(), "itsVariables", null);
        setField(term924951, term924951.getClass(), "itsConst", null);
        setField(term924951, term924951.getClass(), "itsVariableNames", null);
        setIntField(term924951, term924951.getClass(), "varStart", 0);
        setField(term924951, term924951.getClass(), "compilerData", null);
        setIntField(term924951, term924951.getClass(), "type", 16);
        setField(term924951, term924951.getClass(), "next", null);
        setField(term924951, term924951.getClass(), "first", null);
        setField(term924951, term924951.getClass(), "last", null);
        setField(term924951, term924951.getClass(), "propListHead", null);
        setIntField(term924951, term924951.getClass(), "sourcePosition", 0);
        setField(term924951, term924951.getClass(), "jsType", null);
        setField(term924951, term924951.getClass(), "parent", null);
        setField(term924950, term924950.getClass(), "next", term924951);
        setField(term924950, term924950.getClass(), "first", null);
        setField(term924950, term924950.getClass(), "last", null);
        setField(term924950, term924950.getClass(), "propListHead", null);
        setIntField(term924950, term924950.getClass(), "sourcePosition", 0);
        setField(term924950, term924950.getClass(), "jsType", null);
        setField(term924950, term924950.getClass(), "parent", null);
        setField(term924949, term924949.getClass(), "first", term924950);
        setField(term924949, term924949.getClass(), "last", null);
        setField(term924949, term924949.getClass(), "propListHead", null);
        setIntField(term924949, term924949.getClass(), "sourcePosition", 0);
        setField(term924949, term924949.getClass(), "jsType", null);
        setField(term924949, term924949.getClass(), "parent", null);
        term924877 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term924879 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term924881 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term924877, term924877.getClass(), "str", null);
        setIntField(term924877, term924877.getClass(), "type", 16);
        setField(term924877, term924877.getClass(), "next", null);
        setField(term924879, term924879.getClass(), "str", null);
        setIntField(term924879, term924879.getClass(), "type", 42);
        setField(term924881, term924881.getClass(), "functionName", null);
        setBooleanField(term924881, term924881.getClass(), "itsNeedsActivation", false);
        setIntField(term924881, term924881.getClass(), "itsFunctionType", 0);
        setBooleanField(term924881, term924881.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term924881, term924881.getClass(), "encodedSourceStart", 0);
        setIntField(term924881, term924881.getClass(), "encodedSourceEnd", 0);
        setField(term924881, term924881.getClass(), "sourceName", null);
        setIntField(term924881, term924881.getClass(), "baseLineno", 0);
        setIntField(term924881, term924881.getClass(), "endLineno", 0);
        setField(term924881, term924881.getClass(), "functions", null);
        setField(term924881, term924881.getClass(), "regexps", null);
        setField(term924881, term924881.getClass(), "itsVariables", null);
        setField(term924881, term924881.getClass(), "itsConst", null);
        setField(term924881, term924881.getClass(), "itsVariableNames", null);
        setIntField(term924881, term924881.getClass(), "varStart", 0);
        setField(term924881, term924881.getClass(), "compilerData", null);
        setIntField(term924881, term924881.getClass(), "type", 16);
        setField(term924881, term924881.getClass(), "next", null);
        setField(term924881, term924881.getClass(), "first", null);
        setField(term924881, term924881.getClass(), "last", null);
        setField(term924881, term924881.getClass(), "propListHead", null);
        setIntField(term924881, term924881.getClass(), "sourcePosition", 0);
        setField(term924881, term924881.getClass(), "jsType", null);
        setField(term924881, term924881.getClass(), "parent", null);
        setField(term924879, term924879.getClass(), "next", term924881);
        setField(term924879, term924879.getClass(), "first", null);
        setField(term924879, term924879.getClass(), "last", null);
        setField(term924879, term924879.getClass(), "propListHead", null);
        setIntField(term924879, term924879.getClass(), "sourcePosition", 0);
        setField(term924879, term924879.getClass(), "jsType", null);
        setField(term924879, term924879.getClass(), "parent", null);
        setField(term924877, term924877.getClass(), "first", term924879);
        setField(term924877, term924877.getClass(), "last", null);
        setField(term924877, term924877.getClass(), "propListHead", null);
        setIntField(term924877, term924877.getClass(), "sourcePosition", 0);
        setField(term924877, term924877.getClass(), "jsType", null);
        setField(term924877, term924877.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term924684;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term924592, args);
        assertTrue(recursiveEquals(term924592, term924948));
        assertTrue(recursiveEquals(term924684, term924949));
        assertTrue(recursiveEquals(retValue, term924877));
    }

};


