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

public class Compiler_updateGlobalVarReferences_1903229823264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term978132;

    public Compiler_updateGlobalVarReferences_1903229823264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term978132 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term978132, term978132.getClass(), "options", null);
        setField(term978132, term978132.getClass(), "passes", null);
        setField(term978132, term978132.getClass(), "externs", null);
        setField(term978132, term978132.getClass(), "modules", null);
        setField(term978132, term978132.getClass(), "moduleGraph", null);
        setField(term978132, term978132.getClass(), "inputs", null);
        setField(term978132, term978132.getClass(), "errorManager", null);
        setField(term978132, term978132.getClass(), "warningsGuard", null);
        setField(term978132, term978132.getClass(), "externsRoot", null);
        setField(term978132, term978132.getClass(), "jsRoot", null);
        setField(term978132, term978132.getClass(), "externAndJsRoot", null);
        setField(term978132, term978132.getClass(), "inputsByName", null);
        setField(term978132, term978132.getClass(), "sourceMap", null);
        setField(term978132, term978132.getClass(), "externExports", null);
        setIntField(term978132, term978132.getClass(), "uniqueNameId", 0);
        setBooleanField(term978132, term978132.getClass(), "useThreads", false);
        setBooleanField(term978132, term978132.getClass(), "hasRegExpGlobalReferences", false);
        setField(term978132, term978132.getClass(), "functionInformationMap", null);
        setField(term978132, term978132.getClass(), "debugLog", null);
        setField(term978132, term978132.getClass(), "defaultCodingConvention", null);
        setField(term978132, term978132.getClass(), "typeRegistry", null);
        setField(term978132, term978132.getClass(), "parserConfig", null);
        setField(term978132, term978132.getClass(), "abstractInterpreter", null);
        setField(term978132, term978132.getClass(), "typeValidator", null);
        setField(term978132, term978132.getClass(), "tracker", null);
        setField(term978132, term978132.getClass(), "oldErrorReporter", null);
        setField(term978132, term978132.getClass(), "defaultErrorReporter", null);
        setField(term978132, term978132.getClass(), "outStream", null);
        setField(term978132, term978132.getClass(), "globalRefMap", null);
        setField(term978132, term978132.getClass(), "sanityCheck", null);
        setField(term978132, term978132.getClass(), "currentTracer", null);
        setField(term978132, term978132.getClass(), "currentPassName", null);
        setField(term978132, term978132.getClass(), "recentChange", null);
        setField(term978132, term978132.getClass(), "codeChangeHandlers", null);
        setField(term978132, term978132.getClass(), "stage", null);
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
        callMethod(klass, "updateGlobalVarReferences", argTypes, term978132, args);
    }

};


