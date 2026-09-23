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

public class Compiler_disableThreads_1664126056161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977708;

    public Compiler_disableThreads_1664126056161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977708 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term977708, term977708.getClass(), "options", null);
        setField(term977708, term977708.getClass(), "passes", null);
        setField(term977708, term977708.getClass(), "externs", null);
        setField(term977708, term977708.getClass(), "modules", null);
        setField(term977708, term977708.getClass(), "moduleGraph", null);
        setField(term977708, term977708.getClass(), "inputs", null);
        setField(term977708, term977708.getClass(), "errorManager", null);
        setField(term977708, term977708.getClass(), "warningsGuard", null);
        setField(term977708, term977708.getClass(), "externsRoot", null);
        setField(term977708, term977708.getClass(), "jsRoot", null);
        setField(term977708, term977708.getClass(), "externAndJsRoot", null);
        setField(term977708, term977708.getClass(), "inputsByName", null);
        setField(term977708, term977708.getClass(), "sourceMap", null);
        setField(term977708, term977708.getClass(), "externExports", null);
        setIntField(term977708, term977708.getClass(), "uniqueNameId", 0);
        setBooleanField(term977708, term977708.getClass(), "useThreads", false);
        setBooleanField(term977708, term977708.getClass(), "hasRegExpGlobalReferences", false);
        setField(term977708, term977708.getClass(), "functionInformationMap", null);
        setField(term977708, term977708.getClass(), "debugLog", null);
        setField(term977708, term977708.getClass(), "defaultCodingConvention", null);
        setField(term977708, term977708.getClass(), "typeRegistry", null);
        setField(term977708, term977708.getClass(), "parserConfig", null);
        setField(term977708, term977708.getClass(), "abstractInterpreter", null);
        setField(term977708, term977708.getClass(), "typeValidator", null);
        setField(term977708, term977708.getClass(), "tracker", null);
        setField(term977708, term977708.getClass(), "oldErrorReporter", null);
        setField(term977708, term977708.getClass(), "defaultErrorReporter", null);
        setField(term977708, term977708.getClass(), "outStream", null);
        setField(term977708, term977708.getClass(), "globalRefMap", null);
        setField(term977708, term977708.getClass(), "sanityCheck", null);
        setField(term977708, term977708.getClass(), "currentTracer", null);
        setField(term977708, term977708.getClass(), "currentPassName", null);
        setField(term977708, term977708.getClass(), "recentChange", null);
        setField(term977708, term977708.getClass(), "codeChangeHandlers", null);
        setField(term977708, term977708.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "disableThreads", argTypes, term977708, args);
    }

};


