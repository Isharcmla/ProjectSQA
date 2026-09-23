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

public class ScopedAliases_process_84065531323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11878;
     Object term12028;
     Object term12796;
     Object term12798;

    public ScopedAliases_process_84065531323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11878 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term11958 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term11878, term11878.getClass(), "compiler", term11958);
        term12028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12028, term12028.getClass(), "type", 0);
        setIntField(term12098, term12098.getClass(), "type", 0);
        setField(term12098, term12098.getClass(), "parent", null);
        setField(term12028, term12028.getClass(), "parent", term12098);
        setField(term12028, term12028.getClass(), "first", null);
        term12796 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term12797 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term12797, term12797.getClass(), "options", null);
        setField(term12797, term12797.getClass(), "passes", null);
        setField(term12797, term12797.getClass(), "externs", null);
        setField(term12797, term12797.getClass(), "modules", null);
        setField(term12797, term12797.getClass(), "moduleGraph", null);
        setField(term12797, term12797.getClass(), "inputs", null);
        setField(term12797, term12797.getClass(), "errorManager", null);
        setField(term12797, term12797.getClass(), "warningsGuard", null);
        setField(term12797, term12797.getClass(), "injectedLibraries", null);
        setField(term12797, term12797.getClass(), "externsRoot", null);
        setField(term12797, term12797.getClass(), "jsRoot", null);
        setField(term12797, term12797.getClass(), "externAndJsRoot", null);
        setField(term12797, term12797.getClass(), "inputsById", null);
        setField(term12797, term12797.getClass(), "sourceMap", null);
        setField(term12797, term12797.getClass(), "externExports", null);
        setIntField(term12797, term12797.getClass(), "uniqueNameId", 0);
        setBooleanField(term12797, term12797.getClass(), "useThreads", false);
        setBooleanField(term12797, term12797.getClass(), "hasRegExpGlobalReferences", false);
        setField(term12797, term12797.getClass(), "functionInformationMap", null);
        setField(term12797, term12797.getClass(), "debugLog", null);
        setField(term12797, term12797.getClass(), "defaultCodingConvention", null);
        setField(term12797, term12797.getClass(), "typeRegistry", null);
        setField(term12797, term12797.getClass(), "parserConfig", null);
        setField(term12797, term12797.getClass(), "abstractInterpreter", null);
        setField(term12797, term12797.getClass(), "typeValidator", null);
        setField(term12797, term12797.getClass(), "tracker", null);
        setField(term12797, term12797.getClass(), "oldErrorReporter", null);
        setField(term12797, term12797.getClass(), "defaultErrorReporter", null);
        setField(term12797, term12797.getClass(), "outStream", null);
        setField(term12797, term12797.getClass(), "globalRefMap", null);
        setDoubleField(term12797, term12797.getClass(), "progress", 0.0);
        setField(term12797, term12797.getClass(), "sanityCheck", null);
        setField(term12797, term12797.getClass(), "currentTracer", null);
        setField(term12797, term12797.getClass(), "currentPassName", null);
        setIntField(term12797, term12797.getClass(), "syntheticCodeId", 0);
        setField(term12797, term12797.getClass(), "recentChange", null);
        setField(term12797, term12797.getClass(), "codeChangeHandlers", null);
        setField(term12797, term12797.getClass(), "synthesizedExternsInput", null);
        setField(term12797, term12797.getClass(), "stage", null);
        setField(term12796, term12796.getClass(), "compiler", term12797);
        setField(term12796, term12796.getClass(), "preprocessorSymbolTable", null);
        setField(term12796, term12796.getClass(), "transformationHandler", null);
        term12798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12798, term12798.getClass(), "type", 0);
        setField(term12798, term12798.getClass(), "next", null);
        setField(term12798, term12798.getClass(), "first", null);
        setField(term12798, term12798.getClass(), "last", null);
        setField(term12798, term12798.getClass(), "propListHead", null);
        setIntField(term12798, term12798.getClass(), "sourcePosition", 0);
        setField(term12798, term12798.getClass(), "jsType", null);
        setIntField(term12799, term12799.getClass(), "type", 0);
        setField(term12799, term12799.getClass(), "next", null);
        setField(term12799, term12799.getClass(), "first", null);
        setField(term12799, term12799.getClass(), "last", null);
        setField(term12799, term12799.getClass(), "propListHead", null);
        setIntField(term12799, term12799.getClass(), "sourcePosition", 0);
        setField(term12799, term12799.getClass(), "jsType", null);
        setField(term12799, term12799.getClass(), "parent", null);
        setField(term12798, term12798.getClass(), "parent", term12799);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term12028;
        callMethod(klass, "process", argTypes, term11878, args);
        assertTrue(recursiveEquals(term11878, term12796));
        assertTrue(recursiveEquals(term12028, null));
    }

};


