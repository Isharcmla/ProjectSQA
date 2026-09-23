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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term430418;
     Object term430510;
     Object term430731;
     Object term430732;
     Object term430681;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term430418 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term430510 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term430596 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term430666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term430596, term430596.getClass(), "next", term430666);
        setField(term430510, term430510.getClass(), "first", term430596);
        setIntField(term430510, term430510.getClass(), "type", 15);
        term430731 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term430731, term430731.getClass(), "currentTraversal", null);
        term430732 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term430733 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term430734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term430732, term430732.getClass(), "str", null);
        setIntField(term430732, term430732.getClass(), "type", 15);
        setField(term430732, term430732.getClass(), "next", null);
        setField(term430733, term430733.getClass(), "functionName", null);
        setBooleanField(term430733, term430733.getClass(), "itsNeedsActivation", false);
        setIntField(term430733, term430733.getClass(), "itsFunctionType", 0);
        setBooleanField(term430733, term430733.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term430733, term430733.getClass(), "encodedSourceStart", 0);
        setIntField(term430733, term430733.getClass(), "encodedSourceEnd", 0);
        setField(term430733, term430733.getClass(), "sourceName", null);
        setIntField(term430733, term430733.getClass(), "baseLineno", 0);
        setIntField(term430733, term430733.getClass(), "endLineno", 0);
        setField(term430733, term430733.getClass(), "functions", null);
        setField(term430733, term430733.getClass(), "regexps", null);
        setField(term430733, term430733.getClass(), "itsVariables", null);
        setField(term430733, term430733.getClass(), "itsConst", null);
        setField(term430733, term430733.getClass(), "itsVariableNames", null);
        setIntField(term430733, term430733.getClass(), "varStart", 0);
        setField(term430733, term430733.getClass(), "compilerData", null);
        setIntField(term430733, term430733.getClass(), "type", 0);
        setIntField(term430734, term430734.getClass(), "type", 0);
        setField(term430734, term430734.getClass(), "next", null);
        setField(term430734, term430734.getClass(), "first", null);
        setField(term430734, term430734.getClass(), "last", null);
        setField(term430734, term430734.getClass(), "propListHead", null);
        setIntField(term430734, term430734.getClass(), "sourcePosition", 0);
        setField(term430734, term430734.getClass(), "jsType", null);
        setField(term430734, term430734.getClass(), "parent", null);
        setField(term430733, term430733.getClass(), "next", term430734);
        setField(term430733, term430733.getClass(), "first", null);
        setField(term430733, term430733.getClass(), "last", null);
        setField(term430733, term430733.getClass(), "propListHead", null);
        setIntField(term430733, term430733.getClass(), "sourcePosition", 0);
        setField(term430733, term430733.getClass(), "jsType", null);
        setField(term430733, term430733.getClass(), "parent", null);
        setField(term430732, term430732.getClass(), "first", term430733);
        setField(term430732, term430732.getClass(), "last", null);
        setField(term430732, term430732.getClass(), "propListHead", null);
        setIntField(term430732, term430732.getClass(), "sourcePosition", 0);
        setField(term430732, term430732.getClass(), "jsType", null);
        setField(term430732, term430732.getClass(), "parent", null);
        term430681 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term430683 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term430693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term430681, term430681.getClass(), "str", null);
        setIntField(term430681, term430681.getClass(), "type", 15);
        setField(term430681, term430681.getClass(), "next", null);
        setField(term430683, term430683.getClass(), "functionName", null);
        setBooleanField(term430683, term430683.getClass(), "itsNeedsActivation", false);
        setIntField(term430683, term430683.getClass(), "itsFunctionType", 0);
        setBooleanField(term430683, term430683.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term430683, term430683.getClass(), "encodedSourceStart", 0);
        setIntField(term430683, term430683.getClass(), "encodedSourceEnd", 0);
        setField(term430683, term430683.getClass(), "sourceName", null);
        setIntField(term430683, term430683.getClass(), "baseLineno", 0);
        setIntField(term430683, term430683.getClass(), "endLineno", 0);
        setField(term430683, term430683.getClass(), "functions", null);
        setField(term430683, term430683.getClass(), "regexps", null);
        setField(term430683, term430683.getClass(), "itsVariables", null);
        setField(term430683, term430683.getClass(), "itsConst", null);
        setField(term430683, term430683.getClass(), "itsVariableNames", null);
        setIntField(term430683, term430683.getClass(), "varStart", 0);
        setField(term430683, term430683.getClass(), "compilerData", null);
        setIntField(term430683, term430683.getClass(), "type", 0);
        setIntField(term430693, term430693.getClass(), "type", 0);
        setField(term430693, term430693.getClass(), "next", null);
        setField(term430693, term430693.getClass(), "first", null);
        setField(term430693, term430693.getClass(), "last", null);
        setField(term430693, term430693.getClass(), "propListHead", null);
        setIntField(term430693, term430693.getClass(), "sourcePosition", 0);
        setField(term430693, term430693.getClass(), "jsType", null);
        setField(term430693, term430693.getClass(), "parent", null);
        setField(term430683, term430683.getClass(), "next", term430693);
        setField(term430683, term430683.getClass(), "first", null);
        setField(term430683, term430683.getClass(), "last", null);
        setField(term430683, term430683.getClass(), "propListHead", null);
        setIntField(term430683, term430683.getClass(), "sourcePosition", 0);
        setField(term430683, term430683.getClass(), "jsType", null);
        setField(term430683, term430683.getClass(), "parent", null);
        setField(term430681, term430681.getClass(), "first", term430683);
        setField(term430681, term430681.getClass(), "last", null);
        setField(term430681, term430681.getClass(), "propListHead", null);
        setIntField(term430681, term430681.getClass(), "sourcePosition", 0);
        setField(term430681, term430681.getClass(), "jsType", null);
        setField(term430681, term430681.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term430510;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term430418, args);
        assertTrue(recursiveEquals(term430418, term430731));
        assertTrue(recursiveEquals(term430510, term430732));
        assertTrue(recursiveEquals(retValue, term430681));
    }

};


