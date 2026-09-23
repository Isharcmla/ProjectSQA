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

public class LightweightMessageFormatter_format_413663799184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150248;
     Object term150734;
     Object term152152;
     Object term152158;

    public LightweightMessageFormatter_format_413663799184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term150376 = new HashMap();
        Class<? extends Object> term152162 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term152161 = ((Class) term152162).getDeclaredField((String) "REGION");
        ((Field) term152161).setAccessible(true);
        Object enum172 = ((Field) term152161).get((Object) null);
        term150248 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term150328 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term150328, term150328.getClass(), "inputsByName", term150376);
        setField(term150248, term150248.getClass(), "source", term150328);
        setField(term150248, term150248.getClass(), "excerpt", enum172);
        term150734 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term150734, term150734.getClass(), "sourceName", "");
        setIntField(term150734, term150734.getClass(), "lineNumber", 1);
        Class<? extends Object> term152507 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term152506 = ((Class) term152507).getDeclaredField((String) "REGION");
        ((Field) term152506).setAccessible(true);
        Object enum173 = ((Field) term152506).get((Object) null);
        HashMap term152157 = new HashMap();
        term152152 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term152156 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term152152, term152152.getClass(), "excerpt", enum173);
        setField(term152156, term152156.getClass(), "options", null);
        setField(term152156, term152156.getClass(), "passes", null);
        setField(term152156, term152156.getClass(), "externs", null);
        setField(term152156, term152156.getClass(), "modules", null);
        setField(term152156, term152156.getClass(), "moduleGraph", null);
        setField(term152156, term152156.getClass(), "inputs", null);
        setField(term152156, term152156.getClass(), "errorManager", null);
        setField(term152156, term152156.getClass(), "warningsGuard", null);
        setField(term152156, term152156.getClass(), "externsRoot", null);
        setField(term152156, term152156.getClass(), "jsRoot", null);
        setField(term152156, term152156.getClass(), "externAndJsRoot", null);
        setField(term152156, term152156.getClass(), "inputsByName", term152157);
        setField(term152156, term152156.getClass(), "sourceMap", null);
        setField(term152156, term152156.getClass(), "externExports", null);
        setIntField(term152156, term152156.getClass(), "uniqueNameId", 0);
        setBooleanField(term152156, term152156.getClass(), "useThreads", false);
        setBooleanField(term152156, term152156.getClass(), "hasRegExpGlobalReferences", false);
        setField(term152156, term152156.getClass(), "functionInformationMap", null);
        setField(term152156, term152156.getClass(), "debugLog", null);
        setField(term152156, term152156.getClass(), "defaultCodingConvention", null);
        setField(term152156, term152156.getClass(), "typeRegistry", null);
        setField(term152156, term152156.getClass(), "parserConfig", null);
        setField(term152156, term152156.getClass(), "abstractInterpreter", null);
        setField(term152156, term152156.getClass(), "typeValidator", null);
        setField(term152156, term152156.getClass(), "tracker", null);
        setField(term152156, term152156.getClass(), "oldErrorReporter", null);
        setField(term152156, term152156.getClass(), "defaultErrorReporter", null);
        setField(term152156, term152156.getClass(), "outStream", null);
        setField(term152156, term152156.getClass(), "globalRefMap", null);
        setField(term152156, term152156.getClass(), "sanityCheck", null);
        setField(term152156, term152156.getClass(), "currentTracer", null);
        setField(term152156, term152156.getClass(), "currentPassName", null);
        setField(term152156, term152156.getClass(), "recentChange", null);
        setField(term152156, term152156.getClass(), "codeChangeHandlers", null);
        setField(term152156, term152156.getClass(), "stage", null);
        setField(term152152, term152152.getClass(), "source", term152156);
        setBooleanField(term152152, term152152.getClass(), "colorize", false);
        term152158 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term152158, term152158.getClass(), "type", null);
        setField(term152158, term152158.getClass(), "description", null);
        setField(term152158, term152158.getClass(), "sourceName", "");
        setField(term152158, term152158.getClass(), "node", null);
        setIntField(term152158, term152158.getClass(), "lineNumber", 1);
        setField(term152158, term152158.getClass(), "level", null);
        setIntField(term152158, term152158.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term150734;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term150248, args);
        assertTrue(recursiveEquals(term150248, term152152));
        assertTrue(recursiveEquals(term150734, term152158));
        assertTrue(recursiveEquals(retValue, ":1: ERROR - null\n"));
    }

};


