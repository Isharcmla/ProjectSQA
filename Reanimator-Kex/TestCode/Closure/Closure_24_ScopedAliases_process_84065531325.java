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

public class ScopedAliases_process_84065531325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13214;
     Object term13364;
     Object term13781;
     Object term13783;

    public ScopedAliases_process_84065531325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13214 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term13294 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term13214, term13214.getClass(), "compiler", term13294);
        term13364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13364, term13364.getClass(), "type", 0);
        setIntField(term13434, term13434.getClass(), "type", 0);
        setField(term13434, term13434.getClass(), "parent", null);
        setField(term13364, term13364.getClass(), "parent", term13434);
        setField(term13364, term13364.getClass(), "first", null);
        term13781 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term13782 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term13782, term13782.getClass(), "options", null);
        setField(term13782, term13782.getClass(), "passes", null);
        setField(term13782, term13782.getClass(), "externs", null);
        setField(term13782, term13782.getClass(), "modules", null);
        setField(term13782, term13782.getClass(), "moduleGraph", null);
        setField(term13782, term13782.getClass(), "inputs", null);
        setField(term13782, term13782.getClass(), "errorManager", null);
        setField(term13782, term13782.getClass(), "warningsGuard", null);
        setField(term13782, term13782.getClass(), "injectedLibraries", null);
        setField(term13782, term13782.getClass(), "externsRoot", null);
        setField(term13782, term13782.getClass(), "jsRoot", null);
        setField(term13782, term13782.getClass(), "externAndJsRoot", null);
        setField(term13782, term13782.getClass(), "inputsById", null);
        setField(term13782, term13782.getClass(), "sourceMap", null);
        setField(term13782, term13782.getClass(), "externExports", null);
        setIntField(term13782, term13782.getClass(), "uniqueNameId", 0);
        setBooleanField(term13782, term13782.getClass(), "useThreads", false);
        setBooleanField(term13782, term13782.getClass(), "hasRegExpGlobalReferences", false);
        setField(term13782, term13782.getClass(), "functionInformationMap", null);
        setField(term13782, term13782.getClass(), "debugLog", null);
        setField(term13782, term13782.getClass(), "defaultCodingConvention", null);
        setField(term13782, term13782.getClass(), "typeRegistry", null);
        setField(term13782, term13782.getClass(), "parserConfig", null);
        setField(term13782, term13782.getClass(), "abstractInterpreter", null);
        setField(term13782, term13782.getClass(), "typeValidator", null);
        setField(term13782, term13782.getClass(), "tracker", null);
        setField(term13782, term13782.getClass(), "oldErrorReporter", null);
        setField(term13782, term13782.getClass(), "defaultErrorReporter", null);
        setField(term13782, term13782.getClass(), "outStream", null);
        setField(term13782, term13782.getClass(), "globalRefMap", null);
        setDoubleField(term13782, term13782.getClass(), "progress", 0.0);
        setField(term13782, term13782.getClass(), "sanityCheck", null);
        setField(term13782, term13782.getClass(), "currentTracer", null);
        setField(term13782, term13782.getClass(), "currentPassName", null);
        setIntField(term13782, term13782.getClass(), "syntheticCodeId", 0);
        setField(term13782, term13782.getClass(), "recentChange", null);
        setField(term13782, term13782.getClass(), "codeChangeHandlers", null);
        setField(term13782, term13782.getClass(), "synthesizedExternsInput", null);
        setField(term13782, term13782.getClass(), "stage", null);
        setField(term13781, term13781.getClass(), "compiler", term13782);
        setField(term13781, term13781.getClass(), "preprocessorSymbolTable", null);
        setField(term13781, term13781.getClass(), "transformationHandler", null);
        term13783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13783, term13783.getClass(), "type", 0);
        setField(term13783, term13783.getClass(), "next", null);
        setField(term13783, term13783.getClass(), "first", null);
        setField(term13783, term13783.getClass(), "last", null);
        setField(term13783, term13783.getClass(), "propListHead", null);
        setIntField(term13783, term13783.getClass(), "sourcePosition", 0);
        setField(term13783, term13783.getClass(), "jsType", null);
        setIntField(term13784, term13784.getClass(), "type", 0);
        setField(term13784, term13784.getClass(), "next", null);
        setField(term13784, term13784.getClass(), "first", null);
        setField(term13784, term13784.getClass(), "last", null);
        setField(term13784, term13784.getClass(), "propListHead", null);
        setIntField(term13784, term13784.getClass(), "sourcePosition", 0);
        setField(term13784, term13784.getClass(), "jsType", null);
        setField(term13784, term13784.getClass(), "parent", null);
        setField(term13783, term13783.getClass(), "parent", term13784);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term13364;
        callMethod(klass, "process", argTypes, term13214, args);
        assertTrue(recursiveEquals(term13214, term13781));
        assertTrue(recursiveEquals(term13364, null));
    }

};


