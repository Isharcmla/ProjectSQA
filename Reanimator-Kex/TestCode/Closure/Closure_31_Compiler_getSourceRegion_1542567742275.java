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
import java.lang.Integer;

public class Compiler_getSourceRegion_1542567742275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890433;
     Object term890439;

    public Compiler_getSourceRegion_1542567742275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890433 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890433, term890433.getClass(), "options", null);
        setField(term890433, term890433.getClass(), "passes", null);
        setField(term890433, term890433.getClass(), "externs", null);
        setField(term890433, term890433.getClass(), "modules", null);
        setField(term890433, term890433.getClass(), "moduleGraph", null);
        setField(term890433, term890433.getClass(), "inputs", null);
        setField(term890433, term890433.getClass(), "errorManager", null);
        setField(term890433, term890433.getClass(), "warningsGuard", null);
        setField(term890433, term890433.getClass(), "injectedLibraries", null);
        setField(term890433, term890433.getClass(), "externsRoot", null);
        setField(term890433, term890433.getClass(), "jsRoot", null);
        setField(term890433, term890433.getClass(), "externAndJsRoot", null);
        setField(term890433, term890433.getClass(), "inputsById", null);
        setField(term890433, term890433.getClass(), "sourceMap", null);
        setField(term890433, term890433.getClass(), "externExports", null);
        setIntField(term890433, term890433.getClass(), "uniqueNameId", 0);
        setBooleanField(term890433, term890433.getClass(), "useThreads", false);
        setBooleanField(term890433, term890433.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890433, term890433.getClass(), "functionInformationMap", null);
        setField(term890433, term890433.getClass(), "debugLog", null);
        setField(term890433, term890433.getClass(), "defaultCodingConvention", null);
        setField(term890433, term890433.getClass(), "typeRegistry", null);
        setField(term890433, term890433.getClass(), "parserConfig", null);
        setField(term890433, term890433.getClass(), "abstractInterpreter", null);
        setField(term890433, term890433.getClass(), "typeValidator", null);
        setField(term890433, term890433.getClass(), "tracker", null);
        setField(term890433, term890433.getClass(), "oldErrorReporter", null);
        setField(term890433, term890433.getClass(), "defaultErrorReporter", null);
        setField(term890433, term890433.getClass(), "outStream", null);
        setField(term890433, term890433.getClass(), "globalRefMap", null);
        setDoubleField(term890433, term890433.getClass(), "progress", 0.0);
        setField(term890433, term890433.getClass(), "sanityCheck", null);
        setField(term890433, term890433.getClass(), "currentTracer", null);
        setField(term890433, term890433.getClass(), "currentPassName", null);
        setIntField(term890433, term890433.getClass(), "syntheticCodeId", 0);
        setField(term890433, term890433.getClass(), "recentChange", null);
        setField(term890433, term890433.getClass(), "codeChangeHandlers", null);
        setField(term890433, term890433.getClass(), "synthesizedExternsInput", null);
        setField(term890433, term890433.getClass(), "stage", null);
        term890439 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term890439;
        callMethod(klass, "getSourceRegion", argTypes, term890433, args);
    }

};


