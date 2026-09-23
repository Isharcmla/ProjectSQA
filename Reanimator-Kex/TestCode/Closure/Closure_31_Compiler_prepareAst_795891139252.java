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

public class Compiler_prepareAst_795891139252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890293;

    public Compiler_prepareAst_795891139252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890293 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890293, term890293.getClass(), "options", null);
        setField(term890293, term890293.getClass(), "passes", null);
        setField(term890293, term890293.getClass(), "externs", null);
        setField(term890293, term890293.getClass(), "modules", null);
        setField(term890293, term890293.getClass(), "moduleGraph", null);
        setField(term890293, term890293.getClass(), "inputs", null);
        setField(term890293, term890293.getClass(), "errorManager", null);
        setField(term890293, term890293.getClass(), "warningsGuard", null);
        setField(term890293, term890293.getClass(), "injectedLibraries", null);
        setField(term890293, term890293.getClass(), "externsRoot", null);
        setField(term890293, term890293.getClass(), "jsRoot", null);
        setField(term890293, term890293.getClass(), "externAndJsRoot", null);
        setField(term890293, term890293.getClass(), "inputsById", null);
        setField(term890293, term890293.getClass(), "sourceMap", null);
        setField(term890293, term890293.getClass(), "externExports", null);
        setIntField(term890293, term890293.getClass(), "uniqueNameId", 0);
        setBooleanField(term890293, term890293.getClass(), "useThreads", false);
        setBooleanField(term890293, term890293.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890293, term890293.getClass(), "functionInformationMap", null);
        setField(term890293, term890293.getClass(), "debugLog", null);
        setField(term890293, term890293.getClass(), "defaultCodingConvention", null);
        setField(term890293, term890293.getClass(), "typeRegistry", null);
        setField(term890293, term890293.getClass(), "parserConfig", null);
        setField(term890293, term890293.getClass(), "abstractInterpreter", null);
        setField(term890293, term890293.getClass(), "typeValidator", null);
        setField(term890293, term890293.getClass(), "tracker", null);
        setField(term890293, term890293.getClass(), "oldErrorReporter", null);
        setField(term890293, term890293.getClass(), "defaultErrorReporter", null);
        setField(term890293, term890293.getClass(), "outStream", null);
        setField(term890293, term890293.getClass(), "globalRefMap", null);
        setDoubleField(term890293, term890293.getClass(), "progress", 0.0);
        setField(term890293, term890293.getClass(), "sanityCheck", null);
        setField(term890293, term890293.getClass(), "currentTracer", null);
        setField(term890293, term890293.getClass(), "currentPassName", null);
        setIntField(term890293, term890293.getClass(), "syntheticCodeId", 0);
        setField(term890293, term890293.getClass(), "recentChange", null);
        setField(term890293, term890293.getClass(), "codeChangeHandlers", null);
        setField(term890293, term890293.getClass(), "synthesizedExternsInput", null);
        setField(term890293, term890293.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "prepareAst", argTypes, term890293, args);
    }

};


