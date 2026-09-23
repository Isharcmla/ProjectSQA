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

public class LightweightMessageFormatter_formatWarning_2030513493149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111523;
     Object term111857;
     Object term112400;
     Object term112405;

    public LightweightMessageFormatter_formatWarning_2030513493149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term112409 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term112408 = ((Class) term112409).getDeclaredField((String) "REGION");
        ((Field) term112408).setAccessible(true);
        Object enum126 = ((Field) term112408).get((Object) null);
        term111523 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term111603 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term111523, term111523.getClass(), "source", term111603);
        setField(term111523, term111523.getClass(), "excerpt", enum126);
        term111857 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term111857, term111857.getClass(), "sourceName", "");
        setIntField(term111857, term111857.getClass(), "lineNumber", -2147483392);
        Class<? extends Object> term112754 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term112753 = ((Class) term112754).getDeclaredField((String) "REGION");
        ((Field) term112753).setAccessible(true);
        Object enum127 = ((Field) term112753).get((Object) null);
        term112400 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term112404 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term112400, term112400.getClass(), "excerpt", enum127);
        setField(term112404, term112404.getClass(), "options", null);
        setField(term112404, term112404.getClass(), "passes", null);
        setField(term112404, term112404.getClass(), "externs", null);
        setField(term112404, term112404.getClass(), "modules", null);
        setField(term112404, term112404.getClass(), "moduleGraph", null);
        setField(term112404, term112404.getClass(), "inputs", null);
        setField(term112404, term112404.getClass(), "errorManager", null);
        setField(term112404, term112404.getClass(), "warningsGuard", null);
        setField(term112404, term112404.getClass(), "externsRoot", null);
        setField(term112404, term112404.getClass(), "jsRoot", null);
        setField(term112404, term112404.getClass(), "externAndJsRoot", null);
        setField(term112404, term112404.getClass(), "inputsByName", null);
        setField(term112404, term112404.getClass(), "sourceMap", null);
        setField(term112404, term112404.getClass(), "externExports", null);
        setIntField(term112404, term112404.getClass(), "uniqueNameId", 0);
        setBooleanField(term112404, term112404.getClass(), "useThreads", false);
        setBooleanField(term112404, term112404.getClass(), "hasRegExpGlobalReferences", false);
        setField(term112404, term112404.getClass(), "functionInformationMap", null);
        setField(term112404, term112404.getClass(), "debugLog", null);
        setField(term112404, term112404.getClass(), "defaultCodingConvention", null);
        setField(term112404, term112404.getClass(), "typeRegistry", null);
        setField(term112404, term112404.getClass(), "parserConfig", null);
        setField(term112404, term112404.getClass(), "abstractInterpreter", null);
        setField(term112404, term112404.getClass(), "typeValidator", null);
        setField(term112404, term112404.getClass(), "tracker", null);
        setField(term112404, term112404.getClass(), "oldErrorReporter", null);
        setField(term112404, term112404.getClass(), "defaultErrorReporter", null);
        setField(term112404, term112404.getClass(), "outStream", null);
        setField(term112404, term112404.getClass(), "globalRefMap", null);
        setField(term112404, term112404.getClass(), "sanityCheck", null);
        setField(term112404, term112404.getClass(), "currentTracer", null);
        setField(term112404, term112404.getClass(), "currentPassName", null);
        setField(term112404, term112404.getClass(), "recentChange", null);
        setField(term112404, term112404.getClass(), "codeChangeHandlers", null);
        setField(term112404, term112404.getClass(), "stage", null);
        setField(term112400, term112400.getClass(), "source", term112404);
        setBooleanField(term112400, term112400.getClass(), "colorize", false);
        term112405 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term112405, term112405.getClass(), "type", null);
        setField(term112405, term112405.getClass(), "description", null);
        setField(term112405, term112405.getClass(), "sourceName", "");
        setField(term112405, term112405.getClass(), "node", null);
        setIntField(term112405, term112405.getClass(), "lineNumber", -2147483392);
        setField(term112405, term112405.getClass(), "level", null);
        setIntField(term112405, term112405.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term111857;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term111523, args);
        assertTrue(recursiveEquals(term111523, term112400));
        assertTrue(recursiveEquals(term111857, term112405));
        assertTrue(recursiveEquals(retValue, ": WARNING - null\n"));
    }

};


