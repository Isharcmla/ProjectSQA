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

public class LightweightMessageFormatter_formatError_236602113371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314831;
     Object term315165;
     Object term315634;
     Object term315639;

    public LightweightMessageFormatter_formatError_236602113371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term315641 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term315640 = ((Class) term315641).getDeclaredField((String) "REGION");
        ((Field) term315640).setAccessible(true);
        Object enum375 = ((Field) term315640).get((Object) null);
        term314831 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term314911 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term314831, term314831.getClass(), "source", term314911);
        setField(term314831, term314831.getClass(), "excerpt", enum375);
        term315165 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term315165, term315165.getClass(), "sourceName", null);
        setIntField(term315165, term315165.getClass(), "lineNumber", 0);
        Class<? extends Object> term315986 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term315985 = ((Class) term315986).getDeclaredField((String) "REGION");
        ((Field) term315985).setAccessible(true);
        Object enum376 = ((Field) term315985).get((Object) null);
        term315634 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term315638 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term315634, term315634.getClass(), "excerpt", enum376);
        setField(term315638, term315638.getClass(), "options", null);
        setField(term315638, term315638.getClass(), "passes", null);
        setField(term315638, term315638.getClass(), "externs", null);
        setField(term315638, term315638.getClass(), "modules", null);
        setField(term315638, term315638.getClass(), "moduleGraph", null);
        setField(term315638, term315638.getClass(), "inputs", null);
        setField(term315638, term315638.getClass(), "errorManager", null);
        setField(term315638, term315638.getClass(), "warningsGuard", null);
        setField(term315638, term315638.getClass(), "externsRoot", null);
        setField(term315638, term315638.getClass(), "jsRoot", null);
        setField(term315638, term315638.getClass(), "externAndJsRoot", null);
        setField(term315638, term315638.getClass(), "inputsByName", null);
        setField(term315638, term315638.getClass(), "sourceMap", null);
        setField(term315638, term315638.getClass(), "externExports", null);
        setIntField(term315638, term315638.getClass(), "uniqueNameId", 0);
        setBooleanField(term315638, term315638.getClass(), "useThreads", false);
        setBooleanField(term315638, term315638.getClass(), "hasRegExpGlobalReferences", false);
        setField(term315638, term315638.getClass(), "functionInformationMap", null);
        setField(term315638, term315638.getClass(), "debugLog", null);
        setField(term315638, term315638.getClass(), "defaultCodingConvention", null);
        setField(term315638, term315638.getClass(), "typeRegistry", null);
        setField(term315638, term315638.getClass(), "parserConfig", null);
        setField(term315638, term315638.getClass(), "abstractInterpreter", null);
        setField(term315638, term315638.getClass(), "typeValidator", null);
        setField(term315638, term315638.getClass(), "tracker", null);
        setField(term315638, term315638.getClass(), "oldErrorReporter", null);
        setField(term315638, term315638.getClass(), "defaultErrorReporter", null);
        setField(term315638, term315638.getClass(), "outStream", null);
        setField(term315638, term315638.getClass(), "globalRefMap", null);
        setField(term315638, term315638.getClass(), "sanityCheck", null);
        setField(term315638, term315638.getClass(), "currentTracer", null);
        setField(term315638, term315638.getClass(), "currentPassName", null);
        setField(term315638, term315638.getClass(), "recentChange", null);
        setField(term315638, term315638.getClass(), "codeChangeHandlers", null);
        setField(term315638, term315638.getClass(), "stage", null);
        setField(term315634, term315634.getClass(), "source", term315638);
        setBooleanField(term315634, term315634.getClass(), "colorize", false);
        term315639 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term315639, term315639.getClass(), "type", null);
        setField(term315639, term315639.getClass(), "description", null);
        setField(term315639, term315639.getClass(), "sourceName", null);
        setField(term315639, term315639.getClass(), "node", null);
        setIntField(term315639, term315639.getClass(), "lineNumber", 0);
        setField(term315639, term315639.getClass(), "level", null);
        setIntField(term315639, term315639.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term315165;
        Object retValue = callMethod(klass, "formatError", argTypes, term314831, args);
        assertTrue(recursiveEquals(term314831, term315634));
        assertTrue(recursiveEquals(term315165, term315639));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


