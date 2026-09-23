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

public class ScopedAliases_process_840655313200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121266;
     Object term121416;
     Object term122595;
     Object term122597;

    public ScopedAliases_process_840655313200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121266 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term121346 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term121266, term121266.getClass(), "compiler", term121346);
        term121416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121556 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term121416, term121416.getClass(), "type", 0);
        setIntField(term121486, term121486.getClass(), "type", 0);
        setField(term121486, term121486.getClass(), "parent", null);
        setField(term121416, term121416.getClass(), "parent", term121486);
        setField(term121556, term121556.getClass(), "next", null);
        setIntField(term121556, term121556.getClass(), "type", 0);
        setField(term121556, term121556.getClass(), "first", term121626);
        setField(term121416, term121416.getClass(), "first", term121556);
        term122595 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term122596 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term122596, term122596.getClass(), "options", null);
        setField(term122596, term122596.getClass(), "passes", null);
        setField(term122596, term122596.getClass(), "externs", null);
        setField(term122596, term122596.getClass(), "modules", null);
        setField(term122596, term122596.getClass(), "moduleGraph", null);
        setField(term122596, term122596.getClass(), "inputs", null);
        setField(term122596, term122596.getClass(), "errorManager", null);
        setField(term122596, term122596.getClass(), "warningsGuard", null);
        setField(term122596, term122596.getClass(), "injectedLibraries", null);
        setField(term122596, term122596.getClass(), "externsRoot", null);
        setField(term122596, term122596.getClass(), "jsRoot", null);
        setField(term122596, term122596.getClass(), "externAndJsRoot", null);
        setField(term122596, term122596.getClass(), "inputsById", null);
        setField(term122596, term122596.getClass(), "sourceMap", null);
        setField(term122596, term122596.getClass(), "externExports", null);
        setIntField(term122596, term122596.getClass(), "uniqueNameId", 0);
        setBooleanField(term122596, term122596.getClass(), "useThreads", false);
        setBooleanField(term122596, term122596.getClass(), "hasRegExpGlobalReferences", false);
        setField(term122596, term122596.getClass(), "functionInformationMap", null);
        setField(term122596, term122596.getClass(), "debugLog", null);
        setField(term122596, term122596.getClass(), "defaultCodingConvention", null);
        setField(term122596, term122596.getClass(), "typeRegistry", null);
        setField(term122596, term122596.getClass(), "parserConfig", null);
        setField(term122596, term122596.getClass(), "abstractInterpreter", null);
        setField(term122596, term122596.getClass(), "typeValidator", null);
        setField(term122596, term122596.getClass(), "tracker", null);
        setField(term122596, term122596.getClass(), "oldErrorReporter", null);
        setField(term122596, term122596.getClass(), "defaultErrorReporter", null);
        setField(term122596, term122596.getClass(), "outStream", null);
        setField(term122596, term122596.getClass(), "globalRefMap", null);
        setDoubleField(term122596, term122596.getClass(), "progress", 0.0);
        setField(term122596, term122596.getClass(), "sanityCheck", null);
        setField(term122596, term122596.getClass(), "currentTracer", null);
        setField(term122596, term122596.getClass(), "currentPassName", null);
        setIntField(term122596, term122596.getClass(), "syntheticCodeId", 0);
        setField(term122596, term122596.getClass(), "recentChange", null);
        setField(term122596, term122596.getClass(), "codeChangeHandlers", null);
        setField(term122596, term122596.getClass(), "synthesizedExternsInput", null);
        setField(term122596, term122596.getClass(), "stage", null);
        setField(term122595, term122595.getClass(), "compiler", term122596);
        setField(term122595, term122595.getClass(), "preprocessorSymbolTable", null);
        setField(term122595, term122595.getClass(), "transformationHandler", null);
        term122597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term122597, term122597.getClass(), "type", 0);
        setField(term122597, term122597.getClass(), "next", null);
        setIntField(term122598, term122598.getClass(), "type", 0);
        setField(term122598, term122598.getClass(), "next", null);
        setIntField(term122599, term122599.getClass(), "type", 0);
        setField(term122599, term122599.getClass(), "next", null);
        setField(term122599, term122599.getClass(), "first", null);
        setField(term122599, term122599.getClass(), "last", null);
        setField(term122599, term122599.getClass(), "propListHead", null);
        setIntField(term122599, term122599.getClass(), "sourcePosition", 0);
        setField(term122599, term122599.getClass(), "jsType", null);
        setField(term122599, term122599.getClass(), "parent", null);
        setField(term122598, term122598.getClass(), "first", term122599);
        setField(term122598, term122598.getClass(), "last", null);
        setField(term122598, term122598.getClass(), "propListHead", null);
        setIntField(term122598, term122598.getClass(), "sourcePosition", 0);
        setField(term122598, term122598.getClass(), "jsType", null);
        setField(term122598, term122598.getClass(), "parent", null);
        setField(term122597, term122597.getClass(), "first", term122598);
        setField(term122597, term122597.getClass(), "last", null);
        setField(term122597, term122597.getClass(), "propListHead", null);
        setIntField(term122597, term122597.getClass(), "sourcePosition", 0);
        setField(term122597, term122597.getClass(), "jsType", null);
        setIntField(term122600, term122600.getClass(), "type", 0);
        setField(term122600, term122600.getClass(), "next", null);
        setField(term122600, term122600.getClass(), "first", null);
        setField(term122600, term122600.getClass(), "last", null);
        setField(term122600, term122600.getClass(), "propListHead", null);
        setIntField(term122600, term122600.getClass(), "sourcePosition", 0);
        setField(term122600, term122600.getClass(), "jsType", null);
        setField(term122600, term122600.getClass(), "parent", null);
        setField(term122597, term122597.getClass(), "parent", term122600);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term121416;
        callMethod(klass, "process", argTypes, term121266, args);
        assertTrue(recursiveEquals(term121266, term122595));
        assertTrue(recursiveEquals(term121416, null));
    }

};


