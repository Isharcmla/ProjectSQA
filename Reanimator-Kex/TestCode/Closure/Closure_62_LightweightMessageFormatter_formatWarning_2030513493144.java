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

public class LightweightMessageFormatter_formatWarning_2030513493144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104998;
     Object term105332;
     Object term107683;
     Object term107688;

    public LightweightMessageFormatter_formatWarning_2030513493144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term107690 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term107689 = ((Class) term107690).getDeclaredField((String) "REGION");
        ((Field) term107689).setAccessible(true);
        Object enum121 = ((Field) term107689).get((Object) null);
        term104998 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term105078 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term104998, term104998.getClass(), "source", term105078);
        setField(term104998, term104998.getClass(), "excerpt", enum121);
        term105332 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term105332, term105332.getClass(), "sourceName", null);
        setIntField(term105332, term105332.getClass(), "lineNumber", 0);
        Class<? extends Object> term108035 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term108034 = ((Class) term108035).getDeclaredField((String) "REGION");
        ((Field) term108034).setAccessible(true);
        Object enum122 = ((Field) term108034).get((Object) null);
        term107683 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term107687 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term107683, term107683.getClass(), "excerpt", enum122);
        setField(term107687, term107687.getClass(), "options", null);
        setField(term107687, term107687.getClass(), "passes", null);
        setField(term107687, term107687.getClass(), "externs", null);
        setField(term107687, term107687.getClass(), "modules", null);
        setField(term107687, term107687.getClass(), "moduleGraph", null);
        setField(term107687, term107687.getClass(), "inputs", null);
        setField(term107687, term107687.getClass(), "errorManager", null);
        setField(term107687, term107687.getClass(), "warningsGuard", null);
        setField(term107687, term107687.getClass(), "externsRoot", null);
        setField(term107687, term107687.getClass(), "jsRoot", null);
        setField(term107687, term107687.getClass(), "externAndJsRoot", null);
        setField(term107687, term107687.getClass(), "inputsByName", null);
        setField(term107687, term107687.getClass(), "sourceMap", null);
        setField(term107687, term107687.getClass(), "externExports", null);
        setIntField(term107687, term107687.getClass(), "uniqueNameId", 0);
        setBooleanField(term107687, term107687.getClass(), "useThreads", false);
        setBooleanField(term107687, term107687.getClass(), "hasRegExpGlobalReferences", false);
        setField(term107687, term107687.getClass(), "functionInformationMap", null);
        setField(term107687, term107687.getClass(), "debugLog", null);
        setField(term107687, term107687.getClass(), "defaultCodingConvention", null);
        setField(term107687, term107687.getClass(), "typeRegistry", null);
        setField(term107687, term107687.getClass(), "parserConfig", null);
        setField(term107687, term107687.getClass(), "abstractInterpreter", null);
        setField(term107687, term107687.getClass(), "typeValidator", null);
        setField(term107687, term107687.getClass(), "tracker", null);
        setField(term107687, term107687.getClass(), "oldErrorReporter", null);
        setField(term107687, term107687.getClass(), "defaultErrorReporter", null);
        setField(term107687, term107687.getClass(), "outStream", null);
        setField(term107687, term107687.getClass(), "globalRefMap", null);
        setField(term107687, term107687.getClass(), "sanityCheck", null);
        setField(term107687, term107687.getClass(), "currentTracer", null);
        setField(term107687, term107687.getClass(), "currentPassName", null);
        setField(term107687, term107687.getClass(), "recentChange", null);
        setField(term107687, term107687.getClass(), "codeChangeHandlers", null);
        setField(term107687, term107687.getClass(), "stage", null);
        setField(term107683, term107683.getClass(), "source", term107687);
        setBooleanField(term107683, term107683.getClass(), "colorize", false);
        term107688 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term107688, term107688.getClass(), "type", null);
        setField(term107688, term107688.getClass(), "description", null);
        setField(term107688, term107688.getClass(), "sourceName", null);
        setField(term107688, term107688.getClass(), "node", null);
        setIntField(term107688, term107688.getClass(), "lineNumber", 0);
        setField(term107688, term107688.getClass(), "level", null);
        setIntField(term107688, term107688.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term105332;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term104998, args);
        assertTrue(recursiveEquals(term104998, term107683));
        assertTrue(recursiveEquals(term105332, term107688));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


