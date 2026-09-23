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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term391009;
     Object term391095;
     Object term392081;
     Object term392082;
     Object term391988;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term391009 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term391095 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term391165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term391251 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term391165, term391165.getClass(), "next", term391251);
        setIntField(term391165, term391165.getClass(), "type", 0);
        setField(term391095, term391095.getClass(), "first", term391165);
        setIntField(term391095, term391095.getClass(), "type", 101);
        setField(term391095, term391095.getClass(), "parent", null);
        term392081 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term392081, term392081.getClass(), "currentTraversal", null);
        term392082 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term392083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term392084 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term392082, term392082.getClass(), "functionName", null);
        setBooleanField(term392082, term392082.getClass(), "itsNeedsActivation", false);
        setIntField(term392082, term392082.getClass(), "itsFunctionType", 0);
        setBooleanField(term392082, term392082.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term392082, term392082.getClass(), "encodedSourceStart", 0);
        setIntField(term392082, term392082.getClass(), "encodedSourceEnd", 0);
        setField(term392082, term392082.getClass(), "sourceName", null);
        setIntField(term392082, term392082.getClass(), "baseLineno", 0);
        setIntField(term392082, term392082.getClass(), "endLineno", 0);
        setField(term392082, term392082.getClass(), "functions", null);
        setField(term392082, term392082.getClass(), "regexps", null);
        setField(term392082, term392082.getClass(), "itsVariables", null);
        setField(term392082, term392082.getClass(), "itsConst", null);
        setField(term392082, term392082.getClass(), "itsVariableNames", null);
        setIntField(term392082, term392082.getClass(), "varStart", 0);
        setField(term392082, term392082.getClass(), "compilerData", null);
        setIntField(term392082, term392082.getClass(), "type", 101);
        setField(term392082, term392082.getClass(), "next", null);
        setIntField(term392083, term392083.getClass(), "type", 0);
        setField(term392084, term392084.getClass(), "functionName", null);
        setBooleanField(term392084, term392084.getClass(), "itsNeedsActivation", false);
        setIntField(term392084, term392084.getClass(), "itsFunctionType", 0);
        setBooleanField(term392084, term392084.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term392084, term392084.getClass(), "encodedSourceStart", 0);
        setIntField(term392084, term392084.getClass(), "encodedSourceEnd", 0);
        setField(term392084, term392084.getClass(), "sourceName", null);
        setIntField(term392084, term392084.getClass(), "baseLineno", 0);
        setIntField(term392084, term392084.getClass(), "endLineno", 0);
        setField(term392084, term392084.getClass(), "functions", null);
        setField(term392084, term392084.getClass(), "regexps", null);
        setField(term392084, term392084.getClass(), "itsVariables", null);
        setField(term392084, term392084.getClass(), "itsConst", null);
        setField(term392084, term392084.getClass(), "itsVariableNames", null);
        setIntField(term392084, term392084.getClass(), "varStart", 0);
        setField(term392084, term392084.getClass(), "compilerData", null);
        setIntField(term392084, term392084.getClass(), "type", 0);
        setField(term392084, term392084.getClass(), "next", null);
        setField(term392084, term392084.getClass(), "first", null);
        setField(term392084, term392084.getClass(), "last", null);
        setField(term392084, term392084.getClass(), "propListHead", null);
        setIntField(term392084, term392084.getClass(), "sourcePosition", 0);
        setField(term392084, term392084.getClass(), "jsType", null);
        setField(term392084, term392084.getClass(), "parent", null);
        setField(term392083, term392083.getClass(), "next", term392084);
        setField(term392083, term392083.getClass(), "first", null);
        setField(term392083, term392083.getClass(), "last", null);
        setField(term392083, term392083.getClass(), "propListHead", null);
        setIntField(term392083, term392083.getClass(), "sourcePosition", 0);
        setField(term392083, term392083.getClass(), "jsType", null);
        setField(term392083, term392083.getClass(), "parent", null);
        setField(term392082, term392082.getClass(), "first", term392083);
        setField(term392082, term392082.getClass(), "last", null);
        setField(term392082, term392082.getClass(), "propListHead", null);
        setIntField(term392082, term392082.getClass(), "sourcePosition", 0);
        setField(term392082, term392082.getClass(), "jsType", null);
        setField(term392082, term392082.getClass(), "parent", null);
        term391988 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term391998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term392000 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term391988, term391988.getClass(), "functionName", null);
        setBooleanField(term391988, term391988.getClass(), "itsNeedsActivation", false);
        setIntField(term391988, term391988.getClass(), "itsFunctionType", 0);
        setBooleanField(term391988, term391988.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term391988, term391988.getClass(), "encodedSourceStart", 0);
        setIntField(term391988, term391988.getClass(), "encodedSourceEnd", 0);
        setField(term391988, term391988.getClass(), "sourceName", null);
        setIntField(term391988, term391988.getClass(), "baseLineno", 0);
        setIntField(term391988, term391988.getClass(), "endLineno", 0);
        setField(term391988, term391988.getClass(), "functions", null);
        setField(term391988, term391988.getClass(), "regexps", null);
        setField(term391988, term391988.getClass(), "itsVariables", null);
        setField(term391988, term391988.getClass(), "itsConst", null);
        setField(term391988, term391988.getClass(), "itsVariableNames", null);
        setIntField(term391988, term391988.getClass(), "varStart", 0);
        setField(term391988, term391988.getClass(), "compilerData", null);
        setIntField(term391988, term391988.getClass(), "type", 101);
        setField(term391988, term391988.getClass(), "next", null);
        setIntField(term391998, term391998.getClass(), "type", 0);
        setField(term392000, term392000.getClass(), "functionName", null);
        setBooleanField(term392000, term392000.getClass(), "itsNeedsActivation", false);
        setIntField(term392000, term392000.getClass(), "itsFunctionType", 0);
        setBooleanField(term392000, term392000.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term392000, term392000.getClass(), "encodedSourceStart", 0);
        setIntField(term392000, term392000.getClass(), "encodedSourceEnd", 0);
        setField(term392000, term392000.getClass(), "sourceName", null);
        setIntField(term392000, term392000.getClass(), "baseLineno", 0);
        setIntField(term392000, term392000.getClass(), "endLineno", 0);
        setField(term392000, term392000.getClass(), "functions", null);
        setField(term392000, term392000.getClass(), "regexps", null);
        setField(term392000, term392000.getClass(), "itsVariables", null);
        setField(term392000, term392000.getClass(), "itsConst", null);
        setField(term392000, term392000.getClass(), "itsVariableNames", null);
        setIntField(term392000, term392000.getClass(), "varStart", 0);
        setField(term392000, term392000.getClass(), "compilerData", null);
        setIntField(term392000, term392000.getClass(), "type", 0);
        setField(term392000, term392000.getClass(), "next", null);
        setField(term392000, term392000.getClass(), "first", null);
        setField(term392000, term392000.getClass(), "last", null);
        setField(term392000, term392000.getClass(), "propListHead", null);
        setIntField(term392000, term392000.getClass(), "sourcePosition", 0);
        setField(term392000, term392000.getClass(), "jsType", null);
        setField(term392000, term392000.getClass(), "parent", null);
        setField(term391998, term391998.getClass(), "next", term392000);
        setField(term391998, term391998.getClass(), "first", null);
        setField(term391998, term391998.getClass(), "last", null);
        setField(term391998, term391998.getClass(), "propListHead", null);
        setIntField(term391998, term391998.getClass(), "sourcePosition", 0);
        setField(term391998, term391998.getClass(), "jsType", null);
        setField(term391998, term391998.getClass(), "parent", null);
        setField(term391988, term391988.getClass(), "first", term391998);
        setField(term391988, term391988.getClass(), "last", null);
        setField(term391988, term391988.getClass(), "propListHead", null);
        setIntField(term391988, term391988.getClass(), "sourcePosition", 0);
        setField(term391988, term391988.getClass(), "jsType", null);
        setField(term391988, term391988.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term391095;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term391009, args);
        assertTrue(recursiveEquals(term391009, term392081));
        assertTrue(recursiveEquals(term391095, term392082));
        assertTrue(recursiveEquals(retValue, term391988));
    }

};


