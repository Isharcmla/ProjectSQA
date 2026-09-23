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

public class ScopedAliases_hotSwapScript_8834170919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10598;
     Object term10770;
     Object term11326;
     Object term11328;

    public ScopedAliases_hotSwapScript_8834170919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10598 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term10678 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term10598, term10598.getClass(), "compiler", term10678);
        term10770 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term10840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10770, term10770.getClass(), "type", -133);
        setField(term10770, term10770.getClass(), "parent", term10840);
        term11326 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term11327 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term11327, term11327.getClass(), "options", null);
        setField(term11327, term11327.getClass(), "passes", null);
        setField(term11327, term11327.getClass(), "externs", null);
        setField(term11327, term11327.getClass(), "modules", null);
        setField(term11327, term11327.getClass(), "moduleGraph", null);
        setField(term11327, term11327.getClass(), "inputs", null);
        setField(term11327, term11327.getClass(), "errorManager", null);
        setField(term11327, term11327.getClass(), "warningsGuard", null);
        setField(term11327, term11327.getClass(), "injectedLibraries", null);
        setField(term11327, term11327.getClass(), "externsRoot", null);
        setField(term11327, term11327.getClass(), "jsRoot", null);
        setField(term11327, term11327.getClass(), "externAndJsRoot", null);
        setField(term11327, term11327.getClass(), "inputsById", null);
        setField(term11327, term11327.getClass(), "sourceMap", null);
        setField(term11327, term11327.getClass(), "externExports", null);
        setIntField(term11327, term11327.getClass(), "uniqueNameId", 0);
        setIntField(term11327, term11327.getClass(), "timeout", 0);
        setBooleanField(term11327, term11327.getClass(), "hasRegExpGlobalReferences", false);
        setField(term11327, term11327.getClass(), "functionInformationMap", null);
        setField(term11327, term11327.getClass(), "debugLog", null);
        setField(term11327, term11327.getClass(), "defaultCodingConvention", null);
        setField(term11327, term11327.getClass(), "typeRegistry", null);
        setField(term11327, term11327.getClass(), "parserConfig", null);
        setField(term11327, term11327.getClass(), "abstractInterpreter", null);
        setField(term11327, term11327.getClass(), "typeValidator", null);
        setField(term11327, term11327.getClass(), "phaseOptimizer", null);
        setField(term11327, term11327.getClass(), "tracker", null);
        setField(term11327, term11327.getClass(), "oldErrorReporter", null);
        setField(term11327, term11327.getClass(), "defaultErrorReporter", null);
        setField(term11327, term11327.getClass(), "compilerThread", null);
        setBooleanField(term11327, term11327.getClass(), "useThreads", false);
        setField(term11327, term11327.getClass(), "outStream", null);
        setField(term11327, term11327.getClass(), "globalRefMap", null);
        setDoubleField(term11327, term11327.getClass(), "progress", 0.0);
        setField(term11327, term11327.getClass(), "lastPassName", null);
        setField(term11327, term11327.getClass(), "sanityCheck", null);
        setField(term11327, term11327.getClass(), "currentTracer", null);
        setField(term11327, term11327.getClass(), "currentPassName", null);
        setIntField(term11327, term11327.getClass(), "syntheticCodeId", 0);
        setField(term11327, term11327.getClass(), "recentChange", null);
        setField(term11327, term11327.getClass(), "codeChangeHandlers", null);
        setField(term11327, term11327.getClass(), "synthesizedExternsInput", null);
        setField(term11327, term11327.getClass(), "stage", null);
        setBooleanField(term11327, term11327.getClass(), "analyzeChangedScopesOnly", false);
        setField(term11326, term11326.getClass(), "compiler", term11327);
        setField(term11326, term11326.getClass(), "preprocessorSymbolTable", null);
        setField(term11326, term11326.getClass(), "transformationHandler", null);
        setField(term11326, term11326.getClass(), "scopedAliasNames", null);
        term11328 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term11329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term11328, term11328.getClass(), "str", null);
        setIntField(term11328, term11328.getClass(), "type", -133);
        setField(term11328, term11328.getClass(), "next", null);
        setField(term11328, term11328.getClass(), "first", null);
        setField(term11328, term11328.getClass(), "last", null);
        setField(term11328, term11328.getClass(), "propListHead", null);
        setIntField(term11328, term11328.getClass(), "sourcePosition", 0);
        setField(term11328, term11328.getClass(), "jsType", null);
        setIntField(term11329, term11329.getClass(), "type", 0);
        setField(term11329, term11329.getClass(), "next", null);
        setField(term11329, term11329.getClass(), "first", null);
        setField(term11329, term11329.getClass(), "last", null);
        setField(term11329, term11329.getClass(), "propListHead", null);
        setIntField(term11329, term11329.getClass(), "sourcePosition", 0);
        setField(term11329, term11329.getClass(), "jsType", null);
        setField(term11329, term11329.getClass(), "parent", null);
        setField(term11328, term11328.getClass(), "parent", term11329);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term10770;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term10598, args);
        assertTrue(recursiveEquals(term10598, term11326));
        assertTrue(recursiveEquals(term10770, term11328));
    }

};


