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

public class NameAnalyzer_getRhsSubexpressions_1855552708123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32479;
     Object term32549;
     Object term34829;
     Object term34830;
     Object term34825;

    public NameAnalyzer_getRhsSubexpressions_1855552708123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32479 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        term32549 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32549, term32549.getClass(), "type", 130);
        setIntField(term32619, term32619.getClass(), "type", 130);
        setIntField(term32689, term32689.getClass(), "type", 130);
        setIntField(term32759, term32759.getClass(), "type", 130);
        setIntField(term32829, term32829.getClass(), "type", 130);
        setIntField(term32899, term32899.getClass(), "type", 130);
        setIntField(term32969, term32969.getClass(), "type", 130);
        setIntField(term33039, term33039.getClass(), "type", 130);
        setIntField(term33109, term33109.getClass(), "type", 130);
        setIntField(term33179, term33179.getClass(), "type", 130);
        setIntField(term33249, term33249.getClass(), "type", 130);
        setIntField(term33319, term33319.getClass(), "type", 130);
        setIntField(term33389, term33389.getClass(), "type", 130);
        setIntField(term33459, term33459.getClass(), "type", 130);
        setIntField(term33529, term33529.getClass(), "type", 130);
        setIntField(term33599, term33599.getClass(), "type", 130);
        setIntField(term33669, term33669.getClass(), "type", 130);
        setIntField(term33739, term33739.getClass(), "type", 130);
        setIntField(term33809, term33809.getClass(), "type", 130);
        setIntField(term33879, term33879.getClass(), "type", 130);
        setIntField(term33949, term33949.getClass(), "type", 130);
        setIntField(term34019, term34019.getClass(), "type", 130);
        setIntField(term34089, term34089.getClass(), "type", 118);
        setField(term34019, term34019.getClass(), "first", term34089);
        setField(term33949, term33949.getClass(), "first", term34019);
        setField(term33879, term33879.getClass(), "first", term33949);
        setField(term33809, term33809.getClass(), "first", term33879);
        setField(term33739, term33739.getClass(), "first", term33809);
        setField(term33669, term33669.getClass(), "first", term33739);
        setField(term33599, term33599.getClass(), "first", term33669);
        setField(term33529, term33529.getClass(), "first", term33599);
        setField(term33459, term33459.getClass(), "first", term33529);
        setField(term33389, term33389.getClass(), "first", term33459);
        setField(term33319, term33319.getClass(), "first", term33389);
        setField(term33249, term33249.getClass(), "first", term33319);
        setField(term33179, term33179.getClass(), "first", term33249);
        setField(term33109, term33109.getClass(), "first", term33179);
        setField(term33039, term33039.getClass(), "first", term33109);
        setField(term32969, term32969.getClass(), "first", term33039);
        setField(term32899, term32899.getClass(), "first", term32969);
        setField(term32829, term32829.getClass(), "first", term32899);
        setField(term32759, term32759.getClass(), "first", term32829);
        setField(term32689, term32689.getClass(), "first", term32759);
        setField(term32619, term32619.getClass(), "first", term32689);
        setField(term32549, term32549.getClass(), "first", term32619);
        term34829 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        setField(term34829, term34829.getClass(), "compiler", null);
        setField(term34829, term34829.getClass(), "allNames", null);
        setField(term34829, term34829.getClass(), "referenceGraph", null);
        setField(term34829, term34829.getClass(), "scopes", null);
        setBooleanField(term34829, term34829.getClass(), "removeUnreferenced", false);
        setField(term34829, term34829.getClass(), "globalNames", null);
        setField(term34829, term34829.getClass(), "changeProxy", null);
        setField(term34829, term34829.getClass(), "externalNames", null);
        setField(term34829, term34829.getClass(), "refNodes", null);
        setField(term34829, term34829.getClass(), "aliases", null);
        term34830 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34831 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34832 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34834 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34830, term34830.getClass(), "type", 130);
        setField(term34830, term34830.getClass(), "next", null);
        setIntField(term34831, term34831.getClass(), "type", 130);
        setField(term34831, term34831.getClass(), "next", null);
        setIntField(term34832, term34832.getClass(), "type", 130);
        setField(term34832, term34832.getClass(), "next", null);
        setIntField(term34833, term34833.getClass(), "type", 130);
        setField(term34833, term34833.getClass(), "next", null);
        setIntField(term34834, term34834.getClass(), "type", 130);
        setField(term34834, term34834.getClass(), "next", null);
        setField(term34834, term34834.getClass(), "first", null);
        setField(term34834, term34834.getClass(), "last", null);
        setField(term34834, term34834.getClass(), "propListHead", null);
        setIntField(term34834, term34834.getClass(), "sourcePosition", 0);
        setField(term34834, term34834.getClass(), "jsType", null);
        setField(term34834, term34834.getClass(), "parent", null);
        setField(term34833, term34833.getClass(), "first", term34834);
        setField(term34833, term34833.getClass(), "last", null);
        setField(term34833, term34833.getClass(), "propListHead", null);
        setIntField(term34833, term34833.getClass(), "sourcePosition", 0);
        setField(term34833, term34833.getClass(), "jsType", null);
        setField(term34833, term34833.getClass(), "parent", null);
        setField(term34832, term34832.getClass(), "first", term34833);
        setField(term34832, term34832.getClass(), "last", null);
        setField(term34832, term34832.getClass(), "propListHead", null);
        setIntField(term34832, term34832.getClass(), "sourcePosition", 0);
        setField(term34832, term34832.getClass(), "jsType", null);
        setField(term34832, term34832.getClass(), "parent", null);
        setField(term34831, term34831.getClass(), "first", term34832);
        setField(term34831, term34831.getClass(), "last", null);
        setField(term34831, term34831.getClass(), "propListHead", null);
        setIntField(term34831, term34831.getClass(), "sourcePosition", 0);
        setField(term34831, term34831.getClass(), "jsType", null);
        setField(term34831, term34831.getClass(), "parent", null);
        setField(term34830, term34830.getClass(), "first", term34831);
        setField(term34830, term34830.getClass(), "last", null);
        setField(term34830, term34830.getClass(), "propListHead", null);
        setIntField(term34830, term34830.getClass(), "sourcePosition", 0);
        setField(term34830, term34830.getClass(), "jsType", null);
        setField(term34830, term34830.getClass(), "parent", null);
        term34825 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term32549;
        Object retValue = callMethod(klass, "getRhsSubexpressions", argTypes, term32479, args);
        assertTrue(recursiveEquals(term32479, term34829));
        assertTrue(recursiveEquals(term32549, term34830));
        assertTrue(recursiveEquals(retValue, term34825));
    }

};


