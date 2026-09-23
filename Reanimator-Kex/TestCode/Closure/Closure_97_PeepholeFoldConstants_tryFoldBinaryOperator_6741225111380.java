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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term471131;
     Object term471217;
     Object term517938;
     Object term517939;
     Object term517879;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term471131 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term471217 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term471303 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term471373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term471303, term471303.getClass(), "next", term471373);
        setField(term471217, term471217.getClass(), "first", term471303);
        setIntField(term471217, term471217.getClass(), "type", 24);
        term517938 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term517938, term517938.getClass(), "currentTraversal", null);
        term517939 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term517940 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term517941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term517939, term517939.getClass(), "functionName", null);
        setBooleanField(term517939, term517939.getClass(), "itsNeedsActivation", false);
        setIntField(term517939, term517939.getClass(), "itsFunctionType", 0);
        setBooleanField(term517939, term517939.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term517939, term517939.getClass(), "encodedSourceStart", 0);
        setIntField(term517939, term517939.getClass(), "encodedSourceEnd", 0);
        setField(term517939, term517939.getClass(), "sourceName", null);
        setIntField(term517939, term517939.getClass(), "baseLineno", 0);
        setIntField(term517939, term517939.getClass(), "endLineno", 0);
        setField(term517939, term517939.getClass(), "functions", null);
        setField(term517939, term517939.getClass(), "regexps", null);
        setField(term517939, term517939.getClass(), "itsVariables", null);
        setField(term517939, term517939.getClass(), "itsConst", null);
        setField(term517939, term517939.getClass(), "itsVariableNames", null);
        setIntField(term517939, term517939.getClass(), "varStart", 0);
        setField(term517939, term517939.getClass(), "compilerData", null);
        setIntField(term517939, term517939.getClass(), "type", 24);
        setField(term517939, term517939.getClass(), "next", null);
        setField(term517940, term517940.getClass(), "functionName", null);
        setBooleanField(term517940, term517940.getClass(), "itsNeedsActivation", false);
        setIntField(term517940, term517940.getClass(), "itsFunctionType", 0);
        setBooleanField(term517940, term517940.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term517940, term517940.getClass(), "encodedSourceStart", 0);
        setIntField(term517940, term517940.getClass(), "encodedSourceEnd", 0);
        setField(term517940, term517940.getClass(), "sourceName", null);
        setIntField(term517940, term517940.getClass(), "baseLineno", 0);
        setIntField(term517940, term517940.getClass(), "endLineno", 0);
        setField(term517940, term517940.getClass(), "functions", null);
        setField(term517940, term517940.getClass(), "regexps", null);
        setField(term517940, term517940.getClass(), "itsVariables", null);
        setField(term517940, term517940.getClass(), "itsConst", null);
        setField(term517940, term517940.getClass(), "itsVariableNames", null);
        setIntField(term517940, term517940.getClass(), "varStart", 0);
        setField(term517940, term517940.getClass(), "compilerData", null);
        setIntField(term517940, term517940.getClass(), "type", 0);
        setIntField(term517941, term517941.getClass(), "type", 0);
        setField(term517941, term517941.getClass(), "next", null);
        setField(term517941, term517941.getClass(), "first", null);
        setField(term517941, term517941.getClass(), "last", null);
        setField(term517941, term517941.getClass(), "propListHead", null);
        setIntField(term517941, term517941.getClass(), "sourcePosition", 0);
        setField(term517941, term517941.getClass(), "jsType", null);
        setField(term517941, term517941.getClass(), "parent", null);
        setField(term517940, term517940.getClass(), "next", term517941);
        setField(term517940, term517940.getClass(), "first", null);
        setField(term517940, term517940.getClass(), "last", null);
        setField(term517940, term517940.getClass(), "propListHead", null);
        setIntField(term517940, term517940.getClass(), "sourcePosition", 0);
        setField(term517940, term517940.getClass(), "jsType", null);
        setField(term517940, term517940.getClass(), "parent", null);
        setField(term517939, term517939.getClass(), "first", term517940);
        setField(term517939, term517939.getClass(), "last", null);
        setField(term517939, term517939.getClass(), "propListHead", null);
        setIntField(term517939, term517939.getClass(), "sourcePosition", 0);
        setField(term517939, term517939.getClass(), "jsType", null);
        setField(term517939, term517939.getClass(), "parent", null);
        term517879 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term517889 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term517899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term517879, term517879.getClass(), "functionName", null);
        setBooleanField(term517879, term517879.getClass(), "itsNeedsActivation", false);
        setIntField(term517879, term517879.getClass(), "itsFunctionType", 0);
        setBooleanField(term517879, term517879.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term517879, term517879.getClass(), "encodedSourceStart", 0);
        setIntField(term517879, term517879.getClass(), "encodedSourceEnd", 0);
        setField(term517879, term517879.getClass(), "sourceName", null);
        setIntField(term517879, term517879.getClass(), "baseLineno", 0);
        setIntField(term517879, term517879.getClass(), "endLineno", 0);
        setField(term517879, term517879.getClass(), "functions", null);
        setField(term517879, term517879.getClass(), "regexps", null);
        setField(term517879, term517879.getClass(), "itsVariables", null);
        setField(term517879, term517879.getClass(), "itsConst", null);
        setField(term517879, term517879.getClass(), "itsVariableNames", null);
        setIntField(term517879, term517879.getClass(), "varStart", 0);
        setField(term517879, term517879.getClass(), "compilerData", null);
        setIntField(term517879, term517879.getClass(), "type", 24);
        setField(term517879, term517879.getClass(), "next", null);
        setField(term517889, term517889.getClass(), "functionName", null);
        setBooleanField(term517889, term517889.getClass(), "itsNeedsActivation", false);
        setIntField(term517889, term517889.getClass(), "itsFunctionType", 0);
        setBooleanField(term517889, term517889.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term517889, term517889.getClass(), "encodedSourceStart", 0);
        setIntField(term517889, term517889.getClass(), "encodedSourceEnd", 0);
        setField(term517889, term517889.getClass(), "sourceName", null);
        setIntField(term517889, term517889.getClass(), "baseLineno", 0);
        setIntField(term517889, term517889.getClass(), "endLineno", 0);
        setField(term517889, term517889.getClass(), "functions", null);
        setField(term517889, term517889.getClass(), "regexps", null);
        setField(term517889, term517889.getClass(), "itsVariables", null);
        setField(term517889, term517889.getClass(), "itsConst", null);
        setField(term517889, term517889.getClass(), "itsVariableNames", null);
        setIntField(term517889, term517889.getClass(), "varStart", 0);
        setField(term517889, term517889.getClass(), "compilerData", null);
        setIntField(term517889, term517889.getClass(), "type", 0);
        setIntField(term517899, term517899.getClass(), "type", 0);
        setField(term517899, term517899.getClass(), "next", null);
        setField(term517899, term517899.getClass(), "first", null);
        setField(term517899, term517899.getClass(), "last", null);
        setField(term517899, term517899.getClass(), "propListHead", null);
        setIntField(term517899, term517899.getClass(), "sourcePosition", 0);
        setField(term517899, term517899.getClass(), "jsType", null);
        setField(term517899, term517899.getClass(), "parent", null);
        setField(term517889, term517889.getClass(), "next", term517899);
        setField(term517889, term517889.getClass(), "first", null);
        setField(term517889, term517889.getClass(), "last", null);
        setField(term517889, term517889.getClass(), "propListHead", null);
        setIntField(term517889, term517889.getClass(), "sourcePosition", 0);
        setField(term517889, term517889.getClass(), "jsType", null);
        setField(term517889, term517889.getClass(), "parent", null);
        setField(term517879, term517879.getClass(), "first", term517889);
        setField(term517879, term517879.getClass(), "last", null);
        setField(term517879, term517879.getClass(), "propListHead", null);
        setIntField(term517879, term517879.getClass(), "sourcePosition", 0);
        setField(term517879, term517879.getClass(), "jsType", null);
        setField(term517879, term517879.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term471217;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term471131, args);
        assertTrue(recursiveEquals(term471131, term517938));
        assertTrue(recursiveEquals(term471217, term517939));
        assertTrue(recursiveEquals(retValue, term517879));
    }

};


