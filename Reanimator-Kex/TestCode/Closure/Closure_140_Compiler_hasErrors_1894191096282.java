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

public class Compiler_hasErrors_1894191096282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term299730;

    public Compiler_hasErrors_1894191096282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term299730 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term299730, term299730.getClass(), "options", null);
        setField(term299730, term299730.getClass(), "passes", null);
        setField(term299730, term299730.getClass(), "externs", null);
        setField(term299730, term299730.getClass(), "modules", null);
        setField(term299730, term299730.getClass(), "moduleGraph", null);
        setField(term299730, term299730.getClass(), "inputs", null);
        setField(term299730, term299730.getClass(), "errorManager", null);
        setField(term299730, term299730.getClass(), "symbolTable", null);
        setField(term299730, term299730.getClass(), "externsRoot", null);
        setField(term299730, term299730.getClass(), "jsRoot", null);
        setField(term299730, term299730.getClass(), "externAndJsRoot", null);
        setField(term299730, term299730.getClass(), "inputsByName", null);
        setField(term299730, term299730.getClass(), "sourceMap", null);
        setField(term299730, term299730.getClass(), "externExports", null);
        setIntField(term299730, term299730.getClass(), "uniqueNameId", 0);
        setBooleanField(term299730, term299730.getClass(), "normalized", false);
        setBooleanField(term299730, term299730.getClass(), "useThreads", false);
        setField(term299730, term299730.getClass(), "functionInformationMap", null);
        setField(term299730, term299730.getClass(), "debugLog", null);
        setField(term299730, term299730.getClass(), "defaultCodingConvention", null);
        setField(term299730, term299730.getClass(), "typeRegistry", null);
        setField(term299730, term299730.getClass(), "parserConfig", null);
        setField(term299730, term299730.getClass(), "abstractInterpreter", null);
        setField(term299730, term299730.getClass(), "typeValidator", null);
        setField(term299730, term299730.getClass(), "tracker", null);
        setField(term299730, term299730.getClass(), "oldErrorReporter", null);
        setField(term299730, term299730.getClass(), "defaultErrorReporter", null);
        setField(term299730, term299730.getClass(), "outStream", null);
        setField(term299730, term299730.getClass(), "sanityCheck", null);
        setField(term299730, term299730.getClass(), "currentTracer", null);
        setField(term299730, term299730.getClass(), "currentPassName", null);
        setField(term299730, term299730.getClass(), "recentChange", null);
        setField(term299730, term299730.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hasErrors", argTypes, term299730, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


