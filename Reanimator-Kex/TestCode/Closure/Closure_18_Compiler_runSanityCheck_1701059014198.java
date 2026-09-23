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

public class Compiler_runSanityCheck_1701059014198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term996898;

    public Compiler_runSanityCheck_1701059014198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term996898 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term996898, term996898.getClass(), "options", null);
        setField(term996898, term996898.getClass(), "passes", null);
        setField(term996898, term996898.getClass(), "externs", null);
        setField(term996898, term996898.getClass(), "modules", null);
        setField(term996898, term996898.getClass(), "moduleGraph", null);
        setField(term996898, term996898.getClass(), "inputs", null);
        setField(term996898, term996898.getClass(), "errorManager", null);
        setField(term996898, term996898.getClass(), "warningsGuard", null);
        setField(term996898, term996898.getClass(), "injectedLibraries", null);
        setField(term996898, term996898.getClass(), "externsRoot", null);
        setField(term996898, term996898.getClass(), "jsRoot", null);
        setField(term996898, term996898.getClass(), "externAndJsRoot", null);
        setField(term996898, term996898.getClass(), "inputsById", null);
        setField(term996898, term996898.getClass(), "sourceMap", null);
        setField(term996898, term996898.getClass(), "externExports", null);
        setIntField(term996898, term996898.getClass(), "uniqueNameId", 0);
        setBooleanField(term996898, term996898.getClass(), "useThreads", false);
        setBooleanField(term996898, term996898.getClass(), "hasRegExpGlobalReferences", false);
        setField(term996898, term996898.getClass(), "functionInformationMap", null);
        setField(term996898, term996898.getClass(), "debugLog", null);
        setField(term996898, term996898.getClass(), "defaultCodingConvention", null);
        setField(term996898, term996898.getClass(), "typeRegistry", null);
        setField(term996898, term996898.getClass(), "parserConfig", null);
        setField(term996898, term996898.getClass(), "abstractInterpreter", null);
        setField(term996898, term996898.getClass(), "typeValidator", null);
        setField(term996898, term996898.getClass(), "tracker", null);
        setField(term996898, term996898.getClass(), "oldErrorReporter", null);
        setField(term996898, term996898.getClass(), "defaultErrorReporter", null);
        setField(term996898, term996898.getClass(), "outStream", null);
        setField(term996898, term996898.getClass(), "globalRefMap", null);
        setDoubleField(term996898, term996898.getClass(), "progress", 0.0);
        setField(term996898, term996898.getClass(), "sanityCheck", null);
        setField(term996898, term996898.getClass(), "currentTracer", null);
        setField(term996898, term996898.getClass(), "currentPassName", null);
        setIntField(term996898, term996898.getClass(), "syntheticCodeId", 0);
        setField(term996898, term996898.getClass(), "recentChange", null);
        setField(term996898, term996898.getClass(), "codeChangeHandlers", null);
        setField(term996898, term996898.getClass(), "synthesizedExternsInput", null);
        setField(term996898, term996898.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "runSanityCheck", argTypes, term996898, args);
    }

};


