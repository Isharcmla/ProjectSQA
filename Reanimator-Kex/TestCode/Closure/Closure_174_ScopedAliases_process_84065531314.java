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

public class ScopedAliases_process_84065531314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5676;
     Object term5918;
     Object term6801;
     Object term6804;

    public ScopedAliases_process_84065531314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5676 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term5756 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term5848 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(term5756, term5756.getClass(), "phaseOptimizer", term5848);
        setField(term5676, term5676.getClass(), "compiler", term5756);
        term5918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5918, term5918.getClass(), "type", -133);
        setField(term5918, term5918.getClass(), "parent", null);
        term6801 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term6802 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term6803 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(term6802, term6802.getClass(), "options", null);
        setField(term6802, term6802.getClass(), "passes", null);
        setField(term6802, term6802.getClass(), "externs", null);
        setField(term6802, term6802.getClass(), "modules", null);
        setField(term6802, term6802.getClass(), "moduleGraph", null);
        setField(term6802, term6802.getClass(), "inputs", null);
        setField(term6802, term6802.getClass(), "errorManager", null);
        setField(term6802, term6802.getClass(), "warningsGuard", null);
        setField(term6802, term6802.getClass(), "injectedLibraries", null);
        setField(term6802, term6802.getClass(), "externsRoot", null);
        setField(term6802, term6802.getClass(), "jsRoot", null);
        setField(term6802, term6802.getClass(), "externAndJsRoot", null);
        setField(term6802, term6802.getClass(), "inputsById", null);
        setField(term6802, term6802.getClass(), "sourceMap", null);
        setField(term6802, term6802.getClass(), "externExports", null);
        setIntField(term6802, term6802.getClass(), "uniqueNameId", 0);
        setBooleanField(term6802, term6802.getClass(), "hasRegExpGlobalReferences", false);
        setField(term6802, term6802.getClass(), "functionInformationMap", null);
        setField(term6802, term6802.getClass(), "debugLog", null);
        setField(term6802, term6802.getClass(), "defaultCodingConvention", null);
        setField(term6802, term6802.getClass(), "typeRegistry", null);
        setField(term6802, term6802.getClass(), "parserConfig", null);
        setField(term6802, term6802.getClass(), "abstractInterpreter", null);
        setField(term6802, term6802.getClass(), "typeValidator", null);
        setField(term6803, term6803.getClass(), "compiler", null);
        setField(term6803, term6803.getClass(), "tracker", null);
        setField(term6803, term6803.getClass(), "passes", null);
        setBooleanField(term6803, term6803.getClass(), "inLoop", false);
        setField(term6803, term6803.getClass(), "sanityCheck", null);
        setBooleanField(term6803, term6803.getClass(), "printAstHashcodes", false);
        setDoubleField(term6803, term6803.getClass(), "progress", 0.0);
        setDoubleField(term6803, term6803.getClass(), "progressStep", 0.0);
        setField(term6803, term6803.getClass(), "progressRange", null);
        setField(term6803, term6803.getClass(), "currentPass", null);
        setField(term6803, term6803.getClass(), "lastRuns", null);
        setField(term6803, term6803.getClass(), "currentScope", null);
        setIntField(term6803, term6803.getClass(), "timestamp", 0);
        setIntField(term6803, term6803.getClass(), "lastChange", 0);
        setField(term6803, term6803.getClass(), "jsRoot", null);
        setBooleanField(term6803, term6803.getClass(), "crossScopeReporting", false);
        setField(term6803, term6803.getClass(), "lastAst", null);
        setField(term6803, term6803.getClass(), "mtoc", null);
        setField(term6802, term6802.getClass(), "phaseOptimizer", term6803);
        setField(term6802, term6802.getClass(), "tracker", null);
        setField(term6802, term6802.getClass(), "oldErrorReporter", null);
        setField(term6802, term6802.getClass(), "defaultErrorReporter", null);
        setField(term6802, term6802.getClass(), "compilerThread", null);
        setBooleanField(term6802, term6802.getClass(), "useThreads", false);
        setField(term6802, term6802.getClass(), "outStream", null);
        setField(term6802, term6802.getClass(), "globalRefMap", null);
        setDoubleField(term6802, term6802.getClass(), "progress", 0.0);
        setField(term6802, term6802.getClass(), "lastPassName", null);
        setField(term6802, term6802.getClass(), "sanityCheck", null);
        setField(term6802, term6802.getClass(), "currentTracer", null);
        setField(term6802, term6802.getClass(), "currentPassName", null);
        setIntField(term6802, term6802.getClass(), "syntheticCodeId", 0);
        setField(term6802, term6802.getClass(), "recentChange", null);
        setField(term6802, term6802.getClass(), "codeChangeHandlers", null);
        setField(term6802, term6802.getClass(), "synthesizedExternsInput", null);
        setField(term6802, term6802.getClass(), "stage", null);
        setBooleanField(term6802, term6802.getClass(), "analyzeChangedScopesOnly", false);
        setField(term6801, term6801.getClass(), "compiler", term6802);
        setField(term6801, term6801.getClass(), "preprocessorSymbolTable", null);
        setField(term6801, term6801.getClass(), "transformationHandler", null);
        setField(term6801, term6801.getClass(), "scopedAliasNames", null);
        term6804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6804, term6804.getClass(), "type", -133);
        setField(term6804, term6804.getClass(), "next", null);
        setField(term6804, term6804.getClass(), "first", null);
        setField(term6804, term6804.getClass(), "last", null);
        setField(term6804, term6804.getClass(), "propListHead", null);
        setIntField(term6804, term6804.getClass(), "sourcePosition", 0);
        setField(term6804, term6804.getClass(), "jsType", null);
        setField(term6804, term6804.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term5918;
        callMethod(klass, "process", argTypes, term5676, args);
        assertTrue(recursiveEquals(term5676, term6801));
        assertTrue(recursiveEquals(term5918, null));
    }

};


