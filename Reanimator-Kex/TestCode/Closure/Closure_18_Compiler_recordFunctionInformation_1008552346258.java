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

public class Compiler_recordFunctionInformation_1008552346258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997262;

    public Compiler_recordFunctionInformation_1008552346258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997262 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term997262, term997262.getClass(), "options", null);
        setField(term997262, term997262.getClass(), "passes", null);
        setField(term997262, term997262.getClass(), "externs", null);
        setField(term997262, term997262.getClass(), "modules", null);
        setField(term997262, term997262.getClass(), "moduleGraph", null);
        setField(term997262, term997262.getClass(), "inputs", null);
        setField(term997262, term997262.getClass(), "errorManager", null);
        setField(term997262, term997262.getClass(), "warningsGuard", null);
        setField(term997262, term997262.getClass(), "injectedLibraries", null);
        setField(term997262, term997262.getClass(), "externsRoot", null);
        setField(term997262, term997262.getClass(), "jsRoot", null);
        setField(term997262, term997262.getClass(), "externAndJsRoot", null);
        setField(term997262, term997262.getClass(), "inputsById", null);
        setField(term997262, term997262.getClass(), "sourceMap", null);
        setField(term997262, term997262.getClass(), "externExports", null);
        setIntField(term997262, term997262.getClass(), "uniqueNameId", 0);
        setBooleanField(term997262, term997262.getClass(), "useThreads", false);
        setBooleanField(term997262, term997262.getClass(), "hasRegExpGlobalReferences", false);
        setField(term997262, term997262.getClass(), "functionInformationMap", null);
        setField(term997262, term997262.getClass(), "debugLog", null);
        setField(term997262, term997262.getClass(), "defaultCodingConvention", null);
        setField(term997262, term997262.getClass(), "typeRegistry", null);
        setField(term997262, term997262.getClass(), "parserConfig", null);
        setField(term997262, term997262.getClass(), "abstractInterpreter", null);
        setField(term997262, term997262.getClass(), "typeValidator", null);
        setField(term997262, term997262.getClass(), "tracker", null);
        setField(term997262, term997262.getClass(), "oldErrorReporter", null);
        setField(term997262, term997262.getClass(), "defaultErrorReporter", null);
        setField(term997262, term997262.getClass(), "outStream", null);
        setField(term997262, term997262.getClass(), "globalRefMap", null);
        setDoubleField(term997262, term997262.getClass(), "progress", 0.0);
        setField(term997262, term997262.getClass(), "sanityCheck", null);
        setField(term997262, term997262.getClass(), "currentTracer", null);
        setField(term997262, term997262.getClass(), "currentPassName", null);
        setIntField(term997262, term997262.getClass(), "syntheticCodeId", 0);
        setField(term997262, term997262.getClass(), "recentChange", null);
        setField(term997262, term997262.getClass(), "codeChangeHandlers", null);
        setField(term997262, term997262.getClass(), "synthesizedExternsInput", null);
        setField(term997262, term997262.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "recordFunctionInformation", argTypes, term997262, args);
    }

};


