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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term790640;
     Object term790732;
     Object term791664;
     Object term791665;
     Object term791577;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term790640 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term790732 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term790818 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term790904 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term790904, term790904.getClass(), "type", 16);
        setField(term790818, term790818.getClass(), "next", term790904);
        setIntField(term790818, term790818.getClass(), "type", 42);
        setField(term790732, term790732.getClass(), "first", term790818);
        setIntField(term790732, term790732.getClass(), "type", 16);
        term791664 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term791664, term791664.getClass(), "currentTraversal", null);
        term791665 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term791666 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term791667 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term791665, term791665.getClass(), "str", null);
        setIntField(term791665, term791665.getClass(), "type", 16);
        setField(term791665, term791665.getClass(), "next", null);
        setField(term791666, term791666.getClass(), "functionName", null);
        setBooleanField(term791666, term791666.getClass(), "itsNeedsActivation", false);
        setIntField(term791666, term791666.getClass(), "itsFunctionType", 0);
        setBooleanField(term791666, term791666.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term791666, term791666.getClass(), "encodedSourceStart", 0);
        setIntField(term791666, term791666.getClass(), "encodedSourceEnd", 0);
        setField(term791666, term791666.getClass(), "sourceName", null);
        setIntField(term791666, term791666.getClass(), "baseLineno", 0);
        setIntField(term791666, term791666.getClass(), "endLineno", 0);
        setField(term791666, term791666.getClass(), "functions", null);
        setField(term791666, term791666.getClass(), "regexps", null);
        setField(term791666, term791666.getClass(), "itsVariables", null);
        setField(term791666, term791666.getClass(), "itsConst", null);
        setField(term791666, term791666.getClass(), "itsVariableNames", null);
        setIntField(term791666, term791666.getClass(), "varStart", 0);
        setField(term791666, term791666.getClass(), "compilerData", null);
        setIntField(term791666, term791666.getClass(), "type", 42);
        setField(term791667, term791667.getClass(), "functionName", null);
        setBooleanField(term791667, term791667.getClass(), "itsNeedsActivation", false);
        setIntField(term791667, term791667.getClass(), "itsFunctionType", 0);
        setBooleanField(term791667, term791667.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term791667, term791667.getClass(), "encodedSourceStart", 0);
        setIntField(term791667, term791667.getClass(), "encodedSourceEnd", 0);
        setField(term791667, term791667.getClass(), "sourceName", null);
        setIntField(term791667, term791667.getClass(), "baseLineno", 0);
        setIntField(term791667, term791667.getClass(), "endLineno", 0);
        setField(term791667, term791667.getClass(), "functions", null);
        setField(term791667, term791667.getClass(), "regexps", null);
        setField(term791667, term791667.getClass(), "itsVariables", null);
        setField(term791667, term791667.getClass(), "itsConst", null);
        setField(term791667, term791667.getClass(), "itsVariableNames", null);
        setIntField(term791667, term791667.getClass(), "varStart", 0);
        setField(term791667, term791667.getClass(), "compilerData", null);
        setIntField(term791667, term791667.getClass(), "type", 16);
        setField(term791667, term791667.getClass(), "next", null);
        setField(term791667, term791667.getClass(), "first", null);
        setField(term791667, term791667.getClass(), "last", null);
        setField(term791667, term791667.getClass(), "propListHead", null);
        setIntField(term791667, term791667.getClass(), "sourcePosition", 0);
        setField(term791667, term791667.getClass(), "jsType", null);
        setField(term791667, term791667.getClass(), "parent", null);
        setField(term791666, term791666.getClass(), "next", term791667);
        setField(term791666, term791666.getClass(), "first", null);
        setField(term791666, term791666.getClass(), "last", null);
        setField(term791666, term791666.getClass(), "propListHead", null);
        setIntField(term791666, term791666.getClass(), "sourcePosition", 0);
        setField(term791666, term791666.getClass(), "jsType", null);
        setField(term791666, term791666.getClass(), "parent", null);
        setField(term791665, term791665.getClass(), "first", term791666);
        setField(term791665, term791665.getClass(), "last", null);
        setField(term791665, term791665.getClass(), "propListHead", null);
        setIntField(term791665, term791665.getClass(), "sourcePosition", 0);
        setField(term791665, term791665.getClass(), "jsType", null);
        setField(term791665, term791665.getClass(), "parent", null);
        term791577 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term791579 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term791589 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term791577, term791577.getClass(), "str", null);
        setIntField(term791577, term791577.getClass(), "type", 16);
        setField(term791577, term791577.getClass(), "next", null);
        setField(term791579, term791579.getClass(), "functionName", null);
        setBooleanField(term791579, term791579.getClass(), "itsNeedsActivation", false);
        setIntField(term791579, term791579.getClass(), "itsFunctionType", 0);
        setBooleanField(term791579, term791579.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term791579, term791579.getClass(), "encodedSourceStart", 0);
        setIntField(term791579, term791579.getClass(), "encodedSourceEnd", 0);
        setField(term791579, term791579.getClass(), "sourceName", null);
        setIntField(term791579, term791579.getClass(), "baseLineno", 0);
        setIntField(term791579, term791579.getClass(), "endLineno", 0);
        setField(term791579, term791579.getClass(), "functions", null);
        setField(term791579, term791579.getClass(), "regexps", null);
        setField(term791579, term791579.getClass(), "itsVariables", null);
        setField(term791579, term791579.getClass(), "itsConst", null);
        setField(term791579, term791579.getClass(), "itsVariableNames", null);
        setIntField(term791579, term791579.getClass(), "varStart", 0);
        setField(term791579, term791579.getClass(), "compilerData", null);
        setIntField(term791579, term791579.getClass(), "type", 42);
        setField(term791589, term791589.getClass(), "functionName", null);
        setBooleanField(term791589, term791589.getClass(), "itsNeedsActivation", false);
        setIntField(term791589, term791589.getClass(), "itsFunctionType", 0);
        setBooleanField(term791589, term791589.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term791589, term791589.getClass(), "encodedSourceStart", 0);
        setIntField(term791589, term791589.getClass(), "encodedSourceEnd", 0);
        setField(term791589, term791589.getClass(), "sourceName", null);
        setIntField(term791589, term791589.getClass(), "baseLineno", 0);
        setIntField(term791589, term791589.getClass(), "endLineno", 0);
        setField(term791589, term791589.getClass(), "functions", null);
        setField(term791589, term791589.getClass(), "regexps", null);
        setField(term791589, term791589.getClass(), "itsVariables", null);
        setField(term791589, term791589.getClass(), "itsConst", null);
        setField(term791589, term791589.getClass(), "itsVariableNames", null);
        setIntField(term791589, term791589.getClass(), "varStart", 0);
        setField(term791589, term791589.getClass(), "compilerData", null);
        setIntField(term791589, term791589.getClass(), "type", 16);
        setField(term791589, term791589.getClass(), "next", null);
        setField(term791589, term791589.getClass(), "first", null);
        setField(term791589, term791589.getClass(), "last", null);
        setField(term791589, term791589.getClass(), "propListHead", null);
        setIntField(term791589, term791589.getClass(), "sourcePosition", 0);
        setField(term791589, term791589.getClass(), "jsType", null);
        setField(term791589, term791589.getClass(), "parent", null);
        setField(term791579, term791579.getClass(), "next", term791589);
        setField(term791579, term791579.getClass(), "first", null);
        setField(term791579, term791579.getClass(), "last", null);
        setField(term791579, term791579.getClass(), "propListHead", null);
        setIntField(term791579, term791579.getClass(), "sourcePosition", 0);
        setField(term791579, term791579.getClass(), "jsType", null);
        setField(term791579, term791579.getClass(), "parent", null);
        setField(term791577, term791577.getClass(), "first", term791579);
        setField(term791577, term791577.getClass(), "last", null);
        setField(term791577, term791577.getClass(), "propListHead", null);
        setIntField(term791577, term791577.getClass(), "sourcePosition", 0);
        setField(term791577, term791577.getClass(), "jsType", null);
        setField(term791577, term791577.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term790732;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term790640, args);
        assertTrue(recursiveEquals(term790640, term791664));
        assertTrue(recursiveEquals(term790732, term791665));
        assertTrue(recursiveEquals(retValue, term791577));
    }

};


