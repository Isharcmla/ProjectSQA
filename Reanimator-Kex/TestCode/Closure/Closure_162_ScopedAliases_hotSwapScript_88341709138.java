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

public class ScopedAliases_hotSwapScript_88341709138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75495;
     Object term75665;
     Object term76464;
     Object term76466;

    public ScopedAliases_hotSwapScript_88341709138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75495 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term75575 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term75495, term75495.getClass(), "compiler", term75575);
        term75665 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term75751 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term75841 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term75665, term75665.getClass(), "type", 0);
        setField(term75665, term75665.getClass(), "parent", null);
        setField(term75751, term75751.getClass(), "next", null);
        setIntField(term75751, term75751.getClass(), "type", 0);
        setField(term75841, term75841.getClass(), "next", null);
        setIntField(term75841, term75841.getClass(), "type", 0);
        setField(term75841, term75841.getClass(), "first", null);
        setField(term75751, term75751.getClass(), "first", term75841);
        setField(term75665, term75665.getClass(), "first", term75751);
        term76464 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term76465 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term76465, term76465.getClass(), "options", null);
        setField(term76465, term76465.getClass(), "passes", null);
        setField(term76465, term76465.getClass(), "externs", null);
        setField(term76465, term76465.getClass(), "modules", null);
        setField(term76465, term76465.getClass(), "moduleGraph", null);
        setField(term76465, term76465.getClass(), "inputs", null);
        setField(term76465, term76465.getClass(), "errorManager", null);
        setField(term76465, term76465.getClass(), "warningsGuard", null);
        setField(term76465, term76465.getClass(), "externsRoot", null);
        setField(term76465, term76465.getClass(), "jsRoot", null);
        setField(term76465, term76465.getClass(), "externAndJsRoot", null);
        setField(term76465, term76465.getClass(), "inputsById", null);
        setField(term76465, term76465.getClass(), "sourceMap", null);
        setField(term76465, term76465.getClass(), "externExports", null);
        setIntField(term76465, term76465.getClass(), "uniqueNameId", 0);
        setBooleanField(term76465, term76465.getClass(), "useThreads", false);
        setBooleanField(term76465, term76465.getClass(), "hasRegExpGlobalReferences", false);
        setField(term76465, term76465.getClass(), "functionInformationMap", null);
        setField(term76465, term76465.getClass(), "debugLog", null);
        setField(term76465, term76465.getClass(), "defaultCodingConvention", null);
        setField(term76465, term76465.getClass(), "typeRegistry", null);
        setField(term76465, term76465.getClass(), "parserConfig", null);
        setField(term76465, term76465.getClass(), "abstractInterpreter", null);
        setField(term76465, term76465.getClass(), "typeValidator", null);
        setField(term76465, term76465.getClass(), "tracker", null);
        setField(term76465, term76465.getClass(), "oldErrorReporter", null);
        setField(term76465, term76465.getClass(), "defaultErrorReporter", null);
        setField(term76465, term76465.getClass(), "outStream", null);
        setField(term76465, term76465.getClass(), "globalRefMap", null);
        setField(term76465, term76465.getClass(), "sanityCheck", null);
        setField(term76465, term76465.getClass(), "currentTracer", null);
        setField(term76465, term76465.getClass(), "currentPassName", null);
        setIntField(term76465, term76465.getClass(), "syntheticCodeId", 0);
        setField(term76465, term76465.getClass(), "recentChange", null);
        setField(term76465, term76465.getClass(), "codeChangeHandlers", null);
        setField(term76465, term76465.getClass(), "stage", null);
        setField(term76464, term76464.getClass(), "compiler", term76465);
        setField(term76464, term76464.getClass(), "preprocessorSymbolTable", null);
        setField(term76464, term76464.getClass(), "transformationHandler", null);
        term76466 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term76467 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term76468 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term76466, term76466.getClass(), "encodedSourceStart", 0);
        setIntField(term76466, term76466.getClass(), "encodedSourceEnd", 0);
        setField(term76466, term76466.getClass(), "sourceName", null);
        setIntField(term76466, term76466.getClass(), "baseLineno", 0);
        setIntField(term76466, term76466.getClass(), "endLineno", 0);
        setField(term76466, term76466.getClass(), "functions", null);
        setField(term76466, term76466.getClass(), "regexps", null);
        setField(term76466, term76466.getClass(), "itsVariables", null);
        setField(term76466, term76466.getClass(), "itsConst", null);
        setField(term76466, term76466.getClass(), "itsVariableNames", null);
        setIntField(term76466, term76466.getClass(), "varStart", 0);
        setField(term76466, term76466.getClass(), "compilerData", null);
        setIntField(term76466, term76466.getClass(), "type", 0);
        setField(term76466, term76466.getClass(), "next", null);
        setField(term76467, term76467.getClass(), "functionName", null);
        setBooleanField(term76467, term76467.getClass(), "itsNeedsActivation", false);
        setIntField(term76467, term76467.getClass(), "itsFunctionType", 0);
        setBooleanField(term76467, term76467.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term76467, term76467.getClass(), "encodedSourceStart", 0);
        setIntField(term76467, term76467.getClass(), "encodedSourceEnd", 0);
        setField(term76467, term76467.getClass(), "sourceName", null);
        setIntField(term76467, term76467.getClass(), "baseLineno", 0);
        setIntField(term76467, term76467.getClass(), "endLineno", 0);
        setField(term76467, term76467.getClass(), "functions", null);
        setField(term76467, term76467.getClass(), "regexps", null);
        setField(term76467, term76467.getClass(), "itsVariables", null);
        setField(term76467, term76467.getClass(), "itsConst", null);
        setField(term76467, term76467.getClass(), "itsVariableNames", null);
        setIntField(term76467, term76467.getClass(), "varStart", 0);
        setField(term76467, term76467.getClass(), "compilerData", null);
        setIntField(term76467, term76467.getClass(), "type", 0);
        setField(term76467, term76467.getClass(), "next", null);
        setIntField(term76468, term76468.getClass(), "encodedSourceStart", 0);
        setIntField(term76468, term76468.getClass(), "encodedSourceEnd", 0);
        setField(term76468, term76468.getClass(), "sourceName", null);
        setIntField(term76468, term76468.getClass(), "baseLineno", 0);
        setIntField(term76468, term76468.getClass(), "endLineno", 0);
        setField(term76468, term76468.getClass(), "functions", null);
        setField(term76468, term76468.getClass(), "regexps", null);
        setField(term76468, term76468.getClass(), "itsVariables", null);
        setField(term76468, term76468.getClass(), "itsConst", null);
        setField(term76468, term76468.getClass(), "itsVariableNames", null);
        setIntField(term76468, term76468.getClass(), "varStart", 0);
        setField(term76468, term76468.getClass(), "compilerData", null);
        setIntField(term76468, term76468.getClass(), "type", 0);
        setField(term76468, term76468.getClass(), "next", null);
        setField(term76468, term76468.getClass(), "first", null);
        setField(term76468, term76468.getClass(), "last", null);
        setField(term76468, term76468.getClass(), "propListHead", null);
        setIntField(term76468, term76468.getClass(), "sourcePosition", 0);
        setField(term76468, term76468.getClass(), "jsType", null);
        setField(term76468, term76468.getClass(), "parent", null);
        setField(term76467, term76467.getClass(), "first", term76468);
        setField(term76467, term76467.getClass(), "last", null);
        setField(term76467, term76467.getClass(), "propListHead", null);
        setIntField(term76467, term76467.getClass(), "sourcePosition", 0);
        setField(term76467, term76467.getClass(), "jsType", null);
        setField(term76467, term76467.getClass(), "parent", null);
        setField(term76466, term76466.getClass(), "first", term76467);
        setField(term76466, term76466.getClass(), "last", null);
        setField(term76466, term76466.getClass(), "propListHead", null);
        setIntField(term76466, term76466.getClass(), "sourcePosition", 0);
        setField(term76466, term76466.getClass(), "jsType", null);
        setField(term76466, term76466.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term75665;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term75495, args);
        assertTrue(recursiveEquals(term75495, term76464));
        assertTrue(recursiveEquals(term75665, term76466));
    }

};


