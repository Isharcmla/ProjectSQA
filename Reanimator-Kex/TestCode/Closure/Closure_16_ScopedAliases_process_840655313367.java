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

public class ScopedAliases_process_840655313367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251985;
     Object term252157;
     Object term253035;
     Object term253037;

    public ScopedAliases_process_840655313367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251985 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term252065 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term251985, term251985.getClass(), "compiler", term252065);
        term252157 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term252249 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term252341 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term252433 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term252157, term252157.getClass(), "type", 0);
        setIntField(term252249, term252249.getClass(), "type", 0);
        setField(term252249, term252249.getClass(), "parent", null);
        setField(term252157, term252157.getClass(), "parent", term252249);
        setField(term252341, term252341.getClass(), "next", null);
        setIntField(term252341, term252341.getClass(), "type", 0);
        setField(term252433, term252433.getClass(), "next", null);
        setIntField(term252433, term252433.getClass(), "type", 0);
        setField(term252433, term252433.getClass(), "first", null);
        setField(term252341, term252341.getClass(), "first", term252433);
        setField(term252157, term252157.getClass(), "first", term252341);
        term253035 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term253036 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term253036, term253036.getClass(), "options", null);
        setField(term253036, term253036.getClass(), "passes", null);
        setField(term253036, term253036.getClass(), "externs", null);
        setField(term253036, term253036.getClass(), "modules", null);
        setField(term253036, term253036.getClass(), "moduleGraph", null);
        setField(term253036, term253036.getClass(), "inputs", null);
        setField(term253036, term253036.getClass(), "errorManager", null);
        setField(term253036, term253036.getClass(), "warningsGuard", null);
        setField(term253036, term253036.getClass(), "injectedLibraries", null);
        setField(term253036, term253036.getClass(), "externsRoot", null);
        setField(term253036, term253036.getClass(), "jsRoot", null);
        setField(term253036, term253036.getClass(), "externAndJsRoot", null);
        setField(term253036, term253036.getClass(), "inputsById", null);
        setField(term253036, term253036.getClass(), "sourceMap", null);
        setField(term253036, term253036.getClass(), "externExports", null);
        setIntField(term253036, term253036.getClass(), "uniqueNameId", 0);
        setBooleanField(term253036, term253036.getClass(), "useThreads", false);
        setBooleanField(term253036, term253036.getClass(), "hasRegExpGlobalReferences", false);
        setField(term253036, term253036.getClass(), "functionInformationMap", null);
        setField(term253036, term253036.getClass(), "debugLog", null);
        setField(term253036, term253036.getClass(), "defaultCodingConvention", null);
        setField(term253036, term253036.getClass(), "typeRegistry", null);
        setField(term253036, term253036.getClass(), "parserConfig", null);
        setField(term253036, term253036.getClass(), "abstractInterpreter", null);
        setField(term253036, term253036.getClass(), "typeValidator", null);
        setField(term253036, term253036.getClass(), "tracker", null);
        setField(term253036, term253036.getClass(), "oldErrorReporter", null);
        setField(term253036, term253036.getClass(), "defaultErrorReporter", null);
        setField(term253036, term253036.getClass(), "outStream", null);
        setField(term253036, term253036.getClass(), "globalRefMap", null);
        setDoubleField(term253036, term253036.getClass(), "progress", 0.0);
        setField(term253036, term253036.getClass(), "sanityCheck", null);
        setField(term253036, term253036.getClass(), "currentTracer", null);
        setField(term253036, term253036.getClass(), "currentPassName", null);
        setIntField(term253036, term253036.getClass(), "syntheticCodeId", 0);
        setField(term253036, term253036.getClass(), "recentChange", null);
        setField(term253036, term253036.getClass(), "codeChangeHandlers", null);
        setField(term253036, term253036.getClass(), "synthesizedExternsInput", null);
        setField(term253036, term253036.getClass(), "stage", null);
        setField(term253035, term253035.getClass(), "compiler", term253036);
        setField(term253035, term253035.getClass(), "preprocessorSymbolTable", null);
        setField(term253035, term253035.getClass(), "transformationHandler", null);
        term253037 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term253038 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term253039 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term253040 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term253037, term253037.getClass(), "str", null);
        setIntField(term253037, term253037.getClass(), "type", 0);
        setField(term253037, term253037.getClass(), "next", null);
        setField(term253038, term253038.getClass(), "str", null);
        setIntField(term253038, term253038.getClass(), "type", 0);
        setField(term253038, term253038.getClass(), "next", null);
        setField(term253039, term253039.getClass(), "str", null);
        setIntField(term253039, term253039.getClass(), "type", 0);
        setField(term253039, term253039.getClass(), "next", null);
        setField(term253039, term253039.getClass(), "first", null);
        setField(term253039, term253039.getClass(), "last", null);
        setField(term253039, term253039.getClass(), "propListHead", null);
        setIntField(term253039, term253039.getClass(), "sourcePosition", 0);
        setField(term253039, term253039.getClass(), "jsType", null);
        setField(term253039, term253039.getClass(), "parent", null);
        setField(term253038, term253038.getClass(), "first", term253039);
        setField(term253038, term253038.getClass(), "last", null);
        setField(term253038, term253038.getClass(), "propListHead", null);
        setIntField(term253038, term253038.getClass(), "sourcePosition", 0);
        setField(term253038, term253038.getClass(), "jsType", null);
        setField(term253038, term253038.getClass(), "parent", null);
        setField(term253037, term253037.getClass(), "first", term253038);
        setField(term253037, term253037.getClass(), "last", null);
        setField(term253037, term253037.getClass(), "propListHead", null);
        setIntField(term253037, term253037.getClass(), "sourcePosition", 0);
        setField(term253037, term253037.getClass(), "jsType", null);
        setField(term253040, term253040.getClass(), "str", null);
        setIntField(term253040, term253040.getClass(), "type", 0);
        setField(term253040, term253040.getClass(), "next", null);
        setField(term253040, term253040.getClass(), "first", null);
        setField(term253040, term253040.getClass(), "last", null);
        setField(term253040, term253040.getClass(), "propListHead", null);
        setIntField(term253040, term253040.getClass(), "sourcePosition", 0);
        setField(term253040, term253040.getClass(), "jsType", null);
        setField(term253040, term253040.getClass(), "parent", null);
        setField(term253037, term253037.getClass(), "parent", term253040);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term252157;
        callMethod(klass, "process", argTypes, term251985, args);
        assertTrue(recursiveEquals(term251985, term253035));
        assertTrue(recursiveEquals(term252157, null));
    }

};


