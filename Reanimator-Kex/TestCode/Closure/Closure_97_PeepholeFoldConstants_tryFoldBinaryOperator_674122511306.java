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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61292;
     Object term61378;
     Object term61645;
     Object term61646;
     Object term61586;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61292 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term61378 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term61464 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term61534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term61464, term61464.getClass(), "next", term61534);
        setField(term61378, term61378.getClass(), "first", term61464);
        setIntField(term61378, term61378.getClass(), "type", 19);
        term61645 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term61645, term61645.getClass(), "currentTraversal", null);
        term61646 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term61647 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term61648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term61646, term61646.getClass(), "functionName", null);
        setBooleanField(term61646, term61646.getClass(), "itsNeedsActivation", false);
        setIntField(term61646, term61646.getClass(), "itsFunctionType", 0);
        setBooleanField(term61646, term61646.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term61646, term61646.getClass(), "encodedSourceStart", 0);
        setIntField(term61646, term61646.getClass(), "encodedSourceEnd", 0);
        setField(term61646, term61646.getClass(), "sourceName", null);
        setIntField(term61646, term61646.getClass(), "baseLineno", 0);
        setIntField(term61646, term61646.getClass(), "endLineno", 0);
        setField(term61646, term61646.getClass(), "functions", null);
        setField(term61646, term61646.getClass(), "regexps", null);
        setField(term61646, term61646.getClass(), "itsVariables", null);
        setField(term61646, term61646.getClass(), "itsConst", null);
        setField(term61646, term61646.getClass(), "itsVariableNames", null);
        setIntField(term61646, term61646.getClass(), "varStart", 0);
        setField(term61646, term61646.getClass(), "compilerData", null);
        setIntField(term61646, term61646.getClass(), "type", 19);
        setField(term61646, term61646.getClass(), "next", null);
        setField(term61647, term61647.getClass(), "functionName", null);
        setBooleanField(term61647, term61647.getClass(), "itsNeedsActivation", false);
        setIntField(term61647, term61647.getClass(), "itsFunctionType", 0);
        setBooleanField(term61647, term61647.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term61647, term61647.getClass(), "encodedSourceStart", 0);
        setIntField(term61647, term61647.getClass(), "encodedSourceEnd", 0);
        setField(term61647, term61647.getClass(), "sourceName", null);
        setIntField(term61647, term61647.getClass(), "baseLineno", 0);
        setIntField(term61647, term61647.getClass(), "endLineno", 0);
        setField(term61647, term61647.getClass(), "functions", null);
        setField(term61647, term61647.getClass(), "regexps", null);
        setField(term61647, term61647.getClass(), "itsVariables", null);
        setField(term61647, term61647.getClass(), "itsConst", null);
        setField(term61647, term61647.getClass(), "itsVariableNames", null);
        setIntField(term61647, term61647.getClass(), "varStart", 0);
        setField(term61647, term61647.getClass(), "compilerData", null);
        setIntField(term61647, term61647.getClass(), "type", 0);
        setIntField(term61648, term61648.getClass(), "type", 0);
        setField(term61648, term61648.getClass(), "next", null);
        setField(term61648, term61648.getClass(), "first", null);
        setField(term61648, term61648.getClass(), "last", null);
        setField(term61648, term61648.getClass(), "propListHead", null);
        setIntField(term61648, term61648.getClass(), "sourcePosition", 0);
        setField(term61648, term61648.getClass(), "jsType", null);
        setField(term61648, term61648.getClass(), "parent", null);
        setField(term61647, term61647.getClass(), "next", term61648);
        setField(term61647, term61647.getClass(), "first", null);
        setField(term61647, term61647.getClass(), "last", null);
        setField(term61647, term61647.getClass(), "propListHead", null);
        setIntField(term61647, term61647.getClass(), "sourcePosition", 0);
        setField(term61647, term61647.getClass(), "jsType", null);
        setField(term61647, term61647.getClass(), "parent", null);
        setField(term61646, term61646.getClass(), "first", term61647);
        setField(term61646, term61646.getClass(), "last", null);
        setField(term61646, term61646.getClass(), "propListHead", null);
        setIntField(term61646, term61646.getClass(), "sourcePosition", 0);
        setField(term61646, term61646.getClass(), "jsType", null);
        setField(term61646, term61646.getClass(), "parent", null);
        term61586 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term61596 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term61606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term61586, term61586.getClass(), "functionName", null);
        setBooleanField(term61586, term61586.getClass(), "itsNeedsActivation", false);
        setIntField(term61586, term61586.getClass(), "itsFunctionType", 0);
        setBooleanField(term61586, term61586.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term61586, term61586.getClass(), "encodedSourceStart", 0);
        setIntField(term61586, term61586.getClass(), "encodedSourceEnd", 0);
        setField(term61586, term61586.getClass(), "sourceName", null);
        setIntField(term61586, term61586.getClass(), "baseLineno", 0);
        setIntField(term61586, term61586.getClass(), "endLineno", 0);
        setField(term61586, term61586.getClass(), "functions", null);
        setField(term61586, term61586.getClass(), "regexps", null);
        setField(term61586, term61586.getClass(), "itsVariables", null);
        setField(term61586, term61586.getClass(), "itsConst", null);
        setField(term61586, term61586.getClass(), "itsVariableNames", null);
        setIntField(term61586, term61586.getClass(), "varStart", 0);
        setField(term61586, term61586.getClass(), "compilerData", null);
        setIntField(term61586, term61586.getClass(), "type", 19);
        setField(term61586, term61586.getClass(), "next", null);
        setField(term61596, term61596.getClass(), "functionName", null);
        setBooleanField(term61596, term61596.getClass(), "itsNeedsActivation", false);
        setIntField(term61596, term61596.getClass(), "itsFunctionType", 0);
        setBooleanField(term61596, term61596.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term61596, term61596.getClass(), "encodedSourceStart", 0);
        setIntField(term61596, term61596.getClass(), "encodedSourceEnd", 0);
        setField(term61596, term61596.getClass(), "sourceName", null);
        setIntField(term61596, term61596.getClass(), "baseLineno", 0);
        setIntField(term61596, term61596.getClass(), "endLineno", 0);
        setField(term61596, term61596.getClass(), "functions", null);
        setField(term61596, term61596.getClass(), "regexps", null);
        setField(term61596, term61596.getClass(), "itsVariables", null);
        setField(term61596, term61596.getClass(), "itsConst", null);
        setField(term61596, term61596.getClass(), "itsVariableNames", null);
        setIntField(term61596, term61596.getClass(), "varStart", 0);
        setField(term61596, term61596.getClass(), "compilerData", null);
        setIntField(term61596, term61596.getClass(), "type", 0);
        setIntField(term61606, term61606.getClass(), "type", 0);
        setField(term61606, term61606.getClass(), "next", null);
        setField(term61606, term61606.getClass(), "first", null);
        setField(term61606, term61606.getClass(), "last", null);
        setField(term61606, term61606.getClass(), "propListHead", null);
        setIntField(term61606, term61606.getClass(), "sourcePosition", 0);
        setField(term61606, term61606.getClass(), "jsType", null);
        setField(term61606, term61606.getClass(), "parent", null);
        setField(term61596, term61596.getClass(), "next", term61606);
        setField(term61596, term61596.getClass(), "first", null);
        setField(term61596, term61596.getClass(), "last", null);
        setField(term61596, term61596.getClass(), "propListHead", null);
        setIntField(term61596, term61596.getClass(), "sourcePosition", 0);
        setField(term61596, term61596.getClass(), "jsType", null);
        setField(term61596, term61596.getClass(), "parent", null);
        setField(term61586, term61586.getClass(), "first", term61596);
        setField(term61586, term61586.getClass(), "last", null);
        setField(term61586, term61586.getClass(), "propListHead", null);
        setIntField(term61586, term61586.getClass(), "sourcePosition", 0);
        setField(term61586, term61586.getClass(), "jsType", null);
        setField(term61586, term61586.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term61378;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term61292, args);
        assertTrue(recursiveEquals(term61292, term61645));
        assertTrue(recursiveEquals(term61378, term61646));
        assertTrue(recursiveEquals(retValue, term61586));
    }

};


