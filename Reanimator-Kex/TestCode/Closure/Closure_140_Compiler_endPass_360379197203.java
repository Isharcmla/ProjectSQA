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

public class Compiler_endPass_360379197203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118464;

    public Compiler_endPass_360379197203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118464 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term118464, term118464.getClass(), "options", null);
        setField(term118464, term118464.getClass(), "passes", null);
        setField(term118464, term118464.getClass(), "externs", null);
        setField(term118464, term118464.getClass(), "modules", null);
        setField(term118464, term118464.getClass(), "moduleGraph", null);
        setField(term118464, term118464.getClass(), "inputs", null);
        setField(term118464, term118464.getClass(), "errorManager", null);
        setField(term118464, term118464.getClass(), "symbolTable", null);
        setField(term118464, term118464.getClass(), "externsRoot", null);
        setField(term118464, term118464.getClass(), "jsRoot", null);
        setField(term118464, term118464.getClass(), "externAndJsRoot", null);
        setField(term118464, term118464.getClass(), "inputsByName", null);
        setField(term118464, term118464.getClass(), "sourceMap", null);
        setField(term118464, term118464.getClass(), "externExports", null);
        setIntField(term118464, term118464.getClass(), "uniqueNameId", 0);
        setBooleanField(term118464, term118464.getClass(), "normalized", false);
        setBooleanField(term118464, term118464.getClass(), "useThreads", false);
        setField(term118464, term118464.getClass(), "functionInformationMap", null);
        setField(term118464, term118464.getClass(), "debugLog", null);
        setField(term118464, term118464.getClass(), "defaultCodingConvention", null);
        setField(term118464, term118464.getClass(), "typeRegistry", null);
        setField(term118464, term118464.getClass(), "parserConfig", null);
        setField(term118464, term118464.getClass(), "abstractInterpreter", null);
        setField(term118464, term118464.getClass(), "typeValidator", null);
        setField(term118464, term118464.getClass(), "tracker", null);
        setField(term118464, term118464.getClass(), "oldErrorReporter", null);
        setField(term118464, term118464.getClass(), "defaultErrorReporter", null);
        setField(term118464, term118464.getClass(), "outStream", null);
        setField(term118464, term118464.getClass(), "sanityCheck", null);
        setField(term118464, term118464.getClass(), "currentTracer", null);
        setField(term118464, term118464.getClass(), "currentPassName", null);
        setField(term118464, term118464.getClass(), "recentChange", null);
        setField(term118464, term118464.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "endPass", argTypes, term118464, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


