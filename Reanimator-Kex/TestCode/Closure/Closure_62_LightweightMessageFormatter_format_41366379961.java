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

public class LightweightMessageFormatter_format_41366379961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34646;
     Object term34980;
     Object term36282;
     Object term36287;

    public LightweightMessageFormatter_format_41366379961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36289 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term36288 = ((Class) term36289).getDeclaredField((String) "REGION");
        ((Field) term36288).setAccessible(true);
        Object enum48 = ((Field) term36288).get((Object) null);
        term34646 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term34726 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term34646, term34646.getClass(), "source", term34726);
        setField(term34646, term34646.getClass(), "excerpt", enum48);
        term34980 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term34980, term34980.getClass(), "sourceName", null);
        setIntField(term34980, term34980.getClass(), "lineNumber", 0);
        Class<? extends Object> term36634 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term36633 = ((Class) term36634).getDeclaredField((String) "REGION");
        ((Field) term36633).setAccessible(true);
        Object enum49 = ((Field) term36633).get((Object) null);
        term36282 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term36286 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term36282, term36282.getClass(), "excerpt", enum49);
        setField(term36286, term36286.getClass(), "options", null);
        setField(term36286, term36286.getClass(), "passes", null);
        setField(term36286, term36286.getClass(), "externs", null);
        setField(term36286, term36286.getClass(), "modules", null);
        setField(term36286, term36286.getClass(), "moduleGraph", null);
        setField(term36286, term36286.getClass(), "inputs", null);
        setField(term36286, term36286.getClass(), "errorManager", null);
        setField(term36286, term36286.getClass(), "warningsGuard", null);
        setField(term36286, term36286.getClass(), "externsRoot", null);
        setField(term36286, term36286.getClass(), "jsRoot", null);
        setField(term36286, term36286.getClass(), "externAndJsRoot", null);
        setField(term36286, term36286.getClass(), "inputsByName", null);
        setField(term36286, term36286.getClass(), "sourceMap", null);
        setField(term36286, term36286.getClass(), "externExports", null);
        setIntField(term36286, term36286.getClass(), "uniqueNameId", 0);
        setBooleanField(term36286, term36286.getClass(), "useThreads", false);
        setBooleanField(term36286, term36286.getClass(), "hasRegExpGlobalReferences", false);
        setField(term36286, term36286.getClass(), "functionInformationMap", null);
        setField(term36286, term36286.getClass(), "debugLog", null);
        setField(term36286, term36286.getClass(), "defaultCodingConvention", null);
        setField(term36286, term36286.getClass(), "typeRegistry", null);
        setField(term36286, term36286.getClass(), "parserConfig", null);
        setField(term36286, term36286.getClass(), "abstractInterpreter", null);
        setField(term36286, term36286.getClass(), "typeValidator", null);
        setField(term36286, term36286.getClass(), "tracker", null);
        setField(term36286, term36286.getClass(), "oldErrorReporter", null);
        setField(term36286, term36286.getClass(), "defaultErrorReporter", null);
        setField(term36286, term36286.getClass(), "outStream", null);
        setField(term36286, term36286.getClass(), "globalRefMap", null);
        setField(term36286, term36286.getClass(), "sanityCheck", null);
        setField(term36286, term36286.getClass(), "currentTracer", null);
        setField(term36286, term36286.getClass(), "currentPassName", null);
        setField(term36286, term36286.getClass(), "recentChange", null);
        setField(term36286, term36286.getClass(), "codeChangeHandlers", null);
        setField(term36286, term36286.getClass(), "stage", null);
        setField(term36282, term36282.getClass(), "source", term36286);
        setBooleanField(term36282, term36282.getClass(), "colorize", false);
        term36287 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term36287, term36287.getClass(), "type", null);
        setField(term36287, term36287.getClass(), "description", null);
        setField(term36287, term36287.getClass(), "sourceName", null);
        setField(term36287, term36287.getClass(), "node", null);
        setIntField(term36287, term36287.getClass(), "lineNumber", 0);
        setField(term36287, term36287.getClass(), "level", null);
        setIntField(term36287, term36287.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term34980;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term34646, args);
        assertTrue(recursiveEquals(term34646, term36282));
        assertTrue(recursiveEquals(term34980, term36287));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


