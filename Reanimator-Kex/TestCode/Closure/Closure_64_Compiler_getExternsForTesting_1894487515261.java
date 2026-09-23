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

public class Compiler_getExternsForTesting_1894487515261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term978118;

    public Compiler_getExternsForTesting_1894487515261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term978118 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term978118, term978118.getClass(), "options", null);
        setField(term978118, term978118.getClass(), "passes", null);
        setField(term978118, term978118.getClass(), "externs", null);
        setField(term978118, term978118.getClass(), "modules", null);
        setField(term978118, term978118.getClass(), "moduleGraph", null);
        setField(term978118, term978118.getClass(), "inputs", null);
        setField(term978118, term978118.getClass(), "errorManager", null);
        setField(term978118, term978118.getClass(), "warningsGuard", null);
        setField(term978118, term978118.getClass(), "externsRoot", null);
        setField(term978118, term978118.getClass(), "jsRoot", null);
        setField(term978118, term978118.getClass(), "externAndJsRoot", null);
        setField(term978118, term978118.getClass(), "inputsByName", null);
        setField(term978118, term978118.getClass(), "sourceMap", null);
        setField(term978118, term978118.getClass(), "externExports", null);
        setIntField(term978118, term978118.getClass(), "uniqueNameId", 0);
        setBooleanField(term978118, term978118.getClass(), "useThreads", false);
        setBooleanField(term978118, term978118.getClass(), "hasRegExpGlobalReferences", false);
        setField(term978118, term978118.getClass(), "functionInformationMap", null);
        setField(term978118, term978118.getClass(), "debugLog", null);
        setField(term978118, term978118.getClass(), "defaultCodingConvention", null);
        setField(term978118, term978118.getClass(), "typeRegistry", null);
        setField(term978118, term978118.getClass(), "parserConfig", null);
        setField(term978118, term978118.getClass(), "abstractInterpreter", null);
        setField(term978118, term978118.getClass(), "typeValidator", null);
        setField(term978118, term978118.getClass(), "tracker", null);
        setField(term978118, term978118.getClass(), "oldErrorReporter", null);
        setField(term978118, term978118.getClass(), "defaultErrorReporter", null);
        setField(term978118, term978118.getClass(), "outStream", null);
        setField(term978118, term978118.getClass(), "globalRefMap", null);
        setField(term978118, term978118.getClass(), "sanityCheck", null);
        setField(term978118, term978118.getClass(), "currentTracer", null);
        setField(term978118, term978118.getClass(), "currentPassName", null);
        setField(term978118, term978118.getClass(), "recentChange", null);
        setField(term978118, term978118.getClass(), "codeChangeHandlers", null);
        setField(term978118, term978118.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExternsForTesting", argTypes, term978118, args);
    }

};


