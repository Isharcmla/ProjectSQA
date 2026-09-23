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

public class Compiler_getCodingConvention_1183469012232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854950;

    public Compiler_getCodingConvention_1183469012232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854950 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854950, term854950.getClass(), "options", null);
        setField(term854950, term854950.getClass(), "passes", null);
        setField(term854950, term854950.getClass(), "externs", null);
        setField(term854950, term854950.getClass(), "modules", null);
        setField(term854950, term854950.getClass(), "moduleGraph", null);
        setField(term854950, term854950.getClass(), "inputs", null);
        setField(term854950, term854950.getClass(), "errorManager", null);
        setField(term854950, term854950.getClass(), "warningsGuard", null);
        setField(term854950, term854950.getClass(), "externsRoot", null);
        setField(term854950, term854950.getClass(), "jsRoot", null);
        setField(term854950, term854950.getClass(), "externAndJsRoot", null);
        setField(term854950, term854950.getClass(), "inputsByName", null);
        setField(term854950, term854950.getClass(), "sourceMap", null);
        setField(term854950, term854950.getClass(), "externExports", null);
        setIntField(term854950, term854950.getClass(), "uniqueNameId", 0);
        setBooleanField(term854950, term854950.getClass(), "useThreads", false);
        setBooleanField(term854950, term854950.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854950, term854950.getClass(), "functionInformationMap", null);
        setField(term854950, term854950.getClass(), "debugLog", null);
        setField(term854950, term854950.getClass(), "defaultCodingConvention", null);
        setField(term854950, term854950.getClass(), "typeRegistry", null);
        setField(term854950, term854950.getClass(), "parserConfig", null);
        setField(term854950, term854950.getClass(), "abstractInterpreter", null);
        setField(term854950, term854950.getClass(), "typeValidator", null);
        setField(term854950, term854950.getClass(), "tracker", null);
        setField(term854950, term854950.getClass(), "oldErrorReporter", null);
        setField(term854950, term854950.getClass(), "defaultErrorReporter", null);
        setField(term854950, term854950.getClass(), "outStream", null);
        setField(term854950, term854950.getClass(), "globalRefMap", null);
        setField(term854950, term854950.getClass(), "sanityCheck", null);
        setField(term854950, term854950.getClass(), "currentTracer", null);
        setField(term854950, term854950.getClass(), "currentPassName", null);
        setField(term854950, term854950.getClass(), "recentChange", null);
        setField(term854950, term854950.getClass(), "codeChangeHandlers", null);
        setField(term854950, term854950.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCodingConvention", argTypes, term854950, args);
    }

};


