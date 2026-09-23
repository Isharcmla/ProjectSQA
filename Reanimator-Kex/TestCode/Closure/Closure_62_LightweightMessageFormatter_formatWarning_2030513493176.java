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

public class LightweightMessageFormatter_formatWarning_2030513493176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142230;
     Object term142564;
     Object term144206;
     Object term144211;

    public LightweightMessageFormatter_formatWarning_2030513493176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term144213 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term144212 = ((Class) term144213).getDeclaredField((String) "REGION");
        ((Field) term144212).setAccessible(true);
        Object enum160 = ((Field) term144212).get((Object) null);
        term142230 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term142310 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term142230, term142230.getClass(), "source", term142310);
        setField(term142230, term142230.getClass(), "excerpt", enum160);
        term142564 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term142564, term142564.getClass(), "sourceName", null);
        setIntField(term142564, term142564.getClass(), "lineNumber", 0);
        Class<? extends Object> term144558 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term144557 = ((Class) term144558).getDeclaredField((String) "REGION");
        ((Field) term144557).setAccessible(true);
        Object enum161 = ((Field) term144557).get((Object) null);
        term144206 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term144210 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term144206, term144206.getClass(), "excerpt", enum161);
        setField(term144210, term144210.getClass(), "options", null);
        setField(term144210, term144210.getClass(), "passes", null);
        setField(term144210, term144210.getClass(), "externs", null);
        setField(term144210, term144210.getClass(), "modules", null);
        setField(term144210, term144210.getClass(), "moduleGraph", null);
        setField(term144210, term144210.getClass(), "inputs", null);
        setField(term144210, term144210.getClass(), "errorManager", null);
        setField(term144210, term144210.getClass(), "warningsGuard", null);
        setField(term144210, term144210.getClass(), "externsRoot", null);
        setField(term144210, term144210.getClass(), "jsRoot", null);
        setField(term144210, term144210.getClass(), "externAndJsRoot", null);
        setField(term144210, term144210.getClass(), "inputsByName", null);
        setField(term144210, term144210.getClass(), "sourceMap", null);
        setField(term144210, term144210.getClass(), "externExports", null);
        setIntField(term144210, term144210.getClass(), "uniqueNameId", 0);
        setBooleanField(term144210, term144210.getClass(), "useThreads", false);
        setBooleanField(term144210, term144210.getClass(), "hasRegExpGlobalReferences", false);
        setField(term144210, term144210.getClass(), "functionInformationMap", null);
        setField(term144210, term144210.getClass(), "debugLog", null);
        setField(term144210, term144210.getClass(), "defaultCodingConvention", null);
        setField(term144210, term144210.getClass(), "typeRegistry", null);
        setField(term144210, term144210.getClass(), "parserConfig", null);
        setField(term144210, term144210.getClass(), "abstractInterpreter", null);
        setField(term144210, term144210.getClass(), "typeValidator", null);
        setField(term144210, term144210.getClass(), "tracker", null);
        setField(term144210, term144210.getClass(), "oldErrorReporter", null);
        setField(term144210, term144210.getClass(), "defaultErrorReporter", null);
        setField(term144210, term144210.getClass(), "outStream", null);
        setField(term144210, term144210.getClass(), "globalRefMap", null);
        setField(term144210, term144210.getClass(), "sanityCheck", null);
        setField(term144210, term144210.getClass(), "currentTracer", null);
        setField(term144210, term144210.getClass(), "currentPassName", null);
        setField(term144210, term144210.getClass(), "recentChange", null);
        setField(term144210, term144210.getClass(), "codeChangeHandlers", null);
        setField(term144210, term144210.getClass(), "stage", null);
        setField(term144206, term144206.getClass(), "source", term144210);
        setBooleanField(term144206, term144206.getClass(), "colorize", false);
        term144211 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term144211, term144211.getClass(), "type", null);
        setField(term144211, term144211.getClass(), "description", null);
        setField(term144211, term144211.getClass(), "sourceName", null);
        setField(term144211, term144211.getClass(), "node", null);
        setIntField(term144211, term144211.getClass(), "lineNumber", 0);
        setField(term144211, term144211.getClass(), "level", null);
        setIntField(term144211, term144211.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term142564;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term142230, args);
        assertTrue(recursiveEquals(term142230, term144206));
        assertTrue(recursiveEquals(term142564, term144211));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


