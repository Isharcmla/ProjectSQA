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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term793211;
     Object term793297;
     Object term793453;
     Object term793539;
     Object term793727;
     Object term793728;
     Object term793730;
     Object term793731;
     Object term793636;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term793211 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term793297 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term793367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term793367, term793367.getClass(), "type", 108);
        setField(term793297, term793297.getClass(), "parent", term793367);
        setIntField(term793297, term793297.getClass(), "type", 0);
        term793453 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term793453, term793453.getClass(), "type", 56);
        term793539 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term793539, term793539.getClass(), "type", 63);
        term793727 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term793727, term793727.getClass(), "currentTraversal", null);
        term793728 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term793729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term793728, term793728.getClass(), "functionName", null);
        setBooleanField(term793728, term793728.getClass(), "itsNeedsActivation", false);
        setIntField(term793728, term793728.getClass(), "itsFunctionType", 0);
        setBooleanField(term793728, term793728.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term793728, term793728.getClass(), "encodedSourceStart", 0);
        setIntField(term793728, term793728.getClass(), "encodedSourceEnd", 0);
        setField(term793728, term793728.getClass(), "sourceName", null);
        setIntField(term793728, term793728.getClass(), "baseLineno", 0);
        setIntField(term793728, term793728.getClass(), "endLineno", 0);
        setField(term793728, term793728.getClass(), "functions", null);
        setField(term793728, term793728.getClass(), "regexps", null);
        setField(term793728, term793728.getClass(), "itsVariables", null);
        setField(term793728, term793728.getClass(), "itsConst", null);
        setField(term793728, term793728.getClass(), "itsVariableNames", null);
        setIntField(term793728, term793728.getClass(), "varStart", 0);
        setField(term793728, term793728.getClass(), "compilerData", null);
        setIntField(term793728, term793728.getClass(), "type", 0);
        setField(term793728, term793728.getClass(), "next", null);
        setField(term793728, term793728.getClass(), "first", null);
        setField(term793728, term793728.getClass(), "last", null);
        setField(term793728, term793728.getClass(), "propListHead", null);
        setIntField(term793728, term793728.getClass(), "sourcePosition", 0);
        setField(term793728, term793728.getClass(), "jsType", null);
        setIntField(term793729, term793729.getClass(), "type", 108);
        setField(term793729, term793729.getClass(), "next", null);
        setField(term793729, term793729.getClass(), "first", null);
        setField(term793729, term793729.getClass(), "last", null);
        setField(term793729, term793729.getClass(), "propListHead", null);
        setIntField(term793729, term793729.getClass(), "sourcePosition", 0);
        setField(term793729, term793729.getClass(), "jsType", null);
        setField(term793729, term793729.getClass(), "parent", null);
        setField(term793728, term793728.getClass(), "parent", term793729);
        term793730 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term793730, term793730.getClass(), "functionName", null);
        setBooleanField(term793730, term793730.getClass(), "itsNeedsActivation", false);
        setIntField(term793730, term793730.getClass(), "itsFunctionType", 0);
        setBooleanField(term793730, term793730.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term793730, term793730.getClass(), "encodedSourceStart", 0);
        setIntField(term793730, term793730.getClass(), "encodedSourceEnd", 0);
        setField(term793730, term793730.getClass(), "sourceName", null);
        setIntField(term793730, term793730.getClass(), "baseLineno", 0);
        setIntField(term793730, term793730.getClass(), "endLineno", 0);
        setField(term793730, term793730.getClass(), "functions", null);
        setField(term793730, term793730.getClass(), "regexps", null);
        setField(term793730, term793730.getClass(), "itsVariables", null);
        setField(term793730, term793730.getClass(), "itsConst", null);
        setField(term793730, term793730.getClass(), "itsVariableNames", null);
        setIntField(term793730, term793730.getClass(), "varStart", 0);
        setField(term793730, term793730.getClass(), "compilerData", null);
        setIntField(term793730, term793730.getClass(), "type", 56);
        setField(term793730, term793730.getClass(), "next", null);
        setField(term793730, term793730.getClass(), "first", null);
        setField(term793730, term793730.getClass(), "last", null);
        setField(term793730, term793730.getClass(), "propListHead", null);
        setIntField(term793730, term793730.getClass(), "sourcePosition", 0);
        setField(term793730, term793730.getClass(), "jsType", null);
        setField(term793730, term793730.getClass(), "parent", null);
        term793731 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term793731, term793731.getClass(), "functionName", null);
        setBooleanField(term793731, term793731.getClass(), "itsNeedsActivation", false);
        setIntField(term793731, term793731.getClass(), "itsFunctionType", 0);
        setBooleanField(term793731, term793731.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term793731, term793731.getClass(), "encodedSourceStart", 0);
        setIntField(term793731, term793731.getClass(), "encodedSourceEnd", 0);
        setField(term793731, term793731.getClass(), "sourceName", null);
        setIntField(term793731, term793731.getClass(), "baseLineno", 0);
        setIntField(term793731, term793731.getClass(), "endLineno", 0);
        setField(term793731, term793731.getClass(), "functions", null);
        setField(term793731, term793731.getClass(), "regexps", null);
        setField(term793731, term793731.getClass(), "itsVariables", null);
        setField(term793731, term793731.getClass(), "itsConst", null);
        setField(term793731, term793731.getClass(), "itsVariableNames", null);
        setIntField(term793731, term793731.getClass(), "varStart", 0);
        setField(term793731, term793731.getClass(), "compilerData", null);
        setIntField(term793731, term793731.getClass(), "type", 63);
        setField(term793731, term793731.getClass(), "next", null);
        setField(term793731, term793731.getClass(), "first", null);
        setField(term793731, term793731.getClass(), "last", null);
        setField(term793731, term793731.getClass(), "propListHead", null);
        setIntField(term793731, term793731.getClass(), "sourcePosition", 0);
        setField(term793731, term793731.getClass(), "jsType", null);
        setField(term793731, term793731.getClass(), "parent", null);
        term793636 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term793647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term793636, term793636.getClass(), "functionName", null);
        setBooleanField(term793636, term793636.getClass(), "itsNeedsActivation", false);
        setIntField(term793636, term793636.getClass(), "itsFunctionType", 0);
        setBooleanField(term793636, term793636.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term793636, term793636.getClass(), "encodedSourceStart", 0);
        setIntField(term793636, term793636.getClass(), "encodedSourceEnd", 0);
        setField(term793636, term793636.getClass(), "sourceName", null);
        setIntField(term793636, term793636.getClass(), "baseLineno", 0);
        setIntField(term793636, term793636.getClass(), "endLineno", 0);
        setField(term793636, term793636.getClass(), "functions", null);
        setField(term793636, term793636.getClass(), "regexps", null);
        setField(term793636, term793636.getClass(), "itsVariables", null);
        setField(term793636, term793636.getClass(), "itsConst", null);
        setField(term793636, term793636.getClass(), "itsVariableNames", null);
        setIntField(term793636, term793636.getClass(), "varStart", 0);
        setField(term793636, term793636.getClass(), "compilerData", null);
        setIntField(term793636, term793636.getClass(), "type", 0);
        setField(term793636, term793636.getClass(), "next", null);
        setField(term793636, term793636.getClass(), "first", null);
        setField(term793636, term793636.getClass(), "last", null);
        setField(term793636, term793636.getClass(), "propListHead", null);
        setIntField(term793636, term793636.getClass(), "sourcePosition", 0);
        setField(term793636, term793636.getClass(), "jsType", null);
        setIntField(term793647, term793647.getClass(), "type", 108);
        setField(term793647, term793647.getClass(), "next", null);
        setField(term793647, term793647.getClass(), "first", null);
        setField(term793647, term793647.getClass(), "last", null);
        setField(term793647, term793647.getClass(), "propListHead", null);
        setIntField(term793647, term793647.getClass(), "sourcePosition", 0);
        setField(term793647, term793647.getClass(), "jsType", null);
        setField(term793647, term793647.getClass(), "parent", null);
        setField(term793636, term793636.getClass(), "parent", term793647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term793297;
        args[1] = term793453;
        args[2] = term793539;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term793211, args);
        assertTrue(recursiveEquals(term793211, term793727));
        assertTrue(recursiveEquals(term793297, term793728));
        assertTrue(recursiveEquals(term793453, term793730));
        assertTrue(recursiveEquals(term793539, term793731));
        assertTrue(recursiveEquals(retValue, term793636));
    }

};


