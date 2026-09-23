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

public class Compiler_getExternsInOrder_366397331292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997470;

    public Compiler_getExternsInOrder_366397331292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997470 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term997470, term997470.getClass(), "options", null);
        setField(term997470, term997470.getClass(), "passes", null);
        setField(term997470, term997470.getClass(), "externs", null);
        setField(term997470, term997470.getClass(), "modules", null);
        setField(term997470, term997470.getClass(), "moduleGraph", null);
        setField(term997470, term997470.getClass(), "inputs", null);
        setField(term997470, term997470.getClass(), "errorManager", null);
        setField(term997470, term997470.getClass(), "warningsGuard", null);
        setField(term997470, term997470.getClass(), "injectedLibraries", null);
        setField(term997470, term997470.getClass(), "externsRoot", null);
        setField(term997470, term997470.getClass(), "jsRoot", null);
        setField(term997470, term997470.getClass(), "externAndJsRoot", null);
        setField(term997470, term997470.getClass(), "inputsById", null);
        setField(term997470, term997470.getClass(), "sourceMap", null);
        setField(term997470, term997470.getClass(), "externExports", null);
        setIntField(term997470, term997470.getClass(), "uniqueNameId", 0);
        setBooleanField(term997470, term997470.getClass(), "useThreads", false);
        setBooleanField(term997470, term997470.getClass(), "hasRegExpGlobalReferences", false);
        setField(term997470, term997470.getClass(), "functionInformationMap", null);
        setField(term997470, term997470.getClass(), "debugLog", null);
        setField(term997470, term997470.getClass(), "defaultCodingConvention", null);
        setField(term997470, term997470.getClass(), "typeRegistry", null);
        setField(term997470, term997470.getClass(), "parserConfig", null);
        setField(term997470, term997470.getClass(), "abstractInterpreter", null);
        setField(term997470, term997470.getClass(), "typeValidator", null);
        setField(term997470, term997470.getClass(), "tracker", null);
        setField(term997470, term997470.getClass(), "oldErrorReporter", null);
        setField(term997470, term997470.getClass(), "defaultErrorReporter", null);
        setField(term997470, term997470.getClass(), "outStream", null);
        setField(term997470, term997470.getClass(), "globalRefMap", null);
        setDoubleField(term997470, term997470.getClass(), "progress", 0.0);
        setField(term997470, term997470.getClass(), "sanityCheck", null);
        setField(term997470, term997470.getClass(), "currentTracer", null);
        setField(term997470, term997470.getClass(), "currentPassName", null);
        setIntField(term997470, term997470.getClass(), "syntheticCodeId", 0);
        setField(term997470, term997470.getClass(), "recentChange", null);
        setField(term997470, term997470.getClass(), "codeChangeHandlers", null);
        setField(term997470, term997470.getClass(), "synthesizedExternsInput", null);
        setField(term997470, term997470.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExternsInOrder", argTypes, term997470, args);
    }

};


