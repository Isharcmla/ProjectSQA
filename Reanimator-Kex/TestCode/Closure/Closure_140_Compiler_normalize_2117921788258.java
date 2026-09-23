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

public class Compiler_normalize_2117921788258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250266;

    public Compiler_normalize_2117921788258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250266 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term250266, term250266.getClass(), "options", null);
        setField(term250266, term250266.getClass(), "passes", null);
        setField(term250266, term250266.getClass(), "externs", null);
        setField(term250266, term250266.getClass(), "modules", null);
        setField(term250266, term250266.getClass(), "moduleGraph", null);
        setField(term250266, term250266.getClass(), "inputs", null);
        setField(term250266, term250266.getClass(), "errorManager", null);
        setField(term250266, term250266.getClass(), "symbolTable", null);
        setField(term250266, term250266.getClass(), "externsRoot", null);
        setField(term250266, term250266.getClass(), "jsRoot", null);
        setField(term250266, term250266.getClass(), "externAndJsRoot", null);
        setField(term250266, term250266.getClass(), "inputsByName", null);
        setField(term250266, term250266.getClass(), "sourceMap", null);
        setField(term250266, term250266.getClass(), "externExports", null);
        setIntField(term250266, term250266.getClass(), "uniqueNameId", 0);
        setBooleanField(term250266, term250266.getClass(), "normalized", false);
        setBooleanField(term250266, term250266.getClass(), "useThreads", false);
        setField(term250266, term250266.getClass(), "functionInformationMap", null);
        setField(term250266, term250266.getClass(), "debugLog", null);
        setField(term250266, term250266.getClass(), "defaultCodingConvention", null);
        setField(term250266, term250266.getClass(), "typeRegistry", null);
        setField(term250266, term250266.getClass(), "parserConfig", null);
        setField(term250266, term250266.getClass(), "abstractInterpreter", null);
        setField(term250266, term250266.getClass(), "typeValidator", null);
        setField(term250266, term250266.getClass(), "tracker", null);
        setField(term250266, term250266.getClass(), "oldErrorReporter", null);
        setField(term250266, term250266.getClass(), "defaultErrorReporter", null);
        setField(term250266, term250266.getClass(), "outStream", null);
        setField(term250266, term250266.getClass(), "sanityCheck", null);
        setField(term250266, term250266.getClass(), "currentTracer", null);
        setField(term250266, term250266.getClass(), "currentPassName", null);
        setField(term250266, term250266.getClass(), "recentChange", null);
        setField(term250266, term250266.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "normalize", argTypes, term250266, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


