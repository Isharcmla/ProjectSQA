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

public class LightweightMessageFormatter_formatWarning_2030513493225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196938;
     Object term197424;
     Object term197985;
     Object term197991;

    public LightweightMessageFormatter_formatWarning_2030513493225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term197066 = new HashMap();
        Class<? extends Object> term197995 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term197994 = ((Class) term197995).getDeclaredField((String) "REGION");
        ((Field) term197994).setAccessible(true);
        Object enum234 = ((Field) term197994).get((Object) null);
        term196938 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term197018 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term197018, term197018.getClass(), "inputsByName", term197066);
        setField(term196938, term196938.getClass(), "source", term197018);
        setField(term196938, term196938.getClass(), "excerpt", enum234);
        term197424 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term197424, term197424.getClass(), "sourceName", ": ");
        setIntField(term197424, term197424.getClass(), "lineNumber", 1);
        Class<? extends Object> term198342 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term198341 = ((Class) term198342).getDeclaredField((String) "REGION");
        ((Field) term198341).setAccessible(true);
        Object enum235 = ((Field) term198341).get((Object) null);
        HashMap term197990 = new HashMap();
        term197985 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term197989 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term197985, term197985.getClass(), "excerpt", enum235);
        setField(term197989, term197989.getClass(), "options", null);
        setField(term197989, term197989.getClass(), "passes", null);
        setField(term197989, term197989.getClass(), "externs", null);
        setField(term197989, term197989.getClass(), "modules", null);
        setField(term197989, term197989.getClass(), "moduleGraph", null);
        setField(term197989, term197989.getClass(), "inputs", null);
        setField(term197989, term197989.getClass(), "errorManager", null);
        setField(term197989, term197989.getClass(), "warningsGuard", null);
        setField(term197989, term197989.getClass(), "externsRoot", null);
        setField(term197989, term197989.getClass(), "jsRoot", null);
        setField(term197989, term197989.getClass(), "externAndJsRoot", null);
        setField(term197989, term197989.getClass(), "inputsByName", term197990);
        setField(term197989, term197989.getClass(), "sourceMap", null);
        setField(term197989, term197989.getClass(), "externExports", null);
        setIntField(term197989, term197989.getClass(), "uniqueNameId", 0);
        setBooleanField(term197989, term197989.getClass(), "useThreads", false);
        setBooleanField(term197989, term197989.getClass(), "hasRegExpGlobalReferences", false);
        setField(term197989, term197989.getClass(), "functionInformationMap", null);
        setField(term197989, term197989.getClass(), "debugLog", null);
        setField(term197989, term197989.getClass(), "defaultCodingConvention", null);
        setField(term197989, term197989.getClass(), "typeRegistry", null);
        setField(term197989, term197989.getClass(), "parserConfig", null);
        setField(term197989, term197989.getClass(), "abstractInterpreter", null);
        setField(term197989, term197989.getClass(), "typeValidator", null);
        setField(term197989, term197989.getClass(), "tracker", null);
        setField(term197989, term197989.getClass(), "oldErrorReporter", null);
        setField(term197989, term197989.getClass(), "defaultErrorReporter", null);
        setField(term197989, term197989.getClass(), "outStream", null);
        setField(term197989, term197989.getClass(), "globalRefMap", null);
        setField(term197989, term197989.getClass(), "sanityCheck", null);
        setField(term197989, term197989.getClass(), "currentTracer", null);
        setField(term197989, term197989.getClass(), "currentPassName", null);
        setField(term197989, term197989.getClass(), "recentChange", null);
        setField(term197989, term197989.getClass(), "codeChangeHandlers", null);
        setField(term197989, term197989.getClass(), "stage", null);
        setField(term197985, term197985.getClass(), "source", term197989);
        setBooleanField(term197985, term197985.getClass(), "colorize", false);
        term197991 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term197991, term197991.getClass(), "type", null);
        setField(term197991, term197991.getClass(), "description", null);
        setField(term197991, term197991.getClass(), "sourceName", ": ");
        setField(term197991, term197991.getClass(), "node", null);
        setIntField(term197991, term197991.getClass(), "lineNumber", 1);
        setField(term197991, term197991.getClass(), "level", null);
        setIntField(term197991, term197991.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term197424;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term196938, args);
        assertTrue(recursiveEquals(term196938, term197985));
        assertTrue(recursiveEquals(term197424, term197991));
        assertTrue(recursiveEquals(retValue, ": :1: WARNING - null\n"));
    }

};


