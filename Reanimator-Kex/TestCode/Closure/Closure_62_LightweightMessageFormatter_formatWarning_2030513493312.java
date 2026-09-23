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

public class LightweightMessageFormatter_formatWarning_2030513493312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264656;
     Object term265142;
     Object term266232;
     Object term266238;

    public LightweightMessageFormatter_formatWarning_2030513493312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term264784 = new HashMap();
        Class<? extends Object> term266240 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term266239 = ((Class) term266240).getDeclaredField((String) "REGION");
        ((Field) term266239).setAccessible(true);
        Object enum318 = ((Field) term266239).get((Object) null);
        term264656 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term264736 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term264736, term264736.getClass(), "inputsByName", term264784);
        setField(term264656, term264656.getClass(), "source", term264736);
        setField(term264656, term264656.getClass(), "excerpt", enum318);
        term265142 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term265142, term265142.getClass(), "sourceName", null);
        setIntField(term265142, term265142.getClass(), "lineNumber", 1);
        Class<? extends Object> term266585 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term266584 = ((Class) term266585).getDeclaredField((String) "REGION");
        ((Field) term266584).setAccessible(true);
        Object enum319 = ((Field) term266584).get((Object) null);
        HashMap term266237 = new HashMap();
        term266232 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term266236 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term266232, term266232.getClass(), "excerpt", enum319);
        setField(term266236, term266236.getClass(), "options", null);
        setField(term266236, term266236.getClass(), "passes", null);
        setField(term266236, term266236.getClass(), "externs", null);
        setField(term266236, term266236.getClass(), "modules", null);
        setField(term266236, term266236.getClass(), "moduleGraph", null);
        setField(term266236, term266236.getClass(), "inputs", null);
        setField(term266236, term266236.getClass(), "errorManager", null);
        setField(term266236, term266236.getClass(), "warningsGuard", null);
        setField(term266236, term266236.getClass(), "externsRoot", null);
        setField(term266236, term266236.getClass(), "jsRoot", null);
        setField(term266236, term266236.getClass(), "externAndJsRoot", null);
        setField(term266236, term266236.getClass(), "inputsByName", term266237);
        setField(term266236, term266236.getClass(), "sourceMap", null);
        setField(term266236, term266236.getClass(), "externExports", null);
        setIntField(term266236, term266236.getClass(), "uniqueNameId", 0);
        setBooleanField(term266236, term266236.getClass(), "useThreads", false);
        setBooleanField(term266236, term266236.getClass(), "hasRegExpGlobalReferences", false);
        setField(term266236, term266236.getClass(), "functionInformationMap", null);
        setField(term266236, term266236.getClass(), "debugLog", null);
        setField(term266236, term266236.getClass(), "defaultCodingConvention", null);
        setField(term266236, term266236.getClass(), "typeRegistry", null);
        setField(term266236, term266236.getClass(), "parserConfig", null);
        setField(term266236, term266236.getClass(), "abstractInterpreter", null);
        setField(term266236, term266236.getClass(), "typeValidator", null);
        setField(term266236, term266236.getClass(), "tracker", null);
        setField(term266236, term266236.getClass(), "oldErrorReporter", null);
        setField(term266236, term266236.getClass(), "defaultErrorReporter", null);
        setField(term266236, term266236.getClass(), "outStream", null);
        setField(term266236, term266236.getClass(), "globalRefMap", null);
        setField(term266236, term266236.getClass(), "sanityCheck", null);
        setField(term266236, term266236.getClass(), "currentTracer", null);
        setField(term266236, term266236.getClass(), "currentPassName", null);
        setField(term266236, term266236.getClass(), "recentChange", null);
        setField(term266236, term266236.getClass(), "codeChangeHandlers", null);
        setField(term266236, term266236.getClass(), "stage", null);
        setField(term266232, term266232.getClass(), "source", term266236);
        setBooleanField(term266232, term266232.getClass(), "colorize", false);
        term266238 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term266238, term266238.getClass(), "type", null);
        setField(term266238, term266238.getClass(), "description", null);
        setField(term266238, term266238.getClass(), "sourceName", null);
        setField(term266238, term266238.getClass(), "node", null);
        setIntField(term266238, term266238.getClass(), "lineNumber", 1);
        setField(term266238, term266238.getClass(), "level", null);
        setIntField(term266238, term266238.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term265142;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term264656, args);
        assertTrue(recursiveEquals(term264656, term266232));
        assertTrue(recursiveEquals(term265142, term266238));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


