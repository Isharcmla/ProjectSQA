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

public class LightweightMessageFormatter_formatWarning_2030513493359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term302752;
     Object term303238;
     Object term303789;
     Object term303795;

    public LightweightMessageFormatter_formatWarning_2030513493359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term302880 = new HashMap();
        Class<? extends Object> term303799 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term303798 = ((Class) term303799).getDeclaredField((String) "REGION");
        ((Field) term303798).setAccessible(true);
        Object enum360 = ((Field) term303798).get((Object) null);
        term302752 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term302832 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term302832, term302832.getClass(), "inputsByName", term302880);
        setField(term302752, term302752.getClass(), "source", term302832);
        setField(term302752, term302752.getClass(), "excerpt", enum360);
        term303238 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term303238, term303238.getClass(), "sourceName", "");
        setIntField(term303238, term303238.getClass(), "lineNumber", 2);
        Class<? extends Object> term304144 = Class.forName((String) "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt");
        Field term304143 = ((Class) term304144).getDeclaredField((String) "REGION");
        ((Field) term304143).setAccessible(true);
        Object enum361 = ((Field) term304143).get((Object) null);
        HashMap term303794 = new HashMap();
        term303789 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        Object term303793 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term303789, term303789.getClass(), "excerpt", enum361);
        setField(term303793, term303793.getClass(), "options", null);
        setField(term303793, term303793.getClass(), "passes", null);
        setField(term303793, term303793.getClass(), "externs", null);
        setField(term303793, term303793.getClass(), "modules", null);
        setField(term303793, term303793.getClass(), "moduleGraph", null);
        setField(term303793, term303793.getClass(), "inputs", null);
        setField(term303793, term303793.getClass(), "errorManager", null);
        setField(term303793, term303793.getClass(), "warningsGuard", null);
        setField(term303793, term303793.getClass(), "externsRoot", null);
        setField(term303793, term303793.getClass(), "jsRoot", null);
        setField(term303793, term303793.getClass(), "externAndJsRoot", null);
        setField(term303793, term303793.getClass(), "inputsByName", term303794);
        setField(term303793, term303793.getClass(), "sourceMap", null);
        setField(term303793, term303793.getClass(), "externExports", null);
        setIntField(term303793, term303793.getClass(), "uniqueNameId", 0);
        setBooleanField(term303793, term303793.getClass(), "useThreads", false);
        setBooleanField(term303793, term303793.getClass(), "hasRegExpGlobalReferences", false);
        setField(term303793, term303793.getClass(), "functionInformationMap", null);
        setField(term303793, term303793.getClass(), "debugLog", null);
        setField(term303793, term303793.getClass(), "defaultCodingConvention", null);
        setField(term303793, term303793.getClass(), "typeRegistry", null);
        setField(term303793, term303793.getClass(), "parserConfig", null);
        setField(term303793, term303793.getClass(), "abstractInterpreter", null);
        setField(term303793, term303793.getClass(), "typeValidator", null);
        setField(term303793, term303793.getClass(), "tracker", null);
        setField(term303793, term303793.getClass(), "oldErrorReporter", null);
        setField(term303793, term303793.getClass(), "defaultErrorReporter", null);
        setField(term303793, term303793.getClass(), "outStream", null);
        setField(term303793, term303793.getClass(), "globalRefMap", null);
        setField(term303793, term303793.getClass(), "sanityCheck", null);
        setField(term303793, term303793.getClass(), "currentTracer", null);
        setField(term303793, term303793.getClass(), "currentPassName", null);
        setField(term303793, term303793.getClass(), "recentChange", null);
        setField(term303793, term303793.getClass(), "codeChangeHandlers", null);
        setField(term303793, term303793.getClass(), "stage", null);
        setField(term303789, term303789.getClass(), "source", term303793);
        setBooleanField(term303789, term303789.getClass(), "colorize", false);
        term303795 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term303795, term303795.getClass(), "type", null);
        setField(term303795, term303795.getClass(), "description", null);
        setField(term303795, term303795.getClass(), "sourceName", "");
        setField(term303795, term303795.getClass(), "node", null);
        setIntField(term303795, term303795.getClass(), "lineNumber", 2);
        setField(term303795, term303795.getClass(), "level", null);
        setIntField(term303795, term303795.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term303238;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term302752, args);
        assertTrue(recursiveEquals(term302752, term303789));
        assertTrue(recursiveEquals(term303238, term303795));
        assertTrue(recursiveEquals(retValue, ":2: WARNING - null\n"));
    }

};


