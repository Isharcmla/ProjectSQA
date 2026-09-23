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

public class Compiler_getAllInputsFromModules_1028555718170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37204;

    public Compiler_getAllInputsFromModules_1028555718170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37204 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term37204, term37204.getClass(), "options", null);
        setField(term37204, term37204.getClass(), "passes", null);
        setField(term37204, term37204.getClass(), "externs", null);
        setField(term37204, term37204.getClass(), "modules", null);
        setField(term37204, term37204.getClass(), "moduleGraph", null);
        setField(term37204, term37204.getClass(), "inputs", null);
        setField(term37204, term37204.getClass(), "errorManager", null);
        setField(term37204, term37204.getClass(), "symbolTable", null);
        setField(term37204, term37204.getClass(), "externsRoot", null);
        setField(term37204, term37204.getClass(), "jsRoot", null);
        setField(term37204, term37204.getClass(), "externAndJsRoot", null);
        setField(term37204, term37204.getClass(), "inputsByName", null);
        setField(term37204, term37204.getClass(), "sourceMap", null);
        setField(term37204, term37204.getClass(), "externExports", null);
        setIntField(term37204, term37204.getClass(), "uniqueNameId", 0);
        setBooleanField(term37204, term37204.getClass(), "normalized", false);
        setBooleanField(term37204, term37204.getClass(), "useThreads", false);
        setField(term37204, term37204.getClass(), "functionInformationMap", null);
        setField(term37204, term37204.getClass(), "debugLog", null);
        setField(term37204, term37204.getClass(), "defaultCodingConvention", null);
        setField(term37204, term37204.getClass(), "typeRegistry", null);
        setField(term37204, term37204.getClass(), "parserConfig", null);
        setField(term37204, term37204.getClass(), "abstractInterpreter", null);
        setField(term37204, term37204.getClass(), "typeValidator", null);
        setField(term37204, term37204.getClass(), "tracker", null);
        setField(term37204, term37204.getClass(), "oldErrorReporter", null);
        setField(term37204, term37204.getClass(), "defaultErrorReporter", null);
        setField(term37204, term37204.getClass(), "outStream", null);
        setField(term37204, term37204.getClass(), "sanityCheck", null);
        setField(term37204, term37204.getClass(), "currentTracer", null);
        setField(term37204, term37204.getClass(), "currentPassName", null);
        setField(term37204, term37204.getClass(), "recentChange", null);
        setField(term37204, term37204.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllInputsFromModules", argTypes, term37204, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


