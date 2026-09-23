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

public class Compiler_getDegenerateModuleGraph_372820491221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890103;

    public Compiler_getDegenerateModuleGraph_372820491221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890103 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890103, term890103.getClass(), "options", null);
        setField(term890103, term890103.getClass(), "passes", null);
        setField(term890103, term890103.getClass(), "externs", null);
        setField(term890103, term890103.getClass(), "modules", null);
        setField(term890103, term890103.getClass(), "moduleGraph", null);
        setField(term890103, term890103.getClass(), "inputs", null);
        setField(term890103, term890103.getClass(), "errorManager", null);
        setField(term890103, term890103.getClass(), "warningsGuard", null);
        setField(term890103, term890103.getClass(), "injectedLibraries", null);
        setField(term890103, term890103.getClass(), "externsRoot", null);
        setField(term890103, term890103.getClass(), "jsRoot", null);
        setField(term890103, term890103.getClass(), "externAndJsRoot", null);
        setField(term890103, term890103.getClass(), "inputsById", null);
        setField(term890103, term890103.getClass(), "sourceMap", null);
        setField(term890103, term890103.getClass(), "externExports", null);
        setIntField(term890103, term890103.getClass(), "uniqueNameId", 0);
        setBooleanField(term890103, term890103.getClass(), "useThreads", false);
        setBooleanField(term890103, term890103.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890103, term890103.getClass(), "functionInformationMap", null);
        setField(term890103, term890103.getClass(), "debugLog", null);
        setField(term890103, term890103.getClass(), "defaultCodingConvention", null);
        setField(term890103, term890103.getClass(), "typeRegistry", null);
        setField(term890103, term890103.getClass(), "parserConfig", null);
        setField(term890103, term890103.getClass(), "abstractInterpreter", null);
        setField(term890103, term890103.getClass(), "typeValidator", null);
        setField(term890103, term890103.getClass(), "tracker", null);
        setField(term890103, term890103.getClass(), "oldErrorReporter", null);
        setField(term890103, term890103.getClass(), "defaultErrorReporter", null);
        setField(term890103, term890103.getClass(), "outStream", null);
        setField(term890103, term890103.getClass(), "globalRefMap", null);
        setDoubleField(term890103, term890103.getClass(), "progress", 0.0);
        setField(term890103, term890103.getClass(), "sanityCheck", null);
        setField(term890103, term890103.getClass(), "currentTracer", null);
        setField(term890103, term890103.getClass(), "currentPassName", null);
        setIntField(term890103, term890103.getClass(), "syntheticCodeId", 0);
        setField(term890103, term890103.getClass(), "recentChange", null);
        setField(term890103, term890103.getClass(), "codeChangeHandlers", null);
        setField(term890103, term890103.getClass(), "synthesizedExternsInput", null);
        setField(term890103, term890103.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDegenerateModuleGraph", argTypes, term890103, args);
    }

};


