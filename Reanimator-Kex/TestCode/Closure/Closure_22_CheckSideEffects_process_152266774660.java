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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class CheckSideEffects_process_152266774660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27396;
     Object term27546;
     Object term27918;
     Object term27920;

    public CheckSideEffects_process_152266774660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27396 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        Object term27476 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term27396, term27396.getClass(), "compiler", term27476);
        term27546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27546, term27546.getClass(), "type", 115);
        setField(term27546, term27546.getClass(), "parent", null);
        setField(term27616, term27616.getClass(), "next", null);
        setIntField(term27616, term27616.getClass(), "type", 0);
        setField(term27686, term27686.getClass(), "next", null);
        setIntField(term27686, term27686.getClass(), "type", 0);
        setField(term27686, term27686.getClass(), "first", null);
        setField(term27616, term27616.getClass(), "first", term27686);
        setField(term27546, term27546.getClass(), "first", term27616);
        term27918 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        Object term27919 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term27918, term27918.getClass(), "level", null);
        setField(term27918, term27918.getClass(), "problemNodes", null);
        setField(term27919, term27919.getClass(), "options", null);
        setField(term27919, term27919.getClass(), "passes", null);
        setField(term27919, term27919.getClass(), "externs", null);
        setField(term27919, term27919.getClass(), "modules", null);
        setField(term27919, term27919.getClass(), "moduleGraph", null);
        setField(term27919, term27919.getClass(), "inputs", null);
        setField(term27919, term27919.getClass(), "errorManager", null);
        setField(term27919, term27919.getClass(), "warningsGuard", null);
        setField(term27919, term27919.getClass(), "injectedLibraries", null);
        setField(term27919, term27919.getClass(), "externsRoot", null);
        setField(term27919, term27919.getClass(), "jsRoot", null);
        setField(term27919, term27919.getClass(), "externAndJsRoot", null);
        setField(term27919, term27919.getClass(), "inputsById", null);
        setField(term27919, term27919.getClass(), "sourceMap", null);
        setField(term27919, term27919.getClass(), "externExports", null);
        setIntField(term27919, term27919.getClass(), "uniqueNameId", 0);
        setBooleanField(term27919, term27919.getClass(), "useThreads", false);
        setBooleanField(term27919, term27919.getClass(), "hasRegExpGlobalReferences", false);
        setField(term27919, term27919.getClass(), "functionInformationMap", null);
        setField(term27919, term27919.getClass(), "debugLog", null);
        setField(term27919, term27919.getClass(), "defaultCodingConvention", null);
        setField(term27919, term27919.getClass(), "typeRegistry", null);
        setField(term27919, term27919.getClass(), "parserConfig", null);
        setField(term27919, term27919.getClass(), "abstractInterpreter", null);
        setField(term27919, term27919.getClass(), "typeValidator", null);
        setField(term27919, term27919.getClass(), "tracker", null);
        setField(term27919, term27919.getClass(), "oldErrorReporter", null);
        setField(term27919, term27919.getClass(), "defaultErrorReporter", null);
        setField(term27919, term27919.getClass(), "outStream", null);
        setField(term27919, term27919.getClass(), "globalRefMap", null);
        setDoubleField(term27919, term27919.getClass(), "progress", 0.0);
        setField(term27919, term27919.getClass(), "sanityCheck", null);
        setField(term27919, term27919.getClass(), "currentTracer", null);
        setField(term27919, term27919.getClass(), "currentPassName", null);
        setIntField(term27919, term27919.getClass(), "syntheticCodeId", 0);
        setField(term27919, term27919.getClass(), "recentChange", null);
        setField(term27919, term27919.getClass(), "codeChangeHandlers", null);
        setField(term27919, term27919.getClass(), "synthesizedExternsInput", null);
        setField(term27919, term27919.getClass(), "stage", null);
        setField(term27918, term27918.getClass(), "compiler", term27919);
        setBooleanField(term27918, term27918.getClass(), "protectSideEffectFreeCode", false);
        term27920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27920, term27920.getClass(), "type", 115);
        setField(term27920, term27920.getClass(), "next", null);
        setIntField(term27921, term27921.getClass(), "type", 0);
        setField(term27921, term27921.getClass(), "next", null);
        setIntField(term27922, term27922.getClass(), "type", 0);
        setField(term27922, term27922.getClass(), "next", null);
        setField(term27922, term27922.getClass(), "first", null);
        setField(term27922, term27922.getClass(), "last", null);
        setField(term27922, term27922.getClass(), "propListHead", null);
        setIntField(term27922, term27922.getClass(), "sourcePosition", 0);
        setField(term27922, term27922.getClass(), "jsType", null);
        setField(term27922, term27922.getClass(), "parent", null);
        setField(term27921, term27921.getClass(), "first", term27922);
        setField(term27921, term27921.getClass(), "last", null);
        setField(term27921, term27921.getClass(), "propListHead", null);
        setIntField(term27921, term27921.getClass(), "sourcePosition", 0);
        setField(term27921, term27921.getClass(), "jsType", null);
        setField(term27921, term27921.getClass(), "parent", null);
        setField(term27920, term27920.getClass(), "first", term27921);
        setField(term27920, term27920.getClass(), "last", null);
        setField(term27920, term27920.getClass(), "propListHead", null);
        setIntField(term27920, term27920.getClass(), "sourcePosition", 0);
        setField(term27920, term27920.getClass(), "jsType", null);
        setField(term27920, term27920.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term27546;
        callMethod(klass, "process", argTypes, term27396, args);
        assertTrue(recursiveEquals(term27396, term27918));
        assertTrue(recursiveEquals(term27546, null));
    }

};


