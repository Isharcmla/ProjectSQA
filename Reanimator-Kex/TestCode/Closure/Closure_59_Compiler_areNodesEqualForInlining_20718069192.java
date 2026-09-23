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

public class Compiler_areNodesEqualForInlining_20718069192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854743;

    public Compiler_areNodesEqualForInlining_20718069192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854743 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854743, term854743.getClass(), "options", null);
        setField(term854743, term854743.getClass(), "passes", null);
        setField(term854743, term854743.getClass(), "externs", null);
        setField(term854743, term854743.getClass(), "modules", null);
        setField(term854743, term854743.getClass(), "moduleGraph", null);
        setField(term854743, term854743.getClass(), "inputs", null);
        setField(term854743, term854743.getClass(), "errorManager", null);
        setField(term854743, term854743.getClass(), "warningsGuard", null);
        setField(term854743, term854743.getClass(), "externsRoot", null);
        setField(term854743, term854743.getClass(), "jsRoot", null);
        setField(term854743, term854743.getClass(), "externAndJsRoot", null);
        setField(term854743, term854743.getClass(), "inputsByName", null);
        setField(term854743, term854743.getClass(), "sourceMap", null);
        setField(term854743, term854743.getClass(), "externExports", null);
        setIntField(term854743, term854743.getClass(), "uniqueNameId", 0);
        setBooleanField(term854743, term854743.getClass(), "useThreads", false);
        setBooleanField(term854743, term854743.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854743, term854743.getClass(), "functionInformationMap", null);
        setField(term854743, term854743.getClass(), "debugLog", null);
        setField(term854743, term854743.getClass(), "defaultCodingConvention", null);
        setField(term854743, term854743.getClass(), "typeRegistry", null);
        setField(term854743, term854743.getClass(), "parserConfig", null);
        setField(term854743, term854743.getClass(), "abstractInterpreter", null);
        setField(term854743, term854743.getClass(), "typeValidator", null);
        setField(term854743, term854743.getClass(), "tracker", null);
        setField(term854743, term854743.getClass(), "oldErrorReporter", null);
        setField(term854743, term854743.getClass(), "defaultErrorReporter", null);
        setField(term854743, term854743.getClass(), "outStream", null);
        setField(term854743, term854743.getClass(), "globalRefMap", null);
        setField(term854743, term854743.getClass(), "sanityCheck", null);
        setField(term854743, term854743.getClass(), "currentTracer", null);
        setField(term854743, term854743.getClass(), "currentPassName", null);
        setField(term854743, term854743.getClass(), "recentChange", null);
        setField(term854743, term854743.getClass(), "codeChangeHandlers", null);
        setField(term854743, term854743.getClass(), "stage", null);
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
        callMethod(klass, "areNodesEqualForInlining", argTypes, term854743, args);
    }

};


