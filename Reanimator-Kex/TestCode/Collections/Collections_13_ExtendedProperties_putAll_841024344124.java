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
import java.util.LinkedHashMap;

public class ExtendedProperties_putAll_841024344124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28492;
     Object term28572;
     Object term77476;
     Object term77500;

    public ExtendedProperties_putAll_841024344124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term28498 = new ArrayList();
        ArrayList term28547 = new ArrayList();
        HashMap term28557 = new HashMap();
        Set<Object> term77534 =  ((Map) term28557).keySet();
        HashSet term28556 = new HashSet((Collection<? extends Object>) term77534);
        HashMap term28563 = new HashMap();
        Set<Object> term77535 =  ((Map) term28563).keySet();
        HashSet term28562 = new HashSet((Collection<? extends Object>) term77535);
        ArrayList term28568 = new ArrayList();
        term28492 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term28493 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term28502 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term28551 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term28493, term28493.getClass(), "defaults", null);
        setField(term28493, term28493.getClass(), "file", null);
        setField(term28493, term28493.getClass(), "basePath", null);
        setField(term28493, term28493.getClass(), "fileSeparator", "/");
        setBooleanField(term28493, term28493.getClass(), "isInitialized", false);
        setField(term28493, term28493.getClass(), "includePropertyName", null);
        setField(term28493, term28493.getClass(), "keysAsListed", term28498);
        setField(term28493, term28493.getClass(), "table", term28502);
        setIntField(term28493, term28493.getClass(), "count", 0);
        setIntField(term28493, term28493.getClass(), "threshold", 8);
        setFloatField(term28493, term28493.getClass(), "loadFactor", 0.75F);
        setIntField(term28493, term28493.getClass(), "modCount", 0);
        setField(term28493, term28493.getClass(), "keySet", null);
        setField(term28493, term28493.getClass(), "entrySet", null);
        setField(term28493, term28493.getClass(), "values", null);
        setField(term28492, term28492.getClass(), "defaults", term28493);
        setField(term28492, term28492.getClass(), "file", "zcorEihhLK");
        setField(term28492, term28492.getClass(), "basePath", "GrqozDKFOk");
        setField(term28492, term28492.getClass(), "fileSeparator", "/");
        setBooleanField(term28492, term28492.getClass(), "isInitialized", false);
        setField(term28492, term28492.getClass(), "includePropertyName", "CFyoseFGLF");
        setField(term28492, term28492.getClass(), "keysAsListed", term28547);
        setField(term28492, term28492.getClass(), "table", term28551);
        setIntField(term28492, term28492.getClass(), "count", -243422082);
        setIntField(term28492, term28492.getClass(), "threshold", 8);
        setFloatField(term28492, term28492.getClass(), "loadFactor", 0.75F);
        setIntField(term28492, term28492.getClass(), "modCount", 1384592638);
        setField(term28492, term28492.getClass(), "keySet", term28556);
        setField(term28492, term28492.getClass(), "entrySet", term28562);
        setField(term28492, term28492.getClass(), "values", term28568);
        term28572 = new LinkedHashMap();
        ArrayList term77480 = new ArrayList();
        ArrayList term77491 = new ArrayList();
        HashMap term77495 = new HashMap();
        Set<Object> term77568 =  ((Map) term77495).keySet();
        HashSet term77494 = new HashSet((Collection<? extends Object>) term77568);
        HashMap term77497 = new HashMap();
        Set<Object> term77569 =  ((Map) term77497).keySet();
        HashSet term77496 = new HashSet((Collection<? extends Object>) term77569);
        ArrayList term77498 = new ArrayList();
        term77476 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term77477 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term77482 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term77493 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term77477, term77477.getClass(), "defaults", null);
        setField(term77477, term77477.getClass(), "file", null);
        setField(term77477, term77477.getClass(), "basePath", null);
        setField(term77477, term77477.getClass(), "fileSeparator", "/");
        setBooleanField(term77477, term77477.getClass(), "isInitialized", false);
        setField(term77477, term77477.getClass(), "includePropertyName", null);
        setField(term77477, term77477.getClass(), "keysAsListed", term77480);
        setField(term77477, term77477.getClass(), "table", term77482);
        setIntField(term77477, term77477.getClass(), "count", 0);
        setIntField(term77477, term77477.getClass(), "threshold", 8);
        setFloatField(term77477, term77477.getClass(), "loadFactor", 0.75F);
        setIntField(term77477, term77477.getClass(), "modCount", 0);
        setField(term77477, term77477.getClass(), "keySet", null);
        setField(term77477, term77477.getClass(), "entrySet", null);
        setField(term77477, term77477.getClass(), "values", null);
        setField(term77476, term77476.getClass(), "defaults", term77477);
        setField(term77476, term77476.getClass(), "file", "zcorEihhLK");
        setField(term77476, term77476.getClass(), "basePath", "GrqozDKFOk");
        setField(term77476, term77476.getClass(), "fileSeparator", "/");
        setBooleanField(term77476, term77476.getClass(), "isInitialized", false);
        setField(term77476, term77476.getClass(), "includePropertyName", "CFyoseFGLF");
        setField(term77476, term77476.getClass(), "keysAsListed", term77491);
        setField(term77476, term77476.getClass(), "table", term77493);
        setIntField(term77476, term77476.getClass(), "count", -243422082);
        setIntField(term77476, term77476.getClass(), "threshold", 8);
        setFloatField(term77476, term77476.getClass(), "loadFactor", 0.75F);
        setIntField(term77476, term77476.getClass(), "modCount", 1384592638);
        setField(term77476, term77476.getClass(), "keySet", term77494);
        setField(term77476, term77476.getClass(), "entrySet", term77496);
        setField(term77476, term77476.getClass(), "values", term77498);
        term77500 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term28572;
        callMethod(klass, "putAll", argTypes, term28492, args);
        assertTrue(recursiveEquals(term28492, term77476));
        assertTrue(recursiveEquals(term28572, term77500));
    }

};


