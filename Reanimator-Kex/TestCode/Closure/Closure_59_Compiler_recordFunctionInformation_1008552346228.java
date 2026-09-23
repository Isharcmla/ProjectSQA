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

public class Compiler_recordFunctionInformation_1008552346228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854934;

    public Compiler_recordFunctionInformation_1008552346228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854934 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854934, term854934.getClass(), "options", null);
        setField(term854934, term854934.getClass(), "passes", null);
        setField(term854934, term854934.getClass(), "externs", null);
        setField(term854934, term854934.getClass(), "modules", null);
        setField(term854934, term854934.getClass(), "moduleGraph", null);
        setField(term854934, term854934.getClass(), "inputs", null);
        setField(term854934, term854934.getClass(), "errorManager", null);
        setField(term854934, term854934.getClass(), "warningsGuard", null);
        setField(term854934, term854934.getClass(), "externsRoot", null);
        setField(term854934, term854934.getClass(), "jsRoot", null);
        setField(term854934, term854934.getClass(), "externAndJsRoot", null);
        setField(term854934, term854934.getClass(), "inputsByName", null);
        setField(term854934, term854934.getClass(), "sourceMap", null);
        setField(term854934, term854934.getClass(), "externExports", null);
        setIntField(term854934, term854934.getClass(), "uniqueNameId", 0);
        setBooleanField(term854934, term854934.getClass(), "useThreads", false);
        setBooleanField(term854934, term854934.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854934, term854934.getClass(), "functionInformationMap", null);
        setField(term854934, term854934.getClass(), "debugLog", null);
        setField(term854934, term854934.getClass(), "defaultCodingConvention", null);
        setField(term854934, term854934.getClass(), "typeRegistry", null);
        setField(term854934, term854934.getClass(), "parserConfig", null);
        setField(term854934, term854934.getClass(), "abstractInterpreter", null);
        setField(term854934, term854934.getClass(), "typeValidator", null);
        setField(term854934, term854934.getClass(), "tracker", null);
        setField(term854934, term854934.getClass(), "oldErrorReporter", null);
        setField(term854934, term854934.getClass(), "defaultErrorReporter", null);
        setField(term854934, term854934.getClass(), "outStream", null);
        setField(term854934, term854934.getClass(), "globalRefMap", null);
        setField(term854934, term854934.getClass(), "sanityCheck", null);
        setField(term854934, term854934.getClass(), "currentTracer", null);
        setField(term854934, term854934.getClass(), "currentPassName", null);
        setField(term854934, term854934.getClass(), "recentChange", null);
        setField(term854934, term854934.getClass(), "codeChangeHandlers", null);
        setField(term854934, term854934.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "recordFunctionInformation", argTypes, term854934, args);
    }

};


