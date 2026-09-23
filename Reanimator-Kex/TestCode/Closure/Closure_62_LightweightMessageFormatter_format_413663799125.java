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

public class LightweightMessageFormatter_format_413663799125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91273;
     Object term91607;
     Object term92118;
     Object term92123;

    public LightweightMessageFormatter_format_413663799125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term92127 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term92126 = ((Class) term92127).getDeclaredField((String) "REGION");
        ((Field) term92126).setAccessible(true);
        Object enum102 = ((Field) term92126).get((Object) null);
        term91273 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term91353 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term91273, term91273.getClass(), "source", term91353);
        setField(term91273, term91273.getClass(), "excerpt", enum102);
        term91607 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term91607, term91607.getClass(), "sourceName", "");
        setIntField(term91607, term91607.getClass(), "lineNumber", 0);
        Class<? extends Object> term92472 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term92471 = ((Class) term92472).getDeclaredField((String) "REGION");
        ((Field) term92471).setAccessible(true);
        Object enum103 = ((Field) term92471).get((Object) null);
        term92118 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term92122 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term92118, term92118.getClass(), "excerpt", enum103);
        setField(term92122, term92122.getClass(), "options", null);
        setField(term92122, term92122.getClass(), "passes", null);
        setField(term92122, term92122.getClass(), "externs", null);
        setField(term92122, term92122.getClass(), "modules", null);
        setField(term92122, term92122.getClass(), "moduleGraph", null);
        setField(term92122, term92122.getClass(), "inputs", null);
        setField(term92122, term92122.getClass(), "errorManager", null);
        setField(term92122, term92122.getClass(), "warningsGuard", null);
        setField(term92122, term92122.getClass(), "externsRoot", null);
        setField(term92122, term92122.getClass(), "jsRoot", null);
        setField(term92122, term92122.getClass(), "externAndJsRoot", null);
        setField(term92122, term92122.getClass(), "inputsByName", null);
        setField(term92122, term92122.getClass(), "sourceMap", null);
        setField(term92122, term92122.getClass(), "externExports", null);
        setIntField(term92122, term92122.getClass(), "uniqueNameId", 0);
        setBooleanField(term92122, term92122.getClass(), "useThreads", false);
        setBooleanField(term92122, term92122.getClass(), "hasRegExpGlobalReferences", false);
        setField(term92122, term92122.getClass(), "functionInformationMap", null);
        setField(term92122, term92122.getClass(), "debugLog", null);
        setField(term92122, term92122.getClass(), "defaultCodingConvention", null);
        setField(term92122, term92122.getClass(), "typeRegistry", null);
        setField(term92122, term92122.getClass(), "parserConfig", null);
        setField(term92122, term92122.getClass(), "abstractInterpreter", null);
        setField(term92122, term92122.getClass(), "typeValidator", null);
        setField(term92122, term92122.getClass(), "tracker", null);
        setField(term92122, term92122.getClass(), "oldErrorReporter", null);
        setField(term92122, term92122.getClass(), "defaultErrorReporter", null);
        setField(term92122, term92122.getClass(), "outStream", null);
        setField(term92122, term92122.getClass(), "globalRefMap", null);
        setField(term92122, term92122.getClass(), "sanityCheck", null);
        setField(term92122, term92122.getClass(), "currentTracer", null);
        setField(term92122, term92122.getClass(), "currentPassName", null);
        setField(term92122, term92122.getClass(), "recentChange", null);
        setField(term92122, term92122.getClass(), "codeChangeHandlers", null);
        setField(term92122, term92122.getClass(), "stage", null);
        setField(term92118, term92118.getClass(), "source", term92122);
        setBooleanField(term92118, term92118.getClass(), "colorize", false);
        term92123 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term92123, term92123.getClass(), "type", null);
        setField(term92123, term92123.getClass(), "description", null);
        setField(term92123, term92123.getClass(), "sourceName", "");
        setField(term92123, term92123.getClass(), "node", null);
        setIntField(term92123, term92123.getClass(), "lineNumber", 0);
        setField(term92123, term92123.getClass(), "level", null);
        setIntField(term92123, term92123.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term91607;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term91273, args);
        assertTrue(recursiveEquals(term91273, term92118));
        assertTrue(recursiveEquals(term91607, term92123));
        assertTrue(recursiveEquals(retValue, ": WARNING - null\n"));
    }

};


