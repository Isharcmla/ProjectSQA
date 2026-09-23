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

public class LightweightMessageFormatter_formatError_236602113188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154437;
     Object term154771;
     Object term156137;
     Object term156142;

    public LightweightMessageFormatter_formatError_236602113188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term156146 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term156145 = ((Class) term156146).getDeclaredField((String) "REGION");
        ((Field) term156145).setAccessible(true);
        Object enum178 = ((Field) term156145).get((Object) null);
        term154437 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term154517 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term154437, term154437.getClass(), "source", term154517);
        setField(term154437, term154437.getClass(), "excerpt", enum178);
        term154771 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term154771, term154771.getClass(), "sourceName", "");
        setIntField(term154771, term154771.getClass(), "lineNumber", 0);
        Class<? extends Object> term156491 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term156490 = ((Class) term156491).getDeclaredField((String) "REGION");
        ((Field) term156490).setAccessible(true);
        Object enum179 = ((Field) term156490).get((Object) null);
        term156137 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term156141 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term156137, term156137.getClass(), "excerpt", enum179);
        setField(term156141, term156141.getClass(), "options", null);
        setField(term156141, term156141.getClass(), "passes", null);
        setField(term156141, term156141.getClass(), "externs", null);
        setField(term156141, term156141.getClass(), "modules", null);
        setField(term156141, term156141.getClass(), "moduleGraph", null);
        setField(term156141, term156141.getClass(), "inputs", null);
        setField(term156141, term156141.getClass(), "errorManager", null);
        setField(term156141, term156141.getClass(), "warningsGuard", null);
        setField(term156141, term156141.getClass(), "externsRoot", null);
        setField(term156141, term156141.getClass(), "jsRoot", null);
        setField(term156141, term156141.getClass(), "externAndJsRoot", null);
        setField(term156141, term156141.getClass(), "inputsByName", null);
        setField(term156141, term156141.getClass(), "sourceMap", null);
        setField(term156141, term156141.getClass(), "externExports", null);
        setIntField(term156141, term156141.getClass(), "uniqueNameId", 0);
        setBooleanField(term156141, term156141.getClass(), "useThreads", false);
        setBooleanField(term156141, term156141.getClass(), "hasRegExpGlobalReferences", false);
        setField(term156141, term156141.getClass(), "functionInformationMap", null);
        setField(term156141, term156141.getClass(), "debugLog", null);
        setField(term156141, term156141.getClass(), "defaultCodingConvention", null);
        setField(term156141, term156141.getClass(), "typeRegistry", null);
        setField(term156141, term156141.getClass(), "parserConfig", null);
        setField(term156141, term156141.getClass(), "abstractInterpreter", null);
        setField(term156141, term156141.getClass(), "typeValidator", null);
        setField(term156141, term156141.getClass(), "tracker", null);
        setField(term156141, term156141.getClass(), "oldErrorReporter", null);
        setField(term156141, term156141.getClass(), "defaultErrorReporter", null);
        setField(term156141, term156141.getClass(), "outStream", null);
        setField(term156141, term156141.getClass(), "globalRefMap", null);
        setField(term156141, term156141.getClass(), "sanityCheck", null);
        setField(term156141, term156141.getClass(), "currentTracer", null);
        setField(term156141, term156141.getClass(), "currentPassName", null);
        setField(term156141, term156141.getClass(), "recentChange", null);
        setField(term156141, term156141.getClass(), "codeChangeHandlers", null);
        setField(term156141, term156141.getClass(), "stage", null);
        setField(term156137, term156137.getClass(), "source", term156141);
        setBooleanField(term156137, term156137.getClass(), "colorize", false);
        term156142 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term156142, term156142.getClass(), "type", null);
        setField(term156142, term156142.getClass(), "description", null);
        setField(term156142, term156142.getClass(), "sourceName", "");
        setField(term156142, term156142.getClass(), "node", null);
        setIntField(term156142, term156142.getClass(), "lineNumber", 0);
        setField(term156142, term156142.getClass(), "level", null);
        setIntField(term156142, term156142.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term154771;
        Object retValue = callMethod(klass, "formatError", argTypes, term154437, args);
        assertTrue(recursiveEquals(term154437, term156137));
        assertTrue(recursiveEquals(term154771, term156142));
        assertTrue(recursiveEquals(retValue, ": ERROR - null\n"));
    }

};


