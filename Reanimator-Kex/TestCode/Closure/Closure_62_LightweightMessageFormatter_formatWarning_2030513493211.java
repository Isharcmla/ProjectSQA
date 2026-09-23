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

public class LightweightMessageFormatter_formatWarning_2030513493211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179662;
     Object term180148;
     Object term181520;
     Object term181526;

    public LightweightMessageFormatter_formatWarning_2030513493211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term179790 = new HashMap();
        Class<? extends Object> term181528 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term181527 = ((Class) term181528).getDeclaredField((String) "REGION");
        ((Field) term181527).setAccessible(true);
        Object enum213 = ((Field) term181527).get((Object) null);
        term179662 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term179742 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term179742, term179742.getClass(), "inputsByName", term179790);
        setField(term179662, term179662.getClass(), "source", term179742);
        setField(term179662, term179662.getClass(), "excerpt", enum213);
        term180148 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term180148, term180148.getClass(), "sourceName", null);
        setIntField(term180148, term180148.getClass(), "lineNumber", 1);
        Class<? extends Object> term181873 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term181872 = ((Class) term181873).getDeclaredField((String) "REGION");
        ((Field) term181872).setAccessible(true);
        Object enum214 = ((Field) term181872).get((Object) null);
        HashMap term181525 = new HashMap();
        term181520 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term181524 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term181520, term181520.getClass(), "excerpt", enum214);
        setField(term181524, term181524.getClass(), "options", null);
        setField(term181524, term181524.getClass(), "passes", null);
        setField(term181524, term181524.getClass(), "externs", null);
        setField(term181524, term181524.getClass(), "modules", null);
        setField(term181524, term181524.getClass(), "moduleGraph", null);
        setField(term181524, term181524.getClass(), "inputs", null);
        setField(term181524, term181524.getClass(), "errorManager", null);
        setField(term181524, term181524.getClass(), "warningsGuard", null);
        setField(term181524, term181524.getClass(), "externsRoot", null);
        setField(term181524, term181524.getClass(), "jsRoot", null);
        setField(term181524, term181524.getClass(), "externAndJsRoot", null);
        setField(term181524, term181524.getClass(), "inputsByName", term181525);
        setField(term181524, term181524.getClass(), "sourceMap", null);
        setField(term181524, term181524.getClass(), "externExports", null);
        setIntField(term181524, term181524.getClass(), "uniqueNameId", 0);
        setBooleanField(term181524, term181524.getClass(), "useThreads", false);
        setBooleanField(term181524, term181524.getClass(), "hasRegExpGlobalReferences", false);
        setField(term181524, term181524.getClass(), "functionInformationMap", null);
        setField(term181524, term181524.getClass(), "debugLog", null);
        setField(term181524, term181524.getClass(), "defaultCodingConvention", null);
        setField(term181524, term181524.getClass(), "typeRegistry", null);
        setField(term181524, term181524.getClass(), "parserConfig", null);
        setField(term181524, term181524.getClass(), "abstractInterpreter", null);
        setField(term181524, term181524.getClass(), "typeValidator", null);
        setField(term181524, term181524.getClass(), "tracker", null);
        setField(term181524, term181524.getClass(), "oldErrorReporter", null);
        setField(term181524, term181524.getClass(), "defaultErrorReporter", null);
        setField(term181524, term181524.getClass(), "outStream", null);
        setField(term181524, term181524.getClass(), "globalRefMap", null);
        setField(term181524, term181524.getClass(), "sanityCheck", null);
        setField(term181524, term181524.getClass(), "currentTracer", null);
        setField(term181524, term181524.getClass(), "currentPassName", null);
        setField(term181524, term181524.getClass(), "recentChange", null);
        setField(term181524, term181524.getClass(), "codeChangeHandlers", null);
        setField(term181524, term181524.getClass(), "stage", null);
        setField(term181520, term181520.getClass(), "source", term181524);
        setBooleanField(term181520, term181520.getClass(), "colorize", false);
        term181526 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term181526, term181526.getClass(), "type", null);
        setField(term181526, term181526.getClass(), "description", null);
        setField(term181526, term181526.getClass(), "sourceName", null);
        setField(term181526, term181526.getClass(), "node", null);
        setIntField(term181526, term181526.getClass(), "lineNumber", 1);
        setField(term181526, term181526.getClass(), "level", null);
        setIntField(term181526, term181526.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term180148;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term179662, args);
        assertTrue(recursiveEquals(term179662, term181520));
        assertTrue(recursiveEquals(term180148, term181526));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


