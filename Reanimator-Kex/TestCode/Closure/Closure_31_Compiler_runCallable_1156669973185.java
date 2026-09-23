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
import java.lang.Boolean;

public class Compiler_runCallable_1156669973185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term889883;
     Object term889889;
     Object term889891;

    public Compiler_runCallable_1156669973185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term889883 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term889883, term889883.getClass(), "options", null);
        setField(term889883, term889883.getClass(), "passes", null);
        setField(term889883, term889883.getClass(), "externs", null);
        setField(term889883, term889883.getClass(), "modules", null);
        setField(term889883, term889883.getClass(), "moduleGraph", null);
        setField(term889883, term889883.getClass(), "inputs", null);
        setField(term889883, term889883.getClass(), "errorManager", null);
        setField(term889883, term889883.getClass(), "warningsGuard", null);
        setField(term889883, term889883.getClass(), "injectedLibraries", null);
        setField(term889883, term889883.getClass(), "externsRoot", null);
        setField(term889883, term889883.getClass(), "jsRoot", null);
        setField(term889883, term889883.getClass(), "externAndJsRoot", null);
        setField(term889883, term889883.getClass(), "inputsById", null);
        setField(term889883, term889883.getClass(), "sourceMap", null);
        setField(term889883, term889883.getClass(), "externExports", null);
        setIntField(term889883, term889883.getClass(), "uniqueNameId", 0);
        setBooleanField(term889883, term889883.getClass(), "useThreads", false);
        setBooleanField(term889883, term889883.getClass(), "hasRegExpGlobalReferences", false);
        setField(term889883, term889883.getClass(), "functionInformationMap", null);
        setField(term889883, term889883.getClass(), "debugLog", null);
        setField(term889883, term889883.getClass(), "defaultCodingConvention", null);
        setField(term889883, term889883.getClass(), "typeRegistry", null);
        setField(term889883, term889883.getClass(), "parserConfig", null);
        setField(term889883, term889883.getClass(), "abstractInterpreter", null);
        setField(term889883, term889883.getClass(), "typeValidator", null);
        setField(term889883, term889883.getClass(), "tracker", null);
        setField(term889883, term889883.getClass(), "oldErrorReporter", null);
        setField(term889883, term889883.getClass(), "defaultErrorReporter", null);
        setField(term889883, term889883.getClass(), "outStream", null);
        setField(term889883, term889883.getClass(), "globalRefMap", null);
        setDoubleField(term889883, term889883.getClass(), "progress", 0.0);
        setField(term889883, term889883.getClass(), "sanityCheck", null);
        setField(term889883, term889883.getClass(), "currentTracer", null);
        setField(term889883, term889883.getClass(), "currentPassName", null);
        setIntField(term889883, term889883.getClass(), "syntheticCodeId", 0);
        setField(term889883, term889883.getClass(), "recentChange", null);
        setField(term889883, term889883.getClass(), "codeChangeHandlers", null);
        setField(term889883, term889883.getClass(), "synthesizedExternsInput", null);
        setField(term889883, term889883.getClass(), "stage", null);
        term889889 = new Boolean(false);
        term889891 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.concurrent.Callable");
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term889889;
        args[2] = term889891;
        callMethod(klass, "runCallable", argTypes, term889883, args);
    }

};


