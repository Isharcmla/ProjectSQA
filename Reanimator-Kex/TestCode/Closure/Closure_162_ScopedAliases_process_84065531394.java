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

public class ScopedAliases_process_84065531394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49676;
     Object term49762;
     Object term50212;
     Object term50213;

    public ScopedAliases_process_84065531394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49676 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term49676, term49676.getClass(), "compiler", null);
        term49762 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term49848 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term49762, term49762.getClass(), "type", 0);
        setIntField(term49848, term49848.getClass(), "type", 0);
        setField(term49848, term49848.getClass(), "parent", null);
        setField(term49762, term49762.getClass(), "parent", term49848);
        term50212 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term50212, term50212.getClass(), "compiler", null);
        setField(term50212, term50212.getClass(), "preprocessorSymbolTable", null);
        setField(term50212, term50212.getClass(), "transformationHandler", null);
        term50213 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term50214 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term50213, term50213.getClass(), "functionName", null);
        setBooleanField(term50213, term50213.getClass(), "itsNeedsActivation", false);
        setIntField(term50213, term50213.getClass(), "itsFunctionType", 0);
        setBooleanField(term50213, term50213.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term50213, term50213.getClass(), "encodedSourceStart", 0);
        setIntField(term50213, term50213.getClass(), "encodedSourceEnd", 0);
        setField(term50213, term50213.getClass(), "sourceName", null);
        setIntField(term50213, term50213.getClass(), "baseLineno", 0);
        setIntField(term50213, term50213.getClass(), "endLineno", 0);
        setField(term50213, term50213.getClass(), "functions", null);
        setField(term50213, term50213.getClass(), "regexps", null);
        setField(term50213, term50213.getClass(), "itsVariables", null);
        setField(term50213, term50213.getClass(), "itsConst", null);
        setField(term50213, term50213.getClass(), "itsVariableNames", null);
        setIntField(term50213, term50213.getClass(), "varStart", 0);
        setField(term50213, term50213.getClass(), "compilerData", null);
        setIntField(term50213, term50213.getClass(), "type", 0);
        setField(term50213, term50213.getClass(), "next", null);
        setField(term50213, term50213.getClass(), "first", null);
        setField(term50213, term50213.getClass(), "last", null);
        setField(term50213, term50213.getClass(), "propListHead", null);
        setIntField(term50213, term50213.getClass(), "sourcePosition", 0);
        setField(term50213, term50213.getClass(), "jsType", null);
        setField(term50214, term50214.getClass(), "functionName", null);
        setBooleanField(term50214, term50214.getClass(), "itsNeedsActivation", false);
        setIntField(term50214, term50214.getClass(), "itsFunctionType", 0);
        setBooleanField(term50214, term50214.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term50214, term50214.getClass(), "encodedSourceStart", 0);
        setIntField(term50214, term50214.getClass(), "encodedSourceEnd", 0);
        setField(term50214, term50214.getClass(), "sourceName", null);
        setIntField(term50214, term50214.getClass(), "baseLineno", 0);
        setIntField(term50214, term50214.getClass(), "endLineno", 0);
        setField(term50214, term50214.getClass(), "functions", null);
        setField(term50214, term50214.getClass(), "regexps", null);
        setField(term50214, term50214.getClass(), "itsVariables", null);
        setField(term50214, term50214.getClass(), "itsConst", null);
        setField(term50214, term50214.getClass(), "itsVariableNames", null);
        setIntField(term50214, term50214.getClass(), "varStart", 0);
        setField(term50214, term50214.getClass(), "compilerData", null);
        setIntField(term50214, term50214.getClass(), "type", 0);
        setField(term50214, term50214.getClass(), "next", null);
        setField(term50214, term50214.getClass(), "first", null);
        setField(term50214, term50214.getClass(), "last", null);
        setField(term50214, term50214.getClass(), "propListHead", null);
        setIntField(term50214, term50214.getClass(), "sourcePosition", 0);
        setField(term50214, term50214.getClass(), "jsType", null);
        setField(term50214, term50214.getClass(), "parent", null);
        setField(term50213, term50213.getClass(), "parent", term50214);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term49762;
        callMethod(klass, "process", argTypes, term49676, args);
        assertTrue(recursiveEquals(term49676, term50212));
        assertTrue(recursiveEquals(term49762, null));
    }

};


