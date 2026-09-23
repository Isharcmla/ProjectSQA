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

public class LightweightMessageFormatter_formatWarning_2030513493337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284706;
     Object term285192;
     Object term285815;
     Object term285821;

    public LightweightMessageFormatter_formatWarning_2030513493337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term284834 = new HashMap();
        Class<? extends Object> term285825 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term285824 = ((Class) term285825).getDeclaredField((String) "REGION");
        ((Field) term285824).setAccessible(true);
        Object enum339 = ((Field) term285824).get((Object) null);
        term284706 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term284786 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term284786, term284786.getClass(), "inputsByName", term284834);
        setField(term284706, term284706.getClass(), "source", term284786);
        setField(term284706, term284706.getClass(), "excerpt", enum339);
        setBooleanField(term284706, term284706.getClass(), "colorize", true);
        term285192 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term285192, term285192.getClass(), "sourceName", "");
        setIntField(term285192, term285192.getClass(), "lineNumber", 32);
        Class<? extends Object> term286170 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term286169 = ((Class) term286170).getDeclaredField((String) "REGION");
        ((Field) term286169).setAccessible(true);
        Object enum340 = ((Field) term286169).get((Object) null);
        HashMap term285820 = new HashMap();
        term285815 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term285819 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term285815, term285815.getClass(), "excerpt", enum340);
        setField(term285819, term285819.getClass(), "options", null);
        setField(term285819, term285819.getClass(), "passes", null);
        setField(term285819, term285819.getClass(), "externs", null);
        setField(term285819, term285819.getClass(), "modules", null);
        setField(term285819, term285819.getClass(), "moduleGraph", null);
        setField(term285819, term285819.getClass(), "inputs", null);
        setField(term285819, term285819.getClass(), "errorManager", null);
        setField(term285819, term285819.getClass(), "warningsGuard", null);
        setField(term285819, term285819.getClass(), "externsRoot", null);
        setField(term285819, term285819.getClass(), "jsRoot", null);
        setField(term285819, term285819.getClass(), "externAndJsRoot", null);
        setField(term285819, term285819.getClass(), "inputsByName", term285820);
        setField(term285819, term285819.getClass(), "sourceMap", null);
        setField(term285819, term285819.getClass(), "externExports", null);
        setIntField(term285819, term285819.getClass(), "uniqueNameId", 0);
        setBooleanField(term285819, term285819.getClass(), "useThreads", false);
        setBooleanField(term285819, term285819.getClass(), "hasRegExpGlobalReferences", false);
        setField(term285819, term285819.getClass(), "functionInformationMap", null);
        setField(term285819, term285819.getClass(), "debugLog", null);
        setField(term285819, term285819.getClass(), "defaultCodingConvention", null);
        setField(term285819, term285819.getClass(), "typeRegistry", null);
        setField(term285819, term285819.getClass(), "parserConfig", null);
        setField(term285819, term285819.getClass(), "abstractInterpreter", null);
        setField(term285819, term285819.getClass(), "typeValidator", null);
        setField(term285819, term285819.getClass(), "tracker", null);
        setField(term285819, term285819.getClass(), "oldErrorReporter", null);
        setField(term285819, term285819.getClass(), "defaultErrorReporter", null);
        setField(term285819, term285819.getClass(), "outStream", null);
        setField(term285819, term285819.getClass(), "globalRefMap", null);
        setField(term285819, term285819.getClass(), "sanityCheck", null);
        setField(term285819, term285819.getClass(), "currentTracer", null);
        setField(term285819, term285819.getClass(), "currentPassName", null);
        setField(term285819, term285819.getClass(), "recentChange", null);
        setField(term285819, term285819.getClass(), "codeChangeHandlers", null);
        setField(term285819, term285819.getClass(), "stage", null);
        setField(term285815, term285815.getClass(), "source", term285819);
        setBooleanField(term285815, term285815.getClass(), "colorize", true);
        term285821 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term285821, term285821.getClass(), "type", null);
        setField(term285821, term285821.getClass(), "description", null);
        setField(term285821, term285821.getClass(), "sourceName", "");
        setField(term285821, term285821.getClass(), "node", null);
        setIntField(term285821, term285821.getClass(), "lineNumber", 32);
        setField(term285821, term285821.getClass(), "level", null);
        setIntField(term285821, term285821.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term285192;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term284706, args);
        assertTrue(recursiveEquals(term284706, term285815));
        assertTrue(recursiveEquals(term285192, term285821));
        assertTrue(recursiveEquals(retValue, ":32: \u001B[35mWARNING\u001B[39m - null\n"));
    }

};


