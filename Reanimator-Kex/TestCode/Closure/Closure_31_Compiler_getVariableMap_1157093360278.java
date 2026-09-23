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

public class Compiler_getVariableMap_1157093360278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890453;

    public Compiler_getVariableMap_1157093360278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890453 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890453, term890453.getClass(), "options", null);
        setField(term890453, term890453.getClass(), "passes", null);
        setField(term890453, term890453.getClass(), "externs", null);
        setField(term890453, term890453.getClass(), "modules", null);
        setField(term890453, term890453.getClass(), "moduleGraph", null);
        setField(term890453, term890453.getClass(), "inputs", null);
        setField(term890453, term890453.getClass(), "errorManager", null);
        setField(term890453, term890453.getClass(), "warningsGuard", null);
        setField(term890453, term890453.getClass(), "injectedLibraries", null);
        setField(term890453, term890453.getClass(), "externsRoot", null);
        setField(term890453, term890453.getClass(), "jsRoot", null);
        setField(term890453, term890453.getClass(), "externAndJsRoot", null);
        setField(term890453, term890453.getClass(), "inputsById", null);
        setField(term890453, term890453.getClass(), "sourceMap", null);
        setField(term890453, term890453.getClass(), "externExports", null);
        setIntField(term890453, term890453.getClass(), "uniqueNameId", 0);
        setBooleanField(term890453, term890453.getClass(), "useThreads", false);
        setBooleanField(term890453, term890453.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890453, term890453.getClass(), "functionInformationMap", null);
        setField(term890453, term890453.getClass(), "debugLog", null);
        setField(term890453, term890453.getClass(), "defaultCodingConvention", null);
        setField(term890453, term890453.getClass(), "typeRegistry", null);
        setField(term890453, term890453.getClass(), "parserConfig", null);
        setField(term890453, term890453.getClass(), "abstractInterpreter", null);
        setField(term890453, term890453.getClass(), "typeValidator", null);
        setField(term890453, term890453.getClass(), "tracker", null);
        setField(term890453, term890453.getClass(), "oldErrorReporter", null);
        setField(term890453, term890453.getClass(), "defaultErrorReporter", null);
        setField(term890453, term890453.getClass(), "outStream", null);
        setField(term890453, term890453.getClass(), "globalRefMap", null);
        setDoubleField(term890453, term890453.getClass(), "progress", 0.0);
        setField(term890453, term890453.getClass(), "sanityCheck", null);
        setField(term890453, term890453.getClass(), "currentTracer", null);
        setField(term890453, term890453.getClass(), "currentPassName", null);
        setIntField(term890453, term890453.getClass(), "syntheticCodeId", 0);
        setField(term890453, term890453.getClass(), "recentChange", null);
        setField(term890453, term890453.getClass(), "codeChangeHandlers", null);
        setField(term890453, term890453.getClass(), "synthesizedExternsInput", null);
        setField(term890453, term890453.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVariableMap", argTypes, term890453, args);
    }

};


