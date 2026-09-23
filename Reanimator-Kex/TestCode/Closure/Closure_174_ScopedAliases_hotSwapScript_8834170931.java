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

public class ScopedAliases_hotSwapScript_8834170931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15933;
     Object term16105;
     Object term17341;
     Object term17343;

    public ScopedAliases_hotSwapScript_8834170931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15933 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term16013 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term15933, term15933.getClass(), "compiler", term16013);
        term16105 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term16105, term16105.getClass(), "type", -133);
        setField(term16105, term16105.getClass(), "parent", null);
        term17341 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term17342 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term17342, term17342.getClass(), "options", null);
        setField(term17342, term17342.getClass(), "passes", null);
        setField(term17342, term17342.getClass(), "externs", null);
        setField(term17342, term17342.getClass(), "modules", null);
        setField(term17342, term17342.getClass(), "moduleGraph", null);
        setField(term17342, term17342.getClass(), "inputs", null);
        setField(term17342, term17342.getClass(), "errorManager", null);
        setField(term17342, term17342.getClass(), "warningsGuard", null);
        setField(term17342, term17342.getClass(), "injectedLibraries", null);
        setField(term17342, term17342.getClass(), "externsRoot", null);
        setField(term17342, term17342.getClass(), "jsRoot", null);
        setField(term17342, term17342.getClass(), "externAndJsRoot", null);
        setField(term17342, term17342.getClass(), "inputsById", null);
        setField(term17342, term17342.getClass(), "sourceMap", null);
        setField(term17342, term17342.getClass(), "externExports", null);
        setIntField(term17342, term17342.getClass(), "uniqueNameId", 0);
        setBooleanField(term17342, term17342.getClass(), "hasRegExpGlobalReferences", false);
        setField(term17342, term17342.getClass(), "functionInformationMap", null);
        setField(term17342, term17342.getClass(), "debugLog", null);
        setField(term17342, term17342.getClass(), "defaultCodingConvention", null);
        setField(term17342, term17342.getClass(), "typeRegistry", null);
        setField(term17342, term17342.getClass(), "parserConfig", null);
        setField(term17342, term17342.getClass(), "abstractInterpreter", null);
        setField(term17342, term17342.getClass(), "typeValidator", null);
        setField(term17342, term17342.getClass(), "phaseOptimizer", null);
        setField(term17342, term17342.getClass(), "tracker", null);
        setField(term17342, term17342.getClass(), "oldErrorReporter", null);
        setField(term17342, term17342.getClass(), "defaultErrorReporter", null);
        setField(term17342, term17342.getClass(), "compilerThread", null);
        setBooleanField(term17342, term17342.getClass(), "useThreads", false);
        setField(term17342, term17342.getClass(), "outStream", null);
        setField(term17342, term17342.getClass(), "globalRefMap", null);
        setDoubleField(term17342, term17342.getClass(), "progress", 0.0);
        setField(term17342, term17342.getClass(), "lastPassName", null);
        setField(term17342, term17342.getClass(), "sanityCheck", null);
        setField(term17342, term17342.getClass(), "currentTracer", null);
        setField(term17342, term17342.getClass(), "currentPassName", null);
        setIntField(term17342, term17342.getClass(), "syntheticCodeId", 0);
        setField(term17342, term17342.getClass(), "recentChange", null);
        setField(term17342, term17342.getClass(), "codeChangeHandlers", null);
        setField(term17342, term17342.getClass(), "synthesizedExternsInput", null);
        setField(term17342, term17342.getClass(), "stage", null);
        setBooleanField(term17342, term17342.getClass(), "analyzeChangedScopesOnly", false);
        setField(term17341, term17341.getClass(), "compiler", term17342);
        setField(term17341, term17341.getClass(), "preprocessorSymbolTable", null);
        setField(term17341, term17341.getClass(), "transformationHandler", null);
        setField(term17341, term17341.getClass(), "scopedAliasNames", null);
        term17343 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term17343, term17343.getClass(), "number", 0.0);
        setIntField(term17343, term17343.getClass(), "type", -133);
        setField(term17343, term17343.getClass(), "next", null);
        setField(term17343, term17343.getClass(), "first", null);
        setField(term17343, term17343.getClass(), "last", null);
        setField(term17343, term17343.getClass(), "propListHead", null);
        setIntField(term17343, term17343.getClass(), "sourcePosition", 0);
        setField(term17343, term17343.getClass(), "jsType", null);
        setField(term17343, term17343.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term16105;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term15933, args);
        assertTrue(recursiveEquals(term15933, term17341));
        assertTrue(recursiveEquals(term16105, term17343));
    }

};


