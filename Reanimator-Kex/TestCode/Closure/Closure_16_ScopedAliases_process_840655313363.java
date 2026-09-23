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

public class ScopedAliases_process_840655313363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248882;
     Object term249032;
     Object term249587;
     Object term249589;

    public ScopedAliases_process_840655313363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term248882 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term248962 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term248882, term248882.getClass(), "compiler", term248962);
        term249032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term249102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term249172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term249032, term249032.getClass(), "type", 0);
        setIntField(term249102, term249102.getClass(), "type", 0);
        setIntField(term249172, term249172.getClass(), "type", 0);
        setField(term249172, term249172.getClass(), "parent", null);
        setField(term249102, term249102.getClass(), "parent", term249172);
        setField(term249032, term249032.getClass(), "parent", term249102);
        setField(term249032, term249032.getClass(), "first", null);
        term249587 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term249588 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term249588, term249588.getClass(), "options", null);
        setField(term249588, term249588.getClass(), "passes", null);
        setField(term249588, term249588.getClass(), "externs", null);
        setField(term249588, term249588.getClass(), "modules", null);
        setField(term249588, term249588.getClass(), "moduleGraph", null);
        setField(term249588, term249588.getClass(), "inputs", null);
        setField(term249588, term249588.getClass(), "errorManager", null);
        setField(term249588, term249588.getClass(), "warningsGuard", null);
        setField(term249588, term249588.getClass(), "injectedLibraries", null);
        setField(term249588, term249588.getClass(), "externsRoot", null);
        setField(term249588, term249588.getClass(), "jsRoot", null);
        setField(term249588, term249588.getClass(), "externAndJsRoot", null);
        setField(term249588, term249588.getClass(), "inputsById", null);
        setField(term249588, term249588.getClass(), "sourceMap", null);
        setField(term249588, term249588.getClass(), "externExports", null);
        setIntField(term249588, term249588.getClass(), "uniqueNameId", 0);
        setBooleanField(term249588, term249588.getClass(), "useThreads", false);
        setBooleanField(term249588, term249588.getClass(), "hasRegExpGlobalReferences", false);
        setField(term249588, term249588.getClass(), "functionInformationMap", null);
        setField(term249588, term249588.getClass(), "debugLog", null);
        setField(term249588, term249588.getClass(), "defaultCodingConvention", null);
        setField(term249588, term249588.getClass(), "typeRegistry", null);
        setField(term249588, term249588.getClass(), "parserConfig", null);
        setField(term249588, term249588.getClass(), "abstractInterpreter", null);
        setField(term249588, term249588.getClass(), "typeValidator", null);
        setField(term249588, term249588.getClass(), "tracker", null);
        setField(term249588, term249588.getClass(), "oldErrorReporter", null);
        setField(term249588, term249588.getClass(), "defaultErrorReporter", null);
        setField(term249588, term249588.getClass(), "outStream", null);
        setField(term249588, term249588.getClass(), "globalRefMap", null);
        setDoubleField(term249588, term249588.getClass(), "progress", 0.0);
        setField(term249588, term249588.getClass(), "sanityCheck", null);
        setField(term249588, term249588.getClass(), "currentTracer", null);
        setField(term249588, term249588.getClass(), "currentPassName", null);
        setIntField(term249588, term249588.getClass(), "syntheticCodeId", 0);
        setField(term249588, term249588.getClass(), "recentChange", null);
        setField(term249588, term249588.getClass(), "codeChangeHandlers", null);
        setField(term249588, term249588.getClass(), "synthesizedExternsInput", null);
        setField(term249588, term249588.getClass(), "stage", null);
        setField(term249587, term249587.getClass(), "compiler", term249588);
        setField(term249587, term249587.getClass(), "preprocessorSymbolTable", null);
        setField(term249587, term249587.getClass(), "transformationHandler", null);
        term249589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term249590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term249591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term249589, term249589.getClass(), "type", 0);
        setField(term249589, term249589.getClass(), "next", null);
        setField(term249589, term249589.getClass(), "first", null);
        setField(term249589, term249589.getClass(), "last", null);
        setField(term249589, term249589.getClass(), "propListHead", null);
        setIntField(term249589, term249589.getClass(), "sourcePosition", 0);
        setField(term249589, term249589.getClass(), "jsType", null);
        setIntField(term249590, term249590.getClass(), "type", 0);
        setField(term249590, term249590.getClass(), "next", null);
        setField(term249590, term249590.getClass(), "first", null);
        setField(term249590, term249590.getClass(), "last", null);
        setField(term249590, term249590.getClass(), "propListHead", null);
        setIntField(term249590, term249590.getClass(), "sourcePosition", 0);
        setField(term249590, term249590.getClass(), "jsType", null);
        setIntField(term249591, term249591.getClass(), "type", 0);
        setField(term249591, term249591.getClass(), "next", null);
        setField(term249591, term249591.getClass(), "first", null);
        setField(term249591, term249591.getClass(), "last", null);
        setField(term249591, term249591.getClass(), "propListHead", null);
        setIntField(term249591, term249591.getClass(), "sourcePosition", 0);
        setField(term249591, term249591.getClass(), "jsType", null);
        setField(term249591, term249591.getClass(), "parent", null);
        setField(term249590, term249590.getClass(), "parent", term249591);
        setField(term249589, term249589.getClass(), "parent", term249590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term249032;
        callMethod(klass, "process", argTypes, term248882, args);
        assertTrue(recursiveEquals(term248882, term249587));
        assertTrue(recursiveEquals(term249032, null));
    }

};


