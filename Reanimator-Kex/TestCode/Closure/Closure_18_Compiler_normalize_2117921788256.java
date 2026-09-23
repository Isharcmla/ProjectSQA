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

public class Compiler_normalize_2117921788256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997250;

    public Compiler_normalize_2117921788256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997250 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term997250, term997250.getClass(), "options", null);
        setField(term997250, term997250.getClass(), "passes", null);
        setField(term997250, term997250.getClass(), "externs", null);
        setField(term997250, term997250.getClass(), "modules", null);
        setField(term997250, term997250.getClass(), "moduleGraph", null);
        setField(term997250, term997250.getClass(), "inputs", null);
        setField(term997250, term997250.getClass(), "errorManager", null);
        setField(term997250, term997250.getClass(), "warningsGuard", null);
        setField(term997250, term997250.getClass(), "injectedLibraries", null);
        setField(term997250, term997250.getClass(), "externsRoot", null);
        setField(term997250, term997250.getClass(), "jsRoot", null);
        setField(term997250, term997250.getClass(), "externAndJsRoot", null);
        setField(term997250, term997250.getClass(), "inputsById", null);
        setField(term997250, term997250.getClass(), "sourceMap", null);
        setField(term997250, term997250.getClass(), "externExports", null);
        setIntField(term997250, term997250.getClass(), "uniqueNameId", 0);
        setBooleanField(term997250, term997250.getClass(), "useThreads", false);
        setBooleanField(term997250, term997250.getClass(), "hasRegExpGlobalReferences", false);
        setField(term997250, term997250.getClass(), "functionInformationMap", null);
        setField(term997250, term997250.getClass(), "debugLog", null);
        setField(term997250, term997250.getClass(), "defaultCodingConvention", null);
        setField(term997250, term997250.getClass(), "typeRegistry", null);
        setField(term997250, term997250.getClass(), "parserConfig", null);
        setField(term997250, term997250.getClass(), "abstractInterpreter", null);
        setField(term997250, term997250.getClass(), "typeValidator", null);
        setField(term997250, term997250.getClass(), "tracker", null);
        setField(term997250, term997250.getClass(), "oldErrorReporter", null);
        setField(term997250, term997250.getClass(), "defaultErrorReporter", null);
        setField(term997250, term997250.getClass(), "outStream", null);
        setField(term997250, term997250.getClass(), "globalRefMap", null);
        setDoubleField(term997250, term997250.getClass(), "progress", 0.0);
        setField(term997250, term997250.getClass(), "sanityCheck", null);
        setField(term997250, term997250.getClass(), "currentTracer", null);
        setField(term997250, term997250.getClass(), "currentPassName", null);
        setIntField(term997250, term997250.getClass(), "syntheticCodeId", 0);
        setField(term997250, term997250.getClass(), "recentChange", null);
        setField(term997250, term997250.getClass(), "codeChangeHandlers", null);
        setField(term997250, term997250.getClass(), "synthesizedExternsInput", null);
        setField(term997250, term997250.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "normalize", argTypes, term997250, args);
    }

};


