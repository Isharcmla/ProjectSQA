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

public class ScopedAliases_hotSwapScript_8834170932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19764;
     Object term19936;
     Object term20971;
     Object term20973;

    public ScopedAliases_hotSwapScript_8834170932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19764 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term19844 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term19844, term19844.getClass(), "phaseOptimizer", null);
        setField(term19764, term19764.getClass(), "compiler", term19844);
        term19936 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term20028 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term19936, term19936.getClass(), "type", 0);
        setField(term19936, term19936.getClass(), "parent", null);
        setField(term19936, term19936.getClass(), "first", term20028);
        term20971 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term20972 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term20972, term20972.getClass(), "options", null);
        setField(term20972, term20972.getClass(), "passes", null);
        setField(term20972, term20972.getClass(), "externs", null);
        setField(term20972, term20972.getClass(), "modules", null);
        setField(term20972, term20972.getClass(), "moduleGraph", null);
        setField(term20972, term20972.getClass(), "inputs", null);
        setField(term20972, term20972.getClass(), "errorManager", null);
        setField(term20972, term20972.getClass(), "warningsGuard", null);
        setField(term20972, term20972.getClass(), "injectedLibraries", null);
        setField(term20972, term20972.getClass(), "externsRoot", null);
        setField(term20972, term20972.getClass(), "jsRoot", null);
        setField(term20972, term20972.getClass(), "externAndJsRoot", null);
        setField(term20972, term20972.getClass(), "inputsById", null);
        setField(term20972, term20972.getClass(), "sourceMap", null);
        setField(term20972, term20972.getClass(), "externExports", null);
        setIntField(term20972, term20972.getClass(), "uniqueNameId", 0);
        setBooleanField(term20972, term20972.getClass(), "hasRegExpGlobalReferences", false);
        setField(term20972, term20972.getClass(), "functionInformationMap", null);
        setField(term20972, term20972.getClass(), "debugLog", null);
        setField(term20972, term20972.getClass(), "defaultCodingConvention", null);
        setField(term20972, term20972.getClass(), "typeRegistry", null);
        setField(term20972, term20972.getClass(), "parserConfig", null);
        setField(term20972, term20972.getClass(), "abstractInterpreter", null);
        setField(term20972, term20972.getClass(), "typeValidator", null);
        setField(term20972, term20972.getClass(), "phaseOptimizer", null);
        setField(term20972, term20972.getClass(), "tracker", null);
        setField(term20972, term20972.getClass(), "oldErrorReporter", null);
        setField(term20972, term20972.getClass(), "defaultErrorReporter", null);
        setField(term20972, term20972.getClass(), "compilerThread", null);
        setBooleanField(term20972, term20972.getClass(), "useThreads", false);
        setField(term20972, term20972.getClass(), "outStream", null);
        setField(term20972, term20972.getClass(), "globalRefMap", null);
        setDoubleField(term20972, term20972.getClass(), "progress", 0.0);
        setField(term20972, term20972.getClass(), "lastPassName", null);
        setField(term20972, term20972.getClass(), "sanityCheck", null);
        setField(term20972, term20972.getClass(), "currentTracer", null);
        setField(term20972, term20972.getClass(), "currentPassName", null);
        setIntField(term20972, term20972.getClass(), "syntheticCodeId", 0);
        setField(term20972, term20972.getClass(), "recentChange", null);
        setField(term20972, term20972.getClass(), "codeChangeHandlers", null);
        setField(term20972, term20972.getClass(), "synthesizedExternsInput", null);
        setField(term20972, term20972.getClass(), "stage", null);
        setBooleanField(term20972, term20972.getClass(), "analyzeChangedScopesOnly", false);
        setField(term20971, term20971.getClass(), "compiler", term20972);
        setField(term20971, term20971.getClass(), "preprocessorSymbolTable", null);
        setField(term20971, term20971.getClass(), "transformationHandler", null);
        setField(term20971, term20971.getClass(), "scopedAliasNames", null);
        term20973 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term20974 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term20973, term20973.getClass(), "str", null);
        setIntField(term20973, term20973.getClass(), "type", 0);
        setField(term20973, term20973.getClass(), "next", null);
        setField(term20974, term20974.getClass(), "str", null);
        setIntField(term20974, term20974.getClass(), "type", 0);
        setField(term20974, term20974.getClass(), "next", null);
        setField(term20974, term20974.getClass(), "first", null);
        setField(term20974, term20974.getClass(), "last", null);
        setField(term20974, term20974.getClass(), "propListHead", null);
        setIntField(term20974, term20974.getClass(), "sourcePosition", 0);
        setField(term20974, term20974.getClass(), "jsType", null);
        setField(term20974, term20974.getClass(), "parent", null);
        setField(term20973, term20973.getClass(), "first", term20974);
        setField(term20973, term20973.getClass(), "last", null);
        setField(term20973, term20973.getClass(), "propListHead", null);
        setIntField(term20973, term20973.getClass(), "sourcePosition", 0);
        setField(term20973, term20973.getClass(), "jsType", null);
        setField(term20973, term20973.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term19936;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term19764, args);
        assertTrue(recursiveEquals(term19764, term20971));
        assertTrue(recursiveEquals(term19936, term20973));
    }

};


