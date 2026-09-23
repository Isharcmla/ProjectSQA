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

public class ScopedAliases_hotSwapScript_88341709120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64412;
     Object term64584;
     Object term65567;
     Object term65569;

    public ScopedAliases_hotSwapScript_88341709120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64412 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term64492 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term64412, term64412.getClass(), "compiler", term64492);
        term64584 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term64676 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term64762 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term64854 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term64584, term64584.getClass(), "type", 0);
        setField(term64584, term64584.getClass(), "parent", null);
        setField(term64762, term64762.getClass(), "next", null);
        setIntField(term64762, term64762.getClass(), "type", 0);
        setField(term64762, term64762.getClass(), "first", null);
        setField(term64676, term64676.getClass(), "next", term64762);
        setIntField(term64676, term64676.getClass(), "type", 0);
        setField(term64854, term64854.getClass(), "next", null);
        setIntField(term64854, term64854.getClass(), "type", 0);
        setField(term64854, term64854.getClass(), "first", null);
        setField(term64676, term64676.getClass(), "first", term64854);
        setField(term64584, term64584.getClass(), "first", term64676);
        term65567 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term65568 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term65568, term65568.getClass(), "options", null);
        setField(term65568, term65568.getClass(), "passes", null);
        setField(term65568, term65568.getClass(), "externs", null);
        setField(term65568, term65568.getClass(), "modules", null);
        setField(term65568, term65568.getClass(), "moduleGraph", null);
        setField(term65568, term65568.getClass(), "inputs", null);
        setField(term65568, term65568.getClass(), "errorManager", null);
        setField(term65568, term65568.getClass(), "warningsGuard", null);
        setField(term65568, term65568.getClass(), "externsRoot", null);
        setField(term65568, term65568.getClass(), "jsRoot", null);
        setField(term65568, term65568.getClass(), "externAndJsRoot", null);
        setField(term65568, term65568.getClass(), "inputsById", null);
        setField(term65568, term65568.getClass(), "sourceMap", null);
        setField(term65568, term65568.getClass(), "externExports", null);
        setIntField(term65568, term65568.getClass(), "uniqueNameId", 0);
        setBooleanField(term65568, term65568.getClass(), "useThreads", false);
        setBooleanField(term65568, term65568.getClass(), "hasRegExpGlobalReferences", false);
        setField(term65568, term65568.getClass(), "functionInformationMap", null);
        setField(term65568, term65568.getClass(), "debugLog", null);
        setField(term65568, term65568.getClass(), "defaultCodingConvention", null);
        setField(term65568, term65568.getClass(), "typeRegistry", null);
        setField(term65568, term65568.getClass(), "parserConfig", null);
        setField(term65568, term65568.getClass(), "abstractInterpreter", null);
        setField(term65568, term65568.getClass(), "typeValidator", null);
        setField(term65568, term65568.getClass(), "tracker", null);
        setField(term65568, term65568.getClass(), "oldErrorReporter", null);
        setField(term65568, term65568.getClass(), "defaultErrorReporter", null);
        setField(term65568, term65568.getClass(), "outStream", null);
        setField(term65568, term65568.getClass(), "globalRefMap", null);
        setField(term65568, term65568.getClass(), "sanityCheck", null);
        setField(term65568, term65568.getClass(), "currentTracer", null);
        setField(term65568, term65568.getClass(), "currentPassName", null);
        setIntField(term65568, term65568.getClass(), "syntheticCodeId", 0);
        setField(term65568, term65568.getClass(), "recentChange", null);
        setField(term65568, term65568.getClass(), "codeChangeHandlers", null);
        setField(term65568, term65568.getClass(), "stage", null);
        setField(term65567, term65567.getClass(), "compiler", term65568);
        setField(term65567, term65567.getClass(), "preprocessorSymbolTable", null);
        setField(term65567, term65567.getClass(), "transformationHandler", null);
        term65569 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term65570 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term65571 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term65572 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term65569, term65569.getClass(), "number", 0.0);
        setIntField(term65569, term65569.getClass(), "type", 0);
        setField(term65569, term65569.getClass(), "next", null);
        setDoubleField(term65570, term65570.getClass(), "number", 0.0);
        setIntField(term65570, term65570.getClass(), "type", 0);
        setField(term65571, term65571.getClass(), "functionName", null);
        setBooleanField(term65571, term65571.getClass(), "itsNeedsActivation", false);
        setIntField(term65571, term65571.getClass(), "itsFunctionType", 0);
        setBooleanField(term65571, term65571.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term65571, term65571.getClass(), "encodedSourceStart", 0);
        setIntField(term65571, term65571.getClass(), "encodedSourceEnd", 0);
        setField(term65571, term65571.getClass(), "sourceName", null);
        setIntField(term65571, term65571.getClass(), "baseLineno", 0);
        setIntField(term65571, term65571.getClass(), "endLineno", 0);
        setField(term65571, term65571.getClass(), "functions", null);
        setField(term65571, term65571.getClass(), "regexps", null);
        setField(term65571, term65571.getClass(), "itsVariables", null);
        setField(term65571, term65571.getClass(), "itsConst", null);
        setField(term65571, term65571.getClass(), "itsVariableNames", null);
        setIntField(term65571, term65571.getClass(), "varStart", 0);
        setField(term65571, term65571.getClass(), "compilerData", null);
        setIntField(term65571, term65571.getClass(), "type", 0);
        setField(term65571, term65571.getClass(), "next", null);
        setField(term65571, term65571.getClass(), "first", null);
        setField(term65571, term65571.getClass(), "last", null);
        setField(term65571, term65571.getClass(), "propListHead", null);
        setIntField(term65571, term65571.getClass(), "sourcePosition", 0);
        setField(term65571, term65571.getClass(), "jsType", null);
        setField(term65571, term65571.getClass(), "parent", null);
        setField(term65570, term65570.getClass(), "next", term65571);
        setDoubleField(term65572, term65572.getClass(), "number", 0.0);
        setIntField(term65572, term65572.getClass(), "type", 0);
        setField(term65572, term65572.getClass(), "next", null);
        setField(term65572, term65572.getClass(), "first", null);
        setField(term65572, term65572.getClass(), "last", null);
        setField(term65572, term65572.getClass(), "propListHead", null);
        setIntField(term65572, term65572.getClass(), "sourcePosition", 0);
        setField(term65572, term65572.getClass(), "jsType", null);
        setField(term65572, term65572.getClass(), "parent", null);
        setField(term65570, term65570.getClass(), "first", term65572);
        setField(term65570, term65570.getClass(), "last", null);
        setField(term65570, term65570.getClass(), "propListHead", null);
        setIntField(term65570, term65570.getClass(), "sourcePosition", 0);
        setField(term65570, term65570.getClass(), "jsType", null);
        setField(term65570, term65570.getClass(), "parent", null);
        setField(term65569, term65569.getClass(), "first", term65570);
        setField(term65569, term65569.getClass(), "last", null);
        setField(term65569, term65569.getClass(), "propListHead", null);
        setIntField(term65569, term65569.getClass(), "sourcePosition", 0);
        setField(term65569, term65569.getClass(), "jsType", null);
        setField(term65569, term65569.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term64584;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term64412, args);
        assertTrue(recursiveEquals(term64412, term65567));
        assertTrue(recursiveEquals(term64584, term65569));
    }

};


