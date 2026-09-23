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

public class Compiler_parseSyntheticCode_1248327862240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198017;

    public Compiler_parseSyntheticCode_1248327862240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198017 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term198017, term198017.getClass(), "options", null);
        setField(term198017, term198017.getClass(), "passes", null);
        setField(term198017, term198017.getClass(), "externs", null);
        setField(term198017, term198017.getClass(), "modules", null);
        setField(term198017, term198017.getClass(), "moduleGraph", null);
        setField(term198017, term198017.getClass(), "inputs", null);
        setField(term198017, term198017.getClass(), "errorManager", null);
        setField(term198017, term198017.getClass(), "symbolTable", null);
        setField(term198017, term198017.getClass(), "externsRoot", null);
        setField(term198017, term198017.getClass(), "jsRoot", null);
        setField(term198017, term198017.getClass(), "externAndJsRoot", null);
        setField(term198017, term198017.getClass(), "inputsByName", null);
        setField(term198017, term198017.getClass(), "sourceMap", null);
        setField(term198017, term198017.getClass(), "externExports", null);
        setIntField(term198017, term198017.getClass(), "uniqueNameId", 0);
        setBooleanField(term198017, term198017.getClass(), "normalized", false);
        setBooleanField(term198017, term198017.getClass(), "useThreads", false);
        setField(term198017, term198017.getClass(), "functionInformationMap", null);
        setField(term198017, term198017.getClass(), "debugLog", null);
        setField(term198017, term198017.getClass(), "defaultCodingConvention", null);
        setField(term198017, term198017.getClass(), "typeRegistry", null);
        setField(term198017, term198017.getClass(), "parserConfig", null);
        setField(term198017, term198017.getClass(), "abstractInterpreter", null);
        setField(term198017, term198017.getClass(), "typeValidator", null);
        setField(term198017, term198017.getClass(), "tracker", null);
        setField(term198017, term198017.getClass(), "oldErrorReporter", null);
        setField(term198017, term198017.getClass(), "defaultErrorReporter", null);
        setField(term198017, term198017.getClass(), "outStream", null);
        setField(term198017, term198017.getClass(), "sanityCheck", null);
        setField(term198017, term198017.getClass(), "currentTracer", null);
        setField(term198017, term198017.getClass(), "currentPassName", null);
        setField(term198017, term198017.getClass(), "recentChange", null);
        setField(term198017, term198017.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "parseSyntheticCode", argTypes, term198017, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


