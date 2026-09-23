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

public class Compiler_getExternsInOrder_366397331261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term855070;

    public Compiler_getExternsInOrder_366397331261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term855070 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term855070, term855070.getClass(), "options", null);
        setField(term855070, term855070.getClass(), "passes", null);
        setField(term855070, term855070.getClass(), "externs", null);
        setField(term855070, term855070.getClass(), "modules", null);
        setField(term855070, term855070.getClass(), "moduleGraph", null);
        setField(term855070, term855070.getClass(), "inputs", null);
        setField(term855070, term855070.getClass(), "errorManager", null);
        setField(term855070, term855070.getClass(), "warningsGuard", null);
        setField(term855070, term855070.getClass(), "externsRoot", null);
        setField(term855070, term855070.getClass(), "jsRoot", null);
        setField(term855070, term855070.getClass(), "externAndJsRoot", null);
        setField(term855070, term855070.getClass(), "inputsByName", null);
        setField(term855070, term855070.getClass(), "sourceMap", null);
        setField(term855070, term855070.getClass(), "externExports", null);
        setIntField(term855070, term855070.getClass(), "uniqueNameId", 0);
        setBooleanField(term855070, term855070.getClass(), "useThreads", false);
        setBooleanField(term855070, term855070.getClass(), "hasRegExpGlobalReferences", false);
        setField(term855070, term855070.getClass(), "functionInformationMap", null);
        setField(term855070, term855070.getClass(), "debugLog", null);
        setField(term855070, term855070.getClass(), "defaultCodingConvention", null);
        setField(term855070, term855070.getClass(), "typeRegistry", null);
        setField(term855070, term855070.getClass(), "parserConfig", null);
        setField(term855070, term855070.getClass(), "abstractInterpreter", null);
        setField(term855070, term855070.getClass(), "typeValidator", null);
        setField(term855070, term855070.getClass(), "tracker", null);
        setField(term855070, term855070.getClass(), "oldErrorReporter", null);
        setField(term855070, term855070.getClass(), "defaultErrorReporter", null);
        setField(term855070, term855070.getClass(), "outStream", null);
        setField(term855070, term855070.getClass(), "globalRefMap", null);
        setField(term855070, term855070.getClass(), "sanityCheck", null);
        setField(term855070, term855070.getClass(), "currentTracer", null);
        setField(term855070, term855070.getClass(), "currentPassName", null);
        setField(term855070, term855070.getClass(), "recentChange", null);
        setField(term855070, term855070.getClass(), "codeChangeHandlers", null);
        setField(term855070, term855070.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExternsInOrder", argTypes, term855070, args);
    }

};


