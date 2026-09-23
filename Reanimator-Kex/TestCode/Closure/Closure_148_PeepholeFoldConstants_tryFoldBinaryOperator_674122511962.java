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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224648;
     Object term224734;
     Object term224971;
     Object term224972;
     Object term224905;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term224648 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term224734 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term224820 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term224890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term224820, term224820.getClass(), "next", term224890);
        setField(term224734, term224734.getClass(), "first", term224820);
        setIntField(term224734, term224734.getClass(), "type", 52);
        term224971 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term224971, term224971.getClass(), "currentTraversal", null);
        term224972 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term224973 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term224974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term224972, term224972.getClass(), "functionName", null);
        setBooleanField(term224972, term224972.getClass(), "itsNeedsActivation", false);
        setIntField(term224972, term224972.getClass(), "itsFunctionType", 0);
        setBooleanField(term224972, term224972.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term224972, term224972.getClass(), "encodedSourceStart", 0);
        setIntField(term224972, term224972.getClass(), "encodedSourceEnd", 0);
        setField(term224972, term224972.getClass(), "sourceName", null);
        setIntField(term224972, term224972.getClass(), "baseLineno", 0);
        setIntField(term224972, term224972.getClass(), "endLineno", 0);
        setField(term224972, term224972.getClass(), "functions", null);
        setField(term224972, term224972.getClass(), "regexps", null);
        setField(term224972, term224972.getClass(), "itsVariables", null);
        setField(term224972, term224972.getClass(), "itsConst", null);
        setField(term224972, term224972.getClass(), "itsVariableNames", null);
        setIntField(term224972, term224972.getClass(), "varStart", 0);
        setField(term224972, term224972.getClass(), "compilerData", null);
        setIntField(term224972, term224972.getClass(), "type", 52);
        setField(term224972, term224972.getClass(), "next", null);
        setField(term224973, term224973.getClass(), "functionName", null);
        setBooleanField(term224973, term224973.getClass(), "itsNeedsActivation", false);
        setIntField(term224973, term224973.getClass(), "itsFunctionType", 0);
        setBooleanField(term224973, term224973.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term224973, term224973.getClass(), "encodedSourceStart", 0);
        setIntField(term224973, term224973.getClass(), "encodedSourceEnd", 0);
        setField(term224973, term224973.getClass(), "sourceName", null);
        setIntField(term224973, term224973.getClass(), "baseLineno", 0);
        setIntField(term224973, term224973.getClass(), "endLineno", 0);
        setField(term224973, term224973.getClass(), "functions", null);
        setField(term224973, term224973.getClass(), "regexps", null);
        setField(term224973, term224973.getClass(), "itsVariables", null);
        setField(term224973, term224973.getClass(), "itsConst", null);
        setField(term224973, term224973.getClass(), "itsVariableNames", null);
        setIntField(term224973, term224973.getClass(), "varStart", 0);
        setField(term224973, term224973.getClass(), "compilerData", null);
        setIntField(term224973, term224973.getClass(), "type", 0);
        setIntField(term224974, term224974.getClass(), "type", 0);
        setField(term224974, term224974.getClass(), "next", null);
        setField(term224974, term224974.getClass(), "first", null);
        setField(term224974, term224974.getClass(), "last", null);
        setField(term224974, term224974.getClass(), "propListHead", null);
        setIntField(term224974, term224974.getClass(), "sourcePosition", 0);
        setField(term224974, term224974.getClass(), "jsType", null);
        setField(term224974, term224974.getClass(), "parent", null);
        setField(term224973, term224973.getClass(), "next", term224974);
        setField(term224973, term224973.getClass(), "first", null);
        setField(term224973, term224973.getClass(), "last", null);
        setField(term224973, term224973.getClass(), "propListHead", null);
        setIntField(term224973, term224973.getClass(), "sourcePosition", 0);
        setField(term224973, term224973.getClass(), "jsType", null);
        setField(term224973, term224973.getClass(), "parent", null);
        setField(term224972, term224972.getClass(), "first", term224973);
        setField(term224972, term224972.getClass(), "last", null);
        setField(term224972, term224972.getClass(), "propListHead", null);
        setIntField(term224972, term224972.getClass(), "sourcePosition", 0);
        setField(term224972, term224972.getClass(), "jsType", null);
        setField(term224972, term224972.getClass(), "parent", null);
        term224905 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term224915 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term224925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term224905, term224905.getClass(), "functionName", null);
        setBooleanField(term224905, term224905.getClass(), "itsNeedsActivation", false);
        setIntField(term224905, term224905.getClass(), "itsFunctionType", 0);
        setBooleanField(term224905, term224905.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term224905, term224905.getClass(), "encodedSourceStart", 0);
        setIntField(term224905, term224905.getClass(), "encodedSourceEnd", 0);
        setField(term224905, term224905.getClass(), "sourceName", null);
        setIntField(term224905, term224905.getClass(), "baseLineno", 0);
        setIntField(term224905, term224905.getClass(), "endLineno", 0);
        setField(term224905, term224905.getClass(), "functions", null);
        setField(term224905, term224905.getClass(), "regexps", null);
        setField(term224905, term224905.getClass(), "itsVariables", null);
        setField(term224905, term224905.getClass(), "itsConst", null);
        setField(term224905, term224905.getClass(), "itsVariableNames", null);
        setIntField(term224905, term224905.getClass(), "varStart", 0);
        setField(term224905, term224905.getClass(), "compilerData", null);
        setIntField(term224905, term224905.getClass(), "type", 52);
        setField(term224905, term224905.getClass(), "next", null);
        setField(term224915, term224915.getClass(), "functionName", null);
        setBooleanField(term224915, term224915.getClass(), "itsNeedsActivation", false);
        setIntField(term224915, term224915.getClass(), "itsFunctionType", 0);
        setBooleanField(term224915, term224915.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term224915, term224915.getClass(), "encodedSourceStart", 0);
        setIntField(term224915, term224915.getClass(), "encodedSourceEnd", 0);
        setField(term224915, term224915.getClass(), "sourceName", null);
        setIntField(term224915, term224915.getClass(), "baseLineno", 0);
        setIntField(term224915, term224915.getClass(), "endLineno", 0);
        setField(term224915, term224915.getClass(), "functions", null);
        setField(term224915, term224915.getClass(), "regexps", null);
        setField(term224915, term224915.getClass(), "itsVariables", null);
        setField(term224915, term224915.getClass(), "itsConst", null);
        setField(term224915, term224915.getClass(), "itsVariableNames", null);
        setIntField(term224915, term224915.getClass(), "varStart", 0);
        setField(term224915, term224915.getClass(), "compilerData", null);
        setIntField(term224915, term224915.getClass(), "type", 0);
        setIntField(term224925, term224925.getClass(), "type", 0);
        setField(term224925, term224925.getClass(), "next", null);
        setField(term224925, term224925.getClass(), "first", null);
        setField(term224925, term224925.getClass(), "last", null);
        setField(term224925, term224925.getClass(), "propListHead", null);
        setIntField(term224925, term224925.getClass(), "sourcePosition", 0);
        setField(term224925, term224925.getClass(), "jsType", null);
        setField(term224925, term224925.getClass(), "parent", null);
        setField(term224915, term224915.getClass(), "next", term224925);
        setField(term224915, term224915.getClass(), "first", null);
        setField(term224915, term224915.getClass(), "last", null);
        setField(term224915, term224915.getClass(), "propListHead", null);
        setIntField(term224915, term224915.getClass(), "sourcePosition", 0);
        setField(term224915, term224915.getClass(), "jsType", null);
        setField(term224915, term224915.getClass(), "parent", null);
        setField(term224905, term224905.getClass(), "first", term224915);
        setField(term224905, term224905.getClass(), "last", null);
        setField(term224905, term224905.getClass(), "propListHead", null);
        setIntField(term224905, term224905.getClass(), "sourcePosition", 0);
        setField(term224905, term224905.getClass(), "jsType", null);
        setField(term224905, term224905.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term224734;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term224648, args);
        assertTrue(recursiveEquals(term224648, term224971));
        assertTrue(recursiveEquals(term224734, term224972));
        assertTrue(recursiveEquals(retValue, term224905));
    }

};


