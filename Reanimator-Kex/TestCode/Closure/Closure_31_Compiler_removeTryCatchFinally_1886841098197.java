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

public class Compiler_removeTryCatchFinally_1886841098197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term889959;

    public Compiler_removeTryCatchFinally_1886841098197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term889959 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term889959, term889959.getClass(), "options", null);
        setField(term889959, term889959.getClass(), "passes", null);
        setField(term889959, term889959.getClass(), "externs", null);
        setField(term889959, term889959.getClass(), "modules", null);
        setField(term889959, term889959.getClass(), "moduleGraph", null);
        setField(term889959, term889959.getClass(), "inputs", null);
        setField(term889959, term889959.getClass(), "errorManager", null);
        setField(term889959, term889959.getClass(), "warningsGuard", null);
        setField(term889959, term889959.getClass(), "injectedLibraries", null);
        setField(term889959, term889959.getClass(), "externsRoot", null);
        setField(term889959, term889959.getClass(), "jsRoot", null);
        setField(term889959, term889959.getClass(), "externAndJsRoot", null);
        setField(term889959, term889959.getClass(), "inputsById", null);
        setField(term889959, term889959.getClass(), "sourceMap", null);
        setField(term889959, term889959.getClass(), "externExports", null);
        setIntField(term889959, term889959.getClass(), "uniqueNameId", 0);
        setBooleanField(term889959, term889959.getClass(), "useThreads", false);
        setBooleanField(term889959, term889959.getClass(), "hasRegExpGlobalReferences", false);
        setField(term889959, term889959.getClass(), "functionInformationMap", null);
        setField(term889959, term889959.getClass(), "debugLog", null);
        setField(term889959, term889959.getClass(), "defaultCodingConvention", null);
        setField(term889959, term889959.getClass(), "typeRegistry", null);
        setField(term889959, term889959.getClass(), "parserConfig", null);
        setField(term889959, term889959.getClass(), "abstractInterpreter", null);
        setField(term889959, term889959.getClass(), "typeValidator", null);
        setField(term889959, term889959.getClass(), "tracker", null);
        setField(term889959, term889959.getClass(), "oldErrorReporter", null);
        setField(term889959, term889959.getClass(), "defaultErrorReporter", null);
        setField(term889959, term889959.getClass(), "outStream", null);
        setField(term889959, term889959.getClass(), "globalRefMap", null);
        setDoubleField(term889959, term889959.getClass(), "progress", 0.0);
        setField(term889959, term889959.getClass(), "sanityCheck", null);
        setField(term889959, term889959.getClass(), "currentTracer", null);
        setField(term889959, term889959.getClass(), "currentPassName", null);
        setIntField(term889959, term889959.getClass(), "syntheticCodeId", 0);
        setField(term889959, term889959.getClass(), "recentChange", null);
        setField(term889959, term889959.getClass(), "codeChangeHandlers", null);
        setField(term889959, term889959.getClass(), "synthesizedExternsInput", null);
        setField(term889959, term889959.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "removeTryCatchFinally", argTypes, term889959, args);
    }

};


