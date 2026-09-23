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
     Object term9865;
     Object term10015;
     Object term10458;
     Object term10460;

    public ScopedAliases_hotSwapScript_8834170919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9865 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term9945 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term9865, term9865.getClass(), "compiler", term9945);
        term10015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10015, term10015.getClass(), "type", -133);
        setField(term10015, term10015.getClass(), "parent", null);
        term10458 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term10459 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term10459, term10459.getClass(), "options", null);
        setField(term10459, term10459.getClass(), "passes", null);
        setField(term10459, term10459.getClass(), "externs", null);
        setField(term10459, term10459.getClass(), "modules", null);
        setField(term10459, term10459.getClass(), "moduleGraph", null);
        setField(term10459, term10459.getClass(), "inputs", null);
        setField(term10459, term10459.getClass(), "errorManager", null);
        setField(term10459, term10459.getClass(), "warningsGuard", null);
        setField(term10459, term10459.getClass(), "injectedLibraries", null);
        setField(term10459, term10459.getClass(), "externsRoot", null);
        setField(term10459, term10459.getClass(), "jsRoot", null);
        setField(term10459, term10459.getClass(), "externAndJsRoot", null);
        setField(term10459, term10459.getClass(), "inputsById", null);
        setField(term10459, term10459.getClass(), "sourceMap", null);
        setField(term10459, term10459.getClass(), "externExports", null);
        setIntField(term10459, term10459.getClass(), "uniqueNameId", 0);
        setBooleanField(term10459, term10459.getClass(), "hasRegExpGlobalReferences", false);
        setField(term10459, term10459.getClass(), "functionInformationMap", null);
        setField(term10459, term10459.getClass(), "debugLog", null);
        setField(term10459, term10459.getClass(), "defaultCodingConvention", null);
        setField(term10459, term10459.getClass(), "typeRegistry", null);
        setField(term10459, term10459.getClass(), "parserConfig", null);
        setField(term10459, term10459.getClass(), "abstractInterpreter", null);
        setField(term10459, term10459.getClass(), "typeValidator", null);
        setField(term10459, term10459.getClass(), "phaseOptimizer", null);
        setField(term10459, term10459.getClass(), "tracker", null);
        setField(term10459, term10459.getClass(), "oldErrorReporter", null);
        setField(term10459, term10459.getClass(), "defaultErrorReporter", null);
        setField(term10459, term10459.getClass(), "compilerThread", null);
        setBooleanField(term10459, term10459.getClass(), "useThreads", false);
        setField(term10459, term10459.getClass(), "outStream", null);
        setField(term10459, term10459.getClass(), "globalRefMap", null);
        setDoubleField(term10459, term10459.getClass(), "progress", 0.0);
        setField(term10459, term10459.getClass(), "lastPassName", null);
        setField(term10459, term10459.getClass(), "sanityCheck", null);
        setField(term10459, term10459.getClass(), "currentTracer", null);
        setField(term10459, term10459.getClass(), "currentPassName", null);
        setIntField(term10459, term10459.getClass(), "syntheticCodeId", 0);
        setField(term10459, term10459.getClass(), "recentChange", null);
        setField(term10459, term10459.getClass(), "codeChangeHandlers", null);
        setField(term10459, term10459.getClass(), "synthesizedExternsInput", null);
        setField(term10459, term10459.getClass(), "stage", null);
        setBooleanField(term10459, term10459.getClass(), "analyzeChangedScopesOnly", false);
        setField(term10458, term10458.getClass(), "compiler", term10459);
        setField(term10458, term10458.getClass(), "preprocessorSymbolTable", null);
        setField(term10458, term10458.getClass(), "transformationHandler", null);
        setField(term10458, term10458.getClass(), "scopedAliasNames", null);
        term10460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10460, term10460.getClass(), "type", -133);
        setField(term10460, term10460.getClass(), "next", null);
        setField(term10460, term10460.getClass(), "first", null);
        setField(term10460, term10460.getClass(), "last", null);
        setField(term10460, term10460.getClass(), "propListHead", null);
        setIntField(term10460, term10460.getClass(), "sourcePosition", 0);
        setField(term10460, term10460.getClass(), "jsType", null);
        setField(term10460, term10460.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term10015;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term9865, args);
        assertTrue(recursiveEquals(term9865, term10458));
        assertTrue(recursiveEquals(term10015, term10460));
    }

};


