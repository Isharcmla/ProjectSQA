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

public class Compiler_getResult_1760846000207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127790;

    public Compiler_getResult_1760846000207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127790 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term127790, term127790.getClass(), "options", null);
        setField(term127790, term127790.getClass(), "passes", null);
        setField(term127790, term127790.getClass(), "externs", null);
        setField(term127790, term127790.getClass(), "modules", null);
        setField(term127790, term127790.getClass(), "moduleGraph", null);
        setField(term127790, term127790.getClass(), "inputs", null);
        setField(term127790, term127790.getClass(), "errorManager", null);
        setField(term127790, term127790.getClass(), "symbolTable", null);
        setField(term127790, term127790.getClass(), "externsRoot", null);
        setField(term127790, term127790.getClass(), "jsRoot", null);
        setField(term127790, term127790.getClass(), "externAndJsRoot", null);
        setField(term127790, term127790.getClass(), "inputsByName", null);
        setField(term127790, term127790.getClass(), "sourceMap", null);
        setField(term127790, term127790.getClass(), "externExports", null);
        setIntField(term127790, term127790.getClass(), "uniqueNameId", 0);
        setBooleanField(term127790, term127790.getClass(), "normalized", false);
        setBooleanField(term127790, term127790.getClass(), "useThreads", false);
        setField(term127790, term127790.getClass(), "functionInformationMap", null);
        setField(term127790, term127790.getClass(), "debugLog", null);
        setField(term127790, term127790.getClass(), "defaultCodingConvention", null);
        setField(term127790, term127790.getClass(), "typeRegistry", null);
        setField(term127790, term127790.getClass(), "parserConfig", null);
        setField(term127790, term127790.getClass(), "abstractInterpreter", null);
        setField(term127790, term127790.getClass(), "typeValidator", null);
        setField(term127790, term127790.getClass(), "tracker", null);
        setField(term127790, term127790.getClass(), "oldErrorReporter", null);
        setField(term127790, term127790.getClass(), "defaultErrorReporter", null);
        setField(term127790, term127790.getClass(), "outStream", null);
        setField(term127790, term127790.getClass(), "sanityCheck", null);
        setField(term127790, term127790.getClass(), "currentTracer", null);
        setField(term127790, term127790.getClass(), "currentPassName", null);
        setField(term127790, term127790.getClass(), "recentChange", null);
        setField(term127790, term127790.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getResult", argTypes, term127790, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


