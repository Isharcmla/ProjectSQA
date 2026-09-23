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

public class Compiler_getTypedScopeCreator_1000600772195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896242;

    public Compiler_getTypedScopeCreator_1000600772195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896242 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896242, term896242.getClass(), "options", null);
        setField(term896242, term896242.getClass(), "passes", null);
        setField(term896242, term896242.getClass(), "externs", null);
        setField(term896242, term896242.getClass(), "modules", null);
        setField(term896242, term896242.getClass(), "moduleGraph", null);
        setField(term896242, term896242.getClass(), "inputs", null);
        setField(term896242, term896242.getClass(), "errorManager", null);
        setField(term896242, term896242.getClass(), "warningsGuard", null);
        setField(term896242, term896242.getClass(), "externsRoot", null);
        setField(term896242, term896242.getClass(), "jsRoot", null);
        setField(term896242, term896242.getClass(), "externAndJsRoot", null);
        setField(term896242, term896242.getClass(), "inputsByName", null);
        setField(term896242, term896242.getClass(), "sourceMap", null);
        setField(term896242, term896242.getClass(), "externExports", null);
        setIntField(term896242, term896242.getClass(), "uniqueNameId", 0);
        setBooleanField(term896242, term896242.getClass(), "useThreads", false);
        setBooleanField(term896242, term896242.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896242, term896242.getClass(), "functionInformationMap", null);
        setField(term896242, term896242.getClass(), "debugLog", null);
        setField(term896242, term896242.getClass(), "defaultCodingConvention", null);
        setField(term896242, term896242.getClass(), "typeRegistry", null);
        setField(term896242, term896242.getClass(), "parserConfig", null);
        setField(term896242, term896242.getClass(), "abstractInterpreter", null);
        setField(term896242, term896242.getClass(), "typeValidator", null);
        setField(term896242, term896242.getClass(), "tracker", null);
        setField(term896242, term896242.getClass(), "oldErrorReporter", null);
        setField(term896242, term896242.getClass(), "defaultErrorReporter", null);
        setField(term896242, term896242.getClass(), "outStream", null);
        setField(term896242, term896242.getClass(), "globalRefMap", null);
        setField(term896242, term896242.getClass(), "sanityCheck", null);
        setField(term896242, term896242.getClass(), "currentTracer", null);
        setField(term896242, term896242.getClass(), "currentPassName", null);
        setField(term896242, term896242.getClass(), "recentChange", null);
        setField(term896242, term896242.getClass(), "codeChangeHandlers", null);
        setField(term896242, term896242.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTypedScopeCreator", argTypes, term896242, args);
    }

};


