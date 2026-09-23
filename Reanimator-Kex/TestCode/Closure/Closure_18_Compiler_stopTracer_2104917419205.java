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

public class Compiler_stopTracer_2104917419205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term996940;

    public Compiler_stopTracer_2104917419205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term996940 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term996940, term996940.getClass(), "options", null);
        setField(term996940, term996940.getClass(), "passes", null);
        setField(term996940, term996940.getClass(), "externs", null);
        setField(term996940, term996940.getClass(), "modules", null);
        setField(term996940, term996940.getClass(), "moduleGraph", null);
        setField(term996940, term996940.getClass(), "inputs", null);
        setField(term996940, term996940.getClass(), "errorManager", null);
        setField(term996940, term996940.getClass(), "warningsGuard", null);
        setField(term996940, term996940.getClass(), "injectedLibraries", null);
        setField(term996940, term996940.getClass(), "externsRoot", null);
        setField(term996940, term996940.getClass(), "jsRoot", null);
        setField(term996940, term996940.getClass(), "externAndJsRoot", null);
        setField(term996940, term996940.getClass(), "inputsById", null);
        setField(term996940, term996940.getClass(), "sourceMap", null);
        setField(term996940, term996940.getClass(), "externExports", null);
        setIntField(term996940, term996940.getClass(), "uniqueNameId", 0);
        setBooleanField(term996940, term996940.getClass(), "useThreads", false);
        setBooleanField(term996940, term996940.getClass(), "hasRegExpGlobalReferences", false);
        setField(term996940, term996940.getClass(), "functionInformationMap", null);
        setField(term996940, term996940.getClass(), "debugLog", null);
        setField(term996940, term996940.getClass(), "defaultCodingConvention", null);
        setField(term996940, term996940.getClass(), "typeRegistry", null);
        setField(term996940, term996940.getClass(), "parserConfig", null);
        setField(term996940, term996940.getClass(), "abstractInterpreter", null);
        setField(term996940, term996940.getClass(), "typeValidator", null);
        setField(term996940, term996940.getClass(), "tracker", null);
        setField(term996940, term996940.getClass(), "oldErrorReporter", null);
        setField(term996940, term996940.getClass(), "defaultErrorReporter", null);
        setField(term996940, term996940.getClass(), "outStream", null);
        setField(term996940, term996940.getClass(), "globalRefMap", null);
        setDoubleField(term996940, term996940.getClass(), "progress", 0.0);
        setField(term996940, term996940.getClass(), "sanityCheck", null);
        setField(term996940, term996940.getClass(), "currentTracer", null);
        setField(term996940, term996940.getClass(), "currentPassName", null);
        setIntField(term996940, term996940.getClass(), "syntheticCodeId", 0);
        setField(term996940, term996940.getClass(), "recentChange", null);
        setField(term996940, term996940.getClass(), "codeChangeHandlers", null);
        setField(term996940, term996940.getClass(), "synthesizedExternsInput", null);
        setField(term996940, term996940.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Tracer");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "stopTracer", argTypes, term996940, args);
    }

};


