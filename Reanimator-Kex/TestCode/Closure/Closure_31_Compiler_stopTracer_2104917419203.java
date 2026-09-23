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

public class Compiler_stopTracer_2104917419203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term889995;

    public Compiler_stopTracer_2104917419203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term889995 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term889995, term889995.getClass(), "options", null);
        setField(term889995, term889995.getClass(), "passes", null);
        setField(term889995, term889995.getClass(), "externs", null);
        setField(term889995, term889995.getClass(), "modules", null);
        setField(term889995, term889995.getClass(), "moduleGraph", null);
        setField(term889995, term889995.getClass(), "inputs", null);
        setField(term889995, term889995.getClass(), "errorManager", null);
        setField(term889995, term889995.getClass(), "warningsGuard", null);
        setField(term889995, term889995.getClass(), "injectedLibraries", null);
        setField(term889995, term889995.getClass(), "externsRoot", null);
        setField(term889995, term889995.getClass(), "jsRoot", null);
        setField(term889995, term889995.getClass(), "externAndJsRoot", null);
        setField(term889995, term889995.getClass(), "inputsById", null);
        setField(term889995, term889995.getClass(), "sourceMap", null);
        setField(term889995, term889995.getClass(), "externExports", null);
        setIntField(term889995, term889995.getClass(), "uniqueNameId", 0);
        setBooleanField(term889995, term889995.getClass(), "useThreads", false);
        setBooleanField(term889995, term889995.getClass(), "hasRegExpGlobalReferences", false);
        setField(term889995, term889995.getClass(), "functionInformationMap", null);
        setField(term889995, term889995.getClass(), "debugLog", null);
        setField(term889995, term889995.getClass(), "defaultCodingConvention", null);
        setField(term889995, term889995.getClass(), "typeRegistry", null);
        setField(term889995, term889995.getClass(), "parserConfig", null);
        setField(term889995, term889995.getClass(), "abstractInterpreter", null);
        setField(term889995, term889995.getClass(), "typeValidator", null);
        setField(term889995, term889995.getClass(), "tracker", null);
        setField(term889995, term889995.getClass(), "oldErrorReporter", null);
        setField(term889995, term889995.getClass(), "defaultErrorReporter", null);
        setField(term889995, term889995.getClass(), "outStream", null);
        setField(term889995, term889995.getClass(), "globalRefMap", null);
        setDoubleField(term889995, term889995.getClass(), "progress", 0.0);
        setField(term889995, term889995.getClass(), "sanityCheck", null);
        setField(term889995, term889995.getClass(), "currentTracer", null);
        setField(term889995, term889995.getClass(), "currentPassName", null);
        setIntField(term889995, term889995.getClass(), "syntheticCodeId", 0);
        setField(term889995, term889995.getClass(), "recentChange", null);
        setField(term889995, term889995.getClass(), "codeChangeHandlers", null);
        setField(term889995, term889995.getClass(), "synthesizedExternsInput", null);
        setField(term889995, term889995.getClass(), "stage", null);
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
        callMethod(klass, "stopTracer", argTypes, term889995, args);
    }

};


