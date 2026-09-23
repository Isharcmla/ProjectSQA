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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term470754;
     Object term470846;
     Object term517861;
     Object term517862;
     Object term517807;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term470754 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term470846 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term470932 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term471002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term470932, term470932.getClass(), "next", term471002);
        setField(term470846, term470846.getClass(), "first", term470932);
        setIntField(term470846, term470846.getClass(), "type", 15);
        term517861 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term517861, term517861.getClass(), "currentTraversal", null);
        term517862 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term517863 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term517864 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term517862, term517862.getClass(), "str", null);
        setIntField(term517862, term517862.getClass(), "type", 15);
        setField(term517862, term517862.getClass(), "next", null);
        setField(term517863, term517863.getClass(), "functionName", null);
        setBooleanField(term517863, term517863.getClass(), "itsNeedsActivation", false);
        setIntField(term517863, term517863.getClass(), "itsFunctionType", 0);
        setBooleanField(term517863, term517863.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term517863, term517863.getClass(), "encodedSourceStart", 0);
        setIntField(term517863, term517863.getClass(), "encodedSourceEnd", 0);
        setField(term517863, term517863.getClass(), "sourceName", null);
        setIntField(term517863, term517863.getClass(), "baseLineno", 0);
        setIntField(term517863, term517863.getClass(), "endLineno", 0);
        setField(term517863, term517863.getClass(), "functions", null);
        setField(term517863, term517863.getClass(), "regexps", null);
        setField(term517863, term517863.getClass(), "itsVariables", null);
        setField(term517863, term517863.getClass(), "itsConst", null);
        setField(term517863, term517863.getClass(), "itsVariableNames", null);
        setIntField(term517863, term517863.getClass(), "varStart", 0);
        setField(term517863, term517863.getClass(), "compilerData", null);
        setIntField(term517863, term517863.getClass(), "type", 0);
        setIntField(term517864, term517864.getClass(), "type", 0);
        setField(term517864, term517864.getClass(), "next", null);
        setField(term517864, term517864.getClass(), "first", null);
        setField(term517864, term517864.getClass(), "last", null);
        setField(term517864, term517864.getClass(), "propListHead", null);
        setIntField(term517864, term517864.getClass(), "sourcePosition", 0);
        setField(term517864, term517864.getClass(), "jsType", null);
        setField(term517864, term517864.getClass(), "parent", null);
        setField(term517863, term517863.getClass(), "next", term517864);
        setField(term517863, term517863.getClass(), "first", null);
        setField(term517863, term517863.getClass(), "last", null);
        setField(term517863, term517863.getClass(), "propListHead", null);
        setIntField(term517863, term517863.getClass(), "sourcePosition", 0);
        setField(term517863, term517863.getClass(), "jsType", null);
        setField(term517863, term517863.getClass(), "parent", null);
        setField(term517862, term517862.getClass(), "first", term517863);
        setField(term517862, term517862.getClass(), "last", null);
        setField(term517862, term517862.getClass(), "propListHead", null);
        setIntField(term517862, term517862.getClass(), "sourcePosition", 0);
        setField(term517862, term517862.getClass(), "jsType", null);
        setField(term517862, term517862.getClass(), "parent", null);
        term517807 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term517809 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term517819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term517807, term517807.getClass(), "str", null);
        setIntField(term517807, term517807.getClass(), "type", 15);
        setField(term517807, term517807.getClass(), "next", null);
        setField(term517809, term517809.getClass(), "functionName", null);
        setBooleanField(term517809, term517809.getClass(), "itsNeedsActivation", false);
        setIntField(term517809, term517809.getClass(), "itsFunctionType", 0);
        setBooleanField(term517809, term517809.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term517809, term517809.getClass(), "encodedSourceStart", 0);
        setIntField(term517809, term517809.getClass(), "encodedSourceEnd", 0);
        setField(term517809, term517809.getClass(), "sourceName", null);
        setIntField(term517809, term517809.getClass(), "baseLineno", 0);
        setIntField(term517809, term517809.getClass(), "endLineno", 0);
        setField(term517809, term517809.getClass(), "functions", null);
        setField(term517809, term517809.getClass(), "regexps", null);
        setField(term517809, term517809.getClass(), "itsVariables", null);
        setField(term517809, term517809.getClass(), "itsConst", null);
        setField(term517809, term517809.getClass(), "itsVariableNames", null);
        setIntField(term517809, term517809.getClass(), "varStart", 0);
        setField(term517809, term517809.getClass(), "compilerData", null);
        setIntField(term517809, term517809.getClass(), "type", 0);
        setIntField(term517819, term517819.getClass(), "type", 0);
        setField(term517819, term517819.getClass(), "next", null);
        setField(term517819, term517819.getClass(), "first", null);
        setField(term517819, term517819.getClass(), "last", null);
        setField(term517819, term517819.getClass(), "propListHead", null);
        setIntField(term517819, term517819.getClass(), "sourcePosition", 0);
        setField(term517819, term517819.getClass(), "jsType", null);
        setField(term517819, term517819.getClass(), "parent", null);
        setField(term517809, term517809.getClass(), "next", term517819);
        setField(term517809, term517809.getClass(), "first", null);
        setField(term517809, term517809.getClass(), "last", null);
        setField(term517809, term517809.getClass(), "propListHead", null);
        setIntField(term517809, term517809.getClass(), "sourcePosition", 0);
        setField(term517809, term517809.getClass(), "jsType", null);
        setField(term517809, term517809.getClass(), "parent", null);
        setField(term517807, term517807.getClass(), "first", term517809);
        setField(term517807, term517807.getClass(), "last", null);
        setField(term517807, term517807.getClass(), "propListHead", null);
        setIntField(term517807, term517807.getClass(), "sourcePosition", 0);
        setField(term517807, term517807.getClass(), "jsType", null);
        setField(term517807, term517807.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term470846;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term470754, args);
        assertTrue(recursiveEquals(term470754, term517861));
        assertTrue(recursiveEquals(term470846, term517862));
        assertTrue(recursiveEquals(retValue, term517807));
    }

};


