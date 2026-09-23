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

public class LightweightMessageFormatter_format_413663799169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136019;
     Object term136505;
     Object term136976;
     Object term136982;

    public LightweightMessageFormatter_format_413663799169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term136147 = new HashMap();
        Class<? extends Object> term136984 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term136983 = ((Class) term136984).getDeclaredField((String) "REGION");
        ((Field) term136983).setAccessible(true);
        Object enum153 = ((Field) term136983).get((Object) null);
        term136019 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term136099 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term136099, term136099.getClass(), "inputsByName", term136147);
        setField(term136019, term136019.getClass(), "source", term136099);
        setField(term136019, term136019.getClass(), "excerpt", enum153);
        term136505 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term136505, term136505.getClass(), "sourceName", null);
        setIntField(term136505, term136505.getClass(), "lineNumber", 1);
        Class<? extends Object> term137329 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term137328 = ((Class) term137329).getDeclaredField((String) "REGION");
        ((Field) term137328).setAccessible(true);
        Object enum154 = ((Field) term137328).get((Object) null);
        HashMap term136981 = new HashMap();
        term136976 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term136980 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term136976, term136976.getClass(), "excerpt", enum154);
        setField(term136980, term136980.getClass(), "options", null);
        setField(term136980, term136980.getClass(), "passes", null);
        setField(term136980, term136980.getClass(), "externs", null);
        setField(term136980, term136980.getClass(), "modules", null);
        setField(term136980, term136980.getClass(), "moduleGraph", null);
        setField(term136980, term136980.getClass(), "inputs", null);
        setField(term136980, term136980.getClass(), "errorManager", null);
        setField(term136980, term136980.getClass(), "warningsGuard", null);
        setField(term136980, term136980.getClass(), "externsRoot", null);
        setField(term136980, term136980.getClass(), "jsRoot", null);
        setField(term136980, term136980.getClass(), "externAndJsRoot", null);
        setField(term136980, term136980.getClass(), "inputsByName", term136981);
        setField(term136980, term136980.getClass(), "sourceMap", null);
        setField(term136980, term136980.getClass(), "externExports", null);
        setIntField(term136980, term136980.getClass(), "uniqueNameId", 0);
        setBooleanField(term136980, term136980.getClass(), "useThreads", false);
        setBooleanField(term136980, term136980.getClass(), "hasRegExpGlobalReferences", false);
        setField(term136980, term136980.getClass(), "functionInformationMap", null);
        setField(term136980, term136980.getClass(), "debugLog", null);
        setField(term136980, term136980.getClass(), "defaultCodingConvention", null);
        setField(term136980, term136980.getClass(), "typeRegistry", null);
        setField(term136980, term136980.getClass(), "parserConfig", null);
        setField(term136980, term136980.getClass(), "abstractInterpreter", null);
        setField(term136980, term136980.getClass(), "typeValidator", null);
        setField(term136980, term136980.getClass(), "tracker", null);
        setField(term136980, term136980.getClass(), "oldErrorReporter", null);
        setField(term136980, term136980.getClass(), "defaultErrorReporter", null);
        setField(term136980, term136980.getClass(), "outStream", null);
        setField(term136980, term136980.getClass(), "globalRefMap", null);
        setField(term136980, term136980.getClass(), "sanityCheck", null);
        setField(term136980, term136980.getClass(), "currentTracer", null);
        setField(term136980, term136980.getClass(), "currentPassName", null);
        setField(term136980, term136980.getClass(), "recentChange", null);
        setField(term136980, term136980.getClass(), "codeChangeHandlers", null);
        setField(term136980, term136980.getClass(), "stage", null);
        setField(term136976, term136976.getClass(), "source", term136980);
        setBooleanField(term136976, term136976.getClass(), "colorize", false);
        term136982 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term136982, term136982.getClass(), "type", null);
        setField(term136982, term136982.getClass(), "description", null);
        setField(term136982, term136982.getClass(), "sourceName", null);
        setField(term136982, term136982.getClass(), "node", null);
        setIntField(term136982, term136982.getClass(), "lineNumber", 1);
        setField(term136982, term136982.getClass(), "level", null);
        setIntField(term136982, term136982.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term136505;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term136019, args);
        assertTrue(recursiveEquals(term136019, term136976));
        assertTrue(recursiveEquals(term136505, term136982));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


