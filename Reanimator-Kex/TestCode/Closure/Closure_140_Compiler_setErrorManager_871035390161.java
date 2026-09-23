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

public class Compiler_setErrorManager_871035390161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6754;

    public Compiler_setErrorManager_871035390161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6754 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term6754, term6754.getClass(), "options", null);
        setField(term6754, term6754.getClass(), "passes", null);
        setField(term6754, term6754.getClass(), "externs", null);
        setField(term6754, term6754.getClass(), "modules", null);
        setField(term6754, term6754.getClass(), "moduleGraph", null);
        setField(term6754, term6754.getClass(), "inputs", null);
        setField(term6754, term6754.getClass(), "errorManager", null);
        setField(term6754, term6754.getClass(), "symbolTable", null);
        setField(term6754, term6754.getClass(), "externsRoot", null);
        setField(term6754, term6754.getClass(), "jsRoot", null);
        setField(term6754, term6754.getClass(), "externAndJsRoot", null);
        setField(term6754, term6754.getClass(), "inputsByName", null);
        setField(term6754, term6754.getClass(), "sourceMap", null);
        setField(term6754, term6754.getClass(), "externExports", null);
        setIntField(term6754, term6754.getClass(), "uniqueNameId", 0);
        setBooleanField(term6754, term6754.getClass(), "normalized", false);
        setBooleanField(term6754, term6754.getClass(), "useThreads", false);
        setField(term6754, term6754.getClass(), "functionInformationMap", null);
        setField(term6754, term6754.getClass(), "debugLog", null);
        setField(term6754, term6754.getClass(), "defaultCodingConvention", null);
        setField(term6754, term6754.getClass(), "typeRegistry", null);
        setField(term6754, term6754.getClass(), "parserConfig", null);
        setField(term6754, term6754.getClass(), "abstractInterpreter", null);
        setField(term6754, term6754.getClass(), "typeValidator", null);
        setField(term6754, term6754.getClass(), "tracker", null);
        setField(term6754, term6754.getClass(), "oldErrorReporter", null);
        setField(term6754, term6754.getClass(), "defaultErrorReporter", null);
        setField(term6754, term6754.getClass(), "outStream", null);
        setField(term6754, term6754.getClass(), "sanityCheck", null);
        setField(term6754, term6754.getClass(), "currentTracer", null);
        setField(term6754, term6754.getClass(), "currentPassName", null);
        setField(term6754, term6754.getClass(), "recentChange", null);
        setField(term6754, term6754.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.ErrorManager");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setErrorManager", argTypes, term6754, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


