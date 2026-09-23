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

public class ExtendedProperties_subset_48317865887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9651;
     Object term45180;

    public ExtendedProperties_subset_48317865887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9657 = new ArrayList();
        ArrayList term9706 = new ArrayList();
        HashMap term9716 = new HashMap();
        Set<Object> term45238 =  ((Map) term9716).keySet();
        HashSet term9715 = new HashSet((Collection<? extends Object>) term45238);
        HashMap term9722 = new HashMap();
        Set<Object> term45239 =  ((Map) term9722).keySet();
        HashSet term9721 = new HashSet((Collection<? extends Object>) term45239);
        ArrayList term9727 = new ArrayList();
        term9651 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term9652 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term9661 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term9710 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term9652, term9652.getClass(), "defaults", null);
        setField(term9652, term9652.getClass(), "file", null);
        setField(term9652, term9652.getClass(), "basePath", null);
        setField(term9652, term9652.getClass(), "fileSeparator", "/");
        setBooleanField(term9652, term9652.getClass(), "isInitialized", false);
        setField(term9652, term9652.getClass(), "includePropertyName", null);
        setField(term9652, term9652.getClass(), "keysAsListed", term9657);
        setField(term9652, term9652.getClass(), "table", term9661);
        setIntField(term9652, term9652.getClass(), "count", 0);
        setIntField(term9652, term9652.getClass(), "threshold", 8);
        setFloatField(term9652, term9652.getClass(), "loadFactor", 0.75F);
        setIntField(term9652, term9652.getClass(), "modCount", 0);
        setField(term9652, term9652.getClass(), "keySet", null);
        setField(term9652, term9652.getClass(), "entrySet", null);
        setField(term9652, term9652.getClass(), "values", null);
        setField(term9651, term9651.getClass(), "defaults", term9652);
        setField(term9651, term9651.getClass(), "file", "KoyGrUJeJW");
        setField(term9651, term9651.getClass(), "basePath", "HqBOwkVqjD");
        setField(term9651, term9651.getClass(), "fileSeparator", "/");
        setBooleanField(term9651, term9651.getClass(), "isInitialized", false);
        setField(term9651, term9651.getClass(), "includePropertyName", "MAcUBcBckh");
        setField(term9651, term9651.getClass(), "keysAsListed", term9706);
        setField(term9651, term9651.getClass(), "table", term9710);
        setIntField(term9651, term9651.getClass(), "count", 292681826);
        setIntField(term9651, term9651.getClass(), "threshold", 8);
        setFloatField(term9651, term9651.getClass(), "loadFactor", 0.75F);
        setIntField(term9651, term9651.getClass(), "modCount", 458147407);
        setField(term9651, term9651.getClass(), "keySet", term9715);
        setField(term9651, term9651.getClass(), "entrySet", term9721);
        setField(term9651, term9651.getClass(), "values", term9727);
        ArrayList term45184 = new ArrayList();
        ArrayList term45195 = new ArrayList();
        HashMap term45199 = new HashMap();
        Set<Object> term45282 =  ((Map) term45199).keySet();
        HashSet term45198 = new HashSet((Collection<? extends Object>) term45282);
        HashMap term45201 = new HashMap();
        Set<Object> term45283 =  ((Map) term45201).keySet();
        HashSet term45200 = new HashSet((Collection<? extends Object>) term45283);
        ArrayList term45202 = new ArrayList();
        term45180 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term45181 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term45186 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term45197 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        setField(term45181, term45181.getClass(), "defaults", null);
        setField(term45181, term45181.getClass(), "file", null);
        setField(term45181, term45181.getClass(), "basePath", null);
        setField(term45181, term45181.getClass(), "fileSeparator", "/");
        setBooleanField(term45181, term45181.getClass(), "isInitialized", false);
        setField(term45181, term45181.getClass(), "includePropertyName", null);
        setField(term45181, term45181.getClass(), "keysAsListed", term45184);
        setField(term45181, term45181.getClass(), "table", term45186);
        setIntField(term45181, term45181.getClass(), "count", 0);
        setIntField(term45181, term45181.getClass(), "threshold", 8);
        setFloatField(term45181, term45181.getClass(), "loadFactor", 0.75F);
        setIntField(term45181, term45181.getClass(), "modCount", 0);
        setField(term45181, term45181.getClass(), "keySet", null);
        setField(term45181, term45181.getClass(), "entrySet", null);
        setField(term45181, term45181.getClass(), "values", null);
        setField(term45180, term45180.getClass(), "defaults", term45181);
        setField(term45180, term45180.getClass(), "file", "KoyGrUJeJW");
        setField(term45180, term45180.getClass(), "basePath", "HqBOwkVqjD");
        setField(term45180, term45180.getClass(), "fileSeparator", "/");
        setBooleanField(term45180, term45180.getClass(), "isInitialized", false);
        setField(term45180, term45180.getClass(), "includePropertyName", "MAcUBcBckh");
        setField(term45180, term45180.getClass(), "keysAsListed", term45195);
        setField(term45180, term45180.getClass(), "table", term45197);
        setIntField(term45180, term45180.getClass(), "count", 292681826);
        setIntField(term45180, term45180.getClass(), "threshold", 8);
        setFloatField(term45180, term45180.getClass(), "loadFactor", 0.75F);
        setIntField(term45180, term45180.getClass(), "modCount", 458147407);
        setField(term45180, term45180.getClass(), "keySet", term45198);
        setField(term45180, term45180.getClass(), "entrySet", term45200);
        setField(term45180, term45180.getClass(), "values", term45202);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oVgzLbrsFr";
        Object retValue = callMethod(klass, "subset", argTypes, term9651, args);
        assertTrue(recursiveEquals(term9651, term45180));
        assertTrue(recursiveEquals(retValue, null));
    }

};


