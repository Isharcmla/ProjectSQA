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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term426827;
     Object term426913;
     Object term427169;
     Object term427170;
     Object term427084;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term426827 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term426913 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term426999 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term427069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term426999, term426999.getClass(), "next", term427069);
        setField(term426913, term426913.getClass(), "first", term426999);
        setIntField(term426913, term426913.getClass(), "type", 101);
        term427169 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term427169, term427169.getClass(), "currentTraversal", null);
        term427170 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term427171 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term427172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term427170, term427170.getClass(), "functionName", null);
        setBooleanField(term427170, term427170.getClass(), "itsNeedsActivation", false);
        setIntField(term427170, term427170.getClass(), "itsFunctionType", 0);
        setBooleanField(term427170, term427170.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term427170, term427170.getClass(), "encodedSourceStart", 0);
        setIntField(term427170, term427170.getClass(), "encodedSourceEnd", 0);
        setField(term427170, term427170.getClass(), "sourceName", null);
        setIntField(term427170, term427170.getClass(), "baseLineno", 0);
        setIntField(term427170, term427170.getClass(), "endLineno", 0);
        setField(term427170, term427170.getClass(), "functions", null);
        setField(term427170, term427170.getClass(), "regexps", null);
        setField(term427170, term427170.getClass(), "itsVariables", null);
        setField(term427170, term427170.getClass(), "itsConst", null);
        setField(term427170, term427170.getClass(), "itsVariableNames", null);
        setIntField(term427170, term427170.getClass(), "varStart", 0);
        setField(term427170, term427170.getClass(), "compilerData", null);
        setIntField(term427170, term427170.getClass(), "type", 101);
        setField(term427170, term427170.getClass(), "next", null);
        setField(term427171, term427171.getClass(), "functionName", null);
        setBooleanField(term427171, term427171.getClass(), "itsNeedsActivation", false);
        setIntField(term427171, term427171.getClass(), "itsFunctionType", 0);
        setBooleanField(term427171, term427171.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term427171, term427171.getClass(), "encodedSourceStart", 0);
        setIntField(term427171, term427171.getClass(), "encodedSourceEnd", 0);
        setField(term427171, term427171.getClass(), "sourceName", null);
        setIntField(term427171, term427171.getClass(), "baseLineno", 0);
        setIntField(term427171, term427171.getClass(), "endLineno", 0);
        setField(term427171, term427171.getClass(), "functions", null);
        setField(term427171, term427171.getClass(), "regexps", null);
        setField(term427171, term427171.getClass(), "itsVariables", null);
        setField(term427171, term427171.getClass(), "itsConst", null);
        setField(term427171, term427171.getClass(), "itsVariableNames", null);
        setIntField(term427171, term427171.getClass(), "varStart", 0);
        setField(term427171, term427171.getClass(), "compilerData", null);
        setIntField(term427171, term427171.getClass(), "type", 0);
        setIntField(term427172, term427172.getClass(), "type", 0);
        setField(term427172, term427172.getClass(), "next", null);
        setField(term427172, term427172.getClass(), "first", null);
        setField(term427172, term427172.getClass(), "last", null);
        setField(term427172, term427172.getClass(), "propListHead", null);
        setIntField(term427172, term427172.getClass(), "sourcePosition", 0);
        setField(term427172, term427172.getClass(), "jsType", null);
        setField(term427172, term427172.getClass(), "parent", null);
        setField(term427171, term427171.getClass(), "next", term427172);
        setField(term427171, term427171.getClass(), "first", null);
        setField(term427171, term427171.getClass(), "last", null);
        setField(term427171, term427171.getClass(), "propListHead", null);
        setIntField(term427171, term427171.getClass(), "sourcePosition", 0);
        setField(term427171, term427171.getClass(), "jsType", null);
        setField(term427171, term427171.getClass(), "parent", null);
        setField(term427170, term427170.getClass(), "first", term427171);
        setField(term427170, term427170.getClass(), "last", null);
        setField(term427170, term427170.getClass(), "propListHead", null);
        setIntField(term427170, term427170.getClass(), "sourcePosition", 0);
        setField(term427170, term427170.getClass(), "jsType", null);
        setField(term427170, term427170.getClass(), "parent", null);
        term427084 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term427094 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term427104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term427084, term427084.getClass(), "functionName", null);
        setBooleanField(term427084, term427084.getClass(), "itsNeedsActivation", false);
        setIntField(term427084, term427084.getClass(), "itsFunctionType", 0);
        setBooleanField(term427084, term427084.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term427084, term427084.getClass(), "encodedSourceStart", 0);
        setIntField(term427084, term427084.getClass(), "encodedSourceEnd", 0);
        setField(term427084, term427084.getClass(), "sourceName", null);
        setIntField(term427084, term427084.getClass(), "baseLineno", 0);
        setIntField(term427084, term427084.getClass(), "endLineno", 0);
        setField(term427084, term427084.getClass(), "functions", null);
        setField(term427084, term427084.getClass(), "regexps", null);
        setField(term427084, term427084.getClass(), "itsVariables", null);
        setField(term427084, term427084.getClass(), "itsConst", null);
        setField(term427084, term427084.getClass(), "itsVariableNames", null);
        setIntField(term427084, term427084.getClass(), "varStart", 0);
        setField(term427084, term427084.getClass(), "compilerData", null);
        setIntField(term427084, term427084.getClass(), "type", 101);
        setField(term427084, term427084.getClass(), "next", null);
        setField(term427094, term427094.getClass(), "functionName", null);
        setBooleanField(term427094, term427094.getClass(), "itsNeedsActivation", false);
        setIntField(term427094, term427094.getClass(), "itsFunctionType", 0);
        setBooleanField(term427094, term427094.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term427094, term427094.getClass(), "encodedSourceStart", 0);
        setIntField(term427094, term427094.getClass(), "encodedSourceEnd", 0);
        setField(term427094, term427094.getClass(), "sourceName", null);
        setIntField(term427094, term427094.getClass(), "baseLineno", 0);
        setIntField(term427094, term427094.getClass(), "endLineno", 0);
        setField(term427094, term427094.getClass(), "functions", null);
        setField(term427094, term427094.getClass(), "regexps", null);
        setField(term427094, term427094.getClass(), "itsVariables", null);
        setField(term427094, term427094.getClass(), "itsConst", null);
        setField(term427094, term427094.getClass(), "itsVariableNames", null);
        setIntField(term427094, term427094.getClass(), "varStart", 0);
        setField(term427094, term427094.getClass(), "compilerData", null);
        setIntField(term427094, term427094.getClass(), "type", 0);
        setIntField(term427104, term427104.getClass(), "type", 0);
        setField(term427104, term427104.getClass(), "next", null);
        setField(term427104, term427104.getClass(), "first", null);
        setField(term427104, term427104.getClass(), "last", null);
        setField(term427104, term427104.getClass(), "propListHead", null);
        setIntField(term427104, term427104.getClass(), "sourcePosition", 0);
        setField(term427104, term427104.getClass(), "jsType", null);
        setField(term427104, term427104.getClass(), "parent", null);
        setField(term427094, term427094.getClass(), "next", term427104);
        setField(term427094, term427094.getClass(), "first", null);
        setField(term427094, term427094.getClass(), "last", null);
        setField(term427094, term427094.getClass(), "propListHead", null);
        setIntField(term427094, term427094.getClass(), "sourcePosition", 0);
        setField(term427094, term427094.getClass(), "jsType", null);
        setField(term427094, term427094.getClass(), "parent", null);
        setField(term427084, term427084.getClass(), "first", term427094);
        setField(term427084, term427084.getClass(), "last", null);
        setField(term427084, term427084.getClass(), "propListHead", null);
        setIntField(term427084, term427084.getClass(), "sourcePosition", 0);
        setField(term427084, term427084.getClass(), "jsType", null);
        setField(term427084, term427084.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term426913;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term426827, args);
        assertTrue(recursiveEquals(term426827, term427169));
        assertTrue(recursiveEquals(term426913, term427170));
        assertTrue(recursiveEquals(retValue, term427084));
    }

};


