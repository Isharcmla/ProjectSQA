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

public class Compiler_getInputsInOrder_1831505515290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997458;

    public Compiler_getInputsInOrder_1831505515290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997458 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term997458, term997458.getClass(), "options", null);
        setField(term997458, term997458.getClass(), "passes", null);
        setField(term997458, term997458.getClass(), "externs", null);
        setField(term997458, term997458.getClass(), "modules", null);
        setField(term997458, term997458.getClass(), "moduleGraph", null);
        setField(term997458, term997458.getClass(), "inputs", null);
        setField(term997458, term997458.getClass(), "errorManager", null);
        setField(term997458, term997458.getClass(), "warningsGuard", null);
        setField(term997458, term997458.getClass(), "injectedLibraries", null);
        setField(term997458, term997458.getClass(), "externsRoot", null);
        setField(term997458, term997458.getClass(), "jsRoot", null);
        setField(term997458, term997458.getClass(), "externAndJsRoot", null);
        setField(term997458, term997458.getClass(), "inputsById", null);
        setField(term997458, term997458.getClass(), "sourceMap", null);
        setField(term997458, term997458.getClass(), "externExports", null);
        setIntField(term997458, term997458.getClass(), "uniqueNameId", 0);
        setBooleanField(term997458, term997458.getClass(), "useThreads", false);
        setBooleanField(term997458, term997458.getClass(), "hasRegExpGlobalReferences", false);
        setField(term997458, term997458.getClass(), "functionInformationMap", null);
        setField(term997458, term997458.getClass(), "debugLog", null);
        setField(term997458, term997458.getClass(), "defaultCodingConvention", null);
        setField(term997458, term997458.getClass(), "typeRegistry", null);
        setField(term997458, term997458.getClass(), "parserConfig", null);
        setField(term997458, term997458.getClass(), "abstractInterpreter", null);
        setField(term997458, term997458.getClass(), "typeValidator", null);
        setField(term997458, term997458.getClass(), "tracker", null);
        setField(term997458, term997458.getClass(), "oldErrorReporter", null);
        setField(term997458, term997458.getClass(), "defaultErrorReporter", null);
        setField(term997458, term997458.getClass(), "outStream", null);
        setField(term997458, term997458.getClass(), "globalRefMap", null);
        setDoubleField(term997458, term997458.getClass(), "progress", 0.0);
        setField(term997458, term997458.getClass(), "sanityCheck", null);
        setField(term997458, term997458.getClass(), "currentTracer", null);
        setField(term997458, term997458.getClass(), "currentPassName", null);
        setIntField(term997458, term997458.getClass(), "syntheticCodeId", 0);
        setField(term997458, term997458.getClass(), "recentChange", null);
        setField(term997458, term997458.getClass(), "codeChangeHandlers", null);
        setField(term997458, term997458.getClass(), "synthesizedExternsInput", null);
        setField(term997458, term997458.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInputsInOrder", argTypes, term997458, args);
    }

};


