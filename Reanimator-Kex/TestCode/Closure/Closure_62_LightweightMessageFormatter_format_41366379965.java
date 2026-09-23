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

public class LightweightMessageFormatter_format_41366379965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38091;
     Object term38425;
     Object term39018;
     Object term39023;

    public LightweightMessageFormatter_format_41366379965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39025 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term39024 = ((Class) term39025).getDeclaredField((String) "REGION");
        ((Field) term39024).setAccessible(true);
        Object enum51 = ((Field) term39024).get((Object) null);
        term38091 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term38171 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term38091, term38091.getClass(), "source", term38171);
        setField(term38091, term38091.getClass(), "excerpt", enum51);
        term38425 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term38425, term38425.getClass(), "sourceName", null);
        setIntField(term38425, term38425.getClass(), "lineNumber", 0);
        Class<? extends Object> term39370 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term39369 = ((Class) term39370).getDeclaredField((String) "REGION");
        ((Field) term39369).setAccessible(true);
        Object enum52 = ((Field) term39369).get((Object) null);
        term39018 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term39022 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term39018, term39018.getClass(), "excerpt", enum52);
        setField(term39022, term39022.getClass(), "options", null);
        setField(term39022, term39022.getClass(), "passes", null);
        setField(term39022, term39022.getClass(), "externs", null);
        setField(term39022, term39022.getClass(), "modules", null);
        setField(term39022, term39022.getClass(), "moduleGraph", null);
        setField(term39022, term39022.getClass(), "inputs", null);
        setField(term39022, term39022.getClass(), "errorManager", null);
        setField(term39022, term39022.getClass(), "warningsGuard", null);
        setField(term39022, term39022.getClass(), "externsRoot", null);
        setField(term39022, term39022.getClass(), "jsRoot", null);
        setField(term39022, term39022.getClass(), "externAndJsRoot", null);
        setField(term39022, term39022.getClass(), "inputsByName", null);
        setField(term39022, term39022.getClass(), "sourceMap", null);
        setField(term39022, term39022.getClass(), "externExports", null);
        setIntField(term39022, term39022.getClass(), "uniqueNameId", 0);
        setBooleanField(term39022, term39022.getClass(), "useThreads", false);
        setBooleanField(term39022, term39022.getClass(), "hasRegExpGlobalReferences", false);
        setField(term39022, term39022.getClass(), "functionInformationMap", null);
        setField(term39022, term39022.getClass(), "debugLog", null);
        setField(term39022, term39022.getClass(), "defaultCodingConvention", null);
        setField(term39022, term39022.getClass(), "typeRegistry", null);
        setField(term39022, term39022.getClass(), "parserConfig", null);
        setField(term39022, term39022.getClass(), "abstractInterpreter", null);
        setField(term39022, term39022.getClass(), "typeValidator", null);
        setField(term39022, term39022.getClass(), "tracker", null);
        setField(term39022, term39022.getClass(), "oldErrorReporter", null);
        setField(term39022, term39022.getClass(), "defaultErrorReporter", null);
        setField(term39022, term39022.getClass(), "outStream", null);
        setField(term39022, term39022.getClass(), "globalRefMap", null);
        setField(term39022, term39022.getClass(), "sanityCheck", null);
        setField(term39022, term39022.getClass(), "currentTracer", null);
        setField(term39022, term39022.getClass(), "currentPassName", null);
        setField(term39022, term39022.getClass(), "recentChange", null);
        setField(term39022, term39022.getClass(), "codeChangeHandlers", null);
        setField(term39022, term39022.getClass(), "stage", null);
        setField(term39018, term39018.getClass(), "source", term39022);
        setBooleanField(term39018, term39018.getClass(), "colorize", false);
        term39023 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term39023, term39023.getClass(), "type", null);
        setField(term39023, term39023.getClass(), "description", null);
        setField(term39023, term39023.getClass(), "sourceName", null);
        setField(term39023, term39023.getClass(), "node", null);
        setIntField(term39023, term39023.getClass(), "lineNumber", 0);
        setField(term39023, term39023.getClass(), "level", null);
        setIntField(term39023, term39023.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term38425;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term38091, args);
        assertTrue(recursiveEquals(term38091, term39018));
        assertTrue(recursiveEquals(term38425, term39023));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


