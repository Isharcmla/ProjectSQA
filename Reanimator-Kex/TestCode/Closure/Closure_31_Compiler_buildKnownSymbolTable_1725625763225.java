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

public class Compiler_buildKnownSymbolTable_1725625763225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890127;

    public Compiler_buildKnownSymbolTable_1725625763225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890127 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term890127, term890127.getClass(), "options", null);
        setField(term890127, term890127.getClass(), "passes", null);
        setField(term890127, term890127.getClass(), "externs", null);
        setField(term890127, term890127.getClass(), "modules", null);
        setField(term890127, term890127.getClass(), "moduleGraph", null);
        setField(term890127, term890127.getClass(), "inputs", null);
        setField(term890127, term890127.getClass(), "errorManager", null);
        setField(term890127, term890127.getClass(), "warningsGuard", null);
        setField(term890127, term890127.getClass(), "injectedLibraries", null);
        setField(term890127, term890127.getClass(), "externsRoot", null);
        setField(term890127, term890127.getClass(), "jsRoot", null);
        setField(term890127, term890127.getClass(), "externAndJsRoot", null);
        setField(term890127, term890127.getClass(), "inputsById", null);
        setField(term890127, term890127.getClass(), "sourceMap", null);
        setField(term890127, term890127.getClass(), "externExports", null);
        setIntField(term890127, term890127.getClass(), "uniqueNameId", 0);
        setBooleanField(term890127, term890127.getClass(), "useThreads", false);
        setBooleanField(term890127, term890127.getClass(), "hasRegExpGlobalReferences", false);
        setField(term890127, term890127.getClass(), "functionInformationMap", null);
        setField(term890127, term890127.getClass(), "debugLog", null);
        setField(term890127, term890127.getClass(), "defaultCodingConvention", null);
        setField(term890127, term890127.getClass(), "typeRegistry", null);
        setField(term890127, term890127.getClass(), "parserConfig", null);
        setField(term890127, term890127.getClass(), "abstractInterpreter", null);
        setField(term890127, term890127.getClass(), "typeValidator", null);
        setField(term890127, term890127.getClass(), "tracker", null);
        setField(term890127, term890127.getClass(), "oldErrorReporter", null);
        setField(term890127, term890127.getClass(), "defaultErrorReporter", null);
        setField(term890127, term890127.getClass(), "outStream", null);
        setField(term890127, term890127.getClass(), "globalRefMap", null);
        setDoubleField(term890127, term890127.getClass(), "progress", 0.0);
        setField(term890127, term890127.getClass(), "sanityCheck", null);
        setField(term890127, term890127.getClass(), "currentTracer", null);
        setField(term890127, term890127.getClass(), "currentPassName", null);
        setIntField(term890127, term890127.getClass(), "syntheticCodeId", 0);
        setField(term890127, term890127.getClass(), "recentChange", null);
        setField(term890127, term890127.getClass(), "codeChangeHandlers", null);
        setField(term890127, term890127.getClass(), "synthesizedExternsInput", null);
        setField(term890127, term890127.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildKnownSymbolTable", argTypes, term890127, args);
    }

};


