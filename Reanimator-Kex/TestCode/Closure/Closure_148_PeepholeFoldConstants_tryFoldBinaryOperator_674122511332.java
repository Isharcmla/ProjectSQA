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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65375;
     Object term65461;
     Object term66464;
     Object term66465;
     Object term66405;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65375 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term65461 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term65547 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term65617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term65547, term65547.getClass(), "next", term65617);
        setField(term65461, term65461.getClass(), "first", term65547);
        setIntField(term65461, term65461.getClass(), "type", 22);
        term66464 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term66464, term66464.getClass(), "currentTraversal", null);
        term66465 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term66466 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term66467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term66465, term66465.getClass(), "functionName", null);
        setBooleanField(term66465, term66465.getClass(), "itsNeedsActivation", false);
        setIntField(term66465, term66465.getClass(), "itsFunctionType", 0);
        setBooleanField(term66465, term66465.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term66465, term66465.getClass(), "encodedSourceStart", 0);
        setIntField(term66465, term66465.getClass(), "encodedSourceEnd", 0);
        setField(term66465, term66465.getClass(), "sourceName", null);
        setIntField(term66465, term66465.getClass(), "baseLineno", 0);
        setIntField(term66465, term66465.getClass(), "endLineno", 0);
        setField(term66465, term66465.getClass(), "functions", null);
        setField(term66465, term66465.getClass(), "regexps", null);
        setField(term66465, term66465.getClass(), "itsVariables", null);
        setField(term66465, term66465.getClass(), "itsConst", null);
        setField(term66465, term66465.getClass(), "itsVariableNames", null);
        setIntField(term66465, term66465.getClass(), "varStart", 0);
        setField(term66465, term66465.getClass(), "compilerData", null);
        setIntField(term66465, term66465.getClass(), "type", 22);
        setField(term66465, term66465.getClass(), "next", null);
        setField(term66466, term66466.getClass(), "functionName", null);
        setBooleanField(term66466, term66466.getClass(), "itsNeedsActivation", false);
        setIntField(term66466, term66466.getClass(), "itsFunctionType", 0);
        setBooleanField(term66466, term66466.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term66466, term66466.getClass(), "encodedSourceStart", 0);
        setIntField(term66466, term66466.getClass(), "encodedSourceEnd", 0);
        setField(term66466, term66466.getClass(), "sourceName", null);
        setIntField(term66466, term66466.getClass(), "baseLineno", 0);
        setIntField(term66466, term66466.getClass(), "endLineno", 0);
        setField(term66466, term66466.getClass(), "functions", null);
        setField(term66466, term66466.getClass(), "regexps", null);
        setField(term66466, term66466.getClass(), "itsVariables", null);
        setField(term66466, term66466.getClass(), "itsConst", null);
        setField(term66466, term66466.getClass(), "itsVariableNames", null);
        setIntField(term66466, term66466.getClass(), "varStart", 0);
        setField(term66466, term66466.getClass(), "compilerData", null);
        setIntField(term66466, term66466.getClass(), "type", 0);
        setIntField(term66467, term66467.getClass(), "type", 0);
        setField(term66467, term66467.getClass(), "next", null);
        setField(term66467, term66467.getClass(), "first", null);
        setField(term66467, term66467.getClass(), "last", null);
        setField(term66467, term66467.getClass(), "propListHead", null);
        setIntField(term66467, term66467.getClass(), "sourcePosition", 0);
        setField(term66467, term66467.getClass(), "jsType", null);
        setField(term66467, term66467.getClass(), "parent", null);
        setField(term66466, term66466.getClass(), "next", term66467);
        setField(term66466, term66466.getClass(), "first", null);
        setField(term66466, term66466.getClass(), "last", null);
        setField(term66466, term66466.getClass(), "propListHead", null);
        setIntField(term66466, term66466.getClass(), "sourcePosition", 0);
        setField(term66466, term66466.getClass(), "jsType", null);
        setField(term66466, term66466.getClass(), "parent", null);
        setField(term66465, term66465.getClass(), "first", term66466);
        setField(term66465, term66465.getClass(), "last", null);
        setField(term66465, term66465.getClass(), "propListHead", null);
        setIntField(term66465, term66465.getClass(), "sourcePosition", 0);
        setField(term66465, term66465.getClass(), "jsType", null);
        setField(term66465, term66465.getClass(), "parent", null);
        term66405 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term66415 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term66425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term66405, term66405.getClass(), "functionName", null);
        setBooleanField(term66405, term66405.getClass(), "itsNeedsActivation", false);
        setIntField(term66405, term66405.getClass(), "itsFunctionType", 0);
        setBooleanField(term66405, term66405.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term66405, term66405.getClass(), "encodedSourceStart", 0);
        setIntField(term66405, term66405.getClass(), "encodedSourceEnd", 0);
        setField(term66405, term66405.getClass(), "sourceName", null);
        setIntField(term66405, term66405.getClass(), "baseLineno", 0);
        setIntField(term66405, term66405.getClass(), "endLineno", 0);
        setField(term66405, term66405.getClass(), "functions", null);
        setField(term66405, term66405.getClass(), "regexps", null);
        setField(term66405, term66405.getClass(), "itsVariables", null);
        setField(term66405, term66405.getClass(), "itsConst", null);
        setField(term66405, term66405.getClass(), "itsVariableNames", null);
        setIntField(term66405, term66405.getClass(), "varStart", 0);
        setField(term66405, term66405.getClass(), "compilerData", null);
        setIntField(term66405, term66405.getClass(), "type", 22);
        setField(term66405, term66405.getClass(), "next", null);
        setField(term66415, term66415.getClass(), "functionName", null);
        setBooleanField(term66415, term66415.getClass(), "itsNeedsActivation", false);
        setIntField(term66415, term66415.getClass(), "itsFunctionType", 0);
        setBooleanField(term66415, term66415.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term66415, term66415.getClass(), "encodedSourceStart", 0);
        setIntField(term66415, term66415.getClass(), "encodedSourceEnd", 0);
        setField(term66415, term66415.getClass(), "sourceName", null);
        setIntField(term66415, term66415.getClass(), "baseLineno", 0);
        setIntField(term66415, term66415.getClass(), "endLineno", 0);
        setField(term66415, term66415.getClass(), "functions", null);
        setField(term66415, term66415.getClass(), "regexps", null);
        setField(term66415, term66415.getClass(), "itsVariables", null);
        setField(term66415, term66415.getClass(), "itsConst", null);
        setField(term66415, term66415.getClass(), "itsVariableNames", null);
        setIntField(term66415, term66415.getClass(), "varStart", 0);
        setField(term66415, term66415.getClass(), "compilerData", null);
        setIntField(term66415, term66415.getClass(), "type", 0);
        setIntField(term66425, term66425.getClass(), "type", 0);
        setField(term66425, term66425.getClass(), "next", null);
        setField(term66425, term66425.getClass(), "first", null);
        setField(term66425, term66425.getClass(), "last", null);
        setField(term66425, term66425.getClass(), "propListHead", null);
        setIntField(term66425, term66425.getClass(), "sourcePosition", 0);
        setField(term66425, term66425.getClass(), "jsType", null);
        setField(term66425, term66425.getClass(), "parent", null);
        setField(term66415, term66415.getClass(), "next", term66425);
        setField(term66415, term66415.getClass(), "first", null);
        setField(term66415, term66415.getClass(), "last", null);
        setField(term66415, term66415.getClass(), "propListHead", null);
        setIntField(term66415, term66415.getClass(), "sourcePosition", 0);
        setField(term66415, term66415.getClass(), "jsType", null);
        setField(term66415, term66415.getClass(), "parent", null);
        setField(term66405, term66405.getClass(), "first", term66415);
        setField(term66405, term66405.getClass(), "last", null);
        setField(term66405, term66405.getClass(), "propListHead", null);
        setIntField(term66405, term66405.getClass(), "sourcePosition", 0);
        setField(term66405, term66405.getClass(), "jsType", null);
        setField(term66405, term66405.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term65461;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term65375, args);
        assertTrue(recursiveEquals(term65375, term66464));
        assertTrue(recursiveEquals(term65461, term66465));
        assertTrue(recursiveEquals(retValue, term66405));
    }

};


