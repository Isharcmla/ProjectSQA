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

public class LightweightMessageFormatter_formatError_23660211397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64475;
     Object term64809;
     Object term65348;
     Object term65353;

    public LightweightMessageFormatter_formatError_23660211397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term65355 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term65354 = ((Class) term65355).getDeclaredField((String) "REGION");
        ((Field) term65354).setAccessible(true);
        Object enum78 = ((Field) term65354).get((Object) null);
        term64475 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term64555 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term64475, term64475.getClass(), "source", term64555);
        setField(term64475, term64475.getClass(), "excerpt", enum78);
        setBooleanField(term64475, term64475.getClass(), "colorize", true);
        term64809 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term64809, term64809.getClass(), "sourceName", null);
        setIntField(term64809, term64809.getClass(), "lineNumber", 0);
        Class<? extends Object> term65700 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term65699 = ((Class) term65700).getDeclaredField((String) "REGION");
        ((Field) term65699).setAccessible(true);
        Object enum79 = ((Field) term65699).get((Object) null);
        term65348 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term65352 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term65348, term65348.getClass(), "excerpt", enum79);
        setField(term65352, term65352.getClass(), "options", null);
        setField(term65352, term65352.getClass(), "passes", null);
        setField(term65352, term65352.getClass(), "externs", null);
        setField(term65352, term65352.getClass(), "modules", null);
        setField(term65352, term65352.getClass(), "moduleGraph", null);
        setField(term65352, term65352.getClass(), "inputs", null);
        setField(term65352, term65352.getClass(), "errorManager", null);
        setField(term65352, term65352.getClass(), "warningsGuard", null);
        setField(term65352, term65352.getClass(), "externsRoot", null);
        setField(term65352, term65352.getClass(), "jsRoot", null);
        setField(term65352, term65352.getClass(), "externAndJsRoot", null);
        setField(term65352, term65352.getClass(), "inputsByName", null);
        setField(term65352, term65352.getClass(), "sourceMap", null);
        setField(term65352, term65352.getClass(), "externExports", null);
        setIntField(term65352, term65352.getClass(), "uniqueNameId", 0);
        setBooleanField(term65352, term65352.getClass(), "useThreads", false);
        setBooleanField(term65352, term65352.getClass(), "hasRegExpGlobalReferences", false);
        setField(term65352, term65352.getClass(), "functionInformationMap", null);
        setField(term65352, term65352.getClass(), "debugLog", null);
        setField(term65352, term65352.getClass(), "defaultCodingConvention", null);
        setField(term65352, term65352.getClass(), "typeRegistry", null);
        setField(term65352, term65352.getClass(), "parserConfig", null);
        setField(term65352, term65352.getClass(), "abstractInterpreter", null);
        setField(term65352, term65352.getClass(), "typeValidator", null);
        setField(term65352, term65352.getClass(), "tracker", null);
        setField(term65352, term65352.getClass(), "oldErrorReporter", null);
        setField(term65352, term65352.getClass(), "defaultErrorReporter", null);
        setField(term65352, term65352.getClass(), "outStream", null);
        setField(term65352, term65352.getClass(), "globalRefMap", null);
        setField(term65352, term65352.getClass(), "sanityCheck", null);
        setField(term65352, term65352.getClass(), "currentTracer", null);
        setField(term65352, term65352.getClass(), "currentPassName", null);
        setField(term65352, term65352.getClass(), "recentChange", null);
        setField(term65352, term65352.getClass(), "codeChangeHandlers", null);
        setField(term65352, term65352.getClass(), "stage", null);
        setField(term65348, term65348.getClass(), "source", term65352);
        setBooleanField(term65348, term65348.getClass(), "colorize", true);
        term65353 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term65353, term65353.getClass(), "type", null);
        setField(term65353, term65353.getClass(), "description", null);
        setField(term65353, term65353.getClass(), "sourceName", null);
        setField(term65353, term65353.getClass(), "node", null);
        setIntField(term65353, term65353.getClass(), "lineNumber", 0);
        setField(term65353, term65353.getClass(), "level", null);
        setIntField(term65353, term65353.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term64809;
        Object retValue = callMethod(klass, "formatError", argTypes, term64475, args);
        assertTrue(recursiveEquals(term64475, term65348));
        assertTrue(recursiveEquals(term64809, term65353));
        assertTrue(recursiveEquals(retValue, "\u001B[31mERROR\u001B[39m - null\n"));
    }

};


