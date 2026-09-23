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

public class Compiler_addToDebugLog_388864321283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term302797;

    public Compiler_addToDebugLog_388864321283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term302797 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term302797, term302797.getClass(), "options", null);
        setField(term302797, term302797.getClass(), "passes", null);
        setField(term302797, term302797.getClass(), "externs", null);
        setField(term302797, term302797.getClass(), "modules", null);
        setField(term302797, term302797.getClass(), "moduleGraph", null);
        setField(term302797, term302797.getClass(), "inputs", null);
        setField(term302797, term302797.getClass(), "errorManager", null);
        setField(term302797, term302797.getClass(), "symbolTable", null);
        setField(term302797, term302797.getClass(), "externsRoot", null);
        setField(term302797, term302797.getClass(), "jsRoot", null);
        setField(term302797, term302797.getClass(), "externAndJsRoot", null);
        setField(term302797, term302797.getClass(), "inputsByName", null);
        setField(term302797, term302797.getClass(), "sourceMap", null);
        setField(term302797, term302797.getClass(), "externExports", null);
        setIntField(term302797, term302797.getClass(), "uniqueNameId", 0);
        setBooleanField(term302797, term302797.getClass(), "normalized", false);
        setBooleanField(term302797, term302797.getClass(), "useThreads", false);
        setField(term302797, term302797.getClass(), "functionInformationMap", null);
        setField(term302797, term302797.getClass(), "debugLog", null);
        setField(term302797, term302797.getClass(), "defaultCodingConvention", null);
        setField(term302797, term302797.getClass(), "typeRegistry", null);
        setField(term302797, term302797.getClass(), "parserConfig", null);
        setField(term302797, term302797.getClass(), "abstractInterpreter", null);
        setField(term302797, term302797.getClass(), "typeValidator", null);
        setField(term302797, term302797.getClass(), "tracker", null);
        setField(term302797, term302797.getClass(), "oldErrorReporter", null);
        setField(term302797, term302797.getClass(), "defaultErrorReporter", null);
        setField(term302797, term302797.getClass(), "outStream", null);
        setField(term302797, term302797.getClass(), "sanityCheck", null);
        setField(term302797, term302797.getClass(), "currentTracer", null);
        setField(term302797, term302797.getClass(), "currentPassName", null);
        setField(term302797, term302797.getClass(), "recentChange", null);
        setField(term302797, term302797.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "addToDebugLog", argTypes, term302797, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


