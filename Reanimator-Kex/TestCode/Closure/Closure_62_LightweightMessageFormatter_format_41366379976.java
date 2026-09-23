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

public class LightweightMessageFormatter_format_41366379976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45932;
     Object term46266;
     Object term48490;
     Object term48495;

    public LightweightMessageFormatter_format_41366379976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term48497 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term48496 = ((Class) term48497).getDeclaredField((String) "REGION");
        ((Field) term48496).setAccessible(true);
        Object enum66 = ((Field) term48496).get((Object) null);
        term45932 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term46012 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term45932, term45932.getClass(), "source", term46012);
        setField(term45932, term45932.getClass(), "excerpt", enum66);
        term46266 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term46266, term46266.getClass(), "sourceName", null);
        setIntField(term46266, term46266.getClass(), "lineNumber", 0);
        Class<? extends Object> term48842 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term48841 = ((Class) term48842).getDeclaredField((String) "REGION");
        ((Field) term48841).setAccessible(true);
        Object enum67 = ((Field) term48841).get((Object) null);
        term48490 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term48494 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term48490, term48490.getClass(), "excerpt", enum67);
        setField(term48494, term48494.getClass(), "options", null);
        setField(term48494, term48494.getClass(), "passes", null);
        setField(term48494, term48494.getClass(), "externs", null);
        setField(term48494, term48494.getClass(), "modules", null);
        setField(term48494, term48494.getClass(), "moduleGraph", null);
        setField(term48494, term48494.getClass(), "inputs", null);
        setField(term48494, term48494.getClass(), "errorManager", null);
        setField(term48494, term48494.getClass(), "warningsGuard", null);
        setField(term48494, term48494.getClass(), "externsRoot", null);
        setField(term48494, term48494.getClass(), "jsRoot", null);
        setField(term48494, term48494.getClass(), "externAndJsRoot", null);
        setField(term48494, term48494.getClass(), "inputsByName", null);
        setField(term48494, term48494.getClass(), "sourceMap", null);
        setField(term48494, term48494.getClass(), "externExports", null);
        setIntField(term48494, term48494.getClass(), "uniqueNameId", 0);
        setBooleanField(term48494, term48494.getClass(), "useThreads", false);
        setBooleanField(term48494, term48494.getClass(), "hasRegExpGlobalReferences", false);
        setField(term48494, term48494.getClass(), "functionInformationMap", null);
        setField(term48494, term48494.getClass(), "debugLog", null);
        setField(term48494, term48494.getClass(), "defaultCodingConvention", null);
        setField(term48494, term48494.getClass(), "typeRegistry", null);
        setField(term48494, term48494.getClass(), "parserConfig", null);
        setField(term48494, term48494.getClass(), "abstractInterpreter", null);
        setField(term48494, term48494.getClass(), "typeValidator", null);
        setField(term48494, term48494.getClass(), "tracker", null);
        setField(term48494, term48494.getClass(), "oldErrorReporter", null);
        setField(term48494, term48494.getClass(), "defaultErrorReporter", null);
        setField(term48494, term48494.getClass(), "outStream", null);
        setField(term48494, term48494.getClass(), "globalRefMap", null);
        setField(term48494, term48494.getClass(), "sanityCheck", null);
        setField(term48494, term48494.getClass(), "currentTracer", null);
        setField(term48494, term48494.getClass(), "currentPassName", null);
        setField(term48494, term48494.getClass(), "recentChange", null);
        setField(term48494, term48494.getClass(), "codeChangeHandlers", null);
        setField(term48494, term48494.getClass(), "stage", null);
        setField(term48490, term48490.getClass(), "source", term48494);
        setBooleanField(term48490, term48490.getClass(), "colorize", false);
        term48495 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term48495, term48495.getClass(), "type", null);
        setField(term48495, term48495.getClass(), "description", null);
        setField(term48495, term48495.getClass(), "sourceName", null);
        setField(term48495, term48495.getClass(), "node", null);
        setIntField(term48495, term48495.getClass(), "lineNumber", 0);
        setField(term48495, term48495.getClass(), "level", null);
        setIntField(term48495, term48495.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term46266;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term45932, args);
        assertTrue(recursiveEquals(term45932, term48490));
        assertTrue(recursiveEquals(term46266, term48495));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


