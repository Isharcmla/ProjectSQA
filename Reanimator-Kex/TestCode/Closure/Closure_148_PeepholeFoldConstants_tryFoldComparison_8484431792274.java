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

public class PeepholeFoldConstants_tryFoldComparison_8484431792274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term625748;
     Object term625834;
     Object term625920;
     Object term626012;
     Object term626064;
     Object term626065;
     Object term626066;
     Object term626067;
     Object term626030;

    public PeepholeFoldConstants_tryFoldComparison_8484431792274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term625748 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term625834 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term625834, term625834.getClass(), "type", 14);
        term625920 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term625920, term625920.getClass(), "type", 42);
        term626012 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term626012, term626012.getClass(), "type", 14);
        term626064 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term626064, term626064.getClass(), "currentTraversal", null);
        term626065 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term626065, term626065.getClass(), "functionName", null);
        setBooleanField(term626065, term626065.getClass(), "itsNeedsActivation", false);
        setIntField(term626065, term626065.getClass(), "itsFunctionType", 0);
        setBooleanField(term626065, term626065.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term626065, term626065.getClass(), "encodedSourceStart", 0);
        setIntField(term626065, term626065.getClass(), "encodedSourceEnd", 0);
        setField(term626065, term626065.getClass(), "sourceName", null);
        setIntField(term626065, term626065.getClass(), "baseLineno", 0);
        setIntField(term626065, term626065.getClass(), "endLineno", 0);
        setField(term626065, term626065.getClass(), "functions", null);
        setField(term626065, term626065.getClass(), "regexps", null);
        setField(term626065, term626065.getClass(), "itsVariables", null);
        setField(term626065, term626065.getClass(), "itsConst", null);
        setField(term626065, term626065.getClass(), "itsVariableNames", null);
        setIntField(term626065, term626065.getClass(), "varStart", 0);
        setField(term626065, term626065.getClass(), "compilerData", null);
        setIntField(term626065, term626065.getClass(), "type", 42);
        setField(term626065, term626065.getClass(), "next", null);
        setField(term626065, term626065.getClass(), "first", null);
        setField(term626065, term626065.getClass(), "last", null);
        setField(term626065, term626065.getClass(), "propListHead", null);
        setIntField(term626065, term626065.getClass(), "sourcePosition", 0);
        setField(term626065, term626065.getClass(), "jsType", null);
        setField(term626065, term626065.getClass(), "parent", null);
        term626066 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term626066, term626066.getClass(), "functionName", null);
        setBooleanField(term626066, term626066.getClass(), "itsNeedsActivation", false);
        setIntField(term626066, term626066.getClass(), "itsFunctionType", 0);
        setBooleanField(term626066, term626066.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term626066, term626066.getClass(), "encodedSourceStart", 0);
        setIntField(term626066, term626066.getClass(), "encodedSourceEnd", 0);
        setField(term626066, term626066.getClass(), "sourceName", null);
        setIntField(term626066, term626066.getClass(), "baseLineno", 0);
        setIntField(term626066, term626066.getClass(), "endLineno", 0);
        setField(term626066, term626066.getClass(), "functions", null);
        setField(term626066, term626066.getClass(), "regexps", null);
        setField(term626066, term626066.getClass(), "itsVariables", null);
        setField(term626066, term626066.getClass(), "itsConst", null);
        setField(term626066, term626066.getClass(), "itsVariableNames", null);
        setIntField(term626066, term626066.getClass(), "varStart", 0);
        setField(term626066, term626066.getClass(), "compilerData", null);
        setIntField(term626066, term626066.getClass(), "type", 14);
        setField(term626066, term626066.getClass(), "next", null);
        setField(term626066, term626066.getClass(), "first", null);
        setField(term626066, term626066.getClass(), "last", null);
        setField(term626066, term626066.getClass(), "propListHead", null);
        setIntField(term626066, term626066.getClass(), "sourcePosition", 0);
        setField(term626066, term626066.getClass(), "jsType", null);
        setField(term626066, term626066.getClass(), "parent", null);
        term626067 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term626067, term626067.getClass(), "number", 0.0);
        setIntField(term626067, term626067.getClass(), "type", 14);
        setField(term626067, term626067.getClass(), "next", null);
        setField(term626067, term626067.getClass(), "first", null);
        setField(term626067, term626067.getClass(), "last", null);
        setField(term626067, term626067.getClass(), "propListHead", null);
        setIntField(term626067, term626067.getClass(), "sourcePosition", 0);
        setField(term626067, term626067.getClass(), "jsType", null);
        setField(term626067, term626067.getClass(), "parent", null);
        term626030 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term626030, term626030.getClass(), "functionName", null);
        setBooleanField(term626030, term626030.getClass(), "itsNeedsActivation", false);
        setIntField(term626030, term626030.getClass(), "itsFunctionType", 0);
        setBooleanField(term626030, term626030.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term626030, term626030.getClass(), "encodedSourceStart", 0);
        setIntField(term626030, term626030.getClass(), "encodedSourceEnd", 0);
        setField(term626030, term626030.getClass(), "sourceName", null);
        setIntField(term626030, term626030.getClass(), "baseLineno", 0);
        setIntField(term626030, term626030.getClass(), "endLineno", 0);
        setField(term626030, term626030.getClass(), "functions", null);
        setField(term626030, term626030.getClass(), "regexps", null);
        setField(term626030, term626030.getClass(), "itsVariables", null);
        setField(term626030, term626030.getClass(), "itsConst", null);
        setField(term626030, term626030.getClass(), "itsVariableNames", null);
        setIntField(term626030, term626030.getClass(), "varStart", 0);
        setField(term626030, term626030.getClass(), "compilerData", null);
        setIntField(term626030, term626030.getClass(), "type", 14);
        setField(term626030, term626030.getClass(), "next", null);
        setField(term626030, term626030.getClass(), "first", null);
        setField(term626030, term626030.getClass(), "last", null);
        setField(term626030, term626030.getClass(), "propListHead", null);
        setIntField(term626030, term626030.getClass(), "sourcePosition", 0);
        setField(term626030, term626030.getClass(), "jsType", null);
        setField(term626030, term626030.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term625834;
        args[1] = term625920;
        args[2] = term626012;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term625748, args);
        assertTrue(recursiveEquals(term625748, term626064));
        assertTrue(recursiveEquals(term625834, term626065));
        assertTrue(recursiveEquals(term625920, term626066));
        assertTrue(recursiveEquals(term626012, term626067));
        assertTrue(recursiveEquals(retValue, term626030));
    }

};


