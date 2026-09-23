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

public class Compiler_areNodesEqualForInlining_20718069187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896210;

    public Compiler_areNodesEqualForInlining_20718069187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896210 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term896210, term896210.getClass(), "options", null);
        setField(term896210, term896210.getClass(), "passes", null);
        setField(term896210, term896210.getClass(), "externs", null);
        setField(term896210, term896210.getClass(), "modules", null);
        setField(term896210, term896210.getClass(), "moduleGraph", null);
        setField(term896210, term896210.getClass(), "inputs", null);
        setField(term896210, term896210.getClass(), "errorManager", null);
        setField(term896210, term896210.getClass(), "warningsGuard", null);
        setField(term896210, term896210.getClass(), "externsRoot", null);
        setField(term896210, term896210.getClass(), "jsRoot", null);
        setField(term896210, term896210.getClass(), "externAndJsRoot", null);
        setField(term896210, term896210.getClass(), "inputsByName", null);
        setField(term896210, term896210.getClass(), "sourceMap", null);
        setField(term896210, term896210.getClass(), "externExports", null);
        setIntField(term896210, term896210.getClass(), "uniqueNameId", 0);
        setBooleanField(term896210, term896210.getClass(), "useThreads", false);
        setBooleanField(term896210, term896210.getClass(), "hasRegExpGlobalReferences", false);
        setField(term896210, term896210.getClass(), "functionInformationMap", null);
        setField(term896210, term896210.getClass(), "debugLog", null);
        setField(term896210, term896210.getClass(), "defaultCodingConvention", null);
        setField(term896210, term896210.getClass(), "typeRegistry", null);
        setField(term896210, term896210.getClass(), "parserConfig", null);
        setField(term896210, term896210.getClass(), "abstractInterpreter", null);
        setField(term896210, term896210.getClass(), "typeValidator", null);
        setField(term896210, term896210.getClass(), "tracker", null);
        setField(term896210, term896210.getClass(), "oldErrorReporter", null);
        setField(term896210, term896210.getClass(), "defaultErrorReporter", null);
        setField(term896210, term896210.getClass(), "outStream", null);
        setField(term896210, term896210.getClass(), "globalRefMap", null);
        setField(term896210, term896210.getClass(), "sanityCheck", null);
        setField(term896210, term896210.getClass(), "currentTracer", null);
        setField(term896210, term896210.getClass(), "currentPassName", null);
        setField(term896210, term896210.getClass(), "recentChange", null);
        setField(term896210, term896210.getClass(), "codeChangeHandlers", null);
        setField(term896210, term896210.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "areNodesEqualForInlining", argTypes, term896210, args);
    }

};


