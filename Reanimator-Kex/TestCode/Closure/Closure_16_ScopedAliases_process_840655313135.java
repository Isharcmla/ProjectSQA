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

public class ScopedAliases_process_840655313135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82982;
     Object term83132;
     Object term83449;
     Object term83451;

    public ScopedAliases_process_840655313135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82982 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term83062 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term82982, term82982.getClass(), "compiler", term83062);
        term83132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term83132, term83132.getClass(), "type", 105);
        setField(term83132, term83132.getClass(), "parent", null);
        term83449 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term83450 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term83450, term83450.getClass(), "options", null);
        setField(term83450, term83450.getClass(), "passes", null);
        setField(term83450, term83450.getClass(), "externs", null);
        setField(term83450, term83450.getClass(), "modules", null);
        setField(term83450, term83450.getClass(), "moduleGraph", null);
        setField(term83450, term83450.getClass(), "inputs", null);
        setField(term83450, term83450.getClass(), "errorManager", null);
        setField(term83450, term83450.getClass(), "warningsGuard", null);
        setField(term83450, term83450.getClass(), "injectedLibraries", null);
        setField(term83450, term83450.getClass(), "externsRoot", null);
        setField(term83450, term83450.getClass(), "jsRoot", null);
        setField(term83450, term83450.getClass(), "externAndJsRoot", null);
        setField(term83450, term83450.getClass(), "inputsById", null);
        setField(term83450, term83450.getClass(), "sourceMap", null);
        setField(term83450, term83450.getClass(), "externExports", null);
        setIntField(term83450, term83450.getClass(), "uniqueNameId", 0);
        setBooleanField(term83450, term83450.getClass(), "useThreads", false);
        setBooleanField(term83450, term83450.getClass(), "hasRegExpGlobalReferences", false);
        setField(term83450, term83450.getClass(), "functionInformationMap", null);
        setField(term83450, term83450.getClass(), "debugLog", null);
        setField(term83450, term83450.getClass(), "defaultCodingConvention", null);
        setField(term83450, term83450.getClass(), "typeRegistry", null);
        setField(term83450, term83450.getClass(), "parserConfig", null);
        setField(term83450, term83450.getClass(), "abstractInterpreter", null);
        setField(term83450, term83450.getClass(), "typeValidator", null);
        setField(term83450, term83450.getClass(), "tracker", null);
        setField(term83450, term83450.getClass(), "oldErrorReporter", null);
        setField(term83450, term83450.getClass(), "defaultErrorReporter", null);
        setField(term83450, term83450.getClass(), "outStream", null);
        setField(term83450, term83450.getClass(), "globalRefMap", null);
        setDoubleField(term83450, term83450.getClass(), "progress", 0.0);
        setField(term83450, term83450.getClass(), "sanityCheck", null);
        setField(term83450, term83450.getClass(), "currentTracer", null);
        setField(term83450, term83450.getClass(), "currentPassName", null);
        setIntField(term83450, term83450.getClass(), "syntheticCodeId", 0);
        setField(term83450, term83450.getClass(), "recentChange", null);
        setField(term83450, term83450.getClass(), "codeChangeHandlers", null);
        setField(term83450, term83450.getClass(), "synthesizedExternsInput", null);
        setField(term83450, term83450.getClass(), "stage", null);
        setField(term83449, term83449.getClass(), "compiler", term83450);
        setField(term83449, term83449.getClass(), "preprocessorSymbolTable", null);
        setField(term83449, term83449.getClass(), "transformationHandler", null);
        term83451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term83451, term83451.getClass(), "type", 105);
        setField(term83451, term83451.getClass(), "next", null);
        setField(term83451, term83451.getClass(), "first", null);
        setField(term83451, term83451.getClass(), "last", null);
        setField(term83451, term83451.getClass(), "propListHead", null);
        setIntField(term83451, term83451.getClass(), "sourcePosition", 0);
        setField(term83451, term83451.getClass(), "jsType", null);
        setField(term83451, term83451.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term83132;
        callMethod(klass, "process", argTypes, term82982, args);
        assertTrue(recursiveEquals(term82982, term83449));
        assertTrue(recursiveEquals(term83132, null));
    }

};


