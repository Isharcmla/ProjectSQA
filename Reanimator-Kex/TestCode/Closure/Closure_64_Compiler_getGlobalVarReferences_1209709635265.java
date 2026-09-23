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

public class Compiler_getGlobalVarReferences_1209709635265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term978136;

    public Compiler_getGlobalVarReferences_1209709635265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term978136 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term978136, term978136.getClass(), "options", null);
        setField(term978136, term978136.getClass(), "passes", null);
        setField(term978136, term978136.getClass(), "externs", null);
        setField(term978136, term978136.getClass(), "modules", null);
        setField(term978136, term978136.getClass(), "moduleGraph", null);
        setField(term978136, term978136.getClass(), "inputs", null);
        setField(term978136, term978136.getClass(), "errorManager", null);
        setField(term978136, term978136.getClass(), "warningsGuard", null);
        setField(term978136, term978136.getClass(), "externsRoot", null);
        setField(term978136, term978136.getClass(), "jsRoot", null);
        setField(term978136, term978136.getClass(), "externAndJsRoot", null);
        setField(term978136, term978136.getClass(), "inputsByName", null);
        setField(term978136, term978136.getClass(), "sourceMap", null);
        setField(term978136, term978136.getClass(), "externExports", null);
        setIntField(term978136, term978136.getClass(), "uniqueNameId", 0);
        setBooleanField(term978136, term978136.getClass(), "useThreads", false);
        setBooleanField(term978136, term978136.getClass(), "hasRegExpGlobalReferences", false);
        setField(term978136, term978136.getClass(), "functionInformationMap", null);
        setField(term978136, term978136.getClass(), "debugLog", null);
        setField(term978136, term978136.getClass(), "defaultCodingConvention", null);
        setField(term978136, term978136.getClass(), "typeRegistry", null);
        setField(term978136, term978136.getClass(), "parserConfig", null);
        setField(term978136, term978136.getClass(), "abstractInterpreter", null);
        setField(term978136, term978136.getClass(), "typeValidator", null);
        setField(term978136, term978136.getClass(), "tracker", null);
        setField(term978136, term978136.getClass(), "oldErrorReporter", null);
        setField(term978136, term978136.getClass(), "defaultErrorReporter", null);
        setField(term978136, term978136.getClass(), "outStream", null);
        setField(term978136, term978136.getClass(), "globalRefMap", null);
        setField(term978136, term978136.getClass(), "sanityCheck", null);
        setField(term978136, term978136.getClass(), "currentTracer", null);
        setField(term978136, term978136.getClass(), "currentPassName", null);
        setField(term978136, term978136.getClass(), "recentChange", null);
        setField(term978136, term978136.getClass(), "codeChangeHandlers", null);
        setField(term978136, term978136.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGlobalVarReferences", argTypes, term978136, args);
    }

};


