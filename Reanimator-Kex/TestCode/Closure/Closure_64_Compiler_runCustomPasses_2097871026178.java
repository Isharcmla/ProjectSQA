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

public class Compiler_runCustomPasses_2097871026178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977780;

    public Compiler_runCustomPasses_2097871026178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977780 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term977780, term977780.getClass(), "options", null);
        setField(term977780, term977780.getClass(), "passes", null);
        setField(term977780, term977780.getClass(), "externs", null);
        setField(term977780, term977780.getClass(), "modules", null);
        setField(term977780, term977780.getClass(), "moduleGraph", null);
        setField(term977780, term977780.getClass(), "inputs", null);
        setField(term977780, term977780.getClass(), "errorManager", null);
        setField(term977780, term977780.getClass(), "warningsGuard", null);
        setField(term977780, term977780.getClass(), "externsRoot", null);
        setField(term977780, term977780.getClass(), "jsRoot", null);
        setField(term977780, term977780.getClass(), "externAndJsRoot", null);
        setField(term977780, term977780.getClass(), "inputsByName", null);
        setField(term977780, term977780.getClass(), "sourceMap", null);
        setField(term977780, term977780.getClass(), "externExports", null);
        setIntField(term977780, term977780.getClass(), "uniqueNameId", 0);
        setBooleanField(term977780, term977780.getClass(), "useThreads", false);
        setBooleanField(term977780, term977780.getClass(), "hasRegExpGlobalReferences", false);
        setField(term977780, term977780.getClass(), "functionInformationMap", null);
        setField(term977780, term977780.getClass(), "debugLog", null);
        setField(term977780, term977780.getClass(), "defaultCodingConvention", null);
        setField(term977780, term977780.getClass(), "typeRegistry", null);
        setField(term977780, term977780.getClass(), "parserConfig", null);
        setField(term977780, term977780.getClass(), "abstractInterpreter", null);
        setField(term977780, term977780.getClass(), "typeValidator", null);
        setField(term977780, term977780.getClass(), "tracker", null);
        setField(term977780, term977780.getClass(), "oldErrorReporter", null);
        setField(term977780, term977780.getClass(), "defaultErrorReporter", null);
        setField(term977780, term977780.getClass(), "outStream", null);
        setField(term977780, term977780.getClass(), "globalRefMap", null);
        setField(term977780, term977780.getClass(), "sanityCheck", null);
        setField(term977780, term977780.getClass(), "currentTracer", null);
        setField(term977780, term977780.getClass(), "currentPassName", null);
        setField(term977780, term977780.getClass(), "recentChange", null);
        setField(term977780, term977780.getClass(), "codeChangeHandlers", null);
        setField(term977780, term977780.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CustomPassExecutionTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "runCustomPasses", argTypes, term977780, args);
    }

};


