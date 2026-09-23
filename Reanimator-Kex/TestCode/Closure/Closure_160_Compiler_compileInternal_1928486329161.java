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

public class Compiler_compileInternal_1928486329161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896106;

    public Compiler_compileInternal_1928486329161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896106 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896106, term896106.getClass(), "options", null);
        setField(term896106, term896106.getClass(), "passes", null);
        setField(term896106, term896106.getClass(), "externs", null);
        setField(term896106, term896106.getClass(), "modules", null);
        setField(term896106, term896106.getClass(), "moduleGraph", null);
        setField(term896106, term896106.getClass(), "inputs", null);
        setField(term896106, term896106.getClass(), "errorManager", null);
        setField(term896106, term896106.getClass(), "warningsGuard", null);
        setField(term896106, term896106.getClass(), "externsRoot", null);
        setField(term896106, term896106.getClass(), "jsRoot", null);
        setField(term896106, term896106.getClass(), "externAndJsRoot", null);
        setField(term896106, term896106.getClass(), "inputsByName", null);
        setField(term896106, term896106.getClass(), "sourceMap", null);
        setField(term896106, term896106.getClass(), "externExports", null);
        setIntField(term896106, term896106.getClass(), "uniqueNameId", 0);
        setBooleanField(term896106, term896106.getClass(), "useThreads", false);
        setBooleanField(term896106, term896106.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896106, term896106.getClass(), "functionInformationMap", null);
        setField(term896106, term896106.getClass(), "debugLog", null);
        setField(term896106, term896106.getClass(), "defaultCodingConvention", null);
        setField(term896106, term896106.getClass(), "typeRegistry", null);
        setField(term896106, term896106.getClass(), "parserConfig", null);
        setField(term896106, term896106.getClass(), "abstractInterpreter", null);
        setField(term896106, term896106.getClass(), "typeValidator", null);
        setField(term896106, term896106.getClass(), "tracker", null);
        setField(term896106, term896106.getClass(), "oldErrorReporter", null);
        setField(term896106, term896106.getClass(), "defaultErrorReporter", null);
        setField(term896106, term896106.getClass(), "outStream", null);
        setField(term896106, term896106.getClass(), "globalRefMap", null);
        setField(term896106, term896106.getClass(), "sanityCheck", null);
        setField(term896106, term896106.getClass(), "currentTracer", null);
        setField(term896106, term896106.getClass(), "currentPassName", null);
        setField(term896106, term896106.getClass(), "recentChange", null);
        setField(term896106, term896106.getClass(), "codeChangeHandlers", null);
        setField(term896106, term896106.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compileInternal", argTypes, term896106, args);
    }

};


