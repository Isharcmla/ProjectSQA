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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Compiler_throwInternalError_1861206918327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2051933;

    public Compiler_throwInternalError_1861206918327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2051933 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2051933, term2051933.getClass(), "options", null);
        setField(term2051933, term2051933.getClass(), "passes", null);
        setField(term2051933, term2051933.getClass(), "externs", null);
        setField(term2051933, term2051933.getClass(), "modules", null);
        setField(term2051933, term2051933.getClass(), "moduleGraph", null);
        setField(term2051933, term2051933.getClass(), "inputs", null);
        setField(term2051933, term2051933.getClass(), "errorManager", null);
        setField(term2051933, term2051933.getClass(), "symbolTable", null);
        setField(term2051933, term2051933.getClass(), "externsRoot", null);
        setField(term2051933, term2051933.getClass(), "jsRoot", null);
        setField(term2051933, term2051933.getClass(), "externAndJsRoot", null);
        setField(term2051933, term2051933.getClass(), "inputsByName", null);
        setField(term2051933, term2051933.getClass(), "sourceMap", null);
        setField(term2051933, term2051933.getClass(), "externExports", null);
        setIntField(term2051933, term2051933.getClass(), "uniqueNameId", 0);
        setBooleanField(term2051933, term2051933.getClass(), "normalized", false);
        setBooleanField(term2051933, term2051933.getClass(), "useThreads", false);
        setField(term2051933, term2051933.getClass(), "functionInformationMap", null);
        setField(term2051933, term2051933.getClass(), "debugLog", null);
        setField(term2051933, term2051933.getClass(), "defaultCodingConvention", null);
        setField(term2051933, term2051933.getClass(), "typeRegistry", null);
        setField(term2051933, term2051933.getClass(), "parserConfig", null);
        setField(term2051933, term2051933.getClass(), "abstractInterpreter", null);
        setField(term2051933, term2051933.getClass(), "typeValidator", null);
        setField(term2051933, term2051933.getClass(), "tracker", null);
        setField(term2051933, term2051933.getClass(), "oldErrorReporter", null);
        setField(term2051933, term2051933.getClass(), "defaultErrorReporter", null);
        setField(term2051933, term2051933.getClass(), "outStream", null);
        setField(term2051933, term2051933.getClass(), "sanityCheck", null);
        setField(term2051933, term2051933.getClass(), "currentTracer", null);
        setField(term2051933, term2051933.getClass(), "currentPassName", null);
        setField(term2051933, term2051933.getClass(), "recentChange", null);
        setField(term2051933, term2051933.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Exception");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "throwInternalError", argTypes, term2051933, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


