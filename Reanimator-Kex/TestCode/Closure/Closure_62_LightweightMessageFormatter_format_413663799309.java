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

public class LightweightMessageFormatter_format_413663799309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262521;
     Object term263007;
     Object term263525;
     Object term263531;

    public LightweightMessageFormatter_format_413663799309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term262649 = new HashMap();
        Class<? extends Object> term263535 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term263534 = ((Class) term263535).getDeclaredField((String) "REGION");
        ((Field) term263534).setAccessible(true);
        Object enum315 = ((Field) term263534).get((Object) null);
        term262521 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term262601 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term262601, term262601.getClass(), "inputsByName", term262649);
        setField(term262521, term262521.getClass(), "source", term262601);
        setField(term262521, term262521.getClass(), "excerpt", enum315);
        term263007 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term263007, term263007.getClass(), "sourceName", "");
        setIntField(term263007, term263007.getClass(), "lineNumber", 1);
        Class<? extends Object> term263880 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term263879 = ((Class) term263880).getDeclaredField((String) "REGION");
        ((Field) term263879).setAccessible(true);
        Object enum316 = ((Field) term263879).get((Object) null);
        HashMap term263530 = new HashMap();
        term263525 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term263529 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term263525, term263525.getClass(), "excerpt", enum316);
        setField(term263529, term263529.getClass(), "options", null);
        setField(term263529, term263529.getClass(), "passes", null);
        setField(term263529, term263529.getClass(), "externs", null);
        setField(term263529, term263529.getClass(), "modules", null);
        setField(term263529, term263529.getClass(), "moduleGraph", null);
        setField(term263529, term263529.getClass(), "inputs", null);
        setField(term263529, term263529.getClass(), "errorManager", null);
        setField(term263529, term263529.getClass(), "warningsGuard", null);
        setField(term263529, term263529.getClass(), "externsRoot", null);
        setField(term263529, term263529.getClass(), "jsRoot", null);
        setField(term263529, term263529.getClass(), "externAndJsRoot", null);
        setField(term263529, term263529.getClass(), "inputsByName", term263530);
        setField(term263529, term263529.getClass(), "sourceMap", null);
        setField(term263529, term263529.getClass(), "externExports", null);
        setIntField(term263529, term263529.getClass(), "uniqueNameId", 0);
        setBooleanField(term263529, term263529.getClass(), "useThreads", false);
        setBooleanField(term263529, term263529.getClass(), "hasRegExpGlobalReferences", false);
        setField(term263529, term263529.getClass(), "functionInformationMap", null);
        setField(term263529, term263529.getClass(), "debugLog", null);
        setField(term263529, term263529.getClass(), "defaultCodingConvention", null);
        setField(term263529, term263529.getClass(), "typeRegistry", null);
        setField(term263529, term263529.getClass(), "parserConfig", null);
        setField(term263529, term263529.getClass(), "abstractInterpreter", null);
        setField(term263529, term263529.getClass(), "typeValidator", null);
        setField(term263529, term263529.getClass(), "tracker", null);
        setField(term263529, term263529.getClass(), "oldErrorReporter", null);
        setField(term263529, term263529.getClass(), "defaultErrorReporter", null);
        setField(term263529, term263529.getClass(), "outStream", null);
        setField(term263529, term263529.getClass(), "globalRefMap", null);
        setField(term263529, term263529.getClass(), "sanityCheck", null);
        setField(term263529, term263529.getClass(), "currentTracer", null);
        setField(term263529, term263529.getClass(), "currentPassName", null);
        setField(term263529, term263529.getClass(), "recentChange", null);
        setField(term263529, term263529.getClass(), "codeChangeHandlers", null);
        setField(term263529, term263529.getClass(), "stage", null);
        setField(term263525, term263525.getClass(), "source", term263529);
        setBooleanField(term263525, term263525.getClass(), "colorize", false);
        term263531 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term263531, term263531.getClass(), "type", null);
        setField(term263531, term263531.getClass(), "description", null);
        setField(term263531, term263531.getClass(), "sourceName", "");
        setField(term263531, term263531.getClass(), "node", null);
        setIntField(term263531, term263531.getClass(), "lineNumber", 1);
        setField(term263531, term263531.getClass(), "level", null);
        setIntField(term263531, term263531.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term263007;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term262521, args);
        assertTrue(recursiveEquals(term262521, term263525));
        assertTrue(recursiveEquals(term263007, term263531));
        assertTrue(recursiveEquals(retValue, ":1: ERROR - null\n"));
    }

};


