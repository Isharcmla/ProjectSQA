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

public class Compiler_getErrors_951736102209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133906;

    public Compiler_getErrors_951736102209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133906 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term133906, term133906.getClass(), "options", null);
        setField(term133906, term133906.getClass(), "passes", null);
        setField(term133906, term133906.getClass(), "externs", null);
        setField(term133906, term133906.getClass(), "modules", null);
        setField(term133906, term133906.getClass(), "moduleGraph", null);
        setField(term133906, term133906.getClass(), "inputs", null);
        setField(term133906, term133906.getClass(), "errorManager", null);
        setField(term133906, term133906.getClass(), "symbolTable", null);
        setField(term133906, term133906.getClass(), "externsRoot", null);
        setField(term133906, term133906.getClass(), "jsRoot", null);
        setField(term133906, term133906.getClass(), "externAndJsRoot", null);
        setField(term133906, term133906.getClass(), "inputsByName", null);
        setField(term133906, term133906.getClass(), "sourceMap", null);
        setField(term133906, term133906.getClass(), "externExports", null);
        setIntField(term133906, term133906.getClass(), "uniqueNameId", 0);
        setBooleanField(term133906, term133906.getClass(), "normalized", false);
        setBooleanField(term133906, term133906.getClass(), "useThreads", false);
        setField(term133906, term133906.getClass(), "functionInformationMap", null);
        setField(term133906, term133906.getClass(), "debugLog", null);
        setField(term133906, term133906.getClass(), "defaultCodingConvention", null);
        setField(term133906, term133906.getClass(), "typeRegistry", null);
        setField(term133906, term133906.getClass(), "parserConfig", null);
        setField(term133906, term133906.getClass(), "abstractInterpreter", null);
        setField(term133906, term133906.getClass(), "typeValidator", null);
        setField(term133906, term133906.getClass(), "tracker", null);
        setField(term133906, term133906.getClass(), "oldErrorReporter", null);
        setField(term133906, term133906.getClass(), "defaultErrorReporter", null);
        setField(term133906, term133906.getClass(), "outStream", null);
        setField(term133906, term133906.getClass(), "sanityCheck", null);
        setField(term133906, term133906.getClass(), "currentTracer", null);
        setField(term133906, term133906.getClass(), "currentPassName", null);
        setField(term133906, term133906.getClass(), "recentChange", null);
        setField(term133906, term133906.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getErrors", argTypes, term133906, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


