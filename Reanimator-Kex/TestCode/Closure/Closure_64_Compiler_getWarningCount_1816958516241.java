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

public class Compiler_getWarningCount_1816958516241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term978034;

    public Compiler_getWarningCount_1816958516241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term978034 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term978034, term978034.getClass(), "options", null);
        setField(term978034, term978034.getClass(), "passes", null);
        setField(term978034, term978034.getClass(), "externs", null);
        setField(term978034, term978034.getClass(), "modules", null);
        setField(term978034, term978034.getClass(), "moduleGraph", null);
        setField(term978034, term978034.getClass(), "inputs", null);
        setField(term978034, term978034.getClass(), "errorManager", null);
        setField(term978034, term978034.getClass(), "warningsGuard", null);
        setField(term978034, term978034.getClass(), "externsRoot", null);
        setField(term978034, term978034.getClass(), "jsRoot", null);
        setField(term978034, term978034.getClass(), "externAndJsRoot", null);
        setField(term978034, term978034.getClass(), "inputsByName", null);
        setField(term978034, term978034.getClass(), "sourceMap", null);
        setField(term978034, term978034.getClass(), "externExports", null);
        setIntField(term978034, term978034.getClass(), "uniqueNameId", 0);
        setBooleanField(term978034, term978034.getClass(), "useThreads", false);
        setBooleanField(term978034, term978034.getClass(), "hasRegExpGlobalReferences", false);
        setField(term978034, term978034.getClass(), "functionInformationMap", null);
        setField(term978034, term978034.getClass(), "debugLog", null);
        setField(term978034, term978034.getClass(), "defaultCodingConvention", null);
        setField(term978034, term978034.getClass(), "typeRegistry", null);
        setField(term978034, term978034.getClass(), "parserConfig", null);
        setField(term978034, term978034.getClass(), "abstractInterpreter", null);
        setField(term978034, term978034.getClass(), "typeValidator", null);
        setField(term978034, term978034.getClass(), "tracker", null);
        setField(term978034, term978034.getClass(), "oldErrorReporter", null);
        setField(term978034, term978034.getClass(), "defaultErrorReporter", null);
        setField(term978034, term978034.getClass(), "outStream", null);
        setField(term978034, term978034.getClass(), "globalRefMap", null);
        setField(term978034, term978034.getClass(), "sanityCheck", null);
        setField(term978034, term978034.getClass(), "currentTracer", null);
        setField(term978034, term978034.getClass(), "currentPassName", null);
        setField(term978034, term978034.getClass(), "recentChange", null);
        setField(term978034, term978034.getClass(), "codeChangeHandlers", null);
        setField(term978034, term978034.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWarningCount", argTypes, term978034, args);
    }

};


