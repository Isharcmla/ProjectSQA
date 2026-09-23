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

public class LightweightMessageFormatter_format_41366379990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55303;
     Object term55637;
     Object term58058;
     Object term58063;

    public LightweightMessageFormatter_format_41366379990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term58065 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term58064 = ((Class) term58065).getDeclaredField((String) "REGION");
        ((Field) term58064).setAccessible(true);
        Object enum70 = ((Field) term58064).get((Object) null);
        term55303 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term55383 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term55303, term55303.getClass(), "source", term55383);
        setField(term55303, term55303.getClass(), "excerpt", enum70);
        term55637 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term55637, term55637.getClass(), "sourceName", null);
        setIntField(term55637, term55637.getClass(), "lineNumber", 0);
        Class<? extends Object> term58410 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term58409 = ((Class) term58410).getDeclaredField((String) "REGION");
        ((Field) term58409).setAccessible(true);
        Object enum71 = ((Field) term58409).get((Object) null);
        term58058 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term58062 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term58058, term58058.getClass(), "excerpt", enum71);
        setField(term58062, term58062.getClass(), "options", null);
        setField(term58062, term58062.getClass(), "passes", null);
        setField(term58062, term58062.getClass(), "externs", null);
        setField(term58062, term58062.getClass(), "modules", null);
        setField(term58062, term58062.getClass(), "moduleGraph", null);
        setField(term58062, term58062.getClass(), "inputs", null);
        setField(term58062, term58062.getClass(), "errorManager", null);
        setField(term58062, term58062.getClass(), "warningsGuard", null);
        setField(term58062, term58062.getClass(), "externsRoot", null);
        setField(term58062, term58062.getClass(), "jsRoot", null);
        setField(term58062, term58062.getClass(), "externAndJsRoot", null);
        setField(term58062, term58062.getClass(), "inputsByName", null);
        setField(term58062, term58062.getClass(), "sourceMap", null);
        setField(term58062, term58062.getClass(), "externExports", null);
        setIntField(term58062, term58062.getClass(), "uniqueNameId", 0);
        setBooleanField(term58062, term58062.getClass(), "useThreads", false);
        setBooleanField(term58062, term58062.getClass(), "hasRegExpGlobalReferences", false);
        setField(term58062, term58062.getClass(), "functionInformationMap", null);
        setField(term58062, term58062.getClass(), "debugLog", null);
        setField(term58062, term58062.getClass(), "defaultCodingConvention", null);
        setField(term58062, term58062.getClass(), "typeRegistry", null);
        setField(term58062, term58062.getClass(), "parserConfig", null);
        setField(term58062, term58062.getClass(), "abstractInterpreter", null);
        setField(term58062, term58062.getClass(), "typeValidator", null);
        setField(term58062, term58062.getClass(), "tracker", null);
        setField(term58062, term58062.getClass(), "oldErrorReporter", null);
        setField(term58062, term58062.getClass(), "defaultErrorReporter", null);
        setField(term58062, term58062.getClass(), "outStream", null);
        setField(term58062, term58062.getClass(), "globalRefMap", null);
        setField(term58062, term58062.getClass(), "sanityCheck", null);
        setField(term58062, term58062.getClass(), "currentTracer", null);
        setField(term58062, term58062.getClass(), "currentPassName", null);
        setField(term58062, term58062.getClass(), "recentChange", null);
        setField(term58062, term58062.getClass(), "codeChangeHandlers", null);
        setField(term58062, term58062.getClass(), "stage", null);
        setField(term58058, term58058.getClass(), "source", term58062);
        setBooleanField(term58058, term58058.getClass(), "colorize", false);
        term58063 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term58063, term58063.getClass(), "type", null);
        setField(term58063, term58063.getClass(), "description", null);
        setField(term58063, term58063.getClass(), "sourceName", null);
        setField(term58063, term58063.getClass(), "node", null);
        setIntField(term58063, term58063.getClass(), "lineNumber", 0);
        setField(term58063, term58063.getClass(), "level", null);
        setIntField(term58063, term58063.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term55637;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term55303, args);
        assertTrue(recursiveEquals(term55303, term58058));
        assertTrue(recursiveEquals(term55637, term58063));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


