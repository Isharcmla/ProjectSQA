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

public class Compiler_getInputsForTesting_947229849264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term855082;

    public Compiler_getInputsForTesting_947229849264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term855082 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term855082, term855082.getClass(), "options", null);
        setField(term855082, term855082.getClass(), "passes", null);
        setField(term855082, term855082.getClass(), "externs", null);
        setField(term855082, term855082.getClass(), "modules", null);
        setField(term855082, term855082.getClass(), "moduleGraph", null);
        setField(term855082, term855082.getClass(), "inputs", null);
        setField(term855082, term855082.getClass(), "errorManager", null);
        setField(term855082, term855082.getClass(), "warningsGuard", null);
        setField(term855082, term855082.getClass(), "externsRoot", null);
        setField(term855082, term855082.getClass(), "jsRoot", null);
        setField(term855082, term855082.getClass(), "externAndJsRoot", null);
        setField(term855082, term855082.getClass(), "inputsByName", null);
        setField(term855082, term855082.getClass(), "sourceMap", null);
        setField(term855082, term855082.getClass(), "externExports", null);
        setIntField(term855082, term855082.getClass(), "uniqueNameId", 0);
        setBooleanField(term855082, term855082.getClass(), "useThreads", false);
        setBooleanField(term855082, term855082.getClass(), "hasRegExpGlobalReferences", false);
        setField(term855082, term855082.getClass(), "functionInformationMap", null);
        setField(term855082, term855082.getClass(), "debugLog", null);
        setField(term855082, term855082.getClass(), "defaultCodingConvention", null);
        setField(term855082, term855082.getClass(), "typeRegistry", null);
        setField(term855082, term855082.getClass(), "parserConfig", null);
        setField(term855082, term855082.getClass(), "abstractInterpreter", null);
        setField(term855082, term855082.getClass(), "typeValidator", null);
        setField(term855082, term855082.getClass(), "tracker", null);
        setField(term855082, term855082.getClass(), "oldErrorReporter", null);
        setField(term855082, term855082.getClass(), "defaultErrorReporter", null);
        setField(term855082, term855082.getClass(), "outStream", null);
        setField(term855082, term855082.getClass(), "globalRefMap", null);
        setField(term855082, term855082.getClass(), "sanityCheck", null);
        setField(term855082, term855082.getClass(), "currentTracer", null);
        setField(term855082, term855082.getClass(), "currentPassName", null);
        setField(term855082, term855082.getClass(), "recentChange", null);
        setField(term855082, term855082.getClass(), "codeChangeHandlers", null);
        setField(term855082, term855082.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInputsForTesting", argTypes, term855082, args);
    }

};


