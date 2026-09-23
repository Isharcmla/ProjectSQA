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

public class Compiler_reportCodeChange_308902984263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265610;

    public Compiler_reportCodeChange_308902984263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265610 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term265610, term265610.getClass(), "options", null);
        setField(term265610, term265610.getClass(), "passes", null);
        setField(term265610, term265610.getClass(), "externs", null);
        setField(term265610, term265610.getClass(), "modules", null);
        setField(term265610, term265610.getClass(), "moduleGraph", null);
        setField(term265610, term265610.getClass(), "inputs", null);
        setField(term265610, term265610.getClass(), "errorManager", null);
        setField(term265610, term265610.getClass(), "symbolTable", null);
        setField(term265610, term265610.getClass(), "externsRoot", null);
        setField(term265610, term265610.getClass(), "jsRoot", null);
        setField(term265610, term265610.getClass(), "externAndJsRoot", null);
        setField(term265610, term265610.getClass(), "inputsByName", null);
        setField(term265610, term265610.getClass(), "sourceMap", null);
        setField(term265610, term265610.getClass(), "externExports", null);
        setIntField(term265610, term265610.getClass(), "uniqueNameId", 0);
        setBooleanField(term265610, term265610.getClass(), "normalized", false);
        setBooleanField(term265610, term265610.getClass(), "useThreads", false);
        setField(term265610, term265610.getClass(), "functionInformationMap", null);
        setField(term265610, term265610.getClass(), "debugLog", null);
        setField(term265610, term265610.getClass(), "defaultCodingConvention", null);
        setField(term265610, term265610.getClass(), "typeRegistry", null);
        setField(term265610, term265610.getClass(), "parserConfig", null);
        setField(term265610, term265610.getClass(), "abstractInterpreter", null);
        setField(term265610, term265610.getClass(), "typeValidator", null);
        setField(term265610, term265610.getClass(), "tracker", null);
        setField(term265610, term265610.getClass(), "oldErrorReporter", null);
        setField(term265610, term265610.getClass(), "defaultErrorReporter", null);
        setField(term265610, term265610.getClass(), "outStream", null);
        setField(term265610, term265610.getClass(), "sanityCheck", null);
        setField(term265610, term265610.getClass(), "currentTracer", null);
        setField(term265610, term265610.getClass(), "currentPassName", null);
        setField(term265610, term265610.getClass(), "recentChange", null);
        setField(term265610, term265610.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "reportCodeChange", argTypes, term265610, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


