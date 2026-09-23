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

public class LightweightMessageFormatter_format_413663799305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258589;
     Object term258923;
     Object term259389;
     Object term259394;

    public LightweightMessageFormatter_format_413663799305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term259396 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term259395 = ((Class) term259396).getDeclaredField((String) "REGION");
        ((Field) term259395).setAccessible(true);
        Object enum309 = ((Field) term259395).get((Object) null);
        term258589 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term258669 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term258589, term258589.getClass(), "source", term258669);
        setField(term258589, term258589.getClass(), "excerpt", enum309);
        term258923 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term258923, term258923.getClass(), "sourceName", null);
        setIntField(term258923, term258923.getClass(), "lineNumber", 0);
        Class<? extends Object> term259741 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term259740 = ((Class) term259741).getDeclaredField((String) "REGION");
        ((Field) term259740).setAccessible(true);
        Object enum310 = ((Field) term259740).get((Object) null);
        term259389 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term259393 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term259389, term259389.getClass(), "excerpt", enum310);
        setField(term259393, term259393.getClass(), "options", null);
        setField(term259393, term259393.getClass(), "passes", null);
        setField(term259393, term259393.getClass(), "externs", null);
        setField(term259393, term259393.getClass(), "modules", null);
        setField(term259393, term259393.getClass(), "moduleGraph", null);
        setField(term259393, term259393.getClass(), "inputs", null);
        setField(term259393, term259393.getClass(), "errorManager", null);
        setField(term259393, term259393.getClass(), "warningsGuard", null);
        setField(term259393, term259393.getClass(), "externsRoot", null);
        setField(term259393, term259393.getClass(), "jsRoot", null);
        setField(term259393, term259393.getClass(), "externAndJsRoot", null);
        setField(term259393, term259393.getClass(), "inputsByName", null);
        setField(term259393, term259393.getClass(), "sourceMap", null);
        setField(term259393, term259393.getClass(), "externExports", null);
        setIntField(term259393, term259393.getClass(), "uniqueNameId", 0);
        setBooleanField(term259393, term259393.getClass(), "useThreads", false);
        setBooleanField(term259393, term259393.getClass(), "hasRegExpGlobalReferences", false);
        setField(term259393, term259393.getClass(), "functionInformationMap", null);
        setField(term259393, term259393.getClass(), "debugLog", null);
        setField(term259393, term259393.getClass(), "defaultCodingConvention", null);
        setField(term259393, term259393.getClass(), "typeRegistry", null);
        setField(term259393, term259393.getClass(), "parserConfig", null);
        setField(term259393, term259393.getClass(), "abstractInterpreter", null);
        setField(term259393, term259393.getClass(), "typeValidator", null);
        setField(term259393, term259393.getClass(), "tracker", null);
        setField(term259393, term259393.getClass(), "oldErrorReporter", null);
        setField(term259393, term259393.getClass(), "defaultErrorReporter", null);
        setField(term259393, term259393.getClass(), "outStream", null);
        setField(term259393, term259393.getClass(), "globalRefMap", null);
        setField(term259393, term259393.getClass(), "sanityCheck", null);
        setField(term259393, term259393.getClass(), "currentTracer", null);
        setField(term259393, term259393.getClass(), "currentPassName", null);
        setField(term259393, term259393.getClass(), "recentChange", null);
        setField(term259393, term259393.getClass(), "codeChangeHandlers", null);
        setField(term259393, term259393.getClass(), "stage", null);
        setField(term259389, term259389.getClass(), "source", term259393);
        setBooleanField(term259389, term259389.getClass(), "colorize", false);
        term259394 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term259394, term259394.getClass(), "type", null);
        setField(term259394, term259394.getClass(), "description", null);
        setField(term259394, term259394.getClass(), "sourceName", null);
        setField(term259394, term259394.getClass(), "node", null);
        setIntField(term259394, term259394.getClass(), "lineNumber", 0);
        setField(term259394, term259394.getClass(), "level", null);
        setIntField(term259394, term259394.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term258923;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term258589, args);
        assertTrue(recursiveEquals(term258589, term259389));
        assertTrue(recursiveEquals(term258923, term259394));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


