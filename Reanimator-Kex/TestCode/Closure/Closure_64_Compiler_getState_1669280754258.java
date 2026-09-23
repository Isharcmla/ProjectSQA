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

public class Compiler_getState_1669280754258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term978106;

    public Compiler_getState_1669280754258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term978106 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term978106, term978106.getClass(), "options", null);
        setField(term978106, term978106.getClass(), "passes", null);
        setField(term978106, term978106.getClass(), "externs", null);
        setField(term978106, term978106.getClass(), "modules", null);
        setField(term978106, term978106.getClass(), "moduleGraph", null);
        setField(term978106, term978106.getClass(), "inputs", null);
        setField(term978106, term978106.getClass(), "errorManager", null);
        setField(term978106, term978106.getClass(), "warningsGuard", null);
        setField(term978106, term978106.getClass(), "externsRoot", null);
        setField(term978106, term978106.getClass(), "jsRoot", null);
        setField(term978106, term978106.getClass(), "externAndJsRoot", null);
        setField(term978106, term978106.getClass(), "inputsByName", null);
        setField(term978106, term978106.getClass(), "sourceMap", null);
        setField(term978106, term978106.getClass(), "externExports", null);
        setIntField(term978106, term978106.getClass(), "uniqueNameId", 0);
        setBooleanField(term978106, term978106.getClass(), "useThreads", false);
        setBooleanField(term978106, term978106.getClass(), "hasRegExpGlobalReferences", false);
        setField(term978106, term978106.getClass(), "functionInformationMap", null);
        setField(term978106, term978106.getClass(), "debugLog", null);
        setField(term978106, term978106.getClass(), "defaultCodingConvention", null);
        setField(term978106, term978106.getClass(), "typeRegistry", null);
        setField(term978106, term978106.getClass(), "parserConfig", null);
        setField(term978106, term978106.getClass(), "abstractInterpreter", null);
        setField(term978106, term978106.getClass(), "typeValidator", null);
        setField(term978106, term978106.getClass(), "tracker", null);
        setField(term978106, term978106.getClass(), "oldErrorReporter", null);
        setField(term978106, term978106.getClass(), "defaultErrorReporter", null);
        setField(term978106, term978106.getClass(), "outStream", null);
        setField(term978106, term978106.getClass(), "globalRefMap", null);
        setField(term978106, term978106.getClass(), "sanityCheck", null);
        setField(term978106, term978106.getClass(), "currentTracer", null);
        setField(term978106, term978106.getClass(), "currentPassName", null);
        setField(term978106, term978106.getClass(), "recentChange", null);
        setField(term978106, term978106.getClass(), "codeChangeHandlers", null);
        setField(term978106, term978106.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getState", argTypes, term978106, args);
    }

};


