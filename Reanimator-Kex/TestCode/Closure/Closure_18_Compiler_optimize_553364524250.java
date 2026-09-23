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

public class Compiler_optimize_553364524250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997214;

    public Compiler_optimize_553364524250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997214 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term997214, term997214.getClass(), "options", null);
        setField(term997214, term997214.getClass(), "passes", null);
        setField(term997214, term997214.getClass(), "externs", null);
        setField(term997214, term997214.getClass(), "modules", null);
        setField(term997214, term997214.getClass(), "moduleGraph", null);
        setField(term997214, term997214.getClass(), "inputs", null);
        setField(term997214, term997214.getClass(), "errorManager", null);
        setField(term997214, term997214.getClass(), "warningsGuard", null);
        setField(term997214, term997214.getClass(), "injectedLibraries", null);
        setField(term997214, term997214.getClass(), "externsRoot", null);
        setField(term997214, term997214.getClass(), "jsRoot", null);
        setField(term997214, term997214.getClass(), "externAndJsRoot", null);
        setField(term997214, term997214.getClass(), "inputsById", null);
        setField(term997214, term997214.getClass(), "sourceMap", null);
        setField(term997214, term997214.getClass(), "externExports", null);
        setIntField(term997214, term997214.getClass(), "uniqueNameId", 0);
        setBooleanField(term997214, term997214.getClass(), "useThreads", false);
        setBooleanField(term997214, term997214.getClass(), "hasRegExpGlobalReferences", false);
        setField(term997214, term997214.getClass(), "functionInformationMap", null);
        setField(term997214, term997214.getClass(), "debugLog", null);
        setField(term997214, term997214.getClass(), "defaultCodingConvention", null);
        setField(term997214, term997214.getClass(), "typeRegistry", null);
        setField(term997214, term997214.getClass(), "parserConfig", null);
        setField(term997214, term997214.getClass(), "abstractInterpreter", null);
        setField(term997214, term997214.getClass(), "typeValidator", null);
        setField(term997214, term997214.getClass(), "tracker", null);
        setField(term997214, term997214.getClass(), "oldErrorReporter", null);
        setField(term997214, term997214.getClass(), "defaultErrorReporter", null);
        setField(term997214, term997214.getClass(), "outStream", null);
        setField(term997214, term997214.getClass(), "globalRefMap", null);
        setDoubleField(term997214, term997214.getClass(), "progress", 0.0);
        setField(term997214, term997214.getClass(), "sanityCheck", null);
        setField(term997214, term997214.getClass(), "currentTracer", null);
        setField(term997214, term997214.getClass(), "currentPassName", null);
        setIntField(term997214, term997214.getClass(), "syntheticCodeId", 0);
        setField(term997214, term997214.getClass(), "recentChange", null);
        setField(term997214, term997214.getClass(), "codeChangeHandlers", null);
        setField(term997214, term997214.getClass(), "synthesizedExternsInput", null);
        setField(term997214, term997214.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "optimize", argTypes, term997214, args);
    }

};


