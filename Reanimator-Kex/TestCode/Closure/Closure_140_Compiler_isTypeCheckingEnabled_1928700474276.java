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

public class Compiler_isTypeCheckingEnabled_1928700474276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278019;

    public Compiler_isTypeCheckingEnabled_1928700474276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278019 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term278019, term278019.getClass(), "options", null);
        setField(term278019, term278019.getClass(), "passes", null);
        setField(term278019, term278019.getClass(), "externs", null);
        setField(term278019, term278019.getClass(), "modules", null);
        setField(term278019, term278019.getClass(), "moduleGraph", null);
        setField(term278019, term278019.getClass(), "inputs", null);
        setField(term278019, term278019.getClass(), "errorManager", null);
        setField(term278019, term278019.getClass(), "symbolTable", null);
        setField(term278019, term278019.getClass(), "externsRoot", null);
        setField(term278019, term278019.getClass(), "jsRoot", null);
        setField(term278019, term278019.getClass(), "externAndJsRoot", null);
        setField(term278019, term278019.getClass(), "inputsByName", null);
        setField(term278019, term278019.getClass(), "sourceMap", null);
        setField(term278019, term278019.getClass(), "externExports", null);
        setIntField(term278019, term278019.getClass(), "uniqueNameId", 0);
        setBooleanField(term278019, term278019.getClass(), "normalized", false);
        setBooleanField(term278019, term278019.getClass(), "useThreads", false);
        setField(term278019, term278019.getClass(), "functionInformationMap", null);
        setField(term278019, term278019.getClass(), "debugLog", null);
        setField(term278019, term278019.getClass(), "defaultCodingConvention", null);
        setField(term278019, term278019.getClass(), "typeRegistry", null);
        setField(term278019, term278019.getClass(), "parserConfig", null);
        setField(term278019, term278019.getClass(), "abstractInterpreter", null);
        setField(term278019, term278019.getClass(), "typeValidator", null);
        setField(term278019, term278019.getClass(), "tracker", null);
        setField(term278019, term278019.getClass(), "oldErrorReporter", null);
        setField(term278019, term278019.getClass(), "defaultErrorReporter", null);
        setField(term278019, term278019.getClass(), "outStream", null);
        setField(term278019, term278019.getClass(), "sanityCheck", null);
        setField(term278019, term278019.getClass(), "currentTracer", null);
        setField(term278019, term278019.getClass(), "currentPassName", null);
        setField(term278019, term278019.getClass(), "recentChange", null);
        setField(term278019, term278019.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isTypeCheckingEnabled", argTypes, term278019, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


