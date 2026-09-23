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

public class FlowSensitiveInlineVariables_process_55946046563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14465;
     Object term14615;
     Object term17021;
     Object term17023;

    public FlowSensitiveInlineVariables_process_55946046563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14465 = newInstance(Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        Object term14545 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term14465, term14465.getClass(), "compiler", term14545);
        term14615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14707 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term14799 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term14891 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term14615, term14615.getClass(), "type", 0);
        setField(term14615, term14615.getClass(), "parent", null);
        setField(term14707, term14707.getClass(), "next", term14799);
        setIntField(term14707, term14707.getClass(), "type", 0);
        setField(term14707, term14707.getClass(), "first", term14891);
        setField(term14615, term14615.getClass(), "first", term14707);
        term17021 = newInstance(Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        Object term17022 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term17022, term17022.getClass(), "options", null);
        setField(term17022, term17022.getClass(), "passes", null);
        setField(term17022, term17022.getClass(), "externs", null);
        setField(term17022, term17022.getClass(), "modules", null);
        setField(term17022, term17022.getClass(), "moduleGraph", null);
        setField(term17022, term17022.getClass(), "inputs", null);
        setField(term17022, term17022.getClass(), "errorManager", null);
        setField(term17022, term17022.getClass(), "warningsGuard", null);
        setField(term17022, term17022.getClass(), "injectedLibraries", null);
        setField(term17022, term17022.getClass(), "externsRoot", null);
        setField(term17022, term17022.getClass(), "jsRoot", null);
        setField(term17022, term17022.getClass(), "externAndJsRoot", null);
        setField(term17022, term17022.getClass(), "inputsById", null);
        setField(term17022, term17022.getClass(), "sourceMap", null);
        setField(term17022, term17022.getClass(), "externExports", null);
        setIntField(term17022, term17022.getClass(), "uniqueNameId", 0);
        setBooleanField(term17022, term17022.getClass(), "useThreads", false);
        setBooleanField(term17022, term17022.getClass(), "hasRegExpGlobalReferences", false);
        setField(term17022, term17022.getClass(), "functionInformationMap", null);
        setField(term17022, term17022.getClass(), "debugLog", null);
        setField(term17022, term17022.getClass(), "defaultCodingConvention", null);
        setField(term17022, term17022.getClass(), "typeRegistry", null);
        setField(term17022, term17022.getClass(), "parserConfig", null);
        setField(term17022, term17022.getClass(), "abstractInterpreter", null);
        setField(term17022, term17022.getClass(), "typeValidator", null);
        setField(term17022, term17022.getClass(), "tracker", null);
        setField(term17022, term17022.getClass(), "oldErrorReporter", null);
        setField(term17022, term17022.getClass(), "defaultErrorReporter", null);
        setField(term17022, term17022.getClass(), "outStream", null);
        setField(term17022, term17022.getClass(), "globalRefMap", null);
        setDoubleField(term17022, term17022.getClass(), "progress", 0.0);
        setField(term17022, term17022.getClass(), "sanityCheck", null);
        setField(term17022, term17022.getClass(), "currentTracer", null);
        setField(term17022, term17022.getClass(), "currentPassName", null);
        setIntField(term17022, term17022.getClass(), "syntheticCodeId", 0);
        setField(term17022, term17022.getClass(), "recentChange", null);
        setField(term17022, term17022.getClass(), "codeChangeHandlers", null);
        setField(term17022, term17022.getClass(), "synthesizedExternsInput", null);
        setField(term17022, term17022.getClass(), "stage", null);
        setField(term17021, term17021.getClass(), "compiler", term17022);
        setField(term17021, term17021.getClass(), "cfg", null);
        setField(term17021, term17021.getClass(), "candidates", null);
        setField(term17021, term17021.getClass(), "reachingDef", null);
        setField(term17021, term17021.getClass(), "reachingUses", null);
        term17023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17024 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term17025 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term17026 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term17023, term17023.getClass(), "type", 0);
        setField(term17023, term17023.getClass(), "next", null);
        setDoubleField(term17024, term17024.getClass(), "number", 0.0);
        setIntField(term17024, term17024.getClass(), "type", 0);
        setDoubleField(term17025, term17025.getClass(), "number", 0.0);
        setIntField(term17025, term17025.getClass(), "type", 0);
        setField(term17025, term17025.getClass(), "next", null);
        setField(term17025, term17025.getClass(), "first", null);
        setField(term17025, term17025.getClass(), "last", null);
        setField(term17025, term17025.getClass(), "propListHead", null);
        setIntField(term17025, term17025.getClass(), "sourcePosition", 0);
        setField(term17025, term17025.getClass(), "jsType", null);
        setField(term17025, term17025.getClass(), "parent", null);
        setField(term17024, term17024.getClass(), "next", term17025);
        setDoubleField(term17026, term17026.getClass(), "number", 0.0);
        setIntField(term17026, term17026.getClass(), "type", 0);
        setField(term17026, term17026.getClass(), "next", null);
        setField(term17026, term17026.getClass(), "first", null);
        setField(term17026, term17026.getClass(), "last", null);
        setField(term17026, term17026.getClass(), "propListHead", null);
        setIntField(term17026, term17026.getClass(), "sourcePosition", 0);
        setField(term17026, term17026.getClass(), "jsType", null);
        setField(term17026, term17026.getClass(), "parent", null);
        setField(term17024, term17024.getClass(), "first", term17026);
        setField(term17024, term17024.getClass(), "last", null);
        setField(term17024, term17024.getClass(), "propListHead", null);
        setIntField(term17024, term17024.getClass(), "sourcePosition", 0);
        setField(term17024, term17024.getClass(), "jsType", null);
        setField(term17024, term17024.getClass(), "parent", null);
        setField(term17023, term17023.getClass(), "first", term17024);
        setField(term17023, term17023.getClass(), "last", null);
        setField(term17023, term17023.getClass(), "propListHead", null);
        setIntField(term17023, term17023.getClass(), "sourcePosition", 0);
        setField(term17023, term17023.getClass(), "jsType", null);
        setField(term17023, term17023.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term14615;
        callMethod(klass, "process", argTypes, term14465, args);
        assertTrue(recursiveEquals(term14465, term17021));
        assertTrue(recursiveEquals(term14615, null));
    }

};


