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

public class LightweightMessageFormatter_format_413663799205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173445;
     Object term173931;
     Object term174509;
     Object term174515;

    public LightweightMessageFormatter_format_413663799205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term173573 = new HashMap();
        Class<? extends Object> term174519 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term174518 = ((Class) term174519).getDeclaredField((String) "REGION");
        ((Field) term174518).setAccessible(true);
        Object enum204 = ((Field) term174518).get((Object) null);
        term173445 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term173525 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term173525, term173525.getClass(), "inputsByName", term173573);
        setField(term173445, term173445.getClass(), "source", term173525);
        setField(term173445, term173445.getClass(), "excerpt", enum204);
        setBooleanField(term173445, term173445.getClass(), "colorize", true);
        term173931 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term173931, term173931.getClass(), "sourceName", "");
        setIntField(term173931, term173931.getClass(), "lineNumber", 1);
        Class<? extends Object> term174864 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term174863 = ((Class) term174864).getDeclaredField((String) "REGION");
        ((Field) term174863).setAccessible(true);
        Object enum205 = ((Field) term174863).get((Object) null);
        HashMap term174514 = new HashMap();
        term174509 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term174513 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term174509, term174509.getClass(), "excerpt", enum205);
        setField(term174513, term174513.getClass(), "options", null);
        setField(term174513, term174513.getClass(), "passes", null);
        setField(term174513, term174513.getClass(), "externs", null);
        setField(term174513, term174513.getClass(), "modules", null);
        setField(term174513, term174513.getClass(), "moduleGraph", null);
        setField(term174513, term174513.getClass(), "inputs", null);
        setField(term174513, term174513.getClass(), "errorManager", null);
        setField(term174513, term174513.getClass(), "warningsGuard", null);
        setField(term174513, term174513.getClass(), "externsRoot", null);
        setField(term174513, term174513.getClass(), "jsRoot", null);
        setField(term174513, term174513.getClass(), "externAndJsRoot", null);
        setField(term174513, term174513.getClass(), "inputsByName", term174514);
        setField(term174513, term174513.getClass(), "sourceMap", null);
        setField(term174513, term174513.getClass(), "externExports", null);
        setIntField(term174513, term174513.getClass(), "uniqueNameId", 0);
        setBooleanField(term174513, term174513.getClass(), "useThreads", false);
        setBooleanField(term174513, term174513.getClass(), "hasRegExpGlobalReferences", false);
        setField(term174513, term174513.getClass(), "functionInformationMap", null);
        setField(term174513, term174513.getClass(), "debugLog", null);
        setField(term174513, term174513.getClass(), "defaultCodingConvention", null);
        setField(term174513, term174513.getClass(), "typeRegistry", null);
        setField(term174513, term174513.getClass(), "parserConfig", null);
        setField(term174513, term174513.getClass(), "abstractInterpreter", null);
        setField(term174513, term174513.getClass(), "typeValidator", null);
        setField(term174513, term174513.getClass(), "tracker", null);
        setField(term174513, term174513.getClass(), "oldErrorReporter", null);
        setField(term174513, term174513.getClass(), "defaultErrorReporter", null);
        setField(term174513, term174513.getClass(), "outStream", null);
        setField(term174513, term174513.getClass(), "globalRefMap", null);
        setField(term174513, term174513.getClass(), "sanityCheck", null);
        setField(term174513, term174513.getClass(), "currentTracer", null);
        setField(term174513, term174513.getClass(), "currentPassName", null);
        setField(term174513, term174513.getClass(), "recentChange", null);
        setField(term174513, term174513.getClass(), "codeChangeHandlers", null);
        setField(term174513, term174513.getClass(), "stage", null);
        setField(term174509, term174509.getClass(), "source", term174513);
        setBooleanField(term174509, term174509.getClass(), "colorize", true);
        term174515 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term174515, term174515.getClass(), "type", null);
        setField(term174515, term174515.getClass(), "description", null);
        setField(term174515, term174515.getClass(), "sourceName", "");
        setField(term174515, term174515.getClass(), "node", null);
        setIntField(term174515, term174515.getClass(), "lineNumber", 1);
        setField(term174515, term174515.getClass(), "level", null);
        setIntField(term174515, term174515.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term173931;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term173445, args);
        assertTrue(recursiveEquals(term173445, term174509));
        assertTrue(recursiveEquals(term173931, term174515));
        assertTrue(recursiveEquals(retValue, ":1: \u001B[31mERROR\u001B[39m - null\n"));
    }

};


