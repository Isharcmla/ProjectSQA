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
import java.util.LinkedList;
import java.lang.Object;

public class NodeTraversal_traverseRoots_2057520395206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48048;
     Object term48102;
     Object term48474;
     Object term48600;
     Object term48601;
     Object term48602;

    public NodeTraversal_traverseRoots_2057520395206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48048 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term48246 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term48338 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term48246, term48246.getClass(), "parent", term48338);
        term48102 = new LinkedList();
        ((LinkedList) term48102).add(term48246);
        term48474 = newInstance(Class.forName("com.google.javascript.jscomp.ReplaceIdGenerators$GatherGenerators"));
        term48600 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term48600, term48600.getClass(), "options", null);
        setField(term48600, term48600.getClass(), "passes", null);
        setField(term48600, term48600.getClass(), "externs", null);
        setField(term48600, term48600.getClass(), "modules", null);
        setField(term48600, term48600.getClass(), "moduleGraph", null);
        setField(term48600, term48600.getClass(), "inputs", null);
        setField(term48600, term48600.getClass(), "errorManager", null);
        setField(term48600, term48600.getClass(), "warningsGuard", null);
        setField(term48600, term48600.getClass(), "externsRoot", null);
        setField(term48600, term48600.getClass(), "jsRoot", null);
        setField(term48600, term48600.getClass(), "externAndJsRoot", null);
        setField(term48600, term48600.getClass(), "inputsById", null);
        setField(term48600, term48600.getClass(), "sourceMap", null);
        setField(term48600, term48600.getClass(), "externExports", null);
        setIntField(term48600, term48600.getClass(), "uniqueNameId", 0);
        setBooleanField(term48600, term48600.getClass(), "useThreads", false);
        setBooleanField(term48600, term48600.getClass(), "hasRegExpGlobalReferences", false);
        setField(term48600, term48600.getClass(), "functionInformationMap", null);
        setField(term48600, term48600.getClass(), "debugLog", null);
        setField(term48600, term48600.getClass(), "defaultCodingConvention", null);
        setField(term48600, term48600.getClass(), "typeRegistry", null);
        setField(term48600, term48600.getClass(), "parserConfig", null);
        setField(term48600, term48600.getClass(), "abstractInterpreter", null);
        setField(term48600, term48600.getClass(), "typeValidator", null);
        setField(term48600, term48600.getClass(), "tracker", null);
        setField(term48600, term48600.getClass(), "oldErrorReporter", null);
        setField(term48600, term48600.getClass(), "defaultErrorReporter", null);
        setField(term48600, term48600.getClass(), "outStream", null);
        setField(term48600, term48600.getClass(), "globalRefMap", null);
        setDoubleField(term48600, term48600.getClass(), "progress", 0.0);
        setField(term48600, term48600.getClass(), "sanityCheck", null);
        setField(term48600, term48600.getClass(), "currentTracer", null);
        setField(term48600, term48600.getClass(), "currentPassName", null);
        setIntField(term48600, term48600.getClass(), "syntheticCodeId", 0);
        setField(term48600, term48600.getClass(), "recentChange", null);
        setField(term48600, term48600.getClass(), "codeChangeHandlers", null);
        setField(term48600, term48600.getClass(), "synthesizedExternsInput", null);
        setField(term48600, term48600.getClass(), "stage", null);
        term48601 = newInstance(Class.forName("com.google.javascript.jscomp.ReplaceIdGenerators$GatherGenerators"));
        setField(term48601, term48601.getClass(), "this$0", null);
        Object term48604 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term48605 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term48604, term48604.getClass(), "str", null);
        setIntField(term48604, term48604.getClass(), "type", 0);
        setField(term48604, term48604.getClass(), "next", null);
        setField(term48604, term48604.getClass(), "first", null);
        setField(term48604, term48604.getClass(), "last", null);
        setField(term48604, term48604.getClass(), "propListHead", null);
        setIntField(term48604, term48604.getClass(), "sourcePosition", 0);
        setField(term48604, term48604.getClass(), "jsType", null);
        setDoubleField(term48605, term48605.getClass(), "number", 0.0);
        setIntField(term48605, term48605.getClass(), "type", 0);
        setField(term48605, term48605.getClass(), "next", null);
        setField(term48605, term48605.getClass(), "first", null);
        setField(term48605, term48605.getClass(), "last", null);
        setField(term48605, term48605.getClass(), "propListHead", null);
        setIntField(term48605, term48605.getClass(), "sourcePosition", 0);
        setField(term48605, term48605.getClass(), "jsType", null);
        setField(term48605, term48605.getClass(), "parent", null);
        setField(term48604, term48604.getClass(), "parent", term48605);
        term48602 = new LinkedList();
        ((LinkedList) term48602).add(term48604);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.NodeTraversal$Callback");
        Object[] args = new Object[3];
        args[0] = term48048;
        args[1] = term48102;
        args[2] = term48474;
        callMethod(klass, "traverseRoots", argTypes, null, args);
        assertTrue(recursiveEquals(term48048, term48600));
        assertTrue(recursiveEquals(term48102, term48601));
        assertTrue(recursiveEquals(term48474, term48602));
    }

};


