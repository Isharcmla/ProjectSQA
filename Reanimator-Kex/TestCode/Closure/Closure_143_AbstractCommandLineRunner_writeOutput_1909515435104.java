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

public class AbstractCommandLineRunner_writeOutput_1909515435104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164919;
     Object term164999;
     Object term168297;
     Object term168298;

    public AbstractCommandLineRunner_writeOutput_1909515435104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164919 = newInstance(Class.forName("org.apache.tools.mail.MailPrintStream"));
        term164999 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        term168297 = newInstance(Class.forName("org.apache.tools.mail.MailPrintStream"));
        setIntField(term168297, term168297.getClass(), "lastChar", 0);
        setBooleanField(term168297, term168297.getClass(), "autoFlush", false);
        setBooleanField(term168297, term168297.getClass(), "trouble", true);
        setField(term168297, term168297.getClass(), "formatter", null);
        setField(term168297, term168297.getClass(), "textOut", null);
        setField(term168297, term168297.getClass(), "charOut", null);
        setBooleanField(term168297, term168297.getClass(), "closing", false);
        setField(term168297, term168297.getClass(), "out", null);
        setBooleanField(term168297, term168297.getClass(), "closed", false);
        setField(term168297, term168297.getClass(), "closeLock", null);
        term168298 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term168298, term168298.getClass(), "options", null);
        setField(term168298, term168298.getClass(), "passes", null);
        setField(term168298, term168298.getClass(), "externs", null);
        setField(term168298, term168298.getClass(), "modules", null);
        setField(term168298, term168298.getClass(), "moduleGraph", null);
        setField(term168298, term168298.getClass(), "inputs", null);
        setField(term168298, term168298.getClass(), "errorManager", null);
        setField(term168298, term168298.getClass(), "symbolTable", null);
        setField(term168298, term168298.getClass(), "externsRoot", null);
        setField(term168298, term168298.getClass(), "jsRoot", null);
        setField(term168298, term168298.getClass(), "externAndJsRoot", null);
        setField(term168298, term168298.getClass(), "inputsByName", null);
        setField(term168298, term168298.getClass(), "sourceMap", null);
        setField(term168298, term168298.getClass(), "externExports", null);
        setIntField(term168298, term168298.getClass(), "uniqueNameId", 0);
        setBooleanField(term168298, term168298.getClass(), "normalized", false);
        setBooleanField(term168298, term168298.getClass(), "useThreads", false);
        setField(term168298, term168298.getClass(), "functionInformationMap", null);
        setField(term168298, term168298.getClass(), "debugLog", null);
        setField(term168298, term168298.getClass(), "defaultCodingConvention", null);
        setField(term168298, term168298.getClass(), "typeRegistry", null);
        setField(term168298, term168298.getClass(), "parserConfig", null);
        setField(term168298, term168298.getClass(), "abstractInterpreter", null);
        setField(term168298, term168298.getClass(), "typeValidator", null);
        setField(term168298, term168298.getClass(), "tracker", null);
        setField(term168298, term168298.getClass(), "oldErrorReporter", null);
        setField(term168298, term168298.getClass(), "defaultErrorReporter", null);
        setField(term168298, term168298.getClass(), "outStream", null);
        setField(term168298, term168298.getClass(), "sanityCheck", null);
        setField(term168298, term168298.getClass(), "currentTracer", null);
        setField(term168298, term168298.getClass(), "currentPassName", null);
        setField(term168298, term168298.getClass(), "recentChange", null);
        setField(term168298, term168298.getClass(), "codeChangeHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.io.PrintStream");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Compiler");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term164919;
        args[1] = term164999;
        args[2] = null;
        args[3] = "                                         ";
        args[4] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        callMethod(klass, "writeOutput", argTypes, null, args);
        assertTrue(recursiveEquals(term164919, term168297));
        assertTrue(recursiveEquals(term164999, term168298));
    }

};


