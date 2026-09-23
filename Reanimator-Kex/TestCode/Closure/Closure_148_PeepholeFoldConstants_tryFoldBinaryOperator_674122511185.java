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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34832;
     Object term34918;
     Object term35581;
     Object term35582;
     Object term35522;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34832 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term34918 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term35004 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term35074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term35004, term35004.getClass(), "next", term35074);
        setField(term34918, term34918.getClass(), "first", term35004);
        setIntField(term34918, term34918.getClass(), "type", 19);
        term35581 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term35581, term35581.getClass(), "currentTraversal", null);
        term35582 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term35583 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term35584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term35582, term35582.getClass(), "functionName", null);
        setBooleanField(term35582, term35582.getClass(), "itsNeedsActivation", false);
        setIntField(term35582, term35582.getClass(), "itsFunctionType", 0);
        setBooleanField(term35582, term35582.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term35582, term35582.getClass(), "encodedSourceStart", 0);
        setIntField(term35582, term35582.getClass(), "encodedSourceEnd", 0);
        setField(term35582, term35582.getClass(), "sourceName", null);
        setIntField(term35582, term35582.getClass(), "baseLineno", 0);
        setIntField(term35582, term35582.getClass(), "endLineno", 0);
        setField(term35582, term35582.getClass(), "functions", null);
        setField(term35582, term35582.getClass(), "regexps", null);
        setField(term35582, term35582.getClass(), "itsVariables", null);
        setField(term35582, term35582.getClass(), "itsConst", null);
        setField(term35582, term35582.getClass(), "itsVariableNames", null);
        setIntField(term35582, term35582.getClass(), "varStart", 0);
        setField(term35582, term35582.getClass(), "compilerData", null);
        setIntField(term35582, term35582.getClass(), "type", 19);
        setField(term35582, term35582.getClass(), "next", null);
        setField(term35583, term35583.getClass(), "functionName", null);
        setBooleanField(term35583, term35583.getClass(), "itsNeedsActivation", false);
        setIntField(term35583, term35583.getClass(), "itsFunctionType", 0);
        setBooleanField(term35583, term35583.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term35583, term35583.getClass(), "encodedSourceStart", 0);
        setIntField(term35583, term35583.getClass(), "encodedSourceEnd", 0);
        setField(term35583, term35583.getClass(), "sourceName", null);
        setIntField(term35583, term35583.getClass(), "baseLineno", 0);
        setIntField(term35583, term35583.getClass(), "endLineno", 0);
        setField(term35583, term35583.getClass(), "functions", null);
        setField(term35583, term35583.getClass(), "regexps", null);
        setField(term35583, term35583.getClass(), "itsVariables", null);
        setField(term35583, term35583.getClass(), "itsConst", null);
        setField(term35583, term35583.getClass(), "itsVariableNames", null);
        setIntField(term35583, term35583.getClass(), "varStart", 0);
        setField(term35583, term35583.getClass(), "compilerData", null);
        setIntField(term35583, term35583.getClass(), "type", 0);
        setIntField(term35584, term35584.getClass(), "type", 0);
        setField(term35584, term35584.getClass(), "next", null);
        setField(term35584, term35584.getClass(), "first", null);
        setField(term35584, term35584.getClass(), "last", null);
        setField(term35584, term35584.getClass(), "propListHead", null);
        setIntField(term35584, term35584.getClass(), "sourcePosition", 0);
        setField(term35584, term35584.getClass(), "jsType", null);
        setField(term35584, term35584.getClass(), "parent", null);
        setField(term35583, term35583.getClass(), "next", term35584);
        setField(term35583, term35583.getClass(), "first", null);
        setField(term35583, term35583.getClass(), "last", null);
        setField(term35583, term35583.getClass(), "propListHead", null);
        setIntField(term35583, term35583.getClass(), "sourcePosition", 0);
        setField(term35583, term35583.getClass(), "jsType", null);
        setField(term35583, term35583.getClass(), "parent", null);
        setField(term35582, term35582.getClass(), "first", term35583);
        setField(term35582, term35582.getClass(), "last", null);
        setField(term35582, term35582.getClass(), "propListHead", null);
        setIntField(term35582, term35582.getClass(), "sourcePosition", 0);
        setField(term35582, term35582.getClass(), "jsType", null);
        setField(term35582, term35582.getClass(), "parent", null);
        term35522 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term35532 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term35542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term35522, term35522.getClass(), "functionName", null);
        setBooleanField(term35522, term35522.getClass(), "itsNeedsActivation", false);
        setIntField(term35522, term35522.getClass(), "itsFunctionType", 0);
        setBooleanField(term35522, term35522.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term35522, term35522.getClass(), "encodedSourceStart", 0);
        setIntField(term35522, term35522.getClass(), "encodedSourceEnd", 0);
        setField(term35522, term35522.getClass(), "sourceName", null);
        setIntField(term35522, term35522.getClass(), "baseLineno", 0);
        setIntField(term35522, term35522.getClass(), "endLineno", 0);
        setField(term35522, term35522.getClass(), "functions", null);
        setField(term35522, term35522.getClass(), "regexps", null);
        setField(term35522, term35522.getClass(), "itsVariables", null);
        setField(term35522, term35522.getClass(), "itsConst", null);
        setField(term35522, term35522.getClass(), "itsVariableNames", null);
        setIntField(term35522, term35522.getClass(), "varStart", 0);
        setField(term35522, term35522.getClass(), "compilerData", null);
        setIntField(term35522, term35522.getClass(), "type", 19);
        setField(term35522, term35522.getClass(), "next", null);
        setField(term35532, term35532.getClass(), "functionName", null);
        setBooleanField(term35532, term35532.getClass(), "itsNeedsActivation", false);
        setIntField(term35532, term35532.getClass(), "itsFunctionType", 0);
        setBooleanField(term35532, term35532.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term35532, term35532.getClass(), "encodedSourceStart", 0);
        setIntField(term35532, term35532.getClass(), "encodedSourceEnd", 0);
        setField(term35532, term35532.getClass(), "sourceName", null);
        setIntField(term35532, term35532.getClass(), "baseLineno", 0);
        setIntField(term35532, term35532.getClass(), "endLineno", 0);
        setField(term35532, term35532.getClass(), "functions", null);
        setField(term35532, term35532.getClass(), "regexps", null);
        setField(term35532, term35532.getClass(), "itsVariables", null);
        setField(term35532, term35532.getClass(), "itsConst", null);
        setField(term35532, term35532.getClass(), "itsVariableNames", null);
        setIntField(term35532, term35532.getClass(), "varStart", 0);
        setField(term35532, term35532.getClass(), "compilerData", null);
        setIntField(term35532, term35532.getClass(), "type", 0);
        setIntField(term35542, term35542.getClass(), "type", 0);
        setField(term35542, term35542.getClass(), "next", null);
        setField(term35542, term35542.getClass(), "first", null);
        setField(term35542, term35542.getClass(), "last", null);
        setField(term35542, term35542.getClass(), "propListHead", null);
        setIntField(term35542, term35542.getClass(), "sourcePosition", 0);
        setField(term35542, term35542.getClass(), "jsType", null);
        setField(term35542, term35542.getClass(), "parent", null);
        setField(term35532, term35532.getClass(), "next", term35542);
        setField(term35532, term35532.getClass(), "first", null);
        setField(term35532, term35532.getClass(), "last", null);
        setField(term35532, term35532.getClass(), "propListHead", null);
        setIntField(term35532, term35532.getClass(), "sourcePosition", 0);
        setField(term35532, term35532.getClass(), "jsType", null);
        setField(term35532, term35532.getClass(), "parent", null);
        setField(term35522, term35522.getClass(), "first", term35532);
        setField(term35522, term35522.getClass(), "last", null);
        setField(term35522, term35522.getClass(), "propListHead", null);
        setIntField(term35522, term35522.getClass(), "sourcePosition", 0);
        setField(term35522, term35522.getClass(), "jsType", null);
        setField(term35522, term35522.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term34918;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term34832, args);
        assertTrue(recursiveEquals(term34832, term35581));
        assertTrue(recursiveEquals(term34918, term35582));
        assertTrue(recursiveEquals(retValue, term35522));
    }

};


