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

public class ScopedAliases_hotSwapScript_88341709317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210133;
     Object term210283;
     Object term211720;
     Object term211722;

    public ScopedAliases_hotSwapScript_88341709317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210133 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term210213 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term210133, term210133.getClass(), "compiler", term210213);
        term210283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term210353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term210423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term210493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term210563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term210633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term210703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term210283, term210283.getClass(), "type", 0);
        setField(term210283, term210283.getClass(), "parent", null);
        setField(term210493, term210493.getClass(), "next", null);
        setIntField(term210493, term210493.getClass(), "type", 0);
        setField(term210493, term210493.getClass(), "first", null);
        setField(term210423, term210423.getClass(), "next", term210493);
        setIntField(term210423, term210423.getClass(), "type", 0);
        setField(term210423, term210423.getClass(), "first", null);
        setField(term210353, term210353.getClass(), "next", term210423);
        setIntField(term210353, term210353.getClass(), "type", 0);
        setField(term210703, term210703.getClass(), "next", null);
        setIntField(term210703, term210703.getClass(), "type", 0);
        setField(term210703, term210703.getClass(), "first", null);
        setField(term210633, term210633.getClass(), "next", term210703);
        setIntField(term210633, term210633.getClass(), "type", 105);
        setField(term210563, term210563.getClass(), "next", term210633);
        setIntField(term210563, term210563.getClass(), "type", 105);
        setField(term210353, term210353.getClass(), "first", term210563);
        setField(term210283, term210283.getClass(), "first", term210353);
        term211720 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term211721 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term211721, term211721.getClass(), "options", null);
        setField(term211721, term211721.getClass(), "passes", null);
        setField(term211721, term211721.getClass(), "externs", null);
        setField(term211721, term211721.getClass(), "modules", null);
        setField(term211721, term211721.getClass(), "moduleGraph", null);
        setField(term211721, term211721.getClass(), "inputs", null);
        setField(term211721, term211721.getClass(), "errorManager", null);
        setField(term211721, term211721.getClass(), "warningsGuard", null);
        setField(term211721, term211721.getClass(), "injectedLibraries", null);
        setField(term211721, term211721.getClass(), "externsRoot", null);
        setField(term211721, term211721.getClass(), "jsRoot", null);
        setField(term211721, term211721.getClass(), "externAndJsRoot", null);
        setField(term211721, term211721.getClass(), "inputsById", null);
        setField(term211721, term211721.getClass(), "sourceMap", null);
        setField(term211721, term211721.getClass(), "externExports", null);
        setIntField(term211721, term211721.getClass(), "uniqueNameId", 0);
        setBooleanField(term211721, term211721.getClass(), "useThreads", false);
        setBooleanField(term211721, term211721.getClass(), "hasRegExpGlobalReferences", false);
        setField(term211721, term211721.getClass(), "functionInformationMap", null);
        setField(term211721, term211721.getClass(), "debugLog", null);
        setField(term211721, term211721.getClass(), "defaultCodingConvention", null);
        setField(term211721, term211721.getClass(), "typeRegistry", null);
        setField(term211721, term211721.getClass(), "parserConfig", null);
        setField(term211721, term211721.getClass(), "abstractInterpreter", null);
        setField(term211721, term211721.getClass(), "typeValidator", null);
        setField(term211721, term211721.getClass(), "tracker", null);
        setField(term211721, term211721.getClass(), "oldErrorReporter", null);
        setField(term211721, term211721.getClass(), "defaultErrorReporter", null);
        setField(term211721, term211721.getClass(), "outStream", null);
        setField(term211721, term211721.getClass(), "globalRefMap", null);
        setDoubleField(term211721, term211721.getClass(), "progress", 0.0);
        setField(term211721, term211721.getClass(), "sanityCheck", null);
        setField(term211721, term211721.getClass(), "currentTracer", null);
        setField(term211721, term211721.getClass(), "currentPassName", null);
        setIntField(term211721, term211721.getClass(), "syntheticCodeId", 0);
        setField(term211721, term211721.getClass(), "recentChange", null);
        setField(term211721, term211721.getClass(), "codeChangeHandlers", null);
        setField(term211721, term211721.getClass(), "synthesizedExternsInput", null);
        setField(term211721, term211721.getClass(), "stage", null);
        setField(term211720, term211720.getClass(), "compiler", term211721);
        setField(term211720, term211720.getClass(), "preprocessorSymbolTable", null);
        setField(term211720, term211720.getClass(), "transformationHandler", null);
        term211722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term211723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term211724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term211725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term211726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term211727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term211728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term211722, term211722.getClass(), "type", 0);
        setField(term211722, term211722.getClass(), "next", null);
        setIntField(term211723, term211723.getClass(), "type", 0);
        setIntField(term211724, term211724.getClass(), "type", 0);
        setIntField(term211725, term211725.getClass(), "type", 0);
        setField(term211725, term211725.getClass(), "next", null);
        setField(term211725, term211725.getClass(), "first", null);
        setField(term211725, term211725.getClass(), "last", null);
        setField(term211725, term211725.getClass(), "propListHead", null);
        setIntField(term211725, term211725.getClass(), "sourcePosition", 0);
        setField(term211725, term211725.getClass(), "jsType", null);
        setField(term211725, term211725.getClass(), "parent", null);
        setField(term211724, term211724.getClass(), "next", term211725);
        setField(term211724, term211724.getClass(), "first", null);
        setField(term211724, term211724.getClass(), "last", null);
        setField(term211724, term211724.getClass(), "propListHead", null);
        setIntField(term211724, term211724.getClass(), "sourcePosition", 0);
        setField(term211724, term211724.getClass(), "jsType", null);
        setField(term211724, term211724.getClass(), "parent", null);
        setField(term211723, term211723.getClass(), "next", term211724);
        setIntField(term211726, term211726.getClass(), "type", 105);
        setIntField(term211727, term211727.getClass(), "type", 105);
        setIntField(term211728, term211728.getClass(), "type", 0);
        setField(term211728, term211728.getClass(), "next", null);
        setField(term211728, term211728.getClass(), "first", null);
        setField(term211728, term211728.getClass(), "last", null);
        setField(term211728, term211728.getClass(), "propListHead", null);
        setIntField(term211728, term211728.getClass(), "sourcePosition", 0);
        setField(term211728, term211728.getClass(), "jsType", null);
        setField(term211728, term211728.getClass(), "parent", null);
        setField(term211727, term211727.getClass(), "next", term211728);
        setField(term211727, term211727.getClass(), "first", null);
        setField(term211727, term211727.getClass(), "last", null);
        setField(term211727, term211727.getClass(), "propListHead", null);
        setIntField(term211727, term211727.getClass(), "sourcePosition", 0);
        setField(term211727, term211727.getClass(), "jsType", null);
        setField(term211727, term211727.getClass(), "parent", null);
        setField(term211726, term211726.getClass(), "next", term211727);
        setField(term211726, term211726.getClass(), "first", null);
        setField(term211726, term211726.getClass(), "last", null);
        setField(term211726, term211726.getClass(), "propListHead", null);
        setIntField(term211726, term211726.getClass(), "sourcePosition", 0);
        setField(term211726, term211726.getClass(), "jsType", null);
        setField(term211726, term211726.getClass(), "parent", null);
        setField(term211723, term211723.getClass(), "first", term211726);
        setField(term211723, term211723.getClass(), "last", null);
        setField(term211723, term211723.getClass(), "propListHead", null);
        setIntField(term211723, term211723.getClass(), "sourcePosition", 0);
        setField(term211723, term211723.getClass(), "jsType", null);
        setField(term211723, term211723.getClass(), "parent", null);
        setField(term211722, term211722.getClass(), "first", term211723);
        setField(term211722, term211722.getClass(), "last", null);
        setField(term211722, term211722.getClass(), "propListHead", null);
        setIntField(term211722, term211722.getClass(), "sourcePosition", 0);
        setField(term211722, term211722.getClass(), "jsType", null);
        setField(term211722, term211722.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term210283;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term210133, args);
        assertTrue(recursiveEquals(term210133, term211720));
        assertTrue(recursiveEquals(term210283, term211722));
    }

};


