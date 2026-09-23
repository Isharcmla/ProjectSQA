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

public class LightweightMessageFormatter_format_413663799331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280689;
     Object term281175;
     Object term281715;
     Object term281721;

    public LightweightMessageFormatter_format_413663799331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term280817 = new HashMap();
        Class<? extends Object> term281725 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term281724 = ((Class) term281725).getDeclaredField((String) "REGION");
        ((Field) term281724).setAccessible(true);
        Object enum336 = ((Field) term281724).get((Object) null);
        term280689 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term280769 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term280769, term280769.getClass(), "inputsByName", term280817);
        setField(term280689, term280689.getClass(), "source", term280769);
        setField(term280689, term280689.getClass(), "excerpt", enum336);
        term281175 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term281175, term281175.getClass(), "sourceName", ": ");
        setIntField(term281175, term281175.getClass(), "lineNumber", 512);
        Class<? extends Object> term282072 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term282071 = ((Class) term282072).getDeclaredField((String) "REGION");
        ((Field) term282071).setAccessible(true);
        Object enum337 = ((Field) term282071).get((Object) null);
        HashMap term281720 = new HashMap();
        term281715 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term281719 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term281715, term281715.getClass(), "excerpt", enum337);
        setField(term281719, term281719.getClass(), "options", null);
        setField(term281719, term281719.getClass(), "passes", null);
        setField(term281719, term281719.getClass(), "externs", null);
        setField(term281719, term281719.getClass(), "modules", null);
        setField(term281719, term281719.getClass(), "moduleGraph", null);
        setField(term281719, term281719.getClass(), "inputs", null);
        setField(term281719, term281719.getClass(), "errorManager", null);
        setField(term281719, term281719.getClass(), "warningsGuard", null);
        setField(term281719, term281719.getClass(), "externsRoot", null);
        setField(term281719, term281719.getClass(), "jsRoot", null);
        setField(term281719, term281719.getClass(), "externAndJsRoot", null);
        setField(term281719, term281719.getClass(), "inputsByName", term281720);
        setField(term281719, term281719.getClass(), "sourceMap", null);
        setField(term281719, term281719.getClass(), "externExports", null);
        setIntField(term281719, term281719.getClass(), "uniqueNameId", 0);
        setBooleanField(term281719, term281719.getClass(), "useThreads", false);
        setBooleanField(term281719, term281719.getClass(), "hasRegExpGlobalReferences", false);
        setField(term281719, term281719.getClass(), "functionInformationMap", null);
        setField(term281719, term281719.getClass(), "debugLog", null);
        setField(term281719, term281719.getClass(), "defaultCodingConvention", null);
        setField(term281719, term281719.getClass(), "typeRegistry", null);
        setField(term281719, term281719.getClass(), "parserConfig", null);
        setField(term281719, term281719.getClass(), "abstractInterpreter", null);
        setField(term281719, term281719.getClass(), "typeValidator", null);
        setField(term281719, term281719.getClass(), "tracker", null);
        setField(term281719, term281719.getClass(), "oldErrorReporter", null);
        setField(term281719, term281719.getClass(), "defaultErrorReporter", null);
        setField(term281719, term281719.getClass(), "outStream", null);
        setField(term281719, term281719.getClass(), "globalRefMap", null);
        setField(term281719, term281719.getClass(), "sanityCheck", null);
        setField(term281719, term281719.getClass(), "currentTracer", null);
        setField(term281719, term281719.getClass(), "currentPassName", null);
        setField(term281719, term281719.getClass(), "recentChange", null);
        setField(term281719, term281719.getClass(), "codeChangeHandlers", null);
        setField(term281719, term281719.getClass(), "stage", null);
        setField(term281715, term281715.getClass(), "source", term281719);
        setBooleanField(term281715, term281715.getClass(), "colorize", false);
        term281721 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term281721, term281721.getClass(), "type", null);
        setField(term281721, term281721.getClass(), "description", null);
        setField(term281721, term281721.getClass(), "sourceName", ": ");
        setField(term281721, term281721.getClass(), "node", null);
        setIntField(term281721, term281721.getClass(), "lineNumber", 512);
        setField(term281721, term281721.getClass(), "level", null);
        setIntField(term281721, term281721.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term281175;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term280689, args);
        assertTrue(recursiveEquals(term280689, term281715));
        assertTrue(recursiveEquals(term281175, term281721));
        assertTrue(recursiveEquals(retValue, ": :512: WARNING - null\n"));
    }

};


