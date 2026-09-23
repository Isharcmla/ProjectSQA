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

public class LightweightMessageFormatter_formatError_236602113207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176296;
     Object term176782;
     Object term177268;
     Object term177274;

    public LightweightMessageFormatter_formatError_236602113207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term176424 = new HashMap();
        Class<? extends Object> term177276 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term177275 = ((Class) term177276).getDeclaredField((String) "REGION");
        ((Field) term177275).setAccessible(true);
        Object enum207 = ((Field) term177275).get((Object) null);
        term176296 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term176376 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term176376, term176376.getClass(), "inputsByName", term176424);
        setField(term176296, term176296.getClass(), "source", term176376);
        setField(term176296, term176296.getClass(), "excerpt", enum207);
        term176782 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term176782, term176782.getClass(), "sourceName", null);
        setIntField(term176782, term176782.getClass(), "lineNumber", 1);
        Class<? extends Object> term177621 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term177620 = ((Class) term177621).getDeclaredField((String) "REGION");
        ((Field) term177620).setAccessible(true);
        Object enum208 = ((Field) term177620).get((Object) null);
        HashMap term177273 = new HashMap();
        term177268 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term177272 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term177268, term177268.getClass(), "excerpt", enum208);
        setField(term177272, term177272.getClass(), "options", null);
        setField(term177272, term177272.getClass(), "passes", null);
        setField(term177272, term177272.getClass(), "externs", null);
        setField(term177272, term177272.getClass(), "modules", null);
        setField(term177272, term177272.getClass(), "moduleGraph", null);
        setField(term177272, term177272.getClass(), "inputs", null);
        setField(term177272, term177272.getClass(), "errorManager", null);
        setField(term177272, term177272.getClass(), "warningsGuard", null);
        setField(term177272, term177272.getClass(), "externsRoot", null);
        setField(term177272, term177272.getClass(), "jsRoot", null);
        setField(term177272, term177272.getClass(), "externAndJsRoot", null);
        setField(term177272, term177272.getClass(), "inputsByName", term177273);
        setField(term177272, term177272.getClass(), "sourceMap", null);
        setField(term177272, term177272.getClass(), "externExports", null);
        setIntField(term177272, term177272.getClass(), "uniqueNameId", 0);
        setBooleanField(term177272, term177272.getClass(), "useThreads", false);
        setBooleanField(term177272, term177272.getClass(), "hasRegExpGlobalReferences", false);
        setField(term177272, term177272.getClass(), "functionInformationMap", null);
        setField(term177272, term177272.getClass(), "debugLog", null);
        setField(term177272, term177272.getClass(), "defaultCodingConvention", null);
        setField(term177272, term177272.getClass(), "typeRegistry", null);
        setField(term177272, term177272.getClass(), "parserConfig", null);
        setField(term177272, term177272.getClass(), "abstractInterpreter", null);
        setField(term177272, term177272.getClass(), "typeValidator", null);
        setField(term177272, term177272.getClass(), "tracker", null);
        setField(term177272, term177272.getClass(), "oldErrorReporter", null);
        setField(term177272, term177272.getClass(), "defaultErrorReporter", null);
        setField(term177272, term177272.getClass(), "outStream", null);
        setField(term177272, term177272.getClass(), "globalRefMap", null);
        setField(term177272, term177272.getClass(), "sanityCheck", null);
        setField(term177272, term177272.getClass(), "currentTracer", null);
        setField(term177272, term177272.getClass(), "currentPassName", null);
        setField(term177272, term177272.getClass(), "recentChange", null);
        setField(term177272, term177272.getClass(), "codeChangeHandlers", null);
        setField(term177272, term177272.getClass(), "stage", null);
        setField(term177268, term177268.getClass(), "source", term177272);
        setBooleanField(term177268, term177268.getClass(), "colorize", false);
        term177274 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term177274, term177274.getClass(), "type", null);
        setField(term177274, term177274.getClass(), "description", null);
        setField(term177274, term177274.getClass(), "sourceName", null);
        setField(term177274, term177274.getClass(), "node", null);
        setIntField(term177274, term177274.getClass(), "lineNumber", 1);
        setField(term177274, term177274.getClass(), "level", null);
        setIntField(term177274, term177274.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term176782;
        Object retValue = callMethod(klass, "formatError", argTypes, term176296, args);
        assertTrue(recursiveEquals(term176296, term177268));
        assertTrue(recursiveEquals(term176782, term177274));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


