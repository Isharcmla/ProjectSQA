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

public class ScopedAliases_process_84065531365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30317;
     Object term30467;
     Object term31206;
     Object term31208;

    public ScopedAliases_process_84065531365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30317 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term30397 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term30317, term30317.getClass(), "compiler", term30397);
        term30467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30467, term30467.getClass(), "type", 0);
        setIntField(term30537, term30537.getClass(), "type", 0);
        setField(term30537, term30537.getClass(), "parent", null);
        setField(term30467, term30467.getClass(), "parent", term30537);
        setField(term30467, term30467.getClass(), "first", null);
        term31206 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term31207 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term31207, term31207.getClass(), "options", null);
        setField(term31207, term31207.getClass(), "passes", null);
        setField(term31207, term31207.getClass(), "externs", null);
        setField(term31207, term31207.getClass(), "modules", null);
        setField(term31207, term31207.getClass(), "moduleGraph", null);
        setField(term31207, term31207.getClass(), "inputs", null);
        setField(term31207, term31207.getClass(), "errorManager", null);
        setField(term31207, term31207.getClass(), "warningsGuard", null);
        setField(term31207, term31207.getClass(), "externsRoot", null);
        setField(term31207, term31207.getClass(), "jsRoot", null);
        setField(term31207, term31207.getClass(), "externAndJsRoot", null);
        setField(term31207, term31207.getClass(), "inputsById", null);
        setField(term31207, term31207.getClass(), "sourceMap", null);
        setField(term31207, term31207.getClass(), "externExports", null);
        setIntField(term31207, term31207.getClass(), "uniqueNameId", 0);
        setBooleanField(term31207, term31207.getClass(), "useThreads", false);
        setBooleanField(term31207, term31207.getClass(), "hasRegExpGlobalReferences", false);
        setField(term31207, term31207.getClass(), "functionInformationMap", null);
        setField(term31207, term31207.getClass(), "debugLog", null);
        setField(term31207, term31207.getClass(), "defaultCodingConvention", null);
        setField(term31207, term31207.getClass(), "typeRegistry", null);
        setField(term31207, term31207.getClass(), "parserConfig", null);
        setField(term31207, term31207.getClass(), "abstractInterpreter", null);
        setField(term31207, term31207.getClass(), "typeValidator", null);
        setField(term31207, term31207.getClass(), "tracker", null);
        setField(term31207, term31207.getClass(), "oldErrorReporter", null);
        setField(term31207, term31207.getClass(), "defaultErrorReporter", null);
        setField(term31207, term31207.getClass(), "outStream", null);
        setField(term31207, term31207.getClass(), "globalRefMap", null);
        setField(term31207, term31207.getClass(), "sanityCheck", null);
        setField(term31207, term31207.getClass(), "currentTracer", null);
        setField(term31207, term31207.getClass(), "currentPassName", null);
        setIntField(term31207, term31207.getClass(), "syntheticCodeId", 0);
        setField(term31207, term31207.getClass(), "recentChange", null);
        setField(term31207, term31207.getClass(), "codeChangeHandlers", null);
        setField(term31207, term31207.getClass(), "stage", null);
        setField(term31206, term31206.getClass(), "compiler", term31207);
        setField(term31206, term31206.getClass(), "preprocessorSymbolTable", null);
        setField(term31206, term31206.getClass(), "transformationHandler", null);
        term31208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31208, term31208.getClass(), "type", 0);
        setField(term31208, term31208.getClass(), "next", null);
        setField(term31208, term31208.getClass(), "first", null);
        setField(term31208, term31208.getClass(), "last", null);
        setField(term31208, term31208.getClass(), "propListHead", null);
        setIntField(term31208, term31208.getClass(), "sourcePosition", 0);
        setField(term31208, term31208.getClass(), "jsType", null);
        setIntField(term31209, term31209.getClass(), "type", 0);
        setField(term31209, term31209.getClass(), "next", null);
        setField(term31209, term31209.getClass(), "first", null);
        setField(term31209, term31209.getClass(), "last", null);
        setField(term31209, term31209.getClass(), "propListHead", null);
        setIntField(term31209, term31209.getClass(), "sourcePosition", 0);
        setField(term31209, term31209.getClass(), "jsType", null);
        setField(term31209, term31209.getClass(), "parent", null);
        setField(term31208, term31208.getClass(), "parent", term31209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term30467;
        callMethod(klass, "process", argTypes, term30317, args);
        assertTrue(recursiveEquals(term30317, term31206));
        assertTrue(recursiveEquals(term30467, null));
    }

};


