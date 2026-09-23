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

public class Compiler_removeChangeHandler_1082945247230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854942;

    public Compiler_removeChangeHandler_1082945247230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854942 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854942, term854942.getClass(), "options", null);
        setField(term854942, term854942.getClass(), "passes", null);
        setField(term854942, term854942.getClass(), "externs", null);
        setField(term854942, term854942.getClass(), "modules", null);
        setField(term854942, term854942.getClass(), "moduleGraph", null);
        setField(term854942, term854942.getClass(), "inputs", null);
        setField(term854942, term854942.getClass(), "errorManager", null);
        setField(term854942, term854942.getClass(), "warningsGuard", null);
        setField(term854942, term854942.getClass(), "externsRoot", null);
        setField(term854942, term854942.getClass(), "jsRoot", null);
        setField(term854942, term854942.getClass(), "externAndJsRoot", null);
        setField(term854942, term854942.getClass(), "inputsByName", null);
        setField(term854942, term854942.getClass(), "sourceMap", null);
        setField(term854942, term854942.getClass(), "externExports", null);
        setIntField(term854942, term854942.getClass(), "uniqueNameId", 0);
        setBooleanField(term854942, term854942.getClass(), "useThreads", false);
        setBooleanField(term854942, term854942.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854942, term854942.getClass(), "functionInformationMap", null);
        setField(term854942, term854942.getClass(), "debugLog", null);
        setField(term854942, term854942.getClass(), "defaultCodingConvention", null);
        setField(term854942, term854942.getClass(), "typeRegistry", null);
        setField(term854942, term854942.getClass(), "parserConfig", null);
        setField(term854942, term854942.getClass(), "abstractInterpreter", null);
        setField(term854942, term854942.getClass(), "typeValidator", null);
        setField(term854942, term854942.getClass(), "tracker", null);
        setField(term854942, term854942.getClass(), "oldErrorReporter", null);
        setField(term854942, term854942.getClass(), "defaultErrorReporter", null);
        setField(term854942, term854942.getClass(), "outStream", null);
        setField(term854942, term854942.getClass(), "globalRefMap", null);
        setField(term854942, term854942.getClass(), "sanityCheck", null);
        setField(term854942, term854942.getClass(), "currentTracer", null);
        setField(term854942, term854942.getClass(), "currentPassName", null);
        setField(term854942, term854942.getClass(), "recentChange", null);
        setField(term854942, term854942.getClass(), "codeChangeHandlers", null);
        setField(term854942, term854942.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodeChangeHandler");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "removeChangeHandler", argTypes, term854942, args);
    }

};


