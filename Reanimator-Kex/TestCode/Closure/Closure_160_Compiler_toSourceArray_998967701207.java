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

public class Compiler_toSourceArray_998967701207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896290;

    public Compiler_toSourceArray_998967701207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896290 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896290, term896290.getClass(), "options", null);
        setField(term896290, term896290.getClass(), "passes", null);
        setField(term896290, term896290.getClass(), "externs", null);
        setField(term896290, term896290.getClass(), "modules", null);
        setField(term896290, term896290.getClass(), "moduleGraph", null);
        setField(term896290, term896290.getClass(), "inputs", null);
        setField(term896290, term896290.getClass(), "errorManager", null);
        setField(term896290, term896290.getClass(), "warningsGuard", null);
        setField(term896290, term896290.getClass(), "externsRoot", null);
        setField(term896290, term896290.getClass(), "jsRoot", null);
        setField(term896290, term896290.getClass(), "externAndJsRoot", null);
        setField(term896290, term896290.getClass(), "inputsByName", null);
        setField(term896290, term896290.getClass(), "sourceMap", null);
        setField(term896290, term896290.getClass(), "externExports", null);
        setIntField(term896290, term896290.getClass(), "uniqueNameId", 0);
        setBooleanField(term896290, term896290.getClass(), "useThreads", false);
        setBooleanField(term896290, term896290.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896290, term896290.getClass(), "functionInformationMap", null);
        setField(term896290, term896290.getClass(), "debugLog", null);
        setField(term896290, term896290.getClass(), "defaultCodingConvention", null);
        setField(term896290, term896290.getClass(), "typeRegistry", null);
        setField(term896290, term896290.getClass(), "parserConfig", null);
        setField(term896290, term896290.getClass(), "abstractInterpreter", null);
        setField(term896290, term896290.getClass(), "typeValidator", null);
        setField(term896290, term896290.getClass(), "tracker", null);
        setField(term896290, term896290.getClass(), "oldErrorReporter", null);
        setField(term896290, term896290.getClass(), "defaultErrorReporter", null);
        setField(term896290, term896290.getClass(), "outStream", null);
        setField(term896290, term896290.getClass(), "globalRefMap", null);
        setField(term896290, term896290.getClass(), "sanityCheck", null);
        setField(term896290, term896290.getClass(), "currentTracer", null);
        setField(term896290, term896290.getClass(), "currentPassName", null);
        setField(term896290, term896290.getClass(), "recentChange", null);
        setField(term896290, term896290.getClass(), "codeChangeHandlers", null);
        setField(term896290, term896290.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toSourceArray", argTypes, term896290, args);
    }

};


