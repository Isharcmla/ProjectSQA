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

public class Compiler_getTypeValidator_2073461408228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890145;

    public Compiler_getTypeValidator_2073461408228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890145 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890145, term890145.getClass(), "options", null);
        setField(term890145, term890145.getClass(), "passes", null);
        setField(term890145, term890145.getClass(), "externs", null);
        setField(term890145, term890145.getClass(), "modules", null);
        setField(term890145, term890145.getClass(), "moduleGraph", null);
        setField(term890145, term890145.getClass(), "inputs", null);
        setField(term890145, term890145.getClass(), "errorManager", null);
        setField(term890145, term890145.getClass(), "warningsGuard", null);
        setField(term890145, term890145.getClass(), "injectedLibraries", null);
        setField(term890145, term890145.getClass(), "externsRoot", null);
        setField(term890145, term890145.getClass(), "jsRoot", null);
        setField(term890145, term890145.getClass(), "externAndJsRoot", null);
        setField(term890145, term890145.getClass(), "inputsById", null);
        setField(term890145, term890145.getClass(), "sourceMap", null);
        setField(term890145, term890145.getClass(), "externExports", null);
        setIntField(term890145, term890145.getClass(), "uniqueNameId", 0);
        setBooleanField(term890145, term890145.getClass(), "useThreads", false);
        setBooleanField(term890145, term890145.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890145, term890145.getClass(), "functionInformationMap", null);
        setField(term890145, term890145.getClass(), "debugLog", null);
        setField(term890145, term890145.getClass(), "defaultCodingConvention", null);
        setField(term890145, term890145.getClass(), "typeRegistry", null);
        setField(term890145, term890145.getClass(), "parserConfig", null);
        setField(term890145, term890145.getClass(), "abstractInterpreter", null);
        setField(term890145, term890145.getClass(), "typeValidator", null);
        setField(term890145, term890145.getClass(), "tracker", null);
        setField(term890145, term890145.getClass(), "oldErrorReporter", null);
        setField(term890145, term890145.getClass(), "defaultErrorReporter", null);
        setField(term890145, term890145.getClass(), "outStream", null);
        setField(term890145, term890145.getClass(), "globalRefMap", null);
        setDoubleField(term890145, term890145.getClass(), "progress", 0.0);
        setField(term890145, term890145.getClass(), "sanityCheck", null);
        setField(term890145, term890145.getClass(), "currentTracer", null);
        setField(term890145, term890145.getClass(), "currentPassName", null);
        setIntField(term890145, term890145.getClass(), "syntheticCodeId", 0);
        setField(term890145, term890145.getClass(), "recentChange", null);
        setField(term890145, term890145.getClass(), "codeChangeHandlers", null);
        setField(term890145, term890145.getClass(), "synthesizedExternsInput", null);
        setField(term890145, term890145.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTypeValidator", argTypes, term890145, args);
    }

};


