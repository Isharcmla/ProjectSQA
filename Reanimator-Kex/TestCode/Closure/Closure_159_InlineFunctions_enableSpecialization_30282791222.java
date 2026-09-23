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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class InlineFunctions_enableSpecialization_30282791222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60;
     Object term91;
     Object term1655;
     Object term1665;

    public InlineFunctions_enableSpecialization_30282791222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term61 = new HashMap();
        HashMap term76 = new HashMap();
        term60 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term60, term60.getClass(), "fns", term61);
        setField(term60, term60.getClass(), "anonFns", term76);
        setField(term60, term60.getClass(), "compiler", null);
        setField(term60, term60.getClass(), "injector", null);
        setBooleanField(term60, term60.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term60, term60.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term60, term60.getClass(), "inlineLocalFunctions", false);
        setField(term60, term60.getClass(), "specializationState", null);
        HashMap term93 = new HashMap();
        Set<Object> term1672 =  ((Map) term93).keySet();
        HashSet term92 = new HashSet((Collection<? extends Object>) term1672);
        HashMap term106 = new HashMap();
        Set<Object> term1673 =  ((Map) term106).keySet();
        HashSet term105 = new HashSet((Collection<? extends Object>) term1673);
        HashMap term120 = new HashMap();
        term91 = newInstance(Class.forName("com.google.javascript.jscomp.SpecializeModule$SpecializationState"));
        Object term134 = newInstance(Class.forName("com.google.javascript.jscomp.SimpleFunctionAliasAnalysis"));
        setField(term91, term91.getClass(), "specializedFunctions", term92);
        setField(term91, term91.getClass(), "removedFunctions", term105);
        setField(term91, term91.getClass(), "removedFunctionToBlock", term120);
        setField(term134, term134.getClass(), "aliasedFunctions", null);
        setField(term134, term134.getClass(), "functionsExposedToCallOrApply", null);
        setField(term91, term91.getClass(), "initialModuleAliasAnalysis", term134);
        setBooleanField(term91, term91.getClass(), "hasChanged", true);
        HashMap term1656 = new HashMap();
        HashMap term1657 = new HashMap();
        HashMap term1660 = new HashMap();
        Set<Object> term1674 =  ((Map) term1660).keySet();
        HashSet term1659 = new HashSet((Collection<? extends Object>) term1674);
        HashMap term1662 = new HashMap();
        Set<Object> term1675 =  ((Map) term1662).keySet();
        HashSet term1661 = new HashSet((Collection<? extends Object>) term1675);
        HashMap term1663 = new HashMap();
        term1655 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        Object term1658 = newInstance(Class.forName("com.google.javascript.jscomp.SpecializeModule$SpecializationState"));
        Object term1664 = newInstance(Class.forName("com.google.javascript.jscomp.SimpleFunctionAliasAnalysis"));
        setField(term1655, term1655.getClass(), "fns", term1656);
        setField(term1655, term1655.getClass(), "anonFns", term1657);
        setField(term1655, term1655.getClass(), "compiler", null);
        setField(term1655, term1655.getClass(), "injector", null);
        setBooleanField(term1655, term1655.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term1655, term1655.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term1655, term1655.getClass(), "inlineLocalFunctions", false);
        setField(term1658, term1658.getClass(), "specializedFunctions", term1659);
        setField(term1658, term1658.getClass(), "removedFunctions", term1661);
        setField(term1658, term1658.getClass(), "removedFunctionToBlock", term1663);
        setField(term1664, term1664.getClass(), "aliasedFunctions", null);
        setField(term1664, term1664.getClass(), "functionsExposedToCallOrApply", null);
        setField(term1658, term1658.getClass(), "initialModuleAliasAnalysis", term1664);
        setBooleanField(term1658, term1658.getClass(), "hasChanged", true);
        setField(term1655, term1655.getClass(), "specializationState", term1658);
        HashMap term1667 = new HashMap();
        Set<Object> term1676 =  ((Map) term1667).keySet();
        HashSet term1666 = new HashSet((Collection<? extends Object>) term1676);
        HashMap term1669 = new HashMap();
        Set<Object> term1677 =  ((Map) term1669).keySet();
        HashSet term1668 = new HashSet((Collection<? extends Object>) term1677);
        HashMap term1670 = new HashMap();
        term1665 = newInstance(Class.forName("com.google.javascript.jscomp.SpecializeModule$SpecializationState"));
        Object term1671 = newInstance(Class.forName("com.google.javascript.jscomp.SimpleFunctionAliasAnalysis"));
        setField(term1665, term1665.getClass(), "specializedFunctions", term1666);
        setField(term1665, term1665.getClass(), "removedFunctions", term1668);
        setField(term1665, term1665.getClass(), "removedFunctionToBlock", term1670);
        setField(term1671, term1671.getClass(), "aliasedFunctions", null);
        setField(term1671, term1671.getClass(), "functionsExposedToCallOrApply", null);
        setField(term1665, term1665.getClass(), "initialModuleAliasAnalysis", term1671);
        setBooleanField(term1665, term1665.getClass(), "hasChanged", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.SpecializeModule$SpecializationState");
        Object[] args = new Object[1];
        args[0] = term91;
        callMethod(klass, "enableSpecialization", argTypes, term60, args);
        assertTrue(recursiveEquals(term60, term1655));
        assertTrue(recursiveEquals(term91, term1665));
    }

};


