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

public class Compiler_getProgress_837947735302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997532;

    public Compiler_getProgress_837947735302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997532 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term997532, term997532.getClass(), "options", null);
        setField(term997532, term997532.getClass(), "passes", null);
        setField(term997532, term997532.getClass(), "externs", null);
        setField(term997532, term997532.getClass(), "modules", null);
        setField(term997532, term997532.getClass(), "moduleGraph", null);
        setField(term997532, term997532.getClass(), "inputs", null);
        setField(term997532, term997532.getClass(), "errorManager", null);
        setField(term997532, term997532.getClass(), "warningsGuard", null);
        setField(term997532, term997532.getClass(), "injectedLibraries", null);
        setField(term997532, term997532.getClass(), "externsRoot", null);
        setField(term997532, term997532.getClass(), "jsRoot", null);
        setField(term997532, term997532.getClass(), "externAndJsRoot", null);
        setField(term997532, term997532.getClass(), "inputsById", null);
        setField(term997532, term997532.getClass(), "sourceMap", null);
        setField(term997532, term997532.getClass(), "externExports", null);
        setIntField(term997532, term997532.getClass(), "uniqueNameId", 0);
        setBooleanField(term997532, term997532.getClass(), "useThreads", false);
        setBooleanField(term997532, term997532.getClass(), "hasRegExpGlobalReferences", false);
        setField(term997532, term997532.getClass(), "functionInformationMap", null);
        setField(term997532, term997532.getClass(), "debugLog", null);
        setField(term997532, term997532.getClass(), "defaultCodingConvention", null);
        setField(term997532, term997532.getClass(), "typeRegistry", null);
        setField(term997532, term997532.getClass(), "parserConfig", null);
        setField(term997532, term997532.getClass(), "abstractInterpreter", null);
        setField(term997532, term997532.getClass(), "typeValidator", null);
        setField(term997532, term997532.getClass(), "tracker", null);
        setField(term997532, term997532.getClass(), "oldErrorReporter", null);
        setField(term997532, term997532.getClass(), "defaultErrorReporter", null);
        setField(term997532, term997532.getClass(), "outStream", null);
        setField(term997532, term997532.getClass(), "globalRefMap", null);
        setDoubleField(term997532, term997532.getClass(), "progress", 0.0);
        setField(term997532, term997532.getClass(), "sanityCheck", null);
        setField(term997532, term997532.getClass(), "currentTracer", null);
        setField(term997532, term997532.getClass(), "currentPassName", null);
        setIntField(term997532, term997532.getClass(), "syntheticCodeId", 0);
        setField(term997532, term997532.getClass(), "recentChange", null);
        setField(term997532, term997532.getClass(), "codeChangeHandlers", null);
        setField(term997532, term997532.getClass(), "synthesizedExternsInput", null);
        setField(term997532, term997532.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProgress", argTypes, term997532, args);
    }

};


