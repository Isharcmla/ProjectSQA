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

public class LightweightMessageFormatter_format_413663799365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309976;
     Object term310462;
     Object term310980;
     Object term310986;

    public LightweightMessageFormatter_format_413663799365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term310104 = new HashMap();
        Class<? extends Object> term310990 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term310989 = ((Class) term310990).getDeclaredField((String) "REGION");
        ((Field) term310989).setAccessible(true);
        Object enum369 = ((Field) term310989).get((Object) null);
        term309976 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term310056 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term310056, term310056.getClass(), "inputsByName", term310104);
        setField(term309976, term309976.getClass(), "source", term310056);
        setField(term309976, term309976.getClass(), "excerpt", enum369);
        term310462 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term310462, term310462.getClass(), "sourceName", "");
        setIntField(term310462, term310462.getClass(), "lineNumber", 1);
        Class<? extends Object> term311335 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term311334 = ((Class) term311335).getDeclaredField((String) "REGION");
        ((Field) term311334).setAccessible(true);
        Object enum370 = ((Field) term311334).get((Object) null);
        HashMap term310985 = new HashMap();
        term310980 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term310984 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term310980, term310980.getClass(), "excerpt", enum370);
        setField(term310984, term310984.getClass(), "options", null);
        setField(term310984, term310984.getClass(), "passes", null);
        setField(term310984, term310984.getClass(), "externs", null);
        setField(term310984, term310984.getClass(), "modules", null);
        setField(term310984, term310984.getClass(), "moduleGraph", null);
        setField(term310984, term310984.getClass(), "inputs", null);
        setField(term310984, term310984.getClass(), "errorManager", null);
        setField(term310984, term310984.getClass(), "warningsGuard", null);
        setField(term310984, term310984.getClass(), "externsRoot", null);
        setField(term310984, term310984.getClass(), "jsRoot", null);
        setField(term310984, term310984.getClass(), "externAndJsRoot", null);
        setField(term310984, term310984.getClass(), "inputsByName", term310985);
        setField(term310984, term310984.getClass(), "sourceMap", null);
        setField(term310984, term310984.getClass(), "externExports", null);
        setIntField(term310984, term310984.getClass(), "uniqueNameId", 0);
        setBooleanField(term310984, term310984.getClass(), "useThreads", false);
        setBooleanField(term310984, term310984.getClass(), "hasRegExpGlobalReferences", false);
        setField(term310984, term310984.getClass(), "functionInformationMap", null);
        setField(term310984, term310984.getClass(), "debugLog", null);
        setField(term310984, term310984.getClass(), "defaultCodingConvention", null);
        setField(term310984, term310984.getClass(), "typeRegistry", null);
        setField(term310984, term310984.getClass(), "parserConfig", null);
        setField(term310984, term310984.getClass(), "abstractInterpreter", null);
        setField(term310984, term310984.getClass(), "typeValidator", null);
        setField(term310984, term310984.getClass(), "tracker", null);
        setField(term310984, term310984.getClass(), "oldErrorReporter", null);
        setField(term310984, term310984.getClass(), "defaultErrorReporter", null);
        setField(term310984, term310984.getClass(), "outStream", null);
        setField(term310984, term310984.getClass(), "globalRefMap", null);
        setField(term310984, term310984.getClass(), "sanityCheck", null);
        setField(term310984, term310984.getClass(), "currentTracer", null);
        setField(term310984, term310984.getClass(), "currentPassName", null);
        setField(term310984, term310984.getClass(), "recentChange", null);
        setField(term310984, term310984.getClass(), "codeChangeHandlers", null);
        setField(term310984, term310984.getClass(), "stage", null);
        setField(term310980, term310980.getClass(), "source", term310984);
        setBooleanField(term310980, term310980.getClass(), "colorize", false);
        term310986 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term310986, term310986.getClass(), "type", null);
        setField(term310986, term310986.getClass(), "description", null);
        setField(term310986, term310986.getClass(), "sourceName", "");
        setField(term310986, term310986.getClass(), "node", null);
        setIntField(term310986, term310986.getClass(), "lineNumber", 1);
        setField(term310986, term310986.getClass(), "level", null);
        setIntField(term310986, term310986.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term310462;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term309976, args);
        assertTrue(recursiveEquals(term309976, term310980));
        assertTrue(recursiveEquals(term310462, term310986));
        assertTrue(recursiveEquals(retValue, ":1: ERROR - null\n"));
    }

};


