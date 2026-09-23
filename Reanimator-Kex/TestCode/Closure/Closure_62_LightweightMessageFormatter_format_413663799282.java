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

public class LightweightMessageFormatter_format_413663799282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241287;
     Object term241621;
     Object term242444;
     Object term242449;

    public LightweightMessageFormatter_format_413663799282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term242451 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term242450 = ((Class) term242451).getDeclaredField((String) "REGION");
        ((Field) term242450).setAccessible(true);
        Object enum288 = ((Field) term242450).get((Object) null);
        term241287 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term241367 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term241287, term241287.getClass(), "source", term241367);
        setField(term241287, term241287.getClass(), "excerpt", enum288);
        term241621 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term241621, term241621.getClass(), "sourceName", null);
        setIntField(term241621, term241621.getClass(), "lineNumber", 0);
        Class<? extends Object> term242796 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term242795 = ((Class) term242796).getDeclaredField((String) "REGION");
        ((Field) term242795).setAccessible(true);
        Object enum289 = ((Field) term242795).get((Object) null);
        term242444 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term242448 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term242444, term242444.getClass(), "excerpt", enum289);
        setField(term242448, term242448.getClass(), "options", null);
        setField(term242448, term242448.getClass(), "passes", null);
        setField(term242448, term242448.getClass(), "externs", null);
        setField(term242448, term242448.getClass(), "modules", null);
        setField(term242448, term242448.getClass(), "moduleGraph", null);
        setField(term242448, term242448.getClass(), "inputs", null);
        setField(term242448, term242448.getClass(), "errorManager", null);
        setField(term242448, term242448.getClass(), "warningsGuard", null);
        setField(term242448, term242448.getClass(), "externsRoot", null);
        setField(term242448, term242448.getClass(), "jsRoot", null);
        setField(term242448, term242448.getClass(), "externAndJsRoot", null);
        setField(term242448, term242448.getClass(), "inputsByName", null);
        setField(term242448, term242448.getClass(), "sourceMap", null);
        setField(term242448, term242448.getClass(), "externExports", null);
        setIntField(term242448, term242448.getClass(), "uniqueNameId", 0);
        setBooleanField(term242448, term242448.getClass(), "useThreads", false);
        setBooleanField(term242448, term242448.getClass(), "hasRegExpGlobalReferences", false);
        setField(term242448, term242448.getClass(), "functionInformationMap", null);
        setField(term242448, term242448.getClass(), "debugLog", null);
        setField(term242448, term242448.getClass(), "defaultCodingConvention", null);
        setField(term242448, term242448.getClass(), "typeRegistry", null);
        setField(term242448, term242448.getClass(), "parserConfig", null);
        setField(term242448, term242448.getClass(), "abstractInterpreter", null);
        setField(term242448, term242448.getClass(), "typeValidator", null);
        setField(term242448, term242448.getClass(), "tracker", null);
        setField(term242448, term242448.getClass(), "oldErrorReporter", null);
        setField(term242448, term242448.getClass(), "defaultErrorReporter", null);
        setField(term242448, term242448.getClass(), "outStream", null);
        setField(term242448, term242448.getClass(), "globalRefMap", null);
        setField(term242448, term242448.getClass(), "sanityCheck", null);
        setField(term242448, term242448.getClass(), "currentTracer", null);
        setField(term242448, term242448.getClass(), "currentPassName", null);
        setField(term242448, term242448.getClass(), "recentChange", null);
        setField(term242448, term242448.getClass(), "codeChangeHandlers", null);
        setField(term242448, term242448.getClass(), "stage", null);
        setField(term242444, term242444.getClass(), "source", term242448);
        setBooleanField(term242444, term242444.getClass(), "colorize", false);
        term242449 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term242449, term242449.getClass(), "type", null);
        setField(term242449, term242449.getClass(), "description", null);
        setField(term242449, term242449.getClass(), "sourceName", null);
        setField(term242449, term242449.getClass(), "node", null);
        setIntField(term242449, term242449.getClass(), "lineNumber", 0);
        setField(term242449, term242449.getClass(), "level", null);
        setIntField(term242449, term242449.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term241621;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term241287, args);
        assertTrue(recursiveEquals(term241287, term242444));
        assertTrue(recursiveEquals(term241621, term242449));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


