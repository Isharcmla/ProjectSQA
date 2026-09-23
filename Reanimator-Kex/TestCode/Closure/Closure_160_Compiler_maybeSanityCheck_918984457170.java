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

public class Compiler_maybeSanityCheck_918984457170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896142;

    public Compiler_maybeSanityCheck_918984457170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896142 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896142, term896142.getClass(), "options", null);
        setField(term896142, term896142.getClass(), "passes", null);
        setField(term896142, term896142.getClass(), "externs", null);
        setField(term896142, term896142.getClass(), "modules", null);
        setField(term896142, term896142.getClass(), "moduleGraph", null);
        setField(term896142, term896142.getClass(), "inputs", null);
        setField(term896142, term896142.getClass(), "errorManager", null);
        setField(term896142, term896142.getClass(), "warningsGuard", null);
        setField(term896142, term896142.getClass(), "externsRoot", null);
        setField(term896142, term896142.getClass(), "jsRoot", null);
        setField(term896142, term896142.getClass(), "externAndJsRoot", null);
        setField(term896142, term896142.getClass(), "inputsByName", null);
        setField(term896142, term896142.getClass(), "sourceMap", null);
        setField(term896142, term896142.getClass(), "externExports", null);
        setIntField(term896142, term896142.getClass(), "uniqueNameId", 0);
        setBooleanField(term896142, term896142.getClass(), "useThreads", false);
        setBooleanField(term896142, term896142.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896142, term896142.getClass(), "functionInformationMap", null);
        setField(term896142, term896142.getClass(), "debugLog", null);
        setField(term896142, term896142.getClass(), "defaultCodingConvention", null);
        setField(term896142, term896142.getClass(), "typeRegistry", null);
        setField(term896142, term896142.getClass(), "parserConfig", null);
        setField(term896142, term896142.getClass(), "abstractInterpreter", null);
        setField(term896142, term896142.getClass(), "typeValidator", null);
        setField(term896142, term896142.getClass(), "tracker", null);
        setField(term896142, term896142.getClass(), "oldErrorReporter", null);
        setField(term896142, term896142.getClass(), "defaultErrorReporter", null);
        setField(term896142, term896142.getClass(), "outStream", null);
        setField(term896142, term896142.getClass(), "globalRefMap", null);
        setField(term896142, term896142.getClass(), "sanityCheck", null);
        setField(term896142, term896142.getClass(), "currentTracer", null);
        setField(term896142, term896142.getClass(), "currentPassName", null);
        setField(term896142, term896142.getClass(), "recentChange", null);
        setField(term896142, term896142.getClass(), "codeChangeHandlers", null);
        setField(term896142, term896142.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "maybeSanityCheck", argTypes, term896142, args);
    }

};


