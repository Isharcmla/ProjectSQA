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

public class ScopedAliases_hotSwapScript_8834170973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42785;
     Object term42935;
     Object term44212;
     Object term44214;

    public ScopedAliases_hotSwapScript_8834170973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42785 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term42865 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term42785, term42785.getClass(), "compiler", term42865);
        term42935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42935, term42935.getClass(), "type", 0);
        setField(term42935, term42935.getClass(), "parent", null);
        setField(term43075, term43075.getClass(), "next", term43145);
        setIntField(term43075, term43075.getClass(), "type", 37);
        setField(term43215, term43215.getClass(), "next", null);
        setIntField(term43215, term43215.getClass(), "type", 0);
        setField(term43215, term43215.getClass(), "first", null);
        setField(term43075, term43075.getClass(), "first", term43215);
        setField(term43005, term43005.getClass(), "next", term43075);
        setIntField(term43005, term43005.getClass(), "type", 0);
        setField(term43285, term43285.getClass(), "next", null);
        setIntField(term43285, term43285.getClass(), "type", 0);
        setField(term43285, term43285.getClass(), "first", null);
        setField(term43005, term43005.getClass(), "first", term43285);
        setField(term42935, term42935.getClass(), "first", term43005);
        term44212 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term44213 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term44213, term44213.getClass(), "options", null);
        setField(term44213, term44213.getClass(), "passes", null);
        setField(term44213, term44213.getClass(), "externs", null);
        setField(term44213, term44213.getClass(), "modules", null);
        setField(term44213, term44213.getClass(), "moduleGraph", null);
        setField(term44213, term44213.getClass(), "inputs", null);
        setField(term44213, term44213.getClass(), "errorManager", null);
        setField(term44213, term44213.getClass(), "warningsGuard", null);
        setField(term44213, term44213.getClass(), "injectedLibraries", null);
        setField(term44213, term44213.getClass(), "externsRoot", null);
        setField(term44213, term44213.getClass(), "jsRoot", null);
        setField(term44213, term44213.getClass(), "externAndJsRoot", null);
        setField(term44213, term44213.getClass(), "inputsById", null);
        setField(term44213, term44213.getClass(), "sourceMap", null);
        setField(term44213, term44213.getClass(), "externExports", null);
        setIntField(term44213, term44213.getClass(), "uniqueNameId", 0);
        setBooleanField(term44213, term44213.getClass(), "useThreads", false);
        setBooleanField(term44213, term44213.getClass(), "hasRegExpGlobalReferences", false);
        setField(term44213, term44213.getClass(), "functionInformationMap", null);
        setField(term44213, term44213.getClass(), "debugLog", null);
        setField(term44213, term44213.getClass(), "defaultCodingConvention", null);
        setField(term44213, term44213.getClass(), "typeRegistry", null);
        setField(term44213, term44213.getClass(), "parserConfig", null);
        setField(term44213, term44213.getClass(), "abstractInterpreter", null);
        setField(term44213, term44213.getClass(), "typeValidator", null);
        setField(term44213, term44213.getClass(), "tracker", null);
        setField(term44213, term44213.getClass(), "oldErrorReporter", null);
        setField(term44213, term44213.getClass(), "defaultErrorReporter", null);
        setField(term44213, term44213.getClass(), "outStream", null);
        setField(term44213, term44213.getClass(), "globalRefMap", null);
        setDoubleField(term44213, term44213.getClass(), "progress", 0.0);
        setField(term44213, term44213.getClass(), "sanityCheck", null);
        setField(term44213, term44213.getClass(), "currentTracer", null);
        setField(term44213, term44213.getClass(), "currentPassName", null);
        setIntField(term44213, term44213.getClass(), "syntheticCodeId", 0);
        setField(term44213, term44213.getClass(), "recentChange", null);
        setField(term44213, term44213.getClass(), "codeChangeHandlers", null);
        setField(term44213, term44213.getClass(), "synthesizedExternsInput", null);
        setField(term44213, term44213.getClass(), "stage", null);
        setField(term44212, term44212.getClass(), "compiler", term44213);
        setField(term44212, term44212.getClass(), "preprocessorSymbolTable", null);
        setField(term44212, term44212.getClass(), "transformationHandler", null);
        term44214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44216 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44214, term44214.getClass(), "type", 0);
        setField(term44214, term44214.getClass(), "next", null);
        setIntField(term44215, term44215.getClass(), "type", 0);
        setIntField(term44216, term44216.getClass(), "type", 37);
        setIntField(term44217, term44217.getClass(), "type", 0);
        setField(term44217, term44217.getClass(), "next", null);
        setField(term44217, term44217.getClass(), "first", null);
        setField(term44217, term44217.getClass(), "last", null);
        setField(term44217, term44217.getClass(), "propListHead", null);
        setIntField(term44217, term44217.getClass(), "sourcePosition", 0);
        setField(term44217, term44217.getClass(), "jsType", null);
        setField(term44217, term44217.getClass(), "parent", null);
        setField(term44216, term44216.getClass(), "next", term44217);
        setIntField(term44218, term44218.getClass(), "type", 0);
        setField(term44218, term44218.getClass(), "next", null);
        setField(term44218, term44218.getClass(), "first", null);
        setField(term44218, term44218.getClass(), "last", null);
        setField(term44218, term44218.getClass(), "propListHead", null);
        setIntField(term44218, term44218.getClass(), "sourcePosition", 0);
        setField(term44218, term44218.getClass(), "jsType", null);
        setField(term44218, term44218.getClass(), "parent", null);
        setField(term44216, term44216.getClass(), "first", term44218);
        setField(term44216, term44216.getClass(), "last", null);
        setField(term44216, term44216.getClass(), "propListHead", null);
        setIntField(term44216, term44216.getClass(), "sourcePosition", 0);
        setField(term44216, term44216.getClass(), "jsType", null);
        setField(term44216, term44216.getClass(), "parent", null);
        setField(term44215, term44215.getClass(), "next", term44216);
        setIntField(term44219, term44219.getClass(), "type", 0);
        setField(term44219, term44219.getClass(), "next", null);
        setField(term44219, term44219.getClass(), "first", null);
        setField(term44219, term44219.getClass(), "last", null);
        setField(term44219, term44219.getClass(), "propListHead", null);
        setIntField(term44219, term44219.getClass(), "sourcePosition", 0);
        setField(term44219, term44219.getClass(), "jsType", null);
        setField(term44219, term44219.getClass(), "parent", null);
        setField(term44215, term44215.getClass(), "first", term44219);
        setField(term44215, term44215.getClass(), "last", null);
        setField(term44215, term44215.getClass(), "propListHead", null);
        setIntField(term44215, term44215.getClass(), "sourcePosition", 0);
        setField(term44215, term44215.getClass(), "jsType", null);
        setField(term44215, term44215.getClass(), "parent", null);
        setField(term44214, term44214.getClass(), "first", term44215);
        setField(term44214, term44214.getClass(), "last", null);
        setField(term44214, term44214.getClass(), "propListHead", null);
        setIntField(term44214, term44214.getClass(), "sourcePosition", 0);
        setField(term44214, term44214.getClass(), "jsType", null);
        setField(term44214, term44214.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term42935;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term42785, args);
        assertTrue(recursiveEquals(term42785, term44212));
        assertTrue(recursiveEquals(term42935, term44214));
    }

};


