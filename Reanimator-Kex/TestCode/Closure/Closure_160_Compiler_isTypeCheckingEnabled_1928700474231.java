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

public class Compiler_isTypeCheckingEnabled_1928700474231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896388;

    public Compiler_isTypeCheckingEnabled_1928700474231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896388 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896388, term896388.getClass(), "options", null);
        setField(term896388, term896388.getClass(), "passes", null);
        setField(term896388, term896388.getClass(), "externs", null);
        setField(term896388, term896388.getClass(), "modules", null);
        setField(term896388, term896388.getClass(), "moduleGraph", null);
        setField(term896388, term896388.getClass(), "inputs", null);
        setField(term896388, term896388.getClass(), "errorManager", null);
        setField(term896388, term896388.getClass(), "warningsGuard", null);
        setField(term896388, term896388.getClass(), "externsRoot", null);
        setField(term896388, term896388.getClass(), "jsRoot", null);
        setField(term896388, term896388.getClass(), "externAndJsRoot", null);
        setField(term896388, term896388.getClass(), "inputsByName", null);
        setField(term896388, term896388.getClass(), "sourceMap", null);
        setField(term896388, term896388.getClass(), "externExports", null);
        setIntField(term896388, term896388.getClass(), "uniqueNameId", 0);
        setBooleanField(term896388, term896388.getClass(), "useThreads", false);
        setBooleanField(term896388, term896388.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896388, term896388.getClass(), "functionInformationMap", null);
        setField(term896388, term896388.getClass(), "debugLog", null);
        setField(term896388, term896388.getClass(), "defaultCodingConvention", null);
        setField(term896388, term896388.getClass(), "typeRegistry", null);
        setField(term896388, term896388.getClass(), "parserConfig", null);
        setField(term896388, term896388.getClass(), "abstractInterpreter", null);
        setField(term896388, term896388.getClass(), "typeValidator", null);
        setField(term896388, term896388.getClass(), "tracker", null);
        setField(term896388, term896388.getClass(), "oldErrorReporter", null);
        setField(term896388, term896388.getClass(), "defaultErrorReporter", null);
        setField(term896388, term896388.getClass(), "outStream", null);
        setField(term896388, term896388.getClass(), "globalRefMap", null);
        setField(term896388, term896388.getClass(), "sanityCheck", null);
        setField(term896388, term896388.getClass(), "currentTracer", null);
        setField(term896388, term896388.getClass(), "currentPassName", null);
        setField(term896388, term896388.getClass(), "recentChange", null);
        setField(term896388, term896388.getClass(), "codeChangeHandlers", null);
        setField(term896388, term896388.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isTypeCheckingEnabled", argTypes, term896388, args);
    }

};


