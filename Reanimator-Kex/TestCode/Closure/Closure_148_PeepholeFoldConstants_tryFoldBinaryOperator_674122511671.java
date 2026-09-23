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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148090;
     Object term148176;
     Object term149072;
     Object term149073;
     Object term148996;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148090 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term148176 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term148262 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term148332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term148262, term148262.getClass(), "next", term148332);
        setField(term148176, term148176.getClass(), "first", term148262);
        setIntField(term148176, term148176.getClass(), "type", 14);
        term149072 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term149072, term149072.getClass(), "currentTraversal", null);
        term149073 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term149074 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term149075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term149073, term149073.getClass(), "functionName", null);
        setBooleanField(term149073, term149073.getClass(), "itsNeedsActivation", false);
        setIntField(term149073, term149073.getClass(), "itsFunctionType", 0);
        setBooleanField(term149073, term149073.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term149073, term149073.getClass(), "encodedSourceStart", 0);
        setIntField(term149073, term149073.getClass(), "encodedSourceEnd", 0);
        setField(term149073, term149073.getClass(), "sourceName", null);
        setIntField(term149073, term149073.getClass(), "baseLineno", 0);
        setIntField(term149073, term149073.getClass(), "endLineno", 0);
        setField(term149073, term149073.getClass(), "functions", null);
        setField(term149073, term149073.getClass(), "regexps", null);
        setField(term149073, term149073.getClass(), "itsVariables", null);
        setField(term149073, term149073.getClass(), "itsConst", null);
        setField(term149073, term149073.getClass(), "itsVariableNames", null);
        setIntField(term149073, term149073.getClass(), "varStart", 0);
        setField(term149073, term149073.getClass(), "compilerData", null);
        setIntField(term149073, term149073.getClass(), "type", 14);
        setField(term149073, term149073.getClass(), "next", null);
        setField(term149074, term149074.getClass(), "functionName", null);
        setBooleanField(term149074, term149074.getClass(), "itsNeedsActivation", false);
        setIntField(term149074, term149074.getClass(), "itsFunctionType", 0);
        setBooleanField(term149074, term149074.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term149074, term149074.getClass(), "encodedSourceStart", 0);
        setIntField(term149074, term149074.getClass(), "encodedSourceEnd", 0);
        setField(term149074, term149074.getClass(), "sourceName", null);
        setIntField(term149074, term149074.getClass(), "baseLineno", 0);
        setIntField(term149074, term149074.getClass(), "endLineno", 0);
        setField(term149074, term149074.getClass(), "functions", null);
        setField(term149074, term149074.getClass(), "regexps", null);
        setField(term149074, term149074.getClass(), "itsVariables", null);
        setField(term149074, term149074.getClass(), "itsConst", null);
        setField(term149074, term149074.getClass(), "itsVariableNames", null);
        setIntField(term149074, term149074.getClass(), "varStart", 0);
        setField(term149074, term149074.getClass(), "compilerData", null);
        setIntField(term149074, term149074.getClass(), "type", 0);
        setIntField(term149075, term149075.getClass(), "type", 0);
        setField(term149075, term149075.getClass(), "next", null);
        setField(term149075, term149075.getClass(), "first", null);
        setField(term149075, term149075.getClass(), "last", null);
        setField(term149075, term149075.getClass(), "propListHead", null);
        setIntField(term149075, term149075.getClass(), "sourcePosition", 0);
        setField(term149075, term149075.getClass(), "jsType", null);
        setField(term149075, term149075.getClass(), "parent", null);
        setField(term149074, term149074.getClass(), "next", term149075);
        setField(term149074, term149074.getClass(), "first", null);
        setField(term149074, term149074.getClass(), "last", null);
        setField(term149074, term149074.getClass(), "propListHead", null);
        setIntField(term149074, term149074.getClass(), "sourcePosition", 0);
        setField(term149074, term149074.getClass(), "jsType", null);
        setField(term149074, term149074.getClass(), "parent", null);
        setField(term149073, term149073.getClass(), "first", term149074);
        setField(term149073, term149073.getClass(), "last", null);
        setField(term149073, term149073.getClass(), "propListHead", null);
        setIntField(term149073, term149073.getClass(), "sourcePosition", 0);
        setField(term149073, term149073.getClass(), "jsType", null);
        setField(term149073, term149073.getClass(), "parent", null);
        term148996 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term149006 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term149016 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term148996, term148996.getClass(), "functionName", null);
        setBooleanField(term148996, term148996.getClass(), "itsNeedsActivation", false);
        setIntField(term148996, term148996.getClass(), "itsFunctionType", 0);
        setBooleanField(term148996, term148996.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term148996, term148996.getClass(), "encodedSourceStart", 0);
        setIntField(term148996, term148996.getClass(), "encodedSourceEnd", 0);
        setField(term148996, term148996.getClass(), "sourceName", null);
        setIntField(term148996, term148996.getClass(), "baseLineno", 0);
        setIntField(term148996, term148996.getClass(), "endLineno", 0);
        setField(term148996, term148996.getClass(), "functions", null);
        setField(term148996, term148996.getClass(), "regexps", null);
        setField(term148996, term148996.getClass(), "itsVariables", null);
        setField(term148996, term148996.getClass(), "itsConst", null);
        setField(term148996, term148996.getClass(), "itsVariableNames", null);
        setIntField(term148996, term148996.getClass(), "varStart", 0);
        setField(term148996, term148996.getClass(), "compilerData", null);
        setIntField(term148996, term148996.getClass(), "type", 14);
        setField(term148996, term148996.getClass(), "next", null);
        setField(term149006, term149006.getClass(), "functionName", null);
        setBooleanField(term149006, term149006.getClass(), "itsNeedsActivation", false);
        setIntField(term149006, term149006.getClass(), "itsFunctionType", 0);
        setBooleanField(term149006, term149006.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term149006, term149006.getClass(), "encodedSourceStart", 0);
        setIntField(term149006, term149006.getClass(), "encodedSourceEnd", 0);
        setField(term149006, term149006.getClass(), "sourceName", null);
        setIntField(term149006, term149006.getClass(), "baseLineno", 0);
        setIntField(term149006, term149006.getClass(), "endLineno", 0);
        setField(term149006, term149006.getClass(), "functions", null);
        setField(term149006, term149006.getClass(), "regexps", null);
        setField(term149006, term149006.getClass(), "itsVariables", null);
        setField(term149006, term149006.getClass(), "itsConst", null);
        setField(term149006, term149006.getClass(), "itsVariableNames", null);
        setIntField(term149006, term149006.getClass(), "varStart", 0);
        setField(term149006, term149006.getClass(), "compilerData", null);
        setIntField(term149006, term149006.getClass(), "type", 0);
        setIntField(term149016, term149016.getClass(), "type", 0);
        setField(term149016, term149016.getClass(), "next", null);
        setField(term149016, term149016.getClass(), "first", null);
        setField(term149016, term149016.getClass(), "last", null);
        setField(term149016, term149016.getClass(), "propListHead", null);
        setIntField(term149016, term149016.getClass(), "sourcePosition", 0);
        setField(term149016, term149016.getClass(), "jsType", null);
        setField(term149016, term149016.getClass(), "parent", null);
        setField(term149006, term149006.getClass(), "next", term149016);
        setField(term149006, term149006.getClass(), "first", null);
        setField(term149006, term149006.getClass(), "last", null);
        setField(term149006, term149006.getClass(), "propListHead", null);
        setIntField(term149006, term149006.getClass(), "sourcePosition", 0);
        setField(term149006, term149006.getClass(), "jsType", null);
        setField(term149006, term149006.getClass(), "parent", null);
        setField(term148996, term148996.getClass(), "first", term149006);
        setField(term148996, term148996.getClass(), "last", null);
        setField(term148996, term148996.getClass(), "propListHead", null);
        setIntField(term148996, term148996.getClass(), "sourcePosition", 0);
        setField(term148996, term148996.getClass(), "jsType", null);
        setField(term148996, term148996.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term148176;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term148090, args);
        assertTrue(recursiveEquals(term148090, term149072));
        assertTrue(recursiveEquals(term148176, term149073));
        assertTrue(recursiveEquals(retValue, term148996));
    }

};


