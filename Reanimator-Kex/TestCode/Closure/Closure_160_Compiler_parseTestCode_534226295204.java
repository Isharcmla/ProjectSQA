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

public class Compiler_parseTestCode_534226295204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896278;

    public Compiler_parseTestCode_534226295204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896278 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896278, term896278.getClass(), "options", null);
        setField(term896278, term896278.getClass(), "passes", null);
        setField(term896278, term896278.getClass(), "externs", null);
        setField(term896278, term896278.getClass(), "modules", null);
        setField(term896278, term896278.getClass(), "moduleGraph", null);
        setField(term896278, term896278.getClass(), "inputs", null);
        setField(term896278, term896278.getClass(), "errorManager", null);
        setField(term896278, term896278.getClass(), "warningsGuard", null);
        setField(term896278, term896278.getClass(), "externsRoot", null);
        setField(term896278, term896278.getClass(), "jsRoot", null);
        setField(term896278, term896278.getClass(), "externAndJsRoot", null);
        setField(term896278, term896278.getClass(), "inputsByName", null);
        setField(term896278, term896278.getClass(), "sourceMap", null);
        setField(term896278, term896278.getClass(), "externExports", null);
        setIntField(term896278, term896278.getClass(), "uniqueNameId", 0);
        setBooleanField(term896278, term896278.getClass(), "useThreads", false);
        setBooleanField(term896278, term896278.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896278, term896278.getClass(), "functionInformationMap", null);
        setField(term896278, term896278.getClass(), "debugLog", null);
        setField(term896278, term896278.getClass(), "defaultCodingConvention", null);
        setField(term896278, term896278.getClass(), "typeRegistry", null);
        setField(term896278, term896278.getClass(), "parserConfig", null);
        setField(term896278, term896278.getClass(), "abstractInterpreter", null);
        setField(term896278, term896278.getClass(), "typeValidator", null);
        setField(term896278, term896278.getClass(), "tracker", null);
        setField(term896278, term896278.getClass(), "oldErrorReporter", null);
        setField(term896278, term896278.getClass(), "defaultErrorReporter", null);
        setField(term896278, term896278.getClass(), "outStream", null);
        setField(term896278, term896278.getClass(), "globalRefMap", null);
        setField(term896278, term896278.getClass(), "sanityCheck", null);
        setField(term896278, term896278.getClass(), "currentTracer", null);
        setField(term896278, term896278.getClass(), "currentPassName", null);
        setField(term896278, term896278.getClass(), "recentChange", null);
        setField(term896278, term896278.getClass(), "codeChangeHandlers", null);
        setField(term896278, term896278.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "parseTestCode", argTypes, term896278, args);
    }

};


