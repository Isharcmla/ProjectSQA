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

public class LightweightMessageFormatter_formatError_236602113327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277577;
     Object term277911;
     Object term278427;
     Object term278432;

    public LightweightMessageFormatter_formatError_236602113327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term278436 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term278435 = ((Class) term278436).getDeclaredField((String) "REGION");
        ((Field) term278435).setAccessible(true);
        Object enum333 = ((Field) term278435).get((Object) null);
        term277577 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term277657 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term277577, term277577.getClass(), "source", term277657);
        setField(term277577, term277577.getClass(), "excerpt", enum333);
        term277911 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term277911, term277911.getClass(), "sourceName", "");
        setIntField(term277911, term277911.getClass(), "lineNumber", -2147483632);
        Class<? extends Object> term278781 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term278780 = ((Class) term278781).getDeclaredField((String) "REGION");
        ((Field) term278780).setAccessible(true);
        Object enum334 = ((Field) term278780).get((Object) null);
        term278427 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term278431 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term278427, term278427.getClass(), "excerpt", enum334);
        setField(term278431, term278431.getClass(), "options", null);
        setField(term278431, term278431.getClass(), "passes", null);
        setField(term278431, term278431.getClass(), "externs", null);
        setField(term278431, term278431.getClass(), "modules", null);
        setField(term278431, term278431.getClass(), "moduleGraph", null);
        setField(term278431, term278431.getClass(), "inputs", null);
        setField(term278431, term278431.getClass(), "errorManager", null);
        setField(term278431, term278431.getClass(), "warningsGuard", null);
        setField(term278431, term278431.getClass(), "externsRoot", null);
        setField(term278431, term278431.getClass(), "jsRoot", null);
        setField(term278431, term278431.getClass(), "externAndJsRoot", null);
        setField(term278431, term278431.getClass(), "inputsByName", null);
        setField(term278431, term278431.getClass(), "sourceMap", null);
        setField(term278431, term278431.getClass(), "externExports", null);
        setIntField(term278431, term278431.getClass(), "uniqueNameId", 0);
        setBooleanField(term278431, term278431.getClass(), "useThreads", false);
        setBooleanField(term278431, term278431.getClass(), "hasRegExpGlobalReferences", false);
        setField(term278431, term278431.getClass(), "functionInformationMap", null);
        setField(term278431, term278431.getClass(), "debugLog", null);
        setField(term278431, term278431.getClass(), "defaultCodingConvention", null);
        setField(term278431, term278431.getClass(), "typeRegistry", null);
        setField(term278431, term278431.getClass(), "parserConfig", null);
        setField(term278431, term278431.getClass(), "abstractInterpreter", null);
        setField(term278431, term278431.getClass(), "typeValidator", null);
        setField(term278431, term278431.getClass(), "tracker", null);
        setField(term278431, term278431.getClass(), "oldErrorReporter", null);
        setField(term278431, term278431.getClass(), "defaultErrorReporter", null);
        setField(term278431, term278431.getClass(), "outStream", null);
        setField(term278431, term278431.getClass(), "globalRefMap", null);
        setField(term278431, term278431.getClass(), "sanityCheck", null);
        setField(term278431, term278431.getClass(), "currentTracer", null);
        setField(term278431, term278431.getClass(), "currentPassName", null);
        setField(term278431, term278431.getClass(), "recentChange", null);
        setField(term278431, term278431.getClass(), "codeChangeHandlers", null);
        setField(term278431, term278431.getClass(), "stage", null);
        setField(term278427, term278427.getClass(), "source", term278431);
        setBooleanField(term278427, term278427.getClass(), "colorize", false);
        term278432 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term278432, term278432.getClass(), "type", null);
        setField(term278432, term278432.getClass(), "description", null);
        setField(term278432, term278432.getClass(), "sourceName", "");
        setField(term278432, term278432.getClass(), "node", null);
        setIntField(term278432, term278432.getClass(), "lineNumber", -2147483632);
        setField(term278432, term278432.getClass(), "level", null);
        setIntField(term278432, term278432.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term277911;
        Object retValue = callMethod(klass, "formatError", argTypes, term277577, args);
        assertTrue(recursiveEquals(term277577, term278427));
        assertTrue(recursiveEquals(term277911, term278432));
        assertTrue(recursiveEquals(retValue, ": ERROR - null\n"));
    }

};


