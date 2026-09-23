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

public class LightweightMessageFormatter_formatWarning_2030513493248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214910;
     Object term215244;
     Object term216119;
     Object term216124;

    public LightweightMessageFormatter_formatWarning_2030513493248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term216128 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term216127 = ((Class) term216128).getDeclaredField((String) "REGION");
        ((Field) term216127).setAccessible(true);
        Object enum255 = ((Field) term216127).get((Object) null);
        term214910 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term214990 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term214910, term214910.getClass(), "source", term214990);
        setField(term214910, term214910.getClass(), "excerpt", enum255);
        term215244 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term215244, term215244.getClass(), "sourceName", "OFF");
        setIntField(term215244, term215244.getClass(), "lineNumber", 0);
        Class<? extends Object> term216476 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term216475 = ((Class) term216476).getDeclaredField((String) "REGION");
        ((Field) term216475).setAccessible(true);
        Object enum256 = ((Field) term216475).get((Object) null);
        term216119 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term216123 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term216119, term216119.getClass(), "excerpt", enum256);
        setField(term216123, term216123.getClass(), "options", null);
        setField(term216123, term216123.getClass(), "passes", null);
        setField(term216123, term216123.getClass(), "externs", null);
        setField(term216123, term216123.getClass(), "modules", null);
        setField(term216123, term216123.getClass(), "moduleGraph", null);
        setField(term216123, term216123.getClass(), "inputs", null);
        setField(term216123, term216123.getClass(), "errorManager", null);
        setField(term216123, term216123.getClass(), "warningsGuard", null);
        setField(term216123, term216123.getClass(), "externsRoot", null);
        setField(term216123, term216123.getClass(), "jsRoot", null);
        setField(term216123, term216123.getClass(), "externAndJsRoot", null);
        setField(term216123, term216123.getClass(), "inputsByName", null);
        setField(term216123, term216123.getClass(), "sourceMap", null);
        setField(term216123, term216123.getClass(), "externExports", null);
        setIntField(term216123, term216123.getClass(), "uniqueNameId", 0);
        setBooleanField(term216123, term216123.getClass(), "useThreads", false);
        setBooleanField(term216123, term216123.getClass(), "hasRegExpGlobalReferences", false);
        setField(term216123, term216123.getClass(), "functionInformationMap", null);
        setField(term216123, term216123.getClass(), "debugLog", null);
        setField(term216123, term216123.getClass(), "defaultCodingConvention", null);
        setField(term216123, term216123.getClass(), "typeRegistry", null);
        setField(term216123, term216123.getClass(), "parserConfig", null);
        setField(term216123, term216123.getClass(), "abstractInterpreter", null);
        setField(term216123, term216123.getClass(), "typeValidator", null);
        setField(term216123, term216123.getClass(), "tracker", null);
        setField(term216123, term216123.getClass(), "oldErrorReporter", null);
        setField(term216123, term216123.getClass(), "defaultErrorReporter", null);
        setField(term216123, term216123.getClass(), "outStream", null);
        setField(term216123, term216123.getClass(), "globalRefMap", null);
        setField(term216123, term216123.getClass(), "sanityCheck", null);
        setField(term216123, term216123.getClass(), "currentTracer", null);
        setField(term216123, term216123.getClass(), "currentPassName", null);
        setField(term216123, term216123.getClass(), "recentChange", null);
        setField(term216123, term216123.getClass(), "codeChangeHandlers", null);
        setField(term216123, term216123.getClass(), "stage", null);
        setField(term216119, term216119.getClass(), "source", term216123);
        setBooleanField(term216119, term216119.getClass(), "colorize", false);
        term216124 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term216124, term216124.getClass(), "type", null);
        setField(term216124, term216124.getClass(), "description", null);
        setField(term216124, term216124.getClass(), "sourceName", "OFF");
        setField(term216124, term216124.getClass(), "node", null);
        setIntField(term216124, term216124.getClass(), "lineNumber", 0);
        setField(term216124, term216124.getClass(), "level", null);
        setIntField(term216124, term216124.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term215244;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term214910, args);
        assertTrue(recursiveEquals(term214910, term216119));
        assertTrue(recursiveEquals(term215244, term216124));
        assertTrue(recursiveEquals(retValue, "OFF: WARNING - null\n"));
    }

};


