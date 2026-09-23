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

public class Compiler_runCallableWithLargeStack_1887266370159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896094;

    public Compiler_runCallableWithLargeStack_1887266370159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896094 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896094, term896094.getClass(), "options", null);
        setField(term896094, term896094.getClass(), "passes", null);
        setField(term896094, term896094.getClass(), "externs", null);
        setField(term896094, term896094.getClass(), "modules", null);
        setField(term896094, term896094.getClass(), "moduleGraph", null);
        setField(term896094, term896094.getClass(), "inputs", null);
        setField(term896094, term896094.getClass(), "errorManager", null);
        setField(term896094, term896094.getClass(), "warningsGuard", null);
        setField(term896094, term896094.getClass(), "externsRoot", null);
        setField(term896094, term896094.getClass(), "jsRoot", null);
        setField(term896094, term896094.getClass(), "externAndJsRoot", null);
        setField(term896094, term896094.getClass(), "inputsByName", null);
        setField(term896094, term896094.getClass(), "sourceMap", null);
        setField(term896094, term896094.getClass(), "externExports", null);
        setIntField(term896094, term896094.getClass(), "uniqueNameId", 0);
        setBooleanField(term896094, term896094.getClass(), "useThreads", false);
        setBooleanField(term896094, term896094.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896094, term896094.getClass(), "functionInformationMap", null);
        setField(term896094, term896094.getClass(), "debugLog", null);
        setField(term896094, term896094.getClass(), "defaultCodingConvention", null);
        setField(term896094, term896094.getClass(), "typeRegistry", null);
        setField(term896094, term896094.getClass(), "parserConfig", null);
        setField(term896094, term896094.getClass(), "abstractInterpreter", null);
        setField(term896094, term896094.getClass(), "typeValidator", null);
        setField(term896094, term896094.getClass(), "tracker", null);
        setField(term896094, term896094.getClass(), "oldErrorReporter", null);
        setField(term896094, term896094.getClass(), "defaultErrorReporter", null);
        setField(term896094, term896094.getClass(), "outStream", null);
        setField(term896094, term896094.getClass(), "globalRefMap", null);
        setField(term896094, term896094.getClass(), "sanityCheck", null);
        setField(term896094, term896094.getClass(), "currentTracer", null);
        setField(term896094, term896094.getClass(), "currentPassName", null);
        setField(term896094, term896094.getClass(), "recentChange", null);
        setField(term896094, term896094.getClass(), "codeChangeHandlers", null);
        setField(term896094, term896094.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.concurrent.Callable");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "runCallableWithLargeStack", argTypes, term896094, args);
    }

};


