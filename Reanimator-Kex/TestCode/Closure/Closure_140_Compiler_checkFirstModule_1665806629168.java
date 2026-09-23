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

public class Compiler_checkFirstModule_1665806629168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31148;

    public Compiler_checkFirstModule_1665806629168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31148 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term31148, term31148.getClass(), "options", null);
        setField(term31148, term31148.getClass(), "passes", null);
        setField(term31148, term31148.getClass(), "externs", null);
        setField(term31148, term31148.getClass(), "modules", null);
        setField(term31148, term31148.getClass(), "moduleGraph", null);
        setField(term31148, term31148.getClass(), "inputs", null);
        setField(term31148, term31148.getClass(), "errorManager", null);
        setField(term31148, term31148.getClass(), "symbolTable", null);
        setField(term31148, term31148.getClass(), "externsRoot", null);
        setField(term31148, term31148.getClass(), "jsRoot", null);
        setField(term31148, term31148.getClass(), "externAndJsRoot", null);
        setField(term31148, term31148.getClass(), "inputsByName", null);
        setField(term31148, term31148.getClass(), "sourceMap", null);
        setField(term31148, term31148.getClass(), "externExports", null);
        setIntField(term31148, term31148.getClass(), "uniqueNameId", 0);
        setBooleanField(term31148, term31148.getClass(), "normalized", false);
        setBooleanField(term31148, term31148.getClass(), "useThreads", false);
        setField(term31148, term31148.getClass(), "functionInformationMap", null);
        setField(term31148, term31148.getClass(), "debugLog", null);
        setField(term31148, term31148.getClass(), "defaultCodingConvention", null);
        setField(term31148, term31148.getClass(), "typeRegistry", null);
        setField(term31148, term31148.getClass(), "parserConfig", null);
        setField(term31148, term31148.getClass(), "abstractInterpreter", null);
        setField(term31148, term31148.getClass(), "typeValidator", null);
        setField(term31148, term31148.getClass(), "tracker", null);
        setField(term31148, term31148.getClass(), "oldErrorReporter", null);
        setField(term31148, term31148.getClass(), "defaultErrorReporter", null);
        setField(term31148, term31148.getClass(), "outStream", null);
        setField(term31148, term31148.getClass(), "sanityCheck", null);
        setField(term31148, term31148.getClass(), "currentTracer", null);
        setField(term31148, term31148.getClass(), "currentPassName", null);
        setField(term31148, term31148.getClass(), "recentChange", null);
        setField(term31148, term31148.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("com.google.javascript.jscomp.JSModule"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "checkFirstModule", argTypes, term31148, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


