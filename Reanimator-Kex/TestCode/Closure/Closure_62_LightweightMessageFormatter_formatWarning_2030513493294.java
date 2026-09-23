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

public class LightweightMessageFormatter_formatWarning_2030513493294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248387;
     Object term248721;
     Object term250363;
     Object term250368;

    public LightweightMessageFormatter_formatWarning_2030513493294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term250370 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term250369 = ((Class) term250370).getDeclaredField((String) "REGION");
        ((Field) term250369).setAccessible(true);
        Object enum295 = ((Field) term250369).get((Object) null);
        term248387 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term248467 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term248387, term248387.getClass(), "source", term248467);
        setField(term248387, term248387.getClass(), "excerpt", enum295);
        term248721 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term248721, term248721.getClass(), "sourceName", null);
        setIntField(term248721, term248721.getClass(), "lineNumber", 0);
        Class<? extends Object> term250715 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term250714 = ((Class) term250715).getDeclaredField((String) "REGION");
        ((Field) term250714).setAccessible(true);
        Object enum296 = ((Field) term250714).get((Object) null);
        term250363 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term250367 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term250363, term250363.getClass(), "excerpt", enum296);
        setField(term250367, term250367.getClass(), "options", null);
        setField(term250367, term250367.getClass(), "passes", null);
        setField(term250367, term250367.getClass(), "externs", null);
        setField(term250367, term250367.getClass(), "modules", null);
        setField(term250367, term250367.getClass(), "moduleGraph", null);
        setField(term250367, term250367.getClass(), "inputs", null);
        setField(term250367, term250367.getClass(), "errorManager", null);
        setField(term250367, term250367.getClass(), "warningsGuard", null);
        setField(term250367, term250367.getClass(), "externsRoot", null);
        setField(term250367, term250367.getClass(), "jsRoot", null);
        setField(term250367, term250367.getClass(), "externAndJsRoot", null);
        setField(term250367, term250367.getClass(), "inputsByName", null);
        setField(term250367, term250367.getClass(), "sourceMap", null);
        setField(term250367, term250367.getClass(), "externExports", null);
        setIntField(term250367, term250367.getClass(), "uniqueNameId", 0);
        setBooleanField(term250367, term250367.getClass(), "useThreads", false);
        setBooleanField(term250367, term250367.getClass(), "hasRegExpGlobalReferences", false);
        setField(term250367, term250367.getClass(), "functionInformationMap", null);
        setField(term250367, term250367.getClass(), "debugLog", null);
        setField(term250367, term250367.getClass(), "defaultCodingConvention", null);
        setField(term250367, term250367.getClass(), "typeRegistry", null);
        setField(term250367, term250367.getClass(), "parserConfig", null);
        setField(term250367, term250367.getClass(), "abstractInterpreter", null);
        setField(term250367, term250367.getClass(), "typeValidator", null);
        setField(term250367, term250367.getClass(), "tracker", null);
        setField(term250367, term250367.getClass(), "oldErrorReporter", null);
        setField(term250367, term250367.getClass(), "defaultErrorReporter", null);
        setField(term250367, term250367.getClass(), "outStream", null);
        setField(term250367, term250367.getClass(), "globalRefMap", null);
        setField(term250367, term250367.getClass(), "sanityCheck", null);
        setField(term250367, term250367.getClass(), "currentTracer", null);
        setField(term250367, term250367.getClass(), "currentPassName", null);
        setField(term250367, term250367.getClass(), "recentChange", null);
        setField(term250367, term250367.getClass(), "codeChangeHandlers", null);
        setField(term250367, term250367.getClass(), "stage", null);
        setField(term250363, term250363.getClass(), "source", term250367);
        setBooleanField(term250363, term250363.getClass(), "colorize", false);
        term250368 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term250368, term250368.getClass(), "type", null);
        setField(term250368, term250368.getClass(), "description", null);
        setField(term250368, term250368.getClass(), "sourceName", null);
        setField(term250368, term250368.getClass(), "node", null);
        setIntField(term250368, term250368.getClass(), "lineNumber", 0);
        setField(term250368, term250368.getClass(), "level", null);
        setIntField(term250368, term250368.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term248721;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term248387, args);
        assertTrue(recursiveEquals(term248387, term250363));
        assertTrue(recursiveEquals(term248721, term250368));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


