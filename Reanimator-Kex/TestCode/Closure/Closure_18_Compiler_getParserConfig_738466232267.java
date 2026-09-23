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

public class Compiler_getParserConfig_738466232267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997316;

    public Compiler_getParserConfig_738466232267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997316 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term997316, term997316.getClass(), "options", null);
        setField(term997316, term997316.getClass(), "passes", null);
        setField(term997316, term997316.getClass(), "externs", null);
        setField(term997316, term997316.getClass(), "modules", null);
        setField(term997316, term997316.getClass(), "moduleGraph", null);
        setField(term997316, term997316.getClass(), "inputs", null);
        setField(term997316, term997316.getClass(), "errorManager", null);
        setField(term997316, term997316.getClass(), "warningsGuard", null);
        setField(term997316, term997316.getClass(), "injectedLibraries", null);
        setField(term997316, term997316.getClass(), "externsRoot", null);
        setField(term997316, term997316.getClass(), "jsRoot", null);
        setField(term997316, term997316.getClass(), "externAndJsRoot", null);
        setField(term997316, term997316.getClass(), "inputsById", null);
        setField(term997316, term997316.getClass(), "sourceMap", null);
        setField(term997316, term997316.getClass(), "externExports", null);
        setIntField(term997316, term997316.getClass(), "uniqueNameId", 0);
        setBooleanField(term997316, term997316.getClass(), "useThreads", false);
        setBooleanField(term997316, term997316.getClass(), "hasRegExpGlobalReferences", false);
        setField(term997316, term997316.getClass(), "functionInformationMap", null);
        setField(term997316, term997316.getClass(), "debugLog", null);
        setField(term997316, term997316.getClass(), "defaultCodingConvention", null);
        setField(term997316, term997316.getClass(), "typeRegistry", null);
        setField(term997316, term997316.getClass(), "parserConfig", null);
        setField(term997316, term997316.getClass(), "abstractInterpreter", null);
        setField(term997316, term997316.getClass(), "typeValidator", null);
        setField(term997316, term997316.getClass(), "tracker", null);
        setField(term997316, term997316.getClass(), "oldErrorReporter", null);
        setField(term997316, term997316.getClass(), "defaultErrorReporter", null);
        setField(term997316, term997316.getClass(), "outStream", null);
        setField(term997316, term997316.getClass(), "globalRefMap", null);
        setDoubleField(term997316, term997316.getClass(), "progress", 0.0);
        setField(term997316, term997316.getClass(), "sanityCheck", null);
        setField(term997316, term997316.getClass(), "currentTracer", null);
        setField(term997316, term997316.getClass(), "currentPassName", null);
        setIntField(term997316, term997316.getClass(), "syntheticCodeId", 0);
        setField(term997316, term997316.getClass(), "recentChange", null);
        setField(term997316, term997316.getClass(), "codeChangeHandlers", null);
        setField(term997316, term997316.getClass(), "synthesizedExternsInput", null);
        setField(term997316, term997316.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParserConfig", argTypes, term997316, args);
    }

};


