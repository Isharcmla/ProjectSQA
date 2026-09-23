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

public class LightweightMessageFormatter_formatError_236602113321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270229;
     Object term270563;
     Object term271143;
     Object term271148;

    public LightweightMessageFormatter_formatError_236602113321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term271150 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term271149 = ((Class) term271150).getDeclaredField((String) "REGION");
        ((Field) term271149).setAccessible(true);
        Object enum324 = ((Field) term271149).get((Object) null);
        term270229 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term270309 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term270229, term270229.getClass(), "source", term270309);
        setField(term270229, term270229.getClass(), "excerpt", enum324);
        term270563 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term270563, term270563.getClass(), "sourceName", null);
        setIntField(term270563, term270563.getClass(), "lineNumber", 0);
        Class<? extends Object> term271495 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term271494 = ((Class) term271495).getDeclaredField((String) "REGION");
        ((Field) term271494).setAccessible(true);
        Object enum325 = ((Field) term271494).get((Object) null);
        term271143 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term271147 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term271143, term271143.getClass(), "excerpt", enum325);
        setField(term271147, term271147.getClass(), "options", null);
        setField(term271147, term271147.getClass(), "passes", null);
        setField(term271147, term271147.getClass(), "externs", null);
        setField(term271147, term271147.getClass(), "modules", null);
        setField(term271147, term271147.getClass(), "moduleGraph", null);
        setField(term271147, term271147.getClass(), "inputs", null);
        setField(term271147, term271147.getClass(), "errorManager", null);
        setField(term271147, term271147.getClass(), "warningsGuard", null);
        setField(term271147, term271147.getClass(), "externsRoot", null);
        setField(term271147, term271147.getClass(), "jsRoot", null);
        setField(term271147, term271147.getClass(), "externAndJsRoot", null);
        setField(term271147, term271147.getClass(), "inputsByName", null);
        setField(term271147, term271147.getClass(), "sourceMap", null);
        setField(term271147, term271147.getClass(), "externExports", null);
        setIntField(term271147, term271147.getClass(), "uniqueNameId", 0);
        setBooleanField(term271147, term271147.getClass(), "useThreads", false);
        setBooleanField(term271147, term271147.getClass(), "hasRegExpGlobalReferences", false);
        setField(term271147, term271147.getClass(), "functionInformationMap", null);
        setField(term271147, term271147.getClass(), "debugLog", null);
        setField(term271147, term271147.getClass(), "defaultCodingConvention", null);
        setField(term271147, term271147.getClass(), "typeRegistry", null);
        setField(term271147, term271147.getClass(), "parserConfig", null);
        setField(term271147, term271147.getClass(), "abstractInterpreter", null);
        setField(term271147, term271147.getClass(), "typeValidator", null);
        setField(term271147, term271147.getClass(), "tracker", null);
        setField(term271147, term271147.getClass(), "oldErrorReporter", null);
        setField(term271147, term271147.getClass(), "defaultErrorReporter", null);
        setField(term271147, term271147.getClass(), "outStream", null);
        setField(term271147, term271147.getClass(), "globalRefMap", null);
        setField(term271147, term271147.getClass(), "sanityCheck", null);
        setField(term271147, term271147.getClass(), "currentTracer", null);
        setField(term271147, term271147.getClass(), "currentPassName", null);
        setField(term271147, term271147.getClass(), "recentChange", null);
        setField(term271147, term271147.getClass(), "codeChangeHandlers", null);
        setField(term271147, term271147.getClass(), "stage", null);
        setField(term271143, term271143.getClass(), "source", term271147);
        setBooleanField(term271143, term271143.getClass(), "colorize", false);
        term271148 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term271148, term271148.getClass(), "type", null);
        setField(term271148, term271148.getClass(), "description", null);
        setField(term271148, term271148.getClass(), "sourceName", null);
        setField(term271148, term271148.getClass(), "node", null);
        setIntField(term271148, term271148.getClass(), "lineNumber", 0);
        setField(term271148, term271148.getClass(), "level", null);
        setIntField(term271148, term271148.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term270563;
        Object retValue = callMethod(klass, "formatError", argTypes, term270229, args);
        assertTrue(recursiveEquals(term270229, term271143));
        assertTrue(recursiveEquals(term270563, term271148));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


