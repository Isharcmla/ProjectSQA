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

public class Compiler_getTopScope_1114184721200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977868;

    public Compiler_getTopScope_1114184721200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977868 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term977868, term977868.getClass(), "options", null);
        setField(term977868, term977868.getClass(), "passes", null);
        setField(term977868, term977868.getClass(), "externs", null);
        setField(term977868, term977868.getClass(), "modules", null);
        setField(term977868, term977868.getClass(), "moduleGraph", null);
        setField(term977868, term977868.getClass(), "inputs", null);
        setField(term977868, term977868.getClass(), "errorManager", null);
        setField(term977868, term977868.getClass(), "warningsGuard", null);
        setField(term977868, term977868.getClass(), "externsRoot", null);
        setField(term977868, term977868.getClass(), "jsRoot", null);
        setField(term977868, term977868.getClass(), "externAndJsRoot", null);
        setField(term977868, term977868.getClass(), "inputsByName", null);
        setField(term977868, term977868.getClass(), "sourceMap", null);
        setField(term977868, term977868.getClass(), "externExports", null);
        setIntField(term977868, term977868.getClass(), "uniqueNameId", 0);
        setBooleanField(term977868, term977868.getClass(), "useThreads", false);
        setBooleanField(term977868, term977868.getClass(), "hasRegExpGlobalReferences", false);
        setField(term977868, term977868.getClass(), "functionInformationMap", null);
        setField(term977868, term977868.getClass(), "debugLog", null);
        setField(term977868, term977868.getClass(), "defaultCodingConvention", null);
        setField(term977868, term977868.getClass(), "typeRegistry", null);
        setField(term977868, term977868.getClass(), "parserConfig", null);
        setField(term977868, term977868.getClass(), "abstractInterpreter", null);
        setField(term977868, term977868.getClass(), "typeValidator", null);
        setField(term977868, term977868.getClass(), "tracker", null);
        setField(term977868, term977868.getClass(), "oldErrorReporter", null);
        setField(term977868, term977868.getClass(), "defaultErrorReporter", null);
        setField(term977868, term977868.getClass(), "outStream", null);
        setField(term977868, term977868.getClass(), "globalRefMap", null);
        setField(term977868, term977868.getClass(), "sanityCheck", null);
        setField(term977868, term977868.getClass(), "currentTracer", null);
        setField(term977868, term977868.getClass(), "currentPassName", null);
        setField(term977868, term977868.getClass(), "recentChange", null);
        setField(term977868, term977868.getClass(), "codeChangeHandlers", null);
        setField(term977868, term977868.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTopScope", argTypes, term977868, args);
    }

};


