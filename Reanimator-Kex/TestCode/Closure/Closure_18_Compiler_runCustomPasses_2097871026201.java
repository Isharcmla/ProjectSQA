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

public class Compiler_runCustomPasses_2097871026201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term996916;

    public Compiler_runCustomPasses_2097871026201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term996916 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term996916, term996916.getClass(), "options", null);
        setField(term996916, term996916.getClass(), "passes", null);
        setField(term996916, term996916.getClass(), "externs", null);
        setField(term996916, term996916.getClass(), "modules", null);
        setField(term996916, term996916.getClass(), "moduleGraph", null);
        setField(term996916, term996916.getClass(), "inputs", null);
        setField(term996916, term996916.getClass(), "errorManager", null);
        setField(term996916, term996916.getClass(), "warningsGuard", null);
        setField(term996916, term996916.getClass(), "injectedLibraries", null);
        setField(term996916, term996916.getClass(), "externsRoot", null);
        setField(term996916, term996916.getClass(), "jsRoot", null);
        setField(term996916, term996916.getClass(), "externAndJsRoot", null);
        setField(term996916, term996916.getClass(), "inputsById", null);
        setField(term996916, term996916.getClass(), "sourceMap", null);
        setField(term996916, term996916.getClass(), "externExports", null);
        setIntField(term996916, term996916.getClass(), "uniqueNameId", 0);
        setBooleanField(term996916, term996916.getClass(), "useThreads", false);
        setBooleanField(term996916, term996916.getClass(), "hasRegExpGlobalReferences", false);
        setField(term996916, term996916.getClass(), "functionInformationMap", null);
        setField(term996916, term996916.getClass(), "debugLog", null);
        setField(term996916, term996916.getClass(), "defaultCodingConvention", null);
        setField(term996916, term996916.getClass(), "typeRegistry", null);
        setField(term996916, term996916.getClass(), "parserConfig", null);
        setField(term996916, term996916.getClass(), "abstractInterpreter", null);
        setField(term996916, term996916.getClass(), "typeValidator", null);
        setField(term996916, term996916.getClass(), "tracker", null);
        setField(term996916, term996916.getClass(), "oldErrorReporter", null);
        setField(term996916, term996916.getClass(), "defaultErrorReporter", null);
        setField(term996916, term996916.getClass(), "outStream", null);
        setField(term996916, term996916.getClass(), "globalRefMap", null);
        setDoubleField(term996916, term996916.getClass(), "progress", 0.0);
        setField(term996916, term996916.getClass(), "sanityCheck", null);
        setField(term996916, term996916.getClass(), "currentTracer", null);
        setField(term996916, term996916.getClass(), "currentPassName", null);
        setIntField(term996916, term996916.getClass(), "syntheticCodeId", 0);
        setField(term996916, term996916.getClass(), "recentChange", null);
        setField(term996916, term996916.getClass(), "codeChangeHandlers", null);
        setField(term996916, term996916.getClass(), "synthesizedExternsInput", null);
        setField(term996916, term996916.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CustomPassExecutionTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "runCustomPasses", argTypes, term996916, args);
    }

};


