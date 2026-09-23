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

public class Compiler_newTracer_1832709737177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896170;

    public Compiler_newTracer_1832709737177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896170 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896170, term896170.getClass(), "options", null);
        setField(term896170, term896170.getClass(), "passes", null);
        setField(term896170, term896170.getClass(), "externs", null);
        setField(term896170, term896170.getClass(), "modules", null);
        setField(term896170, term896170.getClass(), "moduleGraph", null);
        setField(term896170, term896170.getClass(), "inputs", null);
        setField(term896170, term896170.getClass(), "errorManager", null);
        setField(term896170, term896170.getClass(), "warningsGuard", null);
        setField(term896170, term896170.getClass(), "externsRoot", null);
        setField(term896170, term896170.getClass(), "jsRoot", null);
        setField(term896170, term896170.getClass(), "externAndJsRoot", null);
        setField(term896170, term896170.getClass(), "inputsByName", null);
        setField(term896170, term896170.getClass(), "sourceMap", null);
        setField(term896170, term896170.getClass(), "externExports", null);
        setIntField(term896170, term896170.getClass(), "uniqueNameId", 0);
        setBooleanField(term896170, term896170.getClass(), "useThreads", false);
        setBooleanField(term896170, term896170.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896170, term896170.getClass(), "functionInformationMap", null);
        setField(term896170, term896170.getClass(), "debugLog", null);
        setField(term896170, term896170.getClass(), "defaultCodingConvention", null);
        setField(term896170, term896170.getClass(), "typeRegistry", null);
        setField(term896170, term896170.getClass(), "parserConfig", null);
        setField(term896170, term896170.getClass(), "abstractInterpreter", null);
        setField(term896170, term896170.getClass(), "typeValidator", null);
        setField(term896170, term896170.getClass(), "tracker", null);
        setField(term896170, term896170.getClass(), "oldErrorReporter", null);
        setField(term896170, term896170.getClass(), "defaultErrorReporter", null);
        setField(term896170, term896170.getClass(), "outStream", null);
        setField(term896170, term896170.getClass(), "globalRefMap", null);
        setField(term896170, term896170.getClass(), "sanityCheck", null);
        setField(term896170, term896170.getClass(), "currentTracer", null);
        setField(term896170, term896170.getClass(), "currentPassName", null);
        setField(term896170, term896170.getClass(), "recentChange", null);
        setField(term896170, term896170.getClass(), "codeChangeHandlers", null);
        setField(term896170, term896170.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "newTracer", argTypes, term896170, args);
    }

};


