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

public class LightweightMessageFormatter_format_413663799373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316802;
     Object term317136;
     Object term317659;
     Object term317664;

    public LightweightMessageFormatter_format_413663799373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term317668 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term317667 = ((Class) term317668).getDeclaredField((String) "REGION");
        ((Field) term317667).setAccessible(true);
        Object enum378 = ((Field) term317667).get((Object) null);
        term316802 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term316882 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term316802, term316802.getClass(), "source", term316882);
        setField(term316802, term316802.getClass(), "excerpt", enum378);
        term317136 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term317136, term317136.getClass(), "sourceName", "OFF");
        setIntField(term317136, term317136.getClass(), "lineNumber", -2147483616);
        Class<? extends Object> term318016 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term318015 = ((Class) term318016).getDeclaredField((String) "REGION");
        ((Field) term318015).setAccessible(true);
        Object enum379 = ((Field) term318015).get((Object) null);
        term317659 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term317663 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term317659, term317659.getClass(), "excerpt", enum379);
        setField(term317663, term317663.getClass(), "options", null);
        setField(term317663, term317663.getClass(), "passes", null);
        setField(term317663, term317663.getClass(), "externs", null);
        setField(term317663, term317663.getClass(), "modules", null);
        setField(term317663, term317663.getClass(), "moduleGraph", null);
        setField(term317663, term317663.getClass(), "inputs", null);
        setField(term317663, term317663.getClass(), "errorManager", null);
        setField(term317663, term317663.getClass(), "warningsGuard", null);
        setField(term317663, term317663.getClass(), "externsRoot", null);
        setField(term317663, term317663.getClass(), "jsRoot", null);
        setField(term317663, term317663.getClass(), "externAndJsRoot", null);
        setField(term317663, term317663.getClass(), "inputsByName", null);
        setField(term317663, term317663.getClass(), "sourceMap", null);
        setField(term317663, term317663.getClass(), "externExports", null);
        setIntField(term317663, term317663.getClass(), "uniqueNameId", 0);
        setBooleanField(term317663, term317663.getClass(), "useThreads", false);
        setBooleanField(term317663, term317663.getClass(), "hasRegExpGlobalReferences", false);
        setField(term317663, term317663.getClass(), "functionInformationMap", null);
        setField(term317663, term317663.getClass(), "debugLog", null);
        setField(term317663, term317663.getClass(), "defaultCodingConvention", null);
        setField(term317663, term317663.getClass(), "typeRegistry", null);
        setField(term317663, term317663.getClass(), "parserConfig", null);
        setField(term317663, term317663.getClass(), "abstractInterpreter", null);
        setField(term317663, term317663.getClass(), "typeValidator", null);
        setField(term317663, term317663.getClass(), "tracker", null);
        setField(term317663, term317663.getClass(), "oldErrorReporter", null);
        setField(term317663, term317663.getClass(), "defaultErrorReporter", null);
        setField(term317663, term317663.getClass(), "outStream", null);
        setField(term317663, term317663.getClass(), "globalRefMap", null);
        setField(term317663, term317663.getClass(), "sanityCheck", null);
        setField(term317663, term317663.getClass(), "currentTracer", null);
        setField(term317663, term317663.getClass(), "currentPassName", null);
        setField(term317663, term317663.getClass(), "recentChange", null);
        setField(term317663, term317663.getClass(), "codeChangeHandlers", null);
        setField(term317663, term317663.getClass(), "stage", null);
        setField(term317659, term317659.getClass(), "source", term317663);
        setBooleanField(term317659, term317659.getClass(), "colorize", false);
        term317664 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term317664, term317664.getClass(), "type", null);
        setField(term317664, term317664.getClass(), "description", null);
        setField(term317664, term317664.getClass(), "sourceName", "OFF");
        setField(term317664, term317664.getClass(), "node", null);
        setIntField(term317664, term317664.getClass(), "lineNumber", -2147483616);
        setField(term317664, term317664.getClass(), "level", null);
        setIntField(term317664, term317664.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term317136;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term316802, args);
        assertTrue(recursiveEquals(term316802, term317659));
        assertTrue(recursiveEquals(term317136, term317664));
        assertTrue(recursiveEquals(retValue, "OFF: WARNING - null\n"));
    }

};


