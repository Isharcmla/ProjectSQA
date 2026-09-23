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

public class ScopedAliases_process_84065531323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11422;
     Object term11686;
     Object term12222;
     Object term12225;

    public ScopedAliases_process_84065531323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11422 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term11502 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term11594 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term11594, term11594.getClass(), "inLoop", false);
        setField(term11502, term11502.getClass(), "phaseOptimizer", term11594);
        setField(term11422, term11422.getClass(), "compiler", term11502);
        term11686 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term11686, term11686.getClass(), "type", -133);
        setField(term11686, term11686.getClass(), "parent", null);
        term12222 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term12223 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term12224 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(term12223, term12223.getClass(), "options", null);
        setField(term12223, term12223.getClass(), "passes", null);
        setField(term12223, term12223.getClass(), "externs", null);
        setField(term12223, term12223.getClass(), "modules", null);
        setField(term12223, term12223.getClass(), "moduleGraph", null);
        setField(term12223, term12223.getClass(), "inputs", null);
        setField(term12223, term12223.getClass(), "errorManager", null);
        setField(term12223, term12223.getClass(), "warningsGuard", null);
        setField(term12223, term12223.getClass(), "injectedLibraries", null);
        setField(term12223, term12223.getClass(), "externsRoot", null);
        setField(term12223, term12223.getClass(), "jsRoot", null);
        setField(term12223, term12223.getClass(), "externAndJsRoot", null);
        setField(term12223, term12223.getClass(), "inputsById", null);
        setField(term12223, term12223.getClass(), "sourceMap", null);
        setField(term12223, term12223.getClass(), "externExports", null);
        setIntField(term12223, term12223.getClass(), "uniqueNameId", 0);
        setBooleanField(term12223, term12223.getClass(), "hasRegExpGlobalReferences", false);
        setField(term12223, term12223.getClass(), "functionInformationMap", null);
        setField(term12223, term12223.getClass(), "debugLog", null);
        setField(term12223, term12223.getClass(), "defaultCodingConvention", null);
        setField(term12223, term12223.getClass(), "typeRegistry", null);
        setField(term12223, term12223.getClass(), "parserConfig", null);
        setField(term12223, term12223.getClass(), "abstractInterpreter", null);
        setField(term12223, term12223.getClass(), "typeValidator", null);
        setField(term12224, term12224.getClass(), "compiler", null);
        setField(term12224, term12224.getClass(), "tracker", null);
        setField(term12224, term12224.getClass(), "passes", null);
        setBooleanField(term12224, term12224.getClass(), "inLoop", false);
        setField(term12224, term12224.getClass(), "sanityCheck", null);
        setBooleanField(term12224, term12224.getClass(), "printAstHashcodes", false);
        setDoubleField(term12224, term12224.getClass(), "progress", 0.0);
        setDoubleField(term12224, term12224.getClass(), "progressStep", 0.0);
        setField(term12224, term12224.getClass(), "progressRange", null);
        setField(term12224, term12224.getClass(), "currentPass", null);
        setField(term12224, term12224.getClass(), "lastRuns", null);
        setField(term12224, term12224.getClass(), "currentScope", null);
        setIntField(term12224, term12224.getClass(), "timestamp", 0);
        setIntField(term12224, term12224.getClass(), "lastChange", 0);
        setField(term12224, term12224.getClass(), "jsRoot", null);
        setBooleanField(term12224, term12224.getClass(), "crossScopeReporting", false);
        setField(term12224, term12224.getClass(), "lastAst", null);
        setField(term12224, term12224.getClass(), "mtoc", null);
        setField(term12223, term12223.getClass(), "phaseOptimizer", term12224);
        setField(term12223, term12223.getClass(), "tracker", null);
        setField(term12223, term12223.getClass(), "oldErrorReporter", null);
        setField(term12223, term12223.getClass(), "defaultErrorReporter", null);
        setField(term12223, term12223.getClass(), "compilerThread", null);
        setBooleanField(term12223, term12223.getClass(), "useThreads", false);
        setField(term12223, term12223.getClass(), "outStream", null);
        setField(term12223, term12223.getClass(), "globalRefMap", null);
        setDoubleField(term12223, term12223.getClass(), "progress", 0.0);
        setField(term12223, term12223.getClass(), "lastPassName", null);
        setField(term12223, term12223.getClass(), "sanityCheck", null);
        setField(term12223, term12223.getClass(), "currentTracer", null);
        setField(term12223, term12223.getClass(), "currentPassName", null);
        setIntField(term12223, term12223.getClass(), "syntheticCodeId", 0);
        setField(term12223, term12223.getClass(), "recentChange", null);
        setField(term12223, term12223.getClass(), "codeChangeHandlers", null);
        setField(term12223, term12223.getClass(), "synthesizedExternsInput", null);
        setField(term12223, term12223.getClass(), "stage", null);
        setBooleanField(term12223, term12223.getClass(), "analyzeChangedScopesOnly", false);
        setField(term12222, term12222.getClass(), "compiler", term12223);
        setField(term12222, term12222.getClass(), "preprocessorSymbolTable", null);
        setField(term12222, term12222.getClass(), "transformationHandler", null);
        setField(term12222, term12222.getClass(), "scopedAliasNames", null);
        term12225 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term12225, term12225.getClass(), "number", 0.0);
        setIntField(term12225, term12225.getClass(), "type", -133);
        setField(term12225, term12225.getClass(), "next", null);
        setField(term12225, term12225.getClass(), "first", null);
        setField(term12225, term12225.getClass(), "last", null);
        setField(term12225, term12225.getClass(), "propListHead", null);
        setIntField(term12225, term12225.getClass(), "sourcePosition", 0);
        setField(term12225, term12225.getClass(), "jsType", null);
        setField(term12225, term12225.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term11686;
        callMethod(klass, "process", argTypes, term11422, args);
        assertTrue(recursiveEquals(term11422, term12222));
        assertTrue(recursiveEquals(term11686, null));
    }

};


