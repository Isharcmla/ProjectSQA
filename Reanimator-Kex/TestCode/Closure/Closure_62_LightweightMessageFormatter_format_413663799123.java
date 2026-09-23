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

public class LightweightMessageFormatter_format_413663799123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88583;
     Object term88917;
     Object term89812;
     Object term89817;

    public LightweightMessageFormatter_format_413663799123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term89819 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term89818 = ((Class) term89819).getDeclaredField((String) "REGION");
        ((Field) term89818).setAccessible(true);
        Object enum99 = ((Field) term89818).get((Object) null);
        term88583 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term88663 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term88583, term88583.getClass(), "source", term88663);
        setField(term88583, term88583.getClass(), "excerpt", enum99);
        setBooleanField(term88583, term88583.getClass(), "colorize", true);
        term88917 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term88917, term88917.getClass(), "sourceName", null);
        setIntField(term88917, term88917.getClass(), "lineNumber", 0);
        Class<? extends Object> term90164 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term90163 = ((Class) term90164).getDeclaredField((String) "REGION");
        ((Field) term90163).setAccessible(true);
        Object enum100 = ((Field) term90163).get((Object) null);
        term89812 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term89816 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term89812, term89812.getClass(), "excerpt", enum100);
        setField(term89816, term89816.getClass(), "options", null);
        setField(term89816, term89816.getClass(), "passes", null);
        setField(term89816, term89816.getClass(), "externs", null);
        setField(term89816, term89816.getClass(), "modules", null);
        setField(term89816, term89816.getClass(), "moduleGraph", null);
        setField(term89816, term89816.getClass(), "inputs", null);
        setField(term89816, term89816.getClass(), "errorManager", null);
        setField(term89816, term89816.getClass(), "warningsGuard", null);
        setField(term89816, term89816.getClass(), "externsRoot", null);
        setField(term89816, term89816.getClass(), "jsRoot", null);
        setField(term89816, term89816.getClass(), "externAndJsRoot", null);
        setField(term89816, term89816.getClass(), "inputsByName", null);
        setField(term89816, term89816.getClass(), "sourceMap", null);
        setField(term89816, term89816.getClass(), "externExports", null);
        setIntField(term89816, term89816.getClass(), "uniqueNameId", 0);
        setBooleanField(term89816, term89816.getClass(), "useThreads", false);
        setBooleanField(term89816, term89816.getClass(), "hasRegExpGlobalReferences", false);
        setField(term89816, term89816.getClass(), "functionInformationMap", null);
        setField(term89816, term89816.getClass(), "debugLog", null);
        setField(term89816, term89816.getClass(), "defaultCodingConvention", null);
        setField(term89816, term89816.getClass(), "typeRegistry", null);
        setField(term89816, term89816.getClass(), "parserConfig", null);
        setField(term89816, term89816.getClass(), "abstractInterpreter", null);
        setField(term89816, term89816.getClass(), "typeValidator", null);
        setField(term89816, term89816.getClass(), "tracker", null);
        setField(term89816, term89816.getClass(), "oldErrorReporter", null);
        setField(term89816, term89816.getClass(), "defaultErrorReporter", null);
        setField(term89816, term89816.getClass(), "outStream", null);
        setField(term89816, term89816.getClass(), "globalRefMap", null);
        setField(term89816, term89816.getClass(), "sanityCheck", null);
        setField(term89816, term89816.getClass(), "currentTracer", null);
        setField(term89816, term89816.getClass(), "currentPassName", null);
        setField(term89816, term89816.getClass(), "recentChange", null);
        setField(term89816, term89816.getClass(), "codeChangeHandlers", null);
        setField(term89816, term89816.getClass(), "stage", null);
        setField(term89812, term89812.getClass(), "source", term89816);
        setBooleanField(term89812, term89812.getClass(), "colorize", true);
        term89817 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term89817, term89817.getClass(), "type", null);
        setField(term89817, term89817.getClass(), "description", null);
        setField(term89817, term89817.getClass(), "sourceName", null);
        setField(term89817, term89817.getClass(), "node", null);
        setIntField(term89817, term89817.getClass(), "lineNumber", 0);
        setField(term89817, term89817.getClass(), "level", null);
        setIntField(term89817, term89817.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term88917;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term88583, args);
        assertTrue(recursiveEquals(term88583, term89812));
        assertTrue(recursiveEquals(term88917, term89817));
        assertTrue(recursiveEquals(retValue, "\u001B[31mERROR\u001B[39m - null\n"));
    }

};


