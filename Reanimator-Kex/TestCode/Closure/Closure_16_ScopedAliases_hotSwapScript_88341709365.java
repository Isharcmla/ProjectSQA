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

public class ScopedAliases_hotSwapScript_88341709365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250162;
     Object term250312;
     Object term251390;
     Object term251392;

    public ScopedAliases_hotSwapScript_88341709365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250162 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term250242 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term250162, term250162.getClass(), "compiler", term250242);
        term250312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term250382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term250452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term250522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term250592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term250312, term250312.getClass(), "type", 0);
        setField(term250312, term250312.getClass(), "parent", null);
        setField(term250522, term250522.getClass(), "next", null);
        setIntField(term250522, term250522.getClass(), "type", 0);
        setField(term250522, term250522.getClass(), "first", null);
        setField(term250452, term250452.getClass(), "next", term250522);
        setIntField(term250452, term250452.getClass(), "type", 0);
        setField(term250452, term250452.getClass(), "first", null);
        setField(term250382, term250382.getClass(), "next", term250452);
        setIntField(term250382, term250382.getClass(), "type", 0);
        setField(term250592, term250592.getClass(), "next", null);
        setIntField(term250592, term250592.getClass(), "type", 0);
        setField(term250592, term250592.getClass(), "first", null);
        setField(term250382, term250382.getClass(), "first", term250592);
        setField(term250312, term250312.getClass(), "first", term250382);
        term251390 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term251391 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term251391, term251391.getClass(), "options", null);
        setField(term251391, term251391.getClass(), "passes", null);
        setField(term251391, term251391.getClass(), "externs", null);
        setField(term251391, term251391.getClass(), "modules", null);
        setField(term251391, term251391.getClass(), "moduleGraph", null);
        setField(term251391, term251391.getClass(), "inputs", null);
        setField(term251391, term251391.getClass(), "errorManager", null);
        setField(term251391, term251391.getClass(), "warningsGuard", null);
        setField(term251391, term251391.getClass(), "injectedLibraries", null);
        setField(term251391, term251391.getClass(), "externsRoot", null);
        setField(term251391, term251391.getClass(), "jsRoot", null);
        setField(term251391, term251391.getClass(), "externAndJsRoot", null);
        setField(term251391, term251391.getClass(), "inputsById", null);
        setField(term251391, term251391.getClass(), "sourceMap", null);
        setField(term251391, term251391.getClass(), "externExports", null);
        setIntField(term251391, term251391.getClass(), "uniqueNameId", 0);
        setBooleanField(term251391, term251391.getClass(), "useThreads", false);
        setBooleanField(term251391, term251391.getClass(), "hasRegExpGlobalReferences", false);
        setField(term251391, term251391.getClass(), "functionInformationMap", null);
        setField(term251391, term251391.getClass(), "debugLog", null);
        setField(term251391, term251391.getClass(), "defaultCodingConvention", null);
        setField(term251391, term251391.getClass(), "typeRegistry", null);
        setField(term251391, term251391.getClass(), "parserConfig", null);
        setField(term251391, term251391.getClass(), "abstractInterpreter", null);
        setField(term251391, term251391.getClass(), "typeValidator", null);
        setField(term251391, term251391.getClass(), "tracker", null);
        setField(term251391, term251391.getClass(), "oldErrorReporter", null);
        setField(term251391, term251391.getClass(), "defaultErrorReporter", null);
        setField(term251391, term251391.getClass(), "outStream", null);
        setField(term251391, term251391.getClass(), "globalRefMap", null);
        setDoubleField(term251391, term251391.getClass(), "progress", 0.0);
        setField(term251391, term251391.getClass(), "sanityCheck", null);
        setField(term251391, term251391.getClass(), "currentTracer", null);
        setField(term251391, term251391.getClass(), "currentPassName", null);
        setIntField(term251391, term251391.getClass(), "syntheticCodeId", 0);
        setField(term251391, term251391.getClass(), "recentChange", null);
        setField(term251391, term251391.getClass(), "codeChangeHandlers", null);
        setField(term251391, term251391.getClass(), "synthesizedExternsInput", null);
        setField(term251391, term251391.getClass(), "stage", null);
        setField(term251390, term251390.getClass(), "compiler", term251391);
        setField(term251390, term251390.getClass(), "preprocessorSymbolTable", null);
        setField(term251390, term251390.getClass(), "transformationHandler", null);
        term251392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term251393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term251394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term251395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term251396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term251392, term251392.getClass(), "type", 0);
        setField(term251392, term251392.getClass(), "next", null);
        setIntField(term251393, term251393.getClass(), "type", 0);
        setIntField(term251394, term251394.getClass(), "type", 0);
        setIntField(term251395, term251395.getClass(), "type", 0);
        setField(term251395, term251395.getClass(), "next", null);
        setField(term251395, term251395.getClass(), "first", null);
        setField(term251395, term251395.getClass(), "last", null);
        setField(term251395, term251395.getClass(), "propListHead", null);
        setIntField(term251395, term251395.getClass(), "sourcePosition", 0);
        setField(term251395, term251395.getClass(), "jsType", null);
        setField(term251395, term251395.getClass(), "parent", null);
        setField(term251394, term251394.getClass(), "next", term251395);
        setField(term251394, term251394.getClass(), "first", null);
        setField(term251394, term251394.getClass(), "last", null);
        setField(term251394, term251394.getClass(), "propListHead", null);
        setIntField(term251394, term251394.getClass(), "sourcePosition", 0);
        setField(term251394, term251394.getClass(), "jsType", null);
        setField(term251394, term251394.getClass(), "parent", null);
        setField(term251393, term251393.getClass(), "next", term251394);
        setIntField(term251396, term251396.getClass(), "type", 0);
        setField(term251396, term251396.getClass(), "next", null);
        setField(term251396, term251396.getClass(), "first", null);
        setField(term251396, term251396.getClass(), "last", null);
        setField(term251396, term251396.getClass(), "propListHead", null);
        setIntField(term251396, term251396.getClass(), "sourcePosition", 0);
        setField(term251396, term251396.getClass(), "jsType", null);
        setField(term251396, term251396.getClass(), "parent", null);
        setField(term251393, term251393.getClass(), "first", term251396);
        setField(term251393, term251393.getClass(), "last", null);
        setField(term251393, term251393.getClass(), "propListHead", null);
        setIntField(term251393, term251393.getClass(), "sourcePosition", 0);
        setField(term251393, term251393.getClass(), "jsType", null);
        setField(term251393, term251393.getClass(), "parent", null);
        setField(term251392, term251392.getClass(), "first", term251393);
        setField(term251392, term251392.getClass(), "last", null);
        setField(term251392, term251392.getClass(), "propListHead", null);
        setIntField(term251392, term251392.getClass(), "sourcePosition", 0);
        setField(term251392, term251392.getClass(), "jsType", null);
        setField(term251392, term251392.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term250312;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term250162, args);
        assertTrue(recursiveEquals(term250162, term251390));
        assertTrue(recursiveEquals(term250312, term251392));
    }

};


