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

public class ProcessCommonJSModules_process_62786604750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15448;
     Object term15620;
     Object term16381;
     Object term16383;

    public ProcessCommonJSModules_process_62786604750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15448 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term15528 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term15448, term15448.getClass(), "compiler", term15528);
        term15620 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term15620, term15620.getClass(), "type", 37);
        setField(term15620, term15620.getClass(), "parent", null);
        setField(term15620, term15620.getClass(), "first", null);
        term16381 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term16382 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term16382, term16382.getClass(), "options", null);
        setField(term16382, term16382.getClass(), "passes", null);
        setField(term16382, term16382.getClass(), "externs", null);
        setField(term16382, term16382.getClass(), "modules", null);
        setField(term16382, term16382.getClass(), "moduleGraph", null);
        setField(term16382, term16382.getClass(), "inputs", null);
        setField(term16382, term16382.getClass(), "errorManager", null);
        setField(term16382, term16382.getClass(), "warningsGuard", null);
        setField(term16382, term16382.getClass(), "injectedLibraries", null);
        setField(term16382, term16382.getClass(), "externsRoot", null);
        setField(term16382, term16382.getClass(), "jsRoot", null);
        setField(term16382, term16382.getClass(), "externAndJsRoot", null);
        setField(term16382, term16382.getClass(), "inputsById", null);
        setField(term16382, term16382.getClass(), "sourceMap", null);
        setField(term16382, term16382.getClass(), "externExports", null);
        setIntField(term16382, term16382.getClass(), "uniqueNameId", 0);
        setBooleanField(term16382, term16382.getClass(), "hasRegExpGlobalReferences", false);
        setField(term16382, term16382.getClass(), "functionInformationMap", null);
        setField(term16382, term16382.getClass(), "debugLog", null);
        setField(term16382, term16382.getClass(), "defaultCodingConvention", null);
        setField(term16382, term16382.getClass(), "typeRegistry", null);
        setField(term16382, term16382.getClass(), "parserConfig", null);
        setField(term16382, term16382.getClass(), "abstractInterpreter", null);
        setField(term16382, term16382.getClass(), "typeValidator", null);
        setField(term16382, term16382.getClass(), "tracker", null);
        setField(term16382, term16382.getClass(), "oldErrorReporter", null);
        setField(term16382, term16382.getClass(), "defaultErrorReporter", null);
        setField(term16382, term16382.getClass(), "compilerThread", null);
        setBooleanField(term16382, term16382.getClass(), "useThreads", false);
        setField(term16382, term16382.getClass(), "outStream", null);
        setField(term16382, term16382.getClass(), "globalRefMap", null);
        setDoubleField(term16382, term16382.getClass(), "progress", 0.0);
        setField(term16382, term16382.getClass(), "lastPassName", null);
        setField(term16382, term16382.getClass(), "sanityCheck", null);
        setField(term16382, term16382.getClass(), "currentTracer", null);
        setField(term16382, term16382.getClass(), "currentPassName", null);
        setIntField(term16382, term16382.getClass(), "syntheticCodeId", 0);
        setField(term16382, term16382.getClass(), "recentChange", null);
        setField(term16382, term16382.getClass(), "codeChangeHandlers", null);
        setField(term16382, term16382.getClass(), "synthesizedExternsInput", null);
        setField(term16382, term16382.getClass(), "stage", null);
        setField(term16381, term16381.getClass(), "compiler", term16382);
        setField(term16381, term16381.getClass(), "filenamePrefix", null);
        setBooleanField(term16381, term16381.getClass(), "reportDependencies", false);
        setField(term16381, term16381.getClass(), "module", null);
        term16383 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term16383, term16383.getClass(), "number", 0.0);
        setIntField(term16383, term16383.getClass(), "type", 37);
        setField(term16383, term16383.getClass(), "next", null);
        setField(term16383, term16383.getClass(), "first", null);
        setField(term16383, term16383.getClass(), "last", null);
        setField(term16383, term16383.getClass(), "propListHead", null);
        setIntField(term16383, term16383.getClass(), "sourcePosition", 0);
        setField(term16383, term16383.getClass(), "jsType", null);
        setField(term16383, term16383.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term15620;
        callMethod(klass, "process", argTypes, term15448, args);
        assertTrue(recursiveEquals(term15448, term16381));
        assertTrue(recursiveEquals(term15620, null));
    }

};


