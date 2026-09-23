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

public class LightweightMessageFormatter_format_41366379968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40031;
     Object term40365;
     Object term41698;
     Object term41703;

    public LightweightMessageFormatter_format_41366379968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41707 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term41706 = ((Class) term41707).getDeclaredField((String) "REGION");
        ((Field) term41706).setAccessible(true);
        Object enum55 = ((Field) term41706).get((Object) null);
        term40031 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term40111 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term40031, term40031.getClass(), "source", term40111);
        setField(term40031, term40031.getClass(), "excerpt", enum55);
        term40365 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term40365, term40365.getClass(), "sourceName", "");
        setIntField(term40365, term40365.getClass(), "lineNumber", 0);
        Class<? extends Object> term42052 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term42051 = ((Class) term42052).getDeclaredField((String) "REGION");
        ((Field) term42051).setAccessible(true);
        Object enum56 = ((Field) term42051).get((Object) null);
        term41698 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term41702 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term41698, term41698.getClass(), "excerpt", enum56);
        setField(term41702, term41702.getClass(), "options", null);
        setField(term41702, term41702.getClass(), "passes", null);
        setField(term41702, term41702.getClass(), "externs", null);
        setField(term41702, term41702.getClass(), "modules", null);
        setField(term41702, term41702.getClass(), "moduleGraph", null);
        setField(term41702, term41702.getClass(), "inputs", null);
        setField(term41702, term41702.getClass(), "errorManager", null);
        setField(term41702, term41702.getClass(), "warningsGuard", null);
        setField(term41702, term41702.getClass(), "externsRoot", null);
        setField(term41702, term41702.getClass(), "jsRoot", null);
        setField(term41702, term41702.getClass(), "externAndJsRoot", null);
        setField(term41702, term41702.getClass(), "inputsByName", null);
        setField(term41702, term41702.getClass(), "sourceMap", null);
        setField(term41702, term41702.getClass(), "externExports", null);
        setIntField(term41702, term41702.getClass(), "uniqueNameId", 0);
        setBooleanField(term41702, term41702.getClass(), "useThreads", false);
        setBooleanField(term41702, term41702.getClass(), "hasRegExpGlobalReferences", false);
        setField(term41702, term41702.getClass(), "functionInformationMap", null);
        setField(term41702, term41702.getClass(), "debugLog", null);
        setField(term41702, term41702.getClass(), "defaultCodingConvention", null);
        setField(term41702, term41702.getClass(), "typeRegistry", null);
        setField(term41702, term41702.getClass(), "parserConfig", null);
        setField(term41702, term41702.getClass(), "abstractInterpreter", null);
        setField(term41702, term41702.getClass(), "typeValidator", null);
        setField(term41702, term41702.getClass(), "tracker", null);
        setField(term41702, term41702.getClass(), "oldErrorReporter", null);
        setField(term41702, term41702.getClass(), "defaultErrorReporter", null);
        setField(term41702, term41702.getClass(), "outStream", null);
        setField(term41702, term41702.getClass(), "globalRefMap", null);
        setField(term41702, term41702.getClass(), "sanityCheck", null);
        setField(term41702, term41702.getClass(), "currentTracer", null);
        setField(term41702, term41702.getClass(), "currentPassName", null);
        setField(term41702, term41702.getClass(), "recentChange", null);
        setField(term41702, term41702.getClass(), "codeChangeHandlers", null);
        setField(term41702, term41702.getClass(), "stage", null);
        setField(term41698, term41698.getClass(), "source", term41702);
        setBooleanField(term41698, term41698.getClass(), "colorize", false);
        term41703 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term41703, term41703.getClass(), "type", null);
        setField(term41703, term41703.getClass(), "description", null);
        setField(term41703, term41703.getClass(), "sourceName", "");
        setField(term41703, term41703.getClass(), "node", null);
        setIntField(term41703, term41703.getClass(), "lineNumber", 0);
        setField(term41703, term41703.getClass(), "level", null);
        setIntField(term41703, term41703.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term40365;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term40031, args);
        assertTrue(recursiveEquals(term40031, term41698));
        assertTrue(recursiveEquals(term40365, term41703));
        assertTrue(recursiveEquals(retValue, ": ERROR - null\n"));
    }

};


