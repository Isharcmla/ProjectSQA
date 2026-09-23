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

public class ScopedAliases_process_840655313199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111440;
     Object term111590;
     Object term112549;
     Object term112551;

    public ScopedAliases_process_840655313199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111440 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term111520 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term111440, term111440.getClass(), "compiler", term111520);
        term111590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term111590, term111590.getClass(), "type", 0);
        setField(term111590, term111590.getClass(), "parent", null);
        setField(term111660, term111660.getClass(), "next", term111730);
        setIntField(term111660, term111660.getClass(), "type", 0);
        setField(term111660, term111660.getClass(), "first", null);
        setField(term111590, term111590.getClass(), "first", term111660);
        term112549 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term112550 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term112550, term112550.getClass(), "options", null);
        setField(term112550, term112550.getClass(), "passes", null);
        setField(term112550, term112550.getClass(), "externs", null);
        setField(term112550, term112550.getClass(), "modules", null);
        setField(term112550, term112550.getClass(), "moduleGraph", null);
        setField(term112550, term112550.getClass(), "inputs", null);
        setField(term112550, term112550.getClass(), "errorManager", null);
        setField(term112550, term112550.getClass(), "warningsGuard", null);
        setField(term112550, term112550.getClass(), "externsRoot", null);
        setField(term112550, term112550.getClass(), "jsRoot", null);
        setField(term112550, term112550.getClass(), "externAndJsRoot", null);
        setField(term112550, term112550.getClass(), "inputsById", null);
        setField(term112550, term112550.getClass(), "sourceMap", null);
        setField(term112550, term112550.getClass(), "externExports", null);
        setIntField(term112550, term112550.getClass(), "uniqueNameId", 0);
        setBooleanField(term112550, term112550.getClass(), "useThreads", false);
        setBooleanField(term112550, term112550.getClass(), "hasRegExpGlobalReferences", false);
        setField(term112550, term112550.getClass(), "functionInformationMap", null);
        setField(term112550, term112550.getClass(), "debugLog", null);
        setField(term112550, term112550.getClass(), "defaultCodingConvention", null);
        setField(term112550, term112550.getClass(), "typeRegistry", null);
        setField(term112550, term112550.getClass(), "parserConfig", null);
        setField(term112550, term112550.getClass(), "abstractInterpreter", null);
        setField(term112550, term112550.getClass(), "typeValidator", null);
        setField(term112550, term112550.getClass(), "tracker", null);
        setField(term112550, term112550.getClass(), "oldErrorReporter", null);
        setField(term112550, term112550.getClass(), "defaultErrorReporter", null);
        setField(term112550, term112550.getClass(), "outStream", null);
        setField(term112550, term112550.getClass(), "globalRefMap", null);
        setField(term112550, term112550.getClass(), "sanityCheck", null);
        setField(term112550, term112550.getClass(), "currentTracer", null);
        setField(term112550, term112550.getClass(), "currentPassName", null);
        setIntField(term112550, term112550.getClass(), "syntheticCodeId", 0);
        setField(term112550, term112550.getClass(), "recentChange", null);
        setField(term112550, term112550.getClass(), "codeChangeHandlers", null);
        setField(term112550, term112550.getClass(), "stage", null);
        setField(term112549, term112549.getClass(), "compiler", term112550);
        setField(term112549, term112549.getClass(), "preprocessorSymbolTable", null);
        setField(term112549, term112549.getClass(), "transformationHandler", null);
        term112551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112552 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term112551, term112551.getClass(), "type", 0);
        setField(term112551, term112551.getClass(), "next", null);
        setIntField(term112552, term112552.getClass(), "type", 0);
        setIntField(term112553, term112553.getClass(), "type", 0);
        setField(term112553, term112553.getClass(), "next", null);
        setField(term112553, term112553.getClass(), "first", null);
        setField(term112553, term112553.getClass(), "last", null);
        setField(term112553, term112553.getClass(), "propListHead", null);
        setIntField(term112553, term112553.getClass(), "sourcePosition", 0);
        setField(term112553, term112553.getClass(), "jsType", null);
        setField(term112553, term112553.getClass(), "parent", null);
        setField(term112552, term112552.getClass(), "next", term112553);
        setField(term112552, term112552.getClass(), "first", null);
        setField(term112552, term112552.getClass(), "last", null);
        setField(term112552, term112552.getClass(), "propListHead", null);
        setIntField(term112552, term112552.getClass(), "sourcePosition", 0);
        setField(term112552, term112552.getClass(), "jsType", null);
        setField(term112552, term112552.getClass(), "parent", null);
        setField(term112551, term112551.getClass(), "first", term112552);
        setField(term112551, term112551.getClass(), "last", null);
        setField(term112551, term112551.getClass(), "propListHead", null);
        setIntField(term112551, term112551.getClass(), "sourcePosition", 0);
        setField(term112551, term112551.getClass(), "jsType", null);
        setField(term112551, term112551.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term111590;
        callMethod(klass, "process", argTypes, term111440, args);
        assertTrue(recursiveEquals(term111440, term112549));
        assertTrue(recursiveEquals(term111590, null));
    }

};


