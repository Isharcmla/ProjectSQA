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

public class PeepholeFoldConstants_tryReduceVoid_94254671593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12227;
     Object term12377;
     Object term12538;
     Object term12540;
     Object term12498;

    public PeepholeFoldConstants_tryReduceVoid_94254671593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12227 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term12307 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term12227, term12227.getClass(), "compiler", term12307);
        term12377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12447, term12447.getClass(), "type", 34);
        setField(term12377, term12377.getClass(), "first", term12447);
        setIntField(term12377, term12377.getClass(), "type", 34);
        term12538 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term12539 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setBooleanField(term12538, term12538.getClass(), "late", false);
        setField(term12539, term12539.getClass(), "options", null);
        setField(term12539, term12539.getClass(), "passes", null);
        setField(term12539, term12539.getClass(), "externs", null);
        setField(term12539, term12539.getClass(), "modules", null);
        setField(term12539, term12539.getClass(), "moduleGraph", null);
        setField(term12539, term12539.getClass(), "inputs", null);
        setField(term12539, term12539.getClass(), "errorManager", null);
        setField(term12539, term12539.getClass(), "warningsGuard", null);
        setField(term12539, term12539.getClass(), "injectedLibraries", null);
        setField(term12539, term12539.getClass(), "externsRoot", null);
        setField(term12539, term12539.getClass(), "jsRoot", null);
        setField(term12539, term12539.getClass(), "externAndJsRoot", null);
        setField(term12539, term12539.getClass(), "inputsById", null);
        setField(term12539, term12539.getClass(), "sourceMap", null);
        setField(term12539, term12539.getClass(), "externExports", null);
        setIntField(term12539, term12539.getClass(), "uniqueNameId", 0);
        setBooleanField(term12539, term12539.getClass(), "useThreads", false);
        setBooleanField(term12539, term12539.getClass(), "hasRegExpGlobalReferences", false);
        setField(term12539, term12539.getClass(), "functionInformationMap", null);
        setField(term12539, term12539.getClass(), "debugLog", null);
        setField(term12539, term12539.getClass(), "defaultCodingConvention", null);
        setField(term12539, term12539.getClass(), "typeRegistry", null);
        setField(term12539, term12539.getClass(), "parserConfig", null);
        setField(term12539, term12539.getClass(), "abstractInterpreter", null);
        setField(term12539, term12539.getClass(), "typeValidator", null);
        setField(term12539, term12539.getClass(), "tracker", null);
        setField(term12539, term12539.getClass(), "oldErrorReporter", null);
        setField(term12539, term12539.getClass(), "defaultErrorReporter", null);
        setField(term12539, term12539.getClass(), "outStream", null);
        setField(term12539, term12539.getClass(), "globalRefMap", null);
        setDoubleField(term12539, term12539.getClass(), "progress", 0.0);
        setField(term12539, term12539.getClass(), "sanityCheck", null);
        setField(term12539, term12539.getClass(), "currentTracer", null);
        setField(term12539, term12539.getClass(), "currentPassName", null);
        setIntField(term12539, term12539.getClass(), "syntheticCodeId", 0);
        setField(term12539, term12539.getClass(), "recentChange", null);
        setField(term12539, term12539.getClass(), "codeChangeHandlers", null);
        setField(term12539, term12539.getClass(), "synthesizedExternsInput", null);
        setField(term12539, term12539.getClass(), "stage", null);
        setField(term12538, term12538.getClass(), "compiler", term12539);
        term12540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12541 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12540, term12540.getClass(), "type", 34);
        setField(term12540, term12540.getClass(), "next", null);
        setIntField(term12541, term12541.getClass(), "type", 34);
        setField(term12541, term12541.getClass(), "next", null);
        setField(term12541, term12541.getClass(), "first", null);
        setField(term12541, term12541.getClass(), "last", null);
        setField(term12541, term12541.getClass(), "propListHead", null);
        setIntField(term12541, term12541.getClass(), "sourcePosition", 0);
        setField(term12541, term12541.getClass(), "jsType", null);
        setField(term12541, term12541.getClass(), "parent", null);
        setField(term12540, term12540.getClass(), "first", term12541);
        setField(term12540, term12540.getClass(), "last", null);
        setField(term12540, term12540.getClass(), "propListHead", null);
        setIntField(term12540, term12540.getClass(), "sourcePosition", 0);
        setField(term12540, term12540.getClass(), "jsType", null);
        setField(term12540, term12540.getClass(), "parent", null);
        term12498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12498, term12498.getClass(), "type", 34);
        setField(term12498, term12498.getClass(), "next", null);
        setIntField(term12500, term12500.getClass(), "type", 34);
        setField(term12500, term12500.getClass(), "next", null);
        setField(term12500, term12500.getClass(), "first", null);
        setField(term12500, term12500.getClass(), "last", null);
        setField(term12500, term12500.getClass(), "propListHead", null);
        setIntField(term12500, term12500.getClass(), "sourcePosition", 0);
        setField(term12500, term12500.getClass(), "jsType", null);
        setField(term12500, term12500.getClass(), "parent", null);
        setField(term12498, term12498.getClass(), "first", term12500);
        setField(term12498, term12498.getClass(), "last", null);
        setField(term12498, term12498.getClass(), "propListHead", null);
        setIntField(term12498, term12498.getClass(), "sourcePosition", 0);
        setField(term12498, term12498.getClass(), "jsType", null);
        setField(term12498, term12498.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term12377;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term12227, args);
        assertTrue(recursiveEquals(term12227, term12538));
        assertTrue(recursiveEquals(term12377, term12540));
        assertTrue(recursiveEquals(retValue, term12498));
    }

};


