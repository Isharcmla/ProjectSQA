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

public class LightweightMessageFormatter_format_41366379993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60461;
     Object term60795;
     Object term61306;
     Object term61311;

    public LightweightMessageFormatter_format_41366379993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term61315 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term61314 = ((Class) term61315).getDeclaredField((String) "REGION");
        ((Field) term61314).setAccessible(true);
        Object enum75 = ((Field) term61314).get((Object) null);
        term60461 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term60541 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term60461, term60461.getClass(), "source", term60541);
        setField(term60461, term60461.getClass(), "excerpt", enum75);
        term60795 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term60795, term60795.getClass(), "sourceName", "");
        setIntField(term60795, term60795.getClass(), "lineNumber", 0);
        Class<? extends Object> term61660 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term61659 = ((Class) term61660).getDeclaredField((String) "REGION");
        ((Field) term61659).setAccessible(true);
        Object enum76 = ((Field) term61659).get((Object) null);
        term61306 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term61310 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term61306, term61306.getClass(), "excerpt", enum76);
        setField(term61310, term61310.getClass(), "options", null);
        setField(term61310, term61310.getClass(), "passes", null);
        setField(term61310, term61310.getClass(), "externs", null);
        setField(term61310, term61310.getClass(), "modules", null);
        setField(term61310, term61310.getClass(), "moduleGraph", null);
        setField(term61310, term61310.getClass(), "inputs", null);
        setField(term61310, term61310.getClass(), "errorManager", null);
        setField(term61310, term61310.getClass(), "warningsGuard", null);
        setField(term61310, term61310.getClass(), "externsRoot", null);
        setField(term61310, term61310.getClass(), "jsRoot", null);
        setField(term61310, term61310.getClass(), "externAndJsRoot", null);
        setField(term61310, term61310.getClass(), "inputsByName", null);
        setField(term61310, term61310.getClass(), "sourceMap", null);
        setField(term61310, term61310.getClass(), "externExports", null);
        setIntField(term61310, term61310.getClass(), "uniqueNameId", 0);
        setBooleanField(term61310, term61310.getClass(), "useThreads", false);
        setBooleanField(term61310, term61310.getClass(), "hasRegExpGlobalReferences", false);
        setField(term61310, term61310.getClass(), "functionInformationMap", null);
        setField(term61310, term61310.getClass(), "debugLog", null);
        setField(term61310, term61310.getClass(), "defaultCodingConvention", null);
        setField(term61310, term61310.getClass(), "typeRegistry", null);
        setField(term61310, term61310.getClass(), "parserConfig", null);
        setField(term61310, term61310.getClass(), "abstractInterpreter", null);
        setField(term61310, term61310.getClass(), "typeValidator", null);
        setField(term61310, term61310.getClass(), "tracker", null);
        setField(term61310, term61310.getClass(), "oldErrorReporter", null);
        setField(term61310, term61310.getClass(), "defaultErrorReporter", null);
        setField(term61310, term61310.getClass(), "outStream", null);
        setField(term61310, term61310.getClass(), "globalRefMap", null);
        setField(term61310, term61310.getClass(), "sanityCheck", null);
        setField(term61310, term61310.getClass(), "currentTracer", null);
        setField(term61310, term61310.getClass(), "currentPassName", null);
        setField(term61310, term61310.getClass(), "recentChange", null);
        setField(term61310, term61310.getClass(), "codeChangeHandlers", null);
        setField(term61310, term61310.getClass(), "stage", null);
        setField(term61306, term61306.getClass(), "source", term61310);
        setBooleanField(term61306, term61306.getClass(), "colorize", false);
        term61311 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term61311, term61311.getClass(), "type", null);
        setField(term61311, term61311.getClass(), "description", null);
        setField(term61311, term61311.getClass(), "sourceName", "");
        setField(term61311, term61311.getClass(), "node", null);
        setIntField(term61311, term61311.getClass(), "lineNumber", 0);
        setField(term61311, term61311.getClass(), "level", null);
        setIntField(term61311, term61311.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term60795;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term60461, args);
        assertTrue(recursiveEquals(term60461, term61306));
        assertTrue(recursiveEquals(term60795, term61311));
        assertTrue(recursiveEquals(retValue, ": ERROR - null\n"));
    }

};


