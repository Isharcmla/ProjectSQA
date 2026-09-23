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

public class ScopedAliases_process_84065531357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27221;
     Object term27371;
     Object term27793;
     Object term27795;

    public ScopedAliases_process_84065531357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27221 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term27301 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term27221, term27221.getClass(), "compiler", term27301);
        term27371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27371, term27371.getClass(), "type", 0);
        setField(term27371, term27371.getClass(), "parent", null);
        setField(term27441, term27441.getClass(), "next", null);
        setIntField(term27441, term27441.getClass(), "type", 105);
        setField(term27371, term27371.getClass(), "first", term27441);
        term27793 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term27794 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term27794, term27794.getClass(), "options", null);
        setField(term27794, term27794.getClass(), "passes", null);
        setField(term27794, term27794.getClass(), "externs", null);
        setField(term27794, term27794.getClass(), "modules", null);
        setField(term27794, term27794.getClass(), "moduleGraph", null);
        setField(term27794, term27794.getClass(), "inputs", null);
        setField(term27794, term27794.getClass(), "errorManager", null);
        setField(term27794, term27794.getClass(), "warningsGuard", null);
        setField(term27794, term27794.getClass(), "externsRoot", null);
        setField(term27794, term27794.getClass(), "jsRoot", null);
        setField(term27794, term27794.getClass(), "externAndJsRoot", null);
        setField(term27794, term27794.getClass(), "inputsById", null);
        setField(term27794, term27794.getClass(), "sourceMap", null);
        setField(term27794, term27794.getClass(), "externExports", null);
        setIntField(term27794, term27794.getClass(), "uniqueNameId", 0);
        setBooleanField(term27794, term27794.getClass(), "useThreads", false);
        setBooleanField(term27794, term27794.getClass(), "hasRegExpGlobalReferences", false);
        setField(term27794, term27794.getClass(), "functionInformationMap", null);
        setField(term27794, term27794.getClass(), "debugLog", null);
        setField(term27794, term27794.getClass(), "defaultCodingConvention", null);
        setField(term27794, term27794.getClass(), "typeRegistry", null);
        setField(term27794, term27794.getClass(), "parserConfig", null);
        setField(term27794, term27794.getClass(), "abstractInterpreter", null);
        setField(term27794, term27794.getClass(), "typeValidator", null);
        setField(term27794, term27794.getClass(), "tracker", null);
        setField(term27794, term27794.getClass(), "oldErrorReporter", null);
        setField(term27794, term27794.getClass(), "defaultErrorReporter", null);
        setField(term27794, term27794.getClass(), "outStream", null);
        setField(term27794, term27794.getClass(), "globalRefMap", null);
        setField(term27794, term27794.getClass(), "sanityCheck", null);
        setField(term27794, term27794.getClass(), "currentTracer", null);
        setField(term27794, term27794.getClass(), "currentPassName", null);
        setIntField(term27794, term27794.getClass(), "syntheticCodeId", 0);
        setField(term27794, term27794.getClass(), "recentChange", null);
        setField(term27794, term27794.getClass(), "codeChangeHandlers", null);
        setField(term27794, term27794.getClass(), "stage", null);
        setField(term27793, term27793.getClass(), "compiler", term27794);
        setField(term27793, term27793.getClass(), "preprocessorSymbolTable", null);
        setField(term27793, term27793.getClass(), "transformationHandler", null);
        term27795 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27795, term27795.getClass(), "type", 0);
        setField(term27795, term27795.getClass(), "next", null);
        setIntField(term27796, term27796.getClass(), "type", 105);
        setField(term27796, term27796.getClass(), "next", null);
        setField(term27796, term27796.getClass(), "first", null);
        setField(term27796, term27796.getClass(), "last", null);
        setField(term27796, term27796.getClass(), "propListHead", null);
        setIntField(term27796, term27796.getClass(), "sourcePosition", 0);
        setField(term27796, term27796.getClass(), "jsType", null);
        setField(term27796, term27796.getClass(), "parent", null);
        setField(term27795, term27795.getClass(), "first", term27796);
        setField(term27795, term27795.getClass(), "last", null);
        setField(term27795, term27795.getClass(), "propListHead", null);
        setIntField(term27795, term27795.getClass(), "sourcePosition", 0);
        setField(term27795, term27795.getClass(), "jsType", null);
        setField(term27795, term27795.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term27371;
        callMethod(klass, "process", argTypes, term27221, args);
        assertTrue(recursiveEquals(term27221, term27793));
        assertTrue(recursiveEquals(term27371, null));
    }

};


