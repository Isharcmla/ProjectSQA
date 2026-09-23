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

public class Compiler_getExternsForTesting_1894487515265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term855086;

    public Compiler_getExternsForTesting_1894487515265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term855086 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term855086, term855086.getClass(), "options", null);
        setField(term855086, term855086.getClass(), "passes", null);
        setField(term855086, term855086.getClass(), "externs", null);
        setField(term855086, term855086.getClass(), "modules", null);
        setField(term855086, term855086.getClass(), "moduleGraph", null);
        setField(term855086, term855086.getClass(), "inputs", null);
        setField(term855086, term855086.getClass(), "errorManager", null);
        setField(term855086, term855086.getClass(), "warningsGuard", null);
        setField(term855086, term855086.getClass(), "externsRoot", null);
        setField(term855086, term855086.getClass(), "jsRoot", null);
        setField(term855086, term855086.getClass(), "externAndJsRoot", null);
        setField(term855086, term855086.getClass(), "inputsByName", null);
        setField(term855086, term855086.getClass(), "sourceMap", null);
        setField(term855086, term855086.getClass(), "externExports", null);
        setIntField(term855086, term855086.getClass(), "uniqueNameId", 0);
        setBooleanField(term855086, term855086.getClass(), "useThreads", false);
        setBooleanField(term855086, term855086.getClass(), "hasRegExpGlobalReferences", false);
        setField(term855086, term855086.getClass(), "functionInformationMap", null);
        setField(term855086, term855086.getClass(), "debugLog", null);
        setField(term855086, term855086.getClass(), "defaultCodingConvention", null);
        setField(term855086, term855086.getClass(), "typeRegistry", null);
        setField(term855086, term855086.getClass(), "parserConfig", null);
        setField(term855086, term855086.getClass(), "abstractInterpreter", null);
        setField(term855086, term855086.getClass(), "typeValidator", null);
        setField(term855086, term855086.getClass(), "tracker", null);
        setField(term855086, term855086.getClass(), "oldErrorReporter", null);
        setField(term855086, term855086.getClass(), "defaultErrorReporter", null);
        setField(term855086, term855086.getClass(), "outStream", null);
        setField(term855086, term855086.getClass(), "globalRefMap", null);
        setField(term855086, term855086.getClass(), "sanityCheck", null);
        setField(term855086, term855086.getClass(), "currentTracer", null);
        setField(term855086, term855086.getClass(), "currentPassName", null);
        setField(term855086, term855086.getClass(), "recentChange", null);
        setField(term855086, term855086.getClass(), "codeChangeHandlers", null);
        setField(term855086, term855086.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExternsForTesting", argTypes, term855086, args);
    }

};


