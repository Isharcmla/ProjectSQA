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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104137;
     Object term104223;
     Object term105019;
     Object term105020;
     Object term104945;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104137 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term104223 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term104309 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term104379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term104309, term104309.getClass(), "next", term104379);
        setField(term104223, term104223.getClass(), "first", term104309);
        setIntField(term104223, term104223.getClass(), "type", 16);
        term105019 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term105019, term105019.getClass(), "currentTraversal", null);
        term105020 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term105021 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term105022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term105020, term105020.getClass(), "functionName", null);
        setBooleanField(term105020, term105020.getClass(), "itsNeedsActivation", false);
        setIntField(term105020, term105020.getClass(), "itsFunctionType", 0);
        setBooleanField(term105020, term105020.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term105020, term105020.getClass(), "encodedSourceStart", 0);
        setIntField(term105020, term105020.getClass(), "encodedSourceEnd", 0);
        setField(term105020, term105020.getClass(), "sourceName", null);
        setIntField(term105020, term105020.getClass(), "baseLineno", 0);
        setIntField(term105020, term105020.getClass(), "endLineno", 0);
        setField(term105020, term105020.getClass(), "functions", null);
        setField(term105020, term105020.getClass(), "regexps", null);
        setField(term105020, term105020.getClass(), "itsVariables", null);
        setField(term105020, term105020.getClass(), "itsConst", null);
        setField(term105020, term105020.getClass(), "itsVariableNames", null);
        setIntField(term105020, term105020.getClass(), "varStart", 0);
        setField(term105020, term105020.getClass(), "compilerData", null);
        setIntField(term105020, term105020.getClass(), "type", 16);
        setField(term105020, term105020.getClass(), "next", null);
        setField(term105021, term105021.getClass(), "functionName", null);
        setBooleanField(term105021, term105021.getClass(), "itsNeedsActivation", false);
        setIntField(term105021, term105021.getClass(), "itsFunctionType", 0);
        setBooleanField(term105021, term105021.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term105021, term105021.getClass(), "encodedSourceStart", 0);
        setIntField(term105021, term105021.getClass(), "encodedSourceEnd", 0);
        setField(term105021, term105021.getClass(), "sourceName", null);
        setIntField(term105021, term105021.getClass(), "baseLineno", 0);
        setIntField(term105021, term105021.getClass(), "endLineno", 0);
        setField(term105021, term105021.getClass(), "functions", null);
        setField(term105021, term105021.getClass(), "regexps", null);
        setField(term105021, term105021.getClass(), "itsVariables", null);
        setField(term105021, term105021.getClass(), "itsConst", null);
        setField(term105021, term105021.getClass(), "itsVariableNames", null);
        setIntField(term105021, term105021.getClass(), "varStart", 0);
        setField(term105021, term105021.getClass(), "compilerData", null);
        setIntField(term105021, term105021.getClass(), "type", 0);
        setIntField(term105022, term105022.getClass(), "type", 0);
        setField(term105022, term105022.getClass(), "next", null);
        setField(term105022, term105022.getClass(), "first", null);
        setField(term105022, term105022.getClass(), "last", null);
        setField(term105022, term105022.getClass(), "propListHead", null);
        setIntField(term105022, term105022.getClass(), "sourcePosition", 0);
        setField(term105022, term105022.getClass(), "jsType", null);
        setField(term105022, term105022.getClass(), "parent", null);
        setField(term105021, term105021.getClass(), "next", term105022);
        setField(term105021, term105021.getClass(), "first", null);
        setField(term105021, term105021.getClass(), "last", null);
        setField(term105021, term105021.getClass(), "propListHead", null);
        setIntField(term105021, term105021.getClass(), "sourcePosition", 0);
        setField(term105021, term105021.getClass(), "jsType", null);
        setField(term105021, term105021.getClass(), "parent", null);
        setField(term105020, term105020.getClass(), "first", term105021);
        setField(term105020, term105020.getClass(), "last", null);
        setField(term105020, term105020.getClass(), "propListHead", null);
        setIntField(term105020, term105020.getClass(), "sourcePosition", 0);
        setField(term105020, term105020.getClass(), "jsType", null);
        setField(term105020, term105020.getClass(), "parent", null);
        term104945 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term104955 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term104965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term104945, term104945.getClass(), "functionName", null);
        setBooleanField(term104945, term104945.getClass(), "itsNeedsActivation", false);
        setIntField(term104945, term104945.getClass(), "itsFunctionType", 0);
        setBooleanField(term104945, term104945.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term104945, term104945.getClass(), "encodedSourceStart", 0);
        setIntField(term104945, term104945.getClass(), "encodedSourceEnd", 0);
        setField(term104945, term104945.getClass(), "sourceName", null);
        setIntField(term104945, term104945.getClass(), "baseLineno", 0);
        setIntField(term104945, term104945.getClass(), "endLineno", 0);
        setField(term104945, term104945.getClass(), "functions", null);
        setField(term104945, term104945.getClass(), "regexps", null);
        setField(term104945, term104945.getClass(), "itsVariables", null);
        setField(term104945, term104945.getClass(), "itsConst", null);
        setField(term104945, term104945.getClass(), "itsVariableNames", null);
        setIntField(term104945, term104945.getClass(), "varStart", 0);
        setField(term104945, term104945.getClass(), "compilerData", null);
        setIntField(term104945, term104945.getClass(), "type", 16);
        setField(term104945, term104945.getClass(), "next", null);
        setField(term104955, term104955.getClass(), "functionName", null);
        setBooleanField(term104955, term104955.getClass(), "itsNeedsActivation", false);
        setIntField(term104955, term104955.getClass(), "itsFunctionType", 0);
        setBooleanField(term104955, term104955.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term104955, term104955.getClass(), "encodedSourceStart", 0);
        setIntField(term104955, term104955.getClass(), "encodedSourceEnd", 0);
        setField(term104955, term104955.getClass(), "sourceName", null);
        setIntField(term104955, term104955.getClass(), "baseLineno", 0);
        setIntField(term104955, term104955.getClass(), "endLineno", 0);
        setField(term104955, term104955.getClass(), "functions", null);
        setField(term104955, term104955.getClass(), "regexps", null);
        setField(term104955, term104955.getClass(), "itsVariables", null);
        setField(term104955, term104955.getClass(), "itsConst", null);
        setField(term104955, term104955.getClass(), "itsVariableNames", null);
        setIntField(term104955, term104955.getClass(), "varStart", 0);
        setField(term104955, term104955.getClass(), "compilerData", null);
        setIntField(term104955, term104955.getClass(), "type", 0);
        setIntField(term104965, term104965.getClass(), "type", 0);
        setField(term104965, term104965.getClass(), "next", null);
        setField(term104965, term104965.getClass(), "first", null);
        setField(term104965, term104965.getClass(), "last", null);
        setField(term104965, term104965.getClass(), "propListHead", null);
        setIntField(term104965, term104965.getClass(), "sourcePosition", 0);
        setField(term104965, term104965.getClass(), "jsType", null);
        setField(term104965, term104965.getClass(), "parent", null);
        setField(term104955, term104955.getClass(), "next", term104965);
        setField(term104955, term104955.getClass(), "first", null);
        setField(term104955, term104955.getClass(), "last", null);
        setField(term104955, term104955.getClass(), "propListHead", null);
        setIntField(term104955, term104955.getClass(), "sourcePosition", 0);
        setField(term104955, term104955.getClass(), "jsType", null);
        setField(term104955, term104955.getClass(), "parent", null);
        setField(term104945, term104945.getClass(), "first", term104955);
        setField(term104945, term104945.getClass(), "last", null);
        setField(term104945, term104945.getClass(), "propListHead", null);
        setIntField(term104945, term104945.getClass(), "sourcePosition", 0);
        setField(term104945, term104945.getClass(), "jsType", null);
        setField(term104945, term104945.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term104223;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term104137, args);
        assertTrue(recursiveEquals(term104137, term105019));
        assertTrue(recursiveEquals(term104223, term105020));
        assertTrue(recursiveEquals(retValue, term104945));
    }

};


