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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163517;
     Object term163603;
     Object term163840;
     Object term163841;
     Object term163774;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163517 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term163603 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term163689 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term163759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term163689, term163689.getClass(), "next", term163759);
        setField(term163603, term163603.getClass(), "first", term163689);
        setIntField(term163603, term163603.getClass(), "type", 45);
        term163840 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term163840, term163840.getClass(), "currentTraversal", null);
        term163841 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term163842 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term163843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term163841, term163841.getClass(), "functionName", null);
        setBooleanField(term163841, term163841.getClass(), "itsNeedsActivation", false);
        setIntField(term163841, term163841.getClass(), "itsFunctionType", 0);
        setBooleanField(term163841, term163841.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term163841, term163841.getClass(), "encodedSourceStart", 0);
        setIntField(term163841, term163841.getClass(), "encodedSourceEnd", 0);
        setField(term163841, term163841.getClass(), "sourceName", null);
        setIntField(term163841, term163841.getClass(), "baseLineno", 0);
        setIntField(term163841, term163841.getClass(), "endLineno", 0);
        setField(term163841, term163841.getClass(), "functions", null);
        setField(term163841, term163841.getClass(), "regexps", null);
        setField(term163841, term163841.getClass(), "itsVariables", null);
        setField(term163841, term163841.getClass(), "itsConst", null);
        setField(term163841, term163841.getClass(), "itsVariableNames", null);
        setIntField(term163841, term163841.getClass(), "varStart", 0);
        setField(term163841, term163841.getClass(), "compilerData", null);
        setIntField(term163841, term163841.getClass(), "type", 45);
        setField(term163841, term163841.getClass(), "next", null);
        setField(term163842, term163842.getClass(), "functionName", null);
        setBooleanField(term163842, term163842.getClass(), "itsNeedsActivation", false);
        setIntField(term163842, term163842.getClass(), "itsFunctionType", 0);
        setBooleanField(term163842, term163842.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term163842, term163842.getClass(), "encodedSourceStart", 0);
        setIntField(term163842, term163842.getClass(), "encodedSourceEnd", 0);
        setField(term163842, term163842.getClass(), "sourceName", null);
        setIntField(term163842, term163842.getClass(), "baseLineno", 0);
        setIntField(term163842, term163842.getClass(), "endLineno", 0);
        setField(term163842, term163842.getClass(), "functions", null);
        setField(term163842, term163842.getClass(), "regexps", null);
        setField(term163842, term163842.getClass(), "itsVariables", null);
        setField(term163842, term163842.getClass(), "itsConst", null);
        setField(term163842, term163842.getClass(), "itsVariableNames", null);
        setIntField(term163842, term163842.getClass(), "varStart", 0);
        setField(term163842, term163842.getClass(), "compilerData", null);
        setIntField(term163842, term163842.getClass(), "type", 0);
        setIntField(term163843, term163843.getClass(), "type", 0);
        setField(term163843, term163843.getClass(), "next", null);
        setField(term163843, term163843.getClass(), "first", null);
        setField(term163843, term163843.getClass(), "last", null);
        setField(term163843, term163843.getClass(), "propListHead", null);
        setIntField(term163843, term163843.getClass(), "sourcePosition", 0);
        setField(term163843, term163843.getClass(), "jsType", null);
        setField(term163843, term163843.getClass(), "parent", null);
        setField(term163842, term163842.getClass(), "next", term163843);
        setField(term163842, term163842.getClass(), "first", null);
        setField(term163842, term163842.getClass(), "last", null);
        setField(term163842, term163842.getClass(), "propListHead", null);
        setIntField(term163842, term163842.getClass(), "sourcePosition", 0);
        setField(term163842, term163842.getClass(), "jsType", null);
        setField(term163842, term163842.getClass(), "parent", null);
        setField(term163841, term163841.getClass(), "first", term163842);
        setField(term163841, term163841.getClass(), "last", null);
        setField(term163841, term163841.getClass(), "propListHead", null);
        setIntField(term163841, term163841.getClass(), "sourcePosition", 0);
        setField(term163841, term163841.getClass(), "jsType", null);
        setField(term163841, term163841.getClass(), "parent", null);
        term163774 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term163784 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term163794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term163774, term163774.getClass(), "functionName", null);
        setBooleanField(term163774, term163774.getClass(), "itsNeedsActivation", false);
        setIntField(term163774, term163774.getClass(), "itsFunctionType", 0);
        setBooleanField(term163774, term163774.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term163774, term163774.getClass(), "encodedSourceStart", 0);
        setIntField(term163774, term163774.getClass(), "encodedSourceEnd", 0);
        setField(term163774, term163774.getClass(), "sourceName", null);
        setIntField(term163774, term163774.getClass(), "baseLineno", 0);
        setIntField(term163774, term163774.getClass(), "endLineno", 0);
        setField(term163774, term163774.getClass(), "functions", null);
        setField(term163774, term163774.getClass(), "regexps", null);
        setField(term163774, term163774.getClass(), "itsVariables", null);
        setField(term163774, term163774.getClass(), "itsConst", null);
        setField(term163774, term163774.getClass(), "itsVariableNames", null);
        setIntField(term163774, term163774.getClass(), "varStart", 0);
        setField(term163774, term163774.getClass(), "compilerData", null);
        setIntField(term163774, term163774.getClass(), "type", 45);
        setField(term163774, term163774.getClass(), "next", null);
        setField(term163784, term163784.getClass(), "functionName", null);
        setBooleanField(term163784, term163784.getClass(), "itsNeedsActivation", false);
        setIntField(term163784, term163784.getClass(), "itsFunctionType", 0);
        setBooleanField(term163784, term163784.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term163784, term163784.getClass(), "encodedSourceStart", 0);
        setIntField(term163784, term163784.getClass(), "encodedSourceEnd", 0);
        setField(term163784, term163784.getClass(), "sourceName", null);
        setIntField(term163784, term163784.getClass(), "baseLineno", 0);
        setIntField(term163784, term163784.getClass(), "endLineno", 0);
        setField(term163784, term163784.getClass(), "functions", null);
        setField(term163784, term163784.getClass(), "regexps", null);
        setField(term163784, term163784.getClass(), "itsVariables", null);
        setField(term163784, term163784.getClass(), "itsConst", null);
        setField(term163784, term163784.getClass(), "itsVariableNames", null);
        setIntField(term163784, term163784.getClass(), "varStart", 0);
        setField(term163784, term163784.getClass(), "compilerData", null);
        setIntField(term163784, term163784.getClass(), "type", 0);
        setIntField(term163794, term163794.getClass(), "type", 0);
        setField(term163794, term163794.getClass(), "next", null);
        setField(term163794, term163794.getClass(), "first", null);
        setField(term163794, term163794.getClass(), "last", null);
        setField(term163794, term163794.getClass(), "propListHead", null);
        setIntField(term163794, term163794.getClass(), "sourcePosition", 0);
        setField(term163794, term163794.getClass(), "jsType", null);
        setField(term163794, term163794.getClass(), "parent", null);
        setField(term163784, term163784.getClass(), "next", term163794);
        setField(term163784, term163784.getClass(), "first", null);
        setField(term163784, term163784.getClass(), "last", null);
        setField(term163784, term163784.getClass(), "propListHead", null);
        setIntField(term163784, term163784.getClass(), "sourcePosition", 0);
        setField(term163784, term163784.getClass(), "jsType", null);
        setField(term163784, term163784.getClass(), "parent", null);
        setField(term163774, term163774.getClass(), "first", term163784);
        setField(term163774, term163774.getClass(), "last", null);
        setField(term163774, term163774.getClass(), "propListHead", null);
        setIntField(term163774, term163774.getClass(), "sourcePosition", 0);
        setField(term163774, term163774.getClass(), "jsType", null);
        setField(term163774, term163774.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term163603;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term163517, args);
        assertTrue(recursiveEquals(term163517, term163840));
        assertTrue(recursiveEquals(term163603, term163841));
        assertTrue(recursiveEquals(retValue, term163774));
    }

};


