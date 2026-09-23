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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219550;
     Object term219636;
     Object term220321;
     Object term220322;
     Object term220254;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219550 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term219636 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term219722 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term219814 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term219722, term219722.getClass(), "next", term219814);
        setIntField(term219722, term219722.getClass(), "type", 39);
        setField(term219636, term219636.getClass(), "first", term219722);
        setIntField(term219636, term219636.getClass(), "type", 9);
        term220321 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term220321, term220321.getClass(), "currentTraversal", null);
        term220322 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term220323 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term220324 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term220322, term220322.getClass(), "functionName", null);
        setBooleanField(term220322, term220322.getClass(), "itsNeedsActivation", false);
        setIntField(term220322, term220322.getClass(), "itsFunctionType", 0);
        setBooleanField(term220322, term220322.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term220322, term220322.getClass(), "encodedSourceStart", 0);
        setIntField(term220322, term220322.getClass(), "encodedSourceEnd", 0);
        setField(term220322, term220322.getClass(), "sourceName", null);
        setIntField(term220322, term220322.getClass(), "baseLineno", 0);
        setIntField(term220322, term220322.getClass(), "endLineno", 0);
        setField(term220322, term220322.getClass(), "functions", null);
        setField(term220322, term220322.getClass(), "regexps", null);
        setField(term220322, term220322.getClass(), "itsVariables", null);
        setField(term220322, term220322.getClass(), "itsConst", null);
        setField(term220322, term220322.getClass(), "itsVariableNames", null);
        setIntField(term220322, term220322.getClass(), "varStart", 0);
        setField(term220322, term220322.getClass(), "compilerData", null);
        setIntField(term220322, term220322.getClass(), "type", 9);
        setField(term220322, term220322.getClass(), "next", null);
        setField(term220323, term220323.getClass(), "functionName", null);
        setBooleanField(term220323, term220323.getClass(), "itsNeedsActivation", false);
        setIntField(term220323, term220323.getClass(), "itsFunctionType", 0);
        setBooleanField(term220323, term220323.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term220323, term220323.getClass(), "encodedSourceStart", 0);
        setIntField(term220323, term220323.getClass(), "encodedSourceEnd", 0);
        setField(term220323, term220323.getClass(), "sourceName", null);
        setIntField(term220323, term220323.getClass(), "baseLineno", 0);
        setIntField(term220323, term220323.getClass(), "endLineno", 0);
        setField(term220323, term220323.getClass(), "functions", null);
        setField(term220323, term220323.getClass(), "regexps", null);
        setField(term220323, term220323.getClass(), "itsVariables", null);
        setField(term220323, term220323.getClass(), "itsConst", null);
        setField(term220323, term220323.getClass(), "itsVariableNames", null);
        setIntField(term220323, term220323.getClass(), "varStart", 0);
        setField(term220323, term220323.getClass(), "compilerData", null);
        setIntField(term220323, term220323.getClass(), "type", 39);
        setField(term220324, term220324.getClass(), "str", null);
        setIntField(term220324, term220324.getClass(), "type", 0);
        setField(term220324, term220324.getClass(), "next", null);
        setField(term220324, term220324.getClass(), "first", null);
        setField(term220324, term220324.getClass(), "last", null);
        setField(term220324, term220324.getClass(), "propListHead", null);
        setIntField(term220324, term220324.getClass(), "sourcePosition", 0);
        setField(term220324, term220324.getClass(), "jsType", null);
        setField(term220324, term220324.getClass(), "parent", null);
        setField(term220323, term220323.getClass(), "next", term220324);
        setField(term220323, term220323.getClass(), "first", null);
        setField(term220323, term220323.getClass(), "last", null);
        setField(term220323, term220323.getClass(), "propListHead", null);
        setIntField(term220323, term220323.getClass(), "sourcePosition", 0);
        setField(term220323, term220323.getClass(), "jsType", null);
        setField(term220323, term220323.getClass(), "parent", null);
        setField(term220322, term220322.getClass(), "first", term220323);
        setField(term220322, term220322.getClass(), "last", null);
        setField(term220322, term220322.getClass(), "propListHead", null);
        setIntField(term220322, term220322.getClass(), "sourcePosition", 0);
        setField(term220322, term220322.getClass(), "jsType", null);
        setField(term220322, term220322.getClass(), "parent", null);
        term220254 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term220264 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term220274 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term220254, term220254.getClass(), "functionName", null);
        setBooleanField(term220254, term220254.getClass(), "itsNeedsActivation", false);
        setIntField(term220254, term220254.getClass(), "itsFunctionType", 0);
        setBooleanField(term220254, term220254.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term220254, term220254.getClass(), "encodedSourceStart", 0);
        setIntField(term220254, term220254.getClass(), "encodedSourceEnd", 0);
        setField(term220254, term220254.getClass(), "sourceName", null);
        setIntField(term220254, term220254.getClass(), "baseLineno", 0);
        setIntField(term220254, term220254.getClass(), "endLineno", 0);
        setField(term220254, term220254.getClass(), "functions", null);
        setField(term220254, term220254.getClass(), "regexps", null);
        setField(term220254, term220254.getClass(), "itsVariables", null);
        setField(term220254, term220254.getClass(), "itsConst", null);
        setField(term220254, term220254.getClass(), "itsVariableNames", null);
        setIntField(term220254, term220254.getClass(), "varStart", 0);
        setField(term220254, term220254.getClass(), "compilerData", null);
        setIntField(term220254, term220254.getClass(), "type", 9);
        setField(term220254, term220254.getClass(), "next", null);
        setField(term220264, term220264.getClass(), "functionName", null);
        setBooleanField(term220264, term220264.getClass(), "itsNeedsActivation", false);
        setIntField(term220264, term220264.getClass(), "itsFunctionType", 0);
        setBooleanField(term220264, term220264.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term220264, term220264.getClass(), "encodedSourceStart", 0);
        setIntField(term220264, term220264.getClass(), "encodedSourceEnd", 0);
        setField(term220264, term220264.getClass(), "sourceName", null);
        setIntField(term220264, term220264.getClass(), "baseLineno", 0);
        setIntField(term220264, term220264.getClass(), "endLineno", 0);
        setField(term220264, term220264.getClass(), "functions", null);
        setField(term220264, term220264.getClass(), "regexps", null);
        setField(term220264, term220264.getClass(), "itsVariables", null);
        setField(term220264, term220264.getClass(), "itsConst", null);
        setField(term220264, term220264.getClass(), "itsVariableNames", null);
        setIntField(term220264, term220264.getClass(), "varStart", 0);
        setField(term220264, term220264.getClass(), "compilerData", null);
        setIntField(term220264, term220264.getClass(), "type", 39);
        setField(term220274, term220274.getClass(), "str", null);
        setIntField(term220274, term220274.getClass(), "type", 0);
        setField(term220274, term220274.getClass(), "next", null);
        setField(term220274, term220274.getClass(), "first", null);
        setField(term220274, term220274.getClass(), "last", null);
        setField(term220274, term220274.getClass(), "propListHead", null);
        setIntField(term220274, term220274.getClass(), "sourcePosition", 0);
        setField(term220274, term220274.getClass(), "jsType", null);
        setField(term220274, term220274.getClass(), "parent", null);
        setField(term220264, term220264.getClass(), "next", term220274);
        setField(term220264, term220264.getClass(), "first", null);
        setField(term220264, term220264.getClass(), "last", null);
        setField(term220264, term220264.getClass(), "propListHead", null);
        setIntField(term220264, term220264.getClass(), "sourcePosition", 0);
        setField(term220264, term220264.getClass(), "jsType", null);
        setField(term220264, term220264.getClass(), "parent", null);
        setField(term220254, term220254.getClass(), "first", term220264);
        setField(term220254, term220254.getClass(), "last", null);
        setField(term220254, term220254.getClass(), "propListHead", null);
        setIntField(term220254, term220254.getClass(), "sourcePosition", 0);
        setField(term220254, term220254.getClass(), "jsType", null);
        setField(term220254, term220254.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term219636;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term219550, args);
        assertTrue(recursiveEquals(term219550, term220321));
        assertTrue(recursiveEquals(term219636, term220322));
        assertTrue(recursiveEquals(retValue, term220254));
    }

};


