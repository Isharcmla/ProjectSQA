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

public class Compiler_getDefaultErrorReporter_2026967821205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896282;

    public Compiler_getDefaultErrorReporter_2026967821205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896282 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896282, term896282.getClass(), "options", null);
        setField(term896282, term896282.getClass(), "passes", null);
        setField(term896282, term896282.getClass(), "externs", null);
        setField(term896282, term896282.getClass(), "modules", null);
        setField(term896282, term896282.getClass(), "moduleGraph", null);
        setField(term896282, term896282.getClass(), "inputs", null);
        setField(term896282, term896282.getClass(), "errorManager", null);
        setField(term896282, term896282.getClass(), "warningsGuard", null);
        setField(term896282, term896282.getClass(), "externsRoot", null);
        setField(term896282, term896282.getClass(), "jsRoot", null);
        setField(term896282, term896282.getClass(), "externAndJsRoot", null);
        setField(term896282, term896282.getClass(), "inputsByName", null);
        setField(term896282, term896282.getClass(), "sourceMap", null);
        setField(term896282, term896282.getClass(), "externExports", null);
        setIntField(term896282, term896282.getClass(), "uniqueNameId", 0);
        setBooleanField(term896282, term896282.getClass(), "useThreads", false);
        setBooleanField(term896282, term896282.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896282, term896282.getClass(), "functionInformationMap", null);
        setField(term896282, term896282.getClass(), "debugLog", null);
        setField(term896282, term896282.getClass(), "defaultCodingConvention", null);
        setField(term896282, term896282.getClass(), "typeRegistry", null);
        setField(term896282, term896282.getClass(), "parserConfig", null);
        setField(term896282, term896282.getClass(), "abstractInterpreter", null);
        setField(term896282, term896282.getClass(), "typeValidator", null);
        setField(term896282, term896282.getClass(), "tracker", null);
        setField(term896282, term896282.getClass(), "oldErrorReporter", null);
        setField(term896282, term896282.getClass(), "defaultErrorReporter", null);
        setField(term896282, term896282.getClass(), "outStream", null);
        setField(term896282, term896282.getClass(), "globalRefMap", null);
        setField(term896282, term896282.getClass(), "sanityCheck", null);
        setField(term896282, term896282.getClass(), "currentTracer", null);
        setField(term896282, term896282.getClass(), "currentPassName", null);
        setField(term896282, term896282.getClass(), "recentChange", null);
        setField(term896282, term896282.getClass(), "codeChangeHandlers", null);
        setField(term896282, term896282.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefaultErrorReporter", argTypes, term896282, args);
    }

};


