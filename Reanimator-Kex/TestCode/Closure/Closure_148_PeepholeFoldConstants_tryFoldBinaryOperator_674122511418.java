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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84737;
     Object term84823;
     Object term85057;
     Object term85058;
     Object term84994;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84737 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term84823 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term84909 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term84979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term84909, term84909.getClass(), "next", term84979);
        setField(term84823, term84823.getClass(), "first", term84909);
        setIntField(term84823, term84823.getClass(), "type", 11);
        term85057 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term85057, term85057.getClass(), "currentTraversal", null);
        term85058 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term85059 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term85060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term85058, term85058.getClass(), "functionName", null);
        setBooleanField(term85058, term85058.getClass(), "itsNeedsActivation", false);
        setIntField(term85058, term85058.getClass(), "itsFunctionType", 0);
        setBooleanField(term85058, term85058.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term85058, term85058.getClass(), "encodedSourceStart", 0);
        setIntField(term85058, term85058.getClass(), "encodedSourceEnd", 0);
        setField(term85058, term85058.getClass(), "sourceName", null);
        setIntField(term85058, term85058.getClass(), "baseLineno", 0);
        setIntField(term85058, term85058.getClass(), "endLineno", 0);
        setField(term85058, term85058.getClass(), "functions", null);
        setField(term85058, term85058.getClass(), "regexps", null);
        setField(term85058, term85058.getClass(), "itsVariables", null);
        setField(term85058, term85058.getClass(), "itsConst", null);
        setField(term85058, term85058.getClass(), "itsVariableNames", null);
        setIntField(term85058, term85058.getClass(), "varStart", 0);
        setField(term85058, term85058.getClass(), "compilerData", null);
        setIntField(term85058, term85058.getClass(), "type", 11);
        setField(term85058, term85058.getClass(), "next", null);
        setField(term85059, term85059.getClass(), "functionName", null);
        setBooleanField(term85059, term85059.getClass(), "itsNeedsActivation", false);
        setIntField(term85059, term85059.getClass(), "itsFunctionType", 0);
        setBooleanField(term85059, term85059.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term85059, term85059.getClass(), "encodedSourceStart", 0);
        setIntField(term85059, term85059.getClass(), "encodedSourceEnd", 0);
        setField(term85059, term85059.getClass(), "sourceName", null);
        setIntField(term85059, term85059.getClass(), "baseLineno", 0);
        setIntField(term85059, term85059.getClass(), "endLineno", 0);
        setField(term85059, term85059.getClass(), "functions", null);
        setField(term85059, term85059.getClass(), "regexps", null);
        setField(term85059, term85059.getClass(), "itsVariables", null);
        setField(term85059, term85059.getClass(), "itsConst", null);
        setField(term85059, term85059.getClass(), "itsVariableNames", null);
        setIntField(term85059, term85059.getClass(), "varStart", 0);
        setField(term85059, term85059.getClass(), "compilerData", null);
        setIntField(term85059, term85059.getClass(), "type", 0);
        setIntField(term85060, term85060.getClass(), "type", 0);
        setField(term85060, term85060.getClass(), "next", null);
        setField(term85060, term85060.getClass(), "first", null);
        setField(term85060, term85060.getClass(), "last", null);
        setField(term85060, term85060.getClass(), "propListHead", null);
        setIntField(term85060, term85060.getClass(), "sourcePosition", 0);
        setField(term85060, term85060.getClass(), "jsType", null);
        setField(term85060, term85060.getClass(), "parent", null);
        setField(term85059, term85059.getClass(), "next", term85060);
        setField(term85059, term85059.getClass(), "first", null);
        setField(term85059, term85059.getClass(), "last", null);
        setField(term85059, term85059.getClass(), "propListHead", null);
        setIntField(term85059, term85059.getClass(), "sourcePosition", 0);
        setField(term85059, term85059.getClass(), "jsType", null);
        setField(term85059, term85059.getClass(), "parent", null);
        setField(term85058, term85058.getClass(), "first", term85059);
        setField(term85058, term85058.getClass(), "last", null);
        setField(term85058, term85058.getClass(), "propListHead", null);
        setIntField(term85058, term85058.getClass(), "sourcePosition", 0);
        setField(term85058, term85058.getClass(), "jsType", null);
        setField(term85058, term85058.getClass(), "parent", null);
        term84994 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term85004 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term85014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term84994, term84994.getClass(), "functionName", null);
        setBooleanField(term84994, term84994.getClass(), "itsNeedsActivation", false);
        setIntField(term84994, term84994.getClass(), "itsFunctionType", 0);
        setBooleanField(term84994, term84994.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term84994, term84994.getClass(), "encodedSourceStart", 0);
        setIntField(term84994, term84994.getClass(), "encodedSourceEnd", 0);
        setField(term84994, term84994.getClass(), "sourceName", null);
        setIntField(term84994, term84994.getClass(), "baseLineno", 0);
        setIntField(term84994, term84994.getClass(), "endLineno", 0);
        setField(term84994, term84994.getClass(), "functions", null);
        setField(term84994, term84994.getClass(), "regexps", null);
        setField(term84994, term84994.getClass(), "itsVariables", null);
        setField(term84994, term84994.getClass(), "itsConst", null);
        setField(term84994, term84994.getClass(), "itsVariableNames", null);
        setIntField(term84994, term84994.getClass(), "varStart", 0);
        setField(term84994, term84994.getClass(), "compilerData", null);
        setIntField(term84994, term84994.getClass(), "type", 11);
        setField(term84994, term84994.getClass(), "next", null);
        setField(term85004, term85004.getClass(), "functionName", null);
        setBooleanField(term85004, term85004.getClass(), "itsNeedsActivation", false);
        setIntField(term85004, term85004.getClass(), "itsFunctionType", 0);
        setBooleanField(term85004, term85004.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term85004, term85004.getClass(), "encodedSourceStart", 0);
        setIntField(term85004, term85004.getClass(), "encodedSourceEnd", 0);
        setField(term85004, term85004.getClass(), "sourceName", null);
        setIntField(term85004, term85004.getClass(), "baseLineno", 0);
        setIntField(term85004, term85004.getClass(), "endLineno", 0);
        setField(term85004, term85004.getClass(), "functions", null);
        setField(term85004, term85004.getClass(), "regexps", null);
        setField(term85004, term85004.getClass(), "itsVariables", null);
        setField(term85004, term85004.getClass(), "itsConst", null);
        setField(term85004, term85004.getClass(), "itsVariableNames", null);
        setIntField(term85004, term85004.getClass(), "varStart", 0);
        setField(term85004, term85004.getClass(), "compilerData", null);
        setIntField(term85004, term85004.getClass(), "type", 0);
        setIntField(term85014, term85014.getClass(), "type", 0);
        setField(term85014, term85014.getClass(), "next", null);
        setField(term85014, term85014.getClass(), "first", null);
        setField(term85014, term85014.getClass(), "last", null);
        setField(term85014, term85014.getClass(), "propListHead", null);
        setIntField(term85014, term85014.getClass(), "sourcePosition", 0);
        setField(term85014, term85014.getClass(), "jsType", null);
        setField(term85014, term85014.getClass(), "parent", null);
        setField(term85004, term85004.getClass(), "next", term85014);
        setField(term85004, term85004.getClass(), "first", null);
        setField(term85004, term85004.getClass(), "last", null);
        setField(term85004, term85004.getClass(), "propListHead", null);
        setIntField(term85004, term85004.getClass(), "sourcePosition", 0);
        setField(term85004, term85004.getClass(), "jsType", null);
        setField(term85004, term85004.getClass(), "parent", null);
        setField(term84994, term84994.getClass(), "first", term85004);
        setField(term84994, term84994.getClass(), "last", null);
        setField(term84994, term84994.getClass(), "propListHead", null);
        setIntField(term84994, term84994.getClass(), "sourcePosition", 0);
        setField(term84994, term84994.getClass(), "jsType", null);
        setField(term84994, term84994.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term84823;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term84737, args);
        assertTrue(recursiveEquals(term84737, term85057));
        assertTrue(recursiveEquals(term84823, term85058));
        assertTrue(recursiveEquals(retValue, term84994));
    }

};


