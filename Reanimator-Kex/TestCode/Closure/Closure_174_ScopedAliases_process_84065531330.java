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

public class ScopedAliases_process_84065531330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15343;
     Object term15585;
     Object term16766;
     Object term16769;

    public ScopedAliases_process_84065531330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15343 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term15423 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term15515 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term15515, term15515.getClass(), "inLoop", false);
        setField(term15423, term15423.getClass(), "phaseOptimizer", term15515);
        setField(term15343, term15343.getClass(), "compiler", term15423);
        term15585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15585, term15585.getClass(), "type", 0);
        setField(term15585, term15585.getClass(), "parent", null);
        setField(term15585, term15585.getClass(), "first", term15655);
        term16766 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term16767 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term16768 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(term16767, term16767.getClass(), "options", null);
        setField(term16767, term16767.getClass(), "passes", null);
        setField(term16767, term16767.getClass(), "externs", null);
        setField(term16767, term16767.getClass(), "modules", null);
        setField(term16767, term16767.getClass(), "moduleGraph", null);
        setField(term16767, term16767.getClass(), "inputs", null);
        setField(term16767, term16767.getClass(), "errorManager", null);
        setField(term16767, term16767.getClass(), "warningsGuard", null);
        setField(term16767, term16767.getClass(), "injectedLibraries", null);
        setField(term16767, term16767.getClass(), "externsRoot", null);
        setField(term16767, term16767.getClass(), "jsRoot", null);
        setField(term16767, term16767.getClass(), "externAndJsRoot", null);
        setField(term16767, term16767.getClass(), "inputsById", null);
        setField(term16767, term16767.getClass(), "sourceMap", null);
        setField(term16767, term16767.getClass(), "externExports", null);
        setIntField(term16767, term16767.getClass(), "uniqueNameId", 0);
        setBooleanField(term16767, term16767.getClass(), "hasRegExpGlobalReferences", false);
        setField(term16767, term16767.getClass(), "functionInformationMap", null);
        setField(term16767, term16767.getClass(), "debugLog", null);
        setField(term16767, term16767.getClass(), "defaultCodingConvention", null);
        setField(term16767, term16767.getClass(), "typeRegistry", null);
        setField(term16767, term16767.getClass(), "parserConfig", null);
        setField(term16767, term16767.getClass(), "abstractInterpreter", null);
        setField(term16767, term16767.getClass(), "typeValidator", null);
        setField(term16768, term16768.getClass(), "compiler", null);
        setField(term16768, term16768.getClass(), "tracker", null);
        setField(term16768, term16768.getClass(), "passes", null);
        setBooleanField(term16768, term16768.getClass(), "inLoop", false);
        setField(term16768, term16768.getClass(), "sanityCheck", null);
        setBooleanField(term16768, term16768.getClass(), "printAstHashcodes", false);
        setDoubleField(term16768, term16768.getClass(), "progress", 0.0);
        setDoubleField(term16768, term16768.getClass(), "progressStep", 0.0);
        setField(term16768, term16768.getClass(), "progressRange", null);
        setField(term16768, term16768.getClass(), "currentPass", null);
        setField(term16768, term16768.getClass(), "lastRuns", null);
        setField(term16768, term16768.getClass(), "currentScope", null);
        setIntField(term16768, term16768.getClass(), "timestamp", 0);
        setIntField(term16768, term16768.getClass(), "lastChange", 0);
        setField(term16768, term16768.getClass(), "jsRoot", null);
        setBooleanField(term16768, term16768.getClass(), "crossScopeReporting", false);
        setField(term16768, term16768.getClass(), "lastAst", null);
        setField(term16768, term16768.getClass(), "mtoc", null);
        setField(term16767, term16767.getClass(), "phaseOptimizer", term16768);
        setField(term16767, term16767.getClass(), "tracker", null);
        setField(term16767, term16767.getClass(), "oldErrorReporter", null);
        setField(term16767, term16767.getClass(), "defaultErrorReporter", null);
        setField(term16767, term16767.getClass(), "compilerThread", null);
        setBooleanField(term16767, term16767.getClass(), "useThreads", false);
        setField(term16767, term16767.getClass(), "outStream", null);
        setField(term16767, term16767.getClass(), "globalRefMap", null);
        setDoubleField(term16767, term16767.getClass(), "progress", 0.0);
        setField(term16767, term16767.getClass(), "lastPassName", null);
        setField(term16767, term16767.getClass(), "sanityCheck", null);
        setField(term16767, term16767.getClass(), "currentTracer", null);
        setField(term16767, term16767.getClass(), "currentPassName", null);
        setIntField(term16767, term16767.getClass(), "syntheticCodeId", 0);
        setField(term16767, term16767.getClass(), "recentChange", null);
        setField(term16767, term16767.getClass(), "codeChangeHandlers", null);
        setField(term16767, term16767.getClass(), "synthesizedExternsInput", null);
        setField(term16767, term16767.getClass(), "stage", null);
        setBooleanField(term16767, term16767.getClass(), "analyzeChangedScopesOnly", false);
        setField(term16766, term16766.getClass(), "compiler", term16767);
        setField(term16766, term16766.getClass(), "preprocessorSymbolTable", null);
        setField(term16766, term16766.getClass(), "transformationHandler", null);
        setField(term16766, term16766.getClass(), "scopedAliasNames", null);
        term16769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16769, term16769.getClass(), "type", 0);
        setField(term16769, term16769.getClass(), "next", null);
        setIntField(term16770, term16770.getClass(), "type", 0);
        setField(term16770, term16770.getClass(), "next", null);
        setField(term16770, term16770.getClass(), "first", null);
        setField(term16770, term16770.getClass(), "last", null);
        setField(term16770, term16770.getClass(), "propListHead", null);
        setIntField(term16770, term16770.getClass(), "sourcePosition", 0);
        setField(term16770, term16770.getClass(), "jsType", null);
        setField(term16770, term16770.getClass(), "parent", null);
        setField(term16769, term16769.getClass(), "first", term16770);
        setField(term16769, term16769.getClass(), "last", null);
        setField(term16769, term16769.getClass(), "propListHead", null);
        setIntField(term16769, term16769.getClass(), "sourcePosition", 0);
        setField(term16769, term16769.getClass(), "jsType", null);
        setField(term16769, term16769.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term15585;
        callMethod(klass, "process", argTypes, term15343, args);
        assertTrue(recursiveEquals(term15343, term16766));
        assertTrue(recursiveEquals(term15585, null));
    }

};


