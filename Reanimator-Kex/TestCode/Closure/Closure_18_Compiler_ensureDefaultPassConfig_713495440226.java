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

public class Compiler_ensureDefaultPassConfig_713495440226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997066;

    public Compiler_ensureDefaultPassConfig_713495440226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997066 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term997066, term997066.getClass(), "options", null);
        setField(term997066, term997066.getClass(), "passes", null);
        setField(term997066, term997066.getClass(), "externs", null);
        setField(term997066, term997066.getClass(), "modules", null);
        setField(term997066, term997066.getClass(), "moduleGraph", null);
        setField(term997066, term997066.getClass(), "inputs", null);
        setField(term997066, term997066.getClass(), "errorManager", null);
        setField(term997066, term997066.getClass(), "warningsGuard", null);
        setField(term997066, term997066.getClass(), "injectedLibraries", null);
        setField(term997066, term997066.getClass(), "externsRoot", null);
        setField(term997066, term997066.getClass(), "jsRoot", null);
        setField(term997066, term997066.getClass(), "externAndJsRoot", null);
        setField(term997066, term997066.getClass(), "inputsById", null);
        setField(term997066, term997066.getClass(), "sourceMap", null);
        setField(term997066, term997066.getClass(), "externExports", null);
        setIntField(term997066, term997066.getClass(), "uniqueNameId", 0);
        setBooleanField(term997066, term997066.getClass(), "useThreads", false);
        setBooleanField(term997066, term997066.getClass(), "hasRegExpGlobalReferences", false);
        setField(term997066, term997066.getClass(), "functionInformationMap", null);
        setField(term997066, term997066.getClass(), "debugLog", null);
        setField(term997066, term997066.getClass(), "defaultCodingConvention", null);
        setField(term997066, term997066.getClass(), "typeRegistry", null);
        setField(term997066, term997066.getClass(), "parserConfig", null);
        setField(term997066, term997066.getClass(), "abstractInterpreter", null);
        setField(term997066, term997066.getClass(), "typeValidator", null);
        setField(term997066, term997066.getClass(), "tracker", null);
        setField(term997066, term997066.getClass(), "oldErrorReporter", null);
        setField(term997066, term997066.getClass(), "defaultErrorReporter", null);
        setField(term997066, term997066.getClass(), "outStream", null);
        setField(term997066, term997066.getClass(), "globalRefMap", null);
        setDoubleField(term997066, term997066.getClass(), "progress", 0.0);
        setField(term997066, term997066.getClass(), "sanityCheck", null);
        setField(term997066, term997066.getClass(), "currentTracer", null);
        setField(term997066, term997066.getClass(), "currentPassName", null);
        setIntField(term997066, term997066.getClass(), "syntheticCodeId", 0);
        setField(term997066, term997066.getClass(), "recentChange", null);
        setField(term997066, term997066.getClass(), "codeChangeHandlers", null);
        setField(term997066, term997066.getClass(), "synthesizedExternsInput", null);
        setField(term997066, term997066.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "ensureDefaultPassConfig", argTypes, term997066, args);
    }

};


