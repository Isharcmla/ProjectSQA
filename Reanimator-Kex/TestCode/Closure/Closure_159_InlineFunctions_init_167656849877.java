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
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class InlineFunctions_init_167656849877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14292;
     Object term14400;
     Object term14721;
     Object term14729;
     Object term14730;

    public InlineFunctions_init_167656849877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14164 = new HashMap();
        HashMap term14212 = new HashMap();
        Object term14116 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term14116, term14116.getClass(), "fns", term14164);
        setField(term14116, term14116.getClass(), "anonFns", term14212);
        term14292 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        term14400 = newInstance(Class.forName("com.google.common.base.Suppliers$SupplierOfInstance"));
        HashMap term14722 = new HashMap();
        HashMap term14723 = new HashMap();
        HashMap term14728 = new HashMap();
        Set<Object> term14731 =  ((Map) term14728).keySet();
        HashSet term14727 = new HashSet((Collection<? extends Object>) term14731);
        term14721 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        Object term14724 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term14725 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        Object term14726 = newInstance(Class.forName("com.google.common.base.Suppliers$SupplierOfInstance"));
        setField(term14721, term14721.getClass(), "fns", term14722);
        setField(term14721, term14721.getClass(), "anonFns", term14723);
        setField(term14724, term14724.getClass(), "options", null);
        setField(term14724, term14724.getClass(), "passes", null);
        setField(term14724, term14724.getClass(), "externs", null);
        setField(term14724, term14724.getClass(), "modules", null);
        setField(term14724, term14724.getClass(), "moduleGraph", null);
        setField(term14724, term14724.getClass(), "inputs", null);
        setField(term14724, term14724.getClass(), "errorManager", null);
        setField(term14724, term14724.getClass(), "warningsGuard", null);
        setField(term14724, term14724.getClass(), "externsRoot", null);
        setField(term14724, term14724.getClass(), "jsRoot", null);
        setField(term14724, term14724.getClass(), "externAndJsRoot", null);
        setField(term14724, term14724.getClass(), "inputsByName", null);
        setField(term14724, term14724.getClass(), "sourceMap", null);
        setField(term14724, term14724.getClass(), "externExports", null);
        setIntField(term14724, term14724.getClass(), "uniqueNameId", 0);
        setBooleanField(term14724, term14724.getClass(), "useThreads", false);
        setBooleanField(term14724, term14724.getClass(), "hasRegExpGlobalReferences", false);
        setField(term14724, term14724.getClass(), "functionInformationMap", null);
        setField(term14724, term14724.getClass(), "debugLog", null);
        setField(term14724, term14724.getClass(), "defaultCodingConvention", null);
        setField(term14724, term14724.getClass(), "typeRegistry", null);
        setField(term14724, term14724.getClass(), "parserConfig", null);
        setField(term14724, term14724.getClass(), "abstractInterpreter", null);
        setField(term14724, term14724.getClass(), "typeValidator", null);
        setField(term14724, term14724.getClass(), "tracker", null);
        setField(term14724, term14724.getClass(), "oldErrorReporter", null);
        setField(term14724, term14724.getClass(), "defaultErrorReporter", null);
        setField(term14724, term14724.getClass(), "outStream", null);
        setField(term14724, term14724.getClass(), "sanityCheck", null);
        setField(term14724, term14724.getClass(), "currentTracer", null);
        setField(term14724, term14724.getClass(), "currentPassName", null);
        setField(term14724, term14724.getClass(), "recentChange", null);
        setField(term14724, term14724.getClass(), "codeChangeHandlers", null);
        setField(term14724, term14724.getClass(), "stage", null);
        setField(term14721, term14721.getClass(), "compiler", term14724);
        setField(term14725, term14725.getClass(), "compiler", term14724);
        setField(term14726, term14726.getClass(), "instance", null);
        setField(term14725, term14725.getClass(), "safeNameIdSupplier", term14726);
        setBooleanField(term14725, term14725.getClass(), "allowDecomposition", true);
        setField(term14725, term14725.getClass(), "knownConstants", term14727);
        setField(term14721, term14721.getClass(), "injector", term14725);
        setBooleanField(term14721, term14721.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term14721, term14721.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term14721, term14721.getClass(), "inlineLocalFunctions", false);
        setField(term14721, term14721.getClass(), "specializationState", null);
        term14729 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term14729, term14729.getClass(), "options", null);
        setField(term14729, term14729.getClass(), "passes", null);
        setField(term14729, term14729.getClass(), "externs", null);
        setField(term14729, term14729.getClass(), "modules", null);
        setField(term14729, term14729.getClass(), "moduleGraph", null);
        setField(term14729, term14729.getClass(), "inputs", null);
        setField(term14729, term14729.getClass(), "errorManager", null);
        setField(term14729, term14729.getClass(), "warningsGuard", null);
        setField(term14729, term14729.getClass(), "externsRoot", null);
        setField(term14729, term14729.getClass(), "jsRoot", null);
        setField(term14729, term14729.getClass(), "externAndJsRoot", null);
        setField(term14729, term14729.getClass(), "inputsByName", null);
        setField(term14729, term14729.getClass(), "sourceMap", null);
        setField(term14729, term14729.getClass(), "externExports", null);
        setIntField(term14729, term14729.getClass(), "uniqueNameId", 0);
        setBooleanField(term14729, term14729.getClass(), "useThreads", false);
        setBooleanField(term14729, term14729.getClass(), "hasRegExpGlobalReferences", false);
        setField(term14729, term14729.getClass(), "functionInformationMap", null);
        setField(term14729, term14729.getClass(), "debugLog", null);
        setField(term14729, term14729.getClass(), "defaultCodingConvention", null);
        setField(term14729, term14729.getClass(), "typeRegistry", null);
        setField(term14729, term14729.getClass(), "parserConfig", null);
        setField(term14729, term14729.getClass(), "abstractInterpreter", null);
        setField(term14729, term14729.getClass(), "typeValidator", null);
        setField(term14729, term14729.getClass(), "tracker", null);
        setField(term14729, term14729.getClass(), "oldErrorReporter", null);
        setField(term14729, term14729.getClass(), "defaultErrorReporter", null);
        setField(term14729, term14729.getClass(), "outStream", null);
        setField(term14729, term14729.getClass(), "sanityCheck", null);
        setField(term14729, term14729.getClass(), "currentTracer", null);
        setField(term14729, term14729.getClass(), "currentPassName", null);
        setField(term14729, term14729.getClass(), "recentChange", null);
        setField(term14729, term14729.getClass(), "codeChangeHandlers", null);
        setField(term14729, term14729.getClass(), "stage", null);
        term14730 = newInstance(Class.forName("com.google.common.base.Suppliers$SupplierOfInstance"));
        setField(term14730, term14730.getClass(), "instance", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.common.base.Supplier");
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = term14292;
        args[1] = term14400;
        args[2] = false;
        args[3] = false;
        args[4] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term14721));
        assertTrue(recursiveEquals(term14292, term14729));
        assertTrue(recursiveEquals(term14400, term14730));
    }

};


