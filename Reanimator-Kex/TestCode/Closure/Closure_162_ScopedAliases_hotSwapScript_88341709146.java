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

public class ScopedAliases_hotSwapScript_88341709146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80768;
     Object term80854;
     Object term81522;
     Object term81523;

    public ScopedAliases_hotSwapScript_88341709146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80768 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term80768, term80768.getClass(), "compiler", null);
        term80854 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term80924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81010 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term80854, term80854.getClass(), "type", 0);
        setField(term80854, term80854.getClass(), "parent", null);
        setField(term80924, term80924.getClass(), "next", null);
        setIntField(term80924, term80924.getClass(), "type", 0);
        setField(term81010, term81010.getClass(), "next", null);
        setIntField(term81010, term81010.getClass(), "type", 0);
        setField(term81010, term81010.getClass(), "first", null);
        setField(term80924, term80924.getClass(), "first", term81010);
        setField(term80854, term80854.getClass(), "first", term80924);
        term81522 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term81522, term81522.getClass(), "compiler", null);
        setField(term81522, term81522.getClass(), "preprocessorSymbolTable", null);
        setField(term81522, term81522.getClass(), "transformationHandler", null);
        term81523 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term81524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81525 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term81523, term81523.getClass(), "functionName", null);
        setBooleanField(term81523, term81523.getClass(), "itsNeedsActivation", false);
        setIntField(term81523, term81523.getClass(), "itsFunctionType", 0);
        setBooleanField(term81523, term81523.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term81523, term81523.getClass(), "encodedSourceStart", 0);
        setIntField(term81523, term81523.getClass(), "encodedSourceEnd", 0);
        setField(term81523, term81523.getClass(), "sourceName", null);
        setIntField(term81523, term81523.getClass(), "baseLineno", 0);
        setIntField(term81523, term81523.getClass(), "endLineno", 0);
        setField(term81523, term81523.getClass(), "functions", null);
        setField(term81523, term81523.getClass(), "regexps", null);
        setField(term81523, term81523.getClass(), "itsVariables", null);
        setField(term81523, term81523.getClass(), "itsConst", null);
        setField(term81523, term81523.getClass(), "itsVariableNames", null);
        setIntField(term81523, term81523.getClass(), "varStart", 0);
        setField(term81523, term81523.getClass(), "compilerData", null);
        setIntField(term81523, term81523.getClass(), "type", 0);
        setField(term81523, term81523.getClass(), "next", null);
        setIntField(term81524, term81524.getClass(), "type", 0);
        setField(term81524, term81524.getClass(), "next", null);
        setField(term81525, term81525.getClass(), "functionName", null);
        setBooleanField(term81525, term81525.getClass(), "itsNeedsActivation", false);
        setIntField(term81525, term81525.getClass(), "itsFunctionType", 0);
        setBooleanField(term81525, term81525.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term81525, term81525.getClass(), "encodedSourceStart", 0);
        setIntField(term81525, term81525.getClass(), "encodedSourceEnd", 0);
        setField(term81525, term81525.getClass(), "sourceName", null);
        setIntField(term81525, term81525.getClass(), "baseLineno", 0);
        setIntField(term81525, term81525.getClass(), "endLineno", 0);
        setField(term81525, term81525.getClass(), "functions", null);
        setField(term81525, term81525.getClass(), "regexps", null);
        setField(term81525, term81525.getClass(), "itsVariables", null);
        setField(term81525, term81525.getClass(), "itsConst", null);
        setField(term81525, term81525.getClass(), "itsVariableNames", null);
        setIntField(term81525, term81525.getClass(), "varStart", 0);
        setField(term81525, term81525.getClass(), "compilerData", null);
        setIntField(term81525, term81525.getClass(), "type", 0);
        setField(term81525, term81525.getClass(), "next", null);
        setField(term81525, term81525.getClass(), "first", null);
        setField(term81525, term81525.getClass(), "last", null);
        setField(term81525, term81525.getClass(), "propListHead", null);
        setIntField(term81525, term81525.getClass(), "sourcePosition", 0);
        setField(term81525, term81525.getClass(), "jsType", null);
        setField(term81525, term81525.getClass(), "parent", null);
        setField(term81524, term81524.getClass(), "first", term81525);
        setField(term81524, term81524.getClass(), "last", null);
        setField(term81524, term81524.getClass(), "propListHead", null);
        setIntField(term81524, term81524.getClass(), "sourcePosition", 0);
        setField(term81524, term81524.getClass(), "jsType", null);
        setField(term81524, term81524.getClass(), "parent", null);
        setField(term81523, term81523.getClass(), "first", term81524);
        setField(term81523, term81523.getClass(), "last", null);
        setField(term81523, term81523.getClass(), "propListHead", null);
        setIntField(term81523, term81523.getClass(), "sourcePosition", 0);
        setField(term81523, term81523.getClass(), "jsType", null);
        setField(term81523, term81523.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term80854;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term80768, args);
        assertTrue(recursiveEquals(term80768, term81522));
        assertTrue(recursiveEquals(term80854, term81523));
    }

};


