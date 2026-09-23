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

public class Compiler_addChangeHandler_1653346594261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259490;

    public Compiler_addChangeHandler_1653346594261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term259490 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term259490, term259490.getClass(), "options", null);
        setField(term259490, term259490.getClass(), "passes", null);
        setField(term259490, term259490.getClass(), "externs", null);
        setField(term259490, term259490.getClass(), "modules", null);
        setField(term259490, term259490.getClass(), "moduleGraph", null);
        setField(term259490, term259490.getClass(), "inputs", null);
        setField(term259490, term259490.getClass(), "errorManager", null);
        setField(term259490, term259490.getClass(), "symbolTable", null);
        setField(term259490, term259490.getClass(), "externsRoot", null);
        setField(term259490, term259490.getClass(), "jsRoot", null);
        setField(term259490, term259490.getClass(), "externAndJsRoot", null);
        setField(term259490, term259490.getClass(), "inputsByName", null);
        setField(term259490, term259490.getClass(), "sourceMap", null);
        setField(term259490, term259490.getClass(), "externExports", null);
        setIntField(term259490, term259490.getClass(), "uniqueNameId", 0);
        setBooleanField(term259490, term259490.getClass(), "normalized", false);
        setBooleanField(term259490, term259490.getClass(), "useThreads", false);
        setField(term259490, term259490.getClass(), "functionInformationMap", null);
        setField(term259490, term259490.getClass(), "debugLog", null);
        setField(term259490, term259490.getClass(), "defaultCodingConvention", null);
        setField(term259490, term259490.getClass(), "typeRegistry", null);
        setField(term259490, term259490.getClass(), "parserConfig", null);
        setField(term259490, term259490.getClass(), "abstractInterpreter", null);
        setField(term259490, term259490.getClass(), "typeValidator", null);
        setField(term259490, term259490.getClass(), "tracker", null);
        setField(term259490, term259490.getClass(), "oldErrorReporter", null);
        setField(term259490, term259490.getClass(), "defaultErrorReporter", null);
        setField(term259490, term259490.getClass(), "outStream", null);
        setField(term259490, term259490.getClass(), "sanityCheck", null);
        setField(term259490, term259490.getClass(), "currentTracer", null);
        setField(term259490, term259490.getClass(), "currentPassName", null);
        setField(term259490, term259490.getClass(), "recentChange", null);
        setField(term259490, term259490.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodeChangeHandler");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "addChangeHandler", argTypes, term259490, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


