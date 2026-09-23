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

public class Compiler_hasHaltingErrors_1328531573281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296713;

    public Compiler_hasHaltingErrors_1328531573281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term296713 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term296713, term296713.getClass(), "options", null);
        setField(term296713, term296713.getClass(), "passes", null);
        setField(term296713, term296713.getClass(), "externs", null);
        setField(term296713, term296713.getClass(), "modules", null);
        setField(term296713, term296713.getClass(), "moduleGraph", null);
        setField(term296713, term296713.getClass(), "inputs", null);
        setField(term296713, term296713.getClass(), "errorManager", null);
        setField(term296713, term296713.getClass(), "symbolTable", null);
        setField(term296713, term296713.getClass(), "externsRoot", null);
        setField(term296713, term296713.getClass(), "jsRoot", null);
        setField(term296713, term296713.getClass(), "externAndJsRoot", null);
        setField(term296713, term296713.getClass(), "inputsByName", null);
        setField(term296713, term296713.getClass(), "sourceMap", null);
        setField(term296713, term296713.getClass(), "externExports", null);
        setIntField(term296713, term296713.getClass(), "uniqueNameId", 0);
        setBooleanField(term296713, term296713.getClass(), "normalized", false);
        setBooleanField(term296713, term296713.getClass(), "useThreads", false);
        setField(term296713, term296713.getClass(), "functionInformationMap", null);
        setField(term296713, term296713.getClass(), "debugLog", null);
        setField(term296713, term296713.getClass(), "defaultCodingConvention", null);
        setField(term296713, term296713.getClass(), "typeRegistry", null);
        setField(term296713, term296713.getClass(), "parserConfig", null);
        setField(term296713, term296713.getClass(), "abstractInterpreter", null);
        setField(term296713, term296713.getClass(), "typeValidator", null);
        setField(term296713, term296713.getClass(), "tracker", null);
        setField(term296713, term296713.getClass(), "oldErrorReporter", null);
        setField(term296713, term296713.getClass(), "defaultErrorReporter", null);
        setField(term296713, term296713.getClass(), "outStream", null);
        setField(term296713, term296713.getClass(), "sanityCheck", null);
        setField(term296713, term296713.getClass(), "currentTracer", null);
        setField(term296713, term296713.getClass(), "currentPassName", null);
        setField(term296713, term296713.getClass(), "recentChange", null);
        setField(term296713, term296713.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hasHaltingErrors", argTypes, term296713, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


