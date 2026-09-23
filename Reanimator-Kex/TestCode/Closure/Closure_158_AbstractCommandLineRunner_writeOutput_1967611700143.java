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

public class AbstractCommandLineRunner_writeOutput_1967611700143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120705;
     Object term120785;
     Object term120957;
     Object term120959;

    public AbstractCommandLineRunner_writeOutput_1967611700143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120705 = new StringBuilder();
        term120785 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        term120957 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term120958 = (byte[]) newByteArray(16);
        setByteElement(term120958, 0, (byte) 110);
        setByteElement(term120958, 1, (byte) 117);
        setByteElement(term120958, 2, (byte) 108);
        setByteElement(term120958, 3, (byte) 108);
        setByteElement(term120958, 4, (byte) 10);
        setField(term120957, term120957.getClass(), "value", term120958);
        setByteField(term120957, term120957.getClass(), "coder", (byte) 0);
        setIntField(term120957, term120957.getClass(), "count", 5);
        term120959 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term120959, term120959.getClass(), "options", null);
        setField(term120959, term120959.getClass(), "passes", null);
        setField(term120959, term120959.getClass(), "externs", null);
        setField(term120959, term120959.getClass(), "modules", null);
        setField(term120959, term120959.getClass(), "moduleGraph", null);
        setField(term120959, term120959.getClass(), "inputs", null);
        setField(term120959, term120959.getClass(), "errorManager", null);
        setField(term120959, term120959.getClass(), "warningsGuard", null);
        setField(term120959, term120959.getClass(), "externsRoot", null);
        setField(term120959, term120959.getClass(), "jsRoot", null);
        setField(term120959, term120959.getClass(), "externAndJsRoot", null);
        setField(term120959, term120959.getClass(), "inputsByName", null);
        setField(term120959, term120959.getClass(), "sourceMap", null);
        setField(term120959, term120959.getClass(), "externExports", null);
        setIntField(term120959, term120959.getClass(), "uniqueNameId", 0);
        setBooleanField(term120959, term120959.getClass(), "useThreads", false);
        setBooleanField(term120959, term120959.getClass(), "hasRegExpGlobalReferences", false);
        setField(term120959, term120959.getClass(), "functionInformationMap", null);
        setField(term120959, term120959.getClass(), "debugLog", null);
        setField(term120959, term120959.getClass(), "defaultCodingConvention", null);
        setField(term120959, term120959.getClass(), "typeRegistry", null);
        setField(term120959, term120959.getClass(), "parserConfig", null);
        setField(term120959, term120959.getClass(), "abstractInterpreter", null);
        setField(term120959, term120959.getClass(), "typeValidator", null);
        setField(term120959, term120959.getClass(), "tracker", null);
        setField(term120959, term120959.getClass(), "oldErrorReporter", null);
        setField(term120959, term120959.getClass(), "defaultErrorReporter", null);
        setField(term120959, term120959.getClass(), "outStream", null);
        setField(term120959, term120959.getClass(), "sanityCheck", null);
        setField(term120959, term120959.getClass(), "currentTracer", null);
        setField(term120959, term120959.getClass(), "currentPassName", null);
        setField(term120959, term120959.getClass(), "recentChange", null);
        setField(term120959, term120959.getClass(), "codeChangeHandlers", null);
        setField(term120959, term120959.getClass(), "stage", null);
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
        args[0] = term120705;
        args[1] = term120785;
        args[2] = null;
        args[3] = "                \u0001";
        args[4] = "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001";
        callMethod(klass, "writeOutput", argTypes, null, args);
        assertTrue(recursiveEquals(term120705, term120957));
        assertTrue(recursiveEquals(term120785, term120959));
    }

};


