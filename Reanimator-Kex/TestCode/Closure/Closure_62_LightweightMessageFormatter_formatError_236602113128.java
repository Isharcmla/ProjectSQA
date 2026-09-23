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

public class LightweightMessageFormatter_formatError_236602113128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93138;
     Object term93472;
     Object term95360;
     Object term95365;

    public LightweightMessageFormatter_formatError_236602113128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term95369 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term95368 = ((Class) term95369).getDeclaredField((String) "REGION");
        ((Field) term95368).setAccessible(true);
        Object enum105 = ((Field) term95368).get((Object) null);
        term93138 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term93218 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term93138, term93138.getClass(), "source", term93218);
        setField(term93138, term93138.getClass(), "excerpt", enum105);
        term93472 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term93472, term93472.getClass(), "sourceName", "");
        setIntField(term93472, term93472.getClass(), "lineNumber", 0);
        Class<? extends Object> term95714 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term95713 = ((Class) term95714).getDeclaredField((String) "REGION");
        ((Field) term95713).setAccessible(true);
        Object enum106 = ((Field) term95713).get((Object) null);
        term95360 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term95364 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term95360, term95360.getClass(), "excerpt", enum106);
        setField(term95364, term95364.getClass(), "options", null);
        setField(term95364, term95364.getClass(), "passes", null);
        setField(term95364, term95364.getClass(), "externs", null);
        setField(term95364, term95364.getClass(), "modules", null);
        setField(term95364, term95364.getClass(), "moduleGraph", null);
        setField(term95364, term95364.getClass(), "inputs", null);
        setField(term95364, term95364.getClass(), "errorManager", null);
        setField(term95364, term95364.getClass(), "warningsGuard", null);
        setField(term95364, term95364.getClass(), "externsRoot", null);
        setField(term95364, term95364.getClass(), "jsRoot", null);
        setField(term95364, term95364.getClass(), "externAndJsRoot", null);
        setField(term95364, term95364.getClass(), "inputsByName", null);
        setField(term95364, term95364.getClass(), "sourceMap", null);
        setField(term95364, term95364.getClass(), "externExports", null);
        setIntField(term95364, term95364.getClass(), "uniqueNameId", 0);
        setBooleanField(term95364, term95364.getClass(), "useThreads", false);
        setBooleanField(term95364, term95364.getClass(), "hasRegExpGlobalReferences", false);
        setField(term95364, term95364.getClass(), "functionInformationMap", null);
        setField(term95364, term95364.getClass(), "debugLog", null);
        setField(term95364, term95364.getClass(), "defaultCodingConvention", null);
        setField(term95364, term95364.getClass(), "typeRegistry", null);
        setField(term95364, term95364.getClass(), "parserConfig", null);
        setField(term95364, term95364.getClass(), "abstractInterpreter", null);
        setField(term95364, term95364.getClass(), "typeValidator", null);
        setField(term95364, term95364.getClass(), "tracker", null);
        setField(term95364, term95364.getClass(), "oldErrorReporter", null);
        setField(term95364, term95364.getClass(), "defaultErrorReporter", null);
        setField(term95364, term95364.getClass(), "outStream", null);
        setField(term95364, term95364.getClass(), "globalRefMap", null);
        setField(term95364, term95364.getClass(), "sanityCheck", null);
        setField(term95364, term95364.getClass(), "currentTracer", null);
        setField(term95364, term95364.getClass(), "currentPassName", null);
        setField(term95364, term95364.getClass(), "recentChange", null);
        setField(term95364, term95364.getClass(), "codeChangeHandlers", null);
        setField(term95364, term95364.getClass(), "stage", null);
        setField(term95360, term95360.getClass(), "source", term95364);
        setBooleanField(term95360, term95360.getClass(), "colorize", false);
        term95365 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term95365, term95365.getClass(), "type", null);
        setField(term95365, term95365.getClass(), "description", null);
        setField(term95365, term95365.getClass(), "sourceName", "");
        setField(term95365, term95365.getClass(), "node", null);
        setIntField(term95365, term95365.getClass(), "lineNumber", 0);
        setField(term95365, term95365.getClass(), "level", null);
        setIntField(term95365, term95365.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term93472;
        Object retValue = callMethod(klass, "formatError", argTypes, term93138, args);
        assertTrue(recursiveEquals(term93138, term95360));
        assertTrue(recursiveEquals(term93472, term95365));
        assertTrue(recursiveEquals(retValue, ": ERROR - null\n"));
    }

};


