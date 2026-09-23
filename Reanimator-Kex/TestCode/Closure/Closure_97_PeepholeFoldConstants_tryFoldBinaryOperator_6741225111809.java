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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111809 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term702439;
     Object term702525;
     Object term703171;
     Object term703172;
     Object term703112;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111809() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term702439 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term702525 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term702611 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term702681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term702611, term702611.getClass(), "next", term702681);
        setField(term702525, term702525.getClass(), "first", term702611);
        setIntField(term702525, term702525.getClass(), "type", 20);
        term703171 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term703171, term703171.getClass(), "currentTraversal", null);
        term703172 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term703173 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term703174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term703172, term703172.getClass(), "functionName", null);
        setBooleanField(term703172, term703172.getClass(), "itsNeedsActivation", false);
        setIntField(term703172, term703172.getClass(), "itsFunctionType", 0);
        setBooleanField(term703172, term703172.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term703172, term703172.getClass(), "encodedSourceStart", 0);
        setIntField(term703172, term703172.getClass(), "encodedSourceEnd", 0);
        setField(term703172, term703172.getClass(), "sourceName", null);
        setIntField(term703172, term703172.getClass(), "baseLineno", 0);
        setIntField(term703172, term703172.getClass(), "endLineno", 0);
        setField(term703172, term703172.getClass(), "functions", null);
        setField(term703172, term703172.getClass(), "regexps", null);
        setField(term703172, term703172.getClass(), "itsVariables", null);
        setField(term703172, term703172.getClass(), "itsConst", null);
        setField(term703172, term703172.getClass(), "itsVariableNames", null);
        setIntField(term703172, term703172.getClass(), "varStart", 0);
        setField(term703172, term703172.getClass(), "compilerData", null);
        setIntField(term703172, term703172.getClass(), "type", 20);
        setField(term703172, term703172.getClass(), "next", null);
        setField(term703173, term703173.getClass(), "functionName", null);
        setBooleanField(term703173, term703173.getClass(), "itsNeedsActivation", false);
        setIntField(term703173, term703173.getClass(), "itsFunctionType", 0);
        setBooleanField(term703173, term703173.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term703173, term703173.getClass(), "encodedSourceStart", 0);
        setIntField(term703173, term703173.getClass(), "encodedSourceEnd", 0);
        setField(term703173, term703173.getClass(), "sourceName", null);
        setIntField(term703173, term703173.getClass(), "baseLineno", 0);
        setIntField(term703173, term703173.getClass(), "endLineno", 0);
        setField(term703173, term703173.getClass(), "functions", null);
        setField(term703173, term703173.getClass(), "regexps", null);
        setField(term703173, term703173.getClass(), "itsVariables", null);
        setField(term703173, term703173.getClass(), "itsConst", null);
        setField(term703173, term703173.getClass(), "itsVariableNames", null);
        setIntField(term703173, term703173.getClass(), "varStart", 0);
        setField(term703173, term703173.getClass(), "compilerData", null);
        setIntField(term703173, term703173.getClass(), "type", 0);
        setIntField(term703174, term703174.getClass(), "type", 0);
        setField(term703174, term703174.getClass(), "next", null);
        setField(term703174, term703174.getClass(), "first", null);
        setField(term703174, term703174.getClass(), "last", null);
        setField(term703174, term703174.getClass(), "propListHead", null);
        setIntField(term703174, term703174.getClass(), "sourcePosition", 0);
        setField(term703174, term703174.getClass(), "jsType", null);
        setField(term703174, term703174.getClass(), "parent", null);
        setField(term703173, term703173.getClass(), "next", term703174);
        setField(term703173, term703173.getClass(), "first", null);
        setField(term703173, term703173.getClass(), "last", null);
        setField(term703173, term703173.getClass(), "propListHead", null);
        setIntField(term703173, term703173.getClass(), "sourcePosition", 0);
        setField(term703173, term703173.getClass(), "jsType", null);
        setField(term703173, term703173.getClass(), "parent", null);
        setField(term703172, term703172.getClass(), "first", term703173);
        setField(term703172, term703172.getClass(), "last", null);
        setField(term703172, term703172.getClass(), "propListHead", null);
        setIntField(term703172, term703172.getClass(), "sourcePosition", 0);
        setField(term703172, term703172.getClass(), "jsType", null);
        setField(term703172, term703172.getClass(), "parent", null);
        term703112 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term703122 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term703132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term703112, term703112.getClass(), "functionName", null);
        setBooleanField(term703112, term703112.getClass(), "itsNeedsActivation", false);
        setIntField(term703112, term703112.getClass(), "itsFunctionType", 0);
        setBooleanField(term703112, term703112.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term703112, term703112.getClass(), "encodedSourceStart", 0);
        setIntField(term703112, term703112.getClass(), "encodedSourceEnd", 0);
        setField(term703112, term703112.getClass(), "sourceName", null);
        setIntField(term703112, term703112.getClass(), "baseLineno", 0);
        setIntField(term703112, term703112.getClass(), "endLineno", 0);
        setField(term703112, term703112.getClass(), "functions", null);
        setField(term703112, term703112.getClass(), "regexps", null);
        setField(term703112, term703112.getClass(), "itsVariables", null);
        setField(term703112, term703112.getClass(), "itsConst", null);
        setField(term703112, term703112.getClass(), "itsVariableNames", null);
        setIntField(term703112, term703112.getClass(), "varStart", 0);
        setField(term703112, term703112.getClass(), "compilerData", null);
        setIntField(term703112, term703112.getClass(), "type", 20);
        setField(term703112, term703112.getClass(), "next", null);
        setField(term703122, term703122.getClass(), "functionName", null);
        setBooleanField(term703122, term703122.getClass(), "itsNeedsActivation", false);
        setIntField(term703122, term703122.getClass(), "itsFunctionType", 0);
        setBooleanField(term703122, term703122.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term703122, term703122.getClass(), "encodedSourceStart", 0);
        setIntField(term703122, term703122.getClass(), "encodedSourceEnd", 0);
        setField(term703122, term703122.getClass(), "sourceName", null);
        setIntField(term703122, term703122.getClass(), "baseLineno", 0);
        setIntField(term703122, term703122.getClass(), "endLineno", 0);
        setField(term703122, term703122.getClass(), "functions", null);
        setField(term703122, term703122.getClass(), "regexps", null);
        setField(term703122, term703122.getClass(), "itsVariables", null);
        setField(term703122, term703122.getClass(), "itsConst", null);
        setField(term703122, term703122.getClass(), "itsVariableNames", null);
        setIntField(term703122, term703122.getClass(), "varStart", 0);
        setField(term703122, term703122.getClass(), "compilerData", null);
        setIntField(term703122, term703122.getClass(), "type", 0);
        setIntField(term703132, term703132.getClass(), "type", 0);
        setField(term703132, term703132.getClass(), "next", null);
        setField(term703132, term703132.getClass(), "first", null);
        setField(term703132, term703132.getClass(), "last", null);
        setField(term703132, term703132.getClass(), "propListHead", null);
        setIntField(term703132, term703132.getClass(), "sourcePosition", 0);
        setField(term703132, term703132.getClass(), "jsType", null);
        setField(term703132, term703132.getClass(), "parent", null);
        setField(term703122, term703122.getClass(), "next", term703132);
        setField(term703122, term703122.getClass(), "first", null);
        setField(term703122, term703122.getClass(), "last", null);
        setField(term703122, term703122.getClass(), "propListHead", null);
        setIntField(term703122, term703122.getClass(), "sourcePosition", 0);
        setField(term703122, term703122.getClass(), "jsType", null);
        setField(term703122, term703122.getClass(), "parent", null);
        setField(term703112, term703112.getClass(), "first", term703122);
        setField(term703112, term703112.getClass(), "last", null);
        setField(term703112, term703112.getClass(), "propListHead", null);
        setIntField(term703112, term703112.getClass(), "sourcePosition", 0);
        setField(term703112, term703112.getClass(), "jsType", null);
        setField(term703112, term703112.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term702525;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term702439, args);
        assertTrue(recursiveEquals(term702439, term703171));
        assertTrue(recursiveEquals(term702525, term703172));
        assertTrue(recursiveEquals(retValue, term703112));
    }

};


