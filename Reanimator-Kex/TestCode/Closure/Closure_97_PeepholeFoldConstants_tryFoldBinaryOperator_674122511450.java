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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103744;
     Object term103830;
     Object term104927;
     Object term104928;
     Object term104839;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103744 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term103830 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term103916 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term104008 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term103916, term103916.getClass(), "next", term104008);
        setIntField(term103916, term103916.getClass(), "type", 0);
        setField(term103830, term103830.getClass(), "first", term103916);
        setIntField(term103830, term103830.getClass(), "type", 101);
        setField(term103830, term103830.getClass(), "parent", null);
        term104927 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term104927, term104927.getClass(), "currentTraversal", null);
        term104928 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term104929 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term104930 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term104928, term104928.getClass(), "functionName", null);
        setBooleanField(term104928, term104928.getClass(), "itsNeedsActivation", false);
        setIntField(term104928, term104928.getClass(), "itsFunctionType", 0);
        setBooleanField(term104928, term104928.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term104928, term104928.getClass(), "encodedSourceStart", 0);
        setIntField(term104928, term104928.getClass(), "encodedSourceEnd", 0);
        setField(term104928, term104928.getClass(), "sourceName", null);
        setIntField(term104928, term104928.getClass(), "baseLineno", 0);
        setIntField(term104928, term104928.getClass(), "endLineno", 0);
        setField(term104928, term104928.getClass(), "functions", null);
        setField(term104928, term104928.getClass(), "regexps", null);
        setField(term104928, term104928.getClass(), "itsVariables", null);
        setField(term104928, term104928.getClass(), "itsConst", null);
        setField(term104928, term104928.getClass(), "itsVariableNames", null);
        setIntField(term104928, term104928.getClass(), "varStart", 0);
        setField(term104928, term104928.getClass(), "compilerData", null);
        setIntField(term104928, term104928.getClass(), "type", 101);
        setField(term104928, term104928.getClass(), "next", null);
        setField(term104929, term104929.getClass(), "functionName", null);
        setBooleanField(term104929, term104929.getClass(), "itsNeedsActivation", false);
        setIntField(term104929, term104929.getClass(), "itsFunctionType", 0);
        setBooleanField(term104929, term104929.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term104929, term104929.getClass(), "encodedSourceStart", 0);
        setIntField(term104929, term104929.getClass(), "encodedSourceEnd", 0);
        setField(term104929, term104929.getClass(), "sourceName", null);
        setIntField(term104929, term104929.getClass(), "baseLineno", 0);
        setIntField(term104929, term104929.getClass(), "endLineno", 0);
        setField(term104929, term104929.getClass(), "functions", null);
        setField(term104929, term104929.getClass(), "regexps", null);
        setField(term104929, term104929.getClass(), "itsVariables", null);
        setField(term104929, term104929.getClass(), "itsConst", null);
        setField(term104929, term104929.getClass(), "itsVariableNames", null);
        setIntField(term104929, term104929.getClass(), "varStart", 0);
        setField(term104929, term104929.getClass(), "compilerData", null);
        setIntField(term104929, term104929.getClass(), "type", 0);
        setDoubleField(term104930, term104930.getClass(), "number", 0.0);
        setIntField(term104930, term104930.getClass(), "type", 0);
        setField(term104930, term104930.getClass(), "next", null);
        setField(term104930, term104930.getClass(), "first", null);
        setField(term104930, term104930.getClass(), "last", null);
        setField(term104930, term104930.getClass(), "propListHead", null);
        setIntField(term104930, term104930.getClass(), "sourcePosition", 0);
        setField(term104930, term104930.getClass(), "jsType", null);
        setField(term104930, term104930.getClass(), "parent", null);
        setField(term104929, term104929.getClass(), "next", term104930);
        setField(term104929, term104929.getClass(), "first", null);
        setField(term104929, term104929.getClass(), "last", null);
        setField(term104929, term104929.getClass(), "propListHead", null);
        setIntField(term104929, term104929.getClass(), "sourcePosition", 0);
        setField(term104929, term104929.getClass(), "jsType", null);
        setField(term104929, term104929.getClass(), "parent", null);
        setField(term104928, term104928.getClass(), "first", term104929);
        setField(term104928, term104928.getClass(), "last", null);
        setField(term104928, term104928.getClass(), "propListHead", null);
        setIntField(term104928, term104928.getClass(), "sourcePosition", 0);
        setField(term104928, term104928.getClass(), "jsType", null);
        setField(term104928, term104928.getClass(), "parent", null);
        term104839 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term104849 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term104859 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term104839, term104839.getClass(), "functionName", null);
        setBooleanField(term104839, term104839.getClass(), "itsNeedsActivation", false);
        setIntField(term104839, term104839.getClass(), "itsFunctionType", 0);
        setBooleanField(term104839, term104839.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term104839, term104839.getClass(), "encodedSourceStart", 0);
        setIntField(term104839, term104839.getClass(), "encodedSourceEnd", 0);
        setField(term104839, term104839.getClass(), "sourceName", null);
        setIntField(term104839, term104839.getClass(), "baseLineno", 0);
        setIntField(term104839, term104839.getClass(), "endLineno", 0);
        setField(term104839, term104839.getClass(), "functions", null);
        setField(term104839, term104839.getClass(), "regexps", null);
        setField(term104839, term104839.getClass(), "itsVariables", null);
        setField(term104839, term104839.getClass(), "itsConst", null);
        setField(term104839, term104839.getClass(), "itsVariableNames", null);
        setIntField(term104839, term104839.getClass(), "varStart", 0);
        setField(term104839, term104839.getClass(), "compilerData", null);
        setIntField(term104839, term104839.getClass(), "type", 101);
        setField(term104839, term104839.getClass(), "next", null);
        setField(term104849, term104849.getClass(), "functionName", null);
        setBooleanField(term104849, term104849.getClass(), "itsNeedsActivation", false);
        setIntField(term104849, term104849.getClass(), "itsFunctionType", 0);
        setBooleanField(term104849, term104849.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term104849, term104849.getClass(), "encodedSourceStart", 0);
        setIntField(term104849, term104849.getClass(), "encodedSourceEnd", 0);
        setField(term104849, term104849.getClass(), "sourceName", null);
        setIntField(term104849, term104849.getClass(), "baseLineno", 0);
        setIntField(term104849, term104849.getClass(), "endLineno", 0);
        setField(term104849, term104849.getClass(), "functions", null);
        setField(term104849, term104849.getClass(), "regexps", null);
        setField(term104849, term104849.getClass(), "itsVariables", null);
        setField(term104849, term104849.getClass(), "itsConst", null);
        setField(term104849, term104849.getClass(), "itsVariableNames", null);
        setIntField(term104849, term104849.getClass(), "varStart", 0);
        setField(term104849, term104849.getClass(), "compilerData", null);
        setIntField(term104849, term104849.getClass(), "type", 0);
        setDoubleField(term104859, term104859.getClass(), "number", 0.0);
        setIntField(term104859, term104859.getClass(), "type", 0);
        setField(term104859, term104859.getClass(), "next", null);
        setField(term104859, term104859.getClass(), "first", null);
        setField(term104859, term104859.getClass(), "last", null);
        setField(term104859, term104859.getClass(), "propListHead", null);
        setIntField(term104859, term104859.getClass(), "sourcePosition", 0);
        setField(term104859, term104859.getClass(), "jsType", null);
        setField(term104859, term104859.getClass(), "parent", null);
        setField(term104849, term104849.getClass(), "next", term104859);
        setField(term104849, term104849.getClass(), "first", null);
        setField(term104849, term104849.getClass(), "last", null);
        setField(term104849, term104849.getClass(), "propListHead", null);
        setIntField(term104849, term104849.getClass(), "sourcePosition", 0);
        setField(term104849, term104849.getClass(), "jsType", null);
        setField(term104849, term104849.getClass(), "parent", null);
        setField(term104839, term104839.getClass(), "first", term104849);
        setField(term104839, term104839.getClass(), "last", null);
        setField(term104839, term104839.getClass(), "propListHead", null);
        setIntField(term104839, term104839.getClass(), "sourcePosition", 0);
        setField(term104839, term104839.getClass(), "jsType", null);
        setField(term104839, term104839.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term103830;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term103744, args);
        assertTrue(recursiveEquals(term103744, term104927));
        assertTrue(recursiveEquals(term103830, term104928));
        assertTrue(recursiveEquals(retValue, term104839));
    }

};


