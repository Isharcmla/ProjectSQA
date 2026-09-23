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

public class Compiler_recordFunctionInformation_1008552346225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977970;

    public Compiler_recordFunctionInformation_1008552346225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977970 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term977970, term977970.getClass(), "options", null);
        setField(term977970, term977970.getClass(), "passes", null);
        setField(term977970, term977970.getClass(), "externs", null);
        setField(term977970, term977970.getClass(), "modules", null);
        setField(term977970, term977970.getClass(), "moduleGraph", null);
        setField(term977970, term977970.getClass(), "inputs", null);
        setField(term977970, term977970.getClass(), "errorManager", null);
        setField(term977970, term977970.getClass(), "warningsGuard", null);
        setField(term977970, term977970.getClass(), "externsRoot", null);
        setField(term977970, term977970.getClass(), "jsRoot", null);
        setField(term977970, term977970.getClass(), "externAndJsRoot", null);
        setField(term977970, term977970.getClass(), "inputsByName", null);
        setField(term977970, term977970.getClass(), "sourceMap", null);
        setField(term977970, term977970.getClass(), "externExports", null);
        setIntField(term977970, term977970.getClass(), "uniqueNameId", 0);
        setBooleanField(term977970, term977970.getClass(), "useThreads", false);
        setBooleanField(term977970, term977970.getClass(), "hasRegExpGlobalReferences", false);
        setField(term977970, term977970.getClass(), "functionInformationMap", null);
        setField(term977970, term977970.getClass(), "debugLog", null);
        setField(term977970, term977970.getClass(), "defaultCodingConvention", null);
        setField(term977970, term977970.getClass(), "typeRegistry", null);
        setField(term977970, term977970.getClass(), "parserConfig", null);
        setField(term977970, term977970.getClass(), "abstractInterpreter", null);
        setField(term977970, term977970.getClass(), "typeValidator", null);
        setField(term977970, term977970.getClass(), "tracker", null);
        setField(term977970, term977970.getClass(), "oldErrorReporter", null);
        setField(term977970, term977970.getClass(), "defaultErrorReporter", null);
        setField(term977970, term977970.getClass(), "outStream", null);
        setField(term977970, term977970.getClass(), "globalRefMap", null);
        setField(term977970, term977970.getClass(), "sanityCheck", null);
        setField(term977970, term977970.getClass(), "currentTracer", null);
        setField(term977970, term977970.getClass(), "currentPassName", null);
        setField(term977970, term977970.getClass(), "recentChange", null);
        setField(term977970, term977970.getClass(), "codeChangeHandlers", null);
        setField(term977970, term977970.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "recordFunctionInformation", argTypes, term977970, args);
    }

};


