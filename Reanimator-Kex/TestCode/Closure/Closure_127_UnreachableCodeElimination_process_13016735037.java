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

public class UnreachableCodeElimination_process_13016735037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1054;
     Object term3782;

    public UnreachableCodeElimination_process_13016735037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1054 = newInstance(Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination"));
        Object term1134 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term1204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1134, term1134.getClass(), "jsRoot", term1204);
        setField(term1134, term1134.getClass(), "phaseOptimizer", null);
        setField(term1054, term1054.getClass(), "compiler", term1134);
        term3782 = newInstance(Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination"));
        Object term3783 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term3784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3783, term3783.getClass(), "options", null);
        setField(term3783, term3783.getClass(), "passes", null);
        setField(term3783, term3783.getClass(), "externs", null);
        setField(term3783, term3783.getClass(), "modules", null);
        setField(term3783, term3783.getClass(), "moduleGraph", null);
        setField(term3783, term3783.getClass(), "inputs", null);
        setField(term3783, term3783.getClass(), "errorManager", null);
        setField(term3783, term3783.getClass(), "warningsGuard", null);
        setField(term3783, term3783.getClass(), "injectedLibraries", null);
        setField(term3783, term3783.getClass(), "externsRoot", null);
        setIntField(term3784, term3784.getClass(), "type", 0);
        setField(term3784, term3784.getClass(), "next", null);
        setField(term3784, term3784.getClass(), "first", null);
        setField(term3784, term3784.getClass(), "last", null);
        setField(term3784, term3784.getClass(), "propListHead", null);
        setIntField(term3784, term3784.getClass(), "sourcePosition", 0);
        setField(term3784, term3784.getClass(), "jsType", null);
        setField(term3784, term3784.getClass(), "parent", null);
        setField(term3783, term3783.getClass(), "jsRoot", term3784);
        setField(term3783, term3783.getClass(), "externAndJsRoot", null);
        setField(term3783, term3783.getClass(), "inputsById", null);
        setField(term3783, term3783.getClass(), "sourceMap", null);
        setField(term3783, term3783.getClass(), "externExports", null);
        setIntField(term3783, term3783.getClass(), "uniqueNameId", 0);
        setBooleanField(term3783, term3783.getClass(), "hasRegExpGlobalReferences", false);
        setField(term3783, term3783.getClass(), "functionInformationMap", null);
        setField(term3783, term3783.getClass(), "debugLog", null);
        setField(term3783, term3783.getClass(), "defaultCodingConvention", null);
        setField(term3783, term3783.getClass(), "typeRegistry", null);
        setField(term3783, term3783.getClass(), "parserConfig", null);
        setField(term3783, term3783.getClass(), "abstractInterpreter", null);
        setField(term3783, term3783.getClass(), "typeValidator", null);
        setField(term3783, term3783.getClass(), "phaseOptimizer", null);
        setField(term3783, term3783.getClass(), "tracker", null);
        setField(term3783, term3783.getClass(), "oldErrorReporter", null);
        setField(term3783, term3783.getClass(), "defaultErrorReporter", null);
        setField(term3783, term3783.getClass(), "compilerThread", null);
        setBooleanField(term3783, term3783.getClass(), "useThreads", false);
        setField(term3783, term3783.getClass(), "outStream", null);
        setField(term3783, term3783.getClass(), "globalRefMap", null);
        setDoubleField(term3783, term3783.getClass(), "progress", 0.0);
        setField(term3783, term3783.getClass(), "lastPassName", null);
        setField(term3783, term3783.getClass(), "sanityCheck", null);
        setField(term3783, term3783.getClass(), "currentTracer", null);
        setField(term3783, term3783.getClass(), "currentPassName", null);
        setIntField(term3783, term3783.getClass(), "syntheticCodeId", 0);
        setField(term3783, term3783.getClass(), "recentChange", null);
        setField(term3783, term3783.getClass(), "codeChangeHandlers", null);
        setField(term3783, term3783.getClass(), "synthesizedExternsInput", null);
        setField(term3783, term3783.getClass(), "stage", null);
        setBooleanField(term3783, term3783.getClass(), "analyzeChangedFunsOnly", false);
        setField(term3782, term3782.getClass(), "compiler", term3783);
        setBooleanField(term3782, term3782.getClass(), "removeNoOpStatements", false);
        setBooleanField(term3782, term3782.getClass(), "codeChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "process", argTypes, term1054, args);
        assertTrue(recursiveEquals(term1054, term3782));
    }

};


