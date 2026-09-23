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

public class Compiler_getCodingConvention_1183469012264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268760;

    public Compiler_getCodingConvention_1183469012264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term268760 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term268760, term268760.getClass(), "options", null);
        setField(term268760, term268760.getClass(), "passes", null);
        setField(term268760, term268760.getClass(), "externs", null);
        setField(term268760, term268760.getClass(), "modules", null);
        setField(term268760, term268760.getClass(), "moduleGraph", null);
        setField(term268760, term268760.getClass(), "inputs", null);
        setField(term268760, term268760.getClass(), "errorManager", null);
        setField(term268760, term268760.getClass(), "symbolTable", null);
        setField(term268760, term268760.getClass(), "externsRoot", null);
        setField(term268760, term268760.getClass(), "jsRoot", null);
        setField(term268760, term268760.getClass(), "externAndJsRoot", null);
        setField(term268760, term268760.getClass(), "inputsByName", null);
        setField(term268760, term268760.getClass(), "sourceMap", null);
        setField(term268760, term268760.getClass(), "externExports", null);
        setIntField(term268760, term268760.getClass(), "uniqueNameId", 0);
        setBooleanField(term268760, term268760.getClass(), "normalized", false);
        setBooleanField(term268760, term268760.getClass(), "useThreads", false);
        setField(term268760, term268760.getClass(), "functionInformationMap", null);
        setField(term268760, term268760.getClass(), "debugLog", null);
        setField(term268760, term268760.getClass(), "defaultCodingConvention", null);
        setField(term268760, term268760.getClass(), "typeRegistry", null);
        setField(term268760, term268760.getClass(), "parserConfig", null);
        setField(term268760, term268760.getClass(), "abstractInterpreter", null);
        setField(term268760, term268760.getClass(), "typeValidator", null);
        setField(term268760, term268760.getClass(), "tracker", null);
        setField(term268760, term268760.getClass(), "oldErrorReporter", null);
        setField(term268760, term268760.getClass(), "defaultErrorReporter", null);
        setField(term268760, term268760.getClass(), "outStream", null);
        setField(term268760, term268760.getClass(), "sanityCheck", null);
        setField(term268760, term268760.getClass(), "currentTracer", null);
        setField(term268760, term268760.getClass(), "currentPassName", null);
        setField(term268760, term268760.getClass(), "recentChange", null);
        setField(term268760, term268760.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getCodingConvention", argTypes, term268760, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


