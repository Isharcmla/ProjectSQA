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

public class ScopedAliases_process_84065531322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11923;
     Object term12073;
     Object term13372;
     Object term13374;

    public ScopedAliases_process_84065531322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11923 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term12003 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term12003, term12003.getClass(), "phaseOptimizer", null);
        setField(term11923, term11923.getClass(), "compiler", term12003);
        term12073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12073, term12073.getClass(), "type", 0);
        setIntField(term12143, term12143.getClass(), "type", 0);
        setField(term12143, term12143.getClass(), "parent", null);
        setField(term12073, term12073.getClass(), "parent", term12143);
        setField(term12073, term12073.getClass(), "first", term12213);
        term13372 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term13373 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term13373, term13373.getClass(), "options", null);
        setField(term13373, term13373.getClass(), "passes", null);
        setField(term13373, term13373.getClass(), "externs", null);
        setField(term13373, term13373.getClass(), "modules", null);
        setField(term13373, term13373.getClass(), "moduleGraph", null);
        setField(term13373, term13373.getClass(), "inputs", null);
        setField(term13373, term13373.getClass(), "errorManager", null);
        setField(term13373, term13373.getClass(), "warningsGuard", null);
        setField(term13373, term13373.getClass(), "injectedLibraries", null);
        setField(term13373, term13373.getClass(), "externsRoot", null);
        setField(term13373, term13373.getClass(), "jsRoot", null);
        setField(term13373, term13373.getClass(), "externAndJsRoot", null);
        setField(term13373, term13373.getClass(), "inputsById", null);
        setField(term13373, term13373.getClass(), "sourceMap", null);
        setField(term13373, term13373.getClass(), "externExports", null);
        setIntField(term13373, term13373.getClass(), "uniqueNameId", 0);
        setIntField(term13373, term13373.getClass(), "timeout", 0);
        setBooleanField(term13373, term13373.getClass(), "hasRegExpGlobalReferences", false);
        setField(term13373, term13373.getClass(), "functionInformationMap", null);
        setField(term13373, term13373.getClass(), "debugLog", null);
        setField(term13373, term13373.getClass(), "defaultCodingConvention", null);
        setField(term13373, term13373.getClass(), "typeRegistry", null);
        setField(term13373, term13373.getClass(), "parserConfig", null);
        setField(term13373, term13373.getClass(), "abstractInterpreter", null);
        setField(term13373, term13373.getClass(), "typeValidator", null);
        setField(term13373, term13373.getClass(), "phaseOptimizer", null);
        setField(term13373, term13373.getClass(), "tracker", null);
        setField(term13373, term13373.getClass(), "oldErrorReporter", null);
        setField(term13373, term13373.getClass(), "defaultErrorReporter", null);
        setField(term13373, term13373.getClass(), "compilerThread", null);
        setBooleanField(term13373, term13373.getClass(), "useThreads", false);
        setField(term13373, term13373.getClass(), "outStream", null);
        setField(term13373, term13373.getClass(), "globalRefMap", null);
        setDoubleField(term13373, term13373.getClass(), "progress", 0.0);
        setField(term13373, term13373.getClass(), "lastPassName", null);
        setField(term13373, term13373.getClass(), "sanityCheck", null);
        setField(term13373, term13373.getClass(), "currentTracer", null);
        setField(term13373, term13373.getClass(), "currentPassName", null);
        setIntField(term13373, term13373.getClass(), "syntheticCodeId", 0);
        setField(term13373, term13373.getClass(), "recentChange", null);
        setField(term13373, term13373.getClass(), "codeChangeHandlers", null);
        setField(term13373, term13373.getClass(), "synthesizedExternsInput", null);
        setField(term13373, term13373.getClass(), "stage", null);
        setBooleanField(term13373, term13373.getClass(), "analyzeChangedScopesOnly", false);
        setField(term13372, term13372.getClass(), "compiler", term13373);
        setField(term13372, term13372.getClass(), "preprocessorSymbolTable", null);
        setField(term13372, term13372.getClass(), "transformationHandler", null);
        setField(term13372, term13372.getClass(), "scopedAliasNames", null);
        term13374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13374, term13374.getClass(), "type", 0);
        setField(term13374, term13374.getClass(), "next", null);
        setIntField(term13375, term13375.getClass(), "type", 0);
        setField(term13375, term13375.getClass(), "next", null);
        setField(term13375, term13375.getClass(), "first", null);
        setField(term13375, term13375.getClass(), "last", null);
        setField(term13375, term13375.getClass(), "propListHead", null);
        setIntField(term13375, term13375.getClass(), "sourcePosition", 0);
        setField(term13375, term13375.getClass(), "jsType", null);
        setField(term13375, term13375.getClass(), "parent", null);
        setField(term13374, term13374.getClass(), "first", term13375);
        setField(term13374, term13374.getClass(), "last", null);
        setField(term13374, term13374.getClass(), "propListHead", null);
        setIntField(term13374, term13374.getClass(), "sourcePosition", 0);
        setField(term13374, term13374.getClass(), "jsType", null);
        setIntField(term13376, term13376.getClass(), "type", 0);
        setField(term13376, term13376.getClass(), "next", null);
        setField(term13376, term13376.getClass(), "first", null);
        setField(term13376, term13376.getClass(), "last", null);
        setField(term13376, term13376.getClass(), "propListHead", null);
        setIntField(term13376, term13376.getClass(), "sourcePosition", 0);
        setField(term13376, term13376.getClass(), "jsType", null);
        setField(term13376, term13376.getClass(), "parent", null);
        setField(term13374, term13374.getClass(), "parent", term13376);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term12073;
        callMethod(klass, "process", argTypes, term11923, args);
        assertTrue(recursiveEquals(term11923, term13372));
        assertTrue(recursiveEquals(term12073, null));
    }

};


