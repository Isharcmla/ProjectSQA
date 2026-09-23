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

public class NodeTraversal_traverse_846591159180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40467;
     Object term40537;
     Object term40755;
     Object term41358;
     Object term41359;
     Object term41360;

    public NodeTraversal_traverse_846591159180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40467 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        term40537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40537, term40537.getClass(), "type", 0);
        setField(term40537, term40537.getClass(), "parent", null);
        setField(term40537, term40537.getClass(), "first", term40607);
        term40755 = newInstance(Class.forName("com.google.javascript.jscomp.InlineSimpleMethods$InlineTrivialAccessors"));
        term41358 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term41358, term41358.getClass(), "options", null);
        setField(term41358, term41358.getClass(), "passes", null);
        setField(term41358, term41358.getClass(), "externs", null);
        setField(term41358, term41358.getClass(), "modules", null);
        setField(term41358, term41358.getClass(), "moduleGraph", null);
        setField(term41358, term41358.getClass(), "inputs", null);
        setField(term41358, term41358.getClass(), "errorManager", null);
        setField(term41358, term41358.getClass(), "warningsGuard", null);
        setField(term41358, term41358.getClass(), "externsRoot", null);
        setField(term41358, term41358.getClass(), "jsRoot", null);
        setField(term41358, term41358.getClass(), "externAndJsRoot", null);
        setField(term41358, term41358.getClass(), "inputsById", null);
        setField(term41358, term41358.getClass(), "sourceMap", null);
        setField(term41358, term41358.getClass(), "externExports", null);
        setIntField(term41358, term41358.getClass(), "uniqueNameId", 0);
        setBooleanField(term41358, term41358.getClass(), "useThreads", false);
        setBooleanField(term41358, term41358.getClass(), "hasRegExpGlobalReferences", false);
        setField(term41358, term41358.getClass(), "functionInformationMap", null);
        setField(term41358, term41358.getClass(), "debugLog", null);
        setField(term41358, term41358.getClass(), "defaultCodingConvention", null);
        setField(term41358, term41358.getClass(), "typeRegistry", null);
        setField(term41358, term41358.getClass(), "parserConfig", null);
        setField(term41358, term41358.getClass(), "abstractInterpreter", null);
        setField(term41358, term41358.getClass(), "typeValidator", null);
        setField(term41358, term41358.getClass(), "tracker", null);
        setField(term41358, term41358.getClass(), "oldErrorReporter", null);
        setField(term41358, term41358.getClass(), "defaultErrorReporter", null);
        setField(term41358, term41358.getClass(), "outStream", null);
        setField(term41358, term41358.getClass(), "globalRefMap", null);
        setDoubleField(term41358, term41358.getClass(), "progress", 0.0);
        setField(term41358, term41358.getClass(), "sanityCheck", null);
        setField(term41358, term41358.getClass(), "currentTracer", null);
        setField(term41358, term41358.getClass(), "currentPassName", null);
        setIntField(term41358, term41358.getClass(), "syntheticCodeId", 0);
        setField(term41358, term41358.getClass(), "recentChange", null);
        setField(term41358, term41358.getClass(), "codeChangeHandlers", null);
        setField(term41358, term41358.getClass(), "synthesizedExternsInput", null);
        setField(term41358, term41358.getClass(), "stage", null);
        term41359 = newInstance(Class.forName("com.google.javascript.jscomp.InlineSimpleMethods$InlineTrivialAccessors"));
        setField(term41359, term41359.getClass(), "this$0", null);
        term41360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41360, term41360.getClass(), "type", 0);
        setField(term41360, term41360.getClass(), "next", null);
        setIntField(term41361, term41361.getClass(), "type", 0);
        setField(term41361, term41361.getClass(), "next", null);
        setField(term41361, term41361.getClass(), "first", null);
        setField(term41361, term41361.getClass(), "last", null);
        setField(term41361, term41361.getClass(), "propListHead", null);
        setIntField(term41361, term41361.getClass(), "sourcePosition", 0);
        setField(term41361, term41361.getClass(), "jsType", null);
        setField(term41361, term41361.getClass(), "parent", null);
        setField(term41360, term41360.getClass(), "first", term41361);
        setField(term41360, term41360.getClass(), "last", null);
        setField(term41360, term41360.getClass(), "propListHead", null);
        setIntField(term41360, term41360.getClass(), "sourcePosition", 0);
        setField(term41360, term41360.getClass(), "jsType", null);
        setField(term41360, term41360.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.NodeTraversal$Callback");
        Object[] args = new Object[3];
        args[0] = term40467;
        args[1] = term40537;
        args[2] = term40755;
        callMethod(klass, "traverse", argTypes, null, args);
        assertTrue(recursiveEquals(term40467, term41358));
        assertTrue(recursiveEquals(term40537, term41359));
        assertTrue(recursiveEquals(term40755, term41360));
    }

};


