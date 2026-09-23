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
import java.util.ArrayDeque;
import java.lang.Object;
import java.util.HashMap;

public class MakeDeclaredNamesUnique_getReplacementName_117857770816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term448;
     Object term1844;

    public MakeDeclaredNamesUnique_getReplacementName_117857770816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term449 = new ArrayDeque();
        HashMap term455 = new HashMap();
        HashMap term463 = new HashMap();
        term448 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        Object term453 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        Object term454 = newInstance(Class.forName("com.google.common.collect.HashMultiset"));
        Object term462 = newInstance(Class.forName("com.google.common.collect.AbstractMapBasedMultiset$EntrySet"));
        setField(term448, term448.getClass(), "nameStack", term449);
        setField(term454, term454.getClass(), "backingMap", term455);
        setLongField(term454, term454.getClass(), "size", 0L);
        setField(term462, term462.getClass(), "this$0", term454);
        setField(term454, term454.getClass(), "entrySet", term462);
        setField(term454, term454.getClass(), "elementSet", null);
        setField(term453, term453.getClass(), "nameUsage", term454);
        setField(term453, term453.getClass(), "declarations", term463);
        setBooleanField(term453, term453.getClass(), "global", true);
        setField(term448, term448.getClass(), "rootRenamer", term453);
        ArrayDeque term1845 = new ArrayDeque();
        HashMap term1849 = new HashMap();
        HashMap term1851 = new HashMap();
        term1844 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        Object term1847 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        Object term1848 = newInstance(Class.forName("com.google.common.collect.HashMultiset"));
        Object term1850 = newInstance(Class.forName("com.google.common.collect.AbstractMapBasedMultiset$EntrySet"));
        setField(term1844, term1844.getClass(), "nameStack", term1845);
        setField(term1848, term1848.getClass(), "backingMap", term1849);
        setLongField(term1848, term1848.getClass(), "size", 0L);
        setField(term1850, term1850.getClass(), "this$0", term1848);
        setField(term1848, term1848.getClass(), "entrySet", term1850);
        setField(term1848, term1848.getClass(), "elementSet", null);
        setField(term1847, term1847.getClass(), "nameUsage", term1848);
        setField(term1847, term1847.getClass(), "declarations", term1851);
        setBooleanField(term1847, term1847.getClass(), "global", true);
        setField(term1844, term1844.getClass(), "rootRenamer", term1847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jJCZpVmanW";
        Object retValue = callMethod(klass, "getReplacementName", argTypes, term448, args);
        assertTrue(recursiveEquals(term448, term1844));
        assertTrue(recursiveEquals(retValue, null));
    }

};


