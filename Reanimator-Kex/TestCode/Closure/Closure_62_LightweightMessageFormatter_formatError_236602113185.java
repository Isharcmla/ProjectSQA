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

public class LightweightMessageFormatter_formatError_236602113185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151290;
     Object term151672;
     Object term153012;
     Object term153018;

    public LightweightMessageFormatter_formatError_236602113185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term151418 = new HashMap();
        Class<? extends Object> term153020 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term153019 = ((Class) term153020).getDeclaredField((String) "REGION");
        ((Field) term153019).setAccessible(true);
        Object enum174 = ((Field) term153019).get((Object) null);
        term151290 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term151370 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term151370, term151370.getClass(), "inputsByName", term151418);
        setField(term151290, term151290.getClass(), "source", term151370);
        setField(term151290, term151290.getClass(), "excerpt", enum174);
        term151672 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term151672, term151672.getClass(), "sourceName", null);
        setIntField(term151672, term151672.getClass(), "lineNumber", 1);
        Class<? extends Object> term153365 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term153364 = ((Class) term153365).getDeclaredField((String) "REGION");
        ((Field) term153364).setAccessible(true);
        Object enum175 = ((Field) term153364).get((Object) null);
        HashMap term153017 = new HashMap();
        term153012 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term153016 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term153012, term153012.getClass(), "excerpt", enum175);
        setField(term153016, term153016.getClass(), "options", null);
        setField(term153016, term153016.getClass(), "passes", null);
        setField(term153016, term153016.getClass(), "externs", null);
        setField(term153016, term153016.getClass(), "modules", null);
        setField(term153016, term153016.getClass(), "moduleGraph", null);
        setField(term153016, term153016.getClass(), "inputs", null);
        setField(term153016, term153016.getClass(), "errorManager", null);
        setField(term153016, term153016.getClass(), "warningsGuard", null);
        setField(term153016, term153016.getClass(), "externsRoot", null);
        setField(term153016, term153016.getClass(), "jsRoot", null);
        setField(term153016, term153016.getClass(), "externAndJsRoot", null);
        setField(term153016, term153016.getClass(), "inputsByName", term153017);
        setField(term153016, term153016.getClass(), "sourceMap", null);
        setField(term153016, term153016.getClass(), "externExports", null);
        setIntField(term153016, term153016.getClass(), "uniqueNameId", 0);
        setBooleanField(term153016, term153016.getClass(), "useThreads", false);
        setBooleanField(term153016, term153016.getClass(), "hasRegExpGlobalReferences", false);
        setField(term153016, term153016.getClass(), "functionInformationMap", null);
        setField(term153016, term153016.getClass(), "debugLog", null);
        setField(term153016, term153016.getClass(), "defaultCodingConvention", null);
        setField(term153016, term153016.getClass(), "typeRegistry", null);
        setField(term153016, term153016.getClass(), "parserConfig", null);
        setField(term153016, term153016.getClass(), "abstractInterpreter", null);
        setField(term153016, term153016.getClass(), "typeValidator", null);
        setField(term153016, term153016.getClass(), "tracker", null);
        setField(term153016, term153016.getClass(), "oldErrorReporter", null);
        setField(term153016, term153016.getClass(), "defaultErrorReporter", null);
        setField(term153016, term153016.getClass(), "outStream", null);
        setField(term153016, term153016.getClass(), "globalRefMap", null);
        setField(term153016, term153016.getClass(), "sanityCheck", null);
        setField(term153016, term153016.getClass(), "currentTracer", null);
        setField(term153016, term153016.getClass(), "currentPassName", null);
        setField(term153016, term153016.getClass(), "recentChange", null);
        setField(term153016, term153016.getClass(), "codeChangeHandlers", null);
        setField(term153016, term153016.getClass(), "stage", null);
        setField(term153012, term153012.getClass(), "source", term153016);
        setBooleanField(term153012, term153012.getClass(), "colorize", false);
        term153018 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term153018, term153018.getClass(), "type", null);
        setField(term153018, term153018.getClass(), "description", null);
        setField(term153018, term153018.getClass(), "sourceName", null);
        setField(term153018, term153018.getClass(), "node", null);
        setIntField(term153018, term153018.getClass(), "lineNumber", 1);
        setField(term153018, term153018.getClass(), "level", null);
        setIntField(term153018, term153018.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term151672;
        Object retValue = callMethod(klass, "formatError", argTypes, term151290, args);
        assertTrue(recursiveEquals(term151290, term153012));
        assertTrue(recursiveEquals(term151672, term153018));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


