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

public class PeepholeFoldConstants_tryFoldComparison_8484431791221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289946;
     Object term290032;
     Object term290118;
     Object term290204;
     Object term290668;
     Object term290669;
     Object term290670;
     Object term290671;
     Object term290629;

    public PeepholeFoldConstants_tryFoldComparison_8484431791221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289946 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term290032 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term290032, term290032.getClass(), "type", 16);
        term290118 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term290118, term290118.getClass(), "type", 42);
        term290204 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term290204, term290204.getClass(), "type", 16);
        term290668 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term290668, term290668.getClass(), "currentTraversal", null);
        term290669 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term290669, term290669.getClass(), "functionName", null);
        setBooleanField(term290669, term290669.getClass(), "itsNeedsActivation", false);
        setIntField(term290669, term290669.getClass(), "itsFunctionType", 0);
        setBooleanField(term290669, term290669.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term290669, term290669.getClass(), "encodedSourceStart", 0);
        setIntField(term290669, term290669.getClass(), "encodedSourceEnd", 0);
        setField(term290669, term290669.getClass(), "sourceName", null);
        setIntField(term290669, term290669.getClass(), "baseLineno", 0);
        setIntField(term290669, term290669.getClass(), "endLineno", 0);
        setField(term290669, term290669.getClass(), "functions", null);
        setField(term290669, term290669.getClass(), "regexps", null);
        setField(term290669, term290669.getClass(), "itsVariables", null);
        setField(term290669, term290669.getClass(), "itsConst", null);
        setField(term290669, term290669.getClass(), "itsVariableNames", null);
        setIntField(term290669, term290669.getClass(), "varStart", 0);
        setField(term290669, term290669.getClass(), "compilerData", null);
        setIntField(term290669, term290669.getClass(), "type", 42);
        setField(term290669, term290669.getClass(), "next", null);
        setField(term290669, term290669.getClass(), "first", null);
        setField(term290669, term290669.getClass(), "last", null);
        setField(term290669, term290669.getClass(), "propListHead", null);
        setIntField(term290669, term290669.getClass(), "sourcePosition", 0);
        setField(term290669, term290669.getClass(), "jsType", null);
        setField(term290669, term290669.getClass(), "parent", null);
        term290670 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term290670, term290670.getClass(), "functionName", null);
        setBooleanField(term290670, term290670.getClass(), "itsNeedsActivation", false);
        setIntField(term290670, term290670.getClass(), "itsFunctionType", 0);
        setBooleanField(term290670, term290670.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term290670, term290670.getClass(), "encodedSourceStart", 0);
        setIntField(term290670, term290670.getClass(), "encodedSourceEnd", 0);
        setField(term290670, term290670.getClass(), "sourceName", null);
        setIntField(term290670, term290670.getClass(), "baseLineno", 0);
        setIntField(term290670, term290670.getClass(), "endLineno", 0);
        setField(term290670, term290670.getClass(), "functions", null);
        setField(term290670, term290670.getClass(), "regexps", null);
        setField(term290670, term290670.getClass(), "itsVariables", null);
        setField(term290670, term290670.getClass(), "itsConst", null);
        setField(term290670, term290670.getClass(), "itsVariableNames", null);
        setIntField(term290670, term290670.getClass(), "varStart", 0);
        setField(term290670, term290670.getClass(), "compilerData", null);
        setIntField(term290670, term290670.getClass(), "type", 16);
        setField(term290670, term290670.getClass(), "next", null);
        setField(term290670, term290670.getClass(), "first", null);
        setField(term290670, term290670.getClass(), "last", null);
        setField(term290670, term290670.getClass(), "propListHead", null);
        setIntField(term290670, term290670.getClass(), "sourcePosition", 0);
        setField(term290670, term290670.getClass(), "jsType", null);
        setField(term290670, term290670.getClass(), "parent", null);
        term290671 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term290671, term290671.getClass(), "functionName", null);
        setBooleanField(term290671, term290671.getClass(), "itsNeedsActivation", false);
        setIntField(term290671, term290671.getClass(), "itsFunctionType", 0);
        setBooleanField(term290671, term290671.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term290671, term290671.getClass(), "encodedSourceStart", 0);
        setIntField(term290671, term290671.getClass(), "encodedSourceEnd", 0);
        setField(term290671, term290671.getClass(), "sourceName", null);
        setIntField(term290671, term290671.getClass(), "baseLineno", 0);
        setIntField(term290671, term290671.getClass(), "endLineno", 0);
        setField(term290671, term290671.getClass(), "functions", null);
        setField(term290671, term290671.getClass(), "regexps", null);
        setField(term290671, term290671.getClass(), "itsVariables", null);
        setField(term290671, term290671.getClass(), "itsConst", null);
        setField(term290671, term290671.getClass(), "itsVariableNames", null);
        setIntField(term290671, term290671.getClass(), "varStart", 0);
        setField(term290671, term290671.getClass(), "compilerData", null);
        setIntField(term290671, term290671.getClass(), "type", 16);
        setField(term290671, term290671.getClass(), "next", null);
        setField(term290671, term290671.getClass(), "first", null);
        setField(term290671, term290671.getClass(), "last", null);
        setField(term290671, term290671.getClass(), "propListHead", null);
        setIntField(term290671, term290671.getClass(), "sourcePosition", 0);
        setField(term290671, term290671.getClass(), "jsType", null);
        setField(term290671, term290671.getClass(), "parent", null);
        term290629 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term290629, term290629.getClass(), "functionName", null);
        setBooleanField(term290629, term290629.getClass(), "itsNeedsActivation", false);
        setIntField(term290629, term290629.getClass(), "itsFunctionType", 0);
        setBooleanField(term290629, term290629.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term290629, term290629.getClass(), "encodedSourceStart", 0);
        setIntField(term290629, term290629.getClass(), "encodedSourceEnd", 0);
        setField(term290629, term290629.getClass(), "sourceName", null);
        setIntField(term290629, term290629.getClass(), "baseLineno", 0);
        setIntField(term290629, term290629.getClass(), "endLineno", 0);
        setField(term290629, term290629.getClass(), "functions", null);
        setField(term290629, term290629.getClass(), "regexps", null);
        setField(term290629, term290629.getClass(), "itsVariables", null);
        setField(term290629, term290629.getClass(), "itsConst", null);
        setField(term290629, term290629.getClass(), "itsVariableNames", null);
        setIntField(term290629, term290629.getClass(), "varStart", 0);
        setField(term290629, term290629.getClass(), "compilerData", null);
        setIntField(term290629, term290629.getClass(), "type", 16);
        setField(term290629, term290629.getClass(), "next", null);
        setField(term290629, term290629.getClass(), "first", null);
        setField(term290629, term290629.getClass(), "last", null);
        setField(term290629, term290629.getClass(), "propListHead", null);
        setIntField(term290629, term290629.getClass(), "sourcePosition", 0);
        setField(term290629, term290629.getClass(), "jsType", null);
        setField(term290629, term290629.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term290032;
        args[1] = term290118;
        args[2] = term290204;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term289946, args);
        assertTrue(recursiveEquals(term289946, term290668));
        assertTrue(recursiveEquals(term290032, term290669));
        assertTrue(recursiveEquals(term290118, term290670));
        assertTrue(recursiveEquals(term290204, term290671));
        assertTrue(recursiveEquals(retValue, term290629));
    }

};


