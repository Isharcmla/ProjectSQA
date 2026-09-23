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

public class ScopedAliases_hotSwapScript_88341709150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83166;
     Object term83338;
     Object term84116;
     Object term84118;

    public ScopedAliases_hotSwapScript_88341709150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83166 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term83246 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term83166, term83166.getClass(), "compiler", term83246);
        term83338 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term83430 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term83516 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term83338, term83338.getClass(), "type", 0);
        setField(term83338, term83338.getClass(), "parent", null);
        setField(term83430, term83430.getClass(), "next", null);
        setIntField(term83430, term83430.getClass(), "type", 0);
        setField(term83516, term83516.getClass(), "next", null);
        setIntField(term83516, term83516.getClass(), "type", 0);
        setField(term83516, term83516.getClass(), "first", null);
        setField(term83430, term83430.getClass(), "first", term83516);
        setField(term83338, term83338.getClass(), "first", term83430);
        term84116 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term84117 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term84117, term84117.getClass(), "options", null);
        setField(term84117, term84117.getClass(), "passes", null);
        setField(term84117, term84117.getClass(), "externs", null);
        setField(term84117, term84117.getClass(), "modules", null);
        setField(term84117, term84117.getClass(), "moduleGraph", null);
        setField(term84117, term84117.getClass(), "inputs", null);
        setField(term84117, term84117.getClass(), "errorManager", null);
        setField(term84117, term84117.getClass(), "warningsGuard", null);
        setField(term84117, term84117.getClass(), "externsRoot", null);
        setField(term84117, term84117.getClass(), "jsRoot", null);
        setField(term84117, term84117.getClass(), "externAndJsRoot", null);
        setField(term84117, term84117.getClass(), "inputsById", null);
        setField(term84117, term84117.getClass(), "sourceMap", null);
        setField(term84117, term84117.getClass(), "externExports", null);
        setIntField(term84117, term84117.getClass(), "uniqueNameId", 0);
        setBooleanField(term84117, term84117.getClass(), "useThreads", false);
        setBooleanField(term84117, term84117.getClass(), "hasRegExpGlobalReferences", false);
        setField(term84117, term84117.getClass(), "functionInformationMap", null);
        setField(term84117, term84117.getClass(), "debugLog", null);
        setField(term84117, term84117.getClass(), "defaultCodingConvention", null);
        setField(term84117, term84117.getClass(), "typeRegistry", null);
        setField(term84117, term84117.getClass(), "parserConfig", null);
        setField(term84117, term84117.getClass(), "abstractInterpreter", null);
        setField(term84117, term84117.getClass(), "typeValidator", null);
        setField(term84117, term84117.getClass(), "tracker", null);
        setField(term84117, term84117.getClass(), "oldErrorReporter", null);
        setField(term84117, term84117.getClass(), "defaultErrorReporter", null);
        setField(term84117, term84117.getClass(), "outStream", null);
        setField(term84117, term84117.getClass(), "globalRefMap", null);
        setField(term84117, term84117.getClass(), "sanityCheck", null);
        setField(term84117, term84117.getClass(), "currentTracer", null);
        setField(term84117, term84117.getClass(), "currentPassName", null);
        setIntField(term84117, term84117.getClass(), "syntheticCodeId", 0);
        setField(term84117, term84117.getClass(), "recentChange", null);
        setField(term84117, term84117.getClass(), "codeChangeHandlers", null);
        setField(term84117, term84117.getClass(), "stage", null);
        setField(term84116, term84116.getClass(), "compiler", term84117);
        setField(term84116, term84116.getClass(), "preprocessorSymbolTable", null);
        setField(term84116, term84116.getClass(), "transformationHandler", null);
        term84118 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term84119 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term84120 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term84118, term84118.getClass(), "number", 0.0);
        setIntField(term84118, term84118.getClass(), "type", 0);
        setField(term84118, term84118.getClass(), "next", null);
        setDoubleField(term84119, term84119.getClass(), "number", 0.0);
        setIntField(term84119, term84119.getClass(), "type", 0);
        setField(term84119, term84119.getClass(), "next", null);
        setField(term84120, term84120.getClass(), "functionName", null);
        setBooleanField(term84120, term84120.getClass(), "itsNeedsActivation", false);
        setIntField(term84120, term84120.getClass(), "itsFunctionType", 0);
        setBooleanField(term84120, term84120.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term84120, term84120.getClass(), "encodedSourceStart", 0);
        setIntField(term84120, term84120.getClass(), "encodedSourceEnd", 0);
        setField(term84120, term84120.getClass(), "sourceName", null);
        setIntField(term84120, term84120.getClass(), "baseLineno", 0);
        setIntField(term84120, term84120.getClass(), "endLineno", 0);
        setField(term84120, term84120.getClass(), "functions", null);
        setField(term84120, term84120.getClass(), "regexps", null);
        setField(term84120, term84120.getClass(), "itsVariables", null);
        setField(term84120, term84120.getClass(), "itsConst", null);
        setField(term84120, term84120.getClass(), "itsVariableNames", null);
        setIntField(term84120, term84120.getClass(), "varStart", 0);
        setField(term84120, term84120.getClass(), "compilerData", null);
        setIntField(term84120, term84120.getClass(), "type", 0);
        setField(term84120, term84120.getClass(), "next", null);
        setField(term84120, term84120.getClass(), "first", null);
        setField(term84120, term84120.getClass(), "last", null);
        setField(term84120, term84120.getClass(), "propListHead", null);
        setIntField(term84120, term84120.getClass(), "sourcePosition", 0);
        setField(term84120, term84120.getClass(), "jsType", null);
        setField(term84120, term84120.getClass(), "parent", null);
        setField(term84119, term84119.getClass(), "first", term84120);
        setField(term84119, term84119.getClass(), "last", null);
        setField(term84119, term84119.getClass(), "propListHead", null);
        setIntField(term84119, term84119.getClass(), "sourcePosition", 0);
        setField(term84119, term84119.getClass(), "jsType", null);
        setField(term84119, term84119.getClass(), "parent", null);
        setField(term84118, term84118.getClass(), "first", term84119);
        setField(term84118, term84118.getClass(), "last", null);
        setField(term84118, term84118.getClass(), "propListHead", null);
        setIntField(term84118, term84118.getClass(), "sourcePosition", 0);
        setField(term84118, term84118.getClass(), "jsType", null);
        setField(term84118, term84118.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term83338;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term83166, args);
        assertTrue(recursiveEquals(term83166, term84116));
        assertTrue(recursiveEquals(term83338, term84118));
    }

};


