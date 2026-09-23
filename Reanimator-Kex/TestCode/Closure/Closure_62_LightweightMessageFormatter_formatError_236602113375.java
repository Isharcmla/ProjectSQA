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

public class LightweightMessageFormatter_formatError_236602113375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318965;
     Object term319451;
     Object term319988;
     Object term319994;

    public LightweightMessageFormatter_formatError_236602113375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term319093 = new HashMap();
        Class<? extends Object> term319998 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term319997 = ((Class) term319998).getDeclaredField((String) "REGION");
        ((Field) term319997).setAccessible(true);
        Object enum381 = ((Field) term319997).get((Object) null);
        term318965 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term319045 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term319045, term319045.getClass(), "inputsByName", term319093);
        setField(term318965, term318965.getClass(), "source", term319045);
        setField(term318965, term318965.getClass(), "excerpt", enum381);
        term319451 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term319451, term319451.getClass(), "sourceName", "");
        setIntField(term319451, term319451.getClass(), "lineNumber", 2);
        Class<? extends Object> term320343 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term320342 = ((Class) term320343).getDeclaredField((String) "REGION");
        ((Field) term320342).setAccessible(true);
        Object enum382 = ((Field) term320342).get((Object) null);
        HashMap term319993 = new HashMap();
        term319988 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term319992 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term319988, term319988.getClass(), "excerpt", enum382);
        setField(term319992, term319992.getClass(), "options", null);
        setField(term319992, term319992.getClass(), "passes", null);
        setField(term319992, term319992.getClass(), "externs", null);
        setField(term319992, term319992.getClass(), "modules", null);
        setField(term319992, term319992.getClass(), "moduleGraph", null);
        setField(term319992, term319992.getClass(), "inputs", null);
        setField(term319992, term319992.getClass(), "errorManager", null);
        setField(term319992, term319992.getClass(), "warningsGuard", null);
        setField(term319992, term319992.getClass(), "externsRoot", null);
        setField(term319992, term319992.getClass(), "jsRoot", null);
        setField(term319992, term319992.getClass(), "externAndJsRoot", null);
        setField(term319992, term319992.getClass(), "inputsByName", term319993);
        setField(term319992, term319992.getClass(), "sourceMap", null);
        setField(term319992, term319992.getClass(), "externExports", null);
        setIntField(term319992, term319992.getClass(), "uniqueNameId", 0);
        setBooleanField(term319992, term319992.getClass(), "useThreads", false);
        setBooleanField(term319992, term319992.getClass(), "hasRegExpGlobalReferences", false);
        setField(term319992, term319992.getClass(), "functionInformationMap", null);
        setField(term319992, term319992.getClass(), "debugLog", null);
        setField(term319992, term319992.getClass(), "defaultCodingConvention", null);
        setField(term319992, term319992.getClass(), "typeRegistry", null);
        setField(term319992, term319992.getClass(), "parserConfig", null);
        setField(term319992, term319992.getClass(), "abstractInterpreter", null);
        setField(term319992, term319992.getClass(), "typeValidator", null);
        setField(term319992, term319992.getClass(), "tracker", null);
        setField(term319992, term319992.getClass(), "oldErrorReporter", null);
        setField(term319992, term319992.getClass(), "defaultErrorReporter", null);
        setField(term319992, term319992.getClass(), "outStream", null);
        setField(term319992, term319992.getClass(), "globalRefMap", null);
        setField(term319992, term319992.getClass(), "sanityCheck", null);
        setField(term319992, term319992.getClass(), "currentTracer", null);
        setField(term319992, term319992.getClass(), "currentPassName", null);
        setField(term319992, term319992.getClass(), "recentChange", null);
        setField(term319992, term319992.getClass(), "codeChangeHandlers", null);
        setField(term319992, term319992.getClass(), "stage", null);
        setField(term319988, term319988.getClass(), "source", term319992);
        setBooleanField(term319988, term319988.getClass(), "colorize", false);
        term319994 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term319994, term319994.getClass(), "type", null);
        setField(term319994, term319994.getClass(), "description", null);
        setField(term319994, term319994.getClass(), "sourceName", "");
        setField(term319994, term319994.getClass(), "node", null);
        setIntField(term319994, term319994.getClass(), "lineNumber", 2);
        setField(term319994, term319994.getClass(), "level", null);
        setIntField(term319994, term319994.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term319451;
        Object retValue = callMethod(klass, "formatError", argTypes, term318965, args);
        assertTrue(recursiveEquals(term318965, term319988));
        assertTrue(recursiveEquals(term319451, term319994));
        assertTrue(recursiveEquals(retValue, ":2: ERROR - null\n"));
    }

};


