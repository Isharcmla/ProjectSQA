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

public class Compiler_createFillFileName_2059976011169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term889787;

    public Compiler_createFillFileName_2059976011169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term889787 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term889787, term889787.getClass(), "options", null);
        setField(term889787, term889787.getClass(), "passes", null);
        setField(term889787, term889787.getClass(), "externs", null);
        setField(term889787, term889787.getClass(), "modules", null);
        setField(term889787, term889787.getClass(), "moduleGraph", null);
        setField(term889787, term889787.getClass(), "inputs", null);
        setField(term889787, term889787.getClass(), "errorManager", null);
        setField(term889787, term889787.getClass(), "warningsGuard", null);
        setField(term889787, term889787.getClass(), "injectedLibraries", null);
        setField(term889787, term889787.getClass(), "externsRoot", null);
        setField(term889787, term889787.getClass(), "jsRoot", null);
        setField(term889787, term889787.getClass(), "externAndJsRoot", null);
        setField(term889787, term889787.getClass(), "inputsById", null);
        setField(term889787, term889787.getClass(), "sourceMap", null);
        setField(term889787, term889787.getClass(), "externExports", null);
        setIntField(term889787, term889787.getClass(), "uniqueNameId", 0);
        setBooleanField(term889787, term889787.getClass(), "useThreads", false);
        setBooleanField(term889787, term889787.getClass(), "hasRegExpGlobalReferences", false);
        setField(term889787, term889787.getClass(), "functionInformationMap", null);
        setField(term889787, term889787.getClass(), "debugLog", null);
        setField(term889787, term889787.getClass(), "defaultCodingConvention", null);
        setField(term889787, term889787.getClass(), "typeRegistry", null);
        setField(term889787, term889787.getClass(), "parserConfig", null);
        setField(term889787, term889787.getClass(), "abstractInterpreter", null);
        setField(term889787, term889787.getClass(), "typeValidator", null);
        setField(term889787, term889787.getClass(), "tracker", null);
        setField(term889787, term889787.getClass(), "oldErrorReporter", null);
        setField(term889787, term889787.getClass(), "defaultErrorReporter", null);
        setField(term889787, term889787.getClass(), "outStream", null);
        setField(term889787, term889787.getClass(), "globalRefMap", null);
        setDoubleField(term889787, term889787.getClass(), "progress", 0.0);
        setField(term889787, term889787.getClass(), "sanityCheck", null);
        setField(term889787, term889787.getClass(), "currentTracer", null);
        setField(term889787, term889787.getClass(), "currentPassName", null);
        setIntField(term889787, term889787.getClass(), "syntheticCodeId", 0);
        setField(term889787, term889787.getClass(), "recentChange", null);
        setField(term889787, term889787.getClass(), "codeChangeHandlers", null);
        setField(term889787, term889787.getClass(), "synthesizedExternsInput", null);
        setField(term889787, term889787.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createFillFileName", argTypes, term889787, args);
    }

};


