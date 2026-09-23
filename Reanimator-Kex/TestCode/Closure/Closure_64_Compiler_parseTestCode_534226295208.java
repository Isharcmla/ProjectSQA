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

public class Compiler_parseTestCode_534226295208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977900;

    public Compiler_parseTestCode_534226295208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977900 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term977900, term977900.getClass(), "options", null);
        setField(term977900, term977900.getClass(), "passes", null);
        setField(term977900, term977900.getClass(), "externs", null);
        setField(term977900, term977900.getClass(), "modules", null);
        setField(term977900, term977900.getClass(), "moduleGraph", null);
        setField(term977900, term977900.getClass(), "inputs", null);
        setField(term977900, term977900.getClass(), "errorManager", null);
        setField(term977900, term977900.getClass(), "warningsGuard", null);
        setField(term977900, term977900.getClass(), "externsRoot", null);
        setField(term977900, term977900.getClass(), "jsRoot", null);
        setField(term977900, term977900.getClass(), "externAndJsRoot", null);
        setField(term977900, term977900.getClass(), "inputsByName", null);
        setField(term977900, term977900.getClass(), "sourceMap", null);
        setField(term977900, term977900.getClass(), "externExports", null);
        setIntField(term977900, term977900.getClass(), "uniqueNameId", 0);
        setBooleanField(term977900, term977900.getClass(), "useThreads", false);
        setBooleanField(term977900, term977900.getClass(), "hasRegExpGlobalReferences", false);
        setField(term977900, term977900.getClass(), "functionInformationMap", null);
        setField(term977900, term977900.getClass(), "debugLog", null);
        setField(term977900, term977900.getClass(), "defaultCodingConvention", null);
        setField(term977900, term977900.getClass(), "typeRegistry", null);
        setField(term977900, term977900.getClass(), "parserConfig", null);
        setField(term977900, term977900.getClass(), "abstractInterpreter", null);
        setField(term977900, term977900.getClass(), "typeValidator", null);
        setField(term977900, term977900.getClass(), "tracker", null);
        setField(term977900, term977900.getClass(), "oldErrorReporter", null);
        setField(term977900, term977900.getClass(), "defaultErrorReporter", null);
        setField(term977900, term977900.getClass(), "outStream", null);
        setField(term977900, term977900.getClass(), "globalRefMap", null);
        setField(term977900, term977900.getClass(), "sanityCheck", null);
        setField(term977900, term977900.getClass(), "currentTracer", null);
        setField(term977900, term977900.getClass(), "currentPassName", null);
        setField(term977900, term977900.getClass(), "recentChange", null);
        setField(term977900, term977900.getClass(), "codeChangeHandlers", null);
        setField(term977900, term977900.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "parseTestCode", argTypes, term977900, args);
    }

};


