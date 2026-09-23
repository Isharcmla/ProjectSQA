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

public class ProcessCommonJSModules_process_627866047221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112514;
     Object term112584;
     Object term113132;

    public ProcessCommonJSModules_process_627866047221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112514 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term112514, term112514.getClass(), "compiler", null);
        term112584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112864 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term112584, term112584.getClass(), "type", 0);
        setField(term112584, term112584.getClass(), "parent", null);
        setField(term112864, term112864.getClass(), "next", null);
        setIntField(term112864, term112864.getClass(), "type", 0);
        setField(term112864, term112864.getClass(), "first", null);
        setField(term112794, term112794.getClass(), "next", term112864);
        setIntField(term112794, term112794.getClass(), "type", 37);
        setField(term112794, term112794.getClass(), "first", null);
        setField(term112724, term112724.getClass(), "next", term112794);
        setIntField(term112724, term112724.getClass(), "type", 37);
        setField(term112724, term112724.getClass(), "first", null);
        setField(term112654, term112654.getClass(), "next", term112724);
        setIntField(term112654, term112654.getClass(), "type", 0);
        setField(term112654, term112654.getClass(), "first", term112724);
        setField(term112584, term112584.getClass(), "first", term112654);
        term113132 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term113132, term113132.getClass(), "options", null);
        setField(term113132, term113132.getClass(), "passes", null);
        setField(term113132, term113132.getClass(), "externs", null);
        setField(term113132, term113132.getClass(), "modules", null);
        setField(term113132, term113132.getClass(), "moduleGraph", null);
        setField(term113132, term113132.getClass(), "inputs", null);
        setField(term113132, term113132.getClass(), "errorManager", null);
        setField(term113132, term113132.getClass(), "warningsGuard", null);
        setField(term113132, term113132.getClass(), "injectedLibraries", null);
        setField(term113132, term113132.getClass(), "externsRoot", null);
        setField(term113132, term113132.getClass(), "jsRoot", null);
        setField(term113132, term113132.getClass(), "externAndJsRoot", null);
        setField(term113132, term113132.getClass(), "inputsById", null);
        setField(term113132, term113132.getClass(), "sourceMap", null);
        setField(term113132, term113132.getClass(), "externExports", null);
        setIntField(term113132, term113132.getClass(), "uniqueNameId", 0);
        setBooleanField(term113132, term113132.getClass(), "hasRegExpGlobalReferences", false);
        setField(term113132, term113132.getClass(), "functionInformationMap", null);
        setField(term113132, term113132.getClass(), "debugLog", null);
        setField(term113132, term113132.getClass(), "defaultCodingConvention", null);
        setField(term113132, term113132.getClass(), "typeRegistry", null);
        setField(term113132, term113132.getClass(), "parserConfig", null);
        setField(term113132, term113132.getClass(), "abstractInterpreter", null);
        setField(term113132, term113132.getClass(), "typeValidator", null);
        setField(term113132, term113132.getClass(), "tracker", null);
        setField(term113132, term113132.getClass(), "oldErrorReporter", null);
        setField(term113132, term113132.getClass(), "defaultErrorReporter", null);
        setField(term113132, term113132.getClass(), "compilerThread", null);
        setBooleanField(term113132, term113132.getClass(), "useThreads", false);
        setField(term113132, term113132.getClass(), "outStream", null);
        setField(term113132, term113132.getClass(), "globalRefMap", null);
        setDoubleField(term113132, term113132.getClass(), "progress", 0.0);
        setField(term113132, term113132.getClass(), "lastPassName", null);
        setField(term113132, term113132.getClass(), "sanityCheck", null);
        setField(term113132, term113132.getClass(), "currentTracer", null);
        setField(term113132, term113132.getClass(), "currentPassName", null);
        setIntField(term113132, term113132.getClass(), "syntheticCodeId", 0);
        setField(term113132, term113132.getClass(), "recentChange", null);
        setField(term113132, term113132.getClass(), "codeChangeHandlers", null);
        setField(term113132, term113132.getClass(), "synthesizedExternsInput", null);
        setField(term113132, term113132.getClass(), "stage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term112584;
        callMethod(klass, "process", argTypes, term112514, args);
        assertTrue(recursiveEquals(term112514, term113132));
        assertTrue(recursiveEquals(term112584, null));
    }

};


