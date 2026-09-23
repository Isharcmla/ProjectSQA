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

public class Compiler_getVariableMap_1157093360253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term855038;

    public Compiler_getVariableMap_1157093360253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term855038 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term855038, term855038.getClass(), "options", null);
        setField(term855038, term855038.getClass(), "passes", null);
        setField(term855038, term855038.getClass(), "externs", null);
        setField(term855038, term855038.getClass(), "modules", null);
        setField(term855038, term855038.getClass(), "moduleGraph", null);
        setField(term855038, term855038.getClass(), "inputs", null);
        setField(term855038, term855038.getClass(), "errorManager", null);
        setField(term855038, term855038.getClass(), "warningsGuard", null);
        setField(term855038, term855038.getClass(), "externsRoot", null);
        setField(term855038, term855038.getClass(), "jsRoot", null);
        setField(term855038, term855038.getClass(), "externAndJsRoot", null);
        setField(term855038, term855038.getClass(), "inputsByName", null);
        setField(term855038, term855038.getClass(), "sourceMap", null);
        setField(term855038, term855038.getClass(), "externExports", null);
        setIntField(term855038, term855038.getClass(), "uniqueNameId", 0);
        setBooleanField(term855038, term855038.getClass(), "useThreads", false);
        setBooleanField(term855038, term855038.getClass(), "hasRegExpGlobalReferences", false);
        setField(term855038, term855038.getClass(), "functionInformationMap", null);
        setField(term855038, term855038.getClass(), "debugLog", null);
        setField(term855038, term855038.getClass(), "defaultCodingConvention", null);
        setField(term855038, term855038.getClass(), "typeRegistry", null);
        setField(term855038, term855038.getClass(), "parserConfig", null);
        setField(term855038, term855038.getClass(), "abstractInterpreter", null);
        setField(term855038, term855038.getClass(), "typeValidator", null);
        setField(term855038, term855038.getClass(), "tracker", null);
        setField(term855038, term855038.getClass(), "oldErrorReporter", null);
        setField(term855038, term855038.getClass(), "defaultErrorReporter", null);
        setField(term855038, term855038.getClass(), "outStream", null);
        setField(term855038, term855038.getClass(), "globalRefMap", null);
        setField(term855038, term855038.getClass(), "sanityCheck", null);
        setField(term855038, term855038.getClass(), "currentTracer", null);
        setField(term855038, term855038.getClass(), "currentPassName", null);
        setField(term855038, term855038.getClass(), "recentChange", null);
        setField(term855038, term855038.getClass(), "codeChangeHandlers", null);
        setField(term855038, term855038.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVariableMap", argTypes, term855038, args);
    }

};


