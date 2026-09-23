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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168428;
     Object term168514;
     Object term168761;
     Object term168762;
     Object term168685;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168428 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term168514 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term168600 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term168670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term168670, term168670.getClass(), "type", 42);
        setField(term168600, term168600.getClass(), "next", term168670);
        setIntField(term168600, term168600.getClass(), "type", 42);
        setField(term168514, term168514.getClass(), "first", term168600);
        setIntField(term168514, term168514.getClass(), "type", 16);
        term168761 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term168761, term168761.getClass(), "currentTraversal", null);
        term168762 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term168763 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term168764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term168762, term168762.getClass(), "functionName", null);
        setBooleanField(term168762, term168762.getClass(), "itsNeedsActivation", false);
        setIntField(term168762, term168762.getClass(), "itsFunctionType", 0);
        setBooleanField(term168762, term168762.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term168762, term168762.getClass(), "encodedSourceStart", 0);
        setIntField(term168762, term168762.getClass(), "encodedSourceEnd", 0);
        setField(term168762, term168762.getClass(), "sourceName", null);
        setIntField(term168762, term168762.getClass(), "baseLineno", 0);
        setIntField(term168762, term168762.getClass(), "endLineno", 0);
        setField(term168762, term168762.getClass(), "functions", null);
        setField(term168762, term168762.getClass(), "regexps", null);
        setField(term168762, term168762.getClass(), "itsVariables", null);
        setField(term168762, term168762.getClass(), "itsConst", null);
        setField(term168762, term168762.getClass(), "itsVariableNames", null);
        setIntField(term168762, term168762.getClass(), "varStart", 0);
        setField(term168762, term168762.getClass(), "compilerData", null);
        setIntField(term168762, term168762.getClass(), "type", 16);
        setField(term168762, term168762.getClass(), "next", null);
        setField(term168763, term168763.getClass(), "functionName", null);
        setBooleanField(term168763, term168763.getClass(), "itsNeedsActivation", false);
        setIntField(term168763, term168763.getClass(), "itsFunctionType", 0);
        setBooleanField(term168763, term168763.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term168763, term168763.getClass(), "encodedSourceStart", 0);
        setIntField(term168763, term168763.getClass(), "encodedSourceEnd", 0);
        setField(term168763, term168763.getClass(), "sourceName", null);
        setIntField(term168763, term168763.getClass(), "baseLineno", 0);
        setIntField(term168763, term168763.getClass(), "endLineno", 0);
        setField(term168763, term168763.getClass(), "functions", null);
        setField(term168763, term168763.getClass(), "regexps", null);
        setField(term168763, term168763.getClass(), "itsVariables", null);
        setField(term168763, term168763.getClass(), "itsConst", null);
        setField(term168763, term168763.getClass(), "itsVariableNames", null);
        setIntField(term168763, term168763.getClass(), "varStart", 0);
        setField(term168763, term168763.getClass(), "compilerData", null);
        setIntField(term168763, term168763.getClass(), "type", 42);
        setIntField(term168764, term168764.getClass(), "type", 42);
        setField(term168764, term168764.getClass(), "next", null);
        setField(term168764, term168764.getClass(), "first", null);
        setField(term168764, term168764.getClass(), "last", null);
        setField(term168764, term168764.getClass(), "propListHead", null);
        setIntField(term168764, term168764.getClass(), "sourcePosition", 0);
        setField(term168764, term168764.getClass(), "jsType", null);
        setField(term168764, term168764.getClass(), "parent", null);
        setField(term168763, term168763.getClass(), "next", term168764);
        setField(term168763, term168763.getClass(), "first", null);
        setField(term168763, term168763.getClass(), "last", null);
        setField(term168763, term168763.getClass(), "propListHead", null);
        setIntField(term168763, term168763.getClass(), "sourcePosition", 0);
        setField(term168763, term168763.getClass(), "jsType", null);
        setField(term168763, term168763.getClass(), "parent", null);
        setField(term168762, term168762.getClass(), "first", term168763);
        setField(term168762, term168762.getClass(), "last", null);
        setField(term168762, term168762.getClass(), "propListHead", null);
        setIntField(term168762, term168762.getClass(), "sourcePosition", 0);
        setField(term168762, term168762.getClass(), "jsType", null);
        setField(term168762, term168762.getClass(), "parent", null);
        term168685 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term168695 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term168705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term168685, term168685.getClass(), "functionName", null);
        setBooleanField(term168685, term168685.getClass(), "itsNeedsActivation", false);
        setIntField(term168685, term168685.getClass(), "itsFunctionType", 0);
        setBooleanField(term168685, term168685.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term168685, term168685.getClass(), "encodedSourceStart", 0);
        setIntField(term168685, term168685.getClass(), "encodedSourceEnd", 0);
        setField(term168685, term168685.getClass(), "sourceName", null);
        setIntField(term168685, term168685.getClass(), "baseLineno", 0);
        setIntField(term168685, term168685.getClass(), "endLineno", 0);
        setField(term168685, term168685.getClass(), "functions", null);
        setField(term168685, term168685.getClass(), "regexps", null);
        setField(term168685, term168685.getClass(), "itsVariables", null);
        setField(term168685, term168685.getClass(), "itsConst", null);
        setField(term168685, term168685.getClass(), "itsVariableNames", null);
        setIntField(term168685, term168685.getClass(), "varStart", 0);
        setField(term168685, term168685.getClass(), "compilerData", null);
        setIntField(term168685, term168685.getClass(), "type", 16);
        setField(term168685, term168685.getClass(), "next", null);
        setField(term168695, term168695.getClass(), "functionName", null);
        setBooleanField(term168695, term168695.getClass(), "itsNeedsActivation", false);
        setIntField(term168695, term168695.getClass(), "itsFunctionType", 0);
        setBooleanField(term168695, term168695.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term168695, term168695.getClass(), "encodedSourceStart", 0);
        setIntField(term168695, term168695.getClass(), "encodedSourceEnd", 0);
        setField(term168695, term168695.getClass(), "sourceName", null);
        setIntField(term168695, term168695.getClass(), "baseLineno", 0);
        setIntField(term168695, term168695.getClass(), "endLineno", 0);
        setField(term168695, term168695.getClass(), "functions", null);
        setField(term168695, term168695.getClass(), "regexps", null);
        setField(term168695, term168695.getClass(), "itsVariables", null);
        setField(term168695, term168695.getClass(), "itsConst", null);
        setField(term168695, term168695.getClass(), "itsVariableNames", null);
        setIntField(term168695, term168695.getClass(), "varStart", 0);
        setField(term168695, term168695.getClass(), "compilerData", null);
        setIntField(term168695, term168695.getClass(), "type", 42);
        setIntField(term168705, term168705.getClass(), "type", 42);
        setField(term168705, term168705.getClass(), "next", null);
        setField(term168705, term168705.getClass(), "first", null);
        setField(term168705, term168705.getClass(), "last", null);
        setField(term168705, term168705.getClass(), "propListHead", null);
        setIntField(term168705, term168705.getClass(), "sourcePosition", 0);
        setField(term168705, term168705.getClass(), "jsType", null);
        setField(term168705, term168705.getClass(), "parent", null);
        setField(term168695, term168695.getClass(), "next", term168705);
        setField(term168695, term168695.getClass(), "first", null);
        setField(term168695, term168695.getClass(), "last", null);
        setField(term168695, term168695.getClass(), "propListHead", null);
        setIntField(term168695, term168695.getClass(), "sourcePosition", 0);
        setField(term168695, term168695.getClass(), "jsType", null);
        setField(term168695, term168695.getClass(), "parent", null);
        setField(term168685, term168685.getClass(), "first", term168695);
        setField(term168685, term168685.getClass(), "last", null);
        setField(term168685, term168685.getClass(), "propListHead", null);
        setIntField(term168685, term168685.getClass(), "sourcePosition", 0);
        setField(term168685, term168685.getClass(), "jsType", null);
        setField(term168685, term168685.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term168514;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term168428, args);
        assertTrue(recursiveEquals(term168428, term168761));
        assertTrue(recursiveEquals(term168514, term168762));
        assertTrue(recursiveEquals(retValue, term168685));
    }

};


