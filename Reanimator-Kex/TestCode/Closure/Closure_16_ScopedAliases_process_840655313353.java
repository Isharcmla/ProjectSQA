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

public class ScopedAliases_process_840655313353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240769;
     Object term240941;
     Object term242084;
     Object term242086;

    public ScopedAliases_process_840655313353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240769 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term240849 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term240769, term240769.getClass(), "compiler", term240849);
        term240941 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term241033 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term241103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term241195 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term241265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term240941, term240941.getClass(), "type", 0);
        setField(term240941, term240941.getClass(), "parent", null);
        setField(term241103, term241103.getClass(), "next", null);
        setIntField(term241103, term241103.getClass(), "type", 0);
        setField(term241103, term241103.getClass(), "first", null);
        setField(term241033, term241033.getClass(), "next", term241103);
        setIntField(term241033, term241033.getClass(), "type", 0);
        setField(term241265, term241265.getClass(), "next", null);
        setIntField(term241265, term241265.getClass(), "type", 0);
        setField(term241265, term241265.getClass(), "first", null);
        setField(term241195, term241195.getClass(), "next", term241265);
        setIntField(term241195, term241195.getClass(), "type", 0);
        setField(term241195, term241195.getClass(), "first", null);
        setField(term241033, term241033.getClass(), "first", term241195);
        setField(term240941, term240941.getClass(), "first", term241033);
        term242084 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term242085 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term242085, term242085.getClass(), "options", null);
        setField(term242085, term242085.getClass(), "passes", null);
        setField(term242085, term242085.getClass(), "externs", null);
        setField(term242085, term242085.getClass(), "modules", null);
        setField(term242085, term242085.getClass(), "moduleGraph", null);
        setField(term242085, term242085.getClass(), "inputs", null);
        setField(term242085, term242085.getClass(), "errorManager", null);
        setField(term242085, term242085.getClass(), "warningsGuard", null);
        setField(term242085, term242085.getClass(), "injectedLibraries", null);
        setField(term242085, term242085.getClass(), "externsRoot", null);
        setField(term242085, term242085.getClass(), "jsRoot", null);
        setField(term242085, term242085.getClass(), "externAndJsRoot", null);
        setField(term242085, term242085.getClass(), "inputsById", null);
        setField(term242085, term242085.getClass(), "sourceMap", null);
        setField(term242085, term242085.getClass(), "externExports", null);
        setIntField(term242085, term242085.getClass(), "uniqueNameId", 0);
        setBooleanField(term242085, term242085.getClass(), "useThreads", false);
        setBooleanField(term242085, term242085.getClass(), "hasRegExpGlobalReferences", false);
        setField(term242085, term242085.getClass(), "functionInformationMap", null);
        setField(term242085, term242085.getClass(), "debugLog", null);
        setField(term242085, term242085.getClass(), "defaultCodingConvention", null);
        setField(term242085, term242085.getClass(), "typeRegistry", null);
        setField(term242085, term242085.getClass(), "parserConfig", null);
        setField(term242085, term242085.getClass(), "abstractInterpreter", null);
        setField(term242085, term242085.getClass(), "typeValidator", null);
        setField(term242085, term242085.getClass(), "tracker", null);
        setField(term242085, term242085.getClass(), "oldErrorReporter", null);
        setField(term242085, term242085.getClass(), "defaultErrorReporter", null);
        setField(term242085, term242085.getClass(), "outStream", null);
        setField(term242085, term242085.getClass(), "globalRefMap", null);
        setDoubleField(term242085, term242085.getClass(), "progress", 0.0);
        setField(term242085, term242085.getClass(), "sanityCheck", null);
        setField(term242085, term242085.getClass(), "currentTracer", null);
        setField(term242085, term242085.getClass(), "currentPassName", null);
        setIntField(term242085, term242085.getClass(), "syntheticCodeId", 0);
        setField(term242085, term242085.getClass(), "recentChange", null);
        setField(term242085, term242085.getClass(), "codeChangeHandlers", null);
        setField(term242085, term242085.getClass(), "synthesizedExternsInput", null);
        setField(term242085, term242085.getClass(), "stage", null);
        setField(term242084, term242084.getClass(), "compiler", term242085);
        setField(term242084, term242084.getClass(), "preprocessorSymbolTable", null);
        setField(term242084, term242084.getClass(), "transformationHandler", null);
        term242086 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term242087 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term242088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term242089 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term242090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term242086, term242086.getClass(), "number", 0.0);
        setIntField(term242086, term242086.getClass(), "type", 0);
        setField(term242086, term242086.getClass(), "next", null);
        setDoubleField(term242087, term242087.getClass(), "number", 0.0);
        setIntField(term242087, term242087.getClass(), "type", 0);
        setIntField(term242088, term242088.getClass(), "type", 0);
        setField(term242088, term242088.getClass(), "next", null);
        setField(term242088, term242088.getClass(), "first", null);
        setField(term242088, term242088.getClass(), "last", null);
        setField(term242088, term242088.getClass(), "propListHead", null);
        setIntField(term242088, term242088.getClass(), "sourcePosition", 0);
        setField(term242088, term242088.getClass(), "jsType", null);
        setField(term242088, term242088.getClass(), "parent", null);
        setField(term242087, term242087.getClass(), "next", term242088);
        setDoubleField(term242089, term242089.getClass(), "number", 0.0);
        setIntField(term242089, term242089.getClass(), "type", 0);
        setIntField(term242090, term242090.getClass(), "type", 0);
        setField(term242090, term242090.getClass(), "next", null);
        setField(term242090, term242090.getClass(), "first", null);
        setField(term242090, term242090.getClass(), "last", null);
        setField(term242090, term242090.getClass(), "propListHead", null);
        setIntField(term242090, term242090.getClass(), "sourcePosition", 0);
        setField(term242090, term242090.getClass(), "jsType", null);
        setField(term242090, term242090.getClass(), "parent", null);
        setField(term242089, term242089.getClass(), "next", term242090);
        setField(term242089, term242089.getClass(), "first", null);
        setField(term242089, term242089.getClass(), "last", null);
        setField(term242089, term242089.getClass(), "propListHead", null);
        setIntField(term242089, term242089.getClass(), "sourcePosition", 0);
        setField(term242089, term242089.getClass(), "jsType", null);
        setField(term242089, term242089.getClass(), "parent", null);
        setField(term242087, term242087.getClass(), "first", term242089);
        setField(term242087, term242087.getClass(), "last", null);
        setField(term242087, term242087.getClass(), "propListHead", null);
        setIntField(term242087, term242087.getClass(), "sourcePosition", 0);
        setField(term242087, term242087.getClass(), "jsType", null);
        setField(term242087, term242087.getClass(), "parent", null);
        setField(term242086, term242086.getClass(), "first", term242087);
        setField(term242086, term242086.getClass(), "last", null);
        setField(term242086, term242086.getClass(), "propListHead", null);
        setIntField(term242086, term242086.getClass(), "sourcePosition", 0);
        setField(term242086, term242086.getClass(), "jsType", null);
        setField(term242086, term242086.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term240941;
        callMethod(klass, "process", argTypes, term240769, args);
        assertTrue(recursiveEquals(term240769, term242084));
        assertTrue(recursiveEquals(term240941, null));
    }

};


