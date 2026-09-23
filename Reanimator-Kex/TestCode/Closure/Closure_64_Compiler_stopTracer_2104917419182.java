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

public class Compiler_stopTracer_2104917419182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977796;

    public Compiler_stopTracer_2104917419182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977796 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term977796, term977796.getClass(), "options", null);
        setField(term977796, term977796.getClass(), "passes", null);
        setField(term977796, term977796.getClass(), "externs", null);
        setField(term977796, term977796.getClass(), "modules", null);
        setField(term977796, term977796.getClass(), "moduleGraph", null);
        setField(term977796, term977796.getClass(), "inputs", null);
        setField(term977796, term977796.getClass(), "errorManager", null);
        setField(term977796, term977796.getClass(), "warningsGuard", null);
        setField(term977796, term977796.getClass(), "externsRoot", null);
        setField(term977796, term977796.getClass(), "jsRoot", null);
        setField(term977796, term977796.getClass(), "externAndJsRoot", null);
        setField(term977796, term977796.getClass(), "inputsByName", null);
        setField(term977796, term977796.getClass(), "sourceMap", null);
        setField(term977796, term977796.getClass(), "externExports", null);
        setIntField(term977796, term977796.getClass(), "uniqueNameId", 0);
        setBooleanField(term977796, term977796.getClass(), "useThreads", false);
        setBooleanField(term977796, term977796.getClass(), "hasRegExpGlobalReferences", false);
        setField(term977796, term977796.getClass(), "functionInformationMap", null);
        setField(term977796, term977796.getClass(), "debugLog", null);
        setField(term977796, term977796.getClass(), "defaultCodingConvention", null);
        setField(term977796, term977796.getClass(), "typeRegistry", null);
        setField(term977796, term977796.getClass(), "parserConfig", null);
        setField(term977796, term977796.getClass(), "abstractInterpreter", null);
        setField(term977796, term977796.getClass(), "typeValidator", null);
        setField(term977796, term977796.getClass(), "tracker", null);
        setField(term977796, term977796.getClass(), "oldErrorReporter", null);
        setField(term977796, term977796.getClass(), "defaultErrorReporter", null);
        setField(term977796, term977796.getClass(), "outStream", null);
        setField(term977796, term977796.getClass(), "globalRefMap", null);
        setField(term977796, term977796.getClass(), "sanityCheck", null);
        setField(term977796, term977796.getClass(), "currentTracer", null);
        setField(term977796, term977796.getClass(), "currentPassName", null);
        setField(term977796, term977796.getClass(), "recentChange", null);
        setField(term977796, term977796.getClass(), "codeChangeHandlers", null);
        setField(term977796, term977796.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Tracer");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "stopTracer", argTypes, term977796, args);
    }

};


