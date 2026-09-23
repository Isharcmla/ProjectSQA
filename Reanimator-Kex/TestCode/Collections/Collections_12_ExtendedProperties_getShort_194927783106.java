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
     Object term60591;

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
        Set<Object> term60705 =  ((Map) term18386).keySet();
        HashSet term18385 = new HashSet((Collection<? extends Object>) term60705);
        HashMap term18392 = new HashMap();
        Set<Object> term60706 =  ((Map) term18392).keySet();
        HashSet term18391 = new HashSet((Collection<? extends Object>) term60706);
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
        ArrayList term60595 = new ArrayList();
        ArrayList term60606 = new ArrayList();
        ((ArrayList) term60606).add("java.lang.Object@41a88eb3");
        HashMap term60616 = new HashMap();
        Set<Object> term60799 =  ((Map) term60616).keySet();
        HashSet term60615 = new HashSet((Collection<? extends Object>) term60799);
        HashMap term60618 = new HashMap();
        Set<Object> term60800 =  ((Map) term60618).keySet();
        HashSet term60617 = new HashSet((Collection<? extends Object>) term60800);
        ArrayList term60619 = new ArrayList();
        term60591 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term60592 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term60597 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term60610 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term60611 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term60614 = newInstance(Class.forName("java.lang.Object"));
        setField(term60592, term60592.getClass(), "defaults", null);
        setField(term60592, term60592.getClass(), "file", null);
        setField(term60592, term60592.getClass(), "basePath", null);
        setField(term60592, term60592.getClass(), "fileSeparator", "/");
        setBooleanField(term60592, term60592.getClass(), "isInitialized", false);
        setField(term60592, term60592.getClass(), "includePropertyName", null);
        setField(term60592, term60592.getClass(), "keysAsListed", term60595);
        setField(term60592, term60592.getClass(), "table", term60597);
        setIntField(term60592, term60592.getClass(), "count", 0);
        setIntField(term60592, term60592.getClass(), "threshold", 8);
        setFloatField(term60592, term60592.getClass(), "loadFactor", 0.75F);
        setIntField(term60592, term60592.getClass(), "modCount", 0);
        setField(term60592, term60592.getClass(), "keySet", null);
        setField(term60592, term60592.getClass(), "entrySet", null);
        setField(term60592, term60592.getClass(), "values", null);
        setField(term60591, term60591.getClass(), "defaults", term60592);
        setField(term60591, term60591.getClass(), "file", "HzqpegHiRq");
        setField(term60591, term60591.getClass(), "basePath", "jwsfVjMoJT");
        setField(term60591, term60591.getClass(), "fileSeparator", "/");
        setBooleanField(term60591, term60591.getClass(), "isInitialized", true);
        setField(term60591, term60591.getClass(), "includePropertyName", "ZfdXfCCFDf");
        setField(term60591, term60591.getClass(), "keysAsListed", term60606);
        setIntField(term60611, term60611.getClass(), "hash", -151321281);
        setField(term60611, term60611.getClass(), "key", "java.lang.Object@41a88eb3");
        setField(term60611, term60611.getClass(), "value", term60614);
        setField(term60611, term60611.getClass(), "next", null);
        setElement(term60610, 1, term60611);
        setField(term60591, term60591.getClass(), "table", term60610);
        setIntField(term60591, term60591.getClass(), "count", -1801760682);
        setIntField(term60591, term60591.getClass(), "threshold", 8);
        setFloatField(term60591, term60591.getClass(), "loadFactor", 0.75F);
        setIntField(term60591, term60591.getClass(), "modCount", 1141317872);
        setField(term60591, term60591.getClass(), "keySet", term60615);
        setField(term60591, term60591.getClass(), "entrySet", term60617);
        setField(term60591, term60591.getClass(), "values", term60619);
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
        assertTrue(recursiveEquals(term18264, term60591));
        assertTrue(recursiveEquals(term18413, (short) 9519));
        assertTrue(recursiveEquals(retValue, (short) 9519));
    }

};


