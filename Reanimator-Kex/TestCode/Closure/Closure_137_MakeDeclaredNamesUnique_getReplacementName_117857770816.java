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
     Object term468;
     Object term1891;

    public MakeDeclaredNamesUnique_getReplacementName_117857770816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term469 = new ArrayDeque();
        HashMap term475 = new HashMap();
        HashMap term483 = new HashMap();
        term468 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        Object term473 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        Object term474 = newInstance(Class.forName("com.google.common.collect.HashMultiset"));
        Object term482 = newInstance(Class.forName("com.google.common.collect.AbstractMapBasedMultiset$EntrySet"));
        setField(term468, term468.getClass(), "nameStack", term469);
        setField(term474, term474.getClass(), "backingMap", term475);
        setLongField(term474, term474.getClass(), "size", 0L);
        setField(term482, term482.getClass(), "this$0", term474);
        setField(term474, term474.getClass(), "entrySet", term482);
        setField(term474, term474.getClass(), "elementSet", null);
        setField(term473, term473.getClass(), "nameUsage", term474);
        setField(term473, term473.getClass(), "declarations", term483);
        setBooleanField(term473, term473.getClass(), "global", true);
        setField(term468, term468.getClass(), "rootRenamer", term473);
        ArrayDeque term1892 = new ArrayDeque();
        HashMap term1896 = new HashMap();
        HashMap term1898 = new HashMap();
        term1891 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        Object term1894 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer"));
        Object term1895 = newInstance(Class.forName("com.google.common.collect.HashMultiset"));
        Object term1897 = newInstance(Class.forName("com.google.common.collect.AbstractMapBasedMultiset$EntrySet"));
        setField(term1891, term1891.getClass(), "nameStack", term1892);
        setField(term1895, term1895.getClass(), "backingMap", term1896);
        setLongField(term1895, term1895.getClass(), "size", 0L);
        setField(term1897, term1897.getClass(), "this$0", term1895);
        setField(term1895, term1895.getClass(), "entrySet", term1897);
        setField(term1895, term1895.getClass(), "elementSet", null);
        setField(term1894, term1894.getClass(), "nameUsage", term1895);
        setField(term1894, term1894.getClass(), "declarations", term1898);
        setBooleanField(term1894, term1894.getClass(), "global", true);
        setField(term1891, term1891.getClass(), "rootRenamer", term1894);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jJCZpVmanW";
        Object retValue = callMethod(klass, "getReplacementName", argTypes, term468, args);
        assertTrue(recursiveEquals(term468, term1891));
        assertTrue(recursiveEquals(retValue, null));
    }

};


