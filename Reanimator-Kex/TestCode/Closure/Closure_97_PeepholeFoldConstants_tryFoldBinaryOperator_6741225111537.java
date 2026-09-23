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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term565219;
     Object term565311;
     Object term565924;
     Object term565925;
     Object term565853;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term565219 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term565311 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term565397 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term565467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term565397, term565397.getClass(), "next", term565467);
        setField(term565311, term565311.getClass(), "first", term565397);
        setIntField(term565311, term565311.getClass(), "type", 100);
        term565924 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term565924, term565924.getClass(), "currentTraversal", null);
        term565925 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term565926 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term565927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term565925, term565925.getClass(), "number", 0.0);
        setIntField(term565925, term565925.getClass(), "type", 100);
        setField(term565925, term565925.getClass(), "next", null);
        setField(term565926, term565926.getClass(), "functionName", null);
        setBooleanField(term565926, term565926.getClass(), "itsNeedsActivation", false);
        setIntField(term565926, term565926.getClass(), "itsFunctionType", 0);
        setBooleanField(term565926, term565926.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term565926, term565926.getClass(), "encodedSourceStart", 0);
        setIntField(term565926, term565926.getClass(), "encodedSourceEnd", 0);
        setField(term565926, term565926.getClass(), "sourceName", null);
        setIntField(term565926, term565926.getClass(), "baseLineno", 0);
        setIntField(term565926, term565926.getClass(), "endLineno", 0);
        setField(term565926, term565926.getClass(), "functions", null);
        setField(term565926, term565926.getClass(), "regexps", null);
        setField(term565926, term565926.getClass(), "itsVariables", null);
        setField(term565926, term565926.getClass(), "itsConst", null);
        setField(term565926, term565926.getClass(), "itsVariableNames", null);
        setIntField(term565926, term565926.getClass(), "varStart", 0);
        setField(term565926, term565926.getClass(), "compilerData", null);
        setIntField(term565926, term565926.getClass(), "type", 0);
        setIntField(term565927, term565927.getClass(), "type", 0);
        setField(term565927, term565927.getClass(), "next", null);
        setField(term565927, term565927.getClass(), "first", null);
        setField(term565927, term565927.getClass(), "last", null);
        setField(term565927, term565927.getClass(), "propListHead", null);
        setIntField(term565927, term565927.getClass(), "sourcePosition", 0);
        setField(term565927, term565927.getClass(), "jsType", null);
        setField(term565927, term565927.getClass(), "parent", null);
        setField(term565926, term565926.getClass(), "next", term565927);
        setField(term565926, term565926.getClass(), "first", null);
        setField(term565926, term565926.getClass(), "last", null);
        setField(term565926, term565926.getClass(), "propListHead", null);
        setIntField(term565926, term565926.getClass(), "sourcePosition", 0);
        setField(term565926, term565926.getClass(), "jsType", null);
        setField(term565926, term565926.getClass(), "parent", null);
        setField(term565925, term565925.getClass(), "first", term565926);
        setField(term565925, term565925.getClass(), "last", null);
        setField(term565925, term565925.getClass(), "propListHead", null);
        setIntField(term565925, term565925.getClass(), "sourcePosition", 0);
        setField(term565925, term565925.getClass(), "jsType", null);
        setField(term565925, term565925.getClass(), "parent", null);
        term565853 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term565856 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term565866 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term565853, term565853.getClass(), "number", 0.0);
        setIntField(term565853, term565853.getClass(), "type", 100);
        setField(term565853, term565853.getClass(), "next", null);
        setField(term565856, term565856.getClass(), "functionName", null);
        setBooleanField(term565856, term565856.getClass(), "itsNeedsActivation", false);
        setIntField(term565856, term565856.getClass(), "itsFunctionType", 0);
        setBooleanField(term565856, term565856.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term565856, term565856.getClass(), "encodedSourceStart", 0);
        setIntField(term565856, term565856.getClass(), "encodedSourceEnd", 0);
        setField(term565856, term565856.getClass(), "sourceName", null);
        setIntField(term565856, term565856.getClass(), "baseLineno", 0);
        setIntField(term565856, term565856.getClass(), "endLineno", 0);
        setField(term565856, term565856.getClass(), "functions", null);
        setField(term565856, term565856.getClass(), "regexps", null);
        setField(term565856, term565856.getClass(), "itsVariables", null);
        setField(term565856, term565856.getClass(), "itsConst", null);
        setField(term565856, term565856.getClass(), "itsVariableNames", null);
        setIntField(term565856, term565856.getClass(), "varStart", 0);
        setField(term565856, term565856.getClass(), "compilerData", null);
        setIntField(term565856, term565856.getClass(), "type", 0);
        setIntField(term565866, term565866.getClass(), "type", 0);
        setField(term565866, term565866.getClass(), "next", null);
        setField(term565866, term565866.getClass(), "first", null);
        setField(term565866, term565866.getClass(), "last", null);
        setField(term565866, term565866.getClass(), "propListHead", null);
        setIntField(term565866, term565866.getClass(), "sourcePosition", 0);
        setField(term565866, term565866.getClass(), "jsType", null);
        setField(term565866, term565866.getClass(), "parent", null);
        setField(term565856, term565856.getClass(), "next", term565866);
        setField(term565856, term565856.getClass(), "first", null);
        setField(term565856, term565856.getClass(), "last", null);
        setField(term565856, term565856.getClass(), "propListHead", null);
        setIntField(term565856, term565856.getClass(), "sourcePosition", 0);
        setField(term565856, term565856.getClass(), "jsType", null);
        setField(term565856, term565856.getClass(), "parent", null);
        setField(term565853, term565853.getClass(), "first", term565856);
        setField(term565853, term565853.getClass(), "last", null);
        setField(term565853, term565853.getClass(), "propListHead", null);
        setIntField(term565853, term565853.getClass(), "sourcePosition", 0);
        setField(term565853, term565853.getClass(), "jsType", null);
        setField(term565853, term565853.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term565311;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term565219, args);
        assertTrue(recursiveEquals(term565219, term565924));
        assertTrue(recursiveEquals(term565311, term565925));
        assertTrue(recursiveEquals(retValue, term565853));
    }

};


