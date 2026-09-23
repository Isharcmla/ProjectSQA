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

public class LightweightMessageFormatter_format_413663799151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114567;
     Object term114901;
     Object term115412;
     Object term115417;

    public LightweightMessageFormatter_format_413663799151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term115421 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term115420 = ((Class) term115421).getDeclaredField((String) "REGION");
        ((Field) term115420).setAccessible(true);
        Object enum129 = ((Field) term115420).get((Object) null);
        term114567 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term114647 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term114567, term114567.getClass(), "source", term114647);
        setField(term114567, term114567.getClass(), "excerpt", enum129);
        term114901 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term114901, term114901.getClass(), "sourceName", "");
        setIntField(term114901, term114901.getClass(), "lineNumber", -2147483392);
        Class<? extends Object> term115766 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term115765 = ((Class) term115766).getDeclaredField((String) "REGION");
        ((Field) term115765).setAccessible(true);
        Object enum130 = ((Field) term115765).get((Object) null);
        term115412 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term115416 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term115412, term115412.getClass(), "excerpt", enum130);
        setField(term115416, term115416.getClass(), "options", null);
        setField(term115416, term115416.getClass(), "passes", null);
        setField(term115416, term115416.getClass(), "externs", null);
        setField(term115416, term115416.getClass(), "modules", null);
        setField(term115416, term115416.getClass(), "moduleGraph", null);
        setField(term115416, term115416.getClass(), "inputs", null);
        setField(term115416, term115416.getClass(), "errorManager", null);
        setField(term115416, term115416.getClass(), "warningsGuard", null);
        setField(term115416, term115416.getClass(), "externsRoot", null);
        setField(term115416, term115416.getClass(), "jsRoot", null);
        setField(term115416, term115416.getClass(), "externAndJsRoot", null);
        setField(term115416, term115416.getClass(), "inputsByName", null);
        setField(term115416, term115416.getClass(), "sourceMap", null);
        setField(term115416, term115416.getClass(), "externExports", null);
        setIntField(term115416, term115416.getClass(), "uniqueNameId", 0);
        setBooleanField(term115416, term115416.getClass(), "useThreads", false);
        setBooleanField(term115416, term115416.getClass(), "hasRegExpGlobalReferences", false);
        setField(term115416, term115416.getClass(), "functionInformationMap", null);
        setField(term115416, term115416.getClass(), "debugLog", null);
        setField(term115416, term115416.getClass(), "defaultCodingConvention", null);
        setField(term115416, term115416.getClass(), "typeRegistry", null);
        setField(term115416, term115416.getClass(), "parserConfig", null);
        setField(term115416, term115416.getClass(), "abstractInterpreter", null);
        setField(term115416, term115416.getClass(), "typeValidator", null);
        setField(term115416, term115416.getClass(), "tracker", null);
        setField(term115416, term115416.getClass(), "oldErrorReporter", null);
        setField(term115416, term115416.getClass(), "defaultErrorReporter", null);
        setField(term115416, term115416.getClass(), "outStream", null);
        setField(term115416, term115416.getClass(), "globalRefMap", null);
        setField(term115416, term115416.getClass(), "sanityCheck", null);
        setField(term115416, term115416.getClass(), "currentTracer", null);
        setField(term115416, term115416.getClass(), "currentPassName", null);
        setField(term115416, term115416.getClass(), "recentChange", null);
        setField(term115416, term115416.getClass(), "codeChangeHandlers", null);
        setField(term115416, term115416.getClass(), "stage", null);
        setField(term115412, term115412.getClass(), "source", term115416);
        setBooleanField(term115412, term115412.getClass(), "colorize", false);
        term115417 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term115417, term115417.getClass(), "type", null);
        setField(term115417, term115417.getClass(), "description", null);
        setField(term115417, term115417.getClass(), "sourceName", "");
        setField(term115417, term115417.getClass(), "node", null);
        setIntField(term115417, term115417.getClass(), "lineNumber", -2147483392);
        setField(term115417, term115417.getClass(), "level", null);
        setIntField(term115417, term115417.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term114901;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term114567, args);
        assertTrue(recursiveEquals(term114567, term115412));
        assertTrue(recursiveEquals(term114901, term115417));
        assertTrue(recursiveEquals(retValue, ": WARNING - null\n"));
    }

};


