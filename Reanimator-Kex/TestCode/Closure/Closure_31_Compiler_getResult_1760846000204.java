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

public class Compiler_getResult_1760846000204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890001;

    public Compiler_getResult_1760846000204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890001 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890001, term890001.getClass(), "options", null);
        setField(term890001, term890001.getClass(), "passes", null);
        setField(term890001, term890001.getClass(), "externs", null);
        setField(term890001, term890001.getClass(), "modules", null);
        setField(term890001, term890001.getClass(), "moduleGraph", null);
        setField(term890001, term890001.getClass(), "inputs", null);
        setField(term890001, term890001.getClass(), "errorManager", null);
        setField(term890001, term890001.getClass(), "warningsGuard", null);
        setField(term890001, term890001.getClass(), "injectedLibraries", null);
        setField(term890001, term890001.getClass(), "externsRoot", null);
        setField(term890001, term890001.getClass(), "jsRoot", null);
        setField(term890001, term890001.getClass(), "externAndJsRoot", null);
        setField(term890001, term890001.getClass(), "inputsById", null);
        setField(term890001, term890001.getClass(), "sourceMap", null);
        setField(term890001, term890001.getClass(), "externExports", null);
        setIntField(term890001, term890001.getClass(), "uniqueNameId", 0);
        setBooleanField(term890001, term890001.getClass(), "useThreads", false);
        setBooleanField(term890001, term890001.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890001, term890001.getClass(), "functionInformationMap", null);
        setField(term890001, term890001.getClass(), "debugLog", null);
        setField(term890001, term890001.getClass(), "defaultCodingConvention", null);
        setField(term890001, term890001.getClass(), "typeRegistry", null);
        setField(term890001, term890001.getClass(), "parserConfig", null);
        setField(term890001, term890001.getClass(), "abstractInterpreter", null);
        setField(term890001, term890001.getClass(), "typeValidator", null);
        setField(term890001, term890001.getClass(), "tracker", null);
        setField(term890001, term890001.getClass(), "oldErrorReporter", null);
        setField(term890001, term890001.getClass(), "defaultErrorReporter", null);
        setField(term890001, term890001.getClass(), "outStream", null);
        setField(term890001, term890001.getClass(), "globalRefMap", null);
        setDoubleField(term890001, term890001.getClass(), "progress", 0.0);
        setField(term890001, term890001.getClass(), "sanityCheck", null);
        setField(term890001, term890001.getClass(), "currentTracer", null);
        setField(term890001, term890001.getClass(), "currentPassName", null);
        setIntField(term890001, term890001.getClass(), "syntheticCodeId", 0);
        setField(term890001, term890001.getClass(), "recentChange", null);
        setField(term890001, term890001.getClass(), "codeChangeHandlers", null);
        setField(term890001, term890001.getClass(), "synthesizedExternsInput", null);
        setField(term890001, term890001.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResult", argTypes, term890001, args);
    }

};


