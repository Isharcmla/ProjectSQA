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

public class LightweightMessageFormatter_formatError_236602113341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289528;
     Object term290014;
     Object term290500;
     Object term290506;

    public LightweightMessageFormatter_formatError_236602113341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term289656 = new HashMap();
        Class<? extends Object> term290508 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term290507 = ((Class) term290508).getDeclaredField((String) "REGION");
        ((Field) term290507).setAccessible(true);
        Object enum345 = ((Field) term290507).get((Object) null);
        term289528 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term289608 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term289608, term289608.getClass(), "inputsByName", term289656);
        setField(term289528, term289528.getClass(), "source", term289608);
        setField(term289528, term289528.getClass(), "excerpt", enum345);
        term290014 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term290014, term290014.getClass(), "sourceName", null);
        setIntField(term290014, term290014.getClass(), "lineNumber", 1);
        Class<? extends Object> term290853 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term290852 = ((Class) term290853).getDeclaredField((String) "REGION");
        ((Field) term290852).setAccessible(true);
        Object enum346 = ((Field) term290852).get((Object) null);
        HashMap term290505 = new HashMap();
        term290500 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term290504 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term290500, term290500.getClass(), "excerpt", enum346);
        setField(term290504, term290504.getClass(), "options", null);
        setField(term290504, term290504.getClass(), "passes", null);
        setField(term290504, term290504.getClass(), "externs", null);
        setField(term290504, term290504.getClass(), "modules", null);
        setField(term290504, term290504.getClass(), "moduleGraph", null);
        setField(term290504, term290504.getClass(), "inputs", null);
        setField(term290504, term290504.getClass(), "errorManager", null);
        setField(term290504, term290504.getClass(), "warningsGuard", null);
        setField(term290504, term290504.getClass(), "externsRoot", null);
        setField(term290504, term290504.getClass(), "jsRoot", null);
        setField(term290504, term290504.getClass(), "externAndJsRoot", null);
        setField(term290504, term290504.getClass(), "inputsByName", term290505);
        setField(term290504, term290504.getClass(), "sourceMap", null);
        setField(term290504, term290504.getClass(), "externExports", null);
        setIntField(term290504, term290504.getClass(), "uniqueNameId", 0);
        setBooleanField(term290504, term290504.getClass(), "useThreads", false);
        setBooleanField(term290504, term290504.getClass(), "hasRegExpGlobalReferences", false);
        setField(term290504, term290504.getClass(), "functionInformationMap", null);
        setField(term290504, term290504.getClass(), "debugLog", null);
        setField(term290504, term290504.getClass(), "defaultCodingConvention", null);
        setField(term290504, term290504.getClass(), "typeRegistry", null);
        setField(term290504, term290504.getClass(), "parserConfig", null);
        setField(term290504, term290504.getClass(), "abstractInterpreter", null);
        setField(term290504, term290504.getClass(), "typeValidator", null);
        setField(term290504, term290504.getClass(), "tracker", null);
        setField(term290504, term290504.getClass(), "oldErrorReporter", null);
        setField(term290504, term290504.getClass(), "defaultErrorReporter", null);
        setField(term290504, term290504.getClass(), "outStream", null);
        setField(term290504, term290504.getClass(), "globalRefMap", null);
        setField(term290504, term290504.getClass(), "sanityCheck", null);
        setField(term290504, term290504.getClass(), "currentTracer", null);
        setField(term290504, term290504.getClass(), "currentPassName", null);
        setField(term290504, term290504.getClass(), "recentChange", null);
        setField(term290504, term290504.getClass(), "codeChangeHandlers", null);
        setField(term290504, term290504.getClass(), "stage", null);
        setField(term290500, term290500.getClass(), "source", term290504);
        setBooleanField(term290500, term290500.getClass(), "colorize", false);
        term290506 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term290506, term290506.getClass(), "type", null);
        setField(term290506, term290506.getClass(), "description", null);
        setField(term290506, term290506.getClass(), "sourceName", null);
        setField(term290506, term290506.getClass(), "node", null);
        setIntField(term290506, term290506.getClass(), "lineNumber", 1);
        setField(term290506, term290506.getClass(), "level", null);
        setIntField(term290506, term290506.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term290014;
        Object retValue = callMethod(klass, "formatError", argTypes, term289528, args);
        assertTrue(recursiveEquals(term289528, term290500));
        assertTrue(recursiveEquals(term290014, term290506));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


