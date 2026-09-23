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

public class ScopedAliases_process_84065531323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12515;
     Object term12687;
     Object term13985;
     Object term13987;

    public ScopedAliases_process_84065531323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12515 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term12595 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term12595, term12595.getClass(), "phaseOptimizer", null);
        setField(term12515, term12515.getClass(), "compiler", term12595);
        term12687 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term12779 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term12687, term12687.getClass(), "type", 0);
        setIntField(term12779, term12779.getClass(), "type", 0);
        setField(term12779, term12779.getClass(), "parent", null);
        setField(term12687, term12687.getClass(), "parent", term12779);
        term13985 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term13986 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term13986, term13986.getClass(), "options", null);
        setField(term13986, term13986.getClass(), "passes", null);
        setField(term13986, term13986.getClass(), "externs", null);
        setField(term13986, term13986.getClass(), "modules", null);
        setField(term13986, term13986.getClass(), "moduleGraph", null);
        setField(term13986, term13986.getClass(), "inputs", null);
        setField(term13986, term13986.getClass(), "errorManager", null);
        setField(term13986, term13986.getClass(), "warningsGuard", null);
        setField(term13986, term13986.getClass(), "injectedLibraries", null);
        setField(term13986, term13986.getClass(), "externsRoot", null);
        setField(term13986, term13986.getClass(), "jsRoot", null);
        setField(term13986, term13986.getClass(), "externAndJsRoot", null);
        setField(term13986, term13986.getClass(), "inputsById", null);
        setField(term13986, term13986.getClass(), "sourceMap", null);
        setField(term13986, term13986.getClass(), "externExports", null);
        setIntField(term13986, term13986.getClass(), "uniqueNameId", 0);
        setIntField(term13986, term13986.getClass(), "timeout", 0);
        setBooleanField(term13986, term13986.getClass(), "hasRegExpGlobalReferences", false);
        setField(term13986, term13986.getClass(), "functionInformationMap", null);
        setField(term13986, term13986.getClass(), "debugLog", null);
        setField(term13986, term13986.getClass(), "defaultCodingConvention", null);
        setField(term13986, term13986.getClass(), "typeRegistry", null);
        setField(term13986, term13986.getClass(), "parserConfig", null);
        setField(term13986, term13986.getClass(), "abstractInterpreter", null);
        setField(term13986, term13986.getClass(), "typeValidator", null);
        setField(term13986, term13986.getClass(), "phaseOptimizer", null);
        setField(term13986, term13986.getClass(), "tracker", null);
        setField(term13986, term13986.getClass(), "oldErrorReporter", null);
        setField(term13986, term13986.getClass(), "defaultErrorReporter", null);
        setField(term13986, term13986.getClass(), "compilerThread", null);
        setBooleanField(term13986, term13986.getClass(), "useThreads", false);
        setField(term13986, term13986.getClass(), "outStream", null);
        setField(term13986, term13986.getClass(), "globalRefMap", null);
        setDoubleField(term13986, term13986.getClass(), "progress", 0.0);
        setField(term13986, term13986.getClass(), "lastPassName", null);
        setField(term13986, term13986.getClass(), "sanityCheck", null);
        setField(term13986, term13986.getClass(), "currentTracer", null);
        setField(term13986, term13986.getClass(), "currentPassName", null);
        setIntField(term13986, term13986.getClass(), "syntheticCodeId", 0);
        setField(term13986, term13986.getClass(), "recentChange", null);
        setField(term13986, term13986.getClass(), "codeChangeHandlers", null);
        setField(term13986, term13986.getClass(), "synthesizedExternsInput", null);
        setField(term13986, term13986.getClass(), "stage", null);
        setBooleanField(term13986, term13986.getClass(), "analyzeChangedScopesOnly", false);
        setField(term13985, term13985.getClass(), "compiler", term13986);
        setField(term13985, term13985.getClass(), "preprocessorSymbolTable", null);
        setField(term13985, term13985.getClass(), "transformationHandler", null);
        setField(term13985, term13985.getClass(), "scopedAliasNames", null);
        term13987 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term13988 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term13987, term13987.getClass(), "str", null);
        setIntField(term13987, term13987.getClass(), "type", 0);
        setField(term13987, term13987.getClass(), "next", null);
        setField(term13987, term13987.getClass(), "first", null);
        setField(term13987, term13987.getClass(), "last", null);
        setField(term13987, term13987.getClass(), "propListHead", null);
        setIntField(term13987, term13987.getClass(), "sourcePosition", 0);
        setField(term13987, term13987.getClass(), "jsType", null);
        setField(term13988, term13988.getClass(), "str", null);
        setIntField(term13988, term13988.getClass(), "type", 0);
        setField(term13988, term13988.getClass(), "next", null);
        setField(term13988, term13988.getClass(), "first", null);
        setField(term13988, term13988.getClass(), "last", null);
        setField(term13988, term13988.getClass(), "propListHead", null);
        setIntField(term13988, term13988.getClass(), "sourcePosition", 0);
        setField(term13988, term13988.getClass(), "jsType", null);
        setField(term13988, term13988.getClass(), "parent", null);
        setField(term13987, term13987.getClass(), "parent", term13988);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term12687;
        callMethod(klass, "process", argTypes, term12515, args);
        assertTrue(recursiveEquals(term12515, term13985));
        assertTrue(recursiveEquals(term12687, null));
    }

};


