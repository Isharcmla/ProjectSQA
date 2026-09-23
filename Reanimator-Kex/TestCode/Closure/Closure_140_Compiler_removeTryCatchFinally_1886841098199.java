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

public class Compiler_removeTryCatchFinally_1886841098199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105602;

    public Compiler_removeTryCatchFinally_1886841098199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105602 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term105602, term105602.getClass(), "options", null);
        setField(term105602, term105602.getClass(), "passes", null);
        setField(term105602, term105602.getClass(), "externs", null);
        setField(term105602, term105602.getClass(), "modules", null);
        setField(term105602, term105602.getClass(), "moduleGraph", null);
        setField(term105602, term105602.getClass(), "inputs", null);
        setField(term105602, term105602.getClass(), "errorManager", null);
        setField(term105602, term105602.getClass(), "symbolTable", null);
        setField(term105602, term105602.getClass(), "externsRoot", null);
        setField(term105602, term105602.getClass(), "jsRoot", null);
        setField(term105602, term105602.getClass(), "externAndJsRoot", null);
        setField(term105602, term105602.getClass(), "inputsByName", null);
        setField(term105602, term105602.getClass(), "sourceMap", null);
        setField(term105602, term105602.getClass(), "externExports", null);
        setIntField(term105602, term105602.getClass(), "uniqueNameId", 0);
        setBooleanField(term105602, term105602.getClass(), "normalized", false);
        setBooleanField(term105602, term105602.getClass(), "useThreads", false);
        setField(term105602, term105602.getClass(), "functionInformationMap", null);
        setField(term105602, term105602.getClass(), "debugLog", null);
        setField(term105602, term105602.getClass(), "defaultCodingConvention", null);
        setField(term105602, term105602.getClass(), "typeRegistry", null);
        setField(term105602, term105602.getClass(), "parserConfig", null);
        setField(term105602, term105602.getClass(), "abstractInterpreter", null);
        setField(term105602, term105602.getClass(), "typeValidator", null);
        setField(term105602, term105602.getClass(), "tracker", null);
        setField(term105602, term105602.getClass(), "oldErrorReporter", null);
        setField(term105602, term105602.getClass(), "defaultErrorReporter", null);
        setField(term105602, term105602.getClass(), "outStream", null);
        setField(term105602, term105602.getClass(), "sanityCheck", null);
        setField(term105602, term105602.getClass(), "currentTracer", null);
        setField(term105602, term105602.getClass(), "currentPassName", null);
        setField(term105602, term105602.getClass(), "recentChange", null);
        setField(term105602, term105602.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "removeTryCatchFinally", argTypes, term105602, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


