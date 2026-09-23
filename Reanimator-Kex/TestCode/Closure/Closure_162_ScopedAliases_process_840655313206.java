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

public class ScopedAliases_process_840655313206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115125;
     Object term115195;
     Object term115672;
     Object term115673;

    public ScopedAliases_process_840655313206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115125 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term115125, term115125.getClass(), "compiler", null);
        term115195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115285 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term115195, term115195.getClass(), "type", 37);
        setField(term115195, term115195.getClass(), "parent", null);
        setField(term115285, term115285.getClass(), "next", null);
        setIntField(term115285, term115285.getClass(), "type", 0);
        setField(term115285, term115285.getClass(), "first", null);
        setField(term115195, term115195.getClass(), "first", term115285);
        term115672 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term115672, term115672.getClass(), "compiler", null);
        setField(term115672, term115672.getClass(), "preprocessorSymbolTable", null);
        setField(term115672, term115672.getClass(), "transformationHandler", null);
        term115673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115674 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term115673, term115673.getClass(), "type", 37);
        setField(term115673, term115673.getClass(), "next", null);
        setIntField(term115674, term115674.getClass(), "encodedSourceStart", 0);
        setIntField(term115674, term115674.getClass(), "encodedSourceEnd", 0);
        setField(term115674, term115674.getClass(), "sourceName", null);
        setIntField(term115674, term115674.getClass(), "baseLineno", 0);
        setIntField(term115674, term115674.getClass(), "endLineno", 0);
        setField(term115674, term115674.getClass(), "functions", null);
        setField(term115674, term115674.getClass(), "regexps", null);
        setField(term115674, term115674.getClass(), "itsVariables", null);
        setField(term115674, term115674.getClass(), "itsConst", null);
        setField(term115674, term115674.getClass(), "itsVariableNames", null);
        setIntField(term115674, term115674.getClass(), "varStart", 0);
        setField(term115674, term115674.getClass(), "compilerData", null);
        setIntField(term115674, term115674.getClass(), "type", 0);
        setField(term115674, term115674.getClass(), "next", null);
        setField(term115674, term115674.getClass(), "first", null);
        setField(term115674, term115674.getClass(), "last", null);
        setField(term115674, term115674.getClass(), "propListHead", null);
        setIntField(term115674, term115674.getClass(), "sourcePosition", 0);
        setField(term115674, term115674.getClass(), "jsType", null);
        setField(term115674, term115674.getClass(), "parent", null);
        setField(term115673, term115673.getClass(), "first", term115674);
        setField(term115673, term115673.getClass(), "last", null);
        setField(term115673, term115673.getClass(), "propListHead", null);
        setIntField(term115673, term115673.getClass(), "sourcePosition", 0);
        setField(term115673, term115673.getClass(), "jsType", null);
        setField(term115673, term115673.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term115195;
        callMethod(klass, "process", argTypes, term115125, args);
        assertTrue(recursiveEquals(term115125, term115672));
        assertTrue(recursiveEquals(term115195, null));
    }

};


