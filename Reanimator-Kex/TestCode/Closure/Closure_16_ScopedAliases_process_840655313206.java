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

public class ScopedAliases_process_840655313206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125468;
     Object term125640;
     Object term126864;
     Object term126866;

    public ScopedAliases_process_840655313206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125468 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term125548 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term125468, term125468.getClass(), "compiler", term125548);
        term125640 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term125732 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term125640, term125640.getClass(), "type", 105);
        setIntField(term125732, term125732.getClass(), "type", 0);
        setField(term125732, term125732.getClass(), "parent", null);
        setField(term125640, term125640.getClass(), "parent", term125732);
        term126864 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term126865 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term126865, term126865.getClass(), "options", null);
        setField(term126865, term126865.getClass(), "passes", null);
        setField(term126865, term126865.getClass(), "externs", null);
        setField(term126865, term126865.getClass(), "modules", null);
        setField(term126865, term126865.getClass(), "moduleGraph", null);
        setField(term126865, term126865.getClass(), "inputs", null);
        setField(term126865, term126865.getClass(), "errorManager", null);
        setField(term126865, term126865.getClass(), "warningsGuard", null);
        setField(term126865, term126865.getClass(), "injectedLibraries", null);
        setField(term126865, term126865.getClass(), "externsRoot", null);
        setField(term126865, term126865.getClass(), "jsRoot", null);
        setField(term126865, term126865.getClass(), "externAndJsRoot", null);
        setField(term126865, term126865.getClass(), "inputsById", null);
        setField(term126865, term126865.getClass(), "sourceMap", null);
        setField(term126865, term126865.getClass(), "externExports", null);
        setIntField(term126865, term126865.getClass(), "uniqueNameId", 0);
        setBooleanField(term126865, term126865.getClass(), "useThreads", false);
        setBooleanField(term126865, term126865.getClass(), "hasRegExpGlobalReferences", false);
        setField(term126865, term126865.getClass(), "functionInformationMap", null);
        setField(term126865, term126865.getClass(), "debugLog", null);
        setField(term126865, term126865.getClass(), "defaultCodingConvention", null);
        setField(term126865, term126865.getClass(), "typeRegistry", null);
        setField(term126865, term126865.getClass(), "parserConfig", null);
        setField(term126865, term126865.getClass(), "abstractInterpreter", null);
        setField(term126865, term126865.getClass(), "typeValidator", null);
        setField(term126865, term126865.getClass(), "tracker", null);
        setField(term126865, term126865.getClass(), "oldErrorReporter", null);
        setField(term126865, term126865.getClass(), "defaultErrorReporter", null);
        setField(term126865, term126865.getClass(), "outStream", null);
        setField(term126865, term126865.getClass(), "globalRefMap", null);
        setDoubleField(term126865, term126865.getClass(), "progress", 0.0);
        setField(term126865, term126865.getClass(), "sanityCheck", null);
        setField(term126865, term126865.getClass(), "currentTracer", null);
        setField(term126865, term126865.getClass(), "currentPassName", null);
        setIntField(term126865, term126865.getClass(), "syntheticCodeId", 0);
        setField(term126865, term126865.getClass(), "recentChange", null);
        setField(term126865, term126865.getClass(), "codeChangeHandlers", null);
        setField(term126865, term126865.getClass(), "synthesizedExternsInput", null);
        setField(term126865, term126865.getClass(), "stage", null);
        setField(term126864, term126864.getClass(), "compiler", term126865);
        setField(term126864, term126864.getClass(), "preprocessorSymbolTable", null);
        setField(term126864, term126864.getClass(), "transformationHandler", null);
        term126866 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term126867 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term126866, term126866.getClass(), "number", 0.0);
        setIntField(term126866, term126866.getClass(), "type", 105);
        setField(term126866, term126866.getClass(), "next", null);
        setField(term126866, term126866.getClass(), "first", null);
        setField(term126866, term126866.getClass(), "last", null);
        setField(term126866, term126866.getClass(), "propListHead", null);
        setIntField(term126866, term126866.getClass(), "sourcePosition", 0);
        setField(term126866, term126866.getClass(), "jsType", null);
        setDoubleField(term126867, term126867.getClass(), "number", 0.0);
        setIntField(term126867, term126867.getClass(), "type", 0);
        setField(term126867, term126867.getClass(), "next", null);
        setField(term126867, term126867.getClass(), "first", null);
        setField(term126867, term126867.getClass(), "last", null);
        setField(term126867, term126867.getClass(), "propListHead", null);
        setIntField(term126867, term126867.getClass(), "sourcePosition", 0);
        setField(term126867, term126867.getClass(), "jsType", null);
        setField(term126867, term126867.getClass(), "parent", null);
        setField(term126866, term126866.getClass(), "parent", term126867);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term125640;
        callMethod(klass, "process", argTypes, term125468, args);
        assertTrue(recursiveEquals(term125468, term126864));
        assertTrue(recursiveEquals(term125640, null));
    }

};


