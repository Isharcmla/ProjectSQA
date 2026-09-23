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

public class PeepholeFoldConstants_tryReduceVoid_94254671582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9274;
     Object term9424;
     Object term11086;
     Object term11088;
     Object term11046;

    public PeepholeFoldConstants_tryReduceVoid_94254671582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9274 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term9354 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term9274, term9274.getClass(), "compiler", term9354);
        term9424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9494, term9494.getClass(), "type", 149);
        setField(term9424, term9424.getClass(), "first", term9494);
        setIntField(term9424, term9424.getClass(), "type", 149);
        term11086 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term11087 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setBooleanField(term11086, term11086.getClass(), "late", false);
        setField(term11087, term11087.getClass(), "options", null);
        setField(term11087, term11087.getClass(), "passes", null);
        setField(term11087, term11087.getClass(), "externs", null);
        setField(term11087, term11087.getClass(), "modules", null);
        setField(term11087, term11087.getClass(), "moduleGraph", null);
        setField(term11087, term11087.getClass(), "inputs", null);
        setField(term11087, term11087.getClass(), "errorManager", null);
        setField(term11087, term11087.getClass(), "warningsGuard", null);
        setField(term11087, term11087.getClass(), "injectedLibraries", null);
        setField(term11087, term11087.getClass(), "externsRoot", null);
        setField(term11087, term11087.getClass(), "jsRoot", null);
        setField(term11087, term11087.getClass(), "externAndJsRoot", null);
        setField(term11087, term11087.getClass(), "inputsById", null);
        setField(term11087, term11087.getClass(), "sourceMap", null);
        setField(term11087, term11087.getClass(), "externExports", null);
        setIntField(term11087, term11087.getClass(), "uniqueNameId", 0);
        setBooleanField(term11087, term11087.getClass(), "useThreads", false);
        setBooleanField(term11087, term11087.getClass(), "hasRegExpGlobalReferences", false);
        setField(term11087, term11087.getClass(), "functionInformationMap", null);
        setField(term11087, term11087.getClass(), "debugLog", null);
        setField(term11087, term11087.getClass(), "defaultCodingConvention", null);
        setField(term11087, term11087.getClass(), "typeRegistry", null);
        setField(term11087, term11087.getClass(), "parserConfig", null);
        setField(term11087, term11087.getClass(), "abstractInterpreter", null);
        setField(term11087, term11087.getClass(), "typeValidator", null);
        setField(term11087, term11087.getClass(), "tracker", null);
        setField(term11087, term11087.getClass(), "oldErrorReporter", null);
        setField(term11087, term11087.getClass(), "defaultErrorReporter", null);
        setField(term11087, term11087.getClass(), "outStream", null);
        setField(term11087, term11087.getClass(), "globalRefMap", null);
        setDoubleField(term11087, term11087.getClass(), "progress", 0.0);
        setField(term11087, term11087.getClass(), "sanityCheck", null);
        setField(term11087, term11087.getClass(), "currentTracer", null);
        setField(term11087, term11087.getClass(), "currentPassName", null);
        setIntField(term11087, term11087.getClass(), "syntheticCodeId", 0);
        setField(term11087, term11087.getClass(), "recentChange", null);
        setField(term11087, term11087.getClass(), "codeChangeHandlers", null);
        setField(term11087, term11087.getClass(), "synthesizedExternsInput", null);
        setField(term11087, term11087.getClass(), "stage", null);
        setField(term11086, term11086.getClass(), "compiler", term11087);
        term11088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11088, term11088.getClass(), "type", 149);
        setField(term11088, term11088.getClass(), "next", null);
        setIntField(term11089, term11089.getClass(), "type", 149);
        setField(term11089, term11089.getClass(), "next", null);
        setField(term11089, term11089.getClass(), "first", null);
        setField(term11089, term11089.getClass(), "last", null);
        setField(term11089, term11089.getClass(), "propListHead", null);
        setIntField(term11089, term11089.getClass(), "sourcePosition", 0);
        setField(term11089, term11089.getClass(), "jsType", null);
        setField(term11089, term11089.getClass(), "parent", null);
        setField(term11088, term11088.getClass(), "first", term11089);
        setField(term11088, term11088.getClass(), "last", null);
        setField(term11088, term11088.getClass(), "propListHead", null);
        setIntField(term11088, term11088.getClass(), "sourcePosition", 0);
        setField(term11088, term11088.getClass(), "jsType", null);
        setField(term11088, term11088.getClass(), "parent", null);
        term11046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11046, term11046.getClass(), "type", 149);
        setField(term11046, term11046.getClass(), "next", null);
        setIntField(term11048, term11048.getClass(), "type", 149);
        setField(term11048, term11048.getClass(), "next", null);
        setField(term11048, term11048.getClass(), "first", null);
        setField(term11048, term11048.getClass(), "last", null);
        setField(term11048, term11048.getClass(), "propListHead", null);
        setIntField(term11048, term11048.getClass(), "sourcePosition", 0);
        setField(term11048, term11048.getClass(), "jsType", null);
        setField(term11048, term11048.getClass(), "parent", null);
        setField(term11046, term11046.getClass(), "first", term11048);
        setField(term11046, term11046.getClass(), "last", null);
        setField(term11046, term11046.getClass(), "propListHead", null);
        setIntField(term11046, term11046.getClass(), "sourcePosition", 0);
        setField(term11046, term11046.getClass(), "jsType", null);
        setField(term11046, term11046.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term9424;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term9274, args);
        assertTrue(recursiveEquals(term9274, term11086));
        assertTrue(recursiveEquals(term9424, term11088));
        assertTrue(recursiveEquals(retValue, term11046));
    }

};


