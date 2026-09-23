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

public class ScopedAliases_hotSwapScript_88341709166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93447;
     Object term93597;
     Object term94207;
     Object term94209;

    public ScopedAliases_hotSwapScript_88341709166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93447 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term93527 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term93447, term93447.getClass(), "compiler", term93527);
        term93597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93667 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term93597, term93597.getClass(), "type", 0);
        setField(term93597, term93597.getClass(), "parent", null);
        setField(term93737, term93737.getClass(), "next", null);
        setIntField(term93737, term93737.getClass(), "type", 0);
        setField(term93737, term93737.getClass(), "first", null);
        setField(term93667, term93667.getClass(), "next", term93737);
        setIntField(term93667, term93667.getClass(), "type", 0);
        setField(term93667, term93667.getClass(), "first", null);
        setField(term93597, term93597.getClass(), "first", term93667);
        term94207 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term94208 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term94208, term94208.getClass(), "options", null);
        setField(term94208, term94208.getClass(), "passes", null);
        setField(term94208, term94208.getClass(), "externs", null);
        setField(term94208, term94208.getClass(), "modules", null);
        setField(term94208, term94208.getClass(), "moduleGraph", null);
        setField(term94208, term94208.getClass(), "inputs", null);
        setField(term94208, term94208.getClass(), "errorManager", null);
        setField(term94208, term94208.getClass(), "warningsGuard", null);
        setField(term94208, term94208.getClass(), "externsRoot", null);
        setField(term94208, term94208.getClass(), "jsRoot", null);
        setField(term94208, term94208.getClass(), "externAndJsRoot", null);
        setField(term94208, term94208.getClass(), "inputsById", null);
        setField(term94208, term94208.getClass(), "sourceMap", null);
        setField(term94208, term94208.getClass(), "externExports", null);
        setIntField(term94208, term94208.getClass(), "uniqueNameId", 0);
        setBooleanField(term94208, term94208.getClass(), "useThreads", false);
        setBooleanField(term94208, term94208.getClass(), "hasRegExpGlobalReferences", false);
        setField(term94208, term94208.getClass(), "functionInformationMap", null);
        setField(term94208, term94208.getClass(), "debugLog", null);
        setField(term94208, term94208.getClass(), "defaultCodingConvention", null);
        setField(term94208, term94208.getClass(), "typeRegistry", null);
        setField(term94208, term94208.getClass(), "parserConfig", null);
        setField(term94208, term94208.getClass(), "abstractInterpreter", null);
        setField(term94208, term94208.getClass(), "typeValidator", null);
        setField(term94208, term94208.getClass(), "tracker", null);
        setField(term94208, term94208.getClass(), "oldErrorReporter", null);
        setField(term94208, term94208.getClass(), "defaultErrorReporter", null);
        setField(term94208, term94208.getClass(), "outStream", null);
        setField(term94208, term94208.getClass(), "globalRefMap", null);
        setField(term94208, term94208.getClass(), "sanityCheck", null);
        setField(term94208, term94208.getClass(), "currentTracer", null);
        setField(term94208, term94208.getClass(), "currentPassName", null);
        setIntField(term94208, term94208.getClass(), "syntheticCodeId", 0);
        setField(term94208, term94208.getClass(), "recentChange", null);
        setField(term94208, term94208.getClass(), "codeChangeHandlers", null);
        setField(term94208, term94208.getClass(), "stage", null);
        setField(term94207, term94207.getClass(), "compiler", term94208);
        setField(term94207, term94207.getClass(), "preprocessorSymbolTable", null);
        setField(term94207, term94207.getClass(), "transformationHandler", null);
        term94209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term94209, term94209.getClass(), "type", 0);
        setField(term94209, term94209.getClass(), "next", null);
        setIntField(term94210, term94210.getClass(), "type", 0);
        setIntField(term94211, term94211.getClass(), "type", 0);
        setField(term94211, term94211.getClass(), "next", null);
        setField(term94211, term94211.getClass(), "first", null);
        setField(term94211, term94211.getClass(), "last", null);
        setField(term94211, term94211.getClass(), "propListHead", null);
        setIntField(term94211, term94211.getClass(), "sourcePosition", 0);
        setField(term94211, term94211.getClass(), "jsType", null);
        setField(term94211, term94211.getClass(), "parent", null);
        setField(term94210, term94210.getClass(), "next", term94211);
        setField(term94210, term94210.getClass(), "first", null);
        setField(term94210, term94210.getClass(), "last", null);
        setField(term94210, term94210.getClass(), "propListHead", null);
        setIntField(term94210, term94210.getClass(), "sourcePosition", 0);
        setField(term94210, term94210.getClass(), "jsType", null);
        setField(term94210, term94210.getClass(), "parent", null);
        setField(term94209, term94209.getClass(), "first", term94210);
        setField(term94209, term94209.getClass(), "last", null);
        setField(term94209, term94209.getClass(), "propListHead", null);
        setIntField(term94209, term94209.getClass(), "sourcePosition", 0);
        setField(term94209, term94209.getClass(), "jsType", null);
        setField(term94209, term94209.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term93597;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term93447, args);
        assertTrue(recursiveEquals(term93447, term94207));
        assertTrue(recursiveEquals(term93597, term94209));
    }

};


