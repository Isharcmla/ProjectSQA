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

public class LightweightMessageFormatter_formatWarning_2030513493269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234456;
     Object term234790;
     Object term235531;
     Object term235536;

    public LightweightMessageFormatter_formatWarning_2030513493269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term235538 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term235537 = ((Class) term235538).getDeclaredField((String) "REGION");
        ((Field) term235537).setAccessible(true);
        Object enum282 = ((Field) term235537).get((Object) null);
        term234456 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term234536 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term234456, term234456.getClass(), "source", term234536);
        setField(term234456, term234456.getClass(), "excerpt", enum282);
        term234790 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term234790, term234790.getClass(), "sourceName", null);
        setIntField(term234790, term234790.getClass(), "lineNumber", 0);
        Class<? extends Object> term235883 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term235882 = ((Class) term235883).getDeclaredField((String) "REGION");
        ((Field) term235882).setAccessible(true);
        Object enum283 = ((Field) term235882).get((Object) null);
        term235531 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term235535 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term235531, term235531.getClass(), "excerpt", enum283);
        setField(term235535, term235535.getClass(), "options", null);
        setField(term235535, term235535.getClass(), "passes", null);
        setField(term235535, term235535.getClass(), "externs", null);
        setField(term235535, term235535.getClass(), "modules", null);
        setField(term235535, term235535.getClass(), "moduleGraph", null);
        setField(term235535, term235535.getClass(), "inputs", null);
        setField(term235535, term235535.getClass(), "errorManager", null);
        setField(term235535, term235535.getClass(), "warningsGuard", null);
        setField(term235535, term235535.getClass(), "externsRoot", null);
        setField(term235535, term235535.getClass(), "jsRoot", null);
        setField(term235535, term235535.getClass(), "externAndJsRoot", null);
        setField(term235535, term235535.getClass(), "inputsByName", null);
        setField(term235535, term235535.getClass(), "sourceMap", null);
        setField(term235535, term235535.getClass(), "externExports", null);
        setIntField(term235535, term235535.getClass(), "uniqueNameId", 0);
        setBooleanField(term235535, term235535.getClass(), "useThreads", false);
        setBooleanField(term235535, term235535.getClass(), "hasRegExpGlobalReferences", false);
        setField(term235535, term235535.getClass(), "functionInformationMap", null);
        setField(term235535, term235535.getClass(), "debugLog", null);
        setField(term235535, term235535.getClass(), "defaultCodingConvention", null);
        setField(term235535, term235535.getClass(), "typeRegistry", null);
        setField(term235535, term235535.getClass(), "parserConfig", null);
        setField(term235535, term235535.getClass(), "abstractInterpreter", null);
        setField(term235535, term235535.getClass(), "typeValidator", null);
        setField(term235535, term235535.getClass(), "tracker", null);
        setField(term235535, term235535.getClass(), "oldErrorReporter", null);
        setField(term235535, term235535.getClass(), "defaultErrorReporter", null);
        setField(term235535, term235535.getClass(), "outStream", null);
        setField(term235535, term235535.getClass(), "globalRefMap", null);
        setField(term235535, term235535.getClass(), "sanityCheck", null);
        setField(term235535, term235535.getClass(), "currentTracer", null);
        setField(term235535, term235535.getClass(), "currentPassName", null);
        setField(term235535, term235535.getClass(), "recentChange", null);
        setField(term235535, term235535.getClass(), "codeChangeHandlers", null);
        setField(term235535, term235535.getClass(), "stage", null);
        setField(term235531, term235531.getClass(), "source", term235535);
        setBooleanField(term235531, term235531.getClass(), "colorize", false);
        term235536 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term235536, term235536.getClass(), "type", null);
        setField(term235536, term235536.getClass(), "description", null);
        setField(term235536, term235536.getClass(), "sourceName", null);
        setField(term235536, term235536.getClass(), "node", null);
        setIntField(term235536, term235536.getClass(), "lineNumber", 0);
        setField(term235536, term235536.getClass(), "level", null);
        setIntField(term235536, term235536.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term234790;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term234456, args);
        assertTrue(recursiveEquals(term234456, term235531));
        assertTrue(recursiveEquals(term234790, term235536));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


