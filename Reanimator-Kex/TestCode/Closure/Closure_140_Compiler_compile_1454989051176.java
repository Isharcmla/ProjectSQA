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

public class Compiler_compile_1454989051176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59399;

    public Compiler_compile_1454989051176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59399 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term59399, term59399.getClass(), "options", null);
        setField(term59399, term59399.getClass(), "passes", null);
        setField(term59399, term59399.getClass(), "externs", null);
        setField(term59399, term59399.getClass(), "modules", null);
        setField(term59399, term59399.getClass(), "moduleGraph", null);
        setField(term59399, term59399.getClass(), "inputs", null);
        setField(term59399, term59399.getClass(), "errorManager", null);
        setField(term59399, term59399.getClass(), "symbolTable", null);
        setField(term59399, term59399.getClass(), "externsRoot", null);
        setField(term59399, term59399.getClass(), "jsRoot", null);
        setField(term59399, term59399.getClass(), "externAndJsRoot", null);
        setField(term59399, term59399.getClass(), "inputsByName", null);
        setField(term59399, term59399.getClass(), "sourceMap", null);
        setField(term59399, term59399.getClass(), "externExports", null);
        setIntField(term59399, term59399.getClass(), "uniqueNameId", 0);
        setBooleanField(term59399, term59399.getClass(), "normalized", false);
        setBooleanField(term59399, term59399.getClass(), "useThreads", false);
        setField(term59399, term59399.getClass(), "functionInformationMap", null);
        setField(term59399, term59399.getClass(), "debugLog", null);
        setField(term59399, term59399.getClass(), "defaultCodingConvention", null);
        setField(term59399, term59399.getClass(), "typeRegistry", null);
        setField(term59399, term59399.getClass(), "parserConfig", null);
        setField(term59399, term59399.getClass(), "abstractInterpreter", null);
        setField(term59399, term59399.getClass(), "typeValidator", null);
        setField(term59399, term59399.getClass(), "tracker", null);
        setField(term59399, term59399.getClass(), "oldErrorReporter", null);
        setField(term59399, term59399.getClass(), "defaultErrorReporter", null);
        setField(term59399, term59399.getClass(), "outStream", null);
        setField(term59399, term59399.getClass(), "sanityCheck", null);
        setField(term59399, term59399.getClass(), "currentTracer", null);
        setField(term59399, term59399.getClass(), "currentPassName", null);
        setField(term59399, term59399.getClass(), "recentChange", null);
        setField(term59399, term59399.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.jscomp.JSModule"), 0).getClass();
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "compile", argTypes, term59399, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


