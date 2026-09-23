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

public class ScopedAliases_process_84065531391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54106;
     Object term54278;
     Object term54756;
     Object term54758;

    public ScopedAliases_process_84065531391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54106 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term54186 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term54106, term54106.getClass(), "compiler", term54186);
        term54278 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term54370 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term54278, term54278.getClass(), "type", 0);
        setIntField(term54370, term54370.getClass(), "type", 0);
        setField(term54370, term54370.getClass(), "parent", null);
        setField(term54278, term54278.getClass(), "parent", term54370);
        setField(term54278, term54278.getClass(), "first", null);
        term54756 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term54757 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term54757, term54757.getClass(), "options", null);
        setField(term54757, term54757.getClass(), "passes", null);
        setField(term54757, term54757.getClass(), "externs", null);
        setField(term54757, term54757.getClass(), "modules", null);
        setField(term54757, term54757.getClass(), "moduleGraph", null);
        setField(term54757, term54757.getClass(), "inputs", null);
        setField(term54757, term54757.getClass(), "errorManager", null);
        setField(term54757, term54757.getClass(), "warningsGuard", null);
        setField(term54757, term54757.getClass(), "injectedLibraries", null);
        setField(term54757, term54757.getClass(), "externsRoot", null);
        setField(term54757, term54757.getClass(), "jsRoot", null);
        setField(term54757, term54757.getClass(), "externAndJsRoot", null);
        setField(term54757, term54757.getClass(), "inputsById", null);
        setField(term54757, term54757.getClass(), "sourceMap", null);
        setField(term54757, term54757.getClass(), "externExports", null);
        setIntField(term54757, term54757.getClass(), "uniqueNameId", 0);
        setBooleanField(term54757, term54757.getClass(), "useThreads", false);
        setBooleanField(term54757, term54757.getClass(), "hasRegExpGlobalReferences", false);
        setField(term54757, term54757.getClass(), "functionInformationMap", null);
        setField(term54757, term54757.getClass(), "debugLog", null);
        setField(term54757, term54757.getClass(), "defaultCodingConvention", null);
        setField(term54757, term54757.getClass(), "typeRegistry", null);
        setField(term54757, term54757.getClass(), "parserConfig", null);
        setField(term54757, term54757.getClass(), "abstractInterpreter", null);
        setField(term54757, term54757.getClass(), "typeValidator", null);
        setField(term54757, term54757.getClass(), "tracker", null);
        setField(term54757, term54757.getClass(), "oldErrorReporter", null);
        setField(term54757, term54757.getClass(), "defaultErrorReporter", null);
        setField(term54757, term54757.getClass(), "outStream", null);
        setField(term54757, term54757.getClass(), "globalRefMap", null);
        setDoubleField(term54757, term54757.getClass(), "progress", 0.0);
        setField(term54757, term54757.getClass(), "sanityCheck", null);
        setField(term54757, term54757.getClass(), "currentTracer", null);
        setField(term54757, term54757.getClass(), "currentPassName", null);
        setIntField(term54757, term54757.getClass(), "syntheticCodeId", 0);
        setField(term54757, term54757.getClass(), "recentChange", null);
        setField(term54757, term54757.getClass(), "codeChangeHandlers", null);
        setField(term54757, term54757.getClass(), "synthesizedExternsInput", null);
        setField(term54757, term54757.getClass(), "stage", null);
        setField(term54756, term54756.getClass(), "compiler", term54757);
        setField(term54756, term54756.getClass(), "preprocessorSymbolTable", null);
        setField(term54756, term54756.getClass(), "transformationHandler", null);
        term54758 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term54759 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term54758, term54758.getClass(), "str", null);
        setIntField(term54758, term54758.getClass(), "type", 0);
        setField(term54758, term54758.getClass(), "next", null);
        setField(term54758, term54758.getClass(), "first", null);
        setField(term54758, term54758.getClass(), "last", null);
        setField(term54758, term54758.getClass(), "propListHead", null);
        setIntField(term54758, term54758.getClass(), "sourcePosition", 0);
        setField(term54758, term54758.getClass(), "jsType", null);
        setField(term54759, term54759.getClass(), "str", null);
        setIntField(term54759, term54759.getClass(), "type", 0);
        setField(term54759, term54759.getClass(), "next", null);
        setField(term54759, term54759.getClass(), "first", null);
        setField(term54759, term54759.getClass(), "last", null);
        setField(term54759, term54759.getClass(), "propListHead", null);
        setIntField(term54759, term54759.getClass(), "sourcePosition", 0);
        setField(term54759, term54759.getClass(), "jsType", null);
        setField(term54759, term54759.getClass(), "parent", null);
        setField(term54758, term54758.getClass(), "parent", term54759);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term54278;
        callMethod(klass, "process", argTypes, term54106, args);
        assertTrue(recursiveEquals(term54106, term54756));
        assertTrue(recursiveEquals(term54278, null));
    }

};


