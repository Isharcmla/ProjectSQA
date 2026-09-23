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

public class Compiler_getSourceMap_479670542249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term978070;

    public Compiler_getSourceMap_479670542249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term978070 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term978070, term978070.getClass(), "options", null);
        setField(term978070, term978070.getClass(), "passes", null);
        setField(term978070, term978070.getClass(), "externs", null);
        setField(term978070, term978070.getClass(), "modules", null);
        setField(term978070, term978070.getClass(), "moduleGraph", null);
        setField(term978070, term978070.getClass(), "inputs", null);
        setField(term978070, term978070.getClass(), "errorManager", null);
        setField(term978070, term978070.getClass(), "warningsGuard", null);
        setField(term978070, term978070.getClass(), "externsRoot", null);
        setField(term978070, term978070.getClass(), "jsRoot", null);
        setField(term978070, term978070.getClass(), "externAndJsRoot", null);
        setField(term978070, term978070.getClass(), "inputsByName", null);
        setField(term978070, term978070.getClass(), "sourceMap", null);
        setField(term978070, term978070.getClass(), "externExports", null);
        setIntField(term978070, term978070.getClass(), "uniqueNameId", 0);
        setBooleanField(term978070, term978070.getClass(), "useThreads", false);
        setBooleanField(term978070, term978070.getClass(), "hasRegExpGlobalReferences", false);
        setField(term978070, term978070.getClass(), "functionInformationMap", null);
        setField(term978070, term978070.getClass(), "debugLog", null);
        setField(term978070, term978070.getClass(), "defaultCodingConvention", null);
        setField(term978070, term978070.getClass(), "typeRegistry", null);
        setField(term978070, term978070.getClass(), "parserConfig", null);
        setField(term978070, term978070.getClass(), "abstractInterpreter", null);
        setField(term978070, term978070.getClass(), "typeValidator", null);
        setField(term978070, term978070.getClass(), "tracker", null);
        setField(term978070, term978070.getClass(), "oldErrorReporter", null);
        setField(term978070, term978070.getClass(), "defaultErrorReporter", null);
        setField(term978070, term978070.getClass(), "outStream", null);
        setField(term978070, term978070.getClass(), "globalRefMap", null);
        setField(term978070, term978070.getClass(), "sanityCheck", null);
        setField(term978070, term978070.getClass(), "currentTracer", null);
        setField(term978070, term978070.getClass(), "currentPassName", null);
        setField(term978070, term978070.getClass(), "recentChange", null);
        setField(term978070, term978070.getClass(), "codeChangeHandlers", null);
        setField(term978070, term978070.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSourceMap", argTypes, term978070, args);
    }

};


