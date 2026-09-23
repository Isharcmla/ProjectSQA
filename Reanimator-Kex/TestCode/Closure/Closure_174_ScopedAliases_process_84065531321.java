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

public class ScopedAliases_process_84065531321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10439;
     Object term10589;
     Object term10985;
     Object term10987;

    public ScopedAliases_process_84065531321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10439 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term10519 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term10519, term10519.getClass(), "phaseOptimizer", null);
        setField(term10439, term10439.getClass(), "compiler", term10519);
        term10589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10589, term10589.getClass(), "type", 105);
        setField(term10589, term10589.getClass(), "parent", null);
        term10985 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term10986 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term10986, term10986.getClass(), "options", null);
        setField(term10986, term10986.getClass(), "passes", null);
        setField(term10986, term10986.getClass(), "externs", null);
        setField(term10986, term10986.getClass(), "modules", null);
        setField(term10986, term10986.getClass(), "moduleGraph", null);
        setField(term10986, term10986.getClass(), "inputs", null);
        setField(term10986, term10986.getClass(), "errorManager", null);
        setField(term10986, term10986.getClass(), "warningsGuard", null);
        setField(term10986, term10986.getClass(), "injectedLibraries", null);
        setField(term10986, term10986.getClass(), "externsRoot", null);
        setField(term10986, term10986.getClass(), "jsRoot", null);
        setField(term10986, term10986.getClass(), "externAndJsRoot", null);
        setField(term10986, term10986.getClass(), "inputsById", null);
        setField(term10986, term10986.getClass(), "sourceMap", null);
        setField(term10986, term10986.getClass(), "externExports", null);
        setIntField(term10986, term10986.getClass(), "uniqueNameId", 0);
        setBooleanField(term10986, term10986.getClass(), "hasRegExpGlobalReferences", false);
        setField(term10986, term10986.getClass(), "functionInformationMap", null);
        setField(term10986, term10986.getClass(), "debugLog", null);
        setField(term10986, term10986.getClass(), "defaultCodingConvention", null);
        setField(term10986, term10986.getClass(), "typeRegistry", null);
        setField(term10986, term10986.getClass(), "parserConfig", null);
        setField(term10986, term10986.getClass(), "abstractInterpreter", null);
        setField(term10986, term10986.getClass(), "typeValidator", null);
        setField(term10986, term10986.getClass(), "phaseOptimizer", null);
        setField(term10986, term10986.getClass(), "tracker", null);
        setField(term10986, term10986.getClass(), "oldErrorReporter", null);
        setField(term10986, term10986.getClass(), "defaultErrorReporter", null);
        setField(term10986, term10986.getClass(), "compilerThread", null);
        setBooleanField(term10986, term10986.getClass(), "useThreads", false);
        setField(term10986, term10986.getClass(), "outStream", null);
        setField(term10986, term10986.getClass(), "globalRefMap", null);
        setDoubleField(term10986, term10986.getClass(), "progress", 0.0);
        setField(term10986, term10986.getClass(), "lastPassName", null);
        setField(term10986, term10986.getClass(), "sanityCheck", null);
        setField(term10986, term10986.getClass(), "currentTracer", null);
        setField(term10986, term10986.getClass(), "currentPassName", null);
        setIntField(term10986, term10986.getClass(), "syntheticCodeId", 0);
        setField(term10986, term10986.getClass(), "recentChange", null);
        setField(term10986, term10986.getClass(), "codeChangeHandlers", null);
        setField(term10986, term10986.getClass(), "synthesizedExternsInput", null);
        setField(term10986, term10986.getClass(), "stage", null);
        setBooleanField(term10986, term10986.getClass(), "analyzeChangedScopesOnly", false);
        setField(term10985, term10985.getClass(), "compiler", term10986);
        setField(term10985, term10985.getClass(), "preprocessorSymbolTable", null);
        setField(term10985, term10985.getClass(), "transformationHandler", null);
        setField(term10985, term10985.getClass(), "scopedAliasNames", null);
        term10987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10987, term10987.getClass(), "type", 105);
        setField(term10987, term10987.getClass(), "next", null);
        setField(term10987, term10987.getClass(), "first", null);
        setField(term10987, term10987.getClass(), "last", null);
        setField(term10987, term10987.getClass(), "propListHead", null);
        setIntField(term10987, term10987.getClass(), "sourcePosition", 0);
        setField(term10987, term10987.getClass(), "jsType", null);
        setField(term10987, term10987.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term10589;
        callMethod(klass, "process", argTypes, term10439, args);
        assertTrue(recursiveEquals(term10439, term10985));
        assertTrue(recursiveEquals(term10589, null));
    }

};


