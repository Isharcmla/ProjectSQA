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

public class Compiler_removeSyntheticVarsInput_1456277548304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890611;

    public Compiler_removeSyntheticVarsInput_1456277548304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890611 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890611, term890611.getClass(), "options", null);
        setField(term890611, term890611.getClass(), "passes", null);
        setField(term890611, term890611.getClass(), "externs", null);
        setField(term890611, term890611.getClass(), "modules", null);
        setField(term890611, term890611.getClass(), "moduleGraph", null);
        setField(term890611, term890611.getClass(), "inputs", null);
        setField(term890611, term890611.getClass(), "errorManager", null);
        setField(term890611, term890611.getClass(), "warningsGuard", null);
        setField(term890611, term890611.getClass(), "injectedLibraries", null);
        setField(term890611, term890611.getClass(), "externsRoot", null);
        setField(term890611, term890611.getClass(), "jsRoot", null);
        setField(term890611, term890611.getClass(), "externAndJsRoot", null);
        setField(term890611, term890611.getClass(), "inputsById", null);
        setField(term890611, term890611.getClass(), "sourceMap", null);
        setField(term890611, term890611.getClass(), "externExports", null);
        setIntField(term890611, term890611.getClass(), "uniqueNameId", 0);
        setBooleanField(term890611, term890611.getClass(), "useThreads", false);
        setBooleanField(term890611, term890611.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890611, term890611.getClass(), "functionInformationMap", null);
        setField(term890611, term890611.getClass(), "debugLog", null);
        setField(term890611, term890611.getClass(), "defaultCodingConvention", null);
        setField(term890611, term890611.getClass(), "typeRegistry", null);
        setField(term890611, term890611.getClass(), "parserConfig", null);
        setField(term890611, term890611.getClass(), "abstractInterpreter", null);
        setField(term890611, term890611.getClass(), "typeValidator", null);
        setField(term890611, term890611.getClass(), "tracker", null);
        setField(term890611, term890611.getClass(), "oldErrorReporter", null);
        setField(term890611, term890611.getClass(), "defaultErrorReporter", null);
        setField(term890611, term890611.getClass(), "outStream", null);
        setField(term890611, term890611.getClass(), "globalRefMap", null);
        setDoubleField(term890611, term890611.getClass(), "progress", 0.0);
        setField(term890611, term890611.getClass(), "sanityCheck", null);
        setField(term890611, term890611.getClass(), "currentTracer", null);
        setField(term890611, term890611.getClass(), "currentPassName", null);
        setIntField(term890611, term890611.getClass(), "syntheticCodeId", 0);
        setField(term890611, term890611.getClass(), "recentChange", null);
        setField(term890611, term890611.getClass(), "codeChangeHandlers", null);
        setField(term890611, term890611.getClass(), "synthesizedExternsInput", null);
        setField(term890611, term890611.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "removeSyntheticVarsInput", argTypes, term890611, args);
    }

};


