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

public class Compiler_ensureDefaultPassConfig_713495440201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854779;

    public Compiler_ensureDefaultPassConfig_713495440201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854779 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term854779, term854779.getClass(), "options", null);
        setField(term854779, term854779.getClass(), "passes", null);
        setField(term854779, term854779.getClass(), "externs", null);
        setField(term854779, term854779.getClass(), "modules", null);
        setField(term854779, term854779.getClass(), "moduleGraph", null);
        setField(term854779, term854779.getClass(), "inputs", null);
        setField(term854779, term854779.getClass(), "errorManager", null);
        setField(term854779, term854779.getClass(), "warningsGuard", null);
        setField(term854779, term854779.getClass(), "externsRoot", null);
        setField(term854779, term854779.getClass(), "jsRoot", null);
        setField(term854779, term854779.getClass(), "externAndJsRoot", null);
        setField(term854779, term854779.getClass(), "inputsByName", null);
        setField(term854779, term854779.getClass(), "sourceMap", null);
        setField(term854779, term854779.getClass(), "externExports", null);
        setIntField(term854779, term854779.getClass(), "uniqueNameId", 0);
        setBooleanField(term854779, term854779.getClass(), "useThreads", false);
        setBooleanField(term854779, term854779.getClass(), "hasRegExpGlobalReferences", false);
        setField(term854779, term854779.getClass(), "functionInformationMap", null);
        setField(term854779, term854779.getClass(), "debugLog", null);
        setField(term854779, term854779.getClass(), "defaultCodingConvention", null);
        setField(term854779, term854779.getClass(), "typeRegistry", null);
        setField(term854779, term854779.getClass(), "parserConfig", null);
        setField(term854779, term854779.getClass(), "abstractInterpreter", null);
        setField(term854779, term854779.getClass(), "typeValidator", null);
        setField(term854779, term854779.getClass(), "tracker", null);
        setField(term854779, term854779.getClass(), "oldErrorReporter", null);
        setField(term854779, term854779.getClass(), "defaultErrorReporter", null);
        setField(term854779, term854779.getClass(), "outStream", null);
        setField(term854779, term854779.getClass(), "globalRefMap", null);
        setField(term854779, term854779.getClass(), "sanityCheck", null);
        setField(term854779, term854779.getClass(), "currentTracer", null);
        setField(term854779, term854779.getClass(), "currentPassName", null);
        setField(term854779, term854779.getClass(), "recentChange", null);
        setField(term854779, term854779.getClass(), "codeChangeHandlers", null);
        setField(term854779, term854779.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "ensureDefaultPassConfig", argTypes, term854779, args);
    }

};


