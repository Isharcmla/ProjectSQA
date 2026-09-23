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

public class ScopedAliases_hotSwapScript_8834170927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15670;
     Object term15820;
     Object term17001;
     Object term17003;

    public ScopedAliases_hotSwapScript_8834170927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15670 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term15750 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term15750, term15750.getClass(), "phaseOptimizer", null);
        setField(term15670, term15670.getClass(), "compiler", term15750);
        term15820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15820, term15820.getClass(), "type", 0);
        setField(term15820, term15820.getClass(), "parent", null);
        setField(term15820, term15820.getClass(), "first", term15890);
        term17001 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term17002 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term17002, term17002.getClass(), "options", null);
        setField(term17002, term17002.getClass(), "passes", null);
        setField(term17002, term17002.getClass(), "externs", null);
        setField(term17002, term17002.getClass(), "modules", null);
        setField(term17002, term17002.getClass(), "moduleGraph", null);
        setField(term17002, term17002.getClass(), "inputs", null);
        setField(term17002, term17002.getClass(), "errorManager", null);
        setField(term17002, term17002.getClass(), "warningsGuard", null);
        setField(term17002, term17002.getClass(), "injectedLibraries", null);
        setField(term17002, term17002.getClass(), "externsRoot", null);
        setField(term17002, term17002.getClass(), "jsRoot", null);
        setField(term17002, term17002.getClass(), "externAndJsRoot", null);
        setField(term17002, term17002.getClass(), "inputsById", null);
        setField(term17002, term17002.getClass(), "sourceMap", null);
        setField(term17002, term17002.getClass(), "externExports", null);
        setIntField(term17002, term17002.getClass(), "uniqueNameId", 0);
        setBooleanField(term17002, term17002.getClass(), "hasRegExpGlobalReferences", false);
        setField(term17002, term17002.getClass(), "functionInformationMap", null);
        setField(term17002, term17002.getClass(), "debugLog", null);
        setField(term17002, term17002.getClass(), "defaultCodingConvention", null);
        setField(term17002, term17002.getClass(), "typeRegistry", null);
        setField(term17002, term17002.getClass(), "parserConfig", null);
        setField(term17002, term17002.getClass(), "abstractInterpreter", null);
        setField(term17002, term17002.getClass(), "typeValidator", null);
        setField(term17002, term17002.getClass(), "phaseOptimizer", null);
        setField(term17002, term17002.getClass(), "tracker", null);
        setField(term17002, term17002.getClass(), "oldErrorReporter", null);
        setField(term17002, term17002.getClass(), "defaultErrorReporter", null);
        setField(term17002, term17002.getClass(), "compilerThread", null);
        setBooleanField(term17002, term17002.getClass(), "useThreads", false);
        setField(term17002, term17002.getClass(), "outStream", null);
        setField(term17002, term17002.getClass(), "globalRefMap", null);
        setDoubleField(term17002, term17002.getClass(), "progress", 0.0);
        setField(term17002, term17002.getClass(), "lastPassName", null);
        setField(term17002, term17002.getClass(), "sanityCheck", null);
        setField(term17002, term17002.getClass(), "currentTracer", null);
        setField(term17002, term17002.getClass(), "currentPassName", null);
        setIntField(term17002, term17002.getClass(), "syntheticCodeId", 0);
        setField(term17002, term17002.getClass(), "recentChange", null);
        setField(term17002, term17002.getClass(), "codeChangeHandlers", null);
        setField(term17002, term17002.getClass(), "synthesizedExternsInput", null);
        setField(term17002, term17002.getClass(), "stage", null);
        setBooleanField(term17002, term17002.getClass(), "analyzeChangedScopesOnly", false);
        setField(term17001, term17001.getClass(), "compiler", term17002);
        setField(term17001, term17001.getClass(), "preprocessorSymbolTable", null);
        setField(term17001, term17001.getClass(), "transformationHandler", null);
        setField(term17001, term17001.getClass(), "scopedAliasNames", null);
        term17003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17003, term17003.getClass(), "type", 0);
        setField(term17003, term17003.getClass(), "next", null);
        setIntField(term17004, term17004.getClass(), "type", 0);
        setField(term17004, term17004.getClass(), "next", null);
        setField(term17004, term17004.getClass(), "first", null);
        setField(term17004, term17004.getClass(), "last", null);
        setField(term17004, term17004.getClass(), "propListHead", null);
        setIntField(term17004, term17004.getClass(), "sourcePosition", 0);
        setField(term17004, term17004.getClass(), "jsType", null);
        setField(term17004, term17004.getClass(), "parent", null);
        setField(term17003, term17003.getClass(), "first", term17004);
        setField(term17003, term17003.getClass(), "last", null);
        setField(term17003, term17003.getClass(), "propListHead", null);
        setIntField(term17003, term17003.getClass(), "sourcePosition", 0);
        setField(term17003, term17003.getClass(), "jsType", null);
        setField(term17003, term17003.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term15820;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term15670, args);
        assertTrue(recursiveEquals(term15670, term17001));
        assertTrue(recursiveEquals(term15820, term17003));
    }

};


