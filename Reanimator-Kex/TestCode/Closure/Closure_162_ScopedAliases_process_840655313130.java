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

public class ScopedAliases_process_840655313130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70797;
     Object term70883;
     Object term71382;
     Object term71383;

    public ScopedAliases_process_840655313130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70797 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term70797, term70797.getClass(), "compiler", null);
        term70883 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term70969 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term70883, term70883.getClass(), "type", 0);
        setField(term70883, term70883.getClass(), "parent", null);
        setField(term70969, term70969.getClass(), "next", null);
        setIntField(term70969, term70969.getClass(), "type", 0);
        setField(term70969, term70969.getClass(), "first", null);
        setField(term70883, term70883.getClass(), "first", term70969);
        term71382 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term71382, term71382.getClass(), "compiler", null);
        setField(term71382, term71382.getClass(), "preprocessorSymbolTable", null);
        setField(term71382, term71382.getClass(), "transformationHandler", null);
        term71383 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term71384 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term71383, term71383.getClass(), "functionName", null);
        setBooleanField(term71383, term71383.getClass(), "itsNeedsActivation", false);
        setIntField(term71383, term71383.getClass(), "itsFunctionType", 0);
        setBooleanField(term71383, term71383.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term71383, term71383.getClass(), "encodedSourceStart", 0);
        setIntField(term71383, term71383.getClass(), "encodedSourceEnd", 0);
        setField(term71383, term71383.getClass(), "sourceName", null);
        setIntField(term71383, term71383.getClass(), "baseLineno", 0);
        setIntField(term71383, term71383.getClass(), "endLineno", 0);
        setField(term71383, term71383.getClass(), "functions", null);
        setField(term71383, term71383.getClass(), "regexps", null);
        setField(term71383, term71383.getClass(), "itsVariables", null);
        setField(term71383, term71383.getClass(), "itsConst", null);
        setField(term71383, term71383.getClass(), "itsVariableNames", null);
        setIntField(term71383, term71383.getClass(), "varStart", 0);
        setField(term71383, term71383.getClass(), "compilerData", null);
        setIntField(term71383, term71383.getClass(), "type", 0);
        setField(term71383, term71383.getClass(), "next", null);
        setField(term71384, term71384.getClass(), "functionName", null);
        setBooleanField(term71384, term71384.getClass(), "itsNeedsActivation", false);
        setIntField(term71384, term71384.getClass(), "itsFunctionType", 0);
        setBooleanField(term71384, term71384.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term71384, term71384.getClass(), "encodedSourceStart", 0);
        setIntField(term71384, term71384.getClass(), "encodedSourceEnd", 0);
        setField(term71384, term71384.getClass(), "sourceName", null);
        setIntField(term71384, term71384.getClass(), "baseLineno", 0);
        setIntField(term71384, term71384.getClass(), "endLineno", 0);
        setField(term71384, term71384.getClass(), "functions", null);
        setField(term71384, term71384.getClass(), "regexps", null);
        setField(term71384, term71384.getClass(), "itsVariables", null);
        setField(term71384, term71384.getClass(), "itsConst", null);
        setField(term71384, term71384.getClass(), "itsVariableNames", null);
        setIntField(term71384, term71384.getClass(), "varStart", 0);
        setField(term71384, term71384.getClass(), "compilerData", null);
        setIntField(term71384, term71384.getClass(), "type", 0);
        setField(term71384, term71384.getClass(), "next", null);
        setField(term71384, term71384.getClass(), "first", null);
        setField(term71384, term71384.getClass(), "last", null);
        setField(term71384, term71384.getClass(), "propListHead", null);
        setIntField(term71384, term71384.getClass(), "sourcePosition", 0);
        setField(term71384, term71384.getClass(), "jsType", null);
        setField(term71384, term71384.getClass(), "parent", null);
        setField(term71383, term71383.getClass(), "first", term71384);
        setField(term71383, term71383.getClass(), "last", null);
        setField(term71383, term71383.getClass(), "propListHead", null);
        setIntField(term71383, term71383.getClass(), "sourcePosition", 0);
        setField(term71383, term71383.getClass(), "jsType", null);
        setField(term71383, term71383.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term70883;
        callMethod(klass, "process", argTypes, term70797, args);
        assertTrue(recursiveEquals(term70797, term71382));
        assertTrue(recursiveEquals(term70883, null));
    }

};


