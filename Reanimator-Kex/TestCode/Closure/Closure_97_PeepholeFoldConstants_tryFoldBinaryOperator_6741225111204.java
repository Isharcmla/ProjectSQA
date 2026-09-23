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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term367170;
     Object term367256;
     Object term367512;
     Object term367513;
     Object term367427;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term367170 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term367256 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term367342 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term367412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term367342, term367342.getClass(), "next", term367412);
        setField(term367256, term367256.getClass(), "first", term367342);
        setIntField(term367256, term367256.getClass(), "type", 101);
        term367512 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term367512, term367512.getClass(), "currentTraversal", null);
        term367513 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term367514 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term367515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term367513, term367513.getClass(), "functionName", null);
        setBooleanField(term367513, term367513.getClass(), "itsNeedsActivation", false);
        setIntField(term367513, term367513.getClass(), "itsFunctionType", 0);
        setBooleanField(term367513, term367513.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term367513, term367513.getClass(), "encodedSourceStart", 0);
        setIntField(term367513, term367513.getClass(), "encodedSourceEnd", 0);
        setField(term367513, term367513.getClass(), "sourceName", null);
        setIntField(term367513, term367513.getClass(), "baseLineno", 0);
        setIntField(term367513, term367513.getClass(), "endLineno", 0);
        setField(term367513, term367513.getClass(), "functions", null);
        setField(term367513, term367513.getClass(), "regexps", null);
        setField(term367513, term367513.getClass(), "itsVariables", null);
        setField(term367513, term367513.getClass(), "itsConst", null);
        setField(term367513, term367513.getClass(), "itsVariableNames", null);
        setIntField(term367513, term367513.getClass(), "varStart", 0);
        setField(term367513, term367513.getClass(), "compilerData", null);
        setIntField(term367513, term367513.getClass(), "type", 101);
        setField(term367513, term367513.getClass(), "next", null);
        setField(term367514, term367514.getClass(), "functionName", null);
        setBooleanField(term367514, term367514.getClass(), "itsNeedsActivation", false);
        setIntField(term367514, term367514.getClass(), "itsFunctionType", 0);
        setBooleanField(term367514, term367514.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term367514, term367514.getClass(), "encodedSourceStart", 0);
        setIntField(term367514, term367514.getClass(), "encodedSourceEnd", 0);
        setField(term367514, term367514.getClass(), "sourceName", null);
        setIntField(term367514, term367514.getClass(), "baseLineno", 0);
        setIntField(term367514, term367514.getClass(), "endLineno", 0);
        setField(term367514, term367514.getClass(), "functions", null);
        setField(term367514, term367514.getClass(), "regexps", null);
        setField(term367514, term367514.getClass(), "itsVariables", null);
        setField(term367514, term367514.getClass(), "itsConst", null);
        setField(term367514, term367514.getClass(), "itsVariableNames", null);
        setIntField(term367514, term367514.getClass(), "varStart", 0);
        setField(term367514, term367514.getClass(), "compilerData", null);
        setIntField(term367514, term367514.getClass(), "type", 0);
        setIntField(term367515, term367515.getClass(), "type", 0);
        setField(term367515, term367515.getClass(), "next", null);
        setField(term367515, term367515.getClass(), "first", null);
        setField(term367515, term367515.getClass(), "last", null);
        setField(term367515, term367515.getClass(), "propListHead", null);
        setIntField(term367515, term367515.getClass(), "sourcePosition", 0);
        setField(term367515, term367515.getClass(), "jsType", null);
        setField(term367515, term367515.getClass(), "parent", null);
        setField(term367514, term367514.getClass(), "next", term367515);
        setField(term367514, term367514.getClass(), "first", null);
        setField(term367514, term367514.getClass(), "last", null);
        setField(term367514, term367514.getClass(), "propListHead", null);
        setIntField(term367514, term367514.getClass(), "sourcePosition", 0);
        setField(term367514, term367514.getClass(), "jsType", null);
        setField(term367514, term367514.getClass(), "parent", null);
        setField(term367513, term367513.getClass(), "first", term367514);
        setField(term367513, term367513.getClass(), "last", null);
        setField(term367513, term367513.getClass(), "propListHead", null);
        setIntField(term367513, term367513.getClass(), "sourcePosition", 0);
        setField(term367513, term367513.getClass(), "jsType", null);
        setField(term367513, term367513.getClass(), "parent", null);
        term367427 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term367437 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term367447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term367427, term367427.getClass(), "functionName", null);
        setBooleanField(term367427, term367427.getClass(), "itsNeedsActivation", false);
        setIntField(term367427, term367427.getClass(), "itsFunctionType", 0);
        setBooleanField(term367427, term367427.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term367427, term367427.getClass(), "encodedSourceStart", 0);
        setIntField(term367427, term367427.getClass(), "encodedSourceEnd", 0);
        setField(term367427, term367427.getClass(), "sourceName", null);
        setIntField(term367427, term367427.getClass(), "baseLineno", 0);
        setIntField(term367427, term367427.getClass(), "endLineno", 0);
        setField(term367427, term367427.getClass(), "functions", null);
        setField(term367427, term367427.getClass(), "regexps", null);
        setField(term367427, term367427.getClass(), "itsVariables", null);
        setField(term367427, term367427.getClass(), "itsConst", null);
        setField(term367427, term367427.getClass(), "itsVariableNames", null);
        setIntField(term367427, term367427.getClass(), "varStart", 0);
        setField(term367427, term367427.getClass(), "compilerData", null);
        setIntField(term367427, term367427.getClass(), "type", 101);
        setField(term367427, term367427.getClass(), "next", null);
        setField(term367437, term367437.getClass(), "functionName", null);
        setBooleanField(term367437, term367437.getClass(), "itsNeedsActivation", false);
        setIntField(term367437, term367437.getClass(), "itsFunctionType", 0);
        setBooleanField(term367437, term367437.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term367437, term367437.getClass(), "encodedSourceStart", 0);
        setIntField(term367437, term367437.getClass(), "encodedSourceEnd", 0);
        setField(term367437, term367437.getClass(), "sourceName", null);
        setIntField(term367437, term367437.getClass(), "baseLineno", 0);
        setIntField(term367437, term367437.getClass(), "endLineno", 0);
        setField(term367437, term367437.getClass(), "functions", null);
        setField(term367437, term367437.getClass(), "regexps", null);
        setField(term367437, term367437.getClass(), "itsVariables", null);
        setField(term367437, term367437.getClass(), "itsConst", null);
        setField(term367437, term367437.getClass(), "itsVariableNames", null);
        setIntField(term367437, term367437.getClass(), "varStart", 0);
        setField(term367437, term367437.getClass(), "compilerData", null);
        setIntField(term367437, term367437.getClass(), "type", 0);
        setIntField(term367447, term367447.getClass(), "type", 0);
        setField(term367447, term367447.getClass(), "next", null);
        setField(term367447, term367447.getClass(), "first", null);
        setField(term367447, term367447.getClass(), "last", null);
        setField(term367447, term367447.getClass(), "propListHead", null);
        setIntField(term367447, term367447.getClass(), "sourcePosition", 0);
        setField(term367447, term367447.getClass(), "jsType", null);
        setField(term367447, term367447.getClass(), "parent", null);
        setField(term367437, term367437.getClass(), "next", term367447);
        setField(term367437, term367437.getClass(), "first", null);
        setField(term367437, term367437.getClass(), "last", null);
        setField(term367437, term367437.getClass(), "propListHead", null);
        setIntField(term367437, term367437.getClass(), "sourcePosition", 0);
        setField(term367437, term367437.getClass(), "jsType", null);
        setField(term367437, term367437.getClass(), "parent", null);
        setField(term367427, term367427.getClass(), "first", term367437);
        setField(term367427, term367427.getClass(), "last", null);
        setField(term367427, term367427.getClass(), "propListHead", null);
        setIntField(term367427, term367427.getClass(), "sourcePosition", 0);
        setField(term367427, term367427.getClass(), "jsType", null);
        setField(term367427, term367427.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term367256;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term367170, args);
        assertTrue(recursiveEquals(term367170, term367512));
        assertTrue(recursiveEquals(term367256, term367513));
        assertTrue(recursiveEquals(retValue, term367427));
    }

};


