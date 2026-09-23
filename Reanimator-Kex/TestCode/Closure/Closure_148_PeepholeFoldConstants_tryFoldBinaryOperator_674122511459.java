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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94335;
     Object term94421;
     Object term95180;
     Object term95181;
     Object term95114;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94335 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term94421 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term94507 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term94577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term94507, term94507.getClass(), "next", term94577);
        setField(term94421, term94421.getClass(), "first", term94507);
        setIntField(term94421, term94421.getClass(), "type", 12);
        term95180 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term95180, term95180.getClass(), "currentTraversal", null);
        term95181 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term95182 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term95183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term95181, term95181.getClass(), "functionName", null);
        setBooleanField(term95181, term95181.getClass(), "itsNeedsActivation", false);
        setIntField(term95181, term95181.getClass(), "itsFunctionType", 0);
        setBooleanField(term95181, term95181.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term95181, term95181.getClass(), "encodedSourceStart", 0);
        setIntField(term95181, term95181.getClass(), "encodedSourceEnd", 0);
        setField(term95181, term95181.getClass(), "sourceName", null);
        setIntField(term95181, term95181.getClass(), "baseLineno", 0);
        setIntField(term95181, term95181.getClass(), "endLineno", 0);
        setField(term95181, term95181.getClass(), "functions", null);
        setField(term95181, term95181.getClass(), "regexps", null);
        setField(term95181, term95181.getClass(), "itsVariables", null);
        setField(term95181, term95181.getClass(), "itsConst", null);
        setField(term95181, term95181.getClass(), "itsVariableNames", null);
        setIntField(term95181, term95181.getClass(), "varStart", 0);
        setField(term95181, term95181.getClass(), "compilerData", null);
        setIntField(term95181, term95181.getClass(), "type", 12);
        setField(term95181, term95181.getClass(), "next", null);
        setField(term95182, term95182.getClass(), "functionName", null);
        setBooleanField(term95182, term95182.getClass(), "itsNeedsActivation", false);
        setIntField(term95182, term95182.getClass(), "itsFunctionType", 0);
        setBooleanField(term95182, term95182.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term95182, term95182.getClass(), "encodedSourceStart", 0);
        setIntField(term95182, term95182.getClass(), "encodedSourceEnd", 0);
        setField(term95182, term95182.getClass(), "sourceName", null);
        setIntField(term95182, term95182.getClass(), "baseLineno", 0);
        setIntField(term95182, term95182.getClass(), "endLineno", 0);
        setField(term95182, term95182.getClass(), "functions", null);
        setField(term95182, term95182.getClass(), "regexps", null);
        setField(term95182, term95182.getClass(), "itsVariables", null);
        setField(term95182, term95182.getClass(), "itsConst", null);
        setField(term95182, term95182.getClass(), "itsVariableNames", null);
        setIntField(term95182, term95182.getClass(), "varStart", 0);
        setField(term95182, term95182.getClass(), "compilerData", null);
        setIntField(term95182, term95182.getClass(), "type", 0);
        setIntField(term95183, term95183.getClass(), "type", 0);
        setField(term95183, term95183.getClass(), "next", null);
        setField(term95183, term95183.getClass(), "first", null);
        setField(term95183, term95183.getClass(), "last", null);
        setField(term95183, term95183.getClass(), "propListHead", null);
        setIntField(term95183, term95183.getClass(), "sourcePosition", 0);
        setField(term95183, term95183.getClass(), "jsType", null);
        setField(term95183, term95183.getClass(), "parent", null);
        setField(term95182, term95182.getClass(), "next", term95183);
        setField(term95182, term95182.getClass(), "first", null);
        setField(term95182, term95182.getClass(), "last", null);
        setField(term95182, term95182.getClass(), "propListHead", null);
        setIntField(term95182, term95182.getClass(), "sourcePosition", 0);
        setField(term95182, term95182.getClass(), "jsType", null);
        setField(term95182, term95182.getClass(), "parent", null);
        setField(term95181, term95181.getClass(), "first", term95182);
        setField(term95181, term95181.getClass(), "last", null);
        setField(term95181, term95181.getClass(), "propListHead", null);
        setIntField(term95181, term95181.getClass(), "sourcePosition", 0);
        setField(term95181, term95181.getClass(), "jsType", null);
        setField(term95181, term95181.getClass(), "parent", null);
        term95114 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term95124 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term95134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term95114, term95114.getClass(), "functionName", null);
        setBooleanField(term95114, term95114.getClass(), "itsNeedsActivation", false);
        setIntField(term95114, term95114.getClass(), "itsFunctionType", 0);
        setBooleanField(term95114, term95114.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term95114, term95114.getClass(), "encodedSourceStart", 0);
        setIntField(term95114, term95114.getClass(), "encodedSourceEnd", 0);
        setField(term95114, term95114.getClass(), "sourceName", null);
        setIntField(term95114, term95114.getClass(), "baseLineno", 0);
        setIntField(term95114, term95114.getClass(), "endLineno", 0);
        setField(term95114, term95114.getClass(), "functions", null);
        setField(term95114, term95114.getClass(), "regexps", null);
        setField(term95114, term95114.getClass(), "itsVariables", null);
        setField(term95114, term95114.getClass(), "itsConst", null);
        setField(term95114, term95114.getClass(), "itsVariableNames", null);
        setIntField(term95114, term95114.getClass(), "varStart", 0);
        setField(term95114, term95114.getClass(), "compilerData", null);
        setIntField(term95114, term95114.getClass(), "type", 12);
        setField(term95114, term95114.getClass(), "next", null);
        setField(term95124, term95124.getClass(), "functionName", null);
        setBooleanField(term95124, term95124.getClass(), "itsNeedsActivation", false);
        setIntField(term95124, term95124.getClass(), "itsFunctionType", 0);
        setBooleanField(term95124, term95124.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term95124, term95124.getClass(), "encodedSourceStart", 0);
        setIntField(term95124, term95124.getClass(), "encodedSourceEnd", 0);
        setField(term95124, term95124.getClass(), "sourceName", null);
        setIntField(term95124, term95124.getClass(), "baseLineno", 0);
        setIntField(term95124, term95124.getClass(), "endLineno", 0);
        setField(term95124, term95124.getClass(), "functions", null);
        setField(term95124, term95124.getClass(), "regexps", null);
        setField(term95124, term95124.getClass(), "itsVariables", null);
        setField(term95124, term95124.getClass(), "itsConst", null);
        setField(term95124, term95124.getClass(), "itsVariableNames", null);
        setIntField(term95124, term95124.getClass(), "varStart", 0);
        setField(term95124, term95124.getClass(), "compilerData", null);
        setIntField(term95124, term95124.getClass(), "type", 0);
        setIntField(term95134, term95134.getClass(), "type", 0);
        setField(term95134, term95134.getClass(), "next", null);
        setField(term95134, term95134.getClass(), "first", null);
        setField(term95134, term95134.getClass(), "last", null);
        setField(term95134, term95134.getClass(), "propListHead", null);
        setIntField(term95134, term95134.getClass(), "sourcePosition", 0);
        setField(term95134, term95134.getClass(), "jsType", null);
        setField(term95134, term95134.getClass(), "parent", null);
        setField(term95124, term95124.getClass(), "next", term95134);
        setField(term95124, term95124.getClass(), "first", null);
        setField(term95124, term95124.getClass(), "last", null);
        setField(term95124, term95124.getClass(), "propListHead", null);
        setIntField(term95124, term95124.getClass(), "sourcePosition", 0);
        setField(term95124, term95124.getClass(), "jsType", null);
        setField(term95124, term95124.getClass(), "parent", null);
        setField(term95114, term95114.getClass(), "first", term95124);
        setField(term95114, term95114.getClass(), "last", null);
        setField(term95114, term95114.getClass(), "propListHead", null);
        setIntField(term95114, term95114.getClass(), "sourcePosition", 0);
        setField(term95114, term95114.getClass(), "jsType", null);
        setField(term95114, term95114.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term94421;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term94335, args);
        assertTrue(recursiveEquals(term94335, term95180));
        assertTrue(recursiveEquals(term94421, term95181));
        assertTrue(recursiveEquals(retValue, term95114));
    }

};


