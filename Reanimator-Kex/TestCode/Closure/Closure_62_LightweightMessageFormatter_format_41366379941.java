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

public class LightweightMessageFormatter_format_41366379941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21816;
     Object term22150;
     Object term22616;
     Object term22621;

    public LightweightMessageFormatter_format_41366379941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22623 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term22622 = ((Class) term22623).getDeclaredField((String) "REGION");
        ((Field) term22622).setAccessible(true);
        Object enum39 = ((Field) term22622).get((Object) null);
        term21816 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term21896 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term21816, term21816.getClass(), "source", term21896);
        setField(term21816, term21816.getClass(), "excerpt", enum39);
        term22150 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term22150, term22150.getClass(), "sourceName", null);
        setIntField(term22150, term22150.getClass(), "lineNumber", 0);
        Class<? extends Object> term22968 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term22967 = ((Class) term22968).getDeclaredField((String) "REGION");
        ((Field) term22967).setAccessible(true);
        Object enum40 = ((Field) term22967).get((Object) null);
        term22616 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term22620 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term22616, term22616.getClass(), "excerpt", enum40);
        setField(term22620, term22620.getClass(), "options", null);
        setField(term22620, term22620.getClass(), "passes", null);
        setField(term22620, term22620.getClass(), "externs", null);
        setField(term22620, term22620.getClass(), "modules", null);
        setField(term22620, term22620.getClass(), "moduleGraph", null);
        setField(term22620, term22620.getClass(), "inputs", null);
        setField(term22620, term22620.getClass(), "errorManager", null);
        setField(term22620, term22620.getClass(), "warningsGuard", null);
        setField(term22620, term22620.getClass(), "externsRoot", null);
        setField(term22620, term22620.getClass(), "jsRoot", null);
        setField(term22620, term22620.getClass(), "externAndJsRoot", null);
        setField(term22620, term22620.getClass(), "inputsByName", null);
        setField(term22620, term22620.getClass(), "sourceMap", null);
        setField(term22620, term22620.getClass(), "externExports", null);
        setIntField(term22620, term22620.getClass(), "uniqueNameId", 0);
        setBooleanField(term22620, term22620.getClass(), "useThreads", false);
        setBooleanField(term22620, term22620.getClass(), "hasRegExpGlobalReferences", false);
        setField(term22620, term22620.getClass(), "functionInformationMap", null);
        setField(term22620, term22620.getClass(), "debugLog", null);
        setField(term22620, term22620.getClass(), "defaultCodingConvention", null);
        setField(term22620, term22620.getClass(), "typeRegistry", null);
        setField(term22620, term22620.getClass(), "parserConfig", null);
        setField(term22620, term22620.getClass(), "abstractInterpreter", null);
        setField(term22620, term22620.getClass(), "typeValidator", null);
        setField(term22620, term22620.getClass(), "tracker", null);
        setField(term22620, term22620.getClass(), "oldErrorReporter", null);
        setField(term22620, term22620.getClass(), "defaultErrorReporter", null);
        setField(term22620, term22620.getClass(), "outStream", null);
        setField(term22620, term22620.getClass(), "globalRefMap", null);
        setField(term22620, term22620.getClass(), "sanityCheck", null);
        setField(term22620, term22620.getClass(), "currentTracer", null);
        setField(term22620, term22620.getClass(), "currentPassName", null);
        setField(term22620, term22620.getClass(), "recentChange", null);
        setField(term22620, term22620.getClass(), "codeChangeHandlers", null);
        setField(term22620, term22620.getClass(), "stage", null);
        setField(term22616, term22616.getClass(), "source", term22620);
        setBooleanField(term22616, term22616.getClass(), "colorize", false);
        term22621 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term22621, term22621.getClass(), "type", null);
        setField(term22621, term22621.getClass(), "description", null);
        setField(term22621, term22621.getClass(), "sourceName", null);
        setField(term22621, term22621.getClass(), "node", null);
        setIntField(term22621, term22621.getClass(), "lineNumber", 0);
        setField(term22621, term22621.getClass(), "level", null);
        setIntField(term22621, term22621.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term22150;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term21816, args);
        assertTrue(recursiveEquals(term21816, term22616));
        assertTrue(recursiveEquals(term22150, term22621));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


