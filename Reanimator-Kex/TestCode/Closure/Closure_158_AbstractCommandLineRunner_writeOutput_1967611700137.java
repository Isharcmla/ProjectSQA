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
import java.lang.StringBuilder;

public class AbstractCommandLineRunner_writeOutput_1967611700137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115975;
     Object term116055;
     Object term118121;
     Object term118122;

    public AbstractCommandLineRunner_writeOutput_1967611700137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115975 = new StringBuilder();
        term116055 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        term118121 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term118121, term118121.getClass(), "options", null);
        setField(term118121, term118121.getClass(), "passes", null);
        setField(term118121, term118121.getClass(), "externs", null);
        setField(term118121, term118121.getClass(), "modules", null);
        setField(term118121, term118121.getClass(), "moduleGraph", null);
        setField(term118121, term118121.getClass(), "inputs", null);
        setField(term118121, term118121.getClass(), "errorManager", null);
        setField(term118121, term118121.getClass(), "warningsGuard", null);
        setField(term118121, term118121.getClass(), "externsRoot", null);
        setField(term118121, term118121.getClass(), "jsRoot", null);
        setField(term118121, term118121.getClass(), "externAndJsRoot", null);
        setField(term118121, term118121.getClass(), "inputsByName", null);
        setField(term118121, term118121.getClass(), "sourceMap", null);
        setField(term118121, term118121.getClass(), "externExports", null);
        setIntField(term118121, term118121.getClass(), "uniqueNameId", 0);
        setBooleanField(term118121, term118121.getClass(), "useThreads", false);
        setBooleanField(term118121, term118121.getClass(), "hasRegExpGlobalReferences", false);
        setField(term118121, term118121.getClass(), "functionInformationMap", null);
        setField(term118121, term118121.getClass(), "debugLog", null);
        setField(term118121, term118121.getClass(), "defaultCodingConvention", null);
        setField(term118121, term118121.getClass(), "typeRegistry", null);
        setField(term118121, term118121.getClass(), "parserConfig", null);
        setField(term118121, term118121.getClass(), "abstractInterpreter", null);
        setField(term118121, term118121.getClass(), "typeValidator", null);
        setField(term118121, term118121.getClass(), "tracker", null);
        setField(term118121, term118121.getClass(), "oldErrorReporter", null);
        setField(term118121, term118121.getClass(), "defaultErrorReporter", null);
        setField(term118121, term118121.getClass(), "outStream", null);
        setField(term118121, term118121.getClass(), "sanityCheck", null);
        setField(term118121, term118121.getClass(), "currentTracer", null);
        setField(term118121, term118121.getClass(), "currentPassName", null);
        setField(term118121, term118121.getClass(), "recentChange", null);
        setField(term118121, term118121.getClass(), "codeChangeHandlers", null);
        setField(term118121, term118121.getClass(), "stage", null);
        term118122 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term118123 = (byte[]) newByteArray(16);
        setByteElement(term118123, 0, (byte) 110);
        setByteElement(term118123, 1, (byte) 117);
        setByteElement(term118123, 2, (byte) 108);
        setByteElement(term118123, 3, (byte) 108);
        setByteElement(term118123, 4, (byte) 10);
        setField(term118122, term118122.getClass(), "value", term118123);
        setByteField(term118122, term118122.getClass(), "coder", (byte) 0);
        setIntField(term118122, term118122.getClass(), "count", 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Compiler");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term115975;
        args[1] = term116055;
        args[2] = null;
        args[3] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        args[4] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        callMethod(klass, "writeOutput", argTypes, null, args);
        assertTrue(recursiveEquals(term115975, term118121));
        assertTrue(recursiveEquals(term116055, term118122));
    }

};


