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

public class Compiler_parseInputs_973004842229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890151;

    public Compiler_parseInputs_973004842229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890151 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890151, term890151.getClass(), "options", null);
        setField(term890151, term890151.getClass(), "passes", null);
        setField(term890151, term890151.getClass(), "externs", null);
        setField(term890151, term890151.getClass(), "modules", null);
        setField(term890151, term890151.getClass(), "moduleGraph", null);
        setField(term890151, term890151.getClass(), "inputs", null);
        setField(term890151, term890151.getClass(), "errorManager", null);
        setField(term890151, term890151.getClass(), "warningsGuard", null);
        setField(term890151, term890151.getClass(), "injectedLibraries", null);
        setField(term890151, term890151.getClass(), "externsRoot", null);
        setField(term890151, term890151.getClass(), "jsRoot", null);
        setField(term890151, term890151.getClass(), "externAndJsRoot", null);
        setField(term890151, term890151.getClass(), "inputsById", null);
        setField(term890151, term890151.getClass(), "sourceMap", null);
        setField(term890151, term890151.getClass(), "externExports", null);
        setIntField(term890151, term890151.getClass(), "uniqueNameId", 0);
        setBooleanField(term890151, term890151.getClass(), "useThreads", false);
        setBooleanField(term890151, term890151.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890151, term890151.getClass(), "functionInformationMap", null);
        setField(term890151, term890151.getClass(), "debugLog", null);
        setField(term890151, term890151.getClass(), "defaultCodingConvention", null);
        setField(term890151, term890151.getClass(), "typeRegistry", null);
        setField(term890151, term890151.getClass(), "parserConfig", null);
        setField(term890151, term890151.getClass(), "abstractInterpreter", null);
        setField(term890151, term890151.getClass(), "typeValidator", null);
        setField(term890151, term890151.getClass(), "tracker", null);
        setField(term890151, term890151.getClass(), "oldErrorReporter", null);
        setField(term890151, term890151.getClass(), "defaultErrorReporter", null);
        setField(term890151, term890151.getClass(), "outStream", null);
        setField(term890151, term890151.getClass(), "globalRefMap", null);
        setDoubleField(term890151, term890151.getClass(), "progress", 0.0);
        setField(term890151, term890151.getClass(), "sanityCheck", null);
        setField(term890151, term890151.getClass(), "currentTracer", null);
        setField(term890151, term890151.getClass(), "currentPassName", null);
        setIntField(term890151, term890151.getClass(), "syntheticCodeId", 0);
        setField(term890151, term890151.getClass(), "recentChange", null);
        setField(term890151, term890151.getClass(), "codeChangeHandlers", null);
        setField(term890151, term890151.getClass(), "synthesizedExternsInput", null);
        setField(term890151, term890151.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parseInputs", argTypes, term890151, args);
    }

};


