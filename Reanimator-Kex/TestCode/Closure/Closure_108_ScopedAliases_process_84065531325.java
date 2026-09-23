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

public class ScopedAliases_process_84065531325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15774;
     Object term15924;
     Object term16437;
     Object term16439;

    public ScopedAliases_process_84065531325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15774 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term15854 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term15854, term15854.getClass(), "phaseOptimizer", null);
        setField(term15774, term15774.getClass(), "compiler", term15854);
        term15924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15924, term15924.getClass(), "type", 105);
        setIntField(term15994, term15994.getClass(), "type", 0);
        setField(term15994, term15994.getClass(), "parent", null);
        setField(term15924, term15924.getClass(), "parent", term15994);
        term16437 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term16438 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term16438, term16438.getClass(), "options", null);
        setField(term16438, term16438.getClass(), "passes", null);
        setField(term16438, term16438.getClass(), "externs", null);
        setField(term16438, term16438.getClass(), "modules", null);
        setField(term16438, term16438.getClass(), "moduleGraph", null);
        setField(term16438, term16438.getClass(), "inputs", null);
        setField(term16438, term16438.getClass(), "errorManager", null);
        setField(term16438, term16438.getClass(), "warningsGuard", null);
        setField(term16438, term16438.getClass(), "injectedLibraries", null);
        setField(term16438, term16438.getClass(), "externsRoot", null);
        setField(term16438, term16438.getClass(), "jsRoot", null);
        setField(term16438, term16438.getClass(), "externAndJsRoot", null);
        setField(term16438, term16438.getClass(), "inputsById", null);
        setField(term16438, term16438.getClass(), "sourceMap", null);
        setField(term16438, term16438.getClass(), "externExports", null);
        setIntField(term16438, term16438.getClass(), "uniqueNameId", 0);
        setIntField(term16438, term16438.getClass(), "timeout", 0);
        setBooleanField(term16438, term16438.getClass(), "hasRegExpGlobalReferences", false);
        setField(term16438, term16438.getClass(), "functionInformationMap", null);
        setField(term16438, term16438.getClass(), "debugLog", null);
        setField(term16438, term16438.getClass(), "defaultCodingConvention", null);
        setField(term16438, term16438.getClass(), "typeRegistry", null);
        setField(term16438, term16438.getClass(), "parserConfig", null);
        setField(term16438, term16438.getClass(), "abstractInterpreter", null);
        setField(term16438, term16438.getClass(), "typeValidator", null);
        setField(term16438, term16438.getClass(), "phaseOptimizer", null);
        setField(term16438, term16438.getClass(), "tracker", null);
        setField(term16438, term16438.getClass(), "oldErrorReporter", null);
        setField(term16438, term16438.getClass(), "defaultErrorReporter", null);
        setField(term16438, term16438.getClass(), "compilerThread", null);
        setBooleanField(term16438, term16438.getClass(), "useThreads", false);
        setField(term16438, term16438.getClass(), "outStream", null);
        setField(term16438, term16438.getClass(), "globalRefMap", null);
        setDoubleField(term16438, term16438.getClass(), "progress", 0.0);
        setField(term16438, term16438.getClass(), "lastPassName", null);
        setField(term16438, term16438.getClass(), "sanityCheck", null);
        setField(term16438, term16438.getClass(), "currentTracer", null);
        setField(term16438, term16438.getClass(), "currentPassName", null);
        setIntField(term16438, term16438.getClass(), "syntheticCodeId", 0);
        setField(term16438, term16438.getClass(), "recentChange", null);
        setField(term16438, term16438.getClass(), "codeChangeHandlers", null);
        setField(term16438, term16438.getClass(), "synthesizedExternsInput", null);
        setField(term16438, term16438.getClass(), "stage", null);
        setBooleanField(term16438, term16438.getClass(), "analyzeChangedScopesOnly", false);
        setField(term16437, term16437.getClass(), "compiler", term16438);
        setField(term16437, term16437.getClass(), "preprocessorSymbolTable", null);
        setField(term16437, term16437.getClass(), "transformationHandler", null);
        setField(term16437, term16437.getClass(), "scopedAliasNames", null);
        term16439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16439, term16439.getClass(), "type", 105);
        setField(term16439, term16439.getClass(), "next", null);
        setField(term16439, term16439.getClass(), "first", null);
        setField(term16439, term16439.getClass(), "last", null);
        setField(term16439, term16439.getClass(), "propListHead", null);
        setIntField(term16439, term16439.getClass(), "sourcePosition", 0);
        setField(term16439, term16439.getClass(), "jsType", null);
        setIntField(term16440, term16440.getClass(), "type", 0);
        setField(term16440, term16440.getClass(), "next", null);
        setField(term16440, term16440.getClass(), "first", null);
        setField(term16440, term16440.getClass(), "last", null);
        setField(term16440, term16440.getClass(), "propListHead", null);
        setIntField(term16440, term16440.getClass(), "sourcePosition", 0);
        setField(term16440, term16440.getClass(), "jsType", null);
        setField(term16440, term16440.getClass(), "parent", null);
        setField(term16439, term16439.getClass(), "parent", term16440);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term15924;
        callMethod(klass, "process", argTypes, term15774, args);
        assertTrue(recursiveEquals(term15774, term16437));
        assertTrue(recursiveEquals(term15924, null));
    }

};


