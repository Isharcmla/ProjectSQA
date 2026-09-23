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
import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ProcessClosurePrimitives_init_114265507787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26112;
     Object term27001;
     Object term27016;

    public ProcessClosurePrimitives_init_114265507787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term25738 = new HashMap();
        ArrayList term25790 = new ArrayList();
        ArrayList term25842 = new ArrayList();
        Object term25690 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term25922 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term26032 = newInstance(Class.forName("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        setField(term25690, term25690.getClass(), "providedNames", term25738);
        setField(term25690, term25690.getClass(), "unrecognizedRequires", term25790);
        setField(term25690, term25690.getClass(), "exportedVariables", null);
        setField(term25690, term25690.getClass(), "defineCalls", term25842);
        setField(term25690, term25690.getClass(), "compiler", term25922);
        setField(term25690, term25690.getClass(), "preprocessorSymbolTable", term26032);
        term26112 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        LinkedHashMap term27003 = new LinkedHashMap();
        ArrayList term27010 = new ArrayList();
        HashMap term27013 = new HashMap();
        Set<Object> term27017 =  ((Map) term27013).keySet();
        HashSet term27012 = new HashSet((Collection<? extends Object>) term27017);
        ArrayList term27014 = new ArrayList();
        term27001 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term27002 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term27002, term27002.getClass(), "options", null);
        setField(term27002, term27002.getClass(), "passes", null);
        setField(term27002, term27002.getClass(), "externs", null);
        setField(term27002, term27002.getClass(), "modules", null);
        setField(term27002, term27002.getClass(), "moduleGraph", null);
        setField(term27002, term27002.getClass(), "inputs", null);
        setField(term27002, term27002.getClass(), "errorManager", null);
        setField(term27002, term27002.getClass(), "warningsGuard", null);
        setField(term27002, term27002.getClass(), "injectedLibraries", null);
        setField(term27002, term27002.getClass(), "externsRoot", null);
        setField(term27002, term27002.getClass(), "jsRoot", null);
        setField(term27002, term27002.getClass(), "externAndJsRoot", null);
        setField(term27002, term27002.getClass(), "inputsById", null);
        setField(term27002, term27002.getClass(), "sourceMap", null);
        setField(term27002, term27002.getClass(), "externExports", null);
        setIntField(term27002, term27002.getClass(), "uniqueNameId", 0);
        setBooleanField(term27002, term27002.getClass(), "hasRegExpGlobalReferences", false);
        setField(term27002, term27002.getClass(), "functionInformationMap", null);
        setField(term27002, term27002.getClass(), "debugLog", null);
        setField(term27002, term27002.getClass(), "defaultCodingConvention", null);
        setField(term27002, term27002.getClass(), "typeRegistry", null);
        setField(term27002, term27002.getClass(), "parserConfig", null);
        setField(term27002, term27002.getClass(), "abstractInterpreter", null);
        setField(term27002, term27002.getClass(), "typeValidator", null);
        setField(term27002, term27002.getClass(), "phaseOptimizer", null);
        setField(term27002, term27002.getClass(), "tracker", null);
        setField(term27002, term27002.getClass(), "oldErrorReporter", null);
        setField(term27002, term27002.getClass(), "defaultErrorReporter", null);
        setField(term27002, term27002.getClass(), "compilerThread", null);
        setBooleanField(term27002, term27002.getClass(), "useThreads", false);
        setField(term27002, term27002.getClass(), "outStream", null);
        setField(term27002, term27002.getClass(), "globalRefMap", null);
        setDoubleField(term27002, term27002.getClass(), "progress", 0.0);
        setField(term27002, term27002.getClass(), "lastPassName", null);
        setField(term27002, term27002.getClass(), "sanityCheck", null);
        setField(term27002, term27002.getClass(), "currentTracer", null);
        setField(term27002, term27002.getClass(), "currentPassName", null);
        setIntField(term27002, term27002.getClass(), "syntheticCodeId", 0);
        setField(term27002, term27002.getClass(), "recentChange", null);
        setField(term27002, term27002.getClass(), "codeChangeHandlers", null);
        setField(term27002, term27002.getClass(), "synthesizedExternsInput", null);
        setField(term27002, term27002.getClass(), "stage", null);
        setBooleanField(term27002, term27002.getClass(), "analyzeChangedScopesOnly", false);
        setField(term27001, term27001.getClass(), "compiler", term27002);
        setField(term27001, term27001.getClass(), "moduleGraph", null);
        setField(term27001, term27001.getClass(), "providedNames", term27003);
        setField(term27001, term27001.getClass(), "unrecognizedRequires", term27010);
        setField(term27001, term27001.getClass(), "exportedVariables", term27012);
        setField(term27001, term27001.getClass(), "requiresLevel", null);
        setField(term27001, term27001.getClass(), "preprocessorSymbolTable", null);
        setField(term27001, term27001.getClass(), "defineCalls", term27014);
        term27016 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term27016, term27016.getClass(), "options", null);
        setField(term27016, term27016.getClass(), "passes", null);
        setField(term27016, term27016.getClass(), "externs", null);
        setField(term27016, term27016.getClass(), "modules", null);
        setField(term27016, term27016.getClass(), "moduleGraph", null);
        setField(term27016, term27016.getClass(), "inputs", null);
        setField(term27016, term27016.getClass(), "errorManager", null);
        setField(term27016, term27016.getClass(), "warningsGuard", null);
        setField(term27016, term27016.getClass(), "injectedLibraries", null);
        setField(term27016, term27016.getClass(), "externsRoot", null);
        setField(term27016, term27016.getClass(), "jsRoot", null);
        setField(term27016, term27016.getClass(), "externAndJsRoot", null);
        setField(term27016, term27016.getClass(), "inputsById", null);
        setField(term27016, term27016.getClass(), "sourceMap", null);
        setField(term27016, term27016.getClass(), "externExports", null);
        setIntField(term27016, term27016.getClass(), "uniqueNameId", 0);
        setBooleanField(term27016, term27016.getClass(), "hasRegExpGlobalReferences", false);
        setField(term27016, term27016.getClass(), "functionInformationMap", null);
        setField(term27016, term27016.getClass(), "debugLog", null);
        setField(term27016, term27016.getClass(), "defaultCodingConvention", null);
        setField(term27016, term27016.getClass(), "typeRegistry", null);
        setField(term27016, term27016.getClass(), "parserConfig", null);
        setField(term27016, term27016.getClass(), "abstractInterpreter", null);
        setField(term27016, term27016.getClass(), "typeValidator", null);
        setField(term27016, term27016.getClass(), "phaseOptimizer", null);
        setField(term27016, term27016.getClass(), "tracker", null);
        setField(term27016, term27016.getClass(), "oldErrorReporter", null);
        setField(term27016, term27016.getClass(), "defaultErrorReporter", null);
        setField(term27016, term27016.getClass(), "compilerThread", null);
        setBooleanField(term27016, term27016.getClass(), "useThreads", false);
        setField(term27016, term27016.getClass(), "outStream", null);
        setField(term27016, term27016.getClass(), "globalRefMap", null);
        setDoubleField(term27016, term27016.getClass(), "progress", 0.0);
        setField(term27016, term27016.getClass(), "lastPassName", null);
        setField(term27016, term27016.getClass(), "sanityCheck", null);
        setField(term27016, term27016.getClass(), "currentTracer", null);
        setField(term27016, term27016.getClass(), "currentPassName", null);
        setIntField(term27016, term27016.getClass(), "syntheticCodeId", 0);
        setField(term27016, term27016.getClass(), "recentChange", null);
        setField(term27016, term27016.getClass(), "codeChangeHandlers", null);
        setField(term27016, term27016.getClass(), "synthesizedExternsInput", null);
        setField(term27016, term27016.getClass(), "stage", null);
        setBooleanField(term27016, term27016.getClass(), "analyzeChangedScopesOnly", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.PreprocessorSymbolTable");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CheckLevel");
        Object[] args = new Object[3];
        args[0] = term26112;
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term27001));
        assertTrue(recursiveEquals(term26112, term27016));
    }

};


