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

public class LightweightMessageFormatter_formatWarning_2030513493217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187217;
     Object term187703;
     Object term188254;
     Object term188260;

    public LightweightMessageFormatter_formatWarning_2030513493217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term187345 = new HashMap();
        Class<? extends Object> term188264 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term188263 = ((Class) term188264).getDeclaredField((String) "REGION");
        ((Field) term188263).setAccessible(true);
        Object enum222 = ((Field) term188263).get((Object) null);
        term187217 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term187297 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term187297, term187297.getClass(), "inputsByName", term187345);
        setField(term187217, term187217.getClass(), "source", term187297);
        setField(term187217, term187217.getClass(), "excerpt", enum222);
        term187703 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term187703, term187703.getClass(), "sourceName", "");
        setIntField(term187703, term187703.getClass(), "lineNumber", 1);
        Class<? extends Object> term188609 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term188608 = ((Class) term188609).getDeclaredField((String) "REGION");
        ((Field) term188608).setAccessible(true);
        Object enum223 = ((Field) term188608).get((Object) null);
        HashMap term188259 = new HashMap();
        term188254 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term188258 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term188254, term188254.getClass(), "excerpt", enum223);
        setField(term188258, term188258.getClass(), "options", null);
        setField(term188258, term188258.getClass(), "passes", null);
        setField(term188258, term188258.getClass(), "externs", null);
        setField(term188258, term188258.getClass(), "modules", null);
        setField(term188258, term188258.getClass(), "moduleGraph", null);
        setField(term188258, term188258.getClass(), "inputs", null);
        setField(term188258, term188258.getClass(), "errorManager", null);
        setField(term188258, term188258.getClass(), "warningsGuard", null);
        setField(term188258, term188258.getClass(), "externsRoot", null);
        setField(term188258, term188258.getClass(), "jsRoot", null);
        setField(term188258, term188258.getClass(), "externAndJsRoot", null);
        setField(term188258, term188258.getClass(), "inputsByName", term188259);
        setField(term188258, term188258.getClass(), "sourceMap", null);
        setField(term188258, term188258.getClass(), "externExports", null);
        setIntField(term188258, term188258.getClass(), "uniqueNameId", 0);
        setBooleanField(term188258, term188258.getClass(), "useThreads", false);
        setBooleanField(term188258, term188258.getClass(), "hasRegExpGlobalReferences", false);
        setField(term188258, term188258.getClass(), "functionInformationMap", null);
        setField(term188258, term188258.getClass(), "debugLog", null);
        setField(term188258, term188258.getClass(), "defaultCodingConvention", null);
        setField(term188258, term188258.getClass(), "typeRegistry", null);
        setField(term188258, term188258.getClass(), "parserConfig", null);
        setField(term188258, term188258.getClass(), "abstractInterpreter", null);
        setField(term188258, term188258.getClass(), "typeValidator", null);
        setField(term188258, term188258.getClass(), "tracker", null);
        setField(term188258, term188258.getClass(), "oldErrorReporter", null);
        setField(term188258, term188258.getClass(), "defaultErrorReporter", null);
        setField(term188258, term188258.getClass(), "outStream", null);
        setField(term188258, term188258.getClass(), "globalRefMap", null);
        setField(term188258, term188258.getClass(), "sanityCheck", null);
        setField(term188258, term188258.getClass(), "currentTracer", null);
        setField(term188258, term188258.getClass(), "currentPassName", null);
        setField(term188258, term188258.getClass(), "recentChange", null);
        setField(term188258, term188258.getClass(), "codeChangeHandlers", null);
        setField(term188258, term188258.getClass(), "stage", null);
        setField(term188254, term188254.getClass(), "source", term188258);
        setBooleanField(term188254, term188254.getClass(), "colorize", false);
        term188260 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term188260, term188260.getClass(), "type", null);
        setField(term188260, term188260.getClass(), "description", null);
        setField(term188260, term188260.getClass(), "sourceName", "");
        setField(term188260, term188260.getClass(), "node", null);
        setIntField(term188260, term188260.getClass(), "lineNumber", 1);
        setField(term188260, term188260.getClass(), "level", null);
        setIntField(term188260, term188260.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term187703;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term187217, args);
        assertTrue(recursiveEquals(term187217, term188254));
        assertTrue(recursiveEquals(term187703, term188260));
        assertTrue(recursiveEquals(retValue, ":1: WARNING - null\n"));
    }

};


