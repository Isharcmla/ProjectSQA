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

public class LightweightMessageFormatter_formatWarning_2030513493179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145399;
     Object term145733;
     Object term147255;
     Object term147260;

    public LightweightMessageFormatter_formatWarning_2030513493179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term147264 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term147263 = ((Class) term147264).getDeclaredField((String) "REGION");
        ((Field) term147263).setAccessible(true);
        Object enum165 = ((Field) term147263).get((Object) null);
        term145399 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term145479 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term145399, term145399.getClass(), "source", term145479);
        setField(term145399, term145399.getClass(), "excerpt", enum165);
        setBooleanField(term145399, term145399.getClass(), "colorize", true);
        term145733 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term145733, term145733.getClass(), "sourceName", "");
        setIntField(term145733, term145733.getClass(), "lineNumber", -2147483646);
        Class<? extends Object> term147609 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term147608 = ((Class) term147609).getDeclaredField((String) "REGION");
        ((Field) term147608).setAccessible(true);
        Object enum166 = ((Field) term147608).get((Object) null);
        term147255 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term147259 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term147255, term147255.getClass(), "excerpt", enum166);
        setField(term147259, term147259.getClass(), "options", null);
        setField(term147259, term147259.getClass(), "passes", null);
        setField(term147259, term147259.getClass(), "externs", null);
        setField(term147259, term147259.getClass(), "modules", null);
        setField(term147259, term147259.getClass(), "moduleGraph", null);
        setField(term147259, term147259.getClass(), "inputs", null);
        setField(term147259, term147259.getClass(), "errorManager", null);
        setField(term147259, term147259.getClass(), "warningsGuard", null);
        setField(term147259, term147259.getClass(), "externsRoot", null);
        setField(term147259, term147259.getClass(), "jsRoot", null);
        setField(term147259, term147259.getClass(), "externAndJsRoot", null);
        setField(term147259, term147259.getClass(), "inputsByName", null);
        setField(term147259, term147259.getClass(), "sourceMap", null);
        setField(term147259, term147259.getClass(), "externExports", null);
        setIntField(term147259, term147259.getClass(), "uniqueNameId", 0);
        setBooleanField(term147259, term147259.getClass(), "useThreads", false);
        setBooleanField(term147259, term147259.getClass(), "hasRegExpGlobalReferences", false);
        setField(term147259, term147259.getClass(), "functionInformationMap", null);
        setField(term147259, term147259.getClass(), "debugLog", null);
        setField(term147259, term147259.getClass(), "defaultCodingConvention", null);
        setField(term147259, term147259.getClass(), "typeRegistry", null);
        setField(term147259, term147259.getClass(), "parserConfig", null);
        setField(term147259, term147259.getClass(), "abstractInterpreter", null);
        setField(term147259, term147259.getClass(), "typeValidator", null);
        setField(term147259, term147259.getClass(), "tracker", null);
        setField(term147259, term147259.getClass(), "oldErrorReporter", null);
        setField(term147259, term147259.getClass(), "defaultErrorReporter", null);
        setField(term147259, term147259.getClass(), "outStream", null);
        setField(term147259, term147259.getClass(), "globalRefMap", null);
        setField(term147259, term147259.getClass(), "sanityCheck", null);
        setField(term147259, term147259.getClass(), "currentTracer", null);
        setField(term147259, term147259.getClass(), "currentPassName", null);
        setField(term147259, term147259.getClass(), "recentChange", null);
        setField(term147259, term147259.getClass(), "codeChangeHandlers", null);
        setField(term147259, term147259.getClass(), "stage", null);
        setField(term147255, term147255.getClass(), "source", term147259);
        setBooleanField(term147255, term147255.getClass(), "colorize", true);
        term147260 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term147260, term147260.getClass(), "type", null);
        setField(term147260, term147260.getClass(), "description", null);
        setField(term147260, term147260.getClass(), "sourceName", "");
        setField(term147260, term147260.getClass(), "node", null);
        setIntField(term147260, term147260.getClass(), "lineNumber", -2147483646);
        setField(term147260, term147260.getClass(), "level", null);
        setIntField(term147260, term147260.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term145733;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term145399, args);
        assertTrue(recursiveEquals(term145399, term147255));
        assertTrue(recursiveEquals(term145733, term147260));
        assertTrue(recursiveEquals(retValue, ": \u001B[35mWARNING\u001B[39m - null\n"));
    }

};


