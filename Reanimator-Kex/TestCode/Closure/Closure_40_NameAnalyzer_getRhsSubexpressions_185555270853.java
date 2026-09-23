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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class NameAnalyzer_getRhsSubexpressions_185555270853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3712;
     Object term3792;

    public NameAnalyzer_getRhsSubexpressions_185555270853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3713 = new HashMap();
        HashMap term3727 = new HashMap();
        HashMap term3744 = new HashMap();
        Set<Object> term16781 =  ((Map) term3744).keySet();
        HashSet term3743 = new HashSet((Collection<? extends Object>) term16781);
        ArrayList term3753 = new ArrayList();
        HashMap term3758 = new HashMap();
        Set<Object> term16782 =  ((Map) term3758).keySet();
        HashSet term3757 = new HashSet((Collection<? extends Object>) term16782);
        ArrayList term3778 = new ArrayList();
        ((ArrayList) term3778).add((Object)null);
        HashMap term3782 = new HashMap();
        term3712 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term3752 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term3712, term3712.getClass(), "compiler", null);
        setField(term3712, term3712.getClass(), "allNames", term3713);
        setField(term3712, term3712.getClass(), "referenceGraph", null);
        setField(term3712, term3712.getClass(), "scopes", term3727);
        setBooleanField(term3712, term3712.getClass(), "removeUnreferenced", true);
        setField(term3712, term3712.getClass(), "globalNames", term3743);
        setField(term3752, term3752.getClass(), "listeners", term3753);
        setField(term3712, term3712.getClass(), "changeProxy", term3752);
        setField(term3712, term3712.getClass(), "externalNames", term3757);
        setField(term3712, term3712.getClass(), "refNodes", term3778);
        setField(term3712, term3712.getClass(), "aliases", term3782);
        term3792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3792, term3792.getClass(), "type", 1074848808);
        setIntField(term3794, term3794.getClass(), "type", -146054762);
        setIntField(term3796, term3796.getClass(), "type", 798043553);
        setIntField(term3798, term3798.getClass(), "type", 533197381);
        setIntField(term3800, term3800.getClass(), "type", 1048271679);
        setField(term3800, term3800.getClass(), "next", null);
        setField(term3800, term3800.getClass(), "first", null);
        setField(term3800, term3800.getClass(), "last", null);
        setField(term3800, term3800.getClass(), "propListHead", null);
        setIntField(term3800, term3800.getClass(), "sourcePosition", 0);
        setField(term3800, term3800.getClass(), "jsType", null);
        setField(term3800, term3800.getClass(), "parent", null);
        setField(term3798, term3798.getClass(), "next", term3800);
        setIntField(term3803, term3803.getClass(), "type", -1529797673);
        setField(term3803, term3803.getClass(), "next", null);
        setField(term3803, term3803.getClass(), "first", null);
        setField(term3803, term3803.getClass(), "last", term3800);
        setField(term3803, term3803.getClass(), "propListHead", null);
        setIntField(term3803, term3803.getClass(), "sourcePosition", 0);
        setField(term3803, term3803.getClass(), "jsType", null);
        setField(term3803, term3803.getClass(), "parent", null);
        setField(term3798, term3798.getClass(), "first", term3803);
        setField(term3798, term3798.getClass(), "last", term3796);
        setField(term3798, term3798.getClass(), "propListHead", null);
        setIntField(term3798, term3798.getClass(), "sourcePosition", 0);
        setField(term3798, term3798.getClass(), "jsType", null);
        setField(term3798, term3798.getClass(), "parent", null);
        setField(term3796, term3796.getClass(), "next", term3798);
        setField(term3796, term3796.getClass(), "first", term3800);
        setIntField(term3807, term3807.getClass(), "type", 1922684808);
        setIntField(term3809, term3809.getClass(), "type", -2005784375);
        setField(term3809, term3809.getClass(), "next", null);
        setField(term3809, term3809.getClass(), "first", term3803);
        setField(term3809, term3809.getClass(), "last", term3798);
        setField(term3809, term3809.getClass(), "propListHead", null);
        setIntField(term3809, term3809.getClass(), "sourcePosition", 0);
        setField(term3809, term3809.getClass(), "jsType", null);
        setField(term3809, term3809.getClass(), "parent", null);
        setField(term3807, term3807.getClass(), "next", term3809);
        setField(term3807, term3807.getClass(), "first", term3794);
        setField(term3807, term3807.getClass(), "last", term3794);
        setField(term3807, term3807.getClass(), "propListHead", null);
        setIntField(term3807, term3807.getClass(), "sourcePosition", 0);
        setField(term3807, term3807.getClass(), "jsType", null);
        setField(term3807, term3807.getClass(), "parent", null);
        setField(term3796, term3796.getClass(), "last", term3807);
        setField(term3796, term3796.getClass(), "propListHead", null);
        setIntField(term3796, term3796.getClass(), "sourcePosition", 0);
        setField(term3796, term3796.getClass(), "jsType", null);
        setField(term3796, term3796.getClass(), "parent", null);
        setField(term3794, term3794.getClass(), "next", term3796);
        setIntField(term3814, term3814.getClass(), "type", -288604325);
        setField(term3814, term3814.getClass(), "next", term3807);
        setField(term3814, term3814.getClass(), "first", term3809);
        setField(term3814, term3814.getClass(), "last", term3792);
        setField(term3814, term3814.getClass(), "propListHead", null);
        setIntField(term3814, term3814.getClass(), "sourcePosition", 0);
        setField(term3814, term3814.getClass(), "jsType", null);
        setField(term3814, term3814.getClass(), "parent", null);
        setField(term3794, term3794.getClass(), "first", term3814);
        setField(term3794, term3794.getClass(), "last", term3814);
        setField(term3794, term3794.getClass(), "propListHead", null);
        setIntField(term3794, term3794.getClass(), "sourcePosition", 0);
        setField(term3794, term3794.getClass(), "jsType", null);
        setField(term3794, term3794.getClass(), "parent", null);
        setField(term3792, term3792.getClass(), "next", term3794);
        setField(term3792, term3792.getClass(), "first", term3798);
        setField(term3792, term3792.getClass(), "last", term3800);
        setField(term3792, term3792.getClass(), "propListHead", null);
        setIntField(term3792, term3792.getClass(), "sourcePosition", 0);
        setField(term3792, term3792.getClass(), "jsType", null);
        setField(term3792, term3792.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3792;
        try {
            callMethod(klass, "getRhsSubexpressions", argTypes, term3712, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


