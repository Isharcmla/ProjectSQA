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

public class Compiler_check_1123875009194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90142;

    public Compiler_check_1123875009194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90142 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term90142, term90142.getClass(), "options", null);
        setField(term90142, term90142.getClass(), "passes", null);
        setField(term90142, term90142.getClass(), "externs", null);
        setField(term90142, term90142.getClass(), "modules", null);
        setField(term90142, term90142.getClass(), "moduleGraph", null);
        setField(term90142, term90142.getClass(), "inputs", null);
        setField(term90142, term90142.getClass(), "errorManager", null);
        setField(term90142, term90142.getClass(), "symbolTable", null);
        setField(term90142, term90142.getClass(), "externsRoot", null);
        setField(term90142, term90142.getClass(), "jsRoot", null);
        setField(term90142, term90142.getClass(), "externAndJsRoot", null);
        setField(term90142, term90142.getClass(), "inputsByName", null);
        setField(term90142, term90142.getClass(), "sourceMap", null);
        setField(term90142, term90142.getClass(), "externExports", null);
        setIntField(term90142, term90142.getClass(), "uniqueNameId", 0);
        setBooleanField(term90142, term90142.getClass(), "normalized", false);
        setBooleanField(term90142, term90142.getClass(), "useThreads", false);
        setField(term90142, term90142.getClass(), "functionInformationMap", null);
        setField(term90142, term90142.getClass(), "debugLog", null);
        setField(term90142, term90142.getClass(), "defaultCodingConvention", null);
        setField(term90142, term90142.getClass(), "typeRegistry", null);
        setField(term90142, term90142.getClass(), "parserConfig", null);
        setField(term90142, term90142.getClass(), "abstractInterpreter", null);
        setField(term90142, term90142.getClass(), "typeValidator", null);
        setField(term90142, term90142.getClass(), "tracker", null);
        setField(term90142, term90142.getClass(), "oldErrorReporter", null);
        setField(term90142, term90142.getClass(), "defaultErrorReporter", null);
        setField(term90142, term90142.getClass(), "outStream", null);
        setField(term90142, term90142.getClass(), "sanityCheck", null);
        setField(term90142, term90142.getClass(), "currentTracer", null);
        setField(term90142, term90142.getClass(), "currentPassName", null);
        setField(term90142, term90142.getClass(), "recentChange", null);
        setField(term90142, term90142.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "check", argTypes, term90142, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


