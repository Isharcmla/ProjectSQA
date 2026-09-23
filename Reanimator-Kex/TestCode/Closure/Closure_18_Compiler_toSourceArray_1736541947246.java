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

public class Compiler_toSourceArray_1736541947246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997186;

    public Compiler_toSourceArray_1736541947246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997186 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term997186, term997186.getClass(), "options", null);
        setField(term997186, term997186.getClass(), "passes", null);
        setField(term997186, term997186.getClass(), "externs", null);
        setField(term997186, term997186.getClass(), "modules", null);
        setField(term997186, term997186.getClass(), "moduleGraph", null);
        setField(term997186, term997186.getClass(), "inputs", null);
        setField(term997186, term997186.getClass(), "errorManager", null);
        setField(term997186, term997186.getClass(), "warningsGuard", null);
        setField(term997186, term997186.getClass(), "injectedLibraries", null);
        setField(term997186, term997186.getClass(), "externsRoot", null);
        setField(term997186, term997186.getClass(), "jsRoot", null);
        setField(term997186, term997186.getClass(), "externAndJsRoot", null);
        setField(term997186, term997186.getClass(), "inputsById", null);
        setField(term997186, term997186.getClass(), "sourceMap", null);
        setField(term997186, term997186.getClass(), "externExports", null);
        setIntField(term997186, term997186.getClass(), "uniqueNameId", 0);
        setBooleanField(term997186, term997186.getClass(), "useThreads", false);
        setBooleanField(term997186, term997186.getClass(), "hasRegExpGlobalReferences", false);
        setField(term997186, term997186.getClass(), "functionInformationMap", null);
        setField(term997186, term997186.getClass(), "debugLog", null);
        setField(term997186, term997186.getClass(), "defaultCodingConvention", null);
        setField(term997186, term997186.getClass(), "typeRegistry", null);
        setField(term997186, term997186.getClass(), "parserConfig", null);
        setField(term997186, term997186.getClass(), "abstractInterpreter", null);
        setField(term997186, term997186.getClass(), "typeValidator", null);
        setField(term997186, term997186.getClass(), "tracker", null);
        setField(term997186, term997186.getClass(), "oldErrorReporter", null);
        setField(term997186, term997186.getClass(), "defaultErrorReporter", null);
        setField(term997186, term997186.getClass(), "outStream", null);
        setField(term997186, term997186.getClass(), "globalRefMap", null);
        setDoubleField(term997186, term997186.getClass(), "progress", 0.0);
        setField(term997186, term997186.getClass(), "sanityCheck", null);
        setField(term997186, term997186.getClass(), "currentTracer", null);
        setField(term997186, term997186.getClass(), "currentPassName", null);
        setIntField(term997186, term997186.getClass(), "syntheticCodeId", 0);
        setField(term997186, term997186.getClass(), "recentChange", null);
        setField(term997186, term997186.getClass(), "codeChangeHandlers", null);
        setField(term997186, term997186.getClass(), "synthesizedExternsInput", null);
        setField(term997186, term997186.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSModule");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "toSourceArray", argTypes, term997186, args);
    }

};


