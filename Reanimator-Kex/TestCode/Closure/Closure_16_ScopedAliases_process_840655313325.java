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

public class ScopedAliases_process_840655313325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216514;
     Object term216664;
     Object term217661;
     Object term217663;

    public ScopedAliases_process_840655313325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216514 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term216594 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term216514, term216514.getClass(), "compiler", term216594);
        term216664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term216734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term216804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term216664, term216664.getClass(), "type", 0);
        setIntField(term216734, term216734.getClass(), "type", 0);
        setIntField(term216804, term216804.getClass(), "type", 0);
        setField(term216804, term216804.getClass(), "parent", null);
        setField(term216734, term216734.getClass(), "parent", term216804);
        setField(term216664, term216664.getClass(), "parent", term216734);
        setField(term216664, term216664.getClass(), "first", null);
        term217661 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term217662 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term217662, term217662.getClass(), "options", null);
        setField(term217662, term217662.getClass(), "passes", null);
        setField(term217662, term217662.getClass(), "externs", null);
        setField(term217662, term217662.getClass(), "modules", null);
        setField(term217662, term217662.getClass(), "moduleGraph", null);
        setField(term217662, term217662.getClass(), "inputs", null);
        setField(term217662, term217662.getClass(), "errorManager", null);
        setField(term217662, term217662.getClass(), "warningsGuard", null);
        setField(term217662, term217662.getClass(), "injectedLibraries", null);
        setField(term217662, term217662.getClass(), "externsRoot", null);
        setField(term217662, term217662.getClass(), "jsRoot", null);
        setField(term217662, term217662.getClass(), "externAndJsRoot", null);
        setField(term217662, term217662.getClass(), "inputsById", null);
        setField(term217662, term217662.getClass(), "sourceMap", null);
        setField(term217662, term217662.getClass(), "externExports", null);
        setIntField(term217662, term217662.getClass(), "uniqueNameId", 0);
        setBooleanField(term217662, term217662.getClass(), "useThreads", false);
        setBooleanField(term217662, term217662.getClass(), "hasRegExpGlobalReferences", false);
        setField(term217662, term217662.getClass(), "functionInformationMap", null);
        setField(term217662, term217662.getClass(), "debugLog", null);
        setField(term217662, term217662.getClass(), "defaultCodingConvention", null);
        setField(term217662, term217662.getClass(), "typeRegistry", null);
        setField(term217662, term217662.getClass(), "parserConfig", null);
        setField(term217662, term217662.getClass(), "abstractInterpreter", null);
        setField(term217662, term217662.getClass(), "typeValidator", null);
        setField(term217662, term217662.getClass(), "tracker", null);
        setField(term217662, term217662.getClass(), "oldErrorReporter", null);
        setField(term217662, term217662.getClass(), "defaultErrorReporter", null);
        setField(term217662, term217662.getClass(), "outStream", null);
        setField(term217662, term217662.getClass(), "globalRefMap", null);
        setDoubleField(term217662, term217662.getClass(), "progress", 0.0);
        setField(term217662, term217662.getClass(), "sanityCheck", null);
        setField(term217662, term217662.getClass(), "currentTracer", null);
        setField(term217662, term217662.getClass(), "currentPassName", null);
        setIntField(term217662, term217662.getClass(), "syntheticCodeId", 0);
        setField(term217662, term217662.getClass(), "recentChange", null);
        setField(term217662, term217662.getClass(), "codeChangeHandlers", null);
        setField(term217662, term217662.getClass(), "synthesizedExternsInput", null);
        setField(term217662, term217662.getClass(), "stage", null);
        setField(term217661, term217661.getClass(), "compiler", term217662);
        setField(term217661, term217661.getClass(), "preprocessorSymbolTable", null);
        setField(term217661, term217661.getClass(), "transformationHandler", null);
        term217663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term217664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term217665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term217663, term217663.getClass(), "type", 0);
        setField(term217663, term217663.getClass(), "next", null);
        setField(term217663, term217663.getClass(), "first", null);
        setField(term217663, term217663.getClass(), "last", null);
        setField(term217663, term217663.getClass(), "propListHead", null);
        setIntField(term217663, term217663.getClass(), "sourcePosition", 0);
        setField(term217663, term217663.getClass(), "jsType", null);
        setIntField(term217664, term217664.getClass(), "type", 0);
        setField(term217664, term217664.getClass(), "next", null);
        setField(term217664, term217664.getClass(), "first", null);
        setField(term217664, term217664.getClass(), "last", null);
        setField(term217664, term217664.getClass(), "propListHead", null);
        setIntField(term217664, term217664.getClass(), "sourcePosition", 0);
        setField(term217664, term217664.getClass(), "jsType", null);
        setIntField(term217665, term217665.getClass(), "type", 0);
        setField(term217665, term217665.getClass(), "next", null);
        setField(term217665, term217665.getClass(), "first", null);
        setField(term217665, term217665.getClass(), "last", null);
        setField(term217665, term217665.getClass(), "propListHead", null);
        setIntField(term217665, term217665.getClass(), "sourcePosition", 0);
        setField(term217665, term217665.getClass(), "jsType", null);
        setField(term217665, term217665.getClass(), "parent", null);
        setField(term217664, term217664.getClass(), "parent", term217665);
        setField(term217663, term217663.getClass(), "parent", term217664);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term216664;
        callMethod(klass, "process", argTypes, term216514, args);
        assertTrue(recursiveEquals(term216514, term217661));
        assertTrue(recursiveEquals(term216664, null));
    }

};


