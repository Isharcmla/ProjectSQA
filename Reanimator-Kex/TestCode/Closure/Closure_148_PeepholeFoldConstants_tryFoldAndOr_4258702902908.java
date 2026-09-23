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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902908 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term849721;
     Object term849807;
     Object term849985;
     Object term850055;
     Object term850557;
     Object term850558;
     Object term850560;
     Object term850561;
     Object term850485;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902908() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term849721 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term849807 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term849893 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term849893, term849893.getClass(), "type", 98);
        setField(term849807, term849807.getClass(), "parent", term849893);
        setIntField(term849807, term849807.getClass(), "type", 0);
        term849985 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term849985, term849985.getClass(), "type", 0);
        term850055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term850055, term850055.getClass(), "type", 63);
        term850557 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term850557, term850557.getClass(), "currentTraversal", null);
        term850558 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term850559 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term850558, term850558.getClass(), "functionName", null);
        setBooleanField(term850558, term850558.getClass(), "itsNeedsActivation", false);
        setIntField(term850558, term850558.getClass(), "itsFunctionType", 0);
        setBooleanField(term850558, term850558.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term850558, term850558.getClass(), "encodedSourceStart", 0);
        setIntField(term850558, term850558.getClass(), "encodedSourceEnd", 0);
        setField(term850558, term850558.getClass(), "sourceName", null);
        setIntField(term850558, term850558.getClass(), "baseLineno", 0);
        setIntField(term850558, term850558.getClass(), "endLineno", 0);
        setField(term850558, term850558.getClass(), "functions", null);
        setField(term850558, term850558.getClass(), "regexps", null);
        setField(term850558, term850558.getClass(), "itsVariables", null);
        setField(term850558, term850558.getClass(), "itsConst", null);
        setField(term850558, term850558.getClass(), "itsVariableNames", null);
        setIntField(term850558, term850558.getClass(), "varStart", 0);
        setField(term850558, term850558.getClass(), "compilerData", null);
        setIntField(term850558, term850558.getClass(), "type", 0);
        setField(term850558, term850558.getClass(), "next", null);
        setField(term850558, term850558.getClass(), "first", null);
        setField(term850558, term850558.getClass(), "last", null);
        setField(term850558, term850558.getClass(), "propListHead", null);
        setIntField(term850558, term850558.getClass(), "sourcePosition", 0);
        setField(term850558, term850558.getClass(), "jsType", null);
        setField(term850559, term850559.getClass(), "functionName", null);
        setBooleanField(term850559, term850559.getClass(), "itsNeedsActivation", false);
        setIntField(term850559, term850559.getClass(), "itsFunctionType", 0);
        setBooleanField(term850559, term850559.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term850559, term850559.getClass(), "encodedSourceStart", 0);
        setIntField(term850559, term850559.getClass(), "encodedSourceEnd", 0);
        setField(term850559, term850559.getClass(), "sourceName", null);
        setIntField(term850559, term850559.getClass(), "baseLineno", 0);
        setIntField(term850559, term850559.getClass(), "endLineno", 0);
        setField(term850559, term850559.getClass(), "functions", null);
        setField(term850559, term850559.getClass(), "regexps", null);
        setField(term850559, term850559.getClass(), "itsVariables", null);
        setField(term850559, term850559.getClass(), "itsConst", null);
        setField(term850559, term850559.getClass(), "itsVariableNames", null);
        setIntField(term850559, term850559.getClass(), "varStart", 0);
        setField(term850559, term850559.getClass(), "compilerData", null);
        setIntField(term850559, term850559.getClass(), "type", 98);
        setField(term850559, term850559.getClass(), "next", null);
        setField(term850559, term850559.getClass(), "first", null);
        setField(term850559, term850559.getClass(), "last", null);
        setField(term850559, term850559.getClass(), "propListHead", null);
        setIntField(term850559, term850559.getClass(), "sourcePosition", 0);
        setField(term850559, term850559.getClass(), "jsType", null);
        setField(term850559, term850559.getClass(), "parent", null);
        setField(term850558, term850558.getClass(), "parent", term850559);
        term850560 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term850560, term850560.getClass(), "str", null);
        setIntField(term850560, term850560.getClass(), "type", 0);
        setField(term850560, term850560.getClass(), "next", null);
        setField(term850560, term850560.getClass(), "first", null);
        setField(term850560, term850560.getClass(), "last", null);
        setField(term850560, term850560.getClass(), "propListHead", null);
        setIntField(term850560, term850560.getClass(), "sourcePosition", 0);
        setField(term850560, term850560.getClass(), "jsType", null);
        setField(term850560, term850560.getClass(), "parent", null);
        term850561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term850561, term850561.getClass(), "type", 63);
        setField(term850561, term850561.getClass(), "next", null);
        setField(term850561, term850561.getClass(), "first", null);
        setField(term850561, term850561.getClass(), "last", null);
        setField(term850561, term850561.getClass(), "propListHead", null);
        setIntField(term850561, term850561.getClass(), "sourcePosition", 0);
        setField(term850561, term850561.getClass(), "jsType", null);
        setField(term850561, term850561.getClass(), "parent", null);
        term850485 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term850496 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term850485, term850485.getClass(), "functionName", null);
        setBooleanField(term850485, term850485.getClass(), "itsNeedsActivation", false);
        setIntField(term850485, term850485.getClass(), "itsFunctionType", 0);
        setBooleanField(term850485, term850485.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term850485, term850485.getClass(), "encodedSourceStart", 0);
        setIntField(term850485, term850485.getClass(), "encodedSourceEnd", 0);
        setField(term850485, term850485.getClass(), "sourceName", null);
        setIntField(term850485, term850485.getClass(), "baseLineno", 0);
        setIntField(term850485, term850485.getClass(), "endLineno", 0);
        setField(term850485, term850485.getClass(), "functions", null);
        setField(term850485, term850485.getClass(), "regexps", null);
        setField(term850485, term850485.getClass(), "itsVariables", null);
        setField(term850485, term850485.getClass(), "itsConst", null);
        setField(term850485, term850485.getClass(), "itsVariableNames", null);
        setIntField(term850485, term850485.getClass(), "varStart", 0);
        setField(term850485, term850485.getClass(), "compilerData", null);
        setIntField(term850485, term850485.getClass(), "type", 0);
        setField(term850485, term850485.getClass(), "next", null);
        setField(term850485, term850485.getClass(), "first", null);
        setField(term850485, term850485.getClass(), "last", null);
        setField(term850485, term850485.getClass(), "propListHead", null);
        setIntField(term850485, term850485.getClass(), "sourcePosition", 0);
        setField(term850485, term850485.getClass(), "jsType", null);
        setField(term850496, term850496.getClass(), "functionName", null);
        setBooleanField(term850496, term850496.getClass(), "itsNeedsActivation", false);
        setIntField(term850496, term850496.getClass(), "itsFunctionType", 0);
        setBooleanField(term850496, term850496.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term850496, term850496.getClass(), "encodedSourceStart", 0);
        setIntField(term850496, term850496.getClass(), "encodedSourceEnd", 0);
        setField(term850496, term850496.getClass(), "sourceName", null);
        setIntField(term850496, term850496.getClass(), "baseLineno", 0);
        setIntField(term850496, term850496.getClass(), "endLineno", 0);
        setField(term850496, term850496.getClass(), "functions", null);
        setField(term850496, term850496.getClass(), "regexps", null);
        setField(term850496, term850496.getClass(), "itsVariables", null);
        setField(term850496, term850496.getClass(), "itsConst", null);
        setField(term850496, term850496.getClass(), "itsVariableNames", null);
        setIntField(term850496, term850496.getClass(), "varStart", 0);
        setField(term850496, term850496.getClass(), "compilerData", null);
        setIntField(term850496, term850496.getClass(), "type", 98);
        setField(term850496, term850496.getClass(), "next", null);
        setField(term850496, term850496.getClass(), "first", null);
        setField(term850496, term850496.getClass(), "last", null);
        setField(term850496, term850496.getClass(), "propListHead", null);
        setIntField(term850496, term850496.getClass(), "sourcePosition", 0);
        setField(term850496, term850496.getClass(), "jsType", null);
        setField(term850496, term850496.getClass(), "parent", null);
        setField(term850485, term850485.getClass(), "parent", term850496);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term849807;
        args[1] = term849985;
        args[2] = term850055;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term849721, args);
        assertTrue(recursiveEquals(term849721, term850557));
        assertTrue(recursiveEquals(term849807, term850558));
        assertTrue(recursiveEquals(term849985, term850560));
        assertTrue(recursiveEquals(term850055, term850561));
        assertTrue(recursiveEquals(retValue, term850485));
    }

};


