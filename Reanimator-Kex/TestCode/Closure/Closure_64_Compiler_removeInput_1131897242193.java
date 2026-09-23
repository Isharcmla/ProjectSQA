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

public class Compiler_removeInput_1131897242193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977840;

    public Compiler_removeInput_1131897242193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977840 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term977840, term977840.getClass(), "options", null);
        setField(term977840, term977840.getClass(), "passes", null);
        setField(term977840, term977840.getClass(), "externs", null);
        setField(term977840, term977840.getClass(), "modules", null);
        setField(term977840, term977840.getClass(), "moduleGraph", null);
        setField(term977840, term977840.getClass(), "inputs", null);
        setField(term977840, term977840.getClass(), "errorManager", null);
        setField(term977840, term977840.getClass(), "warningsGuard", null);
        setField(term977840, term977840.getClass(), "externsRoot", null);
        setField(term977840, term977840.getClass(), "jsRoot", null);
        setField(term977840, term977840.getClass(), "externAndJsRoot", null);
        setField(term977840, term977840.getClass(), "inputsByName", null);
        setField(term977840, term977840.getClass(), "sourceMap", null);
        setField(term977840, term977840.getClass(), "externExports", null);
        setIntField(term977840, term977840.getClass(), "uniqueNameId", 0);
        setBooleanField(term977840, term977840.getClass(), "useThreads", false);
        setBooleanField(term977840, term977840.getClass(), "hasRegExpGlobalReferences", false);
        setField(term977840, term977840.getClass(), "functionInformationMap", null);
        setField(term977840, term977840.getClass(), "debugLog", null);
        setField(term977840, term977840.getClass(), "defaultCodingConvention", null);
        setField(term977840, term977840.getClass(), "typeRegistry", null);
        setField(term977840, term977840.getClass(), "parserConfig", null);
        setField(term977840, term977840.getClass(), "abstractInterpreter", null);
        setField(term977840, term977840.getClass(), "typeValidator", null);
        setField(term977840, term977840.getClass(), "tracker", null);
        setField(term977840, term977840.getClass(), "oldErrorReporter", null);
        setField(term977840, term977840.getClass(), "defaultErrorReporter", null);
        setField(term977840, term977840.getClass(), "outStream", null);
        setField(term977840, term977840.getClass(), "globalRefMap", null);
        setField(term977840, term977840.getClass(), "sanityCheck", null);
        setField(term977840, term977840.getClass(), "currentTracer", null);
        setField(term977840, term977840.getClass(), "currentPassName", null);
        setField(term977840, term977840.getClass(), "recentChange", null);
        setField(term977840, term977840.getClass(), "codeChangeHandlers", null);
        setField(term977840, term977840.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "removeInput", argTypes, term977840, args);
    }

};


