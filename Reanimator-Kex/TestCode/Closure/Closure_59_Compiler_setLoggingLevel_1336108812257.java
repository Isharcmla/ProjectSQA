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

public class Compiler_setLoggingLevel_1336108812257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term855054;

    public Compiler_setLoggingLevel_1336108812257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term855054 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term855054, term855054.getClass(), "options", null);
        setField(term855054, term855054.getClass(), "passes", null);
        setField(term855054, term855054.getClass(), "externs", null);
        setField(term855054, term855054.getClass(), "modules", null);
        setField(term855054, term855054.getClass(), "moduleGraph", null);
        setField(term855054, term855054.getClass(), "inputs", null);
        setField(term855054, term855054.getClass(), "errorManager", null);
        setField(term855054, term855054.getClass(), "warningsGuard", null);
        setField(term855054, term855054.getClass(), "externsRoot", null);
        setField(term855054, term855054.getClass(), "jsRoot", null);
        setField(term855054, term855054.getClass(), "externAndJsRoot", null);
        setField(term855054, term855054.getClass(), "inputsByName", null);
        setField(term855054, term855054.getClass(), "sourceMap", null);
        setField(term855054, term855054.getClass(), "externExports", null);
        setIntField(term855054, term855054.getClass(), "uniqueNameId", 0);
        setBooleanField(term855054, term855054.getClass(), "useThreads", false);
        setBooleanField(term855054, term855054.getClass(), "hasRegExpGlobalReferences", false);
        setField(term855054, term855054.getClass(), "functionInformationMap", null);
        setField(term855054, term855054.getClass(), "debugLog", null);
        setField(term855054, term855054.getClass(), "defaultCodingConvention", null);
        setField(term855054, term855054.getClass(), "typeRegistry", null);
        setField(term855054, term855054.getClass(), "parserConfig", null);
        setField(term855054, term855054.getClass(), "abstractInterpreter", null);
        setField(term855054, term855054.getClass(), "typeValidator", null);
        setField(term855054, term855054.getClass(), "tracker", null);
        setField(term855054, term855054.getClass(), "oldErrorReporter", null);
        setField(term855054, term855054.getClass(), "defaultErrorReporter", null);
        setField(term855054, term855054.getClass(), "outStream", null);
        setField(term855054, term855054.getClass(), "globalRefMap", null);
        setField(term855054, term855054.getClass(), "sanityCheck", null);
        setField(term855054, term855054.getClass(), "currentTracer", null);
        setField(term855054, term855054.getClass(), "currentPassName", null);
        setField(term855054, term855054.getClass(), "recentChange", null);
        setField(term855054, term855054.getClass(), "codeChangeHandlers", null);
        setField(term855054, term855054.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.logging.Level");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLoggingLevel", argTypes, term855054, args);
    }

};


