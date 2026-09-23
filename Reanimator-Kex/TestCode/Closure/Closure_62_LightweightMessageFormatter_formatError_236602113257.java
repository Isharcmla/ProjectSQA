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

public class LightweightMessageFormatter_formatError_236602113257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224006;
     Object term224492;
     Object term224978;
     Object term224984;

    public LightweightMessageFormatter_formatError_236602113257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term224134 = new HashMap();
        Class<? extends Object> term224986 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term224985 = ((Class) term224986).getDeclaredField((String) "REGION");
        ((Field) term224985).setAccessible(true);
        Object enum267 = ((Field) term224985).get((Object) null);
        term224006 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term224086 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term224086, term224086.getClass(), "inputsByName", term224134);
        setField(term224006, term224006.getClass(), "source", term224086);
        setField(term224006, term224006.getClass(), "excerpt", enum267);
        term224492 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term224492, term224492.getClass(), "sourceName", null);
        setIntField(term224492, term224492.getClass(), "lineNumber", 1);
        Class<? extends Object> term225331 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term225330 = ((Class) term225331).getDeclaredField((String) "REGION");
        ((Field) term225330).setAccessible(true);
        Object enum268 = ((Field) term225330).get((Object) null);
        HashMap term224983 = new HashMap();
        term224978 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term224982 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term224978, term224978.getClass(), "excerpt", enum268);
        setField(term224982, term224982.getClass(), "options", null);
        setField(term224982, term224982.getClass(), "passes", null);
        setField(term224982, term224982.getClass(), "externs", null);
        setField(term224982, term224982.getClass(), "modules", null);
        setField(term224982, term224982.getClass(), "moduleGraph", null);
        setField(term224982, term224982.getClass(), "inputs", null);
        setField(term224982, term224982.getClass(), "errorManager", null);
        setField(term224982, term224982.getClass(), "warningsGuard", null);
        setField(term224982, term224982.getClass(), "externsRoot", null);
        setField(term224982, term224982.getClass(), "jsRoot", null);
        setField(term224982, term224982.getClass(), "externAndJsRoot", null);
        setField(term224982, term224982.getClass(), "inputsByName", term224983);
        setField(term224982, term224982.getClass(), "sourceMap", null);
        setField(term224982, term224982.getClass(), "externExports", null);
        setIntField(term224982, term224982.getClass(), "uniqueNameId", 0);
        setBooleanField(term224982, term224982.getClass(), "useThreads", false);
        setBooleanField(term224982, term224982.getClass(), "hasRegExpGlobalReferences", false);
        setField(term224982, term224982.getClass(), "functionInformationMap", null);
        setField(term224982, term224982.getClass(), "debugLog", null);
        setField(term224982, term224982.getClass(), "defaultCodingConvention", null);
        setField(term224982, term224982.getClass(), "typeRegistry", null);
        setField(term224982, term224982.getClass(), "parserConfig", null);
        setField(term224982, term224982.getClass(), "abstractInterpreter", null);
        setField(term224982, term224982.getClass(), "typeValidator", null);
        setField(term224982, term224982.getClass(), "tracker", null);
        setField(term224982, term224982.getClass(), "oldErrorReporter", null);
        setField(term224982, term224982.getClass(), "defaultErrorReporter", null);
        setField(term224982, term224982.getClass(), "outStream", null);
        setField(term224982, term224982.getClass(), "globalRefMap", null);
        setField(term224982, term224982.getClass(), "sanityCheck", null);
        setField(term224982, term224982.getClass(), "currentTracer", null);
        setField(term224982, term224982.getClass(), "currentPassName", null);
        setField(term224982, term224982.getClass(), "recentChange", null);
        setField(term224982, term224982.getClass(), "codeChangeHandlers", null);
        setField(term224982, term224982.getClass(), "stage", null);
        setField(term224978, term224978.getClass(), "source", term224982);
        setBooleanField(term224978, term224978.getClass(), "colorize", false);
        term224984 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term224984, term224984.getClass(), "type", null);
        setField(term224984, term224984.getClass(), "description", null);
        setField(term224984, term224984.getClass(), "sourceName", null);
        setField(term224984, term224984.getClass(), "node", null);
        setIntField(term224984, term224984.getClass(), "lineNumber", 1);
        setField(term224984, term224984.getClass(), "level", null);
        setIntField(term224984, term224984.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term224492;
        Object retValue = callMethod(klass, "formatError", argTypes, term224006, args);
        assertTrue(recursiveEquals(term224006, term224978));
        assertTrue(recursiveEquals(term224492, term224984));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


