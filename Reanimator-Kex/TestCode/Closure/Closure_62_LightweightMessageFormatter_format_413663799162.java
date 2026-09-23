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

public class LightweightMessageFormatter_format_413663799162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126256;
     Object term126742;
     Object term128848;
     Object term128854;

    public LightweightMessageFormatter_format_413663799162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term126384 = new HashMap();
        Class<? extends Object> term128856 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term128855 = ((Class) term128856).getDeclaredField((String) "REGION");
        ((Field) term128855).setAccessible(true);
        Object enum142 = ((Field) term128855).get((Object) null);
        term126256 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term126336 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term126336, term126336.getClass(), "inputsByName", term126384);
        setField(term126256, term126256.getClass(), "source", term126336);
        setField(term126256, term126256.getClass(), "excerpt", enum142);
        setBooleanField(term126256, term126256.getClass(), "colorize", true);
        term126742 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term126742, term126742.getClass(), "sourceName", null);
        setIntField(term126742, term126742.getClass(), "lineNumber", 1);
        Class<? extends Object> term129201 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term129200 = ((Class) term129201).getDeclaredField((String) "REGION");
        ((Field) term129200).setAccessible(true);
        Object enum143 = ((Field) term129200).get((Object) null);
        HashMap term128853 = new HashMap();
        term128848 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term128852 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term128848, term128848.getClass(), "excerpt", enum143);
        setField(term128852, term128852.getClass(), "options", null);
        setField(term128852, term128852.getClass(), "passes", null);
        setField(term128852, term128852.getClass(), "externs", null);
        setField(term128852, term128852.getClass(), "modules", null);
        setField(term128852, term128852.getClass(), "moduleGraph", null);
        setField(term128852, term128852.getClass(), "inputs", null);
        setField(term128852, term128852.getClass(), "errorManager", null);
        setField(term128852, term128852.getClass(), "warningsGuard", null);
        setField(term128852, term128852.getClass(), "externsRoot", null);
        setField(term128852, term128852.getClass(), "jsRoot", null);
        setField(term128852, term128852.getClass(), "externAndJsRoot", null);
        setField(term128852, term128852.getClass(), "inputsByName", term128853);
        setField(term128852, term128852.getClass(), "sourceMap", null);
        setField(term128852, term128852.getClass(), "externExports", null);
        setIntField(term128852, term128852.getClass(), "uniqueNameId", 0);
        setBooleanField(term128852, term128852.getClass(), "useThreads", false);
        setBooleanField(term128852, term128852.getClass(), "hasRegExpGlobalReferences", false);
        setField(term128852, term128852.getClass(), "functionInformationMap", null);
        setField(term128852, term128852.getClass(), "debugLog", null);
        setField(term128852, term128852.getClass(), "defaultCodingConvention", null);
        setField(term128852, term128852.getClass(), "typeRegistry", null);
        setField(term128852, term128852.getClass(), "parserConfig", null);
        setField(term128852, term128852.getClass(), "abstractInterpreter", null);
        setField(term128852, term128852.getClass(), "typeValidator", null);
        setField(term128852, term128852.getClass(), "tracker", null);
        setField(term128852, term128852.getClass(), "oldErrorReporter", null);
        setField(term128852, term128852.getClass(), "defaultErrorReporter", null);
        setField(term128852, term128852.getClass(), "outStream", null);
        setField(term128852, term128852.getClass(), "globalRefMap", null);
        setField(term128852, term128852.getClass(), "sanityCheck", null);
        setField(term128852, term128852.getClass(), "currentTracer", null);
        setField(term128852, term128852.getClass(), "currentPassName", null);
        setField(term128852, term128852.getClass(), "recentChange", null);
        setField(term128852, term128852.getClass(), "codeChangeHandlers", null);
        setField(term128852, term128852.getClass(), "stage", null);
        setField(term128848, term128848.getClass(), "source", term128852);
        setBooleanField(term128848, term128848.getClass(), "colorize", true);
        term128854 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term128854, term128854.getClass(), "type", null);
        setField(term128854, term128854.getClass(), "description", null);
        setField(term128854, term128854.getClass(), "sourceName", null);
        setField(term128854, term128854.getClass(), "node", null);
        setIntField(term128854, term128854.getClass(), "lineNumber", 1);
        setField(term128854, term128854.getClass(), "level", null);
        setIntField(term128854, term128854.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term126742;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term126256, args);
        assertTrue(recursiveEquals(term126256, term128848));
        assertTrue(recursiveEquals(term126742, term128854));
        assertTrue(recursiveEquals(retValue, "\u001B[31mERROR\u001B[39m - null\n"));
    }

};


