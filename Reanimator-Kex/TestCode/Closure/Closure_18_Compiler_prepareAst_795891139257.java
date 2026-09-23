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

public class Compiler_prepareAst_795891139257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997256;

    public Compiler_prepareAst_795891139257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997256 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term997256, term997256.getClass(), "options", null);
        setField(term997256, term997256.getClass(), "passes", null);
        setField(term997256, term997256.getClass(), "externs", null);
        setField(term997256, term997256.getClass(), "modules", null);
        setField(term997256, term997256.getClass(), "moduleGraph", null);
        setField(term997256, term997256.getClass(), "inputs", null);
        setField(term997256, term997256.getClass(), "errorManager", null);
        setField(term997256, term997256.getClass(), "warningsGuard", null);
        setField(term997256, term997256.getClass(), "injectedLibraries", null);
        setField(term997256, term997256.getClass(), "externsRoot", null);
        setField(term997256, term997256.getClass(), "jsRoot", null);
        setField(term997256, term997256.getClass(), "externAndJsRoot", null);
        setField(term997256, term997256.getClass(), "inputsById", null);
        setField(term997256, term997256.getClass(), "sourceMap", null);
        setField(term997256, term997256.getClass(), "externExports", null);
        setIntField(term997256, term997256.getClass(), "uniqueNameId", 0);
        setBooleanField(term997256, term997256.getClass(), "useThreads", false);
        setBooleanField(term997256, term997256.getClass(), "hasRegExpGlobalReferences", false);
        setField(term997256, term997256.getClass(), "functionInformationMap", null);
        setField(term997256, term997256.getClass(), "debugLog", null);
        setField(term997256, term997256.getClass(), "defaultCodingConvention", null);
        setField(term997256, term997256.getClass(), "typeRegistry", null);
        setField(term997256, term997256.getClass(), "parserConfig", null);
        setField(term997256, term997256.getClass(), "abstractInterpreter", null);
        setField(term997256, term997256.getClass(), "typeValidator", null);
        setField(term997256, term997256.getClass(), "tracker", null);
        setField(term997256, term997256.getClass(), "oldErrorReporter", null);
        setField(term997256, term997256.getClass(), "defaultErrorReporter", null);
        setField(term997256, term997256.getClass(), "outStream", null);
        setField(term997256, term997256.getClass(), "globalRefMap", null);
        setDoubleField(term997256, term997256.getClass(), "progress", 0.0);
        setField(term997256, term997256.getClass(), "sanityCheck", null);
        setField(term997256, term997256.getClass(), "currentTracer", null);
        setField(term997256, term997256.getClass(), "currentPassName", null);
        setIntField(term997256, term997256.getClass(), "syntheticCodeId", 0);
        setField(term997256, term997256.getClass(), "recentChange", null);
        setField(term997256, term997256.getClass(), "codeChangeHandlers", null);
        setField(term997256, term997256.getClass(), "synthesizedExternsInput", null);
        setField(term997256, term997256.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "prepareAst", argTypes, term997256, args);
    }

};


