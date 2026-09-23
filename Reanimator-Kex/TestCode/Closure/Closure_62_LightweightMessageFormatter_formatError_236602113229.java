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

public class LightweightMessageFormatter_formatError_236602113229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201648;
     Object term201982;
     Object term202498;
     Object term202503;

    public LightweightMessageFormatter_formatError_236602113229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term202507 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term202506 = ((Class) term202507).getDeclaredField((String) "REGION");
        ((Field) term202506).setAccessible(true);
        Object enum240 = ((Field) term202506).get((Object) null);
        term201648 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term201728 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term201648, term201648.getClass(), "source", term201728);
        setField(term201648, term201648.getClass(), "excerpt", enum240);
        term201982 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term201982, term201982.getClass(), "sourceName", "");
        setIntField(term201982, term201982.getClass(), "lineNumber", 0);
        Class<? extends Object> term202852 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term202851 = ((Class) term202852).getDeclaredField((String) "REGION");
        ((Field) term202851).setAccessible(true);
        Object enum241 = ((Field) term202851).get((Object) null);
        term202498 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term202502 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term202498, term202498.getClass(), "excerpt", enum241);
        setField(term202502, term202502.getClass(), "options", null);
        setField(term202502, term202502.getClass(), "passes", null);
        setField(term202502, term202502.getClass(), "externs", null);
        setField(term202502, term202502.getClass(), "modules", null);
        setField(term202502, term202502.getClass(), "moduleGraph", null);
        setField(term202502, term202502.getClass(), "inputs", null);
        setField(term202502, term202502.getClass(), "errorManager", null);
        setField(term202502, term202502.getClass(), "warningsGuard", null);
        setField(term202502, term202502.getClass(), "externsRoot", null);
        setField(term202502, term202502.getClass(), "jsRoot", null);
        setField(term202502, term202502.getClass(), "externAndJsRoot", null);
        setField(term202502, term202502.getClass(), "inputsByName", null);
        setField(term202502, term202502.getClass(), "sourceMap", null);
        setField(term202502, term202502.getClass(), "externExports", null);
        setIntField(term202502, term202502.getClass(), "uniqueNameId", 0);
        setBooleanField(term202502, term202502.getClass(), "useThreads", false);
        setBooleanField(term202502, term202502.getClass(), "hasRegExpGlobalReferences", false);
        setField(term202502, term202502.getClass(), "functionInformationMap", null);
        setField(term202502, term202502.getClass(), "debugLog", null);
        setField(term202502, term202502.getClass(), "defaultCodingConvention", null);
        setField(term202502, term202502.getClass(), "typeRegistry", null);
        setField(term202502, term202502.getClass(), "parserConfig", null);
        setField(term202502, term202502.getClass(), "abstractInterpreter", null);
        setField(term202502, term202502.getClass(), "typeValidator", null);
        setField(term202502, term202502.getClass(), "tracker", null);
        setField(term202502, term202502.getClass(), "oldErrorReporter", null);
        setField(term202502, term202502.getClass(), "defaultErrorReporter", null);
        setField(term202502, term202502.getClass(), "outStream", null);
        setField(term202502, term202502.getClass(), "globalRefMap", null);
        setField(term202502, term202502.getClass(), "sanityCheck", null);
        setField(term202502, term202502.getClass(), "currentTracer", null);
        setField(term202502, term202502.getClass(), "currentPassName", null);
        setField(term202502, term202502.getClass(), "recentChange", null);
        setField(term202502, term202502.getClass(), "codeChangeHandlers", null);
        setField(term202502, term202502.getClass(), "stage", null);
        setField(term202498, term202498.getClass(), "source", term202502);
        setBooleanField(term202498, term202498.getClass(), "colorize", false);
        term202503 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term202503, term202503.getClass(), "type", null);
        setField(term202503, term202503.getClass(), "description", null);
        setField(term202503, term202503.getClass(), "sourceName", "");
        setField(term202503, term202503.getClass(), "node", null);
        setIntField(term202503, term202503.getClass(), "lineNumber", 0);
        setField(term202503, term202503.getClass(), "level", null);
        setIntField(term202503, term202503.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term201982;
        Object retValue = callMethod(klass, "formatError", argTypes, term201648, args);
        assertTrue(recursiveEquals(term201648, term202498));
        assertTrue(recursiveEquals(term201982, term202503));
        assertTrue(recursiveEquals(retValue, ": ERROR - null\n"));
    }

};


