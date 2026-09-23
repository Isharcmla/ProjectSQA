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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Compiler_getMessages_215781561208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130846;

    public Compiler_getMessages_215781561208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130846 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term130846, term130846.getClass(), "options", null);
        setField(term130846, term130846.getClass(), "passes", null);
        setField(term130846, term130846.getClass(), "externs", null);
        setField(term130846, term130846.getClass(), "modules", null);
        setField(term130846, term130846.getClass(), "moduleGraph", null);
        setField(term130846, term130846.getClass(), "inputs", null);
        setField(term130846, term130846.getClass(), "errorManager", null);
        setField(term130846, term130846.getClass(), "symbolTable", null);
        setField(term130846, term130846.getClass(), "externsRoot", null);
        setField(term130846, term130846.getClass(), "jsRoot", null);
        setField(term130846, term130846.getClass(), "externAndJsRoot", null);
        setField(term130846, term130846.getClass(), "inputsByName", null);
        setField(term130846, term130846.getClass(), "sourceMap", null);
        setField(term130846, term130846.getClass(), "externExports", null);
        setIntField(term130846, term130846.getClass(), "uniqueNameId", 0);
        setBooleanField(term130846, term130846.getClass(), "normalized", false);
        setBooleanField(term130846, term130846.getClass(), "useThreads", false);
        setField(term130846, term130846.getClass(), "functionInformationMap", null);
        setField(term130846, term130846.getClass(), "debugLog", null);
        setField(term130846, term130846.getClass(), "defaultCodingConvention", null);
        setField(term130846, term130846.getClass(), "typeRegistry", null);
        setField(term130846, term130846.getClass(), "parserConfig", null);
        setField(term130846, term130846.getClass(), "abstractInterpreter", null);
        setField(term130846, term130846.getClass(), "typeValidator", null);
        setField(term130846, term130846.getClass(), "tracker", null);
        setField(term130846, term130846.getClass(), "oldErrorReporter", null);
        setField(term130846, term130846.getClass(), "defaultErrorReporter", null);
        setField(term130846, term130846.getClass(), "outStream", null);
        setField(term130846, term130846.getClass(), "sanityCheck", null);
        setField(term130846, term130846.getClass(), "currentTracer", null);
        setField(term130846, term130846.getClass(), "currentPassName", null);
        setField(term130846, term130846.getClass(), "recentChange", null);
        setField(term130846, term130846.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getMessages", argTypes, term130846, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


