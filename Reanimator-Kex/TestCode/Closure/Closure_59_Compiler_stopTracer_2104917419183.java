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

public class Compiler_stopTracer_2104917419183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854707;

    public Compiler_stopTracer_2104917419183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854707 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854707, term854707.getClass(), "options", null);
        setField(term854707, term854707.getClass(), "passes", null);
        setField(term854707, term854707.getClass(), "externs", null);
        setField(term854707, term854707.getClass(), "modules", null);
        setField(term854707, term854707.getClass(), "moduleGraph", null);
        setField(term854707, term854707.getClass(), "inputs", null);
        setField(term854707, term854707.getClass(), "errorManager", null);
        setField(term854707, term854707.getClass(), "warningsGuard", null);
        setField(term854707, term854707.getClass(), "externsRoot", null);
        setField(term854707, term854707.getClass(), "jsRoot", null);
        setField(term854707, term854707.getClass(), "externAndJsRoot", null);
        setField(term854707, term854707.getClass(), "inputsByName", null);
        setField(term854707, term854707.getClass(), "sourceMap", null);
        setField(term854707, term854707.getClass(), "externExports", null);
        setIntField(term854707, term854707.getClass(), "uniqueNameId", 0);
        setBooleanField(term854707, term854707.getClass(), "useThreads", false);
        setBooleanField(term854707, term854707.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854707, term854707.getClass(), "functionInformationMap", null);
        setField(term854707, term854707.getClass(), "debugLog", null);
        setField(term854707, term854707.getClass(), "defaultCodingConvention", null);
        setField(term854707, term854707.getClass(), "typeRegistry", null);
        setField(term854707, term854707.getClass(), "parserConfig", null);
        setField(term854707, term854707.getClass(), "abstractInterpreter", null);
        setField(term854707, term854707.getClass(), "typeValidator", null);
        setField(term854707, term854707.getClass(), "tracker", null);
        setField(term854707, term854707.getClass(), "oldErrorReporter", null);
        setField(term854707, term854707.getClass(), "defaultErrorReporter", null);
        setField(term854707, term854707.getClass(), "outStream", null);
        setField(term854707, term854707.getClass(), "globalRefMap", null);
        setField(term854707, term854707.getClass(), "sanityCheck", null);
        setField(term854707, term854707.getClass(), "currentTracer", null);
        setField(term854707, term854707.getClass(), "currentPassName", null);
        setField(term854707, term854707.getClass(), "recentChange", null);
        setField(term854707, term854707.getClass(), "codeChangeHandlers", null);
        setField(term854707, term854707.getClass(), "stage", null);
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
        callMethod(klass, "stopTracer", argTypes, term854707, args);
    }

};


