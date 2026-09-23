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

public class LightweightMessageFormatter_format_413663799307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260478;
     Object term260964;
     Object term261447;
     Object term261453;

    public LightweightMessageFormatter_format_413663799307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term260606 = new HashMap();
        Class<? extends Object> term261455 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term261454 = ((Class) term261455).getDeclaredField((String) "REGION");
        ((Field) term261454).setAccessible(true);
        Object enum312 = ((Field) term261454).get((Object) null);
        term260478 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term260558 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term260558, term260558.getClass(), "inputsByName", term260606);
        setField(term260478, term260478.getClass(), "source", term260558);
        setField(term260478, term260478.getClass(), "excerpt", enum312);
        term260964 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term260964, term260964.getClass(), "sourceName", null);
        setIntField(term260964, term260964.getClass(), "lineNumber", 1);
        Class<? extends Object> term261800 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term261799 = ((Class) term261800).getDeclaredField((String) "REGION");
        ((Field) term261799).setAccessible(true);
        Object enum313 = ((Field) term261799).get((Object) null);
        HashMap term261452 = new HashMap();
        term261447 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term261451 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term261447, term261447.getClass(), "excerpt", enum313);
        setField(term261451, term261451.getClass(), "options", null);
        setField(term261451, term261451.getClass(), "passes", null);
        setField(term261451, term261451.getClass(), "externs", null);
        setField(term261451, term261451.getClass(), "modules", null);
        setField(term261451, term261451.getClass(), "moduleGraph", null);
        setField(term261451, term261451.getClass(), "inputs", null);
        setField(term261451, term261451.getClass(), "errorManager", null);
        setField(term261451, term261451.getClass(), "warningsGuard", null);
        setField(term261451, term261451.getClass(), "externsRoot", null);
        setField(term261451, term261451.getClass(), "jsRoot", null);
        setField(term261451, term261451.getClass(), "externAndJsRoot", null);
        setField(term261451, term261451.getClass(), "inputsByName", term261452);
        setField(term261451, term261451.getClass(), "sourceMap", null);
        setField(term261451, term261451.getClass(), "externExports", null);
        setIntField(term261451, term261451.getClass(), "uniqueNameId", 0);
        setBooleanField(term261451, term261451.getClass(), "useThreads", false);
        setBooleanField(term261451, term261451.getClass(), "hasRegExpGlobalReferences", false);
        setField(term261451, term261451.getClass(), "functionInformationMap", null);
        setField(term261451, term261451.getClass(), "debugLog", null);
        setField(term261451, term261451.getClass(), "defaultCodingConvention", null);
        setField(term261451, term261451.getClass(), "typeRegistry", null);
        setField(term261451, term261451.getClass(), "parserConfig", null);
        setField(term261451, term261451.getClass(), "abstractInterpreter", null);
        setField(term261451, term261451.getClass(), "typeValidator", null);
        setField(term261451, term261451.getClass(), "tracker", null);
        setField(term261451, term261451.getClass(), "oldErrorReporter", null);
        setField(term261451, term261451.getClass(), "defaultErrorReporter", null);
        setField(term261451, term261451.getClass(), "outStream", null);
        setField(term261451, term261451.getClass(), "globalRefMap", null);
        setField(term261451, term261451.getClass(), "sanityCheck", null);
        setField(term261451, term261451.getClass(), "currentTracer", null);
        setField(term261451, term261451.getClass(), "currentPassName", null);
        setField(term261451, term261451.getClass(), "recentChange", null);
        setField(term261451, term261451.getClass(), "codeChangeHandlers", null);
        setField(term261451, term261451.getClass(), "stage", null);
        setField(term261447, term261447.getClass(), "source", term261451);
        setBooleanField(term261447, term261447.getClass(), "colorize", false);
        term261453 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term261453, term261453.getClass(), "type", null);
        setField(term261453, term261453.getClass(), "description", null);
        setField(term261453, term261453.getClass(), "sourceName", null);
        setField(term261453, term261453.getClass(), "node", null);
        setIntField(term261453, term261453.getClass(), "lineNumber", 1);
        setField(term261453, term261453.getClass(), "level", null);
        setIntField(term261453, term261453.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term260964;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term260478, args);
        assertTrue(recursiveEquals(term260478, term261447));
        assertTrue(recursiveEquals(term260964, term261453));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


