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

public class Compiler_initCompilerOptionsIfTesting_1014781019202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896270;

    public Compiler_initCompilerOptionsIfTesting_1014781019202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896270 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896270, term896270.getClass(), "options", null);
        setField(term896270, term896270.getClass(), "passes", null);
        setField(term896270, term896270.getClass(), "externs", null);
        setField(term896270, term896270.getClass(), "modules", null);
        setField(term896270, term896270.getClass(), "moduleGraph", null);
        setField(term896270, term896270.getClass(), "inputs", null);
        setField(term896270, term896270.getClass(), "errorManager", null);
        setField(term896270, term896270.getClass(), "warningsGuard", null);
        setField(term896270, term896270.getClass(), "externsRoot", null);
        setField(term896270, term896270.getClass(), "jsRoot", null);
        setField(term896270, term896270.getClass(), "externAndJsRoot", null);
        setField(term896270, term896270.getClass(), "inputsByName", null);
        setField(term896270, term896270.getClass(), "sourceMap", null);
        setField(term896270, term896270.getClass(), "externExports", null);
        setIntField(term896270, term896270.getClass(), "uniqueNameId", 0);
        setBooleanField(term896270, term896270.getClass(), "useThreads", false);
        setBooleanField(term896270, term896270.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896270, term896270.getClass(), "functionInformationMap", null);
        setField(term896270, term896270.getClass(), "debugLog", null);
        setField(term896270, term896270.getClass(), "defaultCodingConvention", null);
        setField(term896270, term896270.getClass(), "typeRegistry", null);
        setField(term896270, term896270.getClass(), "parserConfig", null);
        setField(term896270, term896270.getClass(), "abstractInterpreter", null);
        setField(term896270, term896270.getClass(), "typeValidator", null);
        setField(term896270, term896270.getClass(), "tracker", null);
        setField(term896270, term896270.getClass(), "oldErrorReporter", null);
        setField(term896270, term896270.getClass(), "defaultErrorReporter", null);
        setField(term896270, term896270.getClass(), "outStream", null);
        setField(term896270, term896270.getClass(), "globalRefMap", null);
        setField(term896270, term896270.getClass(), "sanityCheck", null);
        setField(term896270, term896270.getClass(), "currentTracer", null);
        setField(term896270, term896270.getClass(), "currentPassName", null);
        setField(term896270, term896270.getClass(), "recentChange", null);
        setField(term896270, term896270.getClass(), "codeChangeHandlers", null);
        setField(term896270, term896270.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initCompilerOptionsIfTesting", argTypes, term896270, args);
    }

};


