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

public class ScopedAliases_process_8406553139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2050;
     Object term2200;
     Object term3326;
     Object term3328;

    public ScopedAliases_process_8406553139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2050 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term2130 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2050, term2050.getClass(), "compiler", term2130);
        term2200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2200, term2200.getClass(), "type", -133);
        setField(term2200, term2200.getClass(), "parent", null);
        term3326 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term3327 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term3327, term3327.getClass(), "options", null);
        setField(term3327, term3327.getClass(), "passes", null);
        setField(term3327, term3327.getClass(), "externs", null);
        setField(term3327, term3327.getClass(), "modules", null);
        setField(term3327, term3327.getClass(), "moduleGraph", null);
        setField(term3327, term3327.getClass(), "inputs", null);
        setField(term3327, term3327.getClass(), "errorManager", null);
        setField(term3327, term3327.getClass(), "warningsGuard", null);
        setField(term3327, term3327.getClass(), "injectedLibraries", null);
        setField(term3327, term3327.getClass(), "externsRoot", null);
        setField(term3327, term3327.getClass(), "jsRoot", null);
        setField(term3327, term3327.getClass(), "externAndJsRoot", null);
        setField(term3327, term3327.getClass(), "inputsById", null);
        setField(term3327, term3327.getClass(), "sourceMap", null);
        setField(term3327, term3327.getClass(), "externExports", null);
        setIntField(term3327, term3327.getClass(), "uniqueNameId", 0);
        setBooleanField(term3327, term3327.getClass(), "hasRegExpGlobalReferences", false);
        setField(term3327, term3327.getClass(), "functionInformationMap", null);
        setField(term3327, term3327.getClass(), "debugLog", null);
        setField(term3327, term3327.getClass(), "defaultCodingConvention", null);
        setField(term3327, term3327.getClass(), "typeRegistry", null);
        setField(term3327, term3327.getClass(), "parserConfig", null);
        setField(term3327, term3327.getClass(), "abstractInterpreter", null);
        setField(term3327, term3327.getClass(), "typeValidator", null);
        setField(term3327, term3327.getClass(), "phaseOptimizer", null);
        setField(term3327, term3327.getClass(), "tracker", null);
        setField(term3327, term3327.getClass(), "oldErrorReporter", null);
        setField(term3327, term3327.getClass(), "defaultErrorReporter", null);
        setField(term3327, term3327.getClass(), "compilerThread", null);
        setBooleanField(term3327, term3327.getClass(), "useThreads", false);
        setField(term3327, term3327.getClass(), "outStream", null);
        setField(term3327, term3327.getClass(), "globalRefMap", null);
        setDoubleField(term3327, term3327.getClass(), "progress", 0.0);
        setField(term3327, term3327.getClass(), "lastPassName", null);
        setField(term3327, term3327.getClass(), "sanityCheck", null);
        setField(term3327, term3327.getClass(), "currentTracer", null);
        setField(term3327, term3327.getClass(), "currentPassName", null);
        setIntField(term3327, term3327.getClass(), "syntheticCodeId", 0);
        setField(term3327, term3327.getClass(), "recentChange", null);
        setField(term3327, term3327.getClass(), "codeChangeHandlers", null);
        setField(term3327, term3327.getClass(), "synthesizedExternsInput", null);
        setField(term3327, term3327.getClass(), "stage", null);
        setBooleanField(term3327, term3327.getClass(), "analyzeChangedScopesOnly", false);
        setField(term3326, term3326.getClass(), "compiler", term3327);
        setField(term3326, term3326.getClass(), "preprocessorSymbolTable", null);
        setField(term3326, term3326.getClass(), "transformationHandler", null);
        setField(term3326, term3326.getClass(), "scopedAliasNames", null);
        term3328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3328, term3328.getClass(), "type", -133);
        setField(term3328, term3328.getClass(), "next", null);
        setField(term3328, term3328.getClass(), "first", null);
        setField(term3328, term3328.getClass(), "last", null);
        setField(term3328, term3328.getClass(), "propListHead", null);
        setIntField(term3328, term3328.getClass(), "sourcePosition", 0);
        setField(term3328, term3328.getClass(), "jsType", null);
        setField(term3328, term3328.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2200;
        callMethod(klass, "process", argTypes, term2050, args);
        assertTrue(recursiveEquals(term2050, term3326));
        assertTrue(recursiveEquals(term2200, null));
    }

};


