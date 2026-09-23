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

public class Compiler_getNodeForCodeInsertion_86081477251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term855030;

    public Compiler_getNodeForCodeInsertion_86081477251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term855030 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term855030, term855030.getClass(), "options", null);
        setField(term855030, term855030.getClass(), "passes", null);
        setField(term855030, term855030.getClass(), "externs", null);
        setField(term855030, term855030.getClass(), "modules", null);
        setField(term855030, term855030.getClass(), "moduleGraph", null);
        setField(term855030, term855030.getClass(), "inputs", null);
        setField(term855030, term855030.getClass(), "errorManager", null);
        setField(term855030, term855030.getClass(), "warningsGuard", null);
        setField(term855030, term855030.getClass(), "externsRoot", null);
        setField(term855030, term855030.getClass(), "jsRoot", null);
        setField(term855030, term855030.getClass(), "externAndJsRoot", null);
        setField(term855030, term855030.getClass(), "inputsByName", null);
        setField(term855030, term855030.getClass(), "sourceMap", null);
        setField(term855030, term855030.getClass(), "externExports", null);
        setIntField(term855030, term855030.getClass(), "uniqueNameId", 0);
        setBooleanField(term855030, term855030.getClass(), "useThreads", false);
        setBooleanField(term855030, term855030.getClass(), "hasRegExpGlobalReferences", false);
        setField(term855030, term855030.getClass(), "functionInformationMap", null);
        setField(term855030, term855030.getClass(), "debugLog", null);
        setField(term855030, term855030.getClass(), "defaultCodingConvention", null);
        setField(term855030, term855030.getClass(), "typeRegistry", null);
        setField(term855030, term855030.getClass(), "parserConfig", null);
        setField(term855030, term855030.getClass(), "abstractInterpreter", null);
        setField(term855030, term855030.getClass(), "typeValidator", null);
        setField(term855030, term855030.getClass(), "tracker", null);
        setField(term855030, term855030.getClass(), "oldErrorReporter", null);
        setField(term855030, term855030.getClass(), "defaultErrorReporter", null);
        setField(term855030, term855030.getClass(), "outStream", null);
        setField(term855030, term855030.getClass(), "globalRefMap", null);
        setField(term855030, term855030.getClass(), "sanityCheck", null);
        setField(term855030, term855030.getClass(), "currentTracer", null);
        setField(term855030, term855030.getClass(), "currentPassName", null);
        setField(term855030, term855030.getClass(), "recentChange", null);
        setField(term855030, term855030.getClass(), "codeChangeHandlers", null);
        setField(term855030, term855030.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSModule");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getNodeForCodeInsertion", argTypes, term855030, args);
    }

};


