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

public class ScopedAliases_process_840655313163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90977;
     Object term91127;
     Object term92362;
     Object term92364;

    public ScopedAliases_process_840655313163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90977 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term91057 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term90977, term90977.getClass(), "compiler", term91057);
        term91127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term91127, term91127.getClass(), "type", 0);
        setIntField(term91197, term91197.getClass(), "type", 132);
        setField(term91197, term91197.getClass(), "propListHead", null);
        setField(term91127, term91127.getClass(), "parent", term91197);
        setField(term91127, term91127.getClass(), "first", null);
        term92362 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term92363 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term92363, term92363.getClass(), "options", null);
        setField(term92363, term92363.getClass(), "passes", null);
        setField(term92363, term92363.getClass(), "externs", null);
        setField(term92363, term92363.getClass(), "modules", null);
        setField(term92363, term92363.getClass(), "moduleGraph", null);
        setField(term92363, term92363.getClass(), "inputs", null);
        setField(term92363, term92363.getClass(), "errorManager", null);
        setField(term92363, term92363.getClass(), "warningsGuard", null);
        setField(term92363, term92363.getClass(), "externsRoot", null);
        setField(term92363, term92363.getClass(), "jsRoot", null);
        setField(term92363, term92363.getClass(), "externAndJsRoot", null);
        setField(term92363, term92363.getClass(), "inputsById", null);
        setField(term92363, term92363.getClass(), "sourceMap", null);
        setField(term92363, term92363.getClass(), "externExports", null);
        setIntField(term92363, term92363.getClass(), "uniqueNameId", 0);
        setBooleanField(term92363, term92363.getClass(), "useThreads", false);
        setBooleanField(term92363, term92363.getClass(), "hasRegExpGlobalReferences", false);
        setField(term92363, term92363.getClass(), "functionInformationMap", null);
        setField(term92363, term92363.getClass(), "debugLog", null);
        setField(term92363, term92363.getClass(), "defaultCodingConvention", null);
        setField(term92363, term92363.getClass(), "typeRegistry", null);
        setField(term92363, term92363.getClass(), "parserConfig", null);
        setField(term92363, term92363.getClass(), "abstractInterpreter", null);
        setField(term92363, term92363.getClass(), "typeValidator", null);
        setField(term92363, term92363.getClass(), "tracker", null);
        setField(term92363, term92363.getClass(), "oldErrorReporter", null);
        setField(term92363, term92363.getClass(), "defaultErrorReporter", null);
        setField(term92363, term92363.getClass(), "outStream", null);
        setField(term92363, term92363.getClass(), "globalRefMap", null);
        setField(term92363, term92363.getClass(), "sanityCheck", null);
        setField(term92363, term92363.getClass(), "currentTracer", null);
        setField(term92363, term92363.getClass(), "currentPassName", null);
        setIntField(term92363, term92363.getClass(), "syntheticCodeId", 0);
        setField(term92363, term92363.getClass(), "recentChange", null);
        setField(term92363, term92363.getClass(), "codeChangeHandlers", null);
        setField(term92363, term92363.getClass(), "stage", null);
        setField(term92362, term92362.getClass(), "compiler", term92363);
        setField(term92362, term92362.getClass(), "preprocessorSymbolTable", null);
        setField(term92362, term92362.getClass(), "transformationHandler", null);
        term92364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term92364, term92364.getClass(), "type", 0);
        setField(term92364, term92364.getClass(), "next", null);
        setField(term92364, term92364.getClass(), "first", null);
        setField(term92364, term92364.getClass(), "last", null);
        setField(term92364, term92364.getClass(), "propListHead", null);
        setIntField(term92364, term92364.getClass(), "sourcePosition", 0);
        setField(term92364, term92364.getClass(), "jsType", null);
        setIntField(term92365, term92365.getClass(), "type", 132);
        setField(term92365, term92365.getClass(), "next", null);
        setField(term92365, term92365.getClass(), "first", null);
        setField(term92365, term92365.getClass(), "last", null);
        setField(term92365, term92365.getClass(), "propListHead", null);
        setIntField(term92365, term92365.getClass(), "sourcePosition", 0);
        setField(term92365, term92365.getClass(), "jsType", null);
        setField(term92365, term92365.getClass(), "parent", null);
        setField(term92364, term92364.getClass(), "parent", term92365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term91127;
        callMethod(klass, "process", argTypes, term90977, args);
        assertTrue(recursiveEquals(term90977, term92362));
        assertTrue(recursiveEquals(term91127, null));
    }

};


