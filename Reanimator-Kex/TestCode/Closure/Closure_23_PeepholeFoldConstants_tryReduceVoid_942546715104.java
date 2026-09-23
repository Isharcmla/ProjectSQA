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

public class PeepholeFoldConstants_tryReduceVoid_942546715104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13524;
     Object term13674;
     Object term13978;
     Object term13980;
     Object term13938;

    public PeepholeFoldConstants_tryReduceVoid_942546715104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13524 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term13604 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term13524, term13524.getClass(), "compiler", term13604);
        term13674 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13744, term13744.getClass(), "type", 120);
        setField(term13674, term13674.getClass(), "first", term13744);
        setIntField(term13674, term13674.getClass(), "type", 120);
        term13978 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term13979 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setBooleanField(term13978, term13978.getClass(), "late", false);
        setField(term13979, term13979.getClass(), "options", null);
        setField(term13979, term13979.getClass(), "passes", null);
        setField(term13979, term13979.getClass(), "externs", null);
        setField(term13979, term13979.getClass(), "modules", null);
        setField(term13979, term13979.getClass(), "moduleGraph", null);
        setField(term13979, term13979.getClass(), "inputs", null);
        setField(term13979, term13979.getClass(), "errorManager", null);
        setField(term13979, term13979.getClass(), "warningsGuard", null);
        setField(term13979, term13979.getClass(), "injectedLibraries", null);
        setField(term13979, term13979.getClass(), "externsRoot", null);
        setField(term13979, term13979.getClass(), "jsRoot", null);
        setField(term13979, term13979.getClass(), "externAndJsRoot", null);
        setField(term13979, term13979.getClass(), "inputsById", null);
        setField(term13979, term13979.getClass(), "sourceMap", null);
        setField(term13979, term13979.getClass(), "externExports", null);
        setIntField(term13979, term13979.getClass(), "uniqueNameId", 0);
        setBooleanField(term13979, term13979.getClass(), "useThreads", false);
        setBooleanField(term13979, term13979.getClass(), "hasRegExpGlobalReferences", false);
        setField(term13979, term13979.getClass(), "functionInformationMap", null);
        setField(term13979, term13979.getClass(), "debugLog", null);
        setField(term13979, term13979.getClass(), "defaultCodingConvention", null);
        setField(term13979, term13979.getClass(), "typeRegistry", null);
        setField(term13979, term13979.getClass(), "parserConfig", null);
        setField(term13979, term13979.getClass(), "abstractInterpreter", null);
        setField(term13979, term13979.getClass(), "typeValidator", null);
        setField(term13979, term13979.getClass(), "tracker", null);
        setField(term13979, term13979.getClass(), "oldErrorReporter", null);
        setField(term13979, term13979.getClass(), "defaultErrorReporter", null);
        setField(term13979, term13979.getClass(), "outStream", null);
        setField(term13979, term13979.getClass(), "globalRefMap", null);
        setDoubleField(term13979, term13979.getClass(), "progress", 0.0);
        setField(term13979, term13979.getClass(), "sanityCheck", null);
        setField(term13979, term13979.getClass(), "currentTracer", null);
        setField(term13979, term13979.getClass(), "currentPassName", null);
        setIntField(term13979, term13979.getClass(), "syntheticCodeId", 0);
        setField(term13979, term13979.getClass(), "recentChange", null);
        setField(term13979, term13979.getClass(), "codeChangeHandlers", null);
        setField(term13979, term13979.getClass(), "synthesizedExternsInput", null);
        setField(term13979, term13979.getClass(), "stage", null);
        setField(term13978, term13978.getClass(), "compiler", term13979);
        term13980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13980, term13980.getClass(), "type", 120);
        setField(term13980, term13980.getClass(), "next", null);
        setIntField(term13981, term13981.getClass(), "type", 120);
        setField(term13981, term13981.getClass(), "next", null);
        setField(term13981, term13981.getClass(), "first", null);
        setField(term13981, term13981.getClass(), "last", null);
        setField(term13981, term13981.getClass(), "propListHead", null);
        setIntField(term13981, term13981.getClass(), "sourcePosition", 0);
        setField(term13981, term13981.getClass(), "jsType", null);
        setField(term13981, term13981.getClass(), "parent", null);
        setField(term13980, term13980.getClass(), "first", term13981);
        setField(term13980, term13980.getClass(), "last", null);
        setField(term13980, term13980.getClass(), "propListHead", null);
        setIntField(term13980, term13980.getClass(), "sourcePosition", 0);
        setField(term13980, term13980.getClass(), "jsType", null);
        setField(term13980, term13980.getClass(), "parent", null);
        term13938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13938, term13938.getClass(), "type", 120);
        setField(term13938, term13938.getClass(), "next", null);
        setIntField(term13940, term13940.getClass(), "type", 120);
        setField(term13940, term13940.getClass(), "next", null);
        setField(term13940, term13940.getClass(), "first", null);
        setField(term13940, term13940.getClass(), "last", null);
        setField(term13940, term13940.getClass(), "propListHead", null);
        setIntField(term13940, term13940.getClass(), "sourcePosition", 0);
        setField(term13940, term13940.getClass(), "jsType", null);
        setField(term13940, term13940.getClass(), "parent", null);
        setField(term13938, term13938.getClass(), "first", term13940);
        setField(term13938, term13938.getClass(), "last", null);
        setField(term13938, term13938.getClass(), "propListHead", null);
        setIntField(term13938, term13938.getClass(), "sourcePosition", 0);
        setField(term13938, term13938.getClass(), "jsType", null);
        setField(term13938, term13938.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term13674;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term13524, args);
        assertTrue(recursiveEquals(term13524, term13978));
        assertTrue(recursiveEquals(term13674, term13980));
        assertTrue(recursiveEquals(retValue, term13938));
    }

};


