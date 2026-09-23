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

public class ScopedAliases_hotSwapScript_88341709156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86739;
     Object term86911;
     Object term87837;
     Object term87839;

    public ScopedAliases_hotSwapScript_88341709156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86739 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term86819 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term86739, term86739.getClass(), "compiler", term86819);
        term86911 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term87003 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term87089 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term87181 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term86911, term86911.getClass(), "type", 0);
        setField(term86911, term86911.getClass(), "parent", null);
        setField(term87089, term87089.getClass(), "next", null);
        setIntField(term87089, term87089.getClass(), "type", 0);
        setField(term87089, term87089.getClass(), "first", null);
        setField(term87003, term87003.getClass(), "next", term87089);
        setIntField(term87003, term87003.getClass(), "type", 0);
        setField(term87181, term87181.getClass(), "next", null);
        setIntField(term87181, term87181.getClass(), "type", 0);
        setField(term87181, term87181.getClass(), "first", null);
        setField(term87003, term87003.getClass(), "first", term87181);
        setField(term86911, term86911.getClass(), "first", term87003);
        term87837 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term87838 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term87838, term87838.getClass(), "options", null);
        setField(term87838, term87838.getClass(), "passes", null);
        setField(term87838, term87838.getClass(), "externs", null);
        setField(term87838, term87838.getClass(), "modules", null);
        setField(term87838, term87838.getClass(), "moduleGraph", null);
        setField(term87838, term87838.getClass(), "inputs", null);
        setField(term87838, term87838.getClass(), "errorManager", null);
        setField(term87838, term87838.getClass(), "warningsGuard", null);
        setField(term87838, term87838.getClass(), "externsRoot", null);
        setField(term87838, term87838.getClass(), "jsRoot", null);
        setField(term87838, term87838.getClass(), "externAndJsRoot", null);
        setField(term87838, term87838.getClass(), "inputsById", null);
        setField(term87838, term87838.getClass(), "sourceMap", null);
        setField(term87838, term87838.getClass(), "externExports", null);
        setIntField(term87838, term87838.getClass(), "uniqueNameId", 0);
        setBooleanField(term87838, term87838.getClass(), "useThreads", false);
        setBooleanField(term87838, term87838.getClass(), "hasRegExpGlobalReferences", false);
        setField(term87838, term87838.getClass(), "functionInformationMap", null);
        setField(term87838, term87838.getClass(), "debugLog", null);
        setField(term87838, term87838.getClass(), "defaultCodingConvention", null);
        setField(term87838, term87838.getClass(), "typeRegistry", null);
        setField(term87838, term87838.getClass(), "parserConfig", null);
        setField(term87838, term87838.getClass(), "abstractInterpreter", null);
        setField(term87838, term87838.getClass(), "typeValidator", null);
        setField(term87838, term87838.getClass(), "tracker", null);
        setField(term87838, term87838.getClass(), "oldErrorReporter", null);
        setField(term87838, term87838.getClass(), "defaultErrorReporter", null);
        setField(term87838, term87838.getClass(), "outStream", null);
        setField(term87838, term87838.getClass(), "globalRefMap", null);
        setField(term87838, term87838.getClass(), "sanityCheck", null);
        setField(term87838, term87838.getClass(), "currentTracer", null);
        setField(term87838, term87838.getClass(), "currentPassName", null);
        setIntField(term87838, term87838.getClass(), "syntheticCodeId", 0);
        setField(term87838, term87838.getClass(), "recentChange", null);
        setField(term87838, term87838.getClass(), "codeChangeHandlers", null);
        setField(term87838, term87838.getClass(), "stage", null);
        setField(term87837, term87837.getClass(), "compiler", term87838);
        setField(term87837, term87837.getClass(), "preprocessorSymbolTable", null);
        setField(term87837, term87837.getClass(), "transformationHandler", null);
        term87839 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term87840 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term87841 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term87842 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term87839, term87839.getClass(), "number", 0.0);
        setIntField(term87839, term87839.getClass(), "type", 0);
        setField(term87839, term87839.getClass(), "next", null);
        setDoubleField(term87840, term87840.getClass(), "number", 0.0);
        setIntField(term87840, term87840.getClass(), "type", 0);
        setField(term87841, term87841.getClass(), "functionName", null);
        setBooleanField(term87841, term87841.getClass(), "itsNeedsActivation", false);
        setIntField(term87841, term87841.getClass(), "itsFunctionType", 0);
        setBooleanField(term87841, term87841.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term87841, term87841.getClass(), "encodedSourceStart", 0);
        setIntField(term87841, term87841.getClass(), "encodedSourceEnd", 0);
        setField(term87841, term87841.getClass(), "sourceName", null);
        setIntField(term87841, term87841.getClass(), "baseLineno", 0);
        setIntField(term87841, term87841.getClass(), "endLineno", 0);
        setField(term87841, term87841.getClass(), "functions", null);
        setField(term87841, term87841.getClass(), "regexps", null);
        setField(term87841, term87841.getClass(), "itsVariables", null);
        setField(term87841, term87841.getClass(), "itsConst", null);
        setField(term87841, term87841.getClass(), "itsVariableNames", null);
        setIntField(term87841, term87841.getClass(), "varStart", 0);
        setField(term87841, term87841.getClass(), "compilerData", null);
        setIntField(term87841, term87841.getClass(), "type", 0);
        setField(term87841, term87841.getClass(), "next", null);
        setField(term87841, term87841.getClass(), "first", null);
        setField(term87841, term87841.getClass(), "last", null);
        setField(term87841, term87841.getClass(), "propListHead", null);
        setIntField(term87841, term87841.getClass(), "sourcePosition", 0);
        setField(term87841, term87841.getClass(), "jsType", null);
        setField(term87841, term87841.getClass(), "parent", null);
        setField(term87840, term87840.getClass(), "next", term87841);
        setDoubleField(term87842, term87842.getClass(), "number", 0.0);
        setIntField(term87842, term87842.getClass(), "type", 0);
        setField(term87842, term87842.getClass(), "next", null);
        setField(term87842, term87842.getClass(), "first", null);
        setField(term87842, term87842.getClass(), "last", null);
        setField(term87842, term87842.getClass(), "propListHead", null);
        setIntField(term87842, term87842.getClass(), "sourcePosition", 0);
        setField(term87842, term87842.getClass(), "jsType", null);
        setField(term87842, term87842.getClass(), "parent", null);
        setField(term87840, term87840.getClass(), "first", term87842);
        setField(term87840, term87840.getClass(), "last", null);
        setField(term87840, term87840.getClass(), "propListHead", null);
        setIntField(term87840, term87840.getClass(), "sourcePosition", 0);
        setField(term87840, term87840.getClass(), "jsType", null);
        setField(term87840, term87840.getClass(), "parent", null);
        setField(term87839, term87839.getClass(), "first", term87840);
        setField(term87839, term87839.getClass(), "last", null);
        setField(term87839, term87839.getClass(), "propListHead", null);
        setIntField(term87839, term87839.getClass(), "sourcePosition", 0);
        setField(term87839, term87839.getClass(), "jsType", null);
        setField(term87839, term87839.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term86911;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term86739, args);
        assertTrue(recursiveEquals(term86739, term87837));
        assertTrue(recursiveEquals(term86911, term87839));
    }

};


