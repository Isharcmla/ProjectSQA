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

public class ScopedAliases_hotSwapScript_88341709168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94689;
     Object term94855;
     Object term95625;
     Object term95627;

    public ScopedAliases_hotSwapScript_88341709168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94689 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term94769 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term94689, term94689.getClass(), "compiler", term94769);
        term94855 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term94945 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term95035 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term94855, term94855.getClass(), "type", 0);
        setField(term94855, term94855.getClass(), "parent", null);
        setField(term94945, term94945.getClass(), "next", null);
        setIntField(term94945, term94945.getClass(), "type", 0);
        setField(term95035, term95035.getClass(), "next", null);
        setIntField(term95035, term95035.getClass(), "type", 0);
        setField(term95035, term95035.getClass(), "first", null);
        setField(term94945, term94945.getClass(), "first", term95035);
        setField(term94855, term94855.getClass(), "first", term94945);
        term95625 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term95626 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term95626, term95626.getClass(), "options", null);
        setField(term95626, term95626.getClass(), "passes", null);
        setField(term95626, term95626.getClass(), "externs", null);
        setField(term95626, term95626.getClass(), "modules", null);
        setField(term95626, term95626.getClass(), "moduleGraph", null);
        setField(term95626, term95626.getClass(), "inputs", null);
        setField(term95626, term95626.getClass(), "errorManager", null);
        setField(term95626, term95626.getClass(), "warningsGuard", null);
        setField(term95626, term95626.getClass(), "externsRoot", null);
        setField(term95626, term95626.getClass(), "jsRoot", null);
        setField(term95626, term95626.getClass(), "externAndJsRoot", null);
        setField(term95626, term95626.getClass(), "inputsById", null);
        setField(term95626, term95626.getClass(), "sourceMap", null);
        setField(term95626, term95626.getClass(), "externExports", null);
        setIntField(term95626, term95626.getClass(), "uniqueNameId", 0);
        setBooleanField(term95626, term95626.getClass(), "useThreads", false);
        setBooleanField(term95626, term95626.getClass(), "hasRegExpGlobalReferences", false);
        setField(term95626, term95626.getClass(), "functionInformationMap", null);
        setField(term95626, term95626.getClass(), "debugLog", null);
        setField(term95626, term95626.getClass(), "defaultCodingConvention", null);
        setField(term95626, term95626.getClass(), "typeRegistry", null);
        setField(term95626, term95626.getClass(), "parserConfig", null);
        setField(term95626, term95626.getClass(), "abstractInterpreter", null);
        setField(term95626, term95626.getClass(), "typeValidator", null);
        setField(term95626, term95626.getClass(), "tracker", null);
        setField(term95626, term95626.getClass(), "oldErrorReporter", null);
        setField(term95626, term95626.getClass(), "defaultErrorReporter", null);
        setField(term95626, term95626.getClass(), "outStream", null);
        setField(term95626, term95626.getClass(), "globalRefMap", null);
        setField(term95626, term95626.getClass(), "sanityCheck", null);
        setField(term95626, term95626.getClass(), "currentTracer", null);
        setField(term95626, term95626.getClass(), "currentPassName", null);
        setIntField(term95626, term95626.getClass(), "syntheticCodeId", 0);
        setField(term95626, term95626.getClass(), "recentChange", null);
        setField(term95626, term95626.getClass(), "codeChangeHandlers", null);
        setField(term95626, term95626.getClass(), "stage", null);
        setField(term95625, term95625.getClass(), "compiler", term95626);
        setField(term95625, term95625.getClass(), "preprocessorSymbolTable", null);
        setField(term95625, term95625.getClass(), "transformationHandler", null);
        term95627 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term95628 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term95629 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term95627, term95627.getClass(), "functionName", null);
        setBooleanField(term95627, term95627.getClass(), "itsNeedsActivation", false);
        setIntField(term95627, term95627.getClass(), "itsFunctionType", 0);
        setBooleanField(term95627, term95627.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term95627, term95627.getClass(), "encodedSourceStart", 0);
        setIntField(term95627, term95627.getClass(), "encodedSourceEnd", 0);
        setField(term95627, term95627.getClass(), "sourceName", null);
        setIntField(term95627, term95627.getClass(), "baseLineno", 0);
        setIntField(term95627, term95627.getClass(), "endLineno", 0);
        setField(term95627, term95627.getClass(), "functions", null);
        setField(term95627, term95627.getClass(), "regexps", null);
        setField(term95627, term95627.getClass(), "itsVariables", null);
        setField(term95627, term95627.getClass(), "itsConst", null);
        setField(term95627, term95627.getClass(), "itsVariableNames", null);
        setIntField(term95627, term95627.getClass(), "varStart", 0);
        setField(term95627, term95627.getClass(), "compilerData", null);
        setIntField(term95627, term95627.getClass(), "type", 0);
        setField(term95627, term95627.getClass(), "next", null);
        setIntField(term95628, term95628.getClass(), "encodedSourceStart", 0);
        setIntField(term95628, term95628.getClass(), "encodedSourceEnd", 0);
        setField(term95628, term95628.getClass(), "sourceName", null);
        setIntField(term95628, term95628.getClass(), "baseLineno", 0);
        setIntField(term95628, term95628.getClass(), "endLineno", 0);
        setField(term95628, term95628.getClass(), "functions", null);
        setField(term95628, term95628.getClass(), "regexps", null);
        setField(term95628, term95628.getClass(), "itsVariables", null);
        setField(term95628, term95628.getClass(), "itsConst", null);
        setField(term95628, term95628.getClass(), "itsVariableNames", null);
        setIntField(term95628, term95628.getClass(), "varStart", 0);
        setField(term95628, term95628.getClass(), "compilerData", null);
        setIntField(term95628, term95628.getClass(), "type", 0);
        setField(term95628, term95628.getClass(), "next", null);
        setIntField(term95629, term95629.getClass(), "encodedSourceStart", 0);
        setIntField(term95629, term95629.getClass(), "encodedSourceEnd", 0);
        setField(term95629, term95629.getClass(), "sourceName", null);
        setIntField(term95629, term95629.getClass(), "baseLineno", 0);
        setIntField(term95629, term95629.getClass(), "endLineno", 0);
        setField(term95629, term95629.getClass(), "functions", null);
        setField(term95629, term95629.getClass(), "regexps", null);
        setField(term95629, term95629.getClass(), "itsVariables", null);
        setField(term95629, term95629.getClass(), "itsConst", null);
        setField(term95629, term95629.getClass(), "itsVariableNames", null);
        setIntField(term95629, term95629.getClass(), "varStart", 0);
        setField(term95629, term95629.getClass(), "compilerData", null);
        setIntField(term95629, term95629.getClass(), "type", 0);
        setField(term95629, term95629.getClass(), "next", null);
        setField(term95629, term95629.getClass(), "first", null);
        setField(term95629, term95629.getClass(), "last", null);
        setField(term95629, term95629.getClass(), "propListHead", null);
        setIntField(term95629, term95629.getClass(), "sourcePosition", 0);
        setField(term95629, term95629.getClass(), "jsType", null);
        setField(term95629, term95629.getClass(), "parent", null);
        setField(term95628, term95628.getClass(), "first", term95629);
        setField(term95628, term95628.getClass(), "last", null);
        setField(term95628, term95628.getClass(), "propListHead", null);
        setIntField(term95628, term95628.getClass(), "sourcePosition", 0);
        setField(term95628, term95628.getClass(), "jsType", null);
        setField(term95628, term95628.getClass(), "parent", null);
        setField(term95627, term95627.getClass(), "first", term95628);
        setField(term95627, term95627.getClass(), "last", null);
        setField(term95627, term95627.getClass(), "propListHead", null);
        setIntField(term95627, term95627.getClass(), "sourcePosition", 0);
        setField(term95627, term95627.getClass(), "jsType", null);
        setField(term95627, term95627.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term94855;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term94689, args);
        assertTrue(recursiveEquals(term94689, term95625));
        assertTrue(recursiveEquals(term94855, term95627));
    }

};


