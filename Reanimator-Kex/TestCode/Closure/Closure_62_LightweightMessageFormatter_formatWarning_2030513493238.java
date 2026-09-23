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

public class LightweightMessageFormatter_formatWarning_2030513493238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207236;
     Object term207570;
     Object term209514;
     Object term209519;

    public LightweightMessageFormatter_formatWarning_2030513493238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term209523 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term209522 = ((Class) term209523).getDeclaredField((String) "REGION");
        ((Field) term209522).setAccessible(true);
        Object enum247 = ((Field) term209522).get((Object) null);
        term207236 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term207316 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term207236, term207236.getClass(), "source", term207316);
        setField(term207236, term207236.getClass(), "excerpt", enum247);
        term207570 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term207570, term207570.getClass(), "sourceName", "");
        setIntField(term207570, term207570.getClass(), "lineNumber", 0);
        Class<? extends Object> term209868 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term209867 = ((Class) term209868).getDeclaredField((String) "REGION");
        ((Field) term209867).setAccessible(true);
        Object enum248 = ((Field) term209867).get((Object) null);
        term209514 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term209518 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term209514, term209514.getClass(), "excerpt", enum248);
        setField(term209518, term209518.getClass(), "options", null);
        setField(term209518, term209518.getClass(), "passes", null);
        setField(term209518, term209518.getClass(), "externs", null);
        setField(term209518, term209518.getClass(), "modules", null);
        setField(term209518, term209518.getClass(), "moduleGraph", null);
        setField(term209518, term209518.getClass(), "inputs", null);
        setField(term209518, term209518.getClass(), "errorManager", null);
        setField(term209518, term209518.getClass(), "warningsGuard", null);
        setField(term209518, term209518.getClass(), "externsRoot", null);
        setField(term209518, term209518.getClass(), "jsRoot", null);
        setField(term209518, term209518.getClass(), "externAndJsRoot", null);
        setField(term209518, term209518.getClass(), "inputsByName", null);
        setField(term209518, term209518.getClass(), "sourceMap", null);
        setField(term209518, term209518.getClass(), "externExports", null);
        setIntField(term209518, term209518.getClass(), "uniqueNameId", 0);
        setBooleanField(term209518, term209518.getClass(), "useThreads", false);
        setBooleanField(term209518, term209518.getClass(), "hasRegExpGlobalReferences", false);
        setField(term209518, term209518.getClass(), "functionInformationMap", null);
        setField(term209518, term209518.getClass(), "debugLog", null);
        setField(term209518, term209518.getClass(), "defaultCodingConvention", null);
        setField(term209518, term209518.getClass(), "typeRegistry", null);
        setField(term209518, term209518.getClass(), "parserConfig", null);
        setField(term209518, term209518.getClass(), "abstractInterpreter", null);
        setField(term209518, term209518.getClass(), "typeValidator", null);
        setField(term209518, term209518.getClass(), "tracker", null);
        setField(term209518, term209518.getClass(), "oldErrorReporter", null);
        setField(term209518, term209518.getClass(), "defaultErrorReporter", null);
        setField(term209518, term209518.getClass(), "outStream", null);
        setField(term209518, term209518.getClass(), "globalRefMap", null);
        setField(term209518, term209518.getClass(), "sanityCheck", null);
        setField(term209518, term209518.getClass(), "currentTracer", null);
        setField(term209518, term209518.getClass(), "currentPassName", null);
        setField(term209518, term209518.getClass(), "recentChange", null);
        setField(term209518, term209518.getClass(), "codeChangeHandlers", null);
        setField(term209518, term209518.getClass(), "stage", null);
        setField(term209514, term209514.getClass(), "source", term209518);
        setBooleanField(term209514, term209514.getClass(), "colorize", false);
        term209519 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term209519, term209519.getClass(), "type", null);
        setField(term209519, term209519.getClass(), "description", null);
        setField(term209519, term209519.getClass(), "sourceName", "");
        setField(term209519, term209519.getClass(), "node", null);
        setIntField(term209519, term209519.getClass(), "lineNumber", 0);
        setField(term209519, term209519.getClass(), "level", null);
        setIntField(term209519, term209519.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term207570;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term207236, args);
        assertTrue(recursiveEquals(term207236, term209514));
        assertTrue(recursiveEquals(term207570, term209519));
        assertTrue(recursiveEquals(retValue, ": WARNING - null\n"));
    }

};


