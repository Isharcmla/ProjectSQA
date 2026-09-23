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

public class LightweightMessageFormatter_format_413663799265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231810;
     Object term232144;
     Object term232606;
     Object term232611;

    public LightweightMessageFormatter_format_413663799265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term232613 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term232612 = ((Class) term232613).getDeclaredField((String) "REGION");
        ((Field) term232612).setAccessible(true);
        Object enum279 = ((Field) term232612).get((Object) null);
        term231810 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term231890 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term231810, term231810.getClass(), "source", term231890);
        setField(term231810, term231810.getClass(), "excerpt", enum279);
        term232144 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term232144, term232144.getClass(), "sourceName", null);
        setIntField(term232144, term232144.getClass(), "lineNumber", 0);
        Class<? extends Object> term232958 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term232957 = ((Class) term232958).getDeclaredField((String) "REGION");
        ((Field) term232957).setAccessible(true);
        Object enum280 = ((Field) term232957).get((Object) null);
        term232606 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term232610 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term232606, term232606.getClass(), "excerpt", enum280);
        setField(term232610, term232610.getClass(), "options", null);
        setField(term232610, term232610.getClass(), "passes", null);
        setField(term232610, term232610.getClass(), "externs", null);
        setField(term232610, term232610.getClass(), "modules", null);
        setField(term232610, term232610.getClass(), "moduleGraph", null);
        setField(term232610, term232610.getClass(), "inputs", null);
        setField(term232610, term232610.getClass(), "errorManager", null);
        setField(term232610, term232610.getClass(), "warningsGuard", null);
        setField(term232610, term232610.getClass(), "externsRoot", null);
        setField(term232610, term232610.getClass(), "jsRoot", null);
        setField(term232610, term232610.getClass(), "externAndJsRoot", null);
        setField(term232610, term232610.getClass(), "inputsByName", null);
        setField(term232610, term232610.getClass(), "sourceMap", null);
        setField(term232610, term232610.getClass(), "externExports", null);
        setIntField(term232610, term232610.getClass(), "uniqueNameId", 0);
        setBooleanField(term232610, term232610.getClass(), "useThreads", false);
        setBooleanField(term232610, term232610.getClass(), "hasRegExpGlobalReferences", false);
        setField(term232610, term232610.getClass(), "functionInformationMap", null);
        setField(term232610, term232610.getClass(), "debugLog", null);
        setField(term232610, term232610.getClass(), "defaultCodingConvention", null);
        setField(term232610, term232610.getClass(), "typeRegistry", null);
        setField(term232610, term232610.getClass(), "parserConfig", null);
        setField(term232610, term232610.getClass(), "abstractInterpreter", null);
        setField(term232610, term232610.getClass(), "typeValidator", null);
        setField(term232610, term232610.getClass(), "tracker", null);
        setField(term232610, term232610.getClass(), "oldErrorReporter", null);
        setField(term232610, term232610.getClass(), "defaultErrorReporter", null);
        setField(term232610, term232610.getClass(), "outStream", null);
        setField(term232610, term232610.getClass(), "globalRefMap", null);
        setField(term232610, term232610.getClass(), "sanityCheck", null);
        setField(term232610, term232610.getClass(), "currentTracer", null);
        setField(term232610, term232610.getClass(), "currentPassName", null);
        setField(term232610, term232610.getClass(), "recentChange", null);
        setField(term232610, term232610.getClass(), "codeChangeHandlers", null);
        setField(term232610, term232610.getClass(), "stage", null);
        setField(term232606, term232606.getClass(), "source", term232610);
        setBooleanField(term232606, term232606.getClass(), "colorize", false);
        term232611 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term232611, term232611.getClass(), "type", null);
        setField(term232611, term232611.getClass(), "description", null);
        setField(term232611, term232611.getClass(), "sourceName", null);
        setField(term232611, term232611.getClass(), "node", null);
        setIntField(term232611, term232611.getClass(), "lineNumber", 0);
        setField(term232611, term232611.getClass(), "level", null);
        setIntField(term232611, term232611.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term232144;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term231810, args);
        assertTrue(recursiveEquals(term231810, term232606));
        assertTrue(recursiveEquals(term232144, term232611));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


