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

public class Compiler_resetUniqueNameId_1739281955185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896202;

    public Compiler_resetUniqueNameId_1739281955185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896202 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896202, term896202.getClass(), "options", null);
        setField(term896202, term896202.getClass(), "passes", null);
        setField(term896202, term896202.getClass(), "externs", null);
        setField(term896202, term896202.getClass(), "modules", null);
        setField(term896202, term896202.getClass(), "moduleGraph", null);
        setField(term896202, term896202.getClass(), "inputs", null);
        setField(term896202, term896202.getClass(), "errorManager", null);
        setField(term896202, term896202.getClass(), "warningsGuard", null);
        setField(term896202, term896202.getClass(), "externsRoot", null);
        setField(term896202, term896202.getClass(), "jsRoot", null);
        setField(term896202, term896202.getClass(), "externAndJsRoot", null);
        setField(term896202, term896202.getClass(), "inputsByName", null);
        setField(term896202, term896202.getClass(), "sourceMap", null);
        setField(term896202, term896202.getClass(), "externExports", null);
        setIntField(term896202, term896202.getClass(), "uniqueNameId", 0);
        setBooleanField(term896202, term896202.getClass(), "useThreads", false);
        setBooleanField(term896202, term896202.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896202, term896202.getClass(), "functionInformationMap", null);
        setField(term896202, term896202.getClass(), "debugLog", null);
        setField(term896202, term896202.getClass(), "defaultCodingConvention", null);
        setField(term896202, term896202.getClass(), "typeRegistry", null);
        setField(term896202, term896202.getClass(), "parserConfig", null);
        setField(term896202, term896202.getClass(), "abstractInterpreter", null);
        setField(term896202, term896202.getClass(), "typeValidator", null);
        setField(term896202, term896202.getClass(), "tracker", null);
        setField(term896202, term896202.getClass(), "oldErrorReporter", null);
        setField(term896202, term896202.getClass(), "defaultErrorReporter", null);
        setField(term896202, term896202.getClass(), "outStream", null);
        setField(term896202, term896202.getClass(), "globalRefMap", null);
        setField(term896202, term896202.getClass(), "sanityCheck", null);
        setField(term896202, term896202.getClass(), "currentTracer", null);
        setField(term896202, term896202.getClass(), "currentPassName", null);
        setField(term896202, term896202.getClass(), "recentChange", null);
        setField(term896202, term896202.getClass(), "codeChangeHandlers", null);
        setField(term896202, term896202.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetUniqueNameId", argTypes, term896202, args);
    }

};


