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

public class Compiler_externExports_691615754193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term889935;

    public Compiler_externExports_691615754193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term889935 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term889935, term889935.getClass(), "options", null);
        setField(term889935, term889935.getClass(), "passes", null);
        setField(term889935, term889935.getClass(), "externs", null);
        setField(term889935, term889935.getClass(), "modules", null);
        setField(term889935, term889935.getClass(), "moduleGraph", null);
        setField(term889935, term889935.getClass(), "inputs", null);
        setField(term889935, term889935.getClass(), "errorManager", null);
        setField(term889935, term889935.getClass(), "warningsGuard", null);
        setField(term889935, term889935.getClass(), "injectedLibraries", null);
        setField(term889935, term889935.getClass(), "externsRoot", null);
        setField(term889935, term889935.getClass(), "jsRoot", null);
        setField(term889935, term889935.getClass(), "externAndJsRoot", null);
        setField(term889935, term889935.getClass(), "inputsById", null);
        setField(term889935, term889935.getClass(), "sourceMap", null);
        setField(term889935, term889935.getClass(), "externExports", null);
        setIntField(term889935, term889935.getClass(), "uniqueNameId", 0);
        setBooleanField(term889935, term889935.getClass(), "useThreads", false);
        setBooleanField(term889935, term889935.getClass(), "hasRegExpGlobalReferences", false);
        setField(term889935, term889935.getClass(), "functionInformationMap", null);
        setField(term889935, term889935.getClass(), "debugLog", null);
        setField(term889935, term889935.getClass(), "defaultCodingConvention", null);
        setField(term889935, term889935.getClass(), "typeRegistry", null);
        setField(term889935, term889935.getClass(), "parserConfig", null);
        setField(term889935, term889935.getClass(), "abstractInterpreter", null);
        setField(term889935, term889935.getClass(), "typeValidator", null);
        setField(term889935, term889935.getClass(), "tracker", null);
        setField(term889935, term889935.getClass(), "oldErrorReporter", null);
        setField(term889935, term889935.getClass(), "defaultErrorReporter", null);
        setField(term889935, term889935.getClass(), "outStream", null);
        setField(term889935, term889935.getClass(), "globalRefMap", null);
        setDoubleField(term889935, term889935.getClass(), "progress", 0.0);
        setField(term889935, term889935.getClass(), "sanityCheck", null);
        setField(term889935, term889935.getClass(), "currentTracer", null);
        setField(term889935, term889935.getClass(), "currentPassName", null);
        setIntField(term889935, term889935.getClass(), "syntheticCodeId", 0);
        setField(term889935, term889935.getClass(), "recentChange", null);
        setField(term889935, term889935.getClass(), "codeChangeHandlers", null);
        setField(term889935, term889935.getClass(), "synthesizedExternsInput", null);
        setField(term889935, term889935.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "externExports", argTypes, term889935, args);
    }

};


