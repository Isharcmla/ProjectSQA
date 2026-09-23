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

public class Compiler_setState_2030773784255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896488;

    public Compiler_setState_2030773784255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896488 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896488, term896488.getClass(), "options", null);
        setField(term896488, term896488.getClass(), "passes", null);
        setField(term896488, term896488.getClass(), "externs", null);
        setField(term896488, term896488.getClass(), "modules", null);
        setField(term896488, term896488.getClass(), "moduleGraph", null);
        setField(term896488, term896488.getClass(), "inputs", null);
        setField(term896488, term896488.getClass(), "errorManager", null);
        setField(term896488, term896488.getClass(), "warningsGuard", null);
        setField(term896488, term896488.getClass(), "externsRoot", null);
        setField(term896488, term896488.getClass(), "jsRoot", null);
        setField(term896488, term896488.getClass(), "externAndJsRoot", null);
        setField(term896488, term896488.getClass(), "inputsByName", null);
        setField(term896488, term896488.getClass(), "sourceMap", null);
        setField(term896488, term896488.getClass(), "externExports", null);
        setIntField(term896488, term896488.getClass(), "uniqueNameId", 0);
        setBooleanField(term896488, term896488.getClass(), "useThreads", false);
        setBooleanField(term896488, term896488.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896488, term896488.getClass(), "functionInformationMap", null);
        setField(term896488, term896488.getClass(), "debugLog", null);
        setField(term896488, term896488.getClass(), "defaultCodingConvention", null);
        setField(term896488, term896488.getClass(), "typeRegistry", null);
        setField(term896488, term896488.getClass(), "parserConfig", null);
        setField(term896488, term896488.getClass(), "abstractInterpreter", null);
        setField(term896488, term896488.getClass(), "typeValidator", null);
        setField(term896488, term896488.getClass(), "tracker", null);
        setField(term896488, term896488.getClass(), "oldErrorReporter", null);
        setField(term896488, term896488.getClass(), "defaultErrorReporter", null);
        setField(term896488, term896488.getClass(), "outStream", null);
        setField(term896488, term896488.getClass(), "globalRefMap", null);
        setField(term896488, term896488.getClass(), "sanityCheck", null);
        setField(term896488, term896488.getClass(), "currentTracer", null);
        setField(term896488, term896488.getClass(), "currentPassName", null);
        setField(term896488, term896488.getClass(), "recentChange", null);
        setField(term896488, term896488.getClass(), "codeChangeHandlers", null);
        setField(term896488, term896488.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Compiler$IntermediateState");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setState", argTypes, term896488, args);
    }

};


