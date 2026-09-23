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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class Normalize_reportCodeChange_73708577525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6705;
     Object term201425;

    public Normalize_reportCodeChange_73708577525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6837 = new ArrayList();
        term6705 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term6785 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setBooleanField(term6705, term6705.getClass(), "assertOnChange", false);
        setField(term6785, term6785.getClass(), "codeChangeHandlers", term6837);
        setField(term6705, term6705.getClass(), "compiler", term6785);
        ArrayList term201427 = new ArrayList();
        term201425 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term201426 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term201426, term201426.getClass(), "options_", null);
        setField(term201426, term201426.getClass(), "passes", null);
        setField(term201426, term201426.getClass(), "externs_", null);
        setField(term201426, term201426.getClass(), "modules_", null);
        setField(term201426, term201426.getClass(), "moduleGraph_", null);
        setField(term201426, term201426.getClass(), "inputs_", null);
        setField(term201426, term201426.getClass(), "errorManager", null);
        setField(term201426, term201426.getClass(), "symbolTable", null);
        setField(term201426, term201426.getClass(), "externsRoot", null);
        setField(term201426, term201426.getClass(), "jsRoot", null);
        setField(term201426, term201426.getClass(), "externAndJsRoot", null);
        setField(term201426, term201426.getClass(), "inputsByName_", null);
        setField(term201426, term201426.getClass(), "sourceMap_", null);
        setField(term201426, term201426.getClass(), "externExports_", null);
        setIntField(term201426, term201426.getClass(), "uniqueNameId", 0);
        setBooleanField(term201426, term201426.getClass(), "normalized", false);
        setBooleanField(term201426, term201426.getClass(), "useThreads", false);
        setField(term201426, term201426.getClass(), "functionInformationMap_", null);
        setField(term201426, term201426.getClass(), "debugLog_", null);
        setField(term201426, term201426.getClass(), "defaultCodingConvention", null);
        setField(term201426, term201426.getClass(), "typeRegistry", null);
        setField(term201426, term201426.getClass(), "parserConfig", null);
        setField(term201426, term201426.getClass(), "abstractInterpreter", null);
        setField(term201426, term201426.getClass(), "typeValidator", null);
        setField(term201426, term201426.getClass(), "tracker", null);
        setField(term201426, term201426.getClass(), "oldErrorReporter", null);
        setField(term201426, term201426.getClass(), "defaultErrorReporter", null);
        setField(term201426, term201426.getClass(), "outStream", null);
        setField(term201426, term201426.getClass(), "sanityCheck", null);
        setField(term201426, term201426.getClass(), "currentTracer", null);
        setField(term201426, term201426.getClass(), "currentPassName", null);
        setField(term201426, term201426.getClass(), "recentChange", null);
        setField(term201426, term201426.getClass(), "codeChangeHandlers", term201427);
        setField(term201425, term201425.getClass(), "compiler", term201426);
        setBooleanField(term201425, term201425.getClass(), "assertOnChange", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "reportCodeChange", argTypes, term6705, args);
        assertTrue(recursiveEquals(term6705, term201425));
    }

};


