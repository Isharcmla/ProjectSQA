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

public class LightweightMessageFormatter_format_413663799291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246314;
     Object term246800;
     Object term247380;
     Object term247386;

    public LightweightMessageFormatter_format_413663799291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term246442 = new HashMap();
        Class<? extends Object> term247388 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term247387 = ((Class) term247388).getDeclaredField((String) "REGION");
        ((Field) term247387).setAccessible(true);
        Object enum291 = ((Field) term247387).get((Object) null);
        term246314 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term246394 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term246394, term246394.getClass(), "inputsByName", term246442);
        setField(term246314, term246314.getClass(), "source", term246394);
        setField(term246314, term246314.getClass(), "excerpt", enum291);
        term246800 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term246800, term246800.getClass(), "sourceName", null);
        setIntField(term246800, term246800.getClass(), "lineNumber", 1);
        Class<? extends Object> term247733 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term247732 = ((Class) term247733).getDeclaredField((String) "REGION");
        ((Field) term247732).setAccessible(true);
        Object enum292 = ((Field) term247732).get((Object) null);
        HashMap term247385 = new HashMap();
        term247380 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term247384 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term247380, term247380.getClass(), "excerpt", enum292);
        setField(term247384, term247384.getClass(), "options", null);
        setField(term247384, term247384.getClass(), "passes", null);
        setField(term247384, term247384.getClass(), "externs", null);
        setField(term247384, term247384.getClass(), "modules", null);
        setField(term247384, term247384.getClass(), "moduleGraph", null);
        setField(term247384, term247384.getClass(), "inputs", null);
        setField(term247384, term247384.getClass(), "errorManager", null);
        setField(term247384, term247384.getClass(), "warningsGuard", null);
        setField(term247384, term247384.getClass(), "externsRoot", null);
        setField(term247384, term247384.getClass(), "jsRoot", null);
        setField(term247384, term247384.getClass(), "externAndJsRoot", null);
        setField(term247384, term247384.getClass(), "inputsByName", term247385);
        setField(term247384, term247384.getClass(), "sourceMap", null);
        setField(term247384, term247384.getClass(), "externExports", null);
        setIntField(term247384, term247384.getClass(), "uniqueNameId", 0);
        setBooleanField(term247384, term247384.getClass(), "useThreads", false);
        setBooleanField(term247384, term247384.getClass(), "hasRegExpGlobalReferences", false);
        setField(term247384, term247384.getClass(), "functionInformationMap", null);
        setField(term247384, term247384.getClass(), "debugLog", null);
        setField(term247384, term247384.getClass(), "defaultCodingConvention", null);
        setField(term247384, term247384.getClass(), "typeRegistry", null);
        setField(term247384, term247384.getClass(), "parserConfig", null);
        setField(term247384, term247384.getClass(), "abstractInterpreter", null);
        setField(term247384, term247384.getClass(), "typeValidator", null);
        setField(term247384, term247384.getClass(), "tracker", null);
        setField(term247384, term247384.getClass(), "oldErrorReporter", null);
        setField(term247384, term247384.getClass(), "defaultErrorReporter", null);
        setField(term247384, term247384.getClass(), "outStream", null);
        setField(term247384, term247384.getClass(), "globalRefMap", null);
        setField(term247384, term247384.getClass(), "sanityCheck", null);
        setField(term247384, term247384.getClass(), "currentTracer", null);
        setField(term247384, term247384.getClass(), "currentPassName", null);
        setField(term247384, term247384.getClass(), "recentChange", null);
        setField(term247384, term247384.getClass(), "codeChangeHandlers", null);
        setField(term247384, term247384.getClass(), "stage", null);
        setField(term247380, term247380.getClass(), "source", term247384);
        setBooleanField(term247380, term247380.getClass(), "colorize", false);
        term247386 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term247386, term247386.getClass(), "type", null);
        setField(term247386, term247386.getClass(), "description", null);
        setField(term247386, term247386.getClass(), "sourceName", null);
        setField(term247386, term247386.getClass(), "node", null);
        setIntField(term247386, term247386.getClass(), "lineNumber", 1);
        setField(term247386, term247386.getClass(), "level", null);
        setIntField(term247386, term247386.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term246800;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term246314, args);
        assertTrue(recursiveEquals(term246314, term247380));
        assertTrue(recursiveEquals(term246800, term247386));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


