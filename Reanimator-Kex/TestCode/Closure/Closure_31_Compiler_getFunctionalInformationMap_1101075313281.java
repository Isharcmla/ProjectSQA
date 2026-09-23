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

public class Compiler_getFunctionalInformationMap_1101075313281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890471;

    public Compiler_getFunctionalInformationMap_1101075313281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890471 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890471, term890471.getClass(), "options", null);
        setField(term890471, term890471.getClass(), "passes", null);
        setField(term890471, term890471.getClass(), "externs", null);
        setField(term890471, term890471.getClass(), "modules", null);
        setField(term890471, term890471.getClass(), "moduleGraph", null);
        setField(term890471, term890471.getClass(), "inputs", null);
        setField(term890471, term890471.getClass(), "errorManager", null);
        setField(term890471, term890471.getClass(), "warningsGuard", null);
        setField(term890471, term890471.getClass(), "injectedLibraries", null);
        setField(term890471, term890471.getClass(), "externsRoot", null);
        setField(term890471, term890471.getClass(), "jsRoot", null);
        setField(term890471, term890471.getClass(), "externAndJsRoot", null);
        setField(term890471, term890471.getClass(), "inputsById", null);
        setField(term890471, term890471.getClass(), "sourceMap", null);
        setField(term890471, term890471.getClass(), "externExports", null);
        setIntField(term890471, term890471.getClass(), "uniqueNameId", 0);
        setBooleanField(term890471, term890471.getClass(), "useThreads", false);
        setBooleanField(term890471, term890471.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890471, term890471.getClass(), "functionInformationMap", null);
        setField(term890471, term890471.getClass(), "debugLog", null);
        setField(term890471, term890471.getClass(), "defaultCodingConvention", null);
        setField(term890471, term890471.getClass(), "typeRegistry", null);
        setField(term890471, term890471.getClass(), "parserConfig", null);
        setField(term890471, term890471.getClass(), "abstractInterpreter", null);
        setField(term890471, term890471.getClass(), "typeValidator", null);
        setField(term890471, term890471.getClass(), "tracker", null);
        setField(term890471, term890471.getClass(), "oldErrorReporter", null);
        setField(term890471, term890471.getClass(), "defaultErrorReporter", null);
        setField(term890471, term890471.getClass(), "outStream", null);
        setField(term890471, term890471.getClass(), "globalRefMap", null);
        setDoubleField(term890471, term890471.getClass(), "progress", 0.0);
        setField(term890471, term890471.getClass(), "sanityCheck", null);
        setField(term890471, term890471.getClass(), "currentTracer", null);
        setField(term890471, term890471.getClass(), "currentPassName", null);
        setIntField(term890471, term890471.getClass(), "syntheticCodeId", 0);
        setField(term890471, term890471.getClass(), "recentChange", null);
        setField(term890471, term890471.getClass(), "codeChangeHandlers", null);
        setField(term890471, term890471.getClass(), "synthesizedExternsInput", null);
        setField(term890471, term890471.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFunctionalInformationMap", argTypes, term890471, args);
    }

};


