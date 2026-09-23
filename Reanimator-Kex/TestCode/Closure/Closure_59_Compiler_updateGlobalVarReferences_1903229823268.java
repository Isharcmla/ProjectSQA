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

public class Compiler_updateGlobalVarReferences_1903229823268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term855100;

    public Compiler_updateGlobalVarReferences_1903229823268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term855100 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term855100, term855100.getClass(), "options", null);
        setField(term855100, term855100.getClass(), "passes", null);
        setField(term855100, term855100.getClass(), "externs", null);
        setField(term855100, term855100.getClass(), "modules", null);
        setField(term855100, term855100.getClass(), "moduleGraph", null);
        setField(term855100, term855100.getClass(), "inputs", null);
        setField(term855100, term855100.getClass(), "errorManager", null);
        setField(term855100, term855100.getClass(), "warningsGuard", null);
        setField(term855100, term855100.getClass(), "externsRoot", null);
        setField(term855100, term855100.getClass(), "jsRoot", null);
        setField(term855100, term855100.getClass(), "externAndJsRoot", null);
        setField(term855100, term855100.getClass(), "inputsByName", null);
        setField(term855100, term855100.getClass(), "sourceMap", null);
        setField(term855100, term855100.getClass(), "externExports", null);
        setIntField(term855100, term855100.getClass(), "uniqueNameId", 0);
        setBooleanField(term855100, term855100.getClass(), "useThreads", false);
        setBooleanField(term855100, term855100.getClass(), "hasRegExpGlobalReferences", false);
        setField(term855100, term855100.getClass(), "functionInformationMap", null);
        setField(term855100, term855100.getClass(), "debugLog", null);
        setField(term855100, term855100.getClass(), "defaultCodingConvention", null);
        setField(term855100, term855100.getClass(), "typeRegistry", null);
        setField(term855100, term855100.getClass(), "parserConfig", null);
        setField(term855100, term855100.getClass(), "abstractInterpreter", null);
        setField(term855100, term855100.getClass(), "typeValidator", null);
        setField(term855100, term855100.getClass(), "tracker", null);
        setField(term855100, term855100.getClass(), "oldErrorReporter", null);
        setField(term855100, term855100.getClass(), "defaultErrorReporter", null);
        setField(term855100, term855100.getClass(), "outStream", null);
        setField(term855100, term855100.getClass(), "globalRefMap", null);
        setField(term855100, term855100.getClass(), "sanityCheck", null);
        setField(term855100, term855100.getClass(), "currentTracer", null);
        setField(term855100, term855100.getClass(), "currentPassName", null);
        setField(term855100, term855100.getClass(), "recentChange", null);
        setField(term855100, term855100.getClass(), "codeChangeHandlers", null);
        setField(term855100, term855100.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Map");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "updateGlobalVarReferences", argTypes, term855100, args);
    }

};


