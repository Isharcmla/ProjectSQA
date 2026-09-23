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

public class ScopedAliases_process_84065531333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18155;
     Object term18305;
     Object term19115;
     Object term19117;

    public ScopedAliases_process_84065531333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18155 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term18235 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term18155, term18155.getClass(), "compiler", term18235);
        term18305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18305, term18305.getClass(), "type", 0);
        setField(term18305, term18305.getClass(), "parent", null);
        setField(term18375, term18375.getClass(), "next", null);
        setIntField(term18375, term18375.getClass(), "type", 0);
        setField(term18515, term18515.getClass(), "next", null);
        setIntField(term18515, term18515.getClass(), "type", 0);
        setField(term18515, term18515.getClass(), "first", null);
        setField(term18445, term18445.getClass(), "next", term18515);
        setIntField(term18445, term18445.getClass(), "type", 105);
        setField(term18375, term18375.getClass(), "first", term18445);
        setField(term18305, term18305.getClass(), "first", term18375);
        term19115 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term19116 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term19116, term19116.getClass(), "options", null);
        setField(term19116, term19116.getClass(), "passes", null);
        setField(term19116, term19116.getClass(), "externs", null);
        setField(term19116, term19116.getClass(), "modules", null);
        setField(term19116, term19116.getClass(), "moduleGraph", null);
        setField(term19116, term19116.getClass(), "inputs", null);
        setField(term19116, term19116.getClass(), "errorManager", null);
        setField(term19116, term19116.getClass(), "warningsGuard", null);
        setField(term19116, term19116.getClass(), "injectedLibraries", null);
        setField(term19116, term19116.getClass(), "externsRoot", null);
        setField(term19116, term19116.getClass(), "jsRoot", null);
        setField(term19116, term19116.getClass(), "externAndJsRoot", null);
        setField(term19116, term19116.getClass(), "inputsById", null);
        setField(term19116, term19116.getClass(), "sourceMap", null);
        setField(term19116, term19116.getClass(), "externExports", null);
        setIntField(term19116, term19116.getClass(), "uniqueNameId", 0);
        setBooleanField(term19116, term19116.getClass(), "useThreads", false);
        setBooleanField(term19116, term19116.getClass(), "hasRegExpGlobalReferences", false);
        setField(term19116, term19116.getClass(), "functionInformationMap", null);
        setField(term19116, term19116.getClass(), "debugLog", null);
        setField(term19116, term19116.getClass(), "defaultCodingConvention", null);
        setField(term19116, term19116.getClass(), "typeRegistry", null);
        setField(term19116, term19116.getClass(), "parserConfig", null);
        setField(term19116, term19116.getClass(), "abstractInterpreter", null);
        setField(term19116, term19116.getClass(), "typeValidator", null);
        setField(term19116, term19116.getClass(), "tracker", null);
        setField(term19116, term19116.getClass(), "oldErrorReporter", null);
        setField(term19116, term19116.getClass(), "defaultErrorReporter", null);
        setField(term19116, term19116.getClass(), "outStream", null);
        setField(term19116, term19116.getClass(), "globalRefMap", null);
        setDoubleField(term19116, term19116.getClass(), "progress", 0.0);
        setField(term19116, term19116.getClass(), "sanityCheck", null);
        setField(term19116, term19116.getClass(), "currentTracer", null);
        setField(term19116, term19116.getClass(), "currentPassName", null);
        setIntField(term19116, term19116.getClass(), "syntheticCodeId", 0);
        setField(term19116, term19116.getClass(), "recentChange", null);
        setField(term19116, term19116.getClass(), "codeChangeHandlers", null);
        setField(term19116, term19116.getClass(), "synthesizedExternsInput", null);
        setField(term19116, term19116.getClass(), "stage", null);
        setField(term19115, term19115.getClass(), "compiler", term19116);
        setField(term19115, term19115.getClass(), "preprocessorSymbolTable", null);
        setField(term19115, term19115.getClass(), "transformationHandler", null);
        term19117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19117, term19117.getClass(), "type", 0);
        setField(term19117, term19117.getClass(), "next", null);
        setIntField(term19118, term19118.getClass(), "type", 0);
        setField(term19118, term19118.getClass(), "next", null);
        setIntField(term19119, term19119.getClass(), "type", 105);
        setIntField(term19120, term19120.getClass(), "type", 0);
        setField(term19120, term19120.getClass(), "next", null);
        setField(term19120, term19120.getClass(), "first", null);
        setField(term19120, term19120.getClass(), "last", null);
        setField(term19120, term19120.getClass(), "propListHead", null);
        setIntField(term19120, term19120.getClass(), "sourcePosition", 0);
        setField(term19120, term19120.getClass(), "jsType", null);
        setField(term19120, term19120.getClass(), "parent", null);
        setField(term19119, term19119.getClass(), "next", term19120);
        setField(term19119, term19119.getClass(), "first", null);
        setField(term19119, term19119.getClass(), "last", null);
        setField(term19119, term19119.getClass(), "propListHead", null);
        setIntField(term19119, term19119.getClass(), "sourcePosition", 0);
        setField(term19119, term19119.getClass(), "jsType", null);
        setField(term19119, term19119.getClass(), "parent", null);
        setField(term19118, term19118.getClass(), "first", term19119);
        setField(term19118, term19118.getClass(), "last", null);
        setField(term19118, term19118.getClass(), "propListHead", null);
        setIntField(term19118, term19118.getClass(), "sourcePosition", 0);
        setField(term19118, term19118.getClass(), "jsType", null);
        setField(term19118, term19118.getClass(), "parent", null);
        setField(term19117, term19117.getClass(), "first", term19118);
        setField(term19117, term19117.getClass(), "last", null);
        setField(term19117, term19117.getClass(), "propListHead", null);
        setIntField(term19117, term19117.getClass(), "sourcePosition", 0);
        setField(term19117, term19117.getClass(), "jsType", null);
        setField(term19117, term19117.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term18305;
        callMethod(klass, "process", argTypes, term18155, args);
        assertTrue(recursiveEquals(term18155, term19115));
        assertTrue(recursiveEquals(term18305, null));
    }

};


