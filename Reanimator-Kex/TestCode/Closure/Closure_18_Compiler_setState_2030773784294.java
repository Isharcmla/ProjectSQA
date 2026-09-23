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

public class Compiler_setState_2030773784294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997482;

    public Compiler_setState_2030773784294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997482 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term997482, term997482.getClass(), "options", null);
        setField(term997482, term997482.getClass(), "passes", null);
        setField(term997482, term997482.getClass(), "externs", null);
        setField(term997482, term997482.getClass(), "modules", null);
        setField(term997482, term997482.getClass(), "moduleGraph", null);
        setField(term997482, term997482.getClass(), "inputs", null);
        setField(term997482, term997482.getClass(), "errorManager", null);
        setField(term997482, term997482.getClass(), "warningsGuard", null);
        setField(term997482, term997482.getClass(), "injectedLibraries", null);
        setField(term997482, term997482.getClass(), "externsRoot", null);
        setField(term997482, term997482.getClass(), "jsRoot", null);
        setField(term997482, term997482.getClass(), "externAndJsRoot", null);
        setField(term997482, term997482.getClass(), "inputsById", null);
        setField(term997482, term997482.getClass(), "sourceMap", null);
        setField(term997482, term997482.getClass(), "externExports", null);
        setIntField(term997482, term997482.getClass(), "uniqueNameId", 0);
        setBooleanField(term997482, term997482.getClass(), "useThreads", false);
        setBooleanField(term997482, term997482.getClass(), "hasRegExpGlobalReferences", false);
        setField(term997482, term997482.getClass(), "functionInformationMap", null);
        setField(term997482, term997482.getClass(), "debugLog", null);
        setField(term997482, term997482.getClass(), "defaultCodingConvention", null);
        setField(term997482, term997482.getClass(), "typeRegistry", null);
        setField(term997482, term997482.getClass(), "parserConfig", null);
        setField(term997482, term997482.getClass(), "abstractInterpreter", null);
        setField(term997482, term997482.getClass(), "typeValidator", null);
        setField(term997482, term997482.getClass(), "tracker", null);
        setField(term997482, term997482.getClass(), "oldErrorReporter", null);
        setField(term997482, term997482.getClass(), "defaultErrorReporter", null);
        setField(term997482, term997482.getClass(), "outStream", null);
        setField(term997482, term997482.getClass(), "globalRefMap", null);
        setDoubleField(term997482, term997482.getClass(), "progress", 0.0);
        setField(term997482, term997482.getClass(), "sanityCheck", null);
        setField(term997482, term997482.getClass(), "currentTracer", null);
        setField(term997482, term997482.getClass(), "currentPassName", null);
        setIntField(term997482, term997482.getClass(), "syntheticCodeId", 0);
        setField(term997482, term997482.getClass(), "recentChange", null);
        setField(term997482, term997482.getClass(), "codeChangeHandlers", null);
        setField(term997482, term997482.getClass(), "synthesizedExternsInput", null);
        setField(term997482, term997482.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Compiler$IntermediateState");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setState", argTypes, term997482, args);
    }

};


