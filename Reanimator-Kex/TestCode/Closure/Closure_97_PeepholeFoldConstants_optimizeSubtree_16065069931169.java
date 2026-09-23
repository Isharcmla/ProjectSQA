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

public class PeepholeFoldConstants_optimizeSubtree_16065069931169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358933;
     Object term359019;
     Object term359472;
     Object term359473;
     Object term359419;

    public PeepholeFoldConstants_optimizeSubtree_16065069931169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term358933 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term359019 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term359019, term359019.getClass(), "type", 37);
        term359472 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term359472, term359472.getClass(), "currentTraversal", null);
        term359473 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term359473, term359473.getClass(), "functionName", null);
        setBooleanField(term359473, term359473.getClass(), "itsNeedsActivation", false);
        setIntField(term359473, term359473.getClass(), "itsFunctionType", 0);
        setBooleanField(term359473, term359473.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term359473, term359473.getClass(), "encodedSourceStart", 0);
        setIntField(term359473, term359473.getClass(), "encodedSourceEnd", 0);
        setField(term359473, term359473.getClass(), "sourceName", null);
        setIntField(term359473, term359473.getClass(), "baseLineno", 0);
        setIntField(term359473, term359473.getClass(), "endLineno", 0);
        setField(term359473, term359473.getClass(), "functions", null);
        setField(term359473, term359473.getClass(), "regexps", null);
        setField(term359473, term359473.getClass(), "itsVariables", null);
        setField(term359473, term359473.getClass(), "itsConst", null);
        setField(term359473, term359473.getClass(), "itsVariableNames", null);
        setIntField(term359473, term359473.getClass(), "varStart", 0);
        setField(term359473, term359473.getClass(), "compilerData", null);
        setIntField(term359473, term359473.getClass(), "type", 37);
        setField(term359473, term359473.getClass(), "next", null);
        setField(term359473, term359473.getClass(), "first", null);
        setField(term359473, term359473.getClass(), "last", null);
        setField(term359473, term359473.getClass(), "propListHead", null);
        setIntField(term359473, term359473.getClass(), "sourcePosition", 0);
        setField(term359473, term359473.getClass(), "jsType", null);
        setField(term359473, term359473.getClass(), "parent", null);
        term359419 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term359419, term359419.getClass(), "functionName", null);
        setBooleanField(term359419, term359419.getClass(), "itsNeedsActivation", false);
        setIntField(term359419, term359419.getClass(), "itsFunctionType", 0);
        setBooleanField(term359419, term359419.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term359419, term359419.getClass(), "encodedSourceStart", 0);
        setIntField(term359419, term359419.getClass(), "encodedSourceEnd", 0);
        setField(term359419, term359419.getClass(), "sourceName", null);
        setIntField(term359419, term359419.getClass(), "baseLineno", 0);
        setIntField(term359419, term359419.getClass(), "endLineno", 0);
        setField(term359419, term359419.getClass(), "functions", null);
        setField(term359419, term359419.getClass(), "regexps", null);
        setField(term359419, term359419.getClass(), "itsVariables", null);
        setField(term359419, term359419.getClass(), "itsConst", null);
        setField(term359419, term359419.getClass(), "itsVariableNames", null);
        setIntField(term359419, term359419.getClass(), "varStart", 0);
        setField(term359419, term359419.getClass(), "compilerData", null);
        setIntField(term359419, term359419.getClass(), "type", 37);
        setField(term359419, term359419.getClass(), "next", null);
        setField(term359419, term359419.getClass(), "first", null);
        setField(term359419, term359419.getClass(), "last", null);
        setField(term359419, term359419.getClass(), "propListHead", null);
        setIntField(term359419, term359419.getClass(), "sourcePosition", 0);
        setField(term359419, term359419.getClass(), "jsType", null);
        setField(term359419, term359419.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term359019;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term358933, args);
        assertTrue(recursiveEquals(term358933, term359472));
        assertTrue(recursiveEquals(term359019, term359473));
        assertTrue(recursiveEquals(retValue, term359419));
    }

};


