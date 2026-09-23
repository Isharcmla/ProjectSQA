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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99569;
     Object term99655;
     Object term99790;
     Object term99791;
     Object term99746;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99569 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term99655 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term99725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term99655, term99655.getClass(), "first", term99655);
        setField(term99655, term99655.getClass(), "next", term99725);
        setIntField(term99655, term99655.getClass(), "type", 52);
        term99790 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term99790, term99790.getClass(), "currentTraversal", null);
        term99791 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term99792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term99791, term99791.getClass(), "functionName", null);
        setBooleanField(term99791, term99791.getClass(), "itsNeedsActivation", false);
        setIntField(term99791, term99791.getClass(), "itsFunctionType", 0);
        setBooleanField(term99791, term99791.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term99791, term99791.getClass(), "encodedSourceStart", 0);
        setIntField(term99791, term99791.getClass(), "encodedSourceEnd", 0);
        setField(term99791, term99791.getClass(), "sourceName", null);
        setIntField(term99791, term99791.getClass(), "baseLineno", 0);
        setIntField(term99791, term99791.getClass(), "endLineno", 0);
        setField(term99791, term99791.getClass(), "functions", null);
        setField(term99791, term99791.getClass(), "regexps", null);
        setField(term99791, term99791.getClass(), "itsVariables", null);
        setField(term99791, term99791.getClass(), "itsConst", null);
        setField(term99791, term99791.getClass(), "itsVariableNames", null);
        setIntField(term99791, term99791.getClass(), "varStart", 0);
        setField(term99791, term99791.getClass(), "compilerData", null);
        setIntField(term99791, term99791.getClass(), "type", 52);
        setIntField(term99792, term99792.getClass(), "type", 0);
        setField(term99792, term99792.getClass(), "next", null);
        setField(term99792, term99792.getClass(), "first", null);
        setField(term99792, term99792.getClass(), "last", null);
        setField(term99792, term99792.getClass(), "propListHead", null);
        setIntField(term99792, term99792.getClass(), "sourcePosition", 0);
        setField(term99792, term99792.getClass(), "jsType", null);
        setField(term99792, term99792.getClass(), "parent", null);
        setField(term99791, term99791.getClass(), "next", term99792);
        setField(term99791, term99791.getClass(), "first", term99791);
        setField(term99791, term99791.getClass(), "last", null);
        setField(term99791, term99791.getClass(), "propListHead", null);
        setIntField(term99791, term99791.getClass(), "sourcePosition", 0);
        setField(term99791, term99791.getClass(), "jsType", null);
        setField(term99791, term99791.getClass(), "parent", null);
        term99746 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term99756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term99746, term99746.getClass(), "functionName", null);
        setBooleanField(term99746, term99746.getClass(), "itsNeedsActivation", false);
        setIntField(term99746, term99746.getClass(), "itsFunctionType", 0);
        setBooleanField(term99746, term99746.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term99746, term99746.getClass(), "encodedSourceStart", 0);
        setIntField(term99746, term99746.getClass(), "encodedSourceEnd", 0);
        setField(term99746, term99746.getClass(), "sourceName", null);
        setIntField(term99746, term99746.getClass(), "baseLineno", 0);
        setIntField(term99746, term99746.getClass(), "endLineno", 0);
        setField(term99746, term99746.getClass(), "functions", null);
        setField(term99746, term99746.getClass(), "regexps", null);
        setField(term99746, term99746.getClass(), "itsVariables", null);
        setField(term99746, term99746.getClass(), "itsConst", null);
        setField(term99746, term99746.getClass(), "itsVariableNames", null);
        setIntField(term99746, term99746.getClass(), "varStart", 0);
        setField(term99746, term99746.getClass(), "compilerData", null);
        setIntField(term99746, term99746.getClass(), "type", 52);
        setIntField(term99756, term99756.getClass(), "type", 0);
        setField(term99756, term99756.getClass(), "next", null);
        setField(term99756, term99756.getClass(), "first", null);
        setField(term99756, term99756.getClass(), "last", null);
        setField(term99756, term99756.getClass(), "propListHead", null);
        setIntField(term99756, term99756.getClass(), "sourcePosition", 0);
        setField(term99756, term99756.getClass(), "jsType", null);
        setField(term99756, term99756.getClass(), "parent", null);
        setField(term99746, term99746.getClass(), "next", term99756);
        setField(term99746, term99746.getClass(), "first", term99746);
        setField(term99746, term99746.getClass(), "last", null);
        setField(term99746, term99746.getClass(), "propListHead", null);
        setIntField(term99746, term99746.getClass(), "sourcePosition", 0);
        setField(term99746, term99746.getClass(), "jsType", null);
        setField(term99746, term99746.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term99655;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term99569, args);
        assertTrue(recursiveEquals(term99569, term99790));
        assertTrue(recursiveEquals(term99655, term99791));
        assertTrue(recursiveEquals(retValue, term99746));
    }

};


