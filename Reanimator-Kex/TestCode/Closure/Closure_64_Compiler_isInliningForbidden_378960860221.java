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

public class Compiler_isInliningForbidden_378960860221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977954;

    public Compiler_isInliningForbidden_378960860221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977954 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term977954, term977954.getClass(), "options", null);
        setField(term977954, term977954.getClass(), "passes", null);
        setField(term977954, term977954.getClass(), "externs", null);
        setField(term977954, term977954.getClass(), "modules", null);
        setField(term977954, term977954.getClass(), "moduleGraph", null);
        setField(term977954, term977954.getClass(), "inputs", null);
        setField(term977954, term977954.getClass(), "errorManager", null);
        setField(term977954, term977954.getClass(), "warningsGuard", null);
        setField(term977954, term977954.getClass(), "externsRoot", null);
        setField(term977954, term977954.getClass(), "jsRoot", null);
        setField(term977954, term977954.getClass(), "externAndJsRoot", null);
        setField(term977954, term977954.getClass(), "inputsByName", null);
        setField(term977954, term977954.getClass(), "sourceMap", null);
        setField(term977954, term977954.getClass(), "externExports", null);
        setIntField(term977954, term977954.getClass(), "uniqueNameId", 0);
        setBooleanField(term977954, term977954.getClass(), "useThreads", false);
        setBooleanField(term977954, term977954.getClass(), "hasRegExpGlobalReferences", false);
        setField(term977954, term977954.getClass(), "functionInformationMap", null);
        setField(term977954, term977954.getClass(), "debugLog", null);
        setField(term977954, term977954.getClass(), "defaultCodingConvention", null);
        setField(term977954, term977954.getClass(), "typeRegistry", null);
        setField(term977954, term977954.getClass(), "parserConfig", null);
        setField(term977954, term977954.getClass(), "abstractInterpreter", null);
        setField(term977954, term977954.getClass(), "typeValidator", null);
        setField(term977954, term977954.getClass(), "tracker", null);
        setField(term977954, term977954.getClass(), "oldErrorReporter", null);
        setField(term977954, term977954.getClass(), "defaultErrorReporter", null);
        setField(term977954, term977954.getClass(), "outStream", null);
        setField(term977954, term977954.getClass(), "globalRefMap", null);
        setField(term977954, term977954.getClass(), "sanityCheck", null);
        setField(term977954, term977954.getClass(), "currentTracer", null);
        setField(term977954, term977954.getClass(), "currentPassName", null);
        setField(term977954, term977954.getClass(), "recentChange", null);
        setField(term977954, term977954.getClass(), "codeChangeHandlers", null);
        setField(term977954, term977954.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInliningForbidden", argTypes, term977954, args);
    }

};


