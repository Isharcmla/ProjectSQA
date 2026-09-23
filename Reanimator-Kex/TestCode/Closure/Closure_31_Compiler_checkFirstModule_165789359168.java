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

public class Compiler_checkFirstModule_165789359168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term889781;

    public Compiler_checkFirstModule_165789359168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term889781 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term889781, term889781.getClass(), "options", null);
        setField(term889781, term889781.getClass(), "passes", null);
        setField(term889781, term889781.getClass(), "externs", null);
        setField(term889781, term889781.getClass(), "modules", null);
        setField(term889781, term889781.getClass(), "moduleGraph", null);
        setField(term889781, term889781.getClass(), "inputs", null);
        setField(term889781, term889781.getClass(), "errorManager", null);
        setField(term889781, term889781.getClass(), "warningsGuard", null);
        setField(term889781, term889781.getClass(), "injectedLibraries", null);
        setField(term889781, term889781.getClass(), "externsRoot", null);
        setField(term889781, term889781.getClass(), "jsRoot", null);
        setField(term889781, term889781.getClass(), "externAndJsRoot", null);
        setField(term889781, term889781.getClass(), "inputsById", null);
        setField(term889781, term889781.getClass(), "sourceMap", null);
        setField(term889781, term889781.getClass(), "externExports", null);
        setIntField(term889781, term889781.getClass(), "uniqueNameId", 0);
        setBooleanField(term889781, term889781.getClass(), "useThreads", false);
        setBooleanField(term889781, term889781.getClass(), "hasRegExpGlobalReferences", false);
        setField(term889781, term889781.getClass(), "functionInformationMap", null);
        setField(term889781, term889781.getClass(), "debugLog", null);
        setField(term889781, term889781.getClass(), "defaultCodingConvention", null);
        setField(term889781, term889781.getClass(), "typeRegistry", null);
        setField(term889781, term889781.getClass(), "parserConfig", null);
        setField(term889781, term889781.getClass(), "abstractInterpreter", null);
        setField(term889781, term889781.getClass(), "typeValidator", null);
        setField(term889781, term889781.getClass(), "tracker", null);
        setField(term889781, term889781.getClass(), "oldErrorReporter", null);
        setField(term889781, term889781.getClass(), "defaultErrorReporter", null);
        setField(term889781, term889781.getClass(), "outStream", null);
        setField(term889781, term889781.getClass(), "globalRefMap", null);
        setDoubleField(term889781, term889781.getClass(), "progress", 0.0);
        setField(term889781, term889781.getClass(), "sanityCheck", null);
        setField(term889781, term889781.getClass(), "currentTracer", null);
        setField(term889781, term889781.getClass(), "currentPassName", null);
        setIntField(term889781, term889781.getClass(), "syntheticCodeId", 0);
        setField(term889781, term889781.getClass(), "recentChange", null);
        setField(term889781, term889781.getClass(), "codeChangeHandlers", null);
        setField(term889781, term889781.getClass(), "synthesizedExternsInput", null);
        setField(term889781, term889781.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "checkFirstModule", argTypes, term889781, args);
    }

};


