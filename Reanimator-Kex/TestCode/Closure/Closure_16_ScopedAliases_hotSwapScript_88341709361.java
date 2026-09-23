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

public class ScopedAliases_hotSwapScript_88341709361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247118;
     Object term247290;
     Object term248449;
     Object term248451;

    public ScopedAliases_hotSwapScript_88341709361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term247118 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term247198 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term247118, term247118.getClass(), "compiler", term247198);
        term247290 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term247360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term247452 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term247544 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term247614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term247290, term247290.getClass(), "type", 0);
        setField(term247290, term247290.getClass(), "parent", null);
        setField(term247452, term247452.getClass(), "next", null);
        setIntField(term247452, term247452.getClass(), "type", 37);
        setField(term247544, term247544.getClass(), "next", null);
        setIntField(term247544, term247544.getClass(), "type", 0);
        setField(term247544, term247544.getClass(), "first", null);
        setField(term247452, term247452.getClass(), "first", term247544);
        setField(term247360, term247360.getClass(), "next", term247452);
        setIntField(term247360, term247360.getClass(), "type", 0);
        setField(term247614, term247614.getClass(), "next", null);
        setIntField(term247614, term247614.getClass(), "type", 0);
        setField(term247614, term247614.getClass(), "first", null);
        setField(term247360, term247360.getClass(), "first", term247614);
        setField(term247290, term247290.getClass(), "first", term247360);
        term248449 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term248450 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term248450, term248450.getClass(), "options", null);
        setField(term248450, term248450.getClass(), "passes", null);
        setField(term248450, term248450.getClass(), "externs", null);
        setField(term248450, term248450.getClass(), "modules", null);
        setField(term248450, term248450.getClass(), "moduleGraph", null);
        setField(term248450, term248450.getClass(), "inputs", null);
        setField(term248450, term248450.getClass(), "errorManager", null);
        setField(term248450, term248450.getClass(), "warningsGuard", null);
        setField(term248450, term248450.getClass(), "injectedLibraries", null);
        setField(term248450, term248450.getClass(), "externsRoot", null);
        setField(term248450, term248450.getClass(), "jsRoot", null);
        setField(term248450, term248450.getClass(), "externAndJsRoot", null);
        setField(term248450, term248450.getClass(), "inputsById", null);
        setField(term248450, term248450.getClass(), "sourceMap", null);
        setField(term248450, term248450.getClass(), "externExports", null);
        setIntField(term248450, term248450.getClass(), "uniqueNameId", 0);
        setBooleanField(term248450, term248450.getClass(), "useThreads", false);
        setBooleanField(term248450, term248450.getClass(), "hasRegExpGlobalReferences", false);
        setField(term248450, term248450.getClass(), "functionInformationMap", null);
        setField(term248450, term248450.getClass(), "debugLog", null);
        setField(term248450, term248450.getClass(), "defaultCodingConvention", null);
        setField(term248450, term248450.getClass(), "typeRegistry", null);
        setField(term248450, term248450.getClass(), "parserConfig", null);
        setField(term248450, term248450.getClass(), "abstractInterpreter", null);
        setField(term248450, term248450.getClass(), "typeValidator", null);
        setField(term248450, term248450.getClass(), "tracker", null);
        setField(term248450, term248450.getClass(), "oldErrorReporter", null);
        setField(term248450, term248450.getClass(), "defaultErrorReporter", null);
        setField(term248450, term248450.getClass(), "outStream", null);
        setField(term248450, term248450.getClass(), "globalRefMap", null);
        setDoubleField(term248450, term248450.getClass(), "progress", 0.0);
        setField(term248450, term248450.getClass(), "sanityCheck", null);
        setField(term248450, term248450.getClass(), "currentTracer", null);
        setField(term248450, term248450.getClass(), "currentPassName", null);
        setIntField(term248450, term248450.getClass(), "syntheticCodeId", 0);
        setField(term248450, term248450.getClass(), "recentChange", null);
        setField(term248450, term248450.getClass(), "codeChangeHandlers", null);
        setField(term248450, term248450.getClass(), "synthesizedExternsInput", null);
        setField(term248450, term248450.getClass(), "stage", null);
        setField(term248449, term248449.getClass(), "compiler", term248450);
        setField(term248449, term248449.getClass(), "preprocessorSymbolTable", null);
        setField(term248449, term248449.getClass(), "transformationHandler", null);
        term248451 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term248452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term248453 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term248454 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term248455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term248451, term248451.getClass(), "number", 0.0);
        setIntField(term248451, term248451.getClass(), "type", 0);
        setField(term248451, term248451.getClass(), "next", null);
        setIntField(term248452, term248452.getClass(), "type", 0);
        setDoubleField(term248453, term248453.getClass(), "number", 0.0);
        setIntField(term248453, term248453.getClass(), "type", 37);
        setField(term248453, term248453.getClass(), "next", null);
        setDoubleField(term248454, term248454.getClass(), "number", 0.0);
        setIntField(term248454, term248454.getClass(), "type", 0);
        setField(term248454, term248454.getClass(), "next", null);
        setField(term248454, term248454.getClass(), "first", null);
        setField(term248454, term248454.getClass(), "last", null);
        setField(term248454, term248454.getClass(), "propListHead", null);
        setIntField(term248454, term248454.getClass(), "sourcePosition", 0);
        setField(term248454, term248454.getClass(), "jsType", null);
        setField(term248454, term248454.getClass(), "parent", null);
        setField(term248453, term248453.getClass(), "first", term248454);
        setField(term248453, term248453.getClass(), "last", null);
        setField(term248453, term248453.getClass(), "propListHead", null);
        setIntField(term248453, term248453.getClass(), "sourcePosition", 0);
        setField(term248453, term248453.getClass(), "jsType", null);
        setField(term248453, term248453.getClass(), "parent", null);
        setField(term248452, term248452.getClass(), "next", term248453);
        setIntField(term248455, term248455.getClass(), "type", 0);
        setField(term248455, term248455.getClass(), "next", null);
        setField(term248455, term248455.getClass(), "first", null);
        setField(term248455, term248455.getClass(), "last", null);
        setField(term248455, term248455.getClass(), "propListHead", null);
        setIntField(term248455, term248455.getClass(), "sourcePosition", 0);
        setField(term248455, term248455.getClass(), "jsType", null);
        setField(term248455, term248455.getClass(), "parent", null);
        setField(term248452, term248452.getClass(), "first", term248455);
        setField(term248452, term248452.getClass(), "last", null);
        setField(term248452, term248452.getClass(), "propListHead", null);
        setIntField(term248452, term248452.getClass(), "sourcePosition", 0);
        setField(term248452, term248452.getClass(), "jsType", null);
        setField(term248452, term248452.getClass(), "parent", null);
        setField(term248451, term248451.getClass(), "first", term248452);
        setField(term248451, term248451.getClass(), "last", null);
        setField(term248451, term248451.getClass(), "propListHead", null);
        setIntField(term248451, term248451.getClass(), "sourcePosition", 0);
        setField(term248451, term248451.getClass(), "jsType", null);
        setField(term248451, term248451.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term247290;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term247118, args);
        assertTrue(recursiveEquals(term247118, term248449));
        assertTrue(recursiveEquals(term247290, term248451));
    }

};


