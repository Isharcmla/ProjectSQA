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

public class Compiler_removeInput_1131897242189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896218;

    public Compiler_removeInput_1131897242189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896218 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896218, term896218.getClass(), "options", null);
        setField(term896218, term896218.getClass(), "passes", null);
        setField(term896218, term896218.getClass(), "externs", null);
        setField(term896218, term896218.getClass(), "modules", null);
        setField(term896218, term896218.getClass(), "moduleGraph", null);
        setField(term896218, term896218.getClass(), "inputs", null);
        setField(term896218, term896218.getClass(), "errorManager", null);
        setField(term896218, term896218.getClass(), "warningsGuard", null);
        setField(term896218, term896218.getClass(), "externsRoot", null);
        setField(term896218, term896218.getClass(), "jsRoot", null);
        setField(term896218, term896218.getClass(), "externAndJsRoot", null);
        setField(term896218, term896218.getClass(), "inputsByName", null);
        setField(term896218, term896218.getClass(), "sourceMap", null);
        setField(term896218, term896218.getClass(), "externExports", null);
        setIntField(term896218, term896218.getClass(), "uniqueNameId", 0);
        setBooleanField(term896218, term896218.getClass(), "useThreads", false);
        setBooleanField(term896218, term896218.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896218, term896218.getClass(), "functionInformationMap", null);
        setField(term896218, term896218.getClass(), "debugLog", null);
        setField(term896218, term896218.getClass(), "defaultCodingConvention", null);
        setField(term896218, term896218.getClass(), "typeRegistry", null);
        setField(term896218, term896218.getClass(), "parserConfig", null);
        setField(term896218, term896218.getClass(), "abstractInterpreter", null);
        setField(term896218, term896218.getClass(), "typeValidator", null);
        setField(term896218, term896218.getClass(), "tracker", null);
        setField(term896218, term896218.getClass(), "oldErrorReporter", null);
        setField(term896218, term896218.getClass(), "defaultErrorReporter", null);
        setField(term896218, term896218.getClass(), "outStream", null);
        setField(term896218, term896218.getClass(), "globalRefMap", null);
        setField(term896218, term896218.getClass(), "sanityCheck", null);
        setField(term896218, term896218.getClass(), "currentTracer", null);
        setField(term896218, term896218.getClass(), "currentPassName", null);
        setField(term896218, term896218.getClass(), "recentChange", null);
        setField(term896218, term896218.getClass(), "codeChangeHandlers", null);
        setField(term896218, term896218.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "removeInput", argTypes, term896218, args);
    }

};


