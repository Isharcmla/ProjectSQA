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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83082;
     Object term83168;
     Object term83515;
     Object term83516;
     Object term83456;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83082 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term83168 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term83254 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term83324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term83254, term83254.getClass(), "next", term83324);
        setField(term83168, term83168.getClass(), "first", term83254);
        setIntField(term83168, term83168.getClass(), "type", 18);
        term83515 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term83515, term83515.getClass(), "currentTraversal", null);
        term83516 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term83517 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term83518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term83516, term83516.getClass(), "functionName", null);
        setBooleanField(term83516, term83516.getClass(), "itsNeedsActivation", false);
        setIntField(term83516, term83516.getClass(), "itsFunctionType", 0);
        setBooleanField(term83516, term83516.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term83516, term83516.getClass(), "encodedSourceStart", 0);
        setIntField(term83516, term83516.getClass(), "encodedSourceEnd", 0);
        setField(term83516, term83516.getClass(), "sourceName", null);
        setIntField(term83516, term83516.getClass(), "baseLineno", 0);
        setIntField(term83516, term83516.getClass(), "endLineno", 0);
        setField(term83516, term83516.getClass(), "functions", null);
        setField(term83516, term83516.getClass(), "regexps", null);
        setField(term83516, term83516.getClass(), "itsVariables", null);
        setField(term83516, term83516.getClass(), "itsConst", null);
        setField(term83516, term83516.getClass(), "itsVariableNames", null);
        setIntField(term83516, term83516.getClass(), "varStart", 0);
        setField(term83516, term83516.getClass(), "compilerData", null);
        setIntField(term83516, term83516.getClass(), "type", 18);
        setField(term83516, term83516.getClass(), "next", null);
        setField(term83517, term83517.getClass(), "functionName", null);
        setBooleanField(term83517, term83517.getClass(), "itsNeedsActivation", false);
        setIntField(term83517, term83517.getClass(), "itsFunctionType", 0);
        setBooleanField(term83517, term83517.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term83517, term83517.getClass(), "encodedSourceStart", 0);
        setIntField(term83517, term83517.getClass(), "encodedSourceEnd", 0);
        setField(term83517, term83517.getClass(), "sourceName", null);
        setIntField(term83517, term83517.getClass(), "baseLineno", 0);
        setIntField(term83517, term83517.getClass(), "endLineno", 0);
        setField(term83517, term83517.getClass(), "functions", null);
        setField(term83517, term83517.getClass(), "regexps", null);
        setField(term83517, term83517.getClass(), "itsVariables", null);
        setField(term83517, term83517.getClass(), "itsConst", null);
        setField(term83517, term83517.getClass(), "itsVariableNames", null);
        setIntField(term83517, term83517.getClass(), "varStart", 0);
        setField(term83517, term83517.getClass(), "compilerData", null);
        setIntField(term83517, term83517.getClass(), "type", 0);
        setIntField(term83518, term83518.getClass(), "type", 0);
        setField(term83518, term83518.getClass(), "next", null);
        setField(term83518, term83518.getClass(), "first", null);
        setField(term83518, term83518.getClass(), "last", null);
        setField(term83518, term83518.getClass(), "propListHead", null);
        setIntField(term83518, term83518.getClass(), "sourcePosition", 0);
        setField(term83518, term83518.getClass(), "jsType", null);
        setField(term83518, term83518.getClass(), "parent", null);
        setField(term83517, term83517.getClass(), "next", term83518);
        setField(term83517, term83517.getClass(), "first", null);
        setField(term83517, term83517.getClass(), "last", null);
        setField(term83517, term83517.getClass(), "propListHead", null);
        setIntField(term83517, term83517.getClass(), "sourcePosition", 0);
        setField(term83517, term83517.getClass(), "jsType", null);
        setField(term83517, term83517.getClass(), "parent", null);
        setField(term83516, term83516.getClass(), "first", term83517);
        setField(term83516, term83516.getClass(), "last", null);
        setField(term83516, term83516.getClass(), "propListHead", null);
        setIntField(term83516, term83516.getClass(), "sourcePosition", 0);
        setField(term83516, term83516.getClass(), "jsType", null);
        setField(term83516, term83516.getClass(), "parent", null);
        term83456 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term83466 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term83476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term83456, term83456.getClass(), "functionName", null);
        setBooleanField(term83456, term83456.getClass(), "itsNeedsActivation", false);
        setIntField(term83456, term83456.getClass(), "itsFunctionType", 0);
        setBooleanField(term83456, term83456.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term83456, term83456.getClass(), "encodedSourceStart", 0);
        setIntField(term83456, term83456.getClass(), "encodedSourceEnd", 0);
        setField(term83456, term83456.getClass(), "sourceName", null);
        setIntField(term83456, term83456.getClass(), "baseLineno", 0);
        setIntField(term83456, term83456.getClass(), "endLineno", 0);
        setField(term83456, term83456.getClass(), "functions", null);
        setField(term83456, term83456.getClass(), "regexps", null);
        setField(term83456, term83456.getClass(), "itsVariables", null);
        setField(term83456, term83456.getClass(), "itsConst", null);
        setField(term83456, term83456.getClass(), "itsVariableNames", null);
        setIntField(term83456, term83456.getClass(), "varStart", 0);
        setField(term83456, term83456.getClass(), "compilerData", null);
        setIntField(term83456, term83456.getClass(), "type", 18);
        setField(term83456, term83456.getClass(), "next", null);
        setField(term83466, term83466.getClass(), "functionName", null);
        setBooleanField(term83466, term83466.getClass(), "itsNeedsActivation", false);
        setIntField(term83466, term83466.getClass(), "itsFunctionType", 0);
        setBooleanField(term83466, term83466.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term83466, term83466.getClass(), "encodedSourceStart", 0);
        setIntField(term83466, term83466.getClass(), "encodedSourceEnd", 0);
        setField(term83466, term83466.getClass(), "sourceName", null);
        setIntField(term83466, term83466.getClass(), "baseLineno", 0);
        setIntField(term83466, term83466.getClass(), "endLineno", 0);
        setField(term83466, term83466.getClass(), "functions", null);
        setField(term83466, term83466.getClass(), "regexps", null);
        setField(term83466, term83466.getClass(), "itsVariables", null);
        setField(term83466, term83466.getClass(), "itsConst", null);
        setField(term83466, term83466.getClass(), "itsVariableNames", null);
        setIntField(term83466, term83466.getClass(), "varStart", 0);
        setField(term83466, term83466.getClass(), "compilerData", null);
        setIntField(term83466, term83466.getClass(), "type", 0);
        setIntField(term83476, term83476.getClass(), "type", 0);
        setField(term83476, term83476.getClass(), "next", null);
        setField(term83476, term83476.getClass(), "first", null);
        setField(term83476, term83476.getClass(), "last", null);
        setField(term83476, term83476.getClass(), "propListHead", null);
        setIntField(term83476, term83476.getClass(), "sourcePosition", 0);
        setField(term83476, term83476.getClass(), "jsType", null);
        setField(term83476, term83476.getClass(), "parent", null);
        setField(term83466, term83466.getClass(), "next", term83476);
        setField(term83466, term83466.getClass(), "first", null);
        setField(term83466, term83466.getClass(), "last", null);
        setField(term83466, term83466.getClass(), "propListHead", null);
        setIntField(term83466, term83466.getClass(), "sourcePosition", 0);
        setField(term83466, term83466.getClass(), "jsType", null);
        setField(term83466, term83466.getClass(), "parent", null);
        setField(term83456, term83456.getClass(), "first", term83466);
        setField(term83456, term83456.getClass(), "last", null);
        setField(term83456, term83456.getClass(), "propListHead", null);
        setIntField(term83456, term83456.getClass(), "sourcePosition", 0);
        setField(term83456, term83456.getClass(), "jsType", null);
        setField(term83456, term83456.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term83168;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term83082, args);
        assertTrue(recursiveEquals(term83082, term83515));
        assertTrue(recursiveEquals(term83168, term83516));
        assertTrue(recursiveEquals(retValue, term83456));
    }

};


