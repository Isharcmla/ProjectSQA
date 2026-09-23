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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185333;
     Object term185419;
     Object term185653;
     Object term185654;
     Object term185590;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185333 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term185419 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term185505 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term185575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term185505, term185505.getClass(), "next", term185575);
        setField(term185419, term185419.getClass(), "first", term185505);
        setIntField(term185419, term185419.getClass(), "type", 33);
        term185653 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term185653, term185653.getClass(), "currentTraversal", null);
        term185654 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term185655 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term185656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term185654, term185654.getClass(), "functionName", null);
        setBooleanField(term185654, term185654.getClass(), "itsNeedsActivation", false);
        setIntField(term185654, term185654.getClass(), "itsFunctionType", 0);
        setBooleanField(term185654, term185654.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term185654, term185654.getClass(), "encodedSourceStart", 0);
        setIntField(term185654, term185654.getClass(), "encodedSourceEnd", 0);
        setField(term185654, term185654.getClass(), "sourceName", null);
        setIntField(term185654, term185654.getClass(), "baseLineno", 0);
        setIntField(term185654, term185654.getClass(), "endLineno", 0);
        setField(term185654, term185654.getClass(), "functions", null);
        setField(term185654, term185654.getClass(), "regexps", null);
        setField(term185654, term185654.getClass(), "itsVariables", null);
        setField(term185654, term185654.getClass(), "itsConst", null);
        setField(term185654, term185654.getClass(), "itsVariableNames", null);
        setIntField(term185654, term185654.getClass(), "varStart", 0);
        setField(term185654, term185654.getClass(), "compilerData", null);
        setIntField(term185654, term185654.getClass(), "type", 33);
        setField(term185654, term185654.getClass(), "next", null);
        setField(term185655, term185655.getClass(), "functionName", null);
        setBooleanField(term185655, term185655.getClass(), "itsNeedsActivation", false);
        setIntField(term185655, term185655.getClass(), "itsFunctionType", 0);
        setBooleanField(term185655, term185655.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term185655, term185655.getClass(), "encodedSourceStart", 0);
        setIntField(term185655, term185655.getClass(), "encodedSourceEnd", 0);
        setField(term185655, term185655.getClass(), "sourceName", null);
        setIntField(term185655, term185655.getClass(), "baseLineno", 0);
        setIntField(term185655, term185655.getClass(), "endLineno", 0);
        setField(term185655, term185655.getClass(), "functions", null);
        setField(term185655, term185655.getClass(), "regexps", null);
        setField(term185655, term185655.getClass(), "itsVariables", null);
        setField(term185655, term185655.getClass(), "itsConst", null);
        setField(term185655, term185655.getClass(), "itsVariableNames", null);
        setIntField(term185655, term185655.getClass(), "varStart", 0);
        setField(term185655, term185655.getClass(), "compilerData", null);
        setIntField(term185655, term185655.getClass(), "type", 0);
        setIntField(term185656, term185656.getClass(), "type", 0);
        setField(term185656, term185656.getClass(), "next", null);
        setField(term185656, term185656.getClass(), "first", null);
        setField(term185656, term185656.getClass(), "last", null);
        setField(term185656, term185656.getClass(), "propListHead", null);
        setIntField(term185656, term185656.getClass(), "sourcePosition", 0);
        setField(term185656, term185656.getClass(), "jsType", null);
        setField(term185656, term185656.getClass(), "parent", null);
        setField(term185655, term185655.getClass(), "next", term185656);
        setField(term185655, term185655.getClass(), "first", null);
        setField(term185655, term185655.getClass(), "last", null);
        setField(term185655, term185655.getClass(), "propListHead", null);
        setIntField(term185655, term185655.getClass(), "sourcePosition", 0);
        setField(term185655, term185655.getClass(), "jsType", null);
        setField(term185655, term185655.getClass(), "parent", null);
        setField(term185654, term185654.getClass(), "first", term185655);
        setField(term185654, term185654.getClass(), "last", null);
        setField(term185654, term185654.getClass(), "propListHead", null);
        setIntField(term185654, term185654.getClass(), "sourcePosition", 0);
        setField(term185654, term185654.getClass(), "jsType", null);
        setField(term185654, term185654.getClass(), "parent", null);
        term185590 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term185600 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term185610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term185590, term185590.getClass(), "functionName", null);
        setBooleanField(term185590, term185590.getClass(), "itsNeedsActivation", false);
        setIntField(term185590, term185590.getClass(), "itsFunctionType", 0);
        setBooleanField(term185590, term185590.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term185590, term185590.getClass(), "encodedSourceStart", 0);
        setIntField(term185590, term185590.getClass(), "encodedSourceEnd", 0);
        setField(term185590, term185590.getClass(), "sourceName", null);
        setIntField(term185590, term185590.getClass(), "baseLineno", 0);
        setIntField(term185590, term185590.getClass(), "endLineno", 0);
        setField(term185590, term185590.getClass(), "functions", null);
        setField(term185590, term185590.getClass(), "regexps", null);
        setField(term185590, term185590.getClass(), "itsVariables", null);
        setField(term185590, term185590.getClass(), "itsConst", null);
        setField(term185590, term185590.getClass(), "itsVariableNames", null);
        setIntField(term185590, term185590.getClass(), "varStart", 0);
        setField(term185590, term185590.getClass(), "compilerData", null);
        setIntField(term185590, term185590.getClass(), "type", 33);
        setField(term185590, term185590.getClass(), "next", null);
        setField(term185600, term185600.getClass(), "functionName", null);
        setBooleanField(term185600, term185600.getClass(), "itsNeedsActivation", false);
        setIntField(term185600, term185600.getClass(), "itsFunctionType", 0);
        setBooleanField(term185600, term185600.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term185600, term185600.getClass(), "encodedSourceStart", 0);
        setIntField(term185600, term185600.getClass(), "encodedSourceEnd", 0);
        setField(term185600, term185600.getClass(), "sourceName", null);
        setIntField(term185600, term185600.getClass(), "baseLineno", 0);
        setIntField(term185600, term185600.getClass(), "endLineno", 0);
        setField(term185600, term185600.getClass(), "functions", null);
        setField(term185600, term185600.getClass(), "regexps", null);
        setField(term185600, term185600.getClass(), "itsVariables", null);
        setField(term185600, term185600.getClass(), "itsConst", null);
        setField(term185600, term185600.getClass(), "itsVariableNames", null);
        setIntField(term185600, term185600.getClass(), "varStart", 0);
        setField(term185600, term185600.getClass(), "compilerData", null);
        setIntField(term185600, term185600.getClass(), "type", 0);
        setIntField(term185610, term185610.getClass(), "type", 0);
        setField(term185610, term185610.getClass(), "next", null);
        setField(term185610, term185610.getClass(), "first", null);
        setField(term185610, term185610.getClass(), "last", null);
        setField(term185610, term185610.getClass(), "propListHead", null);
        setIntField(term185610, term185610.getClass(), "sourcePosition", 0);
        setField(term185610, term185610.getClass(), "jsType", null);
        setField(term185610, term185610.getClass(), "parent", null);
        setField(term185600, term185600.getClass(), "next", term185610);
        setField(term185600, term185600.getClass(), "first", null);
        setField(term185600, term185600.getClass(), "last", null);
        setField(term185600, term185600.getClass(), "propListHead", null);
        setIntField(term185600, term185600.getClass(), "sourcePosition", 0);
        setField(term185600, term185600.getClass(), "jsType", null);
        setField(term185600, term185600.getClass(), "parent", null);
        setField(term185590, term185590.getClass(), "first", term185600);
        setField(term185590, term185590.getClass(), "last", null);
        setField(term185590, term185590.getClass(), "propListHead", null);
        setIntField(term185590, term185590.getClass(), "sourcePosition", 0);
        setField(term185590, term185590.getClass(), "jsType", null);
        setField(term185590, term185590.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term185419;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term185333, args);
        assertTrue(recursiveEquals(term185333, term185653));
        assertTrue(recursiveEquals(term185419, term185654));
        assertTrue(recursiveEquals(retValue, term185590));
    }

};


