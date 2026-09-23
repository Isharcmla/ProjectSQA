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

public class LightweightMessageFormatter_format_413663799261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227266;
     Object term227600;
     Object term228957;
     Object term228962;

    public LightweightMessageFormatter_format_413663799261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term228966 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term228965 = ((Class) term228966).getDeclaredField((String) "REGION");
        ((Field) term228965).setAccessible(true);
        Object enum273 = ((Field) term228965).get((Object) null);
        term227266 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term227346 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term227266, term227266.getClass(), "source", term227346);
        setField(term227266, term227266.getClass(), "excerpt", enum273);
        term227600 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term227600, term227600.getClass(), "sourceName", "");
        setIntField(term227600, term227600.getClass(), "lineNumber", 0);
        Class<? extends Object> term229311 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term229310 = ((Class) term229311).getDeclaredField((String) "REGION");
        ((Field) term229310).setAccessible(true);
        Object enum274 = ((Field) term229310).get((Object) null);
        term228957 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term228961 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term228957, term228957.getClass(), "excerpt", enum274);
        setField(term228961, term228961.getClass(), "options", null);
        setField(term228961, term228961.getClass(), "passes", null);
        setField(term228961, term228961.getClass(), "externs", null);
        setField(term228961, term228961.getClass(), "modules", null);
        setField(term228961, term228961.getClass(), "moduleGraph", null);
        setField(term228961, term228961.getClass(), "inputs", null);
        setField(term228961, term228961.getClass(), "errorManager", null);
        setField(term228961, term228961.getClass(), "warningsGuard", null);
        setField(term228961, term228961.getClass(), "externsRoot", null);
        setField(term228961, term228961.getClass(), "jsRoot", null);
        setField(term228961, term228961.getClass(), "externAndJsRoot", null);
        setField(term228961, term228961.getClass(), "inputsByName", null);
        setField(term228961, term228961.getClass(), "sourceMap", null);
        setField(term228961, term228961.getClass(), "externExports", null);
        setIntField(term228961, term228961.getClass(), "uniqueNameId", 0);
        setBooleanField(term228961, term228961.getClass(), "useThreads", false);
        setBooleanField(term228961, term228961.getClass(), "hasRegExpGlobalReferences", false);
        setField(term228961, term228961.getClass(), "functionInformationMap", null);
        setField(term228961, term228961.getClass(), "debugLog", null);
        setField(term228961, term228961.getClass(), "defaultCodingConvention", null);
        setField(term228961, term228961.getClass(), "typeRegistry", null);
        setField(term228961, term228961.getClass(), "parserConfig", null);
        setField(term228961, term228961.getClass(), "abstractInterpreter", null);
        setField(term228961, term228961.getClass(), "typeValidator", null);
        setField(term228961, term228961.getClass(), "tracker", null);
        setField(term228961, term228961.getClass(), "oldErrorReporter", null);
        setField(term228961, term228961.getClass(), "defaultErrorReporter", null);
        setField(term228961, term228961.getClass(), "outStream", null);
        setField(term228961, term228961.getClass(), "globalRefMap", null);
        setField(term228961, term228961.getClass(), "sanityCheck", null);
        setField(term228961, term228961.getClass(), "currentTracer", null);
        setField(term228961, term228961.getClass(), "currentPassName", null);
        setField(term228961, term228961.getClass(), "recentChange", null);
        setField(term228961, term228961.getClass(), "codeChangeHandlers", null);
        setField(term228961, term228961.getClass(), "stage", null);
        setField(term228957, term228957.getClass(), "source", term228961);
        setBooleanField(term228957, term228957.getClass(), "colorize", false);
        term228962 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term228962, term228962.getClass(), "type", null);
        setField(term228962, term228962.getClass(), "description", null);
        setField(term228962, term228962.getClass(), "sourceName", "");
        setField(term228962, term228962.getClass(), "node", null);
        setIntField(term228962, term228962.getClass(), "lineNumber", 0);
        setField(term228962, term228962.getClass(), "level", null);
        setIntField(term228962, term228962.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term227600;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term227266, args);
        assertTrue(recursiveEquals(term227266, term228957));
        assertTrue(recursiveEquals(term227600, term228962));
        assertTrue(recursiveEquals(retValue, ": WARNING - null\n"));
    }

};


