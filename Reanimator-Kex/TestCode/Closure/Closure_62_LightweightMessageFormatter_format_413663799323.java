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

public class LightweightMessageFormatter_format_413663799323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272553;
     Object term273039;
     Object term273638;
     Object term273644;

    public LightweightMessageFormatter_format_413663799323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term272681 = new HashMap();
        Class<? extends Object> term273648 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term273647 = ((Class) term273648).getDeclaredField((String) "REGION");
        ((Field) term273647).setAccessible(true);
        Object enum327 = ((Field) term273647).get((Object) null);
        term272553 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term272633 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term272633, term272633.getClass(), "inputsByName", term272681);
        setField(term272553, term272553.getClass(), "source", term272633);
        setField(term272553, term272553.getClass(), "excerpt", enum327);
        setBooleanField(term272553, term272553.getClass(), "colorize", true);
        term273039 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term273039, term273039.getClass(), "sourceName", ": ");
        setIntField(term273039, term273039.getClass(), "lineNumber", 32);
        Class<? extends Object> term273995 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term273994 = ((Class) term273995).getDeclaredField((String) "REGION");
        ((Field) term273994).setAccessible(true);
        Object enum328 = ((Field) term273994).get((Object) null);
        HashMap term273643 = new HashMap();
        term273638 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term273642 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term273638, term273638.getClass(), "excerpt", enum328);
        setField(term273642, term273642.getClass(), "options", null);
        setField(term273642, term273642.getClass(), "passes", null);
        setField(term273642, term273642.getClass(), "externs", null);
        setField(term273642, term273642.getClass(), "modules", null);
        setField(term273642, term273642.getClass(), "moduleGraph", null);
        setField(term273642, term273642.getClass(), "inputs", null);
        setField(term273642, term273642.getClass(), "errorManager", null);
        setField(term273642, term273642.getClass(), "warningsGuard", null);
        setField(term273642, term273642.getClass(), "externsRoot", null);
        setField(term273642, term273642.getClass(), "jsRoot", null);
        setField(term273642, term273642.getClass(), "externAndJsRoot", null);
        setField(term273642, term273642.getClass(), "inputsByName", term273643);
        setField(term273642, term273642.getClass(), "sourceMap", null);
        setField(term273642, term273642.getClass(), "externExports", null);
        setIntField(term273642, term273642.getClass(), "uniqueNameId", 0);
        setBooleanField(term273642, term273642.getClass(), "useThreads", false);
        setBooleanField(term273642, term273642.getClass(), "hasRegExpGlobalReferences", false);
        setField(term273642, term273642.getClass(), "functionInformationMap", null);
        setField(term273642, term273642.getClass(), "debugLog", null);
        setField(term273642, term273642.getClass(), "defaultCodingConvention", null);
        setField(term273642, term273642.getClass(), "typeRegistry", null);
        setField(term273642, term273642.getClass(), "parserConfig", null);
        setField(term273642, term273642.getClass(), "abstractInterpreter", null);
        setField(term273642, term273642.getClass(), "typeValidator", null);
        setField(term273642, term273642.getClass(), "tracker", null);
        setField(term273642, term273642.getClass(), "oldErrorReporter", null);
        setField(term273642, term273642.getClass(), "defaultErrorReporter", null);
        setField(term273642, term273642.getClass(), "outStream", null);
        setField(term273642, term273642.getClass(), "globalRefMap", null);
        setField(term273642, term273642.getClass(), "sanityCheck", null);
        setField(term273642, term273642.getClass(), "currentTracer", null);
        setField(term273642, term273642.getClass(), "currentPassName", null);
        setField(term273642, term273642.getClass(), "recentChange", null);
        setField(term273642, term273642.getClass(), "codeChangeHandlers", null);
        setField(term273642, term273642.getClass(), "stage", null);
        setField(term273638, term273638.getClass(), "source", term273642);
        setBooleanField(term273638, term273638.getClass(), "colorize", true);
        term273644 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term273644, term273644.getClass(), "type", null);
        setField(term273644, term273644.getClass(), "description", null);
        setField(term273644, term273644.getClass(), "sourceName", ": ");
        setField(term273644, term273644.getClass(), "node", null);
        setIntField(term273644, term273644.getClass(), "lineNumber", 32);
        setField(term273644, term273644.getClass(), "level", null);
        setIntField(term273644, term273644.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term273039;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term272553, args);
        assertTrue(recursiveEquals(term272553, term273638));
        assertTrue(recursiveEquals(term273039, term273644));
        assertTrue(recursiveEquals(retValue, ": :32: \u001B[35mWARNING\u001B[39m - null\n"));
    }

};


