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

public class Compiler_addToDebugLog_388864321244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term978046;

    public Compiler_addToDebugLog_388864321244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term978046 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term978046, term978046.getClass(), "options", null);
        setField(term978046, term978046.getClass(), "passes", null);
        setField(term978046, term978046.getClass(), "externs", null);
        setField(term978046, term978046.getClass(), "modules", null);
        setField(term978046, term978046.getClass(), "moduleGraph", null);
        setField(term978046, term978046.getClass(), "inputs", null);
        setField(term978046, term978046.getClass(), "errorManager", null);
        setField(term978046, term978046.getClass(), "warningsGuard", null);
        setField(term978046, term978046.getClass(), "externsRoot", null);
        setField(term978046, term978046.getClass(), "jsRoot", null);
        setField(term978046, term978046.getClass(), "externAndJsRoot", null);
        setField(term978046, term978046.getClass(), "inputsByName", null);
        setField(term978046, term978046.getClass(), "sourceMap", null);
        setField(term978046, term978046.getClass(), "externExports", null);
        setIntField(term978046, term978046.getClass(), "uniqueNameId", 0);
        setBooleanField(term978046, term978046.getClass(), "useThreads", false);
        setBooleanField(term978046, term978046.getClass(), "hasRegExpGlobalReferences", false);
        setField(term978046, term978046.getClass(), "functionInformationMap", null);
        setField(term978046, term978046.getClass(), "debugLog", null);
        setField(term978046, term978046.getClass(), "defaultCodingConvention", null);
        setField(term978046, term978046.getClass(), "typeRegistry", null);
        setField(term978046, term978046.getClass(), "parserConfig", null);
        setField(term978046, term978046.getClass(), "abstractInterpreter", null);
        setField(term978046, term978046.getClass(), "typeValidator", null);
        setField(term978046, term978046.getClass(), "tracker", null);
        setField(term978046, term978046.getClass(), "oldErrorReporter", null);
        setField(term978046, term978046.getClass(), "defaultErrorReporter", null);
        setField(term978046, term978046.getClass(), "outStream", null);
        setField(term978046, term978046.getClass(), "globalRefMap", null);
        setField(term978046, term978046.getClass(), "sanityCheck", null);
        setField(term978046, term978046.getClass(), "currentTracer", null);
        setField(term978046, term978046.getClass(), "currentPassName", null);
        setField(term978046, term978046.getClass(), "recentChange", null);
        setField(term978046, term978046.getClass(), "codeChangeHandlers", null);
        setField(term978046, term978046.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addToDebugLog", argTypes, term978046, args);
    }

};


