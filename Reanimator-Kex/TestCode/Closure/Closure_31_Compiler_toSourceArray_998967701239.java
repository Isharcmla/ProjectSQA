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

public class Compiler_toSourceArray_998967701239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890211;

    public Compiler_toSourceArray_998967701239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890211 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890211, term890211.getClass(), "options", null);
        setField(term890211, term890211.getClass(), "passes", null);
        setField(term890211, term890211.getClass(), "externs", null);
        setField(term890211, term890211.getClass(), "modules", null);
        setField(term890211, term890211.getClass(), "moduleGraph", null);
        setField(term890211, term890211.getClass(), "inputs", null);
        setField(term890211, term890211.getClass(), "errorManager", null);
        setField(term890211, term890211.getClass(), "warningsGuard", null);
        setField(term890211, term890211.getClass(), "injectedLibraries", null);
        setField(term890211, term890211.getClass(), "externsRoot", null);
        setField(term890211, term890211.getClass(), "jsRoot", null);
        setField(term890211, term890211.getClass(), "externAndJsRoot", null);
        setField(term890211, term890211.getClass(), "inputsById", null);
        setField(term890211, term890211.getClass(), "sourceMap", null);
        setField(term890211, term890211.getClass(), "externExports", null);
        setIntField(term890211, term890211.getClass(), "uniqueNameId", 0);
        setBooleanField(term890211, term890211.getClass(), "useThreads", false);
        setBooleanField(term890211, term890211.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890211, term890211.getClass(), "functionInformationMap", null);
        setField(term890211, term890211.getClass(), "debugLog", null);
        setField(term890211, term890211.getClass(), "defaultCodingConvention", null);
        setField(term890211, term890211.getClass(), "typeRegistry", null);
        setField(term890211, term890211.getClass(), "parserConfig", null);
        setField(term890211, term890211.getClass(), "abstractInterpreter", null);
        setField(term890211, term890211.getClass(), "typeValidator", null);
        setField(term890211, term890211.getClass(), "tracker", null);
        setField(term890211, term890211.getClass(), "oldErrorReporter", null);
        setField(term890211, term890211.getClass(), "defaultErrorReporter", null);
        setField(term890211, term890211.getClass(), "outStream", null);
        setField(term890211, term890211.getClass(), "globalRefMap", null);
        setDoubleField(term890211, term890211.getClass(), "progress", 0.0);
        setField(term890211, term890211.getClass(), "sanityCheck", null);
        setField(term890211, term890211.getClass(), "currentTracer", null);
        setField(term890211, term890211.getClass(), "currentPassName", null);
        setIntField(term890211, term890211.getClass(), "syntheticCodeId", 0);
        setField(term890211, term890211.getClass(), "recentChange", null);
        setField(term890211, term890211.getClass(), "codeChangeHandlers", null);
        setField(term890211, term890211.getClass(), "synthesizedExternsInput", null);
        setField(term890211, term890211.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toSourceArray", argTypes, term890211, args);
    }

};


