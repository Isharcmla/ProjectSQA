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

public class LightweightMessageFormatter_formatWarning_2030513493351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term298737;
     Object term299223;
     Object term299723;
     Object term299729;

    public LightweightMessageFormatter_formatWarning_2030513493351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term298865 = new HashMap();
        Class<? extends Object> term299731 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term299730 = ((Class) term299731).getDeclaredField((String) "REGION");
        ((Field) term299730).setAccessible(true);
        Object enum357 = ((Field) term299730).get((Object) null);
        term298737 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term298817 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term298817, term298817.getClass(), "inputsByName", term298865);
        setField(term298737, term298737.getClass(), "source", term298817);
        setField(term298737, term298737.getClass(), "excerpt", enum357);
        term299223 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term299223, term299223.getClass(), "sourceName", null);
        setIntField(term299223, term299223.getClass(), "lineNumber", 1);
        Class<? extends Object> term300076 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term300075 = ((Class) term300076).getDeclaredField((String) "REGION");
        ((Field) term300075).setAccessible(true);
        Object enum358 = ((Field) term300075).get((Object) null);
        HashMap term299728 = new HashMap();
        term299723 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term299727 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term299723, term299723.getClass(), "excerpt", enum358);
        setField(term299727, term299727.getClass(), "options", null);
        setField(term299727, term299727.getClass(), "passes", null);
        setField(term299727, term299727.getClass(), "externs", null);
        setField(term299727, term299727.getClass(), "modules", null);
        setField(term299727, term299727.getClass(), "moduleGraph", null);
        setField(term299727, term299727.getClass(), "inputs", null);
        setField(term299727, term299727.getClass(), "errorManager", null);
        setField(term299727, term299727.getClass(), "warningsGuard", null);
        setField(term299727, term299727.getClass(), "externsRoot", null);
        setField(term299727, term299727.getClass(), "jsRoot", null);
        setField(term299727, term299727.getClass(), "externAndJsRoot", null);
        setField(term299727, term299727.getClass(), "inputsByName", term299728);
        setField(term299727, term299727.getClass(), "sourceMap", null);
        setField(term299727, term299727.getClass(), "externExports", null);
        setIntField(term299727, term299727.getClass(), "uniqueNameId", 0);
        setBooleanField(term299727, term299727.getClass(), "useThreads", false);
        setBooleanField(term299727, term299727.getClass(), "hasRegExpGlobalReferences", false);
        setField(term299727, term299727.getClass(), "functionInformationMap", null);
        setField(term299727, term299727.getClass(), "debugLog", null);
        setField(term299727, term299727.getClass(), "defaultCodingConvention", null);
        setField(term299727, term299727.getClass(), "typeRegistry", null);
        setField(term299727, term299727.getClass(), "parserConfig", null);
        setField(term299727, term299727.getClass(), "abstractInterpreter", null);
        setField(term299727, term299727.getClass(), "typeValidator", null);
        setField(term299727, term299727.getClass(), "tracker", null);
        setField(term299727, term299727.getClass(), "oldErrorReporter", null);
        setField(term299727, term299727.getClass(), "defaultErrorReporter", null);
        setField(term299727, term299727.getClass(), "outStream", null);
        setField(term299727, term299727.getClass(), "globalRefMap", null);
        setField(term299727, term299727.getClass(), "sanityCheck", null);
        setField(term299727, term299727.getClass(), "currentTracer", null);
        setField(term299727, term299727.getClass(), "currentPassName", null);
        setField(term299727, term299727.getClass(), "recentChange", null);
        setField(term299727, term299727.getClass(), "codeChangeHandlers", null);
        setField(term299727, term299727.getClass(), "stage", null);
        setField(term299723, term299723.getClass(), "source", term299727);
        setBooleanField(term299723, term299723.getClass(), "colorize", false);
        term299729 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term299729, term299729.getClass(), "type", null);
        setField(term299729, term299729.getClass(), "description", null);
        setField(term299729, term299729.getClass(), "sourceName", null);
        setField(term299729, term299729.getClass(), "node", null);
        setIntField(term299729, term299729.getClass(), "lineNumber", 1);
        setField(term299729, term299729.getClass(), "level", null);
        setIntField(term299729, term299729.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term299223;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term298737, args);
        assertTrue(recursiveEquals(term298737, term299723));
        assertTrue(recursiveEquals(term299223, term299729));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


