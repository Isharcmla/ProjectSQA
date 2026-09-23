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

public class Compiler_normalize_2117921788223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977962;

    public Compiler_normalize_2117921788223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977962 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term977962, term977962.getClass(), "options", null);
        setField(term977962, term977962.getClass(), "passes", null);
        setField(term977962, term977962.getClass(), "externs", null);
        setField(term977962, term977962.getClass(), "modules", null);
        setField(term977962, term977962.getClass(), "moduleGraph", null);
        setField(term977962, term977962.getClass(), "inputs", null);
        setField(term977962, term977962.getClass(), "errorManager", null);
        setField(term977962, term977962.getClass(), "warningsGuard", null);
        setField(term977962, term977962.getClass(), "externsRoot", null);
        setField(term977962, term977962.getClass(), "jsRoot", null);
        setField(term977962, term977962.getClass(), "externAndJsRoot", null);
        setField(term977962, term977962.getClass(), "inputsByName", null);
        setField(term977962, term977962.getClass(), "sourceMap", null);
        setField(term977962, term977962.getClass(), "externExports", null);
        setIntField(term977962, term977962.getClass(), "uniqueNameId", 0);
        setBooleanField(term977962, term977962.getClass(), "useThreads", false);
        setBooleanField(term977962, term977962.getClass(), "hasRegExpGlobalReferences", false);
        setField(term977962, term977962.getClass(), "functionInformationMap", null);
        setField(term977962, term977962.getClass(), "debugLog", null);
        setField(term977962, term977962.getClass(), "defaultCodingConvention", null);
        setField(term977962, term977962.getClass(), "typeRegistry", null);
        setField(term977962, term977962.getClass(), "parserConfig", null);
        setField(term977962, term977962.getClass(), "abstractInterpreter", null);
        setField(term977962, term977962.getClass(), "typeValidator", null);
        setField(term977962, term977962.getClass(), "tracker", null);
        setField(term977962, term977962.getClass(), "oldErrorReporter", null);
        setField(term977962, term977962.getClass(), "defaultErrorReporter", null);
        setField(term977962, term977962.getClass(), "outStream", null);
        setField(term977962, term977962.getClass(), "globalRefMap", null);
        setField(term977962, term977962.getClass(), "sanityCheck", null);
        setField(term977962, term977962.getClass(), "currentTracer", null);
        setField(term977962, term977962.getClass(), "currentPassName", null);
        setField(term977962, term977962.getClass(), "recentChange", null);
        setField(term977962, term977962.getClass(), "codeChangeHandlers", null);
        setField(term977962, term977962.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "normalize", argTypes, term977962, args);
    }

};


