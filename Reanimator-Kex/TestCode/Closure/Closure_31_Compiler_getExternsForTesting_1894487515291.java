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

public class Compiler_getExternsForTesting_1894487515291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890531;

    public Compiler_getExternsForTesting_1894487515291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890531 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890531, term890531.getClass(), "options", null);
        setField(term890531, term890531.getClass(), "passes", null);
        setField(term890531, term890531.getClass(), "externs", null);
        setField(term890531, term890531.getClass(), "modules", null);
        setField(term890531, term890531.getClass(), "moduleGraph", null);
        setField(term890531, term890531.getClass(), "inputs", null);
        setField(term890531, term890531.getClass(), "errorManager", null);
        setField(term890531, term890531.getClass(), "warningsGuard", null);
        setField(term890531, term890531.getClass(), "injectedLibraries", null);
        setField(term890531, term890531.getClass(), "externsRoot", null);
        setField(term890531, term890531.getClass(), "jsRoot", null);
        setField(term890531, term890531.getClass(), "externAndJsRoot", null);
        setField(term890531, term890531.getClass(), "inputsById", null);
        setField(term890531, term890531.getClass(), "sourceMap", null);
        setField(term890531, term890531.getClass(), "externExports", null);
        setIntField(term890531, term890531.getClass(), "uniqueNameId", 0);
        setBooleanField(term890531, term890531.getClass(), "useThreads", false);
        setBooleanField(term890531, term890531.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890531, term890531.getClass(), "functionInformationMap", null);
        setField(term890531, term890531.getClass(), "debugLog", null);
        setField(term890531, term890531.getClass(), "defaultCodingConvention", null);
        setField(term890531, term890531.getClass(), "typeRegistry", null);
        setField(term890531, term890531.getClass(), "parserConfig", null);
        setField(term890531, term890531.getClass(), "abstractInterpreter", null);
        setField(term890531, term890531.getClass(), "typeValidator", null);
        setField(term890531, term890531.getClass(), "tracker", null);
        setField(term890531, term890531.getClass(), "oldErrorReporter", null);
        setField(term890531, term890531.getClass(), "defaultErrorReporter", null);
        setField(term890531, term890531.getClass(), "outStream", null);
        setField(term890531, term890531.getClass(), "globalRefMap", null);
        setDoubleField(term890531, term890531.getClass(), "progress", 0.0);
        setField(term890531, term890531.getClass(), "sanityCheck", null);
        setField(term890531, term890531.getClass(), "currentTracer", null);
        setField(term890531, term890531.getClass(), "currentPassName", null);
        setIntField(term890531, term890531.getClass(), "syntheticCodeId", 0);
        setField(term890531, term890531.getClass(), "recentChange", null);
        setField(term890531, term890531.getClass(), "codeChangeHandlers", null);
        setField(term890531, term890531.getClass(), "synthesizedExternsInput", null);
        setField(term890531, term890531.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExternsForTesting", argTypes, term890531, args);
    }

};


