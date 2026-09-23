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

public class ScopedAliases_process_840655313221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137680;
     Object term137852;
     Object term138579;
     Object term138581;

    public ScopedAliases_process_840655313221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137680 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term137760 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term137680, term137680.getClass(), "compiler", term137760);
        term137852 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term137944 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term138036 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term137852, term137852.getClass(), "type", 0);
        setIntField(term137944, term137944.getClass(), "type", 0);
        setField(term137944, term137944.getClass(), "parent", null);
        setField(term137852, term137852.getClass(), "parent", term137944);
        setField(term138036, term138036.getClass(), "next", null);
        setIntField(term138036, term138036.getClass(), "type", 0);
        setField(term138036, term138036.getClass(), "first", null);
        setField(term137852, term137852.getClass(), "first", term138036);
        term138579 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term138580 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term138580, term138580.getClass(), "options", null);
        setField(term138580, term138580.getClass(), "passes", null);
        setField(term138580, term138580.getClass(), "externs", null);
        setField(term138580, term138580.getClass(), "modules", null);
        setField(term138580, term138580.getClass(), "moduleGraph", null);
        setField(term138580, term138580.getClass(), "inputs", null);
        setField(term138580, term138580.getClass(), "errorManager", null);
        setField(term138580, term138580.getClass(), "warningsGuard", null);
        setField(term138580, term138580.getClass(), "injectedLibraries", null);
        setField(term138580, term138580.getClass(), "externsRoot", null);
        setField(term138580, term138580.getClass(), "jsRoot", null);
        setField(term138580, term138580.getClass(), "externAndJsRoot", null);
        setField(term138580, term138580.getClass(), "inputsById", null);
        setField(term138580, term138580.getClass(), "sourceMap", null);
        setField(term138580, term138580.getClass(), "externExports", null);
        setIntField(term138580, term138580.getClass(), "uniqueNameId", 0);
        setBooleanField(term138580, term138580.getClass(), "useThreads", false);
        setBooleanField(term138580, term138580.getClass(), "hasRegExpGlobalReferences", false);
        setField(term138580, term138580.getClass(), "functionInformationMap", null);
        setField(term138580, term138580.getClass(), "debugLog", null);
        setField(term138580, term138580.getClass(), "defaultCodingConvention", null);
        setField(term138580, term138580.getClass(), "typeRegistry", null);
        setField(term138580, term138580.getClass(), "parserConfig", null);
        setField(term138580, term138580.getClass(), "abstractInterpreter", null);
        setField(term138580, term138580.getClass(), "typeValidator", null);
        setField(term138580, term138580.getClass(), "tracker", null);
        setField(term138580, term138580.getClass(), "oldErrorReporter", null);
        setField(term138580, term138580.getClass(), "defaultErrorReporter", null);
        setField(term138580, term138580.getClass(), "outStream", null);
        setField(term138580, term138580.getClass(), "globalRefMap", null);
        setDoubleField(term138580, term138580.getClass(), "progress", 0.0);
        setField(term138580, term138580.getClass(), "sanityCheck", null);
        setField(term138580, term138580.getClass(), "currentTracer", null);
        setField(term138580, term138580.getClass(), "currentPassName", null);
        setIntField(term138580, term138580.getClass(), "syntheticCodeId", 0);
        setField(term138580, term138580.getClass(), "recentChange", null);
        setField(term138580, term138580.getClass(), "codeChangeHandlers", null);
        setField(term138580, term138580.getClass(), "synthesizedExternsInput", null);
        setField(term138580, term138580.getClass(), "stage", null);
        setField(term138579, term138579.getClass(), "compiler", term138580);
        setField(term138579, term138579.getClass(), "preprocessorSymbolTable", null);
        setField(term138579, term138579.getClass(), "transformationHandler", null);
        term138581 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term138582 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term138583 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term138581, term138581.getClass(), "str", null);
        setIntField(term138581, term138581.getClass(), "type", 0);
        setField(term138581, term138581.getClass(), "next", null);
        setField(term138582, term138582.getClass(), "str", null);
        setIntField(term138582, term138582.getClass(), "type", 0);
        setField(term138582, term138582.getClass(), "next", null);
        setField(term138582, term138582.getClass(), "first", null);
        setField(term138582, term138582.getClass(), "last", null);
        setField(term138582, term138582.getClass(), "propListHead", null);
        setIntField(term138582, term138582.getClass(), "sourcePosition", 0);
        setField(term138582, term138582.getClass(), "jsType", null);
        setField(term138582, term138582.getClass(), "parent", null);
        setField(term138581, term138581.getClass(), "first", term138582);
        setField(term138581, term138581.getClass(), "last", null);
        setField(term138581, term138581.getClass(), "propListHead", null);
        setIntField(term138581, term138581.getClass(), "sourcePosition", 0);
        setField(term138581, term138581.getClass(), "jsType", null);
        setField(term138583, term138583.getClass(), "str", null);
        setIntField(term138583, term138583.getClass(), "type", 0);
        setField(term138583, term138583.getClass(), "next", null);
        setField(term138583, term138583.getClass(), "first", null);
        setField(term138583, term138583.getClass(), "last", null);
        setField(term138583, term138583.getClass(), "propListHead", null);
        setIntField(term138583, term138583.getClass(), "sourcePosition", 0);
        setField(term138583, term138583.getClass(), "jsType", null);
        setField(term138583, term138583.getClass(), "parent", null);
        setField(term138581, term138581.getClass(), "parent", term138583);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term137852;
        callMethod(klass, "process", argTypes, term137680, args);
        assertTrue(recursiveEquals(term137680, term138579));
        assertTrue(recursiveEquals(term137852, null));
    }

};


