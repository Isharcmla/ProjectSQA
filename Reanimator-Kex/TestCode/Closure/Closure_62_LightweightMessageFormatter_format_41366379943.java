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

public class LightweightMessageFormatter_format_41366379943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24532;
     Object term24866;
     Object term25346;
     Object term25351;

    public LightweightMessageFormatter_format_41366379943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25353 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term25352 = ((Class) term25353).getDeclaredField((String) "REGION");
        ((Field) term25352).setAccessible(true);
        Object enum42 = ((Field) term25352).get((Object) null);
        term24532 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term24612 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term24532, term24532.getClass(), "source", term24612);
        setField(term24532, term24532.getClass(), "excerpt", enum42);
        term24866 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term24866, term24866.getClass(), "sourceName", null);
        setIntField(term24866, term24866.getClass(), "lineNumber", 0);
        Class<? extends Object> term25698 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term25697 = ((Class) term25698).getDeclaredField((String) "REGION");
        ((Field) term25697).setAccessible(true);
        Object enum43 = ((Field) term25697).get((Object) null);
        term25346 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term25350 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term25346, term25346.getClass(), "excerpt", enum43);
        setField(term25350, term25350.getClass(), "options", null);
        setField(term25350, term25350.getClass(), "passes", null);
        setField(term25350, term25350.getClass(), "externs", null);
        setField(term25350, term25350.getClass(), "modules", null);
        setField(term25350, term25350.getClass(), "moduleGraph", null);
        setField(term25350, term25350.getClass(), "inputs", null);
        setField(term25350, term25350.getClass(), "errorManager", null);
        setField(term25350, term25350.getClass(), "warningsGuard", null);
        setField(term25350, term25350.getClass(), "externsRoot", null);
        setField(term25350, term25350.getClass(), "jsRoot", null);
        setField(term25350, term25350.getClass(), "externAndJsRoot", null);
        setField(term25350, term25350.getClass(), "inputsByName", null);
        setField(term25350, term25350.getClass(), "sourceMap", null);
        setField(term25350, term25350.getClass(), "externExports", null);
        setIntField(term25350, term25350.getClass(), "uniqueNameId", 0);
        setBooleanField(term25350, term25350.getClass(), "useThreads", false);
        setBooleanField(term25350, term25350.getClass(), "hasRegExpGlobalReferences", false);
        setField(term25350, term25350.getClass(), "functionInformationMap", null);
        setField(term25350, term25350.getClass(), "debugLog", null);
        setField(term25350, term25350.getClass(), "defaultCodingConvention", null);
        setField(term25350, term25350.getClass(), "typeRegistry", null);
        setField(term25350, term25350.getClass(), "parserConfig", null);
        setField(term25350, term25350.getClass(), "abstractInterpreter", null);
        setField(term25350, term25350.getClass(), "typeValidator", null);
        setField(term25350, term25350.getClass(), "tracker", null);
        setField(term25350, term25350.getClass(), "oldErrorReporter", null);
        setField(term25350, term25350.getClass(), "defaultErrorReporter", null);
        setField(term25350, term25350.getClass(), "outStream", null);
        setField(term25350, term25350.getClass(), "globalRefMap", null);
        setField(term25350, term25350.getClass(), "sanityCheck", null);
        setField(term25350, term25350.getClass(), "currentTracer", null);
        setField(term25350, term25350.getClass(), "currentPassName", null);
        setField(term25350, term25350.getClass(), "recentChange", null);
        setField(term25350, term25350.getClass(), "codeChangeHandlers", null);
        setField(term25350, term25350.getClass(), "stage", null);
        setField(term25346, term25346.getClass(), "source", term25350);
        setBooleanField(term25346, term25346.getClass(), "colorize", false);
        term25351 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term25351, term25351.getClass(), "type", null);
        setField(term25351, term25351.getClass(), "description", null);
        setField(term25351, term25351.getClass(), "sourceName", null);
        setField(term25351, term25351.getClass(), "node", null);
        setIntField(term25351, term25351.getClass(), "lineNumber", 0);
        setField(term25351, term25351.getClass(), "level", null);
        setIntField(term25351, term25351.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term24866;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term24532, args);
        assertTrue(recursiveEquals(term24532, term25346));
        assertTrue(recursiveEquals(term24866, term25351));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


