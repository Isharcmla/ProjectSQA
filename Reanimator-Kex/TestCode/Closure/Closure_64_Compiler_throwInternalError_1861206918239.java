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

public class Compiler_throwInternalError_1861206918239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term978026;

    public Compiler_throwInternalError_1861206918239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term978026 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term978026, term978026.getClass(), "options", null);
        setField(term978026, term978026.getClass(), "passes", null);
        setField(term978026, term978026.getClass(), "externs", null);
        setField(term978026, term978026.getClass(), "modules", null);
        setField(term978026, term978026.getClass(), "moduleGraph", null);
        setField(term978026, term978026.getClass(), "inputs", null);
        setField(term978026, term978026.getClass(), "errorManager", null);
        setField(term978026, term978026.getClass(), "warningsGuard", null);
        setField(term978026, term978026.getClass(), "externsRoot", null);
        setField(term978026, term978026.getClass(), "jsRoot", null);
        setField(term978026, term978026.getClass(), "externAndJsRoot", null);
        setField(term978026, term978026.getClass(), "inputsByName", null);
        setField(term978026, term978026.getClass(), "sourceMap", null);
        setField(term978026, term978026.getClass(), "externExports", null);
        setIntField(term978026, term978026.getClass(), "uniqueNameId", 0);
        setBooleanField(term978026, term978026.getClass(), "useThreads", false);
        setBooleanField(term978026, term978026.getClass(), "hasRegExpGlobalReferences", false);
        setField(term978026, term978026.getClass(), "functionInformationMap", null);
        setField(term978026, term978026.getClass(), "debugLog", null);
        setField(term978026, term978026.getClass(), "defaultCodingConvention", null);
        setField(term978026, term978026.getClass(), "typeRegistry", null);
        setField(term978026, term978026.getClass(), "parserConfig", null);
        setField(term978026, term978026.getClass(), "abstractInterpreter", null);
        setField(term978026, term978026.getClass(), "typeValidator", null);
        setField(term978026, term978026.getClass(), "tracker", null);
        setField(term978026, term978026.getClass(), "oldErrorReporter", null);
        setField(term978026, term978026.getClass(), "defaultErrorReporter", null);
        setField(term978026, term978026.getClass(), "outStream", null);
        setField(term978026, term978026.getClass(), "globalRefMap", null);
        setField(term978026, term978026.getClass(), "sanityCheck", null);
        setField(term978026, term978026.getClass(), "currentTracer", null);
        setField(term978026, term978026.getClass(), "currentPassName", null);
        setField(term978026, term978026.getClass(), "recentChange", null);
        setField(term978026, term978026.getClass(), "codeChangeHandlers", null);
        setField(term978026, term978026.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Exception");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "throwInternalError", argTypes, term978026, args);
    }

};


