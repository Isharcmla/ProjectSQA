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

public class LightweightMessageFormatter_formatWarning_2030513493157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122950;
     Object term123284;
     Object term123767;
     Object term123772;

    public LightweightMessageFormatter_formatWarning_2030513493157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term123774 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term123773 = ((Class) term123774).getDeclaredField((String) "REGION");
        ((Field) term123773).setAccessible(true);
        Object enum138 = ((Field) term123773).get((Object) null);
        term122950 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term123030 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term122950, term122950.getClass(), "source", term123030);
        setField(term122950, term122950.getClass(), "excerpt", enum138);
        setBooleanField(term122950, term122950.getClass(), "colorize", false);
        term123284 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term123284, term123284.getClass(), "sourceName", null);
        setIntField(term123284, term123284.getClass(), "lineNumber", 0);
        Class<? extends Object> term124119 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term124118 = ((Class) term124119).getDeclaredField((String) "REGION");
        ((Field) term124118).setAccessible(true);
        Object enum139 = ((Field) term124118).get((Object) null);
        term123767 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term123771 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term123767, term123767.getClass(), "excerpt", enum139);
        setField(term123771, term123771.getClass(), "options", null);
        setField(term123771, term123771.getClass(), "passes", null);
        setField(term123771, term123771.getClass(), "externs", null);
        setField(term123771, term123771.getClass(), "modules", null);
        setField(term123771, term123771.getClass(), "moduleGraph", null);
        setField(term123771, term123771.getClass(), "inputs", null);
        setField(term123771, term123771.getClass(), "errorManager", null);
        setField(term123771, term123771.getClass(), "warningsGuard", null);
        setField(term123771, term123771.getClass(), "externsRoot", null);
        setField(term123771, term123771.getClass(), "jsRoot", null);
        setField(term123771, term123771.getClass(), "externAndJsRoot", null);
        setField(term123771, term123771.getClass(), "inputsByName", null);
        setField(term123771, term123771.getClass(), "sourceMap", null);
        setField(term123771, term123771.getClass(), "externExports", null);
        setIntField(term123771, term123771.getClass(), "uniqueNameId", 0);
        setBooleanField(term123771, term123771.getClass(), "useThreads", false);
        setBooleanField(term123771, term123771.getClass(), "hasRegExpGlobalReferences", false);
        setField(term123771, term123771.getClass(), "functionInformationMap", null);
        setField(term123771, term123771.getClass(), "debugLog", null);
        setField(term123771, term123771.getClass(), "defaultCodingConvention", null);
        setField(term123771, term123771.getClass(), "typeRegistry", null);
        setField(term123771, term123771.getClass(), "parserConfig", null);
        setField(term123771, term123771.getClass(), "abstractInterpreter", null);
        setField(term123771, term123771.getClass(), "typeValidator", null);
        setField(term123771, term123771.getClass(), "tracker", null);
        setField(term123771, term123771.getClass(), "oldErrorReporter", null);
        setField(term123771, term123771.getClass(), "defaultErrorReporter", null);
        setField(term123771, term123771.getClass(), "outStream", null);
        setField(term123771, term123771.getClass(), "globalRefMap", null);
        setField(term123771, term123771.getClass(), "sanityCheck", null);
        setField(term123771, term123771.getClass(), "currentTracer", null);
        setField(term123771, term123771.getClass(), "currentPassName", null);
        setField(term123771, term123771.getClass(), "recentChange", null);
        setField(term123771, term123771.getClass(), "codeChangeHandlers", null);
        setField(term123771, term123771.getClass(), "stage", null);
        setField(term123767, term123767.getClass(), "source", term123771);
        setBooleanField(term123767, term123767.getClass(), "colorize", false);
        term123772 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term123772, term123772.getClass(), "type", null);
        setField(term123772, term123772.getClass(), "description", null);
        setField(term123772, term123772.getClass(), "sourceName", null);
        setField(term123772, term123772.getClass(), "node", null);
        setIntField(term123772, term123772.getClass(), "lineNumber", 0);
        setField(term123772, term123772.getClass(), "level", null);
        setIntField(term123772, term123772.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term123284;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term122950, args);
        assertTrue(recursiveEquals(term122950, term123767));
        assertTrue(recursiveEquals(term123284, term123772));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


