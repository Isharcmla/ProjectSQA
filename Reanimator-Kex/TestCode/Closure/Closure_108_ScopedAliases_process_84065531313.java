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

public class ScopedAliases_process_84065531313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3873;
     Object term4023;
     Object term5329;
     Object term5331;

    public ScopedAliases_process_84065531313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3873 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term3953 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term3873, term3873.getClass(), "compiler", term3953);
        term4023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4023, term4023.getClass(), "type", -133);
        setField(term4023, term4023.getClass(), "parent", term4093);
        term5329 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term5330 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term5330, term5330.getClass(), "options", null);
        setField(term5330, term5330.getClass(), "passes", null);
        setField(term5330, term5330.getClass(), "externs", null);
        setField(term5330, term5330.getClass(), "modules", null);
        setField(term5330, term5330.getClass(), "moduleGraph", null);
        setField(term5330, term5330.getClass(), "inputs", null);
        setField(term5330, term5330.getClass(), "errorManager", null);
        setField(term5330, term5330.getClass(), "warningsGuard", null);
        setField(term5330, term5330.getClass(), "injectedLibraries", null);
        setField(term5330, term5330.getClass(), "externsRoot", null);
        setField(term5330, term5330.getClass(), "jsRoot", null);
        setField(term5330, term5330.getClass(), "externAndJsRoot", null);
        setField(term5330, term5330.getClass(), "inputsById", null);
        setField(term5330, term5330.getClass(), "sourceMap", null);
        setField(term5330, term5330.getClass(), "externExports", null);
        setIntField(term5330, term5330.getClass(), "uniqueNameId", 0);
        setIntField(term5330, term5330.getClass(), "timeout", 0);
        setBooleanField(term5330, term5330.getClass(), "hasRegExpGlobalReferences", false);
        setField(term5330, term5330.getClass(), "functionInformationMap", null);
        setField(term5330, term5330.getClass(), "debugLog", null);
        setField(term5330, term5330.getClass(), "defaultCodingConvention", null);
        setField(term5330, term5330.getClass(), "typeRegistry", null);
        setField(term5330, term5330.getClass(), "parserConfig", null);
        setField(term5330, term5330.getClass(), "abstractInterpreter", null);
        setField(term5330, term5330.getClass(), "typeValidator", null);
        setField(term5330, term5330.getClass(), "phaseOptimizer", null);
        setField(term5330, term5330.getClass(), "tracker", null);
        setField(term5330, term5330.getClass(), "oldErrorReporter", null);
        setField(term5330, term5330.getClass(), "defaultErrorReporter", null);
        setField(term5330, term5330.getClass(), "compilerThread", null);
        setBooleanField(term5330, term5330.getClass(), "useThreads", false);
        setField(term5330, term5330.getClass(), "outStream", null);
        setField(term5330, term5330.getClass(), "globalRefMap", null);
        setDoubleField(term5330, term5330.getClass(), "progress", 0.0);
        setField(term5330, term5330.getClass(), "lastPassName", null);
        setField(term5330, term5330.getClass(), "sanityCheck", null);
        setField(term5330, term5330.getClass(), "currentTracer", null);
        setField(term5330, term5330.getClass(), "currentPassName", null);
        setIntField(term5330, term5330.getClass(), "syntheticCodeId", 0);
        setField(term5330, term5330.getClass(), "recentChange", null);
        setField(term5330, term5330.getClass(), "codeChangeHandlers", null);
        setField(term5330, term5330.getClass(), "synthesizedExternsInput", null);
        setField(term5330, term5330.getClass(), "stage", null);
        setBooleanField(term5330, term5330.getClass(), "analyzeChangedScopesOnly", false);
        setField(term5329, term5329.getClass(), "compiler", term5330);
        setField(term5329, term5329.getClass(), "preprocessorSymbolTable", null);
        setField(term5329, term5329.getClass(), "transformationHandler", null);
        setField(term5329, term5329.getClass(), "scopedAliasNames", null);
        term5331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5331, term5331.getClass(), "type", -133);
        setField(term5331, term5331.getClass(), "next", null);
        setField(term5331, term5331.getClass(), "first", null);
        setField(term5331, term5331.getClass(), "last", null);
        setField(term5331, term5331.getClass(), "propListHead", null);
        setIntField(term5331, term5331.getClass(), "sourcePosition", 0);
        setField(term5331, term5331.getClass(), "jsType", null);
        setIntField(term5332, term5332.getClass(), "type", 0);
        setField(term5332, term5332.getClass(), "next", null);
        setField(term5332, term5332.getClass(), "first", null);
        setField(term5332, term5332.getClass(), "last", null);
        setField(term5332, term5332.getClass(), "propListHead", null);
        setIntField(term5332, term5332.getClass(), "sourcePosition", 0);
        setField(term5332, term5332.getClass(), "jsType", null);
        setField(term5332, term5332.getClass(), "parent", null);
        setField(term5331, term5331.getClass(), "parent", term5332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term4023;
        callMethod(klass, "process", argTypes, term3873, args);
        assertTrue(recursiveEquals(term3873, term5329));
        assertTrue(recursiveEquals(term4023, null));
    }

};


