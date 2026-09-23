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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102716;
     Object term102802;
     Object term103373;
     Object term103374;
     Object term103336;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102716 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term102802 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term102872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term102802, term102802.getClass(), "first", term102802);
        setField(term102802, term102802.getClass(), "next", term102872);
        setIntField(term102802, term102802.getClass(), "type", 24);
        term103373 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term103373, term103373.getClass(), "currentTraversal", null);
        term103374 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term103375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term103374, term103374.getClass(), "functionName", null);
        setBooleanField(term103374, term103374.getClass(), "itsNeedsActivation", false);
        setIntField(term103374, term103374.getClass(), "itsFunctionType", 0);
        setBooleanField(term103374, term103374.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term103374, term103374.getClass(), "encodedSourceStart", 0);
        setIntField(term103374, term103374.getClass(), "encodedSourceEnd", 0);
        setField(term103374, term103374.getClass(), "sourceName", null);
        setIntField(term103374, term103374.getClass(), "baseLineno", 0);
        setIntField(term103374, term103374.getClass(), "endLineno", 0);
        setField(term103374, term103374.getClass(), "functions", null);
        setField(term103374, term103374.getClass(), "regexps", null);
        setField(term103374, term103374.getClass(), "itsVariables", null);
        setField(term103374, term103374.getClass(), "itsConst", null);
        setField(term103374, term103374.getClass(), "itsVariableNames", null);
        setIntField(term103374, term103374.getClass(), "varStart", 0);
        setField(term103374, term103374.getClass(), "compilerData", null);
        setIntField(term103374, term103374.getClass(), "type", 24);
        setIntField(term103375, term103375.getClass(), "type", 0);
        setField(term103375, term103375.getClass(), "next", null);
        setField(term103375, term103375.getClass(), "first", null);
        setField(term103375, term103375.getClass(), "last", null);
        setField(term103375, term103375.getClass(), "propListHead", null);
        setIntField(term103375, term103375.getClass(), "sourcePosition", 0);
        setField(term103375, term103375.getClass(), "jsType", null);
        setField(term103375, term103375.getClass(), "parent", null);
        setField(term103374, term103374.getClass(), "next", term103375);
        setField(term103374, term103374.getClass(), "first", term103374);
        setField(term103374, term103374.getClass(), "last", null);
        setField(term103374, term103374.getClass(), "propListHead", null);
        setIntField(term103374, term103374.getClass(), "sourcePosition", 0);
        setField(term103374, term103374.getClass(), "jsType", null);
        setField(term103374, term103374.getClass(), "parent", null);
        term103336 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term103346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term103336, term103336.getClass(), "functionName", null);
        setBooleanField(term103336, term103336.getClass(), "itsNeedsActivation", false);
        setIntField(term103336, term103336.getClass(), "itsFunctionType", 0);
        setBooleanField(term103336, term103336.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term103336, term103336.getClass(), "encodedSourceStart", 0);
        setIntField(term103336, term103336.getClass(), "encodedSourceEnd", 0);
        setField(term103336, term103336.getClass(), "sourceName", null);
        setIntField(term103336, term103336.getClass(), "baseLineno", 0);
        setIntField(term103336, term103336.getClass(), "endLineno", 0);
        setField(term103336, term103336.getClass(), "functions", null);
        setField(term103336, term103336.getClass(), "regexps", null);
        setField(term103336, term103336.getClass(), "itsVariables", null);
        setField(term103336, term103336.getClass(), "itsConst", null);
        setField(term103336, term103336.getClass(), "itsVariableNames", null);
        setIntField(term103336, term103336.getClass(), "varStart", 0);
        setField(term103336, term103336.getClass(), "compilerData", null);
        setIntField(term103336, term103336.getClass(), "type", 24);
        setIntField(term103346, term103346.getClass(), "type", 0);
        setField(term103346, term103346.getClass(), "next", null);
        setField(term103346, term103346.getClass(), "first", null);
        setField(term103346, term103346.getClass(), "last", null);
        setField(term103346, term103346.getClass(), "propListHead", null);
        setIntField(term103346, term103346.getClass(), "sourcePosition", 0);
        setField(term103346, term103346.getClass(), "jsType", null);
        setField(term103346, term103346.getClass(), "parent", null);
        setField(term103336, term103336.getClass(), "next", term103346);
        setField(term103336, term103336.getClass(), "first", term103336);
        setField(term103336, term103336.getClass(), "last", null);
        setField(term103336, term103336.getClass(), "propListHead", null);
        setIntField(term103336, term103336.getClass(), "sourcePosition", 0);
        setField(term103336, term103336.getClass(), "jsType", null);
        setField(term103336, term103336.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term102802;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term102716, args);
        assertTrue(recursiveEquals(term102716, term103373));
        assertTrue(recursiveEquals(term102802, term103374));
        assertTrue(recursiveEquals(retValue, term103336));
    }

};


