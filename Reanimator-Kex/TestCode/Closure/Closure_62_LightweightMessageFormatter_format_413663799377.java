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

public class LightweightMessageFormatter_format_413663799377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term321481;
     Object term321815;
     Object term322269;
     Object term322274;

    public LightweightMessageFormatter_format_413663799377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term322276 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term322275 = ((Class) term322276).getDeclaredField((String) "REGION");
        ((Field) term322275).setAccessible(true);
        Object enum384 = ((Field) term322275).get((Object) null);
        term321481 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term321561 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term321481, term321481.getClass(), "source", term321561);
        setField(term321481, term321481.getClass(), "excerpt", enum384);
        term321815 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term321815, term321815.getClass(), "sourceName", null);
        setIntField(term321815, term321815.getClass(), "lineNumber", 0);
        Class<? extends Object> term322621 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term322620 = ((Class) term322621).getDeclaredField((String) "REGION");
        ((Field) term322620).setAccessible(true);
        Object enum385 = ((Field) term322620).get((Object) null);
        term322269 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term322273 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term322269, term322269.getClass(), "excerpt", enum385);
        setField(term322273, term322273.getClass(), "options", null);
        setField(term322273, term322273.getClass(), "passes", null);
        setField(term322273, term322273.getClass(), "externs", null);
        setField(term322273, term322273.getClass(), "modules", null);
        setField(term322273, term322273.getClass(), "moduleGraph", null);
        setField(term322273, term322273.getClass(), "inputs", null);
        setField(term322273, term322273.getClass(), "errorManager", null);
        setField(term322273, term322273.getClass(), "warningsGuard", null);
        setField(term322273, term322273.getClass(), "externsRoot", null);
        setField(term322273, term322273.getClass(), "jsRoot", null);
        setField(term322273, term322273.getClass(), "externAndJsRoot", null);
        setField(term322273, term322273.getClass(), "inputsByName", null);
        setField(term322273, term322273.getClass(), "sourceMap", null);
        setField(term322273, term322273.getClass(), "externExports", null);
        setIntField(term322273, term322273.getClass(), "uniqueNameId", 0);
        setBooleanField(term322273, term322273.getClass(), "useThreads", false);
        setBooleanField(term322273, term322273.getClass(), "hasRegExpGlobalReferences", false);
        setField(term322273, term322273.getClass(), "functionInformationMap", null);
        setField(term322273, term322273.getClass(), "debugLog", null);
        setField(term322273, term322273.getClass(), "defaultCodingConvention", null);
        setField(term322273, term322273.getClass(), "typeRegistry", null);
        setField(term322273, term322273.getClass(), "parserConfig", null);
        setField(term322273, term322273.getClass(), "abstractInterpreter", null);
        setField(term322273, term322273.getClass(), "typeValidator", null);
        setField(term322273, term322273.getClass(), "tracker", null);
        setField(term322273, term322273.getClass(), "oldErrorReporter", null);
        setField(term322273, term322273.getClass(), "defaultErrorReporter", null);
        setField(term322273, term322273.getClass(), "outStream", null);
        setField(term322273, term322273.getClass(), "globalRefMap", null);
        setField(term322273, term322273.getClass(), "sanityCheck", null);
        setField(term322273, term322273.getClass(), "currentTracer", null);
        setField(term322273, term322273.getClass(), "currentPassName", null);
        setField(term322273, term322273.getClass(), "recentChange", null);
        setField(term322273, term322273.getClass(), "codeChangeHandlers", null);
        setField(term322273, term322273.getClass(), "stage", null);
        setField(term322269, term322269.getClass(), "source", term322273);
        setBooleanField(term322269, term322269.getClass(), "colorize", false);
        term322274 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term322274, term322274.getClass(), "type", null);
        setField(term322274, term322274.getClass(), "description", null);
        setField(term322274, term322274.getClass(), "sourceName", null);
        setField(term322274, term322274.getClass(), "node", null);
        setIntField(term322274, term322274.getClass(), "lineNumber", 0);
        setField(term322274, term322274.getClass(), "level", null);
        setIntField(term322274, term322274.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term321815;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term321481, args);
        assertTrue(recursiveEquals(term321481, term322269));
        assertTrue(recursiveEquals(term321815, term322274));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


