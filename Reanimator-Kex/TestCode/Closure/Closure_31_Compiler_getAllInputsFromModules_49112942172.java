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

public class Compiler_getAllInputsFromModules_49112942172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term889805;

    public Compiler_getAllInputsFromModules_49112942172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term889805 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term889805, term889805.getClass(), "options", null);
        setField(term889805, term889805.getClass(), "passes", null);
        setField(term889805, term889805.getClass(), "externs", null);
        setField(term889805, term889805.getClass(), "modules", null);
        setField(term889805, term889805.getClass(), "moduleGraph", null);
        setField(term889805, term889805.getClass(), "inputs", null);
        setField(term889805, term889805.getClass(), "errorManager", null);
        setField(term889805, term889805.getClass(), "warningsGuard", null);
        setField(term889805, term889805.getClass(), "injectedLibraries", null);
        setField(term889805, term889805.getClass(), "externsRoot", null);
        setField(term889805, term889805.getClass(), "jsRoot", null);
        setField(term889805, term889805.getClass(), "externAndJsRoot", null);
        setField(term889805, term889805.getClass(), "inputsById", null);
        setField(term889805, term889805.getClass(), "sourceMap", null);
        setField(term889805, term889805.getClass(), "externExports", null);
        setIntField(term889805, term889805.getClass(), "uniqueNameId", 0);
        setBooleanField(term889805, term889805.getClass(), "useThreads", false);
        setBooleanField(term889805, term889805.getClass(), "hasRegExpGlobalReferences", false);
        setField(term889805, term889805.getClass(), "functionInformationMap", null);
        setField(term889805, term889805.getClass(), "debugLog", null);
        setField(term889805, term889805.getClass(), "defaultCodingConvention", null);
        setField(term889805, term889805.getClass(), "typeRegistry", null);
        setField(term889805, term889805.getClass(), "parserConfig", null);
        setField(term889805, term889805.getClass(), "abstractInterpreter", null);
        setField(term889805, term889805.getClass(), "typeValidator", null);
        setField(term889805, term889805.getClass(), "tracker", null);
        setField(term889805, term889805.getClass(), "oldErrorReporter", null);
        setField(term889805, term889805.getClass(), "defaultErrorReporter", null);
        setField(term889805, term889805.getClass(), "outStream", null);
        setField(term889805, term889805.getClass(), "globalRefMap", null);
        setDoubleField(term889805, term889805.getClass(), "progress", 0.0);
        setField(term889805, term889805.getClass(), "sanityCheck", null);
        setField(term889805, term889805.getClass(), "currentTracer", null);
        setField(term889805, term889805.getClass(), "currentPassName", null);
        setIntField(term889805, term889805.getClass(), "syntheticCodeId", 0);
        setField(term889805, term889805.getClass(), "recentChange", null);
        setField(term889805, term889805.getClass(), "codeChangeHandlers", null);
        setField(term889805, term889805.getClass(), "synthesizedExternsInput", null);
        setField(term889805, term889805.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getAllInputsFromModules", argTypes, term889805, args);
    }

};


