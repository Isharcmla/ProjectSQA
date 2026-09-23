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

public class ScopedAliases_process_840655313152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84628;
     Object term84714;
     Object term85164;
     Object term85165;

    public ScopedAliases_process_840655313152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84628 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term84628, term84628.getClass(), "compiler", null);
        term84714 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term84800 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term84714, term84714.getClass(), "type", 0);
        setIntField(term84800, term84800.getClass(), "type", 0);
        setField(term84800, term84800.getClass(), "parent", null);
        setField(term84714, term84714.getClass(), "parent", term84800);
        setField(term84714, term84714.getClass(), "first", null);
        term85164 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term85164, term85164.getClass(), "compiler", null);
        setField(term85164, term85164.getClass(), "preprocessorSymbolTable", null);
        setField(term85164, term85164.getClass(), "transformationHandler", null);
        term85165 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term85166 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term85165, term85165.getClass(), "functionName", null);
        setBooleanField(term85165, term85165.getClass(), "itsNeedsActivation", false);
        setIntField(term85165, term85165.getClass(), "itsFunctionType", 0);
        setBooleanField(term85165, term85165.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term85165, term85165.getClass(), "encodedSourceStart", 0);
        setIntField(term85165, term85165.getClass(), "encodedSourceEnd", 0);
        setField(term85165, term85165.getClass(), "sourceName", null);
        setIntField(term85165, term85165.getClass(), "baseLineno", 0);
        setIntField(term85165, term85165.getClass(), "endLineno", 0);
        setField(term85165, term85165.getClass(), "functions", null);
        setField(term85165, term85165.getClass(), "regexps", null);
        setField(term85165, term85165.getClass(), "itsVariables", null);
        setField(term85165, term85165.getClass(), "itsConst", null);
        setField(term85165, term85165.getClass(), "itsVariableNames", null);
        setIntField(term85165, term85165.getClass(), "varStart", 0);
        setField(term85165, term85165.getClass(), "compilerData", null);
        setIntField(term85165, term85165.getClass(), "type", 0);
        setField(term85165, term85165.getClass(), "next", null);
        setField(term85165, term85165.getClass(), "first", null);
        setField(term85165, term85165.getClass(), "last", null);
        setField(term85165, term85165.getClass(), "propListHead", null);
        setIntField(term85165, term85165.getClass(), "sourcePosition", 0);
        setField(term85165, term85165.getClass(), "jsType", null);
        setField(term85166, term85166.getClass(), "functionName", null);
        setBooleanField(term85166, term85166.getClass(), "itsNeedsActivation", false);
        setIntField(term85166, term85166.getClass(), "itsFunctionType", 0);
        setBooleanField(term85166, term85166.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term85166, term85166.getClass(), "encodedSourceStart", 0);
        setIntField(term85166, term85166.getClass(), "encodedSourceEnd", 0);
        setField(term85166, term85166.getClass(), "sourceName", null);
        setIntField(term85166, term85166.getClass(), "baseLineno", 0);
        setIntField(term85166, term85166.getClass(), "endLineno", 0);
        setField(term85166, term85166.getClass(), "functions", null);
        setField(term85166, term85166.getClass(), "regexps", null);
        setField(term85166, term85166.getClass(), "itsVariables", null);
        setField(term85166, term85166.getClass(), "itsConst", null);
        setField(term85166, term85166.getClass(), "itsVariableNames", null);
        setIntField(term85166, term85166.getClass(), "varStart", 0);
        setField(term85166, term85166.getClass(), "compilerData", null);
        setIntField(term85166, term85166.getClass(), "type", 0);
        setField(term85166, term85166.getClass(), "next", null);
        setField(term85166, term85166.getClass(), "first", null);
        setField(term85166, term85166.getClass(), "last", null);
        setField(term85166, term85166.getClass(), "propListHead", null);
        setIntField(term85166, term85166.getClass(), "sourcePosition", 0);
        setField(term85166, term85166.getClass(), "jsType", null);
        setField(term85166, term85166.getClass(), "parent", null);
        setField(term85165, term85165.getClass(), "parent", term85166);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term84714;
        callMethod(klass, "process", argTypes, term84628, args);
        assertTrue(recursiveEquals(term84628, term85164));
        assertTrue(recursiveEquals(term84714, null));
    }

};


