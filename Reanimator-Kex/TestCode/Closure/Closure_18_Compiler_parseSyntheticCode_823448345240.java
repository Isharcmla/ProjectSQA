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

public class Compiler_parseSyntheticCode_823448345240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997150;

    public Compiler_parseSyntheticCode_823448345240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997150 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term997150, term997150.getClass(), "options", null);
        setField(term997150, term997150.getClass(), "passes", null);
        setField(term997150, term997150.getClass(), "externs", null);
        setField(term997150, term997150.getClass(), "modules", null);
        setField(term997150, term997150.getClass(), "moduleGraph", null);
        setField(term997150, term997150.getClass(), "inputs", null);
        setField(term997150, term997150.getClass(), "errorManager", null);
        setField(term997150, term997150.getClass(), "warningsGuard", null);
        setField(term997150, term997150.getClass(), "injectedLibraries", null);
        setField(term997150, term997150.getClass(), "externsRoot", null);
        setField(term997150, term997150.getClass(), "jsRoot", null);
        setField(term997150, term997150.getClass(), "externAndJsRoot", null);
        setField(term997150, term997150.getClass(), "inputsById", null);
        setField(term997150, term997150.getClass(), "sourceMap", null);
        setField(term997150, term997150.getClass(), "externExports", null);
        setIntField(term997150, term997150.getClass(), "uniqueNameId", 0);
        setBooleanField(term997150, term997150.getClass(), "useThreads", false);
        setBooleanField(term997150, term997150.getClass(), "hasRegExpGlobalReferences", false);
        setField(term997150, term997150.getClass(), "functionInformationMap", null);
        setField(term997150, term997150.getClass(), "debugLog", null);
        setField(term997150, term997150.getClass(), "defaultCodingConvention", null);
        setField(term997150, term997150.getClass(), "typeRegistry", null);
        setField(term997150, term997150.getClass(), "parserConfig", null);
        setField(term997150, term997150.getClass(), "abstractInterpreter", null);
        setField(term997150, term997150.getClass(), "typeValidator", null);
        setField(term997150, term997150.getClass(), "tracker", null);
        setField(term997150, term997150.getClass(), "oldErrorReporter", null);
        setField(term997150, term997150.getClass(), "defaultErrorReporter", null);
        setField(term997150, term997150.getClass(), "outStream", null);
        setField(term997150, term997150.getClass(), "globalRefMap", null);
        setDoubleField(term997150, term997150.getClass(), "progress", 0.0);
        setField(term997150, term997150.getClass(), "sanityCheck", null);
        setField(term997150, term997150.getClass(), "currentTracer", null);
        setField(term997150, term997150.getClass(), "currentPassName", null);
        setIntField(term997150, term997150.getClass(), "syntheticCodeId", 0);
        setField(term997150, term997150.getClass(), "recentChange", null);
        setField(term997150, term997150.getClass(), "codeChangeHandlers", null);
        setField(term997150, term997150.getClass(), "synthesizedExternsInput", null);
        setField(term997150, term997150.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "parseSyntheticCode", argTypes, term997150, args);
    }

};


