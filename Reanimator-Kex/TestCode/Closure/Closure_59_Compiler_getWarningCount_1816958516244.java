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

public class Compiler_getWarningCount_1816958516244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854998;

    public Compiler_getWarningCount_1816958516244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854998 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854998, term854998.getClass(), "options", null);
        setField(term854998, term854998.getClass(), "passes", null);
        setField(term854998, term854998.getClass(), "externs", null);
        setField(term854998, term854998.getClass(), "modules", null);
        setField(term854998, term854998.getClass(), "moduleGraph", null);
        setField(term854998, term854998.getClass(), "inputs", null);
        setField(term854998, term854998.getClass(), "errorManager", null);
        setField(term854998, term854998.getClass(), "warningsGuard", null);
        setField(term854998, term854998.getClass(), "externsRoot", null);
        setField(term854998, term854998.getClass(), "jsRoot", null);
        setField(term854998, term854998.getClass(), "externAndJsRoot", null);
        setField(term854998, term854998.getClass(), "inputsByName", null);
        setField(term854998, term854998.getClass(), "sourceMap", null);
        setField(term854998, term854998.getClass(), "externExports", null);
        setIntField(term854998, term854998.getClass(), "uniqueNameId", 0);
        setBooleanField(term854998, term854998.getClass(), "useThreads", false);
        setBooleanField(term854998, term854998.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854998, term854998.getClass(), "functionInformationMap", null);
        setField(term854998, term854998.getClass(), "debugLog", null);
        setField(term854998, term854998.getClass(), "defaultCodingConvention", null);
        setField(term854998, term854998.getClass(), "typeRegistry", null);
        setField(term854998, term854998.getClass(), "parserConfig", null);
        setField(term854998, term854998.getClass(), "abstractInterpreter", null);
        setField(term854998, term854998.getClass(), "typeValidator", null);
        setField(term854998, term854998.getClass(), "tracker", null);
        setField(term854998, term854998.getClass(), "oldErrorReporter", null);
        setField(term854998, term854998.getClass(), "defaultErrorReporter", null);
        setField(term854998, term854998.getClass(), "outStream", null);
        setField(term854998, term854998.getClass(), "globalRefMap", null);
        setField(term854998, term854998.getClass(), "sanityCheck", null);
        setField(term854998, term854998.getClass(), "currentTracer", null);
        setField(term854998, term854998.getClass(), "currentPassName", null);
        setField(term854998, term854998.getClass(), "recentChange", null);
        setField(term854998, term854998.getClass(), "codeChangeHandlers", null);
        setField(term854998, term854998.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWarningCount", argTypes, term854998, args);
    }

};


