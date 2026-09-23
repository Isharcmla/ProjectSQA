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

public class ScopedAliases_process_84065531312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3283;
     Object term3433;
     Object term5132;
     Object term5134;

    public ScopedAliases_process_84065531312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3283 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term3363 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term3283, term3283.getClass(), "compiler", term3363);
        term3433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3433, term3433.getClass(), "type", 132);
        term5132 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term5133 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term5133, term5133.getClass(), "options", null);
        setField(term5133, term5133.getClass(), "passes", null);
        setField(term5133, term5133.getClass(), "externs", null);
        setField(term5133, term5133.getClass(), "modules", null);
        setField(term5133, term5133.getClass(), "moduleGraph", null);
        setField(term5133, term5133.getClass(), "inputs", null);
        setField(term5133, term5133.getClass(), "errorManager", null);
        setField(term5133, term5133.getClass(), "warningsGuard", null);
        setField(term5133, term5133.getClass(), "injectedLibraries", null);
        setField(term5133, term5133.getClass(), "externsRoot", null);
        setField(term5133, term5133.getClass(), "jsRoot", null);
        setField(term5133, term5133.getClass(), "externAndJsRoot", null);
        setField(term5133, term5133.getClass(), "inputsById", null);
        setField(term5133, term5133.getClass(), "sourceMap", null);
        setField(term5133, term5133.getClass(), "externExports", null);
        setIntField(term5133, term5133.getClass(), "uniqueNameId", 0);
        setBooleanField(term5133, term5133.getClass(), "hasRegExpGlobalReferences", false);
        setField(term5133, term5133.getClass(), "functionInformationMap", null);
        setField(term5133, term5133.getClass(), "debugLog", null);
        setField(term5133, term5133.getClass(), "defaultCodingConvention", null);
        setField(term5133, term5133.getClass(), "typeRegistry", null);
        setField(term5133, term5133.getClass(), "parserConfig", null);
        setField(term5133, term5133.getClass(), "abstractInterpreter", null);
        setField(term5133, term5133.getClass(), "typeValidator", null);
        setField(term5133, term5133.getClass(), "phaseOptimizer", null);
        setField(term5133, term5133.getClass(), "tracker", null);
        setField(term5133, term5133.getClass(), "oldErrorReporter", null);
        setField(term5133, term5133.getClass(), "defaultErrorReporter", null);
        setField(term5133, term5133.getClass(), "compilerThread", null);
        setBooleanField(term5133, term5133.getClass(), "useThreads", false);
        setField(term5133, term5133.getClass(), "outStream", null);
        setField(term5133, term5133.getClass(), "globalRefMap", null);
        setDoubleField(term5133, term5133.getClass(), "progress", 0.0);
        setField(term5133, term5133.getClass(), "lastPassName", null);
        setField(term5133, term5133.getClass(), "sanityCheck", null);
        setField(term5133, term5133.getClass(), "currentTracer", null);
        setField(term5133, term5133.getClass(), "currentPassName", null);
        setIntField(term5133, term5133.getClass(), "syntheticCodeId", 0);
        setField(term5133, term5133.getClass(), "recentChange", null);
        setField(term5133, term5133.getClass(), "codeChangeHandlers", null);
        setField(term5133, term5133.getClass(), "synthesizedExternsInput", null);
        setField(term5133, term5133.getClass(), "stage", null);
        setBooleanField(term5133, term5133.getClass(), "analyzeChangedScopesOnly", false);
        setField(term5132, term5132.getClass(), "compiler", term5133);
        setField(term5132, term5132.getClass(), "preprocessorSymbolTable", null);
        setField(term5132, term5132.getClass(), "transformationHandler", null);
        setField(term5132, term5132.getClass(), "scopedAliasNames", null);
        term5134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5134, term5134.getClass(), "type", 132);
        setField(term5134, term5134.getClass(), "next", null);
        setField(term5134, term5134.getClass(), "first", null);
        setField(term5134, term5134.getClass(), "last", null);
        setField(term5134, term5134.getClass(), "propListHead", null);
        setIntField(term5134, term5134.getClass(), "sourcePosition", 0);
        setField(term5134, term5134.getClass(), "jsType", null);
        setField(term5134, term5134.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term3433;
        callMethod(klass, "process", argTypes, term3283, args);
        assertTrue(recursiveEquals(term3283, term5132));
        assertTrue(recursiveEquals(term3433, null));
    }

};


