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

public class Compiler_ensureLibraryInjected_444226052311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997588;

    public Compiler_ensureLibraryInjected_444226052311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997588 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term997588, term997588.getClass(), "options", null);
        setField(term997588, term997588.getClass(), "passes", null);
        setField(term997588, term997588.getClass(), "externs", null);
        setField(term997588, term997588.getClass(), "modules", null);
        setField(term997588, term997588.getClass(), "moduleGraph", null);
        setField(term997588, term997588.getClass(), "inputs", null);
        setField(term997588, term997588.getClass(), "errorManager", null);
        setField(term997588, term997588.getClass(), "warningsGuard", null);
        setField(term997588, term997588.getClass(), "injectedLibraries", null);
        setField(term997588, term997588.getClass(), "externsRoot", null);
        setField(term997588, term997588.getClass(), "jsRoot", null);
        setField(term997588, term997588.getClass(), "externAndJsRoot", null);
        setField(term997588, term997588.getClass(), "inputsById", null);
        setField(term997588, term997588.getClass(), "sourceMap", null);
        setField(term997588, term997588.getClass(), "externExports", null);
        setIntField(term997588, term997588.getClass(), "uniqueNameId", 0);
        setBooleanField(term997588, term997588.getClass(), "useThreads", false);
        setBooleanField(term997588, term997588.getClass(), "hasRegExpGlobalReferences", false);
        setField(term997588, term997588.getClass(), "functionInformationMap", null);
        setField(term997588, term997588.getClass(), "debugLog", null);
        setField(term997588, term997588.getClass(), "defaultCodingConvention", null);
        setField(term997588, term997588.getClass(), "typeRegistry", null);
        setField(term997588, term997588.getClass(), "parserConfig", null);
        setField(term997588, term997588.getClass(), "abstractInterpreter", null);
        setField(term997588, term997588.getClass(), "typeValidator", null);
        setField(term997588, term997588.getClass(), "tracker", null);
        setField(term997588, term997588.getClass(), "oldErrorReporter", null);
        setField(term997588, term997588.getClass(), "defaultErrorReporter", null);
        setField(term997588, term997588.getClass(), "outStream", null);
        setField(term997588, term997588.getClass(), "globalRefMap", null);
        setDoubleField(term997588, term997588.getClass(), "progress", 0.0);
        setField(term997588, term997588.getClass(), "sanityCheck", null);
        setField(term997588, term997588.getClass(), "currentTracer", null);
        setField(term997588, term997588.getClass(), "currentPassName", null);
        setIntField(term997588, term997588.getClass(), "syntheticCodeId", 0);
        setField(term997588, term997588.getClass(), "recentChange", null);
        setField(term997588, term997588.getClass(), "codeChangeHandlers", null);
        setField(term997588, term997588.getClass(), "synthesizedExternsInput", null);
        setField(term997588, term997588.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "ensureLibraryInjected", argTypes, term997588, args);
    }

};


