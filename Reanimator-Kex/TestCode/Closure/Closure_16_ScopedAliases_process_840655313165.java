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

public class ScopedAliases_process_840655313165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99867;
     Object term100039;
     Object term100885;
     Object term100887;

    public ScopedAliases_process_840655313165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99867 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term99947 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term99867, term99867.getClass(), "compiler", term99947);
        term100039 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term100131 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term100039, term100039.getClass(), "type", 0);
        setIntField(term100131, term100131.getClass(), "type", 0);
        setField(term100131, term100131.getClass(), "parent", null);
        setField(term100039, term100039.getClass(), "parent", term100131);
        setField(term100039, term100039.getClass(), "first", null);
        term100885 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term100886 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term100886, term100886.getClass(), "options", null);
        setField(term100886, term100886.getClass(), "passes", null);
        setField(term100886, term100886.getClass(), "externs", null);
        setField(term100886, term100886.getClass(), "modules", null);
        setField(term100886, term100886.getClass(), "moduleGraph", null);
        setField(term100886, term100886.getClass(), "inputs", null);
        setField(term100886, term100886.getClass(), "errorManager", null);
        setField(term100886, term100886.getClass(), "warningsGuard", null);
        setField(term100886, term100886.getClass(), "injectedLibraries", null);
        setField(term100886, term100886.getClass(), "externsRoot", null);
        setField(term100886, term100886.getClass(), "jsRoot", null);
        setField(term100886, term100886.getClass(), "externAndJsRoot", null);
        setField(term100886, term100886.getClass(), "inputsById", null);
        setField(term100886, term100886.getClass(), "sourceMap", null);
        setField(term100886, term100886.getClass(), "externExports", null);
        setIntField(term100886, term100886.getClass(), "uniqueNameId", 0);
        setBooleanField(term100886, term100886.getClass(), "useThreads", false);
        setBooleanField(term100886, term100886.getClass(), "hasRegExpGlobalReferences", false);
        setField(term100886, term100886.getClass(), "functionInformationMap", null);
        setField(term100886, term100886.getClass(), "debugLog", null);
        setField(term100886, term100886.getClass(), "defaultCodingConvention", null);
        setField(term100886, term100886.getClass(), "typeRegistry", null);
        setField(term100886, term100886.getClass(), "parserConfig", null);
        setField(term100886, term100886.getClass(), "abstractInterpreter", null);
        setField(term100886, term100886.getClass(), "typeValidator", null);
        setField(term100886, term100886.getClass(), "tracker", null);
        setField(term100886, term100886.getClass(), "oldErrorReporter", null);
        setField(term100886, term100886.getClass(), "defaultErrorReporter", null);
        setField(term100886, term100886.getClass(), "outStream", null);
        setField(term100886, term100886.getClass(), "globalRefMap", null);
        setDoubleField(term100886, term100886.getClass(), "progress", 0.0);
        setField(term100886, term100886.getClass(), "sanityCheck", null);
        setField(term100886, term100886.getClass(), "currentTracer", null);
        setField(term100886, term100886.getClass(), "currentPassName", null);
        setIntField(term100886, term100886.getClass(), "syntheticCodeId", 0);
        setField(term100886, term100886.getClass(), "recentChange", null);
        setField(term100886, term100886.getClass(), "codeChangeHandlers", null);
        setField(term100886, term100886.getClass(), "synthesizedExternsInput", null);
        setField(term100886, term100886.getClass(), "stage", null);
        setField(term100885, term100885.getClass(), "compiler", term100886);
        setField(term100885, term100885.getClass(), "preprocessorSymbolTable", null);
        setField(term100885, term100885.getClass(), "transformationHandler", null);
        term100887 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term100888 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term100887, term100887.getClass(), "str", null);
        setIntField(term100887, term100887.getClass(), "type", 0);
        setField(term100887, term100887.getClass(), "next", null);
        setField(term100887, term100887.getClass(), "first", null);
        setField(term100887, term100887.getClass(), "last", null);
        setField(term100887, term100887.getClass(), "propListHead", null);
        setIntField(term100887, term100887.getClass(), "sourcePosition", 0);
        setField(term100887, term100887.getClass(), "jsType", null);
        setField(term100888, term100888.getClass(), "str", null);
        setIntField(term100888, term100888.getClass(), "type", 0);
        setField(term100888, term100888.getClass(), "next", null);
        setField(term100888, term100888.getClass(), "first", null);
        setField(term100888, term100888.getClass(), "last", null);
        setField(term100888, term100888.getClass(), "propListHead", null);
        setIntField(term100888, term100888.getClass(), "sourcePosition", 0);
        setField(term100888, term100888.getClass(), "jsType", null);
        setField(term100888, term100888.getClass(), "parent", null);
        setField(term100887, term100887.getClass(), "parent", term100888);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term100039;
        callMethod(klass, "process", argTypes, term99867, args);
        assertTrue(recursiveEquals(term99867, term100885));
        assertTrue(recursiveEquals(term100039, null));
    }

};


