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

public class Compiler_getTypeRegistry_910809721194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896238;

    public Compiler_getTypeRegistry_910809721194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896238 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896238, term896238.getClass(), "options", null);
        setField(term896238, term896238.getClass(), "passes", null);
        setField(term896238, term896238.getClass(), "externs", null);
        setField(term896238, term896238.getClass(), "modules", null);
        setField(term896238, term896238.getClass(), "moduleGraph", null);
        setField(term896238, term896238.getClass(), "inputs", null);
        setField(term896238, term896238.getClass(), "errorManager", null);
        setField(term896238, term896238.getClass(), "warningsGuard", null);
        setField(term896238, term896238.getClass(), "externsRoot", null);
        setField(term896238, term896238.getClass(), "jsRoot", null);
        setField(term896238, term896238.getClass(), "externAndJsRoot", null);
        setField(term896238, term896238.getClass(), "inputsByName", null);
        setField(term896238, term896238.getClass(), "sourceMap", null);
        setField(term896238, term896238.getClass(), "externExports", null);
        setIntField(term896238, term896238.getClass(), "uniqueNameId", 0);
        setBooleanField(term896238, term896238.getClass(), "useThreads", false);
        setBooleanField(term896238, term896238.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896238, term896238.getClass(), "functionInformationMap", null);
        setField(term896238, term896238.getClass(), "debugLog", null);
        setField(term896238, term896238.getClass(), "defaultCodingConvention", null);
        setField(term896238, term896238.getClass(), "typeRegistry", null);
        setField(term896238, term896238.getClass(), "parserConfig", null);
        setField(term896238, term896238.getClass(), "abstractInterpreter", null);
        setField(term896238, term896238.getClass(), "typeValidator", null);
        setField(term896238, term896238.getClass(), "tracker", null);
        setField(term896238, term896238.getClass(), "oldErrorReporter", null);
        setField(term896238, term896238.getClass(), "defaultErrorReporter", null);
        setField(term896238, term896238.getClass(), "outStream", null);
        setField(term896238, term896238.getClass(), "globalRefMap", null);
        setField(term896238, term896238.getClass(), "sanityCheck", null);
        setField(term896238, term896238.getClass(), "currentTracer", null);
        setField(term896238, term896238.getClass(), "currentPassName", null);
        setField(term896238, term896238.getClass(), "recentChange", null);
        setField(term896238, term896238.getClass(), "codeChangeHandlers", null);
        setField(term896238, term896238.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTypeRegistry", argTypes, term896238, args);
    }

};


