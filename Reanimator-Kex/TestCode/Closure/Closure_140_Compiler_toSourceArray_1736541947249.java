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

public class Compiler_toSourceArray_1736541947249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222495;

    public Compiler_toSourceArray_1736541947249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222495 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term222495, term222495.getClass(), "options", null);
        setField(term222495, term222495.getClass(), "passes", null);
        setField(term222495, term222495.getClass(), "externs", null);
        setField(term222495, term222495.getClass(), "modules", null);
        setField(term222495, term222495.getClass(), "moduleGraph", null);
        setField(term222495, term222495.getClass(), "inputs", null);
        setField(term222495, term222495.getClass(), "errorManager", null);
        setField(term222495, term222495.getClass(), "symbolTable", null);
        setField(term222495, term222495.getClass(), "externsRoot", null);
        setField(term222495, term222495.getClass(), "jsRoot", null);
        setField(term222495, term222495.getClass(), "externAndJsRoot", null);
        setField(term222495, term222495.getClass(), "inputsByName", null);
        setField(term222495, term222495.getClass(), "sourceMap", null);
        setField(term222495, term222495.getClass(), "externExports", null);
        setIntField(term222495, term222495.getClass(), "uniqueNameId", 0);
        setBooleanField(term222495, term222495.getClass(), "normalized", false);
        setBooleanField(term222495, term222495.getClass(), "useThreads", false);
        setField(term222495, term222495.getClass(), "functionInformationMap", null);
        setField(term222495, term222495.getClass(), "debugLog", null);
        setField(term222495, term222495.getClass(), "defaultCodingConvention", null);
        setField(term222495, term222495.getClass(), "typeRegistry", null);
        setField(term222495, term222495.getClass(), "parserConfig", null);
        setField(term222495, term222495.getClass(), "abstractInterpreter", null);
        setField(term222495, term222495.getClass(), "typeValidator", null);
        setField(term222495, term222495.getClass(), "tracker", null);
        setField(term222495, term222495.getClass(), "oldErrorReporter", null);
        setField(term222495, term222495.getClass(), "defaultErrorReporter", null);
        setField(term222495, term222495.getClass(), "outStream", null);
        setField(term222495, term222495.getClass(), "sanityCheck", null);
        setField(term222495, term222495.getClass(), "currentTracer", null);
        setField(term222495, term222495.getClass(), "currentPassName", null);
        setField(term222495, term222495.getClass(), "recentChange", null);
        setField(term222495, term222495.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSModule");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "toSourceArray", argTypes, term222495, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


