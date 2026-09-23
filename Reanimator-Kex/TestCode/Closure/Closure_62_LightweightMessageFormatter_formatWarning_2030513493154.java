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

public class LightweightMessageFormatter_formatWarning_2030513493154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117296;
     Object term117630;
     Object term120079;
     Object term120084;

    public LightweightMessageFormatter_formatWarning_2030513493154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term120086 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term120085 = ((Class) term120086).getDeclaredField((String) "REGION");
        ((Field) term120085).setAccessible(true);
        Object enum133 = ((Field) term120085).get((Object) null);
        term117296 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term117376 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term117296, term117296.getClass(), "source", term117376);
        setField(term117296, term117296.getClass(), "excerpt", enum133);
        term117630 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term117630, term117630.getClass(), "sourceName", null);
        setIntField(term117630, term117630.getClass(), "lineNumber", 0);
        Class<? extends Object> term120431 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term120430 = ((Class) term120431).getDeclaredField((String) "REGION");
        ((Field) term120430).setAccessible(true);
        Object enum134 = ((Field) term120430).get((Object) null);
        term120079 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term120083 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term120079, term120079.getClass(), "excerpt", enum134);
        setField(term120083, term120083.getClass(), "options", null);
        setField(term120083, term120083.getClass(), "passes", null);
        setField(term120083, term120083.getClass(), "externs", null);
        setField(term120083, term120083.getClass(), "modules", null);
        setField(term120083, term120083.getClass(), "moduleGraph", null);
        setField(term120083, term120083.getClass(), "inputs", null);
        setField(term120083, term120083.getClass(), "errorManager", null);
        setField(term120083, term120083.getClass(), "warningsGuard", null);
        setField(term120083, term120083.getClass(), "externsRoot", null);
        setField(term120083, term120083.getClass(), "jsRoot", null);
        setField(term120083, term120083.getClass(), "externAndJsRoot", null);
        setField(term120083, term120083.getClass(), "inputsByName", null);
        setField(term120083, term120083.getClass(), "sourceMap", null);
        setField(term120083, term120083.getClass(), "externExports", null);
        setIntField(term120083, term120083.getClass(), "uniqueNameId", 0);
        setBooleanField(term120083, term120083.getClass(), "useThreads", false);
        setBooleanField(term120083, term120083.getClass(), "hasRegExpGlobalReferences", false);
        setField(term120083, term120083.getClass(), "functionInformationMap", null);
        setField(term120083, term120083.getClass(), "debugLog", null);
        setField(term120083, term120083.getClass(), "defaultCodingConvention", null);
        setField(term120083, term120083.getClass(), "typeRegistry", null);
        setField(term120083, term120083.getClass(), "parserConfig", null);
        setField(term120083, term120083.getClass(), "abstractInterpreter", null);
        setField(term120083, term120083.getClass(), "typeValidator", null);
        setField(term120083, term120083.getClass(), "tracker", null);
        setField(term120083, term120083.getClass(), "oldErrorReporter", null);
        setField(term120083, term120083.getClass(), "defaultErrorReporter", null);
        setField(term120083, term120083.getClass(), "outStream", null);
        setField(term120083, term120083.getClass(), "globalRefMap", null);
        setField(term120083, term120083.getClass(), "sanityCheck", null);
        setField(term120083, term120083.getClass(), "currentTracer", null);
        setField(term120083, term120083.getClass(), "currentPassName", null);
        setField(term120083, term120083.getClass(), "recentChange", null);
        setField(term120083, term120083.getClass(), "codeChangeHandlers", null);
        setField(term120083, term120083.getClass(), "stage", null);
        setField(term120079, term120079.getClass(), "source", term120083);
        setBooleanField(term120079, term120079.getClass(), "colorize", false);
        term120084 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term120084, term120084.getClass(), "type", null);
        setField(term120084, term120084.getClass(), "description", null);
        setField(term120084, term120084.getClass(), "sourceName", null);
        setField(term120084, term120084.getClass(), "node", null);
        setIntField(term120084, term120084.getClass(), "lineNumber", 0);
        setField(term120084, term120084.getClass(), "level", null);
        setIntField(term120084, term120084.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term117630;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term117296, args);
        assertTrue(recursiveEquals(term117296, term120079));
        assertTrue(recursiveEquals(term117630, term120084));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


