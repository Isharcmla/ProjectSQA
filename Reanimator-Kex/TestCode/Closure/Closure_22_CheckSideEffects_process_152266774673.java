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
import java.util.ArrayList;

public class CheckSideEffects_process_152266774673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32192;
     Object term32394;
     Object term172088;
     Object term172092;

    public CheckSideEffects_process_152266774673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term32324 = new ArrayList();
        term32192 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        Object term32272 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term32192, term32192.getClass(), "compiler", term32272);
        setBooleanField(term32192, term32192.getClass(), "protectSideEffectFreeCode", true);
        setField(term32192, term32192.getClass(), "problemNodes", term32324);
        term32394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32394, term32394.getClass(), "type", 0);
        setField(term32394, term32394.getClass(), "parent", null);
        setField(term32464, term32464.getClass(), "next", null);
        setIntField(term32464, term32464.getClass(), "type", 0);
        setField(term32464, term32464.getClass(), "first", null);
        setField(term32394, term32394.getClass(), "first", term32464);
        ArrayList term172089 = new ArrayList();
        term172088 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        Object term172091 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term172088, term172088.getClass(), "level", null);
        setField(term172088, term172088.getClass(), "problemNodes", term172089);
        setField(term172091, term172091.getClass(), "options", null);
        setField(term172091, term172091.getClass(), "passes", null);
        setField(term172091, term172091.getClass(), "externs", null);
        setField(term172091, term172091.getClass(), "modules", null);
        setField(term172091, term172091.getClass(), "moduleGraph", null);
        setField(term172091, term172091.getClass(), "inputs", null);
        setField(term172091, term172091.getClass(), "errorManager", null);
        setField(term172091, term172091.getClass(), "warningsGuard", null);
        setField(term172091, term172091.getClass(), "injectedLibraries", null);
        setField(term172091, term172091.getClass(), "externsRoot", null);
        setField(term172091, term172091.getClass(), "jsRoot", null);
        setField(term172091, term172091.getClass(), "externAndJsRoot", null);
        setField(term172091, term172091.getClass(), "inputsById", null);
        setField(term172091, term172091.getClass(), "sourceMap", null);
        setField(term172091, term172091.getClass(), "externExports", null);
        setIntField(term172091, term172091.getClass(), "uniqueNameId", 0);
        setBooleanField(term172091, term172091.getClass(), "useThreads", false);
        setBooleanField(term172091, term172091.getClass(), "hasRegExpGlobalReferences", false);
        setField(term172091, term172091.getClass(), "functionInformationMap", null);
        setField(term172091, term172091.getClass(), "debugLog", null);
        setField(term172091, term172091.getClass(), "defaultCodingConvention", null);
        setField(term172091, term172091.getClass(), "typeRegistry", null);
        setField(term172091, term172091.getClass(), "parserConfig", null);
        setField(term172091, term172091.getClass(), "abstractInterpreter", null);
        setField(term172091, term172091.getClass(), "typeValidator", null);
        setField(term172091, term172091.getClass(), "tracker", null);
        setField(term172091, term172091.getClass(), "oldErrorReporter", null);
        setField(term172091, term172091.getClass(), "defaultErrorReporter", null);
        setField(term172091, term172091.getClass(), "outStream", null);
        setField(term172091, term172091.getClass(), "globalRefMap", null);
        setDoubleField(term172091, term172091.getClass(), "progress", 0.0);
        setField(term172091, term172091.getClass(), "sanityCheck", null);
        setField(term172091, term172091.getClass(), "currentTracer", null);
        setField(term172091, term172091.getClass(), "currentPassName", null);
        setIntField(term172091, term172091.getClass(), "syntheticCodeId", 0);
        setField(term172091, term172091.getClass(), "recentChange", null);
        setField(term172091, term172091.getClass(), "codeChangeHandlers", null);
        setField(term172091, term172091.getClass(), "synthesizedExternsInput", null);
        setField(term172091, term172091.getClass(), "stage", null);
        setField(term172088, term172088.getClass(), "compiler", term172091);
        setBooleanField(term172088, term172088.getClass(), "protectSideEffectFreeCode", true);
        term172092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term172093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term172092, term172092.getClass(), "type", 0);
        setField(term172092, term172092.getClass(), "next", null);
        setIntField(term172093, term172093.getClass(), "type", 0);
        setField(term172093, term172093.getClass(), "next", null);
        setField(term172093, term172093.getClass(), "first", null);
        setField(term172093, term172093.getClass(), "last", null);
        setField(term172093, term172093.getClass(), "propListHead", null);
        setIntField(term172093, term172093.getClass(), "sourcePosition", 0);
        setField(term172093, term172093.getClass(), "jsType", null);
        setField(term172093, term172093.getClass(), "parent", null);
        setField(term172092, term172092.getClass(), "first", term172093);
        setField(term172092, term172092.getClass(), "last", null);
        setField(term172092, term172092.getClass(), "propListHead", null);
        setIntField(term172092, term172092.getClass(), "sourcePosition", 0);
        setField(term172092, term172092.getClass(), "jsType", null);
        setField(term172092, term172092.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term32394;
        callMethod(klass, "process", argTypes, term32192, args);
        assertTrue(recursiveEquals(term32192, term172088));
        assertTrue(recursiveEquals(term32394, null));
    }

};


