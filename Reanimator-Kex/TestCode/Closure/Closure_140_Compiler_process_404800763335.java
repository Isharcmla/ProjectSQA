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
import java.lang.Object;

public class Compiler_process_404800763335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2560756;
     Object term2561002;
     Object term2561030;
     Object term2561033;

    public Compiler_process_404800763335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2560756 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term2560826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2560896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2560756, term2560756.getClass(), "externsRoot", term2560826);
        setField(term2560756, term2560756.getClass(), "jsRoot", term2560896);
        term2561002 = newInstance(Class.forName("com.google.javascript.jscomp.ControlStructureCheck"));
        term2561030 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term2561031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2561032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2561030, term2561030.getClass(), "options", null);
        setField(term2561030, term2561030.getClass(), "passes", null);
        setField(term2561030, term2561030.getClass(), "externs", null);
        setField(term2561030, term2561030.getClass(), "modules", null);
        setField(term2561030, term2561030.getClass(), "moduleGraph", null);
        setField(term2561030, term2561030.getClass(), "inputs", null);
        setField(term2561030, term2561030.getClass(), "errorManager", null);
        setField(term2561030, term2561030.getClass(), "symbolTable", null);
        setIntField(term2561031, term2561031.getClass(), "type", 0);
        setField(term2561031, term2561031.getClass(), "next", null);
        setField(term2561031, term2561031.getClass(), "first", null);
        setField(term2561031, term2561031.getClass(), "last", null);
        setField(term2561031, term2561031.getClass(), "propListHead", null);
        setIntField(term2561031, term2561031.getClass(), "sourcePosition", 0);
        setField(term2561031, term2561031.getClass(), "jsType", null);
        setField(term2561031, term2561031.getClass(), "parent", null);
        setField(term2561030, term2561030.getClass(), "externsRoot", term2561031);
        setIntField(term2561032, term2561032.getClass(), "type", 0);
        setField(term2561032, term2561032.getClass(), "next", null);
        setField(term2561032, term2561032.getClass(), "first", null);
        setField(term2561032, term2561032.getClass(), "last", null);
        setField(term2561032, term2561032.getClass(), "propListHead", null);
        setIntField(term2561032, term2561032.getClass(), "sourcePosition", 0);
        setField(term2561032, term2561032.getClass(), "jsType", null);
        setField(term2561032, term2561032.getClass(), "parent", null);
        setField(term2561030, term2561030.getClass(), "jsRoot", term2561032);
        setField(term2561030, term2561030.getClass(), "externAndJsRoot", null);
        setField(term2561030, term2561030.getClass(), "inputsByName", null);
        setField(term2561030, term2561030.getClass(), "sourceMap", null);
        setField(term2561030, term2561030.getClass(), "externExports", null);
        setIntField(term2561030, term2561030.getClass(), "uniqueNameId", 0);
        setBooleanField(term2561030, term2561030.getClass(), "normalized", false);
        setBooleanField(term2561030, term2561030.getClass(), "useThreads", false);
        setField(term2561030, term2561030.getClass(), "functionInformationMap", null);
        setField(term2561030, term2561030.getClass(), "debugLog", null);
        setField(term2561030, term2561030.getClass(), "defaultCodingConvention", null);
        setField(term2561030, term2561030.getClass(), "typeRegistry", null);
        setField(term2561030, term2561030.getClass(), "parserConfig", null);
        setField(term2561030, term2561030.getClass(), "abstractInterpreter", null);
        setField(term2561030, term2561030.getClass(), "typeValidator", null);
        setField(term2561030, term2561030.getClass(), "tracker", null);
        setField(term2561030, term2561030.getClass(), "oldErrorReporter", null);
        setField(term2561030, term2561030.getClass(), "defaultErrorReporter", null);
        setField(term2561030, term2561030.getClass(), "outStream", null);
        setField(term2561030, term2561030.getClass(), "sanityCheck", null);
        setField(term2561030, term2561030.getClass(), "currentTracer", null);
        setField(term2561030, term2561030.getClass(), "currentPassName", null);
        setField(term2561030, term2561030.getClass(), "recentChange", null);
        setField(term2561030, term2561030.getClass(), "codeChangeHandlers", null);
        term2561033 = newInstance(Class.forName("com.google.javascript.jscomp.ControlStructureCheck"));
        setField(term2561033, term2561033.getClass(), "compiler", null);
        setField(term2561033, term2561033.getClass(), "sourceName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CompilerPass");
        Object[] args = new Object[1];
        args[0] = term2561002;
        callMethod(klass, "process", argTypes, term2560756, args);
        assertTrue(recursiveEquals(term2560756, term2561030));
        assertTrue(recursiveEquals(term2561002, term2561033));
    }

};


