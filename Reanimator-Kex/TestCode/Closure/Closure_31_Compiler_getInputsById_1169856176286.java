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

public class Compiler_getInputsById_1169856176286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890501;

    public Compiler_getInputsById_1169856176286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890501 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890501, term890501.getClass(), "options", null);
        setField(term890501, term890501.getClass(), "passes", null);
        setField(term890501, term890501.getClass(), "externs", null);
        setField(term890501, term890501.getClass(), "modules", null);
        setField(term890501, term890501.getClass(), "moduleGraph", null);
        setField(term890501, term890501.getClass(), "inputs", null);
        setField(term890501, term890501.getClass(), "errorManager", null);
        setField(term890501, term890501.getClass(), "warningsGuard", null);
        setField(term890501, term890501.getClass(), "injectedLibraries", null);
        setField(term890501, term890501.getClass(), "externsRoot", null);
        setField(term890501, term890501.getClass(), "jsRoot", null);
        setField(term890501, term890501.getClass(), "externAndJsRoot", null);
        setField(term890501, term890501.getClass(), "inputsById", null);
        setField(term890501, term890501.getClass(), "sourceMap", null);
        setField(term890501, term890501.getClass(), "externExports", null);
        setIntField(term890501, term890501.getClass(), "uniqueNameId", 0);
        setBooleanField(term890501, term890501.getClass(), "useThreads", false);
        setBooleanField(term890501, term890501.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890501, term890501.getClass(), "functionInformationMap", null);
        setField(term890501, term890501.getClass(), "debugLog", null);
        setField(term890501, term890501.getClass(), "defaultCodingConvention", null);
        setField(term890501, term890501.getClass(), "typeRegistry", null);
        setField(term890501, term890501.getClass(), "parserConfig", null);
        setField(term890501, term890501.getClass(), "abstractInterpreter", null);
        setField(term890501, term890501.getClass(), "typeValidator", null);
        setField(term890501, term890501.getClass(), "tracker", null);
        setField(term890501, term890501.getClass(), "oldErrorReporter", null);
        setField(term890501, term890501.getClass(), "defaultErrorReporter", null);
        setField(term890501, term890501.getClass(), "outStream", null);
        setField(term890501, term890501.getClass(), "globalRefMap", null);
        setDoubleField(term890501, term890501.getClass(), "progress", 0.0);
        setField(term890501, term890501.getClass(), "sanityCheck", null);
        setField(term890501, term890501.getClass(), "currentTracer", null);
        setField(term890501, term890501.getClass(), "currentPassName", null);
        setIntField(term890501, term890501.getClass(), "syntheticCodeId", 0);
        setField(term890501, term890501.getClass(), "recentChange", null);
        setField(term890501, term890501.getClass(), "codeChangeHandlers", null);
        setField(term890501, term890501.getClass(), "synthesizedExternsInput", null);
        setField(term890501, term890501.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInputsById", argTypes, term890501, args);
    }

};


