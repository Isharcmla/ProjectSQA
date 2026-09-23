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

public class Compiler_getGlobalVarReferences_436107153300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997520;

    public Compiler_getGlobalVarReferences_436107153300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997520 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term997520, term997520.getClass(), "options", null);
        setField(term997520, term997520.getClass(), "passes", null);
        setField(term997520, term997520.getClass(), "externs", null);
        setField(term997520, term997520.getClass(), "modules", null);
        setField(term997520, term997520.getClass(), "moduleGraph", null);
        setField(term997520, term997520.getClass(), "inputs", null);
        setField(term997520, term997520.getClass(), "errorManager", null);
        setField(term997520, term997520.getClass(), "warningsGuard", null);
        setField(term997520, term997520.getClass(), "injectedLibraries", null);
        setField(term997520, term997520.getClass(), "externsRoot", null);
        setField(term997520, term997520.getClass(), "jsRoot", null);
        setField(term997520, term997520.getClass(), "externAndJsRoot", null);
        setField(term997520, term997520.getClass(), "inputsById", null);
        setField(term997520, term997520.getClass(), "sourceMap", null);
        setField(term997520, term997520.getClass(), "externExports", null);
        setIntField(term997520, term997520.getClass(), "uniqueNameId", 0);
        setBooleanField(term997520, term997520.getClass(), "useThreads", false);
        setBooleanField(term997520, term997520.getClass(), "hasRegExpGlobalReferences", false);
        setField(term997520, term997520.getClass(), "functionInformationMap", null);
        setField(term997520, term997520.getClass(), "debugLog", null);
        setField(term997520, term997520.getClass(), "defaultCodingConvention", null);
        setField(term997520, term997520.getClass(), "typeRegistry", null);
        setField(term997520, term997520.getClass(), "parserConfig", null);
        setField(term997520, term997520.getClass(), "abstractInterpreter", null);
        setField(term997520, term997520.getClass(), "typeValidator", null);
        setField(term997520, term997520.getClass(), "tracker", null);
        setField(term997520, term997520.getClass(), "oldErrorReporter", null);
        setField(term997520, term997520.getClass(), "defaultErrorReporter", null);
        setField(term997520, term997520.getClass(), "outStream", null);
        setField(term997520, term997520.getClass(), "globalRefMap", null);
        setDoubleField(term997520, term997520.getClass(), "progress", 0.0);
        setField(term997520, term997520.getClass(), "sanityCheck", null);
        setField(term997520, term997520.getClass(), "currentTracer", null);
        setField(term997520, term997520.getClass(), "currentPassName", null);
        setIntField(term997520, term997520.getClass(), "syntheticCodeId", 0);
        setField(term997520, term997520.getClass(), "recentChange", null);
        setField(term997520, term997520.getClass(), "codeChangeHandlers", null);
        setField(term997520, term997520.getClass(), "synthesizedExternsInput", null);
        setField(term997520, term997520.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGlobalVarReferences", argTypes, term997520, args);
    }

};


