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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99818;
     Object term99904;
     Object term100225;
     Object term100226;
     Object term100160;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99818 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term99904 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term99990 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term100082 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term99990, term99990.getClass(), "next", term100082);
        setIntField(term99990, term99990.getClass(), "type", 63);
        setField(term99904, term99904.getClass(), "first", term99990);
        setIntField(term99904, term99904.getClass(), "type", 35);
        term100225 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term100225, term100225.getClass(), "currentTraversal", null);
        term100226 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term100227 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term100228 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term100226, term100226.getClass(), "functionName", null);
        setBooleanField(term100226, term100226.getClass(), "itsNeedsActivation", false);
        setIntField(term100226, term100226.getClass(), "itsFunctionType", 0);
        setBooleanField(term100226, term100226.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term100226, term100226.getClass(), "encodedSourceStart", 0);
        setIntField(term100226, term100226.getClass(), "encodedSourceEnd", 0);
        setField(term100226, term100226.getClass(), "sourceName", null);
        setIntField(term100226, term100226.getClass(), "baseLineno", 0);
        setIntField(term100226, term100226.getClass(), "endLineno", 0);
        setField(term100226, term100226.getClass(), "functions", null);
        setField(term100226, term100226.getClass(), "regexps", null);
        setField(term100226, term100226.getClass(), "itsVariables", null);
        setField(term100226, term100226.getClass(), "itsConst", null);
        setField(term100226, term100226.getClass(), "itsVariableNames", null);
        setIntField(term100226, term100226.getClass(), "varStart", 0);
        setField(term100226, term100226.getClass(), "compilerData", null);
        setIntField(term100226, term100226.getClass(), "type", 35);
        setField(term100226, term100226.getClass(), "next", null);
        setField(term100227, term100227.getClass(), "functionName", null);
        setBooleanField(term100227, term100227.getClass(), "itsNeedsActivation", false);
        setIntField(term100227, term100227.getClass(), "itsFunctionType", 0);
        setBooleanField(term100227, term100227.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term100227, term100227.getClass(), "encodedSourceStart", 0);
        setIntField(term100227, term100227.getClass(), "encodedSourceEnd", 0);
        setField(term100227, term100227.getClass(), "sourceName", null);
        setIntField(term100227, term100227.getClass(), "baseLineno", 0);
        setIntField(term100227, term100227.getClass(), "endLineno", 0);
        setField(term100227, term100227.getClass(), "functions", null);
        setField(term100227, term100227.getClass(), "regexps", null);
        setField(term100227, term100227.getClass(), "itsVariables", null);
        setField(term100227, term100227.getClass(), "itsConst", null);
        setField(term100227, term100227.getClass(), "itsVariableNames", null);
        setIntField(term100227, term100227.getClass(), "varStart", 0);
        setField(term100227, term100227.getClass(), "compilerData", null);
        setIntField(term100227, term100227.getClass(), "type", 63);
        setField(term100228, term100228.getClass(), "str", null);
        setIntField(term100228, term100228.getClass(), "type", 0);
        setField(term100228, term100228.getClass(), "next", null);
        setField(term100228, term100228.getClass(), "first", null);
        setField(term100228, term100228.getClass(), "last", null);
        setField(term100228, term100228.getClass(), "propListHead", null);
        setIntField(term100228, term100228.getClass(), "sourcePosition", 0);
        setField(term100228, term100228.getClass(), "jsType", null);
        setField(term100228, term100228.getClass(), "parent", null);
        setField(term100227, term100227.getClass(), "next", term100228);
        setField(term100227, term100227.getClass(), "first", null);
        setField(term100227, term100227.getClass(), "last", null);
        setField(term100227, term100227.getClass(), "propListHead", null);
        setIntField(term100227, term100227.getClass(), "sourcePosition", 0);
        setField(term100227, term100227.getClass(), "jsType", null);
        setField(term100227, term100227.getClass(), "parent", null);
        setField(term100226, term100226.getClass(), "first", term100227);
        setField(term100226, term100226.getClass(), "last", null);
        setField(term100226, term100226.getClass(), "propListHead", null);
        setIntField(term100226, term100226.getClass(), "sourcePosition", 0);
        setField(term100226, term100226.getClass(), "jsType", null);
        setField(term100226, term100226.getClass(), "parent", null);
        term100160 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term100170 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term100180 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term100160, term100160.getClass(), "functionName", null);
        setBooleanField(term100160, term100160.getClass(), "itsNeedsActivation", false);
        setIntField(term100160, term100160.getClass(), "itsFunctionType", 0);
        setBooleanField(term100160, term100160.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term100160, term100160.getClass(), "encodedSourceStart", 0);
        setIntField(term100160, term100160.getClass(), "encodedSourceEnd", 0);
        setField(term100160, term100160.getClass(), "sourceName", null);
        setIntField(term100160, term100160.getClass(), "baseLineno", 0);
        setIntField(term100160, term100160.getClass(), "endLineno", 0);
        setField(term100160, term100160.getClass(), "functions", null);
        setField(term100160, term100160.getClass(), "regexps", null);
        setField(term100160, term100160.getClass(), "itsVariables", null);
        setField(term100160, term100160.getClass(), "itsConst", null);
        setField(term100160, term100160.getClass(), "itsVariableNames", null);
        setIntField(term100160, term100160.getClass(), "varStart", 0);
        setField(term100160, term100160.getClass(), "compilerData", null);
        setIntField(term100160, term100160.getClass(), "type", 35);
        setField(term100160, term100160.getClass(), "next", null);
        setField(term100170, term100170.getClass(), "functionName", null);
        setBooleanField(term100170, term100170.getClass(), "itsNeedsActivation", false);
        setIntField(term100170, term100170.getClass(), "itsFunctionType", 0);
        setBooleanField(term100170, term100170.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term100170, term100170.getClass(), "encodedSourceStart", 0);
        setIntField(term100170, term100170.getClass(), "encodedSourceEnd", 0);
        setField(term100170, term100170.getClass(), "sourceName", null);
        setIntField(term100170, term100170.getClass(), "baseLineno", 0);
        setIntField(term100170, term100170.getClass(), "endLineno", 0);
        setField(term100170, term100170.getClass(), "functions", null);
        setField(term100170, term100170.getClass(), "regexps", null);
        setField(term100170, term100170.getClass(), "itsVariables", null);
        setField(term100170, term100170.getClass(), "itsConst", null);
        setField(term100170, term100170.getClass(), "itsVariableNames", null);
        setIntField(term100170, term100170.getClass(), "varStart", 0);
        setField(term100170, term100170.getClass(), "compilerData", null);
        setIntField(term100170, term100170.getClass(), "type", 63);
        setField(term100180, term100180.getClass(), "str", null);
        setIntField(term100180, term100180.getClass(), "type", 0);
        setField(term100180, term100180.getClass(), "next", null);
        setField(term100180, term100180.getClass(), "first", null);
        setField(term100180, term100180.getClass(), "last", null);
        setField(term100180, term100180.getClass(), "propListHead", null);
        setIntField(term100180, term100180.getClass(), "sourcePosition", 0);
        setField(term100180, term100180.getClass(), "jsType", null);
        setField(term100180, term100180.getClass(), "parent", null);
        setField(term100170, term100170.getClass(), "next", term100180);
        setField(term100170, term100170.getClass(), "first", null);
        setField(term100170, term100170.getClass(), "last", null);
        setField(term100170, term100170.getClass(), "propListHead", null);
        setIntField(term100170, term100170.getClass(), "sourcePosition", 0);
        setField(term100170, term100170.getClass(), "jsType", null);
        setField(term100170, term100170.getClass(), "parent", null);
        setField(term100160, term100160.getClass(), "first", term100170);
        setField(term100160, term100160.getClass(), "last", null);
        setField(term100160, term100160.getClass(), "propListHead", null);
        setIntField(term100160, term100160.getClass(), "sourcePosition", 0);
        setField(term100160, term100160.getClass(), "jsType", null);
        setField(term100160, term100160.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term99904;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term99818, args);
        assertTrue(recursiveEquals(term99818, term100225));
        assertTrue(recursiveEquals(term99904, term100226));
        assertTrue(recursiveEquals(retValue, term100160));
    }

};


