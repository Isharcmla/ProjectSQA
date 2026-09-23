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

public class Compiler_toSourceArray_1736541947209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896298;

    public Compiler_toSourceArray_1736541947209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896298 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896298, term896298.getClass(), "options", null);
        setField(term896298, term896298.getClass(), "passes", null);
        setField(term896298, term896298.getClass(), "externs", null);
        setField(term896298, term896298.getClass(), "modules", null);
        setField(term896298, term896298.getClass(), "moduleGraph", null);
        setField(term896298, term896298.getClass(), "inputs", null);
        setField(term896298, term896298.getClass(), "errorManager", null);
        setField(term896298, term896298.getClass(), "warningsGuard", null);
        setField(term896298, term896298.getClass(), "externsRoot", null);
        setField(term896298, term896298.getClass(), "jsRoot", null);
        setField(term896298, term896298.getClass(), "externAndJsRoot", null);
        setField(term896298, term896298.getClass(), "inputsByName", null);
        setField(term896298, term896298.getClass(), "sourceMap", null);
        setField(term896298, term896298.getClass(), "externExports", null);
        setIntField(term896298, term896298.getClass(), "uniqueNameId", 0);
        setBooleanField(term896298, term896298.getClass(), "useThreads", false);
        setBooleanField(term896298, term896298.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896298, term896298.getClass(), "functionInformationMap", null);
        setField(term896298, term896298.getClass(), "debugLog", null);
        setField(term896298, term896298.getClass(), "defaultCodingConvention", null);
        setField(term896298, term896298.getClass(), "typeRegistry", null);
        setField(term896298, term896298.getClass(), "parserConfig", null);
        setField(term896298, term896298.getClass(), "abstractInterpreter", null);
        setField(term896298, term896298.getClass(), "typeValidator", null);
        setField(term896298, term896298.getClass(), "tracker", null);
        setField(term896298, term896298.getClass(), "oldErrorReporter", null);
        setField(term896298, term896298.getClass(), "defaultErrorReporter", null);
        setField(term896298, term896298.getClass(), "outStream", null);
        setField(term896298, term896298.getClass(), "globalRefMap", null);
        setField(term896298, term896298.getClass(), "sanityCheck", null);
        setField(term896298, term896298.getClass(), "currentTracer", null);
        setField(term896298, term896298.getClass(), "currentPassName", null);
        setField(term896298, term896298.getClass(), "recentChange", null);
        setField(term896298, term896298.getClass(), "codeChangeHandlers", null);
        setField(term896298, term896298.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSModule");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "toSourceArray", argTypes, term896298, args);
    }

};


