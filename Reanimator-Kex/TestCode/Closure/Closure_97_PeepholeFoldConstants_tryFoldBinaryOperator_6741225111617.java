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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term626437;
     Object term626523;
     Object term651726;
     Object term651727;
     Object term651641;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term626437 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term626523 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term626593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term626523, term626523.getClass(), "first", term626523);
        setField(term626523, term626523.getClass(), "next", term626593);
        setIntField(term626523, term626523.getClass(), "type", 17);
        term651726 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term651726, term651726.getClass(), "currentTraversal", null);
        term651727 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term651728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term651727, term651727.getClass(), "functionName", null);
        setBooleanField(term651727, term651727.getClass(), "itsNeedsActivation", false);
        setIntField(term651727, term651727.getClass(), "itsFunctionType", 0);
        setBooleanField(term651727, term651727.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term651727, term651727.getClass(), "encodedSourceStart", 0);
        setIntField(term651727, term651727.getClass(), "encodedSourceEnd", 0);
        setField(term651727, term651727.getClass(), "sourceName", null);
        setIntField(term651727, term651727.getClass(), "baseLineno", 0);
        setIntField(term651727, term651727.getClass(), "endLineno", 0);
        setField(term651727, term651727.getClass(), "functions", null);
        setField(term651727, term651727.getClass(), "regexps", null);
        setField(term651727, term651727.getClass(), "itsVariables", null);
        setField(term651727, term651727.getClass(), "itsConst", null);
        setField(term651727, term651727.getClass(), "itsVariableNames", null);
        setIntField(term651727, term651727.getClass(), "varStart", 0);
        setField(term651727, term651727.getClass(), "compilerData", null);
        setIntField(term651727, term651727.getClass(), "type", 17);
        setIntField(term651728, term651728.getClass(), "type", 0);
        setField(term651728, term651728.getClass(), "next", null);
        setField(term651728, term651728.getClass(), "first", null);
        setField(term651728, term651728.getClass(), "last", null);
        setField(term651728, term651728.getClass(), "propListHead", null);
        setIntField(term651728, term651728.getClass(), "sourcePosition", 0);
        setField(term651728, term651728.getClass(), "jsType", null);
        setField(term651728, term651728.getClass(), "parent", null);
        setField(term651727, term651727.getClass(), "next", term651728);
        setField(term651727, term651727.getClass(), "first", term651727);
        setField(term651727, term651727.getClass(), "last", null);
        setField(term651727, term651727.getClass(), "propListHead", null);
        setIntField(term651727, term651727.getClass(), "sourcePosition", 0);
        setField(term651727, term651727.getClass(), "jsType", null);
        setField(term651727, term651727.getClass(), "parent", null);
        term651641 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term651651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term651641, term651641.getClass(), "functionName", null);
        setBooleanField(term651641, term651641.getClass(), "itsNeedsActivation", false);
        setIntField(term651641, term651641.getClass(), "itsFunctionType", 0);
        setBooleanField(term651641, term651641.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term651641, term651641.getClass(), "encodedSourceStart", 0);
        setIntField(term651641, term651641.getClass(), "encodedSourceEnd", 0);
        setField(term651641, term651641.getClass(), "sourceName", null);
        setIntField(term651641, term651641.getClass(), "baseLineno", 0);
        setIntField(term651641, term651641.getClass(), "endLineno", 0);
        setField(term651641, term651641.getClass(), "functions", null);
        setField(term651641, term651641.getClass(), "regexps", null);
        setField(term651641, term651641.getClass(), "itsVariables", null);
        setField(term651641, term651641.getClass(), "itsConst", null);
        setField(term651641, term651641.getClass(), "itsVariableNames", null);
        setIntField(term651641, term651641.getClass(), "varStart", 0);
        setField(term651641, term651641.getClass(), "compilerData", null);
        setIntField(term651641, term651641.getClass(), "type", 17);
        setIntField(term651651, term651651.getClass(), "type", 0);
        setField(term651651, term651651.getClass(), "next", null);
        setField(term651651, term651651.getClass(), "first", null);
        setField(term651651, term651651.getClass(), "last", null);
        setField(term651651, term651651.getClass(), "propListHead", null);
        setIntField(term651651, term651651.getClass(), "sourcePosition", 0);
        setField(term651651, term651651.getClass(), "jsType", null);
        setField(term651651, term651651.getClass(), "parent", null);
        setField(term651641, term651641.getClass(), "next", term651651);
        setField(term651641, term651641.getClass(), "first", term651641);
        setField(term651641, term651641.getClass(), "last", null);
        setField(term651641, term651641.getClass(), "propListHead", null);
        setIntField(term651641, term651641.getClass(), "sourcePosition", 0);
        setField(term651641, term651641.getClass(), "jsType", null);
        setField(term651641, term651641.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term626523;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term626437, args);
        assertTrue(recursiveEquals(term626437, term651726));
        assertTrue(recursiveEquals(term626523, term651727));
        assertTrue(recursiveEquals(retValue, term651641));
    }

};


