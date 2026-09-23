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

public class ProcessCommonJSModules_process_62786604789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46631;
     Object term46803;
     Object term47629;
     Object term47631;

    public ProcessCommonJSModules_process_62786604789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46631 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term46711 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term46631, term46631.getClass(), "compiler", term46711);
        term46803 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term46895 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term46965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47057 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term47127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46803, term46803.getClass(), "type", 0);
        setField(term46803, term46803.getClass(), "parent", null);
        setField(term46895, term46895.getClass(), "next", term46965);
        setIntField(term46895, term46895.getClass(), "type", 0);
        setField(term47057, term47057.getClass(), "next", term47127);
        setIntField(term47057, term47057.getClass(), "type", 37);
        setField(term47057, term47057.getClass(), "first", null);
        setField(term46895, term46895.getClass(), "first", term47057);
        setField(term46803, term46803.getClass(), "first", term46895);
        term47629 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term47630 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term47630, term47630.getClass(), "options", null);
        setField(term47630, term47630.getClass(), "passes", null);
        setField(term47630, term47630.getClass(), "externs", null);
        setField(term47630, term47630.getClass(), "modules", null);
        setField(term47630, term47630.getClass(), "moduleGraph", null);
        setField(term47630, term47630.getClass(), "inputs", null);
        setField(term47630, term47630.getClass(), "errorManager", null);
        setField(term47630, term47630.getClass(), "warningsGuard", null);
        setField(term47630, term47630.getClass(), "injectedLibraries", null);
        setField(term47630, term47630.getClass(), "externsRoot", null);
        setField(term47630, term47630.getClass(), "jsRoot", null);
        setField(term47630, term47630.getClass(), "externAndJsRoot", null);
        setField(term47630, term47630.getClass(), "inputsById", null);
        setField(term47630, term47630.getClass(), "sourceMap", null);
        setField(term47630, term47630.getClass(), "externExports", null);
        setIntField(term47630, term47630.getClass(), "uniqueNameId", 0);
        setBooleanField(term47630, term47630.getClass(), "useThreads", false);
        setBooleanField(term47630, term47630.getClass(), "hasRegExpGlobalReferences", false);
        setField(term47630, term47630.getClass(), "functionInformationMap", null);
        setField(term47630, term47630.getClass(), "debugLog", null);
        setField(term47630, term47630.getClass(), "defaultCodingConvention", null);
        setField(term47630, term47630.getClass(), "typeRegistry", null);
        setField(term47630, term47630.getClass(), "parserConfig", null);
        setField(term47630, term47630.getClass(), "abstractInterpreter", null);
        setField(term47630, term47630.getClass(), "typeValidator", null);
        setField(term47630, term47630.getClass(), "tracker", null);
        setField(term47630, term47630.getClass(), "oldErrorReporter", null);
        setField(term47630, term47630.getClass(), "defaultErrorReporter", null);
        setField(term47630, term47630.getClass(), "outStream", null);
        setField(term47630, term47630.getClass(), "globalRefMap", null);
        setDoubleField(term47630, term47630.getClass(), "progress", 0.0);
        setField(term47630, term47630.getClass(), "sanityCheck", null);
        setField(term47630, term47630.getClass(), "currentTracer", null);
        setField(term47630, term47630.getClass(), "currentPassName", null);
        setIntField(term47630, term47630.getClass(), "syntheticCodeId", 0);
        setField(term47630, term47630.getClass(), "recentChange", null);
        setField(term47630, term47630.getClass(), "codeChangeHandlers", null);
        setField(term47630, term47630.getClass(), "synthesizedExternsInput", null);
        setField(term47630, term47630.getClass(), "stage", null);
        setField(term47629, term47629.getClass(), "compiler", term47630);
        setField(term47629, term47629.getClass(), "filenamePrefix", null);
        setBooleanField(term47629, term47629.getClass(), "reportDependencies", false);
        setField(term47629, term47629.getClass(), "module", null);
        term47631 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term47632 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term47633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47634 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term47635 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term47631, term47631.getClass(), "number", 0.0);
        setIntField(term47631, term47631.getClass(), "type", 0);
        setField(term47631, term47631.getClass(), "next", null);
        setDoubleField(term47632, term47632.getClass(), "number", 0.0);
        setIntField(term47632, term47632.getClass(), "type", 0);
        setIntField(term47633, term47633.getClass(), "type", 0);
        setField(term47633, term47633.getClass(), "next", null);
        setField(term47633, term47633.getClass(), "first", null);
        setField(term47633, term47633.getClass(), "last", null);
        setField(term47633, term47633.getClass(), "propListHead", null);
        setIntField(term47633, term47633.getClass(), "sourcePosition", 0);
        setField(term47633, term47633.getClass(), "jsType", null);
        setField(term47633, term47633.getClass(), "parent", null);
        setField(term47632, term47632.getClass(), "next", term47633);
        setDoubleField(term47634, term47634.getClass(), "number", 0.0);
        setIntField(term47634, term47634.getClass(), "type", 37);
        setIntField(term47635, term47635.getClass(), "type", 0);
        setField(term47635, term47635.getClass(), "next", null);
        setField(term47635, term47635.getClass(), "first", null);
        setField(term47635, term47635.getClass(), "last", null);
        setField(term47635, term47635.getClass(), "propListHead", null);
        setIntField(term47635, term47635.getClass(), "sourcePosition", 0);
        setField(term47635, term47635.getClass(), "jsType", null);
        setField(term47635, term47635.getClass(), "parent", null);
        setField(term47634, term47634.getClass(), "next", term47635);
        setField(term47634, term47634.getClass(), "first", null);
        setField(term47634, term47634.getClass(), "last", null);
        setField(term47634, term47634.getClass(), "propListHead", null);
        setIntField(term47634, term47634.getClass(), "sourcePosition", 0);
        setField(term47634, term47634.getClass(), "jsType", null);
        setField(term47634, term47634.getClass(), "parent", null);
        setField(term47632, term47632.getClass(), "first", term47634);
        setField(term47632, term47632.getClass(), "last", null);
        setField(term47632, term47632.getClass(), "propListHead", null);
        setIntField(term47632, term47632.getClass(), "sourcePosition", 0);
        setField(term47632, term47632.getClass(), "jsType", null);
        setField(term47632, term47632.getClass(), "parent", null);
        setField(term47631, term47631.getClass(), "first", term47632);
        setField(term47631, term47631.getClass(), "last", null);
        setField(term47631, term47631.getClass(), "propListHead", null);
        setIntField(term47631, term47631.getClass(), "sourcePosition", 0);
        setField(term47631, term47631.getClass(), "jsType", null);
        setField(term47631, term47631.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term46803;
        callMethod(klass, "process", argTypes, term46631, args);
        assertTrue(recursiveEquals(term46631, term47629));
        assertTrue(recursiveEquals(term46803, null));
    }

};


