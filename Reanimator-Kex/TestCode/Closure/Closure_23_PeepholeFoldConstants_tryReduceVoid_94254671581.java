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

public class PeepholeFoldConstants_tryReduceVoid_94254671581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8922;
     Object term9072;
     Object term11039;
     Object term11041;
     Object term10999;

    public PeepholeFoldConstants_tryReduceVoid_94254671581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8922 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term9002 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term8922, term8922.getClass(), "compiler", term9002);
        term9072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9142, term9142.getClass(), "type", 134);
        setField(term9072, term9072.getClass(), "first", term9142);
        setIntField(term9072, term9072.getClass(), "type", 134);
        term11039 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term11040 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setBooleanField(term11039, term11039.getClass(), "late", false);
        setField(term11040, term11040.getClass(), "options", null);
        setField(term11040, term11040.getClass(), "passes", null);
        setField(term11040, term11040.getClass(), "externs", null);
        setField(term11040, term11040.getClass(), "modules", null);
        setField(term11040, term11040.getClass(), "moduleGraph", null);
        setField(term11040, term11040.getClass(), "inputs", null);
        setField(term11040, term11040.getClass(), "errorManager", null);
        setField(term11040, term11040.getClass(), "warningsGuard", null);
        setField(term11040, term11040.getClass(), "injectedLibraries", null);
        setField(term11040, term11040.getClass(), "externsRoot", null);
        setField(term11040, term11040.getClass(), "jsRoot", null);
        setField(term11040, term11040.getClass(), "externAndJsRoot", null);
        setField(term11040, term11040.getClass(), "inputsById", null);
        setField(term11040, term11040.getClass(), "sourceMap", null);
        setField(term11040, term11040.getClass(), "externExports", null);
        setIntField(term11040, term11040.getClass(), "uniqueNameId", 0);
        setBooleanField(term11040, term11040.getClass(), "useThreads", false);
        setBooleanField(term11040, term11040.getClass(), "hasRegExpGlobalReferences", false);
        setField(term11040, term11040.getClass(), "functionInformationMap", null);
        setField(term11040, term11040.getClass(), "debugLog", null);
        setField(term11040, term11040.getClass(), "defaultCodingConvention", null);
        setField(term11040, term11040.getClass(), "typeRegistry", null);
        setField(term11040, term11040.getClass(), "parserConfig", null);
        setField(term11040, term11040.getClass(), "abstractInterpreter", null);
        setField(term11040, term11040.getClass(), "typeValidator", null);
        setField(term11040, term11040.getClass(), "tracker", null);
        setField(term11040, term11040.getClass(), "oldErrorReporter", null);
        setField(term11040, term11040.getClass(), "defaultErrorReporter", null);
        setField(term11040, term11040.getClass(), "outStream", null);
        setField(term11040, term11040.getClass(), "globalRefMap", null);
        setDoubleField(term11040, term11040.getClass(), "progress", 0.0);
        setField(term11040, term11040.getClass(), "sanityCheck", null);
        setField(term11040, term11040.getClass(), "currentTracer", null);
        setField(term11040, term11040.getClass(), "currentPassName", null);
        setIntField(term11040, term11040.getClass(), "syntheticCodeId", 0);
        setField(term11040, term11040.getClass(), "recentChange", null);
        setField(term11040, term11040.getClass(), "codeChangeHandlers", null);
        setField(term11040, term11040.getClass(), "synthesizedExternsInput", null);
        setField(term11040, term11040.getClass(), "stage", null);
        setField(term11039, term11039.getClass(), "compiler", term11040);
        term11041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11041, term11041.getClass(), "type", 134);
        setField(term11041, term11041.getClass(), "next", null);
        setIntField(term11042, term11042.getClass(), "type", 134);
        setField(term11042, term11042.getClass(), "next", null);
        setField(term11042, term11042.getClass(), "first", null);
        setField(term11042, term11042.getClass(), "last", null);
        setField(term11042, term11042.getClass(), "propListHead", null);
        setIntField(term11042, term11042.getClass(), "sourcePosition", 0);
        setField(term11042, term11042.getClass(), "jsType", null);
        setField(term11042, term11042.getClass(), "parent", null);
        setField(term11041, term11041.getClass(), "first", term11042);
        setField(term11041, term11041.getClass(), "last", null);
        setField(term11041, term11041.getClass(), "propListHead", null);
        setIntField(term11041, term11041.getClass(), "sourcePosition", 0);
        setField(term11041, term11041.getClass(), "jsType", null);
        setField(term11041, term11041.getClass(), "parent", null);
        term10999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10999, term10999.getClass(), "type", 134);
        setField(term10999, term10999.getClass(), "next", null);
        setIntField(term11001, term11001.getClass(), "type", 134);
        setField(term11001, term11001.getClass(), "next", null);
        setField(term11001, term11001.getClass(), "first", null);
        setField(term11001, term11001.getClass(), "last", null);
        setField(term11001, term11001.getClass(), "propListHead", null);
        setIntField(term11001, term11001.getClass(), "sourcePosition", 0);
        setField(term11001, term11001.getClass(), "jsType", null);
        setField(term11001, term11001.getClass(), "parent", null);
        setField(term10999, term10999.getClass(), "first", term11001);
        setField(term10999, term10999.getClass(), "last", null);
        setField(term10999, term10999.getClass(), "propListHead", null);
        setIntField(term10999, term10999.getClass(), "sourcePosition", 0);
        setField(term10999, term10999.getClass(), "jsType", null);
        setField(term10999, term10999.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term9072;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term8922, args);
        assertTrue(recursiveEquals(term8922, term11039));
        assertTrue(recursiveEquals(term9072, term11041));
        assertTrue(recursiveEquals(retValue, term10999));
    }

};


