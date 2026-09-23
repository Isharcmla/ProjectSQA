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

public class LightweightMessageFormatter_formatError_236602113219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189817;
     Object term190303;
     Object term190859;
     Object term190865;

    public LightweightMessageFormatter_formatError_236602113219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term189945 = new HashMap();
        Class<? extends Object> term190867 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term190866 = ((Class) term190867).getDeclaredField((String) "REGION");
        ((Field) term190866).setAccessible(true);
        Object enum225 = ((Field) term190866).get((Object) null);
        term189817 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term189897 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term189897, term189897.getClass(), "inputsByName", term189945);
        setField(term189817, term189817.getClass(), "source", term189897);
        setField(term189817, term189817.getClass(), "excerpt", enum225);
        setBooleanField(term189817, term189817.getClass(), "colorize", true);
        term190303 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term190303, term190303.getClass(), "sourceName", null);
        setIntField(term190303, term190303.getClass(), "lineNumber", 1);
        Class<? extends Object> term191212 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term191211 = ((Class) term191212).getDeclaredField((String) "REGION");
        ((Field) term191211).setAccessible(true);
        Object enum226 = ((Field) term191211).get((Object) null);
        HashMap term190864 = new HashMap();
        term190859 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term190863 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term190859, term190859.getClass(), "excerpt", enum226);
        setField(term190863, term190863.getClass(), "options", null);
        setField(term190863, term190863.getClass(), "passes", null);
        setField(term190863, term190863.getClass(), "externs", null);
        setField(term190863, term190863.getClass(), "modules", null);
        setField(term190863, term190863.getClass(), "moduleGraph", null);
        setField(term190863, term190863.getClass(), "inputs", null);
        setField(term190863, term190863.getClass(), "errorManager", null);
        setField(term190863, term190863.getClass(), "warningsGuard", null);
        setField(term190863, term190863.getClass(), "externsRoot", null);
        setField(term190863, term190863.getClass(), "jsRoot", null);
        setField(term190863, term190863.getClass(), "externAndJsRoot", null);
        setField(term190863, term190863.getClass(), "inputsByName", term190864);
        setField(term190863, term190863.getClass(), "sourceMap", null);
        setField(term190863, term190863.getClass(), "externExports", null);
        setIntField(term190863, term190863.getClass(), "uniqueNameId", 0);
        setBooleanField(term190863, term190863.getClass(), "useThreads", false);
        setBooleanField(term190863, term190863.getClass(), "hasRegExpGlobalReferences", false);
        setField(term190863, term190863.getClass(), "functionInformationMap", null);
        setField(term190863, term190863.getClass(), "debugLog", null);
        setField(term190863, term190863.getClass(), "defaultCodingConvention", null);
        setField(term190863, term190863.getClass(), "typeRegistry", null);
        setField(term190863, term190863.getClass(), "parserConfig", null);
        setField(term190863, term190863.getClass(), "abstractInterpreter", null);
        setField(term190863, term190863.getClass(), "typeValidator", null);
        setField(term190863, term190863.getClass(), "tracker", null);
        setField(term190863, term190863.getClass(), "oldErrorReporter", null);
        setField(term190863, term190863.getClass(), "defaultErrorReporter", null);
        setField(term190863, term190863.getClass(), "outStream", null);
        setField(term190863, term190863.getClass(), "globalRefMap", null);
        setField(term190863, term190863.getClass(), "sanityCheck", null);
        setField(term190863, term190863.getClass(), "currentTracer", null);
        setField(term190863, term190863.getClass(), "currentPassName", null);
        setField(term190863, term190863.getClass(), "recentChange", null);
        setField(term190863, term190863.getClass(), "codeChangeHandlers", null);
        setField(term190863, term190863.getClass(), "stage", null);
        setField(term190859, term190859.getClass(), "source", term190863);
        setBooleanField(term190859, term190859.getClass(), "colorize", true);
        term190865 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term190865, term190865.getClass(), "type", null);
        setField(term190865, term190865.getClass(), "description", null);
        setField(term190865, term190865.getClass(), "sourceName", null);
        setField(term190865, term190865.getClass(), "node", null);
        setIntField(term190865, term190865.getClass(), "lineNumber", 1);
        setField(term190865, term190865.getClass(), "level", null);
        setIntField(term190865, term190865.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term190303;
        Object retValue = callMethod(klass, "formatError", argTypes, term189817, args);
        assertTrue(recursiveEquals(term189817, term190859));
        assertTrue(recursiveEquals(term190303, term190865));
        assertTrue(recursiveEquals(retValue, "\u001B[31mERROR\u001B[39m - null\n"));
    }

};


