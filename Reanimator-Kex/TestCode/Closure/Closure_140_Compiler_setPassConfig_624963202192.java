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

public class Compiler_setPassConfig_624963202192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83979;

    public Compiler_setPassConfig_624963202192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83979 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term83979, term83979.getClass(), "options", null);
        setField(term83979, term83979.getClass(), "passes", null);
        setField(term83979, term83979.getClass(), "externs", null);
        setField(term83979, term83979.getClass(), "modules", null);
        setField(term83979, term83979.getClass(), "moduleGraph", null);
        setField(term83979, term83979.getClass(), "inputs", null);
        setField(term83979, term83979.getClass(), "errorManager", null);
        setField(term83979, term83979.getClass(), "symbolTable", null);
        setField(term83979, term83979.getClass(), "externsRoot", null);
        setField(term83979, term83979.getClass(), "jsRoot", null);
        setField(term83979, term83979.getClass(), "externAndJsRoot", null);
        setField(term83979, term83979.getClass(), "inputsByName", null);
        setField(term83979, term83979.getClass(), "sourceMap", null);
        setField(term83979, term83979.getClass(), "externExports", null);
        setIntField(term83979, term83979.getClass(), "uniqueNameId", 0);
        setBooleanField(term83979, term83979.getClass(), "normalized", false);
        setBooleanField(term83979, term83979.getClass(), "useThreads", false);
        setField(term83979, term83979.getClass(), "functionInformationMap", null);
        setField(term83979, term83979.getClass(), "debugLog", null);
        setField(term83979, term83979.getClass(), "defaultCodingConvention", null);
        setField(term83979, term83979.getClass(), "typeRegistry", null);
        setField(term83979, term83979.getClass(), "parserConfig", null);
        setField(term83979, term83979.getClass(), "abstractInterpreter", null);
        setField(term83979, term83979.getClass(), "typeValidator", null);
        setField(term83979, term83979.getClass(), "tracker", null);
        setField(term83979, term83979.getClass(), "oldErrorReporter", null);
        setField(term83979, term83979.getClass(), "defaultErrorReporter", null);
        setField(term83979, term83979.getClass(), "outStream", null);
        setField(term83979, term83979.getClass(), "sanityCheck", null);
        setField(term83979, term83979.getClass(), "currentTracer", null);
        setField(term83979, term83979.getClass(), "currentPassName", null);
        setField(term83979, term83979.getClass(), "recentChange", null);
        setField(term83979, term83979.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.PassConfig");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setPassConfig", argTypes, term83979, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


