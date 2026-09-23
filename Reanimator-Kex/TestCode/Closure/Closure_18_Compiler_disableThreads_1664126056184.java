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

public class Compiler_disableThreads_1664126056184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term996810;

    public Compiler_disableThreads_1664126056184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term996810 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term996810, term996810.getClass(), "options", null);
        setField(term996810, term996810.getClass(), "passes", null);
        setField(term996810, term996810.getClass(), "externs", null);
        setField(term996810, term996810.getClass(), "modules", null);
        setField(term996810, term996810.getClass(), "moduleGraph", null);
        setField(term996810, term996810.getClass(), "inputs", null);
        setField(term996810, term996810.getClass(), "errorManager", null);
        setField(term996810, term996810.getClass(), "warningsGuard", null);
        setField(term996810, term996810.getClass(), "injectedLibraries", null);
        setField(term996810, term996810.getClass(), "externsRoot", null);
        setField(term996810, term996810.getClass(), "jsRoot", null);
        setField(term996810, term996810.getClass(), "externAndJsRoot", null);
        setField(term996810, term996810.getClass(), "inputsById", null);
        setField(term996810, term996810.getClass(), "sourceMap", null);
        setField(term996810, term996810.getClass(), "externExports", null);
        setIntField(term996810, term996810.getClass(), "uniqueNameId", 0);
        setBooleanField(term996810, term996810.getClass(), "useThreads", false);
        setBooleanField(term996810, term996810.getClass(), "hasRegExpGlobalReferences", false);
        setField(term996810, term996810.getClass(), "functionInformationMap", null);
        setField(term996810, term996810.getClass(), "debugLog", null);
        setField(term996810, term996810.getClass(), "defaultCodingConvention", null);
        setField(term996810, term996810.getClass(), "typeRegistry", null);
        setField(term996810, term996810.getClass(), "parserConfig", null);
        setField(term996810, term996810.getClass(), "abstractInterpreter", null);
        setField(term996810, term996810.getClass(), "typeValidator", null);
        setField(term996810, term996810.getClass(), "tracker", null);
        setField(term996810, term996810.getClass(), "oldErrorReporter", null);
        setField(term996810, term996810.getClass(), "defaultErrorReporter", null);
        setField(term996810, term996810.getClass(), "outStream", null);
        setField(term996810, term996810.getClass(), "globalRefMap", null);
        setDoubleField(term996810, term996810.getClass(), "progress", 0.0);
        setField(term996810, term996810.getClass(), "sanityCheck", null);
        setField(term996810, term996810.getClass(), "currentTracer", null);
        setField(term996810, term996810.getClass(), "currentPassName", null);
        setIntField(term996810, term996810.getClass(), "syntheticCodeId", 0);
        setField(term996810, term996810.getClass(), "recentChange", null);
        setField(term996810, term996810.getClass(), "codeChangeHandlers", null);
        setField(term996810, term996810.getClass(), "synthesizedExternsInput", null);
        setField(term996810, term996810.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "disableThreads", argTypes, term996810, args);
    }

};


