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

public class Compiler_runInCompilerThread_39736063162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977712;

    public Compiler_runInCompilerThread_39736063162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977712 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term977712, term977712.getClass(), "options", null);
        setField(term977712, term977712.getClass(), "passes", null);
        setField(term977712, term977712.getClass(), "externs", null);
        setField(term977712, term977712.getClass(), "modules", null);
        setField(term977712, term977712.getClass(), "moduleGraph", null);
        setField(term977712, term977712.getClass(), "inputs", null);
        setField(term977712, term977712.getClass(), "errorManager", null);
        setField(term977712, term977712.getClass(), "warningsGuard", null);
        setField(term977712, term977712.getClass(), "externsRoot", null);
        setField(term977712, term977712.getClass(), "jsRoot", null);
        setField(term977712, term977712.getClass(), "externAndJsRoot", null);
        setField(term977712, term977712.getClass(), "inputsByName", null);
        setField(term977712, term977712.getClass(), "sourceMap", null);
        setField(term977712, term977712.getClass(), "externExports", null);
        setIntField(term977712, term977712.getClass(), "uniqueNameId", 0);
        setBooleanField(term977712, term977712.getClass(), "useThreads", false);
        setBooleanField(term977712, term977712.getClass(), "hasRegExpGlobalReferences", false);
        setField(term977712, term977712.getClass(), "functionInformationMap", null);
        setField(term977712, term977712.getClass(), "debugLog", null);
        setField(term977712, term977712.getClass(), "defaultCodingConvention", null);
        setField(term977712, term977712.getClass(), "typeRegistry", null);
        setField(term977712, term977712.getClass(), "parserConfig", null);
        setField(term977712, term977712.getClass(), "abstractInterpreter", null);
        setField(term977712, term977712.getClass(), "typeValidator", null);
        setField(term977712, term977712.getClass(), "tracker", null);
        setField(term977712, term977712.getClass(), "oldErrorReporter", null);
        setField(term977712, term977712.getClass(), "defaultErrorReporter", null);
        setField(term977712, term977712.getClass(), "outStream", null);
        setField(term977712, term977712.getClass(), "globalRefMap", null);
        setField(term977712, term977712.getClass(), "sanityCheck", null);
        setField(term977712, term977712.getClass(), "currentTracer", null);
        setField(term977712, term977712.getClass(), "currentPassName", null);
        setField(term977712, term977712.getClass(), "recentChange", null);
        setField(term977712, term977712.getClass(), "codeChangeHandlers", null);
        setField(term977712, term977712.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.concurrent.Callable");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "runInCompilerThread", argTypes, term977712, args);
    }

};


