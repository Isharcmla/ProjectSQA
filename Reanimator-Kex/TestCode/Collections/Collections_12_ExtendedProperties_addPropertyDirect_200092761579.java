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

public class ExtendedProperties_addPropertyDirect_200092761579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5707;
     Object term5944;
     Object term39374;
     Object term39423;

    public ExtendedProperties_addPropertyDirect_200092761579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5713 = new ArrayList();
        ArrayList term5762 = new ArrayList();
        ((ArrayList) term5762).add("java.lang.Object@30d54b4d");
        ((ArrayList) term5762).add("java.lang.Object@1c98e556");
        ((ArrayList) term5762).add("java.lang.Object@34988d6c");
        HashMap term5917 = new HashMap();
        Set<Object> term39581 =  ((Map) term5917).keySet();
        HashSet term5916 = new HashSet((Collection<? extends Object>) term39581);
        HashMap term5923 = new HashMap();
        Set<Object> term39582 =  ((Map) term5923).keySet();
        HashSet term5922 = new HashSet((Collection<? extends Object>) term39582);
        ArrayList term5928 = new ArrayList();
        term5707 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term5708 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term5717 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term5847 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term5848 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term5877 = newInstance(Class.forName("java.lang.Object"));
        Object term5878 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term5907 = newInstance(Class.forName("java.lang.Object"));
        Object term5908 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term5911 = newInstance(Class.forName("java.lang.Object"));
        setField(term5708, term5708.getClass(), "defaults", null);
        setField(term5708, term5708.getClass(), "file", null);
        setField(term5708, term5708.getClass(), "basePath", null);
        setField(term5708, term5708.getClass(), "fileSeparator", "/");
        setBooleanField(term5708, term5708.getClass(), "isInitialized", false);
        setField(term5708, term5708.getClass(), "includePropertyName", null);
        setField(term5708, term5708.getClass(), "keysAsListed", term5713);
        setField(term5708, term5708.getClass(), "table", term5717);
        setIntField(term5708, term5708.getClass(), "count", 0);
        setIntField(term5708, term5708.getClass(), "threshold", 8);
        setFloatField(term5708, term5708.getClass(), "loadFactor", 0.75F);
        setIntField(term5708, term5708.getClass(), "modCount", 0);
        setField(term5708, term5708.getClass(), "keySet", null);
        setField(term5708, term5708.getClass(), "entrySet", null);
        setField(term5708, term5708.getClass(), "values", null);
        setField(term5707, term5707.getClass(), "defaults", term5708);
        setField(term5707, term5707.getClass(), "file", "wSQxaModmm");
        setField(term5707, term5707.getClass(), "basePath", "UlajhuVLaP");
        setField(term5707, term5707.getClass(), "fileSeparator", "/");
        setBooleanField(term5707, term5707.getClass(), "isInitialized", true);
        setField(term5707, term5707.getClass(), "includePropertyName", "gGSMzuGICf");
        setField(term5707, term5707.getClass(), "keysAsListed", term5762);
        setIntField(term5848, term5848.getClass(), "hash", -376788890);
        setField(term5848, term5848.getClass(), "key", "java.lang.Object@34988d6c");
        setField(term5848, term5848.getClass(), "value", term5877);
        setField(term5848, term5848.getClass(), "next", null);
        setElement(term5847, 8, term5848);
        setIntField(term5878, term5878.getClass(), "hash", -803146865);
        setField(term5878, term5878.getClass(), "key", "java.lang.Object@1c98e556");
        setField(term5878, term5878.getClass(), "value", term5907);
        setIntField(term5908, term5908.getClass(), "hash", 1596325465);
        setField(term5908, term5908.getClass(), "key", "");
        setField(term5908, term5908.getClass(), "value", term5911);
        setField(term5908, term5908.getClass(), "next", null);
        setField(term5878, term5878.getClass(), "next", term5908);
        setElement(term5847, 9, term5878);
        setField(term5707, term5707.getClass(), "table", term5847);
        setIntField(term5707, term5707.getClass(), "count", -1275173081);
        setIntField(term5707, term5707.getClass(), "threshold", 8);
        setFloatField(term5707, term5707.getClass(), "loadFactor", 0.75F);
        setIntField(term5707, term5707.getClass(), "modCount", -244121223);
        setField(term5707, term5707.getClass(), "keySet", term5916);
        setField(term5707, term5707.getClass(), "entrySet", term5922);
        setField(term5707, term5707.getClass(), "values", term5928);
        term5944 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term39378 = new ArrayList();
        ArrayList term39389 = new ArrayList();
        ((ArrayList) term39389).add("java.lang.Object@30d54b4d");
        ((ArrayList) term39389).add("java.lang.Object@1c98e556");
        ((ArrayList) term39389).add("java.lang.Object@34988d6c");
        ((ArrayList) term39389).add("hxCBltsObl");
        HashMap term39416 = new HashMap();
        Set<Object> term39770 =  ((Map) term39416).keySet();
        HashSet term39415 = new HashSet((Collection<? extends Object>) term39770);
        HashMap term39418 = new HashMap();
        Set<Object> term39771 =  ((Map) term39418).keySet();
        HashSet term39417 = new HashSet((Collection<? extends Object>) term39771);
        ArrayList term39419 = new ArrayList();
        term39374 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object term39375 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        Object[] term39380 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object[] term39399 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term39400 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term39403 = newInstance(Class.forName("java.lang.Object"));
        Object term39404 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term39407 = newInstance(Class.forName("java.lang.Object"));
        Object term39408 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term39411 = newInstance(Class.forName("java.lang.Object"));
        Object term39412 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term39414 = newInstance(Class.forName("java.lang.Object"));
        setField(term39375, term39375.getClass(), "defaults", null);
        setField(term39375, term39375.getClass(), "file", null);
        setField(term39375, term39375.getClass(), "basePath", null);
        setField(term39375, term39375.getClass(), "fileSeparator", "/");
        setBooleanField(term39375, term39375.getClass(), "isInitialized", false);
        setField(term39375, term39375.getClass(), "includePropertyName", null);
        setField(term39375, term39375.getClass(), "keysAsListed", term39378);
        setField(term39375, term39375.getClass(), "table", term39380);
        setIntField(term39375, term39375.getClass(), "count", 0);
        setIntField(term39375, term39375.getClass(), "threshold", 8);
        setFloatField(term39375, term39375.getClass(), "loadFactor", 0.75F);
        setIntField(term39375, term39375.getClass(), "modCount", 0);
        setField(term39375, term39375.getClass(), "keySet", null);
        setField(term39375, term39375.getClass(), "entrySet", null);
        setField(term39375, term39375.getClass(), "values", null);
        setField(term39374, term39374.getClass(), "defaults", term39375);
        setField(term39374, term39374.getClass(), "file", "wSQxaModmm");
        setField(term39374, term39374.getClass(), "basePath", "UlajhuVLaP");
        setField(term39374, term39374.getClass(), "fileSeparator", "/");
        setBooleanField(term39374, term39374.getClass(), "isInitialized", true);
        setField(term39374, term39374.getClass(), "includePropertyName", "gGSMzuGICf");
        setField(term39374, term39374.getClass(), "keysAsListed", term39389);
        setIntField(term39400, term39400.getClass(), "hash", 1343719229);
        setField(term39400, term39400.getClass(), "key", "hxCBltsObl");
        setField(term39400, term39400.getClass(), "value", term39403);
        setField(term39400, term39400.getClass(), "next", null);
        setElement(term39399, 6, term39400);
        setIntField(term39404, term39404.getClass(), "hash", -376788890);
        setField(term39404, term39404.getClass(), "key", "java.lang.Object@34988d6c");
        setField(term39404, term39404.getClass(), "value", term39407);
        setField(term39404, term39404.getClass(), "next", null);
        setElement(term39399, 8, term39404);
        setIntField(term39408, term39408.getClass(), "hash", -803146865);
        setField(term39408, term39408.getClass(), "key", "java.lang.Object@1c98e556");
        setField(term39408, term39408.getClass(), "value", term39411);
        setIntField(term39412, term39412.getClass(), "hash", 1596325465);
        setField(term39412, term39412.getClass(), "key", "");
        setField(term39412, term39412.getClass(), "value", term39414);
        setField(term39412, term39412.getClass(), "next", null);
        setField(term39408, term39408.getClass(), "next", term39412);
        setElement(term39399, 9, term39408);
        setField(term39374, term39374.getClass(), "table", term39399);
        setIntField(term39374, term39374.getClass(), "count", -1275173080);
        setIntField(term39374, term39374.getClass(), "threshold", 8);
        setFloatField(term39374, term39374.getClass(), "loadFactor", 0.75F);
        setIntField(term39374, term39374.getClass(), "modCount", -244121222);
        setField(term39374, term39374.getClass(), "keySet", term39415);
        setField(term39374, term39374.getClass(), "entrySet", term39417);
        setField(term39374, term39374.getClass(), "values", term39419);
        term39423 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = "hxCBltsObl";
        args[1] = term5944;
        callMethod(klass, "addPropertyDirect", argTypes, term5707, args);
        assertTrue(recursiveEquals(term5707, term39374));
        assertTrue(recursiveEquals(term5944, term39423));
    }

};


