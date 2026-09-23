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

public class LightweightMessageFormatter_format_413663799163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127831;
     Object term128317;
     Object term129717;
     Object term129723;

    public LightweightMessageFormatter_format_413663799163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term127959 = new HashMap();
        Class<? extends Object> term129725 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term129724 = ((Class) term129725).getDeclaredField((String) "REGION");
        ((Field) term129724).setAccessible(true);
        Object enum144 = ((Field) term129724).get((Object) null);
        term127831 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term127911 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term127911, term127911.getClass(), "inputsByName", term127959);
        setField(term127831, term127831.getClass(), "source", term127911);
        setField(term127831, term127831.getClass(), "excerpt", enum144);
        term128317 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term128317, term128317.getClass(), "sourceName", null);
        setIntField(term128317, term128317.getClass(), "lineNumber", 1);
        Class<? extends Object> term130070 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term130069 = ((Class) term130070).getDeclaredField((String) "REGION");
        ((Field) term130069).setAccessible(true);
        Object enum145 = ((Field) term130069).get((Object) null);
        HashMap term129722 = new HashMap();
        term129717 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term129721 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term129717, term129717.getClass(), "excerpt", enum145);
        setField(term129721, term129721.getClass(), "options", null);
        setField(term129721, term129721.getClass(), "passes", null);
        setField(term129721, term129721.getClass(), "externs", null);
        setField(term129721, term129721.getClass(), "modules", null);
        setField(term129721, term129721.getClass(), "moduleGraph", null);
        setField(term129721, term129721.getClass(), "inputs", null);
        setField(term129721, term129721.getClass(), "errorManager", null);
        setField(term129721, term129721.getClass(), "warningsGuard", null);
        setField(term129721, term129721.getClass(), "externsRoot", null);
        setField(term129721, term129721.getClass(), "jsRoot", null);
        setField(term129721, term129721.getClass(), "externAndJsRoot", null);
        setField(term129721, term129721.getClass(), "inputsByName", term129722);
        setField(term129721, term129721.getClass(), "sourceMap", null);
        setField(term129721, term129721.getClass(), "externExports", null);
        setIntField(term129721, term129721.getClass(), "uniqueNameId", 0);
        setBooleanField(term129721, term129721.getClass(), "useThreads", false);
        setBooleanField(term129721, term129721.getClass(), "hasRegExpGlobalReferences", false);
        setField(term129721, term129721.getClass(), "functionInformationMap", null);
        setField(term129721, term129721.getClass(), "debugLog", null);
        setField(term129721, term129721.getClass(), "defaultCodingConvention", null);
        setField(term129721, term129721.getClass(), "typeRegistry", null);
        setField(term129721, term129721.getClass(), "parserConfig", null);
        setField(term129721, term129721.getClass(), "abstractInterpreter", null);
        setField(term129721, term129721.getClass(), "typeValidator", null);
        setField(term129721, term129721.getClass(), "tracker", null);
        setField(term129721, term129721.getClass(), "oldErrorReporter", null);
        setField(term129721, term129721.getClass(), "defaultErrorReporter", null);
        setField(term129721, term129721.getClass(), "outStream", null);
        setField(term129721, term129721.getClass(), "globalRefMap", null);
        setField(term129721, term129721.getClass(), "sanityCheck", null);
        setField(term129721, term129721.getClass(), "currentTracer", null);
        setField(term129721, term129721.getClass(), "currentPassName", null);
        setField(term129721, term129721.getClass(), "recentChange", null);
        setField(term129721, term129721.getClass(), "codeChangeHandlers", null);
        setField(term129721, term129721.getClass(), "stage", null);
        setField(term129717, term129717.getClass(), "source", term129721);
        setBooleanField(term129717, term129717.getClass(), "colorize", false);
        term129723 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term129723, term129723.getClass(), "type", null);
        setField(term129723, term129723.getClass(), "description", null);
        setField(term129723, term129723.getClass(), "sourceName", null);
        setField(term129723, term129723.getClass(), "node", null);
        setIntField(term129723, term129723.getClass(), "lineNumber", 1);
        setField(term129723, term129723.getClass(), "level", null);
        setIntField(term129723, term129723.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term128317;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term127831, args);
        assertTrue(recursiveEquals(term127831, term129717));
        assertTrue(recursiveEquals(term128317, term129723));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


