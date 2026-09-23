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
import java.lang.String;

public class LightweightMessageFormatter_formatError_236602113131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96426;
     Object term96760;
     Object term97229;
     Object term97234;

    public LightweightMessageFormatter_formatError_236602113131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term97236 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term97235 = ((Class) term97236).getDeclaredField((String) "REGION");
        ((Field) term97235).setAccessible(true);
        Object enum108 = ((Field) term97235).get((Object) null);
        term96426 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term96506 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term96426, term96426.getClass(), "source", term96506);
        setField(term96426, term96426.getClass(), "excerpt", enum108);
        term96760 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term96760, term96760.getClass(), "sourceName", null);
        setIntField(term96760, term96760.getClass(), "lineNumber", 0);
        Class<? extends Object> term97581 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term97580 = ((Class) term97581).getDeclaredField((String) "REGION");
        ((Field) term97580).setAccessible(true);
        Object enum109 = ((Field) term97580).get((Object) null);
        term97229 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term97233 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term97229, term97229.getClass(), "excerpt", enum109);
        setField(term97233, term97233.getClass(), "options", null);
        setField(term97233, term97233.getClass(), "passes", null);
        setField(term97233, term97233.getClass(), "externs", null);
        setField(term97233, term97233.getClass(), "modules", null);
        setField(term97233, term97233.getClass(), "moduleGraph", null);
        setField(term97233, term97233.getClass(), "inputs", null);
        setField(term97233, term97233.getClass(), "errorManager", null);
        setField(term97233, term97233.getClass(), "warningsGuard", null);
        setField(term97233, term97233.getClass(), "externsRoot", null);
        setField(term97233, term97233.getClass(), "jsRoot", null);
        setField(term97233, term97233.getClass(), "externAndJsRoot", null);
        setField(term97233, term97233.getClass(), "inputsByName", null);
        setField(term97233, term97233.getClass(), "sourceMap", null);
        setField(term97233, term97233.getClass(), "externExports", null);
        setIntField(term97233, term97233.getClass(), "uniqueNameId", 0);
        setBooleanField(term97233, term97233.getClass(), "useThreads", false);
        setBooleanField(term97233, term97233.getClass(), "hasRegExpGlobalReferences", false);
        setField(term97233, term97233.getClass(), "functionInformationMap", null);
        setField(term97233, term97233.getClass(), "debugLog", null);
        setField(term97233, term97233.getClass(), "defaultCodingConvention", null);
        setField(term97233, term97233.getClass(), "typeRegistry", null);
        setField(term97233, term97233.getClass(), "parserConfig", null);
        setField(term97233, term97233.getClass(), "abstractInterpreter", null);
        setField(term97233, term97233.getClass(), "typeValidator", null);
        setField(term97233, term97233.getClass(), "tracker", null);
        setField(term97233, term97233.getClass(), "oldErrorReporter", null);
        setField(term97233, term97233.getClass(), "defaultErrorReporter", null);
        setField(term97233, term97233.getClass(), "outStream", null);
        setField(term97233, term97233.getClass(), "globalRefMap", null);
        setField(term97233, term97233.getClass(), "sanityCheck", null);
        setField(term97233, term97233.getClass(), "currentTracer", null);
        setField(term97233, term97233.getClass(), "currentPassName", null);
        setField(term97233, term97233.getClass(), "recentChange", null);
        setField(term97233, term97233.getClass(), "codeChangeHandlers", null);
        setField(term97233, term97233.getClass(), "stage", null);
        setField(term97229, term97229.getClass(), "source", term97233);
        setBooleanField(term97229, term97229.getClass(), "colorize", false);
        term97234 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term97234, term97234.getClass(), "type", null);
        setField(term97234, term97234.getClass(), "description", null);
        setField(term97234, term97234.getClass(), "sourceName", null);
        setField(term97234, term97234.getClass(), "node", null);
        setIntField(term97234, term97234.getClass(), "lineNumber", 0);
        setField(term97234, term97234.getClass(), "level", null);
        setIntField(term97234, term97234.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term96760;
        Object retValue = callMethod(klass, "formatError", argTypes, term96426, args);
        assertTrue(recursiveEquals(term96426, term97229));
        assertTrue(recursiveEquals(term96760, term97234));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


