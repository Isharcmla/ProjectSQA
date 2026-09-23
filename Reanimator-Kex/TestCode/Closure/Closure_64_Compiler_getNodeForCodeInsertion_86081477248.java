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

public class Compiler_getNodeForCodeInsertion_86081477248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term978066;

    public Compiler_getNodeForCodeInsertion_86081477248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term978066 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term978066, term978066.getClass(), "options", null);
        setField(term978066, term978066.getClass(), "passes", null);
        setField(term978066, term978066.getClass(), "externs", null);
        setField(term978066, term978066.getClass(), "modules", null);
        setField(term978066, term978066.getClass(), "moduleGraph", null);
        setField(term978066, term978066.getClass(), "inputs", null);
        setField(term978066, term978066.getClass(), "errorManager", null);
        setField(term978066, term978066.getClass(), "warningsGuard", null);
        setField(term978066, term978066.getClass(), "externsRoot", null);
        setField(term978066, term978066.getClass(), "jsRoot", null);
        setField(term978066, term978066.getClass(), "externAndJsRoot", null);
        setField(term978066, term978066.getClass(), "inputsByName", null);
        setField(term978066, term978066.getClass(), "sourceMap", null);
        setField(term978066, term978066.getClass(), "externExports", null);
        setIntField(term978066, term978066.getClass(), "uniqueNameId", 0);
        setBooleanField(term978066, term978066.getClass(), "useThreads", false);
        setBooleanField(term978066, term978066.getClass(), "hasRegExpGlobalReferences", false);
        setField(term978066, term978066.getClass(), "functionInformationMap", null);
        setField(term978066, term978066.getClass(), "debugLog", null);
        setField(term978066, term978066.getClass(), "defaultCodingConvention", null);
        setField(term978066, term978066.getClass(), "typeRegistry", null);
        setField(term978066, term978066.getClass(), "parserConfig", null);
        setField(term978066, term978066.getClass(), "abstractInterpreter", null);
        setField(term978066, term978066.getClass(), "typeValidator", null);
        setField(term978066, term978066.getClass(), "tracker", null);
        setField(term978066, term978066.getClass(), "oldErrorReporter", null);
        setField(term978066, term978066.getClass(), "defaultErrorReporter", null);
        setField(term978066, term978066.getClass(), "outStream", null);
        setField(term978066, term978066.getClass(), "globalRefMap", null);
        setField(term978066, term978066.getClass(), "sanityCheck", null);
        setField(term978066, term978066.getClass(), "currentTracer", null);
        setField(term978066, term978066.getClass(), "currentPassName", null);
        setField(term978066, term978066.getClass(), "recentChange", null);
        setField(term978066, term978066.getClass(), "codeChangeHandlers", null);
        setField(term978066, term978066.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSModule");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getNodeForCodeInsertion", argTypes, term978066, args);
    }

};


