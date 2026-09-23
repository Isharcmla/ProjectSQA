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

public class Compiler_setPassConfig_624963202192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term996862;

    public Compiler_setPassConfig_624963202192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term996862 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term996862, term996862.getClass(), "options", null);
        setField(term996862, term996862.getClass(), "passes", null);
        setField(term996862, term996862.getClass(), "externs", null);
        setField(term996862, term996862.getClass(), "modules", null);
        setField(term996862, term996862.getClass(), "moduleGraph", null);
        setField(term996862, term996862.getClass(), "inputs", null);
        setField(term996862, term996862.getClass(), "errorManager", null);
        setField(term996862, term996862.getClass(), "warningsGuard", null);
        setField(term996862, term996862.getClass(), "injectedLibraries", null);
        setField(term996862, term996862.getClass(), "externsRoot", null);
        setField(term996862, term996862.getClass(), "jsRoot", null);
        setField(term996862, term996862.getClass(), "externAndJsRoot", null);
        setField(term996862, term996862.getClass(), "inputsById", null);
        setField(term996862, term996862.getClass(), "sourceMap", null);
        setField(term996862, term996862.getClass(), "externExports", null);
        setIntField(term996862, term996862.getClass(), "uniqueNameId", 0);
        setBooleanField(term996862, term996862.getClass(), "useThreads", false);
        setBooleanField(term996862, term996862.getClass(), "hasRegExpGlobalReferences", false);
        setField(term996862, term996862.getClass(), "functionInformationMap", null);
        setField(term996862, term996862.getClass(), "debugLog", null);
        setField(term996862, term996862.getClass(), "defaultCodingConvention", null);
        setField(term996862, term996862.getClass(), "typeRegistry", null);
        setField(term996862, term996862.getClass(), "parserConfig", null);
        setField(term996862, term996862.getClass(), "abstractInterpreter", null);
        setField(term996862, term996862.getClass(), "typeValidator", null);
        setField(term996862, term996862.getClass(), "tracker", null);
        setField(term996862, term996862.getClass(), "oldErrorReporter", null);
        setField(term996862, term996862.getClass(), "defaultErrorReporter", null);
        setField(term996862, term996862.getClass(), "outStream", null);
        setField(term996862, term996862.getClass(), "globalRefMap", null);
        setDoubleField(term996862, term996862.getClass(), "progress", 0.0);
        setField(term996862, term996862.getClass(), "sanityCheck", null);
        setField(term996862, term996862.getClass(), "currentTracer", null);
        setField(term996862, term996862.getClass(), "currentPassName", null);
        setIntField(term996862, term996862.getClass(), "syntheticCodeId", 0);
        setField(term996862, term996862.getClass(), "recentChange", null);
        setField(term996862, term996862.getClass(), "codeChangeHandlers", null);
        setField(term996862, term996862.getClass(), "synthesizedExternsInput", null);
        setField(term996862, term996862.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.PassConfig");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPassConfig", argTypes, term996862, args);
    }

};


