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

public class Compiler_endPass_360379197203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term996928;

    public Compiler_endPass_360379197203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term996928 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term996928, term996928.getClass(), "options", null);
        setField(term996928, term996928.getClass(), "passes", null);
        setField(term996928, term996928.getClass(), "externs", null);
        setField(term996928, term996928.getClass(), "modules", null);
        setField(term996928, term996928.getClass(), "moduleGraph", null);
        setField(term996928, term996928.getClass(), "inputs", null);
        setField(term996928, term996928.getClass(), "errorManager", null);
        setField(term996928, term996928.getClass(), "warningsGuard", null);
        setField(term996928, term996928.getClass(), "injectedLibraries", null);
        setField(term996928, term996928.getClass(), "externsRoot", null);
        setField(term996928, term996928.getClass(), "jsRoot", null);
        setField(term996928, term996928.getClass(), "externAndJsRoot", null);
        setField(term996928, term996928.getClass(), "inputsById", null);
        setField(term996928, term996928.getClass(), "sourceMap", null);
        setField(term996928, term996928.getClass(), "externExports", null);
        setIntField(term996928, term996928.getClass(), "uniqueNameId", 0);
        setBooleanField(term996928, term996928.getClass(), "useThreads", false);
        setBooleanField(term996928, term996928.getClass(), "hasRegExpGlobalReferences", false);
        setField(term996928, term996928.getClass(), "functionInformationMap", null);
        setField(term996928, term996928.getClass(), "debugLog", null);
        setField(term996928, term996928.getClass(), "defaultCodingConvention", null);
        setField(term996928, term996928.getClass(), "typeRegistry", null);
        setField(term996928, term996928.getClass(), "parserConfig", null);
        setField(term996928, term996928.getClass(), "abstractInterpreter", null);
        setField(term996928, term996928.getClass(), "typeValidator", null);
        setField(term996928, term996928.getClass(), "tracker", null);
        setField(term996928, term996928.getClass(), "oldErrorReporter", null);
        setField(term996928, term996928.getClass(), "defaultErrorReporter", null);
        setField(term996928, term996928.getClass(), "outStream", null);
        setField(term996928, term996928.getClass(), "globalRefMap", null);
        setDoubleField(term996928, term996928.getClass(), "progress", 0.0);
        setField(term996928, term996928.getClass(), "sanityCheck", null);
        setField(term996928, term996928.getClass(), "currentTracer", null);
        setField(term996928, term996928.getClass(), "currentPassName", null);
        setIntField(term996928, term996928.getClass(), "syntheticCodeId", 0);
        setField(term996928, term996928.getClass(), "recentChange", null);
        setField(term996928, term996928.getClass(), "codeChangeHandlers", null);
        setField(term996928, term996928.getClass(), "synthesizedExternsInput", null);
        setField(term996928, term996928.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "endPass", argTypes, term996928, args);
    }

};


