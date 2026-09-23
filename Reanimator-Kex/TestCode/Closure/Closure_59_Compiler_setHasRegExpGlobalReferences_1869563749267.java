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
import java.lang.Boolean;

public class Compiler_setHasRegExpGlobalReferences_1869563749267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term855094;
     Object term855098;

    public Compiler_setHasRegExpGlobalReferences_1869563749267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term855094 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term855094, term855094.getClass(), "options", null);
        setField(term855094, term855094.getClass(), "passes", null);
        setField(term855094, term855094.getClass(), "externs", null);
        setField(term855094, term855094.getClass(), "modules", null);
        setField(term855094, term855094.getClass(), "moduleGraph", null);
        setField(term855094, term855094.getClass(), "inputs", null);
        setField(term855094, term855094.getClass(), "errorManager", null);
        setField(term855094, term855094.getClass(), "warningsGuard", null);
        setField(term855094, term855094.getClass(), "externsRoot", null);
        setField(term855094, term855094.getClass(), "jsRoot", null);
        setField(term855094, term855094.getClass(), "externAndJsRoot", null);
        setField(term855094, term855094.getClass(), "inputsByName", null);
        setField(term855094, term855094.getClass(), "sourceMap", null);
        setField(term855094, term855094.getClass(), "externExports", null);
        setIntField(term855094, term855094.getClass(), "uniqueNameId", 0);
        setBooleanField(term855094, term855094.getClass(), "useThreads", false);
        setBooleanField(term855094, term855094.getClass(), "hasRegExpGlobalReferences", false);
        setField(term855094, term855094.getClass(), "functionInformationMap", null);
        setField(term855094, term855094.getClass(), "debugLog", null);
        setField(term855094, term855094.getClass(), "defaultCodingConvention", null);
        setField(term855094, term855094.getClass(), "typeRegistry", null);
        setField(term855094, term855094.getClass(), "parserConfig", null);
        setField(term855094, term855094.getClass(), "abstractInterpreter", null);
        setField(term855094, term855094.getClass(), "typeValidator", null);
        setField(term855094, term855094.getClass(), "tracker", null);
        setField(term855094, term855094.getClass(), "oldErrorReporter", null);
        setField(term855094, term855094.getClass(), "defaultErrorReporter", null);
        setField(term855094, term855094.getClass(), "outStream", null);
        setField(term855094, term855094.getClass(), "globalRefMap", null);
        setField(term855094, term855094.getClass(), "sanityCheck", null);
        setField(term855094, term855094.getClass(), "currentTracer", null);
        setField(term855094, term855094.getClass(), "currentPassName", null);
        setField(term855094, term855094.getClass(), "recentChange", null);
        setField(term855094, term855094.getClass(), "codeChangeHandlers", null);
        setField(term855094, term855094.getClass(), "stage", null);
        term855098 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term855098;
        callMethod(klass, "setHasRegExpGlobalReferences", argTypes, term855094, args);
    }

};


