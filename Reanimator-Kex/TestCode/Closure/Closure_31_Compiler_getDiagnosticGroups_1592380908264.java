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

public class Compiler_getDiagnosticGroups_1592380908264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890365;

    public Compiler_getDiagnosticGroups_1592380908264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890365 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890365, term890365.getClass(), "options", null);
        setField(term890365, term890365.getClass(), "passes", null);
        setField(term890365, term890365.getClass(), "externs", null);
        setField(term890365, term890365.getClass(), "modules", null);
        setField(term890365, term890365.getClass(), "moduleGraph", null);
        setField(term890365, term890365.getClass(), "inputs", null);
        setField(term890365, term890365.getClass(), "errorManager", null);
        setField(term890365, term890365.getClass(), "warningsGuard", null);
        setField(term890365, term890365.getClass(), "injectedLibraries", null);
        setField(term890365, term890365.getClass(), "externsRoot", null);
        setField(term890365, term890365.getClass(), "jsRoot", null);
        setField(term890365, term890365.getClass(), "externAndJsRoot", null);
        setField(term890365, term890365.getClass(), "inputsById", null);
        setField(term890365, term890365.getClass(), "sourceMap", null);
        setField(term890365, term890365.getClass(), "externExports", null);
        setIntField(term890365, term890365.getClass(), "uniqueNameId", 0);
        setBooleanField(term890365, term890365.getClass(), "useThreads", false);
        setBooleanField(term890365, term890365.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890365, term890365.getClass(), "functionInformationMap", null);
        setField(term890365, term890365.getClass(), "debugLog", null);
        setField(term890365, term890365.getClass(), "defaultCodingConvention", null);
        setField(term890365, term890365.getClass(), "typeRegistry", null);
        setField(term890365, term890365.getClass(), "parserConfig", null);
        setField(term890365, term890365.getClass(), "abstractInterpreter", null);
        setField(term890365, term890365.getClass(), "typeValidator", null);
        setField(term890365, term890365.getClass(), "tracker", null);
        setField(term890365, term890365.getClass(), "oldErrorReporter", null);
        setField(term890365, term890365.getClass(), "defaultErrorReporter", null);
        setField(term890365, term890365.getClass(), "outStream", null);
        setField(term890365, term890365.getClass(), "globalRefMap", null);
        setDoubleField(term890365, term890365.getClass(), "progress", 0.0);
        setField(term890365, term890365.getClass(), "sanityCheck", null);
        setField(term890365, term890365.getClass(), "currentTracer", null);
        setField(term890365, term890365.getClass(), "currentPassName", null);
        setIntField(term890365, term890365.getClass(), "syntheticCodeId", 0);
        setField(term890365, term890365.getClass(), "recentChange", null);
        setField(term890365, term890365.getClass(), "codeChangeHandlers", null);
        setField(term890365, term890365.getClass(), "synthesizedExternsInput", null);
        setField(term890365, term890365.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDiagnosticGroups", argTypes, term890365, args);
    }

};


