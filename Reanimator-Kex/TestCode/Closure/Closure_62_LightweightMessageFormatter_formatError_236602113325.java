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
import java.util.HashMap;
import java.lang.String;

public class LightweightMessageFormatter_formatError_236602113325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275044;
     Object term275530;
     Object term276149;
     Object term276155;

    public LightweightMessageFormatter_formatError_236602113325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term275172 = new HashMap();
        Class<? extends Object> term276159 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term276158 = ((Class) term276159).getDeclaredField((String) "REGION");
        ((Field) term276158).setAccessible(true);
        Object enum330 = ((Field) term276158).get((Object) null);
        term275044 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term275124 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term275124, term275124.getClass(), "inputsByName", term275172);
        setField(term275044, term275044.getClass(), "source", term275124);
        setField(term275044, term275044.getClass(), "excerpt", enum330);
        setBooleanField(term275044, term275044.getClass(), "colorize", true);
        term275530 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term275530, term275530.getClass(), "sourceName", "");
        setIntField(term275530, term275530.getClass(), "lineNumber", 1);
        Class<? extends Object> term276504 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term276503 = ((Class) term276504).getDeclaredField((String) "REGION");
        ((Field) term276503).setAccessible(true);
        Object enum331 = ((Field) term276503).get((Object) null);
        HashMap term276154 = new HashMap();
        term276149 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term276153 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term276149, term276149.getClass(), "excerpt", enum331);
        setField(term276153, term276153.getClass(), "options", null);
        setField(term276153, term276153.getClass(), "passes", null);
        setField(term276153, term276153.getClass(), "externs", null);
        setField(term276153, term276153.getClass(), "modules", null);
        setField(term276153, term276153.getClass(), "moduleGraph", null);
        setField(term276153, term276153.getClass(), "inputs", null);
        setField(term276153, term276153.getClass(), "errorManager", null);
        setField(term276153, term276153.getClass(), "warningsGuard", null);
        setField(term276153, term276153.getClass(), "externsRoot", null);
        setField(term276153, term276153.getClass(), "jsRoot", null);
        setField(term276153, term276153.getClass(), "externAndJsRoot", null);
        setField(term276153, term276153.getClass(), "inputsByName", term276154);
        setField(term276153, term276153.getClass(), "sourceMap", null);
        setField(term276153, term276153.getClass(), "externExports", null);
        setIntField(term276153, term276153.getClass(), "uniqueNameId", 0);
        setBooleanField(term276153, term276153.getClass(), "useThreads", false);
        setBooleanField(term276153, term276153.getClass(), "hasRegExpGlobalReferences", false);
        setField(term276153, term276153.getClass(), "functionInformationMap", null);
        setField(term276153, term276153.getClass(), "debugLog", null);
        setField(term276153, term276153.getClass(), "defaultCodingConvention", null);
        setField(term276153, term276153.getClass(), "typeRegistry", null);
        setField(term276153, term276153.getClass(), "parserConfig", null);
        setField(term276153, term276153.getClass(), "abstractInterpreter", null);
        setField(term276153, term276153.getClass(), "typeValidator", null);
        setField(term276153, term276153.getClass(), "tracker", null);
        setField(term276153, term276153.getClass(), "oldErrorReporter", null);
        setField(term276153, term276153.getClass(), "defaultErrorReporter", null);
        setField(term276153, term276153.getClass(), "outStream", null);
        setField(term276153, term276153.getClass(), "globalRefMap", null);
        setField(term276153, term276153.getClass(), "sanityCheck", null);
        setField(term276153, term276153.getClass(), "currentTracer", null);
        setField(term276153, term276153.getClass(), "currentPassName", null);
        setField(term276153, term276153.getClass(), "recentChange", null);
        setField(term276153, term276153.getClass(), "codeChangeHandlers", null);
        setField(term276153, term276153.getClass(), "stage", null);
        setField(term276149, term276149.getClass(), "source", term276153);
        setBooleanField(term276149, term276149.getClass(), "colorize", true);
        term276155 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term276155, term276155.getClass(), "type", null);
        setField(term276155, term276155.getClass(), "description", null);
        setField(term276155, term276155.getClass(), "sourceName", "");
        setField(term276155, term276155.getClass(), "node", null);
        setIntField(term276155, term276155.getClass(), "lineNumber", 1);
        setField(term276155, term276155.getClass(), "level", null);
        setIntField(term276155, term276155.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term275530;
        Object retValue = callMethod(klass, "formatError", argTypes, term275044, args);
        assertTrue(recursiveEquals(term275044, term276149));
        assertTrue(recursiveEquals(term275530, term276155));
        assertTrue(recursiveEquals(retValue, ":1: \u001B[31mERROR\u001B[39m - null\n"));
    }

};


