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

public class LightweightMessageFormatter_format_413663799297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252572;
     Object term253058;
     Object term253529;
     Object term253535;

    public LightweightMessageFormatter_format_413663799297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term252700 = new HashMap();
        Class<? extends Object> term253537 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term253536 = ((Class) term253537).getDeclaredField((String) "REGION");
        ((Field) term253536).setAccessible(true);
        Object enum300 = ((Field) term253536).get((Object) null);
        term252572 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term252652 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term252652, term252652.getClass(), "inputsByName", term252700);
        setField(term252572, term252572.getClass(), "source", term252652);
        setField(term252572, term252572.getClass(), "excerpt", enum300);
        term253058 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term253058, term253058.getClass(), "sourceName", null);
        setIntField(term253058, term253058.getClass(), "lineNumber", 1);
        Class<? extends Object> term253882 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term253881 = ((Class) term253882).getDeclaredField((String) "REGION");
        ((Field) term253881).setAccessible(true);
        Object enum301 = ((Field) term253881).get((Object) null);
        HashMap term253534 = new HashMap();
        term253529 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term253533 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term253529, term253529.getClass(), "excerpt", enum301);
        setField(term253533, term253533.getClass(), "options", null);
        setField(term253533, term253533.getClass(), "passes", null);
        setField(term253533, term253533.getClass(), "externs", null);
        setField(term253533, term253533.getClass(), "modules", null);
        setField(term253533, term253533.getClass(), "moduleGraph", null);
        setField(term253533, term253533.getClass(), "inputs", null);
        setField(term253533, term253533.getClass(), "errorManager", null);
        setField(term253533, term253533.getClass(), "warningsGuard", null);
        setField(term253533, term253533.getClass(), "externsRoot", null);
        setField(term253533, term253533.getClass(), "jsRoot", null);
        setField(term253533, term253533.getClass(), "externAndJsRoot", null);
        setField(term253533, term253533.getClass(), "inputsByName", term253534);
        setField(term253533, term253533.getClass(), "sourceMap", null);
        setField(term253533, term253533.getClass(), "externExports", null);
        setIntField(term253533, term253533.getClass(), "uniqueNameId", 0);
        setBooleanField(term253533, term253533.getClass(), "useThreads", false);
        setBooleanField(term253533, term253533.getClass(), "hasRegExpGlobalReferences", false);
        setField(term253533, term253533.getClass(), "functionInformationMap", null);
        setField(term253533, term253533.getClass(), "debugLog", null);
        setField(term253533, term253533.getClass(), "defaultCodingConvention", null);
        setField(term253533, term253533.getClass(), "typeRegistry", null);
        setField(term253533, term253533.getClass(), "parserConfig", null);
        setField(term253533, term253533.getClass(), "abstractInterpreter", null);
        setField(term253533, term253533.getClass(), "typeValidator", null);
        setField(term253533, term253533.getClass(), "tracker", null);
        setField(term253533, term253533.getClass(), "oldErrorReporter", null);
        setField(term253533, term253533.getClass(), "defaultErrorReporter", null);
        setField(term253533, term253533.getClass(), "outStream", null);
        setField(term253533, term253533.getClass(), "globalRefMap", null);
        setField(term253533, term253533.getClass(), "sanityCheck", null);
        setField(term253533, term253533.getClass(), "currentTracer", null);
        setField(term253533, term253533.getClass(), "currentPassName", null);
        setField(term253533, term253533.getClass(), "recentChange", null);
        setField(term253533, term253533.getClass(), "codeChangeHandlers", null);
        setField(term253533, term253533.getClass(), "stage", null);
        setField(term253529, term253529.getClass(), "source", term253533);
        setBooleanField(term253529, term253529.getClass(), "colorize", false);
        term253535 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term253535, term253535.getClass(), "type", null);
        setField(term253535, term253535.getClass(), "description", null);
        setField(term253535, term253535.getClass(), "sourceName", null);
        setField(term253535, term253535.getClass(), "node", null);
        setIntField(term253535, term253535.getClass(), "lineNumber", 1);
        setField(term253535, term253535.getClass(), "level", null);
        setIntField(term253535, term253535.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term253058;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term252572, args);
        assertTrue(recursiveEquals(term252572, term253529));
        assertTrue(recursiveEquals(term253058, term253535));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


