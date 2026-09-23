package org.apache.commons.collections.map;

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
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class CaseInsensitiveMap_convertKey_10522158964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32;
     Object term224;

    public CaseInsensitiveMap_convertKey_10522158964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term215 = new HashMap();
        Set<Object> term374 =  ((Map) term215).keySet();
        HashSet term214 = new HashSet((Collection<? extends Object>) term374);
        ArrayList term220 = new ArrayList();
        term32 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        Object[] term35 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 1024);
        Object term36 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term64 = newInstance(Class.forName("java.lang.Object"));
        Object term65 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term93 = newInstance(Class.forName("java.lang.Object"));
        Object term94 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term122 = newInstance(Class.forName("java.lang.Object"));
        Object term123 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term151 = newInstance(Class.forName("java.lang.Object"));
        Object term152 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term179 = newInstance(Class.forName("java.lang.Object"));
        Object term180 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term208 = newInstance(Class.forName("java.lang.Object"));
        Object term211 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$EntrySet"));
        Object term212 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$KeySet"));
        Object term213 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$Values"));
        setFloatField(term32, term32.getClass(), "loadFactor", 0.75F);
        setIntField(term32, term32.getClass(), "size", 1484323167);
        setField(term36, term36.getClass(), "next", null);
        setField(term36, term36.getClass(), "key", "java.lang.object@3ba52b7e");
        setField(term36, term36.getClass(), "value", term64);
        setElement(term35, 200, term36);
        setField(term65, term65.getClass(), "next", null);
        setField(term65, term65.getClass(), "key", "java.lang.object@24dab193");
        setField(term65, term65.getClass(), "value", term93);
        setElement(term35, 311, term65);
        setField(term94, term94.getClass(), "next", null);
        setField(term94, term94.getClass(), "key", "java.lang.object@61e639ae");
        setField(term94, term94.getClass(), "value", term122);
        setElement(term35, 438, term94);
        setField(term123, term123.getClass(), "next", null);
        setField(term123, term123.getClass(), "key", "java.lang.object@450b4d74");
        setField(term123, term123.getClass(), "value", term151);
        setElement(term35, 478, term123);
        setField(term152, term152.getClass(), "next", null);
        setField(term152, term152.getClass(), "key", "java.lang.object@1b1d867");
        setField(term152, term152.getClass(), "value", term179);
        setElement(term35, 623, term152);
        setField(term180, term180.getClass(), "next", null);
        setField(term180, term180.getClass(), "key", "java.lang.object@3007db8d");
        setField(term180, term180.getClass(), "value", term208);
        setElement(term35, 942, term180);
        setField(term32, term32.getClass(), "data", term35);
        setIntField(term32, term32.getClass(), "threshold", 768);
        setIntField(term32, term32.getClass(), "modCount", 391863383);
        setField(term211, term211.getClass(), "parent", null);
        setField(term32, term32.getClass(), "entrySet", term211);
        setField(term212, term212.getClass(), "parent", null);
        setField(term32, term32.getClass(), "keySet", term212);
        setField(term213, term213.getClass(), "parent", null);
        setField(term32, term32.getClass(), "values", term213);
        setField(term32, term32.getClass(), "keySet", term214);
        setField(term32, term32.getClass(), "values", term220);
        term224 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term224;
        callMethod(klass, "convertKey", argTypes, term32, args);
    }

};


