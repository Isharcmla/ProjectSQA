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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377699;
     Object term377785;
     Object term377877;
     Object term378379;
     Object term378380;
     Object term378381;
     Object term378340;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term377699 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term377785 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term377785, term377785.getClass(), "parent", null);
        setIntField(term377785, term377785.getClass(), "type", 44);
        term377877 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term377877, term377877.getClass(), "type", 44);
        term378379 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term378379, term378379.getClass(), "currentTraversal", null);
        term378380 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term378380, term378380.getClass(), "functionName", null);
        setBooleanField(term378380, term378380.getClass(), "itsNeedsActivation", false);
        setIntField(term378380, term378380.getClass(), "itsFunctionType", 0);
        setBooleanField(term378380, term378380.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term378380, term378380.getClass(), "encodedSourceStart", 0);
        setIntField(term378380, term378380.getClass(), "encodedSourceEnd", 0);
        setField(term378380, term378380.getClass(), "sourceName", null);
        setIntField(term378380, term378380.getClass(), "baseLineno", 0);
        setIntField(term378380, term378380.getClass(), "endLineno", 0);
        setField(term378380, term378380.getClass(), "functions", null);
        setField(term378380, term378380.getClass(), "regexps", null);
        setField(term378380, term378380.getClass(), "itsVariables", null);
        setField(term378380, term378380.getClass(), "itsConst", null);
        setField(term378380, term378380.getClass(), "itsVariableNames", null);
        setIntField(term378380, term378380.getClass(), "varStart", 0);
        setField(term378380, term378380.getClass(), "compilerData", null);
        setIntField(term378380, term378380.getClass(), "type", 44);
        setField(term378380, term378380.getClass(), "next", null);
        setField(term378380, term378380.getClass(), "first", null);
        setField(term378380, term378380.getClass(), "last", null);
        setField(term378380, term378380.getClass(), "propListHead", null);
        setIntField(term378380, term378380.getClass(), "sourcePosition", 0);
        setField(term378380, term378380.getClass(), "jsType", null);
        setField(term378380, term378380.getClass(), "parent", null);
        term378381 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term378381, term378381.getClass(), "str", null);
        setIntField(term378381, term378381.getClass(), "type", 44);
        setField(term378381, term378381.getClass(), "next", null);
        setField(term378381, term378381.getClass(), "first", null);
        setField(term378381, term378381.getClass(), "last", null);
        setField(term378381, term378381.getClass(), "propListHead", null);
        setIntField(term378381, term378381.getClass(), "sourcePosition", 0);
        setField(term378381, term378381.getClass(), "jsType", null);
        setField(term378381, term378381.getClass(), "parent", null);
        term378340 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term378340, term378340.getClass(), "functionName", null);
        setBooleanField(term378340, term378340.getClass(), "itsNeedsActivation", false);
        setIntField(term378340, term378340.getClass(), "itsFunctionType", 0);
        setBooleanField(term378340, term378340.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term378340, term378340.getClass(), "encodedSourceStart", 0);
        setIntField(term378340, term378340.getClass(), "encodedSourceEnd", 0);
        setField(term378340, term378340.getClass(), "sourceName", null);
        setIntField(term378340, term378340.getClass(), "baseLineno", 0);
        setIntField(term378340, term378340.getClass(), "endLineno", 0);
        setField(term378340, term378340.getClass(), "functions", null);
        setField(term378340, term378340.getClass(), "regexps", null);
        setField(term378340, term378340.getClass(), "itsVariables", null);
        setField(term378340, term378340.getClass(), "itsConst", null);
        setField(term378340, term378340.getClass(), "itsVariableNames", null);
        setIntField(term378340, term378340.getClass(), "varStart", 0);
        setField(term378340, term378340.getClass(), "compilerData", null);
        setIntField(term378340, term378340.getClass(), "type", 44);
        setField(term378340, term378340.getClass(), "next", null);
        setField(term378340, term378340.getClass(), "first", null);
        setField(term378340, term378340.getClass(), "last", null);
        setField(term378340, term378340.getClass(), "propListHead", null);
        setIntField(term378340, term378340.getClass(), "sourcePosition", 0);
        setField(term378340, term378340.getClass(), "jsType", null);
        setField(term378340, term378340.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term377785;
        args[1] = term377877;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term377699, args);
        assertTrue(recursiveEquals(term377699, term378379));
        assertTrue(recursiveEquals(term377785, term378380));
        assertTrue(recursiveEquals(term377877, term378381));
        assertTrue(recursiveEquals(retValue, term378340));
    }

};


