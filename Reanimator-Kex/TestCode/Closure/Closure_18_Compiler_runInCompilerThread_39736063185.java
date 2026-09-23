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

public class Compiler_runInCompilerThread_39736063185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term996816;

    public Compiler_runInCompilerThread_39736063185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term996816 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term996816, term996816.getClass(), "options", null);
        setField(term996816, term996816.getClass(), "passes", null);
        setField(term996816, term996816.getClass(), "externs", null);
        setField(term996816, term996816.getClass(), "modules", null);
        setField(term996816, term996816.getClass(), "moduleGraph", null);
        setField(term996816, term996816.getClass(), "inputs", null);
        setField(term996816, term996816.getClass(), "errorManager", null);
        setField(term996816, term996816.getClass(), "warningsGuard", null);
        setField(term996816, term996816.getClass(), "injectedLibraries", null);
        setField(term996816, term996816.getClass(), "externsRoot", null);
        setField(term996816, term996816.getClass(), "jsRoot", null);
        setField(term996816, term996816.getClass(), "externAndJsRoot", null);
        setField(term996816, term996816.getClass(), "inputsById", null);
        setField(term996816, term996816.getClass(), "sourceMap", null);
        setField(term996816, term996816.getClass(), "externExports", null);
        setIntField(term996816, term996816.getClass(), "uniqueNameId", 0);
        setBooleanField(term996816, term996816.getClass(), "useThreads", false);
        setBooleanField(term996816, term996816.getClass(), "hasRegExpGlobalReferences", false);
        setField(term996816, term996816.getClass(), "functionInformationMap", null);
        setField(term996816, term996816.getClass(), "debugLog", null);
        setField(term996816, term996816.getClass(), "defaultCodingConvention", null);
        setField(term996816, term996816.getClass(), "typeRegistry", null);
        setField(term996816, term996816.getClass(), "parserConfig", null);
        setField(term996816, term996816.getClass(), "abstractInterpreter", null);
        setField(term996816, term996816.getClass(), "typeValidator", null);
        setField(term996816, term996816.getClass(), "tracker", null);
        setField(term996816, term996816.getClass(), "oldErrorReporter", null);
        setField(term996816, term996816.getClass(), "defaultErrorReporter", null);
        setField(term996816, term996816.getClass(), "outStream", null);
        setField(term996816, term996816.getClass(), "globalRefMap", null);
        setDoubleField(term996816, term996816.getClass(), "progress", 0.0);
        setField(term996816, term996816.getClass(), "sanityCheck", null);
        setField(term996816, term996816.getClass(), "currentTracer", null);
        setField(term996816, term996816.getClass(), "currentPassName", null);
        setIntField(term996816, term996816.getClass(), "syntheticCodeId", 0);
        setField(term996816, term996816.getClass(), "recentChange", null);
        setField(term996816, term996816.getClass(), "codeChangeHandlers", null);
        setField(term996816, term996816.getClass(), "synthesizedExternsInput", null);
        setField(term996816, term996816.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.concurrent.Callable");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "runInCompilerThread", argTypes, term996816, args);
    }

};


