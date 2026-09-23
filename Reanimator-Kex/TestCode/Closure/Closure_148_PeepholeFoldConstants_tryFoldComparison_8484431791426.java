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

public class PeepholeFoldConstants_tryFoldComparison_8484431791426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351949;
     Object term352035;
     Object term352121;
     Object term352207;
     Object term352345;
     Object term352346;
     Object term352347;
     Object term352348;
     Object term352309;

    public PeepholeFoldConstants_tryFoldComparison_8484431791426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term351949 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term352035 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term352035, term352035.getClass(), "type", 14);
        term352121 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term352121, term352121.getClass(), "type", 14);
        term352207 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term352345 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term352345, term352345.getClass(), "currentTraversal", null);
        term352346 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term352346, term352346.getClass(), "functionName", null);
        setBooleanField(term352346, term352346.getClass(), "itsNeedsActivation", false);
        setIntField(term352346, term352346.getClass(), "itsFunctionType", 0);
        setBooleanField(term352346, term352346.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term352346, term352346.getClass(), "encodedSourceStart", 0);
        setIntField(term352346, term352346.getClass(), "encodedSourceEnd", 0);
        setField(term352346, term352346.getClass(), "sourceName", null);
        setIntField(term352346, term352346.getClass(), "baseLineno", 0);
        setIntField(term352346, term352346.getClass(), "endLineno", 0);
        setField(term352346, term352346.getClass(), "functions", null);
        setField(term352346, term352346.getClass(), "regexps", null);
        setField(term352346, term352346.getClass(), "itsVariables", null);
        setField(term352346, term352346.getClass(), "itsConst", null);
        setField(term352346, term352346.getClass(), "itsVariableNames", null);
        setIntField(term352346, term352346.getClass(), "varStart", 0);
        setField(term352346, term352346.getClass(), "compilerData", null);
        setIntField(term352346, term352346.getClass(), "type", 14);
        setField(term352346, term352346.getClass(), "next", null);
        setField(term352346, term352346.getClass(), "first", null);
        setField(term352346, term352346.getClass(), "last", null);
        setField(term352346, term352346.getClass(), "propListHead", null);
        setIntField(term352346, term352346.getClass(), "sourcePosition", 0);
        setField(term352346, term352346.getClass(), "jsType", null);
        setField(term352346, term352346.getClass(), "parent", null);
        term352347 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term352347, term352347.getClass(), "functionName", null);
        setBooleanField(term352347, term352347.getClass(), "itsNeedsActivation", false);
        setIntField(term352347, term352347.getClass(), "itsFunctionType", 0);
        setBooleanField(term352347, term352347.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term352347, term352347.getClass(), "encodedSourceStart", 0);
        setIntField(term352347, term352347.getClass(), "encodedSourceEnd", 0);
        setField(term352347, term352347.getClass(), "sourceName", null);
        setIntField(term352347, term352347.getClass(), "baseLineno", 0);
        setIntField(term352347, term352347.getClass(), "endLineno", 0);
        setField(term352347, term352347.getClass(), "functions", null);
        setField(term352347, term352347.getClass(), "regexps", null);
        setField(term352347, term352347.getClass(), "itsVariables", null);
        setField(term352347, term352347.getClass(), "itsConst", null);
        setField(term352347, term352347.getClass(), "itsVariableNames", null);
        setIntField(term352347, term352347.getClass(), "varStart", 0);
        setField(term352347, term352347.getClass(), "compilerData", null);
        setIntField(term352347, term352347.getClass(), "type", 14);
        setField(term352347, term352347.getClass(), "next", null);
        setField(term352347, term352347.getClass(), "first", null);
        setField(term352347, term352347.getClass(), "last", null);
        setField(term352347, term352347.getClass(), "propListHead", null);
        setIntField(term352347, term352347.getClass(), "sourcePosition", 0);
        setField(term352347, term352347.getClass(), "jsType", null);
        setField(term352347, term352347.getClass(), "parent", null);
        term352348 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term352348, term352348.getClass(), "functionName", null);
        setBooleanField(term352348, term352348.getClass(), "itsNeedsActivation", false);
        setIntField(term352348, term352348.getClass(), "itsFunctionType", 0);
        setBooleanField(term352348, term352348.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term352348, term352348.getClass(), "encodedSourceStart", 0);
        setIntField(term352348, term352348.getClass(), "encodedSourceEnd", 0);
        setField(term352348, term352348.getClass(), "sourceName", null);
        setIntField(term352348, term352348.getClass(), "baseLineno", 0);
        setIntField(term352348, term352348.getClass(), "endLineno", 0);
        setField(term352348, term352348.getClass(), "functions", null);
        setField(term352348, term352348.getClass(), "regexps", null);
        setField(term352348, term352348.getClass(), "itsVariables", null);
        setField(term352348, term352348.getClass(), "itsConst", null);
        setField(term352348, term352348.getClass(), "itsVariableNames", null);
        setIntField(term352348, term352348.getClass(), "varStart", 0);
        setField(term352348, term352348.getClass(), "compilerData", null);
        setIntField(term352348, term352348.getClass(), "type", 0);
        setField(term352348, term352348.getClass(), "next", null);
        setField(term352348, term352348.getClass(), "first", null);
        setField(term352348, term352348.getClass(), "last", null);
        setField(term352348, term352348.getClass(), "propListHead", null);
        setIntField(term352348, term352348.getClass(), "sourcePosition", 0);
        setField(term352348, term352348.getClass(), "jsType", null);
        setField(term352348, term352348.getClass(), "parent", null);
        term352309 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term352309, term352309.getClass(), "functionName", null);
        setBooleanField(term352309, term352309.getClass(), "itsNeedsActivation", false);
        setIntField(term352309, term352309.getClass(), "itsFunctionType", 0);
        setBooleanField(term352309, term352309.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term352309, term352309.getClass(), "encodedSourceStart", 0);
        setIntField(term352309, term352309.getClass(), "encodedSourceEnd", 0);
        setField(term352309, term352309.getClass(), "sourceName", null);
        setIntField(term352309, term352309.getClass(), "baseLineno", 0);
        setIntField(term352309, term352309.getClass(), "endLineno", 0);
        setField(term352309, term352309.getClass(), "functions", null);
        setField(term352309, term352309.getClass(), "regexps", null);
        setField(term352309, term352309.getClass(), "itsVariables", null);
        setField(term352309, term352309.getClass(), "itsConst", null);
        setField(term352309, term352309.getClass(), "itsVariableNames", null);
        setIntField(term352309, term352309.getClass(), "varStart", 0);
        setField(term352309, term352309.getClass(), "compilerData", null);
        setIntField(term352309, term352309.getClass(), "type", 14);
        setField(term352309, term352309.getClass(), "next", null);
        setField(term352309, term352309.getClass(), "first", null);
        setField(term352309, term352309.getClass(), "last", null);
        setField(term352309, term352309.getClass(), "propListHead", null);
        setIntField(term352309, term352309.getClass(), "sourcePosition", 0);
        setField(term352309, term352309.getClass(), "jsType", null);
        setField(term352309, term352309.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term352035;
        args[1] = term352121;
        args[2] = term352207;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term351949, args);
        assertTrue(recursiveEquals(term351949, term352345));
        assertTrue(recursiveEquals(term352035, term352346));
        assertTrue(recursiveEquals(term352121, term352347));
        assertTrue(recursiveEquals(term352207, term352348));
        assertTrue(recursiveEquals(retValue, term352309));
    }

};


