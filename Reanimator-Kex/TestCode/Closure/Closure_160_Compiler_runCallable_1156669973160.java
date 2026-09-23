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

public class Compiler_runCallable_1156669973160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896098;
     Object term896102;
     Object term896104;

    public Compiler_runCallable_1156669973160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896098 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896098, term896098.getClass(), "options", null);
        setField(term896098, term896098.getClass(), "passes", null);
        setField(term896098, term896098.getClass(), "externs", null);
        setField(term896098, term896098.getClass(), "modules", null);
        setField(term896098, term896098.getClass(), "moduleGraph", null);
        setField(term896098, term896098.getClass(), "inputs", null);
        setField(term896098, term896098.getClass(), "errorManager", null);
        setField(term896098, term896098.getClass(), "warningsGuard", null);
        setField(term896098, term896098.getClass(), "externsRoot", null);
        setField(term896098, term896098.getClass(), "jsRoot", null);
        setField(term896098, term896098.getClass(), "externAndJsRoot", null);
        setField(term896098, term896098.getClass(), "inputsByName", null);
        setField(term896098, term896098.getClass(), "sourceMap", null);
        setField(term896098, term896098.getClass(), "externExports", null);
        setIntField(term896098, term896098.getClass(), "uniqueNameId", 0);
        setBooleanField(term896098, term896098.getClass(), "useThreads", false);
        setBooleanField(term896098, term896098.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896098, term896098.getClass(), "functionInformationMap", null);
        setField(term896098, term896098.getClass(), "debugLog", null);
        setField(term896098, term896098.getClass(), "defaultCodingConvention", null);
        setField(term896098, term896098.getClass(), "typeRegistry", null);
        setField(term896098, term896098.getClass(), "parserConfig", null);
        setField(term896098, term896098.getClass(), "abstractInterpreter", null);
        setField(term896098, term896098.getClass(), "typeValidator", null);
        setField(term896098, term896098.getClass(), "tracker", null);
        setField(term896098, term896098.getClass(), "oldErrorReporter", null);
        setField(term896098, term896098.getClass(), "defaultErrorReporter", null);
        setField(term896098, term896098.getClass(), "outStream", null);
        setField(term896098, term896098.getClass(), "globalRefMap", null);
        setField(term896098, term896098.getClass(), "sanityCheck", null);
        setField(term896098, term896098.getClass(), "currentTracer", null);
        setField(term896098, term896098.getClass(), "currentPassName", null);
        setField(term896098, term896098.getClass(), "recentChange", null);
        setField(term896098, term896098.getClass(), "codeChangeHandlers", null);
        setField(term896098, term896098.getClass(), "stage", null);
        term896102 = new Boolean(false);
        term896104 = new Boolean(false);
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
        args[1] = term896102;
        args[2] = term896104;
        callMethod(klass, "runCallable", argTypes, term896098, args);
    }

};


