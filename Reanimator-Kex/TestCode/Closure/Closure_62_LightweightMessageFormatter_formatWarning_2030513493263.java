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

public class LightweightMessageFormatter_formatWarning_2030513493263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229871;
     Object term230357;
     Object term230869;
     Object term230875;

    public LightweightMessageFormatter_formatWarning_2030513493263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term229999 = new HashMap();
        Class<? extends Object> term230877 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term230876 = ((Class) term230877).getDeclaredField((String) "REGION");
        ((Field) term230876).setAccessible(true);
        Object enum276 = ((Field) term230876).get((Object) null);
        term229871 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term229951 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term229951, term229951.getClass(), "inputsByName", term229999);
        setField(term229871, term229871.getClass(), "source", term229951);
        setField(term229871, term229871.getClass(), "excerpt", enum276);
        term230357 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term230357, term230357.getClass(), "sourceName", null);
        setIntField(term230357, term230357.getClass(), "lineNumber", 1);
        Class<? extends Object> term231222 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term231221 = ((Class) term231222).getDeclaredField((String) "REGION");
        ((Field) term231221).setAccessible(true);
        Object enum277 = ((Field) term231221).get((Object) null);
        HashMap term230874 = new HashMap();
        term230869 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term230873 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term230869, term230869.getClass(), "excerpt", enum277);
        setField(term230873, term230873.getClass(), "options", null);
        setField(term230873, term230873.getClass(), "passes", null);
        setField(term230873, term230873.getClass(), "externs", null);
        setField(term230873, term230873.getClass(), "modules", null);
        setField(term230873, term230873.getClass(), "moduleGraph", null);
        setField(term230873, term230873.getClass(), "inputs", null);
        setField(term230873, term230873.getClass(), "errorManager", null);
        setField(term230873, term230873.getClass(), "warningsGuard", null);
        setField(term230873, term230873.getClass(), "externsRoot", null);
        setField(term230873, term230873.getClass(), "jsRoot", null);
        setField(term230873, term230873.getClass(), "externAndJsRoot", null);
        setField(term230873, term230873.getClass(), "inputsByName", term230874);
        setField(term230873, term230873.getClass(), "sourceMap", null);
        setField(term230873, term230873.getClass(), "externExports", null);
        setIntField(term230873, term230873.getClass(), "uniqueNameId", 0);
        setBooleanField(term230873, term230873.getClass(), "useThreads", false);
        setBooleanField(term230873, term230873.getClass(), "hasRegExpGlobalReferences", false);
        setField(term230873, term230873.getClass(), "functionInformationMap", null);
        setField(term230873, term230873.getClass(), "debugLog", null);
        setField(term230873, term230873.getClass(), "defaultCodingConvention", null);
        setField(term230873, term230873.getClass(), "typeRegistry", null);
        setField(term230873, term230873.getClass(), "parserConfig", null);
        setField(term230873, term230873.getClass(), "abstractInterpreter", null);
        setField(term230873, term230873.getClass(), "typeValidator", null);
        setField(term230873, term230873.getClass(), "tracker", null);
        setField(term230873, term230873.getClass(), "oldErrorReporter", null);
        setField(term230873, term230873.getClass(), "defaultErrorReporter", null);
        setField(term230873, term230873.getClass(), "outStream", null);
        setField(term230873, term230873.getClass(), "globalRefMap", null);
        setField(term230873, term230873.getClass(), "sanityCheck", null);
        setField(term230873, term230873.getClass(), "currentTracer", null);
        setField(term230873, term230873.getClass(), "currentPassName", null);
        setField(term230873, term230873.getClass(), "recentChange", null);
        setField(term230873, term230873.getClass(), "codeChangeHandlers", null);
        setField(term230873, term230873.getClass(), "stage", null);
        setField(term230869, term230869.getClass(), "source", term230873);
        setBooleanField(term230869, term230869.getClass(), "colorize", false);
        term230875 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term230875, term230875.getClass(), "type", null);
        setField(term230875, term230875.getClass(), "description", null);
        setField(term230875, term230875.getClass(), "sourceName", null);
        setField(term230875, term230875.getClass(), "node", null);
        setIntField(term230875, term230875.getClass(), "lineNumber", 1);
        setField(term230875, term230875.getClass(), "level", null);
        setIntField(term230875, term230875.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term230357;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term229871, args);
        assertTrue(recursiveEquals(term229871, term230869));
        assertTrue(recursiveEquals(term230357, term230875));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


