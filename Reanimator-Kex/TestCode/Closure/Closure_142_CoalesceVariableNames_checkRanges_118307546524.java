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
import java.util.ArrayList;

public class CoalesceVariableNames_checkRanges_118307546524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5631;
     Object term5763;
     Object term5833;
     Object term6023;
     Object term6025;
     Object term6027;

    public CoalesceVariableNames_checkRanges_118307546524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5631 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        Object term5711 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term5631, term5631.getClass(), "compiler", term5711);
        term5763 = new ArrayList();
        term5833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5833, term5833.getClass(), "type", 132);
        term6023 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        Object term6024 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term6024, term6024.getClass(), "options", null);
        setField(term6024, term6024.getClass(), "passes", null);
        setField(term6024, term6024.getClass(), "externs", null);
        setField(term6024, term6024.getClass(), "modules", null);
        setField(term6024, term6024.getClass(), "moduleGraph", null);
        setField(term6024, term6024.getClass(), "inputs", null);
        setField(term6024, term6024.getClass(), "errorManager", null);
        setField(term6024, term6024.getClass(), "symbolTable", null);
        setField(term6024, term6024.getClass(), "externsRoot", null);
        setField(term6024, term6024.getClass(), "jsRoot", null);
        setField(term6024, term6024.getClass(), "externAndJsRoot", null);
        setField(term6024, term6024.getClass(), "inputsByName", null);
        setField(term6024, term6024.getClass(), "sourceMap", null);
        setField(term6024, term6024.getClass(), "externExports", null);
        setIntField(term6024, term6024.getClass(), "uniqueNameId", 0);
        setBooleanField(term6024, term6024.getClass(), "normalized", false);
        setBooleanField(term6024, term6024.getClass(), "useThreads", false);
        setField(term6024, term6024.getClass(), "functionInformationMap", null);
        setField(term6024, term6024.getClass(), "debugLog", null);
        setField(term6024, term6024.getClass(), "defaultCodingConvention", null);
        setField(term6024, term6024.getClass(), "typeRegistry", null);
        setField(term6024, term6024.getClass(), "parserConfig", null);
        setField(term6024, term6024.getClass(), "abstractInterpreter", null);
        setField(term6024, term6024.getClass(), "typeValidator", null);
        setField(term6024, term6024.getClass(), "tracker", null);
        setField(term6024, term6024.getClass(), "oldErrorReporter", null);
        setField(term6024, term6024.getClass(), "defaultErrorReporter", null);
        setField(term6024, term6024.getClass(), "outStream", null);
        setField(term6024, term6024.getClass(), "sanityCheck", null);
        setField(term6024, term6024.getClass(), "currentTracer", null);
        setField(term6024, term6024.getClass(), "currentPassName", null);
        setField(term6024, term6024.getClass(), "recentChange", null);
        setField(term6024, term6024.getClass(), "codeChangeHandlers", null);
        setField(term6023, term6023.getClass(), "compiler", term6024);
        setField(term6023, term6023.getClass(), "colorings", null);
        setBooleanField(term6023, term6023.getClass(), "usePseudoNames", false);
        term6025 = new ArrayList();
        term6027 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6027, term6027.getClass(), "type", 132);
        setField(term6027, term6027.getClass(), "next", null);
        setField(term6027, term6027.getClass(), "first", null);
        setField(term6027, term6027.getClass(), "last", null);
        setField(term6027, term6027.getClass(), "propListHead", null);
        setIntField(term6027, term6027.getClass(), "sourcePosition", 0);
        setField(term6027, term6027.getClass(), "jsType", null);
        setField(term6027, term6027.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term5763;
        args[1] = term5833;
        callMethod(klass, "checkRanges", argTypes, term5631, args);
        assertTrue(recursiveEquals(term5631, term6023));
        assertTrue(recursiveEquals(term5763, term6025));
        assertTrue(recursiveEquals(term5833, term6027));
    }

};


