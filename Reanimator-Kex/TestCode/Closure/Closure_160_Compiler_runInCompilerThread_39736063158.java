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

public class Compiler_runInCompilerThread_39736063158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896090;

    public Compiler_runInCompilerThread_39736063158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896090 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896090, term896090.getClass(), "options", null);
        setField(term896090, term896090.getClass(), "passes", null);
        setField(term896090, term896090.getClass(), "externs", null);
        setField(term896090, term896090.getClass(), "modules", null);
        setField(term896090, term896090.getClass(), "moduleGraph", null);
        setField(term896090, term896090.getClass(), "inputs", null);
        setField(term896090, term896090.getClass(), "errorManager", null);
        setField(term896090, term896090.getClass(), "warningsGuard", null);
        setField(term896090, term896090.getClass(), "externsRoot", null);
        setField(term896090, term896090.getClass(), "jsRoot", null);
        setField(term896090, term896090.getClass(), "externAndJsRoot", null);
        setField(term896090, term896090.getClass(), "inputsByName", null);
        setField(term896090, term896090.getClass(), "sourceMap", null);
        setField(term896090, term896090.getClass(), "externExports", null);
        setIntField(term896090, term896090.getClass(), "uniqueNameId", 0);
        setBooleanField(term896090, term896090.getClass(), "useThreads", false);
        setBooleanField(term896090, term896090.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896090, term896090.getClass(), "functionInformationMap", null);
        setField(term896090, term896090.getClass(), "debugLog", null);
        setField(term896090, term896090.getClass(), "defaultCodingConvention", null);
        setField(term896090, term896090.getClass(), "typeRegistry", null);
        setField(term896090, term896090.getClass(), "parserConfig", null);
        setField(term896090, term896090.getClass(), "abstractInterpreter", null);
        setField(term896090, term896090.getClass(), "typeValidator", null);
        setField(term896090, term896090.getClass(), "tracker", null);
        setField(term896090, term896090.getClass(), "oldErrorReporter", null);
        setField(term896090, term896090.getClass(), "defaultErrorReporter", null);
        setField(term896090, term896090.getClass(), "outStream", null);
        setField(term896090, term896090.getClass(), "globalRefMap", null);
        setField(term896090, term896090.getClass(), "sanityCheck", null);
        setField(term896090, term896090.getClass(), "currentTracer", null);
        setField(term896090, term896090.getClass(), "currentPassName", null);
        setField(term896090, term896090.getClass(), "recentChange", null);
        setField(term896090, term896090.getClass(), "codeChangeHandlers", null);
        setField(term896090, term896090.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.concurrent.Callable");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "runInCompilerThread", argTypes, term896090, args);
    }

};


