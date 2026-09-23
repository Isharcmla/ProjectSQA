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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term623791;
     Object term623883;
     Object term651134;
     Object term651135;
     Object term651089;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term623791 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term623883 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term623969 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term624039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term623969, term623969.getClass(), "next", term624039);
        setIntField(term623969, term623969.getClass(), "type", 39);
        setField(term623883, term623883.getClass(), "first", term623969);
        setIntField(term623883, term623883.getClass(), "type", 19);
        term651134 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term651134, term651134.getClass(), "currentTraversal", null);
        term651135 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term651136 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term651137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term651135, term651135.getClass(), "str", null);
        setIntField(term651135, term651135.getClass(), "type", 19);
        setField(term651135, term651135.getClass(), "next", null);
        setField(term651136, term651136.getClass(), "functionName", null);
        setBooleanField(term651136, term651136.getClass(), "itsNeedsActivation", false);
        setIntField(term651136, term651136.getClass(), "itsFunctionType", 0);
        setBooleanField(term651136, term651136.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term651136, term651136.getClass(), "encodedSourceStart", 0);
        setIntField(term651136, term651136.getClass(), "encodedSourceEnd", 0);
        setField(term651136, term651136.getClass(), "sourceName", null);
        setIntField(term651136, term651136.getClass(), "baseLineno", 0);
        setIntField(term651136, term651136.getClass(), "endLineno", 0);
        setField(term651136, term651136.getClass(), "functions", null);
        setField(term651136, term651136.getClass(), "regexps", null);
        setField(term651136, term651136.getClass(), "itsVariables", null);
        setField(term651136, term651136.getClass(), "itsConst", null);
        setField(term651136, term651136.getClass(), "itsVariableNames", null);
        setIntField(term651136, term651136.getClass(), "varStart", 0);
        setField(term651136, term651136.getClass(), "compilerData", null);
        setIntField(term651136, term651136.getClass(), "type", 39);
        setIntField(term651137, term651137.getClass(), "type", 0);
        setField(term651137, term651137.getClass(), "next", null);
        setField(term651137, term651137.getClass(), "first", null);
        setField(term651137, term651137.getClass(), "last", null);
        setField(term651137, term651137.getClass(), "propListHead", null);
        setIntField(term651137, term651137.getClass(), "sourcePosition", 0);
        setField(term651137, term651137.getClass(), "jsType", null);
        setField(term651137, term651137.getClass(), "parent", null);
        setField(term651136, term651136.getClass(), "next", term651137);
        setField(term651136, term651136.getClass(), "first", null);
        setField(term651136, term651136.getClass(), "last", null);
        setField(term651136, term651136.getClass(), "propListHead", null);
        setIntField(term651136, term651136.getClass(), "sourcePosition", 0);
        setField(term651136, term651136.getClass(), "jsType", null);
        setField(term651136, term651136.getClass(), "parent", null);
        setField(term651135, term651135.getClass(), "first", term651136);
        setField(term651135, term651135.getClass(), "last", null);
        setField(term651135, term651135.getClass(), "propListHead", null);
        setIntField(term651135, term651135.getClass(), "sourcePosition", 0);
        setField(term651135, term651135.getClass(), "jsType", null);
        setField(term651135, term651135.getClass(), "parent", null);
        term651089 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term651091 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term651101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term651089, term651089.getClass(), "str", null);
        setIntField(term651089, term651089.getClass(), "type", 19);
        setField(term651089, term651089.getClass(), "next", null);
        setField(term651091, term651091.getClass(), "functionName", null);
        setBooleanField(term651091, term651091.getClass(), "itsNeedsActivation", false);
        setIntField(term651091, term651091.getClass(), "itsFunctionType", 0);
        setBooleanField(term651091, term651091.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term651091, term651091.getClass(), "encodedSourceStart", 0);
        setIntField(term651091, term651091.getClass(), "encodedSourceEnd", 0);
        setField(term651091, term651091.getClass(), "sourceName", null);
        setIntField(term651091, term651091.getClass(), "baseLineno", 0);
        setIntField(term651091, term651091.getClass(), "endLineno", 0);
        setField(term651091, term651091.getClass(), "functions", null);
        setField(term651091, term651091.getClass(), "regexps", null);
        setField(term651091, term651091.getClass(), "itsVariables", null);
        setField(term651091, term651091.getClass(), "itsConst", null);
        setField(term651091, term651091.getClass(), "itsVariableNames", null);
        setIntField(term651091, term651091.getClass(), "varStart", 0);
        setField(term651091, term651091.getClass(), "compilerData", null);
        setIntField(term651091, term651091.getClass(), "type", 39);
        setIntField(term651101, term651101.getClass(), "type", 0);
        setField(term651101, term651101.getClass(), "next", null);
        setField(term651101, term651101.getClass(), "first", null);
        setField(term651101, term651101.getClass(), "last", null);
        setField(term651101, term651101.getClass(), "propListHead", null);
        setIntField(term651101, term651101.getClass(), "sourcePosition", 0);
        setField(term651101, term651101.getClass(), "jsType", null);
        setField(term651101, term651101.getClass(), "parent", null);
        setField(term651091, term651091.getClass(), "next", term651101);
        setField(term651091, term651091.getClass(), "first", null);
        setField(term651091, term651091.getClass(), "last", null);
        setField(term651091, term651091.getClass(), "propListHead", null);
        setIntField(term651091, term651091.getClass(), "sourcePosition", 0);
        setField(term651091, term651091.getClass(), "jsType", null);
        setField(term651091, term651091.getClass(), "parent", null);
        setField(term651089, term651089.getClass(), "first", term651091);
        setField(term651089, term651089.getClass(), "last", null);
        setField(term651089, term651089.getClass(), "propListHead", null);
        setIntField(term651089, term651089.getClass(), "sourcePosition", 0);
        setField(term651089, term651089.getClass(), "jsType", null);
        setField(term651089, term651089.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term623883;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term623791, args);
        assertTrue(recursiveEquals(term623791, term651134));
        assertTrue(recursiveEquals(term623883, term651135));
        assertTrue(recursiveEquals(retValue, term651089));
    }

};


