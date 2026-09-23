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

public class Compiler_precheck_1623370328193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term996868;

    public Compiler_precheck_1623370328193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term996868 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term996868, term996868.getClass(), "options", null);
        setField(term996868, term996868.getClass(), "passes", null);
        setField(term996868, term996868.getClass(), "externs", null);
        setField(term996868, term996868.getClass(), "modules", null);
        setField(term996868, term996868.getClass(), "moduleGraph", null);
        setField(term996868, term996868.getClass(), "inputs", null);
        setField(term996868, term996868.getClass(), "errorManager", null);
        setField(term996868, term996868.getClass(), "warningsGuard", null);
        setField(term996868, term996868.getClass(), "injectedLibraries", null);
        setField(term996868, term996868.getClass(), "externsRoot", null);
        setField(term996868, term996868.getClass(), "jsRoot", null);
        setField(term996868, term996868.getClass(), "externAndJsRoot", null);
        setField(term996868, term996868.getClass(), "inputsById", null);
        setField(term996868, term996868.getClass(), "sourceMap", null);
        setField(term996868, term996868.getClass(), "externExports", null);
        setIntField(term996868, term996868.getClass(), "uniqueNameId", 0);
        setBooleanField(term996868, term996868.getClass(), "useThreads", false);
        setBooleanField(term996868, term996868.getClass(), "hasRegExpGlobalReferences", false);
        setField(term996868, term996868.getClass(), "functionInformationMap", null);
        setField(term996868, term996868.getClass(), "debugLog", null);
        setField(term996868, term996868.getClass(), "defaultCodingConvention", null);
        setField(term996868, term996868.getClass(), "typeRegistry", null);
        setField(term996868, term996868.getClass(), "parserConfig", null);
        setField(term996868, term996868.getClass(), "abstractInterpreter", null);
        setField(term996868, term996868.getClass(), "typeValidator", null);
        setField(term996868, term996868.getClass(), "tracker", null);
        setField(term996868, term996868.getClass(), "oldErrorReporter", null);
        setField(term996868, term996868.getClass(), "defaultErrorReporter", null);
        setField(term996868, term996868.getClass(), "outStream", null);
        setField(term996868, term996868.getClass(), "globalRefMap", null);
        setDoubleField(term996868, term996868.getClass(), "progress", 0.0);
        setField(term996868, term996868.getClass(), "sanityCheck", null);
        setField(term996868, term996868.getClass(), "currentTracer", null);
        setField(term996868, term996868.getClass(), "currentPassName", null);
        setIntField(term996868, term996868.getClass(), "syntheticCodeId", 0);
        setField(term996868, term996868.getClass(), "recentChange", null);
        setField(term996868, term996868.getClass(), "codeChangeHandlers", null);
        setField(term996868, term996868.getClass(), "synthesizedExternsInput", null);
        setField(term996868, term996868.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "precheck", argTypes, term996868, args);
    }

};


