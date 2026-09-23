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

public class Compiler_toSourceArray_1736541947216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854839;

    public Compiler_toSourceArray_1736541947216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854839 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854839, term854839.getClass(), "options", null);
        setField(term854839, term854839.getClass(), "passes", null);
        setField(term854839, term854839.getClass(), "externs", null);
        setField(term854839, term854839.getClass(), "modules", null);
        setField(term854839, term854839.getClass(), "moduleGraph", null);
        setField(term854839, term854839.getClass(), "inputs", null);
        setField(term854839, term854839.getClass(), "errorManager", null);
        setField(term854839, term854839.getClass(), "warningsGuard", null);
        setField(term854839, term854839.getClass(), "externsRoot", null);
        setField(term854839, term854839.getClass(), "jsRoot", null);
        setField(term854839, term854839.getClass(), "externAndJsRoot", null);
        setField(term854839, term854839.getClass(), "inputsByName", null);
        setField(term854839, term854839.getClass(), "sourceMap", null);
        setField(term854839, term854839.getClass(), "externExports", null);
        setIntField(term854839, term854839.getClass(), "uniqueNameId", 0);
        setBooleanField(term854839, term854839.getClass(), "useThreads", false);
        setBooleanField(term854839, term854839.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854839, term854839.getClass(), "functionInformationMap", null);
        setField(term854839, term854839.getClass(), "debugLog", null);
        setField(term854839, term854839.getClass(), "defaultCodingConvention", null);
        setField(term854839, term854839.getClass(), "typeRegistry", null);
        setField(term854839, term854839.getClass(), "parserConfig", null);
        setField(term854839, term854839.getClass(), "abstractInterpreter", null);
        setField(term854839, term854839.getClass(), "typeValidator", null);
        setField(term854839, term854839.getClass(), "tracker", null);
        setField(term854839, term854839.getClass(), "oldErrorReporter", null);
        setField(term854839, term854839.getClass(), "defaultErrorReporter", null);
        setField(term854839, term854839.getClass(), "outStream", null);
        setField(term854839, term854839.getClass(), "globalRefMap", null);
        setField(term854839, term854839.getClass(), "sanityCheck", null);
        setField(term854839, term854839.getClass(), "currentTracer", null);
        setField(term854839, term854839.getClass(), "currentPassName", null);
        setField(term854839, term854839.getClass(), "recentChange", null);
        setField(term854839, term854839.getClass(), "codeChangeHandlers", null);
        setField(term854839, term854839.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSModule");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "toSourceArray", argTypes, term854839, args);
    }

};


