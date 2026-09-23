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

public class Compiler_parseInputs_973004842238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191823;

    public Compiler_parseInputs_973004842238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term191823 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term191823, term191823.getClass(), "options", null);
        setField(term191823, term191823.getClass(), "passes", null);
        setField(term191823, term191823.getClass(), "externs", null);
        setField(term191823, term191823.getClass(), "modules", null);
        setField(term191823, term191823.getClass(), "moduleGraph", null);
        setField(term191823, term191823.getClass(), "inputs", null);
        setField(term191823, term191823.getClass(), "errorManager", null);
        setField(term191823, term191823.getClass(), "symbolTable", null);
        setField(term191823, term191823.getClass(), "externsRoot", null);
        setField(term191823, term191823.getClass(), "jsRoot", null);
        setField(term191823, term191823.getClass(), "externAndJsRoot", null);
        setField(term191823, term191823.getClass(), "inputsByName", null);
        setField(term191823, term191823.getClass(), "sourceMap", null);
        setField(term191823, term191823.getClass(), "externExports", null);
        setIntField(term191823, term191823.getClass(), "uniqueNameId", 0);
        setBooleanField(term191823, term191823.getClass(), "normalized", false);
        setBooleanField(term191823, term191823.getClass(), "useThreads", false);
        setField(term191823, term191823.getClass(), "functionInformationMap", null);
        setField(term191823, term191823.getClass(), "debugLog", null);
        setField(term191823, term191823.getClass(), "defaultCodingConvention", null);
        setField(term191823, term191823.getClass(), "typeRegistry", null);
        setField(term191823, term191823.getClass(), "parserConfig", null);
        setField(term191823, term191823.getClass(), "abstractInterpreter", null);
        setField(term191823, term191823.getClass(), "typeValidator", null);
        setField(term191823, term191823.getClass(), "tracker", null);
        setField(term191823, term191823.getClass(), "oldErrorReporter", null);
        setField(term191823, term191823.getClass(), "defaultErrorReporter", null);
        setField(term191823, term191823.getClass(), "outStream", null);
        setField(term191823, term191823.getClass(), "sanityCheck", null);
        setField(term191823, term191823.getClass(), "currentTracer", null);
        setField(term191823, term191823.getClass(), "currentPassName", null);
        setField(term191823, term191823.getClass(), "recentChange", null);
        setField(term191823, term191823.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "parseInputs", argTypes, term191823, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


