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

public class PeepholeFoldConstants_tryFoldComparison_8484431791597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term404754;
     Object term404840;
     Object term404926;
     Object term405012;
     Object term405466;
     Object term405467;
     Object term405468;
     Object term405469;
     Object term405430;

    public PeepholeFoldConstants_tryFoldComparison_8484431791597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term404754 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term404840 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term404840, term404840.getClass(), "type", 14);
        term404926 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term404926, term404926.getClass(), "type", 14);
        term405012 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term405466 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term405466, term405466.getClass(), "currentTraversal", null);
        term405467 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term405467, term405467.getClass(), "functionName", null);
        setBooleanField(term405467, term405467.getClass(), "itsNeedsActivation", false);
        setIntField(term405467, term405467.getClass(), "itsFunctionType", 0);
        setBooleanField(term405467, term405467.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term405467, term405467.getClass(), "encodedSourceStart", 0);
        setIntField(term405467, term405467.getClass(), "encodedSourceEnd", 0);
        setField(term405467, term405467.getClass(), "sourceName", null);
        setIntField(term405467, term405467.getClass(), "baseLineno", 0);
        setIntField(term405467, term405467.getClass(), "endLineno", 0);
        setField(term405467, term405467.getClass(), "functions", null);
        setField(term405467, term405467.getClass(), "regexps", null);
        setField(term405467, term405467.getClass(), "itsVariables", null);
        setField(term405467, term405467.getClass(), "itsConst", null);
        setField(term405467, term405467.getClass(), "itsVariableNames", null);
        setIntField(term405467, term405467.getClass(), "varStart", 0);
        setField(term405467, term405467.getClass(), "compilerData", null);
        setIntField(term405467, term405467.getClass(), "type", 14);
        setField(term405467, term405467.getClass(), "next", null);
        setField(term405467, term405467.getClass(), "first", null);
        setField(term405467, term405467.getClass(), "last", null);
        setField(term405467, term405467.getClass(), "propListHead", null);
        setIntField(term405467, term405467.getClass(), "sourcePosition", 0);
        setField(term405467, term405467.getClass(), "jsType", null);
        setField(term405467, term405467.getClass(), "parent", null);
        term405468 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term405468, term405468.getClass(), "functionName", null);
        setBooleanField(term405468, term405468.getClass(), "itsNeedsActivation", false);
        setIntField(term405468, term405468.getClass(), "itsFunctionType", 0);
        setBooleanField(term405468, term405468.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term405468, term405468.getClass(), "encodedSourceStart", 0);
        setIntField(term405468, term405468.getClass(), "encodedSourceEnd", 0);
        setField(term405468, term405468.getClass(), "sourceName", null);
        setIntField(term405468, term405468.getClass(), "baseLineno", 0);
        setIntField(term405468, term405468.getClass(), "endLineno", 0);
        setField(term405468, term405468.getClass(), "functions", null);
        setField(term405468, term405468.getClass(), "regexps", null);
        setField(term405468, term405468.getClass(), "itsVariables", null);
        setField(term405468, term405468.getClass(), "itsConst", null);
        setField(term405468, term405468.getClass(), "itsVariableNames", null);
        setIntField(term405468, term405468.getClass(), "varStart", 0);
        setField(term405468, term405468.getClass(), "compilerData", null);
        setIntField(term405468, term405468.getClass(), "type", 14);
        setField(term405468, term405468.getClass(), "next", null);
        setField(term405468, term405468.getClass(), "first", null);
        setField(term405468, term405468.getClass(), "last", null);
        setField(term405468, term405468.getClass(), "propListHead", null);
        setIntField(term405468, term405468.getClass(), "sourcePosition", 0);
        setField(term405468, term405468.getClass(), "jsType", null);
        setField(term405468, term405468.getClass(), "parent", null);
        term405469 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term405469, term405469.getClass(), "functionName", null);
        setBooleanField(term405469, term405469.getClass(), "itsNeedsActivation", false);
        setIntField(term405469, term405469.getClass(), "itsFunctionType", 0);
        setBooleanField(term405469, term405469.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term405469, term405469.getClass(), "encodedSourceStart", 0);
        setIntField(term405469, term405469.getClass(), "encodedSourceEnd", 0);
        setField(term405469, term405469.getClass(), "sourceName", null);
        setIntField(term405469, term405469.getClass(), "baseLineno", 0);
        setIntField(term405469, term405469.getClass(), "endLineno", 0);
        setField(term405469, term405469.getClass(), "functions", null);
        setField(term405469, term405469.getClass(), "regexps", null);
        setField(term405469, term405469.getClass(), "itsVariables", null);
        setField(term405469, term405469.getClass(), "itsConst", null);
        setField(term405469, term405469.getClass(), "itsVariableNames", null);
        setIntField(term405469, term405469.getClass(), "varStart", 0);
        setField(term405469, term405469.getClass(), "compilerData", null);
        setIntField(term405469, term405469.getClass(), "type", 0);
        setField(term405469, term405469.getClass(), "next", null);
        setField(term405469, term405469.getClass(), "first", null);
        setField(term405469, term405469.getClass(), "last", null);
        setField(term405469, term405469.getClass(), "propListHead", null);
        setIntField(term405469, term405469.getClass(), "sourcePosition", 0);
        setField(term405469, term405469.getClass(), "jsType", null);
        setField(term405469, term405469.getClass(), "parent", null);
        term405430 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term405430, term405430.getClass(), "functionName", null);
        setBooleanField(term405430, term405430.getClass(), "itsNeedsActivation", false);
        setIntField(term405430, term405430.getClass(), "itsFunctionType", 0);
        setBooleanField(term405430, term405430.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term405430, term405430.getClass(), "encodedSourceStart", 0);
        setIntField(term405430, term405430.getClass(), "encodedSourceEnd", 0);
        setField(term405430, term405430.getClass(), "sourceName", null);
        setIntField(term405430, term405430.getClass(), "baseLineno", 0);
        setIntField(term405430, term405430.getClass(), "endLineno", 0);
        setField(term405430, term405430.getClass(), "functions", null);
        setField(term405430, term405430.getClass(), "regexps", null);
        setField(term405430, term405430.getClass(), "itsVariables", null);
        setField(term405430, term405430.getClass(), "itsConst", null);
        setField(term405430, term405430.getClass(), "itsVariableNames", null);
        setIntField(term405430, term405430.getClass(), "varStart", 0);
        setField(term405430, term405430.getClass(), "compilerData", null);
        setIntField(term405430, term405430.getClass(), "type", 14);
        setField(term405430, term405430.getClass(), "next", null);
        setField(term405430, term405430.getClass(), "first", null);
        setField(term405430, term405430.getClass(), "last", null);
        setField(term405430, term405430.getClass(), "propListHead", null);
        setIntField(term405430, term405430.getClass(), "sourcePosition", 0);
        setField(term405430, term405430.getClass(), "jsType", null);
        setField(term405430, term405430.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term404840;
        args[1] = term404926;
        args[2] = term405012;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term404754, args);
        assertTrue(recursiveEquals(term404754, term405466));
        assertTrue(recursiveEquals(term404840, term405467));
        assertTrue(recursiveEquals(term404926, term405468));
        assertTrue(recursiveEquals(term405012, term405469));
        assertTrue(recursiveEquals(retValue, term405430));
    }

};


