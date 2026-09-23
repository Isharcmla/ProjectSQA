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

public class ScopedAliases_process_84065531364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29715;
     Object term29865;
     Object term30855;
     Object term30857;

    public ScopedAliases_process_84065531364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29715 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term29795 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term29715, term29715.getClass(), "compiler", term29795);
        term29865 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29865, term29865.getClass(), "type", 0);
        setIntField(term29935, term29935.getClass(), "type", 0);
        setField(term29935, term29935.getClass(), "parent", null);
        setField(term29865, term29865.getClass(), "parent", term29935);
        setField(term29865, term29865.getClass(), "first", null);
        term30855 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term30856 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term30856, term30856.getClass(), "options", null);
        setField(term30856, term30856.getClass(), "passes", null);
        setField(term30856, term30856.getClass(), "externs", null);
        setField(term30856, term30856.getClass(), "modules", null);
        setField(term30856, term30856.getClass(), "moduleGraph", null);
        setField(term30856, term30856.getClass(), "inputs", null);
        setField(term30856, term30856.getClass(), "errorManager", null);
        setField(term30856, term30856.getClass(), "warningsGuard", null);
        setField(term30856, term30856.getClass(), "externsRoot", null);
        setField(term30856, term30856.getClass(), "jsRoot", null);
        setField(term30856, term30856.getClass(), "externAndJsRoot", null);
        setField(term30856, term30856.getClass(), "inputsById", null);
        setField(term30856, term30856.getClass(), "sourceMap", null);
        setField(term30856, term30856.getClass(), "externExports", null);
        setIntField(term30856, term30856.getClass(), "uniqueNameId", 0);
        setBooleanField(term30856, term30856.getClass(), "useThreads", false);
        setBooleanField(term30856, term30856.getClass(), "hasRegExpGlobalReferences", false);
        setField(term30856, term30856.getClass(), "functionInformationMap", null);
        setField(term30856, term30856.getClass(), "debugLog", null);
        setField(term30856, term30856.getClass(), "defaultCodingConvention", null);
        setField(term30856, term30856.getClass(), "typeRegistry", null);
        setField(term30856, term30856.getClass(), "parserConfig", null);
        setField(term30856, term30856.getClass(), "abstractInterpreter", null);
        setField(term30856, term30856.getClass(), "typeValidator", null);
        setField(term30856, term30856.getClass(), "tracker", null);
        setField(term30856, term30856.getClass(), "oldErrorReporter", null);
        setField(term30856, term30856.getClass(), "defaultErrorReporter", null);
        setField(term30856, term30856.getClass(), "outStream", null);
        setField(term30856, term30856.getClass(), "globalRefMap", null);
        setField(term30856, term30856.getClass(), "sanityCheck", null);
        setField(term30856, term30856.getClass(), "currentTracer", null);
        setField(term30856, term30856.getClass(), "currentPassName", null);
        setIntField(term30856, term30856.getClass(), "syntheticCodeId", 0);
        setField(term30856, term30856.getClass(), "recentChange", null);
        setField(term30856, term30856.getClass(), "codeChangeHandlers", null);
        setField(term30856, term30856.getClass(), "stage", null);
        setField(term30855, term30855.getClass(), "compiler", term30856);
        setField(term30855, term30855.getClass(), "preprocessorSymbolTable", null);
        setField(term30855, term30855.getClass(), "transformationHandler", null);
        term30857 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30857, term30857.getClass(), "type", 0);
        setField(term30857, term30857.getClass(), "next", null);
        setField(term30857, term30857.getClass(), "first", null);
        setField(term30857, term30857.getClass(), "last", null);
        setField(term30857, term30857.getClass(), "propListHead", null);
        setIntField(term30857, term30857.getClass(), "sourcePosition", 0);
        setField(term30857, term30857.getClass(), "jsType", null);
        setIntField(term30858, term30858.getClass(), "type", 0);
        setField(term30858, term30858.getClass(), "next", null);
        setField(term30858, term30858.getClass(), "first", null);
        setField(term30858, term30858.getClass(), "last", null);
        setField(term30858, term30858.getClass(), "propListHead", null);
        setIntField(term30858, term30858.getClass(), "sourcePosition", 0);
        setField(term30858, term30858.getClass(), "jsType", null);
        setField(term30858, term30858.getClass(), "parent", null);
        setField(term30857, term30857.getClass(), "parent", term30858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term29865;
        callMethod(klass, "process", argTypes, term29715, args);
        assertTrue(recursiveEquals(term29715, term30855));
        assertTrue(recursiveEquals(term29865, null));
    }

};


