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

public class Compiler_getWarnings_895870062186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977812;

    public Compiler_getWarnings_895870062186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977812 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term977812, term977812.getClass(), "options", null);
        setField(term977812, term977812.getClass(), "passes", null);
        setField(term977812, term977812.getClass(), "externs", null);
        setField(term977812, term977812.getClass(), "modules", null);
        setField(term977812, term977812.getClass(), "moduleGraph", null);
        setField(term977812, term977812.getClass(), "inputs", null);
        setField(term977812, term977812.getClass(), "errorManager", null);
        setField(term977812, term977812.getClass(), "warningsGuard", null);
        setField(term977812, term977812.getClass(), "externsRoot", null);
        setField(term977812, term977812.getClass(), "jsRoot", null);
        setField(term977812, term977812.getClass(), "externAndJsRoot", null);
        setField(term977812, term977812.getClass(), "inputsByName", null);
        setField(term977812, term977812.getClass(), "sourceMap", null);
        setField(term977812, term977812.getClass(), "externExports", null);
        setIntField(term977812, term977812.getClass(), "uniqueNameId", 0);
        setBooleanField(term977812, term977812.getClass(), "useThreads", false);
        setBooleanField(term977812, term977812.getClass(), "hasRegExpGlobalReferences", false);
        setField(term977812, term977812.getClass(), "functionInformationMap", null);
        setField(term977812, term977812.getClass(), "debugLog", null);
        setField(term977812, term977812.getClass(), "defaultCodingConvention", null);
        setField(term977812, term977812.getClass(), "typeRegistry", null);
        setField(term977812, term977812.getClass(), "parserConfig", null);
        setField(term977812, term977812.getClass(), "abstractInterpreter", null);
        setField(term977812, term977812.getClass(), "typeValidator", null);
        setField(term977812, term977812.getClass(), "tracker", null);
        setField(term977812, term977812.getClass(), "oldErrorReporter", null);
        setField(term977812, term977812.getClass(), "defaultErrorReporter", null);
        setField(term977812, term977812.getClass(), "outStream", null);
        setField(term977812, term977812.getClass(), "globalRefMap", null);
        setField(term977812, term977812.getClass(), "sanityCheck", null);
        setField(term977812, term977812.getClass(), "currentTracer", null);
        setField(term977812, term977812.getClass(), "currentPassName", null);
        setField(term977812, term977812.getClass(), "recentChange", null);
        setField(term977812, term977812.getClass(), "codeChangeHandlers", null);
        setField(term977812, term977812.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWarnings", argTypes, term977812, args);
    }

};


