package org.apache.commons.collections;

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
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Short;

public class ExtendedProperties_getShort_194927783106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18264;
     Object term18413;
     Object term60095;

    public ExtendedProperties_getShort_194927783106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18270 = new ArrayList();
        ArrayList term18319 = new ArrayList();
        ((ArrayList) term18319).add("java.lang.Object@41a88eb3");
        HashMap term18386 = new HashMap();
        Set<Object> term60209 =  ((Map) term18386).keySet();
        HashSet term18385 = new HashSet((Collection<? extends Object>) term60209);
        HashMap term18392 = new HashMap();
        Set<Object> term60210 =  ((Map) term18392).keySet();
        HashSet term18391 = new HashSet((Collection<? extends Object>) term60210);
        ArrayList term18397 = new ArrayList();
        term18264 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term18265 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term18274 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term18350 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term18351 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term18380 = newInstance(Class.forName("java.lang.Object"));
        setField(term18265, term18265.getClass(), "defaults", null);
        setField(term18265, term18265.getClass(), "file", null);
        setField(term18265, term18265.getClass(), "basePath", null);
        setField(term18265, term18265.getClass(), "fileSeparator", "/");
        setBooleanField(term18265, term18265.getClass(), "isInitialized", false);
        setField(term18265, term18265.getClass(), "includePropertyName", null);
        setField(term18265, term18265.getClass(), "keysAsListed", term18270);
        setField(term18265, term18265.getClass(), "table", term18274);
        setIntField(term18265, term18265.getClass(), "count", 0);
        setIntField(term18265, term18265.getClass(), "threshold", 8);
        setFloatField(term18265, term18265.getClass(), "loadFactor", 0.75F);
        setIntField(term18265, term18265.getClass(), "modCount", 0);
        setField(term18265, term18265.getClass(), "keySet", null);
        setField(term18265, term18265.getClass(), "entrySet", null);
        setField(term18265, term18265.getClass(), "values", null);
        setField(term18264, term18264.getClass(), "defaults", term18265);
        setField(term18264, term18264.getClass(), "file", "HzqpegHiRq");
        setField(term18264, term18264.getClass(), "basePath", "jwsfVjMoJT");
        setField(term18264, term18264.getClass(), "fileSeparator", "/");
        setBooleanField(term18264, term18264.getClass(), "isInitialized", true);
        setField(term18264, term18264.getClass(), "includePropertyName", "ZfdXfCCFDf");
        setField(term18264, term18264.getClass(), "keysAsListed", term18319);
        setIntField(term18351, term18351.getClass(), "hash", -151321281);
        setField(term18351, term18351.getClass(), "key", "java.lang.Object@41a88eb3");
        setField(term18351, term18351.getClass(), "value", term18380);
        setField(term18351, term18351.getClass(), "next", null);
        setElement(term18350, 1, term18351);
        setField(term18264, term18264.getClass(), "table", term18350);
        setIntField(term18264, term18264.getClass(), "count", -1801760682);
        setIntField(term18264, term18264.getClass(), "threshold", 8);
        setFloatField(term18264, term18264.getClass(), "loadFactor", 0.75F);
        setIntField(term18264, term18264.getClass(), "modCount", 1141317872);
        setField(term18264, term18264.getClass(), "keySet", term18385);
        setField(term18264, term18264.getClass(), "entrySet", term18391);
        setField(term18264, term18264.getClass(), "values", term18397);
        term18413 = new Short((short) 9519);
        ArrayList term60099 = new ArrayList();
        ArrayList term60110 = new ArrayList();
        ((ArrayList) term60110).add("java.lang.Object@41a88eb3");
        HashMap term60120 = new HashMap();
        Set<Object> term60303 =  ((Map) term60120).keySet();
        HashSet term60119 = new HashSet((Collection<? extends Object>) term60303);
        HashMap term60122 = new HashMap();
        Set<Object> term60304 =  ((Map) term60122).keySet();
        HashSet term60121 = new HashSet((Collection<? extends Object>) term60304);
        ArrayList term60123 = new ArrayList();
        term60095 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term60096 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term60101 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term60114 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term60115 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term60118 = newInstance(Class.forName("java.lang.Object"));
        setField(term60096, term60096.getClass(), "defaults", null);
        setField(term60096, term60096.getClass(), "file", null);
        setField(term60096, term60096.getClass(), "basePath", null);
        setField(term60096, term60096.getClass(), "fileSeparator", "/");
        setBooleanField(term60096, term60096.getClass(), "isInitialized", false);
        setField(term60096, term60096.getClass(), "includePropertyName", null);
        setField(term60096, term60096.getClass(), "keysAsListed", term60099);
        setField(term60096, term60096.getClass(), "table", term60101);
        setIntField(term60096, term60096.getClass(), "count", 0);
        setIntField(term60096, term60096.getClass(), "threshold", 8);
        setFloatField(term60096, term60096.getClass(), "loadFactor", 0.75F);
        setIntField(term60096, term60096.getClass(), "modCount", 0);
        setField(term60096, term60096.getClass(), "keySet", null);
        setField(term60096, term60096.getClass(), "entrySet", null);
        setField(term60096, term60096.getClass(), "values", null);
        setField(term60095, term60095.getClass(), "defaults", term60096);
        setField(term60095, term60095.getClass(), "file", "HzqpegHiRq");
        setField(term60095, term60095.getClass(), "basePath", "jwsfVjMoJT");
        setField(term60095, term60095.getClass(), "fileSeparator", "/");
        setBooleanField(term60095, term60095.getClass(), "isInitialized", true);
        setField(term60095, term60095.getClass(), "includePropertyName", "ZfdXfCCFDf");
        setField(term60095, term60095.getClass(), "keysAsListed", term60110);
        setIntField(term60115, term60115.getClass(), "hash", -151321281);
        setField(term60115, term60115.getClass(), "key", "java.lang.Object@41a88eb3");
        setField(term60115, term60115.getClass(), "value", term60118);
        setField(term60115, term60115.getClass(), "next", null);
        setElement(term60114, 1, term60115);
        setField(term60095, term60095.getClass(), "table", term60114);
        setIntField(term60095, term60095.getClass(), "count", -1801760682);
        setIntField(term60095, term60095.getClass(), "threshold", 8);
        setFloatField(term60095, term60095.getClass(), "loadFactor", 0.75F);
        setIntField(term60095, term60095.getClass(), "modCount", 1141317872);
        setField(term60095, term60095.getClass(), "keySet", term60119);
        setField(term60095, term60095.getClass(), "entrySet", term60121);
        setField(term60095, term60095.getClass(), "values", term60123);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = short.class;
        Object[] args = new Object[2];
        args[0] = "MwwjNtdOFT";
        args[1] = term18413;
        Object retValue = callMethod(klass, "getShort", argTypes, term18264, args);
        assertTrue(recursiveEquals(term18264, term60095));
        assertTrue(recursiveEquals(term18413, (short) 9519));
        assertTrue(recursiveEquals(retValue, (short) 9519));
    }

};


