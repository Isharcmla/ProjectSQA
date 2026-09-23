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
import java.util.HashMap;

public class Compiler_getSourceFileByName_510905469307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3018505;
     Object term3019331;

    public Compiler_getSourceFileByName_510905469307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3018553 = new HashMap();
        term3018505 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term3018505, term3018505.getClass(), "inputsByName", term3018553);
        HashMap term3019332 = new HashMap();
        term3019331 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term3019331, term3019331.getClass(), "options", null);
        setField(term3019331, term3019331.getClass(), "passes", null);
        setField(term3019331, term3019331.getClass(), "externs", null);
        setField(term3019331, term3019331.getClass(), "modules", null);
        setField(term3019331, term3019331.getClass(), "moduleGraph", null);
        setField(term3019331, term3019331.getClass(), "inputs", null);
        setField(term3019331, term3019331.getClass(), "errorManager", null);
        setField(term3019331, term3019331.getClass(), "externsRoot", null);
        setField(term3019331, term3019331.getClass(), "jsRoot", null);
        setField(term3019331, term3019331.getClass(), "externAndJsRoot", null);
        setField(term3019331, term3019331.getClass(), "inputsByName", term3019332);
        setField(term3019331, term3019331.getClass(), "sourceMap", null);
        setField(term3019331, term3019331.getClass(), "externExports", null);
        setIntField(term3019331, term3019331.getClass(), "uniqueNameId", 0);
        setBooleanField(term3019331, term3019331.getClass(), "normalized", false);
        setBooleanField(term3019331, term3019331.getClass(), "useThreads", false);
        setBooleanField(term3019331, term3019331.getClass(), "hasRegExpGlobalReferences", false);
        setField(term3019331, term3019331.getClass(), "functionInformationMap", null);
        setField(term3019331, term3019331.getClass(), "debugLog", null);
        setField(term3019331, term3019331.getClass(), "defaultCodingConvention", null);
        setField(term3019331, term3019331.getClass(), "typeRegistry", null);
        setField(term3019331, term3019331.getClass(), "parserConfig", null);
        setField(term3019331, term3019331.getClass(), "abstractInterpreter", null);
        setField(term3019331, term3019331.getClass(), "typeValidator", null);
        setField(term3019331, term3019331.getClass(), "tracker", null);
        setField(term3019331, term3019331.getClass(), "oldErrorReporter", null);
        setField(term3019331, term3019331.getClass(), "defaultErrorReporter", null);
        setField(term3019331, term3019331.getClass(), "outStream", null);
        setField(term3019331, term3019331.getClass(), "sanityCheck", null);
        setField(term3019331, term3019331.getClass(), "currentTracer", null);
        setField(term3019331, term3019331.getClass(), "currentPassName", null);
        setField(term3019331, term3019331.getClass(), "recentChange", null);
        setField(term3019331, term3019331.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getSourceFileByName", argTypes, term3018505, args);
        assertTrue(recursiveEquals(term3018505, term3019331));
        assertTrue(recursiveEquals(retValue, null));
    }

};


