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

public class ScopedAliases_process_840655313126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68610;
     Object term68696;
     Object term69146;
     Object term69147;

    public ScopedAliases_process_840655313126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68610 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term68610, term68610.getClass(), "compiler", null);
        term68696 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term68782 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term68696, term68696.getClass(), "type", 0);
        setIntField(term68782, term68782.getClass(), "type", 0);
        setField(term68782, term68782.getClass(), "parent", null);
        setField(term68696, term68696.getClass(), "parent", term68782);
        setField(term68696, term68696.getClass(), "first", null);
        term69146 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term69146, term69146.getClass(), "compiler", null);
        setField(term69146, term69146.getClass(), "preprocessorSymbolTable", null);
        setField(term69146, term69146.getClass(), "transformationHandler", null);
        term69147 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term69148 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term69147, term69147.getClass(), "functionName", null);
        setBooleanField(term69147, term69147.getClass(), "itsNeedsActivation", false);
        setIntField(term69147, term69147.getClass(), "itsFunctionType", 0);
        setBooleanField(term69147, term69147.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term69147, term69147.getClass(), "encodedSourceStart", 0);
        setIntField(term69147, term69147.getClass(), "encodedSourceEnd", 0);
        setField(term69147, term69147.getClass(), "sourceName", null);
        setIntField(term69147, term69147.getClass(), "baseLineno", 0);
        setIntField(term69147, term69147.getClass(), "endLineno", 0);
        setField(term69147, term69147.getClass(), "functions", null);
        setField(term69147, term69147.getClass(), "regexps", null);
        setField(term69147, term69147.getClass(), "itsVariables", null);
        setField(term69147, term69147.getClass(), "itsConst", null);
        setField(term69147, term69147.getClass(), "itsVariableNames", null);
        setIntField(term69147, term69147.getClass(), "varStart", 0);
        setField(term69147, term69147.getClass(), "compilerData", null);
        setIntField(term69147, term69147.getClass(), "type", 0);
        setField(term69147, term69147.getClass(), "next", null);
        setField(term69147, term69147.getClass(), "first", null);
        setField(term69147, term69147.getClass(), "last", null);
        setField(term69147, term69147.getClass(), "propListHead", null);
        setIntField(term69147, term69147.getClass(), "sourcePosition", 0);
        setField(term69147, term69147.getClass(), "jsType", null);
        setField(term69148, term69148.getClass(), "functionName", null);
        setBooleanField(term69148, term69148.getClass(), "itsNeedsActivation", false);
        setIntField(term69148, term69148.getClass(), "itsFunctionType", 0);
        setBooleanField(term69148, term69148.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term69148, term69148.getClass(), "encodedSourceStart", 0);
        setIntField(term69148, term69148.getClass(), "encodedSourceEnd", 0);
        setField(term69148, term69148.getClass(), "sourceName", null);
        setIntField(term69148, term69148.getClass(), "baseLineno", 0);
        setIntField(term69148, term69148.getClass(), "endLineno", 0);
        setField(term69148, term69148.getClass(), "functions", null);
        setField(term69148, term69148.getClass(), "regexps", null);
        setField(term69148, term69148.getClass(), "itsVariables", null);
        setField(term69148, term69148.getClass(), "itsConst", null);
        setField(term69148, term69148.getClass(), "itsVariableNames", null);
        setIntField(term69148, term69148.getClass(), "varStart", 0);
        setField(term69148, term69148.getClass(), "compilerData", null);
        setIntField(term69148, term69148.getClass(), "type", 0);
        setField(term69148, term69148.getClass(), "next", null);
        setField(term69148, term69148.getClass(), "first", null);
        setField(term69148, term69148.getClass(), "last", null);
        setField(term69148, term69148.getClass(), "propListHead", null);
        setIntField(term69148, term69148.getClass(), "sourcePosition", 0);
        setField(term69148, term69148.getClass(), "jsType", null);
        setField(term69148, term69148.getClass(), "parent", null);
        setField(term69147, term69147.getClass(), "parent", term69148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term68696;
        callMethod(klass, "process", argTypes, term68610, args);
        assertTrue(recursiveEquals(term68610, term69146));
        assertTrue(recursiveEquals(term68696, null));
    }

};


