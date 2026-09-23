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

public class Compiler_getTopScope_1114184721196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896246;

    public Compiler_getTopScope_1114184721196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896246 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896246, term896246.getClass(), "options", null);
        setField(term896246, term896246.getClass(), "passes", null);
        setField(term896246, term896246.getClass(), "externs", null);
        setField(term896246, term896246.getClass(), "modules", null);
        setField(term896246, term896246.getClass(), "moduleGraph", null);
        setField(term896246, term896246.getClass(), "inputs", null);
        setField(term896246, term896246.getClass(), "errorManager", null);
        setField(term896246, term896246.getClass(), "warningsGuard", null);
        setField(term896246, term896246.getClass(), "externsRoot", null);
        setField(term896246, term896246.getClass(), "jsRoot", null);
        setField(term896246, term896246.getClass(), "externAndJsRoot", null);
        setField(term896246, term896246.getClass(), "inputsByName", null);
        setField(term896246, term896246.getClass(), "sourceMap", null);
        setField(term896246, term896246.getClass(), "externExports", null);
        setIntField(term896246, term896246.getClass(), "uniqueNameId", 0);
        setBooleanField(term896246, term896246.getClass(), "useThreads", false);
        setBooleanField(term896246, term896246.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896246, term896246.getClass(), "functionInformationMap", null);
        setField(term896246, term896246.getClass(), "debugLog", null);
        setField(term896246, term896246.getClass(), "defaultCodingConvention", null);
        setField(term896246, term896246.getClass(), "typeRegistry", null);
        setField(term896246, term896246.getClass(), "parserConfig", null);
        setField(term896246, term896246.getClass(), "abstractInterpreter", null);
        setField(term896246, term896246.getClass(), "typeValidator", null);
        setField(term896246, term896246.getClass(), "tracker", null);
        setField(term896246, term896246.getClass(), "oldErrorReporter", null);
        setField(term896246, term896246.getClass(), "defaultErrorReporter", null);
        setField(term896246, term896246.getClass(), "outStream", null);
        setField(term896246, term896246.getClass(), "globalRefMap", null);
        setField(term896246, term896246.getClass(), "sanityCheck", null);
        setField(term896246, term896246.getClass(), "currentTracer", null);
        setField(term896246, term896246.getClass(), "currentPassName", null);
        setField(term896246, term896246.getClass(), "recentChange", null);
        setField(term896246, term896246.getClass(), "codeChangeHandlers", null);
        setField(term896246, term896246.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTopScope", argTypes, term896246, args);
    }

};


