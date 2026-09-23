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

public class ProcessCommonJSModules_process_62786604728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13233;
     Object term13383;
     Object term14639;
     Object term14641;

    public ProcessCommonJSModules_process_62786604728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13233 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term13313 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term13233, term13233.getClass(), "compiler", term13313);
        term13383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13545 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term13615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13383, term13383.getClass(), "type", 0);
        setField(term13383, term13383.getClass(), "parent", null);
        setField(term13453, term13453.getClass(), "next", term13545);
        setIntField(term13453, term13453.getClass(), "type", 0);
        setField(term13615, term13615.getClass(), "next", null);
        setIntField(term13615, term13615.getClass(), "type", 0);
        setField(term13615, term13615.getClass(), "first", null);
        setField(term13453, term13453.getClass(), "first", term13615);
        setField(term13383, term13383.getClass(), "first", term13453);
        term14639 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term14640 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term14640, term14640.getClass(), "options", null);
        setField(term14640, term14640.getClass(), "passes", null);
        setField(term14640, term14640.getClass(), "externs", null);
        setField(term14640, term14640.getClass(), "modules", null);
        setField(term14640, term14640.getClass(), "moduleGraph", null);
        setField(term14640, term14640.getClass(), "inputs", null);
        setField(term14640, term14640.getClass(), "errorManager", null);
        setField(term14640, term14640.getClass(), "warningsGuard", null);
        setField(term14640, term14640.getClass(), "injectedLibraries", null);
        setField(term14640, term14640.getClass(), "externsRoot", null);
        setField(term14640, term14640.getClass(), "jsRoot", null);
        setField(term14640, term14640.getClass(), "externAndJsRoot", null);
        setField(term14640, term14640.getClass(), "inputsById", null);
        setField(term14640, term14640.getClass(), "sourceMap", null);
        setField(term14640, term14640.getClass(), "externExports", null);
        setIntField(term14640, term14640.getClass(), "uniqueNameId", 0);
        setBooleanField(term14640, term14640.getClass(), "useThreads", false);
        setBooleanField(term14640, term14640.getClass(), "hasRegExpGlobalReferences", false);
        setField(term14640, term14640.getClass(), "functionInformationMap", null);
        setField(term14640, term14640.getClass(), "debugLog", null);
        setField(term14640, term14640.getClass(), "defaultCodingConvention", null);
        setField(term14640, term14640.getClass(), "typeRegistry", null);
        setField(term14640, term14640.getClass(), "parserConfig", null);
        setField(term14640, term14640.getClass(), "abstractInterpreter", null);
        setField(term14640, term14640.getClass(), "typeValidator", null);
        setField(term14640, term14640.getClass(), "tracker", null);
        setField(term14640, term14640.getClass(), "oldErrorReporter", null);
        setField(term14640, term14640.getClass(), "defaultErrorReporter", null);
        setField(term14640, term14640.getClass(), "outStream", null);
        setField(term14640, term14640.getClass(), "globalRefMap", null);
        setDoubleField(term14640, term14640.getClass(), "progress", 0.0);
        setField(term14640, term14640.getClass(), "sanityCheck", null);
        setField(term14640, term14640.getClass(), "currentTracer", null);
        setField(term14640, term14640.getClass(), "currentPassName", null);
        setIntField(term14640, term14640.getClass(), "syntheticCodeId", 0);
        setField(term14640, term14640.getClass(), "recentChange", null);
        setField(term14640, term14640.getClass(), "codeChangeHandlers", null);
        setField(term14640, term14640.getClass(), "synthesizedExternsInput", null);
        setField(term14640, term14640.getClass(), "stage", null);
        setField(term14639, term14639.getClass(), "compiler", term14640);
        setField(term14639, term14639.getClass(), "filenamePrefix", null);
        setBooleanField(term14639, term14639.getClass(), "reportDependencies", false);
        setField(term14639, term14639.getClass(), "module", null);
        term14641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14643 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term14644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14641, term14641.getClass(), "type", 0);
        setField(term14641, term14641.getClass(), "next", null);
        setIntField(term14642, term14642.getClass(), "type", 0);
        setField(term14643, term14643.getClass(), "str", null);
        setIntField(term14643, term14643.getClass(), "type", 0);
        setField(term14643, term14643.getClass(), "next", null);
        setField(term14643, term14643.getClass(), "first", null);
        setField(term14643, term14643.getClass(), "last", null);
        setField(term14643, term14643.getClass(), "propListHead", null);
        setIntField(term14643, term14643.getClass(), "sourcePosition", 0);
        setField(term14643, term14643.getClass(), "jsType", null);
        setField(term14643, term14643.getClass(), "parent", null);
        setField(term14642, term14642.getClass(), "next", term14643);
        setIntField(term14644, term14644.getClass(), "type", 0);
        setField(term14644, term14644.getClass(), "next", null);
        setField(term14644, term14644.getClass(), "first", null);
        setField(term14644, term14644.getClass(), "last", null);
        setField(term14644, term14644.getClass(), "propListHead", null);
        setIntField(term14644, term14644.getClass(), "sourcePosition", 0);
        setField(term14644, term14644.getClass(), "jsType", null);
        setField(term14644, term14644.getClass(), "parent", null);
        setField(term14642, term14642.getClass(), "first", term14644);
        setField(term14642, term14642.getClass(), "last", null);
        setField(term14642, term14642.getClass(), "propListHead", null);
        setIntField(term14642, term14642.getClass(), "sourcePosition", 0);
        setField(term14642, term14642.getClass(), "jsType", null);
        setField(term14642, term14642.getClass(), "parent", null);
        setField(term14641, term14641.getClass(), "first", term14642);
        setField(term14641, term14641.getClass(), "last", null);
        setField(term14641, term14641.getClass(), "propListHead", null);
        setIntField(term14641, term14641.getClass(), "sourcePosition", 0);
        setField(term14641, term14641.getClass(), "jsType", null);
        setField(term14641, term14641.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term13383;
        callMethod(klass, "process", argTypes, term13233, args);
        assertTrue(recursiveEquals(term13233, term14639));
        assertTrue(recursiveEquals(term13383, null));
    }

};


