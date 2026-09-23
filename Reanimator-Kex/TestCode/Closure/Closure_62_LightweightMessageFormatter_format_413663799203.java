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

public class LightweightMessageFormatter_format_413663799203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171116;
     Object term171602;
     Object term172085;
     Object term172091;

    public LightweightMessageFormatter_format_413663799203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term171244 = new HashMap();
        Class<? extends Object> term172093 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term172092 = ((Class) term172093).getDeclaredField((String) "REGION");
        ((Field) term172092).setAccessible(true);
        Object enum201 = ((Field) term172092).get((Object) null);
        term171116 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term171196 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term171196, term171196.getClass(), "inputsByName", term171244);
        setField(term171116, term171116.getClass(), "source", term171196);
        setField(term171116, term171116.getClass(), "excerpt", enum201);
        term171602 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term171602, term171602.getClass(), "sourceName", null);
        setIntField(term171602, term171602.getClass(), "lineNumber", 1);
        Class<? extends Object> term172438 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term172437 = ((Class) term172438).getDeclaredField((String) "REGION");
        ((Field) term172437).setAccessible(true);
        Object enum202 = ((Field) term172437).get((Object) null);
        HashMap term172090 = new HashMap();
        term172085 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term172089 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term172085, term172085.getClass(), "excerpt", enum202);
        setField(term172089, term172089.getClass(), "options", null);
        setField(term172089, term172089.getClass(), "passes", null);
        setField(term172089, term172089.getClass(), "externs", null);
        setField(term172089, term172089.getClass(), "modules", null);
        setField(term172089, term172089.getClass(), "moduleGraph", null);
        setField(term172089, term172089.getClass(), "inputs", null);
        setField(term172089, term172089.getClass(), "errorManager", null);
        setField(term172089, term172089.getClass(), "warningsGuard", null);
        setField(term172089, term172089.getClass(), "externsRoot", null);
        setField(term172089, term172089.getClass(), "jsRoot", null);
        setField(term172089, term172089.getClass(), "externAndJsRoot", null);
        setField(term172089, term172089.getClass(), "inputsByName", term172090);
        setField(term172089, term172089.getClass(), "sourceMap", null);
        setField(term172089, term172089.getClass(), "externExports", null);
        setIntField(term172089, term172089.getClass(), "uniqueNameId", 0);
        setBooleanField(term172089, term172089.getClass(), "useThreads", false);
        setBooleanField(term172089, term172089.getClass(), "hasRegExpGlobalReferences", false);
        setField(term172089, term172089.getClass(), "functionInformationMap", null);
        setField(term172089, term172089.getClass(), "debugLog", null);
        setField(term172089, term172089.getClass(), "defaultCodingConvention", null);
        setField(term172089, term172089.getClass(), "typeRegistry", null);
        setField(term172089, term172089.getClass(), "parserConfig", null);
        setField(term172089, term172089.getClass(), "abstractInterpreter", null);
        setField(term172089, term172089.getClass(), "typeValidator", null);
        setField(term172089, term172089.getClass(), "tracker", null);
        setField(term172089, term172089.getClass(), "oldErrorReporter", null);
        setField(term172089, term172089.getClass(), "defaultErrorReporter", null);
        setField(term172089, term172089.getClass(), "outStream", null);
        setField(term172089, term172089.getClass(), "globalRefMap", null);
        setField(term172089, term172089.getClass(), "sanityCheck", null);
        setField(term172089, term172089.getClass(), "currentTracer", null);
        setField(term172089, term172089.getClass(), "currentPassName", null);
        setField(term172089, term172089.getClass(), "recentChange", null);
        setField(term172089, term172089.getClass(), "codeChangeHandlers", null);
        setField(term172089, term172089.getClass(), "stage", null);
        setField(term172085, term172085.getClass(), "source", term172089);
        setBooleanField(term172085, term172085.getClass(), "colorize", false);
        term172091 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term172091, term172091.getClass(), "type", null);
        setField(term172091, term172091.getClass(), "description", null);
        setField(term172091, term172091.getClass(), "sourceName", null);
        setField(term172091, term172091.getClass(), "node", null);
        setIntField(term172091, term172091.getClass(), "lineNumber", 1);
        setField(term172091, term172091.getClass(), "level", null);
        setIntField(term172091, term172091.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term171602;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term171116, args);
        assertTrue(recursiveEquals(term171116, term172085));
        assertTrue(recursiveEquals(term171602, term172091));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


