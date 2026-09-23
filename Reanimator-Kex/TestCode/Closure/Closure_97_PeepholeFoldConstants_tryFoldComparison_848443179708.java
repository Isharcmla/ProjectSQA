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

public class PeepholeFoldConstants_tryFoldComparison_848443179708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182117;
     Object term182203;
     Object term182289;
     Object term182375;
     Object term182429;
     Object term182430;
     Object term182431;
     Object term182432;
     Object term182393;

    public PeepholeFoldConstants_tryFoldComparison_848443179708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182117 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term182203 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term182203, term182203.getClass(), "type", 14);
        term182289 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term182289, term182289.getClass(), "type", 14);
        term182375 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term182429 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term182429, term182429.getClass(), "currentTraversal", null);
        term182430 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term182430, term182430.getClass(), "functionName", null);
        setBooleanField(term182430, term182430.getClass(), "itsNeedsActivation", false);
        setIntField(term182430, term182430.getClass(), "itsFunctionType", 0);
        setBooleanField(term182430, term182430.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term182430, term182430.getClass(), "encodedSourceStart", 0);
        setIntField(term182430, term182430.getClass(), "encodedSourceEnd", 0);
        setField(term182430, term182430.getClass(), "sourceName", null);
        setIntField(term182430, term182430.getClass(), "baseLineno", 0);
        setIntField(term182430, term182430.getClass(), "endLineno", 0);
        setField(term182430, term182430.getClass(), "functions", null);
        setField(term182430, term182430.getClass(), "regexps", null);
        setField(term182430, term182430.getClass(), "itsVariables", null);
        setField(term182430, term182430.getClass(), "itsConst", null);
        setField(term182430, term182430.getClass(), "itsVariableNames", null);
        setIntField(term182430, term182430.getClass(), "varStart", 0);
        setField(term182430, term182430.getClass(), "compilerData", null);
        setIntField(term182430, term182430.getClass(), "type", 14);
        setField(term182430, term182430.getClass(), "next", null);
        setField(term182430, term182430.getClass(), "first", null);
        setField(term182430, term182430.getClass(), "last", null);
        setField(term182430, term182430.getClass(), "propListHead", null);
        setIntField(term182430, term182430.getClass(), "sourcePosition", 0);
        setField(term182430, term182430.getClass(), "jsType", null);
        setField(term182430, term182430.getClass(), "parent", null);
        term182431 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term182431, term182431.getClass(), "functionName", null);
        setBooleanField(term182431, term182431.getClass(), "itsNeedsActivation", false);
        setIntField(term182431, term182431.getClass(), "itsFunctionType", 0);
        setBooleanField(term182431, term182431.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term182431, term182431.getClass(), "encodedSourceStart", 0);
        setIntField(term182431, term182431.getClass(), "encodedSourceEnd", 0);
        setField(term182431, term182431.getClass(), "sourceName", null);
        setIntField(term182431, term182431.getClass(), "baseLineno", 0);
        setIntField(term182431, term182431.getClass(), "endLineno", 0);
        setField(term182431, term182431.getClass(), "functions", null);
        setField(term182431, term182431.getClass(), "regexps", null);
        setField(term182431, term182431.getClass(), "itsVariables", null);
        setField(term182431, term182431.getClass(), "itsConst", null);
        setField(term182431, term182431.getClass(), "itsVariableNames", null);
        setIntField(term182431, term182431.getClass(), "varStart", 0);
        setField(term182431, term182431.getClass(), "compilerData", null);
        setIntField(term182431, term182431.getClass(), "type", 14);
        setField(term182431, term182431.getClass(), "next", null);
        setField(term182431, term182431.getClass(), "first", null);
        setField(term182431, term182431.getClass(), "last", null);
        setField(term182431, term182431.getClass(), "propListHead", null);
        setIntField(term182431, term182431.getClass(), "sourcePosition", 0);
        setField(term182431, term182431.getClass(), "jsType", null);
        setField(term182431, term182431.getClass(), "parent", null);
        term182432 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term182432, term182432.getClass(), "functionName", null);
        setBooleanField(term182432, term182432.getClass(), "itsNeedsActivation", false);
        setIntField(term182432, term182432.getClass(), "itsFunctionType", 0);
        setBooleanField(term182432, term182432.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term182432, term182432.getClass(), "encodedSourceStart", 0);
        setIntField(term182432, term182432.getClass(), "encodedSourceEnd", 0);
        setField(term182432, term182432.getClass(), "sourceName", null);
        setIntField(term182432, term182432.getClass(), "baseLineno", 0);
        setIntField(term182432, term182432.getClass(), "endLineno", 0);
        setField(term182432, term182432.getClass(), "functions", null);
        setField(term182432, term182432.getClass(), "regexps", null);
        setField(term182432, term182432.getClass(), "itsVariables", null);
        setField(term182432, term182432.getClass(), "itsConst", null);
        setField(term182432, term182432.getClass(), "itsVariableNames", null);
        setIntField(term182432, term182432.getClass(), "varStart", 0);
        setField(term182432, term182432.getClass(), "compilerData", null);
        setIntField(term182432, term182432.getClass(), "type", 0);
        setField(term182432, term182432.getClass(), "next", null);
        setField(term182432, term182432.getClass(), "first", null);
        setField(term182432, term182432.getClass(), "last", null);
        setField(term182432, term182432.getClass(), "propListHead", null);
        setIntField(term182432, term182432.getClass(), "sourcePosition", 0);
        setField(term182432, term182432.getClass(), "jsType", null);
        setField(term182432, term182432.getClass(), "parent", null);
        term182393 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term182393, term182393.getClass(), "functionName", null);
        setBooleanField(term182393, term182393.getClass(), "itsNeedsActivation", false);
        setIntField(term182393, term182393.getClass(), "itsFunctionType", 0);
        setBooleanField(term182393, term182393.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term182393, term182393.getClass(), "encodedSourceStart", 0);
        setIntField(term182393, term182393.getClass(), "encodedSourceEnd", 0);
        setField(term182393, term182393.getClass(), "sourceName", null);
        setIntField(term182393, term182393.getClass(), "baseLineno", 0);
        setIntField(term182393, term182393.getClass(), "endLineno", 0);
        setField(term182393, term182393.getClass(), "functions", null);
        setField(term182393, term182393.getClass(), "regexps", null);
        setField(term182393, term182393.getClass(), "itsVariables", null);
        setField(term182393, term182393.getClass(), "itsConst", null);
        setField(term182393, term182393.getClass(), "itsVariableNames", null);
        setIntField(term182393, term182393.getClass(), "varStart", 0);
        setField(term182393, term182393.getClass(), "compilerData", null);
        setIntField(term182393, term182393.getClass(), "type", 14);
        setField(term182393, term182393.getClass(), "next", null);
        setField(term182393, term182393.getClass(), "first", null);
        setField(term182393, term182393.getClass(), "last", null);
        setField(term182393, term182393.getClass(), "propListHead", null);
        setIntField(term182393, term182393.getClass(), "sourcePosition", 0);
        setField(term182393, term182393.getClass(), "jsType", null);
        setField(term182393, term182393.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term182203;
        args[1] = term182289;
        args[2] = term182375;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term182117, args);
        assertTrue(recursiveEquals(term182117, term182429));
        assertTrue(recursiveEquals(term182203, term182430));
        assertTrue(recursiveEquals(term182289, term182431));
        assertTrue(recursiveEquals(term182375, term182432));
        assertTrue(recursiveEquals(retValue, term182393));
    }

};


