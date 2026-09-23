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

public class Compiler_setHasRegExpGlobalReferences_1869563749259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896504;
     Object term896508;

    public Compiler_setHasRegExpGlobalReferences_1869563749259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896504 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896504, term896504.getClass(), "options", null);
        setField(term896504, term896504.getClass(), "passes", null);
        setField(term896504, term896504.getClass(), "externs", null);
        setField(term896504, term896504.getClass(), "modules", null);
        setField(term896504, term896504.getClass(), "moduleGraph", null);
        setField(term896504, term896504.getClass(), "inputs", null);
        setField(term896504, term896504.getClass(), "errorManager", null);
        setField(term896504, term896504.getClass(), "warningsGuard", null);
        setField(term896504, term896504.getClass(), "externsRoot", null);
        setField(term896504, term896504.getClass(), "jsRoot", null);
        setField(term896504, term896504.getClass(), "externAndJsRoot", null);
        setField(term896504, term896504.getClass(), "inputsByName", null);
        setField(term896504, term896504.getClass(), "sourceMap", null);
        setField(term896504, term896504.getClass(), "externExports", null);
        setIntField(term896504, term896504.getClass(), "uniqueNameId", 0);
        setBooleanField(term896504, term896504.getClass(), "useThreads", false);
        setBooleanField(term896504, term896504.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896504, term896504.getClass(), "functionInformationMap", null);
        setField(term896504, term896504.getClass(), "debugLog", null);
        setField(term896504, term896504.getClass(), "defaultCodingConvention", null);
        setField(term896504, term896504.getClass(), "typeRegistry", null);
        setField(term896504, term896504.getClass(), "parserConfig", null);
        setField(term896504, term896504.getClass(), "abstractInterpreter", null);
        setField(term896504, term896504.getClass(), "typeValidator", null);
        setField(term896504, term896504.getClass(), "tracker", null);
        setField(term896504, term896504.getClass(), "oldErrorReporter", null);
        setField(term896504, term896504.getClass(), "defaultErrorReporter", null);
        setField(term896504, term896504.getClass(), "outStream", null);
        setField(term896504, term896504.getClass(), "globalRefMap", null);
        setField(term896504, term896504.getClass(), "sanityCheck", null);
        setField(term896504, term896504.getClass(), "currentTracer", null);
        setField(term896504, term896504.getClass(), "currentPassName", null);
        setField(term896504, term896504.getClass(), "recentChange", null);
        setField(term896504, term896504.getClass(), "codeChangeHandlers", null);
        setField(term896504, term896504.getClass(), "stage", null);
        term896508 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term896508;
        callMethod(klass, "setHasRegExpGlobalReferences", argTypes, term896504, args);
    }

};


