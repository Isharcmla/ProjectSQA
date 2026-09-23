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

public class Compiler_runCallable_1156669973164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977720;
     Object term977724;
     Object term977726;

    public Compiler_runCallable_1156669973164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977720 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term977720, term977720.getClass(), "options", null);
        setField(term977720, term977720.getClass(), "passes", null);
        setField(term977720, term977720.getClass(), "externs", null);
        setField(term977720, term977720.getClass(), "modules", null);
        setField(term977720, term977720.getClass(), "moduleGraph", null);
        setField(term977720, term977720.getClass(), "inputs", null);
        setField(term977720, term977720.getClass(), "errorManager", null);
        setField(term977720, term977720.getClass(), "warningsGuard", null);
        setField(term977720, term977720.getClass(), "externsRoot", null);
        setField(term977720, term977720.getClass(), "jsRoot", null);
        setField(term977720, term977720.getClass(), "externAndJsRoot", null);
        setField(term977720, term977720.getClass(), "inputsByName", null);
        setField(term977720, term977720.getClass(), "sourceMap", null);
        setField(term977720, term977720.getClass(), "externExports", null);
        setIntField(term977720, term977720.getClass(), "uniqueNameId", 0);
        setBooleanField(term977720, term977720.getClass(), "useThreads", false);
        setBooleanField(term977720, term977720.getClass(), "hasRegExpGlobalReferences", false);
        setField(term977720, term977720.getClass(), "functionInformationMap", null);
        setField(term977720, term977720.getClass(), "debugLog", null);
        setField(term977720, term977720.getClass(), "defaultCodingConvention", null);
        setField(term977720, term977720.getClass(), "typeRegistry", null);
        setField(term977720, term977720.getClass(), "parserConfig", null);
        setField(term977720, term977720.getClass(), "abstractInterpreter", null);
        setField(term977720, term977720.getClass(), "typeValidator", null);
        setField(term977720, term977720.getClass(), "tracker", null);
        setField(term977720, term977720.getClass(), "oldErrorReporter", null);
        setField(term977720, term977720.getClass(), "defaultErrorReporter", null);
        setField(term977720, term977720.getClass(), "outStream", null);
        setField(term977720, term977720.getClass(), "globalRefMap", null);
        setField(term977720, term977720.getClass(), "sanityCheck", null);
        setField(term977720, term977720.getClass(), "currentTracer", null);
        setField(term977720, term977720.getClass(), "currentPassName", null);
        setField(term977720, term977720.getClass(), "recentChange", null);
        setField(term977720, term977720.getClass(), "codeChangeHandlers", null);
        setField(term977720, term977720.getClass(), "stage", null);
        term977724 = new Boolean(false);
        term977726 = new Boolean(false);
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
        args[1] = term977724;
        args[2] = term977726;
        callMethod(klass, "runCallable", argTypes, term977720, args);
    }

};


