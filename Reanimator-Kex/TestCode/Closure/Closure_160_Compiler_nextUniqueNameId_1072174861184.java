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

public class Compiler_nextUniqueNameId_1072174861184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896198;

    public Compiler_nextUniqueNameId_1072174861184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896198 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896198, term896198.getClass(), "options", null);
        setField(term896198, term896198.getClass(), "passes", null);
        setField(term896198, term896198.getClass(), "externs", null);
        setField(term896198, term896198.getClass(), "modules", null);
        setField(term896198, term896198.getClass(), "moduleGraph", null);
        setField(term896198, term896198.getClass(), "inputs", null);
        setField(term896198, term896198.getClass(), "errorManager", null);
        setField(term896198, term896198.getClass(), "warningsGuard", null);
        setField(term896198, term896198.getClass(), "externsRoot", null);
        setField(term896198, term896198.getClass(), "jsRoot", null);
        setField(term896198, term896198.getClass(), "externAndJsRoot", null);
        setField(term896198, term896198.getClass(), "inputsByName", null);
        setField(term896198, term896198.getClass(), "sourceMap", null);
        setField(term896198, term896198.getClass(), "externExports", null);
        setIntField(term896198, term896198.getClass(), "uniqueNameId", 0);
        setBooleanField(term896198, term896198.getClass(), "useThreads", false);
        setBooleanField(term896198, term896198.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896198, term896198.getClass(), "functionInformationMap", null);
        setField(term896198, term896198.getClass(), "debugLog", null);
        setField(term896198, term896198.getClass(), "defaultCodingConvention", null);
        setField(term896198, term896198.getClass(), "typeRegistry", null);
        setField(term896198, term896198.getClass(), "parserConfig", null);
        setField(term896198, term896198.getClass(), "abstractInterpreter", null);
        setField(term896198, term896198.getClass(), "typeValidator", null);
        setField(term896198, term896198.getClass(), "tracker", null);
        setField(term896198, term896198.getClass(), "oldErrorReporter", null);
        setField(term896198, term896198.getClass(), "defaultErrorReporter", null);
        setField(term896198, term896198.getClass(), "outStream", null);
        setField(term896198, term896198.getClass(), "globalRefMap", null);
        setField(term896198, term896198.getClass(), "sanityCheck", null);
        setField(term896198, term896198.getClass(), "currentTracer", null);
        setField(term896198, term896198.getClass(), "currentPassName", null);
        setField(term896198, term896198.getClass(), "recentChange", null);
        setField(term896198, term896198.getClass(), "codeChangeHandlers", null);
        setField(term896198, term896198.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextUniqueNameId", argTypes, term896198, args);
    }

};


