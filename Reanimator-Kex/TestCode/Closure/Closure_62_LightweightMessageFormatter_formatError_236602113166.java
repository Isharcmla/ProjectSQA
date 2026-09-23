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

public class LightweightMessageFormatter_formatError_236602113166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130865;
     Object term131199;
     Object term133394;
     Object term133399;

    public LightweightMessageFormatter_formatError_236602113166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term133403 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term133402 = ((Class) term133403).getDeclaredField((String) "REGION");
        ((Field) term133402).setAccessible(true);
        Object enum148 = ((Field) term133402).get((Object) null);
        term130865 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term130945 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term130865, term130865.getClass(), "source", term130945);
        setField(term130865, term130865.getClass(), "excerpt", enum148);
        setBooleanField(term130865, term130865.getClass(), "colorize", true);
        term131199 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term131199, term131199.getClass(), "sourceName", "");
        setIntField(term131199, term131199.getClass(), "lineNumber", -2147483647);
        Class<? extends Object> term133748 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term133747 = ((Class) term133748).getDeclaredField((String) "REGION");
        ((Field) term133747).setAccessible(true);
        Object enum149 = ((Field) term133747).get((Object) null);
        term133394 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term133398 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term133394, term133394.getClass(), "excerpt", enum149);
        setField(term133398, term133398.getClass(), "options", null);
        setField(term133398, term133398.getClass(), "passes", null);
        setField(term133398, term133398.getClass(), "externs", null);
        setField(term133398, term133398.getClass(), "modules", null);
        setField(term133398, term133398.getClass(), "moduleGraph", null);
        setField(term133398, term133398.getClass(), "inputs", null);
        setField(term133398, term133398.getClass(), "errorManager", null);
        setField(term133398, term133398.getClass(), "warningsGuard", null);
        setField(term133398, term133398.getClass(), "externsRoot", null);
        setField(term133398, term133398.getClass(), "jsRoot", null);
        setField(term133398, term133398.getClass(), "externAndJsRoot", null);
        setField(term133398, term133398.getClass(), "inputsByName", null);
        setField(term133398, term133398.getClass(), "sourceMap", null);
        setField(term133398, term133398.getClass(), "externExports", null);
        setIntField(term133398, term133398.getClass(), "uniqueNameId", 0);
        setBooleanField(term133398, term133398.getClass(), "useThreads", false);
        setBooleanField(term133398, term133398.getClass(), "hasRegExpGlobalReferences", false);
        setField(term133398, term133398.getClass(), "functionInformationMap", null);
        setField(term133398, term133398.getClass(), "debugLog", null);
        setField(term133398, term133398.getClass(), "defaultCodingConvention", null);
        setField(term133398, term133398.getClass(), "typeRegistry", null);
        setField(term133398, term133398.getClass(), "parserConfig", null);
        setField(term133398, term133398.getClass(), "abstractInterpreter", null);
        setField(term133398, term133398.getClass(), "typeValidator", null);
        setField(term133398, term133398.getClass(), "tracker", null);
        setField(term133398, term133398.getClass(), "oldErrorReporter", null);
        setField(term133398, term133398.getClass(), "defaultErrorReporter", null);
        setField(term133398, term133398.getClass(), "outStream", null);
        setField(term133398, term133398.getClass(), "globalRefMap", null);
        setField(term133398, term133398.getClass(), "sanityCheck", null);
        setField(term133398, term133398.getClass(), "currentTracer", null);
        setField(term133398, term133398.getClass(), "currentPassName", null);
        setField(term133398, term133398.getClass(), "recentChange", null);
        setField(term133398, term133398.getClass(), "codeChangeHandlers", null);
        setField(term133398, term133398.getClass(), "stage", null);
        setField(term133394, term133394.getClass(), "source", term133398);
        setBooleanField(term133394, term133394.getClass(), "colorize", true);
        term133399 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term133399, term133399.getClass(), "type", null);
        setField(term133399, term133399.getClass(), "description", null);
        setField(term133399, term133399.getClass(), "sourceName", "");
        setField(term133399, term133399.getClass(), "node", null);
        setIntField(term133399, term133399.getClass(), "lineNumber", -2147483647);
        setField(term133399, term133399.getClass(), "level", null);
        setIntField(term133399, term133399.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term131199;
        Object retValue = callMethod(klass, "formatError", argTypes, term130865, args);
        assertTrue(recursiveEquals(term130865, term133394));
        assertTrue(recursiveEquals(term131199, term133399));
        assertTrue(recursiveEquals(retValue, ": \u001B[31mERROR\u001B[39m - null\n"));
    }

};


