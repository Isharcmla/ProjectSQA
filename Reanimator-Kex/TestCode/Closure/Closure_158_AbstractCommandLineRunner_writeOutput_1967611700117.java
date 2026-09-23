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

public class AbstractCommandLineRunner_writeOutput_1967611700117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107589;
     Object term107669;
     Object term109735;
     Object term109736;

    public AbstractCommandLineRunner_writeOutput_1967611700117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107589 = new StringBuffer();
        term107669 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        term109735 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term109735, term109735.getClass(), "options", null);
        setField(term109735, term109735.getClass(), "passes", null);
        setField(term109735, term109735.getClass(), "externs", null);
        setField(term109735, term109735.getClass(), "modules", null);
        setField(term109735, term109735.getClass(), "moduleGraph", null);
        setField(term109735, term109735.getClass(), "inputs", null);
        setField(term109735, term109735.getClass(), "errorManager", null);
        setField(term109735, term109735.getClass(), "warningsGuard", null);
        setField(term109735, term109735.getClass(), "externsRoot", null);
        setField(term109735, term109735.getClass(), "jsRoot", null);
        setField(term109735, term109735.getClass(), "externAndJsRoot", null);
        setField(term109735, term109735.getClass(), "inputsByName", null);
        setField(term109735, term109735.getClass(), "sourceMap", null);
        setField(term109735, term109735.getClass(), "externExports", null);
        setIntField(term109735, term109735.getClass(), "uniqueNameId", 0);
        setBooleanField(term109735, term109735.getClass(), "useThreads", false);
        setBooleanField(term109735, term109735.getClass(), "hasRegExpGlobalReferences", false);
        setField(term109735, term109735.getClass(), "functionInformationMap", null);
        setField(term109735, term109735.getClass(), "debugLog", null);
        setField(term109735, term109735.getClass(), "defaultCodingConvention", null);
        setField(term109735, term109735.getClass(), "typeRegistry", null);
        setField(term109735, term109735.getClass(), "parserConfig", null);
        setField(term109735, term109735.getClass(), "abstractInterpreter", null);
        setField(term109735, term109735.getClass(), "typeValidator", null);
        setField(term109735, term109735.getClass(), "tracker", null);
        setField(term109735, term109735.getClass(), "oldErrorReporter", null);
        setField(term109735, term109735.getClass(), "defaultErrorReporter", null);
        setField(term109735, term109735.getClass(), "outStream", null);
        setField(term109735, term109735.getClass(), "sanityCheck", null);
        setField(term109735, term109735.getClass(), "currentTracer", null);
        setField(term109735, term109735.getClass(), "currentPassName", null);
        setField(term109735, term109735.getClass(), "recentChange", null);
        setField(term109735, term109735.getClass(), "codeChangeHandlers", null);
        setField(term109735, term109735.getClass(), "stage", null);
        term109736 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term109737 = (byte[]) newByteArray(16);
        setField(term109736, term109736.getClass(), "toStringCache", null);
        setByteElement(term109737, 0, (byte) 110);
        setByteElement(term109737, 1, (byte) 117);
        setByteElement(term109737, 2, (byte) 108);
        setByteElement(term109737, 3, (byte) 108);
        setByteElement(term109737, 4, (byte) 10);
        setField(term109736, term109736.getClass(), "value", term109737);
        setByteField(term109736, term109736.getClass(), "coder", (byte) 0);
        setIntField(term109736, term109736.getClass(), "count", 5);
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
        args[0] = term107589;
        args[1] = term107669;
        args[2] = null;
        args[3] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        args[4] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        callMethod(klass, "writeOutput", argTypes, null, args);
        assertTrue(recursiveEquals(term107589, term109735));
        assertTrue(recursiveEquals(term107669, term109736));
    }

};


