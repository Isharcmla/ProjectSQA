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

public class Compiler_getInputsForTesting_947229849260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term978114;

    public Compiler_getInputsForTesting_947229849260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term978114 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term978114, term978114.getClass(), "options", null);
        setField(term978114, term978114.getClass(), "passes", null);
        setField(term978114, term978114.getClass(), "externs", null);
        setField(term978114, term978114.getClass(), "modules", null);
        setField(term978114, term978114.getClass(), "moduleGraph", null);
        setField(term978114, term978114.getClass(), "inputs", null);
        setField(term978114, term978114.getClass(), "errorManager", null);
        setField(term978114, term978114.getClass(), "warningsGuard", null);
        setField(term978114, term978114.getClass(), "externsRoot", null);
        setField(term978114, term978114.getClass(), "jsRoot", null);
        setField(term978114, term978114.getClass(), "externAndJsRoot", null);
        setField(term978114, term978114.getClass(), "inputsByName", null);
        setField(term978114, term978114.getClass(), "sourceMap", null);
        setField(term978114, term978114.getClass(), "externExports", null);
        setIntField(term978114, term978114.getClass(), "uniqueNameId", 0);
        setBooleanField(term978114, term978114.getClass(), "useThreads", false);
        setBooleanField(term978114, term978114.getClass(), "hasRegExpGlobalReferences", false);
        setField(term978114, term978114.getClass(), "functionInformationMap", null);
        setField(term978114, term978114.getClass(), "debugLog", null);
        setField(term978114, term978114.getClass(), "defaultCodingConvention", null);
        setField(term978114, term978114.getClass(), "typeRegistry", null);
        setField(term978114, term978114.getClass(), "parserConfig", null);
        setField(term978114, term978114.getClass(), "abstractInterpreter", null);
        setField(term978114, term978114.getClass(), "typeValidator", null);
        setField(term978114, term978114.getClass(), "tracker", null);
        setField(term978114, term978114.getClass(), "oldErrorReporter", null);
        setField(term978114, term978114.getClass(), "defaultErrorReporter", null);
        setField(term978114, term978114.getClass(), "outStream", null);
        setField(term978114, term978114.getClass(), "globalRefMap", null);
        setField(term978114, term978114.getClass(), "sanityCheck", null);
        setField(term978114, term978114.getClass(), "currentTracer", null);
        setField(term978114, term978114.getClass(), "currentPassName", null);
        setField(term978114, term978114.getClass(), "recentChange", null);
        setField(term978114, term978114.getClass(), "codeChangeHandlers", null);
        setField(term978114, term978114.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInputsForTesting", argTypes, term978114, args);
    }

};


