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
import java.lang.StringBuffer;

public class AbstractCommandLineRunner_writeOutput_1967611700145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124370;
     Object term124450;
     Object term127069;
     Object term127070;

    public AbstractCommandLineRunner_writeOutput_1967611700145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124370 = new StringBuffer();
        term124450 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        term127069 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term127069, term127069.getClass(), "options", null);
        setField(term127069, term127069.getClass(), "passes", null);
        setField(term127069, term127069.getClass(), "externs", null);
        setField(term127069, term127069.getClass(), "modules", null);
        setField(term127069, term127069.getClass(), "moduleGraph", null);
        setField(term127069, term127069.getClass(), "inputs", null);
        setField(term127069, term127069.getClass(), "errorManager", null);
        setField(term127069, term127069.getClass(), "warningsGuard", null);
        setField(term127069, term127069.getClass(), "externsRoot", null);
        setField(term127069, term127069.getClass(), "jsRoot", null);
        setField(term127069, term127069.getClass(), "externAndJsRoot", null);
        setField(term127069, term127069.getClass(), "inputsByName", null);
        setField(term127069, term127069.getClass(), "sourceMap", null);
        setField(term127069, term127069.getClass(), "externExports", null);
        setIntField(term127069, term127069.getClass(), "uniqueNameId", 0);
        setBooleanField(term127069, term127069.getClass(), "useThreads", false);
        setBooleanField(term127069, term127069.getClass(), "hasRegExpGlobalReferences", false);
        setField(term127069, term127069.getClass(), "functionInformationMap", null);
        setField(term127069, term127069.getClass(), "debugLog", null);
        setField(term127069, term127069.getClass(), "defaultCodingConvention", null);
        setField(term127069, term127069.getClass(), "typeRegistry", null);
        setField(term127069, term127069.getClass(), "parserConfig", null);
        setField(term127069, term127069.getClass(), "abstractInterpreter", null);
        setField(term127069, term127069.getClass(), "typeValidator", null);
        setField(term127069, term127069.getClass(), "tracker", null);
        setField(term127069, term127069.getClass(), "oldErrorReporter", null);
        setField(term127069, term127069.getClass(), "defaultErrorReporter", null);
        setField(term127069, term127069.getClass(), "outStream", null);
        setField(term127069, term127069.getClass(), "sanityCheck", null);
        setField(term127069, term127069.getClass(), "currentTracer", null);
        setField(term127069, term127069.getClass(), "currentPassName", null);
        setField(term127069, term127069.getClass(), "recentChange", null);
        setField(term127069, term127069.getClass(), "codeChangeHandlers", null);
        setField(term127069, term127069.getClass(), "stage", null);
        term127070 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term127071 = (byte[]) newByteArray(16);
        setField(term127070, term127070.getClass(), "toStringCache", null);
        setByteElement(term127071, 0, (byte) 110);
        setByteElement(term127071, 1, (byte) 117);
        setByteElement(term127071, 2, (byte) 108);
        setByteElement(term127071, 3, (byte) 108);
        setByteElement(term127071, 4, (byte) 10);
        setField(term127070, term127070.getClass(), "value", term127071);
        setByteField(term127070, term127070.getClass(), "coder", (byte) 0);
        setIntField(term127070, term127070.getClass(), "count", 5);
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
        args[0] = term124370;
        args[1] = term124450;
        args[2] = null;
        args[3] = "                                                                                                                \u0001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ";
        args[4] = "                                                                                                                \u0001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ";
        callMethod(klass, "writeOutput", argTypes, null, args);
        assertTrue(recursiveEquals(term124370, term127069));
        assertTrue(recursiveEquals(term124450, term127070));
    }

};


