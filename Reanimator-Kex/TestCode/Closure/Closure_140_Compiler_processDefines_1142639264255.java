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

public class Compiler_processDefines_1142639264255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240946;

    public Compiler_processDefines_1142639264255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240946 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term240946, term240946.getClass(), "options", null);
        setField(term240946, term240946.getClass(), "passes", null);
        setField(term240946, term240946.getClass(), "externs", null);
        setField(term240946, term240946.getClass(), "modules", null);
        setField(term240946, term240946.getClass(), "moduleGraph", null);
        setField(term240946, term240946.getClass(), "inputs", null);
        setField(term240946, term240946.getClass(), "errorManager", null);
        setField(term240946, term240946.getClass(), "symbolTable", null);
        setField(term240946, term240946.getClass(), "externsRoot", null);
        setField(term240946, term240946.getClass(), "jsRoot", null);
        setField(term240946, term240946.getClass(), "externAndJsRoot", null);
        setField(term240946, term240946.getClass(), "inputsByName", null);
        setField(term240946, term240946.getClass(), "sourceMap", null);
        setField(term240946, term240946.getClass(), "externExports", null);
        setIntField(term240946, term240946.getClass(), "uniqueNameId", 0);
        setBooleanField(term240946, term240946.getClass(), "normalized", false);
        setBooleanField(term240946, term240946.getClass(), "useThreads", false);
        setField(term240946, term240946.getClass(), "functionInformationMap", null);
        setField(term240946, term240946.getClass(), "debugLog", null);
        setField(term240946, term240946.getClass(), "defaultCodingConvention", null);
        setField(term240946, term240946.getClass(), "typeRegistry", null);
        setField(term240946, term240946.getClass(), "parserConfig", null);
        setField(term240946, term240946.getClass(), "abstractInterpreter", null);
        setField(term240946, term240946.getClass(), "typeValidator", null);
        setField(term240946, term240946.getClass(), "tracker", null);
        setField(term240946, term240946.getClass(), "oldErrorReporter", null);
        setField(term240946, term240946.getClass(), "defaultErrorReporter", null);
        setField(term240946, term240946.getClass(), "outStream", null);
        setField(term240946, term240946.getClass(), "sanityCheck", null);
        setField(term240946, term240946.getClass(), "currentTracer", null);
        setField(term240946, term240946.getClass(), "currentPassName", null);
        setField(term240946, term240946.getClass(), "recentChange", null);
        setField(term240946, term240946.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "processDefines", argTypes, term240946, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


