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

public class LightweightMessageFormatter_formatWarning_2030513493199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166578;
     Object term167064;
     Object term167634;
     Object term167640;

    public LightweightMessageFormatter_formatWarning_2030513493199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term166706 = new HashMap();
        Class<? extends Object> term167642 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term167641 = ((Class) term167642).getDeclaredField((String) "REGION");
        ((Field) term167641).setAccessible(true);
        Object enum195 = ((Field) term167641).get((Object) null);
        term166578 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term166658 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term166658, term166658.getClass(), "inputsByName", term166706);
        setField(term166578, term166578.getClass(), "source", term166658);
        setField(term166578, term166578.getClass(), "excerpt", enum195);
        setBooleanField(term166578, term166578.getClass(), "colorize", true);
        term167064 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term167064, term167064.getClass(), "sourceName", null);
        setIntField(term167064, term167064.getClass(), "lineNumber", 1);
        Class<? extends Object> term167987 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term167986 = ((Class) term167987).getDeclaredField((String) "REGION");
        ((Field) term167986).setAccessible(true);
        Object enum196 = ((Field) term167986).get((Object) null);
        HashMap term167639 = new HashMap();
        term167634 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term167638 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term167634, term167634.getClass(), "excerpt", enum196);
        setField(term167638, term167638.getClass(), "options", null);
        setField(term167638, term167638.getClass(), "passes", null);
        setField(term167638, term167638.getClass(), "externs", null);
        setField(term167638, term167638.getClass(), "modules", null);
        setField(term167638, term167638.getClass(), "moduleGraph", null);
        setField(term167638, term167638.getClass(), "inputs", null);
        setField(term167638, term167638.getClass(), "errorManager", null);
        setField(term167638, term167638.getClass(), "warningsGuard", null);
        setField(term167638, term167638.getClass(), "externsRoot", null);
        setField(term167638, term167638.getClass(), "jsRoot", null);
        setField(term167638, term167638.getClass(), "externAndJsRoot", null);
        setField(term167638, term167638.getClass(), "inputsByName", term167639);
        setField(term167638, term167638.getClass(), "sourceMap", null);
        setField(term167638, term167638.getClass(), "externExports", null);
        setIntField(term167638, term167638.getClass(), "uniqueNameId", 0);
        setBooleanField(term167638, term167638.getClass(), "useThreads", false);
        setBooleanField(term167638, term167638.getClass(), "hasRegExpGlobalReferences", false);
        setField(term167638, term167638.getClass(), "functionInformationMap", null);
        setField(term167638, term167638.getClass(), "debugLog", null);
        setField(term167638, term167638.getClass(), "defaultCodingConvention", null);
        setField(term167638, term167638.getClass(), "typeRegistry", null);
        setField(term167638, term167638.getClass(), "parserConfig", null);
        setField(term167638, term167638.getClass(), "abstractInterpreter", null);
        setField(term167638, term167638.getClass(), "typeValidator", null);
        setField(term167638, term167638.getClass(), "tracker", null);
        setField(term167638, term167638.getClass(), "oldErrorReporter", null);
        setField(term167638, term167638.getClass(), "defaultErrorReporter", null);
        setField(term167638, term167638.getClass(), "outStream", null);
        setField(term167638, term167638.getClass(), "globalRefMap", null);
        setField(term167638, term167638.getClass(), "sanityCheck", null);
        setField(term167638, term167638.getClass(), "currentTracer", null);
        setField(term167638, term167638.getClass(), "currentPassName", null);
        setField(term167638, term167638.getClass(), "recentChange", null);
        setField(term167638, term167638.getClass(), "codeChangeHandlers", null);
        setField(term167638, term167638.getClass(), "stage", null);
        setField(term167634, term167634.getClass(), "source", term167638);
        setBooleanField(term167634, term167634.getClass(), "colorize", true);
        term167640 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term167640, term167640.getClass(), "type", null);
        setField(term167640, term167640.getClass(), "description", null);
        setField(term167640, term167640.getClass(), "sourceName", null);
        setField(term167640, term167640.getClass(), "node", null);
        setIntField(term167640, term167640.getClass(), "lineNumber", 1);
        setField(term167640, term167640.getClass(), "level", null);
        setIntField(term167640, term167640.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term167064;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term166578, args);
        assertTrue(recursiveEquals(term166578, term167634));
        assertTrue(recursiveEquals(term167064, term167640));
        assertTrue(recursiveEquals(retValue, "\u001B[35mWARNING\u001B[39m - null\n"));
    }

};


