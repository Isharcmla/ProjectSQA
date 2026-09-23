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

public class Compiler_externExports_691615754168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896134;

    public Compiler_externExports_691615754168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896134 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896134, term896134.getClass(), "options", null);
        setField(term896134, term896134.getClass(), "passes", null);
        setField(term896134, term896134.getClass(), "externs", null);
        setField(term896134, term896134.getClass(), "modules", null);
        setField(term896134, term896134.getClass(), "moduleGraph", null);
        setField(term896134, term896134.getClass(), "inputs", null);
        setField(term896134, term896134.getClass(), "errorManager", null);
        setField(term896134, term896134.getClass(), "warningsGuard", null);
        setField(term896134, term896134.getClass(), "externsRoot", null);
        setField(term896134, term896134.getClass(), "jsRoot", null);
        setField(term896134, term896134.getClass(), "externAndJsRoot", null);
        setField(term896134, term896134.getClass(), "inputsByName", null);
        setField(term896134, term896134.getClass(), "sourceMap", null);
        setField(term896134, term896134.getClass(), "externExports", null);
        setIntField(term896134, term896134.getClass(), "uniqueNameId", 0);
        setBooleanField(term896134, term896134.getClass(), "useThreads", false);
        setBooleanField(term896134, term896134.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896134, term896134.getClass(), "functionInformationMap", null);
        setField(term896134, term896134.getClass(), "debugLog", null);
        setField(term896134, term896134.getClass(), "defaultCodingConvention", null);
        setField(term896134, term896134.getClass(), "typeRegistry", null);
        setField(term896134, term896134.getClass(), "parserConfig", null);
        setField(term896134, term896134.getClass(), "abstractInterpreter", null);
        setField(term896134, term896134.getClass(), "typeValidator", null);
        setField(term896134, term896134.getClass(), "tracker", null);
        setField(term896134, term896134.getClass(), "oldErrorReporter", null);
        setField(term896134, term896134.getClass(), "defaultErrorReporter", null);
        setField(term896134, term896134.getClass(), "outStream", null);
        setField(term896134, term896134.getClass(), "globalRefMap", null);
        setField(term896134, term896134.getClass(), "sanityCheck", null);
        setField(term896134, term896134.getClass(), "currentTracer", null);
        setField(term896134, term896134.getClass(), "currentPassName", null);
        setField(term896134, term896134.getClass(), "recentChange", null);
        setField(term896134, term896134.getClass(), "codeChangeHandlers", null);
        setField(term896134, term896134.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "externExports", argTypes, term896134, args);
    }

};


