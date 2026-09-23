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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48121;
     Object term48207;
     Object term48458;
     Object term48459;
     Object term48399;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48121 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term48207 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term48293 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term48363 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term48293, term48293.getClass(), "next", term48363);
        setField(term48207, term48207.getClass(), "first", term48293);
        setIntField(term48207, term48207.getClass(), "type", 24);
        term48458 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term48458, term48458.getClass(), "currentTraversal", null);
        term48459 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term48460 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term48461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term48459, term48459.getClass(), "functionName", null);
        setBooleanField(term48459, term48459.getClass(), "itsNeedsActivation", false);
        setIntField(term48459, term48459.getClass(), "itsFunctionType", 0);
        setBooleanField(term48459, term48459.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term48459, term48459.getClass(), "encodedSourceStart", 0);
        setIntField(term48459, term48459.getClass(), "encodedSourceEnd", 0);
        setField(term48459, term48459.getClass(), "sourceName", null);
        setIntField(term48459, term48459.getClass(), "baseLineno", 0);
        setIntField(term48459, term48459.getClass(), "endLineno", 0);
        setField(term48459, term48459.getClass(), "functions", null);
        setField(term48459, term48459.getClass(), "regexps", null);
        setField(term48459, term48459.getClass(), "itsVariables", null);
        setField(term48459, term48459.getClass(), "itsConst", null);
        setField(term48459, term48459.getClass(), "itsVariableNames", null);
        setIntField(term48459, term48459.getClass(), "varStart", 0);
        setField(term48459, term48459.getClass(), "compilerData", null);
        setIntField(term48459, term48459.getClass(), "type", 24);
        setField(term48459, term48459.getClass(), "next", null);
        setField(term48460, term48460.getClass(), "functionName", null);
        setBooleanField(term48460, term48460.getClass(), "itsNeedsActivation", false);
        setIntField(term48460, term48460.getClass(), "itsFunctionType", 0);
        setBooleanField(term48460, term48460.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term48460, term48460.getClass(), "encodedSourceStart", 0);
        setIntField(term48460, term48460.getClass(), "encodedSourceEnd", 0);
        setField(term48460, term48460.getClass(), "sourceName", null);
        setIntField(term48460, term48460.getClass(), "baseLineno", 0);
        setIntField(term48460, term48460.getClass(), "endLineno", 0);
        setField(term48460, term48460.getClass(), "functions", null);
        setField(term48460, term48460.getClass(), "regexps", null);
        setField(term48460, term48460.getClass(), "itsVariables", null);
        setField(term48460, term48460.getClass(), "itsConst", null);
        setField(term48460, term48460.getClass(), "itsVariableNames", null);
        setIntField(term48460, term48460.getClass(), "varStart", 0);
        setField(term48460, term48460.getClass(), "compilerData", null);
        setIntField(term48460, term48460.getClass(), "type", 0);
        setIntField(term48461, term48461.getClass(), "type", 0);
        setField(term48461, term48461.getClass(), "next", null);
        setField(term48461, term48461.getClass(), "first", null);
        setField(term48461, term48461.getClass(), "last", null);
        setField(term48461, term48461.getClass(), "propListHead", null);
        setIntField(term48461, term48461.getClass(), "sourcePosition", 0);
        setField(term48461, term48461.getClass(), "jsType", null);
        setField(term48461, term48461.getClass(), "parent", null);
        setField(term48460, term48460.getClass(), "next", term48461);
        setField(term48460, term48460.getClass(), "first", null);
        setField(term48460, term48460.getClass(), "last", null);
        setField(term48460, term48460.getClass(), "propListHead", null);
        setIntField(term48460, term48460.getClass(), "sourcePosition", 0);
        setField(term48460, term48460.getClass(), "jsType", null);
        setField(term48460, term48460.getClass(), "parent", null);
        setField(term48459, term48459.getClass(), "first", term48460);
        setField(term48459, term48459.getClass(), "last", null);
        setField(term48459, term48459.getClass(), "propListHead", null);
        setIntField(term48459, term48459.getClass(), "sourcePosition", 0);
        setField(term48459, term48459.getClass(), "jsType", null);
        setField(term48459, term48459.getClass(), "parent", null);
        term48399 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term48409 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term48419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term48399, term48399.getClass(), "functionName", null);
        setBooleanField(term48399, term48399.getClass(), "itsNeedsActivation", false);
        setIntField(term48399, term48399.getClass(), "itsFunctionType", 0);
        setBooleanField(term48399, term48399.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term48399, term48399.getClass(), "encodedSourceStart", 0);
        setIntField(term48399, term48399.getClass(), "encodedSourceEnd", 0);
        setField(term48399, term48399.getClass(), "sourceName", null);
        setIntField(term48399, term48399.getClass(), "baseLineno", 0);
        setIntField(term48399, term48399.getClass(), "endLineno", 0);
        setField(term48399, term48399.getClass(), "functions", null);
        setField(term48399, term48399.getClass(), "regexps", null);
        setField(term48399, term48399.getClass(), "itsVariables", null);
        setField(term48399, term48399.getClass(), "itsConst", null);
        setField(term48399, term48399.getClass(), "itsVariableNames", null);
        setIntField(term48399, term48399.getClass(), "varStart", 0);
        setField(term48399, term48399.getClass(), "compilerData", null);
        setIntField(term48399, term48399.getClass(), "type", 24);
        setField(term48399, term48399.getClass(), "next", null);
        setField(term48409, term48409.getClass(), "functionName", null);
        setBooleanField(term48409, term48409.getClass(), "itsNeedsActivation", false);
        setIntField(term48409, term48409.getClass(), "itsFunctionType", 0);
        setBooleanField(term48409, term48409.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term48409, term48409.getClass(), "encodedSourceStart", 0);
        setIntField(term48409, term48409.getClass(), "encodedSourceEnd", 0);
        setField(term48409, term48409.getClass(), "sourceName", null);
        setIntField(term48409, term48409.getClass(), "baseLineno", 0);
        setIntField(term48409, term48409.getClass(), "endLineno", 0);
        setField(term48409, term48409.getClass(), "functions", null);
        setField(term48409, term48409.getClass(), "regexps", null);
        setField(term48409, term48409.getClass(), "itsVariables", null);
        setField(term48409, term48409.getClass(), "itsConst", null);
        setField(term48409, term48409.getClass(), "itsVariableNames", null);
        setIntField(term48409, term48409.getClass(), "varStart", 0);
        setField(term48409, term48409.getClass(), "compilerData", null);
        setIntField(term48409, term48409.getClass(), "type", 0);
        setIntField(term48419, term48419.getClass(), "type", 0);
        setField(term48419, term48419.getClass(), "next", null);
        setField(term48419, term48419.getClass(), "first", null);
        setField(term48419, term48419.getClass(), "last", null);
        setField(term48419, term48419.getClass(), "propListHead", null);
        setIntField(term48419, term48419.getClass(), "sourcePosition", 0);
        setField(term48419, term48419.getClass(), "jsType", null);
        setField(term48419, term48419.getClass(), "parent", null);
        setField(term48409, term48409.getClass(), "next", term48419);
        setField(term48409, term48409.getClass(), "first", null);
        setField(term48409, term48409.getClass(), "last", null);
        setField(term48409, term48409.getClass(), "propListHead", null);
        setIntField(term48409, term48409.getClass(), "sourcePosition", 0);
        setField(term48409, term48409.getClass(), "jsType", null);
        setField(term48409, term48409.getClass(), "parent", null);
        setField(term48399, term48399.getClass(), "first", term48409);
        setField(term48399, term48399.getClass(), "last", null);
        setField(term48399, term48399.getClass(), "propListHead", null);
        setIntField(term48399, term48399.getClass(), "sourcePosition", 0);
        setField(term48399, term48399.getClass(), "jsType", null);
        setField(term48399, term48399.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term48207;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term48121, args);
        assertTrue(recursiveEquals(term48121, term48458));
        assertTrue(recursiveEquals(term48207, term48459));
        assertTrue(recursiveEquals(retValue, term48399));
    }

};


