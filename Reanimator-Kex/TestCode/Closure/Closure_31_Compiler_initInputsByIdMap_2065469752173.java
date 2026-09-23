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

public class Compiler_initInputsByIdMap_2065469752173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term889811;

    public Compiler_initInputsByIdMap_2065469752173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term889811 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term889811, term889811.getClass(), "options", null);
        setField(term889811, term889811.getClass(), "passes", null);
        setField(term889811, term889811.getClass(), "externs", null);
        setField(term889811, term889811.getClass(), "modules", null);
        setField(term889811, term889811.getClass(), "moduleGraph", null);
        setField(term889811, term889811.getClass(), "inputs", null);
        setField(term889811, term889811.getClass(), "errorManager", null);
        setField(term889811, term889811.getClass(), "warningsGuard", null);
        setField(term889811, term889811.getClass(), "injectedLibraries", null);
        setField(term889811, term889811.getClass(), "externsRoot", null);
        setField(term889811, term889811.getClass(), "jsRoot", null);
        setField(term889811, term889811.getClass(), "externAndJsRoot", null);
        setField(term889811, term889811.getClass(), "inputsById", null);
        setField(term889811, term889811.getClass(), "sourceMap", null);
        setField(term889811, term889811.getClass(), "externExports", null);
        setIntField(term889811, term889811.getClass(), "uniqueNameId", 0);
        setBooleanField(term889811, term889811.getClass(), "useThreads", false);
        setBooleanField(term889811, term889811.getClass(), "hasRegExpGlobalReferences", false);
        setField(term889811, term889811.getClass(), "functionInformationMap", null);
        setField(term889811, term889811.getClass(), "debugLog", null);
        setField(term889811, term889811.getClass(), "defaultCodingConvention", null);
        setField(term889811, term889811.getClass(), "typeRegistry", null);
        setField(term889811, term889811.getClass(), "parserConfig", null);
        setField(term889811, term889811.getClass(), "abstractInterpreter", null);
        setField(term889811, term889811.getClass(), "typeValidator", null);
        setField(term889811, term889811.getClass(), "tracker", null);
        setField(term889811, term889811.getClass(), "oldErrorReporter", null);
        setField(term889811, term889811.getClass(), "defaultErrorReporter", null);
        setField(term889811, term889811.getClass(), "outStream", null);
        setField(term889811, term889811.getClass(), "globalRefMap", null);
        setDoubleField(term889811, term889811.getClass(), "progress", 0.0);
        setField(term889811, term889811.getClass(), "sanityCheck", null);
        setField(term889811, term889811.getClass(), "currentTracer", null);
        setField(term889811, term889811.getClass(), "currentPassName", null);
        setIntField(term889811, term889811.getClass(), "syntheticCodeId", 0);
        setField(term889811, term889811.getClass(), "recentChange", null);
        setField(term889811, term889811.getClass(), "codeChangeHandlers", null);
        setField(term889811, term889811.getClass(), "synthesizedExternsInput", null);
        setField(term889811, term889811.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initInputsByIdMap", argTypes, term889811, args);
    }

};


