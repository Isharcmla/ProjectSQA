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

public class LightweightMessageFormatter_formatWarning_2030513493339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287418;
     Object term287904;
     Object term288455;
     Object term288461;

    public LightweightMessageFormatter_formatWarning_2030513493339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term287546 = new HashMap();
        Class<? extends Object> term288465 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term288464 = ((Class) term288465).getDeclaredField((String) "REGION");
        ((Field) term288464).setAccessible(true);
        Object enum342 = ((Field) term288464).get((Object) null);
        term287418 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term287498 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term287498, term287498.getClass(), "inputsByName", term287546);
        setField(term287418, term287418.getClass(), "source", term287498);
        setField(term287418, term287418.getClass(), "excerpt", enum342);
        term287904 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term287904, term287904.getClass(), "sourceName", "");
        setIntField(term287904, term287904.getClass(), "lineNumber", 1);
        Class<? extends Object> term288810 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term288809 = ((Class) term288810).getDeclaredField((String) "REGION");
        ((Field) term288809).setAccessible(true);
        Object enum343 = ((Field) term288809).get((Object) null);
        HashMap term288460 = new HashMap();
        term288455 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term288459 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term288455, term288455.getClass(), "excerpt", enum343);
        setField(term288459, term288459.getClass(), "options", null);
        setField(term288459, term288459.getClass(), "passes", null);
        setField(term288459, term288459.getClass(), "externs", null);
        setField(term288459, term288459.getClass(), "modules", null);
        setField(term288459, term288459.getClass(), "moduleGraph", null);
        setField(term288459, term288459.getClass(), "inputs", null);
        setField(term288459, term288459.getClass(), "errorManager", null);
        setField(term288459, term288459.getClass(), "warningsGuard", null);
        setField(term288459, term288459.getClass(), "externsRoot", null);
        setField(term288459, term288459.getClass(), "jsRoot", null);
        setField(term288459, term288459.getClass(), "externAndJsRoot", null);
        setField(term288459, term288459.getClass(), "inputsByName", term288460);
        setField(term288459, term288459.getClass(), "sourceMap", null);
        setField(term288459, term288459.getClass(), "externExports", null);
        setIntField(term288459, term288459.getClass(), "uniqueNameId", 0);
        setBooleanField(term288459, term288459.getClass(), "useThreads", false);
        setBooleanField(term288459, term288459.getClass(), "hasRegExpGlobalReferences", false);
        setField(term288459, term288459.getClass(), "functionInformationMap", null);
        setField(term288459, term288459.getClass(), "debugLog", null);
        setField(term288459, term288459.getClass(), "defaultCodingConvention", null);
        setField(term288459, term288459.getClass(), "typeRegistry", null);
        setField(term288459, term288459.getClass(), "parserConfig", null);
        setField(term288459, term288459.getClass(), "abstractInterpreter", null);
        setField(term288459, term288459.getClass(), "typeValidator", null);
        setField(term288459, term288459.getClass(), "tracker", null);
        setField(term288459, term288459.getClass(), "oldErrorReporter", null);
        setField(term288459, term288459.getClass(), "defaultErrorReporter", null);
        setField(term288459, term288459.getClass(), "outStream", null);
        setField(term288459, term288459.getClass(), "globalRefMap", null);
        setField(term288459, term288459.getClass(), "sanityCheck", null);
        setField(term288459, term288459.getClass(), "currentTracer", null);
        setField(term288459, term288459.getClass(), "currentPassName", null);
        setField(term288459, term288459.getClass(), "recentChange", null);
        setField(term288459, term288459.getClass(), "codeChangeHandlers", null);
        setField(term288459, term288459.getClass(), "stage", null);
        setField(term288455, term288455.getClass(), "source", term288459);
        setBooleanField(term288455, term288455.getClass(), "colorize", false);
        term288461 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term288461, term288461.getClass(), "type", null);
        setField(term288461, term288461.getClass(), "description", null);
        setField(term288461, term288461.getClass(), "sourceName", "");
        setField(term288461, term288461.getClass(), "node", null);
        setIntField(term288461, term288461.getClass(), "lineNumber", 1);
        setField(term288461, term288461.getClass(), "level", null);
        setIntField(term288461, term288461.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term287904;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term287418, args);
        assertTrue(recursiveEquals(term287418, term288455));
        assertTrue(recursiveEquals(term287904, term288461));
        assertTrue(recursiveEquals(retValue, ":1: WARNING - null\n"));
    }

};


