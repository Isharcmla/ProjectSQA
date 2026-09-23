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

public class Compiler_getErrorLevel_722145682234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896400;

    public Compiler_getErrorLevel_722145682234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896400 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896400, term896400.getClass(), "options", null);
        setField(term896400, term896400.getClass(), "passes", null);
        setField(term896400, term896400.getClass(), "externs", null);
        setField(term896400, term896400.getClass(), "modules", null);
        setField(term896400, term896400.getClass(), "moduleGraph", null);
        setField(term896400, term896400.getClass(), "inputs", null);
        setField(term896400, term896400.getClass(), "errorManager", null);
        setField(term896400, term896400.getClass(), "warningsGuard", null);
        setField(term896400, term896400.getClass(), "externsRoot", null);
        setField(term896400, term896400.getClass(), "jsRoot", null);
        setField(term896400, term896400.getClass(), "externAndJsRoot", null);
        setField(term896400, term896400.getClass(), "inputsByName", null);
        setField(term896400, term896400.getClass(), "sourceMap", null);
        setField(term896400, term896400.getClass(), "externExports", null);
        setIntField(term896400, term896400.getClass(), "uniqueNameId", 0);
        setBooleanField(term896400, term896400.getClass(), "useThreads", false);
        setBooleanField(term896400, term896400.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896400, term896400.getClass(), "functionInformationMap", null);
        setField(term896400, term896400.getClass(), "debugLog", null);
        setField(term896400, term896400.getClass(), "defaultCodingConvention", null);
        setField(term896400, term896400.getClass(), "typeRegistry", null);
        setField(term896400, term896400.getClass(), "parserConfig", null);
        setField(term896400, term896400.getClass(), "abstractInterpreter", null);
        setField(term896400, term896400.getClass(), "typeValidator", null);
        setField(term896400, term896400.getClass(), "tracker", null);
        setField(term896400, term896400.getClass(), "oldErrorReporter", null);
        setField(term896400, term896400.getClass(), "defaultErrorReporter", null);
        setField(term896400, term896400.getClass(), "outStream", null);
        setField(term896400, term896400.getClass(), "globalRefMap", null);
        setField(term896400, term896400.getClass(), "sanityCheck", null);
        setField(term896400, term896400.getClass(), "currentTracer", null);
        setField(term896400, term896400.getClass(), "currentPassName", null);
        setField(term896400, term896400.getClass(), "recentChange", null);
        setField(term896400, term896400.getClass(), "codeChangeHandlers", null);
        setField(term896400, term896400.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getErrorLevel", argTypes, term896400, args);
    }

};


