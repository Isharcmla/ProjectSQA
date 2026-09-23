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

public class LightweightMessageFormatter_formatError_23660211370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40909;
     Object term41243;
     Object term43363;
     Object term43368;

    public LightweightMessageFormatter_formatError_23660211370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term43370 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term43369 = ((Class) term43370).getDeclaredField((String) "LINE");
        ((Field) term43369).setAccessible(true);
        Object enum58 = ((Field) term43369).get((Object) null);
        term40909 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term40989 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term40909, term40909.getClass(), "source", term40989);
        setField(term40909, term40909.getClass(), "excerpt", enum58);
        term41243 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        Class<? extends Object> term43709 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term43708 = ((Class) term43709).getDeclaredField((String) "LINE");
        ((Field) term43708).setAccessible(true);
        Object enum59 = ((Field) term43708).get((Object) null);
        term43363 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term43367 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term43363, term43363.getClass(), "excerpt", enum59);
        setField(term43367, term43367.getClass(), "options", null);
        setField(term43367, term43367.getClass(), "passes", null);
        setField(term43367, term43367.getClass(), "externs", null);
        setField(term43367, term43367.getClass(), "modules", null);
        setField(term43367, term43367.getClass(), "moduleGraph", null);
        setField(term43367, term43367.getClass(), "inputs", null);
        setField(term43367, term43367.getClass(), "errorManager", null);
        setField(term43367, term43367.getClass(), "warningsGuard", null);
        setField(term43367, term43367.getClass(), "externsRoot", null);
        setField(term43367, term43367.getClass(), "jsRoot", null);
        setField(term43367, term43367.getClass(), "externAndJsRoot", null);
        setField(term43367, term43367.getClass(), "inputsByName", null);
        setField(term43367, term43367.getClass(), "sourceMap", null);
        setField(term43367, term43367.getClass(), "externExports", null);
        setIntField(term43367, term43367.getClass(), "uniqueNameId", 0);
        setBooleanField(term43367, term43367.getClass(), "useThreads", false);
        setBooleanField(term43367, term43367.getClass(), "hasRegExpGlobalReferences", false);
        setField(term43367, term43367.getClass(), "functionInformationMap", null);
        setField(term43367, term43367.getClass(), "debugLog", null);
        setField(term43367, term43367.getClass(), "defaultCodingConvention", null);
        setField(term43367, term43367.getClass(), "typeRegistry", null);
        setField(term43367, term43367.getClass(), "parserConfig", null);
        setField(term43367, term43367.getClass(), "abstractInterpreter", null);
        setField(term43367, term43367.getClass(), "typeValidator", null);
        setField(term43367, term43367.getClass(), "tracker", null);
        setField(term43367, term43367.getClass(), "oldErrorReporter", null);
        setField(term43367, term43367.getClass(), "defaultErrorReporter", null);
        setField(term43367, term43367.getClass(), "outStream", null);
        setField(term43367, term43367.getClass(), "globalRefMap", null);
        setField(term43367, term43367.getClass(), "sanityCheck", null);
        setField(term43367, term43367.getClass(), "currentTracer", null);
        setField(term43367, term43367.getClass(), "currentPassName", null);
        setField(term43367, term43367.getClass(), "recentChange", null);
        setField(term43367, term43367.getClass(), "codeChangeHandlers", null);
        setField(term43367, term43367.getClass(), "stage", null);
        setField(term43363, term43363.getClass(), "source", term43367);
        setBooleanField(term43363, term43363.getClass(), "colorize", false);
        term43368 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term43368, term43368.getClass(), "type", null);
        setField(term43368, term43368.getClass(), "description", null);
        setField(term43368, term43368.getClass(), "sourceName", null);
        setField(term43368, term43368.getClass(), "node", null);
        setIntField(term43368, term43368.getClass(), "lineNumber", 0);
        setField(term43368, term43368.getClass(), "level", null);
        setIntField(term43368, term43368.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term41243;
        Object retValue = callMethod(klass, "formatError", argTypes, term40909, args);
        assertTrue(recursiveEquals(term40909, term43363));
        assertTrue(recursiveEquals(term41243, term43368));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


