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

public class LightweightMessageFormatter_format_413663799145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106818;
     Object term107200;
     Object term108537;
     Object term108543;

    public LightweightMessageFormatter_format_413663799145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term106946 = new HashMap();
        Class<? extends Object> term108545 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term108544 = ((Class) term108545).getDeclaredField((String) "REGION");
        ((Field) term108544).setAccessible(true);
        Object enum123 = ((Field) term108544).get((Object) null);
        term106818 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term106898 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term106898, term106898.getClass(), "inputsByName", term106946);
        setField(term106818, term106818.getClass(), "source", term106898);
        setField(term106818, term106818.getClass(), "excerpt", enum123);
        term107200 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term107200, term107200.getClass(), "sourceName", null);
        setIntField(term107200, term107200.getClass(), "lineNumber", 1);
        Class<? extends Object> term108890 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term108889 = ((Class) term108890).getDeclaredField((String) "REGION");
        ((Field) term108889).setAccessible(true);
        Object enum124 = ((Field) term108889).get((Object) null);
        HashMap term108542 = new HashMap();
        term108537 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term108541 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term108537, term108537.getClass(), "excerpt", enum124);
        setField(term108541, term108541.getClass(), "options", null);
        setField(term108541, term108541.getClass(), "passes", null);
        setField(term108541, term108541.getClass(), "externs", null);
        setField(term108541, term108541.getClass(), "modules", null);
        setField(term108541, term108541.getClass(), "moduleGraph", null);
        setField(term108541, term108541.getClass(), "inputs", null);
        setField(term108541, term108541.getClass(), "errorManager", null);
        setField(term108541, term108541.getClass(), "warningsGuard", null);
        setField(term108541, term108541.getClass(), "externsRoot", null);
        setField(term108541, term108541.getClass(), "jsRoot", null);
        setField(term108541, term108541.getClass(), "externAndJsRoot", null);
        setField(term108541, term108541.getClass(), "inputsByName", term108542);
        setField(term108541, term108541.getClass(), "sourceMap", null);
        setField(term108541, term108541.getClass(), "externExports", null);
        setIntField(term108541, term108541.getClass(), "uniqueNameId", 0);
        setBooleanField(term108541, term108541.getClass(), "useThreads", false);
        setBooleanField(term108541, term108541.getClass(), "hasRegExpGlobalReferences", false);
        setField(term108541, term108541.getClass(), "functionInformationMap", null);
        setField(term108541, term108541.getClass(), "debugLog", null);
        setField(term108541, term108541.getClass(), "defaultCodingConvention", null);
        setField(term108541, term108541.getClass(), "typeRegistry", null);
        setField(term108541, term108541.getClass(), "parserConfig", null);
        setField(term108541, term108541.getClass(), "abstractInterpreter", null);
        setField(term108541, term108541.getClass(), "typeValidator", null);
        setField(term108541, term108541.getClass(), "tracker", null);
        setField(term108541, term108541.getClass(), "oldErrorReporter", null);
        setField(term108541, term108541.getClass(), "defaultErrorReporter", null);
        setField(term108541, term108541.getClass(), "outStream", null);
        setField(term108541, term108541.getClass(), "globalRefMap", null);
        setField(term108541, term108541.getClass(), "sanityCheck", null);
        setField(term108541, term108541.getClass(), "currentTracer", null);
        setField(term108541, term108541.getClass(), "currentPassName", null);
        setField(term108541, term108541.getClass(), "recentChange", null);
        setField(term108541, term108541.getClass(), "codeChangeHandlers", null);
        setField(term108541, term108541.getClass(), "stage", null);
        setField(term108537, term108537.getClass(), "source", term108541);
        setBooleanField(term108537, term108537.getClass(), "colorize", false);
        term108543 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term108543, term108543.getClass(), "type", null);
        setField(term108543, term108543.getClass(), "description", null);
        setField(term108543, term108543.getClass(), "sourceName", null);
        setField(term108543, term108543.getClass(), "node", null);
        setIntField(term108543, term108543.getClass(), "lineNumber", 1);
        setField(term108543, term108543.getClass(), "level", null);
        setIntField(term108543, term108543.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term107200;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term106818, args);
        assertTrue(recursiveEquals(term106818, term108537));
        assertTrue(recursiveEquals(term107200, term108543));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


