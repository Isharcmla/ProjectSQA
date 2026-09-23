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

public class LightweightMessageFormatter_formatError_236602113361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term305073;
     Object term305559;
     Object term306133;
     Object term306139;

    public LightweightMessageFormatter_formatError_236602113361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term305201 = new HashMap();
        Class<? extends Object> term306143 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term306142 = ((Class) term306143).getDeclaredField((String) "REGION");
        ((Field) term306142).setAccessible(true);
        Object enum363 = ((Field) term306142).get((Object) null);
        term305073 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term305153 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term305153, term305153.getClass(), "inputsByName", term305201);
        setField(term305073, term305073.getClass(), "source", term305153);
        setField(term305073, term305073.getClass(), "excerpt", enum363);
        term305559 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term305559, term305559.getClass(), "sourceName", "WARNING");
        setIntField(term305559, term305559.getClass(), "lineNumber", 16);
        Class<? extends Object> term306495 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term306494 = ((Class) term306495).getDeclaredField((String) "REGION");
        ((Field) term306494).setAccessible(true);
        Object enum364 = ((Field) term306494).get((Object) null);
        HashMap term306138 = new HashMap();
        term306133 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term306137 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term306133, term306133.getClass(), "excerpt", enum364);
        setField(term306137, term306137.getClass(), "options", null);
        setField(term306137, term306137.getClass(), "passes", null);
        setField(term306137, term306137.getClass(), "externs", null);
        setField(term306137, term306137.getClass(), "modules", null);
        setField(term306137, term306137.getClass(), "moduleGraph", null);
        setField(term306137, term306137.getClass(), "inputs", null);
        setField(term306137, term306137.getClass(), "errorManager", null);
        setField(term306137, term306137.getClass(), "warningsGuard", null);
        setField(term306137, term306137.getClass(), "externsRoot", null);
        setField(term306137, term306137.getClass(), "jsRoot", null);
        setField(term306137, term306137.getClass(), "externAndJsRoot", null);
        setField(term306137, term306137.getClass(), "inputsByName", term306138);
        setField(term306137, term306137.getClass(), "sourceMap", null);
        setField(term306137, term306137.getClass(), "externExports", null);
        setIntField(term306137, term306137.getClass(), "uniqueNameId", 0);
        setBooleanField(term306137, term306137.getClass(), "useThreads", false);
        setBooleanField(term306137, term306137.getClass(), "hasRegExpGlobalReferences", false);
        setField(term306137, term306137.getClass(), "functionInformationMap", null);
        setField(term306137, term306137.getClass(), "debugLog", null);
        setField(term306137, term306137.getClass(), "defaultCodingConvention", null);
        setField(term306137, term306137.getClass(), "typeRegistry", null);
        setField(term306137, term306137.getClass(), "parserConfig", null);
        setField(term306137, term306137.getClass(), "abstractInterpreter", null);
        setField(term306137, term306137.getClass(), "typeValidator", null);
        setField(term306137, term306137.getClass(), "tracker", null);
        setField(term306137, term306137.getClass(), "oldErrorReporter", null);
        setField(term306137, term306137.getClass(), "defaultErrorReporter", null);
        setField(term306137, term306137.getClass(), "outStream", null);
        setField(term306137, term306137.getClass(), "globalRefMap", null);
        setField(term306137, term306137.getClass(), "sanityCheck", null);
        setField(term306137, term306137.getClass(), "currentTracer", null);
        setField(term306137, term306137.getClass(), "currentPassName", null);
        setField(term306137, term306137.getClass(), "recentChange", null);
        setField(term306137, term306137.getClass(), "codeChangeHandlers", null);
        setField(term306137, term306137.getClass(), "stage", null);
        setField(term306133, term306133.getClass(), "source", term306137);
        setBooleanField(term306133, term306133.getClass(), "colorize", false);
        term306139 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term306139, term306139.getClass(), "type", null);
        setField(term306139, term306139.getClass(), "description", null);
        setField(term306139, term306139.getClass(), "sourceName", "WARNING");
        setField(term306139, term306139.getClass(), "node", null);
        setIntField(term306139, term306139.getClass(), "lineNumber", 16);
        setField(term306139, term306139.getClass(), "level", null);
        setIntField(term306139, term306139.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term305559;
        Object retValue = callMethod(klass, "formatError", argTypes, term305073, args);
        assertTrue(recursiveEquals(term305073, term306133));
        assertTrue(recursiveEquals(term305559, term306139));
        assertTrue(recursiveEquals(retValue, "WARNING:16: ERROR - null\n"));
    }

};


