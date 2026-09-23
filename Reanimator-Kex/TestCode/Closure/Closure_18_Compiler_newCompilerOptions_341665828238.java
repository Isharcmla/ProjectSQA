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

public class Compiler_newCompilerOptions_341665828238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997138;

    public Compiler_newCompilerOptions_341665828238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997138 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term997138, term997138.getClass(), "options", null);
        setField(term997138, term997138.getClass(), "passes", null);
        setField(term997138, term997138.getClass(), "externs", null);
        setField(term997138, term997138.getClass(), "modules", null);
        setField(term997138, term997138.getClass(), "moduleGraph", null);
        setField(term997138, term997138.getClass(), "inputs", null);
        setField(term997138, term997138.getClass(), "errorManager", null);
        setField(term997138, term997138.getClass(), "warningsGuard", null);
        setField(term997138, term997138.getClass(), "injectedLibraries", null);
        setField(term997138, term997138.getClass(), "externsRoot", null);
        setField(term997138, term997138.getClass(), "jsRoot", null);
        setField(term997138, term997138.getClass(), "externAndJsRoot", null);
        setField(term997138, term997138.getClass(), "inputsById", null);
        setField(term997138, term997138.getClass(), "sourceMap", null);
        setField(term997138, term997138.getClass(), "externExports", null);
        setIntField(term997138, term997138.getClass(), "uniqueNameId", 0);
        setBooleanField(term997138, term997138.getClass(), "useThreads", false);
        setBooleanField(term997138, term997138.getClass(), "hasRegExpGlobalReferences", false);
        setField(term997138, term997138.getClass(), "functionInformationMap", null);
        setField(term997138, term997138.getClass(), "debugLog", null);
        setField(term997138, term997138.getClass(), "defaultCodingConvention", null);
        setField(term997138, term997138.getClass(), "typeRegistry", null);
        setField(term997138, term997138.getClass(), "parserConfig", null);
        setField(term997138, term997138.getClass(), "abstractInterpreter", null);
        setField(term997138, term997138.getClass(), "typeValidator", null);
        setField(term997138, term997138.getClass(), "tracker", null);
        setField(term997138, term997138.getClass(), "oldErrorReporter", null);
        setField(term997138, term997138.getClass(), "defaultErrorReporter", null);
        setField(term997138, term997138.getClass(), "outStream", null);
        setField(term997138, term997138.getClass(), "globalRefMap", null);
        setDoubleField(term997138, term997138.getClass(), "progress", 0.0);
        setField(term997138, term997138.getClass(), "sanityCheck", null);
        setField(term997138, term997138.getClass(), "currentTracer", null);
        setField(term997138, term997138.getClass(), "currentPassName", null);
        setIntField(term997138, term997138.getClass(), "syntheticCodeId", 0);
        setField(term997138, term997138.getClass(), "recentChange", null);
        setField(term997138, term997138.getClass(), "codeChangeHandlers", null);
        setField(term997138, term997138.getClass(), "synthesizedExternsInput", null);
        setField(term997138, term997138.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "newCompilerOptions", argTypes, term997138, args);
    }

};


