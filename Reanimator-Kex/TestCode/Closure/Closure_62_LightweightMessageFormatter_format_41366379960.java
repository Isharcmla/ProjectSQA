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

public class LightweightMessageFormatter_format_41366379960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32682;
     Object term33016;
     Object term35441;
     Object term35446;

    public LightweightMessageFormatter_format_41366379960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term35450 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term35449 = ((Class) term35450).getDeclaredField((String) "REGION");
        ((Field) term35449).setAccessible(true);
        Object enum46 = ((Field) term35449).get((Object) null);
        term32682 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term32762 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term32682, term32682.getClass(), "source", term32762);
        setField(term32682, term32682.getClass(), "excerpt", enum46);
        term33016 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term33016, term33016.getClass(), "sourceName", "");
        setIntField(term33016, term33016.getClass(), "lineNumber", 0);
        Class<? extends Object> term35795 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term35794 = ((Class) term35795).getDeclaredField((String) "REGION");
        ((Field) term35794).setAccessible(true);
        Object enum47 = ((Field) term35794).get((Object) null);
        term35441 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term35445 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term35441, term35441.getClass(), "excerpt", enum47);
        setField(term35445, term35445.getClass(), "options", null);
        setField(term35445, term35445.getClass(), "passes", null);
        setField(term35445, term35445.getClass(), "externs", null);
        setField(term35445, term35445.getClass(), "modules", null);
        setField(term35445, term35445.getClass(), "moduleGraph", null);
        setField(term35445, term35445.getClass(), "inputs", null);
        setField(term35445, term35445.getClass(), "errorManager", null);
        setField(term35445, term35445.getClass(), "warningsGuard", null);
        setField(term35445, term35445.getClass(), "externsRoot", null);
        setField(term35445, term35445.getClass(), "jsRoot", null);
        setField(term35445, term35445.getClass(), "externAndJsRoot", null);
        setField(term35445, term35445.getClass(), "inputsByName", null);
        setField(term35445, term35445.getClass(), "sourceMap", null);
        setField(term35445, term35445.getClass(), "externExports", null);
        setIntField(term35445, term35445.getClass(), "uniqueNameId", 0);
        setBooleanField(term35445, term35445.getClass(), "useThreads", false);
        setBooleanField(term35445, term35445.getClass(), "hasRegExpGlobalReferences", false);
        setField(term35445, term35445.getClass(), "functionInformationMap", null);
        setField(term35445, term35445.getClass(), "debugLog", null);
        setField(term35445, term35445.getClass(), "defaultCodingConvention", null);
        setField(term35445, term35445.getClass(), "typeRegistry", null);
        setField(term35445, term35445.getClass(), "parserConfig", null);
        setField(term35445, term35445.getClass(), "abstractInterpreter", null);
        setField(term35445, term35445.getClass(), "typeValidator", null);
        setField(term35445, term35445.getClass(), "tracker", null);
        setField(term35445, term35445.getClass(), "oldErrorReporter", null);
        setField(term35445, term35445.getClass(), "defaultErrorReporter", null);
        setField(term35445, term35445.getClass(), "outStream", null);
        setField(term35445, term35445.getClass(), "globalRefMap", null);
        setField(term35445, term35445.getClass(), "sanityCheck", null);
        setField(term35445, term35445.getClass(), "currentTracer", null);
        setField(term35445, term35445.getClass(), "currentPassName", null);
        setField(term35445, term35445.getClass(), "recentChange", null);
        setField(term35445, term35445.getClass(), "codeChangeHandlers", null);
        setField(term35445, term35445.getClass(), "stage", null);
        setField(term35441, term35441.getClass(), "source", term35445);
        setBooleanField(term35441, term35441.getClass(), "colorize", false);
        term35446 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term35446, term35446.getClass(), "type", null);
        setField(term35446, term35446.getClass(), "description", null);
        setField(term35446, term35446.getClass(), "sourceName", "");
        setField(term35446, term35446.getClass(), "node", null);
        setIntField(term35446, term35446.getClass(), "lineNumber", 0);
        setField(term35446, term35446.getClass(), "level", null);
        setIntField(term35446, term35446.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term33016;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term32682, args);
        assertTrue(recursiveEquals(term32682, term35441));
        assertTrue(recursiveEquals(term33016, term35446));
        assertTrue(recursiveEquals(retValue, ": ERROR - null\n"));
    }

};


