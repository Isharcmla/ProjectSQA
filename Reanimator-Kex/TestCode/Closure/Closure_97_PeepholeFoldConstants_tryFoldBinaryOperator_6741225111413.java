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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term533243;
     Object term533335;
     Object term533933;
     Object term533934;
     Object term533884;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term533243 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term533335 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term533421 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term533491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term533421, term533421.getClass(), "next", term533491);
        setField(term533335, term533335.getClass(), "first", term533421);
        setIntField(term533335, term533335.getClass(), "type", 11);
        term533933 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term533933, term533933.getClass(), "currentTraversal", null);
        term533934 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term533935 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term533936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term533934, term533934.getClass(), "number", 0.0);
        setIntField(term533934, term533934.getClass(), "type", 11);
        setField(term533934, term533934.getClass(), "next", null);
        setField(term533935, term533935.getClass(), "functionName", null);
        setBooleanField(term533935, term533935.getClass(), "itsNeedsActivation", false);
        setIntField(term533935, term533935.getClass(), "itsFunctionType", 0);
        setBooleanField(term533935, term533935.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term533935, term533935.getClass(), "encodedSourceStart", 0);
        setIntField(term533935, term533935.getClass(), "encodedSourceEnd", 0);
        setField(term533935, term533935.getClass(), "sourceName", null);
        setIntField(term533935, term533935.getClass(), "baseLineno", 0);
        setIntField(term533935, term533935.getClass(), "endLineno", 0);
        setField(term533935, term533935.getClass(), "functions", null);
        setField(term533935, term533935.getClass(), "regexps", null);
        setField(term533935, term533935.getClass(), "itsVariables", null);
        setField(term533935, term533935.getClass(), "itsConst", null);
        setField(term533935, term533935.getClass(), "itsVariableNames", null);
        setIntField(term533935, term533935.getClass(), "varStart", 0);
        setField(term533935, term533935.getClass(), "compilerData", null);
        setIntField(term533935, term533935.getClass(), "type", 0);
        setIntField(term533936, term533936.getClass(), "type", 0);
        setField(term533936, term533936.getClass(), "next", null);
        setField(term533936, term533936.getClass(), "first", null);
        setField(term533936, term533936.getClass(), "last", null);
        setField(term533936, term533936.getClass(), "propListHead", null);
        setIntField(term533936, term533936.getClass(), "sourcePosition", 0);
        setField(term533936, term533936.getClass(), "jsType", null);
        setField(term533936, term533936.getClass(), "parent", null);
        setField(term533935, term533935.getClass(), "next", term533936);
        setField(term533935, term533935.getClass(), "first", null);
        setField(term533935, term533935.getClass(), "last", null);
        setField(term533935, term533935.getClass(), "propListHead", null);
        setIntField(term533935, term533935.getClass(), "sourcePosition", 0);
        setField(term533935, term533935.getClass(), "jsType", null);
        setField(term533935, term533935.getClass(), "parent", null);
        setField(term533934, term533934.getClass(), "first", term533935);
        setField(term533934, term533934.getClass(), "last", null);
        setField(term533934, term533934.getClass(), "propListHead", null);
        setIntField(term533934, term533934.getClass(), "sourcePosition", 0);
        setField(term533934, term533934.getClass(), "jsType", null);
        setField(term533934, term533934.getClass(), "parent", null);
        term533884 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term533887 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term533897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term533884, term533884.getClass(), "number", 0.0);
        setIntField(term533884, term533884.getClass(), "type", 11);
        setField(term533884, term533884.getClass(), "next", null);
        setField(term533887, term533887.getClass(), "functionName", null);
        setBooleanField(term533887, term533887.getClass(), "itsNeedsActivation", false);
        setIntField(term533887, term533887.getClass(), "itsFunctionType", 0);
        setBooleanField(term533887, term533887.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term533887, term533887.getClass(), "encodedSourceStart", 0);
        setIntField(term533887, term533887.getClass(), "encodedSourceEnd", 0);
        setField(term533887, term533887.getClass(), "sourceName", null);
        setIntField(term533887, term533887.getClass(), "baseLineno", 0);
        setIntField(term533887, term533887.getClass(), "endLineno", 0);
        setField(term533887, term533887.getClass(), "functions", null);
        setField(term533887, term533887.getClass(), "regexps", null);
        setField(term533887, term533887.getClass(), "itsVariables", null);
        setField(term533887, term533887.getClass(), "itsConst", null);
        setField(term533887, term533887.getClass(), "itsVariableNames", null);
        setIntField(term533887, term533887.getClass(), "varStart", 0);
        setField(term533887, term533887.getClass(), "compilerData", null);
        setIntField(term533887, term533887.getClass(), "type", 0);
        setIntField(term533897, term533897.getClass(), "type", 0);
        setField(term533897, term533897.getClass(), "next", null);
        setField(term533897, term533897.getClass(), "first", null);
        setField(term533897, term533897.getClass(), "last", null);
        setField(term533897, term533897.getClass(), "propListHead", null);
        setIntField(term533897, term533897.getClass(), "sourcePosition", 0);
        setField(term533897, term533897.getClass(), "jsType", null);
        setField(term533897, term533897.getClass(), "parent", null);
        setField(term533887, term533887.getClass(), "next", term533897);
        setField(term533887, term533887.getClass(), "first", null);
        setField(term533887, term533887.getClass(), "last", null);
        setField(term533887, term533887.getClass(), "propListHead", null);
        setIntField(term533887, term533887.getClass(), "sourcePosition", 0);
        setField(term533887, term533887.getClass(), "jsType", null);
        setField(term533887, term533887.getClass(), "parent", null);
        setField(term533884, term533884.getClass(), "first", term533887);
        setField(term533884, term533884.getClass(), "last", null);
        setField(term533884, term533884.getClass(), "propListHead", null);
        setIntField(term533884, term533884.getClass(), "sourcePosition", 0);
        setField(term533884, term533884.getClass(), "jsType", null);
        setField(term533884, term533884.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term533335;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term533243, args);
        assertTrue(recursiveEquals(term533243, term533933));
        assertTrue(recursiveEquals(term533335, term533934));
        assertTrue(recursiveEquals(retValue, term533884));
    }

};


