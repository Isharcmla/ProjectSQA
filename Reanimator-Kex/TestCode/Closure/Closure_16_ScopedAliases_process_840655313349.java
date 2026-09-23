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

public class ScopedAliases_process_840655313349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237254;
     Object term237404;
     Object term238282;
     Object term238284;

    public ScopedAliases_process_840655313349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237254 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term237334 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term237254, term237254.getClass(), "compiler", term237334);
        term237404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term237496 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term237588 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term237680 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term237404, term237404.getClass(), "type", 0);
        setIntField(term237496, term237496.getClass(), "type", 0);
        setField(term237496, term237496.getClass(), "parent", null);
        setField(term237404, term237404.getClass(), "parent", term237496);
        setField(term237588, term237588.getClass(), "next", null);
        setIntField(term237588, term237588.getClass(), "type", 0);
        setField(term237680, term237680.getClass(), "next", null);
        setIntField(term237680, term237680.getClass(), "type", 0);
        setField(term237680, term237680.getClass(), "first", null);
        setField(term237588, term237588.getClass(), "first", term237680);
        setField(term237404, term237404.getClass(), "first", term237588);
        term238282 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term238283 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term238283, term238283.getClass(), "options", null);
        setField(term238283, term238283.getClass(), "passes", null);
        setField(term238283, term238283.getClass(), "externs", null);
        setField(term238283, term238283.getClass(), "modules", null);
        setField(term238283, term238283.getClass(), "moduleGraph", null);
        setField(term238283, term238283.getClass(), "inputs", null);
        setField(term238283, term238283.getClass(), "errorManager", null);
        setField(term238283, term238283.getClass(), "warningsGuard", null);
        setField(term238283, term238283.getClass(), "injectedLibraries", null);
        setField(term238283, term238283.getClass(), "externsRoot", null);
        setField(term238283, term238283.getClass(), "jsRoot", null);
        setField(term238283, term238283.getClass(), "externAndJsRoot", null);
        setField(term238283, term238283.getClass(), "inputsById", null);
        setField(term238283, term238283.getClass(), "sourceMap", null);
        setField(term238283, term238283.getClass(), "externExports", null);
        setIntField(term238283, term238283.getClass(), "uniqueNameId", 0);
        setBooleanField(term238283, term238283.getClass(), "useThreads", false);
        setBooleanField(term238283, term238283.getClass(), "hasRegExpGlobalReferences", false);
        setField(term238283, term238283.getClass(), "functionInformationMap", null);
        setField(term238283, term238283.getClass(), "debugLog", null);
        setField(term238283, term238283.getClass(), "defaultCodingConvention", null);
        setField(term238283, term238283.getClass(), "typeRegistry", null);
        setField(term238283, term238283.getClass(), "parserConfig", null);
        setField(term238283, term238283.getClass(), "abstractInterpreter", null);
        setField(term238283, term238283.getClass(), "typeValidator", null);
        setField(term238283, term238283.getClass(), "tracker", null);
        setField(term238283, term238283.getClass(), "oldErrorReporter", null);
        setField(term238283, term238283.getClass(), "defaultErrorReporter", null);
        setField(term238283, term238283.getClass(), "outStream", null);
        setField(term238283, term238283.getClass(), "globalRefMap", null);
        setDoubleField(term238283, term238283.getClass(), "progress", 0.0);
        setField(term238283, term238283.getClass(), "sanityCheck", null);
        setField(term238283, term238283.getClass(), "currentTracer", null);
        setField(term238283, term238283.getClass(), "currentPassName", null);
        setIntField(term238283, term238283.getClass(), "syntheticCodeId", 0);
        setField(term238283, term238283.getClass(), "recentChange", null);
        setField(term238283, term238283.getClass(), "codeChangeHandlers", null);
        setField(term238283, term238283.getClass(), "synthesizedExternsInput", null);
        setField(term238283, term238283.getClass(), "stage", null);
        setField(term238282, term238282.getClass(), "compiler", term238283);
        setField(term238282, term238282.getClass(), "preprocessorSymbolTable", null);
        setField(term238282, term238282.getClass(), "transformationHandler", null);
        term238284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term238285 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term238286 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term238287 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term238284, term238284.getClass(), "type", 0);
        setField(term238284, term238284.getClass(), "next", null);
        setField(term238285, term238285.getClass(), "str", null);
        setIntField(term238285, term238285.getClass(), "type", 0);
        setField(term238285, term238285.getClass(), "next", null);
        setField(term238286, term238286.getClass(), "str", null);
        setIntField(term238286, term238286.getClass(), "type", 0);
        setField(term238286, term238286.getClass(), "next", null);
        setField(term238286, term238286.getClass(), "first", null);
        setField(term238286, term238286.getClass(), "last", null);
        setField(term238286, term238286.getClass(), "propListHead", null);
        setIntField(term238286, term238286.getClass(), "sourcePosition", 0);
        setField(term238286, term238286.getClass(), "jsType", null);
        setField(term238286, term238286.getClass(), "parent", null);
        setField(term238285, term238285.getClass(), "first", term238286);
        setField(term238285, term238285.getClass(), "last", null);
        setField(term238285, term238285.getClass(), "propListHead", null);
        setIntField(term238285, term238285.getClass(), "sourcePosition", 0);
        setField(term238285, term238285.getClass(), "jsType", null);
        setField(term238285, term238285.getClass(), "parent", null);
        setField(term238284, term238284.getClass(), "first", term238285);
        setField(term238284, term238284.getClass(), "last", null);
        setField(term238284, term238284.getClass(), "propListHead", null);
        setIntField(term238284, term238284.getClass(), "sourcePosition", 0);
        setField(term238284, term238284.getClass(), "jsType", null);
        setField(term238287, term238287.getClass(), "str", null);
        setIntField(term238287, term238287.getClass(), "type", 0);
        setField(term238287, term238287.getClass(), "next", null);
        setField(term238287, term238287.getClass(), "first", null);
        setField(term238287, term238287.getClass(), "last", null);
        setField(term238287, term238287.getClass(), "propListHead", null);
        setIntField(term238287, term238287.getClass(), "sourcePosition", 0);
        setField(term238287, term238287.getClass(), "jsType", null);
        setField(term238287, term238287.getClass(), "parent", null);
        setField(term238284, term238284.getClass(), "parent", term238287);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term237404;
        callMethod(klass, "process", argTypes, term237254, args);
        assertTrue(recursiveEquals(term237254, term238282));
        assertTrue(recursiveEquals(term237404, null));
    }

};


