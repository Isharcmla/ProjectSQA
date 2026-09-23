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

public class LightweightMessageFormatter_format_413663799260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226031;
     Object term226365;
     Object term228099;
     Object term228104;

    public LightweightMessageFormatter_format_413663799260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term228108 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term228107 = ((Class) term228108).getDeclaredField((String) "REGION");
        ((Field) term228107).setAccessible(true);
        Object enum271 = ((Field) term228107).get((Object) null);
        term226031 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term226111 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term226031, term226031.getClass(), "source", term226111);
        setField(term226031, term226031.getClass(), "excerpt", enum271);
        term226365 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term226365, term226365.getClass(), "sourceName", "");
        setIntField(term226365, term226365.getClass(), "lineNumber", -2147483392);
        Class<? extends Object> term228453 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term228452 = ((Class) term228453).getDeclaredField((String) "REGION");
        ((Field) term228452).setAccessible(true);
        Object enum272 = ((Field) term228452).get((Object) null);
        term228099 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term228103 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term228099, term228099.getClass(), "excerpt", enum272);
        setField(term228103, term228103.getClass(), "options", null);
        setField(term228103, term228103.getClass(), "passes", null);
        setField(term228103, term228103.getClass(), "externs", null);
        setField(term228103, term228103.getClass(), "modules", null);
        setField(term228103, term228103.getClass(), "moduleGraph", null);
        setField(term228103, term228103.getClass(), "inputs", null);
        setField(term228103, term228103.getClass(), "errorManager", null);
        setField(term228103, term228103.getClass(), "warningsGuard", null);
        setField(term228103, term228103.getClass(), "externsRoot", null);
        setField(term228103, term228103.getClass(), "jsRoot", null);
        setField(term228103, term228103.getClass(), "externAndJsRoot", null);
        setField(term228103, term228103.getClass(), "inputsByName", null);
        setField(term228103, term228103.getClass(), "sourceMap", null);
        setField(term228103, term228103.getClass(), "externExports", null);
        setIntField(term228103, term228103.getClass(), "uniqueNameId", 0);
        setBooleanField(term228103, term228103.getClass(), "useThreads", false);
        setBooleanField(term228103, term228103.getClass(), "hasRegExpGlobalReferences", false);
        setField(term228103, term228103.getClass(), "functionInformationMap", null);
        setField(term228103, term228103.getClass(), "debugLog", null);
        setField(term228103, term228103.getClass(), "defaultCodingConvention", null);
        setField(term228103, term228103.getClass(), "typeRegistry", null);
        setField(term228103, term228103.getClass(), "parserConfig", null);
        setField(term228103, term228103.getClass(), "abstractInterpreter", null);
        setField(term228103, term228103.getClass(), "typeValidator", null);
        setField(term228103, term228103.getClass(), "tracker", null);
        setField(term228103, term228103.getClass(), "oldErrorReporter", null);
        setField(term228103, term228103.getClass(), "defaultErrorReporter", null);
        setField(term228103, term228103.getClass(), "outStream", null);
        setField(term228103, term228103.getClass(), "globalRefMap", null);
        setField(term228103, term228103.getClass(), "sanityCheck", null);
        setField(term228103, term228103.getClass(), "currentTracer", null);
        setField(term228103, term228103.getClass(), "currentPassName", null);
        setField(term228103, term228103.getClass(), "recentChange", null);
        setField(term228103, term228103.getClass(), "codeChangeHandlers", null);
        setField(term228103, term228103.getClass(), "stage", null);
        setField(term228099, term228099.getClass(), "source", term228103);
        setBooleanField(term228099, term228099.getClass(), "colorize", false);
        term228104 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term228104, term228104.getClass(), "type", null);
        setField(term228104, term228104.getClass(), "description", null);
        setField(term228104, term228104.getClass(), "sourceName", "");
        setField(term228104, term228104.getClass(), "node", null);
        setIntField(term228104, term228104.getClass(), "lineNumber", -2147483392);
        setField(term228104, term228104.getClass(), "level", null);
        setIntField(term228104, term228104.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term226365;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term226031, args);
        assertTrue(recursiveEquals(term226031, term228099));
        assertTrue(recursiveEquals(term226365, term228104));
        assertTrue(recursiveEquals(retValue, ": ERROR - null\n"));
    }

};


