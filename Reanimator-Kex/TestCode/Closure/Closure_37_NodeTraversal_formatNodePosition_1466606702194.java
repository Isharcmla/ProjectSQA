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

public class NodeTraversal_formatNodePosition_1466606702194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44891;
     Object term45041;
     Object term45382;
     Object term45384;

    public NodeTraversal_formatNodePosition_1466606702194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44891 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term44971 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term44891, term44891.getClass(), "compiler", term44971);
        setField(term44891, term44891.getClass(), "sourceName", null);
        term45041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45041, term45041.getClass(), "sourcePosition", 0);
        term45382 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term45383 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term45383, term45383.getClass(), "options", null);
        setField(term45383, term45383.getClass(), "passes", null);
        setField(term45383, term45383.getClass(), "externs", null);
        setField(term45383, term45383.getClass(), "modules", null);
        setField(term45383, term45383.getClass(), "moduleGraph", null);
        setField(term45383, term45383.getClass(), "inputs", null);
        setField(term45383, term45383.getClass(), "errorManager", null);
        setField(term45383, term45383.getClass(), "warningsGuard", null);
        setField(term45383, term45383.getClass(), "externsRoot", null);
        setField(term45383, term45383.getClass(), "jsRoot", null);
        setField(term45383, term45383.getClass(), "externAndJsRoot", null);
        setField(term45383, term45383.getClass(), "inputsById", null);
        setField(term45383, term45383.getClass(), "sourceMap", null);
        setField(term45383, term45383.getClass(), "externExports", null);
        setIntField(term45383, term45383.getClass(), "uniqueNameId", 0);
        setBooleanField(term45383, term45383.getClass(), "useThreads", false);
        setBooleanField(term45383, term45383.getClass(), "hasRegExpGlobalReferences", false);
        setField(term45383, term45383.getClass(), "functionInformationMap", null);
        setField(term45383, term45383.getClass(), "debugLog", null);
        setField(term45383, term45383.getClass(), "defaultCodingConvention", null);
        setField(term45383, term45383.getClass(), "typeRegistry", null);
        setField(term45383, term45383.getClass(), "parserConfig", null);
        setField(term45383, term45383.getClass(), "abstractInterpreter", null);
        setField(term45383, term45383.getClass(), "typeValidator", null);
        setField(term45383, term45383.getClass(), "tracker", null);
        setField(term45383, term45383.getClass(), "oldErrorReporter", null);
        setField(term45383, term45383.getClass(), "defaultErrorReporter", null);
        setField(term45383, term45383.getClass(), "outStream", null);
        setField(term45383, term45383.getClass(), "globalRefMap", null);
        setDoubleField(term45383, term45383.getClass(), "progress", 0.0);
        setField(term45383, term45383.getClass(), "sanityCheck", null);
        setField(term45383, term45383.getClass(), "currentTracer", null);
        setField(term45383, term45383.getClass(), "currentPassName", null);
        setIntField(term45383, term45383.getClass(), "syntheticCodeId", 0);
        setField(term45383, term45383.getClass(), "recentChange", null);
        setField(term45383, term45383.getClass(), "codeChangeHandlers", null);
        setField(term45383, term45383.getClass(), "synthesizedExternsInput", null);
        setField(term45383, term45383.getClass(), "stage", null);
        setField(term45382, term45382.getClass(), "compiler", term45383);
        setField(term45382, term45382.getClass(), "callback", null);
        setField(term45382, term45382.getClass(), "curNode", null);
        setField(term45382, term45382.getClass(), "scopes", null);
        setField(term45382, term45382.getClass(), "scopeRoots", null);
        setField(term45382, term45382.getClass(), "cfgs", null);
        setField(term45382, term45382.getClass(), "sourceName", null);
        setField(term45382, term45382.getClass(), "inputId", null);
        setField(term45382, term45382.getClass(), "scopeCreator", null);
        setField(term45382, term45382.getClass(), "scopeCallback", null);
        term45384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45384, term45384.getClass(), "type", 0);
        setField(term45384, term45384.getClass(), "next", null);
        setField(term45384, term45384.getClass(), "first", null);
        setField(term45384, term45384.getClass(), "last", null);
        setField(term45384, term45384.getClass(), "propListHead", null);
        setIntField(term45384, term45384.getClass(), "sourcePosition", 0);
        setField(term45384, term45384.getClass(), "jsType", null);
        setField(term45384, term45384.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term45041;
        Object retValue = callMethod(klass, "formatNodePosition", argTypes, term44891, args);
        assertTrue(recursiveEquals(term44891, term45382));
        assertTrue(recursiveEquals(term45041, term45384));
        assertTrue(recursiveEquals(retValue, "null:0:0\n[source unknown]\n"));
    }

};


