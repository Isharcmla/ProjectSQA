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
import java.util.ArrayList;

public class NodeTraversal_traverseRoots_2057520395182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41648;
     Object term41700;
     Object term41993;
     Object term41994;

    public NodeTraversal_traverseRoots_2057520395182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41648 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        term41700 = new ArrayList();
        term41993 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term41993, term41993.getClass(), "options", null);
        setField(term41993, term41993.getClass(), "passes", null);
        setField(term41993, term41993.getClass(), "externs", null);
        setField(term41993, term41993.getClass(), "modules", null);
        setField(term41993, term41993.getClass(), "moduleGraph", null);
        setField(term41993, term41993.getClass(), "inputs", null);
        setField(term41993, term41993.getClass(), "errorManager", null);
        setField(term41993, term41993.getClass(), "warningsGuard", null);
        setField(term41993, term41993.getClass(), "externsRoot", null);
        setField(term41993, term41993.getClass(), "jsRoot", null);
        setField(term41993, term41993.getClass(), "externAndJsRoot", null);
        setField(term41993, term41993.getClass(), "inputsById", null);
        setField(term41993, term41993.getClass(), "sourceMap", null);
        setField(term41993, term41993.getClass(), "externExports", null);
        setIntField(term41993, term41993.getClass(), "uniqueNameId", 0);
        setBooleanField(term41993, term41993.getClass(), "useThreads", false);
        setBooleanField(term41993, term41993.getClass(), "hasRegExpGlobalReferences", false);
        setField(term41993, term41993.getClass(), "functionInformationMap", null);
        setField(term41993, term41993.getClass(), "debugLog", null);
        setField(term41993, term41993.getClass(), "defaultCodingConvention", null);
        setField(term41993, term41993.getClass(), "typeRegistry", null);
        setField(term41993, term41993.getClass(), "parserConfig", null);
        setField(term41993, term41993.getClass(), "abstractInterpreter", null);
        setField(term41993, term41993.getClass(), "typeValidator", null);
        setField(term41993, term41993.getClass(), "tracker", null);
        setField(term41993, term41993.getClass(), "oldErrorReporter", null);
        setField(term41993, term41993.getClass(), "defaultErrorReporter", null);
        setField(term41993, term41993.getClass(), "outStream", null);
        setField(term41993, term41993.getClass(), "globalRefMap", null);
        setDoubleField(term41993, term41993.getClass(), "progress", 0.0);
        setField(term41993, term41993.getClass(), "sanityCheck", null);
        setField(term41993, term41993.getClass(), "currentTracer", null);
        setField(term41993, term41993.getClass(), "currentPassName", null);
        setIntField(term41993, term41993.getClass(), "syntheticCodeId", 0);
        setField(term41993, term41993.getClass(), "recentChange", null);
        setField(term41993, term41993.getClass(), "codeChangeHandlers", null);
        setField(term41993, term41993.getClass(), "synthesizedExternsInput", null);
        setField(term41993, term41993.getClass(), "stage", null);
        term41994 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.NodeTraversal$Callback");
        Object[] args = new Object[3];
        args[0] = term41648;
        args[1] = term41700;
        args[2] = null;
        callMethod(klass, "traverseRoots", argTypes, null, args);
        assertTrue(recursiveEquals(term41648, term41993));
        assertTrue(recursiveEquals(term41700, null));
    }

};


