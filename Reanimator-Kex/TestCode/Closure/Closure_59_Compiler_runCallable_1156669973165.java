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
import java.lang.Boolean;

public class Compiler_runCallable_1156669973165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854631;
     Object term854635;
     Object term854637;

    public Compiler_runCallable_1156669973165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854631 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854631, term854631.getClass(), "options", null);
        setField(term854631, term854631.getClass(), "passes", null);
        setField(term854631, term854631.getClass(), "externs", null);
        setField(term854631, term854631.getClass(), "modules", null);
        setField(term854631, term854631.getClass(), "moduleGraph", null);
        setField(term854631, term854631.getClass(), "inputs", null);
        setField(term854631, term854631.getClass(), "errorManager", null);
        setField(term854631, term854631.getClass(), "warningsGuard", null);
        setField(term854631, term854631.getClass(), "externsRoot", null);
        setField(term854631, term854631.getClass(), "jsRoot", null);
        setField(term854631, term854631.getClass(), "externAndJsRoot", null);
        setField(term854631, term854631.getClass(), "inputsByName", null);
        setField(term854631, term854631.getClass(), "sourceMap", null);
        setField(term854631, term854631.getClass(), "externExports", null);
        setIntField(term854631, term854631.getClass(), "uniqueNameId", 0);
        setBooleanField(term854631, term854631.getClass(), "useThreads", false);
        setBooleanField(term854631, term854631.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854631, term854631.getClass(), "functionInformationMap", null);
        setField(term854631, term854631.getClass(), "debugLog", null);
        setField(term854631, term854631.getClass(), "defaultCodingConvention", null);
        setField(term854631, term854631.getClass(), "typeRegistry", null);
        setField(term854631, term854631.getClass(), "parserConfig", null);
        setField(term854631, term854631.getClass(), "abstractInterpreter", null);
        setField(term854631, term854631.getClass(), "typeValidator", null);
        setField(term854631, term854631.getClass(), "tracker", null);
        setField(term854631, term854631.getClass(), "oldErrorReporter", null);
        setField(term854631, term854631.getClass(), "defaultErrorReporter", null);
        setField(term854631, term854631.getClass(), "outStream", null);
        setField(term854631, term854631.getClass(), "globalRefMap", null);
        setField(term854631, term854631.getClass(), "sanityCheck", null);
        setField(term854631, term854631.getClass(), "currentTracer", null);
        setField(term854631, term854631.getClass(), "currentPassName", null);
        setField(term854631, term854631.getClass(), "recentChange", null);
        setField(term854631, term854631.getClass(), "codeChangeHandlers", null);
        setField(term854631, term854631.getClass(), "stage", null);
        term854635 = new Boolean(false);
        term854637 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.concurrent.Callable");
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term854635;
        args[2] = term854637;
        callMethod(klass, "runCallable", argTypes, term854631, args);
    }

};


