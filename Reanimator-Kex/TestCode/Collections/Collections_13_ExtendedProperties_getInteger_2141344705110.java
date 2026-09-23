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
import java.util.NoSuchElementException;
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ExtendedProperties_getInteger_2141344705110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20179;

    public ExtendedProperties_getInteger_2141344705110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term20185 = new ArrayList();
        ArrayList term20234 = new ArrayList();
        ((ArrayList) term20234).add("java.lang.Object@41fa916f");
        ((ArrayList) term20234).add("java.lang.Object@77a98f58");
        ((ArrayList) term20234).add("java.lang.Object@6120c5d5");
        HashMap term20415 = new HashMap();
        Set<Object> term63702 =  ((Map) term20415).keySet();
        HashSet term20414 = new HashSet((Collection<? extends Object>) term63702);
        HashMap term20421 = new HashMap();
        Set<Object> term63703 =  ((Map) term20421).keySet();
        HashSet term20420 = new HashSet((Collection<? extends Object>) term63703);
        ArrayList term20426 = new ArrayList();
        term20179 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term20180 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term20189 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term20319 = (Object[]) newArray("java.util.Hashtable$Entry", 95);
        Object term20320 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term20349 = newInstance(Class.forName("java.lang.Object"));
        Object term20350 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term20379 = newInstance(Class.forName("java.lang.Object"));
        Object term20380 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term20409 = newInstance(Class.forName("java.lang.Object"));
        setField(term20180, term20180.getClass(), "defaults", null);
        setField(term20180, term20180.getClass(), "file", null);
        setField(term20180, term20180.getClass(), "basePath", null);
        setField(term20180, term20180.getClass(), "fileSeparator", "/");
        setBooleanField(term20180, term20180.getClass(), "isInitialized", false);
        setField(term20180, term20180.getClass(), "includePropertyName", null);
        setField(term20180, term20180.getClass(), "keysAsListed", term20185);
        setField(term20180, term20180.getClass(), "table", term20189);
        setIntField(term20180, term20180.getClass(), "count", 0);
        setIntField(term20180, term20180.getClass(), "threshold", 8);
        setFloatField(term20180, term20180.getClass(), "loadFactor", 0.75F);
        setIntField(term20180, term20180.getClass(), "modCount", 0);
        setField(term20180, term20180.getClass(), "keySet", null);
        setField(term20180, term20180.getClass(), "entrySet", null);
        setField(term20180, term20180.getClass(), "values", null);
        setField(term20179, term20179.getClass(), "defaults", term20180);
        setField(term20179, term20179.getClass(), "file", "PapWxkhEWe");
        setField(term20179, term20179.getClass(), "basePath", "smnHEqRFRx");
        setField(term20179, term20179.getClass(), "fileSeparator", "/");
        setBooleanField(term20179, term20179.getClass(), "isInitialized", true);
        setField(term20179, term20179.getClass(), "includePropertyName", "XYtryyobou");
        setField(term20179, term20179.getClass(), "keysAsListed", term20234);
        setIntField(term20320, term20320.getClass(), "hash", 29667341);
        setField(term20320, term20320.getClass(), "key", "java.lang.Object@41fa916f");
        setField(term20320, term20320.getClass(), "value", term20349);
        setField(term20320, term20320.getClass(), "next", null);
        setElement(term20319, 76, term20320);
        setIntField(term20350, term20350.getClass(), "hash", 1982576073);
        setField(term20350, term20350.getClass(), "key", "java.lang.Object@6120c5d5");
        setField(term20350, term20350.getClass(), "value", term20379);
        setField(term20350, term20350.getClass(), "next", null);
        setElement(term20319, 78, term20350);
        setIntField(term20380, term20380.getClass(), "hash", 1813120310);
        setField(term20380, term20380.getClass(), "key", "java.lang.Object@77a98f58");
        setField(term20380, term20380.getClass(), "value", term20409);
        setField(term20380, term20380.getClass(), "next", null);
        setElement(term20319, 90, term20380);
        setField(term20179, term20179.getClass(), "table", term20319);
        setIntField(term20179, term20179.getClass(), "count", 53410916);
        setIntField(term20179, term20179.getClass(), "threshold", 71);
        setFloatField(term20179, term20179.getClass(), "loadFactor", 0.75F);
        setIntField(term20179, term20179.getClass(), "modCount", -375014952);
        setField(term20179, term20179.getClass(), "keySet", term20414);
        setField(term20179, term20179.getClass(), "entrySet", term20420);
        setField(term20179, term20179.getClass(), "values", term20426);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OYbzXylRWW";
        try {
            callMethod(klass, "getInteger", argTypes, term20179, args);
            assertTrue(false);
        }
        catch (NoSuchElementException e) {
        }

    }

};


