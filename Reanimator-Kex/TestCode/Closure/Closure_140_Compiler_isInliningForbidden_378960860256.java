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

public class Compiler_isInliningForbidden_378960860256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244093;

    public Compiler_isInliningForbidden_378960860256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term244093 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term244093, term244093.getClass(), "options", null);
        setField(term244093, term244093.getClass(), "passes", null);
        setField(term244093, term244093.getClass(), "externs", null);
        setField(term244093, term244093.getClass(), "modules", null);
        setField(term244093, term244093.getClass(), "moduleGraph", null);
        setField(term244093, term244093.getClass(), "inputs", null);
        setField(term244093, term244093.getClass(), "errorManager", null);
        setField(term244093, term244093.getClass(), "symbolTable", null);
        setField(term244093, term244093.getClass(), "externsRoot", null);
        setField(term244093, term244093.getClass(), "jsRoot", null);
        setField(term244093, term244093.getClass(), "externAndJsRoot", null);
        setField(term244093, term244093.getClass(), "inputsByName", null);
        setField(term244093, term244093.getClass(), "sourceMap", null);
        setField(term244093, term244093.getClass(), "externExports", null);
        setIntField(term244093, term244093.getClass(), "uniqueNameId", 0);
        setBooleanField(term244093, term244093.getClass(), "normalized", false);
        setBooleanField(term244093, term244093.getClass(), "useThreads", false);
        setField(term244093, term244093.getClass(), "functionInformationMap", null);
        setField(term244093, term244093.getClass(), "debugLog", null);
        setField(term244093, term244093.getClass(), "defaultCodingConvention", null);
        setField(term244093, term244093.getClass(), "typeRegistry", null);
        setField(term244093, term244093.getClass(), "parserConfig", null);
        setField(term244093, term244093.getClass(), "abstractInterpreter", null);
        setField(term244093, term244093.getClass(), "typeValidator", null);
        setField(term244093, term244093.getClass(), "tracker", null);
        setField(term244093, term244093.getClass(), "oldErrorReporter", null);
        setField(term244093, term244093.getClass(), "defaultErrorReporter", null);
        setField(term244093, term244093.getClass(), "outStream", null);
        setField(term244093, term244093.getClass(), "sanityCheck", null);
        setField(term244093, term244093.getClass(), "currentTracer", null);
        setField(term244093, term244093.getClass(), "currentPassName", null);
        setField(term244093, term244093.getClass(), "recentChange", null);
        setField(term244093, term244093.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isInliningForbidden", argTypes, term244093, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


