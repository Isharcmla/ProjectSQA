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

public class Compiler_putCompilerInput_689134609218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997018;

    public Compiler_putCompilerInput_689134609218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997018 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term997018, term997018.getClass(), "options", null);
        setField(term997018, term997018.getClass(), "passes", null);
        setField(term997018, term997018.getClass(), "externs", null);
        setField(term997018, term997018.getClass(), "modules", null);
        setField(term997018, term997018.getClass(), "moduleGraph", null);
        setField(term997018, term997018.getClass(), "inputs", null);
        setField(term997018, term997018.getClass(), "errorManager", null);
        setField(term997018, term997018.getClass(), "warningsGuard", null);
        setField(term997018, term997018.getClass(), "injectedLibraries", null);
        setField(term997018, term997018.getClass(), "externsRoot", null);
        setField(term997018, term997018.getClass(), "jsRoot", null);
        setField(term997018, term997018.getClass(), "externAndJsRoot", null);
        setField(term997018, term997018.getClass(), "inputsById", null);
        setField(term997018, term997018.getClass(), "sourceMap", null);
        setField(term997018, term997018.getClass(), "externExports", null);
        setIntField(term997018, term997018.getClass(), "uniqueNameId", 0);
        setBooleanField(term997018, term997018.getClass(), "useThreads", false);
        setBooleanField(term997018, term997018.getClass(), "hasRegExpGlobalReferences", false);
        setField(term997018, term997018.getClass(), "functionInformationMap", null);
        setField(term997018, term997018.getClass(), "debugLog", null);
        setField(term997018, term997018.getClass(), "defaultCodingConvention", null);
        setField(term997018, term997018.getClass(), "typeRegistry", null);
        setField(term997018, term997018.getClass(), "parserConfig", null);
        setField(term997018, term997018.getClass(), "abstractInterpreter", null);
        setField(term997018, term997018.getClass(), "typeValidator", null);
        setField(term997018, term997018.getClass(), "tracker", null);
        setField(term997018, term997018.getClass(), "oldErrorReporter", null);
        setField(term997018, term997018.getClass(), "defaultErrorReporter", null);
        setField(term997018, term997018.getClass(), "outStream", null);
        setField(term997018, term997018.getClass(), "globalRefMap", null);
        setDoubleField(term997018, term997018.getClass(), "progress", 0.0);
        setField(term997018, term997018.getClass(), "sanityCheck", null);
        setField(term997018, term997018.getClass(), "currentTracer", null);
        setField(term997018, term997018.getClass(), "currentPassName", null);
        setIntField(term997018, term997018.getClass(), "syntheticCodeId", 0);
        setField(term997018, term997018.getClass(), "recentChange", null);
        setField(term997018, term997018.getClass(), "codeChangeHandlers", null);
        setField(term997018, term997018.getClass(), "synthesizedExternsInput", null);
        setField(term997018, term997018.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.InputId");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "putCompilerInput", argTypes, term997018, args);
    }

};


