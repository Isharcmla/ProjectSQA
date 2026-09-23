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

public class Compiler_initBasedOnOptions_1288505421166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term889767;

    public Compiler_initBasedOnOptions_1288505421166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term889767 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term889767, term889767.getClass(), "options", null);
        setField(term889767, term889767.getClass(), "passes", null);
        setField(term889767, term889767.getClass(), "externs", null);
        setField(term889767, term889767.getClass(), "modules", null);
        setField(term889767, term889767.getClass(), "moduleGraph", null);
        setField(term889767, term889767.getClass(), "inputs", null);
        setField(term889767, term889767.getClass(), "errorManager", null);
        setField(term889767, term889767.getClass(), "warningsGuard", null);
        setField(term889767, term889767.getClass(), "injectedLibraries", null);
        setField(term889767, term889767.getClass(), "externsRoot", null);
        setField(term889767, term889767.getClass(), "jsRoot", null);
        setField(term889767, term889767.getClass(), "externAndJsRoot", null);
        setField(term889767, term889767.getClass(), "inputsById", null);
        setField(term889767, term889767.getClass(), "sourceMap", null);
        setField(term889767, term889767.getClass(), "externExports", null);
        setIntField(term889767, term889767.getClass(), "uniqueNameId", 0);
        setBooleanField(term889767, term889767.getClass(), "useThreads", false);
        setBooleanField(term889767, term889767.getClass(), "hasRegExpGlobalReferences", false);
        setField(term889767, term889767.getClass(), "functionInformationMap", null);
        setField(term889767, term889767.getClass(), "debugLog", null);
        setField(term889767, term889767.getClass(), "defaultCodingConvention", null);
        setField(term889767, term889767.getClass(), "typeRegistry", null);
        setField(term889767, term889767.getClass(), "parserConfig", null);
        setField(term889767, term889767.getClass(), "abstractInterpreter", null);
        setField(term889767, term889767.getClass(), "typeValidator", null);
        setField(term889767, term889767.getClass(), "tracker", null);
        setField(term889767, term889767.getClass(), "oldErrorReporter", null);
        setField(term889767, term889767.getClass(), "defaultErrorReporter", null);
        setField(term889767, term889767.getClass(), "outStream", null);
        setField(term889767, term889767.getClass(), "globalRefMap", null);
        setDoubleField(term889767, term889767.getClass(), "progress", 0.0);
        setField(term889767, term889767.getClass(), "sanityCheck", null);
        setField(term889767, term889767.getClass(), "currentTracer", null);
        setField(term889767, term889767.getClass(), "currentPassName", null);
        setIntField(term889767, term889767.getClass(), "syntheticCodeId", 0);
        setField(term889767, term889767.getClass(), "recentChange", null);
        setField(term889767, term889767.getClass(), "codeChangeHandlers", null);
        setField(term889767, term889767.getClass(), "synthesizedExternsInput", null);
        setField(term889767, term889767.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initBasedOnOptions", argTypes, term889767, args);
    }

};


