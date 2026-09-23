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

public class PeepholeFoldConstants_tryFoldInstanceof_1830686408384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77674;
     Object term77760;
     Object term77846;
     Object term77879;
     Object term77880;
     Object term77881;
     Object term77848;

    public PeepholeFoldConstants_tryFoldInstanceof_1830686408384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77674 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term77760 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term77760, term77760.getClass(), "type", 52);
        term77846 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term77879 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term77879, term77879.getClass(), "currentTraversal", null);
        term77880 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term77880, term77880.getClass(), "functionName", null);
        setBooleanField(term77880, term77880.getClass(), "itsNeedsActivation", false);
        setIntField(term77880, term77880.getClass(), "itsFunctionType", 0);
        setBooleanField(term77880, term77880.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term77880, term77880.getClass(), "encodedSourceStart", 0);
        setIntField(term77880, term77880.getClass(), "encodedSourceEnd", 0);
        setField(term77880, term77880.getClass(), "sourceName", null);
        setIntField(term77880, term77880.getClass(), "baseLineno", 0);
        setIntField(term77880, term77880.getClass(), "endLineno", 0);
        setField(term77880, term77880.getClass(), "functions", null);
        setField(term77880, term77880.getClass(), "regexps", null);
        setField(term77880, term77880.getClass(), "itsVariables", null);
        setField(term77880, term77880.getClass(), "itsConst", null);
        setField(term77880, term77880.getClass(), "itsVariableNames", null);
        setIntField(term77880, term77880.getClass(), "varStart", 0);
        setField(term77880, term77880.getClass(), "compilerData", null);
        setIntField(term77880, term77880.getClass(), "type", 52);
        setField(term77880, term77880.getClass(), "next", null);
        setField(term77880, term77880.getClass(), "first", null);
        setField(term77880, term77880.getClass(), "last", null);
        setField(term77880, term77880.getClass(), "propListHead", null);
        setIntField(term77880, term77880.getClass(), "sourcePosition", 0);
        setField(term77880, term77880.getClass(), "jsType", null);
        setField(term77880, term77880.getClass(), "parent", null);
        term77881 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term77881, term77881.getClass(), "functionName", null);
        setBooleanField(term77881, term77881.getClass(), "itsNeedsActivation", false);
        setIntField(term77881, term77881.getClass(), "itsFunctionType", 0);
        setBooleanField(term77881, term77881.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term77881, term77881.getClass(), "encodedSourceStart", 0);
        setIntField(term77881, term77881.getClass(), "encodedSourceEnd", 0);
        setField(term77881, term77881.getClass(), "sourceName", null);
        setIntField(term77881, term77881.getClass(), "baseLineno", 0);
        setIntField(term77881, term77881.getClass(), "endLineno", 0);
        setField(term77881, term77881.getClass(), "functions", null);
        setField(term77881, term77881.getClass(), "regexps", null);
        setField(term77881, term77881.getClass(), "itsVariables", null);
        setField(term77881, term77881.getClass(), "itsConst", null);
        setField(term77881, term77881.getClass(), "itsVariableNames", null);
        setIntField(term77881, term77881.getClass(), "varStart", 0);
        setField(term77881, term77881.getClass(), "compilerData", null);
        setIntField(term77881, term77881.getClass(), "type", 0);
        setField(term77881, term77881.getClass(), "next", null);
        setField(term77881, term77881.getClass(), "first", null);
        setField(term77881, term77881.getClass(), "last", null);
        setField(term77881, term77881.getClass(), "propListHead", null);
        setIntField(term77881, term77881.getClass(), "sourcePosition", 0);
        setField(term77881, term77881.getClass(), "jsType", null);
        setField(term77881, term77881.getClass(), "parent", null);
        term77848 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term77848, term77848.getClass(), "functionName", null);
        setBooleanField(term77848, term77848.getClass(), "itsNeedsActivation", false);
        setIntField(term77848, term77848.getClass(), "itsFunctionType", 0);
        setBooleanField(term77848, term77848.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term77848, term77848.getClass(), "encodedSourceStart", 0);
        setIntField(term77848, term77848.getClass(), "encodedSourceEnd", 0);
        setField(term77848, term77848.getClass(), "sourceName", null);
        setIntField(term77848, term77848.getClass(), "baseLineno", 0);
        setIntField(term77848, term77848.getClass(), "endLineno", 0);
        setField(term77848, term77848.getClass(), "functions", null);
        setField(term77848, term77848.getClass(), "regexps", null);
        setField(term77848, term77848.getClass(), "itsVariables", null);
        setField(term77848, term77848.getClass(), "itsConst", null);
        setField(term77848, term77848.getClass(), "itsVariableNames", null);
        setIntField(term77848, term77848.getClass(), "varStart", 0);
        setField(term77848, term77848.getClass(), "compilerData", null);
        setIntField(term77848, term77848.getClass(), "type", 52);
        setField(term77848, term77848.getClass(), "next", null);
        setField(term77848, term77848.getClass(), "first", null);
        setField(term77848, term77848.getClass(), "last", null);
        setField(term77848, term77848.getClass(), "propListHead", null);
        setIntField(term77848, term77848.getClass(), "sourcePosition", 0);
        setField(term77848, term77848.getClass(), "jsType", null);
        setField(term77848, term77848.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term77760;
        args[1] = term77846;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldInstanceof", argTypes, term77674, args);
        assertTrue(recursiveEquals(term77674, term77879));
        assertTrue(recursiveEquals(term77760, term77880));
        assertTrue(recursiveEquals(term77846, term77881));
        assertTrue(recursiveEquals(retValue, term77848));
    }

};


