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

public class LightweightMessageFormatter_formatWarning_2030513493255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221107;
     Object term221441;
     Object term222751;
     Object term222756;

    public LightweightMessageFormatter_formatWarning_2030513493255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term222758 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term222757 = ((Class) term222758).getDeclaredField((String) "REGION");
        ((Field) term222757).setAccessible(true);
        Object enum264 = ((Field) term222757).get((Object) null);
        term221107 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term221187 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term221107, term221107.getClass(), "source", term221187);
        setField(term221107, term221107.getClass(), "excerpt", enum264);
        term221441 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term221441, term221441.getClass(), "sourceName", null);
        setIntField(term221441, term221441.getClass(), "lineNumber", 0);
        Class<? extends Object> term223103 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term223102 = ((Class) term223103).getDeclaredField((String) "REGION");
        ((Field) term223102).setAccessible(true);
        Object enum265 = ((Field) term223102).get((Object) null);
        term222751 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term222755 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term222751, term222751.getClass(), "excerpt", enum265);
        setField(term222755, term222755.getClass(), "options", null);
        setField(term222755, term222755.getClass(), "passes", null);
        setField(term222755, term222755.getClass(), "externs", null);
        setField(term222755, term222755.getClass(), "modules", null);
        setField(term222755, term222755.getClass(), "moduleGraph", null);
        setField(term222755, term222755.getClass(), "inputs", null);
        setField(term222755, term222755.getClass(), "errorManager", null);
        setField(term222755, term222755.getClass(), "warningsGuard", null);
        setField(term222755, term222755.getClass(), "externsRoot", null);
        setField(term222755, term222755.getClass(), "jsRoot", null);
        setField(term222755, term222755.getClass(), "externAndJsRoot", null);
        setField(term222755, term222755.getClass(), "inputsByName", null);
        setField(term222755, term222755.getClass(), "sourceMap", null);
        setField(term222755, term222755.getClass(), "externExports", null);
        setIntField(term222755, term222755.getClass(), "uniqueNameId", 0);
        setBooleanField(term222755, term222755.getClass(), "useThreads", false);
        setBooleanField(term222755, term222755.getClass(), "hasRegExpGlobalReferences", false);
        setField(term222755, term222755.getClass(), "functionInformationMap", null);
        setField(term222755, term222755.getClass(), "debugLog", null);
        setField(term222755, term222755.getClass(), "defaultCodingConvention", null);
        setField(term222755, term222755.getClass(), "typeRegistry", null);
        setField(term222755, term222755.getClass(), "parserConfig", null);
        setField(term222755, term222755.getClass(), "abstractInterpreter", null);
        setField(term222755, term222755.getClass(), "typeValidator", null);
        setField(term222755, term222755.getClass(), "tracker", null);
        setField(term222755, term222755.getClass(), "oldErrorReporter", null);
        setField(term222755, term222755.getClass(), "defaultErrorReporter", null);
        setField(term222755, term222755.getClass(), "outStream", null);
        setField(term222755, term222755.getClass(), "globalRefMap", null);
        setField(term222755, term222755.getClass(), "sanityCheck", null);
        setField(term222755, term222755.getClass(), "currentTracer", null);
        setField(term222755, term222755.getClass(), "currentPassName", null);
        setField(term222755, term222755.getClass(), "recentChange", null);
        setField(term222755, term222755.getClass(), "codeChangeHandlers", null);
        setField(term222755, term222755.getClass(), "stage", null);
        setField(term222751, term222751.getClass(), "source", term222755);
        setBooleanField(term222751, term222751.getClass(), "colorize", false);
        term222756 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term222756, term222756.getClass(), "type", null);
        setField(term222756, term222756.getClass(), "description", null);
        setField(term222756, term222756.getClass(), "sourceName", null);
        setField(term222756, term222756.getClass(), "node", null);
        setIntField(term222756, term222756.getClass(), "lineNumber", 0);
        setField(term222756, term222756.getClass(), "level", null);
        setIntField(term222756, term222756.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term221441;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term221107, args);
        assertTrue(recursiveEquals(term221107, term222751));
        assertTrue(recursiveEquals(term221441, term222756));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


