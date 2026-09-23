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

public class LightweightMessageFormatter_format_413663799210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178452;
     Object term178886;
     Object term180634;
     Object term180640;

    public LightweightMessageFormatter_format_413663799210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term178580 = new HashMap();
        Class<? extends Object> term180644 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term180643 = ((Class) term180644).getDeclaredField((String) "REGION");
        ((Field) term180643).setAccessible(true);
        Object enum211 = ((Field) term180643).get((Object) null);
        term178452 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term178532 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term178532, term178532.getClass(), "inputsByName", term178580);
        setField(term178452, term178452.getClass(), "source", term178532);
        setField(term178452, term178452.getClass(), "excerpt", enum211);
        term178886 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term178886, term178886.getClass(), "sourceName", ": ");
        setIntField(term178886, term178886.getClass(), "lineNumber", 1);
        Class<? extends Object> term180991 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term180990 = ((Class) term180991).getDeclaredField((String) "REGION");
        ((Field) term180990).setAccessible(true);
        Object enum212 = ((Field) term180990).get((Object) null);
        HashMap term180639 = new HashMap();
        term180634 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term180638 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term180634, term180634.getClass(), "excerpt", enum212);
        setField(term180638, term180638.getClass(), "options", null);
        setField(term180638, term180638.getClass(), "passes", null);
        setField(term180638, term180638.getClass(), "externs", null);
        setField(term180638, term180638.getClass(), "modules", null);
        setField(term180638, term180638.getClass(), "moduleGraph", null);
        setField(term180638, term180638.getClass(), "inputs", null);
        setField(term180638, term180638.getClass(), "errorManager", null);
        setField(term180638, term180638.getClass(), "warningsGuard", null);
        setField(term180638, term180638.getClass(), "externsRoot", null);
        setField(term180638, term180638.getClass(), "jsRoot", null);
        setField(term180638, term180638.getClass(), "externAndJsRoot", null);
        setField(term180638, term180638.getClass(), "inputsByName", term180639);
        setField(term180638, term180638.getClass(), "sourceMap", null);
        setField(term180638, term180638.getClass(), "externExports", null);
        setIntField(term180638, term180638.getClass(), "uniqueNameId", 0);
        setBooleanField(term180638, term180638.getClass(), "useThreads", false);
        setBooleanField(term180638, term180638.getClass(), "hasRegExpGlobalReferences", false);
        setField(term180638, term180638.getClass(), "functionInformationMap", null);
        setField(term180638, term180638.getClass(), "debugLog", null);
        setField(term180638, term180638.getClass(), "defaultCodingConvention", null);
        setField(term180638, term180638.getClass(), "typeRegistry", null);
        setField(term180638, term180638.getClass(), "parserConfig", null);
        setField(term180638, term180638.getClass(), "abstractInterpreter", null);
        setField(term180638, term180638.getClass(), "typeValidator", null);
        setField(term180638, term180638.getClass(), "tracker", null);
        setField(term180638, term180638.getClass(), "oldErrorReporter", null);
        setField(term180638, term180638.getClass(), "defaultErrorReporter", null);
        setField(term180638, term180638.getClass(), "outStream", null);
        setField(term180638, term180638.getClass(), "globalRefMap", null);
        setField(term180638, term180638.getClass(), "sanityCheck", null);
        setField(term180638, term180638.getClass(), "currentTracer", null);
        setField(term180638, term180638.getClass(), "currentPassName", null);
        setField(term180638, term180638.getClass(), "recentChange", null);
        setField(term180638, term180638.getClass(), "codeChangeHandlers", null);
        setField(term180638, term180638.getClass(), "stage", null);
        setField(term180634, term180634.getClass(), "source", term180638);
        setBooleanField(term180634, term180634.getClass(), "colorize", false);
        term180640 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term180640, term180640.getClass(), "type", null);
        setField(term180640, term180640.getClass(), "description", null);
        setField(term180640, term180640.getClass(), "sourceName", ": ");
        setField(term180640, term180640.getClass(), "node", null);
        setIntField(term180640, term180640.getClass(), "lineNumber", 1);
        setField(term180640, term180640.getClass(), "level", null);
        setIntField(term180640, term180640.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term178886;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term178452, args);
        assertTrue(recursiveEquals(term178452, term180634));
        assertTrue(recursiveEquals(term178886, term180640));
        assertTrue(recursiveEquals(retValue, ": :1: ERROR - null\n"));
    }

};


