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

public class Compiler_externExports_691615754195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93251;

    public Compiler_externExports_691615754195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93251 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term93251, term93251.getClass(), "options", null);
        setField(term93251, term93251.getClass(), "passes", null);
        setField(term93251, term93251.getClass(), "externs", null);
        setField(term93251, term93251.getClass(), "modules", null);
        setField(term93251, term93251.getClass(), "moduleGraph", null);
        setField(term93251, term93251.getClass(), "inputs", null);
        setField(term93251, term93251.getClass(), "errorManager", null);
        setField(term93251, term93251.getClass(), "symbolTable", null);
        setField(term93251, term93251.getClass(), "externsRoot", null);
        setField(term93251, term93251.getClass(), "jsRoot", null);
        setField(term93251, term93251.getClass(), "externAndJsRoot", null);
        setField(term93251, term93251.getClass(), "inputsByName", null);
        setField(term93251, term93251.getClass(), "sourceMap", null);
        setField(term93251, term93251.getClass(), "externExports", null);
        setIntField(term93251, term93251.getClass(), "uniqueNameId", 0);
        setBooleanField(term93251, term93251.getClass(), "normalized", false);
        setBooleanField(term93251, term93251.getClass(), "useThreads", false);
        setField(term93251, term93251.getClass(), "functionInformationMap", null);
        setField(term93251, term93251.getClass(), "debugLog", null);
        setField(term93251, term93251.getClass(), "defaultCodingConvention", null);
        setField(term93251, term93251.getClass(), "typeRegistry", null);
        setField(term93251, term93251.getClass(), "parserConfig", null);
        setField(term93251, term93251.getClass(), "abstractInterpreter", null);
        setField(term93251, term93251.getClass(), "typeValidator", null);
        setField(term93251, term93251.getClass(), "tracker", null);
        setField(term93251, term93251.getClass(), "oldErrorReporter", null);
        setField(term93251, term93251.getClass(), "defaultErrorReporter", null);
        setField(term93251, term93251.getClass(), "outStream", null);
        setField(term93251, term93251.getClass(), "sanityCheck", null);
        setField(term93251, term93251.getClass(), "currentTracer", null);
        setField(term93251, term93251.getClass(), "currentPassName", null);
        setField(term93251, term93251.getClass(), "recentChange", null);
        setField(term93251, term93251.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "externExports", argTypes, term93251, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


