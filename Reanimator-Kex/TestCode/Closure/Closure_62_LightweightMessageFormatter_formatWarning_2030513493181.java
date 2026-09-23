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

public class LightweightMessageFormatter_formatWarning_2030513493181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148156;
     Object term148538;
     Object term149042;
     Object term149048;

    public LightweightMessageFormatter_formatWarning_2030513493181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term148284 = new HashMap();
        Class<? extends Object> term149050 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term149049 = ((Class) term149050).getDeclaredField((String) "REGION");
        ((Field) term149049).setAccessible(true);
        Object enum168 = ((Field) term149049).get((Object) null);
        term148156 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term148236 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term148236, term148236.getClass(), "inputsByName", term148284);
        setField(term148156, term148156.getClass(), "source", term148236);
        setField(term148156, term148156.getClass(), "excerpt", enum168);
        term148538 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term148538, term148538.getClass(), "sourceName", null);
        setIntField(term148538, term148538.getClass(), "lineNumber", 1);
        Class<? extends Object> term149395 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term149394 = ((Class) term149395).getDeclaredField((String) "REGION");
        ((Field) term149394).setAccessible(true);
        Object enum169 = ((Field) term149394).get((Object) null);
        HashMap term149047 = new HashMap();
        term149042 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term149046 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term149042, term149042.getClass(), "excerpt", enum169);
        setField(term149046, term149046.getClass(), "options", null);
        setField(term149046, term149046.getClass(), "passes", null);
        setField(term149046, term149046.getClass(), "externs", null);
        setField(term149046, term149046.getClass(), "modules", null);
        setField(term149046, term149046.getClass(), "moduleGraph", null);
        setField(term149046, term149046.getClass(), "inputs", null);
        setField(term149046, term149046.getClass(), "errorManager", null);
        setField(term149046, term149046.getClass(), "warningsGuard", null);
        setField(term149046, term149046.getClass(), "externsRoot", null);
        setField(term149046, term149046.getClass(), "jsRoot", null);
        setField(term149046, term149046.getClass(), "externAndJsRoot", null);
        setField(term149046, term149046.getClass(), "inputsByName", term149047);
        setField(term149046, term149046.getClass(), "sourceMap", null);
        setField(term149046, term149046.getClass(), "externExports", null);
        setIntField(term149046, term149046.getClass(), "uniqueNameId", 0);
        setBooleanField(term149046, term149046.getClass(), "useThreads", false);
        setBooleanField(term149046, term149046.getClass(), "hasRegExpGlobalReferences", false);
        setField(term149046, term149046.getClass(), "functionInformationMap", null);
        setField(term149046, term149046.getClass(), "debugLog", null);
        setField(term149046, term149046.getClass(), "defaultCodingConvention", null);
        setField(term149046, term149046.getClass(), "typeRegistry", null);
        setField(term149046, term149046.getClass(), "parserConfig", null);
        setField(term149046, term149046.getClass(), "abstractInterpreter", null);
        setField(term149046, term149046.getClass(), "typeValidator", null);
        setField(term149046, term149046.getClass(), "tracker", null);
        setField(term149046, term149046.getClass(), "oldErrorReporter", null);
        setField(term149046, term149046.getClass(), "defaultErrorReporter", null);
        setField(term149046, term149046.getClass(), "outStream", null);
        setField(term149046, term149046.getClass(), "globalRefMap", null);
        setField(term149046, term149046.getClass(), "sanityCheck", null);
        setField(term149046, term149046.getClass(), "currentTracer", null);
        setField(term149046, term149046.getClass(), "currentPassName", null);
        setField(term149046, term149046.getClass(), "recentChange", null);
        setField(term149046, term149046.getClass(), "codeChangeHandlers", null);
        setField(term149046, term149046.getClass(), "stage", null);
        setField(term149042, term149042.getClass(), "source", term149046);
        setBooleanField(term149042, term149042.getClass(), "colorize", false);
        term149048 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term149048, term149048.getClass(), "type", null);
        setField(term149048, term149048.getClass(), "description", null);
        setField(term149048, term149048.getClass(), "sourceName", null);
        setField(term149048, term149048.getClass(), "node", null);
        setIntField(term149048, term149048.getClass(), "lineNumber", 1);
        setField(term149048, term149048.getClass(), "level", null);
        setIntField(term149048, term149048.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term148538;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term148156, args);
        assertTrue(recursiveEquals(term148156, term149042));
        assertTrue(recursiveEquals(term148538, term149048));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


