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

public class Compiler_removeTryCatchFinally_1886841098172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896150;

    public Compiler_removeTryCatchFinally_1886841098172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896150 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896150, term896150.getClass(), "options", null);
        setField(term896150, term896150.getClass(), "passes", null);
        setField(term896150, term896150.getClass(), "externs", null);
        setField(term896150, term896150.getClass(), "modules", null);
        setField(term896150, term896150.getClass(), "moduleGraph", null);
        setField(term896150, term896150.getClass(), "inputs", null);
        setField(term896150, term896150.getClass(), "errorManager", null);
        setField(term896150, term896150.getClass(), "warningsGuard", null);
        setField(term896150, term896150.getClass(), "externsRoot", null);
        setField(term896150, term896150.getClass(), "jsRoot", null);
        setField(term896150, term896150.getClass(), "externAndJsRoot", null);
        setField(term896150, term896150.getClass(), "inputsByName", null);
        setField(term896150, term896150.getClass(), "sourceMap", null);
        setField(term896150, term896150.getClass(), "externExports", null);
        setIntField(term896150, term896150.getClass(), "uniqueNameId", 0);
        setBooleanField(term896150, term896150.getClass(), "useThreads", false);
        setBooleanField(term896150, term896150.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896150, term896150.getClass(), "functionInformationMap", null);
        setField(term896150, term896150.getClass(), "debugLog", null);
        setField(term896150, term896150.getClass(), "defaultCodingConvention", null);
        setField(term896150, term896150.getClass(), "typeRegistry", null);
        setField(term896150, term896150.getClass(), "parserConfig", null);
        setField(term896150, term896150.getClass(), "abstractInterpreter", null);
        setField(term896150, term896150.getClass(), "typeValidator", null);
        setField(term896150, term896150.getClass(), "tracker", null);
        setField(term896150, term896150.getClass(), "oldErrorReporter", null);
        setField(term896150, term896150.getClass(), "defaultErrorReporter", null);
        setField(term896150, term896150.getClass(), "outStream", null);
        setField(term896150, term896150.getClass(), "globalRefMap", null);
        setField(term896150, term896150.getClass(), "sanityCheck", null);
        setField(term896150, term896150.getClass(), "currentTracer", null);
        setField(term896150, term896150.getClass(), "currentPassName", null);
        setField(term896150, term896150.getClass(), "recentChange", null);
        setField(term896150, term896150.getClass(), "codeChangeHandlers", null);
        setField(term896150, term896150.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "removeTryCatchFinally", argTypes, term896150, args);
    }

};


