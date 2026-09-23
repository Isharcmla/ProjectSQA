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

public class Compiler_addToDebugLog_388864321247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term855010;

    public Compiler_addToDebugLog_388864321247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term855010 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term855010, term855010.getClass(), "options", null);
        setField(term855010, term855010.getClass(), "passes", null);
        setField(term855010, term855010.getClass(), "externs", null);
        setField(term855010, term855010.getClass(), "modules", null);
        setField(term855010, term855010.getClass(), "moduleGraph", null);
        setField(term855010, term855010.getClass(), "inputs", null);
        setField(term855010, term855010.getClass(), "errorManager", null);
        setField(term855010, term855010.getClass(), "warningsGuard", null);
        setField(term855010, term855010.getClass(), "externsRoot", null);
        setField(term855010, term855010.getClass(), "jsRoot", null);
        setField(term855010, term855010.getClass(), "externAndJsRoot", null);
        setField(term855010, term855010.getClass(), "inputsByName", null);
        setField(term855010, term855010.getClass(), "sourceMap", null);
        setField(term855010, term855010.getClass(), "externExports", null);
        setIntField(term855010, term855010.getClass(), "uniqueNameId", 0);
        setBooleanField(term855010, term855010.getClass(), "useThreads", false);
        setBooleanField(term855010, term855010.getClass(), "hasRegExpGlobalReferences", false);
        setField(term855010, term855010.getClass(), "functionInformationMap", null);
        setField(term855010, term855010.getClass(), "debugLog", null);
        setField(term855010, term855010.getClass(), "defaultCodingConvention", null);
        setField(term855010, term855010.getClass(), "typeRegistry", null);
        setField(term855010, term855010.getClass(), "parserConfig", null);
        setField(term855010, term855010.getClass(), "abstractInterpreter", null);
        setField(term855010, term855010.getClass(), "typeValidator", null);
        setField(term855010, term855010.getClass(), "tracker", null);
        setField(term855010, term855010.getClass(), "oldErrorReporter", null);
        setField(term855010, term855010.getClass(), "defaultErrorReporter", null);
        setField(term855010, term855010.getClass(), "outStream", null);
        setField(term855010, term855010.getClass(), "globalRefMap", null);
        setField(term855010, term855010.getClass(), "sanityCheck", null);
        setField(term855010, term855010.getClass(), "currentTracer", null);
        setField(term855010, term855010.getClass(), "currentPassName", null);
        setField(term855010, term855010.getClass(), "recentChange", null);
        setField(term855010, term855010.getClass(), "codeChangeHandlers", null);
        setField(term855010, term855010.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addToDebugLog", argTypes, term855010, args);
    }

};


