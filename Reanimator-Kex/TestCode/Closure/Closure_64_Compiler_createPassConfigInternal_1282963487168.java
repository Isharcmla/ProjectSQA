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

public class Compiler_createPassConfigInternal_1282963487168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977740;

    public Compiler_createPassConfigInternal_1282963487168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977740 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term977740, term977740.getClass(), "options", null);
        setField(term977740, term977740.getClass(), "passes", null);
        setField(term977740, term977740.getClass(), "externs", null);
        setField(term977740, term977740.getClass(), "modules", null);
        setField(term977740, term977740.getClass(), "moduleGraph", null);
        setField(term977740, term977740.getClass(), "inputs", null);
        setField(term977740, term977740.getClass(), "errorManager", null);
        setField(term977740, term977740.getClass(), "warningsGuard", null);
        setField(term977740, term977740.getClass(), "externsRoot", null);
        setField(term977740, term977740.getClass(), "jsRoot", null);
        setField(term977740, term977740.getClass(), "externAndJsRoot", null);
        setField(term977740, term977740.getClass(), "inputsByName", null);
        setField(term977740, term977740.getClass(), "sourceMap", null);
        setField(term977740, term977740.getClass(), "externExports", null);
        setIntField(term977740, term977740.getClass(), "uniqueNameId", 0);
        setBooleanField(term977740, term977740.getClass(), "useThreads", false);
        setBooleanField(term977740, term977740.getClass(), "hasRegExpGlobalReferences", false);
        setField(term977740, term977740.getClass(), "functionInformationMap", null);
        setField(term977740, term977740.getClass(), "debugLog", null);
        setField(term977740, term977740.getClass(), "defaultCodingConvention", null);
        setField(term977740, term977740.getClass(), "typeRegistry", null);
        setField(term977740, term977740.getClass(), "parserConfig", null);
        setField(term977740, term977740.getClass(), "abstractInterpreter", null);
        setField(term977740, term977740.getClass(), "typeValidator", null);
        setField(term977740, term977740.getClass(), "tracker", null);
        setField(term977740, term977740.getClass(), "oldErrorReporter", null);
        setField(term977740, term977740.getClass(), "defaultErrorReporter", null);
        setField(term977740, term977740.getClass(), "outStream", null);
        setField(term977740, term977740.getClass(), "globalRefMap", null);
        setField(term977740, term977740.getClass(), "sanityCheck", null);
        setField(term977740, term977740.getClass(), "currentTracer", null);
        setField(term977740, term977740.getClass(), "currentPassName", null);
        setField(term977740, term977740.getClass(), "recentChange", null);
        setField(term977740, term977740.getClass(), "codeChangeHandlers", null);
        setField(term977740, term977740.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createPassConfigInternal", argTypes, term977740, args);
    }

};


