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

public class ScopedAliases_hotSwapScript_88341709255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161197;
     Object term161347;
     Object term162520;
     Object term162522;

    public ScopedAliases_hotSwapScript_88341709255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161197 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term161277 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term161197, term161197.getClass(), "compiler", term161277);
        term161347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term161417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term161487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term161557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term161627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term161347, term161347.getClass(), "type", 0);
        setField(term161347, term161347.getClass(), "parent", null);
        setField(term161487, term161487.getClass(), "next", null);
        setIntField(term161487, term161487.getClass(), "type", 0);
        setField(term161487, term161487.getClass(), "first", null);
        setField(term161417, term161417.getClass(), "next", term161487);
        setIntField(term161417, term161417.getClass(), "type", 0);
        setField(term161627, term161627.getClass(), "next", term161487);
        setIntField(term161627, term161627.getClass(), "type", 105);
        setField(term161557, term161557.getClass(), "next", term161627);
        setIntField(term161557, term161557.getClass(), "type", 105);
        setField(term161417, term161417.getClass(), "first", term161557);
        setField(term161347, term161347.getClass(), "first", term161417);
        term162520 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term162521 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term162521, term162521.getClass(), "options", null);
        setField(term162521, term162521.getClass(), "passes", null);
        setField(term162521, term162521.getClass(), "externs", null);
        setField(term162521, term162521.getClass(), "modules", null);
        setField(term162521, term162521.getClass(), "moduleGraph", null);
        setField(term162521, term162521.getClass(), "inputs", null);
        setField(term162521, term162521.getClass(), "errorManager", null);
        setField(term162521, term162521.getClass(), "warningsGuard", null);
        setField(term162521, term162521.getClass(), "injectedLibraries", null);
        setField(term162521, term162521.getClass(), "externsRoot", null);
        setField(term162521, term162521.getClass(), "jsRoot", null);
        setField(term162521, term162521.getClass(), "externAndJsRoot", null);
        setField(term162521, term162521.getClass(), "inputsById", null);
        setField(term162521, term162521.getClass(), "sourceMap", null);
        setField(term162521, term162521.getClass(), "externExports", null);
        setIntField(term162521, term162521.getClass(), "uniqueNameId", 0);
        setBooleanField(term162521, term162521.getClass(), "useThreads", false);
        setBooleanField(term162521, term162521.getClass(), "hasRegExpGlobalReferences", false);
        setField(term162521, term162521.getClass(), "functionInformationMap", null);
        setField(term162521, term162521.getClass(), "debugLog", null);
        setField(term162521, term162521.getClass(), "defaultCodingConvention", null);
        setField(term162521, term162521.getClass(), "typeRegistry", null);
        setField(term162521, term162521.getClass(), "parserConfig", null);
        setField(term162521, term162521.getClass(), "abstractInterpreter", null);
        setField(term162521, term162521.getClass(), "typeValidator", null);
        setField(term162521, term162521.getClass(), "tracker", null);
        setField(term162521, term162521.getClass(), "oldErrorReporter", null);
        setField(term162521, term162521.getClass(), "defaultErrorReporter", null);
        setField(term162521, term162521.getClass(), "outStream", null);
        setField(term162521, term162521.getClass(), "globalRefMap", null);
        setDoubleField(term162521, term162521.getClass(), "progress", 0.0);
        setField(term162521, term162521.getClass(), "sanityCheck", null);
        setField(term162521, term162521.getClass(), "currentTracer", null);
        setField(term162521, term162521.getClass(), "currentPassName", null);
        setIntField(term162521, term162521.getClass(), "syntheticCodeId", 0);
        setField(term162521, term162521.getClass(), "recentChange", null);
        setField(term162521, term162521.getClass(), "codeChangeHandlers", null);
        setField(term162521, term162521.getClass(), "synthesizedExternsInput", null);
        setField(term162521, term162521.getClass(), "stage", null);
        setField(term162520, term162520.getClass(), "compiler", term162521);
        setField(term162520, term162520.getClass(), "preprocessorSymbolTable", null);
        setField(term162520, term162520.getClass(), "transformationHandler", null);
        term162522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term162523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term162524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term162525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term162526 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term162522, term162522.getClass(), "type", 0);
        setField(term162522, term162522.getClass(), "next", null);
        setIntField(term162523, term162523.getClass(), "type", 0);
        setIntField(term162524, term162524.getClass(), "type", 0);
        setField(term162524, term162524.getClass(), "next", null);
        setField(term162524, term162524.getClass(), "first", null);
        setField(term162524, term162524.getClass(), "last", null);
        setField(term162524, term162524.getClass(), "propListHead", null);
        setIntField(term162524, term162524.getClass(), "sourcePosition", 0);
        setField(term162524, term162524.getClass(), "jsType", null);
        setField(term162524, term162524.getClass(), "parent", null);
        setField(term162523, term162523.getClass(), "next", term162524);
        setIntField(term162525, term162525.getClass(), "type", 105);
        setIntField(term162526, term162526.getClass(), "type", 105);
        setField(term162526, term162526.getClass(), "next", term162524);
        setField(term162526, term162526.getClass(), "first", null);
        setField(term162526, term162526.getClass(), "last", null);
        setField(term162526, term162526.getClass(), "propListHead", null);
        setIntField(term162526, term162526.getClass(), "sourcePosition", 0);
        setField(term162526, term162526.getClass(), "jsType", null);
        setField(term162526, term162526.getClass(), "parent", null);
        setField(term162525, term162525.getClass(), "next", term162526);
        setField(term162525, term162525.getClass(), "first", null);
        setField(term162525, term162525.getClass(), "last", null);
        setField(term162525, term162525.getClass(), "propListHead", null);
        setIntField(term162525, term162525.getClass(), "sourcePosition", 0);
        setField(term162525, term162525.getClass(), "jsType", null);
        setField(term162525, term162525.getClass(), "parent", null);
        setField(term162523, term162523.getClass(), "first", term162525);
        setField(term162523, term162523.getClass(), "last", null);
        setField(term162523, term162523.getClass(), "propListHead", null);
        setIntField(term162523, term162523.getClass(), "sourcePosition", 0);
        setField(term162523, term162523.getClass(), "jsType", null);
        setField(term162523, term162523.getClass(), "parent", null);
        setField(term162522, term162522.getClass(), "first", term162523);
        setField(term162522, term162522.getClass(), "last", null);
        setField(term162522, term162522.getClass(), "propListHead", null);
        setIntField(term162522, term162522.getClass(), "sourcePosition", 0);
        setField(term162522, term162522.getClass(), "jsType", null);
        setField(term162522, term162522.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term161347;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term161197, args);
        assertTrue(recursiveEquals(term161197, term162520));
        assertTrue(recursiveEquals(term161347, term162522));
    }

};


