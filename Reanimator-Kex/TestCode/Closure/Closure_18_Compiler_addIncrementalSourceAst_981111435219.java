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

public class Compiler_addIncrementalSourceAst_981111435219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997024;

    public Compiler_addIncrementalSourceAst_981111435219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997024 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term997024, term997024.getClass(), "options", null);
        setField(term997024, term997024.getClass(), "passes", null);
        setField(term997024, term997024.getClass(), "externs", null);
        setField(term997024, term997024.getClass(), "modules", null);
        setField(term997024, term997024.getClass(), "moduleGraph", null);
        setField(term997024, term997024.getClass(), "inputs", null);
        setField(term997024, term997024.getClass(), "errorManager", null);
        setField(term997024, term997024.getClass(), "warningsGuard", null);
        setField(term997024, term997024.getClass(), "injectedLibraries", null);
        setField(term997024, term997024.getClass(), "externsRoot", null);
        setField(term997024, term997024.getClass(), "jsRoot", null);
        setField(term997024, term997024.getClass(), "externAndJsRoot", null);
        setField(term997024, term997024.getClass(), "inputsById", null);
        setField(term997024, term997024.getClass(), "sourceMap", null);
        setField(term997024, term997024.getClass(), "externExports", null);
        setIntField(term997024, term997024.getClass(), "uniqueNameId", 0);
        setBooleanField(term997024, term997024.getClass(), "useThreads", false);
        setBooleanField(term997024, term997024.getClass(), "hasRegExpGlobalReferences", false);
        setField(term997024, term997024.getClass(), "functionInformationMap", null);
        setField(term997024, term997024.getClass(), "debugLog", null);
        setField(term997024, term997024.getClass(), "defaultCodingConvention", null);
        setField(term997024, term997024.getClass(), "typeRegistry", null);
        setField(term997024, term997024.getClass(), "parserConfig", null);
        setField(term997024, term997024.getClass(), "abstractInterpreter", null);
        setField(term997024, term997024.getClass(), "typeValidator", null);
        setField(term997024, term997024.getClass(), "tracker", null);
        setField(term997024, term997024.getClass(), "oldErrorReporter", null);
        setField(term997024, term997024.getClass(), "defaultErrorReporter", null);
        setField(term997024, term997024.getClass(), "outStream", null);
        setField(term997024, term997024.getClass(), "globalRefMap", null);
        setDoubleField(term997024, term997024.getClass(), "progress", 0.0);
        setField(term997024, term997024.getClass(), "sanityCheck", null);
        setField(term997024, term997024.getClass(), "currentTracer", null);
        setField(term997024, term997024.getClass(), "currentPassName", null);
        setIntField(term997024, term997024.getClass(), "syntheticCodeId", 0);
        setField(term997024, term997024.getClass(), "recentChange", null);
        setField(term997024, term997024.getClass(), "codeChangeHandlers", null);
        setField(term997024, term997024.getClass(), "synthesizedExternsInput", null);
        setField(term997024, term997024.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JsAst");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addIncrementalSourceAst", argTypes, term997024, args);
    }

};


