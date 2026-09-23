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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Compiler_toSourceArray_998967701247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216422;

    public Compiler_toSourceArray_998967701247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216422 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term216422, term216422.getClass(), "options", null);
        setField(term216422, term216422.getClass(), "passes", null);
        setField(term216422, term216422.getClass(), "externs", null);
        setField(term216422, term216422.getClass(), "modules", null);
        setField(term216422, term216422.getClass(), "moduleGraph", null);
        setField(term216422, term216422.getClass(), "inputs", null);
        setField(term216422, term216422.getClass(), "errorManager", null);
        setField(term216422, term216422.getClass(), "symbolTable", null);
        setField(term216422, term216422.getClass(), "externsRoot", null);
        setField(term216422, term216422.getClass(), "jsRoot", null);
        setField(term216422, term216422.getClass(), "externAndJsRoot", null);
        setField(term216422, term216422.getClass(), "inputsByName", null);
        setField(term216422, term216422.getClass(), "sourceMap", null);
        setField(term216422, term216422.getClass(), "externExports", null);
        setIntField(term216422, term216422.getClass(), "uniqueNameId", 0);
        setBooleanField(term216422, term216422.getClass(), "normalized", false);
        setBooleanField(term216422, term216422.getClass(), "useThreads", false);
        setField(term216422, term216422.getClass(), "functionInformationMap", null);
        setField(term216422, term216422.getClass(), "debugLog", null);
        setField(term216422, term216422.getClass(), "defaultCodingConvention", null);
        setField(term216422, term216422.getClass(), "typeRegistry", null);
        setField(term216422, term216422.getClass(), "parserConfig", null);
        setField(term216422, term216422.getClass(), "abstractInterpreter", null);
        setField(term216422, term216422.getClass(), "typeValidator", null);
        setField(term216422, term216422.getClass(), "tracker", null);
        setField(term216422, term216422.getClass(), "oldErrorReporter", null);
        setField(term216422, term216422.getClass(), "defaultErrorReporter", null);
        setField(term216422, term216422.getClass(), "outStream", null);
        setField(term216422, term216422.getClass(), "sanityCheck", null);
        setField(term216422, term216422.getClass(), "currentTracer", null);
        setField(term216422, term216422.getClass(), "currentPassName", null);
        setField(term216422, term216422.getClass(), "recentChange", null);
        setField(term216422, term216422.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toSourceArray", argTypes, term216422, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


