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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term553545;
     Object term553637;
     Object term553857;
     Object term553858;
     Object term553814;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term553545 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term553637 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term553723 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term553793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term553723, term553723.getClass(), "next", term553793);
        setField(term553637, term553637.getClass(), "first", term553723);
        setIntField(term553637, term553637.getClass(), "type", 19);
        term553857 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term553857, term553857.getClass(), "currentTraversal", null);
        term553858 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term553859 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term553860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term553858, term553858.getClass(), "str", null);
        setIntField(term553858, term553858.getClass(), "type", 19);
        setField(term553858, term553858.getClass(), "next", null);
        setField(term553859, term553859.getClass(), "functionName", null);
        setBooleanField(term553859, term553859.getClass(), "itsNeedsActivation", false);
        setIntField(term553859, term553859.getClass(), "itsFunctionType", 0);
        setBooleanField(term553859, term553859.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term553859, term553859.getClass(), "encodedSourceStart", 0);
        setIntField(term553859, term553859.getClass(), "encodedSourceEnd", 0);
        setField(term553859, term553859.getClass(), "sourceName", null);
        setIntField(term553859, term553859.getClass(), "baseLineno", 0);
        setIntField(term553859, term553859.getClass(), "endLineno", 0);
        setField(term553859, term553859.getClass(), "functions", null);
        setField(term553859, term553859.getClass(), "regexps", null);
        setField(term553859, term553859.getClass(), "itsVariables", null);
        setField(term553859, term553859.getClass(), "itsConst", null);
        setField(term553859, term553859.getClass(), "itsVariableNames", null);
        setIntField(term553859, term553859.getClass(), "varStart", 0);
        setField(term553859, term553859.getClass(), "compilerData", null);
        setIntField(term553859, term553859.getClass(), "type", 0);
        setIntField(term553860, term553860.getClass(), "type", 0);
        setField(term553860, term553860.getClass(), "next", null);
        setField(term553860, term553860.getClass(), "first", null);
        setField(term553860, term553860.getClass(), "last", null);
        setField(term553860, term553860.getClass(), "propListHead", null);
        setIntField(term553860, term553860.getClass(), "sourcePosition", 0);
        setField(term553860, term553860.getClass(), "jsType", null);
        setField(term553860, term553860.getClass(), "parent", null);
        setField(term553859, term553859.getClass(), "next", term553860);
        setField(term553859, term553859.getClass(), "first", null);
        setField(term553859, term553859.getClass(), "last", null);
        setField(term553859, term553859.getClass(), "propListHead", null);
        setIntField(term553859, term553859.getClass(), "sourcePosition", 0);
        setField(term553859, term553859.getClass(), "jsType", null);
        setField(term553859, term553859.getClass(), "parent", null);
        setField(term553858, term553858.getClass(), "first", term553859);
        setField(term553858, term553858.getClass(), "last", null);
        setField(term553858, term553858.getClass(), "propListHead", null);
        setIntField(term553858, term553858.getClass(), "sourcePosition", 0);
        setField(term553858, term553858.getClass(), "jsType", null);
        setField(term553858, term553858.getClass(), "parent", null);
        term553814 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term553816 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term553826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term553814, term553814.getClass(), "str", null);
        setIntField(term553814, term553814.getClass(), "type", 19);
        setField(term553814, term553814.getClass(), "next", null);
        setField(term553816, term553816.getClass(), "functionName", null);
        setBooleanField(term553816, term553816.getClass(), "itsNeedsActivation", false);
        setIntField(term553816, term553816.getClass(), "itsFunctionType", 0);
        setBooleanField(term553816, term553816.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term553816, term553816.getClass(), "encodedSourceStart", 0);
        setIntField(term553816, term553816.getClass(), "encodedSourceEnd", 0);
        setField(term553816, term553816.getClass(), "sourceName", null);
        setIntField(term553816, term553816.getClass(), "baseLineno", 0);
        setIntField(term553816, term553816.getClass(), "endLineno", 0);
        setField(term553816, term553816.getClass(), "functions", null);
        setField(term553816, term553816.getClass(), "regexps", null);
        setField(term553816, term553816.getClass(), "itsVariables", null);
        setField(term553816, term553816.getClass(), "itsConst", null);
        setField(term553816, term553816.getClass(), "itsVariableNames", null);
        setIntField(term553816, term553816.getClass(), "varStart", 0);
        setField(term553816, term553816.getClass(), "compilerData", null);
        setIntField(term553816, term553816.getClass(), "type", 0);
        setIntField(term553826, term553826.getClass(), "type", 0);
        setField(term553826, term553826.getClass(), "next", null);
        setField(term553826, term553826.getClass(), "first", null);
        setField(term553826, term553826.getClass(), "last", null);
        setField(term553826, term553826.getClass(), "propListHead", null);
        setIntField(term553826, term553826.getClass(), "sourcePosition", 0);
        setField(term553826, term553826.getClass(), "jsType", null);
        setField(term553826, term553826.getClass(), "parent", null);
        setField(term553816, term553816.getClass(), "next", term553826);
        setField(term553816, term553816.getClass(), "first", null);
        setField(term553816, term553816.getClass(), "last", null);
        setField(term553816, term553816.getClass(), "propListHead", null);
        setIntField(term553816, term553816.getClass(), "sourcePosition", 0);
        setField(term553816, term553816.getClass(), "jsType", null);
        setField(term553816, term553816.getClass(), "parent", null);
        setField(term553814, term553814.getClass(), "first", term553816);
        setField(term553814, term553814.getClass(), "last", null);
        setField(term553814, term553814.getClass(), "propListHead", null);
        setIntField(term553814, term553814.getClass(), "sourcePosition", 0);
        setField(term553814, term553814.getClass(), "jsType", null);
        setField(term553814, term553814.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term553637;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term553545, args);
        assertTrue(recursiveEquals(term553545, term553857));
        assertTrue(recursiveEquals(term553637, term553858));
        assertTrue(recursiveEquals(retValue, term553814));
    }

};


