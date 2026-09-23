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

public class Compiler_hasRegExpGlobalReferences_527666191262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term978122;

    public Compiler_hasRegExpGlobalReferences_527666191262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term978122 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term978122, term978122.getClass(), "options", null);
        setField(term978122, term978122.getClass(), "passes", null);
        setField(term978122, term978122.getClass(), "externs", null);
        setField(term978122, term978122.getClass(), "modules", null);
        setField(term978122, term978122.getClass(), "moduleGraph", null);
        setField(term978122, term978122.getClass(), "inputs", null);
        setField(term978122, term978122.getClass(), "errorManager", null);
        setField(term978122, term978122.getClass(), "warningsGuard", null);
        setField(term978122, term978122.getClass(), "externsRoot", null);
        setField(term978122, term978122.getClass(), "jsRoot", null);
        setField(term978122, term978122.getClass(), "externAndJsRoot", null);
        setField(term978122, term978122.getClass(), "inputsByName", null);
        setField(term978122, term978122.getClass(), "sourceMap", null);
        setField(term978122, term978122.getClass(), "externExports", null);
        setIntField(term978122, term978122.getClass(), "uniqueNameId", 0);
        setBooleanField(term978122, term978122.getClass(), "useThreads", false);
        setBooleanField(term978122, term978122.getClass(), "hasRegExpGlobalReferences", false);
        setField(term978122, term978122.getClass(), "functionInformationMap", null);
        setField(term978122, term978122.getClass(), "debugLog", null);
        setField(term978122, term978122.getClass(), "defaultCodingConvention", null);
        setField(term978122, term978122.getClass(), "typeRegistry", null);
        setField(term978122, term978122.getClass(), "parserConfig", null);
        setField(term978122, term978122.getClass(), "abstractInterpreter", null);
        setField(term978122, term978122.getClass(), "typeValidator", null);
        setField(term978122, term978122.getClass(), "tracker", null);
        setField(term978122, term978122.getClass(), "oldErrorReporter", null);
        setField(term978122, term978122.getClass(), "defaultErrorReporter", null);
        setField(term978122, term978122.getClass(), "outStream", null);
        setField(term978122, term978122.getClass(), "globalRefMap", null);
        setField(term978122, term978122.getClass(), "sanityCheck", null);
        setField(term978122, term978122.getClass(), "currentTracer", null);
        setField(term978122, term978122.getClass(), "currentPassName", null);
        setField(term978122, term978122.getClass(), "recentChange", null);
        setField(term978122, term978122.getClass(), "codeChangeHandlers", null);
        setField(term978122, term978122.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasRegExpGlobalReferences", argTypes, term978122, args);
    }

};


