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

public class Compiler_compileInternal_1928486329166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854639;

    public Compiler_compileInternal_1928486329166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854639 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854639, term854639.getClass(), "options", null);
        setField(term854639, term854639.getClass(), "passes", null);
        setField(term854639, term854639.getClass(), "externs", null);
        setField(term854639, term854639.getClass(), "modules", null);
        setField(term854639, term854639.getClass(), "moduleGraph", null);
        setField(term854639, term854639.getClass(), "inputs", null);
        setField(term854639, term854639.getClass(), "errorManager", null);
        setField(term854639, term854639.getClass(), "warningsGuard", null);
        setField(term854639, term854639.getClass(), "externsRoot", null);
        setField(term854639, term854639.getClass(), "jsRoot", null);
        setField(term854639, term854639.getClass(), "externAndJsRoot", null);
        setField(term854639, term854639.getClass(), "inputsByName", null);
        setField(term854639, term854639.getClass(), "sourceMap", null);
        setField(term854639, term854639.getClass(), "externExports", null);
        setIntField(term854639, term854639.getClass(), "uniqueNameId", 0);
        setBooleanField(term854639, term854639.getClass(), "useThreads", false);
        setBooleanField(term854639, term854639.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854639, term854639.getClass(), "functionInformationMap", null);
        setField(term854639, term854639.getClass(), "debugLog", null);
        setField(term854639, term854639.getClass(), "defaultCodingConvention", null);
        setField(term854639, term854639.getClass(), "typeRegistry", null);
        setField(term854639, term854639.getClass(), "parserConfig", null);
        setField(term854639, term854639.getClass(), "abstractInterpreter", null);
        setField(term854639, term854639.getClass(), "typeValidator", null);
        setField(term854639, term854639.getClass(), "tracker", null);
        setField(term854639, term854639.getClass(), "oldErrorReporter", null);
        setField(term854639, term854639.getClass(), "defaultErrorReporter", null);
        setField(term854639, term854639.getClass(), "outStream", null);
        setField(term854639, term854639.getClass(), "globalRefMap", null);
        setField(term854639, term854639.getClass(), "sanityCheck", null);
        setField(term854639, term854639.getClass(), "currentTracer", null);
        setField(term854639, term854639.getClass(), "currentPassName", null);
        setField(term854639, term854639.getClass(), "recentChange", null);
        setField(term854639, term854639.getClass(), "codeChangeHandlers", null);
        setField(term854639, term854639.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compileInternal", argTypes, term854639, args);
    }

};


