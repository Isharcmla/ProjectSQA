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

public class LightweightMessageFormatter_format_413663799197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163262;
     Object term163748;
     Object term165071;
     Object term165077;

    public LightweightMessageFormatter_format_413663799197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term163390 = new HashMap();
        Class<? extends Object> term165079 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term165078 = ((Class) term165079).getDeclaredField((String) "REGION");
        ((Field) term165078).setAccessible(true);
        Object enum192 = ((Field) term165078).get((Object) null);
        term163262 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term163342 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term163342, term163342.getClass(), "inputsByName", term163390);
        setField(term163262, term163262.getClass(), "source", term163342);
        setField(term163262, term163262.getClass(), "excerpt", enum192);
        term163748 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term163748, term163748.getClass(), "sourceName", null);
        setIntField(term163748, term163748.getClass(), "lineNumber", 1);
        Class<? extends Object> term165424 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term165423 = ((Class) term165424).getDeclaredField((String) "REGION");
        ((Field) term165423).setAccessible(true);
        Object enum193 = ((Field) term165423).get((Object) null);
        HashMap term165076 = new HashMap();
        term165071 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term165075 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term165071, term165071.getClass(), "excerpt", enum193);
        setField(term165075, term165075.getClass(), "options", null);
        setField(term165075, term165075.getClass(), "passes", null);
        setField(term165075, term165075.getClass(), "externs", null);
        setField(term165075, term165075.getClass(), "modules", null);
        setField(term165075, term165075.getClass(), "moduleGraph", null);
        setField(term165075, term165075.getClass(), "inputs", null);
        setField(term165075, term165075.getClass(), "errorManager", null);
        setField(term165075, term165075.getClass(), "warningsGuard", null);
        setField(term165075, term165075.getClass(), "externsRoot", null);
        setField(term165075, term165075.getClass(), "jsRoot", null);
        setField(term165075, term165075.getClass(), "externAndJsRoot", null);
        setField(term165075, term165075.getClass(), "inputsByName", term165076);
        setField(term165075, term165075.getClass(), "sourceMap", null);
        setField(term165075, term165075.getClass(), "externExports", null);
        setIntField(term165075, term165075.getClass(), "uniqueNameId", 0);
        setBooleanField(term165075, term165075.getClass(), "useThreads", false);
        setBooleanField(term165075, term165075.getClass(), "hasRegExpGlobalReferences", false);
        setField(term165075, term165075.getClass(), "functionInformationMap", null);
        setField(term165075, term165075.getClass(), "debugLog", null);
        setField(term165075, term165075.getClass(), "defaultCodingConvention", null);
        setField(term165075, term165075.getClass(), "typeRegistry", null);
        setField(term165075, term165075.getClass(), "parserConfig", null);
        setField(term165075, term165075.getClass(), "abstractInterpreter", null);
        setField(term165075, term165075.getClass(), "typeValidator", null);
        setField(term165075, term165075.getClass(), "tracker", null);
        setField(term165075, term165075.getClass(), "oldErrorReporter", null);
        setField(term165075, term165075.getClass(), "defaultErrorReporter", null);
        setField(term165075, term165075.getClass(), "outStream", null);
        setField(term165075, term165075.getClass(), "globalRefMap", null);
        setField(term165075, term165075.getClass(), "sanityCheck", null);
        setField(term165075, term165075.getClass(), "currentTracer", null);
        setField(term165075, term165075.getClass(), "currentPassName", null);
        setField(term165075, term165075.getClass(), "recentChange", null);
        setField(term165075, term165075.getClass(), "codeChangeHandlers", null);
        setField(term165075, term165075.getClass(), "stage", null);
        setField(term165071, term165071.getClass(), "source", term165075);
        setBooleanField(term165071, term165071.getClass(), "colorize", false);
        term165077 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term165077, term165077.getClass(), "type", null);
        setField(term165077, term165077.getClass(), "description", null);
        setField(term165077, term165077.getClass(), "sourceName", null);
        setField(term165077, term165077.getClass(), "node", null);
        setIntField(term165077, term165077.getClass(), "lineNumber", 1);
        setField(term165077, term165077.getClass(), "level", null);
        setIntField(term165077, term165077.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term163748;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term163262, args);
        assertTrue(recursiveEquals(term163262, term165071));
        assertTrue(recursiveEquals(term163748, term165077));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


