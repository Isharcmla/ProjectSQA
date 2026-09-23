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

public class LightweightMessageFormatter_formatWarning_2030513493244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212469;
     Object term212803;
     Object term213642;
     Object term213647;

    public LightweightMessageFormatter_formatWarning_2030513493244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term213649 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term213648 = ((Class) term213649).getDeclaredField((String) "REGION");
        ((Field) term213648).setAccessible(true);
        Object enum252 = ((Field) term213648).get((Object) null);
        term212469 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term212549 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term212469, term212469.getClass(), "source", term212549);
        setField(term212469, term212469.getClass(), "excerpt", enum252);
        term212803 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term212803, term212803.getClass(), "sourceName", null);
        setIntField(term212803, term212803.getClass(), "lineNumber", 0);
        Class<? extends Object> term213994 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term213993 = ((Class) term213994).getDeclaredField((String) "REGION");
        ((Field) term213993).setAccessible(true);
        Object enum253 = ((Field) term213993).get((Object) null);
        term213642 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term213646 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term213642, term213642.getClass(), "excerpt", enum253);
        setField(term213646, term213646.getClass(), "options", null);
        setField(term213646, term213646.getClass(), "passes", null);
        setField(term213646, term213646.getClass(), "externs", null);
        setField(term213646, term213646.getClass(), "modules", null);
        setField(term213646, term213646.getClass(), "moduleGraph", null);
        setField(term213646, term213646.getClass(), "inputs", null);
        setField(term213646, term213646.getClass(), "errorManager", null);
        setField(term213646, term213646.getClass(), "warningsGuard", null);
        setField(term213646, term213646.getClass(), "externsRoot", null);
        setField(term213646, term213646.getClass(), "jsRoot", null);
        setField(term213646, term213646.getClass(), "externAndJsRoot", null);
        setField(term213646, term213646.getClass(), "inputsByName", null);
        setField(term213646, term213646.getClass(), "sourceMap", null);
        setField(term213646, term213646.getClass(), "externExports", null);
        setIntField(term213646, term213646.getClass(), "uniqueNameId", 0);
        setBooleanField(term213646, term213646.getClass(), "useThreads", false);
        setBooleanField(term213646, term213646.getClass(), "hasRegExpGlobalReferences", false);
        setField(term213646, term213646.getClass(), "functionInformationMap", null);
        setField(term213646, term213646.getClass(), "debugLog", null);
        setField(term213646, term213646.getClass(), "defaultCodingConvention", null);
        setField(term213646, term213646.getClass(), "typeRegistry", null);
        setField(term213646, term213646.getClass(), "parserConfig", null);
        setField(term213646, term213646.getClass(), "abstractInterpreter", null);
        setField(term213646, term213646.getClass(), "typeValidator", null);
        setField(term213646, term213646.getClass(), "tracker", null);
        setField(term213646, term213646.getClass(), "oldErrorReporter", null);
        setField(term213646, term213646.getClass(), "defaultErrorReporter", null);
        setField(term213646, term213646.getClass(), "outStream", null);
        setField(term213646, term213646.getClass(), "globalRefMap", null);
        setField(term213646, term213646.getClass(), "sanityCheck", null);
        setField(term213646, term213646.getClass(), "currentTracer", null);
        setField(term213646, term213646.getClass(), "currentPassName", null);
        setField(term213646, term213646.getClass(), "recentChange", null);
        setField(term213646, term213646.getClass(), "codeChangeHandlers", null);
        setField(term213646, term213646.getClass(), "stage", null);
        setField(term213642, term213642.getClass(), "source", term213646);
        setBooleanField(term213642, term213642.getClass(), "colorize", false);
        term213647 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term213647, term213647.getClass(), "type", null);
        setField(term213647, term213647.getClass(), "description", null);
        setField(term213647, term213647.getClass(), "sourceName", null);
        setField(term213647, term213647.getClass(), "node", null);
        setIntField(term213647, term213647.getClass(), "lineNumber", 0);
        setField(term213647, term213647.getClass(), "level", null);
        setIntField(term213647, term213647.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term212803;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term212469, args);
        assertTrue(recursiveEquals(term212469, term213642));
        assertTrue(recursiveEquals(term212803, term213647));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


