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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160191;
     Object term160277;
     Object term160409;
     Object term160410;
     Object term160368;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160191 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term160277 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term160347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term160277, term160277.getClass(), "first", term160277);
        setField(term160277, term160277.getClass(), "next", term160347);
        setIntField(term160277, term160277.getClass(), "type", 35);
        term160409 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term160409, term160409.getClass(), "currentTraversal", null);
        term160410 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term160411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term160410, term160410.getClass(), "functionName", null);
        setBooleanField(term160410, term160410.getClass(), "itsNeedsActivation", false);
        setIntField(term160410, term160410.getClass(), "itsFunctionType", 0);
        setBooleanField(term160410, term160410.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term160410, term160410.getClass(), "encodedSourceStart", 0);
        setIntField(term160410, term160410.getClass(), "encodedSourceEnd", 0);
        setField(term160410, term160410.getClass(), "sourceName", null);
        setIntField(term160410, term160410.getClass(), "baseLineno", 0);
        setIntField(term160410, term160410.getClass(), "endLineno", 0);
        setField(term160410, term160410.getClass(), "functions", null);
        setField(term160410, term160410.getClass(), "regexps", null);
        setField(term160410, term160410.getClass(), "itsVariables", null);
        setField(term160410, term160410.getClass(), "itsConst", null);
        setField(term160410, term160410.getClass(), "itsVariableNames", null);
        setIntField(term160410, term160410.getClass(), "varStart", 0);
        setField(term160410, term160410.getClass(), "compilerData", null);
        setIntField(term160410, term160410.getClass(), "type", 35);
        setIntField(term160411, term160411.getClass(), "type", 0);
        setField(term160411, term160411.getClass(), "next", null);
        setField(term160411, term160411.getClass(), "first", null);
        setField(term160411, term160411.getClass(), "last", null);
        setField(term160411, term160411.getClass(), "propListHead", null);
        setIntField(term160411, term160411.getClass(), "sourcePosition", 0);
        setField(term160411, term160411.getClass(), "jsType", null);
        setField(term160411, term160411.getClass(), "parent", null);
        setField(term160410, term160410.getClass(), "next", term160411);
        setField(term160410, term160410.getClass(), "first", term160410);
        setField(term160410, term160410.getClass(), "last", null);
        setField(term160410, term160410.getClass(), "propListHead", null);
        setIntField(term160410, term160410.getClass(), "sourcePosition", 0);
        setField(term160410, term160410.getClass(), "jsType", null);
        setField(term160410, term160410.getClass(), "parent", null);
        term160368 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term160378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term160368, term160368.getClass(), "functionName", null);
        setBooleanField(term160368, term160368.getClass(), "itsNeedsActivation", false);
        setIntField(term160368, term160368.getClass(), "itsFunctionType", 0);
        setBooleanField(term160368, term160368.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term160368, term160368.getClass(), "encodedSourceStart", 0);
        setIntField(term160368, term160368.getClass(), "encodedSourceEnd", 0);
        setField(term160368, term160368.getClass(), "sourceName", null);
        setIntField(term160368, term160368.getClass(), "baseLineno", 0);
        setIntField(term160368, term160368.getClass(), "endLineno", 0);
        setField(term160368, term160368.getClass(), "functions", null);
        setField(term160368, term160368.getClass(), "regexps", null);
        setField(term160368, term160368.getClass(), "itsVariables", null);
        setField(term160368, term160368.getClass(), "itsConst", null);
        setField(term160368, term160368.getClass(), "itsVariableNames", null);
        setIntField(term160368, term160368.getClass(), "varStart", 0);
        setField(term160368, term160368.getClass(), "compilerData", null);
        setIntField(term160368, term160368.getClass(), "type", 35);
        setIntField(term160378, term160378.getClass(), "type", 0);
        setField(term160378, term160378.getClass(), "next", null);
        setField(term160378, term160378.getClass(), "first", null);
        setField(term160378, term160378.getClass(), "last", null);
        setField(term160378, term160378.getClass(), "propListHead", null);
        setIntField(term160378, term160378.getClass(), "sourcePosition", 0);
        setField(term160378, term160378.getClass(), "jsType", null);
        setField(term160378, term160378.getClass(), "parent", null);
        setField(term160368, term160368.getClass(), "next", term160378);
        setField(term160368, term160368.getClass(), "first", term160368);
        setField(term160368, term160368.getClass(), "last", null);
        setField(term160368, term160368.getClass(), "propListHead", null);
        setIntField(term160368, term160368.getClass(), "sourcePosition", 0);
        setField(term160368, term160368.getClass(), "jsType", null);
        setField(term160368, term160368.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term160277;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term160191, args);
        assertTrue(recursiveEquals(term160191, term160409));
        assertTrue(recursiveEquals(term160277, term160410));
        assertTrue(recursiveEquals(retValue, term160368));
    }

};


