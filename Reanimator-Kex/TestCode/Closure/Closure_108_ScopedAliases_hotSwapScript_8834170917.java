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

public class ScopedAliases_hotSwapScript_8834170917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8586;
     Object term8828;
     Object term9383;
     Object term9386;

    public ScopedAliases_hotSwapScript_8834170917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8586 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term8666 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term8758 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(term8666, term8666.getClass(), "phaseOptimizer", term8758);
        setField(term8586, term8586.getClass(), "compiler", term8666);
        term8828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8828, term8828.getClass(), "type", -133);
        setField(term8828, term8828.getClass(), "parent", null);
        term9383 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term9384 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term9385 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(term9384, term9384.getClass(), "options", null);
        setField(term9384, term9384.getClass(), "passes", null);
        setField(term9384, term9384.getClass(), "externs", null);
        setField(term9384, term9384.getClass(), "modules", null);
        setField(term9384, term9384.getClass(), "moduleGraph", null);
        setField(term9384, term9384.getClass(), "inputs", null);
        setField(term9384, term9384.getClass(), "errorManager", null);
        setField(term9384, term9384.getClass(), "warningsGuard", null);
        setField(term9384, term9384.getClass(), "injectedLibraries", null);
        setField(term9384, term9384.getClass(), "externsRoot", null);
        setField(term9384, term9384.getClass(), "jsRoot", null);
        setField(term9384, term9384.getClass(), "externAndJsRoot", null);
        setField(term9384, term9384.getClass(), "inputsById", null);
        setField(term9384, term9384.getClass(), "sourceMap", null);
        setField(term9384, term9384.getClass(), "externExports", null);
        setIntField(term9384, term9384.getClass(), "uniqueNameId", 0);
        setIntField(term9384, term9384.getClass(), "timeout", 0);
        setBooleanField(term9384, term9384.getClass(), "hasRegExpGlobalReferences", false);
        setField(term9384, term9384.getClass(), "functionInformationMap", null);
        setField(term9384, term9384.getClass(), "debugLog", null);
        setField(term9384, term9384.getClass(), "defaultCodingConvention", null);
        setField(term9384, term9384.getClass(), "typeRegistry", null);
        setField(term9384, term9384.getClass(), "parserConfig", null);
        setField(term9384, term9384.getClass(), "abstractInterpreter", null);
        setField(term9384, term9384.getClass(), "typeValidator", null);
        setField(term9385, term9385.getClass(), "compiler", null);
        setField(term9385, term9385.getClass(), "tracker", null);
        setField(term9385, term9385.getClass(), "passes", null);
        setBooleanField(term9385, term9385.getClass(), "inLoop", false);
        setField(term9385, term9385.getClass(), "sanityCheck", null);
        setBooleanField(term9385, term9385.getClass(), "printAstHashcodes", false);
        setDoubleField(term9385, term9385.getClass(), "progress", 0.0);
        setDoubleField(term9385, term9385.getClass(), "progressStep", 0.0);
        setField(term9385, term9385.getClass(), "progressRange", null);
        setField(term9385, term9385.getClass(), "currentPass", null);
        setField(term9385, term9385.getClass(), "lastRuns", null);
        setField(term9385, term9385.getClass(), "currentScope", null);
        setIntField(term9385, term9385.getClass(), "timestamp", 0);
        setIntField(term9385, term9385.getClass(), "lastChange", 0);
        setField(term9385, term9385.getClass(), "jsRoot", null);
        setBooleanField(term9385, term9385.getClass(), "crossScopeReporting", false);
        setField(term9385, term9385.getClass(), "lastAst", null);
        setField(term9385, term9385.getClass(), "mtoc", null);
        setField(term9384, term9384.getClass(), "phaseOptimizer", term9385);
        setField(term9384, term9384.getClass(), "tracker", null);
        setField(term9384, term9384.getClass(), "oldErrorReporter", null);
        setField(term9384, term9384.getClass(), "defaultErrorReporter", null);
        setField(term9384, term9384.getClass(), "compilerThread", null);
        setBooleanField(term9384, term9384.getClass(), "useThreads", false);
        setField(term9384, term9384.getClass(), "outStream", null);
        setField(term9384, term9384.getClass(), "globalRefMap", null);
        setDoubleField(term9384, term9384.getClass(), "progress", 0.0);
        setField(term9384, term9384.getClass(), "lastPassName", null);
        setField(term9384, term9384.getClass(), "sanityCheck", null);
        setField(term9384, term9384.getClass(), "currentTracer", null);
        setField(term9384, term9384.getClass(), "currentPassName", null);
        setIntField(term9384, term9384.getClass(), "syntheticCodeId", 0);
        setField(term9384, term9384.getClass(), "recentChange", null);
        setField(term9384, term9384.getClass(), "codeChangeHandlers", null);
        setField(term9384, term9384.getClass(), "synthesizedExternsInput", null);
        setField(term9384, term9384.getClass(), "stage", null);
        setBooleanField(term9384, term9384.getClass(), "analyzeChangedScopesOnly", false);
        setField(term9383, term9383.getClass(), "compiler", term9384);
        setField(term9383, term9383.getClass(), "preprocessorSymbolTable", null);
        setField(term9383, term9383.getClass(), "transformationHandler", null);
        setField(term9383, term9383.getClass(), "scopedAliasNames", null);
        term9386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9386, term9386.getClass(), "type", -133);
        setField(term9386, term9386.getClass(), "next", null);
        setField(term9386, term9386.getClass(), "first", null);
        setField(term9386, term9386.getClass(), "last", null);
        setField(term9386, term9386.getClass(), "propListHead", null);
        setIntField(term9386, term9386.getClass(), "sourcePosition", 0);
        setField(term9386, term9386.getClass(), "jsType", null);
        setField(term9386, term9386.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term8828;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term8586, args);
        assertTrue(recursiveEquals(term8586, term9383));
        assertTrue(recursiveEquals(term8828, term9386));
    }

};


