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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term485932;
     Object term486024;
     Object term486762;
     Object term486763;
     Object term486713;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term485932 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term486024 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term486110 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term486180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term486110, term486110.getClass(), "next", term486180);
        setField(term486024, term486024.getClass(), "first", term486110);
        setIntField(term486024, term486024.getClass(), "type", 35);
        term486762 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term486762, term486762.getClass(), "currentTraversal", null);
        term486763 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term486764 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term486765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term486763, term486763.getClass(), "number", 0.0);
        setIntField(term486763, term486763.getClass(), "type", 35);
        setField(term486763, term486763.getClass(), "next", null);
        setField(term486764, term486764.getClass(), "functionName", null);
        setBooleanField(term486764, term486764.getClass(), "itsNeedsActivation", false);
        setIntField(term486764, term486764.getClass(), "itsFunctionType", 0);
        setBooleanField(term486764, term486764.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term486764, term486764.getClass(), "encodedSourceStart", 0);
        setIntField(term486764, term486764.getClass(), "encodedSourceEnd", 0);
        setField(term486764, term486764.getClass(), "sourceName", null);
        setIntField(term486764, term486764.getClass(), "baseLineno", 0);
        setIntField(term486764, term486764.getClass(), "endLineno", 0);
        setField(term486764, term486764.getClass(), "functions", null);
        setField(term486764, term486764.getClass(), "regexps", null);
        setField(term486764, term486764.getClass(), "itsVariables", null);
        setField(term486764, term486764.getClass(), "itsConst", null);
        setField(term486764, term486764.getClass(), "itsVariableNames", null);
        setIntField(term486764, term486764.getClass(), "varStart", 0);
        setField(term486764, term486764.getClass(), "compilerData", null);
        setIntField(term486764, term486764.getClass(), "type", 0);
        setIntField(term486765, term486765.getClass(), "type", 0);
        setField(term486765, term486765.getClass(), "next", null);
        setField(term486765, term486765.getClass(), "first", null);
        setField(term486765, term486765.getClass(), "last", null);
        setField(term486765, term486765.getClass(), "propListHead", null);
        setIntField(term486765, term486765.getClass(), "sourcePosition", 0);
        setField(term486765, term486765.getClass(), "jsType", null);
        setField(term486765, term486765.getClass(), "parent", null);
        setField(term486764, term486764.getClass(), "next", term486765);
        setField(term486764, term486764.getClass(), "first", null);
        setField(term486764, term486764.getClass(), "last", null);
        setField(term486764, term486764.getClass(), "propListHead", null);
        setIntField(term486764, term486764.getClass(), "sourcePosition", 0);
        setField(term486764, term486764.getClass(), "jsType", null);
        setField(term486764, term486764.getClass(), "parent", null);
        setField(term486763, term486763.getClass(), "first", term486764);
        setField(term486763, term486763.getClass(), "last", null);
        setField(term486763, term486763.getClass(), "propListHead", null);
        setIntField(term486763, term486763.getClass(), "sourcePosition", 0);
        setField(term486763, term486763.getClass(), "jsType", null);
        setField(term486763, term486763.getClass(), "parent", null);
        term486713 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term486716 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term486726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term486713, term486713.getClass(), "number", 0.0);
        setIntField(term486713, term486713.getClass(), "type", 35);
        setField(term486713, term486713.getClass(), "next", null);
        setField(term486716, term486716.getClass(), "functionName", null);
        setBooleanField(term486716, term486716.getClass(), "itsNeedsActivation", false);
        setIntField(term486716, term486716.getClass(), "itsFunctionType", 0);
        setBooleanField(term486716, term486716.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term486716, term486716.getClass(), "encodedSourceStart", 0);
        setIntField(term486716, term486716.getClass(), "encodedSourceEnd", 0);
        setField(term486716, term486716.getClass(), "sourceName", null);
        setIntField(term486716, term486716.getClass(), "baseLineno", 0);
        setIntField(term486716, term486716.getClass(), "endLineno", 0);
        setField(term486716, term486716.getClass(), "functions", null);
        setField(term486716, term486716.getClass(), "regexps", null);
        setField(term486716, term486716.getClass(), "itsVariables", null);
        setField(term486716, term486716.getClass(), "itsConst", null);
        setField(term486716, term486716.getClass(), "itsVariableNames", null);
        setIntField(term486716, term486716.getClass(), "varStart", 0);
        setField(term486716, term486716.getClass(), "compilerData", null);
        setIntField(term486716, term486716.getClass(), "type", 0);
        setIntField(term486726, term486726.getClass(), "type", 0);
        setField(term486726, term486726.getClass(), "next", null);
        setField(term486726, term486726.getClass(), "first", null);
        setField(term486726, term486726.getClass(), "last", null);
        setField(term486726, term486726.getClass(), "propListHead", null);
        setIntField(term486726, term486726.getClass(), "sourcePosition", 0);
        setField(term486726, term486726.getClass(), "jsType", null);
        setField(term486726, term486726.getClass(), "parent", null);
        setField(term486716, term486716.getClass(), "next", term486726);
        setField(term486716, term486716.getClass(), "first", null);
        setField(term486716, term486716.getClass(), "last", null);
        setField(term486716, term486716.getClass(), "propListHead", null);
        setIntField(term486716, term486716.getClass(), "sourcePosition", 0);
        setField(term486716, term486716.getClass(), "jsType", null);
        setField(term486716, term486716.getClass(), "parent", null);
        setField(term486713, term486713.getClass(), "first", term486716);
        setField(term486713, term486713.getClass(), "last", null);
        setField(term486713, term486713.getClass(), "propListHead", null);
        setIntField(term486713, term486713.getClass(), "sourcePosition", 0);
        setField(term486713, term486713.getClass(), "jsType", null);
        setField(term486713, term486713.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term486024;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term485932, args);
        assertTrue(recursiveEquals(term485932, term486762));
        assertTrue(recursiveEquals(term486024, term486763));
        assertTrue(recursiveEquals(retValue, term486713));
    }

};


