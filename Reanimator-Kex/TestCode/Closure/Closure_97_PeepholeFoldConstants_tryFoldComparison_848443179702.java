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

public class PeepholeFoldConstants_tryFoldComparison_848443179702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180603;
     Object term180689;
     Object term180775;
     Object term180861;
     Object term180917;
     Object term180918;
     Object term180919;
     Object term180920;
     Object term180879;

    public PeepholeFoldConstants_tryFoldComparison_848443179702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180603 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term180689 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term180689, term180689.getClass(), "type", 14);
        term180775 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term180775, term180775.getClass(), "type", 42);
        term180861 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term180861, term180861.getClass(), "type", 42);
        term180917 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term180917, term180917.getClass(), "currentTraversal", null);
        term180918 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term180918, term180918.getClass(), "functionName", null);
        setBooleanField(term180918, term180918.getClass(), "itsNeedsActivation", false);
        setIntField(term180918, term180918.getClass(), "itsFunctionType", 0);
        setBooleanField(term180918, term180918.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term180918, term180918.getClass(), "encodedSourceStart", 0);
        setIntField(term180918, term180918.getClass(), "encodedSourceEnd", 0);
        setField(term180918, term180918.getClass(), "sourceName", null);
        setIntField(term180918, term180918.getClass(), "baseLineno", 0);
        setIntField(term180918, term180918.getClass(), "endLineno", 0);
        setField(term180918, term180918.getClass(), "functions", null);
        setField(term180918, term180918.getClass(), "regexps", null);
        setField(term180918, term180918.getClass(), "itsVariables", null);
        setField(term180918, term180918.getClass(), "itsConst", null);
        setField(term180918, term180918.getClass(), "itsVariableNames", null);
        setIntField(term180918, term180918.getClass(), "varStart", 0);
        setField(term180918, term180918.getClass(), "compilerData", null);
        setIntField(term180918, term180918.getClass(), "type", 42);
        setField(term180918, term180918.getClass(), "next", null);
        setField(term180918, term180918.getClass(), "first", null);
        setField(term180918, term180918.getClass(), "last", null);
        setField(term180918, term180918.getClass(), "propListHead", null);
        setIntField(term180918, term180918.getClass(), "sourcePosition", 0);
        setField(term180918, term180918.getClass(), "jsType", null);
        setField(term180918, term180918.getClass(), "parent", null);
        term180919 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term180919, term180919.getClass(), "functionName", null);
        setBooleanField(term180919, term180919.getClass(), "itsNeedsActivation", false);
        setIntField(term180919, term180919.getClass(), "itsFunctionType", 0);
        setBooleanField(term180919, term180919.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term180919, term180919.getClass(), "encodedSourceStart", 0);
        setIntField(term180919, term180919.getClass(), "encodedSourceEnd", 0);
        setField(term180919, term180919.getClass(), "sourceName", null);
        setIntField(term180919, term180919.getClass(), "baseLineno", 0);
        setIntField(term180919, term180919.getClass(), "endLineno", 0);
        setField(term180919, term180919.getClass(), "functions", null);
        setField(term180919, term180919.getClass(), "regexps", null);
        setField(term180919, term180919.getClass(), "itsVariables", null);
        setField(term180919, term180919.getClass(), "itsConst", null);
        setField(term180919, term180919.getClass(), "itsVariableNames", null);
        setIntField(term180919, term180919.getClass(), "varStart", 0);
        setField(term180919, term180919.getClass(), "compilerData", null);
        setIntField(term180919, term180919.getClass(), "type", 14);
        setField(term180919, term180919.getClass(), "next", null);
        setField(term180919, term180919.getClass(), "first", null);
        setField(term180919, term180919.getClass(), "last", null);
        setField(term180919, term180919.getClass(), "propListHead", null);
        setIntField(term180919, term180919.getClass(), "sourcePosition", 0);
        setField(term180919, term180919.getClass(), "jsType", null);
        setField(term180919, term180919.getClass(), "parent", null);
        term180920 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term180920, term180920.getClass(), "functionName", null);
        setBooleanField(term180920, term180920.getClass(), "itsNeedsActivation", false);
        setIntField(term180920, term180920.getClass(), "itsFunctionType", 0);
        setBooleanField(term180920, term180920.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term180920, term180920.getClass(), "encodedSourceStart", 0);
        setIntField(term180920, term180920.getClass(), "encodedSourceEnd", 0);
        setField(term180920, term180920.getClass(), "sourceName", null);
        setIntField(term180920, term180920.getClass(), "baseLineno", 0);
        setIntField(term180920, term180920.getClass(), "endLineno", 0);
        setField(term180920, term180920.getClass(), "functions", null);
        setField(term180920, term180920.getClass(), "regexps", null);
        setField(term180920, term180920.getClass(), "itsVariables", null);
        setField(term180920, term180920.getClass(), "itsConst", null);
        setField(term180920, term180920.getClass(), "itsVariableNames", null);
        setIntField(term180920, term180920.getClass(), "varStart", 0);
        setField(term180920, term180920.getClass(), "compilerData", null);
        setIntField(term180920, term180920.getClass(), "type", 42);
        setField(term180920, term180920.getClass(), "next", null);
        setField(term180920, term180920.getClass(), "first", null);
        setField(term180920, term180920.getClass(), "last", null);
        setField(term180920, term180920.getClass(), "propListHead", null);
        setIntField(term180920, term180920.getClass(), "sourcePosition", 0);
        setField(term180920, term180920.getClass(), "jsType", null);
        setField(term180920, term180920.getClass(), "parent", null);
        term180879 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term180879, term180879.getClass(), "functionName", null);
        setBooleanField(term180879, term180879.getClass(), "itsNeedsActivation", false);
        setIntField(term180879, term180879.getClass(), "itsFunctionType", 0);
        setBooleanField(term180879, term180879.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term180879, term180879.getClass(), "encodedSourceStart", 0);
        setIntField(term180879, term180879.getClass(), "encodedSourceEnd", 0);
        setField(term180879, term180879.getClass(), "sourceName", null);
        setIntField(term180879, term180879.getClass(), "baseLineno", 0);
        setIntField(term180879, term180879.getClass(), "endLineno", 0);
        setField(term180879, term180879.getClass(), "functions", null);
        setField(term180879, term180879.getClass(), "regexps", null);
        setField(term180879, term180879.getClass(), "itsVariables", null);
        setField(term180879, term180879.getClass(), "itsConst", null);
        setField(term180879, term180879.getClass(), "itsVariableNames", null);
        setIntField(term180879, term180879.getClass(), "varStart", 0);
        setField(term180879, term180879.getClass(), "compilerData", null);
        setIntField(term180879, term180879.getClass(), "type", 14);
        setField(term180879, term180879.getClass(), "next", null);
        setField(term180879, term180879.getClass(), "first", null);
        setField(term180879, term180879.getClass(), "last", null);
        setField(term180879, term180879.getClass(), "propListHead", null);
        setIntField(term180879, term180879.getClass(), "sourcePosition", 0);
        setField(term180879, term180879.getClass(), "jsType", null);
        setField(term180879, term180879.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term180689;
        args[1] = term180775;
        args[2] = term180861;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term180603, args);
        assertTrue(recursiveEquals(term180603, term180917));
        assertTrue(recursiveEquals(term180689, term180918));
        assertTrue(recursiveEquals(term180775, term180919));
        assertTrue(recursiveEquals(term180861, term180920));
        assertTrue(recursiveEquals(retValue, term180879));
    }

};


