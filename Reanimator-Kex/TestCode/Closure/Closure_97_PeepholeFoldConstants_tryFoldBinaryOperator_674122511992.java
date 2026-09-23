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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312957;
     Object term313043;
     Object term313191;
     Object term313192;
     Object term313128;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term312957 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term313043 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term313113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term313043, term313043.getClass(), "first", term313043);
        setField(term313043, term313043.getClass(), "next", term313113);
        setIntField(term313043, term313043.getClass(), "type", 101);
        term313191 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term313191, term313191.getClass(), "currentTraversal", null);
        term313192 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term313193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term313192, term313192.getClass(), "functionName", null);
        setBooleanField(term313192, term313192.getClass(), "itsNeedsActivation", false);
        setIntField(term313192, term313192.getClass(), "itsFunctionType", 0);
        setBooleanField(term313192, term313192.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term313192, term313192.getClass(), "encodedSourceStart", 0);
        setIntField(term313192, term313192.getClass(), "encodedSourceEnd", 0);
        setField(term313192, term313192.getClass(), "sourceName", null);
        setIntField(term313192, term313192.getClass(), "baseLineno", 0);
        setIntField(term313192, term313192.getClass(), "endLineno", 0);
        setField(term313192, term313192.getClass(), "functions", null);
        setField(term313192, term313192.getClass(), "regexps", null);
        setField(term313192, term313192.getClass(), "itsVariables", null);
        setField(term313192, term313192.getClass(), "itsConst", null);
        setField(term313192, term313192.getClass(), "itsVariableNames", null);
        setIntField(term313192, term313192.getClass(), "varStart", 0);
        setField(term313192, term313192.getClass(), "compilerData", null);
        setIntField(term313192, term313192.getClass(), "type", 101);
        setIntField(term313193, term313193.getClass(), "type", 0);
        setField(term313193, term313193.getClass(), "next", null);
        setField(term313193, term313193.getClass(), "first", null);
        setField(term313193, term313193.getClass(), "last", null);
        setField(term313193, term313193.getClass(), "propListHead", null);
        setIntField(term313193, term313193.getClass(), "sourcePosition", 0);
        setField(term313193, term313193.getClass(), "jsType", null);
        setField(term313193, term313193.getClass(), "parent", null);
        setField(term313192, term313192.getClass(), "next", term313193);
        setField(term313192, term313192.getClass(), "first", term313192);
        setField(term313192, term313192.getClass(), "last", null);
        setField(term313192, term313192.getClass(), "propListHead", null);
        setIntField(term313192, term313192.getClass(), "sourcePosition", 0);
        setField(term313192, term313192.getClass(), "jsType", null);
        setField(term313192, term313192.getClass(), "parent", null);
        term313128 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term313138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term313128, term313128.getClass(), "functionName", null);
        setBooleanField(term313128, term313128.getClass(), "itsNeedsActivation", false);
        setIntField(term313128, term313128.getClass(), "itsFunctionType", 0);
        setBooleanField(term313128, term313128.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term313128, term313128.getClass(), "encodedSourceStart", 0);
        setIntField(term313128, term313128.getClass(), "encodedSourceEnd", 0);
        setField(term313128, term313128.getClass(), "sourceName", null);
        setIntField(term313128, term313128.getClass(), "baseLineno", 0);
        setIntField(term313128, term313128.getClass(), "endLineno", 0);
        setField(term313128, term313128.getClass(), "functions", null);
        setField(term313128, term313128.getClass(), "regexps", null);
        setField(term313128, term313128.getClass(), "itsVariables", null);
        setField(term313128, term313128.getClass(), "itsConst", null);
        setField(term313128, term313128.getClass(), "itsVariableNames", null);
        setIntField(term313128, term313128.getClass(), "varStart", 0);
        setField(term313128, term313128.getClass(), "compilerData", null);
        setIntField(term313128, term313128.getClass(), "type", 101);
        setIntField(term313138, term313138.getClass(), "type", 0);
        setField(term313138, term313138.getClass(), "next", null);
        setField(term313138, term313138.getClass(), "first", null);
        setField(term313138, term313138.getClass(), "last", null);
        setField(term313138, term313138.getClass(), "propListHead", null);
        setIntField(term313138, term313138.getClass(), "sourcePosition", 0);
        setField(term313138, term313138.getClass(), "jsType", null);
        setField(term313138, term313138.getClass(), "parent", null);
        setField(term313128, term313128.getClass(), "next", term313138);
        setField(term313128, term313128.getClass(), "first", term313128);
        setField(term313128, term313128.getClass(), "last", null);
        setField(term313128, term313128.getClass(), "propListHead", null);
        setIntField(term313128, term313128.getClass(), "sourcePosition", 0);
        setField(term313128, term313128.getClass(), "jsType", null);
        setField(term313128, term313128.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term313043;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term312957, args);
        assertTrue(recursiveEquals(term312957, term313191));
        assertTrue(recursiveEquals(term313043, term313192));
        assertTrue(recursiveEquals(retValue, term313128));
    }

};


