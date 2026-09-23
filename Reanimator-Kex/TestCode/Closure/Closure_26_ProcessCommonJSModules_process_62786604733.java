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

public class ProcessCommonJSModules_process_62786604733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16730;
     Object term16880;
     Object term17442;
     Object term17444;

    public ProcessCommonJSModules_process_62786604733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16730 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term16810 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term16730, term16730.getClass(), "compiler", term16810);
        term16880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16972 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term17042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17134 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term16880, term16880.getClass(), "type", 0);
        setField(term16880, term16880.getClass(), "parent", null);
        setField(term16972, term16972.getClass(), "next", term17042);
        setIntField(term16972, term16972.getClass(), "type", 0);
        setField(term16972, term16972.getClass(), "first", term17134);
        setField(term16880, term16880.getClass(), "first", term16972);
        term17442 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term17443 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term17443, term17443.getClass(), "options", null);
        setField(term17443, term17443.getClass(), "passes", null);
        setField(term17443, term17443.getClass(), "externs", null);
        setField(term17443, term17443.getClass(), "modules", null);
        setField(term17443, term17443.getClass(), "moduleGraph", null);
        setField(term17443, term17443.getClass(), "inputs", null);
        setField(term17443, term17443.getClass(), "errorManager", null);
        setField(term17443, term17443.getClass(), "warningsGuard", null);
        setField(term17443, term17443.getClass(), "injectedLibraries", null);
        setField(term17443, term17443.getClass(), "externsRoot", null);
        setField(term17443, term17443.getClass(), "jsRoot", null);
        setField(term17443, term17443.getClass(), "externAndJsRoot", null);
        setField(term17443, term17443.getClass(), "inputsById", null);
        setField(term17443, term17443.getClass(), "sourceMap", null);
        setField(term17443, term17443.getClass(), "externExports", null);
        setIntField(term17443, term17443.getClass(), "uniqueNameId", 0);
        setBooleanField(term17443, term17443.getClass(), "useThreads", false);
        setBooleanField(term17443, term17443.getClass(), "hasRegExpGlobalReferences", false);
        setField(term17443, term17443.getClass(), "functionInformationMap", null);
        setField(term17443, term17443.getClass(), "debugLog", null);
        setField(term17443, term17443.getClass(), "defaultCodingConvention", null);
        setField(term17443, term17443.getClass(), "typeRegistry", null);
        setField(term17443, term17443.getClass(), "parserConfig", null);
        setField(term17443, term17443.getClass(), "abstractInterpreter", null);
        setField(term17443, term17443.getClass(), "typeValidator", null);
        setField(term17443, term17443.getClass(), "tracker", null);
        setField(term17443, term17443.getClass(), "oldErrorReporter", null);
        setField(term17443, term17443.getClass(), "defaultErrorReporter", null);
        setField(term17443, term17443.getClass(), "outStream", null);
        setField(term17443, term17443.getClass(), "globalRefMap", null);
        setDoubleField(term17443, term17443.getClass(), "progress", 0.0);
        setField(term17443, term17443.getClass(), "sanityCheck", null);
        setField(term17443, term17443.getClass(), "currentTracer", null);
        setField(term17443, term17443.getClass(), "currentPassName", null);
        setIntField(term17443, term17443.getClass(), "syntheticCodeId", 0);
        setField(term17443, term17443.getClass(), "recentChange", null);
        setField(term17443, term17443.getClass(), "codeChangeHandlers", null);
        setField(term17443, term17443.getClass(), "synthesizedExternsInput", null);
        setField(term17443, term17443.getClass(), "stage", null);
        setField(term17442, term17442.getClass(), "compiler", term17443);
        setField(term17442, term17442.getClass(), "filenamePrefix", null);
        setBooleanField(term17442, term17442.getClass(), "reportDependencies", false);
        setField(term17442, term17442.getClass(), "module", null);
        term17444 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17445 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term17446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17447 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term17444, term17444.getClass(), "type", 0);
        setField(term17444, term17444.getClass(), "next", null);
        setDoubleField(term17445, term17445.getClass(), "number", 0.0);
        setIntField(term17445, term17445.getClass(), "type", 0);
        setIntField(term17446, term17446.getClass(), "type", 0);
        setField(term17446, term17446.getClass(), "next", null);
        setField(term17446, term17446.getClass(), "first", null);
        setField(term17446, term17446.getClass(), "last", null);
        setField(term17446, term17446.getClass(), "propListHead", null);
        setIntField(term17446, term17446.getClass(), "sourcePosition", 0);
        setField(term17446, term17446.getClass(), "jsType", null);
        setField(term17446, term17446.getClass(), "parent", null);
        setField(term17445, term17445.getClass(), "next", term17446);
        setDoubleField(term17447, term17447.getClass(), "number", 0.0);
        setIntField(term17447, term17447.getClass(), "type", 0);
        setField(term17447, term17447.getClass(), "next", null);
        setField(term17447, term17447.getClass(), "first", null);
        setField(term17447, term17447.getClass(), "last", null);
        setField(term17447, term17447.getClass(), "propListHead", null);
        setIntField(term17447, term17447.getClass(), "sourcePosition", 0);
        setField(term17447, term17447.getClass(), "jsType", null);
        setField(term17447, term17447.getClass(), "parent", null);
        setField(term17445, term17445.getClass(), "first", term17447);
        setField(term17445, term17445.getClass(), "last", null);
        setField(term17445, term17445.getClass(), "propListHead", null);
        setIntField(term17445, term17445.getClass(), "sourcePosition", 0);
        setField(term17445, term17445.getClass(), "jsType", null);
        setField(term17445, term17445.getClass(), "parent", null);
        setField(term17444, term17444.getClass(), "first", term17445);
        setField(term17444, term17444.getClass(), "last", null);
        setField(term17444, term17444.getClass(), "propListHead", null);
        setIntField(term17444, term17444.getClass(), "sourcePosition", 0);
        setField(term17444, term17444.getClass(), "jsType", null);
        setField(term17444, term17444.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term16880;
        callMethod(klass, "process", argTypes, term16730, args);
        assertTrue(recursiveEquals(term16730, term17442));
        assertTrue(recursiveEquals(term16880, null));
    }

};


