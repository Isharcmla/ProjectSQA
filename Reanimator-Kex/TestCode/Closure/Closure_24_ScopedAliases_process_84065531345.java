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

public class ScopedAliases_process_84065531345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54735;
     Object term54885;
     Object term55159;
     Object term55161;

    public ScopedAliases_process_84065531345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54735 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term54815 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term54735, term54735.getClass(), "compiler", term54815);
        term54885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term54885, term54885.getClass(), "type", 105);
        setField(term54885, term54885.getClass(), "parent", null);
        term55159 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term55160 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term55160, term55160.getClass(), "options", null);
        setField(term55160, term55160.getClass(), "passes", null);
        setField(term55160, term55160.getClass(), "externs", null);
        setField(term55160, term55160.getClass(), "modules", null);
        setField(term55160, term55160.getClass(), "moduleGraph", null);
        setField(term55160, term55160.getClass(), "inputs", null);
        setField(term55160, term55160.getClass(), "errorManager", null);
        setField(term55160, term55160.getClass(), "warningsGuard", null);
        setField(term55160, term55160.getClass(), "injectedLibraries", null);
        setField(term55160, term55160.getClass(), "externsRoot", null);
        setField(term55160, term55160.getClass(), "jsRoot", null);
        setField(term55160, term55160.getClass(), "externAndJsRoot", null);
        setField(term55160, term55160.getClass(), "inputsById", null);
        setField(term55160, term55160.getClass(), "sourceMap", null);
        setField(term55160, term55160.getClass(), "externExports", null);
        setIntField(term55160, term55160.getClass(), "uniqueNameId", 0);
        setBooleanField(term55160, term55160.getClass(), "useThreads", false);
        setBooleanField(term55160, term55160.getClass(), "hasRegExpGlobalReferences", false);
        setField(term55160, term55160.getClass(), "functionInformationMap", null);
        setField(term55160, term55160.getClass(), "debugLog", null);
        setField(term55160, term55160.getClass(), "defaultCodingConvention", null);
        setField(term55160, term55160.getClass(), "typeRegistry", null);
        setField(term55160, term55160.getClass(), "parserConfig", null);
        setField(term55160, term55160.getClass(), "abstractInterpreter", null);
        setField(term55160, term55160.getClass(), "typeValidator", null);
        setField(term55160, term55160.getClass(), "tracker", null);
        setField(term55160, term55160.getClass(), "oldErrorReporter", null);
        setField(term55160, term55160.getClass(), "defaultErrorReporter", null);
        setField(term55160, term55160.getClass(), "outStream", null);
        setField(term55160, term55160.getClass(), "globalRefMap", null);
        setDoubleField(term55160, term55160.getClass(), "progress", 0.0);
        setField(term55160, term55160.getClass(), "sanityCheck", null);
        setField(term55160, term55160.getClass(), "currentTracer", null);
        setField(term55160, term55160.getClass(), "currentPassName", null);
        setIntField(term55160, term55160.getClass(), "syntheticCodeId", 0);
        setField(term55160, term55160.getClass(), "recentChange", null);
        setField(term55160, term55160.getClass(), "codeChangeHandlers", null);
        setField(term55160, term55160.getClass(), "synthesizedExternsInput", null);
        setField(term55160, term55160.getClass(), "stage", null);
        setField(term55159, term55159.getClass(), "compiler", term55160);
        setField(term55159, term55159.getClass(), "preprocessorSymbolTable", null);
        setField(term55159, term55159.getClass(), "transformationHandler", null);
        term55161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term55161, term55161.getClass(), "type", 105);
        setField(term55161, term55161.getClass(), "next", null);
        setField(term55161, term55161.getClass(), "first", null);
        setField(term55161, term55161.getClass(), "last", null);
        setField(term55161, term55161.getClass(), "propListHead", null);
        setIntField(term55161, term55161.getClass(), "sourcePosition", 0);
        setField(term55161, term55161.getClass(), "jsType", null);
        setField(term55161, term55161.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term54885;
        callMethod(klass, "process", argTypes, term54735, args);
        assertTrue(recursiveEquals(term54735, term55159));
        assertTrue(recursiveEquals(term54885, null));
    }

};


