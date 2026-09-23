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

public class ScopedAliases_process_840655313128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69615;
     Object term69765;
     Object term70375;
     Object term70377;

    public ScopedAliases_process_840655313128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69615 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term69695 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term69615, term69615.getClass(), "compiler", term69695);
        term69765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69905 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term69765, term69765.getClass(), "type", 0);
        setField(term69765, term69765.getClass(), "parent", null);
        setField(term69905, term69905.getClass(), "next", null);
        setIntField(term69905, term69905.getClass(), "type", 0);
        setField(term69905, term69905.getClass(), "first", null);
        setField(term69835, term69835.getClass(), "next", term69905);
        setIntField(term69835, term69835.getClass(), "type", 0);
        setField(term69835, term69835.getClass(), "first", null);
        setField(term69765, term69765.getClass(), "first", term69835);
        term70375 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term70376 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term70376, term70376.getClass(), "options", null);
        setField(term70376, term70376.getClass(), "passes", null);
        setField(term70376, term70376.getClass(), "externs", null);
        setField(term70376, term70376.getClass(), "modules", null);
        setField(term70376, term70376.getClass(), "moduleGraph", null);
        setField(term70376, term70376.getClass(), "inputs", null);
        setField(term70376, term70376.getClass(), "errorManager", null);
        setField(term70376, term70376.getClass(), "warningsGuard", null);
        setField(term70376, term70376.getClass(), "externsRoot", null);
        setField(term70376, term70376.getClass(), "jsRoot", null);
        setField(term70376, term70376.getClass(), "externAndJsRoot", null);
        setField(term70376, term70376.getClass(), "inputsById", null);
        setField(term70376, term70376.getClass(), "sourceMap", null);
        setField(term70376, term70376.getClass(), "externExports", null);
        setIntField(term70376, term70376.getClass(), "uniqueNameId", 0);
        setBooleanField(term70376, term70376.getClass(), "useThreads", false);
        setBooleanField(term70376, term70376.getClass(), "hasRegExpGlobalReferences", false);
        setField(term70376, term70376.getClass(), "functionInformationMap", null);
        setField(term70376, term70376.getClass(), "debugLog", null);
        setField(term70376, term70376.getClass(), "defaultCodingConvention", null);
        setField(term70376, term70376.getClass(), "typeRegistry", null);
        setField(term70376, term70376.getClass(), "parserConfig", null);
        setField(term70376, term70376.getClass(), "abstractInterpreter", null);
        setField(term70376, term70376.getClass(), "typeValidator", null);
        setField(term70376, term70376.getClass(), "tracker", null);
        setField(term70376, term70376.getClass(), "oldErrorReporter", null);
        setField(term70376, term70376.getClass(), "defaultErrorReporter", null);
        setField(term70376, term70376.getClass(), "outStream", null);
        setField(term70376, term70376.getClass(), "globalRefMap", null);
        setField(term70376, term70376.getClass(), "sanityCheck", null);
        setField(term70376, term70376.getClass(), "currentTracer", null);
        setField(term70376, term70376.getClass(), "currentPassName", null);
        setIntField(term70376, term70376.getClass(), "syntheticCodeId", 0);
        setField(term70376, term70376.getClass(), "recentChange", null);
        setField(term70376, term70376.getClass(), "codeChangeHandlers", null);
        setField(term70376, term70376.getClass(), "stage", null);
        setField(term70375, term70375.getClass(), "compiler", term70376);
        setField(term70375, term70375.getClass(), "preprocessorSymbolTable", null);
        setField(term70375, term70375.getClass(), "transformationHandler", null);
        term70377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term70377, term70377.getClass(), "type", 0);
        setField(term70377, term70377.getClass(), "next", null);
        setIntField(term70378, term70378.getClass(), "type", 0);
        setIntField(term70379, term70379.getClass(), "type", 0);
        setField(term70379, term70379.getClass(), "next", null);
        setField(term70379, term70379.getClass(), "first", null);
        setField(term70379, term70379.getClass(), "last", null);
        setField(term70379, term70379.getClass(), "propListHead", null);
        setIntField(term70379, term70379.getClass(), "sourcePosition", 0);
        setField(term70379, term70379.getClass(), "jsType", null);
        setField(term70379, term70379.getClass(), "parent", null);
        setField(term70378, term70378.getClass(), "next", term70379);
        setField(term70378, term70378.getClass(), "first", null);
        setField(term70378, term70378.getClass(), "last", null);
        setField(term70378, term70378.getClass(), "propListHead", null);
        setIntField(term70378, term70378.getClass(), "sourcePosition", 0);
        setField(term70378, term70378.getClass(), "jsType", null);
        setField(term70378, term70378.getClass(), "parent", null);
        setField(term70377, term70377.getClass(), "first", term70378);
        setField(term70377, term70377.getClass(), "last", null);
        setField(term70377, term70377.getClass(), "propListHead", null);
        setIntField(term70377, term70377.getClass(), "sourcePosition", 0);
        setField(term70377, term70377.getClass(), "jsType", null);
        setField(term70377, term70377.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term69765;
        callMethod(klass, "process", argTypes, term69615, args);
        assertTrue(recursiveEquals(term69615, term70375));
        assertTrue(recursiveEquals(term69765, null));
    }

};


