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

public class Compiler_putCompilerInput_689134609216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890073;

    public Compiler_putCompilerInput_689134609216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890073 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890073, term890073.getClass(), "options", null);
        setField(term890073, term890073.getClass(), "passes", null);
        setField(term890073, term890073.getClass(), "externs", null);
        setField(term890073, term890073.getClass(), "modules", null);
        setField(term890073, term890073.getClass(), "moduleGraph", null);
        setField(term890073, term890073.getClass(), "inputs", null);
        setField(term890073, term890073.getClass(), "errorManager", null);
        setField(term890073, term890073.getClass(), "warningsGuard", null);
        setField(term890073, term890073.getClass(), "injectedLibraries", null);
        setField(term890073, term890073.getClass(), "externsRoot", null);
        setField(term890073, term890073.getClass(), "jsRoot", null);
        setField(term890073, term890073.getClass(), "externAndJsRoot", null);
        setField(term890073, term890073.getClass(), "inputsById", null);
        setField(term890073, term890073.getClass(), "sourceMap", null);
        setField(term890073, term890073.getClass(), "externExports", null);
        setIntField(term890073, term890073.getClass(), "uniqueNameId", 0);
        setBooleanField(term890073, term890073.getClass(), "useThreads", false);
        setBooleanField(term890073, term890073.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890073, term890073.getClass(), "functionInformationMap", null);
        setField(term890073, term890073.getClass(), "debugLog", null);
        setField(term890073, term890073.getClass(), "defaultCodingConvention", null);
        setField(term890073, term890073.getClass(), "typeRegistry", null);
        setField(term890073, term890073.getClass(), "parserConfig", null);
        setField(term890073, term890073.getClass(), "abstractInterpreter", null);
        setField(term890073, term890073.getClass(), "typeValidator", null);
        setField(term890073, term890073.getClass(), "tracker", null);
        setField(term890073, term890073.getClass(), "oldErrorReporter", null);
        setField(term890073, term890073.getClass(), "defaultErrorReporter", null);
        setField(term890073, term890073.getClass(), "outStream", null);
        setField(term890073, term890073.getClass(), "globalRefMap", null);
        setDoubleField(term890073, term890073.getClass(), "progress", 0.0);
        setField(term890073, term890073.getClass(), "sanityCheck", null);
        setField(term890073, term890073.getClass(), "currentTracer", null);
        setField(term890073, term890073.getClass(), "currentPassName", null);
        setIntField(term890073, term890073.getClass(), "syntheticCodeId", 0);
        setField(term890073, term890073.getClass(), "recentChange", null);
        setField(term890073, term890073.getClass(), "codeChangeHandlers", null);
        setField(term890073, term890073.getClass(), "synthesizedExternsInput", null);
        setField(term890073, term890073.getClass(), "stage", null);
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
        callMethod(klass, "putCompilerInput", argTypes, term890073, args);
    }

};


