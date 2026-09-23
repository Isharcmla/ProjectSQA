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

public class LightweightMessageFormatter_formatError_236602113109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75255;
     Object term75589;
     Object term76058;
     Object term76063;

    public LightweightMessageFormatter_formatError_236602113109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term76065 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term76064 = ((Class) term76065).getDeclaredField((String) "REGION");
        ((Field) term76064).setAccessible(true);
        Object enum90 = ((Field) term76064).get((Object) null);
        term75255 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term75335 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term75255, term75255.getClass(), "source", term75335);
        setField(term75255, term75255.getClass(), "excerpt", enum90);
        term75589 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term75589, term75589.getClass(), "sourceName", null);
        setIntField(term75589, term75589.getClass(), "lineNumber", 0);
        Class<? extends Object> term76410 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term76409 = ((Class) term76410).getDeclaredField((String) "REGION");
        ((Field) term76409).setAccessible(true);
        Object enum91 = ((Field) term76409).get((Object) null);
        term76058 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term76062 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term76058, term76058.getClass(), "excerpt", enum91);
        setField(term76062, term76062.getClass(), "options", null);
        setField(term76062, term76062.getClass(), "passes", null);
        setField(term76062, term76062.getClass(), "externs", null);
        setField(term76062, term76062.getClass(), "modules", null);
        setField(term76062, term76062.getClass(), "moduleGraph", null);
        setField(term76062, term76062.getClass(), "inputs", null);
        setField(term76062, term76062.getClass(), "errorManager", null);
        setField(term76062, term76062.getClass(), "warningsGuard", null);
        setField(term76062, term76062.getClass(), "externsRoot", null);
        setField(term76062, term76062.getClass(), "jsRoot", null);
        setField(term76062, term76062.getClass(), "externAndJsRoot", null);
        setField(term76062, term76062.getClass(), "inputsByName", null);
        setField(term76062, term76062.getClass(), "sourceMap", null);
        setField(term76062, term76062.getClass(), "externExports", null);
        setIntField(term76062, term76062.getClass(), "uniqueNameId", 0);
        setBooleanField(term76062, term76062.getClass(), "useThreads", false);
        setBooleanField(term76062, term76062.getClass(), "hasRegExpGlobalReferences", false);
        setField(term76062, term76062.getClass(), "functionInformationMap", null);
        setField(term76062, term76062.getClass(), "debugLog", null);
        setField(term76062, term76062.getClass(), "defaultCodingConvention", null);
        setField(term76062, term76062.getClass(), "typeRegistry", null);
        setField(term76062, term76062.getClass(), "parserConfig", null);
        setField(term76062, term76062.getClass(), "abstractInterpreter", null);
        setField(term76062, term76062.getClass(), "typeValidator", null);
        setField(term76062, term76062.getClass(), "tracker", null);
        setField(term76062, term76062.getClass(), "oldErrorReporter", null);
        setField(term76062, term76062.getClass(), "defaultErrorReporter", null);
        setField(term76062, term76062.getClass(), "outStream", null);
        setField(term76062, term76062.getClass(), "globalRefMap", null);
        setField(term76062, term76062.getClass(), "sanityCheck", null);
        setField(term76062, term76062.getClass(), "currentTracer", null);
        setField(term76062, term76062.getClass(), "currentPassName", null);
        setField(term76062, term76062.getClass(), "recentChange", null);
        setField(term76062, term76062.getClass(), "codeChangeHandlers", null);
        setField(term76062, term76062.getClass(), "stage", null);
        setField(term76058, term76058.getClass(), "source", term76062);
        setBooleanField(term76058, term76058.getClass(), "colorize", false);
        term76063 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term76063, term76063.getClass(), "type", null);
        setField(term76063, term76063.getClass(), "description", null);
        setField(term76063, term76063.getClass(), "sourceName", null);
        setField(term76063, term76063.getClass(), "node", null);
        setIntField(term76063, term76063.getClass(), "lineNumber", 0);
        setField(term76063, term76063.getClass(), "level", null);
        setIntField(term76063, term76063.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term75589;
        Object retValue = callMethod(klass, "formatError", argTypes, term75255, args);
        assertTrue(recursiveEquals(term75255, term76058));
        assertTrue(recursiveEquals(term75589, term76063));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


