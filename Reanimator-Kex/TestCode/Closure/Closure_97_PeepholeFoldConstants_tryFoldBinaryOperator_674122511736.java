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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188243;
     Object term188335;
     Object term188488;
     Object term188489;
     Object term188437;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188243 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term188335 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term188421 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term188335, term188335.getClass(), "first", term188335);
        setField(term188335, term188335.getClass(), "next", term188421);
        setIntField(term188335, term188335.getClass(), "type", 33);
        term188488 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term188488, term188488.getClass(), "currentTraversal", null);
        term188489 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term188490 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term188489, term188489.getClass(), "number", 0.0);
        setIntField(term188489, term188489.getClass(), "type", 33);
        setField(term188490, term188490.getClass(), "functionName", null);
        setBooleanField(term188490, term188490.getClass(), "itsNeedsActivation", false);
        setIntField(term188490, term188490.getClass(), "itsFunctionType", 0);
        setBooleanField(term188490, term188490.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term188490, term188490.getClass(), "encodedSourceStart", 0);
        setIntField(term188490, term188490.getClass(), "encodedSourceEnd", 0);
        setField(term188490, term188490.getClass(), "sourceName", null);
        setIntField(term188490, term188490.getClass(), "baseLineno", 0);
        setIntField(term188490, term188490.getClass(), "endLineno", 0);
        setField(term188490, term188490.getClass(), "functions", null);
        setField(term188490, term188490.getClass(), "regexps", null);
        setField(term188490, term188490.getClass(), "itsVariables", null);
        setField(term188490, term188490.getClass(), "itsConst", null);
        setField(term188490, term188490.getClass(), "itsVariableNames", null);
        setIntField(term188490, term188490.getClass(), "varStart", 0);
        setField(term188490, term188490.getClass(), "compilerData", null);
        setIntField(term188490, term188490.getClass(), "type", 0);
        setField(term188490, term188490.getClass(), "next", null);
        setField(term188490, term188490.getClass(), "first", null);
        setField(term188490, term188490.getClass(), "last", null);
        setField(term188490, term188490.getClass(), "propListHead", null);
        setIntField(term188490, term188490.getClass(), "sourcePosition", 0);
        setField(term188490, term188490.getClass(), "jsType", null);
        setField(term188490, term188490.getClass(), "parent", null);
        setField(term188489, term188489.getClass(), "next", term188490);
        setField(term188489, term188489.getClass(), "first", term188489);
        setField(term188489, term188489.getClass(), "last", null);
        setField(term188489, term188489.getClass(), "propListHead", null);
        setIntField(term188489, term188489.getClass(), "sourcePosition", 0);
        setField(term188489, term188489.getClass(), "jsType", null);
        setField(term188489, term188489.getClass(), "parent", null);
        term188437 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term188440 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term188437, term188437.getClass(), "number", 0.0);
        setIntField(term188437, term188437.getClass(), "type", 33);
        setField(term188440, term188440.getClass(), "functionName", null);
        setBooleanField(term188440, term188440.getClass(), "itsNeedsActivation", false);
        setIntField(term188440, term188440.getClass(), "itsFunctionType", 0);
        setBooleanField(term188440, term188440.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term188440, term188440.getClass(), "encodedSourceStart", 0);
        setIntField(term188440, term188440.getClass(), "encodedSourceEnd", 0);
        setField(term188440, term188440.getClass(), "sourceName", null);
        setIntField(term188440, term188440.getClass(), "baseLineno", 0);
        setIntField(term188440, term188440.getClass(), "endLineno", 0);
        setField(term188440, term188440.getClass(), "functions", null);
        setField(term188440, term188440.getClass(), "regexps", null);
        setField(term188440, term188440.getClass(), "itsVariables", null);
        setField(term188440, term188440.getClass(), "itsConst", null);
        setField(term188440, term188440.getClass(), "itsVariableNames", null);
        setIntField(term188440, term188440.getClass(), "varStart", 0);
        setField(term188440, term188440.getClass(), "compilerData", null);
        setIntField(term188440, term188440.getClass(), "type", 0);
        setField(term188440, term188440.getClass(), "next", null);
        setField(term188440, term188440.getClass(), "first", null);
        setField(term188440, term188440.getClass(), "last", null);
        setField(term188440, term188440.getClass(), "propListHead", null);
        setIntField(term188440, term188440.getClass(), "sourcePosition", 0);
        setField(term188440, term188440.getClass(), "jsType", null);
        setField(term188440, term188440.getClass(), "parent", null);
        setField(term188437, term188437.getClass(), "next", term188440);
        setField(term188437, term188437.getClass(), "first", term188437);
        setField(term188437, term188437.getClass(), "last", null);
        setField(term188437, term188437.getClass(), "propListHead", null);
        setIntField(term188437, term188437.getClass(), "sourcePosition", 0);
        setField(term188437, term188437.getClass(), "jsType", null);
        setField(term188437, term188437.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term188335;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term188243, args);
        assertTrue(recursiveEquals(term188243, term188488));
        assertTrue(recursiveEquals(term188335, term188489));
        assertTrue(recursiveEquals(retValue, term188437));
    }

};


